package com.google.android.gms.measurement.internal;

import V6.AbstractC1287s;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.Objects;

/* loaded from: classes2.dex */
final class G5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ n7 f25419a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f25420b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ G f25421c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Bundle f25422d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C2667e6 f25423e;

    G5(C2667e6 c2667e6, boolean z10, n7 n7Var, boolean z11, G g10, Bundle bundle) {
        this.f25419a = n7Var;
        this.f25420b = z11;
        this.f25421c = g10;
        this.f25422d = bundle;
        Objects.requireNonNull(c2667e6);
        this.f25423e = c2667e6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2667e6 c2667e6 = this.f25423e;
        InterfaceC2703j2 N10 = c2667e6.N();
        if (N10 == null) {
            c2667e6.f25694a.a().o().a("Failed to send default event parameters to service");
            return;
        }
        if (c2667e6.f25694a.w().H(null, AbstractC2671f2.f25995c1)) {
            n7 n7Var = this.f25419a;
            AbstractC1287s.m(n7Var);
            this.f25423e.b0(N10, this.f25420b ? null : this.f25421c, n7Var);
            return;
        }
        try {
            n7 n7Var2 = this.f25419a;
            AbstractC1287s.m(n7Var2);
            N10.m0(this.f25422d, n7Var2);
            c2667e6.J();
        } catch (RemoteException e10) {
            this.f25423e.f25694a.a().o().b("Failed to send default event parameters to service", e10);
        }
    }
}
