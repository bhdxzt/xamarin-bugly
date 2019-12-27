package com.chteam.agent;

import android.content.Context;
import com.tencent.bugly.Bugly;
import com.tencent.bugly.beta.Beta;
import com.tencent.bugly.beta.UpgradeInfo;
import com.tencent.bugly.crashreport.*;

/**
 * Created by MaZhiLun on 2019/12/26.
 */
public class BuglyAgentHelper {
    public static void init(Context context, String appId) {
        Bugly.init(context, appId, false);
    }

    public static void init(Context context, String appId, boolean isDebug) {
        Bugly.init(context, appId, isDebug);
    }

    public static void init(Context context) {
        CrashReport.initCrashReport(context);
    }

    public static void setUserId(String userId) {
        CrashReport.setUserId(userId);
    }

    public static void setUserSceneTag(Context context, int i) {
        CrashReport.setUserSceneTag(context, i);
    }

    public static void putUserData(Context context, String key, String value) {
        CrashReport.putUserData(context, key, value);
    }

    public static void testJavaCrash() {
        CrashReport.testJavaCrash();
    }

    public static void testANRCrash(){
        CrashReport.testANRCrash();
    }

    public static void testNativeCrash(){
        CrashReport.testNativeCrash();
    }
    public static void closeBugly() {
        CrashReport.closeBugly();
    }

    public static void closeCrashReport() {
        CrashReport.closeCrashReport();
    }

    public static void setAppVersion(Context context, String version) {
        CrashReport.setAppVersion(context, version);
    }

    public static void setIsDevelopmentDevice(Context context, boolean isDevelopment) {

        CrashReport.setIsDevelopmentDevice(context, isDevelopment);
    }

    public static void setIsDevelopmentDevice1(Context context, boolean isForeground) {
        CrashReport.setIsAppForeground(context, isForeground);
    }

    public static void postCatchedException(Throwable catchedThrowed) {
        CrashReport.postCatchedException(catchedThrowed);
    }

    public static void checkUpgrade() {
        Beta.checkUpgrade();
    }

    public static void cancelDownload() {
        Beta.cancelDownload();
    }

    public static void autoCheckUpgrade(boolean isAutoCheck){
        Beta.autoCheckUpgrade=isAutoCheck;
    }

    public static UpgradeInfo getUpgradeInfo() {
        return Beta.getUpgradeInfo();
    }
}
