package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* loaded from: classes2.dex */
final class F3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ I f25398a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ n7 f25399b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ S3 f25400c;

    F3(S3 s32, I i10, n7 n7Var) {
        this.f25398a = i10;
        this.f25399b = n7Var;
        Objects.requireNonNull(s32);
        this.f25400c = s32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        I i10 = this.f25398a;
        n7 n7Var = this.f25399b;
        S3 s32 = this.f25400c;
        s32.v1(s32.w1(i10, n7Var), n7Var);
    }
}
