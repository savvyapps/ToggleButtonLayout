# ToggleButtonLayout

Easy creation and management of toggle buttons from the Material Design [spec](https://material.io/guidelines/components/buttons.html#buttons-toggle-buttons). Read more about ToggleButtonLayout in our [blog post](https://savvyapps.com/blog/toggle-button-solution-android-app).

![Single](/art/single.png "Single")
![Multiple](/art/multiple.png "Multiple")
![Segmented](/art/segmented.png "Segmented")

[![Build Status](https://travis-ci.org/savvyapps/ToggleButtonLayout.svg?branch=master)](https://travis-ci.org/savvyapps/ToggleButtonLayout) [![](https://jitpack.io/v/savvyapps/ToggleButtonLayout.svg)](https://jitpack.io/#savvyapps/ToggleButtonLayout)

## Dependency

Add this in your root `build.gradle` file (**not** your module `build.gradle` file):

```gradle
allprojects {
	repositories {
		...
		maven { url "https://jitpack.io" }
	}
}
```

Then, add the library to your project `build.gradle`
```gradle
dependencies {
    implementation 'com.github.savvyapps:ToggleButtonLayout:latest.version.here'
}
```

## Usage
Add the ToggleButtonLayout to your layout:
```xml
<com.savvyapps.togglebuttonlayout.ToggleButtonLayout
    android:id="@+id/toggle_button_layout"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:layout_gravity="center_horizontal"
    android:layout_marginBottom="16dp"
    app:menu="@menu/toggles" />
```
where the toggles menu looks like:
```xml
<?xml version="1.0" encoding="utf-8"?>
<menu xmlns:android="http://schemas.android.com/apk/res/android">

    <item
        android:id="@+id/toggle_left"
        android:icon="@drawable/ic_format_align_left_black_24dp" />

    <item
        android:id="@+id/toggle_center"
        android:icon="@drawable/ic_format_align_center_black_24dp" />

    <item
        android:id="@+id/toggle_right"
        android:icon="@drawable/ic_format_align_right_black_24dp" />
</menu>
```
You can safely ignore lint warnings about needing a title on each item, unless you want a title to appear on each item.

Later, you can get the selected items via:
```kotlin
val selectedToggles = toggleButtonLayout.getSelectedToggles()
//do what you need to with these selected toggles
```

## Customization
You can customize the `ToggleButtonLayout` via XML attributes:
```xml
<com.savvyapps.togglebuttonlayout.ToggleButtonLayout
    android:id="@+id/toggle_text"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:layout_gravity="center_horizontal"
    android:layout_margin="16dp"
    app:allowDeselection="false"
    app:customLayout="@layout/view_toggle_button"
    app:dividerColor="@android:color/darker_gray"
    app:selectedColor="?attr/colorAccent"
    app:menu="@menu/toggles"
    app:multipleSelection="true"
    app:toggleMode="even" />
```

If you use the `customLayout` attribute, the layout is expected to have a `TextView` with an ID of `android:id="@android:id/text1"` if you are using a title, and if you are using an icon, `android:id="@android:id/icon"`. You can omit either of these if you are only using a menu resource with a title or just an icon. See the sample for more.

## Notes
- If you need to rely on a Java version of `ToggleButtonLayout`, you can use the `java` branch.
- Please open an issue or make a pull request for additional features you might want. For PRs, please follow the [Android Kotlin Style Guide](https://android.github.io/kotlin-guides/style.html)

License
--------

    Copyright 2018 Savvy Apps

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
