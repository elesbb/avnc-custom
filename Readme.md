
<p align="center"><img src="metadata/en-US/branding/wordmark.svg" alt="AVNC Banner" height="200"></img></a>


<p align="center"> <b>AVNC</b> is a VNC client for Android. </p>

-------------------------------------------------------------------------------


### Features
- Material Design (with Dark theme)
- Configurable gestures
- Tight encoding
- Virtual Keys
- Picture-in-Picture mode
- View-only mode
- Zeroconf Server Discovery
- TLS support (AnonTLS, VeNCrypt)
- SSH tunnel (VNC over SSH)
- Import/Export servers
- VNC Repeater support
- Clipboard Sync with server

### Custom ELESBB features - All features hard coded. Did not add preference options for them
- Added stylus hover buffer. Stylus must move a set distance before moving remote cursor. Useful for hovering over items and having their tooltip shown on the remote machine.
- Added stylus button scroll. When the stylus primary button is pressed, the content will scroll.
- Added fling remote scrolling when primary stylus button is pressed. Fling with scroll remote content.
- Added double tap and fling remote scrolling. When you double tap with your finger and fling, the remote content will be scrolled.
- Added fling scrolling canceling when a touch by finger or stylus is detected.
- Added primary stylus button equals right click on remote client. Disabled long click with stylus.
- Added custom gesture detector to enable tuning of gesture listener.
- Fixed issue on my Samsung Tab S9+ where Alt+F4 was not sent to the remote client. See https://github.com/gujjwal00/avnc/issues/258
- Fixed issue on my Samsung Tab S9+ where Ctrl+Shift was not sent to remote client. See https://github.com/gujjwal00/avnc/issues/258
- Adjusted swipe sensitivity to allow for more fine tuning.
- Added air actions for Samsung SPen

Get ORIGINAL unmodified app below.

[<img src="https://fdroid.gitlab.io/artwork/badge/get-it-on.png" alt="Get it on F-Droid" height="80">](https://f-droid.org/packages/com.gaurav.avnc/)
[<img src="https://play.google.com/intl/en_us/badges/static/images/badges/en_badge_web_generic.png" alt="Get it on Play Store" height="80">](https://play.google.com/store/apps/details?id=com.gaurav.avnc)

### Screenshots

[<img src="metadata/en-US/images/phoneScreenshots/1.jpg" width="250">](metadata/en-US/images/phoneScreenshots/1.jpg)
[<img src="metadata/en-US/images/phoneScreenshots/2.jpg" width="250">](metadata/en-US/images/phoneScreenshots/2.jpg)
[<img src="metadata/en-US/images/phoneScreenshots/3.jpg" width="250">](metadata/en-US/images/phoneScreenshots/3.jpg)
[<img src="metadata/en-US/images/phoneScreenshots/4.jpg" width="250">](metadata/en-US/images/phoneScreenshots/4.jpg)
[<img src="metadata/en-US/images/phoneScreenshots/5.jpg" width="250">](metadata/en-US/images/phoneScreenshots/5.jpg)
[<img src="metadata/en-US/images/phoneScreenshots/6.jpg" width="250">](metadata/en-US/images/phoneScreenshots/6.jpg)
[<img src="metadata/en-US/images/phoneScreenshots/7.jpg" width="380">](metadata/en-US/images/phoneScreenshots/7.jpg)
[<img src="metadata/en-US/images/phoneScreenshots/8.jpg" width="380">](metadata/en-US/images/phoneScreenshots/8.jpg)

  
Development
===========

Tools required:

- Git 
- Android Studio
- Android SDK
- NDK (with CMake)

To get started, simply clone the repo and initialize submodules:

```bash
git clone https://github.com/elesbb/avnc-custom.git
cd avnc-custom
git submodule update --init --depth 1
```

Now you can import the project in Android Studio, or build it directly from terminal.

Read [Architecture.kt](app/src/main/java/com/gaurav/avnc/Architecture.kt) (preferably in
Android Studio) to know more about the code.


##
You can translate AVNC on [Weblate](https://hosted.weblate.org/engage/avnc/).

[<img src="https://hosted.weblate.org/widgets/avnc/-/open-graph.png" alt="Translation status" height="200" />](https://hosted.weblate.org/engage/avnc/)
