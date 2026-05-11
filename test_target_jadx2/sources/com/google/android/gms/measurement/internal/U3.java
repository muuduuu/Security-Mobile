package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
abstract class U3 extends T3 {

    /* renamed from: b, reason: collision with root package name */
    private boolean f25703b;

    U3(C2760q3 c2760q3) {
        super(c2760q3);
        this.f25694a.k();
    }

    protected abstract boolean i();

    protected void j() {
    }

    final boolean k() {
        return this.f25703b;
    }

    protected final void l() {
        if (!k()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void m() {
        if (this.f25703b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (i()) {
            return;
        }
        this.f25694a.l();
        this.f25703b = true;
    }

    public final void n() {
        if (this.f25703b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        j();
        this.f25694a.l();
        this.f25703b = true;
    }
}
