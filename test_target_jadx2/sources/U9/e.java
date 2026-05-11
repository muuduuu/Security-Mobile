package U9;

import L9.k;
import android.app.Activity;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import android.view.WindowMetrics;
import androidx.core.view.AbstractC1484a0;
import androidx.core.view.K0;
import com.facebook.react.uimanager.F0;
import com.facebook.react.views.view.j;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import zc.AbstractC5272a;

/* loaded from: classes2.dex */
public final class e extends j {

    /* renamed from: n, reason: collision with root package name */
    public static final a f10373n = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final F0 f10374a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f10375b;

    /* renamed from: c, reason: collision with root package name */
    private float f10376c;

    /* renamed from: d, reason: collision with root package name */
    private float f10377d;

    /* renamed from: e, reason: collision with root package name */
    private int f10378e;

    /* renamed from: f, reason: collision with root package name */
    private int f10379f;

    /* renamed from: g, reason: collision with root package name */
    private int f10380g;

    /* renamed from: h, reason: collision with root package name */
    private N9.a f10381h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f10382i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f10383j;

    /* renamed from: k, reason: collision with root package name */
    private final Rect f10384k;

    /* renamed from: l, reason: collision with root package name */
    private final M9.c f10385l;

    /* renamed from: m, reason: collision with root package name */
    private VelocityTracker f10386m;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(F0 reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.f10374a = reactContext;
        this.f10381h = new N9.c();
        this.f10383j = true;
        this.f10384k = new Rect();
        this.f10385l = new M9.c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        r0 = r0.getBounds();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int getWindowHeight() {
        Rect bounds;
        WindowManager windowManager;
        Activity currentActivity = this.f10374a.getCurrentActivity();
        WindowMetrics currentWindowMetrics = (currentActivity == null || (windowManager = currentActivity.getWindowManager()) == null) ? null : windowManager.getCurrentWindowMetrics();
        if (currentWindowMetrics == null || bounds == null) {
            return 0;
        }
        return bounds.height();
    }

    private final void r() {
        this.f10385l.h();
        v();
    }

    private final void s(MotionEvent motionEvent) {
        VelocityTracker velocityTracker = this.f10386m;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        this.f10376c = motionEvent.getX();
        this.f10377d = motionEvent.getY();
        k.a(this, this.f10384k);
        this.f10378e = this.f10384k.top;
    }

    private final void t(MotionEvent motionEvent) {
        k.a(this, this.f10384k);
        int i10 = this.f10384k.top - this.f10378e;
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(0.0f, i10);
        VelocityTracker velocityTracker = this.f10386m;
        if (velocityTracker != null) {
            velocityTracker.addMovement(obtain);
        }
        float x10 = obtain.getX() - this.f10376c;
        float y10 = obtain.getY() - this.f10377d;
        boolean z10 = false;
        if (!this.f10375b) {
            this.f10375b = Math.abs(y10) > Math.abs(x10) && Math.abs(y10) >= ((float) ViewConfiguration.get(getContext()).getScaledTouchSlop());
        }
        if (this.f10375b) {
            if (this.f10385l.n()) {
                if (this.f10379f == 0) {
                    this.f10379f = this.f10385l.k();
                }
                int a10 = this.f10381h.a(AbstractC5272a.c(y10), getWindowHeight() - ((int) motionEvent.getRawY()), this.f10385l.k(), this.f10380g);
                if (a10 != 0) {
                    this.f10385l.l(a10);
                }
            } else if (!this.f10385l.o()) {
                K0 H10 = AbstractC1484a0.H(this);
                if (H10 != null && H10.p(K0.m.b())) {
                    z10 = true;
                }
                if (w(y10, z10)) {
                    M9.c.s(this.f10385l, this, null, 2, null);
                }
            }
            this.f10377d = motionEvent.getY();
            this.f10376c = motionEvent.getX();
            this.f10378e = this.f10384k.top;
        }
    }

    private final void u(MotionEvent motionEvent) {
        VelocityTracker velocityTracker = this.f10386m;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        VelocityTracker velocityTracker2 = this.f10386m;
        if (velocityTracker2 != null) {
            velocityTracker2.computeCurrentVelocity(500);
        }
        VelocityTracker velocityTracker3 = this.f10386m;
        this.f10385l.g((this.f10385l.n() && this.f10379f == this.f10385l.k()) ? null : velocityTracker3 != null ? Float.valueOf(velocityTracker3.getYVelocity()) : null);
        v();
    }

    private final void v() {
        this.f10375b = false;
        this.f10376c = 0.0f;
        this.f10377d = 0.0f;
        this.f10378e = 0;
        this.f10379f = 0;
        this.f10384k.setEmpty();
        VelocityTracker velocityTracker = this.f10386m;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f10386m = null;
    }

    private final boolean w(float f10, boolean z10) {
        if (f10 < 0.0f) {
            if (!z10 && this.f10382i) {
                return true;
            }
        } else if (f10 > 0.0f && z10 && this.f10383j) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f10386m == null) {
            this.f10386m = VelocityTracker.obtain();
        }
        Integer valueOf = motionEvent != null ? Integer.valueOf(motionEvent.getAction()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            s(motionEvent);
        } else if (valueOf != null && valueOf.intValue() == 2) {
            t(motionEvent);
        } else if (valueOf != null && valueOf.intValue() == 1) {
            u(motionEvent);
        } else if (valueOf != null && valueOf.intValue() == 3) {
            r();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setInterpolator(String interpolator) {
        Intrinsics.checkNotNullParameter(interpolator, "interpolator");
        N9.a aVar = (N9.a) f.a().get(interpolator);
        if (aVar == null) {
            aVar = new N9.c();
        }
        this.f10381h = aVar;
    }

    public final void setOffset(double d10) {
        this.f10380g = (int) L9.e.b((float) d10);
    }

    public final void setScrollKeyboardOffScreenWhenVisible(boolean z10) {
        this.f10383j = z10;
    }

    public final void setScrollKeyboardOnScreenWhenNotVisible(boolean z10) {
        this.f10382i = z10;
    }
}
