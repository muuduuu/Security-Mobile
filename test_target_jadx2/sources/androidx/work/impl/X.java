package androidx.work.impl;

import C1.InterfaceC0749b;
import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.c;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import x1.InterfaceC5098b;
import x1.z;

/* loaded from: classes.dex */
public class X implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    static final String f18218s = x1.n.i("WorkerWrapper");

    /* renamed from: a, reason: collision with root package name */
    Context f18219a;

    /* renamed from: b, reason: collision with root package name */
    private final String f18220b;

    /* renamed from: c, reason: collision with root package name */
    private WorkerParameters.a f18221c;

    /* renamed from: d, reason: collision with root package name */
    C1.u f18222d;

    /* renamed from: e, reason: collision with root package name */
    androidx.work.c f18223e;

    /* renamed from: f, reason: collision with root package name */
    E1.b f18224f;

    /* renamed from: h, reason: collision with root package name */
    private androidx.work.a f18226h;

    /* renamed from: i, reason: collision with root package name */
    private InterfaceC5098b f18227i;

    /* renamed from: j, reason: collision with root package name */
    private androidx.work.impl.foreground.a f18228j;

    /* renamed from: k, reason: collision with root package name */
    private WorkDatabase f18229k;

    /* renamed from: l, reason: collision with root package name */
    private C1.v f18230l;

    /* renamed from: m, reason: collision with root package name */
    private InterfaceC0749b f18231m;

    /* renamed from: n, reason: collision with root package name */
    private List f18232n;

    /* renamed from: o, reason: collision with root package name */
    private String f18233o;

    /* renamed from: g, reason: collision with root package name */
    c.a f18225g = c.a.a();

    /* renamed from: p, reason: collision with root package name */
    androidx.work.impl.utils.futures.c f18234p = androidx.work.impl.utils.futures.c.t();

    /* renamed from: q, reason: collision with root package name */
    final androidx.work.impl.utils.futures.c f18235q = androidx.work.impl.utils.futures.c.t();

    /* renamed from: r, reason: collision with root package name */
    private volatile int f18236r = -256;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ h8.d f18237a;

        a(h8.d dVar) {
            this.f18237a = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (X.this.f18235q.isCancelled()) {
                return;
            }
            try {
                this.f18237a.get();
                x1.n.e().a(X.f18218s, "Starting work for " + X.this.f18222d.f792c);
                X x10 = X.this;
                x10.f18235q.r(x10.f18223e.o());
            } catch (Throwable th) {
                X.this.f18235q.q(th);
            }
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f18239a;

        b(String str) {
            this.f18239a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    c.a aVar = (c.a) X.this.f18235q.get();
                    if (aVar == null) {
                        x1.n.e().c(X.f18218s, X.this.f18222d.f792c + " returned a null result. Treating it as a failure.");
                    } else {
                        x1.n.e().a(X.f18218s, X.this.f18222d.f792c + " returned a " + aVar + ".");
                        X.this.f18225g = aVar;
                    }
                } catch (InterruptedException e10) {
                    e = e10;
                    x1.n.e().d(X.f18218s, this.f18239a + " failed because it threw an exception/error", e);
                } catch (CancellationException e11) {
                    x1.n.e().g(X.f18218s, this.f18239a + " was cancelled", e11);
                } catch (ExecutionException e12) {
                    e = e12;
                    x1.n.e().d(X.f18218s, this.f18239a + " failed because it threw an exception/error", e);
                }
                X.this.j();
            } catch (Throwable th) {
                X.this.j();
                throw th;
            }
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        Context f18241a;

        /* renamed from: b, reason: collision with root package name */
        androidx.work.c f18242b;

        /* renamed from: c, reason: collision with root package name */
        androidx.work.impl.foreground.a f18243c;

        /* renamed from: d, reason: collision with root package name */
        E1.b f18244d;

        /* renamed from: e, reason: collision with root package name */
        androidx.work.a f18245e;

        /* renamed from: f, reason: collision with root package name */
        WorkDatabase f18246f;

        /* renamed from: g, reason: collision with root package name */
        C1.u f18247g;

        /* renamed from: h, reason: collision with root package name */
        private final List f18248h;

        /* renamed from: i, reason: collision with root package name */
        WorkerParameters.a f18249i = new WorkerParameters.a();

        public c(Context context, androidx.work.a aVar, E1.b bVar, androidx.work.impl.foreground.a aVar2, WorkDatabase workDatabase, C1.u uVar, List list) {
            this.f18241a = context.getApplicationContext();
            this.f18244d = bVar;
            this.f18243c = aVar2;
            this.f18245e = aVar;
            this.f18246f = workDatabase;
            this.f18247g = uVar;
            this.f18248h = list;
        }

        public X b() {
            return new X(this);
        }

        public c c(WorkerParameters.a aVar) {
            if (aVar != null) {
                this.f18249i = aVar;
            }
            return this;
        }
    }

    X(c cVar) {
        this.f18219a = cVar.f18241a;
        this.f18224f = cVar.f18244d;
        this.f18228j = cVar.f18243c;
        C1.u uVar = cVar.f18247g;
        this.f18222d = uVar;
        this.f18220b = uVar.f790a;
        this.f18221c = cVar.f18249i;
        this.f18223e = cVar.f18242b;
        androidx.work.a aVar = cVar.f18245e;
        this.f18226h = aVar;
        this.f18227i = aVar.a();
        WorkDatabase workDatabase = cVar.f18246f;
        this.f18229k = workDatabase;
        this.f18230l = workDatabase.K();
        this.f18231m = this.f18229k.F();
        this.f18232n = cVar.f18248h;
    }

    private String b(List list) {
        StringBuilder sb2 = new StringBuilder("Work [ id=");
        sb2.append(this.f18220b);
        sb2.append(", tags={ ");
        Iterator it = list.iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (z10) {
                z10 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(str);
        }
        sb2.append(" } ]");
        return sb2.toString();
    }

    private void f(c.a aVar) {
        if (aVar instanceof c.a.C0313c) {
            x1.n.e().f(f18218s, "Worker result SUCCESS for " + this.f18233o);
            if (this.f18222d.m()) {
                l();
                return;
            } else {
                q();
                return;
            }
        }
        if (aVar instanceof c.a.b) {
            x1.n.e().f(f18218s, "Worker result RETRY for " + this.f18233o);
            k();
            return;
        }
        x1.n.e().f(f18218s, "Worker result FAILURE for " + this.f18233o);
        if (this.f18222d.m()) {
            l();
        } else {
            p();
        }
    }

    private void h(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (this.f18230l.r(str2) != z.c.CANCELLED) {
                this.f18230l.m(z.c.FAILED, str2);
            }
            linkedList.addAll(this.f18231m.b(str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(h8.d dVar) {
        if (this.f18235q.isCancelled()) {
            dVar.cancel(true);
        }
    }

    private void k() {
        this.f18229k.e();
        try {
            this.f18230l.m(z.c.ENQUEUED, this.f18220b);
            this.f18230l.k(this.f18220b, this.f18227i.a());
            this.f18230l.y(this.f18220b, this.f18222d.h());
            this.f18230l.c(this.f18220b, -1L);
            this.f18229k.D();
        } finally {
            this.f18229k.i();
            m(true);
        }
    }

    private void l() {
        this.f18229k.e();
        try {
            this.f18230l.k(this.f18220b, this.f18227i.a());
            this.f18230l.m(z.c.ENQUEUED, this.f18220b);
            this.f18230l.t(this.f18220b);
            this.f18230l.y(this.f18220b, this.f18222d.h());
            this.f18230l.b(this.f18220b);
            this.f18230l.c(this.f18220b, -1L);
            this.f18229k.D();
        } finally {
            this.f18229k.i();
            m(false);
        }
    }

    private void m(boolean z10) {
        this.f18229k.e();
        try {
            if (!this.f18229k.K().n()) {
                D1.p.c(this.f18219a, RescheduleReceiver.class, false);
            }
            if (z10) {
                this.f18230l.m(z.c.ENQUEUED, this.f18220b);
                this.f18230l.g(this.f18220b, this.f18236r);
                this.f18230l.c(this.f18220b, -1L);
            }
            this.f18229k.D();
            this.f18229k.i();
            this.f18234p.p(Boolean.valueOf(z10));
        } catch (Throwable th) {
            this.f18229k.i();
            throw th;
        }
    }

    private void n() {
        z.c r10 = this.f18230l.r(this.f18220b);
        if (r10 == z.c.RUNNING) {
            x1.n.e().a(f18218s, "Status for " + this.f18220b + " is RUNNING; not doing any work and rescheduling for later execution");
            m(true);
            return;
        }
        x1.n.e().a(f18218s, "Status for " + this.f18220b + " is " + r10 + " ; not doing any work");
        m(false);
    }

    private void o() {
        androidx.work.b a10;
        if (r()) {
            return;
        }
        this.f18229k.e();
        try {
            C1.u uVar = this.f18222d;
            if (uVar.f791b != z.c.ENQUEUED) {
                n();
                this.f18229k.D();
                x1.n.e().a(f18218s, this.f18222d.f792c + " is not in ENQUEUED state. Nothing more to do");
                return;
            }
            if ((uVar.m() || this.f18222d.l()) && this.f18227i.a() < this.f18222d.c()) {
                x1.n.e().a(f18218s, String.format("Delaying execution for %s because it is being executed before schedule.", this.f18222d.f792c));
                m(true);
                this.f18229k.D();
                return;
            }
            this.f18229k.D();
            this.f18229k.i();
            if (this.f18222d.m()) {
                a10 = this.f18222d.f794e;
            } else {
                x1.j b10 = this.f18226h.f().b(this.f18222d.f793d);
                if (b10 == null) {
                    x1.n.e().c(f18218s, "Could not create Input Merger " + this.f18222d.f793d);
                    p();
                    return;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.f18222d.f794e);
                arrayList.addAll(this.f18230l.v(this.f18220b));
                a10 = b10.a(arrayList);
            }
            androidx.work.b bVar = a10;
            UUID fromString = UUID.fromString(this.f18220b);
            List list = this.f18232n;
            WorkerParameters.a aVar = this.f18221c;
            C1.u uVar2 = this.f18222d;
            WorkerParameters workerParameters = new WorkerParameters(fromString, bVar, list, aVar, uVar2.f800k, uVar2.f(), this.f18226h.d(), this.f18224f, this.f18226h.n(), new D1.C(this.f18229k, this.f18224f), new D1.B(this.f18229k, this.f18228j, this.f18224f));
            if (this.f18223e == null) {
                this.f18223e = this.f18226h.n().b(this.f18219a, this.f18222d.f792c, workerParameters);
            }
            androidx.work.c cVar = this.f18223e;
            if (cVar == null) {
                x1.n.e().c(f18218s, "Could not create Worker " + this.f18222d.f792c);
                p();
                return;
            }
            if (cVar.l()) {
                x1.n.e().c(f18218s, "Received an already-used Worker " + this.f18222d.f792c + "; Worker Factory should return new instances");
                p();
                return;
            }
            this.f18223e.n();
            if (!s()) {
                n();
                return;
            }
            if (r()) {
                return;
            }
            D1.A a11 = new D1.A(this.f18219a, this.f18222d, this.f18223e, workerParameters.b(), this.f18224f);
            this.f18224f.b().execute(a11);
            final h8.d b11 = a11.b();
            this.f18235q.e(new Runnable() { // from class: androidx.work.impl.W
                @Override // java.lang.Runnable
                public final void run() {
                    X.this.i(b11);
                }
            }, new D1.w());
            b11.e(new a(b11), this.f18224f.b());
            this.f18235q.e(new b(this.f18233o), this.f18224f.c());
        } finally {
            this.f18229k.i();
        }
    }

    private void q() {
        this.f18229k.e();
        try {
            this.f18230l.m(z.c.SUCCEEDED, this.f18220b);
            this.f18230l.j(this.f18220b, ((c.a.C0313c) this.f18225g).e());
            long a10 = this.f18227i.a();
            for (String str : this.f18231m.b(this.f18220b)) {
                if (this.f18230l.r(str) == z.c.BLOCKED && this.f18231m.c(str)) {
                    x1.n.e().f(f18218s, "Setting status to enqueued for " + str);
                    this.f18230l.m(z.c.ENQUEUED, str);
                    this.f18230l.k(str, a10);
                }
            }
            this.f18229k.D();
            this.f18229k.i();
            m(false);
        } catch (Throwable th) {
            this.f18229k.i();
            m(false);
            throw th;
        }
    }

    private boolean r() {
        if (this.f18236r == -256) {
            return false;
        }
        x1.n.e().a(f18218s, "Work interrupted for " + this.f18233o);
        if (this.f18230l.r(this.f18220b) == null) {
            m(false);
        } else {
            m(!r0.isFinished());
        }
        return true;
    }

    private boolean s() {
        boolean z10;
        this.f18229k.e();
        try {
            if (this.f18230l.r(this.f18220b) == z.c.ENQUEUED) {
                this.f18230l.m(z.c.RUNNING, this.f18220b);
                this.f18230l.w(this.f18220b);
                this.f18230l.g(this.f18220b, -256);
                z10 = true;
            } else {
                z10 = false;
            }
            this.f18229k.D();
            this.f18229k.i();
            return z10;
        } catch (Throwable th) {
            this.f18229k.i();
            throw th;
        }
    }

    public h8.d c() {
        return this.f18234p;
    }

    public C1.m d() {
        return C1.x.a(this.f18222d);
    }

    public C1.u e() {
        return this.f18222d;
    }

    public void g(int i10) {
        this.f18236r = i10;
        r();
        this.f18235q.cancel(true);
        if (this.f18223e != null && this.f18235q.isCancelled()) {
            this.f18223e.p(i10);
            return;
        }
        x1.n.e().a(f18218s, "WorkSpec " + this.f18222d + " is already done. Not interrupting.");
    }

    void j() {
        if (r()) {
            return;
        }
        this.f18229k.e();
        try {
            z.c r10 = this.f18230l.r(this.f18220b);
            this.f18229k.J().a(this.f18220b);
            if (r10 == null) {
                m(false);
            } else if (r10 == z.c.RUNNING) {
                f(this.f18225g);
            } else if (!r10.isFinished()) {
                this.f18236r = -512;
                k();
            }
            this.f18229k.D();
            this.f18229k.i();
        } catch (Throwable th) {
            this.f18229k.i();
            throw th;
        }
    }

    void p() {
        this.f18229k.e();
        try {
            h(this.f18220b);
            androidx.work.b e10 = ((c.a.C0312a) this.f18225g).e();
            this.f18230l.y(this.f18220b, this.f18222d.h());
            this.f18230l.j(this.f18220b, e10);
            this.f18229k.D();
        } finally {
            this.f18229k.i();
            m(false);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f18233o = b(this.f18232n);
        o();
    }
}
