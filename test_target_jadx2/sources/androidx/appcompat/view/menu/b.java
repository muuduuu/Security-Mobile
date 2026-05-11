package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.V;
import androidx.appcompat.widget.W;
import androidx.core.view.AbstractC1518s;
import g.AbstractC3173d;
import g.AbstractC3176g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class b extends h implements j, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: B, reason: collision with root package name */
    private static final int f13429B = AbstractC3176g.f33206e;

    /* renamed from: A, reason: collision with root package name */
    boolean f13430A;

    /* renamed from: b, reason: collision with root package name */
    private final Context f13431b;

    /* renamed from: c, reason: collision with root package name */
    private final int f13432c;

    /* renamed from: d, reason: collision with root package name */
    private final int f13433d;

    /* renamed from: e, reason: collision with root package name */
    private final int f13434e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f13435f;

    /* renamed from: g, reason: collision with root package name */
    final Handler f13436g;

    /* renamed from: o, reason: collision with root package name */
    private View f13444o;

    /* renamed from: p, reason: collision with root package name */
    View f13445p;

    /* renamed from: r, reason: collision with root package name */
    private boolean f13447r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f13448s;

    /* renamed from: t, reason: collision with root package name */
    private int f13449t;

    /* renamed from: u, reason: collision with root package name */
    private int f13450u;

    /* renamed from: w, reason: collision with root package name */
    private boolean f13452w;

    /* renamed from: x, reason: collision with root package name */
    private j.a f13453x;

    /* renamed from: y, reason: collision with root package name */
    ViewTreeObserver f13454y;

    /* renamed from: z, reason: collision with root package name */
    private PopupWindow.OnDismissListener f13455z;

    /* renamed from: h, reason: collision with root package name */
    private final List f13437h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    final List f13438i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f13439j = new a();

    /* renamed from: k, reason: collision with root package name */
    private final View.OnAttachStateChangeListener f13440k = new ViewOnAttachStateChangeListenerC0245b();

    /* renamed from: l, reason: collision with root package name */
    private final V f13441l = new c();

    /* renamed from: m, reason: collision with root package name */
    private int f13442m = 0;

    /* renamed from: n, reason: collision with root package name */
    private int f13443n = 0;

    /* renamed from: v, reason: collision with root package name */
    private boolean f13451v = false;

    /* renamed from: q, reason: collision with root package name */
    private int f13446q = D();

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!b.this.a() || b.this.f13438i.size() <= 0 || ((d) b.this.f13438i.get(0)).f13463a.B()) {
                return;
            }
            View view = b.this.f13445p;
            if (view == null || !view.isShown()) {
                b.this.dismiss();
                return;
            }
            Iterator it = b.this.f13438i.iterator();
            while (it.hasNext()) {
                ((d) it.next()).f13463a.b();
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$b, reason: collision with other inner class name */
    class ViewOnAttachStateChangeListenerC0245b implements View.OnAttachStateChangeListener {
        ViewOnAttachStateChangeListenerC0245b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = b.this.f13454y;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    b.this.f13454y = view.getViewTreeObserver();
                }
                b bVar = b.this;
                bVar.f13454y.removeGlobalOnLayoutListener(bVar.f13439j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    class c implements V {

        class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f13459a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ MenuItem f13460b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ e f13461c;

            a(d dVar, MenuItem menuItem, e eVar) {
                this.f13459a = dVar;
                this.f13460b = menuItem;
                this.f13461c = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = this.f13459a;
                if (dVar != null) {
                    b.this.f13430A = true;
                    dVar.f13464b.e(false);
                    b.this.f13430A = false;
                }
                if (this.f13460b.isEnabled() && this.f13460b.hasSubMenu()) {
                    this.f13461c.M(this.f13460b, 4);
                }
            }
        }

        c() {
        }

        @Override // androidx.appcompat.widget.V
        public void e(e eVar, MenuItem menuItem) {
            b.this.f13436g.removeCallbacksAndMessages(null);
            int size = b.this.f13438i.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    i10 = -1;
                    break;
                } else if (eVar == ((d) b.this.f13438i.get(i10)).f13464b) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 == -1) {
                return;
            }
            int i11 = i10 + 1;
            b.this.f13436g.postAtTime(new a(i11 < b.this.f13438i.size() ? (d) b.this.f13438i.get(i11) : null, menuItem, eVar), eVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.V
        public void h(e eVar, MenuItem menuItem) {
            b.this.f13436g.removeCallbacksAndMessages(eVar);
        }
    }

    private static class d {

        /* renamed from: a, reason: collision with root package name */
        public final W f13463a;

        /* renamed from: b, reason: collision with root package name */
        public final e f13464b;

        /* renamed from: c, reason: collision with root package name */
        public final int f13465c;

        public d(W w10, e eVar, int i10) {
            this.f13463a = w10;
            this.f13464b = eVar;
            this.f13465c = i10;
        }

        public ListView a() {
            return this.f13463a.j();
        }
    }

    public b(Context context, View view, int i10, int i11, boolean z10) {
        this.f13431b = context;
        this.f13444o = view;
        this.f13433d = i10;
        this.f13434e = i11;
        this.f13435f = z10;
        Resources resources = context.getResources();
        this.f13432c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(AbstractC3173d.f33102b));
        this.f13436g = new Handler();
    }

    private int A(e eVar) {
        int size = this.f13438i.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (eVar == ((d) this.f13438i.get(i10)).f13464b) {
                return i10;
            }
        }
        return -1;
    }

    private MenuItem B(e eVar, e eVar2) {
        int size = eVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = eVar.getItem(i10);
            if (item.hasSubMenu() && eVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    private View C(d dVar, e eVar) {
        androidx.appcompat.view.menu.d dVar2;
        int i10;
        int firstVisiblePosition;
        MenuItem B10 = B(dVar.f13464b, eVar);
        if (B10 == null) {
            return null;
        }
        ListView a10 = dVar.a();
        ListAdapter adapter = a10.getAdapter();
        int i11 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i10 = headerViewListAdapter.getHeadersCount();
            dVar2 = (androidx.appcompat.view.menu.d) headerViewListAdapter.getWrappedAdapter();
        } else {
            dVar2 = (androidx.appcompat.view.menu.d) adapter;
            i10 = 0;
        }
        int count = dVar2.getCount();
        while (true) {
            if (i11 >= count) {
                i11 = -1;
                break;
            }
            if (B10 == dVar2.getItem(i11)) {
                break;
            }
            i11++;
        }
        if (i11 != -1 && (firstVisiblePosition = (i11 + i10) - a10.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < a10.getChildCount()) {
            return a10.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    private int D() {
        return this.f13444o.getLayoutDirection() == 1 ? 0 : 1;
    }

    private int E(int i10) {
        List list = this.f13438i;
        ListView a10 = ((d) list.get(list.size() - 1)).a();
        int[] iArr = new int[2];
        a10.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f13445p.getWindowVisibleDisplayFrame(rect);
        return this.f13446q == 1 ? (iArr[0] + a10.getWidth()) + i10 > rect.right ? 0 : 1 : iArr[0] - i10 < 0 ? 1 : 0;
    }

    private void F(e eVar) {
        d dVar;
        View view;
        int i10;
        int i11;
        int i12;
        LayoutInflater from = LayoutInflater.from(this.f13431b);
        androidx.appcompat.view.menu.d dVar2 = new androidx.appcompat.view.menu.d(eVar, from, this.f13435f, f13429B);
        if (!a() && this.f13451v) {
            dVar2.d(true);
        } else if (a()) {
            dVar2.d(h.x(eVar));
        }
        int o10 = h.o(dVar2, null, this.f13431b, this.f13432c);
        W z10 = z();
        z10.p(dVar2);
        z10.F(o10);
        z10.G(this.f13443n);
        if (this.f13438i.size() > 0) {
            List list = this.f13438i;
            dVar = (d) list.get(list.size() - 1);
            view = C(dVar, eVar);
        } else {
            dVar = null;
            view = null;
        }
        if (view != null) {
            z10.U(false);
            z10.R(null);
            int E10 = E(o10);
            boolean z11 = E10 == 1;
            this.f13446q = E10;
            if (Build.VERSION.SDK_INT >= 26) {
                z10.D(view);
                i11 = 0;
                i10 = 0;
            } else {
                int[] iArr = new int[2];
                this.f13444o.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.f13443n & 7) == 5) {
                    iArr[0] = iArr[0] + this.f13444o.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i10 = iArr2[0] - iArr[0];
                i11 = iArr2[1] - iArr[1];
            }
            if ((this.f13443n & 5) == 5) {
                if (!z11) {
                    o10 = view.getWidth();
                    i12 = i10 - o10;
                }
                i12 = i10 + o10;
            } else {
                if (z11) {
                    o10 = view.getWidth();
                    i12 = i10 + o10;
                }
                i12 = i10 - o10;
            }
            z10.f(i12);
            z10.M(true);
            z10.l(i11);
        } else {
            if (this.f13447r) {
                z10.f(this.f13449t);
            }
            if (this.f13448s) {
                z10.l(this.f13450u);
            }
            z10.H(n());
        }
        this.f13438i.add(new d(z10, eVar, this.f13446q));
        z10.b();
        ListView j10 = z10.j();
        j10.setOnKeyListener(this);
        if (dVar == null && this.f13452w && eVar.x() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(AbstractC3176g.f33213l, (ViewGroup) j10, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(eVar.x());
            j10.addHeaderView(frameLayout, null, false);
            z10.b();
        }
    }

    private W z() {
        W w10 = new W(this.f13431b, null, this.f13433d, this.f13434e);
        w10.T(this.f13441l);
        w10.L(this);
        w10.K(this);
        w10.D(this.f13444o);
        w10.G(this.f13443n);
        w10.J(true);
        w10.I(2);
        return w10;
    }

    @Override // l.InterfaceC3588e
    public boolean a() {
        return this.f13438i.size() > 0 && ((d) this.f13438i.get(0)).f13463a.a();
    }

    @Override // l.InterfaceC3588e
    public void b() {
        if (a()) {
            return;
        }
        Iterator it = this.f13437h.iterator();
        while (it.hasNext()) {
            F((e) it.next());
        }
        this.f13437h.clear();
        View view = this.f13444o;
        this.f13445p = view;
        if (view != null) {
            boolean z10 = this.f13454y == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f13454y = viewTreeObserver;
            if (z10) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f13439j);
            }
            this.f13445p.addOnAttachStateChangeListener(this.f13440k);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void c(e eVar, boolean z10) {
        int A10 = A(eVar);
        if (A10 < 0) {
            return;
        }
        int i10 = A10 + 1;
        if (i10 < this.f13438i.size()) {
            ((d) this.f13438i.get(i10)).f13464b.e(false);
        }
        d dVar = (d) this.f13438i.remove(A10);
        dVar.f13464b.P(this);
        if (this.f13430A) {
            dVar.f13463a.S(null);
            dVar.f13463a.E(0);
        }
        dVar.f13463a.dismiss();
        int size = this.f13438i.size();
        if (size > 0) {
            this.f13446q = ((d) this.f13438i.get(size - 1)).f13465c;
        } else {
            this.f13446q = D();
        }
        if (size != 0) {
            if (z10) {
                ((d) this.f13438i.get(0)).f13464b.e(false);
                return;
            }
            return;
        }
        dismiss();
        j.a aVar = this.f13453x;
        if (aVar != null) {
            aVar.c(eVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f13454y;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f13454y.removeGlobalOnLayoutListener(this.f13439j);
            }
            this.f13454y = null;
        }
        this.f13445p.removeOnAttachStateChangeListener(this.f13440k);
        this.f13455z.onDismiss();
    }

    @Override // androidx.appcompat.view.menu.j
    public void d(boolean z10) {
        Iterator it = this.f13438i.iterator();
        while (it.hasNext()) {
            h.y(((d) it.next()).a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // l.InterfaceC3588e
    public void dismiss() {
        int size = this.f13438i.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.f13438i.toArray(new d[size]);
            for (int i10 = size - 1; i10 >= 0; i10--) {
                d dVar = dVarArr[i10];
                if (dVar.f13463a.a()) {
                    dVar.f13463a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void h(j.a aVar) {
        this.f13453x = aVar;
    }

    @Override // l.InterfaceC3588e
    public ListView j() {
        if (this.f13438i.isEmpty()) {
            return null;
        }
        return ((d) this.f13438i.get(r0.size() - 1)).a();
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean k(m mVar) {
        for (d dVar : this.f13438i) {
            if (mVar == dVar.f13464b) {
                dVar.a().requestFocus();
                return true;
            }
        }
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        l(mVar);
        j.a aVar = this.f13453x;
        if (aVar != null) {
            aVar.d(mVar);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.h
    public void l(e eVar) {
        eVar.c(this, this.f13431b);
        if (a()) {
            F(eVar);
        } else {
            this.f13437h.add(eVar);
        }
    }

    @Override // androidx.appcompat.view.menu.h
    protected boolean m() {
        return false;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        d dVar;
        int size = this.f13438i.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                dVar = null;
                break;
            }
            dVar = (d) this.f13438i.get(i10);
            if (!dVar.f13463a.a()) {
                break;
            } else {
                i10++;
            }
        }
        if (dVar != null) {
            dVar.f13464b.e(false);
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
        if (this.f13444o != view) {
            this.f13444o = view;
            this.f13443n = AbstractC1518s.b(this.f13442m, view.getLayoutDirection());
        }
    }

    @Override // androidx.appcompat.view.menu.h
    public void r(boolean z10) {
        this.f13451v = z10;
    }

    @Override // androidx.appcompat.view.menu.h
    public void s(int i10) {
        if (this.f13442m != i10) {
            this.f13442m = i10;
            this.f13443n = AbstractC1518s.b(i10, this.f13444o.getLayoutDirection());
        }
    }

    @Override // androidx.appcompat.view.menu.h
    public void t(int i10) {
        this.f13447r = true;
        this.f13449t = i10;
    }

    @Override // androidx.appcompat.view.menu.h
    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.f13455z = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.h
    public void v(boolean z10) {
        this.f13452w = z10;
    }

    @Override // androidx.appcompat.view.menu.h
    public void w(int i10) {
        this.f13448s = true;
        this.f13450u = i10;
    }
}
