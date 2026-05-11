package com.google.android.gms.measurement.internal;

import V6.AbstractC1287s;
import android.os.Process;
import java.util.Objects;
import java.util.concurrent.BlockingQueue;

/* renamed from: com.google.android.gms.measurement.internal.h3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2688h3 extends Thread {

    /* renamed from: a, reason: collision with root package name */
    private final Object f26082a;

    /* renamed from: b, reason: collision with root package name */
    private final BlockingQueue f26083b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f26084c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C2696i3 f26085d;

    public C2688h3(C2696i3 c2696i3, String str, BlockingQueue blockingQueue) {
        Objects.requireNonNull(c2696i3);
        this.f26085d = c2696i3;
        this.f26084c = false;
        AbstractC1287s.m(str);
        AbstractC1287s.m(blockingQueue);
        this.f26082a = new Object();
        this.f26083b = blockingQueue;
        setName(str);
    }

    private final void b() {
        C2696i3 c2696i3 = this.f26085d;
        synchronized (c2696i3.B()) {
            try {
                if (!this.f26084c) {
                    c2696i3.C().release();
                    c2696i3.B().notifyAll();
                    if (this == c2696i3.x()) {
                        c2696i3.y(null);
                    } else if (this == c2696i3.z()) {
                        c2696i3.A(null);
                    } else {
                        c2696i3.f25694a.a().o().a("Current scheduler thread is neither worker nor network");
                    }
                    this.f26084c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void c(InterruptedException interruptedException) {
        this.f26085d.f25694a.a().r().b(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    public final void a() {
        Object obj = this.f26082a;
        synchronized (obj) {
            obj.notifyAll();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z10 = false;
        while (!z10) {
            try {
                this.f26085d.C().acquire();
                z10 = true;
            } catch (InterruptedException e10) {
                c(e10);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                BlockingQueue blockingQueue = this.f26083b;
                C2680g3 c2680g3 = (C2680g3) blockingQueue.poll();
                if (c2680g3 != null) {
                    Process.setThreadPriority(true != c2680g3.f26068b ? 10 : threadPriority);
                    c2680g3.run();
                } else {
                    Object obj = this.f26082a;
                    synchronized (obj) {
                        if (blockingQueue.peek() == null) {
                            this.f26085d.D();
                            try {
                                obj.wait(30000L);
                            } catch (InterruptedException e11) {
                                c(e11);
                            }
                        }
                    }
                    synchronized (this.f26085d.B()) {
                        if (this.f26083b.peek() == null) {
                            b();
                            b();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            b();
            throw th;
        }
    }
}
