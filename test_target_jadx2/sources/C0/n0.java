package c0;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class n0 implements o0 {
    @Override // c0.o0
    public long a() {
        return TimeUnit.NANOSECONDS.toMicros(System.nanoTime());
    }

    @Override // c0.o0
    public long b() {
        return TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos());
    }
}
