package com.google.android.gms.measurement.internal;

import V6.AbstractC1287s;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.y5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC2825y5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ n7 f26473a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f26474b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ h7 f26475c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C2667e6 f26476d;

    RunnableC2825y5(C2667e6 c2667e6, n7 n7Var, boolean z10, h7 h7Var) {
        this.f26473a = n7Var;
        this.f26474b = z10;
        this.f26475c = h7Var;
        Objects.requireNonNull(c2667e6);
        this.f26476d = c2667e6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2667e6 c2667e6 = this.f26476d;
        InterfaceC2703j2 N10 = c2667e6.N();
        if (N10 == null) {
            c2667e6.f25694a.a().o().a("Discarding data. Failed to set user property");
            return;
        }
        n7 n7Var = this.f26473a;
        AbstractC1287s.m(n7Var);
        c2667e6.b0(N10, this.f26474b ? null : this.f26475c, n7Var);
        c2667e6.J();
    }
}
