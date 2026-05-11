package ea;

import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class z extends AbstractC3109d {

    /* renamed from: e0, reason: collision with root package name */
    public static final a f32515e0 = new a(null);

    /* renamed from: V, reason: collision with root package name */
    private float f32524V;

    /* renamed from: W, reason: collision with root package name */
    private float f32525W;

    /* renamed from: X, reason: collision with root package name */
    private float f32526X;

    /* renamed from: Y, reason: collision with root package name */
    private float f32527Y;

    /* renamed from: Z, reason: collision with root package name */
    private float f32528Z;

    /* renamed from: a0, reason: collision with root package name */
    private float f32529a0;

    /* renamed from: b0, reason: collision with root package name */
    private Handler f32530b0;

    /* renamed from: c0, reason: collision with root package name */
    private int f32531c0;

    /* renamed from: N, reason: collision with root package name */
    private float f32516N = Float.MIN_VALUE;

    /* renamed from: O, reason: collision with root package name */
    private float f32517O = Float.MIN_VALUE;

    /* renamed from: P, reason: collision with root package name */
    private float f32518P = Float.MIN_VALUE;

    /* renamed from: Q, reason: collision with root package name */
    private long f32519Q = 500;

    /* renamed from: R, reason: collision with root package name */
    private long f32520R = 200;

    /* renamed from: S, reason: collision with root package name */
    private int f32521S = 1;

    /* renamed from: T, reason: collision with root package name */
    private int f32522T = 1;

    /* renamed from: U, reason: collision with root package name */
    private int f32523U = 1;

    /* renamed from: d0, reason: collision with root package name */
    private final Runnable f32532d0 = new Runnable() { // from class: ea.y
        @Override // java.lang.Runnable
        public final void run() {
            z.T0(z.this);
        }
    };

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public z() {
        D0(true);
    }

    private final void S0() {
        Handler handler = this.f32530b0;
        if (handler == null) {
            this.f32530b0 = new Handler(Looper.getMainLooper());
        } else {
            Intrinsics.d(handler);
            handler.removeCallbacksAndMessages(null);
        }
        int i10 = this.f32531c0 + 1;
        this.f32531c0 = i10;
        if (i10 == this.f32521S && this.f32523U >= this.f32522T) {
            i();
            return;
        }
        Handler handler2 = this.f32530b0;
        Intrinsics.d(handler2);
        handler2.postDelayed(this.f32532d0, this.f32520R);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T0(z this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.B();
    }

    private final boolean b1() {
        float f10 = (this.f32528Z - this.f32524V) + this.f32526X;
        if (this.f32516N != Float.MIN_VALUE && Math.abs(f10) > this.f32516N) {
            return true;
        }
        float f11 = (this.f32529a0 - this.f32525W) + this.f32527Y;
        if (this.f32517O != Float.MIN_VALUE && Math.abs(f11) > this.f32517O) {
            return true;
        }
        float f12 = (f11 * f11) + (f10 * f10);
        float f13 = this.f32518P;
        return f13 != Float.MIN_VALUE && f12 > f13;
    }

    private final void c1() {
        Handler handler = this.f32530b0;
        if (handler == null) {
            this.f32530b0 = new Handler(Looper.getMainLooper());
        } else {
            Intrinsics.d(handler);
            handler.removeCallbacksAndMessages(null);
        }
        Handler handler2 = this.f32530b0;
        Intrinsics.d(handler2);
        handler2.postDelayed(this.f32532d0, this.f32519Q);
    }

    public final z U0(long j10) {
        this.f32520R = j10;
        return this;
    }

    public final z V0(float f10) {
        this.f32518P = f10 * f10;
        return this;
    }

    public final z W0(long j10) {
        this.f32519Q = j10;
        return this;
    }

    public final z X0(float f10) {
        this.f32516N = f10;
        return this;
    }

    public final z Y0(float f10) {
        this.f32517O = f10;
        return this;
    }

    public final z Z0(int i10) {
        this.f32522T = i10;
        return this;
    }

    public final z a1(int i10) {
        this.f32521S = i10;
        return this;
    }

    @Override // ea.AbstractC3109d
    protected void f0() {
        Handler handler = this.f32530b0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // ea.AbstractC3109d
    protected void g0(MotionEvent event, MotionEvent sourceEvent) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(sourceEvent, "sourceEvent");
        if (G0(sourceEvent)) {
            int Q10 = Q();
            int actionMasked = sourceEvent.getActionMasked();
            if (Q10 == 0) {
                this.f32526X = 0.0f;
                this.f32527Y = 0.0f;
                C3114i c3114i = C3114i.f32395a;
                this.f32524V = c3114i.b(sourceEvent, true);
                this.f32525W = c3114i.c(sourceEvent, true);
            }
            if (actionMasked == 5 || actionMasked == 6) {
                this.f32526X += this.f32528Z - this.f32524V;
                this.f32527Y += this.f32529a0 - this.f32525W;
                C3114i c3114i2 = C3114i.f32395a;
                this.f32528Z = c3114i2.b(sourceEvent, true);
                float c10 = c3114i2.c(sourceEvent, true);
                this.f32529a0 = c10;
                this.f32524V = this.f32528Z;
                this.f32525W = c10;
            } else {
                C3114i c3114i3 = C3114i.f32395a;
                this.f32528Z = c3114i3.b(sourceEvent, true);
                this.f32529a0 = c3114i3.c(sourceEvent, true);
            }
            if (this.f32523U < sourceEvent.getPointerCount()) {
                this.f32523U = sourceEvent.getPointerCount();
            }
            if (b1()) {
                B();
                return;
            }
            if (Q10 == 0) {
                if (actionMasked == 0 || actionMasked == 11) {
                    n();
                }
                c1();
                return;
            }
            if (Q10 == 2) {
                if (actionMasked != 0) {
                    if (actionMasked != 1) {
                        if (actionMasked != 11) {
                            if (actionMasked != 12) {
                                return;
                            }
                        }
                    }
                    S0();
                    return;
                }
                c1();
            }
        }
    }

    @Override // ea.AbstractC3109d
    public void j(boolean z10) {
        super.j(z10);
        z();
    }

    @Override // ea.AbstractC3109d
    protected void j0() {
        this.f32531c0 = 0;
        this.f32523U = 0;
        Handler handler = this.f32530b0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // ea.AbstractC3109d
    public void n0() {
        super.n0();
        this.f32516N = Float.MIN_VALUE;
        this.f32517O = Float.MIN_VALUE;
        this.f32518P = Float.MIN_VALUE;
        this.f32519Q = 500L;
        this.f32520R = 200L;
        this.f32521S = 1;
        this.f32522T = 1;
    }
}
