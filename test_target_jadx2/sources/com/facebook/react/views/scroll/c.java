package com.facebook.react.views.scroll;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.core.view.AbstractC1484a0;
import c3.AbstractC1721a;
import com.facebook.react.AbstractC1899n;
import com.facebook.react.animated.NativeAnimatedModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.AbstractC1954l0;
import com.facebook.react.uimanager.C1931a;
import com.facebook.react.uimanager.C1932a0;
import com.facebook.react.uimanager.C1944g0;
import com.facebook.react.uimanager.E0;
import com.facebook.react.uimanager.EnumC1946h0;
import com.facebook.react.uimanager.InterfaceC1952k0;
import com.facebook.react.uimanager.InterfaceC1962p0;
import com.facebook.react.uimanager.X;
import com.facebook.react.uimanager.Y;
import com.facebook.react.uimanager.events.l;
import com.facebook.react.views.scroll.a;
import com.facebook.react.views.scroll.f;
import e5.EnumC3081c;
import e5.EnumC3083e;
import e5.j;
import e5.k;
import java.lang.reflect.Field;
import java.util.List;
import m5.C3652b;
import m5.C3654d;
import m5.InterfaceC3651a;
import r4.AbstractC4012a;

/* loaded from: classes2.dex */
public class c extends ScrollView implements InterfaceC1952k0, ViewGroup.OnHierarchyChangeListener, View.OnLayoutChangeListener, InterfaceC1962p0, f.c, f.e, f.a, f.b, f.d {

    /* renamed from: h0, reason: collision with root package name */
    private static Field f22660h0 = null;

    /* renamed from: i0, reason: collision with root package name */
    private static boolean f22661i0 = false;

    /* renamed from: A, reason: collision with root package name */
    private com.facebook.react.views.view.g f22662A;

    /* renamed from: B, reason: collision with root package name */
    private ReadableMap f22663B;

    /* renamed from: C, reason: collision with root package name */
    private int f22664C;

    /* renamed from: D, reason: collision with root package name */
    private int f22665D;

    /* renamed from: E, reason: collision with root package name */
    private E0 f22666E;

    /* renamed from: F, reason: collision with root package name */
    private final f.g f22667F;

    /* renamed from: G, reason: collision with root package name */
    private final ValueAnimator f22668G;

    /* renamed from: H, reason: collision with root package name */
    private EnumC1946h0 f22669H;

    /* renamed from: I, reason: collision with root package name */
    private long f22670I;

    /* renamed from: J, reason: collision with root package name */
    private int f22671J;

    /* renamed from: K, reason: collision with root package name */
    private com.facebook.react.views.scroll.a f22672K;

    /* renamed from: a, reason: collision with root package name */
    private final C3652b f22673a;

    /* renamed from: b, reason: collision with root package name */
    private final OverScroller f22674b;

    /* renamed from: c, reason: collision with root package name */
    private final C3654d f22675c;

    /* renamed from: d, reason: collision with root package name */
    private final Rect f22676d;

    /* renamed from: e, reason: collision with root package name */
    private final Rect f22677e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f22678f;

    /* renamed from: g, reason: collision with root package name */
    private Rect f22679g;

    /* renamed from: h, reason: collision with root package name */
    private k f22680h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f22681i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f22682j;

    /* renamed from: k, reason: collision with root package name */
    private Runnable f22683k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f22684l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f22685m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f22686n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f22687o;

    /* renamed from: p, reason: collision with root package name */
    private String f22688p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f22689q;

    /* renamed from: r, reason: collision with root package name */
    private Drawable f22690r;

    /* renamed from: s, reason: collision with root package name */
    private int f22691s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f22692t;

    /* renamed from: u, reason: collision with root package name */
    private int f22693u;

    /* renamed from: v, reason: collision with root package name */
    private List f22694v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f22695w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f22696x;

    /* renamed from: y, reason: collision with root package name */
    private int f22697y;

    /* renamed from: z, reason: collision with root package name */
    private View f22698z;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private boolean f22699a = false;

        /* renamed from: b, reason: collision with root package name */
        private int f22700b = 0;

        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NativeAnimatedModule nativeAnimatedModule;
            if (c.this.f22678f) {
                c.this.f22678f = false;
                this.f22700b = 0;
                AbstractC1484a0.j0(c.this, this, 20L);
                return;
            }
            f.r(c.this);
            int i10 = this.f22700b + 1;
            this.f22700b = i10;
            if (i10 < 3) {
                if (c.this.f22682j && !this.f22699a) {
                    this.f22699a = true;
                    c.this.q(0);
                }
                AbstractC1484a0.j0(c.this, this, 20L);
                return;
            }
            c.this.f22683k = null;
            if (c.this.f22687o) {
                f.i(c.this);
            }
            ReactContext reactContext = (ReactContext) c.this.getContext();
            if (reactContext != null && (nativeAnimatedModule = (NativeAnimatedModule) reactContext.getNativeModule(NativeAnimatedModule.class)) != null) {
                nativeAnimatedModule.userDrivenScrollEnded(c.this.getId());
            }
            c.this.n();
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22702a;

        static {
            int[] iArr = new int[k.values().length];
            f22702a = iArr;
            try {
                iArr[k.HIDDEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22702a[k.SCROLL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22702a[k.VISIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public c(Context context, InterfaceC3651a interfaceC3651a) {
        super(context);
        this.f22673a = new C3652b();
        this.f22675c = new C3654d();
        this.f22676d = new Rect();
        this.f22677e = new Rect();
        this.f22680h = k.SCROLL;
        this.f22682j = false;
        this.f22685m = true;
        this.f22686n = false;
        this.f22689q = false;
        this.f22691s = 0;
        this.f22692t = false;
        this.f22693u = 0;
        this.f22695w = true;
        this.f22696x = true;
        this.f22697y = 0;
        this.f22663B = null;
        this.f22664C = -1;
        this.f22665D = -1;
        this.f22666E = null;
        this.f22667F = new f.g(0);
        this.f22668G = ObjectAnimator.ofInt(this, "scrollY", 0, 0);
        this.f22669H = EnumC1946h0.AUTO;
        this.f22670I = 0L;
        this.f22671J = 0;
        this.f22672K = null;
        this.f22662A = new com.facebook.react.views.view.g(this);
        this.f22674b = getOverScrollerFromParent();
        setOnHierarchyChangeListener(this);
        setScrollBarStyle(33554432);
        setClipChildren(false);
        this.f22662A.k("scroll");
        AbstractC1484a0.q0(this, new d());
    }

    private void A(int i10) {
        if (getFlingAnimator().isRunning()) {
            getFlingAnimator().cancel();
        }
        OverScroller overScroller = this.f22674b;
        if (overScroller == null || overScroller.isFinished()) {
            return;
        }
        int currY = this.f22674b.getCurrY();
        boolean computeScrollOffset = this.f22674b.computeScrollOffset();
        this.f22674b.forceFinished(true);
        if (!computeScrollOffset) {
            scrollTo(getScrollX(), i10 + (this.f22674b.getCurrX() - currY));
            return;
        }
        this.f22674b.fling(getScrollX(), i10, 0, (int) (this.f22674b.getCurrVelocity() * Math.signum(this.f22674b.getFinalY() - this.f22674b.getStartY())), 0, 0, 0, Integer.MAX_VALUE);
    }

    private void B(View view) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        int computeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(rect);
        if (computeScrollDeltaToGetChildRectOnScreen != 0) {
            scrollBy(0, computeScrollDeltaToGetChildRectOnScreen);
        }
    }

    private void F(int i10, int i11) {
        if (w()) {
            this.f22664C = -1;
            this.f22665D = -1;
        } else {
            this.f22664C = i10;
            this.f22665D = i11;
        }
    }

    private void G(int i10) {
        double snapInterval = getSnapInterval();
        double l10 = f.l(this, getScrollY(), getReactScrollViewScrollState().b().y, i10);
        double z10 = z(i10);
        double d10 = l10 / snapInterval;
        int floor = (int) Math.floor(d10);
        int ceil = (int) Math.ceil(d10);
        int round = (int) Math.round(d10);
        int round2 = (int) Math.round(z10 / snapInterval);
        if (i10 > 0 && ceil == floor) {
            ceil++;
        } else if (i10 < 0 && floor == ceil) {
            floor--;
        }
        if (i10 > 0 && round < ceil && round2 > floor) {
            round = ceil;
        } else if (i10 < 0 && round > floor && round2 < ceil) {
            round = floor;
        }
        double d11 = round * snapInterval;
        if (d11 != l10) {
            this.f22678f = true;
            c(getScrollX(), (int) d11);
        }
    }

    private void H(int i10) {
        getReactScrollViewScrollState().m(i10);
        f.j(this);
    }

    private View getContentView() {
        return getChildAt(0);
    }

    private int getMaxScrollY() {
        View view = this.f22698z;
        return Math.max(0, (view == null ? 0 : view.getHeight()) - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
    }

    private OverScroller getOverScrollerFromParent() {
        if (!f22661i0) {
            f22661i0 = true;
            try {
                Field declaredField = ScrollView.class.getDeclaredField("mScroller");
                f22660h0 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                AbstractC1721a.J("ReactNative", "Failed to get mScroller field for ScrollView! This app will exhibit the bounce-back scrolling bug :(");
            }
        }
        Field field = f22660h0;
        OverScroller overScroller = null;
        if (field != null) {
            try {
                Object obj = field.get(this);
                if (obj instanceof OverScroller) {
                    overScroller = (OverScroller) obj;
                } else {
                    AbstractC1721a.J("ReactNative", "Failed to cast mScroller field in ScrollView (probably due to OEM changes to AOSP)! This app will exhibit the bounce-back scrolling bug :(");
                }
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("Failed to get mScroller from ScrollView!", e10);
            }
        }
        return overScroller;
    }

    private int getSnapInterval() {
        int i10 = this.f22693u;
        return i10 != 0 ? i10 : getHeight();
    }

    private void l() {
        Runnable runnable = this.f22683k;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f22683k = null;
            getFlingAnimator().cancel();
        }
    }

    private int m(int i10) {
        if (Build.VERSION.SDK_INT != 28) {
            return i10;
        }
        float signum = Math.signum(this.f22673a.b());
        if (signum == 0.0f) {
            signum = Math.signum(i10);
        }
        return (int) (Math.abs(i10) * signum);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        if (y()) {
            AbstractC4012a.c(null);
            AbstractC4012a.c(this.f22688p);
            throw null;
        }
    }

    private void o() {
        if (y()) {
            AbstractC4012a.c(null);
            AbstractC4012a.c(this.f22688p);
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(int i10) {
        int min;
        int i11;
        int i12;
        int i13;
        int top;
        int top2;
        int height;
        int i14;
        OverScroller overScroller;
        if (getChildCount() <= 0) {
            return;
        }
        if (this.f22693u == 0 && this.f22694v == null && this.f22697y == 0) {
            G(i10);
            return;
        }
        int i15 = 1;
        boolean z10 = getFlingAnimator() != this.f22668G;
        int maxScrollY = getMaxScrollY();
        int z11 = z(i10);
        if (this.f22692t) {
            z11 = getScrollY();
        }
        int height2 = (getHeight() - getPaddingBottom()) - getPaddingTop();
        List list = this.f22694v;
        if (list != null) {
            i13 = ((Integer) list.get(0)).intValue();
            List list2 = this.f22694v;
            i11 = ((Integer) list2.get(list2.size() - 1)).intValue();
            min = maxScrollY;
            i12 = 0;
            for (int i16 = 0; i16 < this.f22694v.size(); i16++) {
                int intValue = ((Integer) this.f22694v.get(i16)).intValue();
                if (intValue <= z11 && z11 - intValue < z11 - i12) {
                    i12 = intValue;
                }
                if (intValue >= z11 && intValue - z11 < min - z11) {
                    min = intValue;
                }
            }
        } else {
            int i17 = this.f22697y;
            if (i17 != 0) {
                int i18 = this.f22693u;
                if (i18 > 0) {
                    double d10 = z11 / i18;
                    double floor = Math.floor(d10);
                    int i19 = this.f22693u;
                    int max = Math.max(s(i17, (int) (floor * i19), i19, height2), 0);
                    int i20 = this.f22697y;
                    double ceil = Math.ceil(d10);
                    int i21 = this.f22693u;
                    min = Math.min(s(i20, (int) (ceil * i21), i21, height2), maxScrollY);
                    i11 = maxScrollY;
                    i12 = max;
                } else {
                    ViewGroup viewGroup = (ViewGroup) getContentView();
                    int i22 = maxScrollY;
                    int i23 = i22;
                    int i24 = 0;
                    int i25 = 0;
                    int i26 = 0;
                    while (i24 < viewGroup.getChildCount()) {
                        View childAt = viewGroup.getChildAt(i24);
                        int i27 = this.f22697y;
                        if (i27 != i15) {
                            if (i27 == 2) {
                                top2 = childAt.getTop();
                                height = (height2 - childAt.getHeight()) / 2;
                            } else {
                                if (i27 != 3) {
                                    throw new IllegalStateException("Invalid SnapToAlignment value: " + this.f22697y);
                                }
                                top2 = childAt.getTop();
                                height = height2 - childAt.getHeight();
                            }
                            top = top2 - height;
                        } else {
                            top = childAt.getTop();
                        }
                        if (top <= z11 && z11 - top < z11 - i25) {
                            i25 = top;
                        }
                        if (top >= z11 && top - z11 < i23 - z11) {
                            i23 = top;
                        }
                        i22 = Math.min(i22, top);
                        i26 = Math.max(i26, top);
                        i24++;
                        i15 = 1;
                    }
                    i12 = Math.max(i25, i22);
                    min = Math.min(i23, i26);
                    i11 = maxScrollY;
                }
            } else {
                double snapInterval = getSnapInterval();
                double d11 = z11 / snapInterval;
                int floor2 = (int) (Math.floor(d11) * snapInterval);
                min = Math.min((int) (Math.ceil(d11) * snapInterval), maxScrollY);
                i11 = maxScrollY;
                i12 = floor2;
            }
            i13 = 0;
        }
        int i28 = z11 - i12;
        int i29 = min - z11;
        int i30 = Math.abs(i28) < Math.abs(i29) ? i12 : min;
        if (!this.f22696x && z11 >= i11) {
            if (getScrollY() < i11) {
                i14 = i10;
                z11 = i11;
            }
            i14 = i10;
        } else if (!this.f22695w && z11 <= i13) {
            if (getScrollY() > i13) {
                i14 = i10;
                z11 = i13;
            }
            i14 = i10;
        } else if (i10 > 0) {
            i14 = !z10 ? i10 + ((int) (i29 * 10.0d)) : i10;
            z11 = min;
        } else if (i10 < 0) {
            i14 = !z10 ? i10 - ((int) (i28 * 10.0d)) : i10;
            z11 = i12;
        } else {
            i14 = i10;
            z11 = i30;
        }
        int min2 = Math.min(Math.max(0, z11), maxScrollY);
        if (z10 || (overScroller = this.f22674b) == null) {
            c(getScrollX(), min2);
            return;
        }
        this.f22678f = true;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        if (i14 == 0) {
            i14 = min2 - getScrollY();
        }
        overScroller.fling(scrollX, scrollY, 0, i14, 0, 0, min2, min2, 0, (min2 == 0 || min2 == maxScrollY) ? height2 / 2 : 0);
        postInvalidateOnAnimation();
    }

    private int s(int i10, int i11, int i12, int i13) {
        int i14;
        if (i10 == 1) {
            return i11;
        }
        if (i10 == 2) {
            i14 = (i13 - i12) / 2;
        } else {
            if (i10 != 3) {
                throw new IllegalStateException("Invalid SnapToAlignment value: " + this.f22697y);
            }
            i14 = i13 - i12;
        }
        return i11 - i14;
    }

    private int t(View view) {
        view.getDrawingRect(this.f22676d);
        offsetDescendantRectToMyCoords(view, this.f22676d);
        return computeScrollDeltaToGetChildRectOnScreen(this.f22676d);
    }

    private void v(int i10, int i11) {
        if (this.f22683k != null) {
            return;
        }
        if (this.f22687o) {
            o();
            f.h(this, i10, i11);
        }
        this.f22678f = false;
        a aVar = new a();
        this.f22683k = aVar;
        AbstractC1484a0.j0(this, aVar, 20L);
    }

    private boolean w() {
        View contentView = getContentView();
        return (contentView == null || contentView.getWidth() == 0 || contentView.getHeight() == 0) ? false : true;
    }

    private boolean y() {
        return false;
    }

    private int z(int i10) {
        if (getFlingAnimator() == this.f22668G) {
            return f.o(this, 0, i10, 0, getMaxScrollY()).y;
        }
        return r(i10) + f.l(this, getScrollY(), getReactScrollViewScrollState().b().y, i10);
    }

    public void C(int i10, Integer num) {
        if (G4.a.c()) {
            C1931a.k(this, j.values()[i10], num);
        } else {
            this.f22662A.f(i10, num);
        }
    }

    public void D(float f10, int i10) {
        if (G4.a.c()) {
            C1931a.l(this, EnumC3081c.values()[i10], Float.isNaN(f10) ? null : new X(C1944g0.e(f10), Y.POINT));
        } else {
            this.f22662A.h(f10, i10);
        }
    }

    public void E(int i10, float f10) {
        if (G4.a.c()) {
            C1931a.n(this, j.values()[i10], Float.valueOf(C1944g0.e(f10)));
        } else {
            this.f22662A.j(i10, f10);
        }
    }

    @Override // com.facebook.react.views.scroll.f.a
    public void a(int i10, int i11) {
        this.f22668G.cancel();
        int k10 = f.k(getContext());
        this.f22668G.setDuration(k10).setIntValues(i10, i11);
        this.f22668G.start();
        if (this.f22687o) {
            f.h(this, 0, k10 > 0 ? (i11 - i10) / k10 : 0);
            f.a(this);
        }
    }

    @Override // com.facebook.react.views.scroll.f.d
    public void b(int i10, int i11) {
        scrollTo(i10, i11);
        A(i11);
    }

    @Override // com.facebook.react.views.scroll.f.d
    public void c(int i10, int i11) {
        f.q(this, i10, i11);
        F(i10, i11);
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if (EnumC1946h0.canChildrenBeTouchTarget(this.f22669H)) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        return false;
    }

    @Override // android.widget.ScrollView, android.view.View
    public void draw(Canvas canvas) {
        if (this.f22691s != 0) {
            View contentView = getContentView();
            if (this.f22690r != null && contentView != null && contentView.getBottom() < getHeight()) {
                this.f22690r.setBounds(0, contentView.getBottom(), getWidth(), getHeight());
                this.f22690r.draw(canvas);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.ScrollView
    public boolean executeKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (this.f22685m || !(keyCode == 19 || keyCode == 20)) {
            return super.executeKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.widget.ScrollView
    public void fling(int i10) {
        int m10 = m(i10);
        if (this.f22682j) {
            q(m10);
        } else if (this.f22674b != null) {
            this.f22674b.fling(getScrollX(), getScrollY(), 0, m10, 0, 0, 0, Integer.MAX_VALUE, 0, ((getHeight() - getPaddingBottom()) - getPaddingTop()) / 2);
            AbstractC1484a0.h0(this);
        } else {
            super.fling(m10);
        }
        v(0, m10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean getChildVisibleRect(View view, Rect rect, Point point) {
        return super.getChildVisibleRect(view, rect, point);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1952k0
    public void getClippingRect(Rect rect) {
        rect.set((Rect) AbstractC4012a.c(this.f22679g));
    }

    @Override // com.facebook.react.views.scroll.f.a
    public ValueAnimator getFlingAnimator() {
        return this.f22668G;
    }

    @Override // com.facebook.react.views.scroll.f.b
    public long getLastScrollDispatchTime() {
        return this.f22670I;
    }

    @Override // com.facebook.react.uimanager.InterfaceC1960o0
    public String getOverflow() {
        int i10 = b.f22702a[this.f22680h.ordinal()];
        if (i10 == 1) {
            return "hidden";
        }
        if (i10 == 2) {
            return "scroll";
        }
        if (i10 != 3) {
            return null;
        }
        return "visible";
    }

    @Override // com.facebook.react.uimanager.InterfaceC1962p0
    public Rect getOverflowInset() {
        return this.f22677e;
    }

    public EnumC1946h0 getPointerEvents() {
        return this.f22669H;
    }

    @Override // com.facebook.react.views.scroll.f.c
    public f.g getReactScrollViewScrollState() {
        return this.f22667F;
    }

    @Override // com.facebook.react.uimanager.InterfaceC1952k0
    public boolean getRemoveClippedSubviews() {
        return this.f22684l;
    }

    public boolean getScrollEnabled() {
        return this.f22685m;
    }

    @Override // com.facebook.react.views.scroll.f.b
    public int getScrollEventThrottle() {
        return this.f22671J;
    }

    @Override // com.facebook.react.views.scroll.f.e
    public E0 getStateWrapper() {
        return this.f22666E;
    }

    public void k() {
        OverScroller overScroller = this.f22674b;
        if (overScroller == null || overScroller.isFinished()) {
            return;
        }
        this.f22674b.abortAnimation();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f22684l) {
            updateClippingRect();
        }
        com.facebook.react.views.scroll.a aVar = this.f22672K;
        if (aVar != null) {
            aVar.f();
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewAdded(View view, View view2) {
        this.f22698z = view2;
        view2.addOnLayoutChangeListener(this);
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewRemoved(View view, View view2) {
        View view3 = this.f22698z;
        if (view3 != null) {
            view3.removeOnLayoutChangeListener(this);
            this.f22698z = null;
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.facebook.react.views.scroll.a aVar = this.f22672K;
        if (aVar != null) {
            aVar.g();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (!G4.a.c()) {
            this.f22662A.d(canvas);
        } else if (this.f22680h != k.VISIBLE) {
            C1931a.a(this, canvas);
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String str = (String) getTag(AbstractC1899n.f21900s);
        if (str != null) {
            accessibilityNodeInfo.setViewIdResourceName(str);
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f22685m) {
            return false;
        }
        if (!EnumC1946h0.canChildrenBeTouchTarget(this.f22669H)) {
            return true;
        }
        try {
            if (super.onInterceptTouchEvent(motionEvent)) {
                u(motionEvent);
                return true;
            }
        } catch (IllegalArgumentException e10) {
            AbstractC1721a.K("ReactNative", "Error intercepting touch event.", e10);
        }
        return false;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (w()) {
            int i14 = this.f22664C;
            if (i14 == -1) {
                i14 = getScrollX();
            }
            int i15 = this.f22665D;
            if (i15 == -1) {
                i15 = getScrollY();
            }
            scrollTo(i14, i15);
        }
        f.b(this);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        if (this.f22698z == null) {
            return;
        }
        com.facebook.react.views.scroll.a aVar = this.f22672K;
        if (aVar != null) {
            aVar.h();
        }
        if (isShown() && w()) {
            int scrollY = getScrollY();
            int maxScrollY = getMaxScrollY();
            if (scrollY > maxScrollY) {
                scrollTo(getScrollX(), maxScrollY);
            }
        }
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        C1932a0.a(i10, i11);
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
    }

    @Override // android.widget.ScrollView, android.view.View
    protected void onOverScrolled(int i10, int i11, boolean z10, boolean z11) {
        int maxScrollY;
        OverScroller overScroller = this.f22674b;
        if (overScroller != null && this.f22698z != null && !overScroller.isFinished() && this.f22674b.getCurrY() != this.f22674b.getFinalY() && i11 >= (maxScrollY = getMaxScrollY())) {
            this.f22674b.abortAnimation();
            i11 = maxScrollY;
        }
        super.onOverScrolled(i10, i11, z10, z11);
    }

    @Override // android.view.View
    protected void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        this.f22678f = true;
        if (this.f22673a.c(i10, i11)) {
            if (this.f22684l) {
                updateClippingRect();
            }
            if (this.f22686n) {
                return;
            }
            this.f22686n = true;
            f.t(this, this.f22673a.a(), this.f22673a.b(), this.f22689q);
            this.f22686n = false;
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (this.f22684l) {
            updateClippingRect();
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f22685m || !EnumC1946h0.canBeTouchTarget(this.f22669H)) {
            return false;
        }
        this.f22675c.a(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 && this.f22681i) {
            f.r(this);
            float b10 = this.f22675c.b();
            float c10 = this.f22675c.c();
            f.d(this, b10, c10);
            l.a(this, motionEvent);
            this.f22681i = false;
            v(Math.round(b10), Math.round(c10));
        }
        if (actionMasked == 0) {
            l();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void p() {
        awakenScrollBars();
    }

    public int r(int i10) {
        return f.o(this, 0, i10, 0, getMaxScrollY()).y;
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (view2 != null) {
            B(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.widget.ScrollView, android.view.View
    public void scrollTo(int i10, int i11) {
        super.scrollTo(i10, i11);
        f.r(this);
        F(i10, i11);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (G4.a.c()) {
            C1931a.i(this, Integer.valueOf(i10));
        } else {
            this.f22662A.e(i10);
        }
    }

    public void setBorderRadius(float f10) {
        D(f10, EnumC3081c.BORDER_RADIUS.ordinal());
    }

    public void setBorderStyle(String str) {
        if (G4.a.c()) {
            C1931a.m(this, str == null ? null : EnumC3083e.fromString(str));
        } else {
            this.f22662A.i(str);
        }
    }

    public void setContentOffset(ReadableMap readableMap) {
        ReadableMap readableMap2 = this.f22663B;
        if (readableMap2 == null || !readableMap2.equals(readableMap)) {
            this.f22663B = readableMap;
            if (readableMap != null) {
                scrollTo((int) C1944g0.f(readableMap.hasKey("x") ? readableMap.getDouble("x") : 0.0d), (int) C1944g0.f(readableMap.hasKey("y") ? readableMap.getDouble("y") : 0.0d));
            } else {
                scrollTo(0, 0);
            }
        }
    }

    public void setDecelerationRate(float f10) {
        getReactScrollViewScrollState().i(f10);
        OverScroller overScroller = this.f22674b;
        if (overScroller != null) {
            overScroller.setFriction(1.0f - f10);
        }
    }

    public void setDisableIntervalMomentum(boolean z10) {
        this.f22692t = z10;
    }

    public void setEnableSyncOnScroll(boolean z10) {
        this.f22689q = z10;
    }

    public void setEndFillColor(int i10) {
        if (i10 != this.f22691s) {
            this.f22691s = i10;
            this.f22690r = new ColorDrawable(this.f22691s);
        }
    }

    @Override // com.facebook.react.views.scroll.f.b
    public void setLastScrollDispatchTime(long j10) {
        this.f22670I = j10;
    }

    public void setMaintainVisibleContentPosition(a.b bVar) {
        com.facebook.react.views.scroll.a aVar;
        if (bVar != null && this.f22672K == null) {
            com.facebook.react.views.scroll.a aVar2 = new com.facebook.react.views.scroll.a(this, false);
            this.f22672K = aVar2;
            aVar2.f();
        } else if (bVar == null && (aVar = this.f22672K) != null) {
            aVar.g();
            this.f22672K = null;
        }
        com.facebook.react.views.scroll.a aVar3 = this.f22672K;
        if (aVar3 != null) {
            aVar3.e(bVar);
        }
    }

    public void setOverflow(String str) {
        if (str == null) {
            this.f22680h = k.SCROLL;
        } else {
            k fromString = k.fromString(str);
            if (fromString == null) {
                fromString = k.SCROLL;
            }
            this.f22680h = fromString;
        }
        com.facebook.react.views.view.g gVar = this.f22662A;
        if (str == null) {
            str = "scroll";
        }
        gVar.k(str);
        invalidate();
    }

    @Override // com.facebook.react.uimanager.InterfaceC1962p0
    public void setOverflowInset(int i10, int i11, int i12, int i13) {
        this.f22677e.set(i10, i11, i12, i13);
    }

    public void setPagingEnabled(boolean z10) {
        this.f22682j = z10;
    }

    public void setPointerEvents(EnumC1946h0 enumC1946h0) {
        this.f22669H = enumC1946h0;
    }

    public void setRemoveClippedSubviews(boolean z10) {
        if (z10 && this.f22679g == null) {
            this.f22679g = new Rect();
        }
        this.f22684l = z10;
        updateClippingRect();
    }

    public void setScrollAwayTopPaddingEnabledUnstable(int i10) {
        int childCount = getChildCount();
        AbstractC4012a.b(childCount <= 1, "React Native ScrollView should not have more than one child, it should have exactly 1 child; a content View");
        if (childCount > 0) {
            for (int i11 = 0; i11 < childCount; i11++) {
                getChildAt(i11).setTranslationY(i10);
            }
            setPadding(0, 0, 0, i10);
        }
        H(i10);
        setRemoveClippedSubviews(this.f22684l);
    }

    public void setScrollEnabled(boolean z10) {
        this.f22685m = z10;
    }

    public void setScrollEventThrottle(int i10) {
        this.f22671J = i10;
    }

    public void setScrollPerfTag(String str) {
        this.f22688p = str;
    }

    public void setSendMomentumEvents(boolean z10) {
        this.f22687o = z10;
    }

    public void setSnapInterval(int i10) {
        this.f22693u = i10;
    }

    public void setSnapOffsets(List<Integer> list) {
        this.f22694v = list;
    }

    public void setSnapToAlignment(int i10) {
        this.f22697y = i10;
    }

    public void setSnapToEnd(boolean z10) {
        this.f22696x = z10;
    }

    public void setSnapToStart(boolean z10) {
        this.f22695w = z10;
    }

    public void setStateWrapper(E0 e02) {
        this.f22666E = e02;
    }

    protected void u(MotionEvent motionEvent) {
        l.b(this, motionEvent);
        f.c(this);
        this.f22681i = true;
        o();
        getFlingAnimator().cancel();
    }

    @Override // com.facebook.react.uimanager.InterfaceC1952k0
    public void updateClippingRect() {
        if (this.f22684l) {
            AbstractC4012a.c(this.f22679g);
            AbstractC1954l0.a(this, this.f22679g);
            KeyEvent.Callback contentView = getContentView();
            if (contentView instanceof InterfaceC1952k0) {
                ((InterfaceC1952k0) contentView).updateClippingRect();
            }
        }
    }

    boolean x(View view) {
        int t10 = t(view);
        view.getDrawingRect(this.f22676d);
        return t10 != 0 && Math.abs(t10) < this.f22676d.width();
    }
}
