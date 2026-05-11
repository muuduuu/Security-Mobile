package S4;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import c3.AbstractC1721a;
import com.facebook.react.AbstractC1900o;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.Map;
import org.conscrypt.BuildConfig;
import v4.AbstractC4929e;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f8746a = "a";

    /* renamed from: b, reason: collision with root package name */
    private static String f8747b;

    public static String a(Context context) {
        return b(c(context));
    }

    public static String b(Integer num) {
        return "adb reverse tcp:" + num + " tcp:" + num;
    }

    private static Integer c(Context context) {
        return Integer.valueOf(context.getResources().getInteger(AbstractC1900o.f21908a));
    }

    public static String d() {
        if (j()) {
            return Build.MODEL;
        }
        return Build.MODEL + " - " + Build.VERSION.RELEASE + " - API " + Build.VERSION.SDK_INT;
    }

    public static Map e(Context context) {
        String str;
        String str2;
        if (context != null) {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i10 = applicationInfo.labelRes;
            String packageName = context.getPackageName();
            str = i10 == 0 ? applicationInfo.nonLocalizedLabel.toString() : context.getString(i10);
            str2 = packageName;
        } else {
            str = null;
            str2 = null;
        }
        return AbstractC4929e.h("appDisplayName", str, "appIdentifier", str2, "platform", "android", "deviceName", Build.MODEL, "reactNativeVersion", g());
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x006b, code lost:
    
        if (r2 == null) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static synchronized String f() {
        BufferedReader bufferedReader;
        Throwable th;
        Process process;
        Exception e10;
        synchronized (a.class) {
            String str = f8747b;
            if (str != null) {
                return str;
            }
            try {
                try {
                    process = Runtime.getRuntime().exec(new String[]{"/system/bin/getprop", "metro.host"});
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e11) {
                bufferedReader = null;
                e10 = e11;
                process = null;
            } catch (Throwable th3) {
                bufferedReader = null;
                th = th3;
                process = null;
            }
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream(), Charset.forName("UTF-8")));
                String str2 = BuildConfig.FLAVOR;
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        str2 = readLine;
                    } catch (Exception e12) {
                        e10 = e12;
                        AbstractC1721a.K(f8746a, "Failed to query for metro.host prop:", e10);
                        f8747b = BuildConfig.FLAVOR;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
                f8747b = str2;
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
            } catch (Exception e13) {
                bufferedReader = null;
                e10 = e13;
            } catch (Throwable th4) {
                bufferedReader = null;
                th = th4;
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (Exception unused3) {
                    }
                }
                if (process == null) {
                    throw th;
                }
                process.destroy();
                throw th;
            }
            process.destroy();
            return f8747b;
        }
    }

    private static String g() {
        String str;
        Map map = b.f8748a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(map.get("major"));
        sb2.append(".");
        sb2.append(map.get("minor"));
        sb2.append(".");
        sb2.append(map.get("patch"));
        if (map.get("prerelease") != null) {
            str = "-" + map.get("prerelease");
        } else {
            str = BuildConfig.FLAVOR;
        }
        sb2.append(str);
        return sb2.toString();
    }

    public static String h(Context context) {
        return i(c(context).intValue());
    }

    private static String i(int i10) {
        String f10 = f();
        if (f10.equals(BuildConfig.FLAVOR)) {
            f10 = j() ? "10.0.3.2" : k() ? "10.0.2.2" : "localhost";
        }
        return String.format(Locale.US, "%s:%d", f10, Integer.valueOf(i10));
    }

    private static boolean j() {
        return Build.FINGERPRINT.contains("vbox");
    }

    private static boolean k() {
        String str = Build.FINGERPRINT;
        return str.contains("generic") || str.startsWith("google/sdk_gphone");
    }
}
