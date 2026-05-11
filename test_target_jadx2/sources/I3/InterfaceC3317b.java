package i3;

import java.util.concurrent.TimeUnit;

/* renamed from: i3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC3317b {
    default long now() {
        return TimeUnit.NANOSECONDS.toMillis(nowNanos());
    }

    long nowNanos();
}
