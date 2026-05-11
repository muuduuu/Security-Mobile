package K5;

import D5.AbstractC0776b;
import D5.o;
import E5.b;
import E5.e;
import T5.h;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import v5.C;
import v5.InterfaceC4933A;
import v5.InterfaceC4934a;
import v5.InterfaceC4935b;
import v5.InterfaceC4936c;
import v5.InterfaceC4937d;
import v5.InterfaceC4938e;
import v5.InterfaceC4939f;
import v5.InterfaceC4940g;
import v5.InterfaceC4941h;
import v5.InterfaceC4942i;
import v5.InterfaceC4943j;
import v5.InterfaceC4944k;
import v5.InterfaceC4945l;
import v5.InterfaceC4946m;
import v5.InterfaceC4947n;
import v5.InterfaceC4948o;
import v5.K;
import v5.p;
import v5.q;
import v5.u;
import v5.z;

/* loaded from: classes2.dex */
public class x extends AbstractC0776b implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    private static final Class[] f5455c = {E5.e.class, v5.G.class, InterfaceC4942i.class, v5.C.class, v5.x.class, v5.E.class, InterfaceC4939f.class, v5.s.class};

    /* renamed from: d, reason: collision with root package name */
    private static final Class[] f5456d = {E5.c.class, v5.G.class, InterfaceC4942i.class, v5.C.class, v5.E.class, InterfaceC4939f.class, v5.s.class, v5.t.class};

    /* renamed from: a, reason: collision with root package name */
    protected transient T5.k f5457a = new T5.k(48, 48);

    /* renamed from: b, reason: collision with root package name */
    protected boolean f5458b = true;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f5459a;

        static {
            int[] iArr = new int[e.a.values().length];
            f5459a = iArr;
            try {
                iArr[e.a.ALWAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5459a[e.a.NON_NULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5459a[e.a.NON_DEFAULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5459a[e.a.NON_EMPTY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5459a[e.a.DEFAULT_INCLUSION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        try {
            J5.c.a();
        } catch (Throwable unused) {
        }
    }

    private D5.l r0(String str) {
        return new D5.l(null, str);
    }

    private D5.l s0(Throwable th, String str) {
        return new D5.l(null, str, th);
    }

    private final Boolean u0(AbstractC0921b abstractC0921b) {
        v5.w wVar = (v5.w) a(abstractC0921b, v5.w.class);
        if (wVar == null || !wVar.alphabetic()) {
            return null;
        }
        return Boolean.TRUE;
    }

    private boolean x0(Class cls, Class cls2) {
        return cls.isPrimitive() ? cls == T5.f.S(cls2) : cls2.isPrimitive() && cls2 == T5.f.S(cls);
    }

    private p.b z0(AbstractC0921b abstractC0921b, p.b bVar) {
        E5.e eVar = (E5.e) a(abstractC0921b, E5.e.class);
        if (eVar != null) {
            int i10 = a.f5459a[eVar.include().ordinal()];
            if (i10 == 1) {
                return bVar.n(p.a.ALWAYS);
            }
            if (i10 == 2) {
                return bVar.n(p.a.NON_NULL);
            }
            if (i10 == 3) {
                return bVar.n(p.a.NON_DEFAULT);
            }
            if (i10 == 4) {
                return bVar.n(p.a.NON_EMPTY);
            }
        }
        return bVar;
    }

    @Override // D5.AbstractC0776b
    public InterfaceC4947n.a A(F5.l lVar, AbstractC0921b abstractC0921b) {
        InterfaceC4947n interfaceC4947n = (InterfaceC4947n) a(abstractC0921b, InterfaceC4947n.class);
        return interfaceC4947n == null ? InterfaceC4947n.a.f() : InterfaceC4947n.a.h(interfaceC4947n);
    }

    @Override // D5.AbstractC0776b
    public InterfaceC4947n.a B(AbstractC0921b abstractC0921b) {
        return A(null, abstractC0921b);
    }

    @Override // D5.AbstractC0776b
    public p.b C(AbstractC0921b abstractC0921b) {
        v5.p pVar = (v5.p) a(abstractC0921b, v5.p.class);
        p.b c10 = pVar == null ? p.b.c() : p.b.d(pVar);
        return c10.h() == p.a.USE_DEFAULTS ? z0(abstractC0921b, c10) : c10;
    }

    @Override // D5.AbstractC0776b
    public q.a D(F5.l lVar, AbstractC0921b abstractC0921b) {
        v5.q qVar = (v5.q) a(abstractC0921b, v5.q.class);
        return qVar == null ? q.a.c() : q.a.d(qVar);
    }

    @Override // D5.AbstractC0776b
    public Integer E(AbstractC0921b abstractC0921b) {
        int index;
        v5.u uVar = (v5.u) a(abstractC0921b, v5.u.class);
        if (uVar == null || (index = uVar.index()) == -1) {
            return null;
        }
        return Integer.valueOf(index);
    }

    @Override // D5.AbstractC0776b
    public M5.f F(F5.l lVar, AbstractC0928i abstractC0928i, D5.j jVar) {
        if (jVar.A() || jVar.b()) {
            return null;
        }
        return v0(lVar, abstractC0928i, jVar);
    }

    @Override // D5.AbstractC0776b
    public AbstractC0776b.a G(AbstractC0928i abstractC0928i) {
        v5.s sVar = (v5.s) a(abstractC0928i, v5.s.class);
        if (sVar != null) {
            return AbstractC0776b.a.c(sVar.value());
        }
        InterfaceC4939f interfaceC4939f = (InterfaceC4939f) a(abstractC0928i, InterfaceC4939f.class);
        if (interfaceC4939f != null) {
            return AbstractC0776b.a.a(interfaceC4939f.value());
        }
        return null;
    }

    @Override // D5.AbstractC0776b
    public D5.w H(F5.l lVar, C0926g c0926g, D5.w wVar) {
        return null;
    }

    @Override // D5.AbstractC0776b
    public D5.w I(C0922c c0922c) {
        v5.y yVar = (v5.y) a(c0922c, v5.y.class);
        if (yVar == null) {
            return null;
        }
        String namespace = yVar.namespace();
        return D5.w.b(yVar.value(), (namespace == null || !namespace.isEmpty()) ? namespace : null);
    }

    @Override // D5.AbstractC0776b
    public Object J(AbstractC0928i abstractC0928i) {
        E5.e eVar = (E5.e) a(abstractC0928i, E5.e.class);
        if (eVar == null) {
            return null;
        }
        return m0(eVar.contentConverter(), h.a.class);
    }

    @Override // D5.AbstractC0776b
    public Object K(AbstractC0921b abstractC0921b) {
        E5.e eVar = (E5.e) a(abstractC0921b, E5.e.class);
        if (eVar == null) {
            return null;
        }
        return m0(eVar.converter(), h.a.class);
    }

    @Override // D5.AbstractC0776b
    public String[] L(C0922c c0922c) {
        v5.w wVar = (v5.w) a(c0922c, v5.w.class);
        if (wVar == null) {
            return null;
        }
        return wVar.value();
    }

    @Override // D5.AbstractC0776b
    public Boolean M(AbstractC0921b abstractC0921b) {
        return u0(abstractC0921b);
    }

    @Override // D5.AbstractC0776b
    public e.b N(AbstractC0921b abstractC0921b) {
        E5.e eVar = (E5.e) a(abstractC0921b, E5.e.class);
        if (eVar == null) {
            return null;
        }
        return eVar.typing();
    }

    @Override // D5.AbstractC0776b
    public Object O(AbstractC0921b abstractC0921b) {
        Class using;
        E5.e eVar = (E5.e) a(abstractC0921b, E5.e.class);
        if (eVar != null && (using = eVar.using()) != o.a.class) {
            return using;
        }
        v5.x xVar = (v5.x) a(abstractC0921b, v5.x.class);
        if (xVar == null || !xVar.value()) {
            return null;
        }
        return new R5.y(abstractC0921b.d());
    }

    @Override // D5.AbstractC0776b
    public z.a P(AbstractC0921b abstractC0921b) {
        return z.a.d((v5.z) a(abstractC0921b, v5.z.class));
    }

    @Override // D5.AbstractC0776b
    public List Q(AbstractC0921b abstractC0921b) {
        InterfaceC4933A interfaceC4933A = (InterfaceC4933A) a(abstractC0921b, InterfaceC4933A.class);
        if (interfaceC4933A == null) {
            return null;
        }
        InterfaceC4933A.a[] value = interfaceC4933A.value();
        ArrayList arrayList = new ArrayList(value.length);
        for (InterfaceC4933A.a aVar : value) {
            arrayList.add(new M5.b(aVar.value(), aVar.name()));
            for (String str : aVar.names()) {
                arrayList.add(new M5.b(aVar.value(), str));
            }
        }
        return arrayList;
    }

    @Override // D5.AbstractC0776b
    public String R(C0922c c0922c) {
        v5.D d10 = (v5.D) a(c0922c, v5.D.class);
        if (d10 == null) {
            return null;
        }
        return d10.value();
    }

    @Override // D5.AbstractC0776b
    public M5.f S(F5.l lVar, C0922c c0922c, D5.j jVar) {
        return v0(lVar, c0922c, jVar);
    }

    @Override // D5.AbstractC0776b
    public T5.m T(AbstractC0928i abstractC0928i) {
        v5.E e10 = (v5.E) a(abstractC0928i, v5.E.class);
        if (e10 == null || !e10.enabled()) {
            return null;
        }
        return T5.m.b(e10.prefix(), e10.suffix());
    }

    @Override // D5.AbstractC0776b
    public Class[] U(AbstractC0921b abstractC0921b) {
        v5.G g10 = (v5.G) a(abstractC0921b, v5.G.class);
        if (g10 == null) {
            return null;
        }
        return g10.value();
    }

    @Override // D5.AbstractC0776b
    public Boolean W(AbstractC0921b abstractC0921b) {
        InterfaceC4936c interfaceC4936c = (InterfaceC4936c) a(abstractC0921b, InterfaceC4936c.class);
        if (interfaceC4936c == null) {
            return null;
        }
        return Boolean.valueOf(interfaceC4936c.enabled());
    }

    @Override // D5.AbstractC0776b
    public boolean X(j jVar) {
        return b(jVar, InterfaceC4936c.class);
    }

    @Override // D5.AbstractC0776b
    public Boolean Y(AbstractC0921b abstractC0921b) {
        InterfaceC4937d interfaceC4937d = (InterfaceC4937d) a(abstractC0921b, InterfaceC4937d.class);
        if (interfaceC4937d == null) {
            return null;
        }
        return Boolean.valueOf(interfaceC4937d.enabled());
    }

    @Override // D5.AbstractC0776b
    public Boolean Z(F5.l lVar, AbstractC0921b abstractC0921b) {
        v5.r rVar = (v5.r) a(abstractC0921b, v5.r.class);
        if (rVar == null) {
            return null;
        }
        return Boolean.valueOf(rVar.value());
    }

    @Override // D5.AbstractC0776b
    public Boolean a0(AbstractC0921b abstractC0921b) {
        v5.F f10 = (v5.F) a(abstractC0921b, v5.F.class);
        if (f10 == null) {
            return null;
        }
        return Boolean.valueOf(f10.value());
    }

    @Override // D5.AbstractC0776b
    public boolean b0(j jVar) {
        v5.F f10 = (v5.F) a(jVar, v5.F.class);
        return f10 != null && f10.value();
    }

    @Override // D5.AbstractC0776b
    public boolean c0(AbstractC0921b abstractC0921b) {
        InterfaceC4940g interfaceC4940g = (InterfaceC4940g) a(abstractC0921b, InterfaceC4940g.class);
        if (interfaceC4940g != null) {
            return interfaceC4940g.mode() != InterfaceC4940g.a.DISABLED;
        }
        if (this.f5458b) {
            boolean z10 = abstractC0921b instanceof C0924e;
        }
        return false;
    }

    @Override // D5.AbstractC0776b
    public void d(F5.l lVar, C0922c c0922c, List list) {
        E5.b bVar = (E5.b) a(c0922c, E5.b.class);
        if (bVar == null) {
            return;
        }
        boolean prepend = bVar.prepend();
        b.a[] attrs = bVar.attrs();
        int length = attrs.length;
        D5.j jVar = null;
        for (int i10 = 0; i10 < length; i10++) {
            if (jVar == null) {
                jVar = lVar.e(Object.class);
            }
            P5.c p02 = p0(attrs[i10], lVar, c0922c, jVar);
            if (prepend) {
                list.add(i10, p02);
            } else {
                list.add(p02);
            }
        }
        b.InterfaceC0038b[] props = bVar.props();
        int length2 = props.length;
        for (int i11 = 0; i11 < length2; i11++) {
            P5.c q02 = q0(props[i11], lVar, c0922c);
            if (prepend) {
                list.add(i11, q02);
            } else {
                list.add(q02);
            }
        }
    }

    @Override // D5.AbstractC0776b
    public boolean d0(AbstractC0928i abstractC0928i) {
        return w0(abstractC0928i);
    }

    @Override // D5.AbstractC0776b
    public I e(C0922c c0922c, I i10) {
        InterfaceC4938e interfaceC4938e = (InterfaceC4938e) a(c0922c, InterfaceC4938e.class);
        return interfaceC4938e == null ? i10 : i10.f(interfaceC4938e);
    }

    @Override // D5.AbstractC0776b
    public Boolean e0(AbstractC0928i abstractC0928i) {
        v5.u uVar = (v5.u) a(abstractC0928i, v5.u.class);
        if (uVar != null) {
            return Boolean.valueOf(uVar.required());
        }
        return null;
    }

    @Override // D5.AbstractC0776b
    public Object f(AbstractC0921b abstractC0921b) {
        Class contentUsing;
        E5.e eVar = (E5.e) a(abstractC0921b, E5.e.class);
        if (eVar == null || (contentUsing = eVar.contentUsing()) == o.a.class) {
            return null;
        }
        return contentUsing;
    }

    @Override // D5.AbstractC0776b
    public boolean f0(Annotation annotation) {
        Class<? extends Annotation> annotationType = annotation.annotationType();
        Boolean bool = (Boolean) this.f5457a.get(annotationType);
        if (bool == null) {
            bool = Boolean.valueOf(annotationType.getAnnotation(InterfaceC4934a.class) != null);
            this.f5457a.putIfAbsent(annotationType, bool);
        }
        return bool.booleanValue();
    }

    @Override // D5.AbstractC0776b
    public InterfaceC4940g.a g(F5.l lVar, AbstractC0921b abstractC0921b) {
        InterfaceC4940g interfaceC4940g = (InterfaceC4940g) a(abstractC0921b, InterfaceC4940g.class);
        if (interfaceC4940g != null) {
            return interfaceC4940g.mode();
        }
        if (!this.f5458b || !lVar.D(D5.q.INFER_CREATOR_FROM_CONSTRUCTOR_PROPERTIES)) {
            return null;
        }
        boolean z10 = abstractC0921b instanceof C0924e;
        return null;
    }

    @Override // D5.AbstractC0776b
    public Boolean g0(C0922c c0922c) {
        InterfaceC4948o interfaceC4948o = (InterfaceC4948o) a(c0922c, InterfaceC4948o.class);
        if (interfaceC4948o == null) {
            return null;
        }
        return Boolean.valueOf(interfaceC4948o.value());
    }

    @Override // D5.AbstractC0776b
    public InterfaceC4940g.a h(AbstractC0921b abstractC0921b) {
        InterfaceC4940g interfaceC4940g = (InterfaceC4940g) a(abstractC0921b, InterfaceC4940g.class);
        if (interfaceC4940g == null) {
            return null;
        }
        return interfaceC4940g.mode();
    }

    @Override // D5.AbstractC0776b
    public Boolean h0(AbstractC0928i abstractC0928i) {
        return Boolean.valueOf(b(abstractC0928i, v5.B.class));
    }

    @Override // D5.AbstractC0776b
    public String[] i(Class cls, Enum[] enumArr, String[] strArr) {
        v5.u uVar;
        HashMap hashMap = null;
        for (Field field : cls.getDeclaredFields()) {
            if (field.isEnumConstant() && (uVar = (v5.u) field.getAnnotation(v5.u.class)) != null) {
                String value = uVar.value();
                if (!value.isEmpty()) {
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    hashMap.put(field.getName(), value);
                }
            }
        }
        if (hashMap != null) {
            int length = enumArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                String str = (String) hashMap.get(enumArr[i10].name());
                if (str != null) {
                    strArr[i10] = str;
                }
            }
        }
        return strArr;
    }

    @Override // D5.AbstractC0776b
    public Object j(AbstractC0921b abstractC0921b) {
        InterfaceC4941h interfaceC4941h = (InterfaceC4941h) a(abstractC0921b, InterfaceC4941h.class);
        if (interfaceC4941h == null) {
            return null;
        }
        String value = interfaceC4941h.value();
        if (value.isEmpty()) {
            return null;
        }
        return value;
    }

    @Override // D5.AbstractC0776b
    public D5.j j0(F5.l lVar, AbstractC0921b abstractC0921b, D5.j jVar) {
        D5.j Q10;
        D5.j Q11;
        S5.o z10 = lVar.z();
        E5.e eVar = (E5.e) a(abstractC0921b, E5.e.class);
        Class<?> l02 = eVar == null ? null : l0(eVar.as());
        if (l02 != null) {
            if (jVar.x(l02)) {
                jVar = jVar.Q();
            } else {
                Class<?> q10 = jVar.q();
                try {
                    if (l02.isAssignableFrom(q10)) {
                        jVar = z10.x(jVar, l02);
                    } else if (q10.isAssignableFrom(l02)) {
                        jVar = z10.A(jVar, l02);
                    } else {
                        if (!x0(q10, l02)) {
                            throw r0(String.format("Cannot refine serialization type %s into %s; types not related", jVar, l02.getName()));
                        }
                        jVar = jVar.Q();
                    }
                } catch (IllegalArgumentException e10) {
                    throw s0(e10, String.format("Failed to widen type %s with annotation (value %s), from '%s': %s", jVar, l02.getName(), abstractC0921b.c(), e10.getMessage()));
                }
            }
        }
        if (jVar.G()) {
            D5.j p10 = jVar.p();
            Class<?> l03 = eVar == null ? null : l0(eVar.keyAs());
            if (l03 != null) {
                if (p10.x(l03)) {
                    Q11 = p10.Q();
                } else {
                    Class<?> q11 = p10.q();
                    try {
                        if (l03.isAssignableFrom(q11)) {
                            Q11 = z10.x(p10, l03);
                        } else if (q11.isAssignableFrom(l03)) {
                            Q11 = z10.A(p10, l03);
                        } else {
                            if (!x0(q11, l03)) {
                                throw r0(String.format("Cannot refine serialization key type %s into %s; types not related", p10, l03.getName()));
                            }
                            Q11 = p10.Q();
                        }
                    } catch (IllegalArgumentException e11) {
                        throw s0(e11, String.format("Failed to widen key type of %s with concrete-type annotation (value %s), from '%s': %s", jVar, l03.getName(), abstractC0921b.c(), e11.getMessage()));
                    }
                }
                jVar = ((S5.g) jVar).W(Q11);
            }
        }
        D5.j k10 = jVar.k();
        if (k10 == null) {
            return jVar;
        }
        Class<?> l04 = eVar != null ? l0(eVar.contentAs()) : null;
        if (l04 == null) {
            return jVar;
        }
        if (k10.x(l04)) {
            Q10 = k10.Q();
        } else {
            Class<?> q12 = k10.q();
            try {
                if (l04.isAssignableFrom(q12)) {
                    Q10 = z10.x(k10, l04);
                } else if (q12.isAssignableFrom(l04)) {
                    Q10 = z10.A(k10, l04);
                } else {
                    if (!x0(q12, l04)) {
                        throw r0(String.format("Cannot refine serialization content type %s into %s; types not related", k10, l04.getName()));
                    }
                    Q10 = k10.Q();
                }
            } catch (IllegalArgumentException e12) {
                throw s0(e12, String.format("Internal error: failed to refine value type of %s with concrete-type annotation (value %s), from '%s': %s", jVar, l04.getName(), abstractC0921b.c(), e12.getMessage()));
            }
        }
        return jVar.N(Q10);
    }

    @Override // D5.AbstractC0776b
    public InterfaceC4942i.d k(AbstractC0921b abstractC0921b) {
        InterfaceC4942i interfaceC4942i = (InterfaceC4942i) a(abstractC0921b, InterfaceC4942i.class);
        if (interfaceC4942i == null) {
            return null;
        }
        return InterfaceC4942i.d.d(interfaceC4942i);
    }

    @Override // D5.AbstractC0776b
    public j k0(F5.l lVar, j jVar, j jVar2) {
        Class v10 = jVar.v(0);
        Class v11 = jVar2.v(0);
        if (v10.isPrimitive()) {
            if (v11.isPrimitive()) {
                return null;
            }
            return jVar;
        }
        if (v11.isPrimitive()) {
            return jVar2;
        }
        if (v10 == String.class) {
            if (v11 != String.class) {
                return jVar;
            }
        } else if (v11 == String.class) {
            return jVar2;
        }
        return null;
    }

    @Override // D5.AbstractC0776b
    public String l(AbstractC0928i abstractC0928i) {
        D5.w t02 = t0(abstractC0928i);
        if (t02 == null) {
            return null;
        }
        return t02.c();
    }

    protected Class l0(Class cls) {
        if (cls == null || T5.f.F(cls)) {
            return null;
        }
        return cls;
    }

    @Override // D5.AbstractC0776b
    public InterfaceC4935b.a m(AbstractC0928i abstractC0928i) {
        String name;
        InterfaceC4935b interfaceC4935b = (InterfaceC4935b) a(abstractC0928i, InterfaceC4935b.class);
        if (interfaceC4935b == null) {
            return null;
        }
        InterfaceC4935b.a d10 = InterfaceC4935b.a.d(interfaceC4935b);
        if (d10.f()) {
            return d10;
        }
        if (abstractC0928i instanceof j) {
            j jVar = (j) abstractC0928i;
            name = jVar.u() == 0 ? abstractC0928i.d().getName() : jVar.v(0).getName();
        } else {
            name = abstractC0928i.d().getName();
        }
        return d10.g(name);
    }

    protected Class m0(Class cls, Class cls2) {
        Class l02 = l0(cls);
        if (l02 == null || l02 == cls2) {
            return null;
        }
        return l02;
    }

    @Override // D5.AbstractC0776b
    public Object n(AbstractC0928i abstractC0928i) {
        InterfaceC4935b.a m10 = m(abstractC0928i);
        if (m10 == null) {
            return null;
        }
        return m10.e();
    }

    protected N5.j n0() {
        return N5.j.l();
    }

    @Override // D5.AbstractC0776b
    public Object o(AbstractC0921b abstractC0921b) {
        Class keyUsing;
        E5.e eVar = (E5.e) a(abstractC0921b, E5.e.class);
        if (eVar == null || (keyUsing = eVar.keyUsing()) == o.a.class) {
            return null;
        }
        return keyUsing;
    }

    protected N5.j o0() {
        return new N5.j();
    }

    @Override // D5.AbstractC0776b
    public Boolean p(AbstractC0921b abstractC0921b) {
        v5.t tVar = (v5.t) a(abstractC0921b, v5.t.class);
        if (tVar == null) {
            return null;
        }
        return tVar.value().asBoolean();
    }

    protected P5.c p0(b.a aVar, F5.l lVar, C0922c c0922c, D5.j jVar) {
        D5.v vVar = aVar.required() ? D5.v.f1283h : D5.v.f1284i;
        String value = aVar.value();
        D5.w y02 = y0(aVar.propName(), aVar.propNamespace());
        if (!y02.e()) {
            y02 = D5.w.a(value);
        }
        return Q5.a.E(value, T5.o.B(lVar, new H(c0922c, c0922c.d(), value, jVar), y02, vVar, aVar.include()), c0922c.m(), jVar);
    }

    @Override // D5.AbstractC0776b
    public D5.w q(AbstractC0921b abstractC0921b) {
        boolean z10;
        v5.z zVar = (v5.z) a(abstractC0921b, v5.z.class);
        if (zVar != null) {
            String value = zVar.value();
            if (!value.isEmpty()) {
                return D5.w.a(value);
            }
            z10 = true;
        } else {
            z10 = false;
        }
        v5.u uVar = (v5.u) a(abstractC0921b, v5.u.class);
        if (uVar != null) {
            String namespace = uVar.namespace();
            return D5.w.b(uVar.value(), (namespace == null || !namespace.isEmpty()) ? namespace : null);
        }
        if (z10 || c(abstractC0921b, f5456d)) {
            return D5.w.f1295d;
        }
        return null;
    }

    protected P5.c q0(b.InterfaceC0038b interfaceC0038b, F5.l lVar, C0922c c0922c) {
        D5.v vVar = interfaceC0038b.required() ? D5.v.f1283h : D5.v.f1284i;
        D5.w y02 = y0(interfaceC0038b.name(), interfaceC0038b.namespace());
        D5.j e10 = lVar.e(interfaceC0038b.type());
        T5.o B10 = T5.o.B(lVar, new H(c0922c, c0922c.d(), y02.c(), e10), y02, vVar, interfaceC0038b.include());
        Class value = interfaceC0038b.value();
        lVar.u();
        return ((P5.s) T5.f.k(value, lVar.b())).D(lVar, c0922c, B10, e10);
    }

    @Override // D5.AbstractC0776b
    public D5.w r(AbstractC0921b abstractC0921b) {
        boolean z10;
        InterfaceC4943j interfaceC4943j = (InterfaceC4943j) a(abstractC0921b, InterfaceC4943j.class);
        if (interfaceC4943j != null) {
            String value = interfaceC4943j.value();
            if (!value.isEmpty()) {
                return D5.w.a(value);
            }
            z10 = true;
        } else {
            z10 = false;
        }
        v5.u uVar = (v5.u) a(abstractC0921b, v5.u.class);
        if (uVar != null) {
            String namespace = uVar.namespace();
            return D5.w.b(uVar.value(), (namespace == null || !namespace.isEmpty()) ? namespace : null);
        }
        if (z10 || c(abstractC0921b, f5455c)) {
            return D5.w.f1295d;
        }
        return null;
    }

    @Override // D5.AbstractC0776b
    public Object s(C0922c c0922c) {
        E5.d dVar = (E5.d) a(c0922c, E5.d.class);
        if (dVar == null) {
            return null;
        }
        return dVar.value();
    }

    @Override // D5.AbstractC0776b
    public Object t(AbstractC0921b abstractC0921b) {
        Class nullsUsing;
        E5.e eVar = (E5.e) a(abstractC0921b, E5.e.class);
        if (eVar == null || (nullsUsing = eVar.nullsUsing()) == o.a.class) {
            return null;
        }
        return nullsUsing;
    }

    protected D5.w t0(AbstractC0921b abstractC0921b) {
        if (!(abstractC0921b instanceof m)) {
            return null;
        }
        ((m) abstractC0921b).p();
        return null;
    }

    @Override // D5.AbstractC0776b
    public B u(AbstractC0921b abstractC0921b) {
        InterfaceC4944k interfaceC4944k = (InterfaceC4944k) a(abstractC0921b, InterfaceC4944k.class);
        if (interfaceC4944k == null || interfaceC4944k.generator() == K.class) {
            return null;
        }
        return new B(D5.w.a(interfaceC4944k.property()), interfaceC4944k.scope(), interfaceC4944k.generator(), interfaceC4944k.resolver());
    }

    @Override // D5.AbstractC0776b
    public B v(AbstractC0921b abstractC0921b, B b10) {
        InterfaceC4945l interfaceC4945l = (InterfaceC4945l) a(abstractC0921b, InterfaceC4945l.class);
        if (interfaceC4945l == null) {
            return b10;
        }
        if (b10 == null) {
            b10 = B.a();
        }
        return b10.f(interfaceC4945l.alwaysAsId());
    }

    protected M5.f v0(F5.l lVar, AbstractC0921b abstractC0921b, D5.j jVar) {
        M5.f o02;
        v5.C c10 = (v5.C) a(abstractC0921b, v5.C.class);
        E5.g gVar = (E5.g) a(abstractC0921b, E5.g.class);
        if (gVar != null) {
            if (c10 == null) {
                return null;
            }
            o02 = lVar.G(abstractC0921b, gVar.value());
        } else {
            if (c10 == null) {
                return null;
            }
            if (c10.use() == C.b.NONE) {
                return n0();
            }
            o02 = o0();
        }
        E5.f fVar = (E5.f) a(abstractC0921b, E5.f.class);
        M5.e F10 = fVar != null ? lVar.F(abstractC0921b, fVar.value()) : null;
        if (F10 != null) {
            F10.a(jVar);
        }
        M5.f a10 = o02.a(c10.use(), F10);
        C.a include = c10.include();
        if (include == C.a.EXTERNAL_PROPERTY && (abstractC0921b instanceof C0922c)) {
            include = C.a.PROPERTY;
        }
        M5.f e10 = a10.b(include).e(c10.property());
        Class defaultImpl = c10.defaultImpl();
        if (defaultImpl != C.c.class && !defaultImpl.isAnnotation()) {
            e10 = e10.f(defaultImpl);
        }
        return e10.c(c10.visible());
    }

    @Override // D5.AbstractC0776b
    public u.a w(AbstractC0921b abstractC0921b) {
        v5.u uVar = (v5.u) a(abstractC0921b, v5.u.class);
        if (uVar != null) {
            return uVar.access();
        }
        return null;
    }

    protected boolean w0(AbstractC0921b abstractC0921b) {
        InterfaceC4946m interfaceC4946m = (InterfaceC4946m) a(abstractC0921b, InterfaceC4946m.class);
        if (interfaceC4946m != null) {
            return interfaceC4946m.value();
        }
        return false;
    }

    @Override // D5.AbstractC0776b
    public M5.f x(F5.l lVar, AbstractC0928i abstractC0928i, D5.j jVar) {
        if (jVar.k() != null) {
            return v0(lVar, abstractC0928i, jVar);
        }
        throw new IllegalArgumentException("Must call method with a container or reference type (got " + jVar + ")");
    }

    @Override // D5.AbstractC0776b
    public String y(AbstractC0921b abstractC0921b) {
        v5.u uVar = (v5.u) a(abstractC0921b, v5.u.class);
        if (uVar == null) {
            return null;
        }
        String defaultValue = uVar.defaultValue();
        if (defaultValue.isEmpty()) {
            return null;
        }
        return defaultValue;
    }

    protected D5.w y0(String str, String str2) {
        return str.isEmpty() ? D5.w.f1295d : (str2 == null || str2.isEmpty()) ? D5.w.a(str) : D5.w.b(str, str2);
    }

    @Override // D5.AbstractC0776b
    public String z(AbstractC0921b abstractC0921b) {
        v5.v vVar = (v5.v) a(abstractC0921b, v5.v.class);
        if (vVar == null) {
            return null;
        }
        return vVar.value();
    }
}
