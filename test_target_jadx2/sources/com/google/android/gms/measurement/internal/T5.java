package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* loaded from: classes2.dex */
final class T5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC2703j2 f25696a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Y5 f25697b;

    T5(Y5 y52, InterfaceC2703j2 interfaceC2703j2) {
        this.f25696a = interfaceC2703j2;
        Objects.requireNonNull(y52);
        this.f25697b = y52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Y5 y52 = this.f25697b;
        synchronized (y52) {
            try {
                y52.d(false);
                C2667e6 c2667e6 = y52.f25747c;
                if (!c2667e6.W()) {
                    c2667e6.f25694a.a().v().a("Connected to remote service");
                    c2667e6.z(this.f25696a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C2667e6 c2667e62 = this.f25697b.f25747c;
        if (c2667e62.P() != null) {
            c2667e62.P().shutdownNow();
            c2667e62.Q(null);
        }
    }
}
