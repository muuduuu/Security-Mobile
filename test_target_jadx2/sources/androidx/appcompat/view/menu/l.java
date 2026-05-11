package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.W;
import g.AbstractC3173d;
import g.AbstractC3176g;

/* loaded from: classes.dex */
final class l extends h implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, j, View.OnKeyListener {

    /* renamed from: v, reason: collision with root package name */
    private static final int f13560v = AbstractC3176g.f33214m;

    /* renamed from: b, reason: collision with root package name */
    private final Context f13561b;

    /* renamed from: c, reason: collision with root package name */
    private final e f13562c;

    /* renamed from: d, reason: collision with root package name */
    private final d f13563d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f13564e;

    /* renamed from: f, reason: collision with root package name */
    private final int f13565f;

    /* renamed from: g, reason: collision with root package name */
    private final int f13566g;

    /* renamed from: h, reason: collision with root package name */
    private final int f13567h;

    /* renamed from: i, reason: collision with root package name */
    final W f13568i;

    /* renamed from: l, reason: collision with root package name */
    private PopupWindow.OnDismissListener f13571l;

    /* renamed from: m, reason: collision with root package name */
    private View f13572m;

    /* renamed from: n, reason: collision with root package name */
    View f13573n;

    /* renamed from: o, reason: collision with root package name */
    private j.a f13574o;

    /* renamed from: p, reason: collision with root package name */
    ViewTreeObserver f13575p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f13576q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f13577r;

    /* renamed from: s, reason: collision with root package name */
    private int f13578s;

    /* renamed from: u, reason: collision with root package name */
    private boolean f13580u;

    /* renamed from: j, reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f13569j = new a();

    /* renamed from: k, reason: collision with root package name */
    private final View.OnAttachStateChangeListener f13570k = new b();

    /* renamed from: t, reason: collision with root package name */
    private int f13579t = 0;

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!l.this.a() || l.this.f13568i.B()) {
                return;
            }
            View view = l.this.f13573n;
            if (view == null || !view.isShown()) {
                l.this.dismiss();
            } else {
                l.this.f13568i.b();
            }
        }
    }

    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = l.this.f13575p;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    l.this.f13575p = view.getViewTreeObserver();
                }
                l lVar = l.this;
                lVar.f13575p.removeGlobalOnLayoutListener(lVar.f13569j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public l(Context context, e eVar, View view, int i10, int i11, boolean z10) {
        this.f13561b = context;
        this.f13562c = eVar;
        this.f13564e = z10;
        this.f13563d = new d(eVar, LayoutInflater.from(context), z10, f13560v);
        this.f13566g = i10;
        this.f13567h = i11;
        Resources resources = context.getResources();
        this.f13565f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(AbstractC3173d.f33102b));
        this.f13572m = view;
        this.f13568i = new W(context, null, i10, i11);
        eVar.c(this, context);
    }

    private boolean z() {
        View view;
        if (a()) {
            return true;
        }
        if (this.f13576q || (view = this.f13572m) == null) {
            return false;
        }
        this.f13573n = view;
        this.f13568i.K(this);
        this.f13568i.L(this);
        this.f13568i.J(true);
        View view2 = this.f13573n;
        boolean z10 = this.f13575p == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f13575p = viewTreeObserver;
        if (z10) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f13569j);
        }
        view2.addOnAttachStateChangeListener(this.f13570k);
        this.f13568i.D(view2);
        this.f13568i.G(this.f13579t);
        if (!this.f13577r) {
            this.f13578s = h.o(this.f13563d, null, this.f13561b, this.f13565f);
            this.f13577r = true;
        }
        this.f13568i.F(this.f13578s);
        this.f13568i.I(2);
        this.f13568i.H(n());
        this.f13568i.b();
        ListView j10 = this.f13568i.j();
        j10.setOnKeyListener(this);
        if (this.f13580u && this.f13562c.x() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f13561b).inflate(AbstractC3176g.f33213l, (ViewGroup) j10, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.f13562c.x());
            }
            frameLayout.setEnabled(false);
            j10.addHeaderView(frameLayout, null, false);
        }
        this.f13568i.p(this.f13563d);
        this.f13568i.b();
        return true;
    }

    @Override // l.InterfaceC3588e
    public boolean a() {
        return !this.f13576q && this.f13568i.a();
    }

    @Override // l.InterfaceC3588e
    public void b() {
        if (!z()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void c(e eVar, boolean z10) {
        if (eVar != this.f13562c) {
            return;
        }
        dismiss();
        j.a aVar = this.f13574o;
        if (aVar != null) {
            aVar.c(eVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void d(boolean z10) {
        this.f13577r = false;
        d dVar = this.f13563d;
        if (dVar != null) {
            dVar.notifyDataSetChanged();
        }
    }

    @Override // l.InterfaceC3588e
    public void dismiss() {
        if (a()) {
            this.f13568i.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void h(j.a aVar) {
        this.f13574o = aVar;
    }

    @Override // l.InterfaceC3588e
    public ListView j() {
        return this.f13568i.j();
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean k(m mVar) {
        if (mVar.hasVisibleItems()) {
            i iVar = new i(this.f13561b, mVar, this.f13573n, this.f13564e, this.f13566g, this.f13567h);
            iVar.j(this.f13574o);
            iVar.g(h.x(mVar));
            iVar.i(this.f13571l);
            this.f13571l = null;
            this.f13562c.e(false);
            int d10 = this.f13568i.d();
            int o10 = this.f13568i.o();
            if ((Gravity.getAbsoluteGravity(this.f13579t, this.f13572m.getLayoutDirection()) & 7) == 5) {
                d10 += this.f13572m.getWidth();
            }
            if (iVar.n(d10, o10)) {
                j.a aVar = this.f13574o;
                if (aVar == null) {
                    return true;
                }
                aVar.d(mVar);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.h
    public void l(e eVar) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f13576q = true;
        this.f13562c.close();
        ViewTreeObserver viewTreeObserver = this.f13575p;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f13575p = this.f13573n.getViewTreeObserver();
            }
            this.f13575p.removeGlobalOnLayoutListener(this.f13569j);
            this.f13575p = null;
        }
        this.f13573n.removeOnAttachStateChangeListener(this.f13570k);
        PopupWindow.OnDismissListener onDismissListener = this.f13571l;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i10 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.h
    public void p(View view) {
        this.f13572m = view;
    }

    @Override // androidx.appcompat.view.menu.h
    public void r(boolean z10) {
        this.f13563d.d(z10);
    }

    @Override // androidx.appcompat.view.menu.h
    public void s(int i10) {
        this.f13579t = i10;
    }

    @Override // androidx.appcompat.view.menu.h
    public void t(int i10) {
        this.f13568i.f(i10);
    }

    @Override // androidx.appcompat.view.menu.h
    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.f13571l = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.h
    public void v(boolean z10) {
        this.f13580u = z10;
    }

    @Override // androidx.appcompat.view.menu.h
    public void w(int i10) {
        this.f13568i.l(i10);
    }
}
