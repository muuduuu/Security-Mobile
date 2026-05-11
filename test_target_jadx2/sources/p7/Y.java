package p7;

import T6.C1181k;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

/* loaded from: classes2.dex */
final class Y extends x7.I {

    /* renamed from: f, reason: collision with root package name */
    private final U f38395f;

    Y(U u10) {
        this.f38395f = u10;
    }

    @Override // x7.J
    public final void b0(LocationResult locationResult) {
        this.f38395f.zza().c(new V(this, locationResult));
    }

    @Override // x7.J
    public final void h() {
        this.f38395f.zza().c(new X(this));
    }

    final Y m1(C1181k c1181k) {
        this.f38395f.b(c1181k);
        return this;
    }

    final void n1() {
        this.f38395f.zza().a();
    }

    @Override // x7.J
    public final void s0(LocationAvailability locationAvailability) {
        this.f38395f.zza().c(new W(this, locationAvailability));
    }
}
