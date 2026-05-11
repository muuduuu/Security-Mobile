package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.w3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC2807w3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2692i f26436a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ S3 f26437b;

    RunnableC2807w3(S3 s32, C2692i c2692i) {
        this.f26436a = c2692i;
        Objects.requireNonNull(s32);
        this.f26437b = s32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        S3 s32 = this.f26437b;
        s32.r1().E();
        C2692i c2692i = this.f26436a;
        if (c2692i.f26104c.j() == null) {
            s32.r1().l0(c2692i);
        } else {
            s32.r1().j0(c2692i);
        }
    }
}
