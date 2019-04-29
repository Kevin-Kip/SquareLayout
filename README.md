[![Download](https://api.bintray.com/packages/kevinkiprotich/SquareLayout/com.revosleap.squarelayout/images/download.svg) ](https://bintray.com/kevinkiprotich/SquareLayout/com.revosleap.squarelayout/_latestVersion)

## SquareLayout 
Square layout for android. 
It only inherits from `ConstraintLayout`.
I did not see the need to create many for each ViewGroup since it would make the library big and providing many classes you wouldn't use :smiley:
## Table of Contents
1. [Dependencies](#dependencies)
2. [Usage](#usage)
3. [Methods](#methods)
4. [Contribution](#contribution)
5. [Author](#author)
6. [Support](#support)
7. [License](#license)

<h3 id="dependencies">Dependencies</h3>

>Gradle
```gradle
dependencies {
  implementation 'com.revosleap.squarelayout:squarelayout:1.0.0'
}
```

>Maven
```maven
<dependency>
  <groupId>com.revosleap.squarelayout</groupId>
  <artifactId>squarelayout</artifactId>
  <version>1.0.0</version>
  <type>pom</type>
</dependency>
```

<h3 id="usage">Usage</h3>

>XML
```xml
<com.revosleap.SquareLayout 
    xmlns:android="http://schemas.android.com/apk/res/android"  
    android:layout_width="match_parent"  
    android:layout_height="wrap_content"   
    android:id="@+id/square"
    xmlns:app="http://schemas.android.com/apk/res-auto">  
  
    <ImageView .../>
    <TextView .../>  
  
</com.revosleap.SquareLayout>
```

>Kotlin
```kotlin 
val squareLayout = findViewById(R.id.square)
// you can then do anything you'd do with a constraintLayout
```


<h3 id="methods">Methods</h3>

All the methods provided by the library are:
> All the methods provided by [ConstraintLayout](https://developer.android.com/reference/android/support/constraint/ConstraintLayout). :wink:

<h3 id="contribution">Contribution</h3>

1.  Fork
2.  Create feature branch:  `git checkout -b my-feature-branch`
3.  Commit changes:  `git commit -am 'new awesome feature'`
4.  Push to the branch:  `git push origin my-feature-branch`
5.  Submit a pull request 

<h3 id="author">Author</h3>

Made with :heart: by [Kevin Kiprotich](kevinkip.rf.gd)

<h3 id="support">Support</h3>

<a href="https://www.buymeacoffee.com/CHFudJf9j" target="_blank"><img src="https://www.buymeacoffee.com/assets/img/custom_images/purple_img.png" alt="Buy Me A Coffee" style="height: auto !important;width: auto !important;" ></a>

<h3 id="license"> License</h3>

MIT License  
  
Copyright (c) 2018 Kevin Kiprotich  
  
Permission is hereby granted, free of charge, to any person obtaining a copy  
of this software and associated documentation files (the "Software"), to deal  
in the Software without restriction, including without limitation the rights  
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell  
copies of the Software, and to permit persons to whom the Software is  
furnished to do so, subject to the following conditions:  
  
The above copyright notice and this permission notice shall be included in all  
copies or substantial portions of the Software.  
  
THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR  
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,  
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE  
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER  
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,  
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE  
SOFTWARE.