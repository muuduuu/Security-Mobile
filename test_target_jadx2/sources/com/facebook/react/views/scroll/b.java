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
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.OverScroller;
import androidx.core.view.AbstractC1484a0;
import c3.AbstractC1721a;
import com.facebook.react.animated.NativeAnimatedModule;
import com.facebook.react.bridge.ReactContext;
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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m5.C3652b;
import m5.C3654d;
import m5.InterfaceC3651a;
import r4.AbstractC4012a;

/* loaded from: classes2.dex */
public class b extends HorizontalScrollView implements InterfaceC1952k0, ViewGroup.OnHierarchyChangeListener, View.OnLayoutChangeListener, InterfaceC1962p0, f.c, f.e, f.a, f.b, f.d {

    /* renamed from: i0, reason: collision with root package name */
    private static boolean f22613i0 = false;

    /* renamed from: j0, reason: collision with root package name */
    private static String f22614j0 = "b";

    /* renamed from: k0, reason: collision with root package name */
    private static int f22615k0 = Integer.MIN_VALUE;

    /* renamed from: l0, reason: collision with root package name */
    private static Field f22616l0 = null;

    /* renamed from: m0, reason: collision with root package name */
    private static boolean f22617m0 = false;

    /* renamed from: A, reason: collision with root package name */
    private boolean f22618A;

    /* renamed from: B, reason: collision with root package name */
    private int f22619B;

    /* renamed from: C, reason: collision with root package name */
    private int f22620C;

    /* renamed from: D, reason: collision with root package name */
    private E0 f22621D;

    /* renamed from: E, reason: collision with root package name */
    private final f.g f22622E;

    /* renamed from: F, reason: collision with root package name */
    private final ValueAnimator f22623F;

    /* renamed from: G, reason: collision with root package name */
    private EnumC1946h0 f22624G;

    /* renamed from: H, reason: collision with root package name */
    private long f22625H;

    /* renamed from: I, reason: collision with root package name */
    private int f22626I;

    /* renamed from: J, reason: collision with root package name */
    private View f22627J;

    /* renamed from: K, reason: collision with root package name */
    private com.facebook.react.views.scroll.a f22628K;

    /* renamed from: a, reason: collision with root package name */
    private int f22629a;

    /* renamed from: b, reason: collision with root package name */
    private final C3652b f22630b;

    /* renamed from: c, reason: collision with root package name */
    private final OverScroller f22631c;

    /* renamed from: d, reason: collision with root package name */
    private final C3654d f22632d;

    /* renamed from: e, reason: collision with root package name */
    private final Rect f22633e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f22634f;

    /* renamed from: g, reason: collision with root package name */
    private Rect f22635g;

    /* renamed from: h, reason: collision with root package name */
    private k f22636h;

    /* renamed from: h0, reason: collision with root package name */
    private final Rect f22637h0;

    /* renamed from: i, reason: collision with root package name */
    private boolean f22638i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f22639j;

    /* renamed from: k, reason: collision with root package name */
    private Runnable f22640k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f22641l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f22642m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f22643n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f22644o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f22645p;

    /* renamed from: q, reason: collision with root package name */
    private String f22646q;

    /* renamed from: r, reason: collision with root package name */
    private Drawable f22647r;

    /* renamed from: s, reason: collision with root package name */
    private int f22648s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f22649t;

    /* renamed from: u, reason: collision with root package name */
    private int f22650u;

    /* renamed from: v, reason: collision with root package name */
    private List f22651v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f22652w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f22653x;

    /* renamed from: y, reason: collision with root package name */
    private int f22654y;

    /* renamed from: z, reason: collision with root package name */
    private com.facebook.react.views.view.g f22655z;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private boolean f22656a = false;

        /* renamed from: b, reason: collision with root package name */
        private int f22657b = 0;

        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NativeAnimatedModule nativeAnimatedModule;
            if (b.this.f22634f) {
                b.this.f22634f = false;
                this.f22657b = 0;
                AbstractC1484a0.j0(b.this, this, 20L);
                return;
            }
            f.r(b.this);
            int i10 = this.f22657b + 1;
            this.f22657b = i10;
            if (i10 < 3) {
                if (b.this.f22639j && !this.f22656a) {
                    this.f22656a = true;
                    b.this.s(0);
                }
                AbstractC1484a0.j0(b.this, this, 20L);
                return;
            }
            b.this.f22640k = null;
            if (b.this.f22645p) {
                f.i(b.this);
            }
            ReactContext reactContext = (ReactContext) b.this.getContext();
            if (reactContext != null && (nativeAnimatedModule = (NativeAnimatedModule) reactContext.getNativeModule(NativeAnimatedModule.class)) != null) {
                nativeAnimatedModule.userDrivenScrollEnded(b.this.getId());
            }
            b.this.n();
        }
    }

    /* renamed from: com.facebook.react.views.scroll.b$b, reason: collision with other inner class name */
    static /* synthetic */ class C0388b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22659a;

        static {
            int[] iArr = new int[k.values().length];
            f22659a = iArr;
            try {
                iArr[k.HIDDEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22659a[k.SCROLL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22659a[k.VISIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public b(Context context, InterfaceC3651a interfaceC3651a) {
        super(context);
        this.f22629a = f22615k0;
        this.f22630b = new C3652b();
        this.f22632d = new C3654d();
        this.f22633e = new Rect();
        this.f22636h = k.SCROLL;
        this.f22639j = false;
        this.f22642m = true;
        this.f22643n = false;
        this.f22644o = false;
        this.f22648s = 0;
        this.f22649t = false;
        this.f22650u = 0;
        this.f22652w = true;
        this.f22653x = true;
        this.f22654y = 0;
        this.f22618A = false;
        this.f22619B = -1;
        this.f22620C = -1;
        this.f22621D = null;
        this.f22623F = ObjectAnimator.ofInt(this, "scrollX", 0, 0);
        this.f22624G = EnumC1946h0.AUTO;
        this.f22625H = 0L;
        this.f22626I = 0;
        this.f22637h0 = new Rect();
        this.f22655z = new com.facebook.react.views.view.g(this);
        AbstractC1484a0.q0(this, new d());
        this.f22631c = getOverScrollerFromParent();
        this.f22622E = new f.g(com.facebook.react.modules.i18nmanager.a.f().i(context) ? 1 : 0);
        setOnHierarchyChangeListener(this);
        setClipChildren(false);
        this.f22655z.k("scroll");
    }

    private boolean B() {
        return false;
    }

    private boolean C(View view) {
        return v(view) == 0;
    }

    private int D(int i10) {
        int max = Math.max(0, computeHorizontalScrollRange() - getWidth());
        if (getFlingAnimator() == this.f22623F) {
            return f.o(this, i10, 0, max, 0).x;
        }
        return t(i10) + f.l(this, getScrollX(), getReactScrollViewScrollState().b().x, i10);
    }

    private void E(int i10, int i11) {
        if (getFlingAnimator().isRunning()) {
            getFlingAnimator().cancel();
        }
        OverScroller overScroller = this.f22631c;
        if (overScroller == null || overScroller.isFinished()) {
            return;
        }
        int currX = this.f22631c.getCurrX();
        boolean computeScrollOffset = this.f22631c.computeScrollOffset();
        this.f22631c.forceFinished(true);
        if (!computeScrollOffset) {
            scrollTo(i10 + (this.f22631c.getCurrX() - currX), getScrollY());
            return;
        }
        this.f22631c.fling(i10, getScrollY(), (int) (this.f22631c.getCurrVelocity() * Math.signum(this.f22631c.getFinalX() - this.f22631c.getStartX())), 0, 0, i11, 0, 0);
    }

    private void F(View view) {
        int v10 = v(view);
        if (v10 != 0) {
            scrollBy(v10, 0);
        }
    }

    private void J(int i10, int i11) {
        if (f22613i0) {
            AbstractC1721a.u(f22614j0, "setPendingContentOffsets[%d] x %d y %d", Integer.valueOf(getId()), Integer.valueOf(i10), Integer.valueOf(i11));
        }
        if (y()) {
            this.f22619B = -1;
            this.f22620C = -1;
        } else {
            this.f22619B = i10;
            this.f22620C = i11;
        }
    }

    private void K(int i10) {
        if (f22613i0) {
            AbstractC1721a.t(f22614j0, "smoothScrollAndSnap[%d] velocity %d", Integer.valueOf(getId()), Integer.valueOf(i10));
        }
        double snapInterval = getSnapInterval();
        double l10 = f.l(this, getScrollX(), getReactScrollViewScrollState().b().x, i10);
        double D10 = D(i10);
        double d10 = l10 / snapInterval;
        int floor = (int) Math.floor(d10);
        int ceil = (int) Math.ceil(d10);
        int round = (int) Math.round(d10);
        int round2 = (int) Math.round(D10 / snapInterval);
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
            this.f22634f = true;
            c((int) d11, getScrollY());
        }
    }

    private void L(int i10) {
        if (f22613i0) {
            AbstractC1721a.t(f22614j0, "smoothScrollToNextPage[%d] direction %d", Integer.valueOf(getId()), Integer.valueOf(i10));
        }
        int width = getWidth();
        int scrollX = getScrollX();
        int i11 = scrollX / width;
        if (scrollX % width != 0) {
            i11++;
        }
        int i12 = i10 == 17 ? i11 - 1 : i11 + 1;
        if (i12 < 0) {
            i12 = 0;
        }
        c(i12 * width, getScrollY());
        x(0, 0);
    }

    private View getContentView() {
        return getChildAt(0);
    }

    private OverScroller getOverScrollerFromParent() {
        if (!f22617m0) {
            f22617m0 = true;
            try {
                Field declaredField = HorizontalScrollView.class.getDeclaredField("mScroller");
                f22616l0 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                AbstractC1721a.J(f22614j0, "Failed to get mScroller field for HorizontalScrollView! This app will exhibit the bounce-back scrolling bug :(");
            }
        }
        Field field = f22616l0;
        OverScroller overScroller = null;
        if (field != null) {
            try {
                Object obj = field.get(this);
                if (obj instanceof OverScroller) {
                    overScroller = (OverScroller) obj;
                } else {
                    AbstractC1721a.J(f22614j0, "Failed to cast mScroller field in HorizontalScrollView (probably due to OEM changes to AOSP)! This app will exhibit the bounce-back scrolling bug :(");
                }
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("Failed to get mScroller from HorizontalScrollView!", e10);
            }
        }
        return overScroller;
    }

    private int getSnapInterval() {
        int i10 = this.f22650u;
        return i10 != 0 ? i10 : getWidth();
    }

    private void l(int i10, int i11, int i12, int i13) {
        if (getFlingAnimator().isRunning()) {
            getFlingAnimator().end();
        }
        int i14 = i11 - i10;
        int scrollX = i14 - (i13 - getScrollX());
        scrollTo(scrollX, getScrollY());
        E(scrollX, i14 - getWidth());
    }

    private void m() {
        Runnable runnable = this.f22640k;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f22640k = null;
            getFlingAnimator().cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        if (B()) {
            AbstractC4012a.c(null);
            AbstractC4012a.c(this.f22646q);
            throw null;
        }
    }

    private void o() {
        if (B()) {
            AbstractC4012a.c(null);
            AbstractC4012a.c(this.f22646q);
            throw null;
        }
    }

    private static HorizontalScrollView p(View view, MotionEvent motionEvent) {
        return q(view, motionEvent, true);
    }

    private static HorizontalScrollView q(View view, MotionEvent motionEvent, boolean z10) {
        if (view == null) {
            return null;
        }
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        if (!rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
            return null;
        }
        if (!z10 && (view instanceof HorizontalScrollView) && AbstractC1484a0.V(view) && (view instanceof b) && ((b) view).f22642m) {
            return (HorizontalScrollView) view;
        }
        if (view instanceof ViewGroup) {
            int i10 = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i10 >= viewGroup.getChildCount()) {
                    break;
                }
                HorizontalScrollView q10 = q(viewGroup.getChildAt(i10), motionEvent, false);
                if (q10 != null) {
                    return q10;
                }
                i10++;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s(int i10) {
        int i11;
        int floor;
        int min;
        int i12;
        int i13;
        OverScroller overScroller;
        if (f22613i0) {
            AbstractC1721a.t(f22614j0, "smoothScrollAndSnap[%d] velocityX %d", Integer.valueOf(getId()), Integer.valueOf(i10));
        }
        if (getChildCount() <= 0) {
            return;
        }
        if (this.f22650u == 0 && this.f22651v == null && this.f22654y == 0) {
            K(i10);
            return;
        }
        boolean z10 = getFlingAnimator() != this.f22623F;
        int max = Math.max(0, computeHorizontalScrollRange() - getWidth());
        int D10 = D(i10);
        if (this.f22649t) {
            D10 = getScrollX();
        }
        int width = (getWidth() - AbstractC1484a0.F(this)) - AbstractC1484a0.E(this);
        int layoutDirection = G4.a.o() ? getLayoutDirection() : this.f22622E.d();
        if (layoutDirection == 1) {
            D10 = max - D10;
            i11 = -i10;
        } else {
            i11 = i10;
        }
        List list = this.f22651v;
        if (list == null || list.isEmpty()) {
            int i14 = this.f22654y;
            if (i14 != 0) {
                int i15 = this.f22650u;
                if (i15 > 0) {
                    double d10 = D10 / i15;
                    double floor2 = Math.floor(d10);
                    int i16 = this.f22650u;
                    floor = Math.max(u(i14, (int) (floor2 * i16), i16, width), 0);
                    int i17 = this.f22654y;
                    double ceil = Math.ceil(d10);
                    int i18 = this.f22650u;
                    min = Math.min(u(i17, (int) (ceil * i18), i18, width), max);
                    i12 = max;
                    i13 = 0;
                } else {
                    ViewGroup viewGroup = (ViewGroup) getContentView();
                    int i19 = max;
                    int i20 = i19;
                    int i21 = 0;
                    int i22 = 0;
                    for (int i23 = 0; i23 < viewGroup.getChildCount(); i23++) {
                        View childAt = viewGroup.getChildAt(i23);
                        int u10 = u(this.f22654y, childAt.getLeft(), childAt.getWidth(), width);
                        if (u10 <= D10 && D10 - u10 < D10 - i21) {
                            i21 = u10;
                        }
                        if (u10 >= D10 && u10 - D10 < i20 - D10) {
                            i20 = u10;
                        }
                        i19 = Math.min(i19, u10);
                        i22 = Math.max(i22, u10);
                    }
                    int max2 = Math.max(i21, i19);
                    min = Math.min(i20, i22);
                    i12 = max;
                    floor = max2;
                }
            } else {
                double snapInterval = getSnapInterval();
                double d11 = D10 / snapInterval;
                floor = (int) (Math.floor(d11) * snapInterval);
                min = Math.min((int) (Math.ceil(d11) * snapInterval), max);
                i12 = max;
            }
            i13 = 0;
        } else {
            i13 = ((Integer) this.f22651v.get(0)).intValue();
            List list2 = this.f22651v;
            i12 = ((Integer) list2.get(list2.size() - 1)).intValue();
            min = max;
            floor = 0;
            for (int i24 = 0; i24 < this.f22651v.size(); i24++) {
                int intValue = ((Integer) this.f22651v.get(i24)).intValue();
                if (intValue <= D10 && D10 - intValue < D10 - floor) {
                    floor = intValue;
                }
                if (intValue >= D10 && intValue - D10 < min - D10) {
                    min = intValue;
                }
            }
        }
        int i25 = D10 - floor;
        int i26 = min - D10;
        int i27 = Math.abs(i25) < Math.abs(i26) ? floor : min;
        int scrollX = getScrollX();
        if (layoutDirection == 1) {
            scrollX = max - scrollX;
        }
        if (this.f22653x || D10 < i12) {
            if (this.f22652w || D10 > i13) {
                if (i11 > 0) {
                    if (!z10) {
                        i11 += (int) (i26 * 10.0d);
                    }
                    D10 = min;
                } else if (i11 < 0) {
                    if (!z10) {
                        i11 -= (int) (i25 * 10.0d);
                    }
                    D10 = floor;
                } else {
                    D10 = i27;
                }
            } else if (scrollX > i13) {
                D10 = i13;
            }
        } else if (scrollX < i12) {
            D10 = i12;
        }
        int min2 = Math.min(Math.max(0, D10), max);
        if (layoutDirection == 1) {
            min2 = max - min2;
            i11 = -i11;
        }
        int i28 = min2;
        if (z10 || (overScroller = this.f22631c) == null) {
            c(i28, getScrollY());
            return;
        }
        this.f22634f = true;
        overScroller.fling(getScrollX(), getScrollY(), i11 != 0 ? i11 : i28 - getScrollX(), 0, i28, i28, 0, 0, (i28 == 0 || i28 == max) ? width / 2 : 0, 0);
        postInvalidateOnAnimation();
    }

    private int u(int i10, int i11, int i12, int i13) {
        int i14;
        if (i10 == 1) {
            return i11;
        }
        if (i10 == 2) {
            i14 = (i13 - i12) / 2;
        } else {
            if (i10 != 3) {
                throw new IllegalStateException("Invalid SnapToAlignment value: " + this.f22654y);
            }
            i14 = i13 - i12;
        }
        return i11 - i14;
    }

    private int v(View view) {
        view.getDrawingRect(this.f22637h0);
        offsetDescendantRectToMyCoords(view, this.f22637h0);
        return computeScrollDeltaToGetChildRectOnScreen(this.f22637h0);
    }

    private void x(int i10, int i11) {
        if (f22613i0) {
            AbstractC1721a.u(f22614j0, "handlePostTouchScrolling[%d] velocityX %d velocityY %d", Integer.valueOf(getId()), Integer.valueOf(i10), Integer.valueOf(i11));
        }
        if (this.f22640k != null) {
            return;
        }
        if (this.f22645p) {
            f.h(this, i10, i11);
        }
        this.f22634f = false;
        a aVar = new a();
        this.f22640k = aVar;
        AbstractC1484a0.j0(this, aVar, 20L);
    }

    private boolean y() {
        View contentView = getContentView();
        return (contentView == null || contentView.getWidth() == 0 || contentView.getHeight() == 0) ? false : true;
    }

    private boolean z(View view) {
        int v10 = v(view);
        view.getDrawingRect(this.f22637h0);
        return v10 != 0 && Math.abs(v10) < this.f22637h0.width() / 2;
    }

    public boolean A(View view) {
        int v10 = v(view);
        view.getDrawingRect(this.f22637h0);
        return v10 != 0 && Math.abs(v10) < this.f22637h0.width();
    }

    public void G(int i10, Integer num) {
        if (G4.a.c()) {
            C1931a.k(this, j.values()[i10], num);
        } else {
            this.f22655z.f(i10, num);
        }
    }

    public void H(float f10, int i10) {
        if (G4.a.c()) {
            C1931a.l(this, EnumC3081c.values()[i10], Float.isNaN(f10) ? null : new X(C1944g0.e(f10), Y.POINT));
        } else {
            this.f22655z.h(f10, i10);
        }
    }

    public void I(int i10, float f10) {
        if (G4.a.c()) {
            C1931a.n(this, j.values()[i10], Float.valueOf(C1944g0.e(f10)));
        } else {
            this.f22655z.j(i10, f10);
        }
    }

    @Override // com.facebook.react.views.scroll.f.a
    public void a(int i10, int i11) {
        this.f22623F.cancel();
        int k10 = f.k(getContext());
        this.f22623F.setDuration(k10).setIntValues(i10, i11);
        this.f22623F.start();
        if (this.f22645p) {
            f.h(this, k10 > 0 ? (i11 - i10) / k10 : 0, 0);
            f.a(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList arrayList, int i10, int i11) {
        if (!this.f22639j || this.f22618A) {
            super.addFocusables(arrayList, i10, i11);
            return;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        super.addFocusables(arrayList2, i10, i11);
        Iterator<View> it = arrayList2.iterator();
        while (it.hasNext()) {
            View next = it.next();
            if (C(next) || A(next) || next.isFocused()) {
                arrayList.add(next);
            }
        }
    }

    @Override // android.widget.HorizontalScrollView
    public boolean arrowScroll(int i10) {
        if (!this.f22639j) {
            return super.arrowScroll(i10);
        }
        boolean z10 = true;
        this.f22618A = true;
        if (getChildCount() > 0) {
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus(), i10);
            View contentView = getContentView();
            if (contentView == null || findNextFocus == null || findNextFocus.getParent() != contentView) {
                L(i10);
            } else {
                if (!C(findNextFocus) && !z(findNextFocus)) {
                    L(i10);
                }
                findNextFocus.requestFocus();
            }
        } else {
            z10 = false;
        }
        this.f22618A = false;
        return z10;
    }

    @Override // com.facebook.react.views.scroll.f.d
    public void b(int i10, int i11) {
        scrollTo(i10, i11);
        E(i10, Integer.MAX_VALUE);
    }

    @Override // com.facebook.react.views.scroll.f.d
    public void c(int i10, int i11) {
        f.q(this, i10, i11);
        J(i10, i11);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i10) {
        return this.f22642m && super.canScrollHorizontally(i10);
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if (EnumC1946h0.canChildrenBeTouchTarget(this.f22624G)) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        return false;
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void draw(Canvas canvas) {
        if (this.f22648s != 0) {
            View contentView = getContentView();
            if (this.f22647r != null && contentView != null && contentView.getRight() < getWidth()) {
                this.f22647r.setBounds(contentView.getRight(), 0, getWidth(), getHeight());
                this.f22647r.draw(canvas);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.HorizontalScrollView
    public boolean executeKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (this.f22642m || !(keyCode == 21 || keyCode == 22)) {
            return super.executeKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.widget.HorizontalScrollView
    public void fling(int i10) {
        if (f22613i0) {
            AbstractC1721a.t(f22614j0, "fling[%d] velocityX %d", Integer.valueOf(getId()), Integer.valueOf(i10));
        }
        if (Build.VERSION.SDK_INT == 28) {
            i10 = (int) (Math.abs(i10) * Math.signum(this.f22630b.a()));
        }
        if (this.f22639j) {
            s(i10);
        } else if (this.f22631c != null) {
            this.f22631c.fling(getScrollX(), getScrollY(), i10, 0, 0, Integer.MAX_VALUE, 0, 0, ((getWidth() - AbstractC1484a0.F(this)) - AbstractC1484a0.E(this)) / 2, 0);
            AbstractC1484a0.h0(this);
        } else {
            super.fling(i10);
        }
        x(i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean getChildVisibleRect(View view, Rect rect, Point point) {
        return super.getChildVisibleRect(view, rect, point);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1952k0
    public void getClippingRect(Rect rect) {
        rect.set((Rect) AbstractC4012a.c(this.f22635g));
    }

    @Override // com.facebook.react.views.scroll.f.a
    public ValueAnimator getFlingAnimator() {
        return this.f22623F;
    }

    @Override // com.facebook.react.views.scroll.f.b
    public long getLastScrollDispatchTime() {
        return this.f22625H;
    }

    @Override // com.facebook.react.uimanager.InterfaceC1960o0
    public String getOverflow() {
        int i10 = C0388b.f22659a[this.f22636h.ordinal()];
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
        return this.f22633e;
    }

    public EnumC1946h0 getPointerEvents() {
        return this.f22624G;
    }

    @Override // com.facebook.react.views.scroll.f.c
    public f.g getReactScrollViewScrollState() {
        return this.f22622E;
    }

    @Override // com.facebook.react.uimanager.InterfaceC1952k0
    public boolean getRemoveClippedSubviews() {
        return this.f22641l;
    }

    public boolean getScrollEnabled() {
        return this.f22642m;
    }

    @Override // com.facebook.react.views.scroll.f.b
    public int getScrollEventThrottle() {
        return this.f22626I;
    }

    @Override // com.facebook.react.views.scroll.f.e
    public E0 getStateWrapper() {
        return this.f22621D;
    }

    public void k() {
        OverScroller overScroller = this.f22631c;
        if (overScroller == null || overScroller.isFinished()) {
            return;
        }
        this.f22631c.abortAnimation();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f22641l) {
            updateClippingRect();
        }
        com.facebook.react.views.scroll.a aVar = this.f22628K;
        if (aVar != null) {
            aVar.f();
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewAdded(View view, View view2) {
        this.f22627J = view2;
        view2.addOnLayoutChangeListener(this);
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewRemoved(View view, View view2) {
        View view3 = this.f22627J;
        if (view3 != null) {
            view3.removeOnLayoutChangeListener(this);
        }
        this.f22627J = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.facebook.react.views.scroll.a aVar = this.f22628K;
        if (aVar != null) {
            aVar.g();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (!G4.a.c()) {
            this.f22655z.d(canvas);
        } else if (this.f22636h != k.VISIBLE) {
            C1931a.a(this, canvas);
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f22642m) {
            return false;
        }
        if (motionEvent.getAction() == 0 && p(this, motionEvent) != null) {
            return false;
        }
        if (!EnumC1946h0.canChildrenBeTouchTarget(this.f22624G)) {
            return true;
        }
        try {
            if (super.onInterceptTouchEvent(motionEvent)) {
                w(motionEvent);
                return true;
            }
        } catch (IllegalArgumentException e10) {
            AbstractC1721a.K("ReactNative", "Error intercepting touch event.", e10);
        }
        return false;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        OverScroller overScroller;
        if (f22613i0) {
            AbstractC1721a.w(f22614j0, "onLayout[%d] l %d t %d r %d b %d", Integer.valueOf(getId()), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
        }
        int i14 = this.f22629a;
        if (i14 != f22615k0 && (overScroller = this.f22631c) != null && i14 != overScroller.getFinalX() && !this.f22631c.isFinished()) {
            if (f22613i0) {
                AbstractC1721a.t(f22614j0, "onLayout[%d] scroll hack enabled: reset to previous scrollX position of %d", Integer.valueOf(getId()), Integer.valueOf(this.f22629a));
            }
            OverScroller overScroller2 = this.f22631c;
            overScroller2.startScroll(this.f22629a, overScroller2.getFinalY(), 0, 0);
            this.f22631c.forceFinished(true);
            this.f22629a = f22615k0;
        }
        if (y()) {
            int i15 = this.f22619B;
            if (i15 == -1) {
                i15 = getScrollX();
            }
            int i16 = this.f22620C;
            if (i16 == -1) {
                i16 = getScrollY();
            }
            scrollTo(i15, i16);
        }
        f.b(this);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        if (this.f22627J == null) {
            return;
        }
        if ((G4.a.o() ? view.getLayoutDirection() : this.f22622E.d()) == 1) {
            l(i10, i12, i14, i16);
            return;
        }
        com.facebook.react.views.scroll.a aVar = this.f22628K;
        if (aVar != null) {
            aVar.h();
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        OverScroller overScroller;
        C1932a0.a(i10, i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (f22613i0) {
            AbstractC1721a.u(f22614j0, "onMeasure[%d] measured width: %d measured height: %d", Integer.valueOf(getId()), Integer.valueOf(size), Integer.valueOf(size2));
        }
        boolean z10 = getMeasuredHeight() != size2;
        setMeasuredDimension(size, size2);
        if (!z10 || (overScroller = this.f22631c) == null) {
            return;
        }
        this.f22629a = overScroller.getCurrX();
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    protected void onOverScrolled(int i10, int i11, boolean z10, boolean z11) {
        int max;
        if (f22613i0) {
            AbstractC1721a.w(f22614j0, "onOverScrolled[%d] scrollX %d scrollY %d clampedX %b clampedY %b", Integer.valueOf(getId()), Integer.valueOf(i10), Integer.valueOf(i11), Boolean.valueOf(z10), Boolean.valueOf(z11));
        }
        OverScroller overScroller = this.f22631c;
        if (overScroller != null && !overScroller.isFinished() && this.f22631c.getCurrX() != this.f22631c.getFinalX() && i10 >= (max = Math.max(computeHorizontalScrollRange() - getWidth(), 0))) {
            this.f22631c.abortAnimation();
            i10 = max;
        }
        super.onOverScrolled(i10, i11, z10, z11);
    }

    @Override // android.view.View
    protected void onScrollChanged(int i10, int i11, int i12, int i13) {
        if (f22613i0) {
            AbstractC1721a.w(f22614j0, "onScrollChanged[%d] x %d y %d oldx %d oldy %d", Integer.valueOf(getId()), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
        }
        super.onScrollChanged(i10, i11, i12, i13);
        this.f22634f = true;
        if (this.f22630b.c(i10, i11)) {
            if (this.f22641l) {
                updateClippingRect();
            }
            if (this.f22643n) {
                return;
            }
            this.f22643n = true;
            f.t(this, this.f22630b.a(), this.f22630b.b(), this.f22644o);
            this.f22643n = false;
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (this.f22641l) {
            updateClippingRect();
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f22642m || !EnumC1946h0.canBeTouchTarget(this.f22624G)) {
            return false;
        }
        this.f22632d.a(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 && this.f22638i) {
            f.r(this);
            float b10 = this.f22632d.b();
            float c10 = this.f22632d.c();
            f.d(this, b10, c10);
            l.a(this, motionEvent);
            this.f22638i = false;
            x(Math.round(b10), Math.round(c10));
        }
        if (actionMasked == 0) {
            m();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.HorizontalScrollView
    public boolean pageScroll(int i10) {
        boolean pageScroll = super.pageScroll(i10);
        if (this.f22639j && pageScroll) {
            x(0, 0);
        }
        return pageScroll;
    }

    public void r() {
        awakenScrollBars();
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (view2 != null && !this.f22639j) {
            F(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void scrollTo(int i10, int i11) {
        if (f22613i0) {
            AbstractC1721a.u(f22614j0, "scrollTo[%d] x %d y %d", Integer.valueOf(getId()), Integer.valueOf(i10), Integer.valueOf(i11));
        }
        super.scrollTo(i10, i11);
        f.r(this);
        J(i10, i11);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (G4.a.c()) {
            C1931a.i(this, Integer.valueOf(i10));
        } else {
            this.f22655z.e(i10);
        }
    }

    public void setBorderRadius(float f10) {
        H(f10, EnumC3081c.BORDER_RADIUS.ordinal());
    }

    public void setBorderStyle(String str) {
        if (G4.a.c()) {
            C1931a.m(this, str == null ? null : EnumC3083e.fromString(str));
        } else {
            this.f22655z.i(str);
        }
    }

    public void setDecelerationRate(float f10) {
        getReactScrollViewScrollState().i(f10);
        OverScroller overScroller = this.f22631c;
        if (overScroller != null) {
            overScroller.setFriction(1.0f - f10);
        }
    }

    public void setDisableIntervalMomentum(boolean z10) {
        this.f22649t = z10;
    }

    public void setEnableSyncOnScroll(boolean z10) {
        this.f22644o = z10;
    }

    public void setEndFillColor(int i10) {
        if (i10 != this.f22648s) {
            this.f22648s = i10;
            this.f22647r = new ColorDrawable(this.f22648s);
        }
    }

    @Override // com.facebook.react.views.scroll.f.b
    public void setLastScrollDispatchTime(long j10) {
        this.f22625H = j10;
    }

    public void setMaintainVisibleContentPosition(a.b bVar) {
        com.facebook.react.views.scroll.a aVar;
        if (bVar != null && this.f22628K == null) {
            com.facebook.react.views.scroll.a aVar2 = new com.facebook.react.views.scroll.a(this, true);
            this.f22628K = aVar2;
            aVar2.f();
        } else if (bVar == null && (aVar = this.f22628K) != null) {
            aVar.g();
            this.f22628K = null;
        }
        com.facebook.react.views.scroll.a aVar3 = this.f22628K;
        if (aVar3 != null) {
            aVar3.e(bVar);
        }
    }

    public void setOverflow(String str) {
        if (str == null) {
            this.f22636h = k.SCROLL;
        } else {
            k fromString = k.fromString(str);
            if (fromString == null) {
                fromString = k.SCROLL;
            }
            this.f22636h = fromString;
        }
        com.facebook.react.views.view.g gVar = this.f22655z;
        if (str == null) {
            str = "scroll";
        }
        gVar.k(str);
        invalidate();
    }

    @Override // com.facebook.react.uimanager.InterfaceC1962p0
    public void setOverflowInset(int i10, int i11, int i12, int i13) {
        this.f22633e.set(i10, i11, i12, i13);
    }

    public void setPagingEnabled(boolean z10) {
        this.f22639j = z10;
    }

    public void setPointerEvents(EnumC1946h0 enumC1946h0) {
        this.f22624G = enumC1946h0;
    }

    public void setRemoveClippedSubviews(boolean z10) {
        if (z10 && this.f22635g == null) {
            this.f22635g = new Rect();
        }
        this.f22641l = z10;
        updateClippingRect();
    }

    public void setScrollEnabled(boolean z10) {
        this.f22642m = z10;
    }

    public void setScrollEventThrottle(int i10) {
        this.f22626I = i10;
    }

    public void setScrollPerfTag(String str) {
        this.f22646q = str;
    }

    public void setSendMomentumEvents(boolean z10) {
        this.f22645p = z10;
    }

    public void setSnapInterval(int i10) {
        this.f22650u = i10;
    }

    public void setSnapOffsets(List<Integer> list) {
        this.f22651v = list;
    }

    public void setSnapToAlignment(int i10) {
        this.f22654y = i10;
    }

    public void setSnapToEnd(boolean z10) {
        this.f22653x = z10;
    }

    public void setSnapToStart(boolean z10) {
        this.f22652w = z10;
    }

    public void setStateWrapper(E0 e02) {
        this.f22621D = e02;
    }

    public int t(int i10) {
        return f.o(this, i10, 0, Math.max(0, computeHorizontalScrollRange() - getWidth()), 0).x;
    }

    @Override // com.facebook.react.uimanager.InterfaceC1952k0
    public void updateClippingRect() {
        if (this.f22641l) {
            AbstractC4012a.c(this.f22635g);
            AbstractC1954l0.a(this, this.f22635g);
            KeyEvent.Callback contentView = getContentView();
            if (contentView instanceof InterfaceC1952k0) {
                ((InterfaceC1952k0) contentView).updateClippingRect();
            }
        }
    }

    protected void w(MotionEvent motionEvent) {
        l.b(this, motionEvent);
        f.c(this);
        this.f22638i = true;
        o();
        getFlingAnimator().cancel();
    }
}
