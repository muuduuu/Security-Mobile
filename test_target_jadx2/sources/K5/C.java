package K5;

import D5.AbstractC0776b;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.conscrypt.BuildConfig;
import v5.InterfaceC4935b;
import v5.InterfaceC4940g;

/* loaded from: classes2.dex */
public class C {

    /* renamed from: a, reason: collision with root package name */
    protected final F5.l f5294a;

    /* renamed from: b, reason: collision with root package name */
    protected final AbstractC0920a f5295b;

    /* renamed from: c, reason: collision with root package name */
    protected final boolean f5296c;

    /* renamed from: d, reason: collision with root package name */
    protected final D5.j f5297d;

    /* renamed from: e, reason: collision with root package name */
    protected final C0922c f5298e;

    /* renamed from: f, reason: collision with root package name */
    protected final I f5299f;

    /* renamed from: g, reason: collision with root package name */
    protected final AbstractC0776b f5300g;

    /* renamed from: h, reason: collision with root package name */
    protected final boolean f5301h;

    /* renamed from: i, reason: collision with root package name */
    protected boolean f5302i;

    /* renamed from: j, reason: collision with root package name */
    protected LinkedHashMap f5303j;

    /* renamed from: k, reason: collision with root package name */
    protected LinkedList f5304k;

    /* renamed from: l, reason: collision with root package name */
    protected Map f5305l;

    /* renamed from: m, reason: collision with root package name */
    protected LinkedList f5306m;

    /* renamed from: n, reason: collision with root package name */
    protected LinkedList f5307n;

    /* renamed from: o, reason: collision with root package name */
    protected LinkedList f5308o;

    /* renamed from: p, reason: collision with root package name */
    protected LinkedList f5309p;

    /* renamed from: q, reason: collision with root package name */
    protected LinkedList f5310q;

    /* renamed from: r, reason: collision with root package name */
    protected LinkedList f5311r;

    /* renamed from: s, reason: collision with root package name */
    protected HashSet f5312s;

    /* renamed from: t, reason: collision with root package name */
    protected LinkedHashMap f5313t;

    /* renamed from: u, reason: collision with root package name */
    protected final boolean f5314u;

    /* renamed from: v, reason: collision with root package name */
    protected String f5315v = "set";

    protected C(F5.l lVar, boolean z10, D5.j jVar, C0922c c0922c, AbstractC0920a abstractC0920a) {
        this.f5294a = lVar;
        this.f5296c = z10;
        this.f5297d = jVar;
        this.f5298e = c0922c;
        if (lVar.C()) {
            this.f5301h = true;
            this.f5300g = lVar.g();
        } else {
            this.f5301h = false;
            this.f5300g = AbstractC0776b.i0();
        }
        this.f5299f = lVar.t(jVar.q(), c0922c);
        this.f5295b = abstractC0920a;
        this.f5314u = lVar.D(D5.q.USE_STD_BEAN_NAMING);
    }

    private boolean h(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((E) it.next()).s().c()) {
                return true;
            }
        }
        return false;
    }

    private String i(String str) {
        D5.w wVar;
        Map map = this.f5305l;
        return (map == null || (wVar = (D5.w) map.get(m(str))) == null) ? str : wVar.c();
    }

    private D5.x l() {
        Object s10 = this.f5300g.s(this.f5298e);
        if (s10 == null) {
            this.f5294a.x();
            return null;
        }
        if (!(s10 instanceof Class)) {
            throw new IllegalStateException("AnnotationIntrospector returned PropertyNamingStrategy definition of type " + s10.getClass().getName() + "; expected type PropertyNamingStrategy or Class<PropertyNamingStrategy> instead");
        }
        Class cls = (Class) s10;
        if (cls == D5.x.class) {
            return null;
        }
        if (D5.x.class.isAssignableFrom(cls)) {
            this.f5294a.u();
            android.support.v4.media.session.b.a(T5.f.k(cls, this.f5294a.b()));
            return null;
        }
        throw new IllegalStateException("AnnotationIntrospector returned Class " + cls.getName() + "; expected Class<PropertyNamingStrategy>");
    }

    private D5.w m(String str) {
        return D5.w.b(str, null);
    }

    public AbstractC0928i A() {
        if (!this.f5302i) {
            v();
        }
        LinkedList linkedList = this.f5310q;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1) {
            G("Multiple 'as-key' properties defined (%s vs %s)", this.f5310q.get(0), this.f5310q.get(1));
        }
        return (AbstractC0928i) this.f5310q.get(0);
    }

    public AbstractC0928i B() {
        if (!this.f5302i) {
            v();
        }
        LinkedList linkedList = this.f5311r;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1) {
            G("Multiple 'as-value' properties defined (%s vs %s)", this.f5311r.get(0), this.f5311r.get(1));
        }
        return (AbstractC0928i) this.f5311r.get(0);
    }

    public B C() {
        B u10 = this.f5300g.u(this.f5298e);
        return u10 != null ? this.f5300g.v(this.f5298e, u10) : u10;
    }

    public List D() {
        return new ArrayList(E().values());
    }

    protected Map E() {
        if (!this.f5302i) {
            v();
        }
        return this.f5303j;
    }

    public D5.j F() {
        return this.f5297d;
    }

    protected void G(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        throw new IllegalArgumentException("Problem with definition of " + this.f5298e + ": " + str);
    }

    protected void a(Map map, m mVar) {
        InterfaceC4940g.a g10;
        String l10 = this.f5300g.l(mVar);
        if (l10 == null) {
            l10 = BuildConfig.FLAVOR;
        }
        D5.w q10 = this.f5300g.q(mVar);
        boolean z10 = (q10 == null || q10.g()) ? false : true;
        if (!z10) {
            if (l10.isEmpty() || (g10 = this.f5300g.g(this.f5294a, mVar.p())) == null || g10 == InterfaceC4940g.a.DISABLED) {
                return;
            } else {
                q10 = D5.w.a(l10);
            }
        }
        D5.w wVar = q10;
        String i10 = i(l10);
        E n10 = (z10 && i10.isEmpty()) ? n(map, wVar) : o(map, i10);
        n10.U(mVar, wVar, z10, true, false);
        this.f5304k.add(n10);
    }

    protected void b(Map map) {
        if (this.f5301h) {
            Iterator it = this.f5298e.n().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C0924e c0924e = (C0924e) it.next();
                if (this.f5304k == null) {
                    this.f5304k = new LinkedList();
                }
                int t10 = c0924e.t();
                for (int i10 = 0; i10 < t10; i10++) {
                    a(map, c0924e.o(i10));
                }
            }
            for (j jVar : this.f5298e.p()) {
                if (this.f5304k == null) {
                    this.f5304k = new LinkedList();
                }
                int u10 = jVar.u();
                for (int i11 = 0; i11 < u10; i11++) {
                    a(map, jVar.o(i11));
                }
            }
        }
    }

    protected void c(Map map) {
        D5.w wVar;
        boolean z10;
        boolean z11;
        boolean z12;
        AbstractC0776b abstractC0776b = this.f5300g;
        boolean z13 = (this.f5296c || this.f5294a.D(D5.q.ALLOW_FINAL_FIELDS_AS_MUTATORS)) ? false : true;
        boolean D10 = this.f5294a.D(D5.q.PROPAGATE_TRANSIENT_MARKER);
        for (C0926g c0926g : this.f5298e.k()) {
            Boolean bool = Boolean.TRUE;
            if (bool.equals(abstractC0776b.Z(this.f5294a, c0926g))) {
                if (this.f5310q == null) {
                    this.f5310q = new LinkedList();
                }
                this.f5310q.add(c0926g);
            }
            if (bool.equals(abstractC0776b.a0(c0926g))) {
                if (this.f5311r == null) {
                    this.f5311r = new LinkedList();
                }
                this.f5311r.add(c0926g);
            } else {
                boolean equals = bool.equals(abstractC0776b.W(c0926g));
                boolean equals2 = bool.equals(abstractC0776b.Y(c0926g));
                if (equals || equals2) {
                    if (equals) {
                        if (this.f5307n == null) {
                            this.f5307n = new LinkedList();
                        }
                        this.f5307n.add(c0926g);
                    }
                    if (equals2) {
                        if (this.f5309p == null) {
                            this.f5309p = new LinkedList();
                        }
                        this.f5309p.add(c0926g);
                    }
                } else {
                    String l10 = abstractC0776b.l(c0926g);
                    if (l10 == null) {
                        l10 = c0926g.c();
                    }
                    String d10 = this.f5295b.d(c0926g, l10);
                    if (d10 != null) {
                        D5.w m10 = m(d10);
                        D5.w H10 = abstractC0776b.H(this.f5294a, c0926g, m10);
                        if (H10 != null && !H10.equals(m10)) {
                            if (this.f5305l == null) {
                                this.f5305l = new HashMap();
                            }
                            this.f5305l.put(H10, m10);
                        }
                        D5.w r10 = this.f5296c ? abstractC0776b.r(c0926g) : abstractC0776b.q(c0926g);
                        boolean z14 = r10 != null;
                        if (z14 && r10.g()) {
                            z10 = false;
                            wVar = m(d10);
                        } else {
                            wVar = r10;
                            z10 = z14;
                        }
                        boolean z15 = wVar != null;
                        if (!z15) {
                            z15 = this.f5299f.b(c0926g);
                        }
                        boolean d02 = abstractC0776b.d0(c0926g);
                        if (!c0926g.q() || z14) {
                            z11 = d02;
                            z12 = z15;
                        } else {
                            z11 = D10 ? true : d02;
                            z12 = false;
                        }
                        if (!z13 || wVar != null || z11 || !Modifier.isFinal(c0926g.p())) {
                            o(map, d10).V(c0926g, wVar, z10, z12, z11);
                        }
                    }
                }
            }
        }
    }

    protected void d(Map map, j jVar, AbstractC0776b abstractC0776b) {
        D5.w wVar;
        boolean z10;
        boolean z11;
        String str;
        boolean k10;
        Class x10 = jVar.x();
        if (x10 != Void.TYPE) {
            if (x10 != Void.class || this.f5294a.D(D5.q.ALLOW_VOID_VALUED_PROPERTIES)) {
                Boolean bool = Boolean.TRUE;
                if (bool.equals(abstractC0776b.W(jVar))) {
                    if (this.f5306m == null) {
                        this.f5306m = new LinkedList();
                    }
                    this.f5306m.add(jVar);
                    return;
                }
                if (bool.equals(abstractC0776b.Z(this.f5294a, jVar))) {
                    if (this.f5310q == null) {
                        this.f5310q = new LinkedList();
                    }
                    this.f5310q.add(jVar);
                    return;
                }
                if (bool.equals(abstractC0776b.a0(jVar))) {
                    if (this.f5311r == null) {
                        this.f5311r = new LinkedList();
                    }
                    this.f5311r.add(jVar);
                    return;
                }
                D5.w r10 = abstractC0776b.r(jVar);
                boolean z12 = false;
                boolean z13 = r10 != null;
                if (z13) {
                    String l10 = abstractC0776b.l(jVar);
                    if (l10 == null && (l10 = this.f5295b.c(jVar, jVar.c())) == null) {
                        l10 = this.f5295b.a(jVar, jVar.c());
                    }
                    if (l10 == null) {
                        l10 = jVar.c();
                    }
                    if (r10.g()) {
                        r10 = m(l10);
                    } else {
                        z12 = z13;
                    }
                    wVar = r10;
                    z10 = z12;
                    z11 = true;
                    str = l10;
                } else {
                    str = abstractC0776b.l(jVar);
                    if (str == null) {
                        str = this.f5295b.c(jVar, jVar.c());
                    }
                    if (str == null) {
                        str = this.f5295b.a(jVar, jVar.c());
                        if (str == null) {
                            return;
                        } else {
                            k10 = this.f5299f.h(jVar);
                        }
                    } else {
                        k10 = this.f5299f.k(jVar);
                    }
                    wVar = r10;
                    z11 = k10;
                    z10 = z13;
                }
                o(map, i(str)).W(jVar, wVar, z10, z11, abstractC0776b.d0(jVar));
            }
        }
    }

    protected void e(Map map) {
        for (AbstractC0928i abstractC0928i : this.f5298e.k()) {
            k(this.f5300g.m(abstractC0928i), abstractC0928i);
        }
        for (j jVar : this.f5298e.s()) {
            if (jVar.u() == 1) {
                k(this.f5300g.m(jVar), jVar);
            }
        }
    }

    protected void f(Map map) {
        for (j jVar : this.f5298e.s()) {
            int u10 = jVar.u();
            if (u10 == 0) {
                d(map, jVar, this.f5300g);
            } else if (u10 == 1) {
                g(map, jVar, this.f5300g);
            } else if (u10 == 2 && Boolean.TRUE.equals(this.f5300g.Y(jVar))) {
                if (this.f5308o == null) {
                    this.f5308o = new LinkedList();
                }
                this.f5308o.add(jVar);
            }
        }
    }

    protected void g(Map map, j jVar, AbstractC0776b abstractC0776b) {
        D5.w wVar;
        boolean z10;
        boolean z11;
        String str;
        D5.w q10 = abstractC0776b.q(jVar);
        boolean z12 = false;
        boolean z13 = q10 != null;
        if (z13) {
            String l10 = abstractC0776b.l(jVar);
            if (l10 == null) {
                l10 = this.f5295b.b(jVar, jVar.c());
            }
            if (l10 == null) {
                l10 = jVar.c();
            }
            if (q10.g()) {
                q10 = m(l10);
            } else {
                z12 = z13;
            }
            wVar = q10;
            z10 = z12;
            z11 = true;
            str = l10;
        } else {
            str = abstractC0776b.l(jVar);
            if (str == null) {
                str = this.f5295b.b(jVar, jVar.c());
            }
            if (str == null) {
                return;
            }
            wVar = q10;
            z11 = this.f5299f.a(jVar);
            z10 = z13;
        }
        o(map, i(str)).X(jVar, wVar, z10, z11, abstractC0776b.d0(jVar));
    }

    protected void j(String str) {
        if (this.f5296c || str == null) {
            return;
        }
        if (this.f5312s == null) {
            this.f5312s = new HashSet();
        }
        this.f5312s.add(str);
    }

    protected void k(InterfaceC4935b.a aVar, AbstractC0928i abstractC0928i) {
        if (aVar == null) {
            return;
        }
        Object e10 = aVar.e();
        if (this.f5313t == null) {
            this.f5313t = new LinkedHashMap();
        }
        AbstractC0928i abstractC0928i2 = (AbstractC0928i) this.f5313t.put(e10, abstractC0928i);
        if (abstractC0928i2 == null || abstractC0928i2.getClass() != abstractC0928i.getClass()) {
            return;
        }
        throw new IllegalArgumentException("Duplicate injectable value with id '" + e10 + "' (of type " + e10.getClass().getName() + ")");
    }

    protected E n(Map map, D5.w wVar) {
        String c10 = wVar.c();
        E e10 = (E) map.get(c10);
        if (e10 != null) {
            return e10;
        }
        E e11 = new E(this.f5294a, this.f5300g, this.f5296c, wVar);
        map.put(c10, e11);
        return e11;
    }

    protected E o(Map map, String str) {
        E e10 = (E) map.get(str);
        if (e10 != null) {
            return e10;
        }
        E e11 = new E(this.f5294a, this.f5300g, this.f5296c, D5.w.a(str));
        map.put(str, e11);
        return e11;
    }

    protected void p(Map map) {
        boolean D10 = this.f5294a.D(D5.q.INFER_PROPERTY_MUTATORS);
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((E) it.next()).m0(D10, this.f5296c ? null : this);
        }
    }

    protected void q(Map map) {
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            E e10 = (E) it.next();
            if (!e10.Z()) {
                it.remove();
            } else if (e10.Y()) {
                if (e10.z()) {
                    e10.l0();
                    if (!e10.b()) {
                        j(e10.u());
                    }
                } else {
                    it.remove();
                    j(e10.u());
                }
            }
        }
    }

    protected void r(Map map) {
        HashSet hashSet;
        Iterator it = map.entrySet().iterator();
        LinkedList linkedList = null;
        while (it.hasNext()) {
            E e10 = (E) ((Map.Entry) it.next()).getValue();
            Set d02 = e10.d0();
            if (!d02.isEmpty()) {
                it.remove();
                if (linkedList == null) {
                    linkedList = new LinkedList();
                }
                if (d02.size() == 1) {
                    linkedList.add(e10.o0((D5.w) d02.iterator().next()));
                } else {
                    linkedList.addAll(e10.b0(d02));
                }
            }
        }
        if (linkedList != null) {
            Iterator it2 = linkedList.iterator();
            while (it2.hasNext()) {
                E e11 = (E) it2.next();
                String u10 = e11.u();
                E e12 = (E) map.get(u10);
                if (e12 == null) {
                    map.put(u10, e11);
                } else {
                    e12.T(e11);
                }
                if (t(e11, this.f5304k) && (hashSet = this.f5312s) != null) {
                    hashSet.remove(u10);
                }
            }
        }
    }

    protected void s(Map map) {
        D5.w V10;
        Iterator it = map.entrySet().iterator();
        LinkedList linkedList = null;
        while (it.hasNext()) {
            E e10 = (E) ((Map.Entry) it.next()).getValue();
            AbstractC0928i v10 = e10.v();
            if (v10 != null && (V10 = this.f5300g.V(v10)) != null && V10.e() && !V10.equals(e10.q())) {
                if (linkedList == null) {
                    linkedList = new LinkedList();
                }
                linkedList.add(e10.o0(V10));
                it.remove();
            }
        }
        if (linkedList != null) {
            Iterator it2 = linkedList.iterator();
            while (it2.hasNext()) {
                E e11 = (E) it2.next();
                String u10 = e11.u();
                E e12 = (E) map.get(u10);
                if (e12 == null) {
                    map.put(u10, e11);
                } else {
                    e12.T(e11);
                }
            }
        }
    }

    protected boolean t(E e10, List list) {
        if (list != null) {
            String g02 = e10.g0();
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((E) list.get(i10)).g0().equals(g02)) {
                    list.set(i10, e10);
                    return true;
                }
            }
        }
        return false;
    }

    protected void u(Map map) {
        Collection<E> collection;
        AbstractC0776b abstractC0776b = this.f5300g;
        Boolean M10 = abstractC0776b.M(this.f5298e);
        boolean E10 = M10 == null ? this.f5294a.E() : M10.booleanValue();
        boolean h10 = h(map.values());
        String[] L10 = abstractC0776b.L(this.f5298e);
        if (E10 || h10 || this.f5304k != null || L10 != null) {
            int size = map.size();
            Map treeMap = E10 ? new TreeMap() : new LinkedHashMap(size + size);
            for (E e10 : map.values()) {
                treeMap.put(e10.u(), e10);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(size + size);
            if (L10 != null) {
                for (String str : L10) {
                    E e11 = (E) treeMap.remove(str);
                    if (e11 == null) {
                        Iterator it = map.values().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            E e12 = (E) it.next();
                            if (str.equals(e12.g0())) {
                                str = e12.u();
                                e11 = e12;
                                break;
                            }
                        }
                    }
                    if (e11 != null) {
                        linkedHashMap.put(str, e11);
                    }
                }
            }
            if (h10) {
                TreeMap treeMap2 = new TreeMap();
                Iterator it2 = treeMap.entrySet().iterator();
                while (it2.hasNext()) {
                    E e13 = (E) ((Map.Entry) it2.next()).getValue();
                    Integer b10 = e13.s().b();
                    if (b10 != null) {
                        treeMap2.put(b10, e13);
                        it2.remove();
                    }
                }
                for (E e14 : treeMap2.values()) {
                    linkedHashMap.put(e14.u(), e14);
                }
            }
            if (this.f5304k != null && (!E10 || this.f5294a.D(D5.q.SORT_CREATOR_PROPERTIES_FIRST))) {
                if (E10) {
                    TreeMap treeMap3 = new TreeMap();
                    Iterator it3 = this.f5304k.iterator();
                    while (it3.hasNext()) {
                        E e15 = (E) it3.next();
                        treeMap3.put(e15.u(), e15);
                    }
                    collection = treeMap3.values();
                } else {
                    collection = this.f5304k;
                }
                for (E e16 : collection) {
                    String u10 = e16.u();
                    if (treeMap.containsKey(u10)) {
                        linkedHashMap.put(u10, e16);
                    }
                }
            }
            linkedHashMap.putAll(treeMap);
            map.clear();
            map.putAll(linkedHashMap);
        }
    }

    protected void v() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c(linkedHashMap);
        f(linkedHashMap);
        if (!this.f5298e.r()) {
            b(linkedHashMap);
        }
        q(linkedHashMap);
        p(linkedHashMap);
        r(linkedHashMap);
        e(linkedHashMap);
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((E) it.next()).k0(this.f5296c);
        }
        Iterator it2 = linkedHashMap.values().iterator();
        while (it2.hasNext()) {
            ((E) it2.next()).n0();
        }
        l();
        if (this.f5294a.D(D5.q.USE_WRAPPER_NAME_AS_PROPERTY_NAME)) {
            s(linkedHashMap);
        }
        u(linkedHashMap);
        this.f5303j = linkedHashMap;
        this.f5302i = true;
    }

    public AbstractC0928i w() {
        if (!this.f5302i) {
            v();
        }
        LinkedList linkedList = this.f5307n;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1) {
            G("Multiple 'any-getter' fields defined (%s vs %s)", this.f5307n.get(0), this.f5307n.get(1));
        }
        return (AbstractC0928i) this.f5307n.getFirst();
    }

    public AbstractC0928i x() {
        if (!this.f5302i) {
            v();
        }
        LinkedList linkedList = this.f5306m;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1) {
            G("Multiple 'any-getter' methods defined (%s vs %s)", this.f5306m.get(0), this.f5306m.get(1));
        }
        return (AbstractC0928i) this.f5306m.getFirst();
    }

    public C0922c y() {
        return this.f5298e;
    }

    public F5.l z() {
        return this.f5294a;
    }
}
