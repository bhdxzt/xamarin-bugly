package zoujian.com.agent;
import android.content.Context;

import com.tencent.bugly.crashreport.*;
/**
 * Created by ZouJian on 2016/3/18.
 */
public class BuglyAgentHelper {
    public static void init(Context context,String appId){
        CrashReport.initCrashReport(context,appId,false);


    }
    public static void setUserId(String userId){
        CrashReport.setUserId(userId);
    }
    public static void testJavaCrash(){
        CrashReport.testJavaCrash();
    }
    public static void postCatchedException(Throwable catchedThrowed){
        CrashReport.postCatchedException(catchedThrowed);
    }

}
