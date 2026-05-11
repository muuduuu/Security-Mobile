package io.sentry;

import io.sentry.protocol.C3443c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public final class O0 {

    /* renamed from: a, reason: collision with root package name */
    private K1 f34524a;

    /* renamed from: b, reason: collision with root package name */
    private T f34525b;

    /* renamed from: c, reason: collision with root package name */
    private String f34526c;

    /* renamed from: d, reason: collision with root package name */
    private io.sentry.protocol.B f34527d;

    /* renamed from: e, reason: collision with root package name */
    private io.sentry.protocol.m f34528e;

    /* renamed from: f, reason: collision with root package name */
    private List f34529f;

    /* renamed from: g, reason: collision with root package name */
    private final Queue f34530g;

    /* renamed from: h, reason: collision with root package name */
    private Map f34531h;

    /* renamed from: i, reason: collision with root package name */
    private Map f34532i;

    /* renamed from: j, reason: collision with root package name */
    private List f34533j;

    /* renamed from: k, reason: collision with root package name */
    private final P1 f34534k;

    /* renamed from: l, reason: collision with root package name */
    private volatile Z1 f34535l;

    /* renamed from: m, reason: collision with root package name */
    private final Object f34536m;

    /* renamed from: n, reason: collision with root package name */
    private final Object f34537n;

    /* renamed from: o, reason: collision with root package name */
    private final Object f34538o;

    /* renamed from: p, reason: collision with root package name */
    private C3443c f34539p;

    /* renamed from: q, reason: collision with root package name */
    private List f34540q;

    /* renamed from: r, reason: collision with root package name */
    private K0 f34541r;

    public interface a {
        void a(K0 k02);
    }

    interface b {
        void a(Z1 z12);
    }

    public interface c {
        void a(T t10);
    }

    static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final Z1 f34542a;

        /* renamed from: b, reason: collision with root package name */
        private final Z1 f34543b;

        public d(Z1 z12, Z1 z13) {
            this.f34543b = z12;
            this.f34542a = z13;
        }

        public Z1 a() {
            return this.f34543b;
        }

        public Z1 b() {
            return this.f34542a;
        }
    }

    public O0(P1 p12) {
        this.f34529f = new ArrayList();
        this.f34531h = new ConcurrentHashMap();
        this.f34532i = new ConcurrentHashMap();
        this.f34533j = new CopyOnWriteArrayList();
        this.f34536m = new Object();
        this.f34537n = new Object();
        this.f34538o = new Object();
        this.f34539p = new C3443c();
        this.f34540q = new CopyOnWriteArrayList();
        P1 p13 = (P1) io.sentry.util.n.c(p12, "SentryOptions is required.");
        this.f34534k = p13;
        this.f34530g = f(p13.getMaxBreadcrumbs());
        this.f34541r = new K0();
    }

    private Queue f(int i10) {
        return j2.h(new C3408f(i10));
    }

    Z1 A(b bVar) {
        Z1 clone;
        synchronized (this.f34536m) {
            try {
                bVar.a(this.f34535l);
                clone = this.f34535l != null ? this.f34535l.clone() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return clone;
    }

    public void B(c cVar) {
        synchronized (this.f34537n) {
            cVar.a(this.f34525b);
        }
    }

    public void a(C3405e c3405e, A a10) {
        if (c3405e == null) {
            return;
        }
        if (a10 == null) {
            new A();
        }
        this.f34534k.getBeforeBreadcrumb();
        this.f34530g.add(c3405e);
        for (N n10 : this.f34534k.getScopeObservers()) {
            n10.w(c3405e);
            n10.a(this.f34530g);
        }
    }

    public void b() {
        this.f34524a = null;
        this.f34527d = null;
        this.f34528e = null;
        this.f34529f.clear();
        d();
        this.f34531h.clear();
        this.f34532i.clear();
        this.f34533j.clear();
        e();
        c();
    }

    public void c() {
        this.f34540q.clear();
    }

    public void d() {
        this.f34530g.clear();
        Iterator<N> it = this.f34534k.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().a(this.f34530g);
        }
    }

    public void e() {
        synchronized (this.f34537n) {
            this.f34525b = null;
        }
        this.f34526c = null;
        for (N n10 : this.f34534k.getScopeObservers()) {
            n10.c(null);
            n10.b(null);
        }
    }

    Z1 g() {
        Z1 z12;
        synchronized (this.f34536m) {
            try {
                z12 = null;
                if (this.f34535l != null) {
                    this.f34535l.c();
                    Z1 clone = this.f34535l.clone();
                    this.f34535l = null;
                    z12 = clone;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z12;
    }

    List h() {
        return new CopyOnWriteArrayList(this.f34540q);
    }

    public Queue i() {
        return this.f34530g;
    }

    public C3443c j() {
        return this.f34539p;
    }

    List k() {
        return this.f34533j;
    }

    public Map l() {
        return this.f34532i;
    }

    public List m() {
        return this.f34529f;
    }

    public K1 n() {
        return this.f34524a;
    }

    public K0 o() {
        return this.f34541r;
    }

    public io.sentry.protocol.m p() {
        return this.f34528e;
    }

    public Z1 q() {
        return this.f34535l;
    }

    public S r() {
        b2 j10;
        T t10 = this.f34525b;
        return (t10 == null || (j10 = t10.j()) == null) ? t10 : j10;
    }

    public Map s() {
        return io.sentry.util.b.b(this.f34531h);
    }

    public T t() {
        return this.f34525b;
    }

    public String u() {
        T t10 = this.f34525b;
        return t10 != null ? t10.getName() : this.f34526c;
    }

    public io.sentry.protocol.B v() {
        return this.f34527d;
    }

    public void w(K0 k02) {
        this.f34541r = k02;
    }

    public void x(T t10) {
        synchronized (this.f34537n) {
            try {
                this.f34525b = t10;
                for (N n10 : this.f34534k.getScopeObservers()) {
                    if (t10 != null) {
                        n10.c(t10.getName());
                        n10.b(t10.n());
                    } else {
                        n10.c(null);
                        n10.b(null);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    d y() {
        d dVar;
        synchronized (this.f34536m) {
            try {
                if (this.f34535l != null) {
                    this.f34535l.c();
                }
                Z1 z12 = this.f34535l;
                dVar = null;
                if (this.f34534k.getRelease() != null) {
                    this.f34535l = new Z1(this.f34534k.getDistinctId(), this.f34527d, this.f34534k.getEnvironment(), this.f34534k.getRelease());
                    dVar = new d(this.f34535l.clone(), z12 != null ? z12.clone() : null);
                } else {
                    this.f34534k.getLogger().c(K1.WARNING, "Release is not set on SentryOptions. Session could not be started", new Object[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }

    public K0 z(a aVar) {
        K0 k02;
        synchronized (this.f34538o) {
            aVar.a(this.f34541r);
            k02 = new K0(this.f34541r);
        }
        return k02;
    }

    public O0(O0 o02) {
        this.f34529f = new ArrayList();
        this.f34531h = new ConcurrentHashMap();
        this.f34532i = new ConcurrentHashMap();
        this.f34533j = new CopyOnWriteArrayList();
        this.f34536m = new Object();
        this.f34537n = new Object();
        this.f34538o = new Object();
        this.f34539p = new C3443c();
        this.f34540q = new CopyOnWriteArrayList();
        this.f34525b = o02.f34525b;
        this.f34526c = o02.f34526c;
        this.f34535l = o02.f34535l;
        this.f34534k = o02.f34534k;
        this.f34524a = o02.f34524a;
        io.sentry.protocol.B b10 = o02.f34527d;
        this.f34527d = b10 != null ? new io.sentry.protocol.B(b10) : null;
        io.sentry.protocol.m mVar = o02.f34528e;
        this.f34528e = mVar != null ? new io.sentry.protocol.m(mVar) : null;
        this.f34529f = new ArrayList(o02.f34529f);
        this.f34533j = new CopyOnWriteArrayList(o02.f34533j);
        C3405e[] c3405eArr = (C3405e[]) o02.f34530g.toArray(new C3405e[0]);
        Queue f10 = f(o02.f34534k.getMaxBreadcrumbs());
        for (C3405e c3405e : c3405eArr) {
            f10.add(new C3405e(c3405e));
        }
        this.f34530g = f10;
        Map map = o02.f34531h;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (entry != null) {
                concurrentHashMap.put((String) entry.getKey(), (String) entry.getValue());
            }
        }
        this.f34531h = concurrentHashMap;
        Map map2 = o02.f34532i;
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        for (Map.Entry entry2 : map2.entrySet()) {
            if (entry2 != null) {
                concurrentHashMap2.put((String) entry2.getKey(), entry2.getValue());
            }
        }
        this.f34532i = concurrentHashMap2;
        this.f34539p = new C3443c(o02.f34539p);
        this.f34540q = new CopyOnWriteArrayList(o02.f34540q);
        this.f34541r = new K0(o02.f34541r);
    }
}
