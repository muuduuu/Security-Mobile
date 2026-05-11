package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.u3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC2791u3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f26370a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f26371b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f26372c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ long f26373d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ S3 f26374e;

    RunnableC2791u3(S3 s32, String str, String str2, String str3, long j10) {
        this.f26370a = str;
        this.f26371b = str2;
        this.f26372c = str3;
        this.f26373d = j10;
        Objects.requireNonNull(s32);
        this.f26374e = s32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.f26370a;
        if (str == null) {
            S3 s32 = this.f26374e;
            s32.r1().t0(this.f26371b, null);
        } else {
            C2730m5 c2730m5 = new C2730m5(this.f26372c, str, this.f26373d);
            S3 s33 = this.f26374e;
            s33.r1().t0(this.f26371b, c2730m5);
        }
    }
}
