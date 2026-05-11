package ea;

import android.graphics.PointF;
import android.view.MotionEvent;
import ea.u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class v extends AbstractC3109d {

    /* renamed from: T, reason: collision with root package name */
    public static final a f32475T = new a(null);

    /* renamed from: N, reason: collision with root package name */
    private u f32476N;

    /* renamed from: O, reason: collision with root package name */
    private double f32477O;

    /* renamed from: P, reason: collision with root package name */
    private double f32478P;

    /* renamed from: Q, reason: collision with root package name */
    private float f32479Q = Float.NaN;

    /* renamed from: R, reason: collision with root package name */
    private float f32480R = Float.NaN;

    /* renamed from: S, reason: collision with root package name */
    private final u.a f32481S;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements u.a {
        b() {
        }

        @Override // ea.u.a
        public boolean a(u detector) {
            Intrinsics.checkNotNullParameter(detector, "detector");
            double V02 = v.this.V0();
            v vVar = v.this;
            vVar.f32477O = vVar.V0() + detector.d();
            long e10 = detector.e();
            if (e10 > 0) {
                v vVar2 = v.this;
                vVar2.f32478P = (vVar2.V0() - V02) / e10;
            }
            if (Math.abs(v.this.V0()) < 0.08726646259971647d || v.this.Q() != 2) {
                return true;
            }
            v.this.i();
            return true;
        }

        @Override // ea.u.a
        public void b(u detector) {
            Intrinsics.checkNotNullParameter(detector, "detector");
            v.this.z();
        }

        @Override // ea.u.a
        public boolean c(u detector) {
            Intrinsics.checkNotNullParameter(detector, "detector");
            return true;
        }
    }

    public v() {
        D0(false);
        this.f32481S = new b();
    }

    public final float T0() {
        return this.f32479Q;
    }

    public final float U0() {
        return this.f32480R;
    }

    public final double V0() {
        return this.f32477O;
    }

    public final double W0() {
        return this.f32478P;
    }

    @Override // ea.AbstractC3109d
    protected void g0(MotionEvent event, MotionEvent sourceEvent) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(sourceEvent, "sourceEvent");
        if (Q() == 0) {
            o0();
            this.f32476N = new u(this.f32481S);
            this.f32479Q = event.getX();
            this.f32480R = event.getY();
            n();
        }
        u uVar = this.f32476N;
        if (uVar != null) {
            uVar.f(sourceEvent);
        }
        u uVar2 = this.f32476N;
        if (uVar2 != null) {
            PointF N02 = N0(new PointF(uVar2.b(), uVar2.c()));
            this.f32479Q = N02.x;
            this.f32480R = N02.y;
        }
        if (sourceEvent.getActionMasked() == 1) {
            if (Q() == 4) {
                z();
            } else {
                B();
            }
        }
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
        this.f32476N = null;
        this.f32479Q = Float.NaN;
        this.f32480R = Float.NaN;
        o0();
    }

    @Override // ea.AbstractC3109d
    public void o0() {
        this.f32478P = 0.0d;
        this.f32477O = 0.0d;
    }
}
