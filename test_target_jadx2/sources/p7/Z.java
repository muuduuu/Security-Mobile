package p7;

import T6.C1181k;
import android.location.Location;
import x7.InterfaceC5130m;

/* loaded from: classes2.dex */
final class Z implements C1181k.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Location f38396a;

    Z(BinderC3805b0 binderC3805b0, Location location) {
        this.f38396a = location;
    }

    @Override // T6.C1181k.b
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ((InterfaceC5130m) obj).onLocationChanged(this.f38396a);
    }

    @Override // T6.C1181k.b
    public final void b() {
    }
}
