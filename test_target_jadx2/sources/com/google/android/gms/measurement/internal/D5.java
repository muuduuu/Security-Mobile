package com.google.android.gms.measurement.internal;

import V6.AbstractC1287s;
import android.os.RemoteException;
import java.util.Objects;

/* loaded from: classes2.dex */
final class D5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ n7 f25362a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2667e6 f25363b;

    D5(C2667e6 c2667e6, n7 n7Var) {
        this.f25362a = n7Var;
        Objects.requireNonNull(c2667e6);
        this.f25363b = c2667e6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2667e6 c2667e6 = this.f25363b;
        InterfaceC2703j2 N10 = c2667e6.N();
        if (N10 == null) {
            c2667e6.f25694a.a().r().a("Failed to send app backgrounded");
            return;
        }
        try {
            n7 n7Var = this.f25362a;
            AbstractC1287s.m(n7Var);
            N10.N0(n7Var);
            c2667e6.J();
        } catch (RemoteException e10) {
            this.f25363b.f25694a.a().o().b("Failed to send app backgrounded to the service", e10);
        }
    }
}
