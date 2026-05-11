package co.hyperverge.hypersnapsdk.utils;

import android.app.Application;
import android.util.Log;
import co.hyperverge.hyperlogger.HyperLogger;
import java.util.regex.Pattern;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
public class HVLogUtils {
    private static final Pattern ANON_CLASS_PATTERN = Pattern.compile("(\\$\\d+)+$");
    private static final int MAX_TAG_LENGTH = 23;
    private static final String NULL_VALUE = "null ";

    public static void d(String str, String str2) {
        log(3, str, str2, null);
    }

    public static void e(String str, String str2) {
        log(6, str, str2, null);
    }

    public static void i(String str, String str2) {
        log(4, str, str2, null);
    }

    private static boolean isDebug() {
        return false;
    }

    private static boolean isRelease() {
        return !isDebug();
    }

    private static void log(int i10, String str, String str2, Throwable th) {
        String str3;
        String str4;
        HyperLogger.Level level = (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) ? HyperLogger.Level.DEBUG : HyperLogger.Level.ERROR;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(" - ");
        sb2.append(str2 != null ? str2 : NULL_VALUE);
        String str5 = BuildConfig.FLAVOR;
        if (th != null) {
            str3 = "\n" + th.getLocalizedMessage();
        } else {
            str3 = BuildConfig.FLAVOR;
        }
        sb2.append(str3);
        HyperLogger.getInstance().log(level, sb2.toString());
        if (!isRelease() || i10 >= 6) {
            try {
                str4 = ((Application) Class.forName("android.app.AppGlobals").getMethod("getInitialApplication", null).invoke(null, null)).getPackageName();
            } catch (Exception unused) {
                str4 = BuildConfig.FLAVOR;
            }
            if (isDebug() && str4.contains("co.hyperverge")) {
                StringBuilder sb3 = new StringBuilder();
                if (str2 == null) {
                    str2 = NULL_VALUE;
                }
                sb3.append(str2);
                if (th != null) {
                    str5 = "\n" + th.getLocalizedMessage();
                }
                sb3.append(str5);
                Log.println(i10, str, sb3.toString());
            }
        }
    }

    public static void v(String str, String str2) {
        log(2, str, str2, null);
    }

    public static void w(String str, String str2) {
        log(5, str, str2, null);
    }

    public static void e(String str, String str2, Throwable th) {
        log(6, str, str2, th);
    }

    public static void w(String str, String str2, Throwable th) {
        log(5, str, str2, th);
    }
}
