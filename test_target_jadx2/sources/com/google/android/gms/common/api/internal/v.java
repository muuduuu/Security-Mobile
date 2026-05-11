package com.google.android.gms.common.api.internal;

import T6.F;
import java.util.concurrent.locks.Lock;

/* loaded from: classes2.dex */
abstract class v {

    /* renamed from: a, reason: collision with root package name */
    private final F f23453a;

    protected v(F f10) {
        this.f23453a = f10;
    }

    protected abstract void a();

    public final void b(x xVar) {
        Lock lock;
        Lock lock2;
        F f10;
        lock = xVar.f23455f;
        lock.lock();
        try {
            f10 = xVar.f23465p;
            if (f10 == this.f23453a) {
                a();
            }
        } finally {
            lock2 = xVar.f23455f;
            lock2.unlock();
        }
    }
}
