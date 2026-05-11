package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import java.util.Objects;

/* loaded from: classes2.dex */
final class R5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ComponentName f25672a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Y5 f25673b;

    R5(Y5 y52, ComponentName componentName) {
        this.f25672a = componentName;
        Objects.requireNonNull(y52);
        this.f25673b = y52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f25673b.f25747c.K(this.f25672a);
    }
}
