package K5;

import D5.AbstractC0776b;
import T5.h;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import v5.InterfaceC4942i;
import v5.p;

/* loaded from: classes2.dex */
public class q extends D5.c {

    /* renamed from: j, reason: collision with root package name */
    private static final Class[] f5422j = new Class[0];

    /* renamed from: b, reason: collision with root package name */
    protected final C f5423b;

    /* renamed from: c, reason: collision with root package name */
    protected final F5.l f5424c;

    /* renamed from: d, reason: collision with root package name */
    protected final AbstractC0776b f5425d;

    /* renamed from: e, reason: collision with root package name */
    protected final C0922c f5426e;

    /* renamed from: f, reason: collision with root package name */
    protected Class[] f5427f;

    /* renamed from: g, reason: collision with root package name */
    protected boolean f5428g;

    /* renamed from: h, reason: collision with root package name */
    protected List f5429h;

    /* renamed from: i, reason: collision with root package name */
    protected B f5430i;

    protected q(C c10, D5.j jVar, C0922c c0922c) {
        super(jVar);
        this.f5423b = c10;
        F5.l z10 = c10.z();
        this.f5424c = z10;
        if (z10 == null) {
            this.f5425d = null;
        } else {
            this.f5425d = z10.g();
        }
        this.f5426e = c0922c;
    }

    public static q r(F5.l lVar, D5.j jVar, C0922c c0922c) {
        return new q(lVar, jVar, c0922c, Collections.emptyList());
    }

    public static q s(C c10) {
        return new q(c10);
    }

    @Override // D5.c
    public AbstractC0928i a() {
        C c10 = this.f5423b;
        if (c10 == null) {
            return null;
        }
        AbstractC0928i x10 = c10.x();
        if (x10 != null) {
            if (Map.class.isAssignableFrom(x10.d())) {
                return x10;
            }
            throw new IllegalArgumentException(String.format("Invalid 'any-getter' annotation on method %s(): return type is not instance of java.util.Map", x10.c()));
        }
        AbstractC0928i w10 = this.f5423b.w();
        if (w10 == null) {
            return null;
        }
        if (Map.class.isAssignableFrom(w10.d())) {
            return w10;
        }
        throw new IllegalArgumentException(String.format("Invalid 'any-getter' annotation on field '%s': type is not instance of java.util.Map", w10.c()));
    }

    @Override // D5.c
    public Class[] b() {
        if (!this.f5428g) {
            this.f5428g = true;
            AbstractC0776b abstractC0776b = this.f5425d;
            Class[] U10 = abstractC0776b == null ? null : abstractC0776b.U(this.f5426e);
            if (U10 == null && !this.f5424c.D(D5.q.DEFAULT_VIEW_INCLUSION)) {
                U10 = f5422j;
            }
            this.f5427f = U10;
        }
        return this.f5427f;
    }

    @Override // D5.c
    public InterfaceC4942i.d c(InterfaceC4942i.d dVar) {
        InterfaceC4942i.d k10;
        AbstractC0776b abstractC0776b = this.f5425d;
        if (abstractC0776b != null && (k10 = abstractC0776b.k(this.f5426e)) != null) {
            dVar = dVar == null ? k10 : dVar.q(k10);
        }
        InterfaceC4942i.d o10 = this.f5424c.o(this.f5426e.d());
        return o10 != null ? dVar == null ? o10 : dVar.q(o10) : dVar;
    }

    @Override // D5.c
    public AbstractC0928i d() {
        C c10 = this.f5423b;
        if (c10 == null) {
            return null;
        }
        return c10.A();
    }

    @Override // D5.c
    public AbstractC0928i e() {
        C c10 = this.f5423b;
        if (c10 == null) {
            return null;
        }
        return c10.B();
    }

    @Override // D5.c
    public List f() {
        return q();
    }

    @Override // D5.c
    public p.b g(p.b bVar) {
        p.b C10;
        AbstractC0776b abstractC0776b = this.f5425d;
        return (abstractC0776b == null || (C10 = abstractC0776b.C(this.f5426e)) == null) ? bVar : bVar == null ? C10 : bVar.m(C10);
    }

    @Override // D5.c
    public T5.h h() {
        AbstractC0776b abstractC0776b = this.f5425d;
        if (abstractC0776b == null) {
            return null;
        }
        p(abstractC0776b.K(this.f5426e));
        return null;
    }

    @Override // D5.c
    public T5.a j() {
        return this.f5426e.m();
    }

    @Override // D5.c
    public C0922c k() {
        return this.f5426e;
    }

    @Override // D5.c
    public B l() {
        return this.f5430i;
    }

    @Override // D5.c
    public boolean n() {
        return this.f5426e.q();
    }

    @Override // D5.c
    public Object o(boolean z10) {
        C0924e o10 = this.f5426e.o();
        if (o10 == null) {
            return null;
        }
        if (z10) {
            o10.h(this.f5424c.D(D5.q.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        try {
            return o10.s();
        } catch (Exception e10) {
            e = e10;
            while (e.getCause() != null) {
                e = e.getCause();
            }
            T5.f.U(e);
            T5.f.W(e);
            throw new IllegalArgumentException("Failed to instantiate bean of type " + this.f5426e.l().getName() + ": (" + e.getClass().getName() + ") " + T5.f.m(e), e);
        }
    }

    protected T5.h p(Object obj) {
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof Class)) {
            throw new IllegalStateException("AnnotationIntrospector returned Converter definition of type " + obj.getClass().getName() + "; expected type Converter or Class<Converter> instead");
        }
        Class cls = (Class) obj;
        if (cls == h.a.class || T5.f.F(cls)) {
            return null;
        }
        if (T5.h.class.isAssignableFrom(cls)) {
            this.f5424c.u();
            android.support.v4.media.session.b.a(T5.f.k(cls, this.f5424c.b()));
            return null;
        }
        throw new IllegalStateException("AnnotationIntrospector returned Class " + cls.getName() + "; expected Class<Converter>");
    }

    protected List q() {
        if (this.f5429h == null) {
            this.f5429h = this.f5423b.D();
        }
        return this.f5429h;
    }

    public boolean t(String str) {
        Iterator it = q().iterator();
        while (it.hasNext()) {
            if (((s) it.next()).u().equals(str)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    protected q(F5.l lVar, D5.j jVar, C0922c c0922c, List list) {
        super(jVar);
        this.f5423b = null;
        this.f5424c = lVar;
        if (lVar == null) {
            this.f5425d = null;
        } else {
            this.f5425d = lVar.g();
        }
        this.f5426e = c0922c;
        this.f5429h = list;
    }

    protected q(C c10) {
        this(c10, c10.F(), c10.y());
        this.f5430i = c10.C();
    }
}
