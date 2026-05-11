package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* loaded from: classes2.dex */
final class B implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f25309a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f25310b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ E0 f25311c;

    B(E0 e02, String str, long j10) {
        this.f25309a = str;
        this.f25310b = j10;
        Objects.requireNonNull(e02);
        this.f25311c = e02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f25311c.m(this.f25309a, this.f25310b);
    }
}
