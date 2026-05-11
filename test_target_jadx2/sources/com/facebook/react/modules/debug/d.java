package com.facebook.react.modules.debug;

import b5.InterfaceC1650a;
import com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class d implements NotThreadSafeBridgeIdleDebugListener, InterfaceC1650a {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f21768a = new ArrayList(20);

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f21769b = new ArrayList(20);

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList f21770c = new ArrayList(20);

    /* renamed from: d, reason: collision with root package name */
    private final ArrayList f21771d = new ArrayList(20);

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f21772e = true;

    private final boolean c(long j10, long j11) {
        long e10;
        long e11;
        e10 = e.e(this.f21768a, j10, j11);
        e11 = e.e(this.f21769b, j10, j11);
        return (e10 == -1 && e11 == -1) ? this.f21772e : e10 > e11;
    }

    @Override // b5.InterfaceC1650a
    public synchronized void a() {
        this.f21770c.add(Long.valueOf(System.nanoTime()));
    }

    @Override // b5.InterfaceC1650a
    public synchronized void b() {
        this.f21771d.add(Long.valueOf(System.nanoTime()));
    }

    public final synchronized boolean d(long j10, long j11) {
        boolean f10;
        boolean z10;
        boolean f11;
        try {
            f10 = e.f(this.f21771d, j10, j11);
            boolean c10 = c(j10, j11);
            z10 = true;
            if (!f10) {
                if (c10) {
                    f11 = e.f(this.f21770c, j10, j11);
                    if (!f11) {
                    }
                }
                z10 = false;
            }
            e.d(this.f21768a, j11);
            e.d(this.f21769b, j11);
            e.d(this.f21770c, j11);
            e.d(this.f21771d, j11);
            this.f21772e = c10;
        } catch (Throwable th) {
            throw th;
        }
        return z10;
    }

    @Override // com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener
    public synchronized void onBridgeDestroyed() {
    }

    @Override // com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener
    public synchronized void onTransitionToBridgeBusy() {
        this.f21769b.add(Long.valueOf(System.nanoTime()));
    }

    @Override // com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener
    public synchronized void onTransitionToBridgeIdle() {
        this.f21768a.add(Long.valueOf(System.nanoTime()));
    }
}
