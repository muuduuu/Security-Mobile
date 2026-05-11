package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.view.b;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.J;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.AbstractC1484a0;
import androidx.core.view.AbstractC1508m0;
import androidx.core.view.C1504k0;
import androidx.core.view.InterfaceC1506l0;
import androidx.core.view.InterfaceC1510n0;
import g.AbstractC3170a;
import g.AbstractC3175f;
import g.AbstractC3179j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class B extends AbstractC1397a implements ActionBarOverlayLayout.d {

    /* renamed from: D, reason: collision with root package name */
    private static final Interpolator f13109D = new AccelerateInterpolator();

    /* renamed from: E, reason: collision with root package name */
    private static final Interpolator f13110E = new DecelerateInterpolator();

    /* renamed from: a, reason: collision with root package name */
    Context f13114a;

    /* renamed from: b, reason: collision with root package name */
    private Context f13115b;

    /* renamed from: c, reason: collision with root package name */
    private Activity f13116c;

    /* renamed from: d, reason: collision with root package name */
    ActionBarOverlayLayout f13117d;

    /* renamed from: e, reason: collision with root package name */
    ActionBarContainer f13118e;

    /* renamed from: f, reason: collision with root package name */
    J f13119f;

    /* renamed from: g, reason: collision with root package name */
    ActionBarContextView f13120g;

    /* renamed from: h, reason: collision with root package name */
    View f13121h;

    /* renamed from: k, reason: collision with root package name */
    private boolean f13124k;

    /* renamed from: l, reason: collision with root package name */
    d f13125l;

    /* renamed from: m, reason: collision with root package name */
    androidx.appcompat.view.b f13126m;

    /* renamed from: n, reason: collision with root package name */
    b.a f13127n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f13128o;

    /* renamed from: q, reason: collision with root package name */
    private boolean f13130q;

    /* renamed from: t, reason: collision with root package name */
    boolean f13133t;

    /* renamed from: u, reason: collision with root package name */
    boolean f13134u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f13135v;

    /* renamed from: x, reason: collision with root package name */
    androidx.appcompat.view.h f13137x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f13138y;

    /* renamed from: z, reason: collision with root package name */
    boolean f13139z;

    /* renamed from: i, reason: collision with root package name */
    private ArrayList f13122i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    private int f13123j = -1;

    /* renamed from: p, reason: collision with root package name */
    private ArrayList f13129p = new ArrayList();

    /* renamed from: r, reason: collision with root package name */
    private int f13131r = 0;

    /* renamed from: s, reason: collision with root package name */
    boolean f13132s = true;

    /* renamed from: w, reason: collision with root package name */
    private boolean f13136w = true;

    /* renamed from: A, reason: collision with root package name */
    final InterfaceC1506l0 f13111A = new a();

    /* renamed from: B, reason: collision with root package name */
    final InterfaceC1506l0 f13112B = new b();

    /* renamed from: C, reason: collision with root package name */
    final InterfaceC1510n0 f13113C = new c();

    class a extends AbstractC1508m0 {
        a() {
        }

        @Override // androidx.core.view.InterfaceC1506l0
        public void b(View view) {
            View view2;
            B b10 = B.this;
            if (b10.f13132s && (view2 = b10.f13121h) != null) {
                view2.setTranslationY(0.0f);
                B.this.f13118e.setTranslationY(0.0f);
            }
            B.this.f13118e.setVisibility(8);
            B.this.f13118e.setTransitioning(false);
            B b11 = B.this;
            b11.f13137x = null;
            b11.A();
            ActionBarOverlayLayout actionBarOverlayLayout = B.this.f13117d;
            if (actionBarOverlayLayout != null) {
                AbstractC1484a0.n0(actionBarOverlayLayout);
            }
        }
    }

    class b extends AbstractC1508m0 {
        b() {
        }

        @Override // androidx.core.view.InterfaceC1506l0
        public void b(View view) {
            B b10 = B.this;
            b10.f13137x = null;
            b10.f13118e.requestLayout();
        }
    }

    class c implements InterfaceC1510n0 {
        c() {
        }

        @Override // androidx.core.view.InterfaceC1510n0
        public void a(View view) {
            ((View) B.this.f13118e.getParent()).invalidate();
        }
    }

    public class d extends androidx.appcompat.view.b implements e.a {

        /* renamed from: c, reason: collision with root package name */
        private final Context f13143c;

        /* renamed from: d, reason: collision with root package name */
        private final androidx.appcompat.view.menu.e f13144d;

        /* renamed from: e, reason: collision with root package name */
        private b.a f13145e;

        /* renamed from: f, reason: collision with root package name */
        private WeakReference f13146f;

        public d(Context context, b.a aVar) {
            this.f13143c = context;
            this.f13145e = aVar;
            androidx.appcompat.view.menu.e T10 = new androidx.appcompat.view.menu.e(context).T(1);
            this.f13144d = T10;
            T10.S(this);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            b.a aVar = this.f13145e;
            if (aVar != null) {
                return aVar.d(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            if (this.f13145e == null) {
                return;
            }
            k();
            B.this.f13120g.l();
        }

        @Override // androidx.appcompat.view.b
        public void c() {
            B b10 = B.this;
            if (b10.f13125l != this) {
                return;
            }
            if (B.z(b10.f13133t, b10.f13134u, false)) {
                this.f13145e.a(this);
            } else {
                B b11 = B.this;
                b11.f13126m = this;
                b11.f13127n = this.f13145e;
            }
            this.f13145e = null;
            B.this.y(false);
            B.this.f13120g.g();
            B b12 = B.this;
            b12.f13117d.setHideOnContentScrollEnabled(b12.f13139z);
            B.this.f13125l = null;
        }

        @Override // androidx.appcompat.view.b
        public View d() {
            WeakReference weakReference = this.f13146f;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        @Override // androidx.appcompat.view.b
        public Menu e() {
            return this.f13144d;
        }

        @Override // androidx.appcompat.view.b
        public MenuInflater f() {
            return new androidx.appcompat.view.g(this.f13143c);
        }

        @Override // androidx.appcompat.view.b
        public CharSequence g() {
            return B.this.f13120g.getSubtitle();
        }

        @Override // androidx.appcompat.view.b
        public CharSequence i() {
            return B.this.f13120g.getTitle();
        }

        @Override // androidx.appcompat.view.b
        public void k() {
            if (B.this.f13125l != this) {
                return;
            }
            this.f13144d.e0();
            try {
                this.f13145e.c(this, this.f13144d);
            } finally {
                this.f13144d.d0();
            }
        }

        @Override // androidx.appcompat.view.b
        public boolean l() {
            return B.this.f13120g.j();
        }

        @Override // androidx.appcompat.view.b
        public void m(View view) {
            B.this.f13120g.setCustomView(view);
            this.f13146f = new WeakReference(view);
        }

        @Override // androidx.appcompat.view.b
        public void n(int i10) {
            o(B.this.f13114a.getResources().getString(i10));
        }

        @Override // androidx.appcompat.view.b
        public void o(CharSequence charSequence) {
            B.this.f13120g.setSubtitle(charSequence);
        }

        @Override // androidx.appcompat.view.b
        public void q(int i10) {
            r(B.this.f13114a.getResources().getString(i10));
        }

        @Override // androidx.appcompat.view.b
        public void r(CharSequence charSequence) {
            B.this.f13120g.setTitle(charSequence);
        }

        @Override // androidx.appcompat.view.b
        public void s(boolean z10) {
            super.s(z10);
            B.this.f13120g.setTitleOptional(z10);
        }

        public boolean t() {
            this.f13144d.e0();
            try {
                return this.f13145e.b(this, this.f13144d);
            } finally {
                this.f13144d.d0();
            }
        }
    }

    public B(Activity activity, boolean z10) {
        this.f13116c = activity;
        View decorView = activity.getWindow().getDecorView();
        G(decorView);
        if (z10) {
            return;
        }
        this.f13121h = decorView.findViewById(R.id.content);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private J D(View view) {
        if (view instanceof J) {
            return (J) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Can't make a decor toolbar out of ");
        sb2.append(view != 0 ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb2.toString());
    }

    private void F() {
        if (this.f13135v) {
            this.f13135v = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f13117d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            O(false);
        }
    }

    private void G(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(AbstractC3175f.f33192q);
        this.f13117d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f13119f = D(view.findViewById(AbstractC3175f.f33176a));
        this.f13120g = (ActionBarContextView) view.findViewById(AbstractC3175f.f33182g);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(AbstractC3175f.f33178c);
        this.f13118e = actionBarContainer;
        J j10 = this.f13119f;
        if (j10 == null || this.f13120g == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f13114a = j10.getContext();
        boolean z10 = (this.f13119f.t() & 4) != 0;
        if (z10) {
            this.f13124k = true;
        }
        androidx.appcompat.view.a b10 = androidx.appcompat.view.a.b(this.f13114a);
        L(b10.a() || z10);
        J(b10.e());
        TypedArray obtainStyledAttributes = this.f13114a.obtainStyledAttributes(null, AbstractC3179j.f33362a, AbstractC3170a.f33068c, 0);
        if (obtainStyledAttributes.getBoolean(AbstractC3179j.f33412k, false)) {
            K(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(AbstractC3179j.f33402i, 0);
        if (dimensionPixelSize != 0) {
            I(dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    private void J(boolean z10) {
        this.f13130q = z10;
        if (z10) {
            this.f13118e.setTabContainer(null);
            this.f13119f.i(null);
        } else {
            this.f13119f.i(null);
            this.f13118e.setTabContainer(null);
        }
        boolean z11 = false;
        boolean z12 = E() == 2;
        this.f13119f.x(!this.f13130q && z12);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f13117d;
        if (!this.f13130q && z12) {
            z11 = true;
        }
        actionBarOverlayLayout.setHasNonEmbeddedTabs(z11);
    }

    private boolean M() {
        return this.f13118e.isLaidOut();
    }

    private void N() {
        if (this.f13135v) {
            return;
        }
        this.f13135v = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f13117d;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        O(false);
    }

    private void O(boolean z10) {
        if (z(this.f13133t, this.f13134u, this.f13135v)) {
            if (this.f13136w) {
                return;
            }
            this.f13136w = true;
            C(z10);
            return;
        }
        if (this.f13136w) {
            this.f13136w = false;
            B(z10);
        }
    }

    static boolean z(boolean z10, boolean z11, boolean z12) {
        if (z12) {
            return true;
        }
        return (z10 || z11) ? false : true;
    }

    void A() {
        b.a aVar = this.f13127n;
        if (aVar != null) {
            aVar.a(this.f13126m);
            this.f13126m = null;
            this.f13127n = null;
        }
    }

    public void B(boolean z10) {
        View view;
        androidx.appcompat.view.h hVar = this.f13137x;
        if (hVar != null) {
            hVar.a();
        }
        if (this.f13131r != 0 || (!this.f13138y && !z10)) {
            this.f13111A.b(null);
            return;
        }
        this.f13118e.setAlpha(1.0f);
        this.f13118e.setTransitioning(true);
        androidx.appcompat.view.h hVar2 = new androidx.appcompat.view.h();
        float f10 = -this.f13118e.getHeight();
        if (z10) {
            this.f13118e.getLocationInWindow(new int[]{0, 0});
            f10 -= r5[1];
        }
        C1504k0 m10 = AbstractC1484a0.e(this.f13118e).m(f10);
        m10.k(this.f13113C);
        hVar2.c(m10);
        if (this.f13132s && (view = this.f13121h) != null) {
            hVar2.c(AbstractC1484a0.e(view).m(f10));
        }
        hVar2.f(f13109D);
        hVar2.e(250L);
        hVar2.g(this.f13111A);
        this.f13137x = hVar2;
        hVar2.h();
    }

    public void C(boolean z10) {
        View view;
        View view2;
        androidx.appcompat.view.h hVar = this.f13137x;
        if (hVar != null) {
            hVar.a();
        }
        this.f13118e.setVisibility(0);
        if (this.f13131r == 0 && (this.f13138y || z10)) {
            this.f13118e.setTranslationY(0.0f);
            float f10 = -this.f13118e.getHeight();
            if (z10) {
                this.f13118e.getLocationInWindow(new int[]{0, 0});
                f10 -= r5[1];
            }
            this.f13118e.setTranslationY(f10);
            androidx.appcompat.view.h hVar2 = new androidx.appcompat.view.h();
            C1504k0 m10 = AbstractC1484a0.e(this.f13118e).m(0.0f);
            m10.k(this.f13113C);
            hVar2.c(m10);
            if (this.f13132s && (view2 = this.f13121h) != null) {
                view2.setTranslationY(f10);
                hVar2.c(AbstractC1484a0.e(this.f13121h).m(0.0f));
            }
            hVar2.f(f13110E);
            hVar2.e(250L);
            hVar2.g(this.f13112B);
            this.f13137x = hVar2;
            hVar2.h();
        } else {
            this.f13118e.setAlpha(1.0f);
            this.f13118e.setTranslationY(0.0f);
            if (this.f13132s && (view = this.f13121h) != null) {
                view.setTranslationY(0.0f);
            }
            this.f13112B.b(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f13117d;
        if (actionBarOverlayLayout != null) {
            AbstractC1484a0.n0(actionBarOverlayLayout);
        }
    }

    public int E() {
        return this.f13119f.n();
    }

    public void H(int i10, int i11) {
        int t10 = this.f13119f.t();
        if ((i11 & 4) != 0) {
            this.f13124k = true;
        }
        this.f13119f.k((i10 & i11) | ((~i11) & t10));
    }

    public void I(float f10) {
        AbstractC1484a0.y0(this.f13118e, f10);
    }

    public void K(boolean z10) {
        if (z10 && !this.f13117d.x()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.f13139z = z10;
        this.f13117d.setHideOnContentScrollEnabled(z10);
    }

    public void L(boolean z10) {
        this.f13119f.s(z10);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void a() {
        if (this.f13134u) {
            this.f13134u = false;
            O(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void b() {
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void c(boolean z10) {
        this.f13132s = z10;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void d() {
        if (this.f13134u) {
            return;
        }
        this.f13134u = true;
        O(true);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void e() {
        androidx.appcompat.view.h hVar = this.f13137x;
        if (hVar != null) {
            hVar.a();
            this.f13137x = null;
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void f(int i10) {
        this.f13131r = i10;
    }

    @Override // androidx.appcompat.app.AbstractC1397a
    public boolean h() {
        J j10 = this.f13119f;
        if (j10 == null || !j10.j()) {
            return false;
        }
        this.f13119f.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC1397a
    public void i(boolean z10) {
        if (z10 == this.f13128o) {
            return;
        }
        this.f13128o = z10;
        if (this.f13129p.size() <= 0) {
            return;
        }
        android.support.v4.media.session.b.a(this.f13129p.get(0));
        throw null;
    }

    @Override // androidx.appcompat.app.AbstractC1397a
    public int j() {
        return this.f13119f.t();
    }

    @Override // androidx.appcompat.app.AbstractC1397a
    public Context k() {
        if (this.f13115b == null) {
            TypedValue typedValue = new TypedValue();
            this.f13114a.getTheme().resolveAttribute(AbstractC3170a.f33070e, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                this.f13115b = new ContextThemeWrapper(this.f13114a, i10);
            } else {
                this.f13115b = this.f13114a;
            }
        }
        return this.f13115b;
    }

    @Override // androidx.appcompat.app.AbstractC1397a
    public void m(Configuration configuration) {
        J(androidx.appcompat.view.a.b(this.f13114a).e());
    }

    @Override // androidx.appcompat.app.AbstractC1397a
    public boolean o(int i10, KeyEvent keyEvent) {
        Menu e10;
        d dVar = this.f13125l;
        if (dVar == null || (e10 = dVar.e()) == null) {
            return false;
        }
        e10.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return e10.performShortcut(i10, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.AbstractC1397a
    public void r(boolean z10) {
        if (this.f13124k) {
            return;
        }
        s(z10);
    }

    @Override // androidx.appcompat.app.AbstractC1397a
    public void s(boolean z10) {
        H(z10 ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.AbstractC1397a
    public void t(Drawable drawable) {
        this.f13119f.w(drawable);
    }

    @Override // androidx.appcompat.app.AbstractC1397a
    public void u(boolean z10) {
        androidx.appcompat.view.h hVar;
        this.f13138y = z10;
        if (z10 || (hVar = this.f13137x) == null) {
            return;
        }
        hVar.a();
    }

    @Override // androidx.appcompat.app.AbstractC1397a
    public void v(CharSequence charSequence) {
        this.f13119f.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.AbstractC1397a
    public void w(CharSequence charSequence) {
        this.f13119f.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.AbstractC1397a
    public androidx.appcompat.view.b x(b.a aVar) {
        d dVar = this.f13125l;
        if (dVar != null) {
            dVar.c();
        }
        this.f13117d.setHideOnContentScrollEnabled(false);
        this.f13120g.k();
        d dVar2 = new d(this.f13120g.getContext(), aVar);
        if (!dVar2.t()) {
            return null;
        }
        this.f13125l = dVar2;
        dVar2.k();
        this.f13120g.h(dVar2);
        y(true);
        return dVar2;
    }

    public void y(boolean z10) {
        C1504k0 o10;
        C1504k0 f10;
        if (z10) {
            N();
        } else {
            F();
        }
        if (!M()) {
            if (z10) {
                this.f13119f.q(4);
                this.f13120g.setVisibility(0);
                return;
            } else {
                this.f13119f.q(0);
                this.f13120g.setVisibility(8);
                return;
            }
        }
        if (z10) {
            f10 = this.f13119f.o(4, 100L);
            o10 = this.f13120g.f(0, 200L);
        } else {
            o10 = this.f13119f.o(0, 200L);
            f10 = this.f13120g.f(8, 100L);
        }
        androidx.appcompat.view.h hVar = new androidx.appcompat.view.h();
        hVar.d(f10, o10);
        hVar.h();
    }

    public B(Dialog dialog) {
        G(dialog.getWindow().getDecorView());
    }
}
