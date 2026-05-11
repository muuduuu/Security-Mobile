package T6;

import D7.C0787k;
import T6.C1181k;
import com.google.android.gms.common.C2012d;

/* loaded from: classes2.dex */
public final class s0 extends q0 {

    /* renamed from: c, reason: collision with root package name */
    public final C1170e0 f9473c;

    public s0(C1170e0 c1170e0, C0787k c0787k) {
        super(3, c0787k);
        this.f9473c = c1170e0;
    }

    @Override // T6.X
    public final boolean f(N n10) {
        return this.f9473c.f9411a.f();
    }

    @Override // T6.X
    public final C2012d[] g(N n10) {
        return this.f9473c.f9411a.c();
    }

    @Override // T6.q0
    public final void h(N n10) {
        this.f9473c.f9411a.d(n10.t(), this.f9471b);
        C1181k.a b10 = this.f9473c.f9411a.b();
        if (b10 != null) {
            n10.v().put(b10, this.f9473c);
        }
    }

    @Override // T6.v0
    public final /* bridge */ /* synthetic */ void d(A a10, boolean z10) {
    }
}
