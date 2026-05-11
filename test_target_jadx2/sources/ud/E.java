package ud;

import Kc.AbstractC0951x;
import Kc.InterfaceC0929a;
import Kc.InterfaceC0933e;
import Kc.InterfaceC0936h;
import Kc.InterfaceC0941m;
import Kc.f0;
import dd.C3040q;
import dd.C3042s;
import id.C3367b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import od.AbstractC3778c;
import org.conscrypt.BuildConfig;
import wd.C5069a;
import wd.C5081m;
import xc.AbstractC5156i;
import xc.C5142C;
import yd.AbstractC5197E;
import yd.C5198F;
import yd.C5213o;
import yd.M;
import yd.Q;
import yd.S;
import yd.T;
import yd.Z;
import yd.a0;
import yd.e0;
import yd.i0;
import yd.k0;
import yd.u0;

/* loaded from: classes3.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    private final m f43639a;

    /* renamed from: b, reason: collision with root package name */
    private final E f43640b;

    /* renamed from: c, reason: collision with root package name */
    private final String f43641c;

    /* renamed from: d, reason: collision with root package name */
    private final String f43642d;

    /* renamed from: e, reason: collision with root package name */
    private final Function1 f43643e;

    /* renamed from: f, reason: collision with root package name */
    private final Function1 f43644f;

    /* renamed from: g, reason: collision with root package name */
    private final Map f43645g;

    static final class a extends xc.m implements Function1 {
        a() {
            super(1);
        }

        public final InterfaceC0936h a(int i10) {
            return E.this.d(i10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    static final class b extends xc.m implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3040q f43648b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C3040q c3040q) {
            super(0);
            this.f43648b = c3040q;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            return E.this.f43639a.c().d().b(this.f43648b, E.this.f43639a.g());
        }
    }

    static final class c extends xc.m implements Function1 {
        c() {
            super(1);
        }

        public final InterfaceC0936h a(int i10) {
            return E.this.f(i10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    /* synthetic */ class d extends AbstractC5156i implements Function1 {

        /* renamed from: j, reason: collision with root package name */
        public static final d f43650j = new d();

        d() {
            super(1);
        }

        @Override // xc.AbstractC5150c
        public final kotlin.reflect.f E() {
            return C5142C.b(C3367b.class);
        }

        @Override // xc.AbstractC5150c
        public final String G() {
            return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public final C3367b invoke(C3367b p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return p02.g();
        }

        @Override // xc.AbstractC5150c, kotlin.reflect.c
        public final String getName() {
            return "getOuterClassId";
        }
    }

    static final class e extends xc.m implements Function1 {
        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3040q invoke(C3040q it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return fd.f.j(it, E.this.f43639a.j());
        }
    }

    static final class f extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final f f43652a = new f();

        f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(C3040q it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Integer.valueOf(it.R());
        }
    }

    public E(m c10, E e10, List typeParameterProtos, String debugName, String containerPresentableName) {
        Map linkedHashMap;
        Intrinsics.checkNotNullParameter(c10, "c");
        Intrinsics.checkNotNullParameter(typeParameterProtos, "typeParameterProtos");
        Intrinsics.checkNotNullParameter(debugName, "debugName");
        Intrinsics.checkNotNullParameter(containerPresentableName, "containerPresentableName");
        this.f43639a = c10;
        this.f43640b = e10;
        this.f43641c = debugName;
        this.f43642d = containerPresentableName;
        this.f43643e = c10.h().i(new a());
        this.f43644f = c10.h().i(new c());
        if (typeParameterProtos.isEmpty()) {
            linkedHashMap = kotlin.collections.G.h();
        } else {
            linkedHashMap = new LinkedHashMap();
            Iterator it = typeParameterProtos.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                C3042s c3042s = (C3042s) it.next();
                linkedHashMap.put(Integer.valueOf(c3042s.J()), new C5081m(this.f43639a, c3042s, i10));
                i10++;
            }
        }
        this.f43645g = linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC0936h d(int i10) {
        C3367b a10 = y.a(this.f43639a.g(), i10);
        return a10.k() ? this.f43639a.c().b(a10) : AbstractC0951x.b(this.f43639a.c().q(), a10);
    }

    private final M e(int i10) {
        if (y.a(this.f43639a.g(), i10).k()) {
            return this.f43639a.c().o().a();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC0936h f(int i10) {
        C3367b a10 = y.a(this.f43639a.g(), i10);
        if (a10.k()) {
            return null;
        }
        return AbstractC0951x.d(this.f43639a.c().q(), a10);
    }

    private final M g(AbstractC5197E abstractC5197E, AbstractC5197E abstractC5197E2) {
        Hc.g i10 = Bd.a.i(abstractC5197E);
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g i11 = abstractC5197E.i();
        AbstractC5197E k10 = Hc.f.k(abstractC5197E);
        List e10 = Hc.f.e(abstractC5197E);
        List Y10 = CollectionsKt.Y(Hc.f.m(abstractC5197E), 1);
        ArrayList arrayList = new ArrayList(CollectionsKt.u(Y10, 10));
        Iterator it = Y10.iterator();
        while (it.hasNext()) {
            arrayList.add(((i0) it.next()).getType());
        }
        return Hc.f.b(i10, i11, k10, e10, arrayList, null, abstractC5197E2, true).a1(abstractC5197E.X0());
    }

    private final M h(a0 a0Var, e0 e0Var, List list, boolean z10) {
        M i10;
        int size;
        int size2 = e0Var.c().size() - list.size();
        if (size2 != 0) {
            i10 = null;
            if (size2 == 1 && (size = list.size() - 1) >= 0) {
                e0 r10 = e0Var.v().X(size).r();
                Intrinsics.checkNotNullExpressionValue(r10, "getTypeConstructor(...)");
                i10 = C5198F.j(a0Var, r10, list, z10, null, 16, null);
            }
        } else {
            i10 = i(a0Var, e0Var, list, z10);
        }
        return i10 == null ? kotlin.reflect.jvm.internal.impl.types.error.k.f36726a.f(kotlin.reflect.jvm.internal.impl.types.error.j.INCONSISTENT_SUSPEND_FUNCTION, list, e0Var, new String[0]) : i10;
    }

    private final M i(a0 a0Var, e0 e0Var, List list, boolean z10) {
        M j10 = C5198F.j(a0Var, e0Var, list, z10, null, 16, null);
        if (Hc.f.q(j10)) {
            return p(j10);
        }
        return null;
    }

    private final f0 k(int i10) {
        f0 f0Var = (f0) this.f43645g.get(Integer.valueOf(i10));
        if (f0Var != null) {
            return f0Var;
        }
        E e10 = this.f43640b;
        if (e10 != null) {
            return e10.k(i10);
        }
        return null;
    }

    private static final List m(C3040q c3040q, E e10) {
        List S10 = c3040q.S();
        Intrinsics.checkNotNullExpressionValue(S10, "getArgumentList(...)");
        List list = S10;
        C3040q j10 = fd.f.j(c3040q, e10.f43639a.j());
        List m10 = j10 != null ? m(j10, e10) : null;
        if (m10 == null) {
            m10 = CollectionsKt.j();
        }
        return CollectionsKt.w0(list, m10);
    }

    public static /* synthetic */ M n(E e10, C3040q c3040q, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return e10.l(c3040q, z10);
    }

    private final a0 o(List list, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, e0 e0Var, InterfaceC0941m interfaceC0941m) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.u(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((Z) it.next()).a(gVar, e0Var, interfaceC0941m));
        }
        return a0.f45478b.h(CollectionsKt.w(arrayList));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.b(r2, r3) == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final M p(AbstractC5197E abstractC5197E) {
        AbstractC5197E type;
        id.c cVar;
        i0 i0Var = (i0) CollectionsKt.p0(Hc.f.m(abstractC5197E));
        if (i0Var == null || (type = i0Var.getType()) == null) {
            return null;
        }
        InterfaceC0936h d10 = type.W0().d();
        id.c l10 = d10 != null ? AbstractC3778c.l(d10) : null;
        if (type.U0().size() == 1) {
            if (!Intrinsics.b(l10, Hc.j.f3886t)) {
                cVar = F.f43653a;
            }
            AbstractC5197E type2 = ((i0) CollectionsKt.A0(type.U0())).getType();
            Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
            InterfaceC0941m e10 = this.f43639a.e();
            InterfaceC0929a interfaceC0929a = e10 instanceof InterfaceC0929a ? (InterfaceC0929a) e10 : null;
            return Intrinsics.b(interfaceC0929a != null ? AbstractC3778c.h(interfaceC0929a) : null, D.f43637a) ? g(abstractC5197E, type2) : g(abstractC5197E, type2);
        }
        return (M) abstractC5197E;
    }

    private final i0 r(f0 f0Var, C3040q.b bVar) {
        if (bVar.u() == C3040q.b.c.STAR) {
            return f0Var == null ? new S(this.f43639a.c().q().v()) : new T(f0Var);
        }
        B b10 = B.f43625a;
        C3040q.b.c u10 = bVar.u();
        Intrinsics.checkNotNullExpressionValue(u10, "getProjection(...)");
        u0 c10 = b10.c(u10);
        C3040q p10 = fd.f.p(bVar, this.f43639a.j());
        return p10 == null ? new k0(kotlin.reflect.jvm.internal.impl.types.error.k.d(kotlin.reflect.jvm.internal.impl.types.error.j.NO_RECORDED_TYPE, bVar.toString())) : new k0(c10, q(p10));
    }

    private final e0 s(C3040q c3040q) {
        InterfaceC0936h interfaceC0936h;
        Object obj;
        if (c3040q.i0()) {
            interfaceC0936h = (InterfaceC0936h) this.f43643e.invoke(Integer.valueOf(c3040q.T()));
            if (interfaceC0936h == null) {
                interfaceC0936h = t(this, c3040q, c3040q.T());
            }
        } else if (c3040q.r0()) {
            interfaceC0936h = k(c3040q.e0());
            if (interfaceC0936h == null) {
                return kotlin.reflect.jvm.internal.impl.types.error.k.f36726a.e(kotlin.reflect.jvm.internal.impl.types.error.j.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER, String.valueOf(c3040q.e0()), this.f43642d);
            }
        } else if (c3040q.s0()) {
            String string = this.f43639a.g().getString(c3040q.f0());
            Iterator it = j().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.b(((f0) obj).getName().c(), string)) {
                    break;
                }
            }
            interfaceC0936h = (f0) obj;
            if (interfaceC0936h == null) {
                return kotlin.reflect.jvm.internal.impl.types.error.k.f36726a.e(kotlin.reflect.jvm.internal.impl.types.error.j.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER_BY_NAME, string, this.f43639a.e().toString());
            }
        } else {
            if (!c3040q.q0()) {
                return kotlin.reflect.jvm.internal.impl.types.error.k.f36726a.e(kotlin.reflect.jvm.internal.impl.types.error.j.UNKNOWN_TYPE, new String[0]);
            }
            interfaceC0936h = (InterfaceC0936h) this.f43644f.invoke(Integer.valueOf(c3040q.d0()));
            if (interfaceC0936h == null) {
                interfaceC0936h = t(this, c3040q, c3040q.d0());
            }
        }
        e0 r10 = interfaceC0936h.r();
        Intrinsics.checkNotNullExpressionValue(r10, "getTypeConstructor(...)");
        return r10;
    }

    private static final InterfaceC0933e t(E e10, C3040q c3040q, int i10) {
        C3367b a10 = y.a(e10.f43639a.g(), i10);
        List D10 = kotlin.sequences.j.D(kotlin.sequences.j.w(kotlin.sequences.j.h(c3040q, e10.new e()), f.f43652a));
        int l10 = kotlin.sequences.j.l(kotlin.sequences.j.h(a10, d.f43650j));
        while (D10.size() < l10) {
            D10.add(0);
        }
        return e10.f43639a.c().r().d(a10, D10);
    }

    public final List j() {
        return CollectionsKt.O0(this.f43645g.values());
    }

    public final M l(C3040q proto, boolean z10) {
        M j10;
        M j11;
        Intrinsics.checkNotNullParameter(proto, "proto");
        M e10 = proto.i0() ? e(proto.T()) : proto.q0() ? e(proto.d0()) : null;
        if (e10 != null) {
            return e10;
        }
        e0 s10 = s(proto);
        if (kotlin.reflect.jvm.internal.impl.types.error.k.m(s10.d())) {
            return kotlin.reflect.jvm.internal.impl.types.error.k.f36726a.c(kotlin.reflect.jvm.internal.impl.types.error.j.TYPE_FOR_ERROR_TYPE_CONSTRUCTOR, s10, s10.toString());
        }
        C5069a c5069a = new C5069a(this.f43639a.h(), new b(proto));
        a0 o10 = o(this.f43639a.c().v(), c5069a, s10, this.f43639a.e());
        List m10 = m(proto, this);
        ArrayList arrayList = new ArrayList(CollectionsKt.u(m10, 10));
        int i10 = 0;
        for (Object obj : m10) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.t();
            }
            List c10 = s10.c();
            Intrinsics.checkNotNullExpressionValue(c10, "getParameters(...)");
            arrayList.add(r((f0) CollectionsKt.f0(c10, i10), (C3040q.b) obj));
            i10 = i11;
        }
        List O02 = CollectionsKt.O0(arrayList);
        InterfaceC0936h d10 = s10.d();
        if (z10 && (d10 instanceof Kc.e0)) {
            M b10 = C5198F.b((Kc.e0) d10, O02);
            j10 = b10.a1(yd.G.b(b10) || proto.a0()).c1(o(this.f43639a.c().v(), kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f36445g0.a(CollectionsKt.u0(c5069a, b10.i())), s10, this.f43639a.e()));
        } else {
            Boolean d11 = fd.b.f33010a.d(proto.W());
            Intrinsics.checkNotNullExpressionValue(d11, "get(...)");
            if (d11.booleanValue()) {
                j10 = h(o10, s10, O02, proto.a0());
            } else {
                j10 = C5198F.j(o10, s10, O02, proto.a0(), null, 16, null);
                Boolean d12 = fd.b.f33011b.d(proto.W());
                Intrinsics.checkNotNullExpressionValue(d12, "get(...)");
                if (d12.booleanValue()) {
                    C5213o c11 = C5213o.a.c(C5213o.f45555d, j10, true, false, 4, null);
                    if (c11 == null) {
                        throw new IllegalStateException(("null DefinitelyNotNullType for '" + j10 + '\'').toString());
                    }
                    j10 = c11;
                }
            }
        }
        C3040q a10 = fd.f.a(proto, this.f43639a.j());
        return (a10 == null || (j11 = Q.j(j10, l(a10, false))) == null) ? j10 : j11;
    }

    public final AbstractC5197E q(C3040q proto) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        if (!proto.k0()) {
            return l(proto, true);
        }
        String string = this.f43639a.g().getString(proto.X());
        M n10 = n(this, proto, false, 2, null);
        C3040q f10 = fd.f.f(proto, this.f43639a.j());
        Intrinsics.d(f10);
        return this.f43639a.c().m().a(proto, string, n10, n(this, f10, false, 2, null));
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f43641c);
        if (this.f43640b == null) {
            str = BuildConfig.FLAVOR;
        } else {
            str = ". Child of " + this.f43640b.f43641c;
        }
        sb2.append(str);
        return sb2.toString();
    }
}
