package p7;

import D7.C0787k;
import T6.C1182l;
import android.os.RemoteException;
import com.google.android.gms.location.LocationResult;
import x7.AbstractC5129l;

/* loaded from: classes2.dex */
final class K extends AbstractC5129l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C0787k f38377a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3809d0 f38378b;

    K(C3809d0 c3809d0, C0787k c0787k) {
        this.f38378b = c3809d0;
        this.f38377a = c0787k;
    }

    @Override // x7.AbstractC5129l
    public final void onLocationResult(LocationResult locationResult) {
        this.f38377a.e(locationResult.u());
        try {
            this.f38378b.r0(C1182l.c(this, "GetCurrentLocation"), false, new C0787k());
        } catch (RemoteException unused) {
        }
    }
}
