package F5;

import D5.AbstractC0776b;
import D5.q;
import D5.w;
import K5.C0922c;
import K5.F;
import K5.I;
import java.io.Serializable;
import v5.InterfaceC4938e;
import v5.InterfaceC4942i;
import v5.InterfaceC4947n;
import v5.p;
import v5.q;
import v5.z;

/* loaded from: classes2.dex */
public abstract class m extends l implements Serializable {

    /* renamed from: l, reason: collision with root package name */
    protected static final g f2549l = g.a();

    /* renamed from: m, reason: collision with root package name */
    private static final long f2550m = q.collectLongDefaults();

    /* renamed from: n, reason: collision with root package name */
    private static final long f2551n = (((q.AUTO_DETECT_FIELDS.getLongMask() | q.AUTO_DETECT_GETTERS.getLongMask()) | q.AUTO_DETECT_IS_GETTERS.getLongMask()) | q.AUTO_DETECT_SETTERS.getLongMask()) | q.AUTO_DETECT_CREATORS.getLongMask();

    /* renamed from: e, reason: collision with root package name */
    protected final F f2552e;

    /* renamed from: f, reason: collision with root package name */
    protected final M5.d f2553f;

    /* renamed from: g, reason: collision with root package name */
    protected final w f2554g;

    /* renamed from: h, reason: collision with root package name */
    protected final Class f2555h;

    /* renamed from: i, reason: collision with root package name */
    protected final i f2556i;

    /* renamed from: j, reason: collision with root package name */
    protected final T5.n f2557j;

    /* renamed from: k, reason: collision with root package name */
    protected final h f2558k;

    protected m(a aVar, M5.d dVar, F f10, T5.n nVar, h hVar) {
        super(aVar, f2550m);
        this.f2552e = f10;
        this.f2553f = dVar;
        this.f2557j = nVar;
        this.f2554g = null;
        this.f2555h = null;
        this.f2556i = i.b();
        this.f2558k = hVar;
    }

    protected abstract m H(long j10);

    public w I(Class cls) {
        w wVar = this.f2554g;
        return wVar != null ? wVar : this.f2557j.a(cls, this);
    }

    public final Class J() {
        return this.f2555h;
    }

    public final i K() {
        return this.f2556i;
    }

    public final InterfaceC4947n.a L(Class cls) {
        InterfaceC4947n.a c10;
        g b10 = this.f2558k.b(cls);
        if (b10 == null || (c10 = b10.c()) == null) {
            return null;
        }
        return c10;
    }

    public final InterfaceC4947n.a M(Class cls, C0922c c0922c) {
        AbstractC0776b g10 = g();
        return InterfaceC4947n.a.i(g10 == null ? null : g10.A(this, c0922c), L(cls));
    }

    public final p.b N() {
        return this.f2558k.c();
    }

    public final q.a O(Class cls, C0922c c0922c) {
        AbstractC0776b g10 = g();
        if (g10 == null) {
            return null;
        }
        return g10.D(this, c0922c);
    }

    public final I P() {
        I f10 = this.f2558k.f();
        long j10 = this.f2547a;
        long j11 = f2551n;
        if ((j10 & j11) == j11) {
            return f10;
        }
        if (!D(D5.q.AUTO_DETECT_FIELDS)) {
            f10 = f10.g(InterfaceC4938e.c.NONE);
        }
        if (!D(D5.q.AUTO_DETECT_GETTERS)) {
            f10 = f10.e(InterfaceC4938e.c.NONE);
        }
        if (!D(D5.q.AUTO_DETECT_IS_GETTERS)) {
            f10 = f10.c(InterfaceC4938e.c.NONE);
        }
        if (!D(D5.q.AUTO_DETECT_SETTERS)) {
            f10 = f10.j(InterfaceC4938e.c.NONE);
        }
        return !D(D5.q.AUTO_DETECT_CREATORS) ? f10.d(InterfaceC4938e.c.NONE) : f10;
    }

    public final w Q() {
        return this.f2554g;
    }

    public final M5.d R() {
        return this.f2553f;
    }

    public final m S(D5.q... qVarArr) {
        long j10 = this.f2547a;
        for (D5.q qVar : qVarArr) {
            j10 |= qVar.getLongMask();
        }
        return j10 == this.f2547a ? this : H(j10);
    }

    public final m T(D5.q... qVarArr) {
        long j10 = this.f2547a;
        for (D5.q qVar : qVarArr) {
            j10 &= ~qVar.getLongMask();
        }
        return j10 == this.f2547a ? this : H(j10);
    }

    @Override // K5.t.a
    public final Class a(Class cls) {
        return this.f2552e.a(cls);
    }

    @Override // F5.l
    public final g j(Class cls) {
        g b10 = this.f2558k.b(cls);
        return b10 == null ? f2549l : b10;
    }

    @Override // F5.l
    public final p.b l(Class cls, Class cls2) {
        p.b e10 = j(cls2).e();
        p.b p10 = p(cls);
        return p10 == null ? e10 : p10.m(e10);
    }

    @Override // F5.l
    public Boolean n() {
        return this.f2558k.d();
    }

    @Override // F5.l
    public final InterfaceC4942i.d o(Class cls) {
        return this.f2558k.a(cls);
    }

    @Override // F5.l
    public final p.b p(Class cls) {
        p.b d10 = j(cls).d();
        p.b N10 = N();
        return N10 == null ? d10 : N10.m(d10);
    }

    @Override // F5.l
    public final z.a r() {
        return this.f2558k.e();
    }

    @Override // F5.l
    public final I t(Class cls, C0922c c0922c) {
        I n10 = T5.f.H(cls) ? I.a.n() : P();
        AbstractC0776b g10 = g();
        if (g10 != null) {
            n10 = g10.e(c0922c, n10);
        }
        g b10 = this.f2558k.b(cls);
        if (b10 == null) {
            return n10;
        }
        b10.i();
        return n10.i(null);
    }

    protected m(m mVar, long j10) {
        super(mVar, j10);
        this.f2552e = mVar.f2552e;
        this.f2553f = mVar.f2553f;
        this.f2557j = mVar.f2557j;
        this.f2554g = mVar.f2554g;
        this.f2555h = mVar.f2555h;
        this.f2556i = mVar.f2556i;
        this.f2558k = mVar.f2558k;
    }
}
