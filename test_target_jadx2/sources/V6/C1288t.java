package V6;

/* renamed from: V6.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1288t {

    /* renamed from: b, reason: collision with root package name */
    private static C1288t f11011b;

    /* renamed from: c, reason: collision with root package name */
    private static final C1289u f11012c = new C1289u(0, false, false, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    private C1289u f11013a;

    private C1288t() {
    }

    public static synchronized C1288t b() {
        C1288t c1288t;
        synchronized (C1288t.class) {
            try {
                if (f11011b == null) {
                    f11011b = new C1288t();
                }
                c1288t = f11011b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1288t;
    }

    public C1289u a() {
        return this.f11013a;
    }

    public final synchronized void c(C1289u c1289u) {
        if (c1289u == null) {
            this.f11013a = f11012c;
            return;
        }
        C1289u c1289u2 = this.f11013a;
        if (c1289u2 == null || c1289u2.y0() < c1289u.y0()) {
            this.f11013a = c1289u;
        }
    }
}
