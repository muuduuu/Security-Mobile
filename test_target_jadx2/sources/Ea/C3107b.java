package ea;

import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import ea.C3104A;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ea.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3107b extends AbstractC3109d {

    /* renamed from: V, reason: collision with root package name */
    public static final a f32318V = new a(null);

    /* renamed from: W, reason: collision with root package name */
    private static final double f32319W;

    /* renamed from: X, reason: collision with root package name */
    private static final double f32320X;

    /* renamed from: R, reason: collision with root package name */
    private Handler f32325R;

    /* renamed from: S, reason: collision with root package name */
    private int f32326S;

    /* renamed from: U, reason: collision with root package name */
    private VelocityTracker f32328U;

    /* renamed from: N, reason: collision with root package name */
    private int f32321N = 1;

    /* renamed from: O, reason: collision with root package name */
    private int f32322O = 1;

    /* renamed from: P, reason: collision with root package name */
    private final long f32323P = 800;

    /* renamed from: Q, reason: collision with root package name */
    private final long f32324Q = 2000;

    /* renamed from: T, reason: collision with root package name */
    private final Runnable f32327T = new Runnable() { // from class: ea.a
        @Override // java.lang.Runnable
        public final void run() {
            C3107b.U0(C3107b.this);
        }
    };

    /* renamed from: ea.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        C3114i c3114i = C3114i.f32395a;
        f32319W = c3114i.a(30.0d);
        f32320X = c3114i.a(60.0d);
    }

    private final void S0(VelocityTracker velocityTracker, MotionEvent motionEvent) {
        float rawX = motionEvent.getRawX() - motionEvent.getX();
        float rawY = motionEvent.getRawY() - motionEvent.getY();
        motionEvent.offsetLocation(rawX, rawY);
        Intrinsics.d(velocityTracker);
        velocityTracker.addMovement(motionEvent);
        motionEvent.offsetLocation(-rawX, -rawY);
    }

    private final void T0(MotionEvent motionEvent) {
        if (Y0(motionEvent)) {
            return;
        }
        B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U0(C3107b this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.B();
    }

    private final void X0(MotionEvent motionEvent) {
        this.f32328U = VelocityTracker.obtain();
        n();
        this.f32326S = 1;
        Handler handler = this.f32325R;
        if (handler == null) {
            this.f32325R = new Handler(Looper.getMainLooper());
        } else {
            Intrinsics.d(handler);
            handler.removeCallbacksAndMessages(null);
        }
        Handler handler2 = this.f32325R;
        Intrinsics.d(handler2);
        handler2.postDelayed(this.f32327T, this.f32323P);
    }

    private final boolean Y0(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        S0(this.f32328U, motionEvent);
        C3104A.a aVar = C3104A.f32302f;
        VelocityTracker velocityTracker = this.f32328U;
        Intrinsics.d(velocityTracker);
        C3104A b10 = aVar.b(velocityTracker);
        Integer[] numArr = {2, 1, 4, 8};
        ArrayList arrayList = new ArrayList(4);
        for (int i10 = 0; i10 < 4; i10++) {
            arrayList.add(Boolean.valueOf(Z0(this, b10, numArr[i10].intValue(), f32319W)));
        }
        Integer[] numArr2 = {5, 9, 6, 10};
        ArrayList arrayList2 = new ArrayList(4);
        for (int i11 = 0; i11 < 4; i11++) {
            arrayList2.add(Boolean.valueOf(Z0(this, b10, numArr2[i11].intValue(), f32320X)));
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((Boolean) it.next()).booleanValue()) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        if (!arrayList2.isEmpty()) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                if (((Boolean) it2.next()).booleanValue()) {
                    z11 = true;
                    break;
                }
            }
        }
        z11 = false;
        boolean z12 = z10 | z11;
        boolean z13 = b10.k() > ((double) this.f32324Q);
        if (this.f32326S != this.f32321N || !z12 || !z13) {
            return false;
        }
        Handler handler = this.f32325R;
        Intrinsics.d(handler);
        handler.removeCallbacksAndMessages(null);
        i();
        return true;
    }

    private static final boolean Z0(C3107b c3107b, C3104A c3104a, int i10, double d10) {
        return (c3107b.f32322O & i10) == i10 && c3104a.l(C3104A.f32302f.a(i10), d10);
    }

    public final void V0(int i10) {
        this.f32322O = i10;
    }

    public final void W0(int i10) {
        this.f32321N = i10;
    }

    @Override // ea.AbstractC3109d
    protected void f0() {
        Handler handler = this.f32325R;
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
            if (Q10 == 0) {
                X0(sourceEvent);
            }
            if (Q10 == 2) {
                Y0(sourceEvent);
                if (sourceEvent.getPointerCount() > this.f32326S) {
                    this.f32326S = sourceEvent.getPointerCount();
                }
                if (sourceEvent.getActionMasked() == 1) {
                    T0(sourceEvent);
                }
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
        VelocityTracker velocityTracker = this.f32328U;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f32328U = null;
        Handler handler = this.f32325R;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // ea.AbstractC3109d
    public void n0() {
        super.n0();
        this.f32321N = 1;
        this.f32322O = 1;
    }
}
