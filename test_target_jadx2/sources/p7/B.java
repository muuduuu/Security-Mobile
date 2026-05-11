package p7;

import S6.a;
import V6.AbstractC1287s;
import x7.C5132o;

/* loaded from: classes2.dex */
final class B extends C {

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ C5132o f38368r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    B(D d10, S6.h hVar, C5132o c5132o, String str) {
        super(hVar);
        this.f38368r = c5132o;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC2006a
    protected final /* synthetic */ void r(a.b bVar) {
        C3809d0 c3809d0 = (C3809d0) bVar;
        C5132o c5132o = this.f38368r;
        AbstractC1287s.b(c5132o != null, "locationSettingsRequest can't be null");
        ((K0) c3809d0.I()).S0(c5132o, new T(this), null);
    }
}
