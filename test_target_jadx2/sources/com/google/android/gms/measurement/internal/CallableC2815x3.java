package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.x3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class CallableC2815x3 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f26450a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f26451b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f26452c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ S3 f26453d;

    CallableC2815x3(S3 s32, String str, String str2, String str3) {
        this.f26450a = str;
        this.f26451b = str2;
        this.f26452c = str3;
        Objects.requireNonNull(s32);
        this.f26453d = s32;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        S3 s32 = this.f26453d;
        s32.r1().E();
        return s32.r1().F0().D0(this.f26450a, this.f26451b, this.f26452c);
    }
}
