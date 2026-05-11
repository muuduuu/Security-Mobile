package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* loaded from: classes2.dex */
final class G3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ I f25414a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f25415b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ S3 f25416c;

    G3(S3 s32, I i10, String str) {
        this.f25414a = i10;
        this.f25415b = str;
        Objects.requireNonNull(s32);
        this.f25416c = s32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        S3 s32 = this.f25416c;
        s32.r1().E();
        s32.r1().i(this.f25414a, this.f25415b);
    }
}
