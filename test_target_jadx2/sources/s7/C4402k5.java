package s7;

import android.os.SystemClock;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: s7.k5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4402k5 implements Closeable {

    /* renamed from: h, reason: collision with root package name */
    private static final Map f41292h = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    private final String f41293a;

    /* renamed from: b, reason: collision with root package name */
    private int f41294b;

    /* renamed from: c, reason: collision with root package name */
    private double f41295c;

    /* renamed from: d, reason: collision with root package name */
    private long f41296d;

    /* renamed from: e, reason: collision with root package name */
    private long f41297e;

    /* renamed from: f, reason: collision with root package name */
    private long f41298f;

    /* renamed from: g, reason: collision with root package name */
    private long f41299g;

    private C4402k5(String str) {
        this.f41298f = 2147483647L;
        this.f41299g = -2147483648L;
        this.f41293a = str;
    }

    private final void a() {
        this.f41294b = 0;
        this.f41295c = 0.0d;
        this.f41296d = 0L;
        this.f41298f = 2147483647L;
        this.f41299g = -2147483648L;
    }

    public static C4402k5 e(String str) {
        C4388i5 c4388i5;
        K5.a();
        if (!K5.b()) {
            c4388i5 = C4388i5.f41261i;
            return c4388i5;
        }
        Map map = f41292h;
        if (map.get("detectorTaskWithResource#run") == null) {
            map.put("detectorTaskWithResource#run", new C4402k5("detectorTaskWithResource#run"));
        }
        return (C4402k5) map.get("detectorTaskWithResource#run");
    }

    public C4402k5 b() {
        this.f41296d = SystemClock.elapsedRealtimeNanos() / 1000;
        return this;
    }

    public void c(long j10) {
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
        long j11 = this.f41297e;
        if (j11 != 0 && elapsedRealtimeNanos - j11 >= 1000000) {
            a();
        }
        this.f41297e = elapsedRealtimeNanos;
        this.f41294b++;
        this.f41295c += j10;
        this.f41298f = Math.min(this.f41298f, j10);
        this.f41299g = Math.max(this.f41299g, j10);
        if (this.f41294b % 50 == 0) {
            String.format(Locale.US, "[%s] cur=%dus, counts=%d, min=%dus, max=%dus, avg=%dus", this.f41293a, Long.valueOf(j10), Integer.valueOf(this.f41294b), Long.valueOf(this.f41298f), Long.valueOf(this.f41299g), Integer.valueOf((int) (this.f41295c / this.f41294b)));
            K5.a();
        }
        if (this.f41294b % 500 == 0) {
            a();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j10 = this.f41296d;
        if (j10 == 0) {
            throw new IllegalStateException("Did you forget to call start()?");
        }
        d(j10);
    }

    public void d(long j10) {
        c((SystemClock.elapsedRealtimeNanos() / 1000) - j10);
    }
}
