package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class U implements f0 {

    /* renamed from: a, reason: collision with root package name */
    private final P f16325a;

    /* renamed from: b, reason: collision with root package name */
    private final m0 f16326b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f16327c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC1549p f16328d;

    private U(m0 m0Var, AbstractC1549p abstractC1549p, P p10) {
        this.f16326b = m0Var;
        this.f16327c = abstractC1549p.e(p10);
        this.f16328d = abstractC1549p;
        this.f16325a = p10;
    }

    private int j(m0 m0Var, Object obj) {
        return m0Var.i(m0Var.g(obj));
    }

    private void k(m0 m0Var, AbstractC1549p abstractC1549p, Object obj, e0 e0Var, C1548o c1548o) {
        Object f10 = m0Var.f(obj);
        C1551s d10 = abstractC1549p.d(obj);
        do {
            try {
                if (e0Var.z() == Integer.MAX_VALUE) {
                    return;
                }
            } finally {
                m0Var.o(obj, f10);
            }
        } while (m(e0Var, c1548o, abstractC1549p, d10, m0Var, f10));
    }

    static U l(m0 m0Var, AbstractC1549p abstractC1549p, P p10) {
        return new U(m0Var, abstractC1549p, p10);
    }

    private boolean m(e0 e0Var, C1548o c1548o, AbstractC1549p abstractC1549p, C1551s c1551s, m0 m0Var, Object obj) {
        int a10 = e0Var.a();
        int i10 = 0;
        if (a10 != r0.f16459a) {
            if (r0.b(a10) != 2) {
                return e0Var.G();
            }
            Object b10 = abstractC1549p.b(c1548o, this.f16325a, r0.a(a10));
            if (b10 == null) {
                return m0Var.m(obj, e0Var, 0);
            }
            abstractC1549p.h(e0Var, b10, c1548o, c1551s);
            return true;
        }
        Object obj2 = null;
        AbstractC1540g abstractC1540g = null;
        while (e0Var.z() != Integer.MAX_VALUE) {
            int a11 = e0Var.a();
            if (a11 == r0.f16461c) {
                i10 = e0Var.l();
                obj2 = abstractC1549p.b(c1548o, this.f16325a, i10);
            } else if (a11 == r0.f16462d) {
                if (obj2 != null) {
                    abstractC1549p.h(e0Var, obj2, c1548o, c1551s);
                } else {
                    abstractC1540g = e0Var.C();
                }
            } else if (!e0Var.G()) {
                break;
            }
        }
        if (e0Var.a() != r0.f16460b) {
            throw C1558z.b();
        }
        if (abstractC1540g != null) {
            if (obj2 != null) {
                abstractC1549p.i(abstractC1540g, obj2, c1548o, c1551s);
            } else {
                m0Var.d(obj, i10, abstractC1540g);
            }
        }
        return true;
    }

    private void n(m0 m0Var, Object obj, s0 s0Var) {
        m0Var.s(m0Var.g(obj), s0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public void a(Object obj, Object obj2) {
        h0.F(this.f16326b, obj, obj2);
        if (this.f16327c) {
            h0.D(this.f16328d, obj, obj2);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public Object b() {
        P p10 = this.f16325a;
        return p10 instanceof AbstractC1555w ? ((AbstractC1555w) p10).E() : p10.newBuilderForType().I();
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public boolean c(Object obj, Object obj2) {
        if (!this.f16326b.g(obj).equals(this.f16326b.g(obj2))) {
            return false;
        }
        if (this.f16327c) {
            return this.f16328d.c(obj).equals(this.f16328d.c(obj2));
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public int d(Object obj) {
        int hashCode = this.f16326b.g(obj).hashCode();
        return this.f16327c ? (hashCode * 53) + this.f16328d.c(obj).hashCode() : hashCode;
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public void e(Object obj) {
        this.f16326b.j(obj);
        this.f16328d.f(obj);
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public final boolean f(Object obj) {
        return this.f16328d.c(obj).k();
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public int g(Object obj) {
        int j10 = j(this.f16326b, obj);
        return this.f16327c ? j10 + this.f16328d.c(obj).f() : j10;
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public void h(Object obj, e0 e0Var, C1548o c1548o) {
        k(this.f16326b, this.f16328d, obj, e0Var, c1548o);
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public void i(Object obj, s0 s0Var) {
        Iterator n10 = this.f16328d.c(obj).n();
        if (n10.hasNext()) {
            android.support.v4.media.session.b.a(((Map.Entry) n10.next()).getKey());
            throw null;
        }
        n(this.f16326b, obj, s0Var);
    }
}
