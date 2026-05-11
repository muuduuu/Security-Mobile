package com.google.android.gms.common.api.internal;

import java.util.concurrent.locks.Lock;

/* loaded from: classes2.dex */
final class B implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2007b f23350a;

    B(C2007b c2007b) {
        this.f23350a = c2007b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Lock lock;
        Lock lock2;
        lock = this.f23350a.f23382r;
        lock.lock();
        try {
            C2007b.x(this.f23350a);
        } finally {
            lock2 = this.f23350a.f23382r;
            lock2.unlock();
        }
    }
}
