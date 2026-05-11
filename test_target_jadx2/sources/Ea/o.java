package ea;

import android.content.Context;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.facebook.react.views.textinput.C1992j;
import com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class o extends AbstractC3109d {

    /* renamed from: Q, reason: collision with root package name */
    public static final b f32414Q = new b(null);

    /* renamed from: R, reason: collision with root package name */
    private static final a f32415R = new a();

    /* renamed from: N, reason: collision with root package name */
    private boolean f32416N;

    /* renamed from: O, reason: collision with root package name */
    private boolean f32417O;

    /* renamed from: P, reason: collision with root package name */
    private d f32418P = f32415R;

    public static final class a implements d {
        a() {
        }

        @Override // ea.o.d
        public boolean a() {
            return d.a.d(this);
        }

        @Override // ea.o.d
        public boolean b(MotionEvent motionEvent) {
            return d.a.b(this, motionEvent);
        }

        @Override // ea.o.d
        public boolean c(AbstractC3109d abstractC3109d) {
            return d.a.e(this, abstractC3109d);
        }

        @Override // ea.o.d
        public boolean d() {
            return d.a.f(this);
        }

        @Override // ea.o.d
        public void e(MotionEvent motionEvent) {
            d.a.c(this, motionEvent);
        }

        @Override // ea.o.d
        public void f(MotionEvent motionEvent) {
            d.a.a(this, motionEvent);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean b(View view, MotionEvent motionEvent) {
            return (view instanceof ViewGroup) && ((ViewGroup) view).onInterceptTouchEvent(motionEvent);
        }

        private b() {
        }
    }

    private static final class c implements d {

        /* renamed from: a, reason: collision with root package name */
        private final o f32419a;

        /* renamed from: b, reason: collision with root package name */
        private final C1992j f32420b;

        /* renamed from: c, reason: collision with root package name */
        private float f32421c;

        /* renamed from: d, reason: collision with root package name */
        private float f32422d;

        /* renamed from: e, reason: collision with root package name */
        private int f32423e;

        public c(o handler, C1992j editText) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(editText, "editText");
            this.f32419a = handler;
            this.f32420b = editText;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(editText.getContext());
            this.f32423e = viewConfiguration.getScaledTouchSlop() * viewConfiguration.getScaledTouchSlop();
        }

        @Override // ea.o.d
        public boolean a() {
            return true;
        }

        @Override // ea.o.d
        public boolean b(MotionEvent motionEvent) {
            return d.a.b(this, motionEvent);
        }

        @Override // ea.o.d
        public boolean c(AbstractC3109d handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            return handler.R() > 0 && !(handler instanceof o);
        }

        @Override // ea.o.d
        public boolean d() {
            return true;
        }

        @Override // ea.o.d
        public void e(MotionEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            this.f32419a.i();
            this.f32420b.onTouchEvent(event);
            this.f32421c = event.getX();
            this.f32422d = event.getY();
        }

        @Override // ea.o.d
        public void f(MotionEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            if (((event.getX() - this.f32421c) * (event.getX() - this.f32421c)) + ((event.getY() - this.f32422d) * (event.getY() - this.f32422d)) < this.f32423e) {
                this.f32420b.Q();
            }
        }
    }

    public interface d {

        public static final class a {
            public static void a(d dVar, MotionEvent event) {
                Intrinsics.checkNotNullParameter(event, "event");
            }

            public static boolean b(d dVar, MotionEvent event) {
                Intrinsics.checkNotNullParameter(event, "event");
                return true;
            }

            public static void c(d dVar, MotionEvent event) {
                Intrinsics.checkNotNullParameter(event, "event");
            }

            public static boolean d(d dVar) {
                return false;
            }

            public static boolean e(d dVar, AbstractC3109d handler) {
                Intrinsics.checkNotNullParameter(handler, "handler");
                return false;
            }

            public static boolean f(d dVar) {
                return false;
            }
        }

        boolean a();

        boolean b(MotionEvent motionEvent);

        boolean c(AbstractC3109d abstractC3109d);

        boolean d();

        void e(MotionEvent motionEvent);

        void f(MotionEvent motionEvent);
    }

    private static final class e implements d {
        @Override // ea.o.d
        public boolean a() {
            return true;
        }

        @Override // ea.o.d
        public boolean b(MotionEvent motionEvent) {
            return d.a.b(this, motionEvent);
        }

        @Override // ea.o.d
        public boolean c(AbstractC3109d abstractC3109d) {
            return d.a.e(this, abstractC3109d);
        }

        @Override // ea.o.d
        public boolean d() {
            return d.a.f(this);
        }

        @Override // ea.o.d
        public void e(MotionEvent motionEvent) {
            d.a.c(this, motionEvent);
        }

        @Override // ea.o.d
        public void f(MotionEvent motionEvent) {
            d.a.a(this, motionEvent);
        }
    }

    private static final class f implements d {

        /* renamed from: a, reason: collision with root package name */
        private final o f32424a;

        /* renamed from: b, reason: collision with root package name */
        private final com.facebook.react.views.swiperefresh.a f32425b;

        public f(o handler, com.facebook.react.views.swiperefresh.a swipeRefreshLayout) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(swipeRefreshLayout, "swipeRefreshLayout");
            this.f32424a = handler;
            this.f32425b = swipeRefreshLayout;
        }

        @Override // ea.o.d
        public boolean a() {
            return d.a.d(this);
        }

        @Override // ea.o.d
        public boolean b(MotionEvent motionEvent) {
            return d.a.b(this, motionEvent);
        }

        @Override // ea.o.d
        public boolean c(AbstractC3109d abstractC3109d) {
            return d.a.e(this, abstractC3109d);
        }

        @Override // ea.o.d
        public boolean d() {
            return true;
        }

        @Override // ea.o.d
        public void e(MotionEvent event) {
            ArrayList<AbstractC3109d> o10;
            Intrinsics.checkNotNullParameter(event, "event");
            View childAt = this.f32425b.getChildAt(0);
            r1 = null;
            ScrollView scrollView = childAt instanceof ScrollView ? (ScrollView) childAt : null;
            if (scrollView == null) {
                return;
            }
            C3112g N10 = this.f32424a.N();
            if (N10 != null && (o10 = N10.o(scrollView)) != null) {
                for (AbstractC3109d abstractC3109d : o10) {
                    if (abstractC3109d instanceof o) {
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            if (abstractC3109d == null || abstractC3109d.Q() != 4 || scrollView.getScrollY() <= 0) {
                return;
            }
            this.f32424a.B();
        }

        @Override // ea.o.d
        public void f(MotionEvent motionEvent) {
            d.a.a(this, motionEvent);
        }
    }

    public o() {
        D0(true);
    }

    @Override // ea.AbstractC3109d
    public boolean H0(AbstractC3109d handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        return !this.f32417O;
    }

    @Override // ea.AbstractC3109d
    public boolean I0(AbstractC3109d handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        if (super.I0(handler) || this.f32418P.c(handler)) {
            return true;
        }
        if ((handler instanceof o) && handler.Q() == 4 && ((o) handler).f32417O) {
            return false;
        }
        boolean z10 = this.f32417O;
        return !(Q() == 4 && handler.Q() == 4 && !z10) && Q() == 4 && !z10 && (!this.f32418P.a() || handler.R() > 0);
    }

    public final boolean R0() {
        return this.f32417O;
    }

    public final o S0(boolean z10) {
        this.f32417O = z10;
        return this;
    }

    public final o T0(boolean z10) {
        this.f32416N = z10;
        return this;
    }

    @Override // ea.AbstractC3109d
    protected void f0() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        obtain.setAction(3);
        View U10 = U();
        Intrinsics.d(U10);
        U10.onTouchEvent(obtain);
        obtain.recycle();
    }

    @Override // ea.AbstractC3109d
    protected void g0(MotionEvent event, MotionEvent sourceEvent) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(sourceEvent, "sourceEvent");
        View U10 = U();
        Intrinsics.d(U10);
        Context context = U10.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        boolean c10 = com.swmansion.gesturehandler.react.a.c(context);
        if ((U10 instanceof RNGestureHandlerButtonViewManager.a) && c10) {
            return;
        }
        if (event.getActionMasked() == 1) {
            if (Q() != 0 || this.f32418P.b(event)) {
                U10.onTouchEvent(event);
                if ((Q() == 0 || Q() == 2) && U10.isPressed()) {
                    i();
                }
                if (Q() == 0) {
                    o();
                } else {
                    z();
                }
            } else {
                o();
            }
            this.f32418P.f(event);
            return;
        }
        if (Q() != 0 && Q() != 2) {
            if (Q() == 4) {
                U10.onTouchEvent(event);
                return;
            }
            return;
        }
        if (this.f32416N) {
            f32414Q.b(U10, event);
            U10.onTouchEvent(event);
            i();
        } else if (f32414Q.b(U10, event)) {
            U10.onTouchEvent(event);
            i();
        } else if (this.f32418P.d()) {
            this.f32418P.e(event);
        } else {
            if (Q() == 2 || !this.f32418P.b(event)) {
                return;
            }
            n();
        }
    }

    @Override // ea.AbstractC3109d
    protected void i0() {
        KeyEvent.Callback U10 = U();
        if (U10 instanceof d) {
            this.f32418P = (d) U10;
            return;
        }
        if (U10 instanceof C1992j) {
            this.f32418P = new c(this, (C1992j) U10);
        } else if (U10 instanceof com.facebook.react.views.swiperefresh.a) {
            this.f32418P = new f(this, (com.facebook.react.views.swiperefresh.a) U10);
        } else if (U10 instanceof com.facebook.react.views.scroll.c) {
            this.f32418P = new e();
        }
    }

    @Override // ea.AbstractC3109d
    protected void j0() {
        this.f32418P = f32415R;
    }

    @Override // ea.AbstractC3109d
    public void n0() {
        super.n0();
        this.f32416N = false;
        this.f32417O = false;
    }
}
