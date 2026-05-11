package p7;

import T6.C1181k;
import android.location.Location;

/* renamed from: p7.b0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class BinderC3805b0 extends x7.L {

    /* renamed from: f, reason: collision with root package name */
    private final U f38401f;

    BinderC3805b0(U u10) {
        this.f38401f = u10;
    }

    @Override // x7.M
    public final void g() {
        this.f38401f.zza().c(new C3803a0(this));
    }

    @Override // x7.M
    public final void m(Location location) {
        this.f38401f.zza().c(new Z(this, location));
    }

    final BinderC3805b0 m1(C1181k c1181k) {
        this.f38401f.b(c1181k);
        return this;
    }

    final void n1() {
        this.f38401f.zza().a();
    }
}
