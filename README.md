# xamarin-bugly for android

已经打包为 DLL 内部已经集成 Jar 包，无需再次引用

## 关于 Bugly
[http://bugly.qq.com/]

当前 Buly 版本 : v1.2.9
已经支持的方法 

## 命名空间：
Com.Chteam.Agent

## 使用方法
1. 引用 DLL
2. 为 Android 项目添加一个 Application 类

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


# Release Note
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
