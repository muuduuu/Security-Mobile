package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* loaded from: classes2.dex */
final class C3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ n7 f25341a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ S3 f25342b;

    C3(S3 s32, n7 n7Var) {
        this.f25341a = n7Var;
        Objects.requireNonNull(s32);
        this.f25342b = s32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        S3 s32 = this.f25342b;
        s32.r1().E();
        s32.r1().b0(this.f25341a);
    }
}
