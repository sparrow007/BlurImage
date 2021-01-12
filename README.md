# BlurImage


![blurimagelibrary](https://user-images.githubusercontent.com/22986571/33244355-7f27753e-d31b-11e7-9df1-dbbb90b76e80.jpg)

This Android Project help you to make your image blur in fastest way 

[![Platform](https://img.shields.io/badge/platform-android-blue.svg)](http://developer.android.com/index.html)
[![API](https://img.shields.io/badge/API-14%2B-blue.svg?style=flat)](https://android-arsenal.com/api?level=14)

USAGE
-----
To make your imageview blurry in a single line of code, library  using android framework (rendersript) which is most efficient for doing these tasks and  you can grab this library using your Gradle file : 
 
 Gradle
------

#### Step #1. Add the dependency

```
dependencies {
    ...
    Implementation 'com.jackandphantom.android:blurimage:1.2.0'
}
```

#### Step #2. Add the below lines on app module build.gradle file.

```groovy
defaultConfig {
    ...
    renderscriptTargetApi 19
    renderscriptSupportModeEnabled true
}
```

IMPLEMENTATION
----
This library has different methods which you can use to maintain your image blur.

```java
BlurImage.with(getApplicationContext()).load(R.drawable.myImage).intensity(20).Async(true).into(imageView);
                                       OR                            
BlurImage.with(getApplicationContext()).load(bitmap_Image).intensity(20).Async(true).into(imageView);
```

method (load) :- load(int resource),  load(Bitmap bitmap)

method(intesity):- intensity( int value) { Increase Blur and limit of value is in between 0 to 25 }

**Synchronous way to Load** :-
To make blur in synchronous you need to put false in Async method.

**ASynchronous way to Load**:-
   To make blur in asynchronous (Background) you need to put true in Async method.
   
**Direct get Blur Bitmap** :-
   To get direct blur bitmap call the following code .
   ```java
   Bitmap bitmap = BlurImage.with(getApplicationContext()).load(R.drawable.mountain).intensity(20).Async(true).getImageBlur();
   ```
   
   LICENCE
-----

 Copyright 2017 Ankit kumar

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

 Thanks to stackoverflow and Vivek


