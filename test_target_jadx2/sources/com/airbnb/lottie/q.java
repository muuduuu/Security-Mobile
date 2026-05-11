package com.airbnb.lottie;

import O1.C;
import O1.y;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* loaded from: classes.dex */
public class q {

    /* renamed from: e, reason: collision with root package name */
    public static Executor f20101e = Executors.newCachedThreadPool(new b2.g());

    /* renamed from: a, reason: collision with root package name */
    private final Set f20102a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f20103b;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f20104c;

    /* renamed from: d, reason: collision with root package name */
    private volatile C f20105d;

    private static class a extends FutureTask {

        /* renamed from: a, reason: collision with root package name */
        private q f20106a;

        a(q qVar, Callable callable) {
            super(callable);
            this.f20106a = qVar;
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            try {
                if (isCancelled()) {
                    return;
                }
                try {
                    this.f20106a.l((C) get());
                } catch (InterruptedException | ExecutionException e10) {
                    this.f20106a.l(new C(e10));
                }
            } finally {
                this.f20106a = null;
            }
        }
    }

    public q(Callable callable) {
        this(callable, false);
    }

    private synchronized void f(Throwable th) {
        ArrayList arrayList = new ArrayList(this.f20103b);
        if (arrayList.isEmpty()) {
            b2.f.d("Lottie encountered an error but no failure listener was added:", th);
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((y) it.next()).onResult(th);
        }
    }

    private void g() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            h();
        } else {
            this.f20104c.post(new Runnable() { // from class: O1.D
                @Override // java.lang.Runnable
                public final void run() {
                    com.airbnb.lottie.q.this.h();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        C c10 = this.f20105d;
        if (c10 == null) {
            return;
        }
        if (c10.b() != null) {
            i(c10.b());
        } else {
            f(c10.a());
        }
    }

    private synchronized void i(Object obj) {
        Iterator it = new ArrayList(this.f20102a).iterator();
        while (it.hasNext()) {
            ((y) it.next()).onResult(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(C c10) {
        if (this.f20105d != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.f20105d = c10;
        g();
    }

    public synchronized q c(y yVar) {
        try {
            C c10 = this.f20105d;
            if (c10 != null && c10.a() != null) {
                yVar.onResult(c10.a());
            }
            this.f20103b.add(yVar);
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public synchronized q d(y yVar) {
        try {
            C c10 = this.f20105d;
            if (c10 != null && c10.b() != null) {
                yVar.onResult(c10.b());
            }
            this.f20102a.add(yVar);
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public C e() {
        return this.f20105d;
    }

    public synchronized q j(y yVar) {
        this.f20103b.remove(yVar);
        return this;
    }

    public synchronized q k(y yVar) {
        this.f20102a.remove(yVar);
        return this;
    }

    public q(Object obj) {
        this.f20102a = new LinkedHashSet(1);
        this.f20103b = new LinkedHashSet(1);
        this.f20104c = new Handler(Looper.getMainLooper());
        this.f20105d = null;
        l(new C(obj));
    }

    q(Callable callable, boolean z10) {
        this.f20102a = new LinkedHashSet(1);
        this.f20103b = new LinkedHashSet(1);
        this.f20104c = new Handler(Looper.getMainLooper());
        this.f20105d = null;
        if (z10) {
            try {
                l((C) callable.call());
                return;
            } catch (Throwable th) {
                l(new C(th));
                return;
            }
        }
        f20101e.execute(new a(this, callable));
    }
}
