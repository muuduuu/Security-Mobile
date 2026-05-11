package androidx.viewpager2.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.AbstractC1484a0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import u1.AbstractC4861a;
import z0.C5228A;
import z0.InterfaceC5231D;

/* loaded from: classes.dex */
public final class f extends ViewGroup {

    /* renamed from: u, reason: collision with root package name */
    static boolean f18042u = true;

    /* renamed from: a, reason: collision with root package name */
    private final Rect f18043a;

    /* renamed from: b, reason: collision with root package name */
    private final Rect f18044b;

    /* renamed from: c, reason: collision with root package name */
    private androidx.viewpager2.widget.b f18045c;

    /* renamed from: d, reason: collision with root package name */
    int f18046d;

    /* renamed from: e, reason: collision with root package name */
    boolean f18047e;

    /* renamed from: f, reason: collision with root package name */
    private RecyclerView.j f18048f;

    /* renamed from: g, reason: collision with root package name */
    LinearLayoutManager f18049g;

    /* renamed from: h, reason: collision with root package name */
    private int f18050h;

    /* renamed from: i, reason: collision with root package name */
    private Parcelable f18051i;

    /* renamed from: j, reason: collision with root package name */
    RecyclerView f18052j;

    /* renamed from: k, reason: collision with root package name */
    private androidx.recyclerview.widget.k f18053k;

    /* renamed from: l, reason: collision with root package name */
    androidx.viewpager2.widget.e f18054l;

    /* renamed from: m, reason: collision with root package name */
    private androidx.viewpager2.widget.b f18055m;

    /* renamed from: n, reason: collision with root package name */
    private androidx.viewpager2.widget.c f18056n;

    /* renamed from: o, reason: collision with root package name */
    private androidx.viewpager2.widget.d f18057o;

    /* renamed from: p, reason: collision with root package name */
    private RecyclerView.m f18058p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f18059q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f18060r;

    /* renamed from: s, reason: collision with root package name */
    private int f18061s;

    /* renamed from: t, reason: collision with root package name */
    e f18062t;

    class a extends g {
        a() {
            super(null);
        }

        @Override // androidx.viewpager2.widget.f.g, androidx.recyclerview.widget.RecyclerView.j
        public void a() {
            f fVar = f.this;
            fVar.f18047e = true;
            fVar.f18054l.l();
        }
    }

    class b extends i {
        b() {
        }

        @Override // androidx.viewpager2.widget.f.i
        public void a(int i10) {
            if (i10 == 0) {
                f.this.n();
            }
        }

        @Override // androidx.viewpager2.widget.f.i
        public void c(int i10) {
            f fVar = f.this;
            if (fVar.f18046d != i10) {
                fVar.f18046d = i10;
                fVar.f18062t.r();
            }
        }
    }

    class c extends i {
        c() {
        }

        @Override // androidx.viewpager2.widget.f.i
        public void c(int i10) {
            f.this.clearFocus();
            if (f.this.hasFocus()) {
                f.this.f18052j.requestFocus(2);
            }
        }
    }

    class d implements RecyclerView.r {
        d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public void a(View view) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public void b(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            if (((ViewGroup.MarginLayoutParams) qVar).width != -1 || ((ViewGroup.MarginLayoutParams) qVar).height != -1) {
                throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
            }
        }
    }

    private abstract class e {
        private e() {
        }

        boolean a() {
            return false;
        }

        boolean b(int i10) {
            return false;
        }

        boolean c(int i10, Bundle bundle) {
            return false;
        }

        boolean d() {
            return false;
        }

        void e(RecyclerView.h hVar) {
        }

        void f(RecyclerView.h hVar) {
        }

        String g() {
            throw new IllegalStateException("Not implemented.");
        }

        void h(androidx.viewpager2.widget.b bVar, RecyclerView recyclerView) {
        }

        void i(AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        boolean l(int i10) {
            throw new IllegalStateException("Not implemented.");
        }

        boolean m(int i10, Bundle bundle) {
            throw new IllegalStateException("Not implemented.");
        }

        void n() {
        }

        CharSequence o() {
            throw new IllegalStateException("Not implemented.");
        }

        void p(AccessibilityEvent accessibilityEvent) {
        }

        void q() {
        }

        void r() {
        }

        void s() {
        }

        void t() {
        }

        /* synthetic */ e(f fVar, a aVar) {
            this();
        }

        void j(C5228A c5228a) {
        }

        void k(View view, C5228A c5228a) {
        }
    }

    /* renamed from: androidx.viewpager2.widget.f$f, reason: collision with other inner class name */
    class C0310f extends e {
        C0310f() {
            super(f.this, null);
        }

        @Override // androidx.viewpager2.widget.f.e
        public boolean b(int i10) {
            return (i10 == 8192 || i10 == 4096) && !f.this.e();
        }

        @Override // androidx.viewpager2.widget.f.e
        public boolean d() {
            return true;
        }

        @Override // androidx.viewpager2.widget.f.e
        public void j(C5228A c5228a) {
            if (f.this.e()) {
                return;
            }
            c5228a.i0(C5228A.a.f45636r);
            c5228a.i0(C5228A.a.f45635q);
            c5228a.M0(false);
        }

        @Override // androidx.viewpager2.widget.f.e
        public boolean l(int i10) {
            if (b(i10)) {
                return false;
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.f.e
        public CharSequence o() {
            if (d()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }
    }

    private static abstract class g extends RecyclerView.j {
        private g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public abstract void a();

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void b(int i10, int i11, Object obj) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void c(int i10, int i11) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void d(int i10, int i11) {
            a();
        }

        /* synthetic */ g(a aVar) {
            this();
        }
    }

    private class h extends LinearLayoutManager {
        h(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public void M0(RecyclerView.w wVar, RecyclerView.B b10, C5228A c5228a) {
            super.M0(wVar, b10, c5228a);
            f.this.f18062t.j(c5228a);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        protected void M1(RecyclerView.B b10, int[] iArr) {
            int offscreenPageLimit = f.this.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.M1(b10, iArr);
                return;
            }
            int pageSize = f.this.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public void P0(RecyclerView.w wVar, RecyclerView.B b10, View view, C5228A c5228a) {
            f.this.f18062t.k(view, c5228a);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public boolean h1(RecyclerView.w wVar, RecyclerView.B b10, int i10, Bundle bundle) {
            return f.this.f18062t.b(i10) ? f.this.f18062t.l(i10) : super.h1(wVar, b10, i10, bundle);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public boolean s1(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
            return false;
        }
    }

    public static abstract class i {
        public void a(int i10) {
        }

        public void b(int i10, float f10, int i11) {
        }

        public void c(int i10) {
        }
    }

    class j extends e {

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC5231D f18070b;

        /* renamed from: c, reason: collision with root package name */
        private final InterfaceC5231D f18071c;

        /* renamed from: d, reason: collision with root package name */
        private RecyclerView.j f18072d;

        class a implements InterfaceC5231D {
            a() {
            }

            @Override // z0.InterfaceC5231D
            public boolean a(View view, InterfaceC5231D.a aVar) {
                j.this.x(((f) view).getCurrentItem() + 1);
                return true;
            }
        }

        class b implements InterfaceC5231D {
            b() {
            }

            @Override // z0.InterfaceC5231D
            public boolean a(View view, InterfaceC5231D.a aVar) {
                j.this.x(((f) view).getCurrentItem() - 1);
                return true;
            }
        }

        class c extends g {
            c() {
                super(null);
            }

            @Override // androidx.viewpager2.widget.f.g, androidx.recyclerview.widget.RecyclerView.j
            public void a() {
                j.this.y();
            }
        }

        j() {
            super(f.this, null);
            this.f18070b = new a();
            this.f18071c = new b();
        }

        private void u(C5228A c5228a) {
            int i10;
            int i11;
            if (f.this.getAdapter() != null) {
                i11 = 1;
                if (f.this.getOrientation() == 1) {
                    i11 = f.this.getAdapter().e();
                    i10 = 1;
                } else {
                    i10 = f.this.getAdapter().e();
                }
            } else {
                i10 = 0;
                i11 = 0;
            }
            c5228a.s0(C5228A.e.b(i11, i10, false, 0));
        }

        private void v(View view, C5228A c5228a) {
            c5228a.t0(C5228A.f.b(f.this.getOrientation() == 1 ? f.this.f18049g.h0(view) : 0, 1, f.this.getOrientation() == 0 ? f.this.f18049g.h0(view) : 0, 1, false, false));
        }

        private void w(C5228A c5228a) {
            int e10;
            RecyclerView.h adapter = f.this.getAdapter();
            if (adapter == null || (e10 = adapter.e()) == 0 || !f.this.e()) {
                return;
            }
            if (f.this.f18046d > 0) {
                c5228a.a(8192);
            }
            if (f.this.f18046d < e10 - 1) {
                c5228a.a(4096);
            }
            c5228a.M0(true);
        }

        @Override // androidx.viewpager2.widget.f.e
        public boolean a() {
            return true;
        }

        @Override // androidx.viewpager2.widget.f.e
        public boolean c(int i10, Bundle bundle) {
            return i10 == 8192 || i10 == 4096;
        }

        @Override // androidx.viewpager2.widget.f.e
        public void e(RecyclerView.h hVar) {
            y();
            if (hVar != null) {
                hVar.x(this.f18072d);
            }
        }

        @Override // androidx.viewpager2.widget.f.e
        public void f(RecyclerView.h hVar) {
            if (hVar != null) {
                hVar.z(this.f18072d);
            }
        }

        @Override // androidx.viewpager2.widget.f.e
        public String g() {
            if (a()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.f.e
        public void h(androidx.viewpager2.widget.b bVar, RecyclerView recyclerView) {
            recyclerView.setImportantForAccessibility(2);
            this.f18072d = new c();
            if (f.this.getImportantForAccessibility() == 0) {
                f.this.setImportantForAccessibility(1);
            }
        }

        @Override // androidx.viewpager2.widget.f.e
        public void i(AccessibilityNodeInfo accessibilityNodeInfo) {
            C5228A Y02 = C5228A.Y0(accessibilityNodeInfo);
            u(Y02);
            w(Y02);
        }

        @Override // androidx.viewpager2.widget.f.e
        void k(View view, C5228A c5228a) {
            v(view, c5228a);
        }

        @Override // androidx.viewpager2.widget.f.e
        public boolean m(int i10, Bundle bundle) {
            if (!c(i10, bundle)) {
                throw new IllegalStateException();
            }
            x(i10 == 8192 ? f.this.getCurrentItem() - 1 : f.this.getCurrentItem() + 1);
            return true;
        }

        @Override // androidx.viewpager2.widget.f.e
        public void n() {
            y();
        }

        @Override // androidx.viewpager2.widget.f.e
        public void p(AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setSource(f.this);
            accessibilityEvent.setClassName(g());
        }

        @Override // androidx.viewpager2.widget.f.e
        public void q() {
            y();
        }

        @Override // androidx.viewpager2.widget.f.e
        public void r() {
            y();
        }

        @Override // androidx.viewpager2.widget.f.e
        public void s() {
            y();
        }

        @Override // androidx.viewpager2.widget.f.e
        public void t() {
            y();
        }

        void x(int i10) {
            if (f.this.e()) {
                f.this.k(i10, true);
            }
        }

        void y() {
            int e10;
            f fVar = f.this;
            int i10 = R.id.accessibilityActionPageLeft;
            AbstractC1484a0.k0(fVar, R.id.accessibilityActionPageLeft);
            AbstractC1484a0.k0(fVar, R.id.accessibilityActionPageRight);
            AbstractC1484a0.k0(fVar, R.id.accessibilityActionPageUp);
            AbstractC1484a0.k0(fVar, R.id.accessibilityActionPageDown);
            if (f.this.getAdapter() == null || (e10 = f.this.getAdapter().e()) == 0 || !f.this.e()) {
                return;
            }
            if (f.this.getOrientation() != 0) {
                if (f.this.f18046d < e10 - 1) {
                    AbstractC1484a0.m0(fVar, new C5228A.a(R.id.accessibilityActionPageDown, null), null, this.f18070b);
                }
                if (f.this.f18046d > 0) {
                    AbstractC1484a0.m0(fVar, new C5228A.a(R.id.accessibilityActionPageUp, null), null, this.f18071c);
                    return;
                }
                return;
            }
            boolean d10 = f.this.d();
            int i11 = d10 ? 16908360 : 16908361;
            if (d10) {
                i10 = 16908361;
            }
            if (f.this.f18046d < e10 - 1) {
                AbstractC1484a0.m0(fVar, new C5228A.a(i11, null), null, this.f18070b);
            }
            if (f.this.f18046d > 0) {
                AbstractC1484a0.m0(fVar, new C5228A.a(i10, null), null, this.f18071c);
            }
        }
    }

    public interface k {
        void a(View view, float f10);
    }

    private class l extends androidx.recyclerview.widget.k {
        l() {
        }

        @Override // androidx.recyclerview.widget.k, androidx.recyclerview.widget.o
        public View f(RecyclerView.p pVar) {
            if (f.this.c()) {
                return null;
            }
            return super.f(pVar);
        }
    }

    private class m extends RecyclerView {
        m(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        public CharSequence getAccessibilityClassName() {
            return f.this.f18062t.d() ? f.this.f18062t.o() : super.getAccessibilityClassName();
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(f.this.f18046d);
            accessibilityEvent.setToIndex(f.this.f18046d);
            f.this.f18062t.p(accessibilityEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return f.this.e() && super.onInterceptTouchEvent(motionEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return f.this.e() && super.onTouchEvent(motionEvent);
        }
    }

    private static class o implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final int f18082a;

        /* renamed from: b, reason: collision with root package name */
        private final RecyclerView f18083b;

        o(int i10, RecyclerView recyclerView) {
            this.f18082a = i10;
            this.f18083b = recyclerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f18083b.A1(this.f18082a);
        }
    }

    public f(Context context) {
        super(context);
        this.f18043a = new Rect();
        this.f18044b = new Rect();
        this.f18045c = new androidx.viewpager2.widget.b(3);
        this.f18047e = false;
        this.f18048f = new a();
        this.f18050h = -1;
        this.f18058p = null;
        this.f18059q = false;
        this.f18060r = true;
        this.f18061s = -1;
        b(context, null);
    }

    private RecyclerView.r a() {
        return new d();
    }

    private void b(Context context, AttributeSet attributeSet) {
        this.f18062t = f18042u ? new j() : new C0310f();
        m mVar = new m(context);
        this.f18052j = mVar;
        mVar.setId(View.generateViewId());
        this.f18052j.setDescendantFocusability(131072);
        h hVar = new h(context);
        this.f18049g = hVar;
        this.f18052j.setLayoutManager(hVar);
        this.f18052j.setScrollingTouchSlop(1);
        l(context, attributeSet);
        this.f18052j.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f18052j.l(a());
        androidx.viewpager2.widget.e eVar = new androidx.viewpager2.widget.e(this);
        this.f18054l = eVar;
        this.f18056n = new androidx.viewpager2.widget.c(this, eVar, this.f18052j);
        l lVar = new l();
        this.f18053k = lVar;
        lVar.b(this.f18052j);
        this.f18052j.n(this.f18054l);
        androidx.viewpager2.widget.b bVar = new androidx.viewpager2.widget.b(3);
        this.f18055m = bVar;
        this.f18054l.o(bVar);
        b bVar2 = new b();
        c cVar = new c();
        this.f18055m.d(bVar2);
        this.f18055m.d(cVar);
        this.f18062t.h(this.f18055m, this.f18052j);
        this.f18055m.d(this.f18045c);
        androidx.viewpager2.widget.d dVar = new androidx.viewpager2.widget.d(this.f18049g);
        this.f18057o = dVar;
        this.f18055m.d(dVar);
        RecyclerView recyclerView = this.f18052j;
        attachViewToParent(recyclerView, 0, recyclerView.getLayoutParams());
    }

    private void f(RecyclerView.h hVar) {
        if (hVar != null) {
            hVar.x(this.f18048f);
        }
    }

    private void i() {
        RecyclerView.h adapter;
        if (this.f18050h == -1 || (adapter = getAdapter()) == null) {
            return;
        }
        if (this.f18051i != null) {
            this.f18051i = null;
        }
        int max = Math.max(0, Math.min(this.f18050h, adapter.e() - 1));
        this.f18046d = max;
        this.f18050h = -1;
        this.f18052j.r1(max);
        this.f18062t.n();
    }

    private void l(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4861a.f43478a);
        AbstractC1484a0.o0(this, context, AbstractC4861a.f43478a, attributeSet, obtainStyledAttributes, 0, 0);
        try {
            setOrientation(obtainStyledAttributes.getInt(AbstractC4861a.f43479b, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private void m(RecyclerView.h hVar) {
        if (hVar != null) {
            hVar.z(this.f18048f);
        }
    }

    public boolean c() {
        return this.f18056n.a();
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i10) {
        return this.f18052j.canScrollHorizontally(i10);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i10) {
        return this.f18052j.canScrollVertically(i10);
    }

    boolean d() {
        return this.f18049g.Z() == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray sparseArray) {
        Parcelable parcelable = (Parcelable) sparseArray.get(getId());
        if (parcelable instanceof n) {
            int i10 = ((n) parcelable).f18079a;
            sparseArray.put(this.f18052j.getId(), (Parcelable) sparseArray.get(i10));
            sparseArray.remove(i10);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        i();
    }

    public boolean e() {
        return this.f18060r;
    }

    public void g(i iVar) {
        this.f18045c.d(iVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return this.f18062t.a() ? this.f18062t.g() : super.getAccessibilityClassName();
    }

    public RecyclerView.h getAdapter() {
        return this.f18052j.getAdapter();
    }

    public int getCurrentItem() {
        return this.f18046d;
    }

    public int getItemDecorationCount() {
        return this.f18052j.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f18061s;
    }

    public int getOrientation() {
        return this.f18049g.l2() == 1 ? 1 : 0;
    }

    int getPageSize() {
        int height;
        int paddingBottom;
        RecyclerView recyclerView = this.f18052j;
        if (getOrientation() == 0) {
            height = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            paddingBottom = recyclerView.getPaddingRight();
        } else {
            height = recyclerView.getHeight() - recyclerView.getPaddingTop();
            paddingBottom = recyclerView.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.f18054l.h();
    }

    public void h() {
        if (this.f18057o.d() == null) {
            return;
        }
        double g10 = this.f18054l.g();
        int i10 = (int) g10;
        float f10 = (float) (g10 - i10);
        this.f18057o.b(i10, f10, Math.round(getPageSize() * f10));
    }

    public void j(int i10, boolean z10) {
        if (c()) {
            throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
        }
        k(i10, z10);
    }

    void k(int i10, boolean z10) {
        RecyclerView.h adapter = getAdapter();
        if (adapter == null) {
            if (this.f18050h != -1) {
                this.f18050h = Math.max(i10, 0);
                return;
            }
            return;
        }
        if (adapter.e() <= 0) {
            return;
        }
        int min = Math.min(Math.max(i10, 0), adapter.e() - 1);
        if (min == this.f18046d && this.f18054l.j()) {
            return;
        }
        int i11 = this.f18046d;
        if (min == i11 && z10) {
            return;
        }
        double d10 = i11;
        this.f18046d = min;
        this.f18062t.r();
        if (!this.f18054l.j()) {
            d10 = this.f18054l.g();
        }
        this.f18054l.m(min, z10);
        if (!z10) {
            this.f18052j.r1(min);
            return;
        }
        double d11 = min;
        if (Math.abs(d11 - d10) <= 3.0d) {
            this.f18052j.A1(min);
            return;
        }
        this.f18052j.r1(d11 > d10 ? min - 3 : min + 3);
        RecyclerView recyclerView = this.f18052j;
        recyclerView.post(new o(min, recyclerView));
    }

    void n() {
        androidx.recyclerview.widget.k kVar = this.f18053k;
        if (kVar == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View f10 = kVar.f(this.f18049g);
        if (f10 == null) {
            return;
        }
        int h02 = this.f18049g.h0(f10);
        if (h02 != this.f18046d && getScrollState() == 0) {
            this.f18055m.c(h02);
        }
        this.f18047e = false;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f18062t.i(accessibilityNodeInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth = this.f18052j.getMeasuredWidth();
        int measuredHeight = this.f18052j.getMeasuredHeight();
        this.f18043a.left = getPaddingLeft();
        this.f18043a.right = (i12 - i10) - getPaddingRight();
        this.f18043a.top = getPaddingTop();
        this.f18043a.bottom = (i13 - i11) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.f18043a, this.f18044b);
        RecyclerView recyclerView = this.f18052j;
        Rect rect = this.f18044b;
        recyclerView.layout(rect.left, rect.top, rect.right, rect.bottom);
        if (this.f18047e) {
            n();
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        measureChild(this.f18052j, i10, i11);
        int measuredWidth = this.f18052j.getMeasuredWidth();
        int measuredHeight = this.f18052j.getMeasuredHeight();
        int measuredState = this.f18052j.getMeasuredState();
        int paddingLeft = measuredWidth + getPaddingLeft() + getPaddingRight();
        int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i10, measuredState), View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i11, measuredState << 16));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof n)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        n nVar = (n) parcelable;
        super.onRestoreInstanceState(nVar.getSuperState());
        this.f18050h = nVar.f18080b;
        this.f18051i = nVar.f18081c;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        n nVar = new n(super.onSaveInstanceState());
        nVar.f18079a = this.f18052j.getId();
        int i10 = this.f18050h;
        if (i10 == -1) {
            i10 = this.f18046d;
        }
        nVar.f18080b = i10;
        Parcelable parcelable = this.f18051i;
        if (parcelable != null) {
            nVar.f18081c = parcelable;
        } else {
            this.f18052j.getAdapter();
        }
        return nVar;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        throw new IllegalStateException(f.class.getSimpleName() + " does not support direct child views");
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i10, Bundle bundle) {
        return this.f18062t.c(i10, bundle) ? this.f18062t.m(i10, bundle) : super.performAccessibilityAction(i10, bundle);
    }

    public void setAdapter(RecyclerView.h hVar) {
        RecyclerView.h adapter = this.f18052j.getAdapter();
        this.f18062t.f(adapter);
        m(adapter);
        this.f18052j.setAdapter(hVar);
        this.f18046d = 0;
        i();
        this.f18062t.e(hVar);
        f(hVar);
    }

    public void setCurrentItem(int i10) {
        j(i10, true);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
        super.setLayoutDirection(i10);
        this.f18062t.q();
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 < 1 && i10 != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.f18061s = i10;
        this.f18052j.requestLayout();
    }

    public void setOrientation(int i10) {
        this.f18049g.y2(i10);
        this.f18062t.s();
    }

    public void setPageTransformer(k kVar) {
        if (kVar != null) {
            if (!this.f18059q) {
                this.f18058p = this.f18052j.getItemAnimator();
                this.f18059q = true;
            }
            this.f18052j.setItemAnimator(null);
        } else if (this.f18059q) {
            this.f18052j.setItemAnimator(this.f18058p);
            this.f18058p = null;
            this.f18059q = false;
        }
        if (kVar == this.f18057o.d()) {
            return;
        }
        this.f18057o.e(kVar);
        h();
    }

    public void setUserInputEnabled(boolean z10) {
        this.f18060r = z10;
        this.f18062t.t();
    }

    static class n extends View.BaseSavedState {
        public static final Parcelable.Creator<n> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        int f18079a;

        /* renamed from: b, reason: collision with root package name */
        int f18080b;

        /* renamed from: c, reason: collision with root package name */
        Parcelable f18081c;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public n createFromParcel(Parcel parcel) {
                return createFromParcel(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public n createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new n(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public n[] newArray(int i10) {
                return new n[i10];
            }
        }

        n(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            a(parcel, classLoader);
        }

        private void a(Parcel parcel, ClassLoader classLoader) {
            this.f18079a = parcel.readInt();
            this.f18080b = parcel.readInt();
            this.f18081c = parcel.readParcelable(classLoader);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f18079a);
            parcel.writeInt(this.f18080b);
            parcel.writeParcelable(this.f18081c, i10);
        }

        n(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
