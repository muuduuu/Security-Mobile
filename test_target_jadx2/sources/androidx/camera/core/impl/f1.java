package androidx.camera.core.impl;

import A.u0;

/* loaded from: classes.dex */
public final class f1 implements A.u0 {

    /* renamed from: d, reason: collision with root package name */
    private final long f14577d;

    /* renamed from: e, reason: collision with root package name */
    private final A.u0 f14578e;

    public f1(long j10, A.u0 u0Var) {
        y0.f.b(j10 >= 0, "Timeout must be non-negative.");
        this.f14577d = j10;
        this.f14578e = u0Var;
    }

    @Override // A.u0
    public long c() {
        return this.f14577d;
    }

    @Override // A.u0
    public u0.c f(u0.b bVar) {
        u0.c f10 = this.f14578e.f(bVar);
        return (c() <= 0 || bVar.e() < c() - f10.b()) ? f10 : u0.c.f238d;
    }
}
