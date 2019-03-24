package com.example.focupokus;
import android.graphics.Color;
import android.os.Vibrator;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import android.media.MediaPlayer;
import android.view.HapticFeedbackConstants;
import android.widget.Toast;
import android.widget.ImageView;

import java.util.Random;
import org.json.JSONArray;
import org.json.JSONObject;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class MainActivity extends AppCompatActivity {
//defining shapes for the grid
int shapes[] = {R.drawable.ic_circle, R.drawable.ic_diamond, R.drawable.ic_hexagon, R.drawable.ic_pointed_star, R.drawable.ic_night_moon_phase};
int colors[] = {Color.RED,Color.BLUE,Color.MAGENTA,Color.YELLOW};


    ArrayList<Integer> shapeResult = new ArrayList<Integer>();
    ArrayList<Integer> colorResult = new ArrayList<Integer>();
    GridView grid;
    ImageView targetView;
    TextView textView;
    TextView et;
    TextView atr;
    public int score =0;
	MediaPlayer correctSound;
	MediaPlayer mediaPlayer;
	MediaPlayer wrongSound;
	private Vibrator vibrateEffect;
	public int random;
	public int attemptsRemaining;
    public JSONArray ja = new JSONArray();





    @Override
    protected void onCreate(Bundle savedInstanceState) {

        attemptsRemaining = 3;
        super.onCreate(savedInstanceState);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        //defining grid
        grid = findViewById(R.id.hello);
        targetView = findViewById(R.id.targetView);
        grid.setNumColumns(3);
        textView =findViewById(R.id.textView);
        et=findViewById(R.id.et);
        atr=findViewById(R.id.atr);


        mediaPlayer=MediaPlayer.create(MainActivity.this,R.raw.gamemusic);
        mediaPlayer.setLooping(true);
        boolean ismusic=true;
			if(ismusic) {
				mediaPlayer.start();}
				vibrateEffect = (Vibrator)getApplicationContext().getSystemService(VIBRATOR_SERVICE);
			grid.setHapticFeedbackEnabled(true);
        final CountDownTimer timer = new CountDownTimer(10000, 1000) {

            public void onTick(long millisUntilFinished) {
                et.setText("Time remaining: " + millisUntilFinished / 1000 );
            }

            public void onFinish() {
                if (attemptsRemaining == 0 ) {
                    attemptsRemaining = 3;
                    et.setText("Better luck next time!");}
                else
                { attemptsRemaining--;
                atr.setText("Attempts remaining : " + attemptsRemaining);
                this.start();
                    ;
					}
            }
        };


        try {
            for (int k = 0; k < shapes.length; k++) {
                for (int j = 0; j < colors.length; j++) {
                    JSONObject jo = new JSONObject();
                    jo.put("shape", shapes[k]);
                    jo.put("color", colors[j]);
                    ja.put(jo);
                }
            }
        } catch (Exception e) {
            Log.e("Error",e.getMessage());
        }

        onRandomShape(ja);


        final Adapter adapter = new Adapter(this,shapeResult,colorResult);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> s, View v, int position, long id) {

                atr.setText("Attempts remaining : " + (attemptsRemaining -1));
                timer.start();

                correctSound = MediaPlayer.create(MainActivity.this, R.raw.correctanstune);
                wrongSound = MediaPlayer.create(MainActivity.this, R.raw.wronanstune);


                            String match = shapeResult.get(random).toString()+ colorResult.get(random).toString();
                            String to_match = shapeResult.get(position).toString()+ colorResult.get(position).toString();

                            if (match.equals(to_match)) {
                                score++;
                                correctSound.start();
                                grid.setAdapter(null);
                                shapeResult.clear();
                                colorResult.clear();
                                onRandomShape(ja);
                                grid.setAdapter(adapter);

                            }
                            else
                            {wrongSound.start();
                                attemptsRemaining = (attemptsRemaining) - 1;
                                if(attemptsRemaining == 0)
                                {timer.onFinish();}
                            Toast.makeText(getApplicationContext()," " + attemptsRemaining,Toast.LENGTH_LONG).show();
                                v.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
                                getWindow().getDecorView().performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY, HapticFeedbackConstants.FLAG_IGNORE_GLOBAL_SETTING);
                                v.performHapticFeedback(HapticFeedbackConstants.LONG_PRESS);
                                vibrateEffect.vibrate(200);

                            }
                            String score_1 = "Score : " + score;

                            textView.setText(score_1);




            }
        });

		}
	@Override
		protected void onPause()
		{
			super.onPause();
			mediaPlayer.release();

		}

		public void onRandomShape(JSONArray ja){
        try {
            //get 9 random shapes
            Set<JSONObject> shapeSet = new HashSet<>();
//        final int random;
            while (shapeSet.size() != 9) {
                random = new Random().nextInt(ja.length());
                shapeSet.add(ja.getJSONObject(random));

            }

            Iterator itr = shapeSet.iterator();
            while (itr.hasNext()) {
                JSONObject obj = (JSONObject) itr.next();
                shapeResult.add(obj.getInt("shape")); //array of integers
                colorResult.add(obj.getInt("color"));

            }
            Log.i("---------", "" + shapeResult);

            final ArrayList<JSONObject> list;
            final int target;

            target = new Random().nextInt(shapeSet.size());
            random = target;
            list = new ArrayList<>(shapeSet);
            targetView.setImageResource(list.get(target).getInt("shape"));
            targetView.setColorFilter(list.get(target).getInt("color"));

        }
        catch(Exception e){
            Log.e("",""+e);
        }

        return ;
        }
}

