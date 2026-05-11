package ea;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* loaded from: classes2.dex */
public final class m extends AbstractC3109d {

    /* renamed from: X, reason: collision with root package name */
    public static final a f32403X = new a(null);

    /* renamed from: N, reason: collision with root package name */
    private long f32404N;

    /* renamed from: O, reason: collision with root package name */
    private final float f32405O;

    /* renamed from: P, reason: collision with root package name */
    private float f32406P;

    /* renamed from: Q, reason: collision with root package name */
    private int f32407Q;

    /* renamed from: R, reason: collision with root package name */
    private float f32408R;

    /* renamed from: S, reason: collision with root package name */
    private float f32409S;

    /* renamed from: T, reason: collision with root package name */
    private long f32410T;

    /* renamed from: U, reason: collision with root package name */
    private long f32411U;

    /* renamed from: V, reason: collision with root package name */
    private Handler f32412V;

    /* renamed from: W, reason: collision with root package name */
    private int f32413W;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public m(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f32404N = 500L;
        D0(true);
        float f10 = context.getResources().getDisplayMetrics().density * 10.0f;
        float f11 = f10 * f10;
        this.f32405O = f11;
        this.f32406P = f11;
        this.f32407Q = 1;
    }

    private final Pair S0(MotionEvent motionEvent, boolean z10) {
        if (z10) {
            int pointerCount = motionEvent.getPointerCount();
            float f10 = 0.0f;
            float f11 = 0.0f;
            for (int i10 = 0; i10 < pointerCount; i10++) {
                if (i10 != motionEvent.getActionIndex()) {
                    f10 += motionEvent.getX(i10);
                    f11 += motionEvent.getY(i10);
                }
            }
            return new Pair(Float.valueOf(f10 / (motionEvent.getPointerCount() - 1)), Float.valueOf(f11 / (motionEvent.getPointerCount() - 1)));
        }
        IntRange p10 = kotlin.ranges.d.p(0, motionEvent.getPointerCount());
        ArrayList arrayList = new ArrayList(CollectionsKt.u(p10, 10));
        Iterator it = p10.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(motionEvent.getX(((D) it).a())));
        }
        float U10 = (float) CollectionsKt.U(arrayList);
        IntRange p11 = kotlin.ranges.d.p(0, motionEvent.getPointerCount());
        ArrayList arrayList2 = new ArrayList(CollectionsKt.u(p11, 10));
        Iterator it2 = p11.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Float.valueOf(motionEvent.getY(((D) it2).a())));
        }
        return new Pair(Float.valueOf(U10), Float.valueOf((float) CollectionsKt.U(arrayList2)));
    }

    static /* synthetic */ Pair T0(m mVar, MotionEvent motionEvent, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return mVar.S0(motionEvent, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V0(m this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.i();
    }

    public final int U0() {
        return (int) (this.f32411U - this.f32410T);
    }

    public final m W0(float f10) {
        this.f32406P = f10 * f10;
        return this;
    }

    public final void X0(long j10) {
        this.f32404N = j10;
    }

    public final m Y0(int i10) {
        this.f32407Q = i10;
        return this;
    }

    @Override // ea.AbstractC3109d
    protected void g0(MotionEvent event, MotionEvent sourceEvent) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(sourceEvent, "sourceEvent");
        if (G0(sourceEvent)) {
            if (Q() == 0) {
                long uptimeMillis = SystemClock.uptimeMillis();
                this.f32411U = uptimeMillis;
                this.f32410T = uptimeMillis;
                n();
                Pair T02 = T0(this, sourceEvent, false, 2, null);
                float floatValue = ((Number) T02.getFirst()).floatValue();
                float floatValue2 = ((Number) T02.getSecond()).floatValue();
                this.f32408R = floatValue;
                this.f32409S = floatValue2;
                this.f32413W++;
            }
            if (sourceEvent.getActionMasked() == 5) {
                this.f32413W++;
                Pair T03 = T0(this, sourceEvent, false, 2, null);
                float floatValue3 = ((Number) T03.getFirst()).floatValue();
                float floatValue4 = ((Number) T03.getSecond()).floatValue();
                this.f32408R = floatValue3;
                this.f32409S = floatValue4;
                if (this.f32413W > this.f32407Q) {
                    B();
                    this.f32413W = 0;
                }
            }
            if (Q() == 2 && this.f32413W == this.f32407Q && (sourceEvent.getActionMasked() == 0 || sourceEvent.getActionMasked() == 5)) {
                Handler handler = new Handler(Looper.getMainLooper());
                this.f32412V = handler;
                long j10 = this.f32404N;
                if (j10 > 0) {
                    Intrinsics.d(handler);
                    handler.postDelayed(new Runnable() { // from class: ea.l
                        @Override // java.lang.Runnable
                        public final void run() {
                            m.V0(m.this);
                        }
                    }, this.f32404N);
                } else if (j10 == 0) {
                    i();
                }
            }
            if (sourceEvent.getActionMasked() == 1 || sourceEvent.getActionMasked() == 12) {
                this.f32413W--;
                Handler handler2 = this.f32412V;
                if (handler2 != null) {
                    handler2.removeCallbacksAndMessages(null);
                    this.f32412V = null;
                }
                if (Q() == 4) {
                    z();
                    return;
                } else {
                    B();
                    return;
                }
            }
            if (sourceEvent.getActionMasked() != 6) {
                Pair T04 = T0(this, sourceEvent, false, 2, null);
                float floatValue5 = ((Number) T04.getFirst()).floatValue();
                float floatValue6 = ((Number) T04.getSecond()).floatValue();
                float f10 = floatValue5 - this.f32408R;
                float f11 = floatValue6 - this.f32409S;
                if ((f10 * f10) + (f11 * f11) > this.f32406P) {
                    if (Q() == 4) {
                        o();
                        return;
                    } else {
                        B();
                        return;
                    }
                }
                return;
            }
            int i10 = this.f32413W - 1;
            this.f32413W = i10;
            if (i10 < this.f32407Q && Q() != 4) {
                B();
                this.f32413W = 0;
                return;
            }
            Pair S02 = S0(sourceEvent, true);
            float floatValue7 = ((Number) S02.getFirst()).floatValue();
            float floatValue8 = ((Number) S02.getSecond()).floatValue();
            this.f32408R = floatValue7;
            this.f32409S = floatValue8;
        }
    }

    @Override // ea.AbstractC3109d
    protected void j0() {
        super.j0();
        this.f32413W = 0;
    }

    @Override // ea.AbstractC3109d
    protected void k0(int i10, int i11) {
        Handler handler = this.f32412V;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f32412V = null;
        }
    }

    @Override // ea.AbstractC3109d
    public void n0() {
        super.n0();
        this.f32404N = 500L;
        this.f32406P = this.f32405O;
    }

    @Override // ea.AbstractC3109d
    public void t(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f32411U = SystemClock.uptimeMillis();
        super.t(event);
    }

    @Override // ea.AbstractC3109d
    public void u(int i10, int i11) {
        this.f32411U = SystemClock.uptimeMillis();
        super.u(i10, i11);
    }
}
