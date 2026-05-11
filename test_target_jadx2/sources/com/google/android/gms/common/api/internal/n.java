package com.google.android.gms.common.api.internal;

import S6.h;
import V6.AbstractC1287s;
import V6.C1271e;
import android.os.Bundle;
import com.google.android.gms.common.C2010b;
import java.util.concurrent.locks.Lock;

/* loaded from: classes2.dex */
final class n implements h.b, h.c {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ p f23402f;

    /* synthetic */ n(p pVar, T6.D d10) {
        this.f23402f = pVar;
    }

    @Override // T6.InterfaceC1169e
    public final void onConnected(Bundle bundle) {
        C1271e c1271e;
        A7.e eVar;
        c1271e = this.f23402f.f23421r;
        eVar = this.f23402f.f23414k;
        ((A7.e) AbstractC1287s.m(eVar)).u(new m(this.f23402f));
    }

    @Override // T6.InterfaceC1184n
    public final void onConnectionFailed(C2010b c2010b) {
        Lock lock;
        Lock lock2;
        boolean q10;
        Lock lock3;
        lock = this.f23402f.f23405b;
        lock.lock();
        try {
            q10 = this.f23402f.q(c2010b);
            if (q10) {
                this.f23402f.i();
                this.f23402f.n();
            } else {
                this.f23402f.l(c2010b);
            }
            lock3 = this.f23402f.f23405b;
            lock3.unlock();
        } catch (Throwable th) {
            lock2 = this.f23402f.f23405b;
            lock2.unlock();
            throw th;
        }
    }

    @Override // T6.InterfaceC1169e
    public final void onConnectionSuspended(int i10) {
    }
}
