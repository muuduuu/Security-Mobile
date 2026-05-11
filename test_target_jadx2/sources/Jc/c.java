package Jc;

import Hc.j;
import Ic.f;
import id.C3367b;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.conscrypt.BuildConfig;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f4890a;

    /* renamed from: b, reason: collision with root package name */
    private static final String f4891b;

    /* renamed from: c, reason: collision with root package name */
    private static final String f4892c;

    /* renamed from: d, reason: collision with root package name */
    private static final String f4893d;

    /* renamed from: e, reason: collision with root package name */
    private static final String f4894e;

    /* renamed from: f, reason: collision with root package name */
    private static final C3367b f4895f;

    /* renamed from: g, reason: collision with root package name */
    private static final id.c f4896g;

    /* renamed from: h, reason: collision with root package name */
    private static final C3367b f4897h;

    /* renamed from: i, reason: collision with root package name */
    private static final C3367b f4898i;

    /* renamed from: j, reason: collision with root package name */
    private static final C3367b f4899j;

    /* renamed from: k, reason: collision with root package name */
    private static final HashMap f4900k;

    /* renamed from: l, reason: collision with root package name */
    private static final HashMap f4901l;

    /* renamed from: m, reason: collision with root package name */
    private static final HashMap f4902m;

    /* renamed from: n, reason: collision with root package name */
    private static final HashMap f4903n;

    /* renamed from: o, reason: collision with root package name */
    private static final HashMap f4904o;

    /* renamed from: p, reason: collision with root package name */
    private static final HashMap f4905p;

    /* renamed from: q, reason: collision with root package name */
    private static final List f4906q;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final C3367b f4907a;

        /* renamed from: b, reason: collision with root package name */
        private final C3367b f4908b;

        /* renamed from: c, reason: collision with root package name */
        private final C3367b f4909c;

        public a(C3367b javaClass, C3367b kotlinReadOnly, C3367b kotlinMutable) {
            Intrinsics.checkNotNullParameter(javaClass, "javaClass");
            Intrinsics.checkNotNullParameter(kotlinReadOnly, "kotlinReadOnly");
            Intrinsics.checkNotNullParameter(kotlinMutable, "kotlinMutable");
            this.f4907a = javaClass;
            this.f4908b = kotlinReadOnly;
            this.f4909c = kotlinMutable;
        }

        public final C3367b a() {
            return this.f4907a;
        }

        public final C3367b b() {
            return this.f4908b;
        }

        public final C3367b c() {
            return this.f4909c;
        }

        public final C3367b d() {
            return this.f4907a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.b(this.f4907a, aVar.f4907a) && Intrinsics.b(this.f4908b, aVar.f4908b) && Intrinsics.b(this.f4909c, aVar.f4909c);
        }

        public int hashCode() {
            return (((this.f4907a.hashCode() * 31) + this.f4908b.hashCode()) * 31) + this.f4909c.hashCode();
        }

        public String toString() {
            return "PlatformMutabilityMapping(javaClass=" + this.f4907a + ", kotlinReadOnly=" + this.f4908b + ", kotlinMutable=" + this.f4909c + ')';
        }
    }

    static {
        c cVar = new c();
        f4890a = cVar;
        StringBuilder sb2 = new StringBuilder();
        f.a aVar = f.a.f4418e;
        sb2.append(aVar.b().toString());
        sb2.append('.');
        sb2.append(aVar.a());
        f4891b = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        f.b bVar = f.b.f4419e;
        sb3.append(bVar.b().toString());
        sb3.append('.');
        sb3.append(bVar.a());
        f4892c = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        f.d dVar = f.d.f4421e;
        sb4.append(dVar.b().toString());
        sb4.append('.');
        sb4.append(dVar.a());
        f4893d = sb4.toString();
        StringBuilder sb5 = new StringBuilder();
        f.c cVar2 = f.c.f4420e;
        sb5.append(cVar2.b().toString());
        sb5.append('.');
        sb5.append(cVar2.a());
        f4894e = sb5.toString();
        C3367b m10 = C3367b.m(new id.c("kotlin.jvm.functions.FunctionN"));
        Intrinsics.checkNotNullExpressionValue(m10, "topLevel(...)");
        f4895f = m10;
        id.c b10 = m10.b();
        Intrinsics.checkNotNullExpressionValue(b10, "asSingleFqName(...)");
        f4896g = b10;
        id.i iVar = id.i.f34245a;
        f4897h = iVar.k();
        f4898i = iVar.j();
        f4899j = cVar.g(Class.class);
        f4900k = new HashMap();
        f4901l = new HashMap();
        f4902m = new HashMap();
        f4903n = new HashMap();
        f4904o = new HashMap();
        f4905p = new HashMap();
        C3367b m11 = C3367b.m(j.a.f3925U);
        Intrinsics.checkNotNullExpressionValue(m11, "topLevel(...)");
        id.c cVar3 = j.a.f3936c0;
        id.c h10 = m11.h();
        id.c h11 = m11.h();
        Intrinsics.checkNotNullExpressionValue(h11, "getPackageFqName(...)");
        a aVar2 = new a(cVar.g(Iterable.class), m11, new C3367b(h10, id.e.g(cVar3, h11), false));
        C3367b m12 = C3367b.m(j.a.f3924T);
        Intrinsics.checkNotNullExpressionValue(m12, "topLevel(...)");
        id.c cVar4 = j.a.f3934b0;
        id.c h12 = m12.h();
        id.c h13 = m12.h();
        Intrinsics.checkNotNullExpressionValue(h13, "getPackageFqName(...)");
        a aVar3 = new a(cVar.g(Iterator.class), m12, new C3367b(h12, id.e.g(cVar4, h13), false));
        C3367b m13 = C3367b.m(j.a.f3926V);
        Intrinsics.checkNotNullExpressionValue(m13, "topLevel(...)");
        id.c cVar5 = j.a.f3938d0;
        id.c h14 = m13.h();
        id.c h15 = m13.h();
        Intrinsics.checkNotNullExpressionValue(h15, "getPackageFqName(...)");
        a aVar4 = new a(cVar.g(Collection.class), m13, new C3367b(h14, id.e.g(cVar5, h15), false));
        C3367b m14 = C3367b.m(j.a.f3927W);
        Intrinsics.checkNotNullExpressionValue(m14, "topLevel(...)");
        id.c cVar6 = j.a.f3940e0;
        id.c h16 = m14.h();
        id.c h17 = m14.h();
        Intrinsics.checkNotNullExpressionValue(h17, "getPackageFqName(...)");
        a aVar5 = new a(cVar.g(List.class), m14, new C3367b(h16, id.e.g(cVar6, h17), false));
        C3367b m15 = C3367b.m(j.a.f3929Y);
        Intrinsics.checkNotNullExpressionValue(m15, "topLevel(...)");
        id.c cVar7 = j.a.f3944g0;
        id.c h18 = m15.h();
        id.c h19 = m15.h();
        Intrinsics.checkNotNullExpressionValue(h19, "getPackageFqName(...)");
        a aVar6 = new a(cVar.g(Set.class), m15, new C3367b(h18, id.e.g(cVar7, h19), false));
        C3367b m16 = C3367b.m(j.a.f3928X);
        Intrinsics.checkNotNullExpressionValue(m16, "topLevel(...)");
        id.c cVar8 = j.a.f3942f0;
        id.c h20 = m16.h();
        id.c h21 = m16.h();
        Intrinsics.checkNotNullExpressionValue(h21, "getPackageFqName(...)");
        a aVar7 = new a(cVar.g(ListIterator.class), m16, new C3367b(h20, id.e.g(cVar8, h21), false));
        id.c cVar9 = j.a.f3930Z;
        C3367b m17 = C3367b.m(cVar9);
        Intrinsics.checkNotNullExpressionValue(m17, "topLevel(...)");
        id.c cVar10 = j.a.f3946h0;
        id.c h22 = m17.h();
        id.c h23 = m17.h();
        Intrinsics.checkNotNullExpressionValue(h23, "getPackageFqName(...)");
        a aVar8 = new a(cVar.g(Map.class), m17, new C3367b(h22, id.e.g(cVar10, h23), false));
        C3367b d10 = C3367b.m(cVar9).d(j.a.f3932a0.g());
        Intrinsics.checkNotNullExpressionValue(d10, "createNestedClassId(...)");
        id.c cVar11 = j.a.f3948i0;
        id.c h24 = d10.h();
        id.c h25 = d10.h();
        Intrinsics.checkNotNullExpressionValue(h25, "getPackageFqName(...)");
        id.c g10 = id.e.g(cVar11, h25);
        List m18 = CollectionsKt.m(aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, new a(cVar.g(Map.Entry.class), d10, new C3367b(h24, g10, false)));
        f4906q = m18;
        cVar.f(Object.class, j.a.f3933b);
        cVar.f(String.class, j.a.f3945h);
        cVar.f(CharSequence.class, j.a.f3943g);
        cVar.e(Throwable.class, j.a.f3971u);
        cVar.f(Cloneable.class, j.a.f3937d);
        cVar.f(Number.class, j.a.f3965r);
        cVar.e(Comparable.class, j.a.f3973v);
        cVar.f(Enum.class, j.a.f3967s);
        cVar.e(Annotation.class, j.a.f3905G);
        Iterator it = m18.iterator();
        while (it.hasNext()) {
            f4890a.d((a) it.next());
        }
        for (pd.e eVar : pd.e.values()) {
            c cVar12 = f4890a;
            C3367b m19 = C3367b.m(eVar.getWrapperFqName());
            Intrinsics.checkNotNullExpressionValue(m19, "topLevel(...)");
            Hc.h primitiveType = eVar.getPrimitiveType();
            Intrinsics.checkNotNullExpressionValue(primitiveType, "getPrimitiveType(...)");
            C3367b m20 = C3367b.m(Hc.j.c(primitiveType));
            Intrinsics.checkNotNullExpressionValue(m20, "topLevel(...)");
            cVar12.a(m19, m20);
        }
        for (C3367b c3367b : Hc.c.f3825a.a()) {
            c cVar13 = f4890a;
            C3367b m21 = C3367b.m(new id.c("kotlin.jvm.internal." + c3367b.j().c() + "CompanionObject"));
            Intrinsics.checkNotNullExpressionValue(m21, "topLevel(...)");
            C3367b d11 = c3367b.d(id.h.f34197d);
            Intrinsics.checkNotNullExpressionValue(d11, "createNestedClassId(...)");
            cVar13.a(m21, d11);
        }
        for (int i10 = 0; i10 < 23; i10++) {
            c cVar14 = f4890a;
            C3367b m22 = C3367b.m(new id.c("kotlin.jvm.functions.Function" + i10));
            Intrinsics.checkNotNullExpressionValue(m22, "topLevel(...)");
            cVar14.a(m22, Hc.j.a(i10));
            cVar14.c(new id.c(f4892c + i10), f4897h);
        }
        for (int i11 = 0; i11 < 22; i11++) {
            f.c cVar15 = f.c.f4420e;
            f4890a.c(new id.c((cVar15.b().toString() + '.' + cVar15.a()) + i11), f4897h);
        }
        c cVar16 = f4890a;
        id.c l10 = j.a.f3935c.l();
        Intrinsics.checkNotNullExpressionValue(l10, "toSafe(...)");
        cVar16.c(l10, cVar16.g(Void.class));
    }

    private c() {
    }

    private final void a(C3367b c3367b, C3367b c3367b2) {
        b(c3367b, c3367b2);
        id.c b10 = c3367b2.b();
        Intrinsics.checkNotNullExpressionValue(b10, "asSingleFqName(...)");
        c(b10, c3367b);
    }

    private final void b(C3367b c3367b, C3367b c3367b2) {
        HashMap hashMap = f4900k;
        id.d j10 = c3367b.b().j();
        Intrinsics.checkNotNullExpressionValue(j10, "toUnsafe(...)");
        hashMap.put(j10, c3367b2);
    }

    private final void c(id.c cVar, C3367b c3367b) {
        HashMap hashMap = f4901l;
        id.d j10 = cVar.j();
        Intrinsics.checkNotNullExpressionValue(j10, "toUnsafe(...)");
        hashMap.put(j10, c3367b);
    }

    private final void d(a aVar) {
        C3367b a10 = aVar.a();
        C3367b b10 = aVar.b();
        C3367b c10 = aVar.c();
        a(a10, b10);
        id.c b11 = c10.b();
        Intrinsics.checkNotNullExpressionValue(b11, "asSingleFqName(...)");
        c(b11, a10);
        f4904o.put(c10, b10);
        f4905p.put(b10, c10);
        id.c b12 = b10.b();
        Intrinsics.checkNotNullExpressionValue(b12, "asSingleFqName(...)");
        id.c b13 = c10.b();
        Intrinsics.checkNotNullExpressionValue(b13, "asSingleFqName(...)");
        HashMap hashMap = f4902m;
        id.d j10 = c10.b().j();
        Intrinsics.checkNotNullExpressionValue(j10, "toUnsafe(...)");
        hashMap.put(j10, b12);
        HashMap hashMap2 = f4903n;
        id.d j11 = b12.j();
        Intrinsics.checkNotNullExpressionValue(j11, "toUnsafe(...)");
        hashMap2.put(j11, b13);
    }

    private final void e(Class cls, id.c cVar) {
        C3367b g10 = g(cls);
        C3367b m10 = C3367b.m(cVar);
        Intrinsics.checkNotNullExpressionValue(m10, "topLevel(...)");
        a(g10, m10);
    }

    private final void f(Class cls, id.d dVar) {
        id.c l10 = dVar.l();
        Intrinsics.checkNotNullExpressionValue(l10, "toSafe(...)");
        e(cls, l10);
    }

    private final C3367b g(Class cls) {
        if (!cls.isPrimitive()) {
            cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            C3367b m10 = C3367b.m(new id.c(cls.getCanonicalName()));
            Intrinsics.checkNotNullExpressionValue(m10, "topLevel(...)");
            return m10;
        }
        C3367b d10 = g(declaringClass).d(id.f.o(cls.getSimpleName()));
        Intrinsics.checkNotNullExpressionValue(d10, "createNestedClassId(...)");
        return d10;
    }

    private final boolean j(id.d dVar, String str) {
        Integer intOrNull;
        String b10 = dVar.b();
        Intrinsics.checkNotNullExpressionValue(b10, "asString(...)");
        String G02 = StringsKt.G0(b10, str, BuildConfig.FLAVOR);
        return G02.length() > 0 && !StringsKt.C0(G02, '0', false, 2, null) && (intOrNull = StringsKt.toIntOrNull(G02)) != null && intOrNull.intValue() >= 23;
    }

    public final id.c h() {
        return f4896g;
    }

    public final List i() {
        return f4906q;
    }

    public final boolean k(id.d dVar) {
        return f4902m.containsKey(dVar);
    }

    public final boolean l(id.d dVar) {
        return f4903n.containsKey(dVar);
    }

    public final C3367b m(id.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return (C3367b) f4900k.get(fqName.j());
    }

    public final C3367b n(id.d kotlinFqName) {
        Intrinsics.checkNotNullParameter(kotlinFqName, "kotlinFqName");
        return j(kotlinFqName, f4891b) ? f4895f : j(kotlinFqName, f4893d) ? f4895f : j(kotlinFqName, f4892c) ? f4897h : j(kotlinFqName, f4894e) ? f4897h : (C3367b) f4901l.get(kotlinFqName);
    }

    public final id.c o(id.d dVar) {
        return (id.c) f4902m.get(dVar);
    }

    public final id.c p(id.d dVar) {
        return (id.c) f4903n.get(dVar);
    }
}
