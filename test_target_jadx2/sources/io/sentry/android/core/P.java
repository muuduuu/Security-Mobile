package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import android.provider.Settings;
import android.util.DisplayMetrics;
import io.sentry.ILogger;
import io.sentry.K1;
import io.sentry.protocol.C3441a;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class P {

    static class a {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f34744a;

        /* renamed from: b, reason: collision with root package name */
        private final String f34745b;

        public a(boolean z10, String str) {
            this.f34744a = z10;
            this.f34745b = str;
        }

        public Map a() {
            HashMap hashMap = new HashMap();
            hashMap.put("isSideLoaded", String.valueOf(this.f34744a));
            String str = this.f34745b;
            if (str != null) {
                hashMap.put("installerStore", str);
            }
            return hashMap;
        }
    }

    static ApplicationInfo a(Context context, long j10, N n10) {
        PackageManager.ApplicationInfoFlags of;
        ApplicationInfo applicationInfo;
        if (n10.d() < 33) {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        }
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        of = PackageManager.ApplicationInfoFlags.of(j10);
        applicationInfo = packageManager.getApplicationInfo(packageName, of);
        return applicationInfo;
    }

    static String b(Context context, ILogger iLogger) {
        try {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i10 = applicationInfo.labelRes;
            if (i10 != 0) {
                return context.getString(i10);
            }
            CharSequence charSequence = applicationInfo.nonLocalizedLabel;
            return charSequence != null ? charSequence.toString() : context.getPackageManager().getApplicationLabel(applicationInfo).toString();
        } catch (Throwable th) {
            iLogger.b(K1.ERROR, "Error getting application name.", th);
            return null;
        }
    }

    static String[] c(N n10) {
        return n10.d() >= 21 ? Build.SUPPORTED_ABIS : new String[]{Build.CPU_ABI, Build.CPU_ABI2};
    }

    static String d(Context context, N n10) {
        if (n10.d() >= 17) {
            return Settings.Global.getString(context.getContentResolver(), "device_name");
        }
        return null;
    }

    static DisplayMetrics e(Context context, ILogger iLogger) {
        try {
            return context.getResources().getDisplayMetrics();
        } catch (Throwable th) {
            iLogger.b(K1.ERROR, "Error getting DisplayMetrics.", th);
            return null;
        }
    }

    static String f(ILogger iLogger) {
        try {
            return Build.MODEL.split(" ", -1)[0];
        } catch (Throwable th) {
            iLogger.b(K1.ERROR, "Error getting device family.", th);
            return null;
        }
    }

    static String g(ILogger iLogger) {
        String property = System.getProperty("os.version");
        File file = new File("/proc/version");
        if (!file.canRead()) {
            return property;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            try {
                String readLine = bufferedReader.readLine();
                bufferedReader.close();
                return readLine;
            } finally {
            }
        } catch (IOException e10) {
            iLogger.b(K1.ERROR, "Exception while attempting to read kernel information", e10);
            return property;
        }
    }

    static ActivityManager.MemoryInfo h(Context context, ILogger iLogger) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            if (activityManager != null) {
                activityManager.getMemoryInfo(memoryInfo);
                return memoryInfo;
            }
            iLogger.c(K1.INFO, "Error getting MemoryInfo.", new Object[0]);
            return null;
        } catch (Throwable th) {
            iLogger.b(K1.ERROR, "Error getting MemoryInfo.", th);
            return null;
        }
    }

    static PackageInfo i(Context context, int i10, ILogger iLogger, N n10) {
        PackageManager.PackageInfoFlags of;
        PackageInfo packageInfo;
        try {
            if (n10.d() < 33) {
                return context.getPackageManager().getPackageInfo(context.getPackageName(), i10);
            }
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            of = PackageManager.PackageInfoFlags.of(i10);
            packageInfo = packageManager.getPackageInfo(packageName, of);
            return packageInfo;
        } catch (Throwable th) {
            iLogger.b(K1.ERROR, "Error getting package info.", th);
            return null;
        }
    }

    static PackageInfo j(Context context, ILogger iLogger, N n10) {
        return i(context, 0, iLogger, n10);
    }

    static String k(PackageInfo packageInfo, N n10) {
        long longVersionCode;
        if (n10.d() < 28) {
            return l(packageInfo);
        }
        longVersionCode = packageInfo.getLongVersionCode();
        return Long.toString(longVersionCode);
    }

    private static String l(PackageInfo packageInfo) {
        return Integer.toString(packageInfo.versionCode);
    }

    static boolean m(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        try {
            Object systemService = context.getSystemService("activity");
            if (!(systemService instanceof ActivityManager) || (runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses()) == null) {
                return false;
            }
            int myPid = Process.myPid();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == myPid) {
                    return runningAppProcessInfo.importance == 100;
                }
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    static a n(Context context, ILogger iLogger, N n10) {
        String str;
        try {
            PackageInfo j10 = j(context, iLogger, n10);
            PackageManager packageManager = context.getPackageManager();
            if (j10 != null && packageManager != null) {
                str = j10.packageName;
                try {
                    String installerPackageName = packageManager.getInstallerPackageName(str);
                    return new a(installerPackageName == null, installerPackageName);
                } catch (IllegalArgumentException unused) {
                    iLogger.c(K1.DEBUG, "%s package isn't installed.", str);
                    return null;
                }
            }
        } catch (IllegalArgumentException unused2) {
            str = null;
        }
        return null;
    }

    static void o(PackageInfo packageInfo, N n10, C3441a c3441a) {
        c3441a.l(packageInfo.packageName);
        c3441a.o(packageInfo.versionName);
        c3441a.k(k(packageInfo, n10));
        if (n10.d() >= 16) {
            HashMap hashMap = new HashMap();
            String[] strArr = packageInfo.requestedPermissions;
            int[] iArr = packageInfo.requestedPermissionsFlags;
            if (strArr != null && strArr.length > 0 && iArr != null && iArr.length > 0) {
                for (int i10 = 0; i10 < strArr.length; i10++) {
                    String str = strArr[i10];
                    hashMap.put(str.substring(str.lastIndexOf(46) + 1), (iArr[i10] & 2) == 2 ? "granted" : "not_granted");
                }
            }
            c3441a.q(hashMap);
        }
    }
}
