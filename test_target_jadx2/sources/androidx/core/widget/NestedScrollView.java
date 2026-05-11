package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.core.view.AbstractC1484a0;
import androidx.core.view.C;
import androidx.core.view.C1483a;
import androidx.core.view.C1511o;
import androidx.core.view.D;
import androidx.core.view.E;
import androidx.core.view.G;
import androidx.core.view.H;
import androidx.core.view.InterfaceC1513p;
import androidx.core.view.ScrollingView;
import java.util.ArrayList;
import s0.AbstractC4302a;
import z0.AbstractC5230C;
import z0.C5228A;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements G, D, ScrollingView {

    /* renamed from: D, reason: collision with root package name */
    private static final float f16214D = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: E, reason: collision with root package name */
    private static final a f16215E = new a();

    /* renamed from: F, reason: collision with root package name */
    private static final int[] f16216F = {R.attr.fillViewport};

    /* renamed from: A, reason: collision with root package name */
    private d f16217A;

    /* renamed from: B, reason: collision with root package name */
    final c f16218B;

    /* renamed from: C, reason: collision with root package name */
    C1511o f16219C;

    /* renamed from: a, reason: collision with root package name */
    private final float f16220a;

    /* renamed from: b, reason: collision with root package name */
    private long f16221b;

    /* renamed from: c, reason: collision with root package name */
    private final Rect f16222c;

    /* renamed from: d, reason: collision with root package name */
    private OverScroller f16223d;

    /* renamed from: e, reason: collision with root package name */
    public EdgeEffect f16224e;

    /* renamed from: f, reason: collision with root package name */
    public EdgeEffect f16225f;

    /* renamed from: g, reason: collision with root package name */
    private int f16226g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f16227h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f16228i;

    /* renamed from: j, reason: collision with root package name */
    private View f16229j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f16230k;

    /* renamed from: l, reason: collision with root package name */
    private VelocityTracker f16231l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f16232m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f16233n;

    /* renamed from: o, reason: collision with root package name */
    private int f16234o;

    /* renamed from: p, reason: collision with root package name */
    private int f16235p;

    /* renamed from: q, reason: collision with root package name */
    private int f16236q;

    /* renamed from: r, reason: collision with root package name */
    private int f16237r;

    /* renamed from: s, reason: collision with root package name */
    private final int[] f16238s;

    /* renamed from: t, reason: collision with root package name */
    private final int[] f16239t;

    /* renamed from: u, reason: collision with root package name */
    private int f16240u;

    /* renamed from: v, reason: collision with root package name */
    private int f16241v;

    /* renamed from: w, reason: collision with root package name */
    private e f16242w;

    /* renamed from: x, reason: collision with root package name */
    private final H f16243x;

    /* renamed from: y, reason: collision with root package name */
    private final E f16244y;

    /* renamed from: z, reason: collision with root package name */
    private float f16245z;

    static class a extends C1483a {
        a() {
        }

        @Override // androidx.core.view.C1483a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            AbstractC5230C.a(accessibilityEvent, nestedScrollView.getScrollX());
            AbstractC5230C.b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // androidx.core.view.C1483a
        public void g(View view, C5228A c5228a) {
            int scrollRange;
            super.g(view, c5228a);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            c5228a.q0(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            c5228a.M0(true);
            if (nestedScrollView.getScrollY() > 0) {
                c5228a.b(C5228A.a.f45636r);
                c5228a.b(C5228A.a.f45603C);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                c5228a.b(C5228A.a.f45635q);
                c5228a.b(C5228A.a.f45605E);
            }
        }

        @Override // androidx.core.view.C1483a
        public boolean j(View view, int i10, Bundle bundle) {
            if (super.j(view, i10, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i10 != 4096) {
                if (i10 == 8192 || i10 == 16908344) {
                    int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.W(0, max, true);
                    return true;
                }
                if (i10 != 16908346) {
                    return false;
                }
            }
            int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.W(0, min, true);
            return true;
        }
    }

    static class b {
        static boolean a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    class c implements InterfaceC1513p {
        c() {
        }

        @Override // androidx.core.view.InterfaceC1513p
        public boolean a(float f10) {
            if (f10 == 0.0f) {
                return false;
            }
            c();
            NestedScrollView.this.v((int) f10);
            return true;
        }

        @Override // androidx.core.view.InterfaceC1513p
        public float b() {
            return -NestedScrollView.this.getVerticalScrollFactorCompat();
        }

        @Override // androidx.core.view.InterfaceC1513p
        public void c() {
            NestedScrollView.this.f16223d.abortAnimation();
        }
    }

    public interface d {
        void a(NestedScrollView nestedScrollView, int i10, int i11, int i12, int i13);
    }

    static class e extends View.BaseSavedState {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public int f16247a;

        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public e[] newArray(int i10) {
                return new e[i10];
            }
        }

        e(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f16247a + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f16247a);
        }

        e(Parcel parcel) {
            super(parcel);
            this.f16247a = parcel.readInt();
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC4302a.f40684c);
    }

    private void A() {
        VelocityTracker velocityTracker = this.f16231l;
        if (velocityTracker == null) {
            this.f16231l = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    private void B() {
        this.f16223d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f16234o = viewConfiguration.getScaledTouchSlop();
        this.f16235p = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f16236q = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    private void C() {
        if (this.f16231l == null) {
            this.f16231l = VelocityTracker.obtain();
        }
    }

    private void D(int i10, int i11) {
        this.f16226g = i10;
        this.f16237r = i11;
        X(2, 0);
    }

    private boolean E(View view) {
        return !G(view, 0, getHeight());
    }

    private static boolean F(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && F((View) parent, view2);
    }

    private boolean G(View view, int i10, int i11) {
        view.getDrawingRect(this.f16222c);
        offsetDescendantRectToMyCoords(view, this.f16222c);
        return this.f16222c.bottom + i10 >= getScrollY() && this.f16222c.top - i10 <= getScrollY() + i11;
    }

    private void H(int i10, int i11, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i10);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f16244y.e(0, scrollY2, 0, i10 - scrollY2, null, i11, iArr);
    }

    private void I(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f16237r) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f16226g = (int) motionEvent.getY(i10);
            this.f16237r = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.f16231l;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void L() {
        VelocityTracker velocityTracker = this.f16231l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f16231l = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int M(int i10, float f10) {
        float d10;
        int round;
        float width = f10 / getWidth();
        float height = i10 / getHeight();
        float f11 = 0.0f;
        if (f.b(this.f16224e) == 0.0f) {
            if (f.b(this.f16225f) != 0.0f) {
                d10 = f.d(this.f16225f, height, 1.0f - width);
                if (f.b(this.f16225f) == 0.0f) {
                    this.f16225f.onRelease();
                }
            }
            round = Math.round(f11 * getHeight());
            if (round != 0) {
                invalidate();
            }
            return round;
        }
        d10 = -f.d(this.f16224e, -height, width);
        if (f.b(this.f16224e) == 0.0f) {
            this.f16224e.onRelease();
        }
        f11 = d10;
        round = Math.round(f11 * getHeight());
        if (round != 0) {
        }
        return round;
    }

    private void N(boolean z10) {
        if (z10) {
            X(2, 1);
        } else {
            Z(1);
        }
        this.f16241v = getScrollY();
        postInvalidateOnAnimation();
    }

    private boolean O(int i10, int i11, int i12) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i13 = height + scrollY;
        boolean z10 = false;
        boolean z11 = i10 == 33;
        View u10 = u(z11, i11, i12);
        if (u10 == null) {
            u10 = this;
        }
        if (i11 < scrollY || i12 > i13) {
            P(z11 ? i11 - scrollY : i12 - i13, 0, 1, true);
            z10 = true;
        }
        if (u10 != findFocus()) {
            u10.requestFocus(i10);
        }
        return z10;
    }

    private int P(int i10, int i11, int i12, boolean z10) {
        int i13;
        int i14;
        VelocityTracker velocityTracker;
        if (i12 == 1) {
            X(2, i12);
        }
        boolean z11 = false;
        if (i(0, i10, this.f16239t, this.f16238s, i12)) {
            i13 = i10 - this.f16239t[1];
            i14 = this.f16238s[1];
        } else {
            i13 = i10;
            i14 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        boolean z12 = d() && !z10;
        boolean z13 = J(0, i13, 0, scrollY, 0, scrollRange, 0, 0, true) && !y(i12);
        int scrollY2 = getScrollY() - scrollY;
        int[] iArr = this.f16239t;
        iArr[1] = 0;
        p(0, scrollY2, 0, i13 - scrollY2, this.f16238s, i12, iArr);
        int i15 = i14 + this.f16238s[1];
        int i16 = i13 - this.f16239t[1];
        int i17 = scrollY + i16;
        if (i17 < 0) {
            if (z12) {
                f.d(this.f16224e, (-i16) / getHeight(), i11 / getWidth());
                if (!this.f16225f.isFinished()) {
                    this.f16225f.onRelease();
                }
            }
        } else if (i17 > scrollRange && z12) {
            f.d(this.f16225f, i16 / getHeight(), 1.0f - (i11 / getWidth()));
            if (!this.f16224e.isFinished()) {
                this.f16224e.onRelease();
            }
        }
        if (this.f16224e.isFinished() && this.f16225f.isFinished()) {
            z11 = z13;
        } else {
            postInvalidateOnAnimation();
        }
        if (z11 && i12 == 0 && (velocityTracker = this.f16231l) != null) {
            velocityTracker.clear();
        }
        if (i12 == 1) {
            Z(i12);
            this.f16224e.onRelease();
            this.f16225f.onRelease();
        }
        return i15;
    }

    private void Q(View view) {
        view.getDrawingRect(this.f16222c);
        offsetDescendantRectToMyCoords(view, this.f16222c);
        int g10 = g(this.f16222c);
        if (g10 != 0) {
            scrollBy(0, g10);
        }
    }

    private boolean R(Rect rect, boolean z10) {
        int g10 = g(rect);
        boolean z11 = g10 != 0;
        if (z11) {
            if (z10) {
                scrollBy(0, g10);
            } else {
                T(0, g10);
            }
        }
        return z11;
    }

    private boolean S(EdgeEffect edgeEffect, int i10) {
        if (i10 > 0) {
            return true;
        }
        return x(-i10) < f.b(edgeEffect) * ((float) getHeight());
    }

    private void U(int i10, int i11, int i12, boolean z10) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f16221b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f16223d.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i11 + scrollY, Math.max(0, height - height2))) - scrollY, i12);
            N(z10);
        } else {
            if (!this.f16223d.isFinished()) {
                a();
            }
            scrollBy(i10, i11);
        }
        this.f16221b = AnimationUtils.currentAnimationTimeMillis();
    }

    private boolean Y(MotionEvent motionEvent) {
        boolean z10;
        if (f.b(this.f16224e) != 0.0f) {
            f.d(this.f16224e, 0.0f, motionEvent.getX() / getWidth());
            z10 = true;
        } else {
            z10 = false;
        }
        if (f.b(this.f16225f) == 0.0f) {
            return z10;
        }
        f.d(this.f16225f, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    private void a() {
        this.f16223d.abortAnimation();
        Z(1);
    }

    private boolean d() {
        int overScrollMode = getOverScrollMode();
        if (overScrollMode != 0) {
            return overScrollMode == 1 && getScrollRange() > 0;
        }
        return true;
    }

    private boolean e() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    private static int f(int i10, int i11, int i12) {
        if (i11 >= i12 || i10 < 0) {
            return 0;
        }
        return i11 + i10 > i12 ? i12 - i11 : i10;
    }

    private void q(int i10) {
        if (i10 != 0) {
            if (this.f16233n) {
                T(0, i10);
            } else {
                scrollBy(0, i10);
            }
        }
    }

    private boolean r(int i10) {
        if (f.b(this.f16224e) != 0.0f) {
            if (S(this.f16224e, i10)) {
                this.f16224e.onAbsorb(i10);
            } else {
                v(-i10);
            }
        } else {
            if (f.b(this.f16225f) == 0.0f) {
                return false;
            }
            int i11 = -i10;
            if (S(this.f16225f, i11)) {
                this.f16225f.onAbsorb(i11);
            } else {
                v(i11);
            }
        }
        return true;
    }

    private void s() {
        this.f16237r = -1;
        this.f16230k = false;
        L();
        Z(0);
        this.f16224e.onRelease();
        this.f16225f.onRelease();
    }

    private View u(boolean z10, int i10, int i11) {
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z11 = false;
        for (int i12 = 0; i12 < size; i12++) {
            View view2 = focusables.get(i12);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i10 < bottom && top < i11) {
                boolean z12 = i10 < top && bottom < i11;
                if (view == null) {
                    view = view2;
                    z11 = z12;
                } else {
                    boolean z13 = (z10 && top < view.getTop()) || (!z10 && bottom > view.getBottom());
                    if (z11) {
                        if (z12) {
                            if (!z13) {
                            }
                            view = view2;
                        }
                    } else if (z12) {
                        view = view2;
                        z11 = true;
                    } else {
                        if (!z13) {
                        }
                        view = view2;
                    }
                }
            }
        }
        return view;
    }

    private float x(int i10) {
        double log = Math.log((Math.abs(i10) * 0.35f) / (this.f16220a * 0.015f));
        float f10 = f16214D;
        return (float) (this.f16220a * 0.015f * Math.exp((f10 / (f10 - 1.0d)) * log));
    }

    private boolean z(int i10, int i11) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        return i11 >= childAt.getTop() - scrollY && i11 < childAt.getBottom() - scrollY && i10 >= childAt.getLeft() && i10 < childAt.getRight();
    }

    boolean J(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10) {
        boolean z11;
        boolean z12;
        int overScrollMode = getOverScrollMode();
        boolean z13 = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean z14 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean z15 = overScrollMode == 0 || (overScrollMode == 1 && z13);
        boolean z16 = overScrollMode == 0 || (overScrollMode == 1 && z14);
        int i18 = i12 + i10;
        int i19 = !z15 ? 0 : i16;
        int i20 = i13 + i11;
        int i21 = !z16 ? 0 : i17;
        int i22 = -i19;
        int i23 = i19 + i14;
        int i24 = -i21;
        int i25 = i21 + i15;
        if (i18 > i23) {
            i18 = i23;
            z11 = true;
        } else if (i18 < i22) {
            z11 = true;
            i18 = i22;
        } else {
            z11 = false;
        }
        if (i20 > i25) {
            i20 = i25;
            z12 = true;
        } else if (i20 < i24) {
            z12 = true;
            i20 = i24;
        } else {
            z12 = false;
        }
        if (z12 && !y(1)) {
            this.f16223d.springBack(i18, i20, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i18, i20, z11, z12);
        return z11 || z12;
    }

    public boolean K(int i10) {
        boolean z10 = i10 == 130;
        int height = getHeight();
        if (z10) {
            this.f16222c.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f16222c;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f16222c.top = getScrollY() - height;
            Rect rect2 = this.f16222c;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f16222c;
        int i11 = rect3.top;
        int i12 = height + i11;
        rect3.bottom = i12;
        return O(i10, i11, i12);
    }

    public final void T(int i10, int i11) {
        U(i10, i11, 250, false);
    }

    void V(int i10, int i11, int i12, boolean z10) {
        U(i10 - getScrollX(), i11 - getScrollY(), i12, z10);
    }

    void W(int i10, int i11, boolean z10) {
        V(i10, i11, 250, z10);
    }

    public boolean X(int i10, int i11) {
        return this.f16244y.p(i10, i11);
    }

    public void Z(int i10) {
        this.f16244y.r(i10);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    public boolean c(int i10) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i10);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !G(findNextFocus, maxScrollAmount, getHeight())) {
            if (i10 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i10 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i10 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            P(maxScrollAmount, 0, 1, true);
        } else {
            findNextFocus.getDrawingRect(this.f16222c);
            offsetDescendantRectToMyCoords(findNextFocus, this.f16222c);
            P(g(this.f16222c), 0, 1, true);
            findNextFocus.requestFocus(i10);
        }
        if (findFocus != null && findFocus.isFocused() && E(findFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f16223d.isFinished()) {
            return;
        }
        this.f16223d.computeScrollOffset();
        int currY = this.f16223d.getCurrY();
        int h10 = h(currY - this.f16241v);
        this.f16241v = currY;
        int[] iArr = this.f16239t;
        iArr[1] = 0;
        i(0, h10, iArr, null, 1);
        int i10 = h10 - this.f16239t[1];
        int scrollRange = getScrollRange();
        if (i10 != 0) {
            int scrollY = getScrollY();
            J(0, i10, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            int scrollY2 = getScrollY() - scrollY;
            int i11 = i10 - scrollY2;
            int[] iArr2 = this.f16239t;
            iArr2[1] = 0;
            p(0, scrollY2, 0, i11, this.f16238s, 1, iArr2);
            i10 = i11 - this.f16239t[1];
        }
        if (i10 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                if (i10 < 0) {
                    if (this.f16224e.isFinished()) {
                        this.f16224e.onAbsorb((int) this.f16223d.getCurrVelocity());
                    }
                } else if (this.f16225f.isFinished()) {
                    this.f16225f.onAbsorb((int) this.f16223d.getCurrVelocity());
                }
            }
            a();
        }
        if (this.f16223d.isFinished()) {
            Z(1);
        } else {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || t(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return this.f16244y.a(f10, f11, z10);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return this.f16244y.b(f10, f11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return i(i10, i11, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.f16244y.f(i10, i11, i12, i13, iArr);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i10;
        super.draw(canvas);
        int scrollY = getScrollY();
        int i11 = 0;
        if (!this.f16224e.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (b.a(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                i10 = getPaddingLeft();
            } else {
                i10 = 0;
            }
            if (b.a(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                min += getPaddingTop();
            }
            canvas.translate(i10, min);
            this.f16224e.setSize(width, height);
            if (this.f16224e.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save);
        }
        if (this.f16225f.isFinished()) {
            return;
        }
        int save2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int max = Math.max(getScrollRange(), scrollY) + height2;
        if (b.a(this)) {
            width2 -= getPaddingLeft() + getPaddingRight();
            i11 = getPaddingLeft();
        }
        if (b.a(this)) {
            height2 -= getPaddingTop() + getPaddingBottom();
            max -= getPaddingBottom();
        }
        canvas.translate(i11 - width2, max);
        canvas.rotate(180.0f, width2, 0.0f);
        this.f16225f.setSize(width2, height2);
        if (this.f16225f.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(save2);
    }

    protected int g(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i10 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i11 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i10 - verticalFadingEdgeLength : i10;
        int i12 = rect.bottom;
        if (i12 > i11 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i11, (childAt.getBottom() + layoutParams.bottomMargin) - i10);
        }
        if (rect.top >= scrollY || i12 >= i11) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i11 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.View
    protected float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f16243x.a();
    }

    int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    protected float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    float getVerticalScrollFactorCompat() {
        if (this.f16245z == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f16245z = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f16245z;
    }

    int h(int i10) {
        int height = getHeight();
        if (i10 > 0 && f.b(this.f16224e) != 0.0f) {
            int round = Math.round(((-height) / 4.0f) * f.d(this.f16224e, ((-i10) * 4.0f) / height, 0.5f));
            if (round != i10) {
                this.f16224e.finish();
            }
            return i10 - round;
        }
        if (i10 >= 0 || f.b(this.f16225f) == 0.0f) {
            return i10;
        }
        float f10 = height;
        int round2 = Math.round((f10 / 4.0f) * f.d(this.f16225f, (i10 * 4.0f) / f10, 0.5f));
        if (round2 != i10) {
            this.f16225f.finish();
        }
        return i10 - round2;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return y(0);
    }

    public boolean i(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return this.f16244y.d(i10, i11, iArr, iArr2, i12);
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f16244y.l();
    }

    @Override // androidx.core.view.G
    public void j(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        H(i13, i14, iArr);
    }

    @Override // androidx.core.view.F
    public void k(View view, int i10, int i11, int i12, int i13, int i14) {
        H(i13, i14, null);
    }

    @Override // androidx.core.view.F
    public boolean l(View view, View view2, int i10, int i11) {
        return (i10 & 2) != 0;
    }

    @Override // androidx.core.view.F
    public void m(View view, View view2, int i10, int i11) {
        this.f16243x.c(view, view2, i10, i11);
        X(2, i11);
    }

    @Override // android.view.ViewGroup
    protected void measureChild(View view, int i10, int i11) {
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // androidx.core.view.F
    public void n(View view, int i10) {
        this.f16243x.e(view, i10);
        Z(i10);
    }

    @Override // androidx.core.view.F
    public void o(View view, int i10, int i11, int[] iArr, int i12) {
        i(i10, i11, iArr, null, i12);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f16228i = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i10;
        int i11;
        float f10;
        if (motionEvent.getAction() == 8 && !this.f16230k) {
            if (C.a(motionEvent, 2)) {
                i10 = 9;
                f10 = motionEvent.getAxisValue(9);
                i11 = (int) motionEvent.getX();
            } else if (C.a(motionEvent, 4194304)) {
                float axisValue = motionEvent.getAxisValue(26);
                i11 = getWidth() / 2;
                i10 = 26;
                f10 = axisValue;
            } else {
                i10 = 0;
                i11 = 0;
                f10 = 0.0f;
            }
            if (f10 != 0.0f) {
                P(-((int) (f10 * getVerticalScrollFactorCompat())), i11, 1, C.a(motionEvent, 8194));
                if (i10 != 0) {
                    this.f16219C.g(motionEvent, i10);
                }
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z10 = true;
        if (action == 2 && this.f16230k) {
            return true;
        }
        int i10 = action & 255;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    int i11 = this.f16237r;
                    if (i11 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i11);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i11 + " in onInterceptTouchEvent");
                        } else {
                            int y10 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y10 - this.f16226g) > this.f16234o && (2 & getNestedScrollAxes()) == 0) {
                                this.f16230k = true;
                                this.f16226g = y10;
                                C();
                                this.f16231l.addMovement(motionEvent);
                                this.f16240u = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i10 != 3) {
                    if (i10 == 6) {
                        I(motionEvent);
                    }
                }
            }
            this.f16230k = false;
            this.f16237r = -1;
            L();
            if (this.f16223d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            Z(0);
        } else {
            int y11 = (int) motionEvent.getY();
            if (z((int) motionEvent.getX(), y11)) {
                this.f16226g = y11;
                this.f16237r = motionEvent.getPointerId(0);
                A();
                this.f16231l.addMovement(motionEvent);
                this.f16223d.computeScrollOffset();
                if (!Y(motionEvent) && this.f16223d.isFinished()) {
                    z10 = false;
                }
                this.f16230k = z10;
                X(2, 0);
            } else {
                if (!Y(motionEvent) && this.f16223d.isFinished()) {
                    z10 = false;
                }
                this.f16230k = z10;
                L();
            }
        }
        return this.f16230k;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = 0;
        this.f16227h = false;
        View view = this.f16229j;
        if (view != null && F(view, this)) {
            Q(this.f16229j);
        }
        this.f16229j = null;
        if (!this.f16228i) {
            if (this.f16242w != null) {
                scrollTo(getScrollX(), this.f16242w.f16247a);
                this.f16242w = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i14 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int f10 = f(scrollY, paddingTop, i14);
            if (f10 != scrollY) {
                scrollTo(getScrollX(), f10);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f16228i = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f16232m && View.MeasureSpec.getMode(i11) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (z10) {
            return false;
        }
        dispatchNestedFling(0.0f, f11, true);
        v((int) f11);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        return dispatchNestedPreFling(f10, f11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        o(view, i10, i11, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        H(i13, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        m(view, view2, i10, 0);
    }

    @Override // android.view.View
    protected void onOverScrolled(int i10, int i11, boolean z10, boolean z11) {
        super.scrollTo(i10, i11);
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (i10 == 2) {
            i10 = 130;
        } else if (i10 == 1) {
            i10 = 33;
        }
        View findNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i10) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i10);
        if (findNextFocus == null || E(findNextFocus)) {
            return false;
        }
        return findNextFocus.requestFocus(i10, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(eVar.getSuperState());
        this.f16242w = eVar;
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        e eVar = new e(super.onSaveInstanceState());
        eVar.f16247a = getScrollY();
        return eVar;
    }

    @Override // android.view.View
    protected void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        d dVar = this.f16217A;
        if (dVar != null) {
            dVar.a(this, i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !G(findFocus, 0, i13)) {
            return;
        }
        findFocus.getDrawingRect(this.f16222c);
        offsetDescendantRectToMyCoords(findFocus, this.f16222c);
        q(g(this.f16222c));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return l(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        n(view, 0);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        C();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f16240u = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(0.0f, this.f16240u);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f16231l;
                velocityTracker.computeCurrentVelocity(1000, this.f16236q);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f16237r);
                if (Math.abs(yVelocity) >= this.f16235p) {
                    if (!r(yVelocity)) {
                        int i10 = -yVelocity;
                        float f10 = i10;
                        if (!dispatchNestedPreFling(0.0f, f10)) {
                            dispatchNestedFling(0.0f, f10, true);
                            v(i10);
                        }
                    }
                } else if (this.f16223d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                s();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f16237r);
                if (findPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f16237r + " in onTouchEvent");
                } else {
                    int y10 = (int) motionEvent.getY(findPointerIndex);
                    int i11 = this.f16226g - y10;
                    int M10 = i11 - M(i11, motionEvent.getX(findPointerIndex));
                    if (!this.f16230k && Math.abs(M10) > this.f16234o) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f16230k = true;
                        M10 = M10 > 0 ? M10 - this.f16234o : M10 + this.f16234o;
                    }
                    if (this.f16230k) {
                        int P10 = P(M10, (int) motionEvent.getX(findPointerIndex), 0, false);
                        this.f16226g = y10 - P10;
                        this.f16240u += P10;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f16230k && getChildCount() > 0 && this.f16223d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                s();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f16226g = (int) motionEvent.getY(actionIndex);
                this.f16237r = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                I(motionEvent);
                this.f16226g = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f16237r));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f16230k && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f16223d.isFinished()) {
                a();
            }
            D((int) motionEvent.getY(), motionEvent.getPointerId(0));
        }
        VelocityTracker velocityTracker2 = this.f16231l;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public void p(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        this.f16244y.e(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.f16227h) {
            this.f16229j = view2;
        } else {
            Q(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return R(rect, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        if (z10) {
            L();
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f16227h = true;
        super.requestLayout();
    }

    @Override // android.view.View
    public void scrollTo(int i10, int i11) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int f10 = f(i10, width, width2);
            int f11 = f(i11, height, height2);
            if (f10 == getScrollX() && f11 == getScrollY()) {
                return;
            }
            super.scrollTo(f10, f11);
        }
    }

    public void setFillViewport(boolean z10) {
        if (z10 != this.f16232m) {
            this.f16232m = z10;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        this.f16244y.m(z10);
    }

    public void setOnScrollChangeListener(d dVar) {
    }

    public void setSmoothScrollingEnabled(boolean z10) {
        this.f16233n = z10;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i10) {
        return X(i10, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        Z(0);
    }

    public boolean t(KeyEvent keyEvent) {
        this.f16222c.setEmpty();
        if (!e()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            return (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) ? false : true;
        }
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 19) {
            return keyEvent.isAltPressed() ? w(33) : c(33);
        }
        if (keyCode == 20) {
            return keyEvent.isAltPressed() ? w(130) : c(130);
        }
        if (keyCode == 62) {
            K(keyEvent.isShiftPressed() ? 33 : 130);
            return false;
        }
        if (keyCode == 92) {
            return w(33);
        }
        if (keyCode == 93) {
            return w(130);
        }
        if (keyCode == 122) {
            K(33);
            return false;
        }
        if (keyCode != 123) {
            return false;
        }
        K(130);
        return false;
    }

    public void v(int i10) {
        if (getChildCount() > 0) {
            this.f16223d.fling(getScrollX(), getScrollY(), 0, i10, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            N(true);
        }
    }

    public boolean w(int i10) {
        int childCount;
        boolean z10 = i10 == 130;
        int height = getHeight();
        Rect rect = this.f16222c;
        rect.top = 0;
        rect.bottom = height;
        if (z10 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f16222c.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f16222c;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f16222c;
        return O(i10, rect3.top, rect3.bottom);
    }

    public boolean y(int i10) {
        return this.f16244y.k(i10);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f16222c = new Rect();
        this.f16227h = true;
        this.f16228i = false;
        this.f16229j = null;
        this.f16230k = false;
        this.f16233n = true;
        this.f16237r = -1;
        this.f16238s = new int[2];
        this.f16239t = new int[2];
        c cVar = new c();
        this.f16218B = cVar;
        this.f16219C = new C1511o(getContext(), cVar);
        this.f16224e = f.a(context, attributeSet);
        this.f16225f = f.a(context, attributeSet);
        this.f16220a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        B();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f16216F, i10, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f16243x = new H(this);
        this.f16244y = new E(this);
        setNestedScrollingEnabled(true);
        AbstractC1484a0.q0(this, f16215E);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10) {
        if (getChildCount() <= 0) {
            super.addView(view, i10);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
