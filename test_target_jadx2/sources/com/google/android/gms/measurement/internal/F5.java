package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.Objects;

/* loaded from: classes2.dex */
final class F5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2730m5 f25403a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2667e6 f25404b;

    F5(C2667e6 c2667e6, C2730m5 c2730m5) {
        this.f25403a = c2730m5;
        Objects.requireNonNull(c2667e6);
        this.f25404b = c2667e6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2667e6 c2667e6 = this.f25404b;
        InterfaceC2703j2 N10 = c2667e6.N();
        if (N10 == null) {
            c2667e6.f25694a.a().o().a("Failed to send current screen to service");
            return;
        }
        try {
            C2730m5 c2730m5 = this.f25403a;
            if (c2730m5 == null) {
                N10.z(0L, null, null, c2667e6.f25694a.e().getPackageName());
            } else {
                N10.z(c2730m5.f26174c, c2730m5.f26172a, c2730m5.f26173b, c2667e6.f25694a.e().getPackageName());
            }
            c2667e6.J();
        } catch (RemoteException e10) {
            this.f25404b.f25694a.a().o().b("Failed to send current screen to the service", e10);
        }
    }
}
