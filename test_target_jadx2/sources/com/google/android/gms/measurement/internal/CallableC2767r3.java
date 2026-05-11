package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.r3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class CallableC2767r3 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f26307a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ S3 f26308b;

    CallableC2767r3(S3 s32, String str) {
        this.f26307a = str;
        Objects.requireNonNull(s32);
        this.f26308b = s32;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        S3 s32 = this.f26308b;
        s32.r1().E();
        return s32.r1().F0().C0(this.f26307a);
    }
}
