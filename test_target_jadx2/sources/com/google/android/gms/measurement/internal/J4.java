package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* loaded from: classes2.dex */
final class J4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2633a4 f25507a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f25508b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f25509c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C2642b5 f25510d;

    J4(C2642b5 c2642b5, C2633a4 c2633a4, long j10, boolean z10) {
        this.f25507a = c2633a4;
        this.f25508b = j10;
        this.f25509c = z10;
        Objects.requireNonNull(c2642b5);
        this.f25510d = c2642b5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2642b5 c2642b5 = this.f25510d;
        C2633a4 c2633a4 = this.f25507a;
        c2642b5.o(c2633a4);
        c2642b5.X(c2633a4, this.f25508b, true, this.f25509c);
    }
}
