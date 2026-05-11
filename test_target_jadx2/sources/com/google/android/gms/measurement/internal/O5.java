package com.google.android.gms.measurement.internal;

import V6.AbstractC1287s;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC2401y0;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes2.dex */
final class O5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f25602a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f25603b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ n7 f25604c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ InterfaceC2401y0 f25605d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C2667e6 f25606e;

    O5(C2667e6 c2667e6, String str, String str2, n7 n7Var, InterfaceC2401y0 interfaceC2401y0) {
        this.f25602a = str;
        this.f25603b = str2;
        this.f25604c = n7Var;
        this.f25605d = interfaceC2401y0;
        Objects.requireNonNull(c2667e6);
        this.f25606e = c2667e6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC2401y0 interfaceC2401y0;
        l7 C10;
        C2667e6 c2667e6;
        InterfaceC2703j2 N10;
        ArrayList arrayList = new ArrayList();
        try {
            try {
                c2667e6 = this.f25606e;
                N10 = c2667e6.N();
            } catch (RemoteException e10) {
                this.f25606e.f25694a.a().o().d("Failed to get conditional properties; remote exception", this.f25602a, this.f25603b, e10);
            }
            if (N10 == null) {
                C2760q3 c2760q3 = c2667e6.f25694a;
                c2760q3.a().o().c("Failed to get conditional properties; not connected to service", this.f25602a, this.f25603b);
                C10 = c2760q3.C();
                interfaceC2401y0 = this.f25605d;
                C10.g0(interfaceC2401y0, arrayList);
            }
            n7 n7Var = this.f25604c;
            AbstractC1287s.m(n7Var);
            arrayList = l7.h0(N10.W0(this.f25602a, this.f25603b, n7Var));
            c2667e6.J();
            C2667e6 c2667e62 = this.f25606e;
            interfaceC2401y0 = this.f25605d;
            C10 = c2667e62.f25694a.C();
            C10.g0(interfaceC2401y0, arrayList);
        } catch (Throwable th) {
            C2667e6 c2667e63 = this.f25606e;
            c2667e63.f25694a.C().g0(this.f25605d, arrayList);
            throw th;
        }
    }
}
