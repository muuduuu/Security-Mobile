package com.google.android.gms.measurement.internal;

import V6.AbstractC1287s;
import android.os.RemoteException;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.z5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC2833z5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ n7 f26497a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2667e6 f26498b;

    RunnableC2833z5(C2667e6 c2667e6, n7 n7Var) {
        this.f26497a = n7Var;
        Objects.requireNonNull(c2667e6);
        this.f26498b = c2667e6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2667e6 c2667e6 = this.f26498b;
        InterfaceC2703j2 N10 = c2667e6.N();
        if (N10 == null) {
            c2667e6.f25694a.a().o().a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            n7 n7Var = this.f26497a;
            AbstractC1287s.m(n7Var);
            N10.B(n7Var);
        } catch (RemoteException e10) {
            this.f26498b.f25694a.a().o().b("Failed to reset data on the service: remote exception", e10);
        }
        this.f26498b.J();
    }
}
