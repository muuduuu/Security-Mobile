package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* loaded from: classes2.dex */
final class K4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2633a4 f25522a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f25523b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f25524c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C2642b5 f25525d;

    K4(C2642b5 c2642b5, C2633a4 c2633a4, long j10, boolean z10) {
        this.f25522a = c2633a4;
        this.f25523b = j10;
        this.f25524c = z10;
        Objects.requireNonNull(c2642b5);
        this.f25525d = c2642b5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2642b5 c2642b5 = this.f25525d;
        C2633a4 c2633a4 = this.f25522a;
        c2642b5.o(c2633a4);
        c2642b5.X(c2633a4, this.f25523b, false, this.f25524c);
    }
}
