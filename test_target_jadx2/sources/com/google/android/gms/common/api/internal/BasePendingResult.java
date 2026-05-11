package com.google.android.gms.common.api.internal;

import S6.k;
import S6.o;
import V6.AbstractC1287s;
import V6.InterfaceC1281l;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public abstract class BasePendingResult<R extends S6.o> extends S6.k {

    /* renamed from: o, reason: collision with root package name */
    static final ThreadLocal f23351o = new A();

    /* renamed from: b, reason: collision with root package name */
    protected final a f23353b;

    /* renamed from: c, reason: collision with root package name */
    protected final WeakReference f23354c;

    /* renamed from: f, reason: collision with root package name */
    private S6.p f23357f;

    /* renamed from: h, reason: collision with root package name */
    private S6.o f23359h;

    /* renamed from: i, reason: collision with root package name */
    private Status f23360i;

    /* renamed from: j, reason: collision with root package name */
    private volatile boolean f23361j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f23362k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f23363l;

    /* renamed from: m, reason: collision with root package name */
    private InterfaceC1281l f23364m;

    /* renamed from: a, reason: collision with root package name */
    private final Object f23352a = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final CountDownLatch f23355d = new CountDownLatch(1);

    /* renamed from: e, reason: collision with root package name */
    private final ArrayList f23356e = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private final AtomicReference f23358g = new AtomicReference();

    /* renamed from: n, reason: collision with root package name */
    private boolean f23365n = false;

    public static class a extends l7.l {
        public a(Looper looper) {
            super(looper);
        }

        public final void a(S6.p pVar, S6.o oVar) {
            ThreadLocal threadLocal = BasePendingResult.f23351o;
            sendMessage(obtainMessage(1, new Pair((S6.p) AbstractC1287s.m(pVar), oVar)));
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 != 1) {
                if (i10 == 2) {
                    ((BasePendingResult) message.obj).h(Status.f23342i);
                    return;
                }
                Log.wtf("BasePendingResult", "Don't know how to handle message: " + i10, new Exception());
                return;
            }
            Pair pair = (Pair) message.obj;
            S6.p pVar = (S6.p) pair.first;
            S6.o oVar = (S6.o) pair.second;
            try {
                pVar.c(oVar);
            } catch (RuntimeException e10) {
                BasePendingResult.o(oVar);
                throw e10;
            }
        }
    }

    protected BasePendingResult(S6.h hVar) {
        this.f23353b = new a(hVar != null ? hVar.k() : Looper.getMainLooper());
        this.f23354c = new WeakReference(hVar);
    }

    private final S6.o l() {
        S6.o oVar;
        synchronized (this.f23352a) {
            AbstractC1287s.q(!this.f23361j, "Result has already been consumed.");
            AbstractC1287s.q(j(), "Result is not ready.");
            oVar = this.f23359h;
            this.f23359h = null;
            this.f23357f = null;
            this.f23361j = true;
        }
        y yVar = (y) this.f23358g.getAndSet(null);
        if (yVar != null) {
            yVar.f23470a.f23472a.remove(this);
        }
        return (S6.o) AbstractC1287s.m(oVar);
    }

    private final void m(S6.o oVar) {
        this.f23359h = oVar;
        this.f23360i = oVar.c();
        this.f23364m = null;
        this.f23355d.countDown();
        if (this.f23362k) {
            this.f23357f = null;
        } else {
            S6.p pVar = this.f23357f;
            if (pVar != null) {
                this.f23353b.removeMessages(2);
                this.f23353b.a(pVar, l());
            }
        }
        ArrayList arrayList = this.f23356e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((k.a) arrayList.get(i10)).a(this.f23360i);
        }
        this.f23356e.clear();
    }

    @Override // S6.k
    public final void c(k.a aVar) {
        AbstractC1287s.b(aVar != null, "Callback cannot be null.");
        synchronized (this.f23352a) {
            try {
                if (j()) {
                    aVar.a(this.f23360i);
                } else {
                    this.f23356e.add(aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // S6.k
    public final S6.o d(long j10, TimeUnit timeUnit) {
        if (j10 > 0) {
            AbstractC1287s.l("await must not be called on the UI thread when time is greater than zero.");
        }
        AbstractC1287s.q(!this.f23361j, "Result has already been consumed.");
        AbstractC1287s.q(true, "Cannot await if then() has been called.");
        try {
            if (!this.f23355d.await(j10, timeUnit)) {
                h(Status.f23342i);
            }
        } catch (InterruptedException unused) {
            h(Status.f23340g);
        }
        AbstractC1287s.q(j(), "Result is not ready.");
        return l();
    }

    @Override // S6.k
    public final void e(S6.p pVar) {
        synchronized (this.f23352a) {
            try {
                if (pVar == null) {
                    this.f23357f = null;
                    return;
                }
                AbstractC1287s.q(!this.f23361j, "Result has already been consumed.");
                AbstractC1287s.q(true, "Cannot set callbacks if then() has been called.");
                if (i()) {
                    return;
                }
                if (j()) {
                    this.f23353b.a(pVar, l());
                } else {
                    this.f23357f = pVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void f() {
        synchronized (this.f23352a) {
            if (!this.f23362k && !this.f23361j) {
                InterfaceC1281l interfaceC1281l = this.f23364m;
                if (interfaceC1281l != null) {
                    try {
                        interfaceC1281l.cancel();
                    } catch (RemoteException unused) {
                    }
                }
                o(this.f23359h);
                this.f23362k = true;
                m(g(Status.f23343j));
            }
        }
    }

    protected abstract S6.o g(Status status);

    public final void h(Status status) {
        synchronized (this.f23352a) {
            try {
                if (!j()) {
                    k(g(status));
                    this.f23363l = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean i() {
        boolean z10;
        synchronized (this.f23352a) {
            z10 = this.f23362k;
        }
        return z10;
    }

    public final boolean j() {
        return this.f23355d.getCount() == 0;
    }

    public final void k(S6.o oVar) {
        synchronized (this.f23352a) {
            try {
                if (this.f23363l || this.f23362k) {
                    o(oVar);
                    return;
                }
                j();
                AbstractC1287s.q(!j(), "Results have already been set");
                AbstractC1287s.q(!this.f23361j, "Result has already been consumed");
                m(oVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void n() {
        boolean z10 = true;
        if (!this.f23365n && !((Boolean) f23351o.get()).booleanValue()) {
            z10 = false;
        }
        this.f23365n = z10;
    }

    public final boolean p() {
        boolean i10;
        synchronized (this.f23352a) {
            try {
                if (((S6.h) this.f23354c.get()) != null) {
                    if (!this.f23365n) {
                    }
                    i10 = i();
                }
                f();
                i10 = i();
            } catch (Throwable th) {
                throw th;
            }
        }
        return i10;
    }

    public final void q(y yVar) {
        this.f23358g.set(yVar);
    }

    public static void o(S6.o oVar) {
    }
}
