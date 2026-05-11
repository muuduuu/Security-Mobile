package ud;

import Kc.AbstractC0948u;
import Kc.EnumC0934f;
import Kc.InterfaceC0929a;
import Kc.InterfaceC0930b;
import Kc.InterfaceC0932d;
import Kc.InterfaceC0933e;
import Kc.InterfaceC0941m;
import Kc.K;
import Kc.U;
import Kc.X;
import Kc.Z;
import Kc.a0;
import Kc.e0;
import Kc.j0;
import Mc.L;
import dd.C3025b;
import dd.C3027d;
import dd.C3032i;
import dd.C3037n;
import dd.C3040q;
import dd.C3041r;
import dd.EnumC3033j;
import dd.EnumC3034k;
import fd.b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kd.AbstractC3565e;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import md.AbstractC3680g;
import od.AbstractC3778c;
import ud.AbstractC4882A;
import wd.C5069a;
import wd.C5071c;
import wd.C5072d;
import wd.C5078j;
import wd.C5079k;
import wd.C5080l;
import wd.C5082n;
import yd.AbstractC5197E;

/* loaded from: classes3.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    private final m f43732a;

    /* renamed from: b, reason: collision with root package name */
    private final C4887e f43733b;

    static final class a extends xc.m implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.protobuf.p f43735b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ EnumC4884b f43736c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(kotlin.reflect.jvm.internal.impl.protobuf.p pVar, EnumC4884b enumC4884b) {
            super(0);
            this.f43735b = pVar;
            this.f43736c = enumC4884b;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            List list;
            x xVar = x.this;
            AbstractC4882A c10 = xVar.c(xVar.f43732a.e());
            if (c10 != null) {
                list = CollectionsKt.O0(x.this.f43732a.c().d().e(c10, this.f43735b, this.f43736c));
            } else {
                list = null;
            }
            return list == null ? CollectionsKt.j() : list;
        }
    }

    static final class b extends xc.m implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f43738b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3037n f43739c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z10, C3037n c3037n) {
            super(0);
            this.f43738b = z10;
            this.f43739c = c3037n;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            List list;
            x xVar = x.this;
            AbstractC4882A c10 = xVar.c(xVar.f43732a.e());
            if (c10 != null) {
                boolean z10 = this.f43738b;
                x xVar2 = x.this;
                C3037n c3037n = this.f43739c;
                list = z10 ? CollectionsKt.O0(xVar2.f43732a.c().d().c(c10, c3037n)) : CollectionsKt.O0(xVar2.f43732a.c().d().k(c10, c3037n));
            } else {
                list = null;
            }
            return list == null ? CollectionsKt.j() : list;
        }
    }

    static final class c extends xc.m implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.protobuf.p f43741b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ EnumC4884b f43742c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(kotlin.reflect.jvm.internal.impl.protobuf.p pVar, EnumC4884b enumC4884b) {
            super(0);
            this.f43741b = pVar;
            this.f43742c = enumC4884b;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            List list;
            x xVar = x.this;
            AbstractC4882A c10 = xVar.c(xVar.f43732a.e());
            if (c10 != null) {
                list = x.this.f43732a.c().d().i(c10, this.f43741b, this.f43742c);
            } else {
                list = null;
            }
            return list == null ? CollectionsKt.j() : list;
        }
    }

    static final class d extends xc.m implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3037n f43744b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C5078j f43745c;

        static final class a extends xc.m implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ x f43746a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C3037n f43747b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C5078j f43748c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(x xVar, C3037n c3037n, C5078j c5078j) {
                super(0);
                this.f43746a = xVar;
                this.f43747b = c3037n;
                this.f43748c = c5078j;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AbstractC3680g invoke() {
                x xVar = this.f43746a;
                AbstractC4882A c10 = xVar.c(xVar.f43732a.e());
                Intrinsics.d(c10);
                InterfaceC4885c d10 = this.f43746a.f43732a.c().d();
                C3037n c3037n = this.f43747b;
                AbstractC5197E g10 = this.f43748c.g();
                Intrinsics.checkNotNullExpressionValue(g10, "getReturnType(...)");
                return (AbstractC3680g) d10.d(c10, c3037n, g10);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C3037n c3037n, C5078j c5078j) {
            super(0);
            this.f43744b = c3037n;
            this.f43745c = c5078j;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final xd.j invoke() {
            return x.this.f43732a.h().f(new a(x.this, this.f43744b, this.f43745c));
        }
    }

    static final class e extends xc.m implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3037n f43750b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C5078j f43751c;

        static final class a extends xc.m implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ x f43752a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C3037n f43753b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C5078j f43754c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(x xVar, C3037n c3037n, C5078j c5078j) {
                super(0);
                this.f43752a = xVar;
                this.f43753b = c3037n;
                this.f43754c = c5078j;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AbstractC3680g invoke() {
                x xVar = this.f43752a;
                AbstractC4882A c10 = xVar.c(xVar.f43732a.e());
                Intrinsics.d(c10);
                InterfaceC4885c d10 = this.f43752a.f43732a.c().d();
                C3037n c3037n = this.f43753b;
                AbstractC5197E g10 = this.f43754c.g();
                Intrinsics.checkNotNullExpressionValue(g10, "getReturnType(...)");
                return (AbstractC3680g) d10.a(c10, c3037n, g10);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(C3037n c3037n, C5078j c5078j) {
            super(0);
            this.f43750b = c3037n;
            this.f43751c = c5078j;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final xd.j invoke() {
            return x.this.f43732a.h().f(new a(x.this, this.f43750b, this.f43751c));
        }
    }

    static final class f extends xc.m implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC4882A f43756b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.protobuf.p f43757c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ EnumC4884b f43758d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f43759e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ dd.u f43760f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(AbstractC4882A abstractC4882A, kotlin.reflect.jvm.internal.impl.protobuf.p pVar, EnumC4884b enumC4884b, int i10, dd.u uVar) {
            super(0);
            this.f43756b = abstractC4882A;
            this.f43757c = pVar;
            this.f43758d = enumC4884b;
            this.f43759e = i10;
            this.f43760f = uVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            return CollectionsKt.O0(x.this.f43732a.c().d().h(this.f43756b, this.f43757c, this.f43758d, this.f43759e, this.f43760f));
        }
    }

    public x(m c10) {
        Intrinsics.checkNotNullParameter(c10, "c");
        this.f43732a = c10;
        this.f43733b = new C4887e(c10.c().q(), c10.c().r());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC4882A c(InterfaceC0941m interfaceC0941m) {
        if (interfaceC0941m instanceof K) {
            return new AbstractC4882A.b(((K) interfaceC0941m).e(), this.f43732a.g(), this.f43732a.j(), this.f43732a.d());
        }
        if (interfaceC0941m instanceof C5072d) {
            return ((C5072d) interfaceC0941m).n1();
        }
        return null;
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g d(kotlin.reflect.jvm.internal.impl.protobuf.p pVar, int i10, EnumC4884b enumC4884b) {
        return !fd.b.f33012c.d(i10).booleanValue() ? kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f36445g0.b() : new C5082n(this.f43732a.h(), new a(pVar, enumC4884b));
    }

    private final X e() {
        InterfaceC0941m e10 = this.f43732a.e();
        InterfaceC0933e interfaceC0933e = e10 instanceof InterfaceC0933e ? (InterfaceC0933e) e10 : null;
        if (interfaceC0933e != null) {
            return interfaceC0933e.S0();
        }
        return null;
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g f(C3037n c3037n, boolean z10) {
        return !fd.b.f33012c.d(c3037n.X()).booleanValue() ? kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f36445g0.b() : new C5082n(this.f43732a.h(), new b(z10, c3037n));
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g g(kotlin.reflect.jvm.internal.impl.protobuf.p pVar, EnumC4884b enumC4884b) {
        return new C5069a(this.f43732a.h(), new c(pVar, enumC4884b));
    }

    private final void h(C5079k c5079k, X x10, X x11, List list, List list2, List list3, AbstractC5197E abstractC5197E, Kc.D d10, AbstractC0948u abstractC0948u, Map map) {
        c5079k.x1(x10, x11, list, list2, list3, abstractC5197E, d10, abstractC0948u, map);
    }

    private final int k(int i10) {
        return (i10 & 63) + ((i10 >> 8) << 6);
    }

    private final X n(C3040q c3040q, m mVar, InterfaceC0929a interfaceC0929a, int i10) {
        return AbstractC3565e.b(interfaceC0929a, mVar.i().q(c3040q), null, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f36445g0.b(), i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final List o(List list, kotlin.reflect.jvm.internal.impl.protobuf.p pVar, EnumC4884b enumC4884b) {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g b10;
        InterfaceC0941m e10 = this.f43732a.e();
        Intrinsics.e(e10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        InterfaceC0929a interfaceC0929a = (InterfaceC0929a) e10;
        InterfaceC0941m b11 = interfaceC0929a.b();
        Intrinsics.checkNotNullExpressionValue(b11, "getContainingDeclaration(...)");
        AbstractC4882A c10 = c(b11);
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.u(list2, 10));
        int i10 = 0;
        for (Object obj : list2) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.t();
            }
            dd.u uVar = (dd.u) obj;
            int H10 = uVar.N() ? uVar.H() : 0;
            if (c10 != null) {
                Boolean d10 = fd.b.f33012c.d(H10);
                Intrinsics.checkNotNullExpressionValue(d10, "get(...)");
                if (d10.booleanValue()) {
                    b10 = new C5082n(this.f43732a.h(), new f(c10, pVar, enumC4884b, i10, uVar));
                    id.f b12 = y.b(this.f43732a.g(), uVar.I());
                    AbstractC5197E q10 = this.f43732a.i().q(fd.f.q(uVar, this.f43732a.j()));
                    Boolean d11 = fd.b.f33001H.d(H10);
                    Intrinsics.checkNotNullExpressionValue(d11, "get(...)");
                    boolean booleanValue = d11.booleanValue();
                    Boolean d12 = fd.b.f33002I.d(H10);
                    Intrinsics.checkNotNullExpressionValue(d12, "get(...)");
                    boolean booleanValue2 = d12.booleanValue();
                    Boolean d13 = fd.b.f33003J.d(H10);
                    Intrinsics.checkNotNullExpressionValue(d13, "get(...)");
                    boolean booleanValue3 = d13.booleanValue();
                    C3040q t10 = fd.f.t(uVar, this.f43732a.j());
                    AbstractC5197E q11 = t10 == null ? this.f43732a.i().q(t10) : null;
                    a0 NO_SOURCE = a0.f5560a;
                    Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
                    ArrayList arrayList2 = arrayList;
                    arrayList2.add(new L(interfaceC0929a, null, i10, b10, b12, q10, booleanValue, booleanValue2, booleanValue3, q11, NO_SOURCE));
                    arrayList = arrayList2;
                    i10 = i11;
                }
            }
            b10 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f36445g0.b();
            id.f b122 = y.b(this.f43732a.g(), uVar.I());
            AbstractC5197E q102 = this.f43732a.i().q(fd.f.q(uVar, this.f43732a.j()));
            Boolean d112 = fd.b.f33001H.d(H10);
            Intrinsics.checkNotNullExpressionValue(d112, "get(...)");
            boolean booleanValue4 = d112.booleanValue();
            Boolean d122 = fd.b.f33002I.d(H10);
            Intrinsics.checkNotNullExpressionValue(d122, "get(...)");
            boolean booleanValue22 = d122.booleanValue();
            Boolean d132 = fd.b.f33003J.d(H10);
            Intrinsics.checkNotNullExpressionValue(d132, "get(...)");
            boolean booleanValue32 = d132.booleanValue();
            C3040q t102 = fd.f.t(uVar, this.f43732a.j());
            AbstractC5197E q112 = t102 == null ? this.f43732a.i().q(t102) : null;
            a0 NO_SOURCE2 = a0.f5560a;
            Intrinsics.checkNotNullExpressionValue(NO_SOURCE2, "NO_SOURCE");
            ArrayList arrayList22 = arrayList;
            arrayList22.add(new L(interfaceC0929a, null, i10, b10, b122, q102, booleanValue4, booleanValue22, booleanValue32, q112, NO_SOURCE2));
            arrayList = arrayList22;
            i10 = i11;
        }
        return CollectionsKt.O0(arrayList);
    }

    public final InterfaceC0932d i(C3027d proto, boolean z10) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        InterfaceC0941m e10 = this.f43732a.e();
        Intrinsics.e(e10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        InterfaceC0933e interfaceC0933e = (InterfaceC0933e) e10;
        int G10 = proto.G();
        EnumC4884b enumC4884b = EnumC4884b.FUNCTION;
        C5071c c5071c = new C5071c(interfaceC0933e, null, d(proto, G10, enumC4884b), z10, InterfaceC0930b.a.DECLARATION, proto, this.f43732a.g(), this.f43732a.j(), this.f43732a.k(), this.f43732a.d(), null, 1024, null);
        x f10 = m.b(this.f43732a, c5071c, CollectionsKt.j(), null, null, null, null, 60, null).f();
        List J10 = proto.J();
        Intrinsics.checkNotNullExpressionValue(J10, "getValueParameterList(...)");
        c5071c.z1(f10.o(J10, proto, enumC4884b), C.a(B.f43625a, (dd.x) fd.b.f33013d.d(proto.G())));
        c5071c.p1(interfaceC0933e.y());
        c5071c.f1(interfaceC0933e.R());
        c5071c.h1(!fd.b.f33024o.d(proto.G()).booleanValue());
        return c5071c;
    }

    public final Z j(C3032i proto) {
        AbstractC5197E q10;
        Intrinsics.checkNotNullParameter(proto, "proto");
        int Z10 = proto.p0() ? proto.Z() : k(proto.b0());
        EnumC4884b enumC4884b = EnumC4884b.FUNCTION;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g d10 = d(proto, Z10, enumC4884b);
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g g10 = fd.f.g(proto) ? g(proto, enumC4884b) : kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f36445g0.b();
        C5079k c5079k = new C5079k(this.f43732a.e(), null, d10, y.b(this.f43732a.g(), proto.a0()), C.b(B.f43625a, (EnumC3033j) fd.b.f33025p.d(Z10)), proto, this.f43732a.g(), this.f43732a.j(), Intrinsics.b(AbstractC3778c.l(this.f43732a.e()).c(y.b(this.f43732a.g(), proto.a0())), D.f43637a) ? fd.h.f33043b.b() : this.f43732a.k(), this.f43732a.d(), null, 1024, null);
        m mVar = this.f43732a;
        List i02 = proto.i0();
        Intrinsics.checkNotNullExpressionValue(i02, "getTypeParameterList(...)");
        m b10 = m.b(mVar, c5079k, i02, null, null, null, null, 60, null);
        C3040q k10 = fd.f.k(proto, this.f43732a.j());
        X i10 = (k10 == null || (q10 = b10.i().q(k10)) == null) ? null : AbstractC3565e.i(c5079k, q10, g10);
        X e10 = e();
        List c10 = fd.f.c(proto, this.f43732a.j());
        List arrayList = new ArrayList();
        int i11 = 0;
        for (Object obj : c10) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.t();
            }
            X n10 = n((C3040q) obj, b10, c5079k, i11);
            if (n10 != null) {
                arrayList.add(n10);
            }
            i11 = i12;
        }
        List j10 = b10.i().j();
        x f10 = b10.f();
        List m02 = proto.m0();
        Intrinsics.checkNotNullExpressionValue(m02, "getValueParameterList(...)");
        List o10 = f10.o(m02, proto, EnumC4884b.FUNCTION);
        AbstractC5197E q11 = b10.i().q(fd.f.m(proto, this.f43732a.j()));
        B b11 = B.f43625a;
        h(c5079k, i10, e10, arrayList, j10, o10, q11, b11.b((EnumC3034k) fd.b.f33014e.d(Z10)), C.a(b11, (dd.x) fd.b.f33013d.d(Z10)), kotlin.collections.G.h());
        Boolean d11 = fd.b.f33026q.d(Z10);
        Intrinsics.checkNotNullExpressionValue(d11, "get(...)");
        c5079k.o1(d11.booleanValue());
        Boolean d12 = fd.b.f33027r.d(Z10);
        Intrinsics.checkNotNullExpressionValue(d12, "get(...)");
        c5079k.l1(d12.booleanValue());
        Boolean d13 = fd.b.f33030u.d(Z10);
        Intrinsics.checkNotNullExpressionValue(d13, "get(...)");
        c5079k.g1(d13.booleanValue());
        Boolean d14 = fd.b.f33028s.d(Z10);
        Intrinsics.checkNotNullExpressionValue(d14, "get(...)");
        c5079k.n1(d14.booleanValue());
        Boolean d15 = fd.b.f33029t.d(Z10);
        Intrinsics.checkNotNullExpressionValue(d15, "get(...)");
        c5079k.r1(d15.booleanValue());
        Boolean d16 = fd.b.f33031v.d(Z10);
        Intrinsics.checkNotNullExpressionValue(d16, "get(...)");
        c5079k.q1(d16.booleanValue());
        Boolean d17 = fd.b.f33032w.d(Z10);
        Intrinsics.checkNotNullExpressionValue(d17, "get(...)");
        c5079k.f1(d17.booleanValue());
        c5079k.h1(!fd.b.f33033x.d(Z10).booleanValue());
        Pair a10 = this.f43732a.c().h().a(proto, c5079k, this.f43732a.j(), b10.i());
        if (a10 != null) {
            c5079k.d1((InterfaceC0929a.InterfaceC0107a) a10.c(), a10.d());
        }
        return c5079k;
    }

    public final U l(C3037n proto) {
        C3037n c3037n;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g b10;
        C5078j c5078j;
        X x10;
        m mVar;
        b.d dVar;
        b.d dVar2;
        C5078j c5078j2;
        C3037n c3037n2;
        Mc.D d10;
        Mc.D d11;
        Mc.E e10;
        x xVar;
        Mc.D d12;
        AbstractC5197E q10;
        Intrinsics.checkNotNullParameter(proto, "proto");
        int X10 = proto.l0() ? proto.X() : k(proto.a0());
        InterfaceC0941m e11 = this.f43732a.e();
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g d13 = d(proto, X10, EnumC4884b.PROPERTY);
        B b11 = B.f43625a;
        Kc.D b12 = b11.b((EnumC3034k) fd.b.f33014e.d(X10));
        AbstractC0948u a10 = C.a(b11, (dd.x) fd.b.f33013d.d(X10));
        Boolean d14 = fd.b.f33034y.d(X10);
        Intrinsics.checkNotNullExpressionValue(d14, "get(...)");
        boolean booleanValue = d14.booleanValue();
        id.f b13 = y.b(this.f43732a.g(), proto.Z());
        InterfaceC0930b.a b14 = C.b(b11, (EnumC3033j) fd.b.f33025p.d(X10));
        Boolean d15 = fd.b.f32996C.d(X10);
        Intrinsics.checkNotNullExpressionValue(d15, "get(...)");
        boolean booleanValue2 = d15.booleanValue();
        Boolean d16 = fd.b.f32995B.d(X10);
        Intrinsics.checkNotNullExpressionValue(d16, "get(...)");
        boolean booleanValue3 = d16.booleanValue();
        Boolean d17 = fd.b.f32998E.d(X10);
        Intrinsics.checkNotNullExpressionValue(d17, "get(...)");
        boolean booleanValue4 = d17.booleanValue();
        Boolean d18 = fd.b.f32999F.d(X10);
        Intrinsics.checkNotNullExpressionValue(d18, "get(...)");
        boolean booleanValue5 = d18.booleanValue();
        Boolean d19 = fd.b.f33000G.d(X10);
        Intrinsics.checkNotNullExpressionValue(d19, "get(...)");
        C5078j c5078j3 = new C5078j(e11, null, d13, b12, a10, booleanValue, b13, b14, booleanValue2, booleanValue3, booleanValue4, booleanValue5, d19.booleanValue(), proto, this.f43732a.g(), this.f43732a.j(), this.f43732a.k(), this.f43732a.d());
        m mVar2 = this.f43732a;
        List j02 = proto.j0();
        Intrinsics.checkNotNullExpressionValue(j02, "getTypeParameterList(...)");
        m b15 = m.b(mVar2, c5078j3, j02, null, null, null, null, 60, null);
        Boolean d20 = fd.b.f33035z.d(X10);
        Intrinsics.checkNotNullExpressionValue(d20, "get(...)");
        boolean booleanValue6 = d20.booleanValue();
        if (booleanValue6 && fd.f.h(proto)) {
            c3037n = proto;
            b10 = g(c3037n, EnumC4884b.PROPERTY_GETTER);
        } else {
            c3037n = proto;
            b10 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f36445g0.b();
        }
        AbstractC5197E q11 = b15.i().q(fd.f.n(c3037n, this.f43732a.j()));
        List j10 = b15.i().j();
        X e12 = e();
        C3040q l10 = fd.f.l(c3037n, this.f43732a.j());
        if (l10 == null || (q10 = b15.i().q(l10)) == null) {
            c5078j = c5078j3;
            x10 = null;
        } else {
            c5078j = c5078j3;
            x10 = AbstractC3565e.i(c5078j, q10, b10);
        }
        List d21 = fd.f.d(c3037n, this.f43732a.j());
        ArrayList arrayList = new ArrayList(CollectionsKt.u(d21, 10));
        int i10 = 0;
        for (Object obj : d21) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.t();
            }
            arrayList.add(n((C3040q) obj, b15, c5078j, i10));
            i10 = i11;
        }
        c5078j.k1(q11, j10, e12, x10, arrayList);
        Boolean d22 = fd.b.f33012c.d(X10);
        Intrinsics.checkNotNullExpressionValue(d22, "get(...)");
        boolean booleanValue7 = d22.booleanValue();
        b.d dVar3 = fd.b.f33013d;
        dd.x xVar2 = (dd.x) dVar3.d(X10);
        b.d dVar4 = fd.b.f33014e;
        int b16 = fd.b.b(booleanValue7, xVar2, (EnumC3034k) dVar4.d(X10), false, false, false);
        if (booleanValue6) {
            int Y10 = proto.m0() ? proto.Y() : b16;
            Boolean d23 = fd.b.f33004K.d(Y10);
            Intrinsics.checkNotNullExpressionValue(d23, "get(...)");
            boolean booleanValue8 = d23.booleanValue();
            Boolean d24 = fd.b.f33005L.d(Y10);
            Intrinsics.checkNotNullExpressionValue(d24, "get(...)");
            boolean booleanValue9 = d24.booleanValue();
            Boolean d25 = fd.b.f33006M.d(Y10);
            Intrinsics.checkNotNullExpressionValue(d25, "get(...)");
            boolean booleanValue10 = d25.booleanValue();
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g d26 = d(c3037n, Y10, EnumC4884b.PROPERTY_GETTER);
            if (booleanValue8) {
                B b17 = B.f43625a;
                dVar = dVar4;
                mVar = b15;
                c5078j2 = c5078j;
                dVar2 = dVar3;
                c3037n2 = c3037n;
                d12 = new Mc.D(c5078j, d26, b17.b((EnumC3034k) dVar4.d(Y10)), C.a(b17, (dd.x) dVar3.d(Y10)), !booleanValue8, booleanValue9, booleanValue10, c5078j.o(), null, a0.f5560a);
            } else {
                mVar = b15;
                dVar = dVar4;
                dVar2 = dVar3;
                c5078j2 = c5078j;
                c3037n2 = c3037n;
                Mc.D d27 = AbstractC3565e.d(c5078j2, d26);
                Intrinsics.d(d27);
                d12 = d27;
            }
            d12.Y0(c5078j2.g());
            d10 = d12;
        } else {
            mVar = b15;
            dVar = dVar4;
            dVar2 = dVar3;
            c5078j2 = c5078j;
            c3037n2 = c3037n;
            d10 = null;
        }
        Boolean d28 = fd.b.f32994A.d(X10);
        Intrinsics.checkNotNullExpressionValue(d28, "get(...)");
        if (d28.booleanValue()) {
            if (proto.t0()) {
                b16 = proto.f0();
            }
            int i12 = b16;
            Boolean d29 = fd.b.f33004K.d(i12);
            Intrinsics.checkNotNullExpressionValue(d29, "get(...)");
            boolean booleanValue11 = d29.booleanValue();
            Boolean d30 = fd.b.f33005L.d(i12);
            Intrinsics.checkNotNullExpressionValue(d30, "get(...)");
            boolean booleanValue12 = d30.booleanValue();
            Boolean d31 = fd.b.f33006M.d(i12);
            Intrinsics.checkNotNullExpressionValue(d31, "get(...)");
            boolean booleanValue13 = d31.booleanValue();
            EnumC4884b enumC4884b = EnumC4884b.PROPERTY_SETTER;
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g d32 = d(c3037n2, i12, enumC4884b);
            if (booleanValue11) {
                B b18 = B.f43625a;
                d11 = d10;
                Mc.E e13 = new Mc.E(c5078j2, d32, b18.b((EnumC3034k) dVar.d(i12)), C.a(b18, (dd.x) dVar2.d(i12)), !booleanValue11, booleanValue12, booleanValue13, c5078j2.o(), null, a0.f5560a);
                e13.Z0((j0) CollectionsKt.A0(m.b(mVar, e13, CollectionsKt.j(), null, null, null, null, 60, null).f().o(CollectionsKt.e(proto.g0()), c3037n2, enumC4884b)));
                e10 = e13;
            } else {
                d11 = d10;
                e10 = AbstractC3565e.e(c5078j2, d32, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f36445g0.b());
                Intrinsics.d(e10);
            }
        } else {
            d11 = d10;
            e10 = null;
        }
        Boolean d33 = fd.b.f32997D.d(X10);
        Intrinsics.checkNotNullExpressionValue(d33, "get(...)");
        if (d33.booleanValue()) {
            xVar = this;
            c5078j2.U0(xVar.new d(c3037n2, c5078j2));
        } else {
            xVar = this;
        }
        InterfaceC0941m e14 = xVar.f43732a.e();
        InterfaceC0933e interfaceC0933e = e14 instanceof InterfaceC0933e ? (InterfaceC0933e) e14 : null;
        if ((interfaceC0933e != null ? interfaceC0933e.o() : null) == EnumC0934f.ANNOTATION_CLASS) {
            c5078j2.U0(xVar.new e(c3037n2, c5078j2));
        }
        c5078j2.e1(d11, e10, new Mc.o(xVar.f(c3037n2, false), c5078j2), new Mc.o(xVar.f(c3037n2, true), c5078j2));
        return c5078j2;
    }

    public final e0 m(C3041r proto) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        g.a aVar = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f36445g0;
        List N10 = proto.N();
        Intrinsics.checkNotNullExpressionValue(N10, "getAnnotationList(...)");
        List<C3025b> list = N10;
        ArrayList arrayList = new ArrayList(CollectionsKt.u(list, 10));
        for (C3025b c3025b : list) {
            C4887e c4887e = this.f43733b;
            Intrinsics.d(c3025b);
            arrayList.add(c4887e.a(c3025b, this.f43732a.g()));
        }
        C5080l c5080l = new C5080l(this.f43732a.h(), this.f43732a.e(), aVar.a(arrayList), y.b(this.f43732a.g(), proto.T()), C.a(B.f43625a, (dd.x) fd.b.f33013d.d(proto.S())), proto, this.f43732a.g(), this.f43732a.j(), this.f43732a.k(), this.f43732a.d());
        m mVar = this.f43732a;
        List W10 = proto.W();
        Intrinsics.checkNotNullExpressionValue(W10, "getTypeParameterList(...)");
        m b10 = m.b(mVar, c5080l, W10, null, null, null, null, 60, null);
        c5080l.Z0(b10.i().j(), b10.i().l(fd.f.r(proto, this.f43732a.j()), false), b10.i().l(fd.f.e(proto, this.f43732a.j()), false));
        return c5080l;
    }
}
