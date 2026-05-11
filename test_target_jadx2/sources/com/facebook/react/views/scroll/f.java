package com.facebook.react.views.scroll;

import a5.C1351a;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.widget.OverScroller;
import c3.AbstractC1721a;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.C1944g0;
import com.facebook.react.uimanager.E0;
import com.facebook.react.uimanager.L0;
import com.facebook.react.uimanager.events.EventDispatcher;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f22710c = false;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f22713f;

    /* renamed from: a, reason: collision with root package name */
    public static final f f22708a = new f();

    /* renamed from: b, reason: collision with root package name */
    private static final String f22709b = com.facebook.react.views.scroll.b.class.getSimpleName();

    /* renamed from: d, reason: collision with root package name */
    private static final CopyOnWriteArrayList f22711d = new CopyOnWriteArrayList();

    /* renamed from: e, reason: collision with root package name */
    private static int f22712e = 250;

    public interface a {
        void a(int i10, int i11);

        ValueAnimator getFlingAnimator();
    }

    public interface b {
        long getLastScrollDispatchTime();

        int getScrollEventThrottle();

        void setLastScrollDispatchTime(long j10);
    }

    public interface c {
        g getReactScrollViewScrollState();
    }

    public interface d {
        void b(int i10, int i11);

        void c(int i10, int i11);
    }

    public interface e {
        E0 getStateWrapper();
    }

    /* renamed from: com.facebook.react.views.scroll.f$f, reason: collision with other inner class name */
    private static final class C0389f extends OverScroller {

        /* renamed from: a, reason: collision with root package name */
        private int f22714a;

        public C0389f(Context context) {
            super(context);
            this.f22714a = 250;
        }

        public final int a() {
            super.startScroll(0, 0, 0, 0);
            return this.f22714a;
        }

        @Override // android.widget.OverScroller
        public void startScroll(int i10, int i11, int i12, int i13, int i14) {
            this.f22714a = i14;
        }
    }

    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        private final int f22715a;

        /* renamed from: c, reason: collision with root package name */
        private int f22717c;

        /* renamed from: e, reason: collision with root package name */
        private boolean f22719e;

        /* renamed from: b, reason: collision with root package name */
        private final Point f22716b = new Point();

        /* renamed from: d, reason: collision with root package name */
        private final Point f22718d = new Point(-1, -1);

        /* renamed from: f, reason: collision with root package name */
        private boolean f22720f = true;

        /* renamed from: g, reason: collision with root package name */
        private float f22721g = 0.985f;

        public g(int i10) {
            this.f22715a = i10;
        }

        public final float a() {
            return this.f22721g;
        }

        public final Point b() {
            return this.f22716b;
        }

        public final Point c() {
            return this.f22718d;
        }

        public final int d() {
            return this.f22715a;
        }

        public final int e() {
            return this.f22717c;
        }

        public final boolean f() {
            return this.f22719e;
        }

        public final boolean g() {
            return this.f22720f;
        }

        public final void h(boolean z10) {
            this.f22719e = z10;
        }

        public final void i(float f10) {
            this.f22721g = f10;
        }

        public final g j(int i10, int i11) {
            this.f22716b.set(i10, i11);
            return this;
        }

        public final void k(boolean z10) {
            this.f22720f = z10;
        }

        public final g l(int i10, int i11) {
            this.f22718d.set(i10, i11);
            return this;
        }

        public final void m(int i10) {
            this.f22717c = i10;
        }
    }

    public static final class h implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f22722a;

        h(ViewGroup viewGroup) {
            this.f22722a = viewGroup;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
            f.i(this.f22722a);
            animator.removeListener(this);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
            f.i(this.f22722a);
            animator.removeListener(this);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }
    }

    public static final class i implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f22723a;

        i(ViewGroup viewGroup) {
            this.f22723a = viewGroup;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
            ((c) this.f22723a).getReactScrollViewScrollState().h(true);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
            ((c) this.f22723a).getReactScrollViewScrollState().k(true);
            f.r(this.f22723a);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
            g reactScrollViewScrollState = ((c) this.f22723a).getReactScrollViewScrollState();
            reactScrollViewScrollState.h(false);
            reactScrollViewScrollState.k(false);
        }
    }

    private f() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(ViewGroup viewGroup) {
        ((a) viewGroup).getFlingAnimator().addListener(new h(viewGroup));
    }

    public static final void b(ViewGroup scrollView) {
        Intrinsics.checkNotNullParameter(scrollView, "scrollView");
        Iterator it = f22711d.iterator();
        while (it.hasNext()) {
            android.support.v4.media.session.b.a(((WeakReference) it.next()).get());
        }
    }

    public static final void c(ViewGroup viewGroup) {
        f22708a.e(viewGroup, com.facebook.react.views.scroll.h.BEGIN_DRAG);
    }

    public static final void d(ViewGroup viewGroup, float f10, float f11) {
        g(f22708a, viewGroup, com.facebook.react.views.scroll.h.END_DRAG, f10, f11, false, 16, null);
    }

    private final void e(ViewGroup viewGroup, com.facebook.react.views.scroll.h hVar) {
        g(this, viewGroup, hVar, 0.0f, 0.0f, false, 16, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void f(ViewGroup viewGroup, com.facebook.react.views.scroll.h hVar, float f10, float f11, boolean z10) {
        View childAt;
        long currentTimeMillis = System.currentTimeMillis();
        if (r3.getScrollEventThrottle() < Math.max(17L, currentTimeMillis - ((b) viewGroup).getLastScrollDispatchTime()) && (childAt = viewGroup.getChildAt(0)) != null) {
            Iterator it = f22711d.iterator();
            while (it.hasNext()) {
                android.support.v4.media.session.b.a(((WeakReference) it.next()).get());
            }
            Context context = viewGroup.getContext();
            Intrinsics.e(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            ReactContext reactContext = (ReactContext) context;
            int e10 = L0.e(reactContext);
            EventDispatcher c10 = L0.c(reactContext, viewGroup.getId());
            if (c10 != null) {
                c10.c(com.facebook.react.views.scroll.g.f22724k.a(e10, viewGroup.getId(), hVar, viewGroup.getScrollX(), viewGroup.getScrollY(), f10, f11, childAt.getWidth(), childAt.getHeight(), viewGroup.getWidth(), viewGroup.getHeight(), z10));
                ((b) viewGroup).setLastScrollDispatchTime(currentTimeMillis);
            }
        }
    }

    static /* synthetic */ void g(f fVar, ViewGroup viewGroup, com.facebook.react.views.scroll.h hVar, float f10, float f11, boolean z10, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            z10 = false;
        }
        fVar.f(viewGroup, hVar, f10, f11, z10);
    }

    public static final void h(ViewGroup viewGroup, int i10, int i11) {
        g(f22708a, viewGroup, com.facebook.react.views.scroll.h.MOMENTUM_BEGIN, i10, i11, false, 16, null);
    }

    public static final void i(ViewGroup viewGroup) {
        f22708a.e(viewGroup, com.facebook.react.views.scroll.h.MOMENTUM_END);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void j(ViewGroup viewGroup) {
        int i10;
        g reactScrollViewScrollState = ((c) viewGroup).getReactScrollViewScrollState();
        int e10 = reactScrollViewScrollState.e();
        Point c10 = reactScrollViewScrollState.c();
        int i11 = c10.x;
        int i12 = c10.y;
        if (reactScrollViewScrollState.d() == 1) {
            View childAt = viewGroup.getChildAt(0);
            i10 = -(((childAt != null ? childAt.getWidth() : 0) - i11) - viewGroup.getWidth());
        } else {
            i10 = i11;
        }
        if (f22710c) {
            AbstractC1721a.v(f22709b, "updateFabricScrollState[%d] scrollX %d scrollY %d fabricScrollX %d", Integer.valueOf(viewGroup.getId()), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i10));
        }
        E0 stateWrapper = ((e) viewGroup).getStateWrapper();
        if (stateWrapper != null) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putDouble("contentOffsetLeft", C1944g0.e(i11));
            writableNativeMap.putDouble("contentOffsetTop", C1944g0.e(i12));
            writableNativeMap.putDouble("scrollAwayPaddingTop", C1944g0.e(e10));
            stateWrapper.updateState(writableNativeMap);
        }
    }

    public static final int k(Context context) {
        if (!f22713f) {
            f22713f = true;
            try {
                f22712e = new C0389f(context).a();
            } catch (Throwable unused) {
            }
        }
        return f22712e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int l(ViewGroup viewGroup, int i10, int i11, int i12) {
        g reactScrollViewScrollState = ((c) viewGroup).getReactScrollViewScrollState();
        return (!reactScrollViewScrollState.g() || (reactScrollViewScrollState.f() && ((i12 != 0 ? i12 / Math.abs(i12) : 0) * (i11 - i10) > 0))) ? i11 : i10;
    }

    public static final int m(String str) {
        if (str == null) {
            return 1;
        }
        int hashCode = str.hashCode();
        if (hashCode != -1414557169) {
            if (hashCode != 3005871) {
                if (hashCode == 104712844 && str.equals("never")) {
                    return 2;
                }
            } else if (str.equals("auto")) {
                return 1;
            }
        } else if (str.equals("always")) {
            return 0;
        }
        AbstractC1721a.J("ReactNative", "wrong overScrollMode: " + str);
        return 1;
    }

    public static final int n(String str) {
        if (str == null) {
            return 0;
        }
        if (StringsKt.r("start", str, true)) {
            return 1;
        }
        if (StringsKt.r("center", str, true)) {
            return 2;
        }
        if (Intrinsics.b("end", str)) {
            return 3;
        }
        AbstractC1721a.J("ReactNative", "wrong snap alignment value: " + str);
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Point o(ViewGroup viewGroup, int i10, int i11, int i12, int i13) {
        g reactScrollViewScrollState = ((c) viewGroup).getReactScrollViewScrollState();
        OverScroller overScroller = new OverScroller(viewGroup.getContext());
        overScroller.setFriction(1.0f - reactScrollViewScrollState.a());
        int width = (viewGroup.getWidth() - viewGroup.getPaddingStart()) - viewGroup.getPaddingEnd();
        int height = (viewGroup.getHeight() - viewGroup.getPaddingBottom()) - viewGroup.getPaddingTop();
        Point b10 = reactScrollViewScrollState.b();
        overScroller.fling(l(viewGroup, viewGroup.getScrollX(), b10.x, i10), l(viewGroup, viewGroup.getScrollY(), b10.y, i11), i10, i11, 0, i12, 0, i13, width / 2, height / 2);
        return new Point(overScroller.getFinalX(), overScroller.getFinalY());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void q(ViewGroup viewGroup, int i10, int i11) {
        if (f22710c) {
            AbstractC1721a.u(f22709b, "smoothScrollTo[%d] x %d y %d", Integer.valueOf(viewGroup.getId()), Integer.valueOf(i10), Integer.valueOf(i11));
        }
        ValueAnimator flingAnimator = ((a) viewGroup).getFlingAnimator();
        if (flingAnimator.getListeners() == null || flingAnimator.getListeners().size() == 0) {
            f22708a.p(viewGroup);
        }
        ((c) viewGroup).getReactScrollViewScrollState().j(i10, i11);
        int scrollX = viewGroup.getScrollX();
        int scrollY = viewGroup.getScrollY();
        if (scrollX != i10) {
            ((a) viewGroup).a(scrollX, i10);
        }
        if (scrollY != i11) {
            ((a) viewGroup).a(scrollY, i11);
        }
        if (G4.a.i()) {
            f22708a.s(viewGroup, i10, i11);
        }
    }

    public static final void r(ViewGroup viewGroup) {
        f22708a.s(viewGroup, viewGroup.getScrollX(), viewGroup.getScrollY());
    }

    public static final void t(ViewGroup viewGroup, float f10, float f11, boolean z10) {
        f fVar = f22708a;
        fVar.s(viewGroup, viewGroup.getScrollX(), viewGroup.getScrollY());
        fVar.f(viewGroup, com.facebook.react.views.scroll.h.SCROLL, f10, f11, z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p(ViewGroup viewGroup) {
        ((a) viewGroup).getFlingAnimator().addListener(new i(viewGroup));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void s(ViewGroup viewGroup, int i10, int i11) {
        if (f22710c) {
            AbstractC1721a.u(f22709b, "updateFabricScrollState[%d] scrollX %d scrollY %d", Integer.valueOf(viewGroup.getId()), Integer.valueOf(i10), Integer.valueOf(i11));
        }
        if (C1351a.a(viewGroup.getId()) == 1) {
            return;
        }
        g reactScrollViewScrollState = ((c) viewGroup).getReactScrollViewScrollState();
        if (reactScrollViewScrollState.c().equals(i10, i11)) {
            return;
        }
        reactScrollViewScrollState.l(i10, i11);
        j(viewGroup);
    }
}
