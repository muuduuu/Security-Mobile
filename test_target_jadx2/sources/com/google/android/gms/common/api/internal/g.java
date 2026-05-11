package com.google.android.gms.common.api.internal;

import V6.AbstractC1267c;
import V6.AbstractC1287s;
import android.os.Looper;
import com.google.android.gms.common.C2010b;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

/* loaded from: classes2.dex */
final class g implements AbstractC1267c.InterfaceC0202c {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f23389a;

    /* renamed from: b, reason: collision with root package name */
    private final S6.a f23390b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f23391c;

    public g(p pVar, S6.a aVar, boolean z10) {
        this.f23389a = new WeakReference(pVar);
        this.f23390b = aVar;
        this.f23391c = z10;
    }

    @Override // V6.AbstractC1267c.InterfaceC0202c
    public final void a(C2010b c2010b) {
        x xVar;
        Lock lock;
        Lock lock2;
        boolean o10;
        boolean p10;
        p pVar = (p) this.f23389a.get();
        if (pVar == null) {
            return;
        }
        Looper myLooper = Looper.myLooper();
        xVar = pVar.f23404a;
        AbstractC1287s.q(myLooper == xVar.f23468s.k(), "onReportServiceBinding must be called on the GoogleApiClient handler thread");
        lock = pVar.f23405b;
        lock.lock();
        try {
            o10 = pVar.o(0);
            if (o10) {
                if (!c2010b.Z0()) {
                    pVar.m(c2010b, this.f23390b, this.f23391c);
                }
                p10 = pVar.p();
                if (p10) {
                    pVar.n();
                }
            }
        } finally {
            lock2 = pVar.f23405b;
            lock2.unlock();
        }
    }
}
