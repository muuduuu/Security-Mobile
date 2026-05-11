package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC2401y0;
import java.util.Objects;

/* loaded from: classes2.dex */
final class H5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ I f25438a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f25439b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC2401y0 f25440c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C2667e6 f25441d;

    H5(C2667e6 c2667e6, I i10, String str, InterfaceC2401y0 interfaceC2401y0) {
        this.f25438a = i10;
        this.f25439b = str;
        this.f25440c = interfaceC2401y0;
        Objects.requireNonNull(c2667e6);
        this.f25441d = c2667e6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC2401y0 interfaceC2401y0;
        l7 C10;
        C2667e6 c2667e6;
        InterfaceC2703j2 N10;
        byte[] bArr = null;
        try {
            try {
                c2667e6 = this.f25441d;
                N10 = c2667e6.N();
            } catch (RemoteException e10) {
                this.f25441d.f25694a.a().o().b("Failed to send event to the service to bundle", e10);
            }
            if (N10 == null) {
                C2760q3 c2760q3 = c2667e6.f25694a;
                c2760q3.a().o().a("Discarding data. Failed to send event to service to bundle");
                C10 = c2760q3.C();
                interfaceC2401y0 = this.f25440c;
                C10.d0(interfaceC2401y0, bArr);
            }
            bArr = N10.e0(this.f25438a, this.f25439b);
            c2667e6.J();
            C2667e6 c2667e62 = this.f25441d;
            interfaceC2401y0 = this.f25440c;
            C10 = c2667e62.f25694a.C();
            C10.d0(interfaceC2401y0, bArr);
        } catch (Throwable th) {
            C2667e6 c2667e63 = this.f25441d;
            c2667e63.f25694a.C().d0(this.f25440c, null);
            throw th;
        }
    }
}
