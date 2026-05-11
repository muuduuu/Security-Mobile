package W5;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class a {
    private static boolean a(Context context) {
        try {
            throw new Exception();
        } catch (Exception e10) {
            int i10 = 0;
            for (StackTraceElement stackTraceElement : e10.getStackTrace()) {
                if (stackTraceElement.getClassName().equals("com.android.internal.os.ZygoteInit") && (i10 = i10 + 1) == 2) {
                    return true;
                }
                if (stackTraceElement.getClassName().equals("com.saurik.substrate.MS$2") && stackTraceElement.getMethodName().equals("invoked")) {
                    return true;
                }
                if (stackTraceElement.getClassName().equals("de.robv.android.xposed.XposedBridge") && stackTraceElement.getMethodName().equals("main")) {
                    return true;
                }
                if (stackTraceElement.getClassName().equals("de.robv.android.xposed.XposedBridge") && stackTraceElement.getMethodName().equals("handleHookedMethod")) {
                    return true;
                }
            }
            return b(context);
        }
    }

    private static boolean b(Context context) {
        List<ActivityManager.RunningServiceInfo> runningServices = ((ActivityManager) context.getSystemService("activity")).getRunningServices(300);
        if (runningServices != null) {
            for (int i10 = 0; i10 < runningServices.size(); i10++) {
                if (runningServices.get(i10).process.contains("fridaserver") || runningServices.get(i10).process.contains("frida-server")) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean c(Context context) {
        List<ApplicationInfo> installedApplications = context.getPackageManager().getInstalledApplications(128);
        String[] strArr = {"de.robv.android.xposed.installer", "com.saurik.substrate", "de.robv.android.xposed", "com.noshufou.android.su.elite", "eu.chainfire.supersu", "com.koushikdutta.superuser", "com.thirdparty.superuser", "com.yellowes.su", "com.koushikdutta.rommanager", "com.koushikdutta.rommanager.license", "com.dimonvideo.luckypatcher", "com.chelpus.lackypatch", "com.ramdroid.appquarantine", "com.ramdroid.appquarantinepro", "de.robv.android.xposed.installer", "com.saurik.substrate", "com.zachspong.temprootremovejb", "com.amphoras.hidemyroot", "com.amphoras.hidemyrootadfree", "com.formyhm.hiderootPremium", "com.formyhm.hideroot", "me.phh.superuser", "eu.chainfire.supersu.pro", "com.kingouser.com", "com.topjohnwu.magisk"};
        if (installedApplications != null) {
            Iterator<ApplicationInfo> it = installedApplications.iterator();
            while (it.hasNext()) {
                if (Arrays.asList(strArr).contains(it.next().packageName)) {
                    return true;
                }
            }
        }
        return a(context);
    }
}
