package ea;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import ea.w;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class s extends AbstractC3109d {

    /* renamed from: N, reason: collision with root package name */
    private double f32457N;

    /* renamed from: O, reason: collision with root package name */
    private double f32458O;

    /* renamed from: R, reason: collision with root package name */
    private w f32461R;

    /* renamed from: S, reason: collision with root package name */
    private float f32462S;

    /* renamed from: T, reason: collision with root package name */
    private float f32463T;

    /* renamed from: P, reason: collision with root package name */
    private float f32459P = Float.NaN;

    /* renamed from: Q, reason: collision with root package name */
    private float f32460Q = Float.NaN;

    /* renamed from: U, reason: collision with root package name */
    private final w.b f32464U = new a();

    public static final class a implements w.b {
        a() {
            s.this.D0(false);
        }

        @Override // ea.w.b
        public boolean a(w detector) {
            Intrinsics.checkNotNullParameter(detector, "detector");
            double Y02 = s.this.Y0();
            s sVar = s.this;
            sVar.f32457N = sVar.Y0() * detector.g();
            double i10 = detector.i();
            if (i10 > 0.0d) {
                s sVar2 = s.this;
                sVar2.f32458O = (sVar2.Y0() - Y02) / i10;
            }
            if (Math.abs(s.this.f32462S - detector.d()) < s.this.f32463T || s.this.Q() != 2) {
                return true;
            }
            s.this.i();
            return true;
        }

        @Override // ea.w.b
        public void b(w detector) {
            Intrinsics.checkNotNullParameter(detector, "detector");
        }

        @Override // ea.w.b
        public boolean c(w detector) {
            Intrinsics.checkNotNullParameter(detector, "detector");
            s.this.f32462S = detector.d();
            return true;
        }
    }

    public final float W0() {
        return this.f32459P;
    }

    public final float X0() {
        return this.f32460Q;
    }

    public final double Y0() {
        return this.f32457N;
    }

    public final double Z0() {
        return this.f32458O;
    }

    @Override // ea.AbstractC3109d
    protected void g0(MotionEvent event, MotionEvent sourceEvent) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(sourceEvent, "sourceEvent");
        if (Q() == 0) {
            View U10 = U();
            Intrinsics.d(U10);
            Context context = U10.getContext();
            o0();
            this.f32461R = new w(context, this.f32464U);
            this.f32463T = ViewConfiguration.get(context).getScaledTouchSlop();
            this.f32459P = event.getX();
            this.f32460Q = event.getY();
            n();
        }
        w wVar = this.f32461R;
        if (wVar != null) {
            wVar.k(sourceEvent);
        }
        w wVar2 = this.f32461R;
        if (wVar2 != null) {
            PointF N02 = N0(new PointF(wVar2.e(), wVar2.f()));
            this.f32459P = N02.x;
            this.f32460Q = N02.y;
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
        this.f32461R = null;
        this.f32459P = Float.NaN;
        this.f32460Q = Float.NaN;
        o0();
    }

    @Override // ea.AbstractC3109d
    public void o0() {
        this.f32458O = 0.0d;
        this.f32457N = 1.0d;
    }
}
