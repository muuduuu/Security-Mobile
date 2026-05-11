package com.google.android.gms.common.api.internal;

import java.util.concurrent.locks.Lock;

/* loaded from: classes2.dex */
abstract class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ p f23403a;

    protected abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        Lock lock;
        Lock lock2;
        x xVar;
        lock = this.f23403a.f23405b;
        lock.lock();
        try {
            try {
                if (!Thread.interrupted()) {
                    a();
                }
            } catch (RuntimeException e10) {
                xVar = this.f23403a.f23404a;
                xVar.o(e10);
            }
        } finally {
            lock2 = this.f23403a.f23405b;
            lock2.unlock();
        }
    }
}
