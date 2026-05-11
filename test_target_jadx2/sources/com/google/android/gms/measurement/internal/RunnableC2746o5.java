package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.o5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC2746o5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2730m5 f26227a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2730m5 f26228b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f26229c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f26230d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C2793u5 f26231e;

    RunnableC2746o5(C2793u5 c2793u5, C2730m5 c2730m5, C2730m5 c2730m52, long j10, boolean z10) {
        this.f26227a = c2730m5;
        this.f26228b = c2730m52;
        this.f26229c = j10;
        this.f26230d = z10;
        Objects.requireNonNull(c2793u5);
        this.f26231e = c2793u5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f26231e.B(this.f26227a, this.f26228b, this.f26229c, this.f26230d, null);
    }
}
