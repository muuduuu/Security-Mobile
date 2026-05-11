package A;

import android.os.Build;
import android.util.Log;

/* renamed from: A.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0700h0 {

    /* renamed from: a, reason: collision with root package name */
    private static int f185a = 3;

    public static void a(String str, String str2) {
        String k10 = k(str);
        if (g(k10, 3)) {
            Log.d(k10, str2);
        }
    }

    public static void b(String str, String str2, Throwable th) {
        String k10 = k(str);
        if (g(k10, 3)) {
            Log.d(k10, str2, th);
        }
    }

    public static void c(String str, String str2) {
        String k10 = k(str);
        if (g(k10, 6)) {
            Log.e(k10, str2);
        }
    }

    public static void d(String str, String str2, Throwable th) {
        String k10 = k(str);
        if (g(k10, 6)) {
            Log.e(k10, str2, th);
        }
    }

    public static void e(String str, String str2) {
        String k10 = k(str);
        if (g(k10, 4)) {
            Log.i(k10, str2);
        }
    }

    public static boolean f(String str) {
        return g(k(str), 3);
    }

    private static boolean g(String str, int i10) {
        return f185a <= i10 || Log.isLoggable(str, i10);
    }

    public static boolean h(String str) {
        return g(k(str), 2);
    }

    static void i() {
        f185a = 3;
    }

    static void j(int i10) {
        f185a = i10;
    }

    private static String k(String str) {
        return (Build.VERSION.SDK_INT > 25 || 23 >= str.length()) ? str : str.substring(0, 23);
    }

    public static void l(String str, String str2) {
        String k10 = k(str);
        if (g(k10, 5)) {
            Log.w(k10, str2);
        }
    }

    public static void m(String str, String str2, Throwable th) {
        String k10 = k(str);
        if (g(k10, 5)) {
            Log.w(k10, str2, th);
        }
    }
}
