# FastMenuBar

A simple, practical menu bar for Android.[Download Demo]()

<img src="/preview/preview1.png" height="500px"></img>
<img src="/preview/preview2.png" height="500px"></img>
<img src="/preview/preview3.png" height="500px"></img>

# Usage

You can directly copy the layout file style using the sample project and use the FastMenuBar that is already written.[Click here]() 

## Step1

Add it in your root build.gradle at the end of repositories

```
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```

## Step2

Add the dependency

```
dependencies {
	compile 'com.github.AndroidHensen:FastMenuBar:v1.0'
}
```

## Step3

Add FastMenuBar in your layout

```
<com.handsome.library.FastMenuBar
	android:id="@+id/fmb_traffic"
	android:layout_width="match_parent"
	android:layout_height="wrap_content"
	app:fmb_icon="@drawable/icon_office5"
	app:fmb_title="交通报销" />
```

## Step4

Add clickListener for FastMenuBar

```
fmb_traffic = (FastMenuBar) findViewById(R.id.fmb_traffic);
fmb_traffic.setOnMenuBarClickListener(this);

/*
 * FastMenuBar clickListener implements
 */
@Override
public void onMenuBarClick(FastMenuBar v) {
	switch (v.getId()) {
		case R.id.fmb_traffic:
			Toast.makeText(this, v.getMenuBarTitle(), Toast.LENGTH_SHORT).show();
			break;
	}
}
```

# Attribute

## Base

```
<com.handsome.library.FastMenuBar
	android:layout_width="match_parent"
	android:layout_height="wrap_content"
	app:fmb_animation_type="fmb_normal"      //default none 
	app:fmb_arrow="@drawable/ic_pick_arrow"  //default gray
	app:fmb_arrow_enable="true"              //default true
	app:fmb_bot_line_enable="true"           //default true  
	app:fmb_bot_line_margin="16dp"           //defalut 0
	app:fmb_icon="@drawable/icon_business1"  //defalut none
	app:fmb_icon_enable="true"               //defalut true
	app:fmb_message="In the sales"           //defalut ""
	app:fmb_message_color="#F4B1B2"           //defalut #888888
	app:fmb_message_enable="true"            //defalut true
	app:fmb_title="Sales"                    //defalut ""
	app:fmb_title_color="#D72822"            //defalut #333333
	app:fmb_title_enable="true"              //defalut true
	app:fmb_top_line_enable="true" />        //defalut false
```

<img src="/preview/Animation.gif" height="500px"></img>

## Animation

<img src="/preview/Animation1.gif" height="500px"></img>
<img src="/preview/Animation2.gif" height="500px"></img>
<img src="/preview/Animation3.gif" height="500px"></img>


# FAQ

**Can i use FastMenuBar for ListView Item?**

you can't.There is no caching mechanism for FastMenuBar,It only works for setting pages and so on.

# Changelog

* 1.0
	* Initial release
	
# License

Copyright 2017 AndroidHensen

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

