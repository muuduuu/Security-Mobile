package q1;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: q1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3901a {

    /* renamed from: a, reason: collision with root package name */
    private static long f38734a;

    /* renamed from: b, reason: collision with root package name */
    private static Method f38735b;

    /* renamed from: c, reason: collision with root package name */
    private static Method f38736c;

    /* renamed from: d, reason: collision with root package name */
    private static Method f38737d;

    /* renamed from: e, reason: collision with root package name */
    private static Method f38738e;

    public static void a(String str, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC3903c.a(l(str), i10);
        } else {
            b(l(str), i10);
        }
    }

    private static void b(String str, int i10) {
        try {
            if (f38736c == null) {
                f38736c = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
            }
            f38736c.invoke(null, Long.valueOf(f38734a), str, Integer.valueOf(i10));
        } catch (Exception e10) {
            g("asyncTraceBegin", e10);
        }
    }

    public static void c(String str) {
        AbstractC3902b.a(l(str));
    }

    public static void d(String str, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC3903c.b(l(str), i10);
        } else {
            e(l(str), i10);
        }
    }

    private static void e(String str, int i10) {
        try {
            if (f38737d == null) {
                f38737d = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
            }
            f38737d.invoke(null, Long.valueOf(f38734a), str, Integer.valueOf(i10));
        } catch (Exception e10) {
            g("asyncTraceEnd", e10);
        }
    }

    public static void f() {
        AbstractC3902b.b();
    }

    private static void g(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static boolean h() {
        return Build.VERSION.SDK_INT >= 29 ? AbstractC3903c.c() : i();
    }

    private static boolean i() {
        try {
            if (f38735b == null) {
                f38734a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f38735b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f38735b.invoke(null, Long.valueOf(f38734a))).booleanValue();
        } catch (Exception e10) {
            g("isTagEnabled", e10);
            return false;
        }
    }

    public static void j(String str, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC3903c.d(l(str), i10);
        } else {
            k(l(str), i10);
        }
    }

    private static void k(String str, int i10) {
        try {
            if (f38738e == null) {
                f38738e = Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
            }
            f38738e.invoke(null, Long.valueOf(f38734a), str, Integer.valueOf(i10));
        } catch (Exception e10) {
            g("traceCounter", e10);
        }
    }

    private static String l(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }
}
