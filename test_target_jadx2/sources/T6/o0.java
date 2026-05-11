package T6;

import D7.C0787k;
import S6.a;
import T6.AbstractC1191v;
import com.google.android.gms.common.C2012d;

/* loaded from: classes2.dex */
final class o0 extends AbstractC1191v {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ AbstractC1191v.a f9456d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o0(AbstractC1191v.a aVar, C2012d[] c2012dArr, boolean z10, int i10) {
        super(c2012dArr, z10, i10);
        this.f9456d = aVar;
    }

    @Override // T6.AbstractC1191v
    protected final void b(a.b bVar, C0787k c0787k) {
        r rVar;
        rVar = this.f9456d.f9481a;
        rVar.a(bVar, c0787k);
    }
}
