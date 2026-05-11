package D2;

import android.os.SystemClock;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    private static final double f1191a = 1.0d / Math.pow(10.0d, 6.0d);

    public static double a(long j10) {
        return (b() - j10) * f1191a;
    }

    public static long b() {
        return SystemClock.elapsedRealtimeNanos();
    }
}
