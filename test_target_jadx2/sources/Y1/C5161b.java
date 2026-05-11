package y1;

import C1.m;
import C1.u;
import C1.x;
import D1.r;
import Jd.InterfaceC0915w0;
import android.content.Context;
import android.text.TextUtils;
import androidx.work.impl.A;
import androidx.work.impl.B;
import androidx.work.impl.C1634u;
import androidx.work.impl.InterfaceC1620f;
import androidx.work.impl.InterfaceC1636w;
import androidx.work.impl.N;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import x1.n;
import x1.w;
import x1.z;
import z1.AbstractC5238b;
import z1.AbstractC5242f;
import z1.C5241e;
import z1.InterfaceC5240d;

/* renamed from: y1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5161b implements InterfaceC1636w, InterfaceC5240d, InterfaceC1620f {

    /* renamed from: o, reason: collision with root package name */
    private static final String f45140o = n.i("GreedyScheduler");

    /* renamed from: a, reason: collision with root package name */
    private final Context f45141a;

    /* renamed from: c, reason: collision with root package name */
    private C5160a f45143c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f45144d;

    /* renamed from: g, reason: collision with root package name */
    private final C1634u f45147g;

    /* renamed from: h, reason: collision with root package name */
    private final N f45148h;

    /* renamed from: i, reason: collision with root package name */
    private final androidx.work.a f45149i;

    /* renamed from: k, reason: collision with root package name */
    Boolean f45151k;

    /* renamed from: l, reason: collision with root package name */
    private final C5241e f45152l;

    /* renamed from: m, reason: collision with root package name */
    private final E1.b f45153m;

    /* renamed from: n, reason: collision with root package name */
    private final C5163d f45154n;

    /* renamed from: b, reason: collision with root package name */
    private final Map f45142b = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final Object f45145e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private final B f45146f = new B();

    /* renamed from: j, reason: collision with root package name */
    private final Map f45150j = new HashMap();

    /* renamed from: y1.b$b, reason: collision with other inner class name */
    private static class C0661b {

        /* renamed from: a, reason: collision with root package name */
        final int f45155a;

        /* renamed from: b, reason: collision with root package name */
        final long f45156b;

        private C0661b(int i10, long j10) {
            this.f45155a = i10;
            this.f45156b = j10;
        }
    }

    public C5161b(Context context, androidx.work.a aVar, B1.n nVar, C1634u c1634u, N n10, E1.b bVar) {
        this.f45141a = context;
        w k10 = aVar.k();
        this.f45143c = new C5160a(this, k10, aVar.a());
        this.f45154n = new C5163d(k10, n10);
        this.f45153m = bVar;
        this.f45152l = new C5241e(nVar);
        this.f45149i = aVar;
        this.f45147g = c1634u;
        this.f45148h = n10;
    }

    private void f() {
        this.f45151k = Boolean.valueOf(r.b(this.f45141a, this.f45149i));
    }

    private void g() {
        if (this.f45144d) {
            return;
        }
        this.f45147g.e(this);
        this.f45144d = true;
    }

    private void h(m mVar) {
        InterfaceC0915w0 interfaceC0915w0;
        synchronized (this.f45145e) {
            interfaceC0915w0 = (InterfaceC0915w0) this.f45142b.remove(mVar);
        }
        if (interfaceC0915w0 != null) {
            n.e().a(f45140o, "Stopping tracking for " + mVar);
            interfaceC0915w0.d(null);
        }
    }

    private long i(u uVar) {
        long max;
        synchronized (this.f45145e) {
            try {
                m a10 = x.a(uVar);
                C0661b c0661b = (C0661b) this.f45150j.get(a10);
                if (c0661b == null) {
                    c0661b = new C0661b(uVar.f800k, this.f45149i.a().a());
                    this.f45150j.put(a10, c0661b);
                }
                max = c0661b.f45156b + (Math.max((uVar.f800k - c0661b.f45155a) - 5, 0) * 30000);
            } catch (Throwable th) {
                throw th;
            }
        }
        return max;
    }

    @Override // androidx.work.impl.InterfaceC1636w
    public void a(u... uVarArr) {
        if (this.f45151k == null) {
            f();
        }
        if (!this.f45151k.booleanValue()) {
            n.e().f(f45140o, "Ignoring schedule request in a secondary process");
            return;
        }
        g();
        HashSet<u> hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (u uVar : uVarArr) {
            if (!this.f45146f.a(x.a(uVar))) {
                long max = Math.max(uVar.c(), i(uVar));
                long a10 = this.f45149i.a().a();
                if (uVar.f791b == z.c.ENQUEUED) {
                    if (a10 < max) {
                        C5160a c5160a = this.f45143c;
                        if (c5160a != null) {
                            c5160a.a(uVar, max);
                        }
                    } else if (uVar.k()) {
                        if (uVar.f799j.h()) {
                            n.e().a(f45140o, "Ignoring " + uVar + ". Requires device idle.");
                        } else if (uVar.f799j.e()) {
                            n.e().a(f45140o, "Ignoring " + uVar + ". Requires ContentUri triggers.");
                        } else {
                            hashSet.add(uVar);
                            hashSet2.add(uVar.f790a);
                        }
                    } else if (!this.f45146f.a(x.a(uVar))) {
                        n.e().a(f45140o, "Starting work for " + uVar.f790a);
                        A e10 = this.f45146f.e(uVar);
                        this.f45154n.c(e10);
                        this.f45148h.b(e10);
                    }
                }
            }
        }
        synchronized (this.f45145e) {
            try {
                if (!hashSet.isEmpty()) {
                    n.e().a(f45140o, "Starting tracking for " + TextUtils.join(",", hashSet2));
                    for (u uVar2 : hashSet) {
                        m a11 = x.a(uVar2);
                        if (!this.f45142b.containsKey(a11)) {
                            this.f45142b.put(a11, AbstractC5242f.b(this.f45152l, uVar2, this.f45153m.a(), this));
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.work.impl.InterfaceC1636w
    public boolean b() {
        return false;
    }

    @Override // androidx.work.impl.InterfaceC1636w
    public void c(String str) {
        if (this.f45151k == null) {
            f();
        }
        if (!this.f45151k.booleanValue()) {
            n.e().f(f45140o, "Ignoring schedule request in non-main process");
            return;
        }
        g();
        n.e().a(f45140o, "Cancelling work ID " + str);
        C5160a c5160a = this.f45143c;
        if (c5160a != null) {
            c5160a.b(str);
        }
        for (A a10 : this.f45146f.c(str)) {
            this.f45154n.b(a10);
            this.f45148h.e(a10);
        }
    }

    @Override // z1.InterfaceC5240d
    public void d(u uVar, AbstractC5238b abstractC5238b) {
        m a10 = x.a(uVar);
        if (abstractC5238b instanceof AbstractC5238b.a) {
            if (this.f45146f.a(a10)) {
                return;
            }
            n.e().a(f45140o, "Constraints met: Scheduling work ID " + a10);
            A d10 = this.f45146f.d(a10);
            this.f45154n.c(d10);
            this.f45148h.b(d10);
            return;
        }
        n.e().a(f45140o, "Constraints not met: Cancelling work ID " + a10);
        A b10 = this.f45146f.b(a10);
        if (b10 != null) {
            this.f45154n.b(b10);
            this.f45148h.d(b10, ((AbstractC5238b.C0670b) abstractC5238b).a());
        }
    }

    @Override // androidx.work.impl.InterfaceC1620f
    public void e(m mVar, boolean z10) {
        A b10 = this.f45146f.b(mVar);
        if (b10 != null) {
            this.f45154n.b(b10);
        }
        h(mVar);
        if (z10) {
            return;
        }
        synchronized (this.f45145e) {
            this.f45150j.remove(mVar);
        }
    }
}
