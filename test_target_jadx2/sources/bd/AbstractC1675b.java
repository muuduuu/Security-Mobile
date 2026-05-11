package bd;

import Kc.a0;
import bd.t;
import bd.w;
import dd.C3025b;
import dd.C3026c;
import dd.C3027d;
import dd.C3030g;
import dd.C3032i;
import dd.C3037n;
import dd.C3040q;
import dd.C3042s;
import gd.AbstractC3218a;
import hd.d;
import id.C3367b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.protobuf.i;
import kotlin.text.StringsKt;
import qc.AbstractC3958a;
import ud.AbstractC4882A;
import ud.EnumC4884b;
import ud.InterfaceC4888f;

/* renamed from: bd.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1675b implements InterfaceC4888f {

    /* renamed from: b, reason: collision with root package name */
    public static final C0333b f18973b = new C0333b(null);

    /* renamed from: a, reason: collision with root package name */
    private final r f18974a;

    /* renamed from: bd.b$a */
    public static abstract class a {
        public abstract Map a();
    }

    /* renamed from: bd.b$b, reason: collision with other inner class name */
    public static final class C0333b {
        public /* synthetic */ C0333b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final t a(AbstractC4882A container, boolean z10, boolean z11, Boolean bool, boolean z12, r kotlinClassFinder, hd.e jvmMetadataVersion) {
            AbstractC4882A.a h10;
            Intrinsics.checkNotNullParameter(container, "container");
            Intrinsics.checkNotNullParameter(kotlinClassFinder, "kotlinClassFinder");
            Intrinsics.checkNotNullParameter(jvmMetadataVersion, "jvmMetadataVersion");
            if (z10) {
                if (bool == null) {
                    throw new IllegalStateException(("isConst should not be null for property (container=" + container + ')').toString());
                }
                if (container instanceof AbstractC4882A.a) {
                    AbstractC4882A.a aVar = (AbstractC4882A.a) container;
                    if (aVar.g() == C3026c.EnumC0459c.INTERFACE) {
                        C3367b d10 = aVar.e().d(id.f.o("DefaultImpls"));
                        Intrinsics.checkNotNullExpressionValue(d10, "createNestedClassId(...)");
                        return s.b(kotlinClassFinder, d10, jvmMetadataVersion);
                    }
                }
                if (bool.booleanValue() && (container instanceof AbstractC4882A.b)) {
                    a0 c10 = container.c();
                    n nVar = c10 instanceof n ? (n) c10 : null;
                    pd.d f10 = nVar != null ? nVar.f() : null;
                    if (f10 != null) {
                        String f11 = f10.f();
                        Intrinsics.checkNotNullExpressionValue(f11, "getInternalName(...)");
                        C3367b m10 = C3367b.m(new id.c(StringsKt.y(f11, '/', '.', false, 4, null)));
                        Intrinsics.checkNotNullExpressionValue(m10, "topLevel(...)");
                        return s.b(kotlinClassFinder, m10, jvmMetadataVersion);
                    }
                }
            }
            if (z11 && (container instanceof AbstractC4882A.a)) {
                AbstractC4882A.a aVar2 = (AbstractC4882A.a) container;
                if (aVar2.g() == C3026c.EnumC0459c.COMPANION_OBJECT && (h10 = aVar2.h()) != null && (h10.g() == C3026c.EnumC0459c.CLASS || h10.g() == C3026c.EnumC0459c.ENUM_CLASS || (z12 && (h10.g() == C3026c.EnumC0459c.INTERFACE || h10.g() == C3026c.EnumC0459c.ANNOTATION_CLASS)))) {
                    a0 c11 = h10.c();
                    v vVar = c11 instanceof v ? (v) c11 : null;
                    if (vVar != null) {
                        return vVar.d();
                    }
                    return null;
                }
            }
            if (!(container instanceof AbstractC4882A.b) || !(container.c() instanceof n)) {
                return null;
            }
            a0 c12 = container.c();
            Intrinsics.e(c12, "null cannot be cast to non-null type org.jetbrains.kotlin.load.kotlin.JvmPackagePartSource");
            n nVar2 = (n) c12;
            t g10 = nVar2.g();
            return g10 == null ? s.b(kotlinClassFinder, nVar2.d(), jvmMetadataVersion) : g10;
        }

        private C0333b() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: bd.b$c */
    private static final class c {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ c[] $VALUES;
        public static final c PROPERTY = new c("PROPERTY", 0);
        public static final c BACKING_FIELD = new c("BACKING_FIELD", 1);
        public static final c DELEGATE_FIELD = new c("DELEGATE_FIELD", 2);

        private static final /* synthetic */ c[] $values() {
            return new c[]{PROPERTY, BACKING_FIELD, DELEGATE_FIELD};
        }

        static {
            c[] $values = $values();
            $VALUES = $values;
            $ENTRIES = AbstractC3958a.a($values);
        }

        private c(String str, int i10) {
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }
    }

    /* renamed from: bd.b$d */
    public /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18975a;

        static {
            int[] iArr = new int[EnumC4884b.values().length];
            try {
                iArr[EnumC4884b.PROPERTY_GETTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4884b.PROPERTY_SETTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC4884b.PROPERTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f18975a = iArr;
        }
    }

    public AbstractC1675b(r kotlinClassFinder) {
        Intrinsics.checkNotNullParameter(kotlinClassFinder, "kotlinClassFinder");
        this.f18974a = kotlinClassFinder;
    }

    private final t A(AbstractC4882A.a aVar) {
        a0 c10 = aVar.c();
        v vVar = c10 instanceof v ? (v) c10 : null;
        if (vVar != null) {
            return vVar.d();
        }
        return null;
    }

    private final int l(AbstractC4882A abstractC4882A, kotlin.reflect.jvm.internal.impl.protobuf.p pVar) {
        if (pVar instanceof C3032i) {
            if (!fd.f.g((C3032i) pVar)) {
                return 0;
            }
        } else if (pVar instanceof C3037n) {
            if (!fd.f.h((C3037n) pVar)) {
                return 0;
            }
        } else {
            if (!(pVar instanceof C3027d)) {
                throw new UnsupportedOperationException("Unsupported message: " + pVar.getClass());
            }
            Intrinsics.e(abstractC4882A, "null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.ProtoContainer.Class");
            AbstractC4882A.a aVar = (AbstractC4882A.a) abstractC4882A;
            if (aVar.g() == C3026c.EnumC0459c.ENUM_CLASS) {
                return 2;
            }
            if (!aVar.i()) {
                return 0;
            }
        }
        return 1;
    }

    private final List m(AbstractC4882A abstractC4882A, w wVar, boolean z10, boolean z11, Boolean bool, boolean z12) {
        t o10 = o(abstractC4882A, f18973b.a(abstractC4882A, z10, z11, bool, z12, this.f18974a, t()));
        if (o10 == null) {
            return CollectionsKt.j();
        }
        List list = (List) p(o10).a().get(wVar);
        return list == null ? CollectionsKt.j() : list;
    }

    static /* synthetic */ List n(AbstractC1675b abstractC1675b, AbstractC4882A abstractC4882A, w wVar, boolean z10, boolean z11, Boolean bool, boolean z12, int i10, Object obj) {
        if (obj == null) {
            return abstractC1675b.m(abstractC4882A, wVar, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? false : z11, (i10 & 16) != 0 ? null : bool, (i10 & 32) != 0 ? false : z12);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findClassAndLoadMemberAnnotations");
    }

    public static /* synthetic */ w s(AbstractC1675b abstractC1675b, kotlin.reflect.jvm.internal.impl.protobuf.p pVar, fd.c cVar, fd.g gVar, EnumC4884b enumC4884b, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCallableSignature");
        }
        if ((i10 & 16) != 0) {
            z10 = false;
        }
        return abstractC1675b.r(pVar, cVar, gVar, enumC4884b, z10);
    }

    private final List z(AbstractC4882A abstractC4882A, C3037n c3037n, c cVar) {
        Boolean d10 = fd.b.f32995B.d(c3037n.X());
        Intrinsics.checkNotNullExpressionValue(d10, "get(...)");
        d10.booleanValue();
        boolean f10 = hd.i.f(c3037n);
        if (cVar == c.PROPERTY) {
            w b10 = AbstractC1676c.b(c3037n, abstractC4882A.b(), abstractC4882A.d(), false, true, false, 40, null);
            return b10 == null ? CollectionsKt.j() : n(this, abstractC4882A, b10, true, false, d10, f10, 8, null);
        }
        w b11 = AbstractC1676c.b(c3037n, abstractC4882A.b(), abstractC4882A.d(), true, false, false, 48, null);
        if (b11 == null) {
            return CollectionsKt.j();
        }
        return StringsKt.K(b11.a(), "$delegate", false, 2, null) != (cVar == c.DELEGATE_FIELD) ? CollectionsKt.j() : m(abstractC4882A, b11, true, true, d10, f10);
    }

    @Override // ud.InterfaceC4888f
    public List b(C3040q proto, fd.c nameResolver) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Object r10 = proto.r(AbstractC3218a.f33679f);
        Intrinsics.checkNotNullExpressionValue(r10, "getExtension(...)");
        Iterable<C3025b> iterable = (Iterable) r10;
        ArrayList arrayList = new ArrayList(CollectionsKt.u(iterable, 10));
        for (C3025b c3025b : iterable) {
            Intrinsics.d(c3025b);
            arrayList.add(x(c3025b, nameResolver));
        }
        return arrayList;
    }

    @Override // ud.InterfaceC4888f
    public List c(AbstractC4882A container, C3037n proto) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        return z(container, proto, c.DELEGATE_FIELD);
    }

    @Override // ud.InterfaceC4888f
    public List e(AbstractC4882A container, kotlin.reflect.jvm.internal.impl.protobuf.p proto, EnumC4884b kind) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(kind, "kind");
        if (kind == EnumC4884b.PROPERTY) {
            return z(container, (C3037n) proto, c.PROPERTY);
        }
        w s10 = s(this, proto, container.b(), container.d(), kind, false, 16, null);
        return s10 == null ? CollectionsKt.j() : n(this, container, s10, false, false, null, false, 60, null);
    }

    @Override // ud.InterfaceC4888f
    public List f(AbstractC4882A.a container) {
        Intrinsics.checkNotNullParameter(container, "container");
        t A10 = A(container);
        if (A10 != null) {
            ArrayList arrayList = new ArrayList(1);
            A10.c(new e(arrayList), q(A10));
            return arrayList;
        }
        throw new IllegalStateException(("Class for loading annotations is not found: " + container.a()).toString());
    }

    @Override // ud.InterfaceC4888f
    public List g(C3042s proto, fd.c nameResolver) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Object r10 = proto.r(AbstractC3218a.f33681h);
        Intrinsics.checkNotNullExpressionValue(r10, "getExtension(...)");
        Iterable<C3025b> iterable = (Iterable) r10;
        ArrayList arrayList = new ArrayList(CollectionsKt.u(iterable, 10));
        for (C3025b c3025b : iterable) {
            Intrinsics.d(c3025b);
            arrayList.add(x(c3025b, nameResolver));
        }
        return arrayList;
    }

    @Override // ud.InterfaceC4888f
    public List h(AbstractC4882A container, kotlin.reflect.jvm.internal.impl.protobuf.p callableProto, EnumC4884b kind, int i10, dd.u proto) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(callableProto, "callableProto");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(proto, "proto");
        w s10 = s(this, callableProto, container.b(), container.d(), kind, false, 16, null);
        if (s10 == null) {
            return CollectionsKt.j();
        }
        return n(this, container, w.f19048b.e(s10, i10 + l(container, callableProto)), false, false, null, false, 60, null);
    }

    @Override // ud.InterfaceC4888f
    public List i(AbstractC4882A container, kotlin.reflect.jvm.internal.impl.protobuf.p proto, EnumC4884b kind) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(kind, "kind");
        w s10 = s(this, proto, container.b(), container.d(), kind, false, 16, null);
        return s10 != null ? n(this, container, w.f19048b.e(s10, 0), false, false, null, false, 60, null) : CollectionsKt.j();
    }

    @Override // ud.InterfaceC4888f
    public List j(AbstractC4882A container, C3030g proto) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        w.a aVar = w.f19048b;
        String string = container.b().getString(proto.C());
        String c10 = ((AbstractC4882A.a) container).e().c();
        Intrinsics.checkNotNullExpressionValue(c10, "asString(...)");
        return n(this, container, aVar.a(string, hd.b.b(c10)), false, false, null, false, 60, null);
    }

    @Override // ud.InterfaceC4888f
    public List k(AbstractC4882A container, C3037n proto) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        return z(container, proto, c.BACKING_FIELD);
    }

    protected final t o(AbstractC4882A container, t tVar) {
        Intrinsics.checkNotNullParameter(container, "container");
        if (tVar != null) {
            return tVar;
        }
        if (container instanceof AbstractC4882A.a) {
            return A((AbstractC4882A.a) container);
        }
        return null;
    }

    protected abstract a p(t tVar);

    protected byte[] q(t kotlinClass) {
        Intrinsics.checkNotNullParameter(kotlinClass, "kotlinClass");
        return null;
    }

    protected final w r(kotlin.reflect.jvm.internal.impl.protobuf.p proto, fd.c nameResolver, fd.g typeTable, EnumC4884b kind, boolean z10) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        Intrinsics.checkNotNullParameter(kind, "kind");
        if (proto instanceof C3027d) {
            w.a aVar = w.f19048b;
            d.b b10 = hd.i.f34080a.b((C3027d) proto, nameResolver, typeTable);
            if (b10 == null) {
                return null;
            }
            return aVar.b(b10);
        }
        if (proto instanceof C3032i) {
            w.a aVar2 = w.f19048b;
            d.b e10 = hd.i.f34080a.e((C3032i) proto, nameResolver, typeTable);
            if (e10 == null) {
                return null;
            }
            return aVar2.b(e10);
        }
        if (!(proto instanceof C3037n)) {
            return null;
        }
        i.f propertySignature = AbstractC3218a.f33677d;
        Intrinsics.checkNotNullExpressionValue(propertySignature, "propertySignature");
        AbstractC3218a.d dVar = (AbstractC3218a.d) fd.e.a((i.d) proto, propertySignature);
        if (dVar == null) {
            return null;
        }
        int i10 = d.f18975a[kind.ordinal()];
        if (i10 == 1) {
            if (!dVar.D()) {
                return null;
            }
            w.a aVar3 = w.f19048b;
            AbstractC3218a.c y10 = dVar.y();
            Intrinsics.checkNotNullExpressionValue(y10, "getGetter(...)");
            return aVar3.c(nameResolver, y10);
        }
        if (i10 != 2) {
            if (i10 != 3) {
                return null;
            }
            return AbstractC1676c.a((C3037n) proto, nameResolver, typeTable, true, true, z10);
        }
        if (!dVar.E()) {
            return null;
        }
        w.a aVar4 = w.f19048b;
        AbstractC3218a.c z11 = dVar.z();
        Intrinsics.checkNotNullExpressionValue(z11, "getSetter(...)");
        return aVar4.c(nameResolver, z11);
    }

    public abstract hd.e t();

    protected final r u() {
        return this.f18974a;
    }

    protected final boolean v(C3367b classId) {
        t b10;
        Intrinsics.checkNotNullParameter(classId, "classId");
        return classId.g() != null && Intrinsics.b(classId.j().c(), "Container") && (b10 = s.b(this.f18974a, classId, t())) != null && Gc.a.f2992a.c(b10);
    }

    protected abstract t.a w(C3367b c3367b, a0 a0Var, List list);

    public abstract Object x(C3025b c3025b, fd.c cVar);

    protected final t.a y(C3367b annotationClassId, a0 source, List result) {
        Intrinsics.checkNotNullParameter(annotationClassId, "annotationClassId");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(result, "result");
        if (Gc.a.f2992a.b().contains(annotationClassId)) {
            return null;
        }
        return w(annotationClassId, source, result);
    }

    /* renamed from: bd.b$e */
    public static final class e implements t.c {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f18977b;

        e(ArrayList arrayList) {
            this.f18977b = arrayList;
        }

        @Override // bd.t.c
        public t.a b(C3367b classId, a0 source) {
            Intrinsics.checkNotNullParameter(classId, "classId");
            Intrinsics.checkNotNullParameter(source, "source");
            return AbstractC1675b.this.y(classId, source, this.f18977b);
        }

        @Override // bd.t.c
        public void a() {
        }
    }
}
