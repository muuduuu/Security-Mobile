package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* loaded from: classes2.dex */
final class J2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f25502a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ K2 f25503b;

    J2(K2 k22, boolean z10) {
        this.f25502a = z10;
        Objects.requireNonNull(k22);
        this.f25503b = k22;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f25503b.c().s0(this.f25502a);
    }
}
