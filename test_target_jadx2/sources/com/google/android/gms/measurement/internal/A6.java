package com.google.android.gms.measurement.internal;

import V6.AbstractC1287s;

/* loaded from: classes2.dex */
final class A6 {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.common.util.f f25305a;

    /* renamed from: b, reason: collision with root package name */
    private long f25306b;

    public A6(com.google.android.gms.common.util.f fVar) {
        AbstractC1287s.m(fVar);
        this.f25305a = fVar;
    }

    public final void a() {
        this.f25306b = this.f25305a.c();
    }

    public final void b() {
        this.f25306b = 0L;
    }

    public final boolean c(long j10) {
        return this.f25306b == 0 || this.f25305a.c() - this.f25306b >= 3600000;
    }
}
