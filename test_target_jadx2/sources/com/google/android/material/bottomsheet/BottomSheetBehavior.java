package com.google.android.material.bottomsheet;

import G0.c;
import H7.j;
import H7.k;
import H7.l;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AbstractC1484a0;
import androidx.core.view.K0;
import com.google.android.material.internal.o;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import u0.AbstractC4860a;
import z0.C5228A;
import z0.InterfaceC5231D;

/* loaded from: classes2.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c {

    /* renamed from: d0, reason: collision with root package name */
    private static final int f26638d0 = k.f3332h;

    /* renamed from: A, reason: collision with root package name */
    private ValueAnimator f26639A;

    /* renamed from: B, reason: collision with root package name */
    int f26640B;

    /* renamed from: C, reason: collision with root package name */
    int f26641C;

    /* renamed from: D, reason: collision with root package name */
    int f26642D;

    /* renamed from: E, reason: collision with root package name */
    float f26643E;

    /* renamed from: F, reason: collision with root package name */
    int f26644F;

    /* renamed from: G, reason: collision with root package name */
    float f26645G;

    /* renamed from: H, reason: collision with root package name */
    boolean f26646H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f26647I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f26648J;

    /* renamed from: K, reason: collision with root package name */
    int f26649K;

    /* renamed from: L, reason: collision with root package name */
    int f26650L;

    /* renamed from: M, reason: collision with root package name */
    G0.c f26651M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f26652N;

    /* renamed from: O, reason: collision with root package name */
    private int f26653O;

    /* renamed from: P, reason: collision with root package name */
    private boolean f26654P;

    /* renamed from: Q, reason: collision with root package name */
    private int f26655Q;

    /* renamed from: R, reason: collision with root package name */
    int f26656R;

    /* renamed from: S, reason: collision with root package name */
    int f26657S;

    /* renamed from: T, reason: collision with root package name */
    WeakReference f26658T;

    /* renamed from: U, reason: collision with root package name */
    WeakReference f26659U;

    /* renamed from: V, reason: collision with root package name */
    private final ArrayList f26660V;

    /* renamed from: W, reason: collision with root package name */
    private VelocityTracker f26661W;

    /* renamed from: X, reason: collision with root package name */
    int f26662X;

    /* renamed from: Y, reason: collision with root package name */
    private int f26663Y;

    /* renamed from: Z, reason: collision with root package name */
    boolean f26664Z;

    /* renamed from: a, reason: collision with root package name */
    private int f26665a;

    /* renamed from: a0, reason: collision with root package name */
    private Map f26666a0;

    /* renamed from: b, reason: collision with root package name */
    private boolean f26667b;

    /* renamed from: b0, reason: collision with root package name */
    private int f26668b0;

    /* renamed from: c, reason: collision with root package name */
    private boolean f26669c;

    /* renamed from: c0, reason: collision with root package name */
    private final c.AbstractC0063c f26670c0;

    /* renamed from: d, reason: collision with root package name */
    private float f26671d;

    /* renamed from: e, reason: collision with root package name */
    private int f26672e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f26673f;

    /* renamed from: g, reason: collision with root package name */
    private int f26674g;

    /* renamed from: h, reason: collision with root package name */
    private int f26675h;

    /* renamed from: i, reason: collision with root package name */
    private Y7.g f26676i;

    /* renamed from: j, reason: collision with root package name */
    private ColorStateList f26677j;

    /* renamed from: k, reason: collision with root package name */
    private int f26678k;

    /* renamed from: l, reason: collision with root package name */
    private int f26679l;

    /* renamed from: m, reason: collision with root package name */
    private int f26680m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f26681n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f26682o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f26683p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f26684q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f26685r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f26686s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f26687t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f26688u;

    /* renamed from: v, reason: collision with root package name */
    private int f26689v;

    /* renamed from: w, reason: collision with root package name */
    private int f26690w;

    /* renamed from: x, reason: collision with root package name */
    private Y7.k f26691x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f26692y;

    /* renamed from: z, reason: collision with root package name */
    private final h f26693z;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f26694a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f26695b;

        a(View view, int i10) {
            this.f26694a = view;
            this.f26695b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.R0(this.f26694a, this.f26695b, false);
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f26676i != null) {
                BottomSheetBehavior.this.f26676i.Y(floatValue);
            }
        }
    }

    class c implements o.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f26698a;

        c(boolean z10) {
            this.f26698a = z10;
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00b4  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00c3  */
        @Override // com.google.android.material.internal.o.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public K0 a(View view, K0 k02, o.e eVar) {
            boolean z10;
            androidx.core.graphics.e f10 = k02.f(K0.m.g());
            androidx.core.graphics.e f11 = k02.f(K0.m.d());
            BottomSheetBehavior.this.f26690w = f10.f15925b;
            boolean e10 = o.e(view);
            int paddingBottom = view.getPaddingBottom();
            int paddingLeft = view.getPaddingLeft();
            int paddingRight = view.getPaddingRight();
            if (BottomSheetBehavior.this.f26682o) {
                BottomSheetBehavior.this.f26689v = k02.i();
                paddingBottom = eVar.f27296d + BottomSheetBehavior.this.f26689v;
            }
            if (BottomSheetBehavior.this.f26683p) {
                paddingLeft = (e10 ? eVar.f27295c : eVar.f27293a) + f10.f15924a;
            }
            if (BottomSheetBehavior.this.f26684q) {
                paddingRight = (e10 ? eVar.f27293a : eVar.f27295c) + f10.f15926c;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            boolean z11 = true;
            if (BottomSheetBehavior.this.f26686s) {
                int i10 = marginLayoutParams.leftMargin;
                int i11 = f10.f15924a;
                if (i10 != i11) {
                    marginLayoutParams.leftMargin = i11;
                    z10 = true;
                    if (BottomSheetBehavior.this.f26687t) {
                        int i12 = marginLayoutParams.rightMargin;
                        int i13 = f10.f15926c;
                        if (i12 != i13) {
                            marginLayoutParams.rightMargin = i13;
                            z10 = true;
                        }
                    }
                    if (BottomSheetBehavior.this.f26688u) {
                        int i14 = marginLayoutParams.topMargin;
                        int i15 = f10.f15925b;
                        if (i14 != i15) {
                            marginLayoutParams.topMargin = i15;
                            if (z11) {
                                view.setLayoutParams(marginLayoutParams);
                            }
                            view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
                            if (this.f26698a) {
                                BottomSheetBehavior.this.f26680m = f11.f15927d;
                            }
                            if (!BottomSheetBehavior.this.f26682o || this.f26698a) {
                                BottomSheetBehavior.this.V0(false);
                            }
                            return k02;
                        }
                    }
                    z11 = z10;
                    if (z11) {
                    }
                    view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
                    if (this.f26698a) {
                    }
                    if (!BottomSheetBehavior.this.f26682o) {
                    }
                    BottomSheetBehavior.this.V0(false);
                    return k02;
                }
            }
            z10 = false;
            if (BottomSheetBehavior.this.f26687t) {
            }
            if (BottomSheetBehavior.this.f26688u) {
            }
            z11 = z10;
            if (z11) {
            }
            view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
            if (this.f26698a) {
            }
            if (!BottomSheetBehavior.this.f26682o) {
            }
            BottomSheetBehavior.this.V0(false);
            return k02;
        }
    }

    class d extends c.AbstractC0063c {

        /* renamed from: a, reason: collision with root package name */
        private long f26700a;

        d() {
        }

        private boolean n(View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.f26657S + bottomSheetBehavior.h0()) / 2;
        }

        @Override // G0.c.AbstractC0063c
        public int a(View view, int i10, int i11) {
            return view.getLeft();
        }

        @Override // G0.c.AbstractC0063c
        public int b(View view, int i10, int i11) {
            int h02 = BottomSheetBehavior.this.h0();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return AbstractC4860a.b(i10, h02, bottomSheetBehavior.f26646H ? bottomSheetBehavior.f26657S : bottomSheetBehavior.f26644F);
        }

        @Override // G0.c.AbstractC0063c
        public int e(View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.f26646H ? bottomSheetBehavior.f26657S : bottomSheetBehavior.f26644F;
        }

        @Override // G0.c.AbstractC0063c
        public void j(int i10) {
            if (i10 == 1 && BottomSheetBehavior.this.f26648J) {
                BottomSheetBehavior.this.K0(1);
            }
        }

        @Override // G0.c.AbstractC0063c
        public void k(View view, int i10, int i11, int i12, int i13) {
            BottomSheetBehavior.this.d0(i11);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
        
            if (r7.f26701b.M0(r0, (r9 * 100.0f) / r10.f26657S) != false) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
        
            if (r9 > r7.f26701b.f26642D) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x008b, code lost:
        
            if (java.lang.Math.abs(r8.getTop() - r7.f26701b.h0()) < java.lang.Math.abs(r8.getTop() - r7.f26701b.f26642D)) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00c9, code lost:
        
            if (r7.f26701b.P0() == false) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00eb, code lost:
        
            if (java.lang.Math.abs(r9 - r7.f26701b.f26641C) < java.lang.Math.abs(r9 - r7.f26701b.f26644F)) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x0107, code lost:
        
            if (r7.f26701b.P0() != false) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x0121, code lost:
        
            if (r7.f26701b.P0() == false) goto L63;
         */
        @Override // G0.c.AbstractC0063c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void l(View view, float f10, float f11) {
            int i10 = 6;
            if (f11 < 0.0f) {
                if (!BottomSheetBehavior.this.f26667b) {
                    int top = view.getTop();
                    long currentTimeMillis = System.currentTimeMillis() - this.f26700a;
                    if (BottomSheetBehavior.this.P0()) {
                    }
                }
                i10 = 3;
            } else {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.f26646H && bottomSheetBehavior.O0(view, f11)) {
                    if ((Math.abs(f10) >= Math.abs(f11) || f11 <= 500.0f) && !n(view)) {
                        if (!BottomSheetBehavior.this.f26667b) {
                        }
                        i10 = 3;
                    } else {
                        i10 = 5;
                    }
                } else if (f11 == 0.0f || Math.abs(f10) > Math.abs(f11)) {
                    int top2 = view.getTop();
                    if (!BottomSheetBehavior.this.f26667b) {
                        BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                        int i11 = bottomSheetBehavior2.f26642D;
                        if (top2 < i11) {
                            if (top2 >= Math.abs(top2 - bottomSheetBehavior2.f26644F)) {
                            }
                            i10 = 3;
                        } else {
                            if (Math.abs(top2 - i11) < Math.abs(top2 - BottomSheetBehavior.this.f26644F)) {
                            }
                            i10 = 4;
                        }
                    }
                } else {
                    if (!BottomSheetBehavior.this.f26667b) {
                        int top3 = view.getTop();
                        if (Math.abs(top3 - BottomSheetBehavior.this.f26642D) < Math.abs(top3 - BottomSheetBehavior.this.f26644F)) {
                        }
                    }
                    i10 = 4;
                }
            }
            BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
            bottomSheetBehavior3.R0(view, i10, bottomSheetBehavior3.Q0());
        }

        @Override // G0.c.AbstractC0063c
        public boolean m(View view, int i10) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i11 = bottomSheetBehavior.f26649K;
            if (i11 == 1 || bottomSheetBehavior.f26664Z) {
                return false;
            }
            if (i11 == 3 && bottomSheetBehavior.f26662X == i10) {
                WeakReference weakReference = bottomSheetBehavior.f26659U;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            this.f26700a = System.currentTimeMillis();
            WeakReference weakReference2 = BottomSheetBehavior.this.f26658T;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    class e implements InterfaceC5231D {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f26702a;

        e(int i10) {
            this.f26702a = i10;
        }

        @Override // z0.InterfaceC5231D
        public boolean a(View view, InterfaceC5231D.a aVar) {
            BottomSheetBehavior.this.J0(this.f26702a);
            return true;
        }
    }

    public static abstract class f {
        void a(View view) {
        }

        public abstract void b(View view, float f10);

        public abstract void c(View view, int i10);
    }

    public BottomSheetBehavior() {
        this.f26665a = 0;
        this.f26667b = true;
        this.f26669c = false;
        this.f26678k = -1;
        this.f26679l = -1;
        this.f26693z = new h(this, null);
        this.f26643E = 0.5f;
        this.f26645G = -1.0f;
        this.f26648J = true;
        this.f26649K = 4;
        this.f26650L = 4;
        this.f26660V = new ArrayList();
        this.f26668b0 = -1;
        this.f26670c0 = new d();
    }

    private void L0(View view) {
        boolean z10 = (Build.VERSION.SDK_INT < 29 || p0() || this.f26673f) ? false : true;
        if (this.f26682o || this.f26683p || this.f26684q || this.f26686s || this.f26687t || this.f26688u || z10) {
            o.a(view, new c(z10));
        }
    }

    private boolean N0() {
        return this.f26651M != null && (this.f26648J || this.f26649K == 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R0(View view, int i10, boolean z10) {
        int n02 = n0(i10);
        G0.c cVar = this.f26651M;
        if (cVar == null || (!z10 ? cVar.Q(view, view.getLeft(), n02) : cVar.O(view.getLeft(), n02))) {
            K0(i10);
            return;
        }
        K0(2);
        T0(i10);
        this.f26693z.c(i10);
    }

    private void S0() {
        View view;
        WeakReference weakReference = this.f26658T;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        AbstractC1484a0.k0(view, 524288);
        AbstractC1484a0.k0(view, 262144);
        AbstractC1484a0.k0(view, 1048576);
        int i10 = this.f26668b0;
        if (i10 != -1) {
            AbstractC1484a0.k0(view, i10);
        }
        if (!this.f26667b && this.f26649K != 6) {
            this.f26668b0 = V(view, j.f3304a, 6);
        }
        if (this.f26646H && this.f26649K != 5) {
            t0(view, C5228A.a.f45643y, 5);
        }
        int i11 = this.f26649K;
        if (i11 == 3) {
            t0(view, C5228A.a.f45642x, this.f26667b ? 4 : 6);
            return;
        }
        if (i11 == 4) {
            t0(view, C5228A.a.f45641w, this.f26667b ? 3 : 6);
        } else {
            if (i11 != 6) {
                return;
            }
            t0(view, C5228A.a.f45642x, 4);
            t0(view, C5228A.a.f45641w, 3);
        }
    }

    private void T0(int i10) {
        ValueAnimator valueAnimator;
        if (i10 == 2) {
            return;
        }
        boolean z10 = i10 == 3;
        if (this.f26692y != z10) {
            this.f26692y = z10;
            if (this.f26676i == null || (valueAnimator = this.f26639A) == null) {
                return;
            }
            if (valueAnimator.isRunning()) {
                this.f26639A.reverse();
                return;
            }
            float f10 = z10 ? 0.0f : 1.0f;
            this.f26639A.setFloatValues(1.0f - f10, f10);
            this.f26639A.start();
        }
    }

    private void U0(boolean z10) {
        Map map;
        WeakReference weakReference = this.f26658T;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z10) {
                if (this.f26666a0 != null) {
                    return;
                } else {
                    this.f26666a0 = new HashMap(childCount);
                }
            }
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if (childAt != this.f26658T.get()) {
                    if (z10) {
                        this.f26666a0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        if (this.f26669c) {
                            AbstractC1484a0.B0(childAt, 4);
                        }
                    } else if (this.f26669c && (map = this.f26666a0) != null && map.containsKey(childAt)) {
                        AbstractC1484a0.B0(childAt, ((Integer) this.f26666a0.get(childAt)).intValue());
                    }
                }
            }
            if (!z10) {
                this.f26666a0 = null;
            } else if (this.f26669c) {
                ((View) this.f26658T.get()).sendAccessibilityEvent(8);
            }
        }
    }

    private int V(View view, int i10, int i11) {
        return AbstractC1484a0.c(view, view.getResources().getString(i10), a0(i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V0(boolean z10) {
        View view;
        if (this.f26658T != null) {
            X();
            if (this.f26649K != 4 || (view = (View) this.f26658T.get()) == null) {
                return;
            }
            if (z10) {
                J0(4);
            } else {
                view.requestLayout();
            }
        }
    }

    private void X() {
        int Z10 = Z();
        if (this.f26667b) {
            this.f26644F = Math.max(this.f26657S - Z10, this.f26641C);
        } else {
            this.f26644F = this.f26657S - Z10;
        }
    }

    private void Y() {
        this.f26642D = (int) (this.f26657S * (1.0f - this.f26643E));
    }

    private int Z() {
        int i10;
        return this.f26673f ? Math.min(Math.max(this.f26674g, this.f26657S - ((this.f26656R * 9) / 16)), this.f26655Q) + this.f26689v : (this.f26681n || this.f26682o || (i10 = this.f26680m) <= 0) ? this.f26672e + this.f26689v : Math.max(this.f26672e, i10 + this.f26675h);
    }

    private InterfaceC5231D a0(int i10) {
        return new e(i10);
    }

    private void b0(Context context) {
        if (this.f26691x == null) {
            return;
        }
        Y7.g gVar = new Y7.g(this.f26691x);
        this.f26676i = gVar;
        gVar.M(context);
        ColorStateList colorStateList = this.f26677j;
        if (colorStateList != null) {
            this.f26676i.X(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.f26676i.setTint(typedValue.data);
    }

    private void c0() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f26639A = ofFloat;
        ofFloat.setDuration(500L);
        this.f26639A.addUpdateListener(new b());
    }

    public static BottomSheetBehavior f0(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.f)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.c f10 = ((CoordinatorLayout.f) layoutParams).f();
        if (f10 instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) f10;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    private int g0(int i10, int i11, int i12, int i13) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, i11, i13);
        if (i12 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i12), 1073741824);
        }
        if (size != 0) {
            i12 = Math.min(size, i12);
        }
        return View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE);
    }

    private int n0(int i10) {
        if (i10 == 3) {
            return h0();
        }
        if (i10 == 4) {
            return this.f26644F;
        }
        if (i10 == 5) {
            return this.f26657S;
        }
        if (i10 == 6) {
            return this.f26642D;
        }
        throw new IllegalArgumentException("Invalid state to get top offset: " + i10);
    }

    private float o0() {
        VelocityTracker velocityTracker = this.f26661W;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f26671d);
        return this.f26661W.getYVelocity(this.f26662X);
    }

    private boolean q0(View view) {
        ViewParent parent = view.getParent();
        return parent != null && parent.isLayoutRequested() && AbstractC1484a0.T(view);
    }

    private void t0(View view, C5228A.a aVar, int i10) {
        AbstractC1484a0.m0(view, aVar, null, a0(i10));
    }

    private void u0() {
        this.f26662X = -1;
        VelocityTracker velocityTracker = this.f26661W;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f26661W = null;
        }
    }

    private void v0(g gVar) {
        int i10 = this.f26665a;
        if (i10 == 0) {
            return;
        }
        if (i10 == -1 || (i10 & 1) == 1) {
            this.f26672e = gVar.f26705d;
        }
        if (i10 == -1 || (i10 & 2) == 2) {
            this.f26667b = gVar.f26706e;
        }
        if (i10 == -1 || (i10 & 4) == 4) {
            this.f26646H = gVar.f26707f;
        }
        if (i10 == -1 || (i10 & 8) == 8) {
            this.f26647I = gVar.f26708g;
        }
    }

    private void w0(View view, Runnable runnable) {
        if (q0(view)) {
            view.post(runnable);
        } else {
            runnable.run();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
        this.f26653O = 0;
        this.f26654P = false;
        return (i10 & 2) != 0;
    }

    public void A0(boolean z10) {
        this.f26681n = z10;
    }

    public void B0(float f10) {
        if (f10 <= 0.0f || f10 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f26643E = f10;
        if (this.f26658T != null) {
            Y();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0035, code lost:
    
        if (r4.getTop() <= r2.f26642D) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a9, code lost:
    
        r0 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0065, code lost:
    
        if (java.lang.Math.abs(r3 - r2.f26641C) < java.lang.Math.abs(r3 - r2.f26644F)) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007b, code lost:
    
        if (P0() != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008b, code lost:
    
        if (java.lang.Math.abs(r3 - r1) < java.lang.Math.abs(r3 - r2.f26644F)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a7, code lost:
    
        if (java.lang.Math.abs(r3 - r2.f26642D) < java.lang.Math.abs(r3 - r2.f26644F)) goto L51;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void C(CoordinatorLayout coordinatorLayout, View view, View view2, int i10) {
        WeakReference weakReference;
        int i11 = 3;
        if (view.getTop() == h0()) {
            K0(3);
            return;
        }
        if (!r0() || ((weakReference = this.f26659U) != null && view2 == weakReference.get() && this.f26654P)) {
            if (this.f26653O > 0) {
                if (!this.f26667b) {
                }
                R0(view, i11, false);
                this.f26654P = false;
            }
            if (this.f26646H && O0(view, o0())) {
                i11 = 5;
            } else if (this.f26653O == 0) {
                int top = view.getTop();
                if (!this.f26667b) {
                    int i12 = this.f26642D;
                    if (top < i12) {
                        if (top >= Math.abs(top - this.f26644F)) {
                        }
                    }
                }
            } else {
                if (!this.f26667b) {
                    int top2 = view.getTop();
                }
                i11 = 4;
            }
            R0(view, i11, false);
            this.f26654P = false;
        }
    }

    public void C0(boolean z10) {
        if (this.f26646H != z10) {
            this.f26646H = z10;
            if (!z10 && this.f26649K == 5) {
                J0(4);
            }
            S0();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f26649K == 1 && actionMasked == 0) {
            return true;
        }
        if (N0()) {
            this.f26651M.F(motionEvent);
        }
        if (actionMasked == 0) {
            u0();
        }
        if (this.f26661W == null) {
            this.f26661W = VelocityTracker.obtain();
        }
        this.f26661W.addMovement(motionEvent);
        if (N0() && actionMasked == 2 && !this.f26652N && Math.abs(this.f26663Y - motionEvent.getY()) > this.f26651M.z()) {
            this.f26651M.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f26652N;
    }

    public void D0(int i10) {
        this.f26679l = i10;
    }

    public void E0(int i10) {
        this.f26678k = i10;
    }

    public void F0(int i10) {
        G0(i10, false);
    }

    public final void G0(int i10, boolean z10) {
        if (i10 == -1) {
            if (this.f26673f) {
                return;
            } else {
                this.f26673f = true;
            }
        } else {
            if (!this.f26673f && this.f26672e == i10) {
                return;
            }
            this.f26673f = false;
            this.f26672e = Math.max(0, i10);
        }
        V0(z10);
    }

    public void H0(int i10) {
        this.f26665a = i10;
    }

    public void I0(boolean z10) {
        this.f26647I = z10;
    }

    public void J0(int i10) {
        if (i10 == 1 || i10 == 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("STATE_");
            sb2.append(i10 == 1 ? "DRAGGING" : "SETTLING");
            sb2.append(" should not be set externally.");
            throw new IllegalArgumentException(sb2.toString());
        }
        if (!this.f26646H && i10 == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i10);
            return;
        }
        int i11 = (i10 == 6 && this.f26667b && n0(i10) <= this.f26641C) ? 3 : i10;
        WeakReference weakReference = this.f26658T;
        if (weakReference == null || weakReference.get() == null) {
            K0(i10);
        } else {
            View view = (View) this.f26658T.get();
            w0(view, new a(view, i11));
        }
    }

    void K0(int i10) {
        View view;
        if (this.f26649K == i10) {
            return;
        }
        this.f26649K = i10;
        if (i10 == 4 || i10 == 3 || i10 == 6 || (this.f26646H && i10 == 5)) {
            this.f26650L = i10;
        }
        WeakReference weakReference = this.f26658T;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        if (i10 == 3) {
            U0(true);
        } else if (i10 == 6 || i10 == 5 || i10 == 4) {
            U0(false);
        }
        T0(i10);
        for (int i11 = 0; i11 < this.f26660V.size(); i11++) {
            ((f) this.f26660V.get(i11)).c(view, i10);
        }
        S0();
    }

    public boolean M0(long j10, float f10) {
        return false;
    }

    boolean O0(View view, float f10) {
        if (this.f26647I) {
            return true;
        }
        if (view.getTop() < this.f26644F) {
            return false;
        }
        return Math.abs((((float) view.getTop()) + (f10 * 0.1f)) - ((float) this.f26644F)) / ((float) Z()) > 0.5f;
    }

    public boolean P0() {
        return false;
    }

    public boolean Q0() {
        return true;
    }

    public void W(f fVar) {
        if (this.f26660V.contains(fVar)) {
            return;
        }
        this.f26660V.add(fVar);
    }

    void d0(int i10) {
        float f10;
        float f11;
        View view = (View) this.f26658T.get();
        if (view == null || this.f26660V.isEmpty()) {
            return;
        }
        int i11 = this.f26644F;
        if (i10 > i11 || i11 == h0()) {
            int i12 = this.f26644F;
            f10 = i12 - i10;
            f11 = this.f26657S - i12;
        } else {
            int i13 = this.f26644F;
            f10 = i13 - i10;
            f11 = i13 - h0();
        }
        float f12 = f10 / f11;
        for (int i14 = 0; i14 < this.f26660V.size(); i14++) {
            ((f) this.f26660V.get(i14)).b(view, f12);
        }
    }

    View e0(View view) {
        if (AbstractC1484a0.V(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View e02 = e0(viewGroup.getChildAt(i10));
            if (e02 != null) {
                return e02;
            }
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void g(CoordinatorLayout.f fVar) {
        super.g(fVar);
        this.f26658T = null;
        this.f26651M = null;
    }

    public int h0() {
        if (this.f26667b) {
            return this.f26641C;
        }
        return Math.max(this.f26640B, this.f26685r ? 0 : this.f26690w);
    }

    public float i0() {
        return this.f26643E;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void j() {
        super.j();
        this.f26658T = null;
        this.f26651M = null;
    }

    Y7.g j0() {
        return this.f26676i;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        G0.c cVar;
        if (!view.isShown() || !this.f26648J) {
            this.f26652N = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            u0();
        }
        if (this.f26661W == null) {
            this.f26661W = VelocityTracker.obtain();
        }
        this.f26661W.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x10 = (int) motionEvent.getX();
            this.f26663Y = (int) motionEvent.getY();
            if (this.f26649K != 2) {
                WeakReference weakReference = this.f26659U;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.C(view2, x10, this.f26663Y)) {
                    this.f26662X = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f26664Z = true;
                }
            }
            this.f26652N = this.f26662X == -1 && !coordinatorLayout.C(view, x10, this.f26663Y);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f26664Z = false;
            this.f26662X = -1;
            if (this.f26652N) {
                this.f26652N = false;
                return false;
            }
        }
        if (!this.f26652N && (cVar = this.f26651M) != null && cVar.P(motionEvent)) {
            return true;
        }
        WeakReference weakReference2 = this.f26659U;
        View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
        return (actionMasked != 2 || view3 == null || this.f26652N || this.f26649K == 1 || coordinatorLayout.C(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f26651M == null || Math.abs(((float) this.f26663Y) - motionEvent.getY()) <= ((float) this.f26651M.z())) ? false : true;
    }

    public int k0() {
        return this.f26679l;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        if (AbstractC1484a0.x(coordinatorLayout) && !AbstractC1484a0.x(view)) {
            view.setFitsSystemWindows(true);
        }
        if (this.f26658T == null) {
            this.f26674g = coordinatorLayout.getResources().getDimensionPixelSize(H7.d.f3192b);
            L0(view);
            this.f26658T = new WeakReference(view);
            Y7.g gVar = this.f26676i;
            if (gVar != null) {
                AbstractC1484a0.u0(view, gVar);
                Y7.g gVar2 = this.f26676i;
                float f10 = this.f26645G;
                if (f10 == -1.0f) {
                    f10 = AbstractC1484a0.v(view);
                }
                gVar2.W(f10);
                boolean z10 = this.f26649K == 3;
                this.f26692y = z10;
                this.f26676i.Y(z10 ? 0.0f : 1.0f);
            } else {
                ColorStateList colorStateList = this.f26677j;
                if (colorStateList != null) {
                    AbstractC1484a0.v0(view, colorStateList);
                }
            }
            S0();
            if (AbstractC1484a0.y(view) == 0) {
                AbstractC1484a0.B0(view, 1);
            }
        }
        if (this.f26651M == null) {
            this.f26651M = G0.c.o(coordinatorLayout, this.f26670c0);
        }
        int top = view.getTop();
        coordinatorLayout.K(view, i10);
        this.f26656R = coordinatorLayout.getWidth();
        this.f26657S = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f26655Q = height;
        int i11 = this.f26657S;
        int i12 = i11 - height;
        int i13 = this.f26690w;
        if (i12 < i13) {
            if (this.f26685r) {
                this.f26655Q = i11;
            } else {
                this.f26655Q = i11 - i13;
            }
        }
        this.f26641C = Math.max(0, i11 - this.f26655Q);
        Y();
        X();
        int i14 = this.f26649K;
        if (i14 == 3) {
            AbstractC1484a0.b0(view, h0());
        } else if (i14 == 6) {
            AbstractC1484a0.b0(view, this.f26642D);
        } else if (this.f26646H && i14 == 5) {
            AbstractC1484a0.b0(view, this.f26657S);
        } else if (i14 == 4) {
            AbstractC1484a0.b0(view, this.f26644F);
        } else if (i14 == 1 || i14 == 2) {
            AbstractC1484a0.b0(view, top - view.getTop());
        }
        this.f26659U = new WeakReference(e0(view));
        for (int i15 = 0; i15 < this.f26660V.size(); i15++) {
            ((f) this.f26660V.get(i15)).a(view);
        }
        return true;
    }

    public int l0() {
        if (this.f26673f) {
            return -1;
        }
        return this.f26672e;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(g0(i10, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, this.f26678k, marginLayoutParams.width), g0(i12, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, this.f26679l, marginLayoutParams.height));
        return true;
    }

    public int m0() {
        return this.f26649K;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean o(CoordinatorLayout coordinatorLayout, View view, View view2, float f10, float f11) {
        WeakReference weakReference;
        if (r0() && (weakReference = this.f26659U) != null && view2 == weakReference.get()) {
            return this.f26649K != 3 || super.o(coordinatorLayout, view, view2, f10, f11);
        }
        return false;
    }

    public boolean p0() {
        return this.f26681n;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 1) {
            return;
        }
        WeakReference weakReference = this.f26659U;
        View view3 = weakReference != null ? (View) weakReference.get() : null;
        if (!r0() || view2 == view3) {
            int top = view.getTop();
            int i13 = top - i11;
            if (i11 > 0) {
                if (i13 < h0()) {
                    int h02 = top - h0();
                    iArr[1] = h02;
                    AbstractC1484a0.b0(view, -h02);
                    K0(3);
                } else {
                    if (!this.f26648J) {
                        return;
                    }
                    iArr[1] = i11;
                    AbstractC1484a0.b0(view, -i11);
                    K0(1);
                }
            } else if (i11 < 0 && !view2.canScrollVertically(-1)) {
                int i14 = this.f26644F;
                if (i13 > i14 && !this.f26646H) {
                    int i15 = top - i14;
                    iArr[1] = i15;
                    AbstractC1484a0.b0(view, -i15);
                    K0(4);
                } else {
                    if (!this.f26648J) {
                        return;
                    }
                    iArr[1] = i11;
                    AbstractC1484a0.b0(view, -i11);
                    K0(1);
                }
            }
            d0(view.getTop());
            this.f26653O = i11;
            this.f26654P = true;
        }
    }

    public boolean r0() {
        return true;
    }

    public void s0(f fVar) {
        this.f26660V.remove(fVar);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void t(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void x(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        g gVar = (g) parcelable;
        super.x(coordinatorLayout, view, gVar.a());
        v0(gVar);
        int i10 = gVar.f26704c;
        if (i10 == 1 || i10 == 2) {
            this.f26649K = 4;
            this.f26650L = 4;
        } else {
            this.f26649K = i10;
            this.f26650L = i10;
        }
    }

    public void x0(boolean z10) {
        this.f26648J = z10;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public Parcelable y(CoordinatorLayout coordinatorLayout, View view) {
        return new g(super.y(coordinatorLayout, view), this);
    }

    public void y0(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.f26640B = i10;
    }

    public void z0(boolean z10) {
        if (this.f26667b == z10) {
            return;
        }
        this.f26667b = z10;
        if (this.f26658T != null) {
            X();
        }
        K0((this.f26667b && this.f26649K == 6) ? 3 : this.f26649K);
        S0();
    }

    private class h {

        /* renamed from: a, reason: collision with root package name */
        private int f26709a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f26710b;

        /* renamed from: c, reason: collision with root package name */
        private final Runnable f26711c;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                h.this.f26710b = false;
                G0.c cVar = BottomSheetBehavior.this.f26651M;
                if (cVar != null && cVar.m(true)) {
                    h hVar = h.this;
                    hVar.c(hVar.f26709a);
                    return;
                }
                h hVar2 = h.this;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.f26649K == 2) {
                    bottomSheetBehavior.K0(hVar2.f26709a);
                }
            }
        }

        private h() {
            this.f26711c = new a();
        }

        void c(int i10) {
            WeakReference weakReference = BottomSheetBehavior.this.f26658T;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f26709a = i10;
            if (this.f26710b) {
                return;
            }
            AbstractC1484a0.i0((View) BottomSheetBehavior.this.f26658T.get(), this.f26711c);
            this.f26710b = true;
        }

        /* synthetic */ h(BottomSheetBehavior bottomSheetBehavior, a aVar) {
            this();
        }
    }

    protected static class g extends F0.a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        final int f26704c;

        /* renamed from: d, reason: collision with root package name */
        int f26705d;

        /* renamed from: e, reason: collision with root package name */
        boolean f26706e;

        /* renamed from: f, reason: collision with root package name */
        boolean f26707f;

        /* renamed from: g, reason: collision with root package name */
        boolean f26708g;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, (ClassLoader) null);
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
            this.f26704c = parcel.readInt();
            this.f26705d = parcel.readInt();
            this.f26706e = parcel.readInt() == 1;
            this.f26707f = parcel.readInt() == 1;
            this.f26708g = parcel.readInt() == 1;
        }

        @Override // F0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f26704c);
            parcel.writeInt(this.f26705d);
            parcel.writeInt(this.f26706e ? 1 : 0);
            parcel.writeInt(this.f26707f ? 1 : 0);
            parcel.writeInt(this.f26708g ? 1 : 0);
        }

        public g(Parcelable parcelable, BottomSheetBehavior bottomSheetBehavior) {
            super(parcelable);
            this.f26704c = bottomSheetBehavior.f26649K;
            this.f26705d = bottomSheetBehavior.f26672e;
            this.f26706e = bottomSheetBehavior.f26667b;
            this.f26707f = bottomSheetBehavior.f26646H;
            this.f26708g = bottomSheetBehavior.f26647I;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i10;
        this.f26665a = 0;
        this.f26667b = true;
        this.f26669c = false;
        this.f26678k = -1;
        this.f26679l = -1;
        this.f26693z = new h(this, null);
        this.f26643E = 0.5f;
        this.f26645G = -1.0f;
        this.f26648J = true;
        this.f26649K = 4;
        this.f26650L = 4;
        this.f26660V = new ArrayList();
        this.f26668b0 = -1;
        this.f26670c0 = new d();
        this.f26675h = context.getResources().getDimensionPixelSize(H7.d.f3187X);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f3594b0);
        if (obtainStyledAttributes.hasValue(l.f3630f0)) {
            this.f26677j = V7.c.a(context, obtainStyledAttributes, l.f3630f0);
        }
        if (obtainStyledAttributes.hasValue(l.f3783w0)) {
            this.f26691x = Y7.k.e(context, attributeSet, H7.b.f3133f, f26638d0).m();
        }
        b0(context);
        c0();
        this.f26645G = obtainStyledAttributes.getDimension(l.f3621e0, -1.0f);
        if (obtainStyledAttributes.hasValue(l.f3603c0)) {
            E0(obtainStyledAttributes.getDimensionPixelSize(l.f3603c0, -1));
        }
        if (obtainStyledAttributes.hasValue(l.f3612d0)) {
            D0(obtainStyledAttributes.getDimensionPixelSize(l.f3612d0, -1));
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(l.f3684l0);
        if (peekValue != null && (i10 = peekValue.data) == -1) {
            F0(i10);
        } else {
            F0(obtainStyledAttributes.getDimensionPixelSize(l.f3684l0, -1));
        }
        C0(obtainStyledAttributes.getBoolean(l.f3675k0, false));
        A0(obtainStyledAttributes.getBoolean(l.f3711o0, false));
        z0(obtainStyledAttributes.getBoolean(l.f3657i0, true));
        I0(obtainStyledAttributes.getBoolean(l.f3702n0, false));
        x0(obtainStyledAttributes.getBoolean(l.f3639g0, true));
        H0(obtainStyledAttributes.getInt(l.f3693m0, 0));
        B0(obtainStyledAttributes.getFloat(l.f3666j0, 0.5f));
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(l.f3648h0);
        if (peekValue2 != null && peekValue2.type == 16) {
            y0(peekValue2.data);
        } else {
            y0(obtainStyledAttributes.getDimensionPixelOffset(l.f3648h0, 0));
        }
        this.f26682o = obtainStyledAttributes.getBoolean(l.f3747s0, false);
        this.f26683p = obtainStyledAttributes.getBoolean(l.f3756t0, false);
        this.f26684q = obtainStyledAttributes.getBoolean(l.f3765u0, false);
        this.f26685r = obtainStyledAttributes.getBoolean(l.f3774v0, true);
        this.f26686s = obtainStyledAttributes.getBoolean(l.f3720p0, false);
        this.f26687t = obtainStyledAttributes.getBoolean(l.f3729q0, false);
        this.f26688u = obtainStyledAttributes.getBoolean(l.f3738r0, false);
        obtainStyledAttributes.recycle();
        this.f26671d = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
