package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.h2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC2687h2 extends G1 {

    /* renamed from: b, reason: collision with root package name */
    private boolean f26081b;

    AbstractC2687h2(C2760q3 c2760q3) {
        super(c2760q3);
        this.f25694a.k();
    }

    final boolean i() {
        return this.f26081b;
    }

    protected final void j() {
        if (!i()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void k() {
        if (this.f26081b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (m()) {
            return;
        }
        this.f25694a.l();
        this.f26081b = true;
    }

    public final void l() {
        if (this.f26081b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        n();
        this.f25694a.l();
        this.f26081b = true;
    }

    protected abstract boolean m();

    protected void n() {
    }
}
