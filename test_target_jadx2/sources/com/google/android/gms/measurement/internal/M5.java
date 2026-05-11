package com.google.android.gms.measurement.internal;

import V6.AbstractC1287s;
import java.util.Objects;

/* loaded from: classes2.dex */
final class M5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ n7 f25560a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f25561b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C2692i f25562c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C2667e6 f25563d;

    M5(C2667e6 c2667e6, boolean z10, n7 n7Var, boolean z11, C2692i c2692i, C2692i c2692i2) {
        this.f25560a = n7Var;
        this.f25561b = z11;
        this.f25562c = c2692i;
        Objects.requireNonNull(c2667e6);
        this.f25563d = c2667e6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2667e6 c2667e6 = this.f25563d;
        InterfaceC2703j2 N10 = c2667e6.N();
        if (N10 == null) {
            c2667e6.f25694a.a().o().a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        n7 n7Var = this.f25560a;
        AbstractC1287s.m(n7Var);
        c2667e6.b0(N10, this.f25561b ? null : this.f25562c, n7Var);
        c2667e6.J();
    }
}
