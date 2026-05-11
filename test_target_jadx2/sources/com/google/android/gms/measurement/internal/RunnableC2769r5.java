package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.r5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC2769r5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2730m5 f26310a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f26311b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C2793u5 f26312c;

    RunnableC2769r5(C2793u5 c2793u5, C2730m5 c2730m5, long j10) {
        this.f26310a = c2730m5;
        this.f26311b = j10;
        Objects.requireNonNull(c2793u5);
        this.f26312c = c2793u5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2793u5 c2793u5 = this.f26312c;
        c2793u5.C(this.f26310a, false, this.f26311b);
        c2793u5.f26379e = null;
        c2793u5.f25694a.J().u(null);
    }
}
