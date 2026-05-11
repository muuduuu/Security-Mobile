package W2;

import V2.a;
import V2.c;
import W2.i;
import c3.AbstractC1721a;
import g3.C3185a;
import i3.C3319d;
import i3.InterfaceC3316a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class j implements n, Y2.a {

    /* renamed from: r, reason: collision with root package name */
    private static final Class f11309r = j.class;

    /* renamed from: s, reason: collision with root package name */
    private static final long f11310s = TimeUnit.HOURS.toMillis(2);

    /* renamed from: t, reason: collision with root package name */
    private static final long f11311t = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a, reason: collision with root package name */
    private final long f11312a;

    /* renamed from: b, reason: collision with root package name */
    private final long f11313b;

    /* renamed from: c, reason: collision with root package name */
    private final CountDownLatch f11314c;

    /* renamed from: d, reason: collision with root package name */
    private long f11315d;

    /* renamed from: e, reason: collision with root package name */
    private final V2.c f11316e;

    /* renamed from: f, reason: collision with root package name */
    final Set f11317f;

    /* renamed from: g, reason: collision with root package name */
    private long f11318g;

    /* renamed from: h, reason: collision with root package name */
    private final long f11319h;

    /* renamed from: i, reason: collision with root package name */
    private final C3185a f11320i;

    /* renamed from: j, reason: collision with root package name */
    private final i f11321j;

    /* renamed from: k, reason: collision with root package name */
    private final m f11322k;

    /* renamed from: l, reason: collision with root package name */
    private final V2.a f11323l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f11324m;

    /* renamed from: n, reason: collision with root package name */
    private final b f11325n;

    /* renamed from: o, reason: collision with root package name */
    private final InterfaceC3316a f11326o;

    /* renamed from: p, reason: collision with root package name */
    private final Object f11327p = new Object();

    /* renamed from: q, reason: collision with root package name */
    private boolean f11328q;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (j.this.f11327p) {
                j.this.p();
            }
            j.this.f11328q = true;
            j.this.f11314c.countDown();
        }
    }

    static class b {

        /* renamed from: a, reason: collision with root package name */
        private boolean f11330a = false;

        /* renamed from: b, reason: collision with root package name */
        private long f11331b = -1;

        /* renamed from: c, reason: collision with root package name */
        private long f11332c = -1;

        b() {
        }

        public synchronized long a() {
            return this.f11332c;
        }

        public synchronized long b() {
            return this.f11331b;
        }

        public synchronized void c(long j10, long j11) {
            if (this.f11330a) {
                this.f11331b += j10;
                this.f11332c += j11;
            }
        }

        public synchronized boolean d() {
            return this.f11330a;
        }

        public synchronized void e() {
            this.f11330a = false;
            this.f11332c = -1L;
            this.f11331b = -1L;
        }

        public synchronized void f(long j10, long j11) {
            this.f11332c = j11;
            this.f11331b = j10;
            this.f11330a = true;
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final long f11333a;

        /* renamed from: b, reason: collision with root package name */
        public final long f11334b;

        /* renamed from: c, reason: collision with root package name */
        public final long f11335c;

        public c(long j10, long j11, long j12) {
            this.f11333a = j10;
            this.f11334b = j11;
            this.f11335c = j12;
        }
    }

    public j(i iVar, m mVar, c cVar, V2.c cVar2, V2.a aVar, Y2.b bVar, Executor executor, boolean z10) {
        this.f11312a = cVar.f11334b;
        long j10 = cVar.f11335c;
        this.f11313b = j10;
        this.f11315d = j10;
        this.f11320i = C3185a.d();
        this.f11321j = iVar;
        this.f11322k = mVar;
        this.f11318g = -1L;
        this.f11316e = cVar2;
        this.f11319h = cVar.f11333a;
        this.f11323l = aVar;
        this.f11325n = new b();
        this.f11326o = C3319d.a();
        this.f11324m = z10;
        this.f11317f = new HashSet();
        if (bVar != null) {
            bVar.a(this);
        }
        if (!z10) {
            this.f11314c = new CountDownLatch(0);
        } else {
            this.f11314c = new CountDownLatch(1);
            executor.execute(new a());
        }
    }

    private U2.a l(i.b bVar, V2.d dVar, String str) {
        U2.a b10;
        synchronized (this.f11327p) {
            b10 = bVar.b(dVar);
            this.f11317f.add(str);
            this.f11325n.c(b10.size(), 1L);
        }
        return b10;
    }

    private void m(long j10, c.a aVar) {
        try {
            Collection<i.a> n10 = n(this.f11321j.g());
            long b10 = this.f11325n.b();
            long j11 = b10 - j10;
            int i10 = 0;
            long j12 = 0;
            for (i.a aVar2 : n10) {
                if (j12 > j11) {
                    break;
                }
                long h10 = this.f11321j.h(aVar2);
                this.f11317f.remove(aVar2.getId());
                if (h10 > 0) {
                    i10++;
                    j12 += h10;
                    o e10 = o.a().j(aVar2.getId()).g(aVar).i(h10).f(b10 - j12).e(j10);
                    this.f11316e.g(e10);
                    e10.b();
                }
            }
            this.f11325n.c(-j12, -i10);
            this.f11321j.b();
        } catch (IOException e11) {
            this.f11323l.a(a.EnumC0200a.EVICTION, f11309r, "evictAboveSize: " + e11.getMessage(), e11);
            throw e11;
        }
    }

    private Collection n(Collection collection) {
        long now = this.f11326o.now() + f11310s;
        ArrayList arrayList = new ArrayList(collection.size());
        ArrayList arrayList2 = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            i.a aVar = (i.a) it.next();
            if (aVar.a() > now) {
                arrayList.add(aVar);
            } else {
                arrayList2.add(aVar);
            }
        }
        Collections.sort(arrayList2, this.f11322k.get());
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    private void o() {
        synchronized (this.f11327p) {
            try {
                boolean p10 = p();
                s();
                long b10 = this.f11325n.b();
                if (b10 > this.f11315d && !p10) {
                    this.f11325n.e();
                    p();
                }
                long j10 = this.f11315d;
                if (b10 > j10) {
                    m((j10 * 9) / 10, c.a.CACHE_FULL);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean p() {
        long now = this.f11326o.now();
        if (this.f11325n.d()) {
            long j10 = this.f11318g;
            if (j10 != -1 && now - j10 <= f11311t) {
                return false;
            }
        }
        return q();
    }

    private boolean q() {
        long j10;
        long now = this.f11326o.now();
        long j11 = f11310s + now;
        Set hashSet = (this.f11324m && this.f11317f.isEmpty()) ? this.f11317f : this.f11324m ? new HashSet() : null;
        try {
            long j12 = 0;
            long j13 = -1;
            int i10 = 0;
            boolean z10 = false;
            int i11 = 0;
            int i12 = 0;
            for (i.a aVar : this.f11321j.g()) {
                i11++;
                j12 += aVar.k();
                if (aVar.a() > j11) {
                    i12++;
                    i10 = (int) (i10 + aVar.k());
                    j10 = j11;
                    j13 = Math.max(aVar.a() - now, j13);
                    z10 = true;
                } else {
                    j10 = j11;
                    if (this.f11324m) {
                        b3.l.g(hashSet);
                        hashSet.add(aVar.getId());
                    }
                }
                j11 = j10;
            }
            if (z10) {
                this.f11323l.a(a.EnumC0200a.READ_INVALID_ENTRY, f11309r, "Future timestamp found in " + i12 + " files , with a total size of " + i10 + " bytes, and a maximum time delta of " + j13 + "ms", null);
            }
            long j14 = i11;
            if (this.f11325n.a() != j14 || this.f11325n.b() != j12) {
                if (this.f11324m && this.f11317f != hashSet) {
                    b3.l.g(hashSet);
                    this.f11317f.clear();
                    this.f11317f.addAll(hashSet);
                }
                this.f11325n.f(j12, j14);
            }
            this.f11318g = now;
            return true;
        } catch (IOException e10) {
            this.f11323l.a(a.EnumC0200a.GENERIC_IO, f11309r, "calcFileCacheSize: " + e10.getMessage(), e10);
            return false;
        }
    }

    private i.b r(String str, V2.d dVar) {
        o();
        return this.f11321j.c(str, dVar);
    }

    private void s() {
        if (this.f11320i.f(this.f11321j.q() ? C3185a.EnumC0486a.EXTERNAL : C3185a.EnumC0486a.INTERNAL, this.f11313b - this.f11325n.b())) {
            this.f11315d = this.f11312a;
        } else {
            this.f11315d = this.f11313b;
        }
    }

    @Override // W2.n
    public void a() {
        synchronized (this.f11327p) {
            try {
                this.f11321j.a();
                this.f11317f.clear();
                this.f11316e.c();
            } catch (IOException | NullPointerException e10) {
                this.f11323l.a(a.EnumC0200a.EVICTION, f11309r, "clearAll: " + e10.getMessage(), e10);
            }
            this.f11325n.e();
        }
    }

    @Override // W2.n
    public boolean b(V2.d dVar) {
        synchronized (this.f11327p) {
            try {
                List b10 = V2.e.b(dVar);
                for (int i10 = 0; i10 < b10.size(); i10++) {
                    if (this.f11317f.contains((String) b10.get(i10))) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // W2.n
    public U2.a c(V2.d dVar) {
        U2.a aVar;
        o d10 = o.a().d(dVar);
        try {
            synchronized (this.f11327p) {
                try {
                    List b10 = V2.e.b(dVar);
                    String str = null;
                    aVar = null;
                    for (int i10 = 0; i10 < b10.size(); i10++) {
                        str = (String) b10.get(i10);
                        d10.j(str);
                        aVar = this.f11321j.f(str, dVar);
                        if (aVar != null) {
                            break;
                        }
                    }
                    if (aVar == null) {
                        this.f11316e.f(d10);
                        this.f11317f.remove(str);
                    } else {
                        b3.l.g(str);
                        this.f11316e.b(d10);
                        this.f11317f.add(str);
                    }
                } finally {
                }
            }
            return aVar;
        } catch (IOException e10) {
            this.f11323l.a(a.EnumC0200a.GENERIC_IO, f11309r, "getResource", e10);
            d10.h(e10);
            this.f11316e.d(d10);
            return null;
        } finally {
            d10.b();
        }
    }

    @Override // W2.n
    public boolean d(V2.d dVar) {
        String str;
        IOException e10;
        String str2 = null;
        try {
            try {
                synchronized (this.f11327p) {
                    try {
                        List b10 = V2.e.b(dVar);
                        int i10 = 0;
                        while (i10 < b10.size()) {
                            String str3 = (String) b10.get(i10);
                            if (this.f11321j.d(str3, dVar)) {
                                this.f11317f.add(str3);
                                return true;
                            }
                            i10++;
                            str2 = str3;
                        }
                        return false;
                    } catch (Throwable th) {
                        str = str2;
                        th = th;
                        try {
                            throw th;
                        } catch (IOException e11) {
                            e10 = e11;
                            o h10 = o.a().d(dVar).j(str).h(e10);
                            this.f11316e.d(h10);
                            h10.b();
                            return false;
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e12) {
            str = null;
            e10 = e12;
        }
    }

    @Override // W2.n
    public boolean e(V2.d dVar) {
        synchronized (this.f11327p) {
            if (b(dVar)) {
                return true;
            }
            try {
                List b10 = V2.e.b(dVar);
                for (int i10 = 0; i10 < b10.size(); i10++) {
                    String str = (String) b10.get(i10);
                    if (this.f11321j.e(str, dVar)) {
                        this.f11317f.add(str);
                        return true;
                    }
                }
                return false;
            } catch (IOException unused) {
                return false;
            }
        }
    }

    @Override // W2.n
    public void f(V2.d dVar) {
        synchronized (this.f11327p) {
            try {
                List b10 = V2.e.b(dVar);
                for (int i10 = 0; i10 < b10.size(); i10++) {
                    String str = (String) b10.get(i10);
                    this.f11321j.remove(str);
                    this.f11317f.remove(str);
                }
            } catch (IOException e10) {
                this.f11323l.a(a.EnumC0200a.DELETE_FILE, f11309r, "delete: " + e10.getMessage(), e10);
            }
        }
    }

    @Override // W2.n
    public U2.a g(V2.d dVar, V2.j jVar) {
        String a10;
        o d10 = o.a().d(dVar);
        this.f11316e.h(d10);
        synchronized (this.f11327p) {
            a10 = V2.e.a(dVar);
        }
        d10.j(a10);
        try {
            try {
                i.b r10 = r(a10, dVar);
                try {
                    r10.a(jVar, dVar);
                    U2.a l10 = l(r10, dVar, a10);
                    d10.i(l10.size()).f(this.f11325n.b());
                    this.f11316e.a(d10);
                    return l10;
                } finally {
                    if (!r10.w()) {
                        AbstractC1721a.i(f11309r, "Failed to delete temp file");
                    }
                }
            } catch (IOException e10) {
                d10.h(e10);
                this.f11316e.e(d10);
                AbstractC1721a.j(f11309r, "Failed inserting a file into the cache", e10);
                throw e10;
            }
        } finally {
            d10.b();
        }
    }
}
