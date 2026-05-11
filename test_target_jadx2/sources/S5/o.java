package S5;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicReference;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public class o implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    private static final D5.j[] f8789e = new D5.j[0];

    /* renamed from: f, reason: collision with root package name */
    protected static final o f8790f = new o();

    /* renamed from: g, reason: collision with root package name */
    protected static final n f8791g = n.h();

    /* renamed from: h, reason: collision with root package name */
    private static final Class f8792h = String.class;

    /* renamed from: i, reason: collision with root package name */
    private static final Class f8793i = Object.class;

    /* renamed from: j, reason: collision with root package name */
    private static final Class f8794j = Comparable.class;

    /* renamed from: k, reason: collision with root package name */
    private static final Class f8795k = Class.class;

    /* renamed from: l, reason: collision with root package name */
    private static final Class f8796l = Enum.class;

    /* renamed from: m, reason: collision with root package name */
    private static final Class f8797m = D5.m.class;

    /* renamed from: n, reason: collision with root package name */
    private static final Class f8798n;

    /* renamed from: o, reason: collision with root package name */
    private static final Class f8799o;

    /* renamed from: p, reason: collision with root package name */
    private static final Class f8800p;

    /* renamed from: q, reason: collision with root package name */
    protected static final l f8801q;

    /* renamed from: r, reason: collision with root package name */
    protected static final l f8802r;

    /* renamed from: s, reason: collision with root package name */
    protected static final l f8803s;

    /* renamed from: t, reason: collision with root package name */
    protected static final l f8804t;

    /* renamed from: u, reason: collision with root package name */
    protected static final l f8805u;

    /* renamed from: v, reason: collision with root package name */
    protected static final l f8806v;

    /* renamed from: w, reason: collision with root package name */
    protected static final l f8807w;

    /* renamed from: x, reason: collision with root package name */
    protected static final l f8808x;

    /* renamed from: y, reason: collision with root package name */
    protected static final l f8809y;

    /* renamed from: a, reason: collision with root package name */
    protected final T5.l f8810a;

    /* renamed from: b, reason: collision with root package name */
    protected final p[] f8811b;

    /* renamed from: c, reason: collision with root package name */
    protected final q f8812c;

    /* renamed from: d, reason: collision with root package name */
    protected final ClassLoader f8813d;

    static {
        Class cls = Boolean.TYPE;
        f8798n = cls;
        Class cls2 = Integer.TYPE;
        f8799o = cls2;
        Class cls3 = Long.TYPE;
        f8800p = cls3;
        f8801q = new l(cls);
        f8802r = new l(cls2);
        f8803s = new l(cls3);
        f8804t = new l(String.class);
        f8805u = new l(Object.class);
        f8806v = new l(Comparable.class);
        f8807w = new l(Enum.class);
        f8808x = new l(Class.class);
        f8809y = new l(D5.m.class);
    }

    private o() {
        this(null);
    }

    public static o D() {
        return f8790f;
    }

    public static D5.j H() {
        return D().t();
    }

    private n b(D5.j jVar, int i10, Class cls, boolean z10) {
        i[] iVarArr = new i[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iVarArr[i11] = new i(i11);
        }
        D5.j i12 = h(null, cls, n.d(cls, iVarArr)).i(jVar.q());
        if (i12 == null) {
            throw new IllegalArgumentException(String.format("Internal error: unable to locate supertype (%s) from resolved subtype %s", jVar.q().getName(), cls.getName()));
        }
        String s10 = s(jVar, i12);
        if (s10 == null || z10) {
            D5.j[] jVarArr = new D5.j[i10];
            for (int i13 = 0; i13 < i10; i13++) {
                D5.j X10 = iVarArr[i13].X();
                if (X10 == null) {
                    X10 = H();
                }
                jVarArr[i13] = X10;
            }
            return n.d(cls, jVarArr);
        }
        throw new IllegalArgumentException("Failed to specialize base type " + jVar.d() + " as " + cls.getName() + ", problem: " + s10);
    }

    private D5.j c(Class cls, n nVar, D5.j jVar, D5.j[] jVarArr) {
        D5.j jVar2;
        List k10 = nVar.k();
        if (k10.isEmpty()) {
            jVar2 = t();
        } else {
            if (k10.size() != 1) {
                throw new IllegalArgumentException("Strange Collection type " + cls.getName() + ": cannot determine type parameters");
            }
            jVar2 = (D5.j) k10.get(0);
        }
        return e.W(cls, nVar, jVar, jVarArr, jVar2);
    }

    private D5.j n(Class cls, n nVar, D5.j jVar, D5.j[] jVarArr) {
        D5.j t10;
        D5.j jVar2;
        D5.j jVar3;
        if (cls == Properties.class) {
            t10 = f8804t;
        } else {
            List k10 = nVar.k();
            int size = k10.size();
            if (size != 0) {
                if (size != 2) {
                    throw new IllegalArgumentException(String.format("Strange Map type %s with %d type parameter%s (%s), can not resolve", T5.f.Q(cls), Integer.valueOf(size), size == 1 ? BuildConfig.FLAVOR : "s", nVar));
                }
                D5.j jVar4 = (D5.j) k10.get(0);
                jVar2 = (D5.j) k10.get(1);
                jVar3 = jVar4;
                return h.X(cls, nVar, jVar, jVarArr, jVar3, jVar2);
            }
            t10 = t();
        }
        jVar3 = t10;
        jVar2 = jVar3;
        return h.X(cls, nVar, jVar, jVarArr, jVar3, jVar2);
    }

    private D5.j p(Class cls, n nVar, D5.j jVar, D5.j[] jVarArr) {
        D5.j jVar2;
        List k10 = nVar.k();
        if (k10.isEmpty()) {
            jVar2 = t();
        } else {
            if (k10.size() != 1) {
                throw new IllegalArgumentException("Strange Reference type " + cls.getName() + ": cannot determine type parameters");
            }
            jVar2 = (D5.j) k10.get(0);
        }
        return j.a0(cls, nVar, jVar, jVarArr, jVar2);
    }

    private String s(D5.j jVar, D5.j jVar2) {
        List k10 = jVar.j().k();
        List k11 = jVar2.j().k();
        int size = k11.size();
        int size2 = k10.size();
        int i10 = 0;
        while (i10 < size2) {
            D5.j jVar3 = (D5.j) k10.get(i10);
            D5.j H10 = i10 < size ? (D5.j) k11.get(i10) : H();
            if (!u(jVar3, H10) && !jVar3.x(Object.class) && ((i10 != 0 || !jVar.G() || !H10.x(Object.class)) && (!jVar3.E() || !jVar3.K(H10.q())))) {
                return String.format("Type parameter #%d/%d differs; can not specialize %s with %s", Integer.valueOf(i10 + 1), Integer.valueOf(size2), jVar3.d(), H10.d());
            }
            i10++;
        }
        return null;
    }

    private boolean u(D5.j jVar, D5.j jVar2) {
        if (jVar2 instanceof i) {
            ((i) jVar2).Y(jVar);
            return true;
        }
        if (jVar.q() != jVar2.q()) {
            return false;
        }
        List k10 = jVar.j().k();
        List k11 = jVar2.j().k();
        int size = k10.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!u((D5.j) k10.get(i10), (D5.j) k11.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public D5.j A(D5.j jVar, Class cls) {
        return B(jVar, cls, false);
    }

    public D5.j B(D5.j jVar, Class cls, boolean z10) {
        D5.j h10;
        Class q10 = jVar.q();
        if (q10 == cls) {
            return jVar;
        }
        if (q10 == Object.class) {
            h10 = h(null, cls, f8791g);
        } else {
            if (!q10.isAssignableFrom(cls)) {
                throw new IllegalArgumentException(String.format("Class %s not subtype of %s", T5.f.Q(cls), T5.f.C(jVar)));
            }
            if (jVar.A()) {
                if (jVar.G()) {
                    if (cls == HashMap.class || cls == LinkedHashMap.class || cls == EnumMap.class || cls == TreeMap.class) {
                        h10 = h(null, cls, n.c(cls, jVar.p(), jVar.k()));
                    }
                } else if (jVar.z()) {
                    if (cls == ArrayList.class || cls == LinkedList.class || cls == HashSet.class || cls == TreeSet.class) {
                        h10 = h(null, cls, n.b(cls, jVar.k()));
                    } else if (q10 == EnumSet.class) {
                        return jVar;
                    }
                }
            }
            if (jVar.j().m()) {
                h10 = h(null, cls, f8791g);
            } else {
                int length = cls.getTypeParameters().length;
                h10 = length == 0 ? h(null, cls, f8791g) : h(null, cls, b(jVar, length, cls, z10));
            }
        }
        return h10.P(jVar);
    }

    public D5.j C(Type type) {
        return f(null, type, f8791g);
    }

    public D5.j[] E(D5.j jVar, Class cls) {
        D5.j i10 = jVar.i(cls);
        return i10 == null ? f8789e : i10.j().o();
    }

    public D5.j F(Type type, n nVar) {
        return f(null, type, nVar);
    }

    public D5.j G(Class cls) {
        return d(cls, f8791g, null, null);
    }

    protected D5.j a(Type type, D5.j jVar) {
        if (this.f8811b == null) {
            return jVar;
        }
        jVar.j();
        p[] pVarArr = this.f8811b;
        if (pVarArr.length <= 0) {
            return jVar;
        }
        p pVar = pVarArr[0];
        throw null;
    }

    protected D5.j d(Class cls, n nVar, D5.j jVar, D5.j[] jVarArr) {
        D5.j e10;
        return (!nVar.m() || (e10 = e(cls)) == null) ? o(cls, nVar, jVar, jVarArr) : e10;
    }

    protected D5.j e(Class cls) {
        if (cls.isPrimitive()) {
            if (cls == f8798n) {
                return f8801q;
            }
            if (cls == f8799o) {
                return f8802r;
            }
            if (cls == f8800p) {
                return f8803s;
            }
            return null;
        }
        if (cls == f8792h) {
            return f8804t;
        }
        if (cls == f8793i) {
            return f8805u;
        }
        if (cls == f8797m) {
            return f8809y;
        }
        return null;
    }

    protected D5.j f(c cVar, Type type, n nVar) {
        D5.j m10;
        if (type instanceof Class) {
            m10 = h(cVar, (Class) type, f8791g);
        } else if (type instanceof ParameterizedType) {
            m10 = i(cVar, (ParameterizedType) type, nVar);
        } else {
            if (type instanceof D5.j) {
                return (D5.j) type;
            }
            if (type instanceof GenericArrayType) {
                m10 = g(cVar, (GenericArrayType) type, nVar);
            } else if (type instanceof TypeVariable) {
                m10 = j(cVar, (TypeVariable) type, nVar);
            } else {
                if (!(type instanceof WildcardType)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Unrecognized Type: ");
                    sb2.append(type == null ? "[null]" : type.toString());
                    throw new IllegalArgumentException(sb2.toString());
                }
                m10 = m(cVar, (WildcardType) type, nVar);
            }
        }
        return a(type, m10);
    }

    protected D5.j g(c cVar, GenericArrayType genericArrayType, n nVar) {
        return a.W(f(cVar, genericArrayType.getGenericComponentType(), nVar), nVar);
    }

    protected D5.j h(c cVar, Class cls, n nVar) {
        c b10;
        D5.j q10;
        D5.j[] r10;
        D5.j o10;
        D5.j e10 = e(cls);
        if (e10 != null) {
            return e10;
        }
        Object a10 = (nVar == null || nVar.m()) ? cls : nVar.a(cls);
        D5.j jVar = (D5.j) this.f8810a.get(a10);
        if (jVar != null) {
            return jVar;
        }
        if (cVar == null) {
            b10 = new c(cls);
        } else {
            c c10 = cVar.c(cls);
            if (c10 != null) {
                k kVar = new k(cls, f8791g);
                c10.a(kVar);
                return kVar;
            }
            b10 = cVar.b(cls);
        }
        if (cls.isArray()) {
            o10 = a.W(f(b10, cls.getComponentType(), nVar), nVar);
        } else {
            if (cls.isInterface()) {
                r10 = r(b10, cls, nVar);
                q10 = null;
            } else {
                q10 = q(b10, cls, nVar);
                r10 = r(b10, cls, nVar);
            }
            D5.j[] jVarArr = r10;
            D5.j jVar2 = q10;
            if (cls == Properties.class) {
                l lVar = f8804t;
                jVar = h.X(cls, nVar, jVar2, jVarArr, lVar, lVar);
            } else if (jVar2 != null) {
                jVar = jVar2.L(cls, nVar, jVar2, jVarArr);
            }
            o10 = (jVar == null && (jVar = k(b10, cls, nVar, jVar2, jVarArr)) == null && (jVar = l(b10, cls, nVar, jVar2, jVarArr)) == null) ? o(cls, nVar, jVar2, jVarArr) : jVar;
        }
        b10.d(o10);
        if (!o10.w()) {
            this.f8810a.putIfAbsent(a10, o10);
        }
        return o10;
    }

    protected D5.j i(c cVar, ParameterizedType parameterizedType, n nVar) {
        n d10;
        Class cls = (Class) parameterizedType.getRawType();
        if (cls == f8796l) {
            return f8807w;
        }
        if (cls == f8794j) {
            return f8806v;
        }
        if (cls == f8795k) {
            return f8808x;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        int length = actualTypeArguments == null ? 0 : actualTypeArguments.length;
        if (length == 0) {
            d10 = f8791g;
        } else {
            D5.j[] jVarArr = new D5.j[length];
            for (int i10 = 0; i10 < length; i10++) {
                jVarArr[i10] = f(cVar, actualTypeArguments[i10], nVar);
            }
            d10 = n.d(cls, jVarArr);
        }
        return h(cVar, cls, d10);
    }

    protected D5.j j(c cVar, TypeVariable typeVariable, n nVar) {
        Type[] bounds;
        String name = typeVariable.getName();
        if (nVar == null) {
            throw new IllegalArgumentException("Null `bindings` passed (type variable \"" + name + "\")");
        }
        D5.j i10 = nVar.i(name);
        if (i10 != null) {
            return i10;
        }
        if (nVar.l(name)) {
            return f8805u;
        }
        n p10 = nVar.p(name);
        synchronized (typeVariable) {
            bounds = typeVariable.getBounds();
        }
        return f(cVar, bounds[0], p10);
    }

    protected D5.j k(c cVar, Class cls, n nVar, D5.j jVar, D5.j[] jVarArr) {
        if (nVar == null) {
            nVar = f8791g;
        }
        if (cls == Map.class) {
            return n(cls, nVar, jVar, jVarArr);
        }
        if (cls == Collection.class) {
            return c(cls, nVar, jVar, jVarArr);
        }
        if (cls == AtomicReference.class) {
            return p(cls, nVar, jVar, jVarArr);
        }
        return null;
    }

    protected D5.j l(c cVar, Class cls, n nVar, D5.j jVar, D5.j[] jVarArr) {
        for (D5.j jVar2 : jVarArr) {
            D5.j L10 = jVar2.L(cls, nVar, jVar, jVarArr);
            if (L10 != null) {
                return L10;
            }
        }
        return null;
    }

    protected D5.j m(c cVar, WildcardType wildcardType, n nVar) {
        return f(cVar, wildcardType.getUpperBounds()[0], nVar);
    }

    protected D5.j o(Class cls, n nVar, D5.j jVar, D5.j[] jVarArr) {
        return new l(cls, nVar, jVar, jVarArr);
    }

    protected D5.j q(c cVar, Class cls, n nVar) {
        Type z10 = T5.f.z(cls);
        if (z10 == null) {
            return null;
        }
        return f(cVar, z10, nVar);
    }

    protected D5.j[] r(c cVar, Class cls, n nVar) {
        Type[] y10 = T5.f.y(cls);
        if (y10 == null || y10.length == 0) {
            return f8789e;
        }
        int length = y10.length;
        D5.j[] jVarArr = new D5.j[length];
        for (int i10 = 0; i10 < length; i10++) {
            jVarArr[i10] = f(cVar, y10[i10], nVar);
        }
        return jVarArr;
    }

    protected D5.j t() {
        return f8805u;
    }

    public e v(Class cls, D5.j jVar) {
        n f10 = n.f(cls, jVar);
        e eVar = (e) h(null, cls, f10);
        if (f10.m() && jVar != null) {
            D5.j k10 = eVar.i(Collection.class).k();
            if (!k10.equals(jVar)) {
                throw new IllegalArgumentException(String.format("Non-generic Collection class %s did not resolve to something with element type %s but %s ", T5.f.Q(cls), jVar, k10));
            }
        }
        return eVar;
    }

    public e w(Class cls, Class cls2) {
        return v(cls, h(null, cls2, f8791g));
    }

    public D5.j x(D5.j jVar, Class cls) {
        Class q10 = jVar.q();
        if (q10 == cls) {
            return jVar;
        }
        D5.j i10 = jVar.i(cls);
        if (i10 != null) {
            return i10;
        }
        if (cls.isAssignableFrom(q10)) {
            throw new IllegalArgumentException(String.format("Internal error: class %s not included as super-type for %s", cls.getName(), jVar));
        }
        throw new IllegalArgumentException(String.format("Class %s not a super-type of %s", cls.getName(), jVar));
    }

    public h y(Class cls, D5.j jVar, D5.j jVar2) {
        n g10 = n.g(cls, new D5.j[]{jVar, jVar2});
        h hVar = (h) h(null, cls, g10);
        if (g10.m()) {
            D5.j i10 = hVar.i(Map.class);
            D5.j p10 = i10.p();
            if (!p10.equals(jVar)) {
                throw new IllegalArgumentException(String.format("Non-generic Map class %s did not resolve to something with key type %s but %s ", T5.f.Q(cls), jVar, p10));
            }
            D5.j k10 = i10.k();
            if (!k10.equals(jVar2)) {
                throw new IllegalArgumentException(String.format("Non-generic Map class %s did not resolve to something with value type %s but %s ", T5.f.Q(cls), jVar2, k10));
            }
        }
        return hVar;
    }

    public h z(Class cls, Class cls2, Class cls3) {
        D5.j h10;
        D5.j h11;
        if (cls == Properties.class) {
            h10 = f8804t;
            h11 = h10;
        } else {
            n nVar = f8791g;
            h10 = h(null, cls2, nVar);
            h11 = h(null, cls3, nVar);
        }
        return y(cls, h10, h11);
    }

    protected o(T5.l lVar) {
        this.f8810a = lVar == null ? new T5.k(16, 200) : lVar;
        this.f8812c = new q(this);
        this.f8811b = null;
        this.f8813d = null;
    }
}
