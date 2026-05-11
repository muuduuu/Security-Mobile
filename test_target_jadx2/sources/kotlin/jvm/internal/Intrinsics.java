package kotlin.jvm.internal;

import java.util.Arrays;
import lc.C3619A;
import lc.f;

/* loaded from: classes3.dex */
public class Intrinsics {

    public static class a {
    }

    public static boolean a(Float f10, float f11) {
        return f10 != null && f10.floatValue() == f11;
    }

    public static boolean b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void c(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((IllegalStateException) k(new IllegalStateException(str + " must not be null")));
    }

    public static void checkNotNullExpressionValue(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((NullPointerException) k(new NullPointerException(str + " must not be null")));
    }

    public static void checkNotNullParameter(Object obj, String str) {
        if (obj == null) {
            r(str);
        }
    }

    public static void d(Object obj) {
        if (obj == null) {
            n();
        }
    }

    public static void e(Object obj, String str) {
        if (obj == null) {
            o(str);
        }
    }

    public static void f(Object obj, String str) {
        if (obj == null) {
            q(str);
        }
    }

    public static int g(int i10, int i11) {
        if (i10 < i11) {
            return -1;
        }
        return i10 == i11 ? 0 : 1;
    }

    public static int h(long j10, long j11) {
        if (j10 < j11) {
            return -1;
        }
        return j10 == j11 ? 0 : 1;
    }

    private static String i(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = Intrinsics.class.getName();
        int i10 = 0;
        while (!stackTrace[i10].getClassName().equals(name)) {
            i10++;
        }
        while (stackTrace[i10].getClassName().equals(name)) {
            i10++;
        }
        StackTraceElement stackTraceElement = stackTrace[i10];
        return "Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str;
    }

    public static void j(int i10, String str) {
        s();
    }

    private static Throwable k(Throwable th) {
        return l(th, Intrinsics.class.getName());
    }

    static Throwable l(Throwable th, String str) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        int i10 = -1;
        for (int i11 = 0; i11 < length; i11++) {
            if (str.equals(stackTrace[i11].getClassName())) {
                i10 = i11;
            }
        }
        th.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i10 + 1, length));
        return th;
    }

    public static String m(String str, Object obj) {
        return str + obj;
    }

    public static void n() {
        throw ((NullPointerException) k(new NullPointerException()));
    }

    public static void o(String str) {
        throw ((NullPointerException) k(new NullPointerException(str)));
    }

    public static void p() {
        throw ((f) k(new f()));
    }

    private static void q(String str) {
        throw ((IllegalArgumentException) k(new IllegalArgumentException(i(str))));
    }

    private static void r(String str) {
        throw ((NullPointerException) k(new NullPointerException(i(str))));
    }

    public static void s() {
        t("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static void t(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static void u(String str) {
        throw ((C3619A) k(new C3619A(str)));
    }

    public static void v(String str) {
        u("lateinit property " + str + " has not been initialized");
    }
}
