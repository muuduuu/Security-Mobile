package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC2628a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f25761a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f25762b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ E0 f25763c;

    RunnableC2628a(E0 e02, String str, long j10) {
        this.f25761a = str;
        this.f25762b = j10;
        Objects.requireNonNull(e02);
        this.f25763c = e02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f25763c.l(this.f25761a, this.f25762b);
    }
}
