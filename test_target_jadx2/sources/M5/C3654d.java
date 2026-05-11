package m5;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: m5.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3654d {

    /* renamed from: a, reason: collision with root package name */
    private VelocityTracker f37385a;

    /* renamed from: b, reason: collision with root package name */
    private float f37386b;

    /* renamed from: c, reason: collision with root package name */
    private float f37387c;

    public final void a(MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        if (this.f37385a == null) {
            this.f37385a = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker = this.f37385a;
        if (velocityTracker != null) {
            velocityTracker.addMovement(ev);
            int action = ev.getAction() & 255;
            if (action == 1 || action == 3) {
                velocityTracker.computeCurrentVelocity(1);
                this.f37386b = velocityTracker.getXVelocity();
                this.f37387c = velocityTracker.getYVelocity();
                velocityTracker.recycle();
                this.f37385a = null;
            }
        }
    }

    public final float b() {
        return this.f37386b;
    }

    public final float c() {
        return this.f37387c;
    }
}
