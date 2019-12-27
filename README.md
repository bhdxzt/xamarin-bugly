# xamarin-bugly for android

[![install from nuget](http://img.shields.io/nuget/v/Bugly.svg?style=flat-square)](https://www.nuget.org/packages/Bugly)
[![release](https://img.shields.io/github/release/chsword/xamarin-bugly.svg?style=flat-square)](https://github.com/chsword/xamarin-bugly/releases)
[![Build status](https://ci.appveyor.com/api/projects/status/36lyx13fig2q2xyb/branch/master?svg=true)](https://ci.appveyor.com/project/chsword/xamarin-bugly/branch/master)

* 已经打包为 DLL 内部已经集成 aar 包，无需再次引用
* 当前 Upgrade 版本 : *v.1.4.2*
* 当前 Buly 版本 : *v4.3.1.0*

## 使用方法
1. 引用 DLL
    > 通过 Nuget

    ```powershell
    Install-Package Bugly
    ```
2. 为 Mono Android 项目添加一个 Application 类

    ``` csharp
        [Application]
        public class AndroidApplication : Application
        {
            public AndroidApplication(IntPtr handle, JniHandleOwnership ownerShip) : base(handle, ownerShip)
            {
            }
            public override void OnCreate()
            {
                base.OnCreate();
                Com.Chteam.Agent.BuglyAgentHelper.Init(this.ApplicationContext, "appId");
            }
        }
    ```
3. 如果需要使用升级推送功能，请配置```AndroidManifest.xml```文件中加入

    ```xml
    <activity
    android:name="com.tencent.bugly.beta.ui.BetaActivity"
	android:configChanges="keyboardHidden|orientation|screenSize|locale"
    android:theme="@android:style/Theme.Translucent" />
    ```
    
    检查更新代码
    
    ```c#
    Com.Chteam.Agent.BuglyAgentHelper.CheckUpgrade();
    ```

# Release Note

### v4.3.1.0
* 修复Bugly log引起的anr问题
* 修复本地db存储量过大引起cursor window full的问题


### v3.1.3.1
* 2017-06-30
* upgrade 1.3.1 版本
* 更新Tinker版本至1.7.11，支持360加固
* aar内置权限、activity、fileProvider配置，无须手动配置
* 对应tinker-support 1.0.8
* 集成Bugly 2.6.5版本

### v2.3.0.0

* 2016-10-11
* 适配Android 7.0文件权限
* 优化弹窗展示
* 性能优化并修复若干bug
* 集成Bugly2.3.0版本

### v2.1.44

* 2016-08-21
* 优化策略和DB；
* 集成bugly最新2.2.2版本。

### v2.1.33

* 支持 upgrade 1.1.3
* 优化UpgradeLisetner回调时机；
* 更新弹窗的黑白名单支持继承关系；
* 集成bugly最新2.2.0版本。

### v2.1.32.0
* 支持 upgrade 1.1.2
* 支持 bugly 2.1.9

### v2.1.31.1
* 支持 upgrade 1.1.1

### v2.1.31
* 支持 upgrade 1.1.0 / bugly 2.1.7
    * 新增自定义更新弹窗样式功能；
    * 新增弹窗黑名单功能；
    * 优化弹窗逻辑；
    * 修复部分BUG。

### v2.1.30
* 支持 bugly_crash_upgrade_1.0.2.jar
    * 开放Beta.checkUpgrade(boolean isManual, boolean isSilence)接口；
    * 更新Bugly Android SDK包 v2.1.3 版本功能。
    * 优化Native异常合并逻辑；
    * 优化上报流量控制；
    * 优化运营数据上报逻辑；
    * 修复小概率数据重复上报问题。

### v2.1.12

* 支持 bugly_crash_upgrade_1.0.1.jar

### v2.1.11

* 支持 bugly_crash_upgrade_1.0.1-beta2.jar

### v2.1.10
* 支持[应用内升级提醒功能](http://bugly.qq.com/betaAndroidSdk)
* 修改为支持 bugly_crash_upgrade_1.0.0.jar
* 增加 checkUpgrade 及 getUpgradeInfo 方法的支持
* 增加 Nuget发布
* 增加 appveyor 集成支持

### v2.1
已支持方法：

CrashReport.setUserSceneTag
> BuglyAgentHelper.setUserSceneTag

CrashReport.putUserData
> BuglyAgentHelper.putUserData

### v1.0
已支持方法：
CrashReport.initCrashReport
> BuglyAgentHelper.init

CrashReport.setUserId
> BuglyAgentHelper.setUserId

CrashReport.testJavaCrash
> BuglyAgentHelper.testJavaCrash

CrashReport.postCatchedException
> BuglyAgentHelper.postCatchedException


## 命名空间：
Com.Chteam.Agent


## 关于 Bugly

[Bugly官网 http://bugly.qq.com/](http://bugly.qq.com/)

[Bugly说明](http://bugly.qq.com/introduction)

[官方使用文档](https://bugly.qq.com/docs/user-guide/instruction-manual-android-upgrade)
