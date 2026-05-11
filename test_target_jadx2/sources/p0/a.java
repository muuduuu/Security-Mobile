package P0;

import G0.c;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.AbstractC1484a0;
import androidx.core.view.AbstractC1518s;
import androidx.core.view.C1483a;
import androidx.core.view.K0;
import java.util.ArrayList;
import java.util.List;
import z0.C5228A;
import z0.InterfaceC5231D;

/* loaded from: classes.dex */
public abstract class a extends ViewGroup {

    /* renamed from: h0, reason: collision with root package name */
    private static final int[] f7372h0 = {R.attr.colorPrimaryDark};

    /* renamed from: i0, reason: collision with root package name */
    static final int[] f7373i0 = {R.attr.layout_gravity};

    /* renamed from: j0, reason: collision with root package name */
    static final boolean f7374j0;

    /* renamed from: k0, reason: collision with root package name */
    private static final boolean f7375k0;

    /* renamed from: l0, reason: collision with root package name */
    private static boolean f7376l0;

    /* renamed from: A, reason: collision with root package name */
    private CharSequence f7377A;

    /* renamed from: B, reason: collision with root package name */
    private Object f7378B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f7379C;

    /* renamed from: D, reason: collision with root package name */
    private Drawable f7380D;

    /* renamed from: E, reason: collision with root package name */
    private Drawable f7381E;

    /* renamed from: F, reason: collision with root package name */
    private Drawable f7382F;

    /* renamed from: G, reason: collision with root package name */
    private Drawable f7383G;

    /* renamed from: H, reason: collision with root package name */
    private final ArrayList f7384H;

    /* renamed from: I, reason: collision with root package name */
    private Rect f7385I;

    /* renamed from: J, reason: collision with root package name */
    private Matrix f7386J;

    /* renamed from: K, reason: collision with root package name */
    private final InterfaceC5231D f7387K;

    /* renamed from: a, reason: collision with root package name */
    private final d f7388a;

    /* renamed from: b, reason: collision with root package name */
    private float f7389b;

    /* renamed from: c, reason: collision with root package name */
    private int f7390c;

    /* renamed from: d, reason: collision with root package name */
    private int f7391d;

    /* renamed from: e, reason: collision with root package name */
    private float f7392e;

    /* renamed from: f, reason: collision with root package name */
    private Paint f7393f;

    /* renamed from: g, reason: collision with root package name */
    private final G0.c f7394g;

    /* renamed from: h, reason: collision with root package name */
    private final G0.c f7395h;

    /* renamed from: i, reason: collision with root package name */
    private final h f7396i;

    /* renamed from: j, reason: collision with root package name */
    private final h f7397j;

    /* renamed from: k, reason: collision with root package name */
    private int f7398k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f7399l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f7400m;

    /* renamed from: n, reason: collision with root package name */
    private int f7401n;

    /* renamed from: o, reason: collision with root package name */
    private int f7402o;

    /* renamed from: p, reason: collision with root package name */
    private int f7403p;

    /* renamed from: q, reason: collision with root package name */
    private int f7404q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f7405r;

    /* renamed from: s, reason: collision with root package name */
    private e f7406s;

    /* renamed from: t, reason: collision with root package name */
    private List f7407t;

    /* renamed from: u, reason: collision with root package name */
    private float f7408u;

    /* renamed from: v, reason: collision with root package name */
    private float f7409v;

    /* renamed from: w, reason: collision with root package name */
    private Drawable f7410w;

    /* renamed from: x, reason: collision with root package name */
    private Drawable f7411x;

    /* renamed from: y, reason: collision with root package name */
    private Drawable f7412y;

    /* renamed from: z, reason: collision with root package name */
    private CharSequence f7413z;

    /* renamed from: P0.a$a, reason: collision with other inner class name */
    class C0140a implements InterfaceC5231D {
        C0140a() {
        }

        @Override // z0.InterfaceC5231D
        public boolean a(View view, InterfaceC5231D.a aVar) {
            if (!a.this.C(view) || a.this.r(view) == 2) {
                return false;
            }
            a.this.f(view);
            return true;
        }
    }

    class b implements View.OnApplyWindowInsetsListener {
        b() {
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            ((a) view).Q(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    class c extends C1483a {

        /* renamed from: d, reason: collision with root package name */
        private final Rect f7416d = new Rect();

        c() {
        }

        private void n(C5228A c5228a, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (a.A(childAt)) {
                    c5228a.c(childAt);
                }
            }
        }

        private void o(C5228A c5228a, C5228A c5228a2) {
            Rect rect = this.f7416d;
            c5228a2.n(rect);
            c5228a.n0(rect);
            c5228a.W0(c5228a2.c0());
            c5228a.F0(c5228a2.A());
            c5228a.q0(c5228a2.q());
            c5228a.u0(c5228a2.u());
            c5228a.w0(c5228a2.Q());
            c5228a.z0(c5228a2.S());
            c5228a.k0(c5228a2.L());
            c5228a.N0(c5228a2.Z());
            c5228a.a(c5228a2.k());
        }

        @Override // androidx.core.view.C1483a
        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() != 32) {
                return super.a(view, accessibilityEvent);
            }
            List<CharSequence> text = accessibilityEvent.getText();
            View p10 = a.this.p();
            if (p10 == null) {
                return true;
            }
            CharSequence s10 = a.this.s(a.this.t(p10));
            if (s10 == null) {
                return true;
            }
            text.add(s10);
            return true;
        }

        @Override // androidx.core.view.C1483a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
        }

        @Override // androidx.core.view.C1483a
        public void g(View view, C5228A c5228a) {
            if (a.f7374j0) {
                super.g(view, c5228a);
            } else {
                C5228A f02 = C5228A.f0(c5228a);
                super.g(view, f02);
                c5228a.P0(view);
                Object G10 = AbstractC1484a0.G(view);
                if (G10 instanceof View) {
                    c5228a.H0((View) G10);
                }
                o(c5228a, f02);
                f02.h0();
                n(c5228a, (ViewGroup) view);
            }
            c5228a.q0("androidx.drawerlayout.widget.DrawerLayout");
            c5228a.y0(false);
            c5228a.z0(false);
            c5228a.i0(C5228A.a.f45623e);
            c5228a.i0(C5228A.a.f45624f);
        }

        @Override // androidx.core.view.C1483a
        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (a.f7374j0 || a.A(view)) {
                return super.i(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    static final class d extends C1483a {
        d() {
        }

        @Override // androidx.core.view.C1483a
        public void g(View view, C5228A c5228a) {
            super.g(view, c5228a);
            if (a.A(view)) {
                return;
            }
            c5228a.H0(null);
        }
    }

    public interface e {
        void a(View view);

        void b(View view);

        void c(int i10);

        void d(View view, float f10);
    }

    private class h extends c.AbstractC0063c {

        /* renamed from: a, reason: collision with root package name */
        private final int f7427a;

        /* renamed from: b, reason: collision with root package name */
        private G0.c f7428b;

        /* renamed from: c, reason: collision with root package name */
        private final Runnable f7429c = new RunnableC0142a();

        /* renamed from: P0.a$h$a, reason: collision with other inner class name */
        class RunnableC0142a implements Runnable {
            RunnableC0142a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                h.this.o();
            }
        }

        h(int i10) {
            this.f7427a = i10;
        }

        private void n() {
            View n10 = a.this.n(this.f7427a == 3 ? 5 : 3);
            if (n10 != null) {
                a.this.f(n10);
            }
        }

        @Override // G0.c.AbstractC0063c
        public int a(View view, int i10, int i11) {
            if (a.this.c(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i10, 0));
            }
            int width = a.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i10, width));
        }

        @Override // G0.c.AbstractC0063c
        public int b(View view, int i10, int i11) {
            return view.getTop();
        }

        @Override // G0.c.AbstractC0063c
        public int d(View view) {
            if (a.this.D(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // G0.c.AbstractC0063c
        public void f(int i10, int i11) {
            View n10 = (i10 & 1) == 1 ? a.this.n(3) : a.this.n(5);
            if (n10 == null || a.this.r(n10) != 0) {
                return;
            }
            this.f7428b.b(n10, i11);
        }

        @Override // G0.c.AbstractC0063c
        public boolean g(int i10) {
            return false;
        }

        @Override // G0.c.AbstractC0063c
        public void h(int i10, int i11) {
            a.this.postDelayed(this.f7429c, 160L);
        }

        @Override // G0.c.AbstractC0063c
        public void i(View view, int i10) {
            ((f) view.getLayoutParams()).f7420c = false;
            n();
        }

        @Override // G0.c.AbstractC0063c
        public void j(int i10) {
            a.this.V(i10, this.f7428b.v());
        }

        @Override // G0.c.AbstractC0063c
        public void k(View view, int i10, int i11, int i12, int i13) {
            float width = (a.this.c(view, 3) ? i10 + r3 : a.this.getWidth() - i10) / view.getWidth();
            a.this.S(view, width);
            view.setVisibility(width == 0.0f ? 4 : 0);
            a.this.invalidate();
        }

        @Override // G0.c.AbstractC0063c
        public void l(View view, float f10, float f11) {
            int i10;
            float u10 = a.this.u(view);
            int width = view.getWidth();
            if (a.this.c(view, 3)) {
                i10 = (f10 > 0.0f || (f10 == 0.0f && u10 > 0.5f)) ? 0 : -width;
            } else {
                int width2 = a.this.getWidth();
                if (f10 < 0.0f || (f10 == 0.0f && u10 > 0.5f)) {
                    width2 -= width;
                }
                i10 = width2;
            }
            this.f7428b.O(i10, view.getTop());
            a.this.invalidate();
        }

        @Override // G0.c.AbstractC0063c
        public boolean m(View view, int i10) {
            return a.this.D(view) && a.this.c(view, this.f7427a) && a.this.r(view) == 0;
        }

        void o() {
            View n10;
            int width;
            int x10 = this.f7428b.x();
            boolean z10 = this.f7427a == 3;
            if (z10) {
                n10 = a.this.n(3);
                width = (n10 != null ? -n10.getWidth() : 0) + x10;
            } else {
                n10 = a.this.n(5);
                width = a.this.getWidth() - x10;
            }
            if (n10 != null) {
                if (((!z10 || n10.getLeft() >= width) && (z10 || n10.getLeft() <= width)) || a.this.r(n10) != 0) {
                    return;
                }
                f fVar = (f) n10.getLayoutParams();
                this.f7428b.Q(n10, width, n10.getTop());
                fVar.f7420c = true;
                a.this.invalidate();
                n();
                a.this.b();
            }
        }

        public void p() {
            a.this.removeCallbacks(this.f7429c);
        }

        public void q(G0.c cVar) {
            this.f7428b = cVar;
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        f7374j0 = true;
        f7375k0 = true;
        f7376l0 = i10 >= 29;
    }

    public a(Context context) {
        this(context, null);
    }

    static boolean A(View view) {
        return (AbstractC1484a0.y(view) == 4 || AbstractC1484a0.y(view) == 2) ? false : true;
    }

    private boolean F(float f10, float f11, View view) {
        if (this.f7385I == null) {
            this.f7385I = new Rect();
        }
        view.getHitRect(this.f7385I);
        return this.f7385I.contains((int) f10, (int) f11);
    }

    private void G(Drawable drawable, int i10) {
        if (drawable == null || !androidx.core.graphics.drawable.a.c(drawable)) {
            return;
        }
        androidx.core.graphics.drawable.a.g(drawable, i10);
    }

    private Drawable N() {
        int A10 = AbstractC1484a0.A(this);
        if (A10 == 0) {
            Drawable drawable = this.f7380D;
            if (drawable != null) {
                G(drawable, A10);
                return this.f7380D;
            }
        } else {
            Drawable drawable2 = this.f7381E;
            if (drawable2 != null) {
                G(drawable2, A10);
                return this.f7381E;
            }
        }
        return this.f7382F;
    }

    private Drawable O() {
        int A10 = AbstractC1484a0.A(this);
        if (A10 == 0) {
            Drawable drawable = this.f7381E;
            if (drawable != null) {
                G(drawable, A10);
                return this.f7381E;
            }
        } else {
            Drawable drawable2 = this.f7380D;
            if (drawable2 != null) {
                G(drawable2, A10);
                return this.f7380D;
            }
        }
        return this.f7383G;
    }

    private void P() {
        if (f7375k0) {
            return;
        }
        this.f7411x = N();
        this.f7412y = O();
    }

    private void T(View view) {
        C5228A.a aVar = C5228A.a.f45643y;
        AbstractC1484a0.k0(view, aVar.b());
        if (!C(view) || r(view) == 2) {
            return;
        }
        AbstractC1484a0.m0(view, aVar, null, this.f7387K);
    }

    private void U(View view, boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((z10 || D(childAt)) && !(z10 && childAt == view)) {
                AbstractC1484a0.B0(childAt, 4);
            } else {
                AbstractC1484a0.B0(childAt, 1);
            }
        }
    }

    private boolean m(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent v10 = v(motionEvent, view);
            boolean dispatchGenericMotionEvent = view.dispatchGenericMotionEvent(v10);
            v10.recycle();
            return dispatchGenericMotionEvent;
        }
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean dispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return dispatchGenericMotionEvent2;
    }

    private MotionEvent v(MotionEvent motionEvent, View view) {
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(scrollX, scrollY);
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.f7386J == null) {
                this.f7386J = new Matrix();
            }
            matrix.invert(this.f7386J);
            obtain.transform(this.f7386J);
        }
        return obtain;
    }

    static String w(int i10) {
        return (i10 & 3) == 3 ? "LEFT" : (i10 & 5) == 5 ? "RIGHT" : Integer.toHexString(i10);
    }

    private static boolean x(View view) {
        Drawable background = view.getBackground();
        return background != null && background.getOpacity() == -1;
    }

    private boolean y() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (((f) getChildAt(i10).getLayoutParams()).f7420c) {
                return true;
            }
        }
        return false;
    }

    private boolean z() {
        return p() != null;
    }

    boolean B(View view) {
        return ((f) view.getLayoutParams()).f7418a == 0;
    }

    public boolean C(View view) {
        if (D(view)) {
            return (((f) view.getLayoutParams()).f7421d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    boolean D(View view) {
        int b10 = AbstractC1518s.b(((f) view.getLayoutParams()).f7418a, AbstractC1484a0.A(view));
        return ((b10 & 3) == 0 && (b10 & 5) == 0) ? false : true;
    }

    public boolean E(View view) {
        if (D(view)) {
            return ((f) view.getLayoutParams()).f7419b > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    void H(View view, float f10) {
        float u10 = u(view);
        float width = view.getWidth();
        int i10 = ((int) (width * f10)) - ((int) (u10 * width));
        if (!c(view, 3)) {
            i10 = -i10;
        }
        view.offsetLeftAndRight(i10);
        S(view, f10);
    }

    public void I(int i10) {
        J(i10, true);
    }

    public void J(int i10, boolean z10) {
        View n10 = n(i10);
        if (n10 != null) {
            L(n10, z10);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + w(i10));
    }

    public void K(View view) {
        L(view, true);
    }

    public void L(View view, boolean z10) {
        if (!D(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        f fVar = (f) view.getLayoutParams();
        if (this.f7400m) {
            fVar.f7419b = 1.0f;
            fVar.f7421d = 1;
            U(view, true);
            T(view);
        } else if (z10) {
            fVar.f7421d |= 2;
            if (c(view, 3)) {
                this.f7394g.Q(view, 0, view.getTop());
            } else {
                this.f7395h.Q(view, getWidth() - view.getWidth(), view.getTop());
            }
        } else {
            H(view, 1.0f);
            V(0, view);
            view.setVisibility(0);
        }
        invalidate();
    }

    public void M(e eVar) {
        List list;
        if (eVar == null || (list = this.f7407t) == null) {
            return;
        }
        list.remove(eVar);
    }

    public void Q(Object obj, boolean z10) {
        this.f7378B = obj;
        this.f7379C = z10;
        setWillNotDraw(!z10 && getBackground() == null);
        requestLayout();
    }

    public void R(int i10, int i11) {
        View n10;
        int b10 = AbstractC1518s.b(i11, AbstractC1484a0.A(this));
        if (i11 == 3) {
            this.f7401n = i10;
        } else if (i11 == 5) {
            this.f7402o = i10;
        } else if (i11 == 8388611) {
            this.f7403p = i10;
        } else if (i11 == 8388613) {
            this.f7404q = i10;
        }
        if (i10 != 0) {
            (b10 == 3 ? this.f7394g : this.f7395h).a();
        }
        if (i10 != 1) {
            if (i10 == 2 && (n10 = n(b10)) != null) {
                K(n10);
                return;
            }
            return;
        }
        View n11 = n(b10);
        if (n11 != null) {
            f(n11);
        }
    }

    void S(View view, float f10) {
        f fVar = (f) view.getLayoutParams();
        if (f10 == fVar.f7419b) {
            return;
        }
        fVar.f7419b = f10;
        l(view, f10);
    }

    void V(int i10, View view) {
        int i11;
        int A10 = this.f7394g.A();
        int A11 = this.f7395h.A();
        if (A10 == 1 || A11 == 1) {
            i11 = 1;
        } else {
            i11 = 2;
            if (A10 != 2 && A11 != 2) {
                i11 = 0;
            }
        }
        if (view != null && i10 == 0) {
            float f10 = ((f) view.getLayoutParams()).f7419b;
            if (f10 == 0.0f) {
                j(view);
            } else if (f10 == 1.0f) {
                k(view);
            }
        }
        if (i11 != this.f7398k) {
            this.f7398k = i11;
            List list = this.f7407t;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((e) this.f7407t.get(size)).c(i11);
                }
            }
        }
    }

    public void a(e eVar) {
        if (eVar == null) {
            return;
        }
        if (this.f7407t == null) {
            this.f7407t = new ArrayList();
        }
        this.f7407t.add(eVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList arrayList, int i10, int i11) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (!D(childAt)) {
                this.f7384H.add(childAt);
            } else if (C(childAt)) {
                childAt.addFocusables(arrayList, i10, i11);
                z10 = true;
            }
        }
        if (!z10) {
            int size = this.f7384H.size();
            for (int i13 = 0; i13 < size; i13++) {
                View view = (View) this.f7384H.get(i13);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i10, i11);
                }
            }
        }
        this.f7384H.clear();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        if (o() != null || D(view)) {
            AbstractC1484a0.B0(view, 4);
        } else {
            AbstractC1484a0.B0(view, 1);
        }
        if (f7374j0) {
            return;
        }
        AbstractC1484a0.q0(view, this.f7388a);
    }

    void b() {
        if (this.f7405r) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            getChildAt(i10).dispatchTouchEvent(obtain);
        }
        obtain.recycle();
        this.f7405r = true;
    }

    boolean c(View view, int i10) {
        return (t(view) & i10) == i10;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        int childCount = getChildCount();
        float f10 = 0.0f;
        for (int i10 = 0; i10 < childCount; i10++) {
            f10 = Math.max(f10, ((f) getChildAt(i10).getLayoutParams()).f7419b);
        }
        this.f7392e = f10;
        boolean m10 = this.f7394g.m(true);
        boolean m11 = this.f7395h.m(true);
        if (m10 || m11) {
            AbstractC1484a0.h0(this);
        }
    }

    public void d(int i10) {
        e(i10, true);
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f7392e <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        for (int i10 = childCount - 1; i10 >= 0; i10--) {
            View childAt = getChildAt(i10);
            if (F(x10, y10, childAt) && !B(childAt) && m(motionEvent, childAt)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j10) {
        int height = getHeight();
        boolean B10 = B(view);
        int width = getWidth();
        int save = canvas.save();
        int i10 = 0;
        if (B10) {
            int childCount = getChildCount();
            int i11 = 0;
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (childAt != view && childAt.getVisibility() == 0 && x(childAt) && D(childAt) && childAt.getHeight() >= height) {
                    if (c(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i11) {
                            i11 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i11, 0, width, getHeight());
            i10 = i11;
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restoreToCount(save);
        float f10 = this.f7392e;
        if (f10 > 0.0f && B10) {
            this.f7393f.setColor((this.f7391d & 16777215) | (((int) ((((-16777216) & r2) >>> 24) * f10)) << 24));
            canvas.drawRect(i10, 0.0f, width, getHeight(), this.f7393f);
        } else if (this.f7411x != null && c(view, 3)) {
            int intrinsicWidth = this.f7411x.getIntrinsicWidth();
            int right2 = view.getRight();
            float max = Math.max(0.0f, Math.min(right2 / this.f7394g.x(), 1.0f));
            this.f7411x.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.f7411x.setAlpha((int) (max * 255.0f));
            this.f7411x.draw(canvas);
        } else if (this.f7412y != null && c(view, 5)) {
            int intrinsicWidth2 = this.f7412y.getIntrinsicWidth();
            int left2 = view.getLeft();
            float max2 = Math.max(0.0f, Math.min((getWidth() - left2) / this.f7395h.x(), 1.0f));
            this.f7412y.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.f7412y.setAlpha((int) (max2 * 255.0f));
            this.f7412y.draw(canvas);
        }
        return drawChild;
    }

    public void e(int i10, boolean z10) {
        View n10 = n(i10);
        if (n10 != null) {
            g(n10, z10);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + w(i10));
    }

    public void f(View view) {
        g(view, true);
    }

    public void g(View view, boolean z10) {
        if (!D(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        f fVar = (f) view.getLayoutParams();
        if (this.f7400m) {
            fVar.f7419b = 0.0f;
            fVar.f7421d = 0;
        } else if (z10) {
            fVar.f7421d |= 4;
            if (c(view, 3)) {
                this.f7394g.Q(view, -view.getWidth(), view.getTop());
            } else {
                this.f7395h.Q(view, getWidth(), view.getTop());
            }
        } else {
            H(view, 0.0f);
            V(0, view);
            view.setVisibility(4);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f(-1, -1);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof f ? new f((f) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new f((ViewGroup.MarginLayoutParams) layoutParams) : new f(layoutParams);
    }

    public float getDrawerElevation() {
        if (f7375k0) {
            return this.f7389b;
        }
        return 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.f7410w;
    }

    public void h() {
        i(false);
    }

    void i(boolean z10) {
        int childCount = getChildCount();
        boolean z11 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            f fVar = (f) childAt.getLayoutParams();
            if (D(childAt) && (!z10 || fVar.f7420c)) {
                z11 |= c(childAt, 3) ? this.f7394g.Q(childAt, -childAt.getWidth(), childAt.getTop()) : this.f7395h.Q(childAt, getWidth(), childAt.getTop());
                fVar.f7420c = false;
            }
        }
        this.f7396i.p();
        this.f7397j.p();
        if (z11) {
            invalidate();
        }
    }

    void j(View view) {
        View rootView;
        f fVar = (f) view.getLayoutParams();
        if ((fVar.f7421d & 1) == 1) {
            fVar.f7421d = 0;
            List list = this.f7407t;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((e) this.f7407t.get(size)).b(view);
                }
            }
            U(view, false);
            T(view);
            if (!hasWindowFocus() || (rootView = getRootView()) == null) {
                return;
            }
            rootView.sendAccessibilityEvent(32);
        }
    }

    void k(View view) {
        f fVar = (f) view.getLayoutParams();
        if ((fVar.f7421d & 1) == 0) {
            fVar.f7421d = 1;
            List list = this.f7407t;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((e) this.f7407t.get(size)).a(view);
                }
            }
            U(view, true);
            T(view);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    void l(View view, float f10) {
        List list = this.f7407t;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((e) this.f7407t.get(size)).d(view, f10);
            }
        }
    }

    View n(int i10) {
        int b10 = AbstractC1518s.b(i10, AbstractC1484a0.A(this)) & 7;
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if ((t(childAt) & 7) == b10) {
                return childAt;
            }
        }
        return null;
    }

    View o() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((((f) childAt.getLayoutParams()).f7421d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f7400m = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f7400m = true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f7379C || this.f7410w == null) {
            return;
        }
        Object obj = this.f7378B;
        int systemWindowInsetTop = obj != null ? ((WindowInsets) obj).getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.f7410w.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.f7410w.draw(canvas);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if (r0 != 3) goto L13;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        View t10;
        int actionMasked = motionEvent.getActionMasked();
        boolean P10 = this.f7394g.P(motionEvent) | this.f7395h.P(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.f7394g.d(3)) {
                        this.f7396i.p();
                        this.f7397j.p();
                    }
                }
                z10 = false;
            }
            i(true);
            this.f7405r = false;
            z10 = false;
        } else {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            this.f7408u = x10;
            this.f7409v = y10;
            z10 = this.f7392e > 0.0f && (t10 = this.f7394g.t((int) x10, (int) y10)) != null && B(t10);
            this.f7405r = false;
        }
        return P10 || z10 || y() || this.f7405r;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 != 4 || !z()) {
            return super.onKeyDown(i10, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (i10 != 4) {
            return super.onKeyUp(i10, keyEvent);
        }
        View p10 = p();
        if (p10 != null && r(p10) == 0) {
            h();
        }
        return p10 != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        WindowInsets rootWindowInsets;
        float f10;
        int i14;
        boolean z11 = true;
        this.f7399l = true;
        int i15 = i12 - i10;
        int childCount = getChildCount();
        int i16 = 0;
        while (i16 < childCount) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (B(childAt)) {
                    int i17 = ((ViewGroup.MarginLayoutParams) fVar).leftMargin;
                    childAt.layout(i17, ((ViewGroup.MarginLayoutParams) fVar).topMargin, childAt.getMeasuredWidth() + i17, ((ViewGroup.MarginLayoutParams) fVar).topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (c(childAt, 3)) {
                        float f11 = measuredWidth;
                        i14 = (-measuredWidth) + ((int) (fVar.f7419b * f11));
                        f10 = (measuredWidth + i14) / f11;
                    } else {
                        float f12 = measuredWidth;
                        f10 = (i15 - r11) / f12;
                        i14 = i15 - ((int) (fVar.f7419b * f12));
                    }
                    boolean z12 = f10 != fVar.f7419b ? z11 : false;
                    int i18 = fVar.f7418a & 112;
                    if (i18 == 16) {
                        int i19 = i13 - i11;
                        int i20 = (i19 - measuredHeight) / 2;
                        int i21 = ((ViewGroup.MarginLayoutParams) fVar).topMargin;
                        if (i20 < i21) {
                            i20 = i21;
                        } else {
                            int i22 = i20 + measuredHeight;
                            int i23 = ((ViewGroup.MarginLayoutParams) fVar).bottomMargin;
                            if (i22 > i19 - i23) {
                                i20 = (i19 - i23) - measuredHeight;
                            }
                        }
                        childAt.layout(i14, i20, measuredWidth + i14, measuredHeight + i20);
                    } else if (i18 != 80) {
                        int i24 = ((ViewGroup.MarginLayoutParams) fVar).topMargin;
                        childAt.layout(i14, i24, measuredWidth + i14, measuredHeight + i24);
                    } else {
                        int i25 = i13 - i11;
                        childAt.layout(i14, (i25 - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i14, i25 - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                    }
                    if (z12) {
                        S(childAt, f10);
                    }
                    int i26 = fVar.f7419b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i26) {
                        childAt.setVisibility(i26);
                    }
                }
            }
            i16++;
            z11 = true;
        }
        if (f7376l0 && (rootWindowInsets = getRootWindowInsets()) != null) {
            androidx.core.graphics.e h10 = K0.w(rootWindowInsets).h();
            G0.c cVar = this.f7394g;
            cVar.L(Math.max(cVar.w(), h10.f15924a));
            G0.c cVar2 = this.f7395h;
            cVar2.L(Math.max(cVar2.w(), h10.f15926c));
        }
        this.f7399l = false;
        this.f7400m = false;
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            if (mode == 0) {
                size = 300;
            }
            if (mode2 == 0) {
                size2 = 300;
            }
        }
        setMeasuredDimension(size, size2);
        boolean z10 = this.f7378B != null && AbstractC1484a0.x(this);
        int A10 = AbstractC1484a0.A(this);
        int childCount = getChildCount();
        boolean z11 = false;
        boolean z12 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (z10) {
                    int b10 = AbstractC1518s.b(fVar.f7418a, A10);
                    if (AbstractC1484a0.x(childAt)) {
                        WindowInsets windowInsets = (WindowInsets) this.f7378B;
                        if (b10 == 3) {
                            windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), 0, windowInsets.getSystemWindowInsetBottom());
                        } else if (b10 == 5) {
                            windowInsets = windowInsets.replaceSystemWindowInsets(0, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsets);
                    } else {
                        WindowInsets windowInsets2 = (WindowInsets) this.f7378B;
                        if (b10 == 3) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(windowInsets2.getSystemWindowInsetLeft(), windowInsets2.getSystemWindowInsetTop(), 0, windowInsets2.getSystemWindowInsetBottom());
                        } else if (b10 == 5) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(0, windowInsets2.getSystemWindowInsetTop(), windowInsets2.getSystemWindowInsetRight(), windowInsets2.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) fVar).leftMargin = windowInsets2.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) fVar).topMargin = windowInsets2.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) fVar).rightMargin = windowInsets2.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) fVar).bottomMargin = windowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (B(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) fVar).leftMargin) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) fVar).topMargin) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin, 1073741824));
                } else {
                    if (!D(childAt)) {
                        throw new IllegalStateException("Child " + childAt + " at index " + i12 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    }
                    if (f7375k0) {
                        float v10 = AbstractC1484a0.v(childAt);
                        float f10 = this.f7389b;
                        if (v10 != f10) {
                            AbstractC1484a0.y0(childAt, f10);
                        }
                    }
                    int t10 = t(childAt) & 7;
                    boolean z13 = t10 == 3;
                    if ((z13 && z11) || (!z13 && z12)) {
                        throw new IllegalStateException("Child drawer has absolute gravity " + w(t10) + " but this DrawerLayout already has a drawer view along that edge");
                    }
                    if (z13) {
                        z11 = true;
                    } else {
                        z12 = true;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i10, this.f7390c + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin, ((ViewGroup.MarginLayoutParams) fVar).width), ViewGroup.getChildMeasureSpec(i11, ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin, ((ViewGroup.MarginLayoutParams) fVar).height));
                }
            }
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        View n10;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.a());
        int i10 = gVar.f7422c;
        if (i10 != 0 && (n10 = n(i10)) != null) {
            K(n10);
        }
        int i11 = gVar.f7423d;
        if (i11 != 3) {
            R(i11, 3);
        }
        int i12 = gVar.f7424e;
        if (i12 != 3) {
            R(i12, 5);
        }
        int i13 = gVar.f7425f;
        if (i13 != 3) {
            R(i13, 8388611);
        }
        int i14 = gVar.f7426g;
        if (i14 != 3) {
            R(i14, 8388613);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        P();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        g gVar = new g(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            f fVar = (f) getChildAt(i10).getLayoutParams();
            int i11 = fVar.f7421d;
            boolean z10 = i11 == 1;
            boolean z11 = i11 == 2;
            if (z10 || z11) {
                gVar.f7422c = fVar.f7418a;
                break;
            }
        }
        gVar.f7423d = this.f7401n;
        gVar.f7424e = this.f7402o;
        gVar.f7425f = this.f7403p;
        gVar.f7426g = this.f7404q;
        return gVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
    
        if (r(r7) != 2) goto L20;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f7394g.F(motionEvent);
        this.f7395h.F(motionEvent);
        int action = motionEvent.getAction() & 255;
        boolean z10 = false;
        if (action == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            this.f7408u = x10;
            this.f7409v = y10;
            this.f7405r = false;
        } else if (action == 1) {
            float x11 = motionEvent.getX();
            float y11 = motionEvent.getY();
            View t10 = this.f7394g.t((int) x11, (int) y11);
            if (t10 != null && B(t10)) {
                float f10 = x11 - this.f7408u;
                float f11 = y11 - this.f7409v;
                int z11 = this.f7394g.z();
                if ((f10 * f10) + (f11 * f11) < z11 * z11) {
                    View o10 = o();
                    if (o10 != null) {
                    }
                }
            }
            z10 = true;
            i(z10);
        } else if (action == 3) {
            i(true);
            this.f7405r = false;
        }
        return true;
    }

    View p() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (D(childAt) && E(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    public int q(int i10) {
        int A10 = AbstractC1484a0.A(this);
        if (i10 == 3) {
            int i11 = this.f7401n;
            if (i11 != 3) {
                return i11;
            }
            int i12 = A10 == 0 ? this.f7403p : this.f7404q;
            if (i12 != 3) {
                return i12;
            }
            return 0;
        }
        if (i10 == 5) {
            int i13 = this.f7402o;
            if (i13 != 3) {
                return i13;
            }
            int i14 = A10 == 0 ? this.f7404q : this.f7403p;
            if (i14 != 3) {
                return i14;
            }
            return 0;
        }
        if (i10 == 8388611) {
            int i15 = this.f7403p;
            if (i15 != 3) {
                return i15;
            }
            int i16 = A10 == 0 ? this.f7401n : this.f7402o;
            if (i16 != 3) {
                return i16;
            }
            return 0;
        }
        if (i10 != 8388613) {
            return 0;
        }
        int i17 = this.f7404q;
        if (i17 != 3) {
            return i17;
        }
        int i18 = A10 == 0 ? this.f7402o : this.f7401n;
        if (i18 != 3) {
            return i18;
        }
        return 0;
    }

    public int r(View view) {
        if (D(view)) {
            return q(((f) view.getLayoutParams()).f7418a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (z10) {
            i(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f7399l) {
            return;
        }
        super.requestLayout();
    }

    public CharSequence s(int i10) {
        int b10 = AbstractC1518s.b(i10, AbstractC1484a0.A(this));
        if (b10 == 3) {
            return this.f7413z;
        }
        if (b10 == 5) {
            return this.f7377A;
        }
        return null;
    }

    public void setDrawerElevation(float f10) {
        this.f7389b = f10;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (D(childAt)) {
                AbstractC1484a0.y0(childAt, this.f7389b);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(e eVar) {
        e eVar2 = this.f7406s;
        if (eVar2 != null) {
            M(eVar2);
        }
        if (eVar != null) {
            a(eVar);
        }
        this.f7406s = eVar;
    }

    public void setDrawerLockMode(int i10) {
        R(i10, 3);
        R(i10, 5);
    }

    public void setScrimColor(int i10) {
        this.f7391d = i10;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.f7410w = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i10) {
        this.f7410w = new ColorDrawable(i10);
        invalidate();
    }

    int t(View view) {
        return AbstractC1518s.b(((f) view.getLayoutParams()).f7418a, AbstractC1484a0.A(this));
    }

    float u(View view) {
        return ((f) view.getLayoutParams()).f7419b;
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, O0.a.f6844a);
    }

    public a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f7388a = new d();
        this.f7391d = -1728053248;
        this.f7393f = new Paint();
        this.f7400m = true;
        this.f7401n = 3;
        this.f7402o = 3;
        this.f7403p = 3;
        this.f7404q = 3;
        this.f7380D = null;
        this.f7381E = null;
        this.f7382F = null;
        this.f7383G = null;
        this.f7387K = new C0140a();
        setDescendantFocusability(262144);
        float f10 = getResources().getDisplayMetrics().density;
        this.f7390c = (int) ((64.0f * f10) + 0.5f);
        float f11 = f10 * 400.0f;
        h hVar = new h(3);
        this.f7396i = hVar;
        h hVar2 = new h(5);
        this.f7397j = hVar2;
        G0.c n10 = G0.c.n(this, 1.0f, hVar);
        this.f7394g = n10;
        n10.M(1);
        n10.N(f11);
        hVar.q(n10);
        G0.c n11 = G0.c.n(this, 1.0f, hVar2);
        this.f7395h = n11;
        n11.M(2);
        n11.N(f11);
        hVar2.q(n11);
        setFocusableInTouchMode(true);
        AbstractC1484a0.B0(this, 1);
        AbstractC1484a0.q0(this, new c());
        setMotionEventSplittingEnabled(false);
        if (AbstractC1484a0.x(this)) {
            setOnApplyWindowInsetsListener(new b());
            setSystemUiVisibility(1280);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f7372h0);
            try {
                this.f7410w = obtainStyledAttributes.getDrawable(0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, O0.c.f6847b, i10, 0);
        try {
            if (obtainStyledAttributes2.hasValue(O0.c.f6848c)) {
                this.f7389b = obtainStyledAttributes2.getDimension(O0.c.f6848c, 0.0f);
            } else {
                this.f7389b = getResources().getDimension(O0.b.f6845a);
            }
            obtainStyledAttributes2.recycle();
            this.f7384H = new ArrayList();
        } catch (Throwable th) {
            obtainStyledAttributes2.recycle();
            throw th;
        }
    }

    public void setStatusBarBackground(int i10) {
        this.f7410w = i10 != 0 ? androidx.core.content.a.e(getContext(), i10) : null;
        invalidate();
    }

    public static class f extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public int f7418a;

        /* renamed from: b, reason: collision with root package name */
        float f7419b;

        /* renamed from: c, reason: collision with root package name */
        boolean f7420c;

        /* renamed from: d, reason: collision with root package name */
        int f7421d;

        public f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f7418a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f7373i0);
            this.f7418a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public f(int i10, int i11) {
            super(i10, i11);
            this.f7418a = 0;
        }

        public f(f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
            this.f7418a = 0;
            this.f7418a = fVar.f7418a;
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f7418a = 0;
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f7418a = 0;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    protected static class g extends F0.a {
        public static final Parcelable.Creator<g> CREATOR = new C0141a();

        /* renamed from: c, reason: collision with root package name */
        int f7422c;

        /* renamed from: d, reason: collision with root package name */
        int f7423d;

        /* renamed from: e, reason: collision with root package name */
        int f7424e;

        /* renamed from: f, reason: collision with root package name */
        int f7425f;

        /* renamed from: g, reason: collision with root package name */
        int f7426g;

        /* renamed from: P0.a$g$a, reason: collision with other inner class name */
        class C0141a implements Parcelable.ClassLoaderCreator {
            C0141a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public g[] newArray(int i10) {
                return new g[i10];
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f7422c = 0;
            this.f7422c = parcel.readInt();
            this.f7423d = parcel.readInt();
            this.f7424e = parcel.readInt();
            this.f7425f = parcel.readInt();
            this.f7426g = parcel.readInt();
        }

        @Override // F0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f7422c);
            parcel.writeInt(this.f7423d);
            parcel.writeInt(this.f7424e);
            parcel.writeInt(this.f7425f);
            parcel.writeInt(this.f7426g);
        }

        public g(Parcelable parcelable) {
            super(parcelable);
            this.f7422c = 0;
        }
    }
}
