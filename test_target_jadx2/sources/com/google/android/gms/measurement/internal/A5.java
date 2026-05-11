package com.google.android.gms.measurement.internal;

import V6.AbstractC1287s;
import android.os.RemoteException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
final class A5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f25302a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ n7 f25303b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C2667e6 f25304c;

    A5(C2667e6 c2667e6, AtomicReference atomicReference, n7 n7Var) {
        this.f25302a = atomicReference;
        this.f25303b = n7Var;
        Objects.requireNonNull(c2667e6);
        this.f25304c = c2667e6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        C2667e6 c2667e6;
        C2760q3 c2760q3;
        AtomicReference atomicReference2 = this.f25302a;
        synchronized (atomicReference2) {
            try {
                try {
                    c2667e6 = this.f25304c;
                    c2760q3 = c2667e6.f25694a;
                } catch (RemoteException e10) {
                    this.f25304c.f25694a.a().o().b("Failed to get app instance id", e10);
                    atomicReference = this.f25302a;
                }
                if (!c2760q3.x().w().o(Z3.ANALYTICS_STORAGE)) {
                    c2760q3.a().t().a("Analytics storage consent denied; will not get app instance id");
                    c2667e6.f25694a.B().E(null);
                    c2760q3.x().f25635h.b(null);
                    atomicReference2.set(null);
                    atomicReference2.notify();
                    return;
                }
                InterfaceC2703j2 N10 = c2667e6.N();
                if (N10 == null) {
                    c2760q3.a().o().a("Failed to get app instance id");
                    atomicReference2.notify();
                    return;
                }
                n7 n7Var = this.f25303b;
                AbstractC1287s.m(n7Var);
                atomicReference2.set(N10.V0(n7Var));
                String str = (String) atomicReference2.get();
                if (str != null) {
                    c2667e6.f25694a.B().E(str);
                    c2760q3.x().f25635h.b(str);
                }
                c2667e6.J();
                atomicReference = this.f25302a;
                atomicReference.notify();
            } catch (Throwable th) {
                this.f25302a.notify();
                throw th;
            }
        }
    }
}
