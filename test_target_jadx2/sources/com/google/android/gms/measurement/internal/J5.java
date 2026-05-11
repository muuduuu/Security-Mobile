package com.google.android.gms.measurement.internal;

import V6.AbstractC1287s;
import android.os.RemoteException;
import java.util.Objects;

/* loaded from: classes2.dex */
final class J5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ n7 f25511a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2667e6 f25512b;

    J5(C2667e6 c2667e6, n7 n7Var) {
        this.f25511a = n7Var;
        Objects.requireNonNull(c2667e6);
        this.f25512b = c2667e6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2667e6 c2667e6 = this.f25512b;
        InterfaceC2703j2 N10 = c2667e6.N();
        if (N10 == null) {
            c2667e6.f25694a.a().o().a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            n7 n7Var = this.f25511a;
            AbstractC1287s.m(n7Var);
            N10.X(n7Var);
            c2667e6.J();
        } catch (RemoteException e10) {
            this.f25512b.f25694a.a().o().b("Failed to send measurementEnabled to the service", e10);
        }
    }
}
