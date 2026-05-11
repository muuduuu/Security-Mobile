package androidx.appcompat.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.j;
import androidx.core.view.AbstractC1484a0;
import androidx.core.view.K0;
import g.AbstractC3170a;
import g.AbstractC3175f;
import org.conscrypt.PSKKeyManager;

/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements I, androidx.core.view.F, androidx.core.view.G {

    /* renamed from: G, reason: collision with root package name */
    static final int[] f13638G = {AbstractC3170a.f33067b, R.attr.windowContentOverlay};

    /* renamed from: H, reason: collision with root package name */
    private static final K0 f13639H = new K0.b().d(androidx.core.graphics.e.b(0, 1, 0, 1)).a();

    /* renamed from: I, reason: collision with root package name */
    private static final Rect f13640I = new Rect();

    /* renamed from: A, reason: collision with root package name */
    ViewPropertyAnimator f13641A;

    /* renamed from: B, reason: collision with root package name */
    final AnimatorListenerAdapter f13642B;

    /* renamed from: C, reason: collision with root package name */
    private final Runnable f13643C;

    /* renamed from: D, reason: collision with root package name */
    private final Runnable f13644D;

    /* renamed from: E, reason: collision with root package name */
    private final androidx.core.view.H f13645E;

    /* renamed from: F, reason: collision with root package name */
    private final f f13646F;

    /* renamed from: a, reason: collision with root package name */
    private int f13647a;

    /* renamed from: b, reason: collision with root package name */
    private int f13648b;

    /* renamed from: c, reason: collision with root package name */
    private ContentFrameLayout f13649c;

    /* renamed from: d, reason: collision with root package name */
    ActionBarContainer f13650d;

    /* renamed from: e, reason: collision with root package name */
    private J f13651e;

    /* renamed from: f, reason: collision with root package name */
    private Drawable f13652f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f13653g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f13654h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f13655i;

    /* renamed from: j, reason: collision with root package name */
    boolean f13656j;

    /* renamed from: k, reason: collision with root package name */
    private int f13657k;

    /* renamed from: l, reason: collision with root package name */
    private int f13658l;

    /* renamed from: m, reason: collision with root package name */
    private final Rect f13659m;

    /* renamed from: n, reason: collision with root package name */
    private final Rect f13660n;

    /* renamed from: o, reason: collision with root package name */
    private final Rect f13661o;

    /* renamed from: p, reason: collision with root package name */
    private final Rect f13662p;

    /* renamed from: q, reason: collision with root package name */
    private final Rect f13663q;

    /* renamed from: r, reason: collision with root package name */
    private final Rect f13664r;

    /* renamed from: s, reason: collision with root package name */
    private final Rect f13665s;

    /* renamed from: t, reason: collision with root package name */
    private final Rect f13666t;

    /* renamed from: u, reason: collision with root package name */
    private K0 f13667u;

    /* renamed from: v, reason: collision with root package name */
    private K0 f13668v;

    /* renamed from: w, reason: collision with root package name */
    private K0 f13669w;

    /* renamed from: x, reason: collision with root package name */
    private K0 f13670x;

    /* renamed from: y, reason: collision with root package name */
    private d f13671y;

    /* renamed from: z, reason: collision with root package name */
    private OverScroller f13672z;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f13641A = null;
            actionBarOverlayLayout.f13656j = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f13641A = null;
            actionBarOverlayLayout.f13656j = false;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.v();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f13641A = actionBarOverlayLayout.f13650d.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f13642B);
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.v();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f13641A = actionBarOverlayLayout.f13650d.animate().translationY(-ActionBarOverlayLayout.this.f13650d.getHeight()).setListener(ActionBarOverlayLayout.this.f13642B);
        }
    }

    public interface d {
        void a();

        void b();

        void c(boolean z10);

        void d();

        void e();

        void f(int i10);
    }

    public static class e extends ViewGroup.MarginLayoutParams {
        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(int i10, int i11) {
            super(i10, i11);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    private static final class f extends View {
        f(Context context) {
            super(context);
            setWillNotDraw(true);
        }

        @Override // android.view.View
        public int getWindowSystemUiVisibility() {
            return 0;
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13648b = 0;
        this.f13659m = new Rect();
        this.f13660n = new Rect();
        this.f13661o = new Rect();
        this.f13662p = new Rect();
        this.f13663q = new Rect();
        this.f13664r = new Rect();
        this.f13665s = new Rect();
        this.f13666t = new Rect();
        K0 k02 = K0.f16032b;
        this.f13667u = k02;
        this.f13668v = k02;
        this.f13669w = k02;
        this.f13670x = k02;
        this.f13642B = new a();
        this.f13643C = new b();
        this.f13644D = new c();
        w(context);
        this.f13645E = new androidx.core.view.H(this);
        f fVar = new f(context);
        this.f13646F = fVar;
        addView(fVar);
    }

    private void B() {
        v();
        this.f13643C.run();
    }

    private boolean C(float f10) {
        this.f13672z.fling(0, 0, 0, (int) f10, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.f13672z.getFinalY() > this.f13650d.getHeight();
    }

    private void p() {
        v();
        this.f13644D.run();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean q(View view, Rect rect, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        e eVar = (e) view.getLayoutParams();
        if (z10) {
            int i10 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
            int i11 = rect.left;
            if (i10 != i11) {
                ((ViewGroup.MarginLayoutParams) eVar).leftMargin = i11;
                z14 = true;
                if (z11) {
                    int i12 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                    int i13 = rect.top;
                    if (i12 != i13) {
                        ((ViewGroup.MarginLayoutParams) eVar).topMargin = i13;
                        z14 = true;
                    }
                }
                if (z13) {
                    int i14 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
                    int i15 = rect.right;
                    if (i14 != i15) {
                        ((ViewGroup.MarginLayoutParams) eVar).rightMargin = i15;
                        z14 = true;
                    }
                }
                if (z12) {
                    int i16 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                    int i17 = rect.bottom;
                    if (i16 != i17) {
                        ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = i17;
                        return true;
                    }
                }
                return z14;
            }
        }
        z14 = false;
        if (z11) {
        }
        if (z13) {
        }
        if (z12) {
        }
        return z14;
    }

    private boolean r() {
        AbstractC1484a0.f(this.f13646F, f13639H, this.f13662p);
        return !this.f13662p.equals(f13640I);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private J u(View view) {
        if (view instanceof J) {
            return (J) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    private void w(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f13638G);
        this.f13647a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f13652f = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f13672z = new OverScroller(context);
    }

    private void y() {
        v();
        postDelayed(this.f13644D, 600L);
    }

    private void z() {
        v();
        postDelayed(this.f13643C, 600L);
    }

    void A() {
        if (this.f13649c == null) {
            this.f13649c = (ContentFrameLayout) findViewById(AbstractC3175f.f33177b);
            this.f13650d = (ActionBarContainer) findViewById(AbstractC3175f.f33178c);
            this.f13651e = u(findViewById(AbstractC3175f.f33176a));
        }
    }

    @Override // androidx.appcompat.widget.I
    public void a(Menu menu, j.a aVar) {
        A();
        this.f13651e.a(menu, aVar);
    }

    @Override // androidx.appcompat.widget.I
    public boolean b() {
        A();
        return this.f13651e.b();
    }

    @Override // androidx.appcompat.widget.I
    public void c() {
        A();
        this.f13651e.c();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // androidx.appcompat.widget.I
    public boolean d() {
        A();
        return this.f13651e.d();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f13652f != null) {
            int bottom = this.f13650d.getVisibility() == 0 ? (int) (this.f13650d.getBottom() + this.f13650d.getTranslationY() + 0.5f) : 0;
            this.f13652f.setBounds(0, bottom, getWidth(), this.f13652f.getIntrinsicHeight() + bottom);
            this.f13652f.draw(canvas);
        }
    }

    @Override // androidx.appcompat.widget.I
    public boolean e() {
        A();
        return this.f13651e.e();
    }

    @Override // androidx.appcompat.widget.I
    public boolean f() {
        A();
        return this.f13651e.f();
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.I
    public boolean g() {
        A();
        return this.f13651e.g();
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f13650d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f13645E.a();
    }

    public CharSequence getTitle() {
        A();
        return this.f13651e.getTitle();
    }

    @Override // androidx.appcompat.widget.I
    public void h(int i10) {
        A();
        if (i10 == 2) {
            this.f13651e.u();
        } else if (i10 == 5) {
            this.f13651e.v();
        } else {
            if (i10 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // androidx.appcompat.widget.I
    public void i() {
        A();
        this.f13651e.h();
    }

    @Override // androidx.core.view.G
    public void j(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        k(view, i10, i11, i12, i13, i14);
    }

    @Override // androidx.core.view.F
    public void k(View view, int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            onNestedScroll(view, i10, i11, i12, i13);
        }
    }

    @Override // androidx.core.view.F
    public boolean l(View view, View view2, int i10, int i11) {
        return i11 == 0 && onStartNestedScroll(view, view2, i10);
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

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        A();
        K0 x10 = K0.x(windowInsets, this);
        boolean q10 = q(this.f13650d, new Rect(x10.j(), x10.l(), x10.k(), x10.i()), true, true, false, true);
        AbstractC1484a0.f(this, x10, this.f13659m);
        Rect rect = this.f13659m;
        K0 m10 = x10.m(rect.left, rect.top, rect.right, rect.bottom);
        this.f13667u = m10;
        boolean z10 = true;
        if (!this.f13668v.equals(m10)) {
            this.f13668v = this.f13667u;
            q10 = true;
        }
        if (this.f13660n.equals(this.f13659m)) {
            z10 = q10;
        } else {
            this.f13660n.set(this.f13659m);
        }
        if (z10) {
            requestLayout();
        }
        return x10.a().c().b().v();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        w(getContext());
        AbstractC1484a0.n0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        v();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i15 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i16 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i15, i16, measuredWidth + i15, measuredHeight + i16);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int measuredHeight;
        A();
        measureChildWithMargins(this.f13650d, i10, 0, i11, 0);
        e eVar = (e) this.f13650d.getLayoutParams();
        int max = Math.max(0, this.f13650d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int max2 = Math.max(0, this.f13650d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f13650d.getMeasuredState());
        boolean z10 = (AbstractC1484a0.M(this) & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0;
        if (z10) {
            measuredHeight = this.f13647a;
            if (this.f13654h && this.f13650d.getTabContainer() != null) {
                measuredHeight += this.f13647a;
            }
        } else {
            measuredHeight = this.f13650d.getVisibility() != 8 ? this.f13650d.getMeasuredHeight() : 0;
        }
        this.f13661o.set(this.f13659m);
        this.f13669w = this.f13667u;
        if (this.f13653g || z10 || !r()) {
            this.f13669w = new K0.b(this.f13669w).d(androidx.core.graphics.e.b(this.f13669w.j(), this.f13669w.l() + measuredHeight, this.f13669w.k(), this.f13669w.i())).a();
        } else {
            Rect rect = this.f13661o;
            rect.top += measuredHeight;
            rect.bottom = rect.bottom;
            this.f13669w = this.f13669w.m(0, measuredHeight, 0, 0);
        }
        q(this.f13649c, this.f13661o, true, true, true, true);
        if (!this.f13670x.equals(this.f13669w)) {
            K0 k02 = this.f13669w;
            this.f13670x = k02;
            AbstractC1484a0.g(this.f13649c, k02);
        }
        measureChildWithMargins(this.f13649c, i10, 0, i11, 0);
        e eVar2 = (e) this.f13649c.getLayoutParams();
        int max3 = Math.max(max, this.f13649c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int max4 = Math.max(max2, this.f13649c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f13649c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i10, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i11, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (!this.f13655i || !z10) {
            return false;
        }
        if (C(f11)) {
            p();
        } else {
            B();
        }
        this.f13656j = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        int i14 = this.f13657k + i11;
        this.f13657k = i14;
        setActionBarHideOffset(i14);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        this.f13645E.b(view, view2, i10);
        this.f13657k = getActionBarHideOffset();
        v();
        d dVar = this.f13671y;
        if (dVar != null) {
            dVar.e();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        if ((i10 & 2) == 0 || this.f13650d.getVisibility() != 0) {
            return false;
        }
        return this.f13655i;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        if (this.f13655i && !this.f13656j) {
            if (this.f13657k <= this.f13650d.getHeight()) {
                z();
            } else {
                y();
            }
        }
        d dVar = this.f13671y;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override // android.view.View
    public void onWindowSystemUiVisibilityChanged(int i10) {
        super.onWindowSystemUiVisibilityChanged(i10);
        A();
        int i11 = this.f13658l ^ i10;
        this.f13658l = i10;
        boolean z10 = (i10 & 4) == 0;
        boolean z11 = (i10 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0;
        d dVar = this.f13671y;
        if (dVar != null) {
            dVar.c(!z11);
            if (z10 || !z11) {
                this.f13671y.a();
            } else {
                this.f13671y.d();
            }
        }
        if ((i11 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 || this.f13671y == null) {
            return;
        }
        AbstractC1484a0.n0(this);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        this.f13648b = i10;
        d dVar = this.f13671y;
        if (dVar != null) {
            dVar.f(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    public void setActionBarHideOffset(int i10) {
        v();
        this.f13650d.setTranslationY(-Math.max(0, Math.min(i10, this.f13650d.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.f13671y = dVar;
        if (getWindowToken() != null) {
            this.f13671y.f(this.f13648b);
            int i10 = this.f13658l;
            if (i10 != 0) {
                onWindowSystemUiVisibilityChanged(i10);
                AbstractC1484a0.n0(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z10) {
        this.f13654h = z10;
    }

    public void setHideOnContentScrollEnabled(boolean z10) {
        if (z10 != this.f13655i) {
            this.f13655i = z10;
            if (z10) {
                return;
            }
            v();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i10) {
        A();
        this.f13651e.setIcon(i10);
    }

    public void setLogo(int i10) {
        A();
        this.f13651e.m(i10);
    }

    public void setOverlayMode(boolean z10) {
        this.f13653g = z10;
    }

    public void setShowingForActionMode(boolean z10) {
    }

    public void setUiOptions(int i10) {
    }

    @Override // androidx.appcompat.widget.I
    public void setWindowCallback(Window.Callback callback) {
        A();
        this.f13651e.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.I
    public void setWindowTitle(CharSequence charSequence) {
        A();
        this.f13651e.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    void v() {
        removeCallbacks(this.f13643C);
        removeCallbacks(this.f13644D);
        ViewPropertyAnimator viewPropertyAnimator = this.f13641A;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public boolean x() {
        return this.f13653g;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        A();
        this.f13651e.setIcon(drawable);
    }
}
