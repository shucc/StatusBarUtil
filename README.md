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
	    compile 'com.github.shucc:StatusBarUtil:v1.0'
	}
```

## 使用

```java
    StatusBarUtil.setStatusBarColor(Activity activity, int color, boolean needSetStatusBarColor);
```