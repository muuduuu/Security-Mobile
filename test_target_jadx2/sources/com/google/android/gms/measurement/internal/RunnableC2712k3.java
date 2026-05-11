package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.k3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC2712k3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2689h4 f26142a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2760q3 f26143b;

    RunnableC2712k3(C2760q3 c2760q3, C2689h4 c2689h4) {
        this.f26142a = c2689h4;
        Objects.requireNonNull(c2760q3);
        this.f26143b = c2760q3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2760q3 c2760q3 = this.f26143b;
        C2689h4 c2689h4 = this.f26142a;
        c2760q3.p(c2689h4);
        c2760q3.v(c2689h4.f26089d);
    }
}
