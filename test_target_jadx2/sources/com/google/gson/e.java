package com.google.gson;

import com.google.gson.reflect.TypeToken;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: A, reason: collision with root package name */
    static final com.google.gson.d f28455A = com.google.gson.d.f28450d;

    /* renamed from: B, reason: collision with root package name */
    static final String f28456B = null;

    /* renamed from: C, reason: collision with root package name */
    static final com.google.gson.c f28457C = com.google.gson.b.IDENTITY;

    /* renamed from: D, reason: collision with root package name */
    static final t f28458D = s.DOUBLE;

    /* renamed from: E, reason: collision with root package name */
    static final t f28459E = s.LAZILY_PARSED_NUMBER;

    /* renamed from: z, reason: collision with root package name */
    static final r f28460z = null;

    /* renamed from: a, reason: collision with root package name */
    private final ThreadLocal f28461a;

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f28462b;

    /* renamed from: c, reason: collision with root package name */
    private final P8.c f28463c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.gson.internal.bind.d f28464d;

    /* renamed from: e, reason: collision with root package name */
    final List f28465e;

    /* renamed from: f, reason: collision with root package name */
    final P8.d f28466f;

    /* renamed from: g, reason: collision with root package name */
    final com.google.gson.c f28467g;

    /* renamed from: h, reason: collision with root package name */
    final Map f28468h;

    /* renamed from: i, reason: collision with root package name */
    final boolean f28469i;

    /* renamed from: j, reason: collision with root package name */
    final boolean f28470j;

    /* renamed from: k, reason: collision with root package name */
    final boolean f28471k;

    /* renamed from: l, reason: collision with root package name */
    final boolean f28472l;

    /* renamed from: m, reason: collision with root package name */
    final com.google.gson.d f28473m;

    /* renamed from: n, reason: collision with root package name */
    final r f28474n;

    /* renamed from: o, reason: collision with root package name */
    final boolean f28475o;

    /* renamed from: p, reason: collision with root package name */
    final boolean f28476p;

    /* renamed from: q, reason: collision with root package name */
    final String f28477q;

    /* renamed from: r, reason: collision with root package name */
    final int f28478r;

    /* renamed from: s, reason: collision with root package name */
    final int f28479s;

    /* renamed from: t, reason: collision with root package name */
    final p f28480t;

    /* renamed from: u, reason: collision with root package name */
    final List f28481u;

    /* renamed from: v, reason: collision with root package name */
    final List f28482v;

    /* renamed from: w, reason: collision with root package name */
    final t f28483w;

    /* renamed from: x, reason: collision with root package name */
    final t f28484x;

    /* renamed from: y, reason: collision with root package name */
    final List f28485y;

    class a extends u {
        a() {
        }

        @Override // com.google.gson.u
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Double b(S8.a aVar) {
            if (aVar.N() != S8.b.NULL) {
                return Double.valueOf(aVar.u());
            }
            aVar.F();
            return null;
        }

        @Override // com.google.gson.u
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(S8.c cVar, Number number) {
            if (number == null) {
                cVar.r();
                return;
            }
            double doubleValue = number.doubleValue();
            e.d(doubleValue);
            cVar.I(doubleValue);
        }
    }

    class b extends u {
        b() {
        }

        @Override // com.google.gson.u
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Float b(S8.a aVar) {
            if (aVar.N() != S8.b.NULL) {
                return Float.valueOf((float) aVar.u());
            }
            aVar.F();
            return null;
        }

        @Override // com.google.gson.u
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(S8.c cVar, Number number) {
            if (number == null) {
                cVar.r();
                return;
            }
            float floatValue = number.floatValue();
            e.d(floatValue);
            if (!(number instanceof Float)) {
                number = Float.valueOf(floatValue);
            }
            cVar.Q(number);
        }
    }

    class c extends u {
        c() {
        }

        @Override // com.google.gson.u
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(S8.a aVar) {
            if (aVar.N() != S8.b.NULL) {
                return Long.valueOf(aVar.y());
            }
            aVar.F();
            return null;
        }

        @Override // com.google.gson.u
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(S8.c cVar, Number number) {
            if (number == null) {
                cVar.r();
            } else {
                cVar.i0(number.toString());
            }
        }
    }

    class d extends u {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ u f28488a;

        d(u uVar) {
            this.f28488a = uVar;
        }

        @Override // com.google.gson.u
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicLong b(S8.a aVar) {
            return new AtomicLong(((Number) this.f28488a.b(aVar)).longValue());
        }

        @Override // com.google.gson.u
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(S8.c cVar, AtomicLong atomicLong) {
            this.f28488a.d(cVar, Long.valueOf(atomicLong.get()));
        }
    }

    /* renamed from: com.google.gson.e$e, reason: collision with other inner class name */
    class C0418e extends u {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ u f28489a;

        C0418e(u uVar) {
            this.f28489a = uVar;
        }

        @Override // com.google.gson.u
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicLongArray b(S8.a aVar) {
            ArrayList arrayList = new ArrayList();
            aVar.b();
            while (aVar.p()) {
                arrayList.add(Long.valueOf(((Number) this.f28489a.b(aVar)).longValue()));
            }
            aVar.g();
            int size = arrayList.size();
            AtomicLongArray atomicLongArray = new AtomicLongArray(size);
            for (int i10 = 0; i10 < size; i10++) {
                atomicLongArray.set(i10, ((Long) arrayList.get(i10)).longValue());
            }
            return atomicLongArray;
        }

        @Override // com.google.gson.u
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(S8.c cVar, AtomicLongArray atomicLongArray) {
            cVar.c();
            int length = atomicLongArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                this.f28489a.d(cVar, Long.valueOf(atomicLongArray.get(i10)));
            }
            cVar.f();
        }
    }

    static class f extends com.google.gson.internal.bind.j {

        /* renamed from: a, reason: collision with root package name */
        private u f28490a = null;

        f() {
        }

        private u f() {
            u uVar = this.f28490a;
            if (uVar != null) {
                return uVar;
            }
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }

        @Override // com.google.gson.u
        public Object b(S8.a aVar) {
            return f().b(aVar);
        }

        @Override // com.google.gson.u
        public void d(S8.c cVar, Object obj) {
            f().d(cVar, obj);
        }

        @Override // com.google.gson.internal.bind.j
        public u e() {
            return f();
        }

        public void g(u uVar) {
            if (this.f28490a != null) {
                throw new AssertionError("Delegate is already set");
            }
            this.f28490a = uVar;
        }
    }

    public e() {
        this(P8.d.f7576g, f28457C, Collections.emptyMap(), false, false, false, true, f28455A, f28460z, false, true, p.DEFAULT, f28456B, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), f28458D, f28459E, Collections.emptyList());
    }

    private static void a(Object obj, S8.a aVar) {
        if (obj != null) {
            try {
                if (aVar.N() == S8.b.END_DOCUMENT) {
                } else {
                    throw new o("JSON document was not fully consumed.");
                }
            } catch (S8.d e10) {
                throw new o(e10);
            } catch (IOException e11) {
                throw new i(e11);
            }
        }
    }

    private static u b(u uVar) {
        return new d(uVar).a();
    }

    private static u c(u uVar) {
        return new C0418e(uVar).a();
    }

    static void d(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10)) {
            throw new IllegalArgumentException(d10 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    private u e(boolean z10) {
        return z10 ? com.google.gson.internal.bind.l.f28620v : new a();
    }

    private u f(boolean z10) {
        return z10 ? com.google.gson.internal.bind.l.f28619u : new b();
    }

    private static u p(p pVar) {
        return pVar == p.DEFAULT ? com.google.gson.internal.bind.l.f28618t : new c();
    }

    public Object g(S8.a aVar, TypeToken typeToken) {
        boolean z10;
        r o10 = aVar.o();
        r rVar = this.f28474n;
        if (rVar != null) {
            aVar.z0(rVar);
        } else if (aVar.o() == r.LEGACY_STRICT) {
            aVar.z0(r.LENIENT);
        }
        try {
            try {
                try {
                    try {
                        aVar.N();
                        z10 = false;
                        try {
                            return m(typeToken).b(aVar);
                        } catch (EOFException e10) {
                            e = e10;
                            if (!z10) {
                                throw new o(e);
                            }
                            aVar.z0(o10);
                            return null;
                        }
                    } finally {
                        aVar.z0(o10);
                    }
                } catch (EOFException e11) {
                    e = e11;
                    z10 = true;
                }
            } catch (IOException e12) {
                throw new o(e12);
            }
        } catch (AssertionError e13) {
            throw new AssertionError("AssertionError (GSON 2.11.0): " + e13.getMessage(), e13);
        } catch (IllegalStateException e14) {
            throw new o(e14);
        }
    }

    public Object h(Reader reader, TypeToken typeToken) {
        S8.a q10 = q(reader);
        Object g10 = g(q10, typeToken);
        a(g10, q10);
        return g10;
    }

    public Object i(Reader reader, Class cls) {
        return P8.l.b(cls).cast(h(reader, TypeToken.get(cls)));
    }

    public Object j(String str, TypeToken typeToken) {
        if (str == null) {
            return null;
        }
        return h(new StringReader(str), typeToken);
    }

    public Object k(String str, Class cls) {
        return P8.l.b(cls).cast(j(str, TypeToken.get(cls)));
    }

    public Object l(String str, Type type) {
        return j(str, TypeToken.get(type));
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
    
        r2.g(r4);
        r0.put(r7, r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public u m(TypeToken typeToken) {
        boolean z10;
        Objects.requireNonNull(typeToken, "type must not be null");
        u uVar = (u) this.f28462b.get(typeToken);
        if (uVar != null) {
            return uVar;
        }
        Map map = (Map) this.f28461a.get();
        if (map == null) {
            map = new HashMap();
            this.f28461a.set(map);
            z10 = true;
        } else {
            u uVar2 = (u) map.get(typeToken);
            if (uVar2 != null) {
                return uVar2;
            }
            z10 = false;
        }
        try {
            f fVar = new f();
            map.put(typeToken, fVar);
            Iterator it = this.f28465e.iterator();
            u uVar3 = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                uVar3 = ((v) it.next()).a(this, typeToken);
                if (uVar3 != null) {
                    break;
                }
            }
            if (uVar3 != null) {
                if (z10) {
                    this.f28462b.putAll(map);
                }
                return uVar3;
            }
            throw new IllegalArgumentException("GSON (2.11.0) cannot handle " + typeToken);
        } finally {
            if (z10) {
                this.f28461a.remove();
            }
        }
    }

    public u n(Class cls) {
        return m(TypeToken.get(cls));
    }

    public u o(v vVar, TypeToken typeToken) {
        Objects.requireNonNull(vVar, "skipPast must not be null");
        Objects.requireNonNull(typeToken, "type must not be null");
        if (this.f28464d.e(typeToken, vVar)) {
            vVar = this.f28464d;
        }
        boolean z10 = false;
        for (v vVar2 : this.f28465e) {
            if (z10) {
                u a10 = vVar2.a(this, typeToken);
                if (a10 != null) {
                    return a10;
                }
            } else if (vVar2 == vVar) {
                z10 = true;
            }
        }
        if (!z10) {
            return m(typeToken);
        }
        throw new IllegalArgumentException("GSON cannot serialize or deserialize " + typeToken);
    }

    public S8.a q(Reader reader) {
        S8.a aVar = new S8.a(reader);
        r rVar = this.f28474n;
        if (rVar == null) {
            rVar = r.LEGACY_STRICT;
        }
        aVar.z0(rVar);
        return aVar;
    }

    public S8.c r(Writer writer) {
        if (this.f28471k) {
            writer.write(")]}'\n");
        }
        S8.c cVar = new S8.c(writer);
        cVar.y(this.f28473m);
        cVar.z(this.f28472l);
        r rVar = this.f28474n;
        if (rVar == null) {
            rVar = r.LEGACY_STRICT;
        }
        cVar.F(rVar);
        cVar.C(this.f28469i);
        return cVar;
    }

    public String s(h hVar) {
        StringWriter stringWriter = new StringWriter();
        w(hVar, stringWriter);
        return stringWriter.toString();
    }

    public String t(Object obj) {
        return obj == null ? s(j.f28655a) : u(obj, obj.getClass());
    }

    public String toString() {
        return "{serializeNulls:" + this.f28469i + ",factories:" + this.f28465e + ",instanceCreators:" + this.f28463c + "}";
    }

    public String u(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        z(obj, type, stringWriter);
        return stringWriter.toString();
    }

    public void v(h hVar, S8.c cVar) {
        r j10 = cVar.j();
        boolean l10 = cVar.l();
        boolean i10 = cVar.i();
        cVar.z(this.f28472l);
        cVar.C(this.f28469i);
        r rVar = this.f28474n;
        if (rVar != null) {
            cVar.F(rVar);
        } else if (cVar.j() == r.LEGACY_STRICT) {
            cVar.F(r.LENIENT);
        }
        try {
            try {
                P8.n.b(hVar, cVar);
            } catch (IOException e10) {
                throw new i(e10);
            } catch (AssertionError e11) {
                throw new AssertionError("AssertionError (GSON 2.11.0): " + e11.getMessage(), e11);
            }
        } finally {
            cVar.F(j10);
            cVar.z(l10);
            cVar.C(i10);
        }
    }

    public void w(h hVar, Appendable appendable) {
        try {
            v(hVar, r(P8.n.c(appendable)));
        } catch (IOException e10) {
            throw new i(e10);
        }
    }

    public void x(Object obj, Appendable appendable) {
        if (obj != null) {
            z(obj, obj.getClass(), appendable);
        } else {
            w(j.f28655a, appendable);
        }
    }

    public void y(Object obj, Type type, S8.c cVar) {
        u m10 = m(TypeToken.get(type));
        r j10 = cVar.j();
        r rVar = this.f28474n;
        if (rVar != null) {
            cVar.F(rVar);
        } else if (cVar.j() == r.LEGACY_STRICT) {
            cVar.F(r.LENIENT);
        }
        boolean l10 = cVar.l();
        boolean i10 = cVar.i();
        cVar.z(this.f28472l);
        cVar.C(this.f28469i);
        try {
            try {
                try {
                    m10.d(cVar, obj);
                } catch (AssertionError e10) {
                    throw new AssertionError("AssertionError (GSON 2.11.0): " + e10.getMessage(), e10);
                }
            } catch (IOException e11) {
                throw new i(e11);
            }
        } finally {
            cVar.F(j10);
            cVar.z(l10);
            cVar.C(i10);
        }
    }

    public void z(Object obj, Type type, Appendable appendable) {
        try {
            y(obj, type, r(P8.n.c(appendable)));
        } catch (IOException e10) {
            throw new i(e10);
        }
    }

    e(P8.d dVar, com.google.gson.c cVar, Map map, boolean z10, boolean z11, boolean z12, boolean z13, com.google.gson.d dVar2, r rVar, boolean z14, boolean z15, p pVar, String str, int i10, int i11, List list, List list2, List list3, t tVar, t tVar2, List list4) {
        this.f28461a = new ThreadLocal();
        this.f28462b = new ConcurrentHashMap();
        this.f28466f = dVar;
        this.f28467g = cVar;
        this.f28468h = map;
        P8.c cVar2 = new P8.c(map, z15, list4);
        this.f28463c = cVar2;
        this.f28469i = z10;
        this.f28470j = z11;
        this.f28471k = z12;
        this.f28472l = z13;
        this.f28473m = dVar2;
        this.f28474n = rVar;
        this.f28475o = z14;
        this.f28476p = z15;
        this.f28480t = pVar;
        this.f28477q = str;
        this.f28478r = i10;
        this.f28479s = i11;
        this.f28481u = list;
        this.f28482v = list2;
        this.f28483w = tVar;
        this.f28484x = tVar2;
        this.f28485y = list4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(com.google.gson.internal.bind.l.f28597W);
        arrayList.add(com.google.gson.internal.bind.h.e(tVar));
        arrayList.add(dVar);
        arrayList.addAll(list3);
        arrayList.add(com.google.gson.internal.bind.l.f28577C);
        arrayList.add(com.google.gson.internal.bind.l.f28611m);
        arrayList.add(com.google.gson.internal.bind.l.f28605g);
        arrayList.add(com.google.gson.internal.bind.l.f28607i);
        arrayList.add(com.google.gson.internal.bind.l.f28609k);
        u p10 = p(pVar);
        arrayList.add(com.google.gson.internal.bind.l.b(Long.TYPE, Long.class, p10));
        arrayList.add(com.google.gson.internal.bind.l.b(Double.TYPE, Double.class, e(z14)));
        arrayList.add(com.google.gson.internal.bind.l.b(Float.TYPE, Float.class, f(z14)));
        arrayList.add(com.google.gson.internal.bind.g.e(tVar2));
        arrayList.add(com.google.gson.internal.bind.l.f28613o);
        arrayList.add(com.google.gson.internal.bind.l.f28615q);
        arrayList.add(com.google.gson.internal.bind.l.a(AtomicLong.class, b(p10)));
        arrayList.add(com.google.gson.internal.bind.l.a(AtomicLongArray.class, c(p10)));
        arrayList.add(com.google.gson.internal.bind.l.f28617s);
        arrayList.add(com.google.gson.internal.bind.l.f28622x);
        arrayList.add(com.google.gson.internal.bind.l.f28579E);
        arrayList.add(com.google.gson.internal.bind.l.f28581G);
        arrayList.add(com.google.gson.internal.bind.l.a(BigDecimal.class, com.google.gson.internal.bind.l.f28624z));
        arrayList.add(com.google.gson.internal.bind.l.a(BigInteger.class, com.google.gson.internal.bind.l.f28575A));
        arrayList.add(com.google.gson.internal.bind.l.a(P8.g.class, com.google.gson.internal.bind.l.f28576B));
        arrayList.add(com.google.gson.internal.bind.l.f28583I);
        arrayList.add(com.google.gson.internal.bind.l.f28585K);
        arrayList.add(com.google.gson.internal.bind.l.f28589O);
        arrayList.add(com.google.gson.internal.bind.l.f28591Q);
        arrayList.add(com.google.gson.internal.bind.l.f28595U);
        arrayList.add(com.google.gson.internal.bind.l.f28587M);
        arrayList.add(com.google.gson.internal.bind.l.f28602d);
        arrayList.add(com.google.gson.internal.bind.c.f28518c);
        arrayList.add(com.google.gson.internal.bind.l.f28593S);
        if (com.google.gson.internal.sql.d.f28649a) {
            arrayList.add(com.google.gson.internal.sql.d.f28653e);
            arrayList.add(com.google.gson.internal.sql.d.f28652d);
            arrayList.add(com.google.gson.internal.sql.d.f28654f);
        }
        arrayList.add(com.google.gson.internal.bind.a.f28512c);
        arrayList.add(com.google.gson.internal.bind.l.f28600b);
        arrayList.add(new com.google.gson.internal.bind.b(cVar2));
        arrayList.add(new com.google.gson.internal.bind.f(cVar2, z11));
        com.google.gson.internal.bind.d dVar3 = new com.google.gson.internal.bind.d(cVar2);
        this.f28464d = dVar3;
        arrayList.add(dVar3);
        arrayList.add(com.google.gson.internal.bind.l.f28598X);
        arrayList.add(new com.google.gson.internal.bind.i(cVar2, cVar, dVar, dVar3, list4));
        this.f28465e = Collections.unmodifiableList(arrayList);
    }
}
