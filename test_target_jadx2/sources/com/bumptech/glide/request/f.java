package com.bumptech.glide.request;

import D2.l;
import android.graphics.drawable.Drawable;
import i2.EnumC3313a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import k2.q;

/* loaded from: classes.dex */
public class f implements c, g {

    /* renamed from: k, reason: collision with root package name */
    private static final a f20372k = new a();

    /* renamed from: a, reason: collision with root package name */
    private final int f20373a;

    /* renamed from: b, reason: collision with root package name */
    private final int f20374b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f20375c;

    /* renamed from: d, reason: collision with root package name */
    private final a f20376d;

    /* renamed from: e, reason: collision with root package name */
    private Object f20377e;

    /* renamed from: f, reason: collision with root package name */
    private d f20378f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f20379g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f20380h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f20381i;

    /* renamed from: j, reason: collision with root package name */
    private q f20382j;

    static class a {
        a() {
        }

        void a(Object obj) {
            obj.notifyAll();
        }

        void b(Object obj, long j10) {
            obj.wait(j10);
        }
    }

    public f(int i10, int i11) {
        this(i10, i11, true, f20372k);
    }

    private synchronized Object o(Long l10) {
        try {
            if (this.f20375c && !isDone()) {
                l.a();
            }
            if (this.f20379g) {
                throw new CancellationException();
            }
            if (this.f20381i) {
                throw new ExecutionException(this.f20382j);
            }
            if (this.f20380h) {
                return this.f20377e;
            }
            if (l10 == null) {
                this.f20376d.b(this, 0L);
            } else if (l10.longValue() > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                long longValue = l10.longValue() + currentTimeMillis;
                while (!isDone() && currentTimeMillis < longValue) {
                    this.f20376d.b(this, longValue - currentTimeMillis);
                    currentTimeMillis = System.currentTimeMillis();
                }
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            if (this.f20381i) {
                throw new ExecutionException(this.f20382j);
            }
            if (this.f20379g) {
                throw new CancellationException();
            }
            if (!this.f20380h) {
                throw new TimeoutException();
            }
            return this.f20377e;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // x2.l
    public void a() {
    }

    @Override // x2.l
    public void b() {
    }

    @Override // x2.l
    public void c() {
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        synchronized (this) {
            try {
                if (isDone()) {
                    return false;
                }
                this.f20379g = true;
                this.f20376d.a(this);
                d dVar = null;
                if (z10) {
                    d dVar2 = this.f20378f;
                    this.f20378f = null;
                    dVar = dVar2;
                }
                if (dVar != null) {
                    dVar.clear();
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.g
    public synchronized boolean f(Object obj, Object obj2, A2.d dVar, EnumC3313a enumC3313a, boolean z10) {
        this.f20380h = true;
        this.f20377e = obj;
        this.f20376d.a(this);
        return false;
    }

    @Override // com.bumptech.glide.request.g
    public synchronized boolean g(q qVar, Object obj, A2.d dVar, boolean z10) {
        this.f20381i = true;
        this.f20382j = qVar;
        this.f20376d.a(this);
        return false;
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        try {
            return o(null);
        } catch (TimeoutException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // A2.d
    public synchronized void h(d dVar) {
        this.f20378f = dVar;
    }

    @Override // A2.d
    public synchronized void i(Drawable drawable) {
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isCancelled() {
        return this.f20379g;
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isDone() {
        boolean z10;
        if (!this.f20379g && !this.f20380h) {
            z10 = this.f20381i;
        }
        return z10;
    }

    @Override // A2.d
    public void j(A2.c cVar) {
        cVar.c(this.f20373a, this.f20374b);
    }

    @Override // A2.d
    public void k(Drawable drawable) {
    }

    @Override // A2.d
    public synchronized d l() {
        return this.f20378f;
    }

    @Override // A2.d
    public void m(Drawable drawable) {
    }

    @Override // A2.d
    public synchronized void n(Object obj, B2.b bVar) {
    }

    public String toString() {
        d dVar;
        String str;
        String str2 = super.toString() + "[status=";
        synchronized (this) {
            try {
                dVar = null;
                if (this.f20379g) {
                    str = "CANCELLED";
                } else if (this.f20381i) {
                    str = "FAILURE";
                } else if (this.f20380h) {
                    str = "SUCCESS";
                } else {
                    str = "PENDING";
                    dVar = this.f20378f;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (dVar == null) {
            return str2 + str + "]";
        }
        return str2 + str + ", request=[" + dVar + "]]";
    }

    f(int i10, int i11, boolean z10, a aVar) {
        this.f20373a = i10;
        this.f20374b = i11;
        this.f20375c = z10;
        this.f20376d = aVar;
    }

    @Override // java.util.concurrent.Future
    public Object get(long j10, TimeUnit timeUnit) {
        return o(Long.valueOf(timeUnit.toMillis(j10)));
    }

    @Override // A2.d
    public void d(A2.c cVar) {
    }
}
