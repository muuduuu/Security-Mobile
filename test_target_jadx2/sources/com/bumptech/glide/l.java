package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import v2.C4913c;
import x2.b;
import x2.p;
import x2.q;
import x2.s;

/* loaded from: classes.dex */
public class l implements ComponentCallbacks2, x2.l {

    /* renamed from: m, reason: collision with root package name */
    private static final com.bumptech.glide.request.h f20280m = (com.bumptech.glide.request.h) com.bumptech.glide.request.h.n0(Bitmap.class).V();

    /* renamed from: n, reason: collision with root package name */
    private static final com.bumptech.glide.request.h f20281n = (com.bumptech.glide.request.h) com.bumptech.glide.request.h.n0(C4913c.class).V();

    /* renamed from: o, reason: collision with root package name */
    private static final com.bumptech.glide.request.h f20282o = (com.bumptech.glide.request.h) ((com.bumptech.glide.request.h) com.bumptech.glide.request.h.o0(k2.j.f36074c).Z(h.LOW)).h0(true);

    /* renamed from: a, reason: collision with root package name */
    protected final c f20283a;

    /* renamed from: b, reason: collision with root package name */
    protected final Context f20284b;

    /* renamed from: c, reason: collision with root package name */
    final x2.j f20285c;

    /* renamed from: d, reason: collision with root package name */
    private final q f20286d;

    /* renamed from: e, reason: collision with root package name */
    private final p f20287e;

    /* renamed from: f, reason: collision with root package name */
    private final s f20288f;

    /* renamed from: g, reason: collision with root package name */
    private final Runnable f20289g;

    /* renamed from: h, reason: collision with root package name */
    private final x2.b f20290h;

    /* renamed from: i, reason: collision with root package name */
    private final CopyOnWriteArrayList f20291i;

    /* renamed from: j, reason: collision with root package name */
    private com.bumptech.glide.request.h f20292j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f20293k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f20294l;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            l lVar = l.this;
            lVar.f20285c.b(lVar);
        }
    }

    private class b implements b.a {

        /* renamed from: a, reason: collision with root package name */
        private final q f20296a;

        b(q qVar) {
            this.f20296a = qVar;
        }

        @Override // x2.b.a
        public void a(boolean z10) {
            if (z10) {
                synchronized (l.this) {
                    this.f20296a.e();
                }
            }
        }
    }

    public l(c cVar, x2.j jVar, p pVar, Context context) {
        this(cVar, jVar, pVar, new q(), cVar.h(), context);
    }

    private void C(A2.d dVar) {
        boolean B10 = B(dVar);
        com.bumptech.glide.request.d l10 = dVar.l();
        if (B10 || this.f20283a.q(dVar) || l10 == null) {
            return;
        }
        dVar.h(null);
        l10.clear();
    }

    private synchronized void q() {
        try {
            Iterator it = this.f20288f.f().iterator();
            while (it.hasNext()) {
                p((A2.d) it.next());
            }
            this.f20288f.e();
        } catch (Throwable th) {
            throw th;
        }
    }

    synchronized void A(A2.d dVar, com.bumptech.glide.request.d dVar2) {
        this.f20288f.g(dVar);
        this.f20286d.g(dVar2);
    }

    synchronized boolean B(A2.d dVar) {
        com.bumptech.glide.request.d l10 = dVar.l();
        if (l10 == null) {
            return true;
        }
        if (!this.f20286d.a(l10)) {
            return false;
        }
        this.f20288f.o(dVar);
        dVar.h(null);
        return true;
    }

    @Override // x2.l
    public synchronized void a() {
        try {
            this.f20288f.a();
            if (this.f20294l) {
                q();
            } else {
                x();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // x2.l
    public synchronized void b() {
        y();
        this.f20288f.b();
    }

    @Override // x2.l
    public synchronized void c() {
        this.f20288f.c();
        q();
        this.f20286d.b();
        this.f20285c.a(this);
        this.f20285c.a(this.f20290h);
        D2.l.w(this.f20289g);
        this.f20283a.t(this);
    }

    public k e(Class cls) {
        return new k(this.f20283a, this, cls, this.f20284b);
    }

    public k f() {
        return e(Bitmap.class).a(f20280m);
    }

    public k g() {
        return e(Drawable.class);
    }

    public k o() {
        return e(File.class).a(com.bumptech.glide.request.h.q0(true));
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        if (i10 == 60 && this.f20293k) {
            w();
        }
    }

    public void p(A2.d dVar) {
        if (dVar == null) {
            return;
        }
        C(dVar);
    }

    List r() {
        return this.f20291i;
    }

    synchronized com.bumptech.glide.request.h s() {
        return this.f20292j;
    }

    m t(Class cls) {
        return this.f20283a.j().d(cls);
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.f20286d + ", treeNode=" + this.f20287e + "}";
    }

    public k u(Object obj) {
        return g().B0(obj);
    }

    public synchronized void v() {
        this.f20286d.c();
    }

    public synchronized void w() {
        v();
        Iterator it = this.f20287e.a().iterator();
        while (it.hasNext()) {
            ((l) it.next()).v();
        }
    }

    public synchronized void x() {
        this.f20286d.d();
    }

    public synchronized void y() {
        this.f20286d.f();
    }

    protected synchronized void z(com.bumptech.glide.request.h hVar) {
        this.f20292j = (com.bumptech.glide.request.h) ((com.bumptech.glide.request.h) hVar.clone()).b();
    }

    l(c cVar, x2.j jVar, p pVar, q qVar, x2.c cVar2, Context context) {
        this.f20288f = new s();
        a aVar = new a();
        this.f20289g = aVar;
        this.f20283a = cVar;
        this.f20285c = jVar;
        this.f20287e = pVar;
        this.f20286d = qVar;
        this.f20284b = context;
        x2.b a10 = cVar2.a(context.getApplicationContext(), new b(qVar));
        this.f20290h = a10;
        cVar.p(this);
        if (D2.l.r()) {
            D2.l.v(aVar);
        } else {
            jVar.b(this);
        }
        jVar.b(a10);
        this.f20291i = new CopyOnWriteArrayList(cVar.j().b());
        z(cVar.j().c());
    }
}
