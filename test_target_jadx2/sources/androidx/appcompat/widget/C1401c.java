package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.AbstractC1485b;
import g.AbstractC3170a;
import g.AbstractC3176g;
import java.util.ArrayList;
import l.InterfaceC3588e;

/* renamed from: androidx.appcompat.widget.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C1401c extends androidx.appcompat.view.menu.a implements AbstractC1485b.a {

    /* renamed from: A, reason: collision with root package name */
    RunnableC0247c f14045A;

    /* renamed from: B, reason: collision with root package name */
    private b f14046B;

    /* renamed from: C, reason: collision with root package name */
    final f f14047C;

    /* renamed from: D, reason: collision with root package name */
    int f14048D;

    /* renamed from: k, reason: collision with root package name */
    d f14049k;

    /* renamed from: l, reason: collision with root package name */
    private Drawable f14050l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f14051m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f14052n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f14053o;

    /* renamed from: p, reason: collision with root package name */
    private int f14054p;

    /* renamed from: q, reason: collision with root package name */
    private int f14055q;

    /* renamed from: r, reason: collision with root package name */
    private int f14056r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f14057s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f14058t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f14059u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f14060v;

    /* renamed from: w, reason: collision with root package name */
    private int f14061w;

    /* renamed from: x, reason: collision with root package name */
    private final SparseBooleanArray f14062x;

    /* renamed from: y, reason: collision with root package name */
    e f14063y;

    /* renamed from: z, reason: collision with root package name */
    a f14064z;

    /* renamed from: androidx.appcompat.widget.c$a */
    private class a extends androidx.appcompat.view.menu.i {
        public a(Context context, androidx.appcompat.view.menu.m mVar, View view) {
            super(context, mVar, view, false, AbstractC3170a.f33074i);
            if (!((androidx.appcompat.view.menu.g) mVar.getItem()).l()) {
                View view2 = C1401c.this.f14049k;
                f(view2 == null ? (View) ((androidx.appcompat.view.menu.a) C1401c.this).f13427i : view2);
            }
            j(C1401c.this.f14047C);
        }

        @Override // androidx.appcompat.view.menu.i
        protected void e() {
            C1401c c1401c = C1401c.this;
            c1401c.f14064z = null;
            c1401c.f14048D = 0;
            super.e();
        }
    }

    /* renamed from: androidx.appcompat.widget.c$b */
    private class b extends ActionMenuItemView.b {
        b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.b
        public InterfaceC3588e a() {
            a aVar = C1401c.this.f14064z;
            if (aVar != null) {
                return aVar.c();
            }
            return null;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$c, reason: collision with other inner class name */
    private class RunnableC0247c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private e f14067a;

        public RunnableC0247c(e eVar) {
            this.f14067a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((androidx.appcompat.view.menu.a) C1401c.this).f13421c != null) {
                ((androidx.appcompat.view.menu.a) C1401c.this).f13421c.d();
            }
            View view = (View) ((androidx.appcompat.view.menu.a) C1401c.this).f13427i;
            if (view != null && view.getWindowToken() != null && this.f14067a.m()) {
                C1401c.this.f14063y = this.f14067a;
            }
            C1401c.this.f14045A = null;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$d */
    private class d extends r implements ActionMenuView.a {

        /* renamed from: androidx.appcompat.widget.c$d$a */
        class a extends S {

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ C1401c f14070j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(View view, C1401c c1401c) {
                super(view);
                this.f14070j = c1401c;
            }

            @Override // androidx.appcompat.widget.S
            public InterfaceC3588e b() {
                e eVar = C1401c.this.f14063y;
                if (eVar == null) {
                    return null;
                }
                return eVar.c();
            }

            @Override // androidx.appcompat.widget.S
            public boolean c() {
                C1401c.this.K();
                return true;
            }

            @Override // androidx.appcompat.widget.S
            public boolean d() {
                C1401c c1401c = C1401c.this;
                if (c1401c.f14045A != null) {
                    return false;
                }
                c1401c.B();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, AbstractC3170a.f33073h);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            m0.a(this, getContentDescription());
            setOnTouchListener(new a(this, C1401c.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean b() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            C1401c.this.K();
            return true;
        }

        @Override // android.widget.ImageView
        protected boolean setFrame(int i10, int i11, int i12, int i13) {
            boolean frame = super.setFrame(i10, i11, i12, i13);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                androidx.core.graphics.drawable.a.f(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$e */
    private class e extends androidx.appcompat.view.menu.i {
        public e(Context context, androidx.appcompat.view.menu.e eVar, View view, boolean z10) {
            super(context, eVar, view, z10, AbstractC3170a.f33074i);
            h(8388613);
            j(C1401c.this.f14047C);
        }

        @Override // androidx.appcompat.view.menu.i
        protected void e() {
            if (((androidx.appcompat.view.menu.a) C1401c.this).f13421c != null) {
                ((androidx.appcompat.view.menu.a) C1401c.this).f13421c.close();
            }
            C1401c.this.f14063y = null;
            super.e();
        }
    }

    /* renamed from: androidx.appcompat.widget.c$f */
    private class f implements j.a {
        f() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void c(androidx.appcompat.view.menu.e eVar, boolean z10) {
            if (eVar instanceof androidx.appcompat.view.menu.m) {
                eVar.D().e(false);
            }
            j.a m10 = C1401c.this.m();
            if (m10 != null) {
                m10.c(eVar, z10);
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean d(androidx.appcompat.view.menu.e eVar) {
            if (eVar == ((androidx.appcompat.view.menu.a) C1401c.this).f13421c) {
                return false;
            }
            C1401c.this.f14048D = ((androidx.appcompat.view.menu.m) eVar).getItem().getItemId();
            j.a m10 = C1401c.this.m();
            if (m10 != null) {
                return m10.d(eVar);
            }
            return false;
        }
    }

    public C1401c(Context context) {
        super(context, AbstractC3176g.f33204c, AbstractC3176g.f33203b);
        this.f14062x = new SparseBooleanArray();
        this.f14047C = new f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private View z(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f13427i;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if ((childAt instanceof k.a) && ((k.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public Drawable A() {
        d dVar = this.f14049k;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f14051m) {
            return this.f14050l;
        }
        return null;
    }

    public boolean B() {
        Object obj;
        RunnableC0247c runnableC0247c = this.f14045A;
        if (runnableC0247c != null && (obj = this.f13427i) != null) {
            ((View) obj).removeCallbacks(runnableC0247c);
            this.f14045A = null;
            return true;
        }
        e eVar = this.f14063y;
        if (eVar == null) {
            return false;
        }
        eVar.b();
        return true;
    }

    public boolean C() {
        a aVar = this.f14064z;
        if (aVar == null) {
            return false;
        }
        aVar.b();
        return true;
    }

    public boolean D() {
        return this.f14045A != null || E();
    }

    public boolean E() {
        e eVar = this.f14063y;
        return eVar != null && eVar.d();
    }

    public void F(Configuration configuration) {
        if (!this.f14057s) {
            this.f14056r = androidx.appcompat.view.a.b(this.f13420b).d();
        }
        androidx.appcompat.view.menu.e eVar = this.f13421c;
        if (eVar != null) {
            eVar.L(true);
        }
    }

    public void G(boolean z10) {
        this.f14060v = z10;
    }

    public void H(ActionMenuView actionMenuView) {
        this.f13427i = actionMenuView;
        actionMenuView.b(this.f13421c);
    }

    public void I(Drawable drawable) {
        d dVar = this.f14049k;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
        } else {
            this.f14051m = true;
            this.f14050l = drawable;
        }
    }

    public void J(boolean z10) {
        this.f14052n = z10;
        this.f14053o = true;
    }

    public boolean K() {
        androidx.appcompat.view.menu.e eVar;
        if (!this.f14052n || E() || (eVar = this.f13421c) == null || this.f13427i == null || this.f14045A != null || eVar.z().isEmpty()) {
            return false;
        }
        RunnableC0247c runnableC0247c = new RunnableC0247c(new e(this.f13420b, this.f13421c, this.f14049k, true));
        this.f14045A = runnableC0247c;
        ((View) this.f13427i).post(runnableC0247c);
        return true;
    }

    @Override // androidx.appcompat.view.menu.a
    public void b(androidx.appcompat.view.menu.g gVar, k.a aVar) {
        aVar.e(gVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f13427i);
        if (this.f14046B == null) {
            this.f14046B = new b();
        }
        actionMenuItemView.setPopupCallback(this.f14046B);
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void c(androidx.appcompat.view.menu.e eVar, boolean z10) {
        y();
        super.c(eVar, z10);
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void d(boolean z10) {
        super.d(z10);
        ((View) this.f13427i).requestLayout();
        androidx.appcompat.view.menu.e eVar = this.f13421c;
        boolean z11 = false;
        if (eVar != null) {
            ArrayList s10 = eVar.s();
            int size = s10.size();
            for (int i10 = 0; i10 < size; i10++) {
                AbstractC1485b b10 = ((androidx.appcompat.view.menu.g) s10.get(i10)).b();
                if (b10 != null) {
                    b10.h(this);
                }
            }
        }
        androidx.appcompat.view.menu.e eVar2 = this.f13421c;
        ArrayList z12 = eVar2 != null ? eVar2.z() : null;
        if (this.f14052n && z12 != null) {
            int size2 = z12.size();
            if (size2 == 1) {
                z11 = !((androidx.appcompat.view.menu.g) z12.get(0)).isActionViewExpanded();
            } else if (size2 > 0) {
                z11 = true;
            }
        }
        if (z11) {
            if (this.f14049k == null) {
                this.f14049k = new d(this.f13419a);
            }
            ViewGroup viewGroup = (ViewGroup) this.f14049k.getParent();
            if (viewGroup != this.f13427i) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f14049k);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f13427i;
                actionMenuView.addView(this.f14049k, actionMenuView.F());
            }
        } else {
            d dVar = this.f14049k;
            if (dVar != null) {
                Object parent = dVar.getParent();
                Object obj = this.f13427i;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f14049k);
                }
            }
        }
        ((ActionMenuView) this.f13427i).setOverflowReserved(this.f14052n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12 */
    @Override // androidx.appcompat.view.menu.j
    public boolean e() {
        ArrayList arrayList;
        int i10;
        int i11;
        int i12;
        boolean z10;
        int i13;
        C1401c c1401c = this;
        androidx.appcompat.view.menu.e eVar = c1401c.f13421c;
        View view = null;
        ?? r32 = 0;
        if (eVar != null) {
            arrayList = eVar.E();
            i10 = arrayList.size();
        } else {
            arrayList = null;
            i10 = 0;
        }
        int i14 = c1401c.f14056r;
        int i15 = c1401c.f14055q;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) c1401c.f13427i;
        boolean z11 = false;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < i10; i18++) {
            androidx.appcompat.view.menu.g gVar = (androidx.appcompat.view.menu.g) arrayList.get(i18);
            if (gVar.o()) {
                i16++;
            } else if (gVar.n()) {
                i17++;
            } else {
                z11 = true;
            }
            if (c1401c.f14060v && gVar.isActionViewExpanded()) {
                i14 = 0;
            }
        }
        if (c1401c.f14052n && (z11 || i17 + i16 > i14)) {
            i14--;
        }
        int i19 = i14 - i16;
        SparseBooleanArray sparseBooleanArray = c1401c.f14062x;
        sparseBooleanArray.clear();
        if (c1401c.f14058t) {
            int i20 = c1401c.f14061w;
            i12 = i15 / i20;
            i11 = i20 + ((i15 % i20) / i12);
        } else {
            i11 = 0;
            i12 = 0;
        }
        int i21 = 0;
        int i22 = 0;
        while (i21 < i10) {
            androidx.appcompat.view.menu.g gVar2 = (androidx.appcompat.view.menu.g) arrayList.get(i21);
            if (gVar2.o()) {
                View n10 = c1401c.n(gVar2, view, viewGroup);
                if (c1401c.f14058t) {
                    i12 -= ActionMenuView.L(n10, i11, i12, makeMeasureSpec, r32);
                } else {
                    n10.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = n10.getMeasuredWidth();
                i15 -= measuredWidth;
                if (i22 == 0) {
                    i22 = measuredWidth;
                }
                int groupId = gVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                gVar2.u(true);
                z10 = r32;
                i13 = i10;
            } else if (gVar2.n()) {
                int groupId2 = gVar2.getGroupId();
                boolean z12 = sparseBooleanArray.get(groupId2);
                boolean z13 = (i19 > 0 || z12) && i15 > 0 && (!c1401c.f14058t || i12 > 0);
                boolean z14 = z13;
                i13 = i10;
                if (z13) {
                    View n11 = c1401c.n(gVar2, null, viewGroup);
                    if (c1401c.f14058t) {
                        int L10 = ActionMenuView.L(n11, i11, i12, makeMeasureSpec, 0);
                        i12 -= L10;
                        if (L10 == 0) {
                            z14 = false;
                        }
                    } else {
                        n11.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    boolean z15 = z14;
                    int measuredWidth2 = n11.getMeasuredWidth();
                    i15 -= measuredWidth2;
                    if (i22 == 0) {
                        i22 = measuredWidth2;
                    }
                    z13 = z15 & (!c1401c.f14058t ? i15 + i22 <= 0 : i15 < 0);
                }
                if (z13 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z12) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i23 = 0; i23 < i21; i23++) {
                        androidx.appcompat.view.menu.g gVar3 = (androidx.appcompat.view.menu.g) arrayList.get(i23);
                        if (gVar3.getGroupId() == groupId2) {
                            if (gVar3.l()) {
                                i19++;
                            }
                            gVar3.u(false);
                        }
                    }
                }
                if (z13) {
                    i19--;
                }
                gVar2.u(z13);
                z10 = false;
            } else {
                z10 = r32;
                i13 = i10;
                gVar2.u(z10);
            }
            i21++;
            r32 = z10;
            i10 = i13;
            view = null;
            c1401c = this;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void i(Context context, androidx.appcompat.view.menu.e eVar) {
        super.i(context, eVar);
        Resources resources = context.getResources();
        androidx.appcompat.view.a b10 = androidx.appcompat.view.a.b(context);
        if (!this.f14053o) {
            this.f14052n = b10.f();
        }
        if (!this.f14059u) {
            this.f14054p = b10.c();
        }
        if (!this.f14057s) {
            this.f14056r = b10.d();
        }
        int i10 = this.f14054p;
        if (this.f14052n) {
            if (this.f14049k == null) {
                d dVar = new d(this.f13419a);
                this.f14049k = dVar;
                if (this.f14051m) {
                    dVar.setImageDrawable(this.f14050l);
                    this.f14050l = null;
                    this.f14051m = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f14049k.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i10 -= this.f14049k.getMeasuredWidth();
        } else {
            this.f14049k = null;
        }
        this.f14055q = i10;
        this.f14061w = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public boolean k(androidx.appcompat.view.menu.m mVar) {
        boolean z10 = false;
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        androidx.appcompat.view.menu.m mVar2 = mVar;
        while (mVar2.f0() != this.f13421c) {
            mVar2 = (androidx.appcompat.view.menu.m) mVar2.f0();
        }
        View z11 = z(mVar2.getItem());
        if (z11 == null) {
            return false;
        }
        this.f14048D = mVar.getItem().getItemId();
        int size = mVar.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            MenuItem item = mVar.getItem(i10);
            if (item.isVisible() && item.getIcon() != null) {
                z10 = true;
                break;
            }
            i10++;
        }
        a aVar = new a(this.f13420b, mVar, z11);
        this.f14064z = aVar;
        aVar.g(z10);
        this.f14064z.k();
        super.k(mVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean l(ViewGroup viewGroup, int i10) {
        if (viewGroup.getChildAt(i10) == this.f14049k) {
            return false;
        }
        return super.l(viewGroup, i10);
    }

    @Override // androidx.appcompat.view.menu.a
    public View n(androidx.appcompat.view.menu.g gVar, View view, ViewGroup viewGroup) {
        View actionView = gVar.getActionView();
        if (actionView == null || gVar.j()) {
            actionView = super.n(gVar, view, viewGroup);
        }
        actionView.setVisibility(gVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.a
    public androidx.appcompat.view.menu.k o(ViewGroup viewGroup) {
        androidx.appcompat.view.menu.k kVar = this.f13427i;
        androidx.appcompat.view.menu.k o10 = super.o(viewGroup);
        if (kVar != o10) {
            ((ActionMenuView) o10).setPresenter(this);
        }
        return o10;
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean q(int i10, androidx.appcompat.view.menu.g gVar) {
        return gVar.l();
    }

    public boolean y() {
        return B() | C();
    }
}
