package com.google.android.gms.measurement.internal;

import V6.AbstractC1287s;
import java.util.Objects;

/* loaded from: classes2.dex */
final class L5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ n7 f25539a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f25540b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ I f25541c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C2667e6 f25542d;

    L5(C2667e6 c2667e6, boolean z10, n7 n7Var, boolean z11, I i10, String str) {
        this.f25539a = n7Var;
        this.f25540b = z11;
        this.f25541c = i10;
        Objects.requireNonNull(c2667e6);
        this.f25542d = c2667e6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2667e6 c2667e6 = this.f25542d;
        InterfaceC2703j2 N10 = c2667e6.N();
        if (N10 == null) {
            c2667e6.f25694a.a().o().a("Discarding data. Failed to send event to service");
            return;
        }
        n7 n7Var = this.f25539a;
        AbstractC1287s.m(n7Var);
        c2667e6.b0(N10, this.f25540b ? null : this.f25541c, n7Var);
        c2667e6.J();
    }
}
