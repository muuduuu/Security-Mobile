package com.google.android.gms.common.api.internal;

import T6.F0;
import T6.W;
import android.os.Bundle;
import com.google.android.gms.common.C2010b;
import java.util.concurrent.locks.Lock;

/* loaded from: classes2.dex */
final class D implements W {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2007b f23367a;

    /* synthetic */ D(C2007b c2007b, F0 f02) {
        this.f23367a = c2007b;
    }

    @Override // T6.W
    public final void a(Bundle bundle) {
        Lock lock;
        Lock lock2;
        lock = this.f23367a.f23382r;
        lock.lock();
        try {
            this.f23367a.f23380p = C2010b.f23474f;
            C2007b.x(this.f23367a);
        } finally {
            lock2 = this.f23367a.f23382r;
            lock2.unlock();
        }
    }

    @Override // T6.W
    public final void b(int i10, boolean z10) {
        Lock lock;
        Lock lock2;
        boolean z11;
        x xVar;
        Lock lock3;
        lock = this.f23367a.f23382r;
        lock.lock();
        try {
            C2007b c2007b = this.f23367a;
            z11 = c2007b.f23381q;
            if (z11) {
                c2007b.f23381q = false;
                C2007b.v(this.f23367a, i10, z10);
            } else {
                c2007b.f23381q = true;
                xVar = this.f23367a.f23373i;
                xVar.onConnectionSuspended(i10);
            }
            lock3 = this.f23367a.f23382r;
            lock3.unlock();
        } catch (Throwable th) {
            lock2 = this.f23367a.f23382r;
            lock2.unlock();
            throw th;
        }
    }

    @Override // T6.W
    public final void c(C2010b c2010b) {
        Lock lock;
        Lock lock2;
        lock = this.f23367a.f23382r;
        lock.lock();
        try {
            this.f23367a.f23380p = c2010b;
            C2007b.x(this.f23367a);
        } finally {
            lock2 = this.f23367a.f23382r;
            lock2.unlock();
        }
    }
}
