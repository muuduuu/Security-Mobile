package ea;

import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.swmansion.gesturehandler.react.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ea.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3116k extends AbstractC3109d {

    /* renamed from: Q, reason: collision with root package name */
    public static final a f32397Q = new a(null);

    /* renamed from: R, reason: collision with root package name */
    private static final com.swmansion.gesturehandler.react.m f32398R = new com.swmansion.gesturehandler.react.m();

    /* renamed from: N, reason: collision with root package name */
    private Handler f32399N;

    /* renamed from: O, reason: collision with root package name */
    private Runnable f32400O = new Runnable() { // from class: ea.j
        @Override // java.lang.Runnable
        public final void run() {
            C3116k.T0(C3116k.this);
        }
    };

    /* renamed from: P, reason: collision with root package name */
    private x f32401P = new x(0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 31, null);

    /* renamed from: ea.k$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final void S0() {
        int Q10 = Q();
        if (Q10 == 0) {
            o();
        } else if (Q10 == 2) {
            B();
        } else {
            if (Q10 != 4) {
                return;
            }
            z();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T0(C3116k this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.S0();
    }

    private final boolean V0(AbstractC3109d abstractC3109d) {
        View U10 = abstractC3109d.U();
        while (U10 != null) {
            if (Intrinsics.b(U10, U())) {
                return true;
            }
            Object parent = U10.getParent();
            U10 = parent instanceof View ? (View) parent : null;
        }
        return false;
    }

    private final Boolean W0(View view, View view2, View view3) {
        if (Intrinsics.b(view3, view2)) {
            return Boolean.TRUE;
        }
        if (Intrinsics.b(view3, view)) {
            return Boolean.FALSE;
        }
        if (!(view3 instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view3;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            Boolean W02 = W0(view, view2, f32398R.c(viewGroup, i10));
            if (W02 != null) {
                return W02;
            }
        }
        return null;
    }

    static /* synthetic */ Boolean X0(C3116k c3116k, View view, View view2, View view3, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            view3 = view.getRootView();
            Intrinsics.checkNotNullExpressionValue(view3, "getRootView(...)");
        }
        return c3116k.W0(view, view2, view3);
    }

    @Override // ea.AbstractC3109d
    public boolean H0(AbstractC3109d handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        if (!(handler instanceof C3116k) || ((C3116k) handler).V0(this)) {
            return super.H0(handler);
        }
        View U10 = handler.U();
        Intrinsics.d(U10);
        View U11 = U();
        Intrinsics.d(U11);
        Boolean X02 = X0(this, U10, U11, null, 4, null);
        Intrinsics.d(X02);
        return X02.booleanValue();
    }

    @Override // ea.AbstractC3109d
    public boolean I0(AbstractC3109d handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        if (((handler instanceof C3116k) && (V0(handler) || ((C3116k) handler).V0(this))) || (handler instanceof i.b)) {
            return true;
        }
        return super.I0(handler);
    }

    @Override // ea.AbstractC3109d
    public boolean J0(AbstractC3109d handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        if ((handler instanceof C3116k) && !V0(handler) && !((C3116k) handler).V0(this)) {
            View U10 = U();
            Intrinsics.d(U10);
            View U11 = handler.U();
            Intrinsics.d(U11);
            Boolean X02 = X0(this, U10, U11, null, 4, null);
            if (X02 != null) {
                return X02.booleanValue();
            }
        }
        return super.J0(handler);
    }

    public final x U0() {
        return this.f32401P;
    }

    @Override // ea.AbstractC3109d
    protected void g0(MotionEvent event, MotionEvent sourceEvent) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(sourceEvent, "sourceEvent");
        if (event.getAction() == 0) {
            Handler handler = this.f32399N;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.f32399N = null;
            return;
        }
        if (event.getAction() != 1 || b0()) {
            return;
        }
        S0();
    }

    @Override // ea.AbstractC3109d
    protected void h0(MotionEvent event, MotionEvent sourceEvent) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(sourceEvent, "sourceEvent");
        if (event.getAction() == 10) {
            if (this.f32399N == null) {
                this.f32399N = new Handler(Looper.getMainLooper());
            }
            Handler handler = this.f32399N;
            Intrinsics.d(handler);
            handler.postDelayed(this.f32400O, 4L);
            return;
        }
        if (!b0()) {
            S0();
            return;
        }
        if (Q() == 4 && event.getToolType(0) == 2) {
            this.f32401P = x.f32508f.a(event);
            return;
        }
        if (Q() == 0) {
            if (event.getAction() == 7 || event.getAction() == 9) {
                n();
                i();
            }
        }
    }

    @Override // ea.AbstractC3109d
    protected void j0() {
        super.j0();
        this.f32401P = new x(0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 31, null);
    }
}
