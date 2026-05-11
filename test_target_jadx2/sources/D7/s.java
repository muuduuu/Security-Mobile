package D7;

import java.util.concurrent.ExecutionException;

/* loaded from: classes2.dex */
final class s implements r {

    /* renamed from: a, reason: collision with root package name */
    private final Object f1348a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final int f1349b;

    /* renamed from: c, reason: collision with root package name */
    private final N f1350c;

    /* renamed from: d, reason: collision with root package name */
    private int f1351d;

    /* renamed from: e, reason: collision with root package name */
    private int f1352e;

    /* renamed from: f, reason: collision with root package name */
    private int f1353f;

    /* renamed from: g, reason: collision with root package name */
    private Exception f1354g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f1355h;

    public s(int i10, N n10) {
        this.f1349b = i10;
        this.f1350c = n10;
    }

    private final void c() {
        if (this.f1351d + this.f1352e + this.f1353f == this.f1349b) {
            if (this.f1354g == null) {
                if (this.f1355h) {
                    this.f1350c.r();
                    return;
                } else {
                    this.f1350c.q(null);
                    return;
                }
            }
            this.f1350c.p(new ExecutionException(this.f1352e + " out of " + this.f1349b + " underlying tasks failed", this.f1354g));
        }
    }

    @Override // D7.InterfaceC0781e
    public final void a() {
        synchronized (this.f1348a) {
            this.f1353f++;
            this.f1355h = true;
            c();
        }
    }

    @Override // D7.InterfaceC0782f
    public final void b(Exception exc) {
        synchronized (this.f1348a) {
            this.f1352e++;
            this.f1354g = exc;
            c();
        }
    }

    @Override // D7.InterfaceC0783g
    public final void onSuccess(Object obj) {
        synchronized (this.f1348a) {
            this.f1351d++;
            c();
        }
    }
}
