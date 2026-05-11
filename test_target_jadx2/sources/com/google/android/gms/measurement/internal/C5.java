package com.google.android.gms.measurement.internal;

import V6.AbstractC1287s;
import android.os.RemoteException;
import java.util.Objects;

/* loaded from: classes2.dex */
final class C5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ n7 f25344a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2667e6 f25345b;

    C5(C2667e6 c2667e6, n7 n7Var, boolean z10) {
        this.f25344a = n7Var;
        Objects.requireNonNull(c2667e6);
        this.f25345b = c2667e6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2667e6 c2667e6 = this.f25345b;
        InterfaceC2703j2 N10 = c2667e6.N();
        if (N10 == null) {
            c2667e6.f25694a.a().o().a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            n7 n7Var = this.f25344a;
            AbstractC1287s.m(n7Var);
            C2760q3 c2760q3 = c2667e6.f25694a;
            C2724m w10 = c2760q3.w();
            C2663e2 c2663e2 = AbstractC2671f2.f25995c1;
            if (w10.H(null, c2663e2)) {
                c2667e6.b0(N10, null, n7Var);
            }
            N10.E0(n7Var);
            c2667e6.f25694a.E().v();
            c2760q3.w().H(null, c2663e2);
            c2667e6.b0(N10, null, n7Var);
            c2667e6.J();
        } catch (RemoteException e10) {
            this.f25345b.f25694a.a().o().b("Failed to send app launch to the service", e10);
        }
    }
}
