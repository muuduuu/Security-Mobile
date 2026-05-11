package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.v3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC2799v3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2692i f26406a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ n7 f26407b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ S3 f26408c;

    RunnableC2799v3(S3 s32, C2692i c2692i, n7 n7Var) {
        this.f26406a = c2692i;
        this.f26407b = n7Var;
        Objects.requireNonNull(s32);
        this.f26408c = s32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        S3 s32 = this.f26408c;
        s32.r1().E();
        C2692i c2692i = this.f26406a;
        if (c2692i.f26104c.j() == null) {
            s32.r1().m0(c2692i, this.f26407b);
        } else {
            s32.r1().k0(c2692i, this.f26407b);
        }
    }
}
