package hd;

import dd.C3026c;
import dd.C3027d;
import dd.C3032i;
import dd.C3035l;
import dd.C3037n;
import dd.C3040q;
import dd.u;
import fd.b;
import gd.AbstractC3218a;
import hd.d;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.protobuf.i;
import org.conscrypt.BuildConfig;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f34080a = new i();

    /* renamed from: b, reason: collision with root package name */
    private static final kotlin.reflect.jvm.internal.impl.protobuf.g f34081b;

    static {
        kotlin.reflect.jvm.internal.impl.protobuf.g d10 = kotlin.reflect.jvm.internal.impl.protobuf.g.d();
        AbstractC3218a.a(d10);
        Intrinsics.checkNotNullExpressionValue(d10, "apply(...)");
        f34081b = d10;
    }

    private i() {
    }

    public static /* synthetic */ d.a d(i iVar, C3037n c3037n, fd.c cVar, fd.g gVar, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = true;
        }
        return iVar.c(c3037n, cVar, gVar, z10);
    }

    public static final boolean f(C3037n proto) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        b.C0485b a10 = c.f34058a.a();
        Object r10 = proto.r(AbstractC3218a.f33678e);
        Intrinsics.checkNotNullExpressionValue(r10, "getExtension(...)");
        Boolean d10 = a10.d(((Number) r10).intValue());
        Intrinsics.checkNotNullExpressionValue(d10, "get(...)");
        return d10.booleanValue();
    }

    private final String g(C3040q c3040q, fd.c cVar) {
        if (c3040q.i0()) {
            return b.b(cVar.a(c3040q.T()));
        }
        return null;
    }

    public static final Pair h(byte[] bytes, String[] strings) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Intrinsics.checkNotNullParameter(strings, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        return new Pair(f34080a.k(byteArrayInputStream, strings), C3026c.u1(byteArrayInputStream, f34081b));
    }

    public static final Pair i(String[] data, String[] strings) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(strings, "strings");
        byte[] e10 = AbstractC3305a.e(data);
        Intrinsics.checkNotNullExpressionValue(e10, "decodeBytes(...)");
        return h(e10, strings);
    }

    public static final Pair j(String[] data, String[] strings) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(strings, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(AbstractC3305a.e(data));
        return new Pair(f34080a.k(byteArrayInputStream, strings), C3032i.C0(byteArrayInputStream, f34081b));
    }

    private final f k(InputStream inputStream, String[] strArr) {
        AbstractC3218a.e A10 = AbstractC3218a.e.A(inputStream, f34081b);
        Intrinsics.checkNotNullExpressionValue(A10, "parseDelimitedFrom(...)");
        return new f(A10, strArr);
    }

    public static final Pair l(byte[] bytes, String[] strings) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Intrinsics.checkNotNullParameter(strings, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        return new Pair(f34080a.k(byteArrayInputStream, strings), C3035l.a0(byteArrayInputStream, f34081b));
    }

    public static final Pair m(String[] data, String[] strings) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(strings, "strings");
        byte[] e10 = AbstractC3305a.e(data);
        Intrinsics.checkNotNullExpressionValue(e10, "decodeBytes(...)");
        return l(e10, strings);
    }

    public final kotlin.reflect.jvm.internal.impl.protobuf.g a() {
        return f34081b;
    }

    public final d.b b(C3027d proto, fd.c nameResolver, fd.g typeTable) {
        String l02;
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        i.f constructorSignature = AbstractC3218a.f33674a;
        Intrinsics.checkNotNullExpressionValue(constructorSignature, "constructorSignature");
        AbstractC3218a.c cVar = (AbstractC3218a.c) fd.e.a(proto, constructorSignature);
        String string = (cVar == null || !cVar.w()) ? "<init>" : nameResolver.getString(cVar.u());
        if (cVar == null || !cVar.v()) {
            List J10 = proto.J();
            Intrinsics.checkNotNullExpressionValue(J10, "getValueParameterList(...)");
            List<u> list = J10;
            ArrayList arrayList = new ArrayList(CollectionsKt.u(list, 10));
            for (u uVar : list) {
                i iVar = f34080a;
                Intrinsics.d(uVar);
                String g10 = iVar.g(fd.f.q(uVar, typeTable), nameResolver);
                if (g10 == null) {
                    return null;
                }
                arrayList.add(g10);
            }
            l02 = CollectionsKt.l0(arrayList, BuildConfig.FLAVOR, "(", ")V", 0, null, null, 56, null);
        } else {
            l02 = nameResolver.getString(cVar.t());
        }
        return new d.b(string, l02);
    }

    public final d.a c(C3037n proto, fd.c nameResolver, fd.g typeTable, boolean z10) {
        String g10;
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        i.f propertySignature = AbstractC3218a.f33677d;
        Intrinsics.checkNotNullExpressionValue(propertySignature, "propertySignature");
        AbstractC3218a.d dVar = (AbstractC3218a.d) fd.e.a(proto, propertySignature);
        if (dVar == null) {
            return null;
        }
        AbstractC3218a.b x10 = dVar.C() ? dVar.x() : null;
        if (x10 == null && z10) {
            return null;
        }
        int Z10 = (x10 == null || !x10.w()) ? proto.Z() : x10.u();
        if (x10 == null || !x10.v()) {
            g10 = g(fd.f.n(proto, typeTable), nameResolver);
            if (g10 == null) {
                return null;
            }
        } else {
            g10 = nameResolver.getString(x10.t());
        }
        return new d.a(nameResolver.getString(Z10), g10);
    }

    public final d.b e(C3032i proto, fd.c nameResolver, fd.g typeTable) {
        String str;
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        i.f methodSignature = AbstractC3218a.f33675b;
        Intrinsics.checkNotNullExpressionValue(methodSignature, "methodSignature");
        AbstractC3218a.c cVar = (AbstractC3218a.c) fd.e.a(proto, methodSignature);
        int a02 = (cVar == null || !cVar.w()) ? proto.a0() : cVar.u();
        if (cVar == null || !cVar.v()) {
            List n10 = CollectionsKt.n(fd.f.k(proto, typeTable));
            List m02 = proto.m0();
            Intrinsics.checkNotNullExpressionValue(m02, "getValueParameterList(...)");
            List<u> list = m02;
            ArrayList arrayList = new ArrayList(CollectionsKt.u(list, 10));
            for (u uVar : list) {
                Intrinsics.d(uVar);
                arrayList.add(fd.f.q(uVar, typeTable));
            }
            List w02 = CollectionsKt.w0(n10, arrayList);
            ArrayList arrayList2 = new ArrayList(CollectionsKt.u(w02, 10));
            Iterator it = w02.iterator();
            while (it.hasNext()) {
                String g10 = f34080a.g((C3040q) it.next(), nameResolver);
                if (g10 == null) {
                    return null;
                }
                arrayList2.add(g10);
            }
            String g11 = g(fd.f.m(proto, typeTable), nameResolver);
            if (g11 == null) {
                return null;
            }
            str = CollectionsKt.l0(arrayList2, BuildConfig.FLAVOR, "(", ")", 0, null, null, 56, null) + g11;
        } else {
            str = nameResolver.getString(cVar.t());
        }
        return new d.b(nameResolver.getString(a02), str);
    }
}
