package com.google.android.gms.common.api.internal;

import T6.E0;
import T6.W;
import android.os.Bundle;
import com.google.android.gms.common.C2010b;
import java.util.concurrent.locks.Lock;

/* loaded from: classes2.dex */
final class C implements W {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2007b f23366a;

    /* synthetic */ C(C2007b c2007b, E0 e02) {
        this.f23366a = c2007b;
    }

    @Override // T6.W
    public final void a(Bundle bundle) {
        Lock lock;
        Lock lock2;
        lock = this.f23366a.f23382r;
        lock.lock();
        try {
            C2007b.w(this.f23366a, bundle);
            this.f23366a.f23379o = C2010b.f23474f;
            C2007b.x(this.f23366a);
        } finally {
            lock2 = this.f23366a.f23382r;
            lock2.unlock();
        }
    }

    @Override // T6.W
    public final void b(int i10, boolean z10) {
        Lock lock;
        Lock lock2;
        boolean z11;
        Lock lock3;
        C2010b c2010b;
        C2010b c2010b2;
        x xVar;
        lock = this.f23366a.f23382r;
        lock.lock();
        try {
            C2007b c2007b = this.f23366a;
            z11 = c2007b.f23381q;
            if (!z11) {
                c2010b = c2007b.f23380p;
                if (c2010b != null) {
                    c2010b2 = c2007b.f23380p;
                    if (c2010b2.Z0()) {
                        this.f23366a.f23381q = true;
                        xVar = this.f23366a.f23374j;
                        xVar.onConnectionSuspended(i10);
                        lock3 = this.f23366a.f23382r;
                        lock3.unlock();
                    }
                }
            }
            this.f23366a.f23381q = false;
            C2007b.v(this.f23366a, i10, z10);
            lock3 = this.f23366a.f23382r;
            lock3.unlock();
        } catch (Throwable th) {
            lock2 = this.f23366a.f23382r;
            lock2.unlock();
            throw th;
        }
    }

    @Override // T6.W
    public final void c(C2010b c2010b) {
        Lock lock;
        Lock lock2;
        lock = this.f23366a.f23382r;
        lock.lock();
        try {
            this.f23366a.f23379o = c2010b;
            C2007b.x(this.f23366a);
        } finally {
            lock2 = this.f23366a.f23382r;
            lock2.unlock();
        }
    }
}
