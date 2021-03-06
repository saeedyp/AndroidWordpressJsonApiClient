# AndroidWordpressJsonApiClient
An Open Source Android Client for self hosted wordpress blogs that works with json-api plugin

<img src="https://github.com/The-LoneWolf/AndroidWordpressJsonApiClient/raw/master/img/all2.png">

## Instructions
1 Install <a href="https://wordpress.org/plugins/json-api/">JSON API wordpress plugin</a> and activate it.<br>
2 Just Copy your api adress to baseUrl variable in <a href="https://github.com/The-LoneWolf/AndroidWordpressJsonApiClient/blob/master/app/src/main/java/ir/technopedia/wordpressjsonclient/util/NetUtil.java">NetUtils.java</a> and you are ready to go.<br>
&nbsp;&nbsp;&nbsp;&nbsp; ** if your domain adress is http://test.com your json api default adress would be http://test.com/api
<br><br>
more Instructions on development and other stuff witll be added :)
<br><br>

## Things Done
1 Android 4+ and Material design app with apcompat library<br>
2 Custom dynamic navigation menu (dynamic by loading categories)<br>
3 Loading and viewing posts and comments (lazy load)<br>
4 Submitting comment with dialog<br>
5 Badge to show comment counts in post detail activity.<br>
6 Used swipe to close effect on post detail activity and comments activity.<br>

## Things to do
1 Add Splash Screen<br>
2 Add search<br>
3 Add Caching system<br>
4 Add Transition Effects<br>
5 Add Settings<br>
6 Add Different Views<br>
7 Add Signup and Login if possible<br>
....<br><br>

## Libraries Used in this project
1. <a href="https://github.com/loopj/android-async-http">loopj async http </a><br>
2. <a href="https://github.com/Jude95/SwipeBackHelper">Swipe Back Helper</a><br>
3. <a href="http://square.github.io/picasso/">Square Picasso image loading</a><br>
