package p7;

import T6.C1181k;
import com.google.android.gms.location.LocationResult;
import x7.AbstractC5129l;

/* loaded from: classes2.dex */
final class V implements C1181k.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ LocationResult f38392a;

    V(Y y10, LocationResult locationResult) {
        this.f38392a = locationResult;
    }

    @Override // T6.C1181k.b
    public final /* synthetic */ void a(Object obj) {
        ((AbstractC5129l) obj).onLocationResult(this.f38392a);
    }

    @Override // T6.C1181k.b
    public final void b() {
    }
}
