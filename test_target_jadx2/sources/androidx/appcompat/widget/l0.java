package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.core.view.AbstractC1484a0;
import androidx.core.view.AbstractC1508m0;
import androidx.core.view.C1504k0;
import g.AbstractC3170a;
import g.AbstractC3174e;
import g.AbstractC3175f;
import g.AbstractC3177h;
import g.AbstractC3179j;
import h.AbstractC3220a;
import l.C3584a;

/* loaded from: classes.dex */
public class l0 implements J {

    /* renamed from: a, reason: collision with root package name */
    Toolbar f14195a;

    /* renamed from: b, reason: collision with root package name */
    private int f14196b;

    /* renamed from: c, reason: collision with root package name */
    private View f14197c;

    /* renamed from: d, reason: collision with root package name */
    private View f14198d;

    /* renamed from: e, reason: collision with root package name */
    private Drawable f14199e;

    /* renamed from: f, reason: collision with root package name */
    private Drawable f14200f;

    /* renamed from: g, reason: collision with root package name */
    private Drawable f14201g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f14202h;

    /* renamed from: i, reason: collision with root package name */
    CharSequence f14203i;

    /* renamed from: j, reason: collision with root package name */
    private CharSequence f14204j;

    /* renamed from: k, reason: collision with root package name */
    private CharSequence f14205k;

    /* renamed from: l, reason: collision with root package name */
    Window.Callback f14206l;

    /* renamed from: m, reason: collision with root package name */
    boolean f14207m;

    /* renamed from: n, reason: collision with root package name */
    private C1401c f14208n;

    /* renamed from: o, reason: collision with root package name */
    private int f14209o;

    /* renamed from: p, reason: collision with root package name */
    private int f14210p;

    /* renamed from: q, reason: collision with root package name */
    private Drawable f14211q;

    class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final C3584a f14212a;

        a() {
            this.f14212a = new C3584a(l0.this.f14195a.getContext(), 0, R.id.home, 0, 0, l0.this.f14203i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            l0 l0Var = l0.this;
            Window.Callback callback = l0Var.f14206l;
            if (callback == null || !l0Var.f14207m) {
                return;
            }
            callback.onMenuItemSelected(0, this.f14212a);
        }
    }

    class b extends AbstractC1508m0 {

        /* renamed from: a, reason: collision with root package name */
        private boolean f14214a = false;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f14215b;

        b(int i10) {
            this.f14215b = i10;
        }

        @Override // androidx.core.view.AbstractC1508m0, androidx.core.view.InterfaceC1506l0
        public void a(View view) {
            this.f14214a = true;
        }

        @Override // androidx.core.view.InterfaceC1506l0
        public void b(View view) {
            if (this.f14214a) {
                return;
            }
            l0.this.f14195a.setVisibility(this.f14215b);
        }

        @Override // androidx.core.view.AbstractC1508m0, androidx.core.view.InterfaceC1506l0
        public void c(View view) {
            l0.this.f14195a.setVisibility(0);
        }
    }

    public l0(Toolbar toolbar, boolean z10) {
        this(toolbar, z10, AbstractC3177h.f33222a, AbstractC3174e.f33146n);
    }

    private void F(CharSequence charSequence) {
        this.f14203i = charSequence;
        if ((this.f14196b & 8) != 0) {
            this.f14195a.setTitle(charSequence);
            if (this.f14202h) {
                AbstractC1484a0.t0(this.f14195a.getRootView(), charSequence);
            }
        }
    }

    private void G() {
        if ((this.f14196b & 4) != 0) {
            if (TextUtils.isEmpty(this.f14205k)) {
                this.f14195a.setNavigationContentDescription(this.f14210p);
            } else {
                this.f14195a.setNavigationContentDescription(this.f14205k);
            }
        }
    }

    private void H() {
        if ((this.f14196b & 4) == 0) {
            this.f14195a.setNavigationIcon((Drawable) null);
            return;
        }
        Toolbar toolbar = this.f14195a;
        Drawable drawable = this.f14201g;
        if (drawable == null) {
            drawable = this.f14211q;
        }
        toolbar.setNavigationIcon(drawable);
    }

    private void I() {
        Drawable drawable;
        int i10 = this.f14196b;
        if ((i10 & 2) == 0) {
            drawable = null;
        } else if ((i10 & 1) != 0) {
            drawable = this.f14200f;
            if (drawable == null) {
                drawable = this.f14199e;
            }
        } else {
            drawable = this.f14199e;
        }
        this.f14195a.setLogo(drawable);
    }

    private int y() {
        if (this.f14195a.getNavigationIcon() == null) {
            return 11;
        }
        this.f14211q = this.f14195a.getNavigationIcon();
        return 15;
    }

    public void A(int i10) {
        if (i10 == this.f14210p) {
            return;
        }
        this.f14210p = i10;
        if (TextUtils.isEmpty(this.f14195a.getNavigationContentDescription())) {
            C(this.f14210p);
        }
    }

    public void B(Drawable drawable) {
        this.f14200f = drawable;
        I();
    }

    public void C(int i10) {
        D(i10 == 0 ? null : getContext().getString(i10));
    }

    public void D(CharSequence charSequence) {
        this.f14205k = charSequence;
        G();
    }

    public void E(CharSequence charSequence) {
        this.f14204j = charSequence;
        if ((this.f14196b & 8) != 0) {
            this.f14195a.setSubtitle(charSequence);
        }
    }

    @Override // androidx.appcompat.widget.J
    public void a(Menu menu, j.a aVar) {
        if (this.f14208n == null) {
            C1401c c1401c = new C1401c(this.f14195a.getContext());
            this.f14208n = c1401c;
            c1401c.p(AbstractC3175f.f33183h);
        }
        this.f14208n.h(aVar);
        this.f14195a.K((androidx.appcompat.view.menu.e) menu, this.f14208n);
    }

    @Override // androidx.appcompat.widget.J
    public boolean b() {
        return this.f14195a.B();
    }

    @Override // androidx.appcompat.widget.J
    public void c() {
        this.f14207m = true;
    }

    @Override // androidx.appcompat.widget.J
    public void collapseActionView() {
        this.f14195a.e();
    }

    @Override // androidx.appcompat.widget.J
    public boolean d() {
        return this.f14195a.d();
    }

    @Override // androidx.appcompat.widget.J
    public boolean e() {
        return this.f14195a.A();
    }

    @Override // androidx.appcompat.widget.J
    public boolean f() {
        return this.f14195a.w();
    }

    @Override // androidx.appcompat.widget.J
    public boolean g() {
        return this.f14195a.Q();
    }

    @Override // androidx.appcompat.widget.J
    public Context getContext() {
        return this.f14195a.getContext();
    }

    @Override // androidx.appcompat.widget.J
    public CharSequence getTitle() {
        return this.f14195a.getTitle();
    }

    @Override // androidx.appcompat.widget.J
    public void h() {
        this.f14195a.f();
    }

    @Override // androidx.appcompat.widget.J
    public void i(a0 a0Var) {
        View view = this.f14197c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f14195a;
            if (parent == toolbar) {
                toolbar.removeView(this.f14197c);
            }
        }
        this.f14197c = a0Var;
    }

    @Override // androidx.appcompat.widget.J
    public boolean j() {
        return this.f14195a.v();
    }

    @Override // androidx.appcompat.widget.J
    public void k(int i10) {
        View view;
        int i11 = this.f14196b ^ i10;
        this.f14196b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    G();
                }
                H();
            }
            if ((i11 & 3) != 0) {
                I();
            }
            if ((i11 & 8) != 0) {
                if ((i10 & 8) != 0) {
                    this.f14195a.setTitle(this.f14203i);
                    this.f14195a.setSubtitle(this.f14204j);
                } else {
                    this.f14195a.setTitle((CharSequence) null);
                    this.f14195a.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) == 0 || (view = this.f14198d) == null) {
                return;
            }
            if ((i10 & 16) != 0) {
                this.f14195a.addView(view);
            } else {
                this.f14195a.removeView(view);
            }
        }
    }

    @Override // androidx.appcompat.widget.J
    public Menu l() {
        return this.f14195a.getMenu();
    }

    @Override // androidx.appcompat.widget.J
    public void m(int i10) {
        B(i10 != 0 ? AbstractC3220a.b(getContext(), i10) : null);
    }

    @Override // androidx.appcompat.widget.J
    public int n() {
        return this.f14209o;
    }

    @Override // androidx.appcompat.widget.J
    public C1504k0 o(int i10, long j10) {
        return AbstractC1484a0.e(this.f14195a).b(i10 == 0 ? 1.0f : 0.0f).f(j10).h(new b(i10));
    }

    @Override // androidx.appcompat.widget.J
    public void p(j.a aVar, e.a aVar2) {
        this.f14195a.L(aVar, aVar2);
    }

    @Override // androidx.appcompat.widget.J
    public void q(int i10) {
        this.f14195a.setVisibility(i10);
    }

    @Override // androidx.appcompat.widget.J
    public ViewGroup r() {
        return this.f14195a;
    }

    @Override // androidx.appcompat.widget.J
    public void s(boolean z10) {
    }

    @Override // androidx.appcompat.widget.J
    public void setIcon(int i10) {
        setIcon(i10 != 0 ? AbstractC3220a.b(getContext(), i10) : null);
    }

    @Override // androidx.appcompat.widget.J
    public void setTitle(CharSequence charSequence) {
        this.f14202h = true;
        F(charSequence);
    }

    @Override // androidx.appcompat.widget.J
    public void setWindowCallback(Window.Callback callback) {
        this.f14206l = callback;
    }

    @Override // androidx.appcompat.widget.J
    public void setWindowTitle(CharSequence charSequence) {
        if (this.f14202h) {
            return;
        }
        F(charSequence);
    }

    @Override // androidx.appcompat.widget.J
    public int t() {
        return this.f14196b;
    }

    @Override // androidx.appcompat.widget.J
    public void u() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.J
    public void v() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.J
    public void w(Drawable drawable) {
        this.f14201g = drawable;
        H();
    }

    @Override // androidx.appcompat.widget.J
    public void x(boolean z10) {
        this.f14195a.setCollapsible(z10);
    }

    public void z(View view) {
        View view2 = this.f14198d;
        if (view2 != null && (this.f14196b & 16) != 0) {
            this.f14195a.removeView(view2);
        }
        this.f14198d = view;
        if (view == null || (this.f14196b & 16) == 0) {
            return;
        }
        this.f14195a.addView(view);
    }

    public l0(Toolbar toolbar, boolean z10, int i10, int i11) {
        Drawable drawable;
        this.f14209o = 0;
        this.f14210p = 0;
        this.f14195a = toolbar;
        this.f14203i = toolbar.getTitle();
        this.f14204j = toolbar.getSubtitle();
        this.f14202h = this.f14203i != null;
        this.f14201g = toolbar.getNavigationIcon();
        h0 v10 = h0.v(toolbar.getContext(), null, AbstractC3179j.f33362a, AbstractC3170a.f33068c, 0);
        this.f14211q = v10.g(AbstractC3179j.f33417l);
        if (z10) {
            CharSequence p10 = v10.p(AbstractC3179j.f33447r);
            if (!TextUtils.isEmpty(p10)) {
                setTitle(p10);
            }
            CharSequence p11 = v10.p(AbstractC3179j.f33437p);
            if (!TextUtils.isEmpty(p11)) {
                E(p11);
            }
            Drawable g10 = v10.g(AbstractC3179j.f33427n);
            if (g10 != null) {
                B(g10);
            }
            Drawable g11 = v10.g(AbstractC3179j.f33422m);
            if (g11 != null) {
                setIcon(g11);
            }
            if (this.f14201g == null && (drawable = this.f14211q) != null) {
                w(drawable);
            }
            k(v10.k(AbstractC3179j.f33397h, 0));
            int n10 = v10.n(AbstractC3179j.f33392g, 0);
            if (n10 != 0) {
                z(LayoutInflater.from(this.f14195a.getContext()).inflate(n10, (ViewGroup) this.f14195a, false));
                k(this.f14196b | 16);
            }
            int m10 = v10.m(AbstractC3179j.f33407j, 0);
            if (m10 > 0) {
                ViewGroup.LayoutParams layoutParams = this.f14195a.getLayoutParams();
                layoutParams.height = m10;
                this.f14195a.setLayoutParams(layoutParams);
            }
            int e10 = v10.e(AbstractC3179j.f33387f, -1);
            int e11 = v10.e(AbstractC3179j.f33382e, -1);
            if (e10 >= 0 || e11 >= 0) {
                this.f14195a.J(Math.max(e10, 0), Math.max(e11, 0));
            }
            int n11 = v10.n(AbstractC3179j.f33452s, 0);
            if (n11 != 0) {
                Toolbar toolbar2 = this.f14195a;
                toolbar2.N(toolbar2.getContext(), n11);
            }
            int n12 = v10.n(AbstractC3179j.f33442q, 0);
            if (n12 != 0) {
                Toolbar toolbar3 = this.f14195a;
                toolbar3.M(toolbar3.getContext(), n12);
            }
            int n13 = v10.n(AbstractC3179j.f33432o, 0);
            if (n13 != 0) {
                this.f14195a.setPopupTheme(n13);
            }
        } else {
            this.f14196b = y();
        }
        v10.x();
        A(i10);
        this.f14205k = this.f14195a.getNavigationContentDescription();
        this.f14195a.setNavigationOnClickListener(new a());
    }

    @Override // androidx.appcompat.widget.J
    public void setIcon(Drawable drawable) {
        this.f14199e = drawable;
        I();
    }
}
