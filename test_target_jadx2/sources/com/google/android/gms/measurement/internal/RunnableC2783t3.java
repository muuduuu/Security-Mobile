package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.t3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC2783t3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ n7 f26354a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ S3 f26355b;

    RunnableC2783t3(S3 s32, n7 n7Var) {
        this.f26354a = n7Var;
        Objects.requireNonNull(s32);
        this.f26355b = s32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        S3 s32 = this.f26355b;
        s32.r1().E();
        s32.r1().i0(this.f26354a);
    }
}
