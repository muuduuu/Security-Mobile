package R5;

import D5.AbstractC0776b;
import K5.AbstractC0928i;
import Q5.k;
import T5.j;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import org.conscrypt.BuildConfig;
import v5.InterfaceC4942i;
import v5.p;

/* loaded from: classes2.dex */
public class t extends P5.h implements P5.i {

    /* renamed from: r, reason: collision with root package name */
    protected static final D5.j f8516r = S5.o.H();

    /* renamed from: s, reason: collision with root package name */
    public static final Object f8517s = p.a.NON_EMPTY;

    /* renamed from: c, reason: collision with root package name */
    protected final D5.d f8518c;

    /* renamed from: d, reason: collision with root package name */
    protected final boolean f8519d;

    /* renamed from: e, reason: collision with root package name */
    protected final D5.j f8520e;

    /* renamed from: f, reason: collision with root package name */
    protected final D5.j f8521f;

    /* renamed from: g, reason: collision with root package name */
    protected D5.o f8522g;

    /* renamed from: h, reason: collision with root package name */
    protected D5.o f8523h;

    /* renamed from: i, reason: collision with root package name */
    protected final M5.g f8524i;

    /* renamed from: j, reason: collision with root package name */
    protected Q5.k f8525j;

    /* renamed from: k, reason: collision with root package name */
    protected final Set f8526k;

    /* renamed from: l, reason: collision with root package name */
    protected final Set f8527l;

    /* renamed from: m, reason: collision with root package name */
    protected final Object f8528m;

    /* renamed from: n, reason: collision with root package name */
    protected final Object f8529n;

    /* renamed from: o, reason: collision with root package name */
    protected final boolean f8530o;

    /* renamed from: p, reason: collision with root package name */
    protected final j.a f8531p;

    /* renamed from: q, reason: collision with root package name */
    protected final boolean f8532q;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8533a;

        static {
            int[] iArr = new int[p.a.values().length];
            f8533a = iArr;
            try {
                iArr[p.a.NON_DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8533a[p.a.NON_ABSENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8533a[p.a.NON_EMPTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8533a[p.a.CUSTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8533a[p.a.NON_NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8533a[p.a.ALWAYS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    protected t(Set set, Set set2, D5.j jVar, D5.j jVar2, boolean z10, M5.g gVar, D5.o oVar, D5.o oVar2) {
        super(Map.class, false);
        set = (set == null || set.isEmpty()) ? null : set;
        this.f8526k = set;
        this.f8527l = set2;
        this.f8520e = jVar;
        this.f8521f = jVar2;
        this.f8519d = z10;
        this.f8524i = gVar;
        this.f8522g = oVar;
        this.f8523h = oVar2;
        this.f8525j = Q5.k.c();
        this.f8518c = null;
        this.f8528m = null;
        this.f8532q = false;
        this.f8529n = null;
        this.f8530o = false;
        this.f8531p = T5.j.a(set, set2);
    }

    private final D5.o A(D5.B b10, Object obj) {
        Class<?> cls = obj.getClass();
        D5.o j10 = this.f8525j.j(cls);
        return j10 != null ? j10 : this.f8521f.v() ? y(this.f8525j, b10.r(this.f8521f, cls), b10) : z(this.f8525j, cls, b10);
    }

    public static t F(Set set, D5.j jVar, boolean z10, M5.g gVar, D5.o oVar, D5.o oVar2, Object obj) {
        return G(set, null, jVar, z10, gVar, oVar, oVar2, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static t G(Set set, Set set2, D5.j jVar, boolean z10, M5.g gVar, D5.o oVar, D5.o oVar2, Object obj) {
        D5.j H10;
        D5.j jVar2;
        boolean z11;
        if (jVar == null) {
            jVar2 = f8516r;
            H10 = jVar2;
        } else {
            D5.j p10 = jVar.p();
            H10 = jVar.x(Properties.class) ? S5.o.H() : jVar.k();
            jVar2 = p10;
        }
        boolean z12 = false;
        if (z10) {
            if (H10.q() != Object.class) {
                z11 = z10;
                t tVar = new t(set, set2, jVar2, H10, z11, gVar, oVar, oVar2);
                return obj == null ? tVar.R(obj) : tVar;
            }
        } else if (H10 != null && H10.D()) {
            z12 = true;
        }
        z11 = z12;
        t tVar2 = new t(set, set2, jVar2, H10, z11, gVar, oVar, oVar2);
        if (obj == null) {
        }
    }

    protected boolean B(Map map) {
        return (map instanceof HashMap) && map.containsKey(null);
    }

    protected Map C(Map map, com.fasterxml.jackson.core.f fVar, D5.B b10) {
        if (map instanceof SortedMap) {
            return map;
        }
        if (!B(map)) {
            return new TreeMap(map);
        }
        TreeMap treeMap = new TreeMap();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            if (key == null) {
                E(fVar, b10, entry.getValue());
            } else {
                treeMap.put(key, entry.getValue());
            }
        }
        return treeMap;
    }

    @Override // P5.h
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public t v(M5.g gVar) {
        if (this.f8524i == gVar) {
            return this;
        }
        x("_withValueTypeSerializer");
        return new t(this, gVar, this.f8529n, this.f8530o);
    }

    protected void E(com.fasterxml.jackson.core.f fVar, D5.B b10, Object obj) {
        D5.o oVar;
        D5.o A10 = b10.A(this.f8520e, this.f8518c);
        if (obj != null) {
            oVar = this.f8523h;
            if (oVar == null) {
                oVar = A(b10, obj);
            }
            Object obj2 = this.f8529n;
            if (obj2 == f8517s) {
                if (oVar.d(b10, obj)) {
                    return;
                }
            } else if (obj2 != null && obj2.equals(obj)) {
                return;
            }
        } else if (this.f8530o) {
            return;
        } else {
            oVar = b10.M();
        }
        try {
            A10.f(null, fVar, b10);
            oVar.f(obj, fVar, b10);
        } catch (Exception e10) {
            u(b10, e10, obj, BuildConfig.FLAVOR);
        }
    }

    public D5.j H() {
        return this.f8521f;
    }

    @Override // D5.o
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public boolean d(D5.B b10, Map map) {
        D5.o A10;
        if (map.isEmpty()) {
            return true;
        }
        Object obj = this.f8529n;
        if (obj == null && !this.f8530o) {
            return false;
        }
        D5.o oVar = this.f8523h;
        boolean z10 = f8517s == obj;
        if (oVar != null) {
            for (Object obj2 : map.values()) {
                if (obj2 == null) {
                    if (!this.f8530o) {
                        return false;
                    }
                } else if (z10) {
                    if (!oVar.d(b10, obj2)) {
                        return false;
                    }
                } else if (obj == null || !obj.equals(map)) {
                    return false;
                }
            }
            return true;
        }
        for (Object obj3 : map.values()) {
            if (obj3 != null) {
                try {
                    A10 = A(b10, obj3);
                } catch (D5.f unused) {
                }
                if (!z10) {
                    if (obj != null && obj.equals(map)) {
                    }
                    return false;
                }
                if (!A10.d(b10, obj3)) {
                    return false;
                }
            } else if (!this.f8530o) {
                return false;
            }
        }
        return true;
    }

    @Override // R5.H, D5.o
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public void f(Map map, com.fasterxml.jackson.core.f fVar, D5.B b10) {
        fVar.e2(map);
        P(map, fVar, b10);
        fVar.N();
    }

    public void K(Map map, com.fasterxml.jackson.core.f fVar, D5.B b10) {
        Object obj = null;
        if (this.f8524i != null) {
            N(map, fVar, b10, null);
            return;
        }
        D5.o oVar = this.f8522g;
        try {
            Object obj2 = null;
            for (Map.Entry entry : map.entrySet()) {
                try {
                    Object value = entry.getValue();
                    obj2 = entry.getKey();
                    if (obj2 == null) {
                        b10.A(this.f8520e, this.f8518c).f(null, fVar, b10);
                    } else {
                        j.a aVar = this.f8531p;
                        if (aVar == null || !aVar.b(obj2)) {
                            oVar.f(obj2, fVar, b10);
                        }
                    }
                    if (value == null) {
                        b10.v(fVar);
                    } else {
                        D5.o oVar2 = this.f8523h;
                        if (oVar2 == null) {
                            oVar2 = A(b10, value);
                        }
                        oVar2.f(value, fVar, b10);
                    }
                } catch (Exception e10) {
                    e = e10;
                    obj = obj2;
                    u(b10, e, map, String.valueOf(obj));
                    return;
                }
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    public void L(Map map, com.fasterxml.jackson.core.f fVar, D5.B b10, D5.o oVar) {
        D5.o oVar2 = this.f8522g;
        M5.g gVar = this.f8524i;
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            j.a aVar = this.f8531p;
            if (aVar == null || !aVar.b(key)) {
                if (key == null) {
                    b10.A(this.f8520e, this.f8518c).f(null, fVar, b10);
                } else {
                    oVar2.f(key, fVar, b10);
                }
                Object value = entry.getValue();
                if (value == null) {
                    b10.v(fVar);
                } else if (gVar == null) {
                    try {
                        oVar.f(value, fVar, b10);
                    } catch (Exception e10) {
                        u(b10, e10, map, String.valueOf(key));
                    }
                } else {
                    oVar.g(value, fVar, b10, gVar);
                }
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:12|(2:52|53)(2:14|(1:19)(2:50|32))|20|(3:44|45|(2:49|32)(2:47|48))(4:22|23|(1:25)|(3:40|41|(2:43|32))(2:27|(2:31|32)))|33|34|36|32|10) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0070, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0071, code lost:
    
        u(r10, r2, r8, java.lang.String.valueOf(r3));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void M(Map map, com.fasterxml.jackson.core.f fVar, D5.B b10, Object obj) {
        D5.o A10;
        D5.o M10;
        if (this.f8524i != null) {
            N(map, fVar, b10, obj);
            return;
        }
        boolean z10 = f8517s == obj;
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            if (key == null) {
                A10 = b10.A(this.f8520e, this.f8518c);
            } else {
                j.a aVar = this.f8531p;
                if (aVar == null || !aVar.b(key)) {
                    A10 = this.f8522g;
                }
            }
            Object value = entry.getValue();
            if (value != null) {
                M10 = this.f8523h;
                if (M10 == null) {
                    M10 = A(b10, value);
                }
                if (z10) {
                    if (M10.d(b10, value)) {
                    }
                } else if (obj != null && obj.equals(value)) {
                }
            } else if (!this.f8530o) {
                M10 = b10.M();
            }
            A10.f(key, fVar, b10);
            M10.f(value, fVar, b10);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:7|(2:51|52)(2:9|(1:14)(2:49|32))|15|(3:43|44|(2:48|32)(2:46|47))(4:17|18|(1:20)|(3:38|39|(2:42|32)(1:41))(2:22|(2:36|32)))|27|28|29|31|32|5) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006a, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006b, code lost:
    
        u(r10, r2, r8, java.lang.String.valueOf(r3));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void N(Map map, com.fasterxml.jackson.core.f fVar, D5.B b10, Object obj) {
        D5.o A10;
        D5.o M10;
        boolean z10 = f8517s == obj;
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            if (key == null) {
                A10 = b10.A(this.f8520e, this.f8518c);
            } else {
                j.a aVar = this.f8531p;
                if (aVar == null || !aVar.b(key)) {
                    A10 = this.f8522g;
                }
            }
            Object value = entry.getValue();
            if (value != null) {
                M10 = this.f8523h;
                if (M10 == null) {
                    M10 = A(b10, value);
                }
                if (z10) {
                    if (M10.d(b10, value)) {
                    }
                } else if (obj != null && obj.equals(value)) {
                }
            } else if (!this.f8530o) {
                M10 = b10.M();
            }
            A10.f(key, fVar, b10);
            M10.g(value, fVar, b10, this.f8524i);
        }
    }

    @Override // D5.o
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public void g(Map map, com.fasterxml.jackson.core.f fVar, D5.B b10, M5.g gVar) {
        fVar.q(map);
        B5.b g10 = gVar.g(fVar, gVar.d(map, com.fasterxml.jackson.core.k.START_OBJECT));
        P(map, fVar, b10);
        gVar.h(fVar, g10);
    }

    public void P(Map map, com.fasterxml.jackson.core.f fVar, D5.B b10) {
        if (map.isEmpty()) {
            return;
        }
        if (this.f8532q || b10.Z(D5.A.ORDER_MAP_ENTRIES_BY_KEYS)) {
            map = C(map, fVar, b10);
        }
        Object obj = this.f8528m;
        if (obj != null) {
            r(b10, obj, map);
        }
        Object obj2 = this.f8529n;
        if (obj2 != null || this.f8530o) {
            M(map, fVar, b10, obj2);
            return;
        }
        D5.o oVar = this.f8523h;
        if (oVar != null) {
            L(map, fVar, b10, oVar);
        } else {
            K(map, fVar, b10);
        }
    }

    public t Q(Object obj, boolean z10) {
        if (obj == this.f8529n && z10 == this.f8530o) {
            return this;
        }
        x("withContentInclusion");
        return new t(this, this.f8524i, obj, z10);
    }

    public t R(Object obj) {
        if (this.f8528m == obj) {
            return this;
        }
        x("withFilterId");
        return new t(this, obj, this.f8532q);
    }

    public t S(D5.d dVar, D5.o oVar, D5.o oVar2, Set set, Set set2, boolean z10) {
        x("withResolved");
        t tVar = new t(this, dVar, oVar, oVar2, set, set2);
        return z10 != tVar.f8532q ? new t(tVar, this.f8528m, z10) : tVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0125, code lost:
    
        if (r0 != 5) goto L95;
     */
    @Override // P5.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public D5.o a(D5.B b10, D5.d dVar) {
        D5.o oVar;
        D5.o oVar2;
        Set set;
        Set set2;
        boolean z10;
        p.a f10;
        Object j10;
        Boolean e10;
        AbstractC0776b J10 = b10.J();
        Object obj = null;
        AbstractC0928i a10 = dVar == null ? null : dVar.a();
        if (H.j(a10, J10)) {
            Object o10 = J10.o(a10);
            oVar = o10 != null ? b10.g0(a10, o10) : null;
            Object f11 = J10.f(a10);
            oVar2 = f11 != null ? b10.g0(a10, f11) : null;
        } else {
            oVar = null;
            oVar2 = null;
        }
        if (oVar2 == null) {
            oVar2 = this.f8523h;
        }
        D5.o m10 = m(b10, dVar, oVar2);
        if (m10 == null && this.f8519d && !this.f8521f.F()) {
            m10 = b10.w(this.f8521f, dVar);
        }
        D5.o oVar3 = m10;
        if (oVar == null) {
            oVar = this.f8522g;
        }
        D5.o y10 = oVar == null ? b10.y(this.f8520e, dVar) : b10.V(oVar, dVar);
        Set set3 = this.f8526k;
        Set set4 = this.f8527l;
        boolean z11 = false;
        if (H.j(a10, J10)) {
            D5.z f12 = b10.f();
            Set g10 = J10.A(f12, a10).g();
            if (H.k(g10)) {
                set3 = set3 == null ? new HashSet() : new HashSet(set3);
                Iterator it = g10.iterator();
                while (it.hasNext()) {
                    set3.add((String) it.next());
                }
            }
            Set e11 = J10.D(f12, a10).e();
            if (e11 != null) {
                set4 = set4 == null ? new HashSet() : new HashSet(set4);
                Iterator it2 = e11.iterator();
                while (it2.hasNext()) {
                    set4.add((String) it2.next());
                }
            }
            z10 = Boolean.TRUE.equals(J10.M(a10));
            set = set3;
            set2 = set4;
        } else {
            set = set3;
            set2 = set4;
            z10 = false;
        }
        InterfaceC4942i.d p10 = p(b10, dVar, Map.class);
        t S10 = S(dVar, y10, oVar3, set, set2, (p10 == null || (e10 = p10.e(InterfaceC4942i.a.WRITE_SORTED_MAP_ENTRIES)) == null) ? z10 : e10.booleanValue());
        if (a10 != null && (j10 = J10.j(a10)) != null) {
            S10 = S10.R(j10);
        }
        p.b q10 = q(b10, dVar, Map.class);
        if (q10 == null || (f10 = q10.f()) == p.a.USE_DEFAULTS) {
            return S10;
        }
        int i10 = a.f8533a[f10.ordinal()];
        if (i10 == 1) {
            obj = T5.d.b(this.f8521f);
            if (obj != null && obj.getClass().isArray()) {
                obj = T5.b.a(obj);
            }
        } else if (i10 != 2) {
            if (i10 == 3) {
                obj = f8517s;
            } else if (i10 == 4) {
                obj = b10.W(null, q10.e());
                if (obj != null) {
                    z11 = b10.X(obj);
                    return S10.Q(obj, z11);
                }
            }
        } else if (this.f8521f.b()) {
            obj = f8517s;
        }
        z11 = true;
        return S10.Q(obj, z11);
    }

    protected void x(String str) {
        T5.f.Y(t.class, this, str);
    }

    protected final D5.o y(Q5.k kVar, D5.j jVar, D5.B b10) {
        k.d g10 = kVar.g(jVar, b10, this.f8518c);
        Q5.k kVar2 = g10.f8208b;
        if (kVar != kVar2) {
            this.f8525j = kVar2;
        }
        return g10.f8207a;
    }

    protected final D5.o z(Q5.k kVar, Class cls, D5.B b10) {
        k.d h10 = kVar.h(cls, b10, this.f8518c);
        Q5.k kVar2 = h10.f8208b;
        if (kVar != kVar2) {
            this.f8525j = kVar2;
        }
        return h10.f8207a;
    }

    protected t(t tVar, D5.d dVar, D5.o oVar, D5.o oVar2, Set set, Set set2) {
        super(Map.class, false);
        set = (set == null || set.isEmpty()) ? null : set;
        this.f8526k = set;
        this.f8527l = set2;
        this.f8520e = tVar.f8520e;
        this.f8521f = tVar.f8521f;
        this.f8519d = tVar.f8519d;
        this.f8524i = tVar.f8524i;
        this.f8522g = oVar;
        this.f8523h = oVar2;
        this.f8525j = Q5.k.c();
        this.f8518c = dVar;
        this.f8528m = tVar.f8528m;
        this.f8532q = tVar.f8532q;
        this.f8529n = tVar.f8529n;
        this.f8530o = tVar.f8530o;
        this.f8531p = T5.j.a(set, set2);
    }

    protected t(t tVar, M5.g gVar, Object obj, boolean z10) {
        super(Map.class, false);
        this.f8526k = tVar.f8526k;
        this.f8527l = tVar.f8527l;
        this.f8520e = tVar.f8520e;
        this.f8521f = tVar.f8521f;
        this.f8519d = tVar.f8519d;
        this.f8524i = gVar;
        this.f8522g = tVar.f8522g;
        this.f8523h = tVar.f8523h;
        this.f8525j = tVar.f8525j;
        this.f8518c = tVar.f8518c;
        this.f8528m = tVar.f8528m;
        this.f8532q = tVar.f8532q;
        this.f8529n = obj;
        this.f8530o = z10;
        this.f8531p = tVar.f8531p;
    }

    protected t(t tVar, Object obj, boolean z10) {
        super(Map.class, false);
        this.f8526k = tVar.f8526k;
        this.f8527l = tVar.f8527l;
        this.f8520e = tVar.f8520e;
        this.f8521f = tVar.f8521f;
        this.f8519d = tVar.f8519d;
        this.f8524i = tVar.f8524i;
        this.f8522g = tVar.f8522g;
        this.f8523h = tVar.f8523h;
        this.f8525j = Q5.k.c();
        this.f8518c = tVar.f8518c;
        this.f8528m = obj;
        this.f8532q = z10;
        this.f8529n = tVar.f8529n;
        this.f8530o = tVar.f8530o;
        this.f8531p = tVar.f8531p;
    }
}
