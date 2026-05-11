package androidx.core.view;

import android.os.Build;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class X {

    /* renamed from: a, reason: collision with root package name */
    private static Map f16078a = Collections.synchronizedMap(new WeakHashMap());

    private static class a {
        static float a(VelocityTracker velocityTracker, int i10) {
            return velocityTracker.getAxisVelocity(i10);
        }

        static float b(VelocityTracker velocityTracker, int i10, int i11) {
            return velocityTracker.getAxisVelocity(i10, i11);
        }

        static boolean c(VelocityTracker velocityTracker, int i10) {
            return velocityTracker.isAxisSupported(i10);
        }
    }

    public static void a(VelocityTracker velocityTracker, MotionEvent motionEvent) {
        velocityTracker.addMovement(motionEvent);
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            if (!f16078a.containsKey(velocityTracker)) {
                f16078a.put(velocityTracker, new Y());
            }
            ((Y) f16078a.get(velocityTracker)).a(motionEvent);
        }
    }

    public static void b(VelocityTracker velocityTracker, int i10) {
        c(velocityTracker, i10, Float.MAX_VALUE);
    }

    public static void c(VelocityTracker velocityTracker, int i10, float f10) {
        velocityTracker.computeCurrentVelocity(i10, f10);
        Y e10 = e(velocityTracker);
        if (e10 != null) {
            e10.c(i10, f10);
        }
    }

    public static float d(VelocityTracker velocityTracker, int i10) {
        if (Build.VERSION.SDK_INT >= 34) {
            return a.a(velocityTracker, i10);
        }
        if (i10 == 0) {
            return velocityTracker.getXVelocity();
        }
        if (i10 == 1) {
            return velocityTracker.getYVelocity();
        }
        Y e10 = e(velocityTracker);
        if (e10 != null) {
            return e10.d(i10);
        }
        return 0.0f;
    }

    private static Y e(VelocityTracker velocityTracker) {
        return (Y) f16078a.get(velocityTracker);
    }
}
