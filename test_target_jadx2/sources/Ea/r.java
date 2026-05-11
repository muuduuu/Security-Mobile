package ea;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class r extends AbstractC3109d {

    /* renamed from: q0, reason: collision with root package name */
    public static final a f32427q0 = new a(null);

    /* renamed from: N, reason: collision with root package name */
    private float f32428N;

    /* renamed from: O, reason: collision with root package name */
    private float f32429O;

    /* renamed from: P, reason: collision with root package name */
    private final float f32430P;

    /* renamed from: Q, reason: collision with root package name */
    private float f32431Q;

    /* renamed from: e0, reason: collision with root package name */
    private float f32445e0;

    /* renamed from: f0, reason: collision with root package name */
    private float f32446f0;

    /* renamed from: g0, reason: collision with root package name */
    private float f32447g0;

    /* renamed from: h0, reason: collision with root package name */
    private float f32448h0;

    /* renamed from: i0, reason: collision with root package name */
    private float f32449i0;

    /* renamed from: j0, reason: collision with root package name */
    private float f32450j0;

    /* renamed from: k0, reason: collision with root package name */
    private VelocityTracker f32451k0;

    /* renamed from: l0, reason: collision with root package name */
    private boolean f32452l0;

    /* renamed from: m0, reason: collision with root package name */
    private long f32453m0;

    /* renamed from: o0, reason: collision with root package name */
    private Handler f32455o0;

    /* renamed from: R, reason: collision with root package name */
    private float f32432R = Float.MAX_VALUE;

    /* renamed from: S, reason: collision with root package name */
    private float f32433S = Float.MIN_VALUE;

    /* renamed from: T, reason: collision with root package name */
    private float f32434T = Float.MIN_VALUE;

    /* renamed from: U, reason: collision with root package name */
    private float f32435U = Float.MAX_VALUE;

    /* renamed from: V, reason: collision with root package name */
    private float f32436V = Float.MAX_VALUE;

    /* renamed from: W, reason: collision with root package name */
    private float f32437W = Float.MIN_VALUE;

    /* renamed from: X, reason: collision with root package name */
    private float f32438X = Float.MIN_VALUE;

    /* renamed from: Y, reason: collision with root package name */
    private float f32439Y = Float.MAX_VALUE;

    /* renamed from: Z, reason: collision with root package name */
    private float f32440Z = Float.MAX_VALUE;

    /* renamed from: a0, reason: collision with root package name */
    private float f32441a0 = Float.MAX_VALUE;

    /* renamed from: b0, reason: collision with root package name */
    private float f32442b0 = Float.MAX_VALUE;

    /* renamed from: c0, reason: collision with root package name */
    private int f32443c0 = 1;

    /* renamed from: d0, reason: collision with root package name */
    private int f32444d0 = 10;

    /* renamed from: n0, reason: collision with root package name */
    private final Runnable f32454n0 = new Runnable() { // from class: ea.q
        @Override // java.lang.Runnable
        public final void run() {
            r.S0(r.this);
        }
    };

    /* renamed from: p0, reason: collision with root package name */
    private x f32456p0 = new x(0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 31, null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void b(VelocityTracker velocityTracker, MotionEvent motionEvent) {
            float rawX = motionEvent.getRawX() - motionEvent.getX();
            float rawY = motionEvent.getRawY() - motionEvent.getY();
            motionEvent.offsetLocation(rawX, rawY);
            Intrinsics.d(velocityTracker);
            velocityTracker.addMovement(motionEvent);
            motionEvent.offsetLocation(-rawX, -rawY);
        }

        private a() {
        }
    }

    public r(Context context) {
        this.f32431Q = Float.MIN_VALUE;
        Intrinsics.d(context);
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        float f10 = scaledTouchSlop * scaledTouchSlop;
        this.f32430P = f10;
        this.f32431Q = f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S0(r this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.i();
    }

    private final boolean o1() {
        float f10 = (this.f32449i0 - this.f32445e0) + this.f32447g0;
        float f11 = this.f32432R;
        if (f11 != Float.MAX_VALUE && f10 < f11) {
            return true;
        }
        float f12 = this.f32433S;
        if (f12 != Float.MIN_VALUE && f10 > f12) {
            return true;
        }
        float f13 = (this.f32450j0 - this.f32446f0) + this.f32448h0;
        float f14 = this.f32436V;
        if (f14 != Float.MAX_VALUE && f13 < f14) {
            return true;
        }
        float f15 = this.f32437W;
        if (f15 != Float.MIN_VALUE && f13 > f15) {
            return true;
        }
        float f16 = (f10 * f10) + (f13 * f13);
        float f17 = this.f32431Q;
        if (f17 != Float.MAX_VALUE && f16 >= f17) {
            return true;
        }
        float f18 = this.f32428N;
        float f19 = this.f32440Z;
        if (f19 != Float.MAX_VALUE && ((f19 < 0.0f && f18 <= f19) || (0.0f <= f19 && f19 <= f18))) {
            return true;
        }
        float f20 = this.f32429O;
        float f21 = this.f32441a0;
        if (f21 != Float.MAX_VALUE && ((f21 < 0.0f && f18 <= f21) || (0.0f <= f21 && f21 <= f18))) {
            return true;
        }
        float f22 = (f18 * f18) + (f20 * f20);
        float f23 = this.f32442b0;
        return f23 != Float.MAX_VALUE && f22 >= f23;
    }

    private final boolean p1() {
        float f10 = (this.f32449i0 - this.f32445e0) + this.f32447g0;
        float f11 = (this.f32450j0 - this.f32446f0) + this.f32448h0;
        if (this.f32453m0 > 0 && (f10 * f10) + (f11 * f11) > this.f32430P) {
            Handler handler = this.f32455o0;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            return true;
        }
        float f12 = this.f32434T;
        if (f12 != Float.MIN_VALUE && f10 < f12) {
            return true;
        }
        float f13 = this.f32435U;
        if (f13 != Float.MAX_VALUE && f10 > f13) {
            return true;
        }
        float f14 = this.f32438X;
        if (f14 != Float.MIN_VALUE && f11 < f14) {
            return true;
        }
        float f15 = this.f32439Y;
        return f15 != Float.MAX_VALUE && f11 > f15;
    }

    public final x T0() {
        return this.f32456p0;
    }

    public final float U0() {
        return (this.f32449i0 - this.f32445e0) + this.f32447g0;
    }

    public final float V0() {
        return (this.f32450j0 - this.f32446f0) + this.f32448h0;
    }

    public final float W0() {
        return this.f32428N;
    }

    public final float X0() {
        return this.f32429O;
    }

    public final r Y0(long j10) {
        this.f32453m0 = j10;
        return this;
    }

    public final r Z0(float f10) {
        this.f32433S = f10;
        return this;
    }

    public final r a1(float f10) {
        this.f32432R = f10;
        return this;
    }

    public final r b1(float f10) {
        this.f32437W = f10;
        return this;
    }

    public final r c1(float f10) {
        this.f32436V = f10;
        return this;
    }

    public final r d1(boolean z10) {
        this.f32452l0 = z10;
        return this;
    }

    public final r e1(float f10) {
        this.f32435U = f10;
        return this;
    }

    @Override // ea.AbstractC3109d
    protected void f0() {
        Handler handler = this.f32455o0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public final r f1(float f10) {
        this.f32434T = f10;
        return this;
    }

    @Override // ea.AbstractC3109d
    protected void g0(MotionEvent event, MotionEvent sourceEvent) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(sourceEvent, "sourceEvent");
        if (G0(sourceEvent)) {
            if (event.getToolType(0) == 2) {
                this.f32456p0 = x.f32508f.a(event);
            }
            int Q10 = Q();
            int actionMasked = sourceEvent.getActionMasked();
            if (actionMasked == 5 || actionMasked == 6) {
                this.f32447g0 += this.f32449i0 - this.f32445e0;
                this.f32448h0 += this.f32450j0 - this.f32446f0;
                C3114i c3114i = C3114i.f32395a;
                this.f32449i0 = c3114i.b(sourceEvent, this.f32452l0);
                float c10 = c3114i.c(sourceEvent, this.f32452l0);
                this.f32450j0 = c10;
                this.f32445e0 = this.f32449i0;
                this.f32446f0 = c10;
            } else {
                C3114i c3114i2 = C3114i.f32395a;
                this.f32449i0 = c3114i2.b(sourceEvent, this.f32452l0);
                this.f32450j0 = c3114i2.c(sourceEvent, this.f32452l0);
            }
            if (Q10 != 0 || sourceEvent.getPointerCount() < this.f32443c0) {
                VelocityTracker velocityTracker = this.f32451k0;
                if (velocityTracker != null) {
                    f32427q0.b(velocityTracker, sourceEvent);
                    VelocityTracker velocityTracker2 = this.f32451k0;
                    Intrinsics.d(velocityTracker2);
                    velocityTracker2.computeCurrentVelocity(1000);
                    VelocityTracker velocityTracker3 = this.f32451k0;
                    Intrinsics.d(velocityTracker3);
                    this.f32428N = velocityTracker3.getXVelocity();
                    VelocityTracker velocityTracker4 = this.f32451k0;
                    Intrinsics.d(velocityTracker4);
                    this.f32429O = velocityTracker4.getYVelocity();
                }
            } else {
                o0();
                this.f32447g0 = 0.0f;
                this.f32448h0 = 0.0f;
                this.f32428N = 0.0f;
                this.f32429O = 0.0f;
                VelocityTracker obtain = VelocityTracker.obtain();
                this.f32451k0 = obtain;
                f32427q0.b(obtain, sourceEvent);
                n();
                if (this.f32453m0 > 0) {
                    if (this.f32455o0 == null) {
                        this.f32455o0 = new Handler(Looper.getMainLooper());
                    }
                    Handler handler = this.f32455o0;
                    Intrinsics.d(handler);
                    handler.postDelayed(this.f32454n0, this.f32453m0);
                }
            }
            if (actionMasked == 1 || actionMasked == 12) {
                if (Q10 == 4) {
                    z();
                    return;
                } else {
                    B();
                    return;
                }
            }
            if (actionMasked == 5 && sourceEvent.getPointerCount() > this.f32444d0) {
                if (Q10 == 4) {
                    o();
                    return;
                } else {
                    B();
                    return;
                }
            }
            if (actionMasked == 6 && Q10 == 4 && sourceEvent.getPointerCount() < this.f32443c0) {
                B();
                return;
            }
            if (Q10 == 2) {
                if (p1()) {
                    B();
                } else if (o1()) {
                    i();
                }
            }
        }
    }

    public final r g1(float f10) {
        this.f32439Y = f10;
        return this;
    }

    public final r h1(float f10) {
        this.f32438X = f10;
        return this;
    }

    public final r i1(int i10) {
        this.f32444d0 = i10;
        return this;
    }

    @Override // ea.AbstractC3109d
    public void j(boolean z10) {
        if (Q() != 4) {
            o0();
        }
        super.j(z10);
    }

    @Override // ea.AbstractC3109d
    protected void j0() {
        Handler handler = this.f32455o0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        VelocityTracker velocityTracker = this.f32451k0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f32451k0 = null;
        }
        this.f32456p0 = new x(0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 31, null);
    }

    public final r j1(float f10) {
        this.f32431Q = f10 * f10;
        return this;
    }

    public final r k1(int i10) {
        this.f32443c0 = i10;
        return this;
    }

    public final r l1(float f10) {
        this.f32442b0 = f10 * f10;
        return this;
    }

    public final r m1(float f10) {
        this.f32440Z = f10;
        return this;
    }

    @Override // ea.AbstractC3109d
    public void n0() {
        super.n0();
        this.f32432R = Float.MAX_VALUE;
        this.f32433S = Float.MIN_VALUE;
        this.f32434T = Float.MIN_VALUE;
        this.f32435U = Float.MAX_VALUE;
        this.f32436V = Float.MAX_VALUE;
        this.f32437W = Float.MIN_VALUE;
        this.f32438X = Float.MIN_VALUE;
        this.f32439Y = Float.MAX_VALUE;
        this.f32440Z = Float.MAX_VALUE;
        this.f32441a0 = Float.MAX_VALUE;
        this.f32442b0 = Float.MAX_VALUE;
        this.f32431Q = this.f32430P;
        this.f32443c0 = 1;
        this.f32444d0 = 10;
        this.f32453m0 = 0L;
        this.f32452l0 = false;
    }

    public final r n1(float f10) {
        this.f32441a0 = f10;
        return this;
    }

    @Override // ea.AbstractC3109d
    public void o0() {
        this.f32445e0 = this.f32449i0;
        this.f32446f0 = this.f32450j0;
    }
}
