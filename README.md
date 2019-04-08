<img align="left" width="120" height="120" src="https://lh3.googleusercontent.com/V5baaVxMdRdwVQA84teFeqqF3NO22-81R-o7xqEL3MkxJuvtbHMl4LPWEuXHat8PZj1Hp5ce0va7Uw">

<br />

# &nbsp;&nbsp;&nbsp;**FocusPokus**
<br /><br />
  
## Contributors
|Name|BannerID |
|--|--|
| *Ami Trivedi* | B00828817 |
| *Bhumi Patel* | B00824756 |
| *Sravan Sajeev* | B00825856 |
| *Meghna Ramachandra Holla* | B00812604  |
| *Gaganpreet Singh* | B00819217|
<br />

## GitLab
[Click here](https://git.cs.dal.ca/singh1/focuspokus.git) to go to GitLab Repository.<br />
***Note:*** Drop a mail to [Gaganpreet Singh](gaganpreet.singh@dal.ca) to gain access to git Repository.<br /><br />

## Project Summary
**FocusPokus**, the Android application developed as a part of the Mobile Computing project-work, is a minimalistic yet captivating game that aims at inculcating cognitive skills.

FocusPokus appeals to those who enjoy games that are engaging and captivating. The game has objects with complex shapes and colors that vary with time. FocusPokus requires simple actions that enable even a naïve user to play easily.

An important characteristic of this game is that it can be played even without an active internet connection, thus making it a standalone application. This game is intended for age 5 and up. The features of this application are:
+ Home page with an attractive and minimalistic design 
+ Using SharedPreferences for storing user choice throughout the application lifecycle  
+ Interesting music choice for engrossing player attention
+ No account creation for the purpose of playing the game (no Internet connection needed)
+ Meaningful onboarding information for the first-time users
+ Keep track of past scores
<br /><br />

## Libraries
The following libraries were employed while developing focusPokus:<br />
1. **java.util.Random** <br />
This class instance can be used to generate random numbers. Source [here](https://developer.android.com/reference/java/util/Random)
 
1. **android.media.MediaPlayer** <br />
MediaPlayer class can be used to control variety of media types and to integrate audio, video and images in to application. Source [here](https://developer.android.com/guide/topics/media/mediaplayer)
 
1. **android.view.HapticFeedbackConstants** <br />
This constant can be used to perform haptic feedback effects on click event. Source [here](https://developer.android.com/reference/android/view/HapticFeedbackConstants)
 
1. **android.database.sqlite.SQLiteDatabase** <br />
SQLiteDatabase provide methods to create, delete and update SQL commands for  application. It also  perform other common database management tasks. Source [here](https://developer.android.com/reference/android/database/sqlite/SQLiteDatabase)

1. **android.content.SharedPreferences** <br />
SharedPreference can be used to save small collection of key-value in application as local data. A SharedPreferences object also provides simple methods to read and write key-value data. Source [here](https://developer.android.com/training/data-storage/shared-preferences)

1. **android.os.Vibrator** <br />
This class control vibrate  effect on the device. If application process exits, vibration effect will stop. Source [here](https://developer.android.com/reference/android/os/Vibrator)

1. **android.os.CountDownTimer** <br />
This class is used to set count down time in application and it will stop after completion of defined time. Source [here](https://developer.android.com/reference/android/os/CountDownTimer)
<br /><br />

# Synchronization

Synchronization is one of the biggest features of StackEdit. It enables you to synchronize any file in your workspace with other files stored in your **Google Drive**, your **Dropbox** and your **GitHub** accounts. This allows you to keep writing on other devices, collaborate with people you share the file with, integrate easily into your workflow... The synchronization mechanism takes place every minute in the background, downloading, merging, and uploading file modifications.

There are two types of synchronization and they can complement each other:

- The workspace synchronization will sync all your files, folders and settings automatically. This will allow you to fetch your workspace on any other device.
	> To start syncing your workspace, just sign in with Google in the menu.

- The file synchronization will keep one file of the workspace synced with one or multiple files in **Google Drive**, **Dropbox** or **GitHub**.
	> Before starting to sync files, you must link an account in the **Synchronize** sub-menu.

## Open a file

You can open a file from **Google Drive**, **Dropbox** or **GitHub** by opening the **Synchronize** sub-menu and clicking **Open from**. Once opened in the workspace, any modification in the file will be automatically synced.

## Save a file

You can save any file of the workspace to **Google Drive**, **Dropbox** or **GitHub** by opening the **Synchronize** sub-menu and clicking **Save on**. Even if a file in the workspace is already synced, you can save it to another location. StackEdit can sync one file with multiple locations and accounts.

## Synchronize a file

Once your file is linked to a synchronized location, StackEdit will periodically synchronize it by downloading/uploading any modification. A merge will be performed if necessary and conflicts will be resolved.

If you just have modified your file and you want to force syncing, click the **Synchronize now** button in the navigation bar.

> **Note:** The **Synchronize now** button is disabled if you have no file to synchronize.

## Manage file synchronization

Since one file can be synced with multiple locations, you can list and manage synchronized locations by clicking **File synchronization** in the **Synchronize** sub-menu. This allows you to list and remove synchronized locations that are linked to your file.


# Publication

Publishing in StackEdit makes it simple for you to publish online your files. Once you're happy with a file, you can publish it to different hosting platforms like **Blogger**, **Dropbox**, **Gist**, **GitHub**, **Google Drive**, **WordPress** and **Zendesk**. With [Handlebars templates](http://handlebarsjs.com/), you have full control over what you export.

> Before starting to publish, you must link an account in the **Publish** sub-menu.

## Publish a File

You can publish your file by opening the **Publish** sub-menu and by clicking **Publish to**. For some locations, you can choose between the following formats:

- Markdown: publish the Markdown text on a website that can interpret it (**GitHub** for instance),
- HTML: publish the file converted to HTML via a Handlebars template (on a blog for example).

## Update a publication

After publishing, StackEdit keeps your file linked to that publication which makes it easy for you to re-publish it. Once you have modified your file and you want to update your publication, click on the **Publish now** button in the navigation bar.

> **Note:** The **Publish now** button is disabled if your file has not been published yet.

## Manage file publication

Since one file can be published to multiple locations, you can list and manage publish locations by clicking **File publication** in the **Publish** sub-menu. This allows you to list and remove publication locations that are linked to your file.


# Markdown extensions

StackEdit extends the standard Markdown syntax by adding extra **Markdown extensions**, providing you with some nice features.

> **ProTip:** You can disable any **Markdown extension** in the **File properties** dialog.


## SmartyPants

SmartyPants converts ASCII punctuation characters into "smart" typographic punctuation HTML entities. For example:

|                |ASCII                          |HTML                         |
|----------------|-------------------------------|-----------------------------|
|Single backticks|`'Isn't this fun?'`            |'Isn't this fun?'            |
|Quotes          |`"Isn't this fun?"`            |"Isn't this fun?"            |
|Dashes          |`-- is en-dash, --- is em-dash`|-- is en-dash, --- is em-dash|


## KaTeX

You can render LaTeX mathematical expressions using [KaTeX](https://khan.github.io/KaTeX/):

The *Gamma function* satisfying $\Gamma(n) = (n-1)!\quad\forall n\in\mathbb N$ is via the Euler integral

$$
\Gamma(z) = \int_0^\infty t^{z-1}e^{-t}dt\,.
$$

> You can find more information about **LaTeX** mathematical expressions [here](http://meta.math.stackexchange.com/questions/5020/mathjax-basic-tutorial-and-quick-reference).


## UML diagrams

You can render UML diagrams using [Mermaid](https://mermaidjs.github.io/). For example, this will produce a sequence diagram:

```mermaid
sequenceDiagram
Alice ->> Bob: Hello Bob, how are you?
Bob-->>John: How about you John?
Bob--x Alice: I am good thanks!
Bob-x John: I am good thanks!
Note right of John: Bob thinks a long<br/>long time, so long<br/>that the text does<br/>not fit on a row.

Bob-->Alice: Checking with John...
Alice->John: Yes... John, how are you?
```

And this will produce a flow chart:

```mermaid
graph LR
A[Square Rect] -- Link text --> B((Circle))
A --> C(Round Rect)
B --> D{Rhombus}
C --> D
```