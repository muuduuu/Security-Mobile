package p7;

import T6.C1181k;
import com.google.android.gms.location.LocationAvailability;
import x7.AbstractC5129l;

/* loaded from: classes2.dex */
final class W implements C1181k.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ LocationAvailability f38393a;

    W(Y y10, LocationAvailability locationAvailability) {
        this.f38393a = locationAvailability;
    }

    @Override // T6.C1181k.b
    public final /* synthetic */ void a(Object obj) {
        ((AbstractC5129l) obj).onLocationAvailability(this.f38393a);
    }

    @Override // T6.C1181k.b
    public final void b() {
    }
}
