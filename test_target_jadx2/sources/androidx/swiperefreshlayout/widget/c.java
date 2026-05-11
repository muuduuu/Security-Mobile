package androidx.swiperefreshlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.ListView;
import androidx.core.view.AbstractC1484a0;
import androidx.core.view.D;
import androidx.core.view.E;
import androidx.core.view.F;
import androidx.core.view.G;
import androidx.core.view.H;

/* loaded from: classes.dex */
public abstract class c extends ViewGroup implements G, F, D {

    /* renamed from: l0, reason: collision with root package name */
    private static final String f17872l0 = "c";

    /* renamed from: m0, reason: collision with root package name */
    private static final int[] f17873m0 = {R.attr.enabled};

    /* renamed from: A, reason: collision with root package name */
    int f17874A;

    /* renamed from: B, reason: collision with root package name */
    int f17875B;

    /* renamed from: C, reason: collision with root package name */
    androidx.swiperefreshlayout.widget.b f17876C;

    /* renamed from: D, reason: collision with root package name */
    private Animation f17877D;

    /* renamed from: E, reason: collision with root package name */
    private Animation f17878E;

    /* renamed from: F, reason: collision with root package name */
    private Animation f17879F;

    /* renamed from: G, reason: collision with root package name */
    private Animation f17880G;

    /* renamed from: H, reason: collision with root package name */
    private Animation f17881H;

    /* renamed from: I, reason: collision with root package name */
    boolean f17882I;

    /* renamed from: J, reason: collision with root package name */
    private int f17883J;

    /* renamed from: K, reason: collision with root package name */
    boolean f17884K;

    /* renamed from: a, reason: collision with root package name */
    private View f17885a;

    /* renamed from: b, reason: collision with root package name */
    j f17886b;

    /* renamed from: c, reason: collision with root package name */
    boolean f17887c;

    /* renamed from: d, reason: collision with root package name */
    private int f17888d;

    /* renamed from: e, reason: collision with root package name */
    private float f17889e;

    /* renamed from: f, reason: collision with root package name */
    private float f17890f;

    /* renamed from: g, reason: collision with root package name */
    private final H f17891g;

    /* renamed from: h, reason: collision with root package name */
    private final E f17892h;

    /* renamed from: h0, reason: collision with root package name */
    private boolean f17893h0;

    /* renamed from: i, reason: collision with root package name */
    private final int[] f17894i;

    /* renamed from: i0, reason: collision with root package name */
    private Animation.AnimationListener f17895i0;

    /* renamed from: j, reason: collision with root package name */
    private final int[] f17896j;

    /* renamed from: j0, reason: collision with root package name */
    private final Animation f17897j0;

    /* renamed from: k, reason: collision with root package name */
    private final int[] f17898k;

    /* renamed from: k0, reason: collision with root package name */
    private final Animation f17899k0;

    /* renamed from: l, reason: collision with root package name */
    private boolean f17900l;

    /* renamed from: m, reason: collision with root package name */
    private int f17901m;

    /* renamed from: n, reason: collision with root package name */
    int f17902n;

    /* renamed from: o, reason: collision with root package name */
    private float f17903o;

    /* renamed from: p, reason: collision with root package name */
    private float f17904p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f17905q;

    /* renamed from: r, reason: collision with root package name */
    private int f17906r;

    /* renamed from: s, reason: collision with root package name */
    boolean f17907s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f17908t;

    /* renamed from: u, reason: collision with root package name */
    private final DecelerateInterpolator f17909u;

    /* renamed from: v, reason: collision with root package name */
    androidx.swiperefreshlayout.widget.a f17910v;

    /* renamed from: w, reason: collision with root package name */
    private int f17911w;

    /* renamed from: x, reason: collision with root package name */
    protected int f17912x;

    /* renamed from: y, reason: collision with root package name */
    float f17913y;

    /* renamed from: z, reason: collision with root package name */
    protected int f17914z;

    class a implements Animation.AnimationListener {
        a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            j jVar;
            c cVar = c.this;
            if (!cVar.f17887c) {
                cVar.r();
                return;
            }
            cVar.f17876C.setAlpha(255);
            c.this.f17876C.start();
            c cVar2 = c.this;
            if (cVar2.f17882I && (jVar = cVar2.f17886b) != null) {
                jVar.a();
            }
            c cVar3 = c.this;
            cVar3.f17902n = cVar3.f17910v.getTop();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    class b extends Animation {
        b() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            c.this.setAnimationProgress(f10);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.c$c, reason: collision with other inner class name */
    class C0308c extends Animation {
        C0308c() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            c.this.setAnimationProgress(1.0f - f10);
        }
    }

    class d extends Animation {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f17918a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f17919b;

        d(int i10, int i11) {
            this.f17918a = i10;
            this.f17919b = i11;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            c.this.f17876C.setAlpha((int) (this.f17918a + ((this.f17919b - r0) * f10)));
        }
    }

    class e implements Animation.AnimationListener {
        e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            c cVar = c.this;
            if (cVar.f17907s) {
                return;
            }
            cVar.y(null);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    class f extends Animation {
        f() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            c cVar = c.this;
            int abs = !cVar.f17884K ? cVar.f17874A - Math.abs(cVar.f17914z) : cVar.f17874A;
            c cVar2 = c.this;
            c.this.setTargetOffsetTopAndBottom((cVar2.f17912x + ((int) ((abs - r1) * f10))) - cVar2.f17910v.getTop());
            c.this.f17876C.e(1.0f - f10);
        }
    }

    class g extends Animation {
        g() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            c.this.p(f10);
        }
    }

    class h extends Animation {
        h() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            c cVar = c.this;
            float f11 = cVar.f17913y;
            cVar.setAnimationProgress(f11 + ((-f11) * f10));
            c.this.p(f10);
        }
    }

    public interface i {
    }

    public interface j {
        void a();
    }

    public c(Context context) {
        this(context, null);
    }

    private void A(Animation.AnimationListener animationListener) {
        this.f17910v.setVisibility(0);
        this.f17876C.setAlpha(255);
        b bVar = new b();
        this.f17877D = bVar;
        bVar.setDuration(this.f17901m);
        if (animationListener != null) {
            this.f17910v.b(animationListener);
        }
        this.f17910v.clearAnimation();
        this.f17910v.startAnimation(this.f17877D);
    }

    private void a(int i10, Animation.AnimationListener animationListener) {
        this.f17912x = i10;
        this.f17897j0.reset();
        this.f17897j0.setDuration(200L);
        this.f17897j0.setInterpolator(this.f17909u);
        if (animationListener != null) {
            this.f17910v.b(animationListener);
        }
        this.f17910v.clearAnimation();
        this.f17910v.startAnimation(this.f17897j0);
    }

    private void b(int i10, Animation.AnimationListener animationListener) {
        if (this.f17907s) {
            z(i10, animationListener);
            return;
        }
        this.f17912x = i10;
        this.f17899k0.reset();
        this.f17899k0.setDuration(200L);
        this.f17899k0.setInterpolator(this.f17909u);
        if (animationListener != null) {
            this.f17910v.b(animationListener);
        }
        this.f17910v.clearAnimation();
        this.f17910v.startAnimation(this.f17899k0);
    }

    private void d() {
        this.f17910v = new androidx.swiperefreshlayout.widget.a(getContext());
        androidx.swiperefreshlayout.widget.b bVar = new androidx.swiperefreshlayout.widget.b(getContext());
        this.f17876C = bVar;
        bVar.l(1);
        this.f17910v.setImageDrawable(this.f17876C);
        this.f17910v.setVisibility(8);
        addView(this.f17910v);
    }

    private void f() {
        if (this.f17885a == null) {
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (!childAt.equals(this.f17910v)) {
                    this.f17885a = childAt;
                    return;
                }
            }
        }
    }

    private void g(float f10) {
        if (f10 > this.f17889e) {
            t(true, true);
            return;
        }
        this.f17887c = false;
        this.f17876C.j(0.0f, 0.0f);
        b(this.f17902n, !this.f17907s ? new e() : null);
        this.f17876C.d(false);
    }

    private boolean h(Animation animation) {
        return (animation == null || !animation.hasStarted() || animation.hasEnded()) ? false : true;
    }

    private void i(float f10) {
        this.f17876C.d(true);
        float min = Math.min(1.0f, Math.abs(f10 / this.f17889e));
        float max = (((float) Math.max(min - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f10) - this.f17889e;
        int i10 = this.f17875B;
        if (i10 <= 0) {
            i10 = this.f17884K ? this.f17874A - this.f17914z : this.f17874A;
        }
        float f11 = i10;
        double max2 = Math.max(0.0f, Math.min(abs, f11 * 2.0f) / f11) / 4.0f;
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * 2.0f;
        int i11 = this.f17914z + ((int) ((f11 * min) + (f11 * pow * 2.0f)));
        if (this.f17910v.getVisibility() != 0) {
            this.f17910v.setVisibility(0);
        }
        if (!this.f17907s) {
            this.f17910v.setScaleX(1.0f);
            this.f17910v.setScaleY(1.0f);
        }
        if (this.f17907s) {
            setAnimationProgress(Math.min(1.0f, f10 / this.f17889e));
        }
        if (f10 < this.f17889e) {
            if (this.f17876C.getAlpha() > 76 && !h(this.f17879F)) {
                x();
            }
        } else if (this.f17876C.getAlpha() < 255 && !h(this.f17880G)) {
            w();
        }
        this.f17876C.j(0.0f, Math.min(0.8f, max * 0.8f));
        this.f17876C.e(Math.min(1.0f, max));
        this.f17876C.g((((max * 0.4f) - 0.25f) + (pow * 2.0f)) * 0.5f);
        setTargetOffsetTopAndBottom(i11 - this.f17902n);
    }

    private void q(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f17906r) {
            this.f17906r = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    private void setColorViewAlpha(int i10) {
        this.f17910v.getBackground().setAlpha(i10);
        this.f17876C.setAlpha(i10);
    }

    private void t(boolean z10, boolean z11) {
        if (this.f17887c != z10) {
            this.f17882I = z11;
            f();
            this.f17887c = z10;
            if (z10) {
                a(this.f17902n, this.f17895i0);
            } else {
                y(this.f17895i0);
            }
        }
    }

    private Animation u(int i10, int i11) {
        d dVar = new d(i10, i11);
        dVar.setDuration(300L);
        this.f17910v.b(null);
        this.f17910v.clearAnimation();
        this.f17910v.startAnimation(dVar);
        return dVar;
    }

    private void v(float f10) {
        float f11 = this.f17904p;
        float f12 = f10 - f11;
        int i10 = this.f17888d;
        if (f12 <= i10 || this.f17905q) {
            return;
        }
        this.f17903o = f11 + i10;
        this.f17905q = true;
        this.f17876C.setAlpha(76);
    }

    private void w() {
        this.f17880G = u(this.f17876C.getAlpha(), 255);
    }

    private void x() {
        this.f17879F = u(this.f17876C.getAlpha(), 76);
    }

    private void z(int i10, Animation.AnimationListener animationListener) {
        this.f17912x = i10;
        this.f17913y = this.f17910v.getScaleX();
        h hVar = new h();
        this.f17881H = hVar;
        hVar.setDuration(150L);
        if (animationListener != null) {
            this.f17910v.b(animationListener);
        }
        this.f17910v.clearAnimation();
        this.f17910v.startAnimation(this.f17881H);
    }

    public boolean c() {
        View view = this.f17885a;
        return view instanceof ListView ? androidx.core.widget.i.a((ListView) view, -1) : view.canScrollVertically(-1);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return this.f17892h.a(f10, f11, z10);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return this.f17892h.b(f10, f11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return this.f17892h.c(i10, i11, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.f17892h.f(i10, i11, i12, i13, iArr);
    }

    public void e(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        if (i14 == 0) {
            this.f17892h.e(i10, i11, i12, i13, iArr, i14, iArr2);
        }
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i10, int i11) {
        int i12 = this.f17911w;
        return i12 < 0 ? i11 : i11 == i10 + (-1) ? i12 : i11 >= i12 ? i11 + 1 : i11;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f17891g.a();
    }

    public int getProgressCircleDiameter() {
        return this.f17883J;
    }

    public int getProgressViewEndOffset() {
        return this.f17874A;
    }

    public int getProgressViewStartOffset() {
        return this.f17914z;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.f17892h.j();
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f17892h.l();
    }

    @Override // androidx.core.view.G
    public void j(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (i14 != 0) {
            return;
        }
        int i15 = iArr[1];
        e(i10, i11, i12, i13, this.f17896j, i14, iArr);
        int i16 = i13 - (iArr[1] - i15);
        if ((i16 == 0 ? i13 + this.f17896j[1] : i16) >= 0 || c()) {
            return;
        }
        float abs = this.f17890f + Math.abs(r1);
        this.f17890f = abs;
        i(abs);
        iArr[1] = iArr[1] + i16;
    }

    @Override // androidx.core.view.F
    public void k(View view, int i10, int i11, int i12, int i13, int i14) {
        j(view, i10, i11, i12, i13, i14, this.f17898k);
    }

    @Override // androidx.core.view.F
    public boolean l(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            return onStartNestedScroll(view, view2, i10);
        }
        return false;
    }

    @Override // androidx.core.view.F
    public void m(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    @Override // androidx.core.view.F
    public void n(View view, int i10) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // androidx.core.view.F
    public void o(View view, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 0) {
            onNestedPreScroll(view, i10, i11, iArr);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        r();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        f();
        int actionMasked = motionEvent.getActionMasked();
        if (this.f17908t && actionMasked == 0) {
            this.f17908t = false;
        }
        if (!isEnabled() || this.f17908t || c() || this.f17887c || this.f17900l) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i10 = this.f17906r;
                    if (i10 == -1) {
                        Log.e(f17872l0, "Got ACTION_MOVE event but don't have an active pointer id.");
                        return false;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(i10);
                    if (findPointerIndex < 0) {
                        return false;
                    }
                    v(motionEvent.getY(findPointerIndex));
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        q(motionEvent);
                    }
                }
            }
            this.f17905q = false;
            this.f17906r = -1;
        } else {
            setTargetOffsetTopAndBottom(this.f17914z - this.f17910v.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.f17906r = pointerId;
            this.f17905q = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.f17904p = motionEvent.getY(findPointerIndex2);
        }
        return this.f17905q;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f17885a == null) {
            f();
        }
        View view = this.f17885a;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.f17910v.getMeasuredWidth();
        int measuredHeight2 = this.f17910v.getMeasuredHeight();
        int i14 = measuredWidth / 2;
        int i15 = measuredWidth2 / 2;
        int i16 = this.f17902n;
        this.f17910v.layout(i14 - i15, i16, i14 + i15, measuredHeight2 + i16);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f17885a == null) {
            f();
        }
        View view = this.f17885a;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.f17910v.measure(View.MeasureSpec.makeMeasureSpec(this.f17883J, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f17883J, 1073741824));
        this.f17911w = -1;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            if (getChildAt(i12) == this.f17910v) {
                this.f17911w = i12;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        return dispatchNestedFling(f10, f11, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        return dispatchNestedPreFling(f10, f11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        if (i11 > 0) {
            float f10 = this.f17890f;
            if (f10 > 0.0f) {
                float f11 = i11;
                if (f11 > f10) {
                    iArr[1] = (int) f10;
                    this.f17890f = 0.0f;
                } else {
                    this.f17890f = f10 - f11;
                    iArr[1] = i11;
                }
                i(this.f17890f);
            }
        }
        if (this.f17884K && i11 > 0 && this.f17890f == 0.0f && Math.abs(i11 - iArr[1]) > 0) {
            this.f17910v.setVisibility(8);
        }
        int[] iArr2 = this.f17894i;
        if (dispatchNestedPreScroll(i10 - iArr[0], i11 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        j(view, i10, i11, i12, i13, 0, this.f17898k);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        this.f17891g.b(view, view2, i10);
        startNestedScroll(i10 & 2);
        this.f17890f = 0.0f;
        this.f17900l = true;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        k kVar = (k) parcelable;
        super.onRestoreInstanceState(kVar.getSuperState());
        setRefreshing(kVar.f17925a);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        return new k(super.onSaveInstanceState(), this.f17887c);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return (!isEnabled() || this.f17908t || this.f17887c || (i10 & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        this.f17891g.d(view);
        this.f17900l = false;
        float f10 = this.f17890f;
        if (f10 > 0.0f) {
            g(f10);
            this.f17890f = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.f17908t && actionMasked == 0) {
            this.f17908t = false;
        }
        if (!isEnabled() || this.f17908t || c() || this.f17887c || this.f17900l) {
            return false;
        }
        if (actionMasked == 0) {
            this.f17906r = motionEvent.getPointerId(0);
            this.f17905q = false;
        } else {
            if (actionMasked == 1) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f17906r);
                if (findPointerIndex < 0) {
                    Log.e(f17872l0, "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.f17905q) {
                    float y10 = (motionEvent.getY(findPointerIndex) - this.f17903o) * 0.5f;
                    this.f17905q = false;
                    g(y10);
                }
                this.f17906r = -1;
                return false;
            }
            if (actionMasked == 2) {
                int findPointerIndex2 = motionEvent.findPointerIndex(this.f17906r);
                if (findPointerIndex2 < 0) {
                    Log.e(f17872l0, "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                float y11 = motionEvent.getY(findPointerIndex2);
                v(y11);
                if (this.f17905q) {
                    float f10 = (y11 - this.f17903o) * 0.5f;
                    if (f10 <= 0.0f) {
                        return false;
                    }
                    getParent().requestDisallowInterceptTouchEvent(true);
                    i(f10);
                }
            } else {
                if (actionMasked == 3) {
                    return false;
                }
                if (actionMasked == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (actionIndex < 0) {
                        Log.e(f17872l0, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                        return false;
                    }
                    this.f17906r = motionEvent.getPointerId(actionIndex);
                } else if (actionMasked == 6) {
                    q(motionEvent);
                }
            }
        }
        return true;
    }

    void p(float f10) {
        setTargetOffsetTopAndBottom((this.f17912x + ((int) ((this.f17914z - r0) * f10))) - this.f17910v.getTop());
    }

    void r() {
        this.f17910v.clearAnimation();
        this.f17876C.stop();
        this.f17910v.setVisibility(8);
        setColorViewAlpha(255);
        if (this.f17907s) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.f17914z - this.f17902n);
        }
        this.f17902n = this.f17910v.getTop();
    }

    public void s(boolean z10, int i10, int i11) {
        this.f17907s = z10;
        this.f17914z = i10;
        this.f17874A = i11;
        this.f17884K = true;
        r();
        this.f17887c = false;
    }

    void setAnimationProgress(float f10) {
        this.f17910v.setScaleX(f10);
        this.f17910v.setScaleY(f10);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        f();
        this.f17876C.f(iArr);
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            iArr2[i10] = androidx.core.content.a.c(context, iArr[i10]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i10) {
        this.f17889e = i10;
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        if (z10) {
            return;
        }
        r();
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z10) {
        this.f17893h0 = z10;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        this.f17892h.m(z10);
    }

    public void setOnChildScrollUpCallback(i iVar) {
    }

    public void setOnRefreshListener(j jVar) {
        this.f17886b = jVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i10) {
        setProgressBackgroundColorSchemeResource(i10);
    }

    public void setProgressBackgroundColorSchemeColor(int i10) {
        this.f17910v.setBackgroundColor(i10);
    }

    public void setProgressBackgroundColorSchemeResource(int i10) {
        setProgressBackgroundColorSchemeColor(androidx.core.content.a.c(getContext(), i10));
    }

    public void setRefreshing(boolean z10) {
        if (!z10 || this.f17887c == z10) {
            t(z10, false);
            return;
        }
        this.f17887c = z10;
        setTargetOffsetTopAndBottom((!this.f17884K ? this.f17874A + this.f17914z : this.f17874A) - this.f17902n);
        this.f17882I = false;
        A(this.f17895i0);
    }

    public void setSize(int i10) {
        if (i10 == 0 || i10 == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i10 == 0) {
                this.f17883J = (int) (displayMetrics.density * 56.0f);
            } else {
                this.f17883J = (int) (displayMetrics.density * 40.0f);
            }
            this.f17910v.setImageDrawable(null);
            this.f17876C.l(i10);
            this.f17910v.setImageDrawable(this.f17876C);
        }
    }

    public void setSlingshotDistance(int i10) {
        this.f17875B = i10;
    }

    void setTargetOffsetTopAndBottom(int i10) {
        this.f17910v.bringToFront();
        AbstractC1484a0.b0(this.f17910v, i10);
        this.f17902n = this.f17910v.getTop();
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i10) {
        return this.f17892h.o(i10);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        this.f17892h.q();
    }

    void y(Animation.AnimationListener animationListener) {
        C0308c c0308c = new C0308c();
        this.f17878E = c0308c;
        c0308c.setDuration(150L);
        this.f17910v.b(animationListener);
        this.f17910v.clearAnimation();
        this.f17910v.startAnimation(this.f17878E);
    }

    static class k extends View.BaseSavedState {
        public static final Parcelable.Creator<k> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        final boolean f17925a;

        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public k createFromParcel(Parcel parcel) {
                return new k(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public k[] newArray(int i10) {
                return new k[i10];
            }
        }

        k(Parcelable parcelable, boolean z10) {
            super(parcelable);
            this.f17925a = z10;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f17925a ? (byte) 1 : (byte) 0);
        }

        k(Parcel parcel) {
            super(parcel);
            this.f17925a = parcel.readByte() != 0;
        }
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17887c = false;
        this.f17889e = -1.0f;
        this.f17894i = new int[2];
        this.f17896j = new int[2];
        this.f17898k = new int[2];
        this.f17906r = -1;
        this.f17911w = -1;
        this.f17895i0 = new a();
        this.f17897j0 = new f();
        this.f17899k0 = new g();
        this.f17888d = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f17901m = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.f17909u = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f17883J = (int) (displayMetrics.density * 40.0f);
        d();
        setChildrenDrawingOrderEnabled(true);
        int i10 = (int) (displayMetrics.density * 64.0f);
        this.f17874A = i10;
        this.f17889e = i10;
        this.f17891g = new H(this);
        this.f17892h = new E(this);
        setNestedScrollingEnabled(true);
        int i11 = -this.f17883J;
        this.f17902n = i11;
        this.f17914z = i11;
        p(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f17873m0);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }
}
