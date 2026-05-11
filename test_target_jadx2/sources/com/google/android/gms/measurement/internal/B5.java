package com.google.android.gms.measurement.internal;

import V6.AbstractC1287s;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC2401y0;
import java.util.Objects;

/* loaded from: classes2.dex */
final class B5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ n7 f25319a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC2401y0 f25320b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C2667e6 f25321c;

    B5(C2667e6 c2667e6, n7 n7Var, InterfaceC2401y0 interfaceC2401y0) {
        this.f25319a = n7Var;
        this.f25320b = interfaceC2401y0;
        Objects.requireNonNull(c2667e6);
        this.f25321c = c2667e6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC2401y0 interfaceC2401y0;
        l7 C10;
        C2667e6 c2667e6;
        C2760q3 c2760q3;
        String str = null;
        try {
            try {
                c2667e6 = this.f25321c;
                c2760q3 = c2667e6.f25694a;
            } catch (RemoteException e10) {
                this.f25321c.f25694a.a().o().b("Failed to get app instance id", e10);
            }
            if (c2760q3.x().w().o(Z3.ANALYTICS_STORAGE)) {
                InterfaceC2703j2 N10 = c2667e6.N();
                if (N10 != null) {
                    n7 n7Var = this.f25319a;
                    AbstractC1287s.m(n7Var);
                    str = N10.V0(n7Var);
                    if (str != null) {
                        c2667e6.f25694a.B().E(str);
                        c2760q3.x().f25635h.b(str);
                    }
                    c2667e6.J();
                    C2667e6 c2667e62 = this.f25321c;
                    interfaceC2401y0 = this.f25320b;
                    C10 = c2667e62.f25694a.C();
                    C10.a0(interfaceC2401y0, str);
                }
                c2760q3.a().o().a("Failed to get app instance id");
            } else {
                c2760q3.a().t().a("Analytics storage consent denied; will not get app instance id");
                c2667e6.f25694a.B().E(null);
                c2760q3.x().f25635h.b(null);
            }
            C10 = c2760q3.C();
            interfaceC2401y0 = this.f25320b;
            C10.a0(interfaceC2401y0, str);
        } catch (Throwable th) {
            C2667e6 c2667e63 = this.f25321c;
            c2667e63.f25694a.C().a0(this.f25320b, null);
            throw th;
        }
    }
}
