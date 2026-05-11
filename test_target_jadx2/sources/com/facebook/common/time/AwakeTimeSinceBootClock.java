package com.facebook.common.time;

import i3.InterfaceC3318c;

/* loaded from: classes.dex */
public class AwakeTimeSinceBootClock implements InterfaceC3318c {
    private static final AwakeTimeSinceBootClock INSTANCE = new AwakeTimeSinceBootClock();

    private AwakeTimeSinceBootClock() {
    }

    public static AwakeTimeSinceBootClock get() {
        return INSTANCE;
    }

    @Override // i3.InterfaceC3318c, i3.InterfaceC3317b
    public /* bridge */ /* synthetic */ long now() {
        return super.now();
    }

    @Override // i3.InterfaceC3318c, i3.InterfaceC3317b
    public long nowNanos() {
        return System.nanoTime();
    }
}
