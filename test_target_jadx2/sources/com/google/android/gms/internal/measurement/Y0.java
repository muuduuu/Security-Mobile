package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* loaded from: classes2.dex */
final class Y0 extends A0 {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Runnable f24417f;

    Y0(Z0 z02, Runnable runnable) {
        this.f24417f = runnable;
        Objects.requireNonNull(z02);
    }

    @Override // com.google.android.gms.internal.measurement.B0
    public final void g() {
        this.f24417f.run();
    }
}
