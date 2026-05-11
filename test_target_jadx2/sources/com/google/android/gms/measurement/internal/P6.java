package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* loaded from: classes2.dex */
final class P6 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ c7 f25624a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ b7 f25625b;

    P6(b7 b7Var, c7 c7Var) {
        this.f25624a = c7Var;
        Objects.requireNonNull(b7Var);
        this.f25625b = b7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b7 b7Var = this.f25625b;
        b7Var.u0(this.f25624a);
        b7Var.A0();
    }
}
