package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.s3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC2775s3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ n7 f26328a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ S3 f26329b;

    RunnableC2775s3(S3 s32, n7 n7Var) {
        this.f26328a = n7Var;
        Objects.requireNonNull(s32);
        this.f26329b = s32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        S3 s32 = this.f26329b;
        s32.r1().E();
        s32.r1().h0(this.f26328a);
    }
}
