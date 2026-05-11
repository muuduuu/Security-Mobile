package com.google.android.gms.measurement.internal;

import V6.AbstractC1287s;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC2401y0;
import java.util.List;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.v5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC2801v5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f26410a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f26411b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ n7 f26412c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f26413d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ InterfaceC2401y0 f26414e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C2667e6 f26415f;

    RunnableC2801v5(C2667e6 c2667e6, String str, String str2, n7 n7Var, boolean z10, InterfaceC2401y0 interfaceC2401y0) {
        this.f26410a = str;
        this.f26411b = str2;
        this.f26412c = n7Var;
        this.f26413d = z10;
        this.f26414e = interfaceC2401y0;
        Objects.requireNonNull(c2667e6);
        this.f26415f = c2667e6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        RemoteException e10;
        Bundle bundle2 = new Bundle();
        try {
            C2667e6 c2667e6 = this.f26415f;
            InterfaceC2703j2 N10 = c2667e6.N();
            if (N10 == null) {
                C2760q3 c2760q3 = c2667e6.f25694a;
                c2760q3.a().o().c("Failed to get user properties; not connected to service", this.f26410a, this.f26411b);
                c2760q3.C().f0(this.f26414e, bundle2);
                return;
            }
            n7 n7Var = this.f26412c;
            AbstractC1287s.m(n7Var);
            List<h7> Q02 = N10.Q0(this.f26410a, this.f26411b, this.f26413d, n7Var);
            int i10 = l7.f26158k;
            bundle = new Bundle();
            if (Q02 != null) {
                for (h7 h7Var : Q02) {
                    String str = h7Var.f26099e;
                    if (str != null) {
                        bundle.putString(h7Var.f26096b, str);
                    } else {
                        Long l10 = h7Var.f26098d;
                        if (l10 != null) {
                            bundle.putLong(h7Var.f26096b, l10.longValue());
                        } else {
                            Double d10 = h7Var.f26101g;
                            if (d10 != null) {
                                bundle.putDouble(h7Var.f26096b, d10.doubleValue());
                            }
                        }
                    }
                }
            }
            try {
                try {
                    c2667e6.J();
                    C2760q3 c2760q32 = c2667e6.f25694a;
                    c2760q32.C().f0(this.f26414e, bundle);
                } catch (RemoteException e11) {
                    e10 = e11;
                    this.f26415f.f25694a.a().o().c("Failed to get user properties; remote exception", this.f26410a, e10);
                    C2667e6 c2667e62 = this.f26415f;
                    c2667e62.f25694a.C().f0(this.f26414e, bundle);
                }
            } catch (Throwable th) {
                th = th;
                bundle2 = bundle;
                C2667e6 c2667e63 = this.f26415f;
                c2667e63.f25694a.C().f0(this.f26414e, bundle2);
                throw th;
            }
        } catch (RemoteException e12) {
            bundle = bundle2;
            e10 = e12;
        } catch (Throwable th2) {
            th = th2;
            C2667e6 c2667e632 = this.f26415f;
            c2667e632.f25694a.C().f0(this.f26414e, bundle2);
            throw th;
        }
    }
}
