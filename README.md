# StatusBarUtil

修改StatusBar颜色的工具库,5.0以下使用的是[SystemBarTint](https://github.com/jgilfelt/SystemBarTint).

## 配置

在项目的build.gradle中,添加:

```groovy
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```
在使用库的module中添加:
```groovy
dependencies {
    implementation 'com.github.shucc:StatusBarUtil:v1.3'
}
```

## 使用

```java
//设置全透明状态栏
StatusBarUtil.setTransparentStatusBar(Activity activity);
//设置半透明状态栏
StatusBarUtil.setSemitransparentStatusBar(Activity activity);
//设置状态栏为深色图标（即黑色图标及文字）,支持MIUIV6以上,魅族手机上以及原生6.0以上
StatusBarUtil.setStatusBarLightModel(Activity activity, true);
//设置状态栏颜色
StatusBarUtil.setStatusBarColor(Activity activity, int color);
```
