package r3;

import O3.j;
import Z3.x;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import b3.l;
import b3.o;
import c3.AbstractC1721a;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import f3.AbstractC3142a;
import f4.InterfaceC3146a;
import g4.InterfaceC3190e;
import g4.k;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import l3.InterfaceC3606c;
import q3.InterfaceC3918a;
import s3.C4311a;
import u3.AbstractC4864a;
import v3.AbstractC4921a;
import v3.AbstractC4922b;
import w3.C5035a;
import x3.C5107a;
import y3.p;

/* loaded from: classes.dex */
public class d extends AbstractC4921a {

    /* renamed from: M, reason: collision with root package name */
    private static final Class f39212M = d.class;

    /* renamed from: A, reason: collision with root package name */
    private final InterfaceC3146a f39213A;

    /* renamed from: B, reason: collision with root package name */
    private final b3.f f39214B;

    /* renamed from: C, reason: collision with root package name */
    private final x f39215C;

    /* renamed from: D, reason: collision with root package name */
    private V2.d f39216D;

    /* renamed from: E, reason: collision with root package name */
    private o f39217E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f39218F;

    /* renamed from: G, reason: collision with root package name */
    private b3.f f39219G;

    /* renamed from: H, reason: collision with root package name */
    private C4311a f39220H;

    /* renamed from: I, reason: collision with root package name */
    private Set f39221I;

    /* renamed from: J, reason: collision with root package name */
    private m4.b f39222J;

    /* renamed from: K, reason: collision with root package name */
    private m4.b[] f39223K;

    /* renamed from: L, reason: collision with root package name */
    private m4.b f39224L;

    /* renamed from: z, reason: collision with root package name */
    private final Resources f39225z;

    public d(Resources resources, AbstractC4864a abstractC4864a, InterfaceC3146a interfaceC3146a, Executor executor, x xVar, b3.f fVar) {
        super(abstractC4864a, executor, null, null);
        this.f39225z = resources;
        this.f39213A = new C4011a(resources, interfaceC3146a);
        this.f39214B = fVar;
        this.f39215C = xVar;
    }

    private void q0(o oVar) {
        this.f39217E = oVar;
        u0(null);
    }

    private Drawable t0(b3.f fVar, InterfaceC3190e interfaceC3190e) {
        Drawable a10;
        if (fVar == null) {
            return null;
        }
        Iterator<E> it = fVar.iterator();
        while (it.hasNext()) {
            InterfaceC3146a interfaceC3146a = (InterfaceC3146a) it.next();
            if (interfaceC3146a.b(interfaceC3190e) && (a10 = interfaceC3146a.a(interfaceC3190e)) != null) {
                return a10;
            }
        }
        return null;
    }

    private void u0(InterfaceC3190e interfaceC3190e) {
        if (this.f39218F) {
            if (s() == null) {
                C5035a c5035a = new C5035a();
                k(new C5107a(c5035a));
                b0(c5035a);
            }
            if (s() instanceof C5035a) {
                B0(interfaceC3190e, (C5035a) s());
            }
        }
    }

    @Override // v3.AbstractC4921a
    protected Uri A() {
        return j.a(this.f39222J, this.f39224L, this.f39223K, m4.b.f37335z);
    }

    public void A0(boolean z10) {
        this.f39218F = z10;
    }

    protected void B0(InterfaceC3190e interfaceC3190e, C5035a c5035a) {
        y3.o a10;
        c5035a.j(w());
        B3.b c10 = c();
        p.b bVar = null;
        if (c10 != null && (a10 = p.a(c10.e())) != null) {
            bVar = a10.A();
        }
        c5035a.m(bVar);
        String m02 = m0();
        if (m02 != null) {
            c5035a.b("cc", m02);
        }
        if (interfaceC3190e == null) {
            c5035a.i();
        } else {
            c5035a.k(interfaceC3190e.getWidth(), interfaceC3190e.getHeight());
            c5035a.l(interfaceC3190e.M());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v3.AbstractC4921a
    protected void Q(Drawable drawable) {
        if (drawable instanceof InterfaceC3918a) {
            ((InterfaceC3918a) drawable).a();
        }
    }

    @Override // v3.AbstractC4921a, B3.a
    public void f(B3.b bVar) {
        super.f(bVar);
        u0(null);
    }

    public synchronized void j0(i4.e eVar) {
        try {
            if (this.f39221I == null) {
                this.f39221I = new HashSet();
            }
            this.f39221I.add(eVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // v3.AbstractC4921a
    /* renamed from: k0, reason: merged with bridge method [inline-methods] */
    public Drawable m(AbstractC3142a abstractC3142a) {
        try {
            if (n4.b.d()) {
                n4.b.a("PipelineDraweeController#createDrawable");
            }
            l.i(AbstractC3142a.x(abstractC3142a));
            InterfaceC3190e interfaceC3190e = (InterfaceC3190e) abstractC3142a.p();
            u0(interfaceC3190e);
            Drawable t02 = t0(this.f39219G, interfaceC3190e);
            if (t02 != null) {
                if (n4.b.d()) {
                    n4.b.b();
                }
                return t02;
            }
            Drawable t03 = t0(this.f39214B, interfaceC3190e);
            if (t03 != null) {
                if (n4.b.d()) {
                    n4.b.b();
                }
                return t03;
            }
            Drawable a10 = this.f39213A.a(interfaceC3190e);
            if (a10 != null) {
                if (n4.b.d()) {
                    n4.b.b();
                }
                return a10;
            }
            throw new UnsupportedOperationException("Unrecognized image class: " + interfaceC3190e);
        } catch (Throwable th) {
            if (n4.b.d()) {
                n4.b.b();
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // v3.AbstractC4921a
    /* renamed from: l0, reason: merged with bridge method [inline-methods] */
    public AbstractC3142a o() {
        V2.d dVar;
        if (n4.b.d()) {
            n4.b.a("PipelineDraweeController#getCachedImage");
        }
        try {
            x xVar = this.f39215C;
            if (xVar != null && (dVar = this.f39216D) != null) {
                AbstractC3142a abstractC3142a = xVar.get(dVar);
                if (abstractC3142a != null && !((InterfaceC3190e) abstractC3142a.p()).c1().a()) {
                    abstractC3142a.close();
                    return null;
                }
                if (n4.b.d()) {
                    n4.b.b();
                }
                return abstractC3142a;
            }
            if (n4.b.d()) {
                n4.b.b();
            }
            return null;
        } finally {
            if (n4.b.d()) {
                n4.b.b();
            }
        }
    }

    protected String m0() {
        Object p10 = p();
        if (p10 == null) {
            return null;
        }
        return p10.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // v3.AbstractC4921a
    /* renamed from: n0, reason: merged with bridge method [inline-methods] */
    public int y(AbstractC3142a abstractC3142a) {
        if (abstractC3142a != null) {
            return abstractC3142a.q();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // v3.AbstractC4921a
    /* renamed from: o0, reason: merged with bridge method [inline-methods] */
    public k z(AbstractC3142a abstractC3142a) {
        l.i(AbstractC3142a.x(abstractC3142a));
        return ((InterfaceC3190e) abstractC3142a.p()).G();
    }

    public synchronized i4.e p0() {
        Set set = this.f39221I;
        if (set == null) {
            return null;
        }
        return new i4.c(set);
    }

    public void r0(o oVar, String str, V2.d dVar, Object obj, b3.f fVar) {
        if (n4.b.d()) {
            n4.b.a("PipelineDraweeController#initialize");
        }
        super.E(str, obj);
        q0(oVar);
        this.f39216D = dVar;
        z0(fVar);
        u0(null);
        if (n4.b.d()) {
            n4.b.b();
        }
    }

    protected synchronized void s0(O3.g gVar, AbstractC4922b abstractC4922b, o oVar) {
        try {
            C4311a c4311a = this.f39220H;
            if (c4311a != null) {
                c4311a.f();
            }
            if (gVar != null) {
                if (this.f39220H == null) {
                    this.f39220H = new C4311a(AwakeTimeSinceBootClock.get(), this, oVar);
                }
                this.f39220H.c(gVar);
                this.f39220H.g(true);
            }
            this.f39222J = (m4.b) abstractC4922b.l();
            this.f39223K = (m4.b[]) abstractC4922b.k();
            this.f39224L = (m4.b) abstractC4922b.m();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // v3.AbstractC4921a
    protected InterfaceC3606c t() {
        if (n4.b.d()) {
            n4.b.a("PipelineDraweeController#getDataSource");
        }
        if (AbstractC1721a.x(2)) {
            AbstractC1721a.z(f39212M, "controller %x: getDataSource", Integer.valueOf(System.identityHashCode(this)));
        }
        InterfaceC3606c interfaceC3606c = (InterfaceC3606c) this.f39217E.get();
        if (n4.b.d()) {
            n4.b.b();
        }
        return interfaceC3606c;
    }

    @Override // v3.AbstractC4921a
    public String toString() {
        return b3.j.c(this).b("super", super.toString()).b("dataSourceSupplier", this.f39217E).toString();
    }

    @Override // v3.AbstractC4921a
    /* renamed from: v0, reason: merged with bridge method [inline-methods] */
    public Map L(k kVar) {
        if (kVar == null) {
            return null;
        }
        return kVar.getExtras();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // v3.AbstractC4921a
    /* renamed from: w0, reason: merged with bridge method [inline-methods] */
    public void N(String str, AbstractC3142a abstractC3142a) {
        super.N(str, abstractC3142a);
        synchronized (this) {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // v3.AbstractC4921a
    /* renamed from: x0, reason: merged with bridge method [inline-methods] */
    public void S(AbstractC3142a abstractC3142a) {
        AbstractC3142a.n(abstractC3142a);
    }

    public synchronized void y0(i4.e eVar) {
        Set set = this.f39221I;
        if (set == null) {
            return;
        }
        set.remove(eVar);
    }

    public void z0(b3.f fVar) {
        this.f39219G = fVar;
    }
}
