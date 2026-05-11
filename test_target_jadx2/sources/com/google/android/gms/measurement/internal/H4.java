package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* loaded from: classes2.dex */
final class H4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Boolean f25436a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2642b5 f25437b;

    H4(C2642b5 c2642b5, Boolean bool) {
        this.f25436a = bool;
        Objects.requireNonNull(c2642b5);
        this.f25437b = c2642b5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f25437b.W(this.f25436a, true);
    }
}
