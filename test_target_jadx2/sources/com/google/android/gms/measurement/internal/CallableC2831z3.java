package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.z3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class CallableC2831z3 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f26489a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f26490b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f26491c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ S3 f26492d;

    CallableC2831z3(S3 s32, String str, String str2, String str3) {
        this.f26489a = str;
        this.f26490b = str2;
        this.f26491c = str3;
        Objects.requireNonNull(s32);
        this.f26492d = s32;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        S3 s32 = this.f26492d;
        s32.r1().E();
        return s32.r1().F0().H0(this.f26489a, this.f26490b, this.f26491c);
    }
}
