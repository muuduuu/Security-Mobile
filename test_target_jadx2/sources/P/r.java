package p;

import android.content.Context;
import android.os.Build;

/* loaded from: classes.dex */
abstract class r {
    static boolean a(Context context, String str) {
        if (Build.VERSION.SDK_INT >= 30) {
            return false;
        }
        return b(context, str, w.f38195a);
    }

    private static boolean b(Context context, String str, int i10) {
        if (str == null) {
            return false;
        }
        for (String str2 : context.getResources().getStringArray(i10)) {
            if (str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean c(Context context, String str, int i10) {
        if (str == null) {
            return false;
        }
        for (String str2 : context.getResources().getStringArray(i10)) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean d(Context context, String str, int i10) {
        if (str == null) {
            return false;
        }
        for (String str2 : context.getResources().getStringArray(i10)) {
            if (str.equalsIgnoreCase(str2)) {
                return true;
            }
        }
        return false;
    }

    static boolean e(Context context, String str) {
        if (Build.VERSION.SDK_INT != 29) {
            return false;
        }
        return b(context, str, w.f38198d);
    }

    static boolean f(Context context, String str) {
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        return c(context, str, w.f38199e);
    }

    static boolean g(Context context, String str, String str2) {
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        return d(context, str, w.f38197c) || c(context, str2, w.f38196b);
    }

    static boolean h(Context context, String str) {
        if (Build.VERSION.SDK_INT != 29) {
            return false;
        }
        return !d(context, str, w.f38200f);
    }
}
