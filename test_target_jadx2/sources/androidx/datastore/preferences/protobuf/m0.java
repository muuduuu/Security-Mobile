package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
abstract class m0 {

    /* renamed from: a, reason: collision with root package name */
    private static volatile int f16419a = 100;

    m0() {
    }

    private final void l(Object obj, e0 e0Var, int i10) {
        while (e0Var.z() != Integer.MAX_VALUE && m(obj, e0Var, i10)) {
        }
    }

    abstract void a(Object obj, int i10, int i11);

    abstract void b(Object obj, int i10, long j10);

    abstract void c(Object obj, int i10, Object obj2);

    abstract void d(Object obj, int i10, AbstractC1540g abstractC1540g);

    abstract void e(Object obj, int i10, long j10);

    abstract Object f(Object obj);

    abstract Object g(Object obj);

    abstract int h(Object obj);

    abstract int i(Object obj);

    abstract void j(Object obj);

    abstract Object k(Object obj, Object obj2);

    final boolean m(Object obj, e0 e0Var, int i10) {
        int a10 = e0Var.a();
        int a11 = r0.a(a10);
        int b10 = r0.b(a10);
        if (b10 == 0) {
            e(obj, a11, e0Var.L());
            return true;
        }
        if (b10 == 1) {
            b(obj, a11, e0Var.d());
            return true;
        }
        if (b10 == 2) {
            d(obj, a11, e0Var.C());
            return true;
        }
        if (b10 != 3) {
            if (b10 == 4) {
                return false;
            }
            if (b10 != 5) {
                throw C1558z.e();
            }
            a(obj, a11, e0Var.h());
            return true;
        }
        Object n10 = n();
        int c10 = r0.c(a11, 4);
        int i11 = i10 + 1;
        if (i11 >= f16419a) {
            throw C1558z.i();
        }
        l(n10, e0Var, i11);
        if (c10 != e0Var.a()) {
            throw C1558z.b();
        }
        c(obj, a11, r(n10));
        return true;
    }

    abstract Object n();

    abstract void o(Object obj, Object obj2);

    abstract void p(Object obj, Object obj2);

    abstract boolean q(e0 e0Var);

    abstract Object r(Object obj);

    abstract void s(Object obj, s0 s0Var);

    abstract void t(Object obj, s0 s0Var);
}
