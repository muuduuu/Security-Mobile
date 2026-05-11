package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.y3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class CallableC2823y3 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f26467a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f26468b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f26469c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ S3 f26470d;

    CallableC2823y3(S3 s32, String str, String str2, String str3) {
        this.f26467a = str;
        this.f26468b = str2;
        this.f26469c = str3;
        Objects.requireNonNull(s32);
        this.f26470d = s32;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        S3 s32 = this.f26470d;
        s32.r1().E();
        return s32.r1().F0().D0(this.f26467a, this.f26468b, this.f26469c);
    }
}
