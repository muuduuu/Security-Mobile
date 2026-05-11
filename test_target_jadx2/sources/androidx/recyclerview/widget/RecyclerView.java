package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.core.view.AbstractC1484a0;
import androidx.core.view.AbstractC1492e0;
import androidx.core.view.C1483a;
import androidx.core.view.ScrollingView;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.b;
import androidx.recyclerview.widget.f;
import androidx.recyclerview.widget.l;
import androidx.recyclerview.widget.p;
import androidx.recyclerview.widget.q;
import g1.AbstractC3181a;
import g1.AbstractC3182b;
import g1.AbstractC3183c;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;
import z0.AbstractC5233b;
import z0.C5228A;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements ScrollingView, androidx.core.view.D {

    /* renamed from: U0, reason: collision with root package name */
    static boolean f17321U0 = false;

    /* renamed from: V0, reason: collision with root package name */
    static boolean f17322V0 = false;

    /* renamed from: W0, reason: collision with root package name */
    private static final int[] f17323W0 = {R.attr.nestedScrollingEnabled};

    /* renamed from: X0, reason: collision with root package name */
    private static final float f17324X0 = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: Y0, reason: collision with root package name */
    static final boolean f17325Y0 = false;

    /* renamed from: Z0, reason: collision with root package name */
    static final boolean f17326Z0 = true;

    /* renamed from: a1, reason: collision with root package name */
    static final boolean f17327a1 = true;

    /* renamed from: b1, reason: collision with root package name */
    static final boolean f17328b1 = true;

    /* renamed from: c1, reason: collision with root package name */
    private static final boolean f17329c1 = false;

    /* renamed from: d1, reason: collision with root package name */
    private static final boolean f17330d1 = false;

    /* renamed from: e1, reason: collision with root package name */
    private static final Class[] f17331e1;

    /* renamed from: f1, reason: collision with root package name */
    static final Interpolator f17332f1;

    /* renamed from: g1, reason: collision with root package name */
    static final C f17333g1;

    /* renamed from: A, reason: collision with root package name */
    private int f17334A;

    /* renamed from: A0, reason: collision with root package name */
    f.b f17335A0;

    /* renamed from: B, reason: collision with root package name */
    boolean f17336B;

    /* renamed from: B0, reason: collision with root package name */
    final B f17337B0;

    /* renamed from: C, reason: collision with root package name */
    private final AccessibilityManager f17338C;

    /* renamed from: C0, reason: collision with root package name */
    private u f17339C0;

    /* renamed from: D, reason: collision with root package name */
    private List f17340D;

    /* renamed from: D0, reason: collision with root package name */
    private List f17341D0;

    /* renamed from: E, reason: collision with root package name */
    boolean f17342E;

    /* renamed from: E0, reason: collision with root package name */
    boolean f17343E0;

    /* renamed from: F, reason: collision with root package name */
    boolean f17344F;

    /* renamed from: F0, reason: collision with root package name */
    boolean f17345F0;

    /* renamed from: G, reason: collision with root package name */
    private int f17346G;

    /* renamed from: G0, reason: collision with root package name */
    private m.a f17347G0;

    /* renamed from: H, reason: collision with root package name */
    private int f17348H;

    /* renamed from: H0, reason: collision with root package name */
    boolean f17349H0;

    /* renamed from: I, reason: collision with root package name */
    private l f17350I;

    /* renamed from: I0, reason: collision with root package name */
    androidx.recyclerview.widget.l f17351I0;

    /* renamed from: J, reason: collision with root package name */
    private EdgeEffect f17352J;

    /* renamed from: J0, reason: collision with root package name */
    private final int[] f17353J0;

    /* renamed from: K, reason: collision with root package name */
    private EdgeEffect f17354K;

    /* renamed from: K0, reason: collision with root package name */
    private androidx.core.view.E f17355K0;

    /* renamed from: L0, reason: collision with root package name */
    private final int[] f17356L0;

    /* renamed from: M0, reason: collision with root package name */
    private final int[] f17357M0;

    /* renamed from: N0, reason: collision with root package name */
    final int[] f17358N0;

    /* renamed from: O0, reason: collision with root package name */
    final List f17359O0;

    /* renamed from: P0, reason: collision with root package name */
    private Runnable f17360P0;

    /* renamed from: Q0, reason: collision with root package name */
    private boolean f17361Q0;

    /* renamed from: R0, reason: collision with root package name */
    private int f17362R0;

    /* renamed from: S0, reason: collision with root package name */
    private int f17363S0;

    /* renamed from: T0, reason: collision with root package name */
    private final q.b f17364T0;

    /* renamed from: a, reason: collision with root package name */
    private final float f17365a;

    /* renamed from: b, reason: collision with root package name */
    private final y f17366b;

    /* renamed from: c, reason: collision with root package name */
    final w f17367c;

    /* renamed from: d, reason: collision with root package name */
    z f17368d;

    /* renamed from: e, reason: collision with root package name */
    a f17369e;

    /* renamed from: f, reason: collision with root package name */
    b f17370f;

    /* renamed from: g, reason: collision with root package name */
    final androidx.recyclerview.widget.q f17371g;

    /* renamed from: h, reason: collision with root package name */
    boolean f17372h;

    /* renamed from: h0, reason: collision with root package name */
    private EdgeEffect f17373h0;

    /* renamed from: i, reason: collision with root package name */
    final Runnable f17374i;

    /* renamed from: i0, reason: collision with root package name */
    private EdgeEffect f17375i0;

    /* renamed from: j, reason: collision with root package name */
    final Rect f17376j;

    /* renamed from: j0, reason: collision with root package name */
    m f17377j0;

    /* renamed from: k, reason: collision with root package name */
    private final Rect f17378k;

    /* renamed from: k0, reason: collision with root package name */
    private int f17379k0;

    /* renamed from: l, reason: collision with root package name */
    final RectF f17380l;

    /* renamed from: l0, reason: collision with root package name */
    private int f17381l0;

    /* renamed from: m, reason: collision with root package name */
    h f17382m;

    /* renamed from: m0, reason: collision with root package name */
    private VelocityTracker f17383m0;

    /* renamed from: n, reason: collision with root package name */
    p f17384n;

    /* renamed from: n0, reason: collision with root package name */
    private int f17385n0;

    /* renamed from: o, reason: collision with root package name */
    final List f17386o;

    /* renamed from: o0, reason: collision with root package name */
    private int f17387o0;

    /* renamed from: p, reason: collision with root package name */
    final ArrayList f17388p;

    /* renamed from: p0, reason: collision with root package name */
    private int f17389p0;

    /* renamed from: q, reason: collision with root package name */
    private final ArrayList f17390q;

    /* renamed from: q0, reason: collision with root package name */
    private int f17391q0;

    /* renamed from: r, reason: collision with root package name */
    private t f17392r;

    /* renamed from: r0, reason: collision with root package name */
    private int f17393r0;

    /* renamed from: s, reason: collision with root package name */
    boolean f17394s;

    /* renamed from: s0, reason: collision with root package name */
    private s f17395s0;

    /* renamed from: t, reason: collision with root package name */
    boolean f17396t;

    /* renamed from: t0, reason: collision with root package name */
    private final int f17397t0;

    /* renamed from: u, reason: collision with root package name */
    boolean f17398u;

    /* renamed from: u0, reason: collision with root package name */
    private final int f17399u0;

    /* renamed from: v, reason: collision with root package name */
    boolean f17400v;

    /* renamed from: v0, reason: collision with root package name */
    private float f17401v0;

    /* renamed from: w, reason: collision with root package name */
    private int f17402w;

    /* renamed from: w0, reason: collision with root package name */
    private float f17403w0;

    /* renamed from: x, reason: collision with root package name */
    boolean f17404x;

    /* renamed from: x0, reason: collision with root package name */
    private boolean f17405x0;

    /* renamed from: y, reason: collision with root package name */
    boolean f17406y;

    /* renamed from: y0, reason: collision with root package name */
    final E f17407y0;

    /* renamed from: z, reason: collision with root package name */
    private boolean f17408z;

    /* renamed from: z0, reason: collision with root package name */
    f f17409z0;

    public static abstract class A {

        /* renamed from: b, reason: collision with root package name */
        private RecyclerView f17411b;

        /* renamed from: c, reason: collision with root package name */
        private p f17412c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f17413d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f17414e;

        /* renamed from: f, reason: collision with root package name */
        private View f17415f;

        /* renamed from: h, reason: collision with root package name */
        private boolean f17417h;

        /* renamed from: a, reason: collision with root package name */
        private int f17410a = -1;

        /* renamed from: g, reason: collision with root package name */
        private final a f17416g = new a(0, 0);

        public static class a {

            /* renamed from: a, reason: collision with root package name */
            private int f17418a;

            /* renamed from: b, reason: collision with root package name */
            private int f17419b;

            /* renamed from: c, reason: collision with root package name */
            private int f17420c;

            /* renamed from: d, reason: collision with root package name */
            private int f17421d;

            /* renamed from: e, reason: collision with root package name */
            private Interpolator f17422e;

            /* renamed from: f, reason: collision with root package name */
            private boolean f17423f;

            /* renamed from: g, reason: collision with root package name */
            private int f17424g;

            public a(int i10, int i11) {
                this(i10, i11, Integer.MIN_VALUE, null);
            }

            private void e() {
                if (this.f17422e != null && this.f17420c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (this.f17420c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            boolean a() {
                return this.f17421d >= 0;
            }

            public void b(int i10) {
                this.f17421d = i10;
            }

            void c(RecyclerView recyclerView) {
                int i10 = this.f17421d;
                if (i10 >= 0) {
                    this.f17421d = -1;
                    recyclerView.D0(i10);
                    this.f17423f = false;
                } else {
                    if (!this.f17423f) {
                        this.f17424g = 0;
                        return;
                    }
                    e();
                    recyclerView.f17407y0.e(this.f17418a, this.f17419b, this.f17420c, this.f17422e);
                    int i11 = this.f17424g + 1;
                    this.f17424g = i11;
                    if (i11 > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f17423f = false;
                }
            }

            public void d(int i10, int i11, int i12, Interpolator interpolator) {
                this.f17418a = i10;
                this.f17419b = i11;
                this.f17420c = i12;
                this.f17422e = interpolator;
                this.f17423f = true;
            }

            public a(int i10, int i11, int i12, Interpolator interpolator) {
                this.f17421d = -1;
                this.f17423f = false;
                this.f17424g = 0;
                this.f17418a = i10;
                this.f17419b = i11;
                this.f17420c = i12;
                this.f17422e = interpolator;
            }
        }

        public interface b {
            PointF a(int i10);
        }

        public PointF a(int i10) {
            Object e10 = e();
            if (e10 instanceof b) {
                return ((b) e10).a(i10);
            }
            Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b.class.getCanonicalName());
            return null;
        }

        public View b(int i10) {
            return this.f17411b.f17384n.C(i10);
        }

        public int c() {
            return this.f17411b.f17384n.J();
        }

        public int d(View view) {
            return this.f17411b.j0(view);
        }

        public p e() {
            return this.f17412c;
        }

        public int f() {
            return this.f17410a;
        }

        public boolean g() {
            return this.f17413d;
        }

        public boolean h() {
            return this.f17414e;
        }

        protected void i(PointF pointF) {
            float f10 = pointF.x;
            float f11 = pointF.y;
            float sqrt = (float) Math.sqrt((f10 * f10) + (f11 * f11));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }

        void j(int i10, int i11) {
            PointF a10;
            RecyclerView recyclerView = this.f17411b;
            if (this.f17410a == -1 || recyclerView == null) {
                r();
            }
            if (this.f17413d && this.f17415f == null && this.f17412c != null && (a10 = a(this.f17410a)) != null) {
                float f10 = a10.x;
                if (f10 != 0.0f || a10.y != 0.0f) {
                    recyclerView.q1((int) Math.signum(f10), (int) Math.signum(a10.y), null);
                }
            }
            this.f17413d = false;
            View view = this.f17415f;
            if (view != null) {
                if (d(view) == this.f17410a) {
                    o(this.f17415f, recyclerView.f17337B0, this.f17416g);
                    this.f17416g.c(recyclerView);
                    r();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f17415f = null;
                }
            }
            if (this.f17414e) {
                l(i10, i11, recyclerView.f17337B0, this.f17416g);
                boolean a11 = this.f17416g.a();
                this.f17416g.c(recyclerView);
                if (a11 && this.f17414e) {
                    this.f17413d = true;
                    recyclerView.f17407y0.d();
                }
            }
        }

        protected void k(View view) {
            if (d(view) == f()) {
                this.f17415f = view;
                if (RecyclerView.f17322V0) {
                    Log.d("RecyclerView", "smooth scroll target view has been attached");
                }
            }
        }

        protected abstract void l(int i10, int i11, B b10, a aVar);

        protected abstract void m();

        protected abstract void n();

        protected abstract void o(View view, B b10, a aVar);

        public void p(int i10) {
            this.f17410a = i10;
        }

        void q(RecyclerView recyclerView, p pVar) {
            recyclerView.f17407y0.f();
            if (this.f17417h) {
                Log.w("RecyclerView", "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.f17411b = recyclerView;
            this.f17412c = pVar;
            int i10 = this.f17410a;
            if (i10 == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.f17337B0.f17425a = i10;
            this.f17414e = true;
            this.f17413d = true;
            this.f17415f = b(f());
            m();
            this.f17411b.f17407y0.d();
            this.f17417h = true;
        }

        protected final void r() {
            if (this.f17414e) {
                this.f17414e = false;
                n();
                this.f17411b.f17337B0.f17425a = -1;
                this.f17415f = null;
                this.f17410a = -1;
                this.f17413d = false;
                this.f17412c.f1(this);
                this.f17412c = null;
                this.f17411b = null;
            }
        }
    }

    public static class B {

        /* renamed from: b, reason: collision with root package name */
        private SparseArray f17426b;

        /* renamed from: m, reason: collision with root package name */
        int f17437m;

        /* renamed from: n, reason: collision with root package name */
        long f17438n;

        /* renamed from: o, reason: collision with root package name */
        int f17439o;

        /* renamed from: p, reason: collision with root package name */
        int f17440p;

        /* renamed from: q, reason: collision with root package name */
        int f17441q;

        /* renamed from: a, reason: collision with root package name */
        int f17425a = -1;

        /* renamed from: c, reason: collision with root package name */
        int f17427c = 0;

        /* renamed from: d, reason: collision with root package name */
        int f17428d = 0;

        /* renamed from: e, reason: collision with root package name */
        int f17429e = 1;

        /* renamed from: f, reason: collision with root package name */
        int f17430f = 0;

        /* renamed from: g, reason: collision with root package name */
        boolean f17431g = false;

        /* renamed from: h, reason: collision with root package name */
        boolean f17432h = false;

        /* renamed from: i, reason: collision with root package name */
        boolean f17433i = false;

        /* renamed from: j, reason: collision with root package name */
        boolean f17434j = false;

        /* renamed from: k, reason: collision with root package name */
        boolean f17435k = false;

        /* renamed from: l, reason: collision with root package name */
        boolean f17436l = false;

        void a(int i10) {
            if ((this.f17429e & i10) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.f17429e));
        }

        public int b() {
            return this.f17432h ? this.f17427c - this.f17428d : this.f17430f;
        }

        public int c() {
            return this.f17425a;
        }

        public boolean d() {
            return this.f17425a != -1;
        }

        public boolean e() {
            return this.f17432h;
        }

        void f(h hVar) {
            this.f17429e = 1;
            this.f17430f = hVar.e();
            this.f17432h = false;
            this.f17433i = false;
            this.f17434j = false;
        }

        public boolean g() {
            return this.f17436l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f17425a + ", mData=" + this.f17426b + ", mItemCount=" + this.f17430f + ", mIsMeasuring=" + this.f17434j + ", mPreviousLayoutItemCount=" + this.f17427c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f17428d + ", mStructureChanged=" + this.f17431g + ", mInPreLayout=" + this.f17432h + ", mRunSimpleAnimations=" + this.f17435k + ", mRunPredictiveAnimations=" + this.f17436l + '}';
        }
    }

    static class C extends l {
        C() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.l
        protected EdgeEffect a(RecyclerView recyclerView, int i10) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    public static abstract class D {
    }

    class E implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private int f17442a;

        /* renamed from: b, reason: collision with root package name */
        private int f17443b;

        /* renamed from: c, reason: collision with root package name */
        OverScroller f17444c;

        /* renamed from: d, reason: collision with root package name */
        Interpolator f17445d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f17446e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f17447f;

        E() {
            Interpolator interpolator = RecyclerView.f17332f1;
            this.f17445d = interpolator;
            this.f17446e = false;
            this.f17447f = false;
            this.f17444c = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        private int a(int i10, int i11) {
            int abs = Math.abs(i10);
            int abs2 = Math.abs(i11);
            boolean z10 = abs > abs2;
            RecyclerView recyclerView = RecyclerView.this;
            int width = z10 ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z10) {
                abs = abs2;
            }
            return Math.min((int) (((abs / width) + 1.0f) * 300.0f), 2000);
        }

        private void c() {
            RecyclerView.this.removeCallbacks(this);
            AbstractC1484a0.i0(RecyclerView.this, this);
        }

        public void b(int i10, int i11) {
            RecyclerView.this.setScrollState(2);
            this.f17443b = 0;
            this.f17442a = 0;
            Interpolator interpolator = this.f17445d;
            Interpolator interpolator2 = RecyclerView.f17332f1;
            if (interpolator != interpolator2) {
                this.f17445d = interpolator2;
                this.f17444c = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f17444c.fling(0, 0, i10, i11, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            d();
        }

        void d() {
            if (this.f17446e) {
                this.f17447f = true;
            } else {
                c();
            }
        }

        public void e(int i10, int i11, int i12, Interpolator interpolator) {
            if (i12 == Integer.MIN_VALUE) {
                i12 = a(i10, i11);
            }
            int i13 = i12;
            if (interpolator == null) {
                interpolator = RecyclerView.f17332f1;
            }
            if (this.f17445d != interpolator) {
                this.f17445d = interpolator;
                this.f17444c = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f17443b = 0;
            this.f17442a = 0;
            RecyclerView.this.setScrollState(2);
            this.f17444c.startScroll(0, 0, i10, i11, i13);
            d();
        }

        public void f() {
            RecyclerView.this.removeCallbacks(this);
            this.f17444c.abortAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i10;
            int i11;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f17384n == null) {
                f();
                return;
            }
            this.f17447f = false;
            this.f17446e = true;
            recyclerView.A();
            OverScroller overScroller = this.f17444c;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i12 = currX - this.f17442a;
                int i13 = currY - this.f17443b;
                this.f17442a = currX;
                this.f17443b = currY;
                int x10 = RecyclerView.this.x(i12);
                int z10 = RecyclerView.this.z(i13);
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.f17358N0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.L(x10, z10, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.f17358N0;
                    x10 -= iArr2[0];
                    z10 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.w(x10, z10);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.f17382m != null) {
                    int[] iArr3 = recyclerView3.f17358N0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.q1(x10, z10, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.f17358N0;
                    i11 = iArr4[0];
                    i10 = iArr4[1];
                    x10 -= i11;
                    z10 -= i10;
                    A a10 = recyclerView4.f17384n.f17495g;
                    if (a10 != null && !a10.g() && a10.h()) {
                        int b10 = RecyclerView.this.f17337B0.b();
                        if (b10 == 0) {
                            a10.r();
                        } else if (a10.f() >= b10) {
                            a10.p(b10 - 1);
                            a10.j(i11, i10);
                        } else {
                            a10.j(i11, i10);
                        }
                    }
                } else {
                    i10 = 0;
                    i11 = 0;
                }
                if (!RecyclerView.this.f17388p.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.f17358N0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.M(i11, i10, x10, z10, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.f17358N0;
                int i14 = x10 - iArr6[0];
                int i15 = z10 - iArr6[1];
                if (i11 != 0 || i10 != 0) {
                    recyclerView6.O(i11, i10);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z11 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i14 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i15 != 0));
                A a11 = RecyclerView.this.f17384n.f17495g;
                if ((a11 == null || !a11.g()) && z11) {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i16 = i14 < 0 ? -currVelocity : i14 > 0 ? currVelocity : 0;
                        if (i15 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i15 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.a(i16, currVelocity);
                    }
                    if (RecyclerView.f17328b1) {
                        RecyclerView.this.f17335A0.b();
                    }
                } else {
                    d();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    f fVar = recyclerView7.f17409z0;
                    if (fVar != null) {
                        fVar.f(recyclerView7, i11, i10);
                    }
                }
            }
            A a12 = RecyclerView.this.f17384n.f17495g;
            if (a12 != null && a12.g()) {
                a12.j(0, 0);
            }
            this.f17446e = false;
            if (this.f17447f) {
                c();
            } else {
                RecyclerView.this.setScrollState(0);
                RecyclerView.this.F1(1);
            }
        }
    }

    public static abstract class F {

        /* renamed from: t, reason: collision with root package name */
        private static final List f17449t = Collections.emptyList();

        /* renamed from: a, reason: collision with root package name */
        public final View f17450a;

        /* renamed from: b, reason: collision with root package name */
        WeakReference f17451b;

        /* renamed from: j, reason: collision with root package name */
        int f17459j;

        /* renamed from: r, reason: collision with root package name */
        RecyclerView f17467r;

        /* renamed from: s, reason: collision with root package name */
        h f17468s;

        /* renamed from: c, reason: collision with root package name */
        int f17452c = -1;

        /* renamed from: d, reason: collision with root package name */
        int f17453d = -1;

        /* renamed from: e, reason: collision with root package name */
        long f17454e = -1;

        /* renamed from: f, reason: collision with root package name */
        int f17455f = -1;

        /* renamed from: g, reason: collision with root package name */
        int f17456g = -1;

        /* renamed from: h, reason: collision with root package name */
        F f17457h = null;

        /* renamed from: i, reason: collision with root package name */
        F f17458i = null;

        /* renamed from: k, reason: collision with root package name */
        List f17460k = null;

        /* renamed from: l, reason: collision with root package name */
        List f17461l = null;

        /* renamed from: m, reason: collision with root package name */
        private int f17462m = 0;

        /* renamed from: n, reason: collision with root package name */
        w f17463n = null;

        /* renamed from: o, reason: collision with root package name */
        boolean f17464o = false;

        /* renamed from: p, reason: collision with root package name */
        private int f17465p = 0;

        /* renamed from: q, reason: collision with root package name */
        int f17466q = -1;

        public F(View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.f17450a = view;
        }

        private void g() {
            if (this.f17460k == null) {
                ArrayList arrayList = new ArrayList();
                this.f17460k = arrayList;
                this.f17461l = Collections.unmodifiableList(arrayList);
            }
        }

        boolean A() {
            return (this.f17459j & 2) != 0;
        }

        boolean B() {
            return (this.f17459j & 2) != 0;
        }

        void C(int i10, boolean z10) {
            if (this.f17453d == -1) {
                this.f17453d = this.f17452c;
            }
            if (this.f17456g == -1) {
                this.f17456g = this.f17452c;
            }
            if (z10) {
                this.f17456g += i10;
            }
            this.f17452c += i10;
            if (this.f17450a.getLayoutParams() != null) {
                ((q) this.f17450a.getLayoutParams()).f17515c = true;
            }
        }

        void D(RecyclerView recyclerView) {
            int i10 = this.f17466q;
            if (i10 != -1) {
                this.f17465p = i10;
            } else {
                this.f17465p = AbstractC1484a0.y(this.f17450a);
            }
            recyclerView.t1(this, 4);
        }

        void E(RecyclerView recyclerView) {
            recyclerView.t1(this, this.f17465p);
            this.f17465p = 0;
        }

        void F() {
            if (RecyclerView.f17321U0 && z()) {
                throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
            }
            this.f17459j = 0;
            this.f17452c = -1;
            this.f17453d = -1;
            this.f17454e = -1L;
            this.f17456g = -1;
            this.f17462m = 0;
            this.f17457h = null;
            this.f17458i = null;
            d();
            this.f17465p = 0;
            this.f17466q = -1;
            RecyclerView.u(this);
        }

        void G() {
            if (this.f17453d == -1) {
                this.f17453d = this.f17452c;
            }
        }

        void H(int i10, int i11) {
            this.f17459j = (i10 & i11) | (this.f17459j & (~i11));
        }

        public final void I(boolean z10) {
            int i10 = this.f17462m;
            int i11 = z10 ? i10 - 1 : i10 + 1;
            this.f17462m = i11;
            if (i11 < 0) {
                this.f17462m = 0;
                if (RecyclerView.f17321U0) {
                    throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                }
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else if (!z10 && i11 == 1) {
                this.f17459j |= 16;
            } else if (z10 && i11 == 0) {
                this.f17459j &= -17;
            }
            if (RecyclerView.f17322V0) {
                Log.d("RecyclerView", "setIsRecyclable val:" + z10 + ":" + this);
            }
        }

        void J(w wVar, boolean z10) {
            this.f17463n = wVar;
            this.f17464o = z10;
        }

        boolean K() {
            return (this.f17459j & 16) != 0;
        }

        boolean L() {
            return (this.f17459j & 128) != 0;
        }

        void M() {
            this.f17463n.O(this);
        }

        boolean N() {
            return (this.f17459j & 32) != 0;
        }

        void a(Object obj) {
            if (obj == null) {
                b(1024);
            } else if ((1024 & this.f17459j) == 0) {
                g();
                this.f17460k.add(obj);
            }
        }

        void b(int i10) {
            this.f17459j = i10 | this.f17459j;
        }

        void c() {
            this.f17453d = -1;
            this.f17456g = -1;
        }

        void d() {
            List list = this.f17460k;
            if (list != null) {
                list.clear();
            }
            this.f17459j &= -1025;
        }

        void e() {
            this.f17459j &= -33;
        }

        void f() {
            this.f17459j &= -257;
        }

        boolean h() {
            return (this.f17459j & 16) == 0 && AbstractC1484a0.R(this.f17450a);
        }

        void i(int i10, int i11, boolean z10) {
            b(8);
            C(i11, z10);
            this.f17452c = i10;
        }

        public final int j() {
            RecyclerView recyclerView = this.f17467r;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.h0(this);
        }

        public final int k() {
            return l();
        }

        public final int l() {
            RecyclerView recyclerView;
            h adapter;
            int h02;
            if (this.f17468s == null || (recyclerView = this.f17467r) == null || (adapter = recyclerView.getAdapter()) == null || (h02 = this.f17467r.h0(this)) == -1) {
                return -1;
            }
            return adapter.d(this.f17468s, this, h02);
        }

        public final long m() {
            return this.f17454e;
        }

        public final int n() {
            return this.f17455f;
        }

        public final int o() {
            int i10 = this.f17456g;
            return i10 == -1 ? this.f17452c : i10;
        }

        public final int p() {
            return this.f17453d;
        }

        List q() {
            if ((this.f17459j & 1024) != 0) {
                return f17449t;
            }
            List list = this.f17460k;
            return (list == null || list.size() == 0) ? f17449t : this.f17461l;
        }

        boolean r(int i10) {
            return (i10 & this.f17459j) != 0;
        }

        boolean s() {
            return (this.f17459j & 512) != 0 || v();
        }

        boolean t() {
            return (this.f17450a.getParent() == null || this.f17450a.getParent() == this.f17467r) ? false : true;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.f17452c + " id=" + this.f17454e + ", oldPos=" + this.f17453d + ", pLpos:" + this.f17456g);
            if (y()) {
                sb2.append(" scrap ");
                sb2.append(this.f17464o ? "[changeScrap]" : "[attachedScrap]");
            }
            if (v()) {
                sb2.append(" invalid");
            }
            if (!u()) {
                sb2.append(" unbound");
            }
            if (B()) {
                sb2.append(" update");
            }
            if (x()) {
                sb2.append(" removed");
            }
            if (L()) {
                sb2.append(" ignored");
            }
            if (z()) {
                sb2.append(" tmpDetached");
            }
            if (!w()) {
                sb2.append(" not recyclable(" + this.f17462m + ")");
            }
            if (s()) {
                sb2.append(" undefined adapter position");
            }
            if (this.f17450a.getParent() == null) {
                sb2.append(" no parent");
            }
            sb2.append("}");
            return sb2.toString();
        }

        boolean u() {
            return (this.f17459j & 1) != 0;
        }

        boolean v() {
            return (this.f17459j & 4) != 0;
        }

        public final boolean w() {
            return (this.f17459j & 16) == 0 && !AbstractC1484a0.R(this.f17450a);
        }

        boolean x() {
            return (this.f17459j & 8) != 0;
        }

        boolean y() {
            return this.f17463n != null;
        }

        boolean z() {
            return (this.f17459j & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a, reason: case insensitive filesystem */
    class RunnableC1609a implements Runnable {
        RunnableC1609a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.f17400v || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.f17394s) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.f17406y) {
                recyclerView2.f17404x = true;
            } else {
                recyclerView2.A();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b, reason: case insensitive filesystem */
    class RunnableC1610b implements Runnable {
        RunnableC1610b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m mVar = RecyclerView.this.f17377j0;
            if (mVar != null) {
                mVar.u();
            }
            RecyclerView.this.f17349H0 = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c, reason: case insensitive filesystem */
    class InterpolatorC1611c implements Interpolator {
        InterpolatorC1611c() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$d, reason: case insensitive filesystem */
    class C1612d implements q.b {
        C1612d() {
        }

        @Override // androidx.recyclerview.widget.q.b
        public void a(F f10) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f17384n.m1(f10.f17450a, recyclerView.f17367c);
        }

        @Override // androidx.recyclerview.widget.q.b
        public void b(F f10, m.b bVar, m.b bVar2) {
            RecyclerView.this.o(f10, bVar, bVar2);
        }

        @Override // androidx.recyclerview.widget.q.b
        public void c(F f10, m.b bVar, m.b bVar2) {
            RecyclerView.this.f17367c.O(f10);
            RecyclerView.this.q(f10, bVar, bVar2);
        }

        @Override // androidx.recyclerview.widget.q.b
        public void d(F f10, m.b bVar, m.b bVar2) {
            f10.I(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f17342E) {
                if (recyclerView.f17377j0.b(f10, f10, bVar, bVar2)) {
                    RecyclerView.this.U0();
                }
            } else if (recyclerView.f17377j0.d(f10, bVar, bVar2)) {
                RecyclerView.this.U0();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$e, reason: case insensitive filesystem */
    class C1613e implements b.InterfaceC0300b {
        C1613e() {
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0300b
        public View b(int i10) {
            return RecyclerView.this.getChildAt(i10);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0300b
        public int c() {
            return RecyclerView.this.getChildCount();
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0300b
        public void d(View view) {
            F l02 = RecyclerView.l0(view);
            if (l02 != null) {
                l02.D(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0300b
        public void e() {
            int c10 = c();
            for (int i10 = 0; i10 < c10; i10++) {
                View b10 = b(i10);
                RecyclerView.this.F(b10);
                b10.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0300b
        public int f(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0300b
        public F g(View view) {
            return RecyclerView.l0(view);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0300b
        public void h(int i10) {
            View b10 = b(i10);
            if (b10 != null) {
                F l02 = RecyclerView.l0(b10);
                if (l02 != null) {
                    if (l02.z() && !l02.L()) {
                        throw new IllegalArgumentException("called detach on an already detached child " + l02 + RecyclerView.this.V());
                    }
                    if (RecyclerView.f17322V0) {
                        Log.d("RecyclerView", "tmpDetach " + l02);
                    }
                    l02.b(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                }
            } else if (RecyclerView.f17321U0) {
                throw new IllegalArgumentException("No view at offset " + i10 + RecyclerView.this.V());
            }
            RecyclerView.this.detachViewFromParent(i10);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0300b
        public void i(View view) {
            F l02 = RecyclerView.l0(view);
            if (l02 != null) {
                l02.E(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0300b
        public void j(View view, int i10) {
            RecyclerView.this.addView(view, i10);
            RecyclerView.this.E(view);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0300b
        public void k(int i10) {
            View childAt = RecyclerView.this.getChildAt(i10);
            if (childAt != null) {
                RecyclerView.this.F(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i10);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0300b
        public void l(View view, int i10, ViewGroup.LayoutParams layoutParams) {
            F l02 = RecyclerView.l0(view);
            if (l02 != null) {
                if (!l02.z() && !l02.L()) {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + l02 + RecyclerView.this.V());
                }
                if (RecyclerView.f17322V0) {
                    Log.d("RecyclerView", "reAttach " + l02);
                }
                l02.f();
            } else if (RecyclerView.f17321U0) {
                throw new IllegalArgumentException("No ViewHolder found for child: " + view + ", index: " + i10 + RecyclerView.this.V());
            }
            RecyclerView.this.attachViewToParent(view, i10, layoutParams);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$f, reason: case insensitive filesystem */
    class C1614f implements a.InterfaceC0299a {
        C1614f() {
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0299a
        public void a(int i10, int i11) {
            RecyclerView.this.K0(i10, i11);
            RecyclerView.this.f17343E0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0299a
        public void b(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0299a
        public void c(int i10, int i11, Object obj) {
            RecyclerView.this.I1(i10, i11, obj);
            RecyclerView.this.f17345F0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0299a
        public void d(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0299a
        public F e(int i10) {
            F f02 = RecyclerView.this.f0(i10, true);
            if (f02 == null) {
                return null;
            }
            if (!RecyclerView.this.f17370f.n(f02.f17450a)) {
                return f02;
            }
            if (RecyclerView.f17322V0) {
                Log.d("RecyclerView", "assuming view holder cannot be find because it is hidden");
            }
            return null;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0299a
        public void f(int i10, int i11) {
            RecyclerView.this.L0(i10, i11, false);
            RecyclerView.this.f17343E0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0299a
        public void g(int i10, int i11) {
            RecyclerView.this.J0(i10, i11);
            RecyclerView.this.f17343E0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0299a
        public void h(int i10, int i11) {
            RecyclerView.this.L0(i10, i11, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f17343E0 = true;
            recyclerView.f17337B0.f17428d += i11;
        }

        void i(a.b bVar) {
            int i10 = bVar.f17598a;
            if (i10 == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.f17384n.R0(recyclerView, bVar.f17599b, bVar.f17601d);
                return;
            }
            if (i10 == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.f17384n.U0(recyclerView2, bVar.f17599b, bVar.f17601d);
            } else if (i10 == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.f17384n.W0(recyclerView3, bVar.f17599b, bVar.f17601d, bVar.f17600c);
            } else {
                if (i10 != 8) {
                    return;
                }
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.f17384n.T0(recyclerView4, bVar.f17599b, bVar.f17601d, 1);
            }
        }
    }

    static /* synthetic */ class g {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f17474a;

        static {
            int[] iArr = new int[h.a.values().length];
            f17474a = iArr;
            try {
                iArr[h.a.PREVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17474a[h.a.PREVENT_WHEN_EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static abstract class h {

        /* renamed from: a, reason: collision with root package name */
        private final i f17475a = new i();

        /* renamed from: b, reason: collision with root package name */
        private boolean f17476b = false;

        /* renamed from: c, reason: collision with root package name */
        private a f17477c = a.ALLOW;

        public enum a {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        public final void a(F f10, int i10) {
            boolean z10 = f10.f17468s == null;
            if (z10) {
                f10.f17452c = i10;
                if (i()) {
                    f10.f17454e = f(i10);
                }
                f10.H(1, 519);
                androidx.core.os.o.a("RV OnBindView");
            }
            f10.f17468s = this;
            if (RecyclerView.f17321U0) {
                if (f10.f17450a.getParent() == null && AbstractC1484a0.T(f10.f17450a) != f10.z()) {
                    throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + f10.z() + ", attached to window: " + AbstractC1484a0.T(f10.f17450a) + ", holder: " + f10);
                }
                if (f10.f17450a.getParent() == null && AbstractC1484a0.T(f10.f17450a)) {
                    throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + f10);
                }
            }
            q(f10, i10, f10.q());
            if (z10) {
                f10.d();
                ViewGroup.LayoutParams layoutParams = f10.f17450a.getLayoutParams();
                if (layoutParams instanceof q) {
                    ((q) layoutParams).f17515c = true;
                }
                androidx.core.os.o.b();
            }
        }

        boolean b() {
            int i10 = g.f17474a[this.f17477c.ordinal()];
            if (i10 != 1) {
                return i10 != 2 || e() > 0;
            }
            return false;
        }

        public final F c(ViewGroup viewGroup, int i10) {
            try {
                androidx.core.os.o.a("RV CreateView");
                F r10 = r(viewGroup, i10);
                if (r10.f17450a.getParent() != null) {
                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                r10.f17455f = i10;
                return r10;
            } finally {
                androidx.core.os.o.b();
            }
        }

        public int d(h hVar, F f10, int i10) {
            if (hVar == this) {
                return i10;
            }
            return -1;
        }

        public abstract int e();

        public long f(int i10) {
            return -1L;
        }

        public int g(int i10) {
            return 0;
        }

        public final boolean h() {
            return this.f17475a.a();
        }

        public final boolean i() {
            return this.f17476b;
        }

        public final void j() {
            this.f17475a.b();
        }

        public final void k(int i10) {
            this.f17475a.c(i10, 1);
        }

        public final void l(int i10) {
            this.f17475a.e(i10, 1);
        }

        public final void m(int i10, int i11) {
            this.f17475a.f(i10, i11);
        }

        public final void n(int i10) {
            this.f17475a.f(i10, 1);
        }

        public void o(RecyclerView recyclerView) {
        }

        public abstract void p(F f10, int i10);

        public void q(F f10, int i10, List list) {
            p(f10, i10);
        }

        public abstract F r(ViewGroup viewGroup, int i10);

        public void s(RecyclerView recyclerView) {
        }

        public boolean t(F f10) {
            return false;
        }

        public void u(F f10) {
        }

        public void v(F f10) {
        }

        public void w(F f10) {
        }

        public void x(j jVar) {
            this.f17475a.registerObserver(jVar);
        }

        public void y(boolean z10) {
            if (h()) {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.f17476b = z10;
        }

        public void z(j jVar) {
            this.f17475a.unregisterObserver(jVar);
        }
    }

    static class i extends Observable {
        i() {
        }

        public boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public void b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).a();
            }
        }

        public void c(int i10, int i11) {
            d(i10, i11, null);
        }

        public void d(int i10, int i11, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).b(i10, i11, obj);
            }
        }

        public void e(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).c(i10, i11);
            }
        }

        public void f(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).d(i10, i11);
            }
        }
    }

    public static abstract class j {
        public abstract void a();

        public abstract void b(int i10, int i11, Object obj);

        public abstract void c(int i10, int i11);

        public abstract void d(int i10, int i11);
    }

    public interface k {
    }

    public static class l {
        protected abstract EdgeEffect a(RecyclerView recyclerView, int i10);
    }

    public static abstract class m {

        /* renamed from: a, reason: collision with root package name */
        private a f17478a = null;

        /* renamed from: b, reason: collision with root package name */
        private ArrayList f17479b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private long f17480c = 120;

        /* renamed from: d, reason: collision with root package name */
        private long f17481d = 120;

        /* renamed from: e, reason: collision with root package name */
        private long f17482e = 250;

        /* renamed from: f, reason: collision with root package name */
        private long f17483f = 250;

        interface a {
            void a(F f10);
        }

        public static class b {

            /* renamed from: a, reason: collision with root package name */
            public int f17484a;

            /* renamed from: b, reason: collision with root package name */
            public int f17485b;

            /* renamed from: c, reason: collision with root package name */
            public int f17486c;

            /* renamed from: d, reason: collision with root package name */
            public int f17487d;

            public b a(F f10) {
                return b(f10, 0);
            }

            public b b(F f10, int i10) {
                View view = f10.f17450a;
                this.f17484a = view.getLeft();
                this.f17485b = view.getTop();
                this.f17486c = view.getRight();
                this.f17487d = view.getBottom();
                return this;
            }
        }

        static int e(F f10) {
            int i10 = f10.f17459j;
            int i11 = i10 & 14;
            if (f10.v()) {
                return 4;
            }
            if ((i10 & 4) != 0) {
                return i11;
            }
            int p10 = f10.p();
            int j10 = f10.j();
            return (p10 == -1 || j10 == -1 || p10 == j10) ? i11 : i11 | 2048;
        }

        public abstract boolean a(F f10, b bVar, b bVar2);

        public abstract boolean b(F f10, F f11, b bVar, b bVar2);

        public abstract boolean c(F f10, b bVar, b bVar2);

        public abstract boolean d(F f10, b bVar, b bVar2);

        public abstract boolean f(F f10);

        public boolean g(F f10, List list) {
            return f(f10);
        }

        public final void h(F f10) {
            r(f10);
            a aVar = this.f17478a;
            if (aVar != null) {
                aVar.a(f10);
            }
        }

        public final void i() {
            if (this.f17479b.size() <= 0) {
                this.f17479b.clear();
            } else {
                android.support.v4.media.session.b.a(this.f17479b.get(0));
                throw null;
            }
        }

        public abstract void j(F f10);

        public abstract void k();

        public long l() {
            return this.f17480c;
        }

        public long m() {
            return this.f17483f;
        }

        public long n() {
            return this.f17482e;
        }

        public long o() {
            return this.f17481d;
        }

        public abstract boolean p();

        public b q() {
            return new b();
        }

        public void r(F f10) {
        }

        public b s(B b10, F f10) {
            return q().a(f10);
        }

        public b t(B b10, F f10, int i10, List list) {
            return q().a(f10);
        }

        public abstract void u();

        void v(a aVar) {
            this.f17478a = aVar;
        }
    }

    private class n implements m.a {
        n() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m.a
        public void a(F f10) {
            f10.I(true);
            if (f10.f17457h != null && f10.f17458i == null) {
                f10.f17457h = null;
            }
            f10.f17458i = null;
            if (f10.K() || RecyclerView.this.f1(f10.f17450a) || !f10.z()) {
                return;
            }
            RecyclerView.this.removeDetachedView(f10.f17450a, false);
        }
    }

    public static abstract class o {
        public void d(Rect rect, int i10, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        public void e(Rect rect, View view, RecyclerView recyclerView, B b10) {
            d(rect, ((q) view.getLayoutParams()).a(), recyclerView);
        }

        public void f(Canvas canvas, RecyclerView recyclerView) {
        }

        public void g(Canvas canvas, RecyclerView recyclerView, B b10) {
            f(canvas, recyclerView);
        }

        public void h(Canvas canvas, RecyclerView recyclerView) {
        }

        public void i(Canvas canvas, RecyclerView recyclerView, B b10) {
            h(canvas, recyclerView);
        }
    }

    public interface r {
        void a(View view);

        void b(View view);
    }

    public static abstract class s {
        public abstract boolean a(int i10, int i11);
    }

    public interface t {
        void a(RecyclerView recyclerView, MotionEvent motionEvent);

        boolean b(RecyclerView recyclerView, MotionEvent motionEvent);

        void c(boolean z10);
    }

    public static abstract class u {
        public void a(RecyclerView recyclerView, int i10) {
        }

        public abstract void b(RecyclerView recyclerView, int i10, int i11);
    }

    public static class v {

        /* renamed from: a, reason: collision with root package name */
        SparseArray f17517a = new SparseArray();

        /* renamed from: b, reason: collision with root package name */
        int f17518b = 0;

        /* renamed from: c, reason: collision with root package name */
        Set f17519c = Collections.newSetFromMap(new IdentityHashMap());

        static class a {

            /* renamed from: a, reason: collision with root package name */
            final ArrayList f17520a = new ArrayList();

            /* renamed from: b, reason: collision with root package name */
            int f17521b = 5;

            /* renamed from: c, reason: collision with root package name */
            long f17522c = 0;

            /* renamed from: d, reason: collision with root package name */
            long f17523d = 0;

            a() {
            }
        }

        private a i(int i10) {
            a aVar = (a) this.f17517a.get(i10);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.f17517a.put(i10, aVar2);
            return aVar2;
        }

        void a() {
            this.f17518b++;
        }

        void b(h hVar) {
            this.f17519c.add(hVar);
        }

        public void c() {
            for (int i10 = 0; i10 < this.f17517a.size(); i10++) {
                a aVar = (a) this.f17517a.valueAt(i10);
                Iterator it = aVar.f17520a.iterator();
                while (it.hasNext()) {
                    E0.a.a(((F) it.next()).f17450a);
                }
                aVar.f17520a.clear();
            }
        }

        void d() {
            this.f17518b--;
        }

        void e(h hVar, boolean z10) {
            this.f17519c.remove(hVar);
            if (this.f17519c.size() != 0 || z10) {
                return;
            }
            for (int i10 = 0; i10 < this.f17517a.size(); i10++) {
                SparseArray sparseArray = this.f17517a;
                ArrayList arrayList = ((a) sparseArray.get(sparseArray.keyAt(i10))).f17520a;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    E0.a.a(((F) arrayList.get(i11)).f17450a);
                }
            }
        }

        void f(int i10, long j10) {
            a i11 = i(i10);
            i11.f17523d = l(i11.f17523d, j10);
        }

        void g(int i10, long j10) {
            a i11 = i(i10);
            i11.f17522c = l(i11.f17522c, j10);
        }

        public F h(int i10) {
            a aVar = (a) this.f17517a.get(i10);
            if (aVar == null || aVar.f17520a.isEmpty()) {
                return null;
            }
            ArrayList arrayList = aVar.f17520a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!((F) arrayList.get(size)).t()) {
                    return (F) arrayList.remove(size);
                }
            }
            return null;
        }

        void j(h hVar, h hVar2, boolean z10) {
            if (hVar != null) {
                d();
            }
            if (!z10 && this.f17518b == 0) {
                c();
            }
            if (hVar2 != null) {
                a();
            }
        }

        public void k(F f10) {
            int n10 = f10.n();
            ArrayList arrayList = i(n10).f17520a;
            if (((a) this.f17517a.get(n10)).f17521b <= arrayList.size()) {
                E0.a.a(f10.f17450a);
            } else {
                if (RecyclerView.f17321U0 && arrayList.contains(f10)) {
                    throw new IllegalArgumentException("this scrap item already exists");
                }
                f10.F();
                arrayList.add(f10);
            }
        }

        long l(long j10, long j11) {
            return j10 == 0 ? j11 : ((j10 / 4) * 3) + (j11 / 4);
        }

        boolean m(int i10, long j10, long j11) {
            long j12 = i(i10).f17523d;
            return j12 == 0 || j10 + j12 < j11;
        }

        boolean n(int i10, long j10, long j11) {
            long j12 = i(i10).f17522c;
            return j12 == 0 || j10 + j12 < j11;
        }
    }

    public final class w {

        /* renamed from: a, reason: collision with root package name */
        final ArrayList f17524a;

        /* renamed from: b, reason: collision with root package name */
        ArrayList f17525b;

        /* renamed from: c, reason: collision with root package name */
        final ArrayList f17526c;

        /* renamed from: d, reason: collision with root package name */
        private final List f17527d;

        /* renamed from: e, reason: collision with root package name */
        private int f17528e;

        /* renamed from: f, reason: collision with root package name */
        int f17529f;

        /* renamed from: g, reason: collision with root package name */
        v f17530g;

        public w() {
            ArrayList arrayList = new ArrayList();
            this.f17524a = arrayList;
            this.f17525b = null;
            this.f17526c = new ArrayList();
            this.f17527d = Collections.unmodifiableList(arrayList);
            this.f17528e = 2;
            this.f17529f = 2;
        }

        private void B(h hVar) {
            C(hVar, false);
        }

        private void C(h hVar, boolean z10) {
            v vVar = this.f17530g;
            if (vVar != null) {
                vVar.e(hVar, z10);
            }
        }

        private boolean M(F f10, int i10, int i11, long j10) {
            f10.f17468s = null;
            f10.f17467r = RecyclerView.this;
            int n10 = f10.n();
            long nanoTime = RecyclerView.this.getNanoTime();
            boolean z10 = false;
            if (j10 != Long.MAX_VALUE && !this.f17530g.m(n10, nanoTime, j10)) {
                return false;
            }
            if (f10.z()) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.attachViewToParent(f10.f17450a, recyclerView.getChildCount(), f10.f17450a.getLayoutParams());
                z10 = true;
            }
            RecyclerView.this.f17382m.a(f10, i10);
            if (z10) {
                RecyclerView.this.detachViewFromParent(f10.f17450a);
            }
            this.f17530g.f(f10.n(), RecyclerView.this.getNanoTime() - nanoTime);
            b(f10);
            if (RecyclerView.this.f17337B0.e()) {
                f10.f17456g = i11;
            }
            return true;
        }

        private void b(F f10) {
            if (RecyclerView.this.A0()) {
                View view = f10.f17450a;
                if (AbstractC1484a0.y(view) == 0) {
                    AbstractC1484a0.B0(view, 1);
                }
                androidx.recyclerview.widget.l lVar = RecyclerView.this.f17351I0;
                if (lVar == null) {
                    return;
                }
                C1483a n10 = lVar.n();
                if (n10 instanceof l.a) {
                    ((l.a) n10).o(view);
                }
                AbstractC1484a0.q0(view, n10);
            }
        }

        private void q(ViewGroup viewGroup, boolean z10) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    q((ViewGroup) childAt, true);
                }
            }
            if (z10) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                } else {
                    int visibility = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(visibility);
                }
            }
        }

        private void r(F f10) {
            View view = f10.f17450a;
            if (view instanceof ViewGroup) {
                q((ViewGroup) view, false);
            }
        }

        private void u() {
            if (this.f17530g != null) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f17382m == null || !recyclerView.isAttachedToWindow()) {
                    return;
                }
                this.f17530g.b(RecyclerView.this.f17382m);
            }
        }

        void A() {
            for (int i10 = 0; i10 < this.f17526c.size(); i10++) {
                E0.a.a(((F) this.f17526c.get(i10)).f17450a);
            }
            B(RecyclerView.this.f17382m);
        }

        void D(View view) {
            F l02 = RecyclerView.l0(view);
            l02.f17463n = null;
            l02.f17464o = false;
            l02.e();
            H(l02);
        }

        void E() {
            for (int size = this.f17526c.size() - 1; size >= 0; size--) {
                F(size);
            }
            this.f17526c.clear();
            if (RecyclerView.f17328b1) {
                RecyclerView.this.f17335A0.b();
            }
        }

        void F(int i10) {
            if (RecyclerView.f17322V0) {
                Log.d("RecyclerView", "Recycling cached view at index " + i10);
            }
            F f10 = (F) this.f17526c.get(i10);
            if (RecyclerView.f17322V0) {
                Log.d("RecyclerView", "CachedViewHolder to be recycled: " + f10);
            }
            a(f10, true);
            this.f17526c.remove(i10);
        }

        public void G(View view) {
            F l02 = RecyclerView.l0(view);
            if (l02.z()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (l02.y()) {
                l02.M();
            } else if (l02.N()) {
                l02.e();
            }
            H(l02);
            if (RecyclerView.this.f17377j0 == null || l02.w()) {
                return;
            }
            RecyclerView.this.f17377j0.j(l02);
        }

        void H(F f10) {
            boolean z10;
            boolean z11 = true;
            if (f10.y() || f10.f17450a.getParent() != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Scrapped or attached views may not be recycled. isScrap:");
                sb2.append(f10.y());
                sb2.append(" isAttached:");
                sb2.append(f10.f17450a.getParent() != null);
                sb2.append(RecyclerView.this.V());
                throw new IllegalArgumentException(sb2.toString());
            }
            if (f10.z()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + f10 + RecyclerView.this.V());
            }
            if (f10.L()) {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.V());
            }
            boolean h10 = f10.h();
            h hVar = RecyclerView.this.f17382m;
            boolean z12 = hVar != null && h10 && hVar.t(f10);
            if (RecyclerView.f17321U0 && this.f17526c.contains(f10)) {
                throw new IllegalArgumentException("cached view received recycle internal? " + f10 + RecyclerView.this.V());
            }
            if (z12 || f10.w()) {
                if (this.f17529f <= 0 || f10.r(526)) {
                    z10 = false;
                } else {
                    int size = this.f17526c.size();
                    if (size >= this.f17529f && size > 0) {
                        F(0);
                        size--;
                    }
                    if (RecyclerView.f17328b1 && size > 0 && !RecyclerView.this.f17335A0.d(f10.f17452c)) {
                        int i10 = size - 1;
                        while (i10 >= 0) {
                            if (!RecyclerView.this.f17335A0.d(((F) this.f17526c.get(i10)).f17452c)) {
                                break;
                            } else {
                                i10--;
                            }
                        }
                        size = i10 + 1;
                    }
                    this.f17526c.add(size, f10);
                    z10 = true;
                }
                if (z10) {
                    z11 = false;
                } else {
                    a(f10, true);
                }
                r1 = z10;
            } else {
                if (RecyclerView.f17322V0) {
                    Log.d("RecyclerView", "trying to recycle a non-recycleable holder. Hopefully, it will re-visit here. We are still removing it from animation lists" + RecyclerView.this.V());
                }
                z11 = false;
            }
            RecyclerView.this.f17371g.q(f10);
            if (r1 || z11 || !h10) {
                return;
            }
            E0.a.a(f10.f17450a);
            f10.f17468s = null;
            f10.f17467r = null;
        }

        void I(View view) {
            F l02 = RecyclerView.l0(view);
            if (!l02.r(12) && l02.A() && !RecyclerView.this.s(l02)) {
                if (this.f17525b == null) {
                    this.f17525b = new ArrayList();
                }
                l02.J(this, true);
                this.f17525b.add(l02);
                return;
            }
            if (!l02.v() || l02.x() || RecyclerView.this.f17382m.i()) {
                l02.J(this, false);
                this.f17524a.add(l02);
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.V());
            }
        }

        void J(v vVar) {
            B(RecyclerView.this.f17382m);
            v vVar2 = this.f17530g;
            if (vVar2 != null) {
                vVar2.d();
            }
            this.f17530g = vVar;
            if (vVar != null && RecyclerView.this.getAdapter() != null) {
                this.f17530g.a();
            }
            u();
        }

        void K(D d10) {
        }

        public void L(int i10) {
            this.f17528e = i10;
            P();
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0175  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x01fc  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x0226 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:86:0x020a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        F N(int i10, boolean z10, long j10) {
            F f10;
            boolean z11;
            F f11;
            boolean z12;
            boolean M10;
            ViewGroup.LayoutParams layoutParams;
            q qVar;
            RecyclerView b02;
            if (i10 < 0 || i10 >= RecyclerView.this.f17337B0.b()) {
                throw new IndexOutOfBoundsException("Invalid item position " + i10 + "(" + i10 + "). Item count:" + RecyclerView.this.f17337B0.b() + RecyclerView.this.V());
            }
            if (RecyclerView.this.f17337B0.e()) {
                f10 = h(i10);
                if (f10 != null) {
                    z11 = true;
                    if (f10 == null && (f10 = m(i10, z10)) != null) {
                        if (Q(f10)) {
                            if (!z10) {
                                f10.b(4);
                                if (f10.y()) {
                                    RecyclerView.this.removeDetachedView(f10.f17450a, false);
                                    f10.M();
                                } else if (f10.N()) {
                                    f10.e();
                                }
                                H(f10);
                            }
                            f10 = null;
                        } else {
                            z11 = true;
                        }
                    }
                    if (f10 == null) {
                        int m10 = RecyclerView.this.f17369e.m(i10);
                        if (m10 < 0 || m10 >= RecyclerView.this.f17382m.e()) {
                            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i10 + "(offset:" + m10 + ").state:" + RecyclerView.this.f17337B0.b() + RecyclerView.this.V());
                        }
                        int g10 = RecyclerView.this.f17382m.g(m10);
                        if (RecyclerView.this.f17382m.i() && (f10 = l(RecyclerView.this.f17382m.f(m10), g10, z10)) != null) {
                            f10.f17452c = m10;
                            z11 = true;
                        }
                        if (f10 == null) {
                            if (RecyclerView.f17322V0) {
                                Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline(" + i10 + ") fetching from shared pool");
                            }
                            f10 = i().h(g10);
                            if (f10 != null) {
                                f10.F();
                                if (RecyclerView.f17325Y0) {
                                    r(f10);
                                }
                            }
                        }
                        if (f10 == null) {
                            long nanoTime = RecyclerView.this.getNanoTime();
                            if (j10 != Long.MAX_VALUE && !this.f17530g.n(g10, nanoTime, j10)) {
                                return null;
                            }
                            RecyclerView recyclerView = RecyclerView.this;
                            f10 = recyclerView.f17382m.c(recyclerView, g10);
                            if (RecyclerView.f17328b1 && (b02 = RecyclerView.b0(f10.f17450a)) != null) {
                                f10.f17451b = new WeakReference(b02);
                            }
                            this.f17530g.g(g10, RecyclerView.this.getNanoTime() - nanoTime);
                            if (RecyclerView.f17322V0) {
                                Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline created new ViewHolder");
                            }
                        }
                    }
                    f11 = f10;
                    z12 = z11;
                    if (z12 && !RecyclerView.this.f17337B0.e() && f11.r(8192)) {
                        f11.H(0, 8192);
                        if (RecyclerView.this.f17337B0.f17435k) {
                            int e10 = m.e(f11) | 4096;
                            RecyclerView recyclerView2 = RecyclerView.this;
                            RecyclerView.this.Z0(f11, recyclerView2.f17377j0.t(recyclerView2.f17337B0, f11, e10, f11.q()));
                        }
                    }
                    if (!RecyclerView.this.f17337B0.e() && f11.u()) {
                        f11.f17456g = i10;
                    } else if (f11.u() || f11.B() || f11.v()) {
                        if (!RecyclerView.f17321U0 && f11.x()) {
                            throw new IllegalStateException("Removed holder should be bound and it should come here only in pre-layout. Holder: " + f11 + RecyclerView.this.V());
                        }
                        M10 = M(f11, RecyclerView.this.f17369e.m(i10), i10, j10);
                        layoutParams = f11.f17450a.getLayoutParams();
                        if (layoutParams == null) {
                            qVar = (q) RecyclerView.this.generateDefaultLayoutParams();
                            f11.f17450a.setLayoutParams(qVar);
                        } else if (RecyclerView.this.checkLayoutParams(layoutParams)) {
                            qVar = (q) layoutParams;
                        } else {
                            qVar = (q) RecyclerView.this.generateLayoutParams(layoutParams);
                            f11.f17450a.setLayoutParams(qVar);
                        }
                        qVar.f17513a = f11;
                        qVar.f17516d = !z12 && M10;
                        return f11;
                    }
                    M10 = false;
                    layoutParams = f11.f17450a.getLayoutParams();
                    if (layoutParams == null) {
                    }
                    qVar.f17513a = f11;
                    qVar.f17516d = !z12 && M10;
                    return f11;
                }
            } else {
                f10 = null;
            }
            z11 = false;
            if (f10 == null) {
                if (Q(f10)) {
                }
            }
            if (f10 == null) {
            }
            f11 = f10;
            z12 = z11;
            if (z12) {
                f11.H(0, 8192);
                if (RecyclerView.this.f17337B0.f17435k) {
                }
            }
            if (!RecyclerView.this.f17337B0.e()) {
            }
            if (f11.u()) {
            }
            if (!RecyclerView.f17321U0) {
            }
            M10 = M(f11, RecyclerView.this.f17369e.m(i10), i10, j10);
            layoutParams = f11.f17450a.getLayoutParams();
            if (layoutParams == null) {
            }
            qVar.f17513a = f11;
            qVar.f17516d = !z12 && M10;
            return f11;
        }

        void O(F f10) {
            if (f10.f17464o) {
                this.f17525b.remove(f10);
            } else {
                this.f17524a.remove(f10);
            }
            f10.f17463n = null;
            f10.f17464o = false;
            f10.e();
        }

        void P() {
            p pVar = RecyclerView.this.f17384n;
            this.f17529f = this.f17528e + (pVar != null ? pVar.f17501m : 0);
            for (int size = this.f17526c.size() - 1; size >= 0 && this.f17526c.size() > this.f17529f; size--) {
                F(size);
            }
        }

        boolean Q(F f10) {
            if (f10.x()) {
                if (!RecyclerView.f17321U0 || RecyclerView.this.f17337B0.e()) {
                    return RecyclerView.this.f17337B0.e();
                }
                throw new IllegalStateException("should not receive a removed view unless it is pre layout" + RecyclerView.this.V());
            }
            int i10 = f10.f17452c;
            if (i10 >= 0 && i10 < RecyclerView.this.f17382m.e()) {
                if (RecyclerView.this.f17337B0.e() || RecyclerView.this.f17382m.g(f10.f17452c) == f10.n()) {
                    return !RecyclerView.this.f17382m.i() || f10.m() == RecyclerView.this.f17382m.f(f10.f17452c);
                }
                return false;
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + f10 + RecyclerView.this.V());
        }

        void R(int i10, int i11) {
            int i12;
            int i13 = i11 + i10;
            for (int size = this.f17526c.size() - 1; size >= 0; size--) {
                F f10 = (F) this.f17526c.get(size);
                if (f10 != null && (i12 = f10.f17452c) >= i10 && i12 < i13) {
                    f10.b(2);
                    F(size);
                }
            }
        }

        void a(F f10, boolean z10) {
            RecyclerView.u(f10);
            View view = f10.f17450a;
            androidx.recyclerview.widget.l lVar = RecyclerView.this.f17351I0;
            if (lVar != null) {
                C1483a n10 = lVar.n();
                AbstractC1484a0.q0(view, n10 instanceof l.a ? ((l.a) n10).n(view) : null);
            }
            if (z10) {
                g(f10);
            }
            f10.f17468s = null;
            f10.f17467r = null;
            i().k(f10);
        }

        public void c() {
            this.f17524a.clear();
            E();
        }

        void d() {
            int size = this.f17526c.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((F) this.f17526c.get(i10)).c();
            }
            int size2 = this.f17524a.size();
            for (int i11 = 0; i11 < size2; i11++) {
                ((F) this.f17524a.get(i11)).c();
            }
            ArrayList arrayList = this.f17525b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    ((F) this.f17525b.get(i12)).c();
                }
            }
        }

        void e() {
            this.f17524a.clear();
            ArrayList arrayList = this.f17525b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        public int f(int i10) {
            if (i10 >= 0 && i10 < RecyclerView.this.f17337B0.b()) {
                return !RecyclerView.this.f17337B0.e() ? i10 : RecyclerView.this.f17369e.m(i10);
            }
            throw new IndexOutOfBoundsException("invalid position " + i10 + ". State item count is " + RecyclerView.this.f17337B0.b() + RecyclerView.this.V());
        }

        void g(F f10) {
            RecyclerView.this.getClass();
            if (RecyclerView.this.f17386o.size() > 0) {
                android.support.v4.media.session.b.a(RecyclerView.this.f17386o.get(0));
                throw null;
            }
            h hVar = RecyclerView.this.f17382m;
            if (hVar != null) {
                hVar.w(f10);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f17337B0 != null) {
                recyclerView.f17371g.q(f10);
            }
            if (RecyclerView.f17322V0) {
                Log.d("RecyclerView", "dispatchViewRecycled: " + f10);
            }
        }

        F h(int i10) {
            int size;
            int m10;
            ArrayList arrayList = this.f17525b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    F f10 = (F) this.f17525b.get(i11);
                    if (!f10.N() && f10.o() == i10) {
                        f10.b(32);
                        return f10;
                    }
                }
                if (RecyclerView.this.f17382m.i() && (m10 = RecyclerView.this.f17369e.m(i10)) > 0 && m10 < RecyclerView.this.f17382m.e()) {
                    long f11 = RecyclerView.this.f17382m.f(m10);
                    for (int i12 = 0; i12 < size; i12++) {
                        F f12 = (F) this.f17525b.get(i12);
                        if (!f12.N() && f12.m() == f11) {
                            f12.b(32);
                            return f12;
                        }
                    }
                }
            }
            return null;
        }

        v i() {
            if (this.f17530g == null) {
                this.f17530g = new v();
                u();
            }
            return this.f17530g;
        }

        int j() {
            return this.f17524a.size();
        }

        public List k() {
            return this.f17527d;
        }

        F l(long j10, int i10, boolean z10) {
            for (int size = this.f17524a.size() - 1; size >= 0; size--) {
                F f10 = (F) this.f17524a.get(size);
                if (f10.m() == j10 && !f10.N()) {
                    if (i10 == f10.n()) {
                        f10.b(32);
                        if (f10.x() && !RecyclerView.this.f17337B0.e()) {
                            f10.H(2, 14);
                        }
                        return f10;
                    }
                    if (!z10) {
                        this.f17524a.remove(size);
                        RecyclerView.this.removeDetachedView(f10.f17450a, false);
                        D(f10.f17450a);
                    }
                }
            }
            int size2 = this.f17526c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                F f11 = (F) this.f17526c.get(size2);
                if (f11.m() == j10 && !f11.t()) {
                    if (i10 == f11.n()) {
                        if (!z10) {
                            this.f17526c.remove(size2);
                        }
                        return f11;
                    }
                    if (!z10) {
                        F(size2);
                        return null;
                    }
                }
            }
        }

        F m(int i10, boolean z10) {
            View e10;
            int size = this.f17524a.size();
            for (int i11 = 0; i11 < size; i11++) {
                F f10 = (F) this.f17524a.get(i11);
                if (!f10.N() && f10.o() == i10 && !f10.v() && (RecyclerView.this.f17337B0.f17432h || !f10.x())) {
                    f10.b(32);
                    return f10;
                }
            }
            if (!z10 && (e10 = RecyclerView.this.f17370f.e(i10)) != null) {
                F l02 = RecyclerView.l0(e10);
                RecyclerView.this.f17370f.s(e10);
                int m10 = RecyclerView.this.f17370f.m(e10);
                if (m10 != -1) {
                    RecyclerView.this.f17370f.d(m10);
                    I(e10);
                    l02.b(8224);
                    return l02;
                }
                throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + l02 + RecyclerView.this.V());
            }
            int size2 = this.f17526c.size();
            for (int i12 = 0; i12 < size2; i12++) {
                F f11 = (F) this.f17526c.get(i12);
                if (!f11.v() && f11.o() == i10 && !f11.t()) {
                    if (!z10) {
                        this.f17526c.remove(i12);
                    }
                    if (RecyclerView.f17322V0) {
                        Log.d("RecyclerView", "getScrapOrHiddenOrCachedHolderForPosition(" + i10 + ") found match in cache: " + f11);
                    }
                    return f11;
                }
            }
            return null;
        }

        View n(int i10) {
            return ((F) this.f17524a.get(i10)).f17450a;
        }

        public View o(int i10) {
            return p(i10, false);
        }

        View p(int i10, boolean z10) {
            return N(i10, z10, Long.MAX_VALUE).f17450a;
        }

        void s() {
            int size = this.f17526c.size();
            for (int i10 = 0; i10 < size; i10++) {
                q qVar = (q) ((F) this.f17526c.get(i10)).f17450a.getLayoutParams();
                if (qVar != null) {
                    qVar.f17515c = true;
                }
            }
        }

        void t() {
            int size = this.f17526c.size();
            for (int i10 = 0; i10 < size; i10++) {
                F f10 = (F) this.f17526c.get(i10);
                if (f10 != null) {
                    f10.b(6);
                    f10.a(null);
                }
            }
            h hVar = RecyclerView.this.f17382m;
            if (hVar == null || !hVar.i()) {
                E();
            }
        }

        void v(int i10, int i11) {
            int size = this.f17526c.size();
            for (int i12 = 0; i12 < size; i12++) {
                F f10 = (F) this.f17526c.get(i12);
                if (f10 != null && f10.f17452c >= i10) {
                    if (RecyclerView.f17322V0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForInsert cached " + i12 + " holder " + f10 + " now at position " + (f10.f17452c + i11));
                    }
                    f10.C(i11, false);
                }
            }
        }

        void w(int i10, int i11) {
            int i12;
            int i13;
            int i14;
            int i15;
            if (i10 < i11) {
                i12 = -1;
                i14 = i10;
                i13 = i11;
            } else {
                i12 = 1;
                i13 = i10;
                i14 = i11;
            }
            int size = this.f17526c.size();
            for (int i16 = 0; i16 < size; i16++) {
                F f10 = (F) this.f17526c.get(i16);
                if (f10 != null && (i15 = f10.f17452c) >= i14 && i15 <= i13) {
                    if (i15 == i10) {
                        f10.C(i11 - i10, false);
                    } else {
                        f10.C(i12, false);
                    }
                    if (RecyclerView.f17322V0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForMove cached child " + i16 + " holder " + f10);
                    }
                }
            }
        }

        void x(int i10, int i11, boolean z10) {
            int i12 = i10 + i11;
            for (int size = this.f17526c.size() - 1; size >= 0; size--) {
                F f10 = (F) this.f17526c.get(size);
                if (f10 != null) {
                    int i13 = f10.f17452c;
                    if (i13 >= i12) {
                        if (RecyclerView.f17322V0) {
                            Log.d("RecyclerView", "offsetPositionRecordsForRemove cached " + size + " holder " + f10 + " now at position " + (f10.f17452c - i11));
                        }
                        f10.C(-i11, z10);
                    } else if (i13 >= i10) {
                        f10.b(8);
                        F(size);
                    }
                }
            }
        }

        void y(h hVar, h hVar2, boolean z10) {
            c();
            C(hVar, true);
            i().j(hVar, hVar2, z10);
            u();
        }

        void z() {
            u();
        }
    }

    public interface x {
    }

    private class y extends j {
        y() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void a() {
            RecyclerView.this.r(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f17337B0.f17431g = true;
            recyclerView.X0(true);
            if (RecyclerView.this.f17369e.p()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void b(int i10, int i11, Object obj) {
            RecyclerView.this.r(null);
            if (RecyclerView.this.f17369e.r(i10, i11, obj)) {
                e();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void c(int i10, int i11) {
            RecyclerView.this.r(null);
            if (RecyclerView.this.f17369e.s(i10, i11)) {
                e();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void d(int i10, int i11) {
            RecyclerView.this.r(null);
            if (RecyclerView.this.f17369e.t(i10, i11)) {
                e();
            }
        }

        void e() {
            if (RecyclerView.f17327a1) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f17396t && recyclerView.f17394s) {
                    AbstractC1484a0.i0(recyclerView, recyclerView.f17374i);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.f17336B = true;
            recyclerView2.requestLayout();
        }
    }

    static {
        Class cls = Integer.TYPE;
        f17331e1 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f17332f1 = new InterpolatorC1611c();
        f17333g1 = new C();
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    private void B(Context context, String str, AttributeSet attributeSet, int i10, int i11) {
        Object[] objArr;
        Constructor constructor;
        if (str != null) {
            String trim = str.trim();
            if (trim.isEmpty()) {
                return;
            }
            String p02 = p0(context, trim);
            try {
                Class<? extends U> asSubclass = Class.forName(p02, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(p.class);
                try {
                    constructor = asSubclass.getConstructor(f17331e1);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i10), Integer.valueOf(i11)};
                } catch (NoSuchMethodException e10) {
                    objArr = null;
                    try {
                        constructor = asSubclass.getConstructor(null);
                    } catch (NoSuchMethodException e11) {
                        e11.initCause(e10);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + p02, e11);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((p) constructor.newInstance(objArr));
            } catch (ClassCastException e12) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + p02, e12);
            } catch (ClassNotFoundException e13) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + p02, e13);
            } catch (IllegalAccessException e14) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + p02, e14);
            } catch (InstantiationException e15) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + p02, e15);
            } catch (InvocationTargetException e16) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + p02, e16);
            }
        }
    }

    private boolean C0(View view, View view2, int i10) {
        int i11;
        if (view2 == null || view2 == this || view2 == view || X(view2) == null) {
            return false;
        }
        if (view == null || X(view) == null) {
            return true;
        }
        this.f17376j.set(0, 0, view.getWidth(), view.getHeight());
        this.f17378k.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.f17376j);
        offsetDescendantRectToMyCoords(view2, this.f17378k);
        char c10 = 65535;
        int i12 = this.f17384n.Z() == 1 ? -1 : 1;
        Rect rect = this.f17376j;
        int i13 = rect.left;
        Rect rect2 = this.f17378k;
        int i14 = rect2.left;
        if ((i13 < i14 || rect.right <= i14) && rect.right < rect2.right) {
            i11 = 1;
        } else {
            int i15 = rect.right;
            int i16 = rect2.right;
            i11 = ((i15 > i16 || i13 >= i16) && i13 > i14) ? -1 : 0;
        }
        int i17 = rect.top;
        int i18 = rect2.top;
        if ((i17 < i18 || rect.bottom <= i18) && rect.bottom < rect2.bottom) {
            c10 = 1;
        } else {
            int i19 = rect.bottom;
            int i20 = rect2.bottom;
            if ((i19 <= i20 && i17 < i20) || i17 <= i18) {
                c10 = 0;
            }
        }
        if (i10 == 1) {
            return c10 < 0 || (c10 == 0 && i11 * i12 < 0);
        }
        if (i10 == 2) {
            return c10 > 0 || (c10 == 0 && i11 * i12 > 0);
        }
        if (i10 == 17) {
            return i11 < 0;
        }
        if (i10 == 33) {
            return c10 < 0;
        }
        if (i10 == 66) {
            return i11 > 0;
        }
        if (i10 == 130) {
            return c10 > 0;
        }
        throw new IllegalArgumentException("Invalid direction: " + i10 + V());
    }

    private boolean D(int i10, int i11) {
        a0(this.f17353J0);
        int[] iArr = this.f17353J0;
        return (iArr[0] == i10 && iArr[1] == i11) ? false : true;
    }

    private boolean D1(MotionEvent motionEvent) {
        boolean z10;
        EdgeEffect edgeEffect = this.f17352J;
        if (edgeEffect == null || androidx.core.widget.f.b(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
            z10 = false;
        } else {
            androidx.core.widget.f.d(this.f17352J, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
            z10 = true;
        }
        EdgeEffect edgeEffect2 = this.f17373h0;
        if (edgeEffect2 != null && androidx.core.widget.f.b(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
            androidx.core.widget.f.d(this.f17373h0, 0.0f, motionEvent.getY() / getHeight());
            z10 = true;
        }
        EdgeEffect edgeEffect3 = this.f17354K;
        if (edgeEffect3 != null && androidx.core.widget.f.b(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
            androidx.core.widget.f.d(this.f17354K, 0.0f, motionEvent.getX() / getWidth());
            z10 = true;
        }
        EdgeEffect edgeEffect4 = this.f17375i0;
        if (edgeEffect4 == null || androidx.core.widget.f.b(edgeEffect4) == 0.0f || canScrollVertically(1)) {
            return z10;
        }
        androidx.core.widget.f.d(this.f17375i0, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    private void G() {
        int i10 = this.f17334A;
        this.f17334A = 0;
        if (i10 == 0 || !A0()) {
            return;
        }
        AccessibilityEvent obtain = AccessibilityEvent.obtain();
        obtain.setEventType(2048);
        AbstractC5233b.b(obtain, i10);
        sendAccessibilityEventUnchecked(obtain);
    }

    private void G0(int i10, int i11, MotionEvent motionEvent, int i12) {
        p pVar = this.f17384n;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f17406y) {
            return;
        }
        int[] iArr = this.f17358N0;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean k10 = pVar.k();
        boolean l10 = this.f17384n.l();
        int i13 = l10 ? (k10 ? 1 : 0) | 2 : k10 ? 1 : 0;
        float height = motionEvent == null ? getHeight() / 2.0f : motionEvent.getY();
        float width = motionEvent == null ? getWidth() / 2.0f : motionEvent.getX();
        int c12 = i10 - c1(i10, height);
        int d12 = i11 - d1(i11, width);
        C1(i13, i12);
        if (L(k10 ? c12 : 0, l10 ? d12 : 0, this.f17358N0, this.f17356L0, i12)) {
            int[] iArr2 = this.f17358N0;
            c12 -= iArr2[0];
            d12 -= iArr2[1];
        }
        p1(k10 ? c12 : 0, l10 ? d12 : 0, motionEvent, i12);
        f fVar = this.f17409z0;
        if (fVar != null && (c12 != 0 || d12 != 0)) {
            fVar.f(this, c12, d12);
        }
        F1(i12);
    }

    private void H1() {
        this.f17407y0.f();
        p pVar = this.f17384n;
        if (pVar != null) {
            pVar.K1();
        }
    }

    private void I() {
        this.f17337B0.a(1);
        W(this.f17337B0);
        this.f17337B0.f17434j = false;
        B1();
        this.f17371g.f();
        O0();
        W0();
        n1();
        B b10 = this.f17337B0;
        b10.f17433i = b10.f17435k && this.f17345F0;
        this.f17345F0 = false;
        this.f17343E0 = false;
        b10.f17432h = b10.f17436l;
        b10.f17430f = this.f17382m.e();
        a0(this.f17353J0);
        if (this.f17337B0.f17435k) {
            int g10 = this.f17370f.g();
            for (int i10 = 0; i10 < g10; i10++) {
                F l02 = l0(this.f17370f.f(i10));
                if (!l02.L() && (!l02.v() || this.f17382m.i())) {
                    this.f17371g.e(l02, this.f17377j0.t(this.f17337B0, l02, m.e(l02), l02.q()));
                    if (this.f17337B0.f17433i && l02.A() && !l02.x() && !l02.L() && !l02.v()) {
                        this.f17371g.c(i0(l02), l02);
                    }
                }
            }
        }
        if (this.f17337B0.f17436l) {
            o1();
            B b11 = this.f17337B0;
            boolean z10 = b11.f17431g;
            b11.f17431g = false;
            this.f17384n.X0(this.f17367c, b11);
            this.f17337B0.f17431g = z10;
            for (int i11 = 0; i11 < this.f17370f.g(); i11++) {
                F l03 = l0(this.f17370f.f(i11));
                if (!l03.L() && !this.f17371g.i(l03)) {
                    int e10 = m.e(l03);
                    boolean r10 = l03.r(8192);
                    if (!r10) {
                        e10 |= 4096;
                    }
                    m.b t10 = this.f17377j0.t(this.f17337B0, l03, e10, l03.q());
                    if (r10) {
                        Z0(l03, t10);
                    } else {
                        this.f17371g.a(l03, t10);
                    }
                }
            }
            v();
        } else {
            v();
        }
        P0();
        E1(false);
        this.f17337B0.f17429e = 2;
    }

    private void J() {
        B1();
        O0();
        this.f17337B0.a(6);
        this.f17369e.j();
        this.f17337B0.f17430f = this.f17382m.e();
        this.f17337B0.f17428d = 0;
        if (this.f17368d != null && this.f17382m.b()) {
            Parcelable parcelable = this.f17368d.f17533c;
            if (parcelable != null) {
                this.f17384n.c1(parcelable);
            }
            this.f17368d = null;
        }
        B b10 = this.f17337B0;
        b10.f17432h = false;
        this.f17384n.X0(this.f17367c, b10);
        B b11 = this.f17337B0;
        b11.f17431g = false;
        b11.f17435k = b11.f17435k && this.f17377j0 != null;
        b11.f17429e = 4;
        P0();
        E1(false);
    }

    private void K() {
        this.f17337B0.a(4);
        B1();
        O0();
        B b10 = this.f17337B0;
        b10.f17429e = 1;
        if (b10.f17435k) {
            for (int g10 = this.f17370f.g() - 1; g10 >= 0; g10--) {
                F l02 = l0(this.f17370f.f(g10));
                if (!l02.L()) {
                    long i02 = i0(l02);
                    m.b s10 = this.f17377j0.s(this.f17337B0, l02);
                    F g11 = this.f17371g.g(i02);
                    if (g11 == null || g11.L()) {
                        this.f17371g.d(l02, s10);
                    } else {
                        boolean h10 = this.f17371g.h(g11);
                        boolean h11 = this.f17371g.h(l02);
                        if (h10 && g11 == l02) {
                            this.f17371g.d(l02, s10);
                        } else {
                            m.b n10 = this.f17371g.n(g11);
                            this.f17371g.d(l02, s10);
                            m.b m10 = this.f17371g.m(l02);
                            if (n10 == null) {
                                s0(i02, l02, g11);
                            } else {
                                p(g11, l02, n10, m10, h10, h11);
                            }
                        }
                    }
                }
            }
            this.f17371g.o(this.f17364T0);
        }
        this.f17384n.l1(this.f17367c);
        B b11 = this.f17337B0;
        b11.f17427c = b11.f17430f;
        this.f17342E = false;
        this.f17344F = false;
        b11.f17435k = false;
        b11.f17436l = false;
        this.f17384n.f17496h = false;
        ArrayList arrayList = this.f17367c.f17525b;
        if (arrayList != null) {
            arrayList.clear();
        }
        p pVar = this.f17384n;
        if (pVar.f17502n) {
            pVar.f17501m = 0;
            pVar.f17502n = false;
            this.f17367c.P();
        }
        this.f17384n.Y0(this.f17337B0);
        P0();
        E1(false);
        this.f17371g.f();
        int[] iArr = this.f17353J0;
        if (D(iArr[0], iArr[1])) {
            O(0, 0);
        }
        a1();
        l1();
    }

    private boolean Q(MotionEvent motionEvent) {
        t tVar = this.f17392r;
        if (tVar == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return Z(motionEvent);
        }
        tVar.a(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.f17392r = null;
        }
        return true;
    }

    private void R0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f17381l0) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f17381l0 = motionEvent.getPointerId(i10);
            int x10 = (int) (motionEvent.getX(i10) + 0.5f);
            this.f17389p0 = x10;
            this.f17385n0 = x10;
            int y10 = (int) (motionEvent.getY(i10) + 0.5f);
            this.f17391q0 = y10;
            this.f17387o0 = y10;
        }
    }

    private boolean V0() {
        return this.f17377j0 != null && this.f17384n.L1();
    }

    private void W0() {
        boolean z10;
        if (this.f17342E) {
            this.f17369e.x();
            if (this.f17344F) {
                this.f17384n.S0(this);
            }
        }
        if (V0()) {
            this.f17369e.v();
        } else {
            this.f17369e.j();
        }
        boolean z11 = this.f17343E0 || this.f17345F0;
        this.f17337B0.f17435k = this.f17400v && this.f17377j0 != null && ((z10 = this.f17342E) || z11 || this.f17384n.f17496h) && (!z10 || this.f17382m.i());
        B b10 = this.f17337B0;
        b10.f17436l = b10.f17435k && z11 && !this.f17342E && V0();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void Y0(float f10, float f11, float f12, float f13) {
        boolean z10;
        boolean z11 = true;
        if (f11 < 0.0f) {
            S();
            androidx.core.widget.f.d(this.f17352J, (-f11) / getWidth(), 1.0f - (f12 / getHeight()));
        } else {
            if (f11 <= 0.0f) {
                z10 = false;
                if (f13 >= 0.0f) {
                    U();
                    androidx.core.widget.f.d(this.f17354K, (-f13) / getHeight(), f10 / getWidth());
                } else if (f13 > 0.0f) {
                    R();
                    androidx.core.widget.f.d(this.f17375i0, f13 / getHeight(), 1.0f - (f10 / getWidth()));
                } else {
                    z11 = z10;
                }
                if (z11 && f11 == 0.0f && f13 == 0.0f) {
                    return;
                }
                AbstractC1484a0.h0(this);
            }
            T();
            androidx.core.widget.f.d(this.f17373h0, f11 / getWidth(), f12 / getHeight());
        }
        z10 = true;
        if (f13 >= 0.0f) {
        }
        if (z11) {
        }
        AbstractC1484a0.h0(this);
    }

    private boolean Z(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.f17390q.size();
        for (int i10 = 0; i10 < size; i10++) {
            t tVar = (t) this.f17390q.get(i10);
            if (tVar.b(this, motionEvent) && action != 3) {
                this.f17392r = tVar;
                return true;
            }
        }
        return false;
    }

    private void a0(int[] iArr) {
        int g10 = this.f17370f.g();
        if (g10 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i10 = Integer.MAX_VALUE;
        int i11 = Integer.MIN_VALUE;
        for (int i12 = 0; i12 < g10; i12++) {
            F l02 = l0(this.f17370f.f(i12));
            if (!l02.L()) {
                int o10 = l02.o();
                if (o10 < i10) {
                    i10 = o10;
                }
                if (o10 > i11) {
                    i11 = o10;
                }
            }
        }
        iArr[0] = i10;
        iArr[1] = i11;
    }

    private void a1() {
        View findViewById;
        if (!this.f17405x0 || this.f17382m == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            View focusedChild = getFocusedChild();
            if (!f17330d1 || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                if (!this.f17370f.n(focusedChild)) {
                    return;
                }
            } else if (this.f17370f.g() == 0) {
                requestFocus();
                return;
            }
        }
        View view = null;
        F e02 = (this.f17337B0.f17438n == -1 || !this.f17382m.i()) ? null : e0(this.f17337B0.f17438n);
        if (e02 != null && !this.f17370f.n(e02.f17450a) && e02.f17450a.hasFocusable()) {
            view = e02.f17450a;
        } else if (this.f17370f.g() > 0) {
            view = c0();
        }
        if (view != null) {
            int i10 = this.f17337B0.f17439o;
            if (i10 != -1 && (findViewById = view.findViewById(i10)) != null && findViewById.isFocusable()) {
                view = findViewById;
            }
            view.requestFocus();
        }
    }

    static RecyclerView b0(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            RecyclerView b02 = b0(viewGroup.getChildAt(i10));
            if (b02 != null) {
                return b02;
            }
        }
        return null;
    }

    private void b1() {
        boolean z10;
        EdgeEffect edgeEffect = this.f17352J;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z10 = this.f17352J.isFinished();
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect2 = this.f17354K;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z10 |= this.f17354K.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f17373h0;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z10 |= this.f17373h0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f17375i0;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z10 |= this.f17375i0.isFinished();
        }
        if (z10) {
            AbstractC1484a0.h0(this);
        }
    }

    private View c0() {
        F d02;
        B b10 = this.f17337B0;
        int i10 = b10.f17437m;
        if (i10 == -1) {
            i10 = 0;
        }
        int b11 = b10.b();
        for (int i11 = i10; i11 < b11; i11++) {
            F d03 = d0(i11);
            if (d03 == null) {
                break;
            }
            if (d03.f17450a.hasFocusable()) {
                return d03.f17450a;
            }
        }
        int min = Math.min(b11, i10);
        do {
            min--;
            if (min < 0 || (d02 = d0(min)) == null) {
                return null;
            }
        } while (!d02.f17450a.hasFocusable());
        return d02.f17450a;
    }

    private int c1(int i10, float f10) {
        float height = f10 / getHeight();
        float width = i10 / getWidth();
        EdgeEffect edgeEffect = this.f17352J;
        float f11 = 0.0f;
        if (edgeEffect == null || androidx.core.widget.f.b(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.f17373h0;
            if (edgeEffect2 != null && androidx.core.widget.f.b(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.f17373h0.onRelease();
                } else {
                    float d10 = androidx.core.widget.f.d(this.f17373h0, width, height);
                    if (androidx.core.widget.f.b(this.f17373h0) == 0.0f) {
                        this.f17373h0.onRelease();
                    }
                    f11 = d10;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.f17352J.onRelease();
            } else {
                float f12 = -androidx.core.widget.f.d(this.f17352J, -width, 1.0f - height);
                if (androidx.core.widget.f.b(this.f17352J) == 0.0f) {
                    this.f17352J.onRelease();
                }
                f11 = f12;
            }
            invalidate();
        }
        return Math.round(f11 * getWidth());
    }

    private int d1(int i10, float f10) {
        float width = f10 / getWidth();
        float height = i10 / getHeight();
        EdgeEffect edgeEffect = this.f17354K;
        float f11 = 0.0f;
        if (edgeEffect == null || androidx.core.widget.f.b(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.f17375i0;
            if (edgeEffect2 != null && androidx.core.widget.f.b(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.f17375i0.onRelease();
                } else {
                    float d10 = androidx.core.widget.f.d(this.f17375i0, height, 1.0f - width);
                    if (androidx.core.widget.f.b(this.f17375i0) == 0.0f) {
                        this.f17375i0.onRelease();
                    }
                    f11 = d10;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.f17354K.onRelease();
            } else {
                float f12 = -androidx.core.widget.f.d(this.f17354K, -height, width);
                if (androidx.core.widget.f.b(this.f17354K) == 0.0f) {
                    this.f17354K.onRelease();
                }
                f11 = f12;
            }
            invalidate();
        }
        return Math.round(f11 * getHeight());
    }

    private androidx.core.view.E getScrollingChildHelper() {
        if (this.f17355K0 == null) {
            this.f17355K0 = new androidx.core.view.E(this);
        }
        return this.f17355K0;
    }

    private void i(F f10) {
        View view = f10.f17450a;
        boolean z10 = view.getParent() == this;
        this.f17367c.O(k0(view));
        if (f10.z()) {
            this.f17370f.c(view, -1, view.getLayoutParams(), true);
        } else if (z10) {
            this.f17370f.k(view);
        } else {
            this.f17370f.b(view, true);
        }
    }

    private void k1(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f17376j.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof q) {
            q qVar = (q) layoutParams;
            if (!qVar.f17515c) {
                Rect rect = qVar.f17514b;
                Rect rect2 = this.f17376j;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f17376j);
            offsetRectIntoDescendantCoords(view, this.f17376j);
        }
        this.f17384n.s1(this, view, this.f17376j, !this.f17400v, view2 == null);
    }

    static F l0(View view) {
        if (view == null) {
            return null;
        }
        return ((q) view.getLayoutParams()).f17513a;
    }

    private void l1() {
        B b10 = this.f17337B0;
        b10.f17438n = -1L;
        b10.f17437m = -1;
        b10.f17439o = -1;
    }

    private void m1() {
        VelocityTracker velocityTracker = this.f17383m0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        F1(0);
        b1();
    }

    static void n0(View view, Rect rect) {
        q qVar = (q) view.getLayoutParams();
        Rect rect2 = qVar.f17514b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) qVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) qVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) qVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin);
    }

    private void n1() {
        View focusedChild = (this.f17405x0 && hasFocus() && this.f17382m != null) ? getFocusedChild() : null;
        F Y10 = focusedChild != null ? Y(focusedChild) : null;
        if (Y10 == null) {
            l1();
            return;
        }
        this.f17337B0.f17438n = this.f17382m.i() ? Y10.m() : -1L;
        this.f17337B0.f17437m = this.f17342E ? -1 : Y10.x() ? Y10.f17453d : Y10.j();
        this.f17337B0.f17439o = o0(Y10.f17450a);
    }

    private int o0(View view) {
        int id2 = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id2 = view.getId();
            }
        }
        return id2;
    }

    private void p(F f10, F f11, m.b bVar, m.b bVar2, boolean z10, boolean z11) {
        f10.I(false);
        if (z10) {
            i(f10);
        }
        if (f10 != f11) {
            if (z11) {
                i(f11);
            }
            f10.f17457h = f11;
            i(f10);
            this.f17367c.O(f10);
            f11.I(false);
            f11.f17458i = f10;
        }
        if (this.f17377j0.b(f10, f11, bVar, bVar2)) {
            U0();
        }
    }

    private String p0(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + '.' + str;
    }

    private float r0(int i10) {
        double log = Math.log((Math.abs(i10) * 0.35f) / (this.f17365a * 0.015f));
        float f10 = f17324X0;
        return (float) (this.f17365a * 0.015f * Math.exp((f10 / (f10 - 1.0d)) * log));
    }

    private void s0(long j10, F f10, F f11) {
        int g10 = this.f17370f.g();
        for (int i10 = 0; i10 < g10; i10++) {
            F l02 = l0(this.f17370f.f(i10));
            if (l02 != f10 && i0(l02) == j10) {
                h hVar = this.f17382m;
                if (hVar == null || !hVar.i()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + l02 + " \n View Holder 2:" + f10 + V());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + l02 + " \n View Holder 2:" + f10 + V());
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + f11 + " cannot be found but it is necessary for " + f10 + V());
    }

    private void s1(h hVar, boolean z10, boolean z11) {
        h hVar2 = this.f17382m;
        if (hVar2 != null) {
            hVar2.z(this.f17366b);
            this.f17382m.s(this);
        }
        if (!z10 || z11) {
            e1();
        }
        this.f17369e.x();
        h hVar3 = this.f17382m;
        this.f17382m = hVar;
        if (hVar != null) {
            hVar.x(this.f17366b);
            hVar.o(this);
        }
        p pVar = this.f17384n;
        if (pVar != null) {
            pVar.E0(hVar3, this.f17382m);
        }
        this.f17367c.y(hVar3, this.f17382m, z10);
        this.f17337B0.f17431g = true;
    }

    public static void setDebugAssertionsEnabled(boolean z10) {
        f17321U0 = z10;
    }

    public static void setVerboseLoggingEnabled(boolean z10) {
        f17322V0 = z10;
    }

    private void t() {
        m1();
        setScrollState(0);
    }

    static void u(F f10) {
        WeakReference weakReference = f10.f17451b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == f10.f17450a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            f10.f17451b = null;
        }
    }

    private boolean u0() {
        int g10 = this.f17370f.g();
        for (int i10 = 0; i10 < g10; i10++) {
            F l02 = l0(this.f17370f.f(i10));
            if (l02 != null && !l02.L() && l02.A()) {
                return true;
            }
        }
        return false;
    }

    private boolean u1(EdgeEffect edgeEffect, int i10, int i11) {
        if (i10 > 0) {
            return true;
        }
        return r0(-i10) < androidx.core.widget.f.b(edgeEffect) * ((float) i11);
    }

    private void w0() {
        if (AbstractC1484a0.z(this) == 0) {
            AbstractC1484a0.D0(this, 8);
        }
    }

    private void x0() {
        this.f17370f = new b(new C1613e());
    }

    private int y(int i10, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i11) {
        if (i10 > 0 && edgeEffect != null && androidx.core.widget.f.b(edgeEffect) != 0.0f) {
            int round = Math.round(((-i11) / 4.0f) * androidx.core.widget.f.d(edgeEffect, ((-i10) * 4.0f) / i11, 0.5f));
            if (round != i10) {
                edgeEffect.finish();
            }
            return i10 - round;
        }
        if (i10 >= 0 || edgeEffect2 == null || androidx.core.widget.f.b(edgeEffect2) == 0.0f) {
            return i10;
        }
        float f10 = i11;
        int round2 = Math.round((f10 / 4.0f) * androidx.core.widget.f.d(edgeEffect2, (i10 * 4.0f) / f10, 0.5f));
        if (round2 != i10) {
            edgeEffect2.finish();
        }
        return i10 - round2;
    }

    void A() {
        if (!this.f17400v || this.f17342E) {
            androidx.core.os.o.a("RV FullInvalidate");
            H();
            androidx.core.os.o.b();
            return;
        }
        if (this.f17369e.p()) {
            if (!this.f17369e.o(4) || this.f17369e.o(11)) {
                if (this.f17369e.p()) {
                    androidx.core.os.o.a("RV FullInvalidate");
                    H();
                    androidx.core.os.o.b();
                    return;
                }
                return;
            }
            androidx.core.os.o.a("RV PartialInvalidate");
            B1();
            O0();
            this.f17369e.v();
            if (!this.f17404x) {
                if (u0()) {
                    H();
                } else {
                    this.f17369e.i();
                }
            }
            E1(true);
            P0();
            androidx.core.os.o.b();
        }
    }

    boolean A0() {
        AccessibilityManager accessibilityManager = this.f17338C;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public void A1(int i10) {
        if (this.f17406y) {
            return;
        }
        p pVar = this.f17384n;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            pVar.I1(this, this.f17337B0, i10);
        }
    }

    public boolean B0() {
        return this.f17346G > 0;
    }

    void B1() {
        int i10 = this.f17402w + 1;
        this.f17402w = i10;
        if (i10 != 1 || this.f17406y) {
            return;
        }
        this.f17404x = false;
    }

    void C(int i10, int i11) {
        setMeasuredDimension(p.n(i10, getPaddingLeft() + getPaddingRight(), AbstractC1484a0.C(this)), p.n(i11, getPaddingTop() + getPaddingBottom(), AbstractC1484a0.B(this)));
    }

    public boolean C1(int i10, int i11) {
        return getScrollingChildHelper().p(i10, i11);
    }

    void D0(int i10) {
        if (this.f17384n == null) {
            return;
        }
        setScrollState(2);
        this.f17384n.x1(i10);
        awakenScrollBars();
    }

    void E(View view) {
        F l02 = l0(view);
        M0(view);
        h hVar = this.f17382m;
        if (hVar != null && l02 != null) {
            hVar.u(l02);
        }
        List list = this.f17340D;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((r) this.f17340D.get(size)).b(view);
            }
        }
    }

    void E0() {
        int j10 = this.f17370f.j();
        for (int i10 = 0; i10 < j10; i10++) {
            ((q) this.f17370f.i(i10).getLayoutParams()).f17515c = true;
        }
        this.f17367c.s();
    }

    void E1(boolean z10) {
        if (this.f17402w < 1) {
            if (f17321U0) {
                throw new IllegalStateException("stopInterceptRequestLayout was called more times than startInterceptRequestLayout." + V());
            }
            this.f17402w = 1;
        }
        if (!z10 && !this.f17406y) {
            this.f17404x = false;
        }
        if (this.f17402w == 1) {
            if (z10 && this.f17404x && !this.f17406y && this.f17384n != null && this.f17382m != null) {
                H();
            }
            if (!this.f17406y) {
                this.f17404x = false;
            }
        }
        this.f17402w--;
    }

    void F(View view) {
        F l02 = l0(view);
        N0(view);
        h hVar = this.f17382m;
        if (hVar != null && l02 != null) {
            hVar.v(l02);
        }
        List list = this.f17340D;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((r) this.f17340D.get(size)).a(view);
            }
        }
    }

    void F0() {
        int j10 = this.f17370f.j();
        for (int i10 = 0; i10 < j10; i10++) {
            F l02 = l0(this.f17370f.i(i10));
            if (l02 != null && !l02.L()) {
                l02.b(6);
            }
        }
        E0();
        this.f17367c.t();
    }

    public void F1(int i10) {
        getScrollingChildHelper().r(i10);
    }

    public void G1() {
        setScrollState(0);
        H1();
    }

    void H() {
        if (this.f17382m == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.f17384n == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        this.f17337B0.f17434j = false;
        boolean z10 = this.f17361Q0 && !(this.f17362R0 == getWidth() && this.f17363S0 == getHeight());
        this.f17362R0 = 0;
        this.f17363S0 = 0;
        this.f17361Q0 = false;
        if (this.f17337B0.f17429e == 1) {
            I();
            this.f17384n.z1(this);
            J();
        } else if (this.f17369e.q() || z10 || this.f17384n.o0() != getWidth() || this.f17384n.W() != getHeight()) {
            this.f17384n.z1(this);
            J();
        } else {
            this.f17384n.z1(this);
        }
        K();
    }

    public void H0(int i10) {
        int g10 = this.f17370f.g();
        for (int i11 = 0; i11 < g10; i11++) {
            this.f17370f.f(i11).offsetLeftAndRight(i10);
        }
    }

    public void I0(int i10) {
        int g10 = this.f17370f.g();
        for (int i11 = 0; i11 < g10; i11++) {
            this.f17370f.f(i11).offsetTopAndBottom(i10);
        }
    }

    void I1(int i10, int i11, Object obj) {
        int i12;
        int j10 = this.f17370f.j();
        int i13 = i10 + i11;
        for (int i14 = 0; i14 < j10; i14++) {
            View i15 = this.f17370f.i(i14);
            F l02 = l0(i15);
            if (l02 != null && !l02.L() && (i12 = l02.f17452c) >= i10 && i12 < i13) {
                l02.b(2);
                l02.a(obj);
                ((q) i15.getLayoutParams()).f17515c = true;
            }
        }
        this.f17367c.R(i10, i11);
    }

    void J0(int i10, int i11) {
        int j10 = this.f17370f.j();
        for (int i12 = 0; i12 < j10; i12++) {
            F l02 = l0(this.f17370f.i(i12));
            if (l02 != null && !l02.L() && l02.f17452c >= i10) {
                if (f17322V0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert attached child " + i12 + " holder " + l02 + " now at position " + (l02.f17452c + i11));
                }
                l02.C(i11, false);
                this.f17337B0.f17431g = true;
            }
        }
        this.f17367c.v(i10, i11);
        requestLayout();
    }

    void K0(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int j10 = this.f17370f.j();
        if (i10 < i11) {
            i14 = -1;
            i13 = i10;
            i12 = i11;
        } else {
            i12 = i10;
            i13 = i11;
            i14 = 1;
        }
        for (int i16 = 0; i16 < j10; i16++) {
            F l02 = l0(this.f17370f.i(i16));
            if (l02 != null && (i15 = l02.f17452c) >= i13 && i15 <= i12) {
                if (f17322V0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove attached child " + i16 + " holder " + l02);
                }
                if (l02.f17452c == i10) {
                    l02.C(i11 - i10, false);
                } else {
                    l02.C(i14, false);
                }
                this.f17337B0.f17431g = true;
            }
        }
        this.f17367c.w(i10, i11);
        requestLayout();
    }

    public boolean L(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return getScrollingChildHelper().d(i10, i11, iArr, iArr2, i12);
    }

    void L0(int i10, int i11, boolean z10) {
        int i12 = i10 + i11;
        int j10 = this.f17370f.j();
        for (int i13 = 0; i13 < j10; i13++) {
            F l02 = l0(this.f17370f.i(i13));
            if (l02 != null && !l02.L()) {
                int i14 = l02.f17452c;
                if (i14 >= i12) {
                    if (f17322V0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i13 + " holder " + l02 + " now at position " + (l02.f17452c - i11));
                    }
                    l02.C(-i11, z10);
                    this.f17337B0.f17431g = true;
                } else if (i14 >= i10) {
                    if (f17322V0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i13 + " holder " + l02 + " now REMOVED");
                    }
                    l02.i(i10 - 1, -i11, z10);
                    this.f17337B0.f17431g = true;
                }
            }
        }
        this.f17367c.x(i10, i11, z10);
        requestLayout();
    }

    public final void M(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        getScrollingChildHelper().e(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    public void M0(View view) {
    }

    void N(int i10) {
        p pVar = this.f17384n;
        if (pVar != null) {
            pVar.e1(i10);
        }
        S0(i10);
        u uVar = this.f17339C0;
        if (uVar != null) {
            uVar.a(this, i10);
        }
        List list = this.f17341D0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((u) this.f17341D0.get(size)).a(this, i10);
            }
        }
    }

    public void N0(View view) {
    }

    void O(int i10, int i11) {
        this.f17348H++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i10, scrollY - i11);
        T0(i10, i11);
        u uVar = this.f17339C0;
        if (uVar != null) {
            uVar.b(this, i10, i11);
        }
        List list = this.f17341D0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((u) this.f17341D0.get(size)).b(this, i10, i11);
            }
        }
        this.f17348H--;
    }

    void O0() {
        this.f17346G++;
    }

    void P() {
        int i10;
        for (int size = this.f17359O0.size() - 1; size >= 0; size--) {
            F f10 = (F) this.f17359O0.get(size);
            if (f10.f17450a.getParent() == this && !f10.L() && (i10 = f10.f17466q) != -1) {
                AbstractC1484a0.B0(f10.f17450a, i10);
                f10.f17466q = -1;
            }
        }
        this.f17359O0.clear();
    }

    void P0() {
        Q0(true);
    }

    void Q0(boolean z10) {
        int i10 = this.f17346G - 1;
        this.f17346G = i10;
        if (i10 < 1) {
            if (f17321U0 && i10 < 0) {
                throw new IllegalStateException("layout or scroll counter cannot go below zero.Some calls are not matching" + V());
            }
            this.f17346G = 0;
            if (z10) {
                G();
                P();
            }
        }
    }

    void R() {
        if (this.f17375i0 != null) {
            return;
        }
        EdgeEffect a10 = this.f17350I.a(this, 3);
        this.f17375i0 = a10;
        if (this.f17372h) {
            a10.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            a10.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    void S() {
        if (this.f17352J != null) {
            return;
        }
        EdgeEffect a10 = this.f17350I.a(this, 0);
        this.f17352J = a10;
        if (this.f17372h) {
            a10.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            a10.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void S0(int i10) {
    }

    void T() {
        if (this.f17373h0 != null) {
            return;
        }
        EdgeEffect a10 = this.f17350I.a(this, 2);
        this.f17373h0 = a10;
        if (this.f17372h) {
            a10.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            a10.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void T0(int i10, int i11) {
    }

    void U() {
        if (this.f17354K != null) {
            return;
        }
        EdgeEffect a10 = this.f17350I.a(this, 1);
        this.f17354K = a10;
        if (this.f17372h) {
            a10.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            a10.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    void U0() {
        if (this.f17349H0 || !this.f17394s) {
            return;
        }
        AbstractC1484a0.i0(this, this.f17360P0);
        this.f17349H0 = true;
    }

    String V() {
        return " " + super.toString() + ", adapter:" + this.f17382m + ", layout:" + this.f17384n + ", context:" + getContext();
    }

    final void W(B b10) {
        if (getScrollState() != 2) {
            b10.f17440p = 0;
            b10.f17441q = 0;
        } else {
            OverScroller overScroller = this.f17407y0.f17444c;
            b10.f17440p = overScroller.getFinalX() - overScroller.getCurrX();
            b10.f17441q = overScroller.getFinalY() - overScroller.getCurrY();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View X(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        return null;
    }

    void X0(boolean z10) {
        this.f17344F = z10 | this.f17344F;
        this.f17342E = true;
        F0();
    }

    public F Y(View view) {
        View X10 = X(view);
        if (X10 == null) {
            return null;
        }
        return k0(X10);
    }

    void Z0(F f10, m.b bVar) {
        f10.H(0, 8192);
        if (this.f17337B0.f17433i && f10.A() && !f10.x() && !f10.L()) {
            this.f17371g.c(i0(f10), f10);
        }
        this.f17371g.e(f10, bVar);
    }

    void a(int i10, int i11) {
        if (i10 < 0) {
            S();
            if (this.f17352J.isFinished()) {
                this.f17352J.onAbsorb(-i10);
            }
        } else if (i10 > 0) {
            T();
            if (this.f17373h0.isFinished()) {
                this.f17373h0.onAbsorb(i10);
            }
        }
        if (i11 < 0) {
            U();
            if (this.f17354K.isFinished()) {
                this.f17354K.onAbsorb(-i11);
            }
        } else if (i11 > 0) {
            R();
            if (this.f17375i0.isFinished()) {
                this.f17375i0.onAbsorb(i11);
            }
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        AbstractC1484a0.h0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList arrayList, int i10, int i11) {
        p pVar = this.f17384n;
        if (pVar == null || !pVar.F0(this, arrayList, i10, i11)) {
            super.addFocusables(arrayList, i10, i11);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof q) && this.f17384n.m((q) layoutParams);
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollExtent() {
        p pVar = this.f17384n;
        if (pVar != null && pVar.k()) {
            return this.f17384n.q(this.f17337B0);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollOffset() {
        p pVar = this.f17384n;
        if (pVar != null && pVar.k()) {
            return this.f17384n.r(this.f17337B0);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollRange() {
        p pVar = this.f17384n;
        if (pVar != null && pVar.k()) {
            return this.f17384n.s(this.f17337B0);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollExtent() {
        p pVar = this.f17384n;
        if (pVar != null && pVar.l()) {
            return this.f17384n.t(this.f17337B0);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollOffset() {
        p pVar = this.f17384n;
        if (pVar != null && pVar.l()) {
            return this.f17384n.u(this.f17337B0);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollRange() {
        p pVar = this.f17384n;
        if (pVar != null && pVar.l()) {
            return this.f17384n.v(this.f17337B0);
        }
        return 0;
    }

    public F d0(int i10) {
        F f10 = null;
        if (this.f17342E) {
            return null;
        }
        int j10 = this.f17370f.j();
        for (int i11 = 0; i11 < j10; i11++) {
            F l02 = l0(this.f17370f.i(i11));
            if (l02 != null && !l02.x() && h0(l02) == i10) {
                if (!this.f17370f.n(l02.f17450a)) {
                    return l02;
                }
                f10 = l02;
            }
        }
        return f10;
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return getScrollingChildHelper().a(f10, f11, z10);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return getScrollingChildHelper().b(f10, f11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i10, i11, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return getScrollingChildHelper().f(i10, i11, i12, i13, iArr);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z10;
        super.draw(canvas);
        int size = this.f17388p.size();
        boolean z11 = false;
        for (int i10 = 0; i10 < size; i10++) {
            ((o) this.f17388p.get(i10)).i(canvas, this, this.f17337B0);
        }
        EdgeEffect edgeEffect = this.f17352J;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z10 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f17372h ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f17352J;
            z10 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f17354K;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f17372h) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f17354K;
            z10 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f17373h0;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f17372h ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f17373h0;
            z10 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f17375i0;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f17372h) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f17375i0;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z11 = true;
            }
            z10 |= z11;
            canvas.restoreToCount(save4);
        }
        if ((z10 || this.f17377j0 == null || this.f17388p.size() <= 0 || !this.f17377j0.p()) ? z10 : true) {
            AbstractC1484a0.h0(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    public F e0(long j10) {
        h hVar = this.f17382m;
        F f10 = null;
        if (hVar != null && hVar.i()) {
            int j11 = this.f17370f.j();
            for (int i10 = 0; i10 < j11; i10++) {
                F l02 = l0(this.f17370f.i(i10));
                if (l02 != null && !l02.x() && l02.m() == j10) {
                    if (!this.f17370f.n(l02.f17450a)) {
                        return l02;
                    }
                    f10 = l02;
                }
            }
        }
        return f10;
    }

    void e1() {
        m mVar = this.f17377j0;
        if (mVar != null) {
            mVar.k();
        }
        p pVar = this.f17384n;
        if (pVar != null) {
            pVar.k1(this.f17367c);
            this.f17384n.l1(this.f17367c);
        }
        this.f17367c.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    F f0(int i10, boolean z10) {
        int j10 = this.f17370f.j();
        F f10 = null;
        for (int i11 = 0; i11 < j10; i11++) {
            F l02 = l0(this.f17370f.i(i11));
            if (l02 != null && !l02.x()) {
                if (z10) {
                    if (l02.f17452c != i10) {
                        continue;
                    }
                    if (this.f17370f.n(l02.f17450a)) {
                        return l02;
                    }
                    f10 = l02;
                } else {
                    if (l02.o() != i10) {
                        continue;
                    }
                    if (this.f17370f.n(l02.f17450a)) {
                    }
                }
            }
        }
        return f10;
    }

    boolean f1(View view) {
        B1();
        boolean r10 = this.f17370f.r(view);
        if (r10) {
            F l02 = l0(view);
            this.f17367c.O(l02);
            this.f17367c.H(l02);
            if (f17322V0) {
                Log.d("RecyclerView", "after removing animated view: " + view + ", " + this);
            }
        }
        E1(!r10);
        return r10;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i10) {
        View view2;
        boolean z10;
        View Q02 = this.f17384n.Q0(view, i10);
        if (Q02 != null) {
            return Q02;
        }
        boolean z11 = (this.f17382m == null || this.f17384n == null || B0() || this.f17406y) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z11 && (i10 == 2 || i10 == 1)) {
            if (this.f17384n.l()) {
                int i11 = i10 == 2 ? 130 : 33;
                z10 = focusFinder.findNextFocus(this, view, i11) == null;
                if (f17329c1) {
                    i10 = i11;
                }
            } else {
                z10 = false;
            }
            if (!z10 && this.f17384n.k()) {
                int i12 = (this.f17384n.Z() == 1) ^ (i10 == 2) ? 66 : 17;
                boolean z12 = focusFinder.findNextFocus(this, view, i12) == null;
                if (f17329c1) {
                    i10 = i12;
                }
                z10 = z12;
            }
            if (z10) {
                A();
                if (X(view) == null) {
                    return null;
                }
                B1();
                this.f17384n.J0(view, i10, this.f17367c, this.f17337B0);
                E1(false);
            }
            view2 = focusFinder.findNextFocus(this, view, i10);
        } else {
            View findNextFocus = focusFinder.findNextFocus(this, view, i10);
            if (findNextFocus == null && z11) {
                A();
                if (X(view) == null) {
                    return null;
                }
                B1();
                view2 = this.f17384n.J0(view, i10, this.f17367c, this.f17337B0);
                E1(false);
            } else {
                view2 = findNextFocus;
            }
        }
        if (view2 == null || view2.hasFocusable()) {
            return C0(view, view2, i10) ? view2 : super.focusSearch(view, i10);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i10);
        }
        k1(view2, null);
        return view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f0  */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean g0(int i10, int i11) {
        int i12;
        int i13;
        float f10;
        float f11;
        p pVar = this.f17384n;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.f17406y) {
            return false;
        }
        int k10 = pVar.k();
        boolean l10 = this.f17384n.l();
        if (k10 == 0 || Math.abs(i10) < this.f17397t0) {
            i10 = 0;
        }
        if (!l10 || Math.abs(i11) < this.f17397t0) {
            i11 = 0;
        }
        if (i10 == 0 && i11 == 0) {
            return false;
        }
        if (i10 != 0) {
            EdgeEffect edgeEffect = this.f17352J;
            if (edgeEffect == null || androidx.core.widget.f.b(edgeEffect) == 0.0f) {
                EdgeEffect edgeEffect2 = this.f17373h0;
                if (edgeEffect2 != null && androidx.core.widget.f.b(edgeEffect2) != 0.0f) {
                    if (u1(this.f17373h0, i10, getWidth())) {
                        this.f17373h0.onAbsorb(i10);
                        i10 = 0;
                    }
                    i12 = i10;
                    i10 = 0;
                }
            } else {
                int i14 = -i10;
                if (u1(this.f17352J, i14, getWidth())) {
                    this.f17352J.onAbsorb(i14);
                    i10 = 0;
                }
                i12 = i10;
                i10 = 0;
            }
            if (i11 != 0) {
                EdgeEffect edgeEffect3 = this.f17354K;
                if (edgeEffect3 == null || androidx.core.widget.f.b(edgeEffect3) == 0.0f) {
                    EdgeEffect edgeEffect4 = this.f17375i0;
                    if (edgeEffect4 != null && androidx.core.widget.f.b(edgeEffect4) != 0.0f) {
                        if (u1(this.f17375i0, i11, getHeight())) {
                            this.f17375i0.onAbsorb(i11);
                            i11 = 0;
                        }
                        i13 = 0;
                    }
                } else {
                    int i15 = -i11;
                    if (u1(this.f17354K, i15, getHeight())) {
                        this.f17354K.onAbsorb(i15);
                        i11 = 0;
                    }
                    i13 = 0;
                }
                if (i12 == 0 || i11 != 0) {
                    int i16 = this.f17399u0;
                    i12 = Math.max(-i16, Math.min(i12, i16));
                    int i17 = this.f17399u0;
                    i11 = Math.max(-i17, Math.min(i11, i17));
                    this.f17407y0.b(i12, i11);
                }
                if (i10 != 0 && i13 == 0) {
                    return (i12 == 0 && i11 == 0) ? false : true;
                }
                f10 = i10;
                f11 = i13;
                if (!dispatchNestedPreFling(f10, f11)) {
                    boolean z10 = k10 != 0 || l10;
                    dispatchNestedFling(f10, f11, z10);
                    s sVar = this.f17395s0;
                    if (sVar != null && sVar.a(i10, i13)) {
                        return true;
                    }
                    if (z10) {
                        if (l10) {
                            k10 = (k10 == true ? 1 : 0) | 2;
                        }
                        C1(k10, 1);
                        int i18 = this.f17399u0;
                        int max = Math.max(-i18, Math.min(i10, i18));
                        int i19 = this.f17399u0;
                        this.f17407y0.b(max, Math.max(-i19, Math.min(i13, i19)));
                        return true;
                    }
                }
                return false;
            }
            i13 = i11;
            i11 = 0;
            if (i12 == 0) {
            }
            int i162 = this.f17399u0;
            i12 = Math.max(-i162, Math.min(i12, i162));
            int i172 = this.f17399u0;
            i11 = Math.max(-i172, Math.min(i11, i172));
            this.f17407y0.b(i12, i11);
            if (i10 != 0) {
            }
            f10 = i10;
            f11 = i13;
            if (!dispatchNestedPreFling(f10, f11)) {
            }
            return false;
        }
        i12 = 0;
        if (i11 != 0) {
        }
        i13 = i11;
        i11 = 0;
        if (i12 == 0) {
        }
        int i1622 = this.f17399u0;
        i12 = Math.max(-i1622, Math.min(i12, i1622));
        int i1722 = this.f17399u0;
        i11 = Math.max(-i1722, Math.min(i11, i1722));
        this.f17407y0.b(i12, i11);
        if (i10 != 0) {
        }
        f10 = i10;
        f11 = i13;
        if (!dispatchNestedPreFling(f10, f11)) {
        }
        return false;
    }

    public void g1(o oVar) {
        p pVar = this.f17384n;
        if (pVar != null) {
            pVar.g("Cannot remove item decoration during a scroll  or layout");
        }
        this.f17388p.remove(oVar);
        if (this.f17388p.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        E0();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        p pVar = this.f17384n;
        if (pVar != null) {
            return pVar.D();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + V());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        p pVar = this.f17384n;
        if (pVar != null) {
            return pVar.E(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + V());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public h getAdapter() {
        return this.f17382m;
    }

    @Override // android.view.View
    public int getBaseline() {
        p pVar = this.f17384n;
        return pVar != null ? pVar.G() : super.getBaseline();
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i10, int i11) {
        return super.getChildDrawingOrder(i10, i11);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f17372h;
    }

    public androidx.recyclerview.widget.l getCompatAccessibilityDelegate() {
        return this.f17351I0;
    }

    public l getEdgeEffectFactory() {
        return this.f17350I;
    }

    public m getItemAnimator() {
        return this.f17377j0;
    }

    public int getItemDecorationCount() {
        return this.f17388p.size();
    }

    public p getLayoutManager() {
        return this.f17384n;
    }

    public int getMaxFlingVelocity() {
        return this.f17399u0;
    }

    public int getMinFlingVelocity() {
        return this.f17397t0;
    }

    long getNanoTime() {
        if (f17328b1) {
            return System.nanoTime();
        }
        return 0L;
    }

    public s getOnFlingListener() {
        return this.f17395s0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f17405x0;
    }

    public v getRecycledViewPool() {
        return this.f17367c.i();
    }

    public int getScrollState() {
        return this.f17379k0;
    }

    int h0(F f10) {
        if (f10.r(524) || !f10.u()) {
            return -1;
        }
        return this.f17369e.e(f10.f17452c);
    }

    public void h1(t tVar) {
        this.f17390q.remove(tVar);
        if (this.f17392r == tVar) {
            this.f17392r = null;
        }
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().j();
    }

    long i0(F f10) {
        return this.f17382m.i() ? f10.m() : f10.f17452c;
    }

    public void i1(u uVar) {
        List list = this.f17341D0;
        if (list != null) {
            list.remove(uVar);
        }
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.f17394s;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f17406y;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().l();
    }

    public void j(o oVar) {
        k(oVar, -1);
    }

    public int j0(View view) {
        F l02 = l0(view);
        if (l02 != null) {
            return l02.o();
        }
        return -1;
    }

    void j1() {
        F f10;
        int g10 = this.f17370f.g();
        for (int i10 = 0; i10 < g10; i10++) {
            View f11 = this.f17370f.f(i10);
            F k02 = k0(f11);
            if (k02 != null && (f10 = k02.f17458i) != null) {
                View view = f10.f17450a;
                int left = f11.getLeft();
                int top = f11.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    public void k(o oVar, int i10) {
        p pVar = this.f17384n;
        if (pVar != null) {
            pVar.g("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f17388p.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i10 < 0) {
            this.f17388p.add(oVar);
        } else {
            this.f17388p.add(i10, oVar);
        }
        E0();
        requestLayout();
    }

    public F k0(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return l0(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public void l(r rVar) {
        if (this.f17340D == null) {
            this.f17340D = new ArrayList();
        }
        this.f17340D.add(rVar);
    }

    public void m(t tVar) {
        this.f17390q.add(tVar);
    }

    public void m0(View view, Rect rect) {
        n0(view, rect);
    }

    public void n(u uVar) {
        if (this.f17341D0 == null) {
            this.f17341D0 = new ArrayList();
        }
        this.f17341D0.add(uVar);
    }

    void o(F f10, m.b bVar, m.b bVar2) {
        f10.I(false);
        if (this.f17377j0.a(f10, bVar, bVar2)) {
            U0();
        }
    }

    void o1() {
        int j10 = this.f17370f.j();
        for (int i10 = 0; i10 < j10; i10++) {
            F l02 = l0(this.f17370f.i(i10));
            if (f17321U0 && l02.f17452c == -1 && !l02.x()) {
                throw new IllegalStateException("view holder cannot have position -1 unless it is removed" + V());
            }
            if (!l02.L()) {
                l02.G();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        if (r1 >= 30.0f) goto L22;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onAttachedToWindow() {
        float f10;
        super.onAttachedToWindow();
        this.f17346G = 0;
        this.f17394s = true;
        this.f17400v = this.f17400v && !isLayoutRequested();
        this.f17367c.z();
        p pVar = this.f17384n;
        if (pVar != null) {
            pVar.z(this);
        }
        this.f17349H0 = false;
        if (f17328b1) {
            ThreadLocal threadLocal = f.f17698e;
            f fVar = (f) threadLocal.get();
            this.f17409z0 = fVar;
            if (fVar == null) {
                this.f17409z0 = new f();
                Display u10 = AbstractC1484a0.u(this);
                if (!isInEditMode() && u10 != null) {
                    f10 = u10.getRefreshRate();
                }
                f10 = 60.0f;
                f fVar2 = this.f17409z0;
                fVar2.f17702c = (long) (1.0E9f / f10);
                threadLocal.set(fVar2);
            }
            this.f17409z0.a(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        f fVar;
        super.onDetachedFromWindow();
        m mVar = this.f17377j0;
        if (mVar != null) {
            mVar.k();
        }
        G1();
        this.f17394s = false;
        p pVar = this.f17384n;
        if (pVar != null) {
            pVar.A(this, this.f17367c);
        }
        this.f17359O0.clear();
        removeCallbacks(this.f17360P0);
        this.f17371g.j();
        this.f17367c.A();
        E0.a.b(this);
        if (!f17328b1 || (fVar = this.f17409z0) == null) {
            return;
        }
        fVar.j(this);
        this.f17409z0 = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f17388p.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((o) this.f17388p.get(i10)).g(canvas, this, this.f17337B0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f10;
        float f11;
        if (this.f17384n != null && !this.f17406y && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f10 = this.f17384n.l() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.f17384n.k()) {
                    f11 = motionEvent.getAxisValue(10);
                    if (f10 == 0.0f || f11 != 0.0f) {
                        G0((int) (f11 * this.f17401v0), (int) (f10 * this.f17403w0), motionEvent, 1);
                    }
                }
                f11 = 0.0f;
                if (f10 == 0.0f) {
                }
                G0((int) (f11 * this.f17401v0), (int) (f10 * this.f17403w0), motionEvent, 1);
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.f17384n.l()) {
                        f10 = -axisValue;
                        f11 = 0.0f;
                        if (f10 == 0.0f) {
                        }
                        G0((int) (f11 * this.f17401v0), (int) (f10 * this.f17403w0), motionEvent, 1);
                    } else if (this.f17384n.k()) {
                        f11 = axisValue;
                        f10 = 0.0f;
                        if (f10 == 0.0f) {
                        }
                        G0((int) (f11 * this.f17401v0), (int) (f10 * this.f17403w0), motionEvent, 1);
                    }
                }
                f10 = 0.0f;
                f11 = 0.0f;
                if (f10 == 0.0f) {
                }
                G0((int) (f11 * this.f17401v0), (int) (f10 * this.f17403w0), motionEvent, 1);
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (this.f17406y) {
            return false;
        }
        this.f17392r = null;
        if (Z(motionEvent)) {
            t();
            return true;
        }
        p pVar = this.f17384n;
        if (pVar == null) {
            return false;
        }
        boolean k10 = pVar.k();
        boolean l10 = this.f17384n.l();
        if (this.f17383m0 == null) {
            this.f17383m0 = VelocityTracker.obtain();
        }
        this.f17383m0.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f17408z) {
                this.f17408z = false;
            }
            this.f17381l0 = motionEvent.getPointerId(0);
            int x10 = (int) (motionEvent.getX() + 0.5f);
            this.f17389p0 = x10;
            this.f17385n0 = x10;
            int y10 = (int) (motionEvent.getY() + 0.5f);
            this.f17391q0 = y10;
            this.f17387o0 = y10;
            if (D1(motionEvent) || this.f17379k0 == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                F1(1);
            }
            int[] iArr = this.f17357M0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i10 = k10;
            if (l10) {
                i10 = (k10 ? 1 : 0) | 2;
            }
            C1(i10, 0);
        } else if (actionMasked == 1) {
            this.f17383m0.clear();
            F1(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f17381l0);
            if (findPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f17381l0 + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x11 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y11 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.f17379k0 != 1) {
                int i11 = x11 - this.f17385n0;
                int i12 = y11 - this.f17387o0;
                if (k10 == 0 || Math.abs(i11) <= this.f17393r0) {
                    z10 = false;
                } else {
                    this.f17389p0 = x11;
                    z10 = true;
                }
                if (l10 && Math.abs(i12) > this.f17393r0) {
                    this.f17391q0 = y11;
                    z10 = true;
                }
                if (z10) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            t();
        } else if (actionMasked == 5) {
            this.f17381l0 = motionEvent.getPointerId(actionIndex);
            int x12 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f17389p0 = x12;
            this.f17385n0 = x12;
            int y12 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f17391q0 = y12;
            this.f17387o0 = y12;
        } else if (actionMasked == 6) {
            R0(motionEvent);
        }
        return this.f17379k0 == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        androidx.core.os.o.a("RV OnLayout");
        H();
        androidx.core.os.o.b();
        this.f17400v = true;
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        p pVar = this.f17384n;
        if (pVar == null) {
            C(i10, i11);
            return;
        }
        boolean z10 = false;
        if (pVar.s0()) {
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.f17384n.Z0(this.f17367c, this.f17337B0, i10, i11);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z10 = true;
            }
            this.f17361Q0 = z10;
            if (z10 || this.f17382m == null) {
                return;
            }
            if (this.f17337B0.f17429e == 1) {
                I();
            }
            this.f17384n.A1(i10, i11);
            this.f17337B0.f17434j = true;
            J();
            this.f17384n.D1(i10, i11);
            if (this.f17384n.G1()) {
                this.f17384n.A1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.f17337B0.f17434j = true;
                J();
                this.f17384n.D1(i10, i11);
            }
            this.f17362R0 = getMeasuredWidth();
            this.f17363S0 = getMeasuredHeight();
            return;
        }
        if (this.f17396t) {
            this.f17384n.Z0(this.f17367c, this.f17337B0, i10, i11);
            return;
        }
        if (this.f17336B) {
            B1();
            O0();
            W0();
            P0();
            B b10 = this.f17337B0;
            if (b10.f17436l) {
                b10.f17432h = true;
            } else {
                this.f17369e.j();
                this.f17337B0.f17432h = false;
            }
            this.f17336B = false;
            E1(false);
        } else if (this.f17337B0.f17436l) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        h hVar = this.f17382m;
        if (hVar != null) {
            this.f17337B0.f17430f = hVar.e();
        } else {
            this.f17337B0.f17430f = 0;
        }
        B1();
        this.f17384n.Z0(this.f17367c, this.f17337B0, i10, i11);
        E1(false);
        this.f17337B0.f17432h = false;
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (B0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i10, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof z)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        z zVar = (z) parcelable;
        this.f17368d = zVar;
        super.onRestoreInstanceState(zVar.a());
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        z zVar = new z(super.onSaveInstanceState());
        z zVar2 = this.f17368d;
        if (zVar2 != null) {
            zVar.b(zVar2);
        } else {
            p pVar = this.f17384n;
            if (pVar != null) {
                zVar.f17533c = pVar.d1();
            } else {
                zVar.f17533c = null;
            }
        }
        return zVar;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 == i12 && i11 == i13) {
            return;
        }
        z0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (this.f17406y || this.f17408z) {
            return false;
        }
        if (Q(motionEvent)) {
            t();
            return true;
        }
        p pVar = this.f17384n;
        if (pVar == null) {
            return false;
        }
        boolean k10 = pVar.k();
        boolean l10 = this.f17384n.l();
        if (this.f17383m0 == null) {
            this.f17383m0 = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            int[] iArr = this.f17357M0;
            iArr[1] = 0;
            iArr[0] = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        int[] iArr2 = this.f17357M0;
        obtain.offsetLocation(iArr2[0], iArr2[1]);
        if (actionMasked == 0) {
            this.f17381l0 = motionEvent.getPointerId(0);
            int x10 = (int) (motionEvent.getX() + 0.5f);
            this.f17389p0 = x10;
            this.f17385n0 = x10;
            int y10 = (int) (motionEvent.getY() + 0.5f);
            this.f17391q0 = y10;
            this.f17387o0 = y10;
            int i10 = k10;
            if (l10) {
                i10 = (k10 ? 1 : 0) | 2;
            }
            C1(i10, 0);
        } else {
            if (actionMasked == 1) {
                this.f17383m0.addMovement(obtain);
                this.f17383m0.computeCurrentVelocity(1000, this.f17399u0);
                float f10 = k10 != 0 ? -this.f17383m0.getXVelocity(this.f17381l0) : 0.0f;
                float f11 = l10 ? -this.f17383m0.getYVelocity(this.f17381l0) : 0.0f;
                if ((f10 == 0.0f && f11 == 0.0f) || !g0((int) f10, (int) f11)) {
                    setScrollState(0);
                }
                m1();
                obtain.recycle();
                return true;
            }
            if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f17381l0);
                if (findPointerIndex < 0) {
                    Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f17381l0 + " not found. Did any MotionEvents get skipped?");
                    return false;
                }
                int x11 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                int y11 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                int i11 = this.f17389p0 - x11;
                int i12 = this.f17391q0 - y11;
                if (this.f17379k0 != 1) {
                    if (k10 != 0) {
                        i11 = i11 > 0 ? Math.max(0, i11 - this.f17393r0) : Math.min(0, i11 + this.f17393r0);
                        if (i11 != 0) {
                            z10 = true;
                            if (l10) {
                                i12 = i12 > 0 ? Math.max(0, i12 - this.f17393r0) : Math.min(0, i12 + this.f17393r0);
                                if (i12 != 0) {
                                    z10 = true;
                                }
                            }
                            if (z10) {
                                setScrollState(1);
                            }
                        }
                    }
                    z10 = false;
                    if (l10) {
                    }
                    if (z10) {
                    }
                }
                if (this.f17379k0 == 1) {
                    int[] iArr3 = this.f17358N0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    int c12 = i11 - c1(i11, motionEvent.getY());
                    int d12 = i12 - d1(i12, motionEvent.getX());
                    if (L(k10 != 0 ? c12 : 0, l10 ? d12 : 0, this.f17358N0, this.f17356L0, 0)) {
                        int[] iArr4 = this.f17358N0;
                        c12 -= iArr4[0];
                        d12 -= iArr4[1];
                        int[] iArr5 = this.f17357M0;
                        int i13 = iArr5[0];
                        int[] iArr6 = this.f17356L0;
                        iArr5[0] = i13 + iArr6[0];
                        iArr5[1] = iArr5[1] + iArr6[1];
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int i14 = d12;
                    int[] iArr7 = this.f17356L0;
                    this.f17389p0 = x11 - iArr7[0];
                    this.f17391q0 = y11 - iArr7[1];
                    if (p1(k10 != 0 ? c12 : 0, l10 ? i14 : 0, motionEvent, 0)) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    f fVar = this.f17409z0;
                    if (fVar != null && (c12 != 0 || i14 != 0)) {
                        fVar.f(this, c12, i14);
                    }
                }
            } else if (actionMasked == 3) {
                t();
            } else if (actionMasked == 5) {
                this.f17381l0 = motionEvent.getPointerId(actionIndex);
                int x12 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                this.f17389p0 = x12;
                this.f17385n0 = x12;
                int y12 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                this.f17391q0 = y12;
                this.f17387o0 = y12;
            } else if (actionMasked == 6) {
                R0(motionEvent);
            }
        }
        this.f17383m0.addMovement(obtain);
        obtain.recycle();
        return true;
    }

    boolean p1(int i10, int i11, MotionEvent motionEvent, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        A();
        if (this.f17382m != null) {
            int[] iArr = this.f17358N0;
            iArr[0] = 0;
            iArr[1] = 0;
            q1(i10, i11, iArr);
            int[] iArr2 = this.f17358N0;
            int i17 = iArr2[0];
            int i18 = iArr2[1];
            i13 = i18;
            i14 = i17;
            i15 = i10 - i17;
            i16 = i11 - i18;
        } else {
            i13 = 0;
            i14 = 0;
            i15 = 0;
            i16 = 0;
        }
        if (!this.f17388p.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.f17358N0;
        iArr3[0] = 0;
        iArr3[1] = 0;
        M(i14, i13, i15, i16, this.f17356L0, i12, iArr3);
        int[] iArr4 = this.f17358N0;
        int i19 = iArr4[0];
        int i20 = i15 - i19;
        int i21 = iArr4[1];
        int i22 = i16 - i21;
        boolean z10 = (i19 == 0 && i21 == 0) ? false : true;
        int i23 = this.f17389p0;
        int[] iArr5 = this.f17356L0;
        int i24 = iArr5[0];
        this.f17389p0 = i23 - i24;
        int i25 = this.f17391q0;
        int i26 = iArr5[1];
        this.f17391q0 = i25 - i26;
        int[] iArr6 = this.f17357M0;
        iArr6[0] = iArr6[0] + i24;
        iArr6[1] = iArr6[1] + i26;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !androidx.core.view.C.a(motionEvent, 8194)) {
                Y0(motionEvent.getX(), i20, motionEvent.getY(), i22);
            }
            w(i10, i11);
        }
        if (i14 != 0 || i13 != 0) {
            O(i14, i13);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z10 && i14 == 0 && i13 == 0) ? false : true;
    }

    void q(F f10, m.b bVar, m.b bVar2) {
        i(f10);
        f10.I(false);
        if (this.f17377j0.c(f10, bVar, bVar2)) {
            U0();
        }
    }

    Rect q0(View view) {
        q qVar = (q) view.getLayoutParams();
        if (!qVar.f17515c) {
            return qVar.f17514b;
        }
        if (this.f17337B0.e() && (qVar.b() || qVar.d())) {
            return qVar.f17514b;
        }
        Rect rect = qVar.f17514b;
        rect.set(0, 0, 0, 0);
        int size = this.f17388p.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f17376j.set(0, 0, 0, 0);
            ((o) this.f17388p.get(i10)).e(this.f17376j, view, this, this.f17337B0);
            int i11 = rect.left;
            Rect rect2 = this.f17376j;
            rect.left = i11 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        qVar.f17515c = false;
        return rect;
    }

    void q1(int i10, int i11, int[] iArr) {
        B1();
        O0();
        androidx.core.os.o.a("RV Scroll");
        W(this.f17337B0);
        int w12 = i10 != 0 ? this.f17384n.w1(i10, this.f17367c, this.f17337B0) : 0;
        int y12 = i11 != 0 ? this.f17384n.y1(i11, this.f17367c, this.f17337B0) : 0;
        androidx.core.os.o.b();
        j1();
        P0();
        E1(false);
        if (iArr != null) {
            iArr[0] = w12;
            iArr[1] = y12;
        }
    }

    void r(String str) {
        if (B0()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + V());
        }
        if (this.f17348H > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(BuildConfig.FLAVOR + V()));
        }
    }

    public void r1(int i10) {
        if (this.f17406y) {
            return;
        }
        G1();
        p pVar = this.f17384n;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            pVar.x1(i10);
            awakenScrollBars();
        }
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(View view, boolean z10) {
        F l02 = l0(view);
        if (l02 != null) {
            if (l02.z()) {
                l02.f();
            } else if (!l02.L()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + l02 + V());
            }
        } else if (f17321U0) {
            throw new IllegalArgumentException("No ViewHolder found for child: " + view + V());
        }
        view.clearAnimation();
        F(view);
        super.removeDetachedView(view, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.f17384n.b1(this, this.f17337B0, view, view2) && view2 != null) {
            k1(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        return this.f17384n.r1(this, view, rect, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        int size = this.f17390q.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((t) this.f17390q.get(i10)).c(z10);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f17402w != 0 || this.f17406y) {
            this.f17404x = true;
        } else {
            super.requestLayout();
        }
    }

    boolean s(F f10) {
        m mVar = this.f17377j0;
        return mVar == null || mVar.g(f10, f10.q());
    }

    @Override // android.view.View
    public void scrollBy(int i10, int i11) {
        p pVar = this.f17384n;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f17406y) {
            return;
        }
        boolean k10 = pVar.k();
        boolean l10 = this.f17384n.l();
        if (k10 || l10) {
            if (!k10) {
                i10 = 0;
            }
            if (!l10) {
                i11 = 0;
            }
            p1(i10, i11, null, 0);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i10, int i11) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (v1(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(androidx.recyclerview.widget.l lVar) {
        this.f17351I0 = lVar;
        AbstractC1484a0.q0(this, lVar);
    }

    public void setAdapter(h hVar) {
        setLayoutFrozen(false);
        s1(hVar, false, true);
        X0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(k kVar) {
        if (kVar == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z10) {
        if (z10 != this.f17372h) {
            z0();
        }
        this.f17372h = z10;
        super.setClipToPadding(z10);
        if (this.f17400v) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(l lVar) {
        y0.f.g(lVar);
        this.f17350I = lVar;
        z0();
    }

    public void setHasFixedSize(boolean z10) {
        this.f17396t = z10;
    }

    public void setItemAnimator(m mVar) {
        m mVar2 = this.f17377j0;
        if (mVar2 != null) {
            mVar2.k();
            this.f17377j0.v(null);
        }
        this.f17377j0 = mVar;
        if (mVar != null) {
            mVar.v(this.f17347G0);
        }
    }

    public void setItemViewCacheSize(int i10) {
        this.f17367c.L(i10);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z10) {
        suppressLayout(z10);
    }

    public void setLayoutManager(p pVar) {
        if (pVar == this.f17384n) {
            return;
        }
        G1();
        if (this.f17384n != null) {
            m mVar = this.f17377j0;
            if (mVar != null) {
                mVar.k();
            }
            this.f17384n.k1(this.f17367c);
            this.f17384n.l1(this.f17367c);
            this.f17367c.c();
            if (this.f17394s) {
                this.f17384n.A(this, this.f17367c);
            }
            this.f17384n.E1(null);
            this.f17384n = null;
        } else {
            this.f17367c.c();
        }
        this.f17370f.o();
        this.f17384n = pVar;
        if (pVar != null) {
            if (pVar.f17490b != null) {
                throw new IllegalArgumentException("LayoutManager " + pVar + " is already attached to a RecyclerView:" + pVar.f17490b.V());
            }
            pVar.E1(this);
            if (this.f17394s) {
                this.f17384n.z(this);
            }
        }
        this.f17367c.P();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        getScrollingChildHelper().m(z10);
    }

    public void setOnFlingListener(s sVar) {
        this.f17395s0 = sVar;
    }

    @Deprecated
    public void setOnScrollListener(u uVar) {
        this.f17339C0 = uVar;
    }

    public void setPreserveFocusAfterLayout(boolean z10) {
        this.f17405x0 = z10;
    }

    public void setRecycledViewPool(v vVar) {
        this.f17367c.J(vVar);
    }

    @Deprecated
    public void setRecyclerListener(x xVar) {
    }

    void setScrollState(int i10) {
        if (i10 == this.f17379k0) {
            return;
        }
        if (f17322V0) {
            Log.d("RecyclerView", "setting scroll state to " + i10 + " from " + this.f17379k0, new Exception());
        }
        this.f17379k0 = i10;
        if (i10 != 2) {
            H1();
        }
        N(i10);
    }

    public void setScrollingTouchSlop(int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i10 != 0) {
            if (i10 == 1) {
                this.f17393r0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i10 + "; using default value");
        }
        this.f17393r0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(D d10) {
        this.f17367c.K(d10);
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i10) {
        return getScrollingChildHelper().o(i10);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().q();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z10) {
        if (z10 != this.f17406y) {
            r("Do not suppressLayout in layout or scroll");
            if (z10) {
                long uptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
                this.f17406y = true;
                this.f17408z = true;
                G1();
                return;
            }
            this.f17406y = false;
            if (this.f17404x && this.f17384n != null && this.f17382m != null) {
                requestLayout();
            }
            this.f17404x = false;
        }
    }

    public boolean t0() {
        return !this.f17400v || this.f17342E || this.f17369e.p();
    }

    boolean t1(F f10, int i10) {
        if (!B0()) {
            AbstractC1484a0.B0(f10.f17450a, i10);
            return true;
        }
        f10.f17466q = i10;
        this.f17359O0.add(f10);
        return false;
    }

    void v() {
        int j10 = this.f17370f.j();
        for (int i10 = 0; i10 < j10; i10++) {
            F l02 = l0(this.f17370f.i(i10));
            if (!l02.L()) {
                l02.c();
            }
        }
        this.f17367c.d();
    }

    void v0() {
        this.f17369e = new a(new C1614f());
    }

    boolean v1(AccessibilityEvent accessibilityEvent) {
        if (!B0()) {
            return false;
        }
        int a10 = accessibilityEvent != null ? AbstractC5233b.a(accessibilityEvent) : 0;
        this.f17334A |= a10 != 0 ? a10 : 0;
        return true;
    }

    void w(int i10, int i11) {
        boolean z10;
        EdgeEffect edgeEffect = this.f17352J;
        if (edgeEffect == null || edgeEffect.isFinished() || i10 <= 0) {
            z10 = false;
        } else {
            this.f17352J.onRelease();
            z10 = this.f17352J.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f17373h0;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i10 < 0) {
            this.f17373h0.onRelease();
            z10 |= this.f17373h0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f17354K;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i11 > 0) {
            this.f17354K.onRelease();
            z10 |= this.f17354K.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f17375i0;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i11 < 0) {
            this.f17375i0.onRelease();
            z10 |= this.f17375i0.isFinished();
        }
        if (z10) {
            AbstractC1484a0.h0(this);
        }
    }

    public void w1(int i10, int i11) {
        x1(i10, i11, null);
    }

    int x(int i10) {
        return y(i10, this.f17352J, this.f17373h0, getWidth());
    }

    public void x1(int i10, int i11, Interpolator interpolator) {
        y1(i10, i11, interpolator, Integer.MIN_VALUE);
    }

    void y0(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new e(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(AbstractC3182b.f33493a), resources.getDimensionPixelSize(AbstractC3182b.f33495c), resources.getDimensionPixelOffset(AbstractC3182b.f33494b));
        } else {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + V());
        }
    }

    public void y1(int i10, int i11, Interpolator interpolator, int i12) {
        z1(i10, i11, interpolator, i12, false);
    }

    int z(int i10) {
        return y(i10, this.f17354K, this.f17375i0, getHeight());
    }

    void z0() {
        this.f17375i0 = null;
        this.f17354K = null;
        this.f17373h0 = null;
        this.f17352J = null;
    }

    void z1(int i10, int i11, Interpolator interpolator, int i12, boolean z10) {
        p pVar = this.f17384n;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f17406y) {
            return;
        }
        if (!pVar.k()) {
            i10 = 0;
        }
        if (!this.f17384n.l()) {
            i11 = 0;
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        if (i12 != Integer.MIN_VALUE && i12 <= 0) {
            scrollBy(i10, i11);
            return;
        }
        if (z10) {
            int i13 = i10 != 0 ? 1 : 0;
            if (i11 != 0) {
                i13 |= 2;
            }
            C1(i13, 1);
        }
        this.f17407y0.e(i10, i11, i12, interpolator);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC3181a.f33492a);
    }

    public static class z extends F0.a {
        public static final Parcelable.Creator<z> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        Parcelable f17533c;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public z createFromParcel(Parcel parcel) {
                return new z(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public z createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new z(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public z[] newArray(int i10) {
                return new z[i10];
            }
        }

        z(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f17533c = parcel.readParcelable(classLoader == null ? p.class.getClassLoader() : classLoader);
        }

        void b(z zVar) {
            this.f17533c = zVar.f17533c;
        }

        @Override // F0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeParcelable(this.f17533c, 0);
        }

        z(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f17366b = new y();
        this.f17367c = new w();
        this.f17371g = new androidx.recyclerview.widget.q();
        this.f17374i = new RunnableC1609a();
        this.f17376j = new Rect();
        this.f17378k = new Rect();
        this.f17380l = new RectF();
        this.f17386o = new ArrayList();
        this.f17388p = new ArrayList();
        this.f17390q = new ArrayList();
        this.f17402w = 0;
        this.f17342E = false;
        this.f17344F = false;
        this.f17346G = 0;
        this.f17348H = 0;
        this.f17350I = f17333g1;
        this.f17377j0 = new c();
        this.f17379k0 = 0;
        this.f17381l0 = -1;
        this.f17401v0 = Float.MIN_VALUE;
        this.f17403w0 = Float.MIN_VALUE;
        this.f17405x0 = true;
        this.f17407y0 = new E();
        this.f17335A0 = f17328b1 ? new f.b() : null;
        this.f17337B0 = new B();
        this.f17343E0 = false;
        this.f17345F0 = false;
        this.f17347G0 = new n();
        this.f17349H0 = false;
        this.f17353J0 = new int[2];
        this.f17356L0 = new int[2];
        this.f17357M0 = new int[2];
        this.f17358N0 = new int[2];
        this.f17359O0 = new ArrayList();
        this.f17360P0 = new RunnableC1610b();
        this.f17362R0 = 0;
        this.f17363S0 = 0;
        this.f17364T0 = new C1612d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f17393r0 = viewConfiguration.getScaledTouchSlop();
        this.f17401v0 = AbstractC1492e0.f(viewConfiguration, context);
        this.f17403w0 = AbstractC1492e0.j(viewConfiguration, context);
        this.f17397t0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f17399u0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f17365a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.f17377j0.v(this.f17347G0);
        v0();
        x0();
        w0();
        if (AbstractC1484a0.y(this) == 0) {
            AbstractC1484a0.B0(this, 1);
        }
        this.f17338C = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new androidx.recyclerview.widget.l(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC3183c.f33496a, i10, 0);
        AbstractC1484a0.o0(this, context, AbstractC3183c.f33496a, attributeSet, obtainStyledAttributes, i10, 0);
        String string = obtainStyledAttributes.getString(AbstractC3183c.f33505j);
        if (obtainStyledAttributes.getInt(AbstractC3183c.f33499d, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f17372h = obtainStyledAttributes.getBoolean(AbstractC3183c.f33498c, true);
        boolean z10 = obtainStyledAttributes.getBoolean(AbstractC3183c.f33500e, false);
        this.f17398u = z10;
        if (z10) {
            y0((StateListDrawable) obtainStyledAttributes.getDrawable(AbstractC3183c.f33503h), obtainStyledAttributes.getDrawable(AbstractC3183c.f33504i), (StateListDrawable) obtainStyledAttributes.getDrawable(AbstractC3183c.f33501f), obtainStyledAttributes.getDrawable(AbstractC3183c.f33502g));
        }
        obtainStyledAttributes.recycle();
        B(context, string, attributeSet, i10, 0);
        int[] iArr = f17323W0;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        AbstractC1484a0.o0(this, context, iArr, attributeSet, obtainStyledAttributes2, i10, 0);
        boolean z11 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z11);
        E0.a.d(this, true);
    }

    public static class q extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        F f17513a;

        /* renamed from: b, reason: collision with root package name */
        final Rect f17514b;

        /* renamed from: c, reason: collision with root package name */
        boolean f17515c;

        /* renamed from: d, reason: collision with root package name */
        boolean f17516d;

        public q(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f17514b = new Rect();
            this.f17515c = true;
            this.f17516d = false;
        }

        public int a() {
            return this.f17513a.o();
        }

        public boolean b() {
            return this.f17513a.A();
        }

        public boolean c() {
            return this.f17513a.x();
        }

        public boolean d() {
            return this.f17513a.v();
        }

        public q(int i10, int i11) {
            super(i10, i11);
            this.f17514b = new Rect();
            this.f17515c = true;
            this.f17516d = false;
        }

        public q(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f17514b = new Rect();
            this.f17515c = true;
            this.f17516d = false;
        }

        public q(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f17514b = new Rect();
            this.f17515c = true;
            this.f17516d = false;
        }

        public q(q qVar) {
            super((ViewGroup.LayoutParams) qVar);
            this.f17514b = new Rect();
            this.f17515c = true;
            this.f17516d = false;
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        p pVar = this.f17384n;
        if (pVar != null) {
            return pVar.F(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + V());
    }

    public static abstract class p {

        /* renamed from: a, reason: collision with root package name */
        androidx.recyclerview.widget.b f17489a;

        /* renamed from: b, reason: collision with root package name */
        RecyclerView f17490b;

        /* renamed from: c, reason: collision with root package name */
        private final p.b f17491c;

        /* renamed from: d, reason: collision with root package name */
        private final p.b f17492d;

        /* renamed from: e, reason: collision with root package name */
        androidx.recyclerview.widget.p f17493e;

        /* renamed from: f, reason: collision with root package name */
        androidx.recyclerview.widget.p f17494f;

        /* renamed from: g, reason: collision with root package name */
        A f17495g;

        /* renamed from: h, reason: collision with root package name */
        boolean f17496h;

        /* renamed from: i, reason: collision with root package name */
        boolean f17497i;

        /* renamed from: j, reason: collision with root package name */
        boolean f17498j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f17499k;

        /* renamed from: l, reason: collision with root package name */
        private boolean f17500l;

        /* renamed from: m, reason: collision with root package name */
        int f17501m;

        /* renamed from: n, reason: collision with root package name */
        boolean f17502n;

        /* renamed from: o, reason: collision with root package name */
        private int f17503o;

        /* renamed from: p, reason: collision with root package name */
        private int f17504p;

        /* renamed from: q, reason: collision with root package name */
        private int f17505q;

        /* renamed from: r, reason: collision with root package name */
        private int f17506r;

        class a implements p.b {
            a() {
            }

            @Override // androidx.recyclerview.widget.p.b
            public int a(View view) {
                return p.this.Q(view) - ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.p.b
            public View b(int i10) {
                return p.this.I(i10);
            }

            @Override // androidx.recyclerview.widget.p.b
            public int c() {
                return p.this.e0();
            }

            @Override // androidx.recyclerview.widget.p.b
            public int d() {
                return p.this.o0() - p.this.f0();
            }

            @Override // androidx.recyclerview.widget.p.b
            public int e(View view) {
                return p.this.T(view) + ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).rightMargin;
            }
        }

        class b implements p.b {
            b() {
            }

            @Override // androidx.recyclerview.widget.p.b
            public int a(View view) {
                return p.this.U(view) - ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.p.b
            public View b(int i10) {
                return p.this.I(i10);
            }

            @Override // androidx.recyclerview.widget.p.b
            public int c() {
                return p.this.g0();
            }

            @Override // androidx.recyclerview.widget.p.b
            public int d() {
                return p.this.W() - p.this.d0();
            }

            @Override // androidx.recyclerview.widget.p.b
            public int e(View view) {
                return p.this.O(view) + ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).bottomMargin;
            }
        }

        public interface c {
            void a(int i10, int i11);
        }

        public static class d {

            /* renamed from: a, reason: collision with root package name */
            public int f17509a;

            /* renamed from: b, reason: collision with root package name */
            public int f17510b;

            /* renamed from: c, reason: collision with root package name */
            public boolean f17511c;

            /* renamed from: d, reason: collision with root package name */
            public boolean f17512d;
        }

        public p() {
            a aVar = new a();
            this.f17491c = aVar;
            b bVar = new b();
            this.f17492d = bVar;
            this.f17493e = new androidx.recyclerview.widget.p(aVar);
            this.f17494f = new androidx.recyclerview.widget.p(bVar);
            this.f17496h = false;
            this.f17497i = false;
            this.f17498j = false;
            this.f17499k = true;
            this.f17500l = true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
        
            if (r5 == 1073741824) goto L14;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static int K(int i10, int i11, int i12, int i13, boolean z10) {
            int max = Math.max(0, i10 - i12);
            if (z10) {
                if (i13 < 0) {
                    if (i13 == -1) {
                        if (i11 != Integer.MIN_VALUE) {
                            if (i11 != 0) {
                            }
                        }
                        i13 = max;
                    }
                    i11 = 0;
                    i13 = 0;
                }
                i11 = 1073741824;
            } else {
                if (i13 < 0) {
                    if (i13 != -1) {
                        if (i13 == -2) {
                            if (i11 == Integer.MIN_VALUE || i11 == 1073741824) {
                                i13 = max;
                                i11 = Integer.MIN_VALUE;
                            } else {
                                i13 = max;
                                i11 = 0;
                            }
                        }
                        i11 = 0;
                        i13 = 0;
                    }
                    i13 = max;
                }
                i11 = 1073741824;
            }
            return View.MeasureSpec.makeMeasureSpec(i13, i11);
        }

        private int[] L(View view, Rect rect) {
            int e02 = e0();
            int g02 = g0();
            int o02 = o0() - f0();
            int W10 = W() - d0();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i10 = left - e02;
            int min = Math.min(0, i10);
            int i11 = top - g02;
            int min2 = Math.min(0, i11);
            int i12 = width - o02;
            int max = Math.max(0, i12);
            int max2 = Math.max(0, height - W10);
            if (Z() != 1) {
                if (min == 0) {
                    min = Math.min(i10, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i12);
            }
            if (min2 == 0) {
                min2 = Math.min(i11, max2);
            }
            return new int[]{max, min2};
        }

        private void f(View view, int i10, boolean z10) {
            F l02 = RecyclerView.l0(view);
            if (z10 || l02.x()) {
                this.f17490b.f17371g.b(l02);
            } else {
                this.f17490b.f17371g.p(l02);
            }
            q qVar = (q) view.getLayoutParams();
            if (l02.N() || l02.y()) {
                if (l02.y()) {
                    l02.M();
                } else {
                    l02.e();
                }
                this.f17489a.c(view, i10, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f17490b) {
                int m10 = this.f17489a.m(view);
                if (i10 == -1) {
                    i10 = this.f17489a.g();
                }
                if (m10 == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f17490b.indexOfChild(view) + this.f17490b.V());
                }
                if (m10 != i10) {
                    this.f17490b.f17384n.B0(m10, i10);
                }
            } else {
                this.f17489a.a(view, i10, false);
                qVar.f17515c = true;
                A a10 = this.f17495g;
                if (a10 != null && a10.h()) {
                    this.f17495g.k(view);
                }
            }
            if (qVar.f17516d) {
                if (RecyclerView.f17322V0) {
                    Log.d("RecyclerView", "consuming pending invalidate on child " + qVar.f17513a);
                }
                l02.f17450a.invalidate();
                qVar.f17516d = false;
            }
        }

        public static d i0(Context context, AttributeSet attributeSet, int i10, int i11) {
            d dVar = new d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC3183c.f33496a, i10, i11);
            dVar.f17509a = obtainStyledAttributes.getInt(AbstractC3183c.f33497b, 1);
            dVar.f17510b = obtainStyledAttributes.getInt(AbstractC3183c.f33507l, 1);
            dVar.f17511c = obtainStyledAttributes.getBoolean(AbstractC3183c.f33506k, false);
            dVar.f17512d = obtainStyledAttributes.getBoolean(AbstractC3183c.f33508m, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        public static int n(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i10);
            int size = View.MeasureSpec.getSize(i10);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i11, i12) : size : Math.min(size, Math.max(i11, i12));
        }

        private boolean t0(RecyclerView recyclerView, int i10, int i11) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int e02 = e0();
            int g02 = g0();
            int o02 = o0() - f0();
            int W10 = W() - d0();
            Rect rect = this.f17490b.f17376j;
            P(focusedChild, rect);
            return rect.left - i10 < o02 && rect.right - i10 > e02 && rect.top - i11 < W10 && rect.bottom - i11 > g02;
        }

        private void v1(w wVar, int i10, View view) {
            F l02 = RecyclerView.l0(view);
            if (l02.L()) {
                if (RecyclerView.f17322V0) {
                    Log.d("RecyclerView", "ignoring view " + l02);
                    return;
                }
                return;
            }
            if (l02.v() && !l02.x() && !this.f17490b.f17382m.i()) {
                q1(i10);
                wVar.H(l02);
            } else {
                x(i10);
                wVar.I(view);
                this.f17490b.f17371g.k(l02);
            }
        }

        private static boolean w0(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (i12 > 0 && i10 != i12) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i10;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i10;
            }
            return true;
        }

        private void y(int i10, View view) {
            this.f17489a.d(i10);
        }

        void A(RecyclerView recyclerView, w wVar) {
            this.f17497i = false;
            I0(recyclerView, wVar);
        }

        public void A0(View view, int i10, int i11) {
            q qVar = (q) view.getLayoutParams();
            Rect q02 = this.f17490b.q0(view);
            int i12 = i10 + q02.left + q02.right;
            int i13 = i11 + q02.top + q02.bottom;
            int K10 = K(o0(), p0(), e0() + f0() + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin + i12, ((ViewGroup.MarginLayoutParams) qVar).width, k());
            int K11 = K(W(), X(), g0() + d0() + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin + i13, ((ViewGroup.MarginLayoutParams) qVar).height, l());
            if (F1(view, K10, K11, qVar)) {
                view.measure(K10, K11);
            }
        }

        void A1(int i10, int i11) {
            this.f17505q = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i10);
            this.f17503o = mode;
            if (mode == 0 && !RecyclerView.f17326Z0) {
                this.f17505q = 0;
            }
            this.f17506r = View.MeasureSpec.getSize(i11);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.f17504p = mode2;
            if (mode2 != 0 || RecyclerView.f17326Z0) {
                return;
            }
            this.f17506r = 0;
        }

        public View B(View view) {
            View X10;
            RecyclerView recyclerView = this.f17490b;
            if (recyclerView == null || (X10 = recyclerView.X(view)) == null || this.f17489a.n(X10)) {
                return null;
            }
            return X10;
        }

        public void B0(int i10, int i11) {
            View I10 = I(i10);
            if (I10 != null) {
                x(i10);
                h(I10, i11);
            } else {
                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i10 + this.f17490b.toString());
            }
        }

        public void B1(int i10, int i11) {
            this.f17490b.setMeasuredDimension(i10, i11);
        }

        public View C(int i10) {
            int J10 = J();
            for (int i11 = 0; i11 < J10; i11++) {
                View I10 = I(i11);
                F l02 = RecyclerView.l0(I10);
                if (l02 != null && l02.o() == i10 && !l02.L() && (this.f17490b.f17337B0.e() || !l02.x())) {
                    return I10;
                }
            }
            return null;
        }

        public void C0(int i10) {
            RecyclerView recyclerView = this.f17490b;
            if (recyclerView != null) {
                recyclerView.H0(i10);
            }
        }

        public void C1(Rect rect, int i10, int i11) {
            B1(n(i10, rect.width() + e0() + f0(), c0()), n(i11, rect.height() + g0() + d0(), b0()));
        }

        public abstract q D();

        public void D0(int i10) {
            RecyclerView recyclerView = this.f17490b;
            if (recyclerView != null) {
                recyclerView.I0(i10);
            }
        }

        void D1(int i10, int i11) {
            int J10 = J();
            if (J10 == 0) {
                this.f17490b.C(i10, i11);
                return;
            }
            int i12 = Integer.MIN_VALUE;
            int i13 = Integer.MAX_VALUE;
            int i14 = Integer.MIN_VALUE;
            int i15 = Integer.MAX_VALUE;
            for (int i16 = 0; i16 < J10; i16++) {
                View I10 = I(i16);
                Rect rect = this.f17490b.f17376j;
                P(I10, rect);
                int i17 = rect.left;
                if (i17 < i15) {
                    i15 = i17;
                }
                int i18 = rect.right;
                if (i18 > i12) {
                    i12 = i18;
                }
                int i19 = rect.top;
                if (i19 < i13) {
                    i13 = i19;
                }
                int i20 = rect.bottom;
                if (i20 > i14) {
                    i14 = i20;
                }
            }
            this.f17490b.f17376j.set(i15, i13, i12, i14);
            C1(this.f17490b.f17376j, i10, i11);
        }

        public q E(Context context, AttributeSet attributeSet) {
            return new q(context, attributeSet);
        }

        public void E0(h hVar, h hVar2) {
        }

        void E1(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f17490b = null;
                this.f17489a = null;
                this.f17505q = 0;
                this.f17506r = 0;
            } else {
                this.f17490b = recyclerView;
                this.f17489a = recyclerView.f17370f;
                this.f17505q = recyclerView.getWidth();
                this.f17506r = recyclerView.getHeight();
            }
            this.f17503o = 1073741824;
            this.f17504p = 1073741824;
        }

        public q F(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof q ? new q((q) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new q((ViewGroup.MarginLayoutParams) layoutParams) : new q(layoutParams);
        }

        public boolean F0(RecyclerView recyclerView, ArrayList arrayList, int i10, int i11) {
            return false;
        }

        boolean F1(View view, int i10, int i11, q qVar) {
            return (!view.isLayoutRequested() && this.f17499k && w0(view.getWidth(), i10, ((ViewGroup.MarginLayoutParams) qVar).width) && w0(view.getHeight(), i11, ((ViewGroup.MarginLayoutParams) qVar).height)) ? false : true;
        }

        public int G() {
            return -1;
        }

        public void G0(RecyclerView recyclerView) {
        }

        boolean G1() {
            return false;
        }

        public int H(View view) {
            return ((q) view.getLayoutParams()).f17514b.bottom;
        }

        public void H0(RecyclerView recyclerView) {
        }

        boolean H1(View view, int i10, int i11, q qVar) {
            return (this.f17499k && w0(view.getMeasuredWidth(), i10, ((ViewGroup.MarginLayoutParams) qVar).width) && w0(view.getMeasuredHeight(), i11, ((ViewGroup.MarginLayoutParams) qVar).height)) ? false : true;
        }

        public View I(int i10) {
            androidx.recyclerview.widget.b bVar = this.f17489a;
            if (bVar != null) {
                return bVar.f(i10);
            }
            return null;
        }

        public void I0(RecyclerView recyclerView, w wVar) {
            H0(recyclerView);
        }

        public abstract void I1(RecyclerView recyclerView, B b10, int i10);

        public int J() {
            androidx.recyclerview.widget.b bVar = this.f17489a;
            if (bVar != null) {
                return bVar.g();
            }
            return 0;
        }

        public abstract View J0(View view, int i10, w wVar, B b10);

        public void J1(A a10) {
            A a11 = this.f17495g;
            if (a11 != null && a10 != a11 && a11.h()) {
                this.f17495g.r();
            }
            this.f17495g = a10;
            a10.q(this.f17490b, this);
        }

        public void K0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f17490b;
            L0(recyclerView.f17367c, recyclerView.f17337B0, accessibilityEvent);
        }

        void K1() {
            A a10 = this.f17495g;
            if (a10 != null) {
                a10.r();
            }
        }

        public void L0(w wVar, B b10, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f17490b;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z10 = true;
            if (!recyclerView.canScrollVertically(1) && !this.f17490b.canScrollVertically(-1) && !this.f17490b.canScrollHorizontally(-1) && !this.f17490b.canScrollHorizontally(1)) {
                z10 = false;
            }
            accessibilityEvent.setScrollable(z10);
            h hVar = this.f17490b.f17382m;
            if (hVar != null) {
                accessibilityEvent.setItemCount(hVar.e());
            }
        }

        public abstract boolean L1();

        public boolean M() {
            RecyclerView recyclerView = this.f17490b;
            return recyclerView != null && recyclerView.f17372h;
        }

        public void M0(w wVar, B b10, C5228A c5228a) {
            if (this.f17490b.canScrollVertically(-1) || this.f17490b.canScrollHorizontally(-1)) {
                c5228a.a(8192);
                c5228a.M0(true);
            }
            if (this.f17490b.canScrollVertically(1) || this.f17490b.canScrollHorizontally(1)) {
                c5228a.a(4096);
                c5228a.M0(true);
            }
            c5228a.s0(C5228A.e.b(k0(wVar, b10), N(wVar, b10), v0(wVar, b10), l0(wVar, b10)));
        }

        public int N(w wVar, B b10) {
            return -1;
        }

        void N0(C5228A c5228a) {
            RecyclerView recyclerView = this.f17490b;
            M0(recyclerView.f17367c, recyclerView.f17337B0, c5228a);
        }

        public int O(View view) {
            return view.getBottom() + H(view);
        }

        void O0(View view, C5228A c5228a) {
            F l02 = RecyclerView.l0(view);
            if (l02 == null || l02.x() || this.f17489a.n(l02.f17450a)) {
                return;
            }
            RecyclerView recyclerView = this.f17490b;
            P0(recyclerView.f17367c, recyclerView.f17337B0, view, c5228a);
        }

        public void P(View view, Rect rect) {
            RecyclerView.n0(view, rect);
        }

        public int Q(View view) {
            return view.getLeft() - a0(view);
        }

        public View Q0(View view, int i10) {
            return null;
        }

        public int R(View view) {
            Rect rect = ((q) view.getLayoutParams()).f17514b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public void R0(RecyclerView recyclerView, int i10, int i11) {
        }

        public int S(View view) {
            Rect rect = ((q) view.getLayoutParams()).f17514b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public void S0(RecyclerView recyclerView) {
        }

        public int T(View view) {
            return view.getRight() + j0(view);
        }

        public void T0(RecyclerView recyclerView, int i10, int i11, int i12) {
        }

        public int U(View view) {
            return view.getTop() - m0(view);
        }

        public void U0(RecyclerView recyclerView, int i10, int i11) {
        }

        public View V() {
            View focusedChild;
            RecyclerView recyclerView = this.f17490b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f17489a.n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public void V0(RecyclerView recyclerView, int i10, int i11) {
        }

        public int W() {
            return this.f17506r;
        }

        public void W0(RecyclerView recyclerView, int i10, int i11, Object obj) {
            V0(recyclerView, i10, i11);
        }

        public int X() {
            return this.f17504p;
        }

        public abstract void X0(w wVar, B b10);

        public int Y() {
            RecyclerView recyclerView = this.f17490b;
            h adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.e();
            }
            return 0;
        }

        public void Y0(B b10) {
        }

        public int Z() {
            return AbstractC1484a0.A(this.f17490b);
        }

        public void Z0(w wVar, B b10, int i10, int i11) {
            this.f17490b.C(i10, i11);
        }

        public int a0(View view) {
            return ((q) view.getLayoutParams()).f17514b.left;
        }

        public boolean a1(RecyclerView recyclerView, View view, View view2) {
            return x0() || recyclerView.B0();
        }

        public void b(View view) {
            c(view, -1);
        }

        public int b0() {
            return AbstractC1484a0.B(this.f17490b);
        }

        public boolean b1(RecyclerView recyclerView, B b10, View view, View view2) {
            return a1(recyclerView, view, view2);
        }

        public void c(View view, int i10) {
            f(view, i10, true);
        }

        public int c0() {
            return AbstractC1484a0.C(this.f17490b);
        }

        public abstract void c1(Parcelable parcelable);

        public void d(View view) {
            e(view, -1);
        }

        public int d0() {
            RecyclerView recyclerView = this.f17490b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public abstract Parcelable d1();

        public void e(View view, int i10) {
            f(view, i10, false);
        }

        public int e0() {
            RecyclerView recyclerView = this.f17490b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public void e1(int i10) {
        }

        public int f0() {
            RecyclerView recyclerView = this.f17490b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        void f1(A a10) {
            if (this.f17495g == a10) {
                this.f17495g = null;
            }
        }

        public void g(String str) {
            RecyclerView recyclerView = this.f17490b;
            if (recyclerView != null) {
                recyclerView.r(str);
            }
        }

        public int g0() {
            RecyclerView recyclerView = this.f17490b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        boolean g1(int i10, Bundle bundle) {
            RecyclerView recyclerView = this.f17490b;
            return h1(recyclerView.f17367c, recyclerView.f17337B0, i10, bundle);
        }

        public void h(View view, int i10) {
            i(view, i10, (q) view.getLayoutParams());
        }

        public int h0(View view) {
            return ((q) view.getLayoutParams()).a();
        }

        public boolean h1(w wVar, B b10, int i10, Bundle bundle) {
            int g02;
            int e02;
            int i11;
            int i12;
            if (this.f17490b == null) {
                return false;
            }
            int W10 = W();
            int o02 = o0();
            Rect rect = new Rect();
            if (this.f17490b.getMatrix().isIdentity() && this.f17490b.getGlobalVisibleRect(rect)) {
                W10 = rect.height();
                o02 = rect.width();
            }
            if (i10 == 4096) {
                g02 = this.f17490b.canScrollVertically(1) ? (W10 - g0()) - d0() : 0;
                if (this.f17490b.canScrollHorizontally(1)) {
                    e02 = (o02 - e0()) - f0();
                    i11 = g02;
                    i12 = e02;
                }
                i11 = g02;
                i12 = 0;
            } else if (i10 != 8192) {
                i12 = 0;
                i11 = 0;
            } else {
                g02 = this.f17490b.canScrollVertically(-1) ? -((W10 - g0()) - d0()) : 0;
                if (this.f17490b.canScrollHorizontally(-1)) {
                    e02 = -((o02 - e0()) - f0());
                    i11 = g02;
                    i12 = e02;
                }
                i11 = g02;
                i12 = 0;
            }
            if (i11 == 0 && i12 == 0) {
                return false;
            }
            this.f17490b.z1(i12, i11, null, Integer.MIN_VALUE, true);
            return true;
        }

        public void i(View view, int i10, q qVar) {
            F l02 = RecyclerView.l0(view);
            if (l02.x()) {
                this.f17490b.f17371g.b(l02);
            } else {
                this.f17490b.f17371g.p(l02);
            }
            this.f17489a.c(view, i10, qVar, l02.x());
        }

        boolean i1(View view, int i10, Bundle bundle) {
            RecyclerView recyclerView = this.f17490b;
            return j1(recyclerView.f17367c, recyclerView.f17337B0, view, i10, bundle);
        }

        public void j(View view, Rect rect) {
            RecyclerView recyclerView = this.f17490b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.q0(view));
            }
        }

        public int j0(View view) {
            return ((q) view.getLayoutParams()).f17514b.right;
        }

        public boolean j1(w wVar, B b10, View view, int i10, Bundle bundle) {
            return false;
        }

        public abstract boolean k();

        public int k0(w wVar, B b10) {
            return -1;
        }

        public void k1(w wVar) {
            for (int J10 = J() - 1; J10 >= 0; J10--) {
                if (!RecyclerView.l0(I(J10)).L()) {
                    n1(J10, wVar);
                }
            }
        }

        public abstract boolean l();

        public int l0(w wVar, B b10) {
            return 0;
        }

        void l1(w wVar) {
            int j10 = wVar.j();
            for (int i10 = j10 - 1; i10 >= 0; i10--) {
                View n10 = wVar.n(i10);
                F l02 = RecyclerView.l0(n10);
                if (!l02.L()) {
                    l02.I(false);
                    if (l02.z()) {
                        this.f17490b.removeDetachedView(n10, false);
                    }
                    m mVar = this.f17490b.f17377j0;
                    if (mVar != null) {
                        mVar.j(l02);
                    }
                    l02.I(true);
                    wVar.D(n10);
                }
            }
            wVar.e();
            if (j10 > 0) {
                this.f17490b.invalidate();
            }
        }

        public boolean m(q qVar) {
            return qVar != null;
        }

        public int m0(View view) {
            return ((q) view.getLayoutParams()).f17514b.top;
        }

        public void m1(View view, w wVar) {
            p1(view);
            wVar.G(view);
        }

        public void n0(View view, boolean z10, Rect rect) {
            Matrix matrix;
            if (z10) {
                Rect rect2 = ((q) view.getLayoutParams()).f17514b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.f17490b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.f17490b.f17380l;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public void n1(int i10, w wVar) {
            View I10 = I(i10);
            q1(i10);
            wVar.G(I10);
        }

        public abstract void o(int i10, int i11, B b10, c cVar);

        public int o0() {
            return this.f17505q;
        }

        public boolean o1(Runnable runnable) {
            RecyclerView recyclerView = this.f17490b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public void p(int i10, c cVar) {
        }

        public int p0() {
            return this.f17503o;
        }

        public void p1(View view) {
            this.f17489a.p(view);
        }

        public abstract int q(B b10);

        boolean q0() {
            int J10 = J();
            for (int i10 = 0; i10 < J10; i10++) {
                ViewGroup.LayoutParams layoutParams = I(i10).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public void q1(int i10) {
            if (I(i10) != null) {
                this.f17489a.q(i10);
            }
        }

        public abstract int r(B b10);

        public boolean r0() {
            return this.f17497i;
        }

        public boolean r1(RecyclerView recyclerView, View view, Rect rect, boolean z10) {
            return s1(recyclerView, view, rect, z10, false);
        }

        public abstract int s(B b10);

        public abstract boolean s0();

        public boolean s1(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
            int[] L10 = L(view, rect);
            int i10 = L10[0];
            int i11 = L10[1];
            if ((z11 && !t0(recyclerView, i10, i11)) || (i10 == 0 && i11 == 0)) {
                return false;
            }
            if (z10) {
                recyclerView.scrollBy(i10, i11);
            } else {
                recyclerView.w1(i10, i11);
            }
            return true;
        }

        public abstract int t(B b10);

        public void t1() {
            RecyclerView recyclerView = this.f17490b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public abstract int u(B b10);

        public final boolean u0() {
            return this.f17500l;
        }

        public void u1() {
            this.f17496h = true;
        }

        public abstract int v(B b10);

        public boolean v0(w wVar, B b10) {
            return false;
        }

        public void w(w wVar) {
            for (int J10 = J() - 1; J10 >= 0; J10--) {
                v1(wVar, J10, I(J10));
            }
        }

        public abstract int w1(int i10, w wVar, B b10);

        public void x(int i10) {
            y(i10, I(i10));
        }

        public boolean x0() {
            A a10 = this.f17495g;
            return a10 != null && a10.h();
        }

        public abstract void x1(int i10);

        public boolean y0(View view, boolean z10, boolean z11) {
            boolean z12 = this.f17493e.b(view, 24579) && this.f17494f.b(view, 24579);
            return z10 ? z12 : !z12;
        }

        public abstract int y1(int i10, w wVar, B b10);

        void z(RecyclerView recyclerView) {
            this.f17497i = true;
            G0(recyclerView);
        }

        public void z0(View view, int i10, int i11, int i12, int i13) {
            q qVar = (q) view.getLayoutParams();
            Rect rect = qVar.f17514b;
            view.layout(i10 + rect.left + ((ViewGroup.MarginLayoutParams) qVar).leftMargin, i11 + rect.top + ((ViewGroup.MarginLayoutParams) qVar).topMargin, (i12 - rect.right) - ((ViewGroup.MarginLayoutParams) qVar).rightMargin, (i13 - rect.bottom) - ((ViewGroup.MarginLayoutParams) qVar).bottomMargin);
        }

        void z1(RecyclerView recyclerView) {
            A1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public void P0(w wVar, B b10, View view, C5228A c5228a) {
        }
    }
}
