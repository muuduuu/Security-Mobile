package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
abstract class M6 extends F6 {

    /* renamed from: c, reason: collision with root package name */
    private boolean f25564c;

    M6(b7 b7Var) {
        super(b7Var);
        this.f25405b.e0();
    }

    final boolean i() {
        return this.f25564c;
    }

    protected final void j() {
        if (!i()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void k() {
        if (this.f25564c) {
            throw new IllegalStateException("Can't initialize twice");
        }
        l();
        this.f25405b.f0();
        this.f25564c = true;
    }

    protected abstract boolean l();
}
