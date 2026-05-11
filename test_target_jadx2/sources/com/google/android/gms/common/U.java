package com.google.android.gms.common;

import android.content.Context;
import e7.BinderC3090b;

/* loaded from: classes2.dex */
final class U {

    /* renamed from: a, reason: collision with root package name */
    private final String f23324a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f23325b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f23326c;

    /* synthetic */ U(String str, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, byte[] bArr) {
        this.f23324a = str;
        this.f23325b = z10;
        this.f23326c = z13;
    }

    final boolean a() {
        return this.f23326c;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [android.os.IBinder, e7.a] */
    final M b(Context context) {
        return new M(this.f23324a, this.f23325b, false, BinderC3090b.m1(context), false, true, false);
    }
}
