package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* loaded from: classes2.dex */
final class I3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h7 f25493a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ n7 f25494b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ S3 f25495c;

    I3(S3 s32, h7 h7Var, n7 n7Var) {
        this.f25493a = h7Var;
        this.f25494b = n7Var;
        Objects.requireNonNull(s32);
        this.f25495c = s32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        S3 s32 = this.f25495c;
        s32.r1().E();
        h7 h7Var = this.f25493a;
        if (h7Var.j() != null) {
            s32.r1().c0(h7Var, this.f25494b);
        } else {
            n7 n7Var = this.f25494b;
            s32.r1().d0(h7Var.f26096b, n7Var);
        }
    }
}
