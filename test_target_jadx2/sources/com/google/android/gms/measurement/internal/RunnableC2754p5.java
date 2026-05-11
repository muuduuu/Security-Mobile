package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.p5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC2754p5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2793u5 f26242a;

    RunnableC2754p5(C2793u5 c2793u5) {
        Objects.requireNonNull(c2793u5);
        this.f26242a = c2793u5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2793u5 c2793u5 = this.f26242a;
        c2793u5.f26379e = c2793u5.D();
    }
}
