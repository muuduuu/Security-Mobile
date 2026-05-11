package F3;

import android.util.SparseArray;
import b3.l;
import c3.AbstractC1721a;
import f3.AbstractC3142a;
import g4.f;
import g4.m;

/* loaded from: classes.dex */
public class b implements E3.b {

    /* renamed from: e, reason: collision with root package name */
    private static final Class f2488e = b.class;

    /* renamed from: a, reason: collision with root package name */
    private final V3.c f2489a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f2490b;

    /* renamed from: c, reason: collision with root package name */
    private final SparseArray f2491c = new SparseArray();

    /* renamed from: d, reason: collision with root package name */
    private AbstractC3142a f2492d;

    public b(V3.c cVar, boolean z10) {
        this.f2489a = cVar;
        this.f2490b = z10;
    }

    static AbstractC3142a a(AbstractC3142a abstractC3142a) {
        f fVar;
        try {
            if (AbstractC3142a.x(abstractC3142a) && (abstractC3142a.p() instanceof f) && (fVar = (f) abstractC3142a.p()) != null) {
                return fVar.h0();
            }
            AbstractC3142a.n(abstractC3142a);
            return null;
        } finally {
            AbstractC3142a.n(abstractC3142a);
        }
    }

    private static AbstractC3142a b(AbstractC3142a abstractC3142a) {
        return AbstractC3142a.y(f.U(abstractC3142a, m.f33552d, 0));
    }

    private synchronized void c(int i10) {
        AbstractC3142a abstractC3142a = (AbstractC3142a) this.f2491c.get(i10);
        if (abstractC3142a != null) {
            this.f2491c.delete(i10);
            AbstractC3142a.n(abstractC3142a);
            AbstractC1721a.A(f2488e, "removePreparedReference(%d) removed. Pending frames: %s", Integer.valueOf(i10), this.f2491c);
        }
    }

    @Override // E3.b
    public synchronized boolean C(int i10) {
        return this.f2489a.b(i10);
    }

    @Override // E3.b
    public synchronized AbstractC3142a D(int i10, int i11, int i12) {
        if (!this.f2490b) {
            return null;
        }
        return a(this.f2489a.d());
    }

    @Override // E3.b
    public synchronized AbstractC3142a E(int i10) {
        return a(this.f2489a.c(i10));
    }

    @Override // E3.b
    public synchronized AbstractC3142a F(int i10) {
        return a(AbstractC3142a.i(this.f2492d));
    }

    @Override // E3.b
    public synchronized void G(int i10, AbstractC3142a abstractC3142a, int i11) {
        AbstractC3142a abstractC3142a2;
        l.g(abstractC3142a);
        c(i10);
        try {
            abstractC3142a2 = b(abstractC3142a);
            if (abstractC3142a2 != null) {
                try {
                    AbstractC3142a.n(this.f2492d);
                    this.f2492d = this.f2489a.a(i10, abstractC3142a2);
                } catch (Throwable th) {
                    th = th;
                    AbstractC3142a.n(abstractC3142a2);
                    throw th;
                }
            }
            AbstractC3142a.n(abstractC3142a2);
        } catch (Throwable th2) {
            th = th2;
            abstractC3142a2 = null;
        }
    }

    @Override // E3.b
    public synchronized void H(int i10, AbstractC3142a abstractC3142a, int i11) {
        AbstractC3142a abstractC3142a2;
        l.g(abstractC3142a);
        try {
            abstractC3142a2 = b(abstractC3142a);
            if (abstractC3142a2 == null) {
                AbstractC3142a.n(abstractC3142a2);
                return;
            }
            try {
                AbstractC3142a a10 = this.f2489a.a(i10, abstractC3142a2);
                if (AbstractC3142a.x(a10)) {
                    AbstractC3142a.n((AbstractC3142a) this.f2491c.get(i10));
                    this.f2491c.put(i10, a10);
                    AbstractC1721a.A(f2488e, "cachePreparedFrame(%d) cached. Pending frames: %s", Integer.valueOf(i10), this.f2491c);
                }
                AbstractC3142a.n(abstractC3142a2);
            } catch (Throwable th) {
                th = th;
                AbstractC3142a.n(abstractC3142a2);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            abstractC3142a2 = null;
        }
    }

    @Override // E3.b
    public synchronized void clear() {
        try {
            AbstractC3142a.n(this.f2492d);
            this.f2492d = null;
            for (int i10 = 0; i10 < this.f2491c.size(); i10++) {
                AbstractC3142a.n((AbstractC3142a) this.f2491c.valueAt(i10));
            }
            this.f2491c.clear();
        } catch (Throwable th) {
            throw th;
        }
    }
}
