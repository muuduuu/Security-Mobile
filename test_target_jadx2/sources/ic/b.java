package Ic;

import Hc.j;
import Ic.f;
import Kc.AbstractC0947t;
import Kc.AbstractC0948u;
import Kc.AbstractC0951x;
import Kc.EnumC0934f;
import Kc.G;
import Kc.InterfaceC0932d;
import Kc.InterfaceC0933e;
import Kc.K;
import Kc.d0;
import Kc.f0;
import Kc.h0;
import Mc.AbstractC0975a;
import id.C3367b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import rd.h;
import xd.n;
import yd.AbstractC5200b;
import yd.C5198F;
import yd.a0;
import yd.e0;
import yd.k0;
import yd.u0;

/* loaded from: classes3.dex */
public final class b extends AbstractC0975a {

    /* renamed from: n, reason: collision with root package name */
    public static final a f4401n = new a(null);

    /* renamed from: o, reason: collision with root package name */
    private static final C3367b f4402o = new C3367b(j.f3891y, id.f.o("Function"));

    /* renamed from: p, reason: collision with root package name */
    private static final C3367b f4403p = new C3367b(j.f3888v, id.f.o("KFunction"));

    /* renamed from: f, reason: collision with root package name */
    private final n f4404f;

    /* renamed from: g, reason: collision with root package name */
    private final K f4405g;

    /* renamed from: h, reason: collision with root package name */
    private final f f4406h;

    /* renamed from: i, reason: collision with root package name */
    private final int f4407i;

    /* renamed from: j, reason: collision with root package name */
    private final C0090b f4408j;

    /* renamed from: k, reason: collision with root package name */
    private final d f4409k;

    /* renamed from: l, reason: collision with root package name */
    private final List f4410l;

    /* renamed from: m, reason: collision with root package name */
    private final c f4411m;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: Ic.b$b, reason: collision with other inner class name */
    private final class C0090b extends AbstractC5200b {
        public C0090b() {
            super(b.this.f4404f);
        }

        @Override // yd.e0
        public List c() {
            return b.this.f4410l;
        }

        @Override // yd.e0
        public boolean e() {
            return true;
        }

        @Override // yd.AbstractC5204f
        protected Collection l() {
            List m10;
            f d12 = b.this.d1();
            f.a aVar = f.a.f4418e;
            if (Intrinsics.b(d12, aVar)) {
                m10 = CollectionsKt.e(b.f4402o);
            } else if (Intrinsics.b(d12, f.b.f4419e)) {
                m10 = CollectionsKt.m(b.f4403p, new C3367b(j.f3891y, aVar.c(b.this.Z0())));
            } else {
                f.d dVar = f.d.f4421e;
                if (Intrinsics.b(d12, dVar)) {
                    m10 = CollectionsKt.e(b.f4402o);
                } else {
                    if (!Intrinsics.b(d12, f.c.f4420e)) {
                        Hd.a.b(null, 1, null);
                        throw null;
                    }
                    m10 = CollectionsKt.m(b.f4403p, new C3367b(j.f3883q, dVar.c(b.this.Z0())));
                }
            }
            G b10 = b.this.f4405g.b();
            List<C3367b> list = m10;
            ArrayList arrayList = new ArrayList(CollectionsKt.u(list, 10));
            for (C3367b c3367b : list) {
                InterfaceC0933e a10 = AbstractC0951x.a(b10, c3367b);
                if (a10 == null) {
                    throw new IllegalStateException(("Built-in class " + c3367b + " not found").toString());
                }
                List H02 = CollectionsKt.H0(c(), a10.r().c().size());
                ArrayList arrayList2 = new ArrayList(CollectionsKt.u(H02, 10));
                Iterator it = H02.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new k0(((f0) it.next()).y()));
                }
                arrayList.add(C5198F.g(a0.f45478b.i(), a10, arrayList2));
            }
            return CollectionsKt.O0(arrayList);
        }

        @Override // yd.AbstractC5204f
        protected d0 p() {
            return d0.a.f5565a;
        }

        public String toString() {
            return d().toString();
        }

        @Override // yd.AbstractC5200b
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public b d() {
            return b.this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(n storageManager, K containingDeclaration, f functionTypeKind, int i10) {
        super(storageManager, functionTypeKind.c(i10));
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        Intrinsics.checkNotNullParameter(functionTypeKind, "functionTypeKind");
        this.f4404f = storageManager;
        this.f4405g = containingDeclaration;
        this.f4406h = functionTypeKind;
        this.f4407i = i10;
        this.f4408j = new C0090b();
        this.f4409k = new d(storageManager, this);
        ArrayList arrayList = new ArrayList();
        IntRange intRange = new IntRange(1, i10);
        ArrayList arrayList2 = new ArrayList(CollectionsKt.u(intRange, 10));
        Iterator it = intRange.iterator();
        while (it.hasNext()) {
            int a10 = ((D) it).a();
            u0 u0Var = u0.IN_VARIANCE;
            StringBuilder sb2 = new StringBuilder();
            sb2.append('P');
            sb2.append(a10);
            T0(arrayList, this, u0Var, sb2.toString());
            arrayList2.add(Unit.f36324a);
        }
        T0(arrayList, this, u0.OUT_VARIANCE, "R");
        this.f4410l = CollectionsKt.O0(arrayList);
        this.f4411m = c.Companion.a(this.f4406h);
    }

    private static final void T0(ArrayList arrayList, b bVar, u0 u0Var, String str) {
        arrayList.add(Mc.K.a1(bVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f36445g0.b(), false, u0Var, id.f.o(str), arrayList.size(), bVar.f4404f));
    }

    @Override // Kc.InterfaceC0933e, Kc.InterfaceC0937i
    public List B() {
        return this.f4410l;
    }

    @Override // Kc.InterfaceC0933e
    public boolean F() {
        return false;
    }

    @Override // Kc.InterfaceC0933e
    public h0 H0() {
        return null;
    }

    @Override // Kc.InterfaceC0933e
    public boolean J() {
        return false;
    }

    @Override // Kc.C
    public boolean M0() {
        return false;
    }

    @Override // Kc.InterfaceC0933e
    public boolean Q() {
        return false;
    }

    @Override // Kc.C
    public boolean R() {
        return false;
    }

    @Override // Kc.InterfaceC0933e
    public boolean R0() {
        return false;
    }

    @Override // Kc.InterfaceC0937i
    public boolean S() {
        return false;
    }

    @Override // Kc.InterfaceC0933e
    public /* bridge */ /* synthetic */ InterfaceC0932d W() {
        return (InterfaceC0932d) h1();
    }

    @Override // Kc.InterfaceC0933e
    public /* bridge */ /* synthetic */ InterfaceC0933e Z() {
        return (InterfaceC0933e) a1();
    }

    public final int Z0() {
        return this.f4407i;
    }

    public Void a1() {
        return null;
    }

    @Override // Kc.InterfaceC0933e
    /* renamed from: b1, reason: merged with bridge method [inline-methods] */
    public List k() {
        return CollectionsKt.j();
    }

    @Override // Kc.InterfaceC0933e, Kc.InterfaceC0942n, Kc.InterfaceC0941m
    /* renamed from: c1, reason: merged with bridge method [inline-methods] */
    public K b() {
        return this.f4405g;
    }

    public final f d1() {
        return this.f4406h;
    }

    @Override // Kc.InterfaceC0933e
    /* renamed from: e1, reason: merged with bridge method [inline-methods] */
    public List P() {
        return CollectionsKt.j();
    }

    @Override // Kc.InterfaceC0933e
    /* renamed from: f1, reason: merged with bridge method [inline-methods] */
    public h.b X() {
        return h.b.f40647b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Mc.t
    /* renamed from: g1, reason: merged with bridge method [inline-methods] */
    public d N(kotlin.reflect.jvm.internal.impl.types.checker.g kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this.f4409k;
    }

    @Override // Kc.InterfaceC0933e, Kc.InterfaceC0945q, Kc.C
    public AbstractC0948u h() {
        AbstractC0948u PUBLIC = AbstractC0947t.f5589e;
        Intrinsics.checkNotNullExpressionValue(PUBLIC, "PUBLIC");
        return PUBLIC;
    }

    public Void h1() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g i() {
        return kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f36445g0.b();
    }

    @Override // Kc.InterfaceC0944p
    public Kc.a0 j() {
        Kc.a0 NO_SOURCE = Kc.a0.f5560a;
        Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
        return NO_SOURCE;
    }

    @Override // Kc.InterfaceC0933e
    public EnumC0934f o() {
        return EnumC0934f.INTERFACE;
    }

    @Override // Kc.InterfaceC0933e
    public boolean p() {
        return false;
    }

    @Override // Kc.C
    public boolean q() {
        return false;
    }

    @Override // Kc.InterfaceC0936h
    public e0 r() {
        return this.f4408j;
    }

    @Override // Kc.InterfaceC0933e, Kc.C
    public Kc.D s() {
        return Kc.D.ABSTRACT;
    }

    public String toString() {
        String c10 = getName().c();
        Intrinsics.checkNotNullExpressionValue(c10, "asString(...)");
        return c10;
    }
}
