package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
final class A3 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f25293a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f25294b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f25295c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ S3 f25296d;

    A3(S3 s32, String str, String str2, String str3) {
        this.f25293a = str;
        this.f25294b = str2;
        this.f25295c = str3;
        Objects.requireNonNull(s32);
        this.f25296d = s32;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        S3 s32 = this.f25296d;
        s32.r1().E();
        return s32.r1().F0().H0(this.f25293a, this.f25294b, this.f25295c);
    }
}
