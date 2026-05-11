package p7;

import S6.a;
import T6.C1181k;
import com.google.android.gms.location.LocationRequest;

/* renamed from: p7.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3808d extends AbstractC3814g {

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ C1181k f38412r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ LocationRequest f38413s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3808d(C3816h c3816h, S6.h hVar, C1181k c1181k, LocationRequest locationRequest) {
        super(hVar);
        this.f38412r = c1181k;
        this.f38413s = locationRequest;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC2006a
    protected final /* bridge */ /* synthetic */ void r(a.b bVar) {
        ((C3809d0) bVar).z0(new C3812f(this.f38412r), this.f38413s, C3816h.d(this));
    }
}
