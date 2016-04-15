package com.chteam.agent;
import android.content.Context;

import com.tencent.bugly.Bugly;
import com.tencent.bugly.crashreport.*;
/**
 * Created by ZouJian on 2016/3/18.
 */
public class BuglyAgentHelper {
    public static void init(Context context,String appId){
        Bugly.init(context,appId,false);
    }

    public static void init(Context context){
        CrashReport.initCrashReport(context);
    }

    public static void setUserId(String userId){
        CrashReport.setUserId(userId);
    }
    public static void setUserSceneTag(Context context,int i){
        CrashReport.setUserSceneTag(context, i);
    }
    public static void putUserData(Context context,String key,String value){
        CrashReport.putUserData(context, key,value);
    }

    public static void testJavaCrash(){
        CrashReport.testJavaCrash();
    }
    public static void postCatchedException(Throwable catchedThrowed){
        CrashReport.postCatchedException(catchedThrowed);
    }

}
