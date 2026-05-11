package j8;

import android.os.SystemClock;

/* renamed from: j8.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3518l {
    public static AbstractC3518l a(long j10, long j11, long j12) {
        return new C3507a(j10, j11, j12);
    }

    public static AbstractC3518l e() {
        return a(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    }

    public abstract long b();

    public abstract long c();

    public abstract long d();
}
