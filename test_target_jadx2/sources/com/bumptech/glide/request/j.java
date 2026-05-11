package com.bumptech.glide.request;

import D2.l;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.d;
import i2.EnumC3313a;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import k2.k;
import k2.q;
import k2.v;
import org.conscrypt.BuildConfig;
import t2.AbstractC4613i;

/* loaded from: classes.dex */
public final class j implements d, A2.c, i {

    /* renamed from: E, reason: collision with root package name */
    private static final boolean f20385E = Log.isLoggable("GlideRequest", 2);

    /* renamed from: A, reason: collision with root package name */
    private int f20386A;

    /* renamed from: B, reason: collision with root package name */
    private int f20387B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f20388C;

    /* renamed from: D, reason: collision with root package name */
    private RuntimeException f20389D;

    /* renamed from: a, reason: collision with root package name */
    private int f20390a;

    /* renamed from: b, reason: collision with root package name */
    private final String f20391b;

    /* renamed from: c, reason: collision with root package name */
    private final E2.c f20392c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f20393d;

    /* renamed from: e, reason: collision with root package name */
    private final g f20394e;

    /* renamed from: f, reason: collision with root package name */
    private final e f20395f;

    /* renamed from: g, reason: collision with root package name */
    private final Context f20396g;

    /* renamed from: h, reason: collision with root package name */
    private final com.bumptech.glide.e f20397h;

    /* renamed from: i, reason: collision with root package name */
    private final Object f20398i;

    /* renamed from: j, reason: collision with root package name */
    private final Class f20399j;

    /* renamed from: k, reason: collision with root package name */
    private final com.bumptech.glide.request.a f20400k;

    /* renamed from: l, reason: collision with root package name */
    private final int f20401l;

    /* renamed from: m, reason: collision with root package name */
    private final int f20402m;

    /* renamed from: n, reason: collision with root package name */
    private final com.bumptech.glide.h f20403n;

    /* renamed from: o, reason: collision with root package name */
    private final A2.d f20404o;

    /* renamed from: p, reason: collision with root package name */
    private final List f20405p;

    /* renamed from: q, reason: collision with root package name */
    private final B2.c f20406q;

    /* renamed from: r, reason: collision with root package name */
    private final Executor f20407r;

    /* renamed from: s, reason: collision with root package name */
    private v f20408s;

    /* renamed from: t, reason: collision with root package name */
    private k.d f20409t;

    /* renamed from: u, reason: collision with root package name */
    private long f20410u;

    /* renamed from: v, reason: collision with root package name */
    private volatile k f20411v;

    /* renamed from: w, reason: collision with root package name */
    private a f20412w;

    /* renamed from: x, reason: collision with root package name */
    private Drawable f20413x;

    /* renamed from: y, reason: collision with root package name */
    private Drawable f20414y;

    /* renamed from: z, reason: collision with root package name */
    private Drawable f20415z;

    private enum a {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    private j(Context context, com.bumptech.glide.e eVar, Object obj, Object obj2, Class cls, com.bumptech.glide.request.a aVar, int i10, int i11, com.bumptech.glide.h hVar, A2.d dVar, g gVar, List list, e eVar2, k kVar, B2.c cVar, Executor executor) {
        this.f20391b = f20385E ? String.valueOf(super.hashCode()) : null;
        this.f20392c = E2.c.a();
        this.f20393d = obj;
        this.f20396g = context;
        this.f20397h = eVar;
        this.f20398i = obj2;
        this.f20399j = cls;
        this.f20400k = aVar;
        this.f20401l = i10;
        this.f20402m = i11;
        this.f20403n = hVar;
        this.f20404o = dVar;
        this.f20394e = gVar;
        this.f20405p = list;
        this.f20395f = eVar2;
        this.f20411v = kVar;
        this.f20406q = cVar;
        this.f20407r = executor;
        this.f20412w = a.PENDING;
        if (this.f20389D == null && eVar.f().a(d.c.class)) {
            this.f20389D = new RuntimeException("Glide request origin trace");
        }
    }

    private void e() {
        if (this.f20388C) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    private boolean f() {
        e eVar = this.f20395f;
        return eVar == null || eVar.canNotifyCleared(this);
    }

    private boolean g() {
        e eVar = this.f20395f;
        return eVar == null || eVar.canNotifyStatusChanged(this);
    }

    private boolean h() {
        e eVar = this.f20395f;
        return eVar == null || eVar.canSetImage(this);
    }

    private void i() {
        e();
        this.f20392c.c();
        this.f20404o.d(this);
        k.d dVar = this.f20409t;
        if (dVar != null) {
            dVar.a();
            this.f20409t = null;
        }
    }

    private void j(Object obj) {
        List<g> list = this.f20405p;
        if (list == null) {
            return;
        }
        for (g gVar : list) {
        }
    }

    private Drawable k() {
        if (this.f20413x == null) {
            Drawable q10 = this.f20400k.q();
            this.f20413x = q10;
            if (q10 == null && this.f20400k.p() > 0) {
                this.f20413x = o(this.f20400k.p());
            }
        }
        return this.f20413x;
    }

    private Drawable l() {
        if (this.f20415z == null) {
            Drawable s10 = this.f20400k.s();
            this.f20415z = s10;
            if (s10 == null && this.f20400k.v() > 0) {
                this.f20415z = o(this.f20400k.v());
            }
        }
        return this.f20415z;
    }

    private Drawable m() {
        if (this.f20414y == null) {
            Drawable A10 = this.f20400k.A();
            this.f20414y = A10;
            if (A10 == null && this.f20400k.B() > 0) {
                this.f20414y = o(this.f20400k.B());
            }
        }
        return this.f20414y;
    }

    private boolean n() {
        e eVar = this.f20395f;
        return eVar == null || !eVar.getRoot().isAnyResourceSet();
    }

    private Drawable o(int i10) {
        return AbstractC4613i.a(this.f20396g, i10, this.f20400k.H() != null ? this.f20400k.H() : this.f20396g.getTheme());
    }

    private void p(String str) {
        Log.v("GlideRequest", str + " this: " + this.f20391b);
    }

    private static int q(int i10, float f10) {
        return i10 == Integer.MIN_VALUE ? i10 : Math.round(f10 * i10);
    }

    private void r() {
        e eVar = this.f20395f;
        if (eVar != null) {
            eVar.onRequestFailed(this);
        }
    }

    private void s() {
        e eVar = this.f20395f;
        if (eVar != null) {
            eVar.onRequestSuccess(this);
        }
    }

    public static j t(Context context, com.bumptech.glide.e eVar, Object obj, Object obj2, Class cls, com.bumptech.glide.request.a aVar, int i10, int i11, com.bumptech.glide.h hVar, A2.d dVar, g gVar, List list, e eVar2, k kVar, B2.c cVar, Executor executor) {
        return new j(context, eVar, obj, obj2, cls, aVar, i10, i11, hVar, dVar, gVar, list, eVar2, kVar, cVar, executor);
    }

    private void u(q qVar, int i10) {
        boolean z10;
        this.f20392c.c();
        synchronized (this.f20393d) {
            try {
                qVar.k(this.f20389D);
                int g10 = this.f20397h.g();
                if (g10 <= i10) {
                    Log.w("Glide", "Load failed for [" + this.f20398i + "] with dimensions [" + this.f20386A + "x" + this.f20387B + "]", qVar);
                    if (g10 <= 4) {
                        qVar.g("Glide");
                    }
                }
                this.f20409t = null;
                this.f20412w = a.FAILED;
                r();
                boolean z11 = true;
                this.f20388C = true;
                try {
                    List list = this.f20405p;
                    if (list != null) {
                        Iterator it = list.iterator();
                        z10 = false;
                        while (it.hasNext()) {
                            z10 |= ((g) it.next()).g(qVar, this.f20398i, this.f20404o, n());
                        }
                    } else {
                        z10 = false;
                    }
                    g gVar = this.f20394e;
                    if (gVar == null || !gVar.g(qVar, this.f20398i, this.f20404o, n())) {
                        z11 = false;
                    }
                    if (!(z10 | z11)) {
                        w();
                    }
                    this.f20388C = false;
                    E2.b.f("GlideRequest", this.f20390a);
                } catch (Throwable th) {
                    this.f20388C = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void v(v vVar, Object obj, EnumC3313a enumC3313a, boolean z10) {
        boolean z11;
        boolean n10 = n();
        this.f20412w = a.COMPLETE;
        this.f20408s = vVar;
        if (this.f20397h.g() <= 3) {
            Log.d("Glide", "Finished loading " + obj.getClass().getSimpleName() + " from " + enumC3313a + " for " + this.f20398i + " with size [" + this.f20386A + "x" + this.f20387B + "] in " + D2.g.a(this.f20410u) + " ms");
        }
        s();
        boolean z12 = true;
        this.f20388C = true;
        try {
            List list = this.f20405p;
            if (list != null) {
                Iterator it = list.iterator();
                z11 = false;
                while (it.hasNext()) {
                    z11 |= ((g) it.next()).f(obj, this.f20398i, this.f20404o, enumC3313a, n10);
                }
            } else {
                z11 = false;
            }
            g gVar = this.f20394e;
            if (gVar == null || !gVar.f(obj, this.f20398i, this.f20404o, enumC3313a, n10)) {
                z12 = false;
            }
            if (!(z12 | z11)) {
                this.f20404o.n(obj, this.f20406q.a(enumC3313a, n10));
            }
            this.f20388C = false;
            E2.b.f("GlideRequest", this.f20390a);
        } catch (Throwable th) {
            this.f20388C = false;
            throw th;
        }
    }

    private void w() {
        if (g()) {
            Drawable l10 = this.f20398i == null ? l() : null;
            if (l10 == null) {
                l10 = k();
            }
            if (l10 == null) {
                l10 = m();
            }
            this.f20404o.i(l10);
        }
    }

    @Override // com.bumptech.glide.request.i
    public void a(q qVar) {
        u(qVar, 5);
    }

    @Override // com.bumptech.glide.request.i
    public void b(v vVar, EnumC3313a enumC3313a, boolean z10) {
        this.f20392c.c();
        v vVar2 = null;
        try {
            synchronized (this.f20393d) {
                try {
                    this.f20409t = null;
                    if (vVar == null) {
                        a(new q("Expected to receive a Resource<R> with an object of " + this.f20399j + " inside, but instead got null."));
                        return;
                    }
                    Object obj = vVar.get();
                    try {
                        if (obj != null && this.f20399j.isAssignableFrom(obj.getClass())) {
                            if (h()) {
                                v(vVar, obj, enumC3313a, z10);
                                return;
                            }
                            this.f20408s = null;
                            this.f20412w = a.COMPLETE;
                            E2.b.f("GlideRequest", this.f20390a);
                            this.f20411v.l(vVar);
                            return;
                        }
                        this.f20408s = null;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Expected to receive an object of ");
                        sb2.append(this.f20399j);
                        sb2.append(" but instead got ");
                        sb2.append(obj != null ? obj.getClass() : BuildConfig.FLAVOR);
                        sb2.append("{");
                        sb2.append(obj);
                        sb2.append("} inside Resource{");
                        sb2.append(vVar);
                        sb2.append("}.");
                        sb2.append(obj != null ? BuildConfig.FLAVOR : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                        a(new q(sb2.toString()));
                        this.f20411v.l(vVar);
                    } catch (Throwable th) {
                        vVar2 = vVar;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (vVar2 != null) {
                this.f20411v.l(vVar2);
            }
            throw th3;
        }
    }

    @Override // com.bumptech.glide.request.d
    public void begin() {
        synchronized (this.f20393d) {
            try {
                e();
                this.f20392c.c();
                this.f20410u = D2.g.b();
                Object obj = this.f20398i;
                if (obj == null) {
                    if (l.u(this.f20401l, this.f20402m)) {
                        this.f20386A = this.f20401l;
                        this.f20387B = this.f20402m;
                    }
                    u(new q("Received null model"), l() == null ? 5 : 3);
                    return;
                }
                a aVar = this.f20412w;
                a aVar2 = a.RUNNING;
                if (aVar == aVar2) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (aVar == a.COMPLETE) {
                    b(this.f20408s, EnumC3313a.MEMORY_CACHE, false);
                    return;
                }
                j(obj);
                this.f20390a = E2.b.b("GlideRequest");
                a aVar3 = a.WAITING_FOR_SIZE;
                this.f20412w = aVar3;
                if (l.u(this.f20401l, this.f20402m)) {
                    c(this.f20401l, this.f20402m);
                } else {
                    this.f20404o.j(this);
                }
                a aVar4 = this.f20412w;
                if ((aVar4 == aVar2 || aVar4 == aVar3) && g()) {
                    this.f20404o.k(m());
                }
                if (f20385E) {
                    p("finished run method in " + D2.g.a(this.f20410u));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // A2.c
    public void c(int i10, int i11) {
        Object obj;
        this.f20392c.c();
        Object obj2 = this.f20393d;
        synchronized (obj2) {
            try {
                try {
                    boolean z10 = f20385E;
                    if (z10) {
                        p("Got onSizeReady in " + D2.g.a(this.f20410u));
                    }
                    if (this.f20412w == a.WAITING_FOR_SIZE) {
                        a aVar = a.RUNNING;
                        this.f20412w = aVar;
                        float G10 = this.f20400k.G();
                        this.f20386A = q(i10, G10);
                        this.f20387B = q(i11, G10);
                        if (z10) {
                            p("finished setup for calling load in " + D2.g.a(this.f20410u));
                        }
                        obj = obj2;
                        try {
                            this.f20409t = this.f20411v.g(this.f20397h, this.f20398i, this.f20400k.E(), this.f20386A, this.f20387B, this.f20400k.D(), this.f20399j, this.f20403n, this.f20400k.o(), this.f20400k.J(), this.f20400k.T(), this.f20400k.Q(), this.f20400k.x(), this.f20400k.O(), this.f20400k.L(), this.f20400k.K(), this.f20400k.w(), this, this.f20407r);
                            if (this.f20412w != aVar) {
                                this.f20409t = null;
                            }
                            if (z10) {
                                p("finished onSizeReady in " + D2.g.a(this.f20410u));
                            }
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                obj = obj2;
            }
        }
    }

    @Override // com.bumptech.glide.request.d
    public void clear() {
        synchronized (this.f20393d) {
            try {
                e();
                this.f20392c.c();
                a aVar = this.f20412w;
                a aVar2 = a.CLEARED;
                if (aVar == aVar2) {
                    return;
                }
                i();
                v vVar = this.f20408s;
                if (vVar != null) {
                    this.f20408s = null;
                } else {
                    vVar = null;
                }
                if (f()) {
                    this.f20404o.m(m());
                }
                E2.b.f("GlideRequest", this.f20390a);
                this.f20412w = aVar2;
                if (vVar != null) {
                    this.f20411v.l(vVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.i
    public Object d() {
        this.f20392c.c();
        return this.f20393d;
    }

    @Override // com.bumptech.glide.request.d
    public boolean isAnyResourceSet() {
        boolean z10;
        synchronized (this.f20393d) {
            z10 = this.f20412w == a.COMPLETE;
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.d
    public boolean isCleared() {
        boolean z10;
        synchronized (this.f20393d) {
            z10 = this.f20412w == a.CLEARED;
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.d
    public boolean isComplete() {
        boolean z10;
        synchronized (this.f20393d) {
            z10 = this.f20412w == a.COMPLETE;
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.d
    public boolean isEquivalentTo(d dVar) {
        int i10;
        int i11;
        Object obj;
        Class cls;
        com.bumptech.glide.request.a aVar;
        com.bumptech.glide.h hVar;
        int size;
        int i12;
        int i13;
        Object obj2;
        Class cls2;
        com.bumptech.glide.request.a aVar2;
        com.bumptech.glide.h hVar2;
        int size2;
        if (!(dVar instanceof j)) {
            return false;
        }
        synchronized (this.f20393d) {
            try {
                i10 = this.f20401l;
                i11 = this.f20402m;
                obj = this.f20398i;
                cls = this.f20399j;
                aVar = this.f20400k;
                hVar = this.f20403n;
                List list = this.f20405p;
                size = list != null ? list.size() : 0;
            } finally {
            }
        }
        j jVar = (j) dVar;
        synchronized (jVar.f20393d) {
            try {
                i12 = jVar.f20401l;
                i13 = jVar.f20402m;
                obj2 = jVar.f20398i;
                cls2 = jVar.f20399j;
                aVar2 = jVar.f20400k;
                hVar2 = jVar.f20403n;
                List list2 = jVar.f20405p;
                size2 = list2 != null ? list2.size() : 0;
            } finally {
            }
        }
        return i10 == i12 && i11 == i13 && l.d(obj, obj2) && cls.equals(cls2) && l.c(aVar, aVar2) && hVar == hVar2 && size == size2;
    }

    @Override // com.bumptech.glide.request.d
    public boolean isRunning() {
        boolean z10;
        synchronized (this.f20393d) {
            try {
                a aVar = this.f20412w;
                z10 = aVar == a.RUNNING || aVar == a.WAITING_FOR_SIZE;
            } finally {
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.d
    public void pause() {
        synchronized (this.f20393d) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        Object obj;
        Class cls;
        synchronized (this.f20393d) {
            obj = this.f20398i;
            cls = this.f20399j;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }
}
