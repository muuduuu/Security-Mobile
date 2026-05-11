package ea;

import android.view.MotionEvent;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ea.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3114i {

    /* renamed from: a, reason: collision with root package name */
    public static final C3114i f32395a = new C3114i();

    private C3114i() {
    }

    public final double a(double d10) {
        return Math.cos(Math.toRadians(d10 / 2.0d));
    }

    public final float b(MotionEvent event, boolean z10) {
        Intrinsics.checkNotNullParameter(event, "event");
        int actionIndex = event.getActionMasked() == 6 ? event.getActionIndex() : -1;
        if (!z10) {
            int pointerCount = event.getPointerCount();
            int i10 = pointerCount - 1;
            if (i10 == actionIndex) {
                i10 = pointerCount - 2;
            }
            return event.getX(i10);
        }
        int pointerCount2 = event.getPointerCount();
        float f10 = 0.0f;
        int i11 = 0;
        for (int i12 = 0; i12 < pointerCount2; i12++) {
            if (i12 != actionIndex) {
                f10 += event.getX(i12);
                i11++;
            }
        }
        return f10 / i11;
    }

    public final float c(MotionEvent event, boolean z10) {
        Intrinsics.checkNotNullParameter(event, "event");
        int actionIndex = event.getActionMasked() == 6 ? event.getActionIndex() : -1;
        if (!z10) {
            int pointerCount = event.getPointerCount();
            int i10 = pointerCount - 1;
            if (i10 == actionIndex) {
                i10 = pointerCount - 2;
            }
            return event.getY(i10);
        }
        int pointerCount2 = event.getPointerCount();
        float f10 = 0.0f;
        int i11 = 0;
        for (int i12 = 0; i12 < pointerCount2; i12++) {
            if (i12 != actionIndex) {
                f10 += event.getY(i12);
                i11++;
            }
        }
        return f10 / i11;
    }
}
