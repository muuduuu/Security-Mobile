package c3;

/* renamed from: c3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1721a {

    /* renamed from: a, reason: collision with root package name */
    private static InterfaceC1723c f19363a = C1722b.l();

    public static void A(Class cls, String str, Object obj, Object obj2) {
        if (f19363a.j(2)) {
            f19363a.e(r(cls), q(str, obj, obj2));
        }
    }

    public static void B(Class cls, String str, Object obj, Object obj2, Object obj3) {
        if (x(2)) {
            y(cls, q(str, obj, obj2, obj3));
        }
    }

    public static void C(Class cls, String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (f19363a.j(2)) {
            f19363a.e(r(cls), q(str, obj, obj2, obj3, obj4));
        }
    }

    public static void D(Class cls, String str, Object... objArr) {
        if (f19363a.j(2)) {
            f19363a.e(r(cls), q(str, objArr));
        }
    }

    public static void E(String str, String str2, Object... objArr) {
        if (f19363a.j(2)) {
            f19363a.e(str, q(str2, objArr));
        }
    }

    public static void F(Class cls, String str) {
        if (f19363a.j(5)) {
            f19363a.b(r(cls), str);
        }
    }

    public static void G(Class cls, String str, Throwable th) {
        if (f19363a.j(5)) {
            f19363a.c(r(cls), str, th);
        }
    }

    public static void H(Class cls, String str, Object... objArr) {
        if (f19363a.j(5)) {
            f19363a.b(r(cls), q(str, objArr));
        }
    }

    public static void I(Class cls, Throwable th, String str, Object... objArr) {
        if (x(5)) {
            G(cls, q(str, objArr), th);
        }
    }

    public static void J(String str, String str2) {
        if (f19363a.j(5)) {
            f19363a.b(str, str2);
        }
    }

    public static void K(String str, String str2, Throwable th) {
        if (f19363a.j(5)) {
            f19363a.c(str, str2, th);
        }
    }

    public static void L(String str, String str2, Object... objArr) {
        if (f19363a.j(5)) {
            f19363a.b(str, q(str2, objArr));
        }
    }

    public static void M(String str, Throwable th, String str2, Object... objArr) {
        if (f19363a.j(5)) {
            f19363a.c(str, q(str2, objArr), th);
        }
    }

    public static void N(Class cls, String str, Throwable th) {
        if (f19363a.j(6)) {
            f19363a.a(r(cls), str, th);
        }
    }

    public static void O(String str, String str2, Throwable th) {
        if (f19363a.j(6)) {
            f19363a.a(str, str2, th);
        }
    }

    public static void P(String str, String str2, Object... objArr) {
        if (f19363a.j(6)) {
            f19363a.f(str, q(str2, objArr));
        }
    }

    public static void a(Class cls, String str, Object obj) {
        if (f19363a.j(3)) {
            f19363a.h(r(cls), q(str, obj));
        }
    }

    public static void b(String str, String str2) {
        if (f19363a.j(3)) {
            f19363a.h(str, str2);
        }
    }

    public static void c(String str, String str2, Object obj) {
        if (f19363a.j(3)) {
            f19363a.h(str, q(str2, obj));
        }
    }

    public static void d(String str, String str2, Object obj, Object obj2) {
        if (f19363a.j(3)) {
            f19363a.h(str, q(str2, obj, obj2));
        }
    }

    public static void e(String str, String str2, Object obj, Object obj2, Object obj3) {
        if (f19363a.j(3)) {
            f19363a.h(str, q(str2, obj, obj2, obj3));
        }
    }

    public static void f(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4) {
        if (f19363a.j(3)) {
            f19363a.h(str, q(str2, obj, obj2, obj3, obj4));
        }
    }

    public static void g(String str, String str2, Throwable th) {
        if (f19363a.j(3)) {
            f19363a.i(str, str2, th);
        }
    }

    public static void h(String str, String str2, Object... objArr) {
        if (f19363a.j(3)) {
            b(str, q(str2, objArr));
        }
    }

    public static void i(Class cls, String str) {
        if (f19363a.j(6)) {
            f19363a.d(r(cls), str);
        }
    }

    public static void j(Class cls, String str, Throwable th) {
        if (f19363a.j(6)) {
            f19363a.g(r(cls), str, th);
        }
    }

    public static void k(Class cls, String str, Object... objArr) {
        if (f19363a.j(6)) {
            f19363a.d(r(cls), q(str, objArr));
        }
    }

    public static void l(Class cls, Throwable th, String str, Object... objArr) {
        if (f19363a.j(6)) {
            f19363a.g(r(cls), q(str, objArr), th);
        }
    }

    public static void m(String str, String str2) {
        if (f19363a.j(6)) {
            f19363a.d(str, str2);
        }
    }

    public static void n(String str, String str2, Throwable th) {
        if (f19363a.j(6)) {
            f19363a.g(str, str2, th);
        }
    }

    public static void o(String str, String str2, Object... objArr) {
        if (f19363a.j(6)) {
            f19363a.d(str, q(str2, objArr));
        }
    }

    public static void p(String str, Throwable th, String str2, Object... objArr) {
        if (f19363a.j(6)) {
            f19363a.g(str, q(str2, objArr), th);
        }
    }

    private static String q(String str, Object... objArr) {
        return String.format(null, str, objArr);
    }

    private static String r(Class cls) {
        return cls.getSimpleName();
    }

    public static void s(String str, String str2) {
        if (f19363a.j(4)) {
            f19363a.k(str, str2);
        }
    }

    public static void t(String str, String str2, Object obj, Object obj2) {
        if (f19363a.j(4)) {
            f19363a.k(str, q(str2, obj, obj2));
        }
    }

    public static void u(String str, String str2, Object obj, Object obj2, Object obj3) {
        if (f19363a.j(4)) {
            f19363a.k(str, q(str2, obj, obj2, obj3));
        }
    }

    public static void v(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4) {
        if (f19363a.j(4)) {
            f19363a.k(str, q(str2, obj, obj2, obj3, obj4));
        }
    }

    public static void w(String str, String str2, Object... objArr) {
        if (f19363a.j(4)) {
            f19363a.k(str, q(str2, objArr));
        }
    }

    public static boolean x(int i10) {
        return f19363a.j(i10);
    }

    public static void y(Class cls, String str) {
        if (f19363a.j(2)) {
            f19363a.e(r(cls), str);
        }
    }

    public static void z(Class cls, String str, Object obj) {
        if (f19363a.j(2)) {
            f19363a.e(r(cls), q(str, obj));
        }
    }
}
