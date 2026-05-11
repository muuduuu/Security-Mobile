package T5;

import D5.AbstractC0776b;
import D5.v;
import D5.w;
import K5.AbstractC0928i;
import K5.C0926g;
import K5.s;
import v5.p;

/* loaded from: classes2.dex */
public class o extends s {

    /* renamed from: b, reason: collision with root package name */
    protected final AbstractC0776b f9306b;

    /* renamed from: c, reason: collision with root package name */
    protected final AbstractC0928i f9307c;

    /* renamed from: d, reason: collision with root package name */
    protected final v f9308d;

    /* renamed from: e, reason: collision with root package name */
    protected final w f9309e;

    /* renamed from: f, reason: collision with root package name */
    protected final p.b f9310f;

    protected o(AbstractC0776b abstractC0776b, AbstractC0928i abstractC0928i, w wVar, v vVar, p.b bVar) {
        this.f9306b = abstractC0776b;
        this.f9307c = abstractC0928i;
        this.f9309e = wVar;
        this.f9308d = vVar == null ? v.f1284i : vVar;
        this.f9310f = bVar;
    }

    public static o B(F5.l lVar, AbstractC0928i abstractC0928i, w wVar, v vVar, p.a aVar) {
        return new o(lVar.g(), abstractC0928i, wVar, vVar, (aVar == null || aVar == p.a.USE_DEFAULTS) ? s.f5439a : p.b.a(aVar, null));
    }

    @Override // K5.s
    public p.b c() {
        return this.f9310f;
    }

    @Override // K5.s
    public K5.m o() {
        AbstractC0928i abstractC0928i = this.f9307c;
        if (abstractC0928i instanceof K5.m) {
            return (K5.m) abstractC0928i;
        }
        return null;
    }

    @Override // K5.s
    public C0926g p() {
        AbstractC0928i abstractC0928i = this.f9307c;
        if (abstractC0928i instanceof C0926g) {
            return (C0926g) abstractC0928i;
        }
        return null;
    }

    @Override // K5.s
    public w q() {
        return this.f9309e;
    }

    @Override // K5.s
    public K5.j r() {
        AbstractC0928i abstractC0928i = this.f9307c;
        if ((abstractC0928i instanceof K5.j) && ((K5.j) abstractC0928i).u() == 0) {
            return (K5.j) this.f9307c;
        }
        return null;
    }

    @Override // K5.s
    public v s() {
        return this.f9308d;
    }

    @Override // K5.s
    public String u() {
        return this.f9309e.c();
    }

    @Override // K5.s
    public AbstractC0928i v() {
        return this.f9307c;
    }

    @Override // K5.s
    public Class w() {
        AbstractC0928i abstractC0928i = this.f9307c;
        return abstractC0928i == null ? Object.class : abstractC0928i.d();
    }

    @Override // K5.s
    public K5.j x() {
        AbstractC0928i abstractC0928i = this.f9307c;
        if ((abstractC0928i instanceof K5.j) && ((K5.j) abstractC0928i).u() == 1) {
            return (K5.j) this.f9307c;
        }
        return null;
    }

    @Override // K5.s
    public w y() {
        AbstractC0928i abstractC0928i;
        AbstractC0776b abstractC0776b = this.f9306b;
        if (abstractC0776b == null || (abstractC0928i = this.f9307c) == null) {
            return null;
        }
        return abstractC0776b.V(abstractC0928i);
    }

    @Override // K5.s
    public boolean z() {
        return false;
    }
}
