package kotlin.time;

import co.hyperverge.hypersnapsdk.service.framerecorder.HVFrameRecorder;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.d;
import zc.AbstractC5272a;

/* loaded from: classes3.dex */
public abstract class b {
    /* JADX INFO: Access modifiers changed from: private */
    public static final long d(long j10, int i10) {
        return a.n((j10 << 1) + i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long e(long j10) {
        return a.n((j10 << 1) + 1);
    }

    private static final long f(long j10) {
        return (-4611686018426L > j10 || j10 >= 4611686018427L) ? e(d.l(j10, -4611686018427387903L, 4611686018427387903L)) : g(h(j10));
    }

    private static final long g(long j10) {
        return a.n(j10 << 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long h(long j10) {
        return j10 * HVFrameRecorder.BITRATE;
    }

    public static final long i(double d10, Id.b unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        double a10 = c.a(d10, unit, Id.b.NANOSECONDS);
        if (Double.isNaN(a10)) {
            throw new IllegalArgumentException("Duration value cannot be NaN.");
        }
        long d11 = AbstractC5272a.d(a10);
        return (-4611686018426999999L > d11 || d11 >= 4611686018427000000L) ? f(AbstractC5272a.d(c.a(d10, unit, Id.b.MILLISECONDS))) : g(d11);
    }

    public static final long j(int i10, Id.b unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return unit.compareTo(Id.b.SECONDS) <= 0 ? g(c.c(i10, unit, Id.b.NANOSECONDS)) : k(i10, unit);
    }

    public static final long k(long j10, Id.b unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        Id.b bVar = Id.b.NANOSECONDS;
        long c10 = c.c(4611686018426999999L, bVar, unit);
        return ((-c10) > j10 || j10 > c10) ? e(d.l(c.b(j10, unit, Id.b.MILLISECONDS), -4611686018427387903L, 4611686018427387903L)) : g(c.c(j10, unit, bVar));
    }
}
