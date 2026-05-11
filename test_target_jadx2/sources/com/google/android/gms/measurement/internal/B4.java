package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC2401y0;
import java.util.Objects;

/* loaded from: classes2.dex */
final class B4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC2401y0 f25317a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2642b5 f25318b;

    B4(C2642b5 c2642b5, InterfaceC2401y0 interfaceC2401y0) {
        this.f25317a = interfaceC2401y0;
        Objects.requireNonNull(c2642b5);
        this.f25318b = c2642b5;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Long valueOf;
        C2642b5 c2642b5 = this.f25318b;
        C2760q3 c2760q3 = c2642b5.f25694a.z().f25694a;
        if (!c2760q3.x().w().o(Z3.ANALYTICS_STORAGE)) {
            c2760q3.a().t().a("Analytics storage consent denied; will not get session id");
        } else if (!c2760q3.x().A(c2760q3.f().a()) && c2760q3.x().f25645r.a() != 0) {
            valueOf = Long.valueOf(c2760q3.x().f25645r.a());
            if (valueOf == null) {
                c2642b5.f25694a.C().b0(this.f25317a, valueOf.longValue());
                return;
            } else {
                try {
                    this.f25317a.r0(null);
                    return;
                } catch (RemoteException e10) {
                    this.f25318b.f25694a.a().o().b("getSessionId failed with exception", e10);
                    return;
                }
            }
        }
        valueOf = null;
        if (valueOf == null) {
        }
    }
}
