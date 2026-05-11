package Qd;

import Od.E;
import Od.G;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final String f8337a = E.e("kotlinx.coroutines.scheduler.default.name", "DefaultDispatcher");

    /* renamed from: b, reason: collision with root package name */
    public static final long f8338b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f8339c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f8340d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f8341e;

    /* renamed from: f, reason: collision with root package name */
    public static g f8342f;

    static {
        long f10;
        int e10;
        int e11;
        long f11;
        f10 = G.f("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 0L, 0L, 12, null);
        f8338b = f10;
        e10 = G.e("kotlinx.coroutines.scheduler.core.pool.size", kotlin.ranges.d.d(E.a(), 2), 1, 0, 8, null);
        f8339c = e10;
        e11 = G.e("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, null);
        f8340d = e11;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f11 = G.f("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 0L, 0L, 12, null);
        f8341e = timeUnit.toNanos(f11);
        f8342f = e.f8328a;
    }

    public static final h b(Runnable runnable, long j10, boolean z10) {
        return new i(runnable, j10, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String c(boolean z10) {
        return z10 ? "Blocking" : "Non-blocking";
    }
}
