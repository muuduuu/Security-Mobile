package com.facebook.common.time;

import android.os.SystemClock;
import i3.InterfaceC3317b;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class RealtimeSinceBootClock implements InterfaceC3317b {

    /* renamed from: a, reason: collision with root package name */
    private static final RealtimeSinceBootClock f20581a = new RealtimeSinceBootClock();

    private RealtimeSinceBootClock() {
    }

    public static RealtimeSinceBootClock get() {
        return f20581a;
    }

    @Override // i3.InterfaceC3317b
    public long now() {
        return SystemClock.elapsedRealtime();
    }

    @Override // i3.InterfaceC3317b
    public long nowNanos() {
        return TimeUnit.MILLISECONDS.toNanos(now());
    }
}
