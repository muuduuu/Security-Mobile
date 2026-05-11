package com.webengage.sdk.android;

import android.util.Log;

/* loaded from: classes2.dex */
public class Logger {
    public static final int DEBUG = 1;
    public static final int NORMAL = 0;
    public static final int QUIET = -1;
    public static final int SILENT = -2;
    public static final int VERBOSE = 2;
    private static int sLogLevel = -2;

    public static void d(String str, String str2) {
        if (sLogLevel < 1 || str2 == null) {
            return;
        }
        Log.d(str, str2);
    }

    public static void e(String str, String str2) {
        if (sLogLevel < -2 || str2 == null) {
            return;
        }
        Log.e(str, str2);
    }

    public static void i(String str, String str2) {
        if (sLogLevel >= 0) {
            Log.i(str, str2);
        }
    }

    public static void setLogLevel(int i10) {
        sLogLevel = i10;
    }

    public static void v(String str, String str2) {
        if (sLogLevel < 2 || str2 == null) {
            return;
        }
        Log.v(str, str2);
    }

    public static void w(String str, String str2) {
        if (sLogLevel < -1 || str2 == null) {
            return;
        }
        Log.w(str, str2);
    }

    public static void e(String str, String str2, Throwable th) {
        if (sLogLevel < -2 || str2 == null || th == null) {
            return;
        }
        Log.e(str, str2, th);
    }

    public static void w(String str, String str2, Throwable th) {
        if (sLogLevel < -1 || str2 == null || th == null) {
            return;
        }
        Log.w(str, str2, th);
    }
}
