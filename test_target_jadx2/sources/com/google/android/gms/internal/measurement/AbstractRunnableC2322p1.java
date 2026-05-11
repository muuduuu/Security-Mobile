package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.p1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractRunnableC2322p1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final long f24612a;

    /* renamed from: b, reason: collision with root package name */
    final long f24613b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f24614c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C2411z1 f24615d;

    AbstractRunnableC2322p1(C2411z1 c2411z1, boolean z10) {
        Objects.requireNonNull(c2411z1);
        this.f24615d = c2411z1;
        this.f24612a = c2411z1.f24707b.a();
        this.f24613b = c2411z1.f24707b.c();
        this.f24614c = z10;
    }

    abstract void a();

    protected void b() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f24615d.m()) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e10) {
            this.f24615d.k(e10, false, this.f24614c);
            b();
        }
    }
}
