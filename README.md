# xamarin-bugly for android

[![install from nuget](http://img.shields.io/nuget/v/Bugly.svg?style=flat-square)](https://www.nuget.org/packages/Bugly)
[![release](https://img.shields.io/github/release/chsword/xamarin-bugly.svg?style=flat-square)](https://github.com/chsword/xamarin-bugly/releases)
[![Build status](https://ci.appveyor.com/api/projects/status/36lyx13fig2q2xyb/branch/master?svg=true)](https://ci.appveyor.com/project/chsword/xamarin-bugly/branch/master)

* 已经打包为 DLL 内部已经集成 Jar 包，无需再次引用
* 当前 Buly 版本 : *v2.1*

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
    android:theme="@android:style/Theme.Translucent" />
    ```
    
    检查更新代码
    
    ```c#
    Com.Chteam.Agent.BuglyAgentHelper.CheckUpgrade();
    ```

# Release Note

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

[Bugly官网](http://bugly.qq.com/)
[Bugly说明](http://bugly.qq.com/introduction)
