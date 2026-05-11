package T6;

import V6.AbstractC1287s;
import android.app.Activity;
import com.google.android.gms.common.C2010b;
import com.google.android.gms.common.C2017i;
import j0.C3477b;

/* loaded from: classes2.dex */
public final class B extends B0 {

    /* renamed from: f, reason: collision with root package name */
    private final C3477b f9333f;

    /* renamed from: g, reason: collision with root package name */
    private final C1171f f9334g;

    B(InterfaceC1179j interfaceC1179j, C1171f c1171f, C2017i c2017i) {
        super(interfaceC1179j, c2017i);
        this.f9333f = new C3477b();
        this.f9334g = c1171f;
        this.f9437a.t("ConnectionlessLifecycleHelper", this);
    }

    public static void u(Activity activity, C1171f c1171f, C1163b c1163b) {
        InterfaceC1179j d10 = AbstractC1177i.d(activity);
        B b10 = (B) d10.h("ConnectionlessLifecycleHelper", B.class);
        if (b10 == null) {
            b10 = new B(d10, c1171f, C2017i.q());
        }
        AbstractC1287s.n(c1163b, "ApiKey cannot be null");
        b10.f9333f.add(c1163b);
        c1171f.b(b10);
    }

    private final void v() {
        if (this.f9333f.isEmpty()) {
            return;
        }
        this.f9334g.b(this);
    }

    @Override // T6.AbstractC1177i
    public final void h() {
        super.h();
        v();
    }

    @Override // T6.B0, T6.AbstractC1177i
    public final void j() {
        super.j();
        v();
    }

    @Override // T6.B0, T6.AbstractC1177i
    public final void k() {
        super.k();
        this.f9334g.c(this);
    }

    @Override // T6.B0
    protected final void m(C2010b c2010b, int i10) {
        this.f9334g.F(c2010b, i10);
    }

    @Override // T6.B0
    protected final void n() {
        this.f9334g.G();
    }

    final C3477b t() {
        return this.f9333f;
    }
}
