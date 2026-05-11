package T6;

import D7.C0787k;
import T6.C1181k;
import com.google.android.gms.common.C2012d;

/* loaded from: classes2.dex */
public final class u0 extends q0 {

    /* renamed from: c, reason: collision with root package name */
    public final C1181k.a f9477c;

    public u0(C1181k.a aVar, C0787k c0787k) {
        super(4, c0787k);
        this.f9477c = aVar;
    }

    @Override // T6.X
    public final boolean f(N n10) {
        C1170e0 c1170e0 = (C1170e0) n10.v().get(this.f9477c);
        return c1170e0 != null && c1170e0.f9411a.f();
    }

    @Override // T6.X
    public final C2012d[] g(N n10) {
        C1170e0 c1170e0 = (C1170e0) n10.v().get(this.f9477c);
        if (c1170e0 == null) {
            return null;
        }
        return c1170e0.f9411a.c();
    }

    @Override // T6.q0
    public final void h(N n10) {
        C1170e0 c1170e0 = (C1170e0) n10.v().remove(this.f9477c);
        if (c1170e0 == null) {
            this.f9471b.e(Boolean.FALSE);
            return;
        }
        c1170e0.f9412b.b(n10.t(), this.f9471b);
        c1170e0.f9411a.a();
    }

    @Override // T6.v0
    public final /* bridge */ /* synthetic */ void d(A a10, boolean z10) {
    }
}
