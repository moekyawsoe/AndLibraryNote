# AndLibraryNote-Android
[![platform](https://img.shields.io/badge/platform-Android-yellow.svg)](https://www.android.com)
[![API](https://img.shields.io/badge/API-15%2B-brightgreen.svg?style=plastic)](https://android-arsenal.com/api?level=15)
[![](https://jitpack.io/v/moekyawsoe/AndLibrayNote.svg)](https://jitpack.io/#moekyawsoe/AndLibrayNote)

## Prerequisites

Add this in your root `build.gradle` file (**not** your module `build.gradle` file):

```gradle
allprojects {
	repositories {
		...
		maven { url "https://jitpack.io" }
	}
}
```

## Dependency

Add this to your module's `build.gradle` file (make sure the version matches the JitPack badge above):

```gradle
dependencies {
	...
	implementation 'com.github.moekyawsoe:AndLibrayNote:0.1.1'
}
```
## Usage

Each method always returns a `Toast` object, so you can customize the Toast.

Default Toast from AndLibraryNote:

``` java
AndLibraryNote.Toaster(MainActivity.this,"Hello Android Library");
```
Toasts from MksToast:
Default Toast:

``` java
public void defaultToast(View view){
        MksToast.makeText(MainActivity.this,"This is Default Toast", Toast.LENGTH_LONG,MksToast.Default,true).show();
}
```
Success Toast:

``` java
public void successToast(View view){
        MksToast.makeText(MainActivity.this,"This is Success Toast", Toast.LENGTH_LONG,MksToast.SUCCESS,true).show();
}
```
Info Toast:

``` java
public void infoToast(View view){
        MksToast.makeText(MainActivity.this,"This is Info Toast", Toast.LENGTH_LONG,MksToast.INFO,true).show();
}
```
Warning Toast:

``` java
public void warningToast(View view){
        MksToast.makeText(MainActivity.this,"This is Warning Toast", Toast.LENGTH_LONG,MksToast.WARNING,true).show();
}
```
Error Toast:

``` java
public void errorToast(View view){
        MksToast.makeText(MainActivity.this,"This is Error Toast", Toast.LENGTH_LONG,MksToast.ERROR,true).show();
}
```

Without top-right corner icon
``` java
public void CustomToastOne(View view){
       MksToast.makeText(MainActivity.this,"This is Toast Withour Corner Icon", Toast.LENGTH_LONG,MksToast.Default,false).show();
   }
```

With custom badge
``` java
public void CustomToastTwo(View view){
       MksToast.makeText(MainActivity.this,"This is Custom Badge Toast", Toast.LENGTH_LONG, MksToast.INFO,R.drawable.logopng,false).show();
}
```
