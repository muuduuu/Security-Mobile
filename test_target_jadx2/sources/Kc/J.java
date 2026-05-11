package Kc;

import Mc.AbstractC0981g;
import Mc.C0987m;
import id.C3367b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import od.AbstractC3778c;
import rd.h;
import yd.C5209k;
import yd.u0;

/* loaded from: classes3.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    private final xd.n f5534a;

    /* renamed from: b, reason: collision with root package name */
    private final G f5535b;

    /* renamed from: c, reason: collision with root package name */
    private final xd.g f5536c;

    /* renamed from: d, reason: collision with root package name */
    private final xd.g f5537d;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final C3367b f5538a;

        /* renamed from: b, reason: collision with root package name */
        private final List f5539b;

        public a(C3367b classId, List typeParametersCount) {
            Intrinsics.checkNotNullParameter(classId, "classId");
            Intrinsics.checkNotNullParameter(typeParametersCount, "typeParametersCount");
            this.f5538a = classId;
            this.f5539b = typeParametersCount;
        }

        public final C3367b a() {
            return this.f5538a;
        }

        public final List b() {
            return this.f5539b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.b(this.f5538a, aVar.f5538a) && Intrinsics.b(this.f5539b, aVar.f5539b);
        }

        public int hashCode() {
            return (this.f5538a.hashCode() * 31) + this.f5539b.hashCode();
        }

        public String toString() {
            return "ClassRequest(classId=" + this.f5538a + ", typeParametersCount=" + this.f5539b + ')';
        }
    }

    public static final class b extends AbstractC0981g {

        /* renamed from: i, reason: collision with root package name */
        private final boolean f5540i;

        /* renamed from: j, reason: collision with root package name */
        private final List f5541j;

        /* renamed from: k, reason: collision with root package name */
        private final C5209k f5542k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(xd.n storageManager, InterfaceC0941m container, id.f name, boolean z10, int i10) {
            super(storageManager, container, name, a0.f5560a, false);
            Intrinsics.checkNotNullParameter(storageManager, "storageManager");
            Intrinsics.checkNotNullParameter(container, "container");
            Intrinsics.checkNotNullParameter(name, "name");
            this.f5540i = z10;
            IntRange p10 = kotlin.ranges.d.p(0, i10);
            ArrayList arrayList = new ArrayList(CollectionsKt.u(p10, 10));
            Iterator it = p10.iterator();
            while (it.hasNext()) {
                int a10 = ((kotlin.collections.D) it).a();
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.g b10 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f36445g0.b();
                u0 u0Var = u0.INVARIANT;
                StringBuilder sb2 = new StringBuilder();
                sb2.append('T');
                sb2.append(a10);
                arrayList.add(Mc.K.a1(this, b10, false, u0Var, id.f.o(sb2.toString()), a10, storageManager));
            }
            this.f5541j = arrayList;
            this.f5542k = new C5209k(this, g0.d(this), kotlin.collections.O.c(AbstractC3778c.p(this).v().i()), storageManager);
        }

        @Override // Kc.InterfaceC0933e, Kc.InterfaceC0937i
        public List B() {
            return this.f5541j;
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
        public Collection P() {
            return CollectionsKt.j();
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
            return this.f5540i;
        }

        @Override // Kc.InterfaceC0933e
        /* renamed from: T0, reason: merged with bridge method [inline-methods] */
        public h.b X() {
            return h.b.f40647b;
        }

        @Override // Kc.InterfaceC0936h
        /* renamed from: U0, reason: merged with bridge method [inline-methods] */
        public C5209k r() {
            return this.f5542k;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // Mc.t
        /* renamed from: V0, reason: merged with bridge method [inline-methods] */
        public h.b N(kotlin.reflect.jvm.internal.impl.types.checker.g kotlinTypeRefiner) {
            Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
            return h.b.f40647b;
        }

        @Override // Kc.InterfaceC0933e
        public InterfaceC0932d W() {
            return null;
        }

        @Override // Kc.InterfaceC0933e
        public InterfaceC0933e Z() {
            return null;
        }

        @Override // Kc.InterfaceC0933e, Kc.InterfaceC0945q, Kc.C
        public AbstractC0948u h() {
            AbstractC0948u PUBLIC = AbstractC0947t.f5589e;
            Intrinsics.checkNotNullExpressionValue(PUBLIC, "PUBLIC");
            return PUBLIC;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
        public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g i() {
            return kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f36445g0.b();
        }

        @Override // Kc.InterfaceC0933e
        public Collection k() {
            return kotlin.collections.O.d();
        }

        @Override // Kc.InterfaceC0933e
        public EnumC0934f o() {
            return EnumC0934f.CLASS;
        }

        @Override // Kc.InterfaceC0933e
        public boolean p() {
            return false;
        }

        @Override // Mc.AbstractC0981g, Kc.C
        public boolean q() {
            return false;
        }

        @Override // Kc.InterfaceC0933e, Kc.C
        public D s() {
            return D.FINAL;
        }

        public String toString() {
            return "class " + getName() + " (not found)";
        }
    }

    static final class c extends xc.m implements Function1 {
        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC0933e invoke(a aVar) {
            InterfaceC0941m interfaceC0941m;
            Intrinsics.checkNotNullParameter(aVar, "<name for destructuring parameter 0>");
            C3367b a10 = aVar.a();
            List b10 = aVar.b();
            if (a10.k()) {
                throw new UnsupportedOperationException("Unresolved local class: " + a10);
            }
            C3367b g10 = a10.g();
            if (g10 == null || (interfaceC0941m = J.this.d(g10, CollectionsKt.X(b10, 1))) == null) {
                xd.g gVar = J.this.f5536c;
                id.c h10 = a10.h();
                Intrinsics.checkNotNullExpressionValue(h10, "getPackageFqName(...)");
                interfaceC0941m = (InterfaceC0935g) gVar.invoke(h10);
            }
            InterfaceC0941m interfaceC0941m2 = interfaceC0941m;
            boolean l10 = a10.l();
            xd.n nVar = J.this.f5534a;
            id.f j10 = a10.j();
            Intrinsics.checkNotNullExpressionValue(j10, "getShortClassName(...)");
            Integer num = (Integer) CollectionsKt.firstOrNull(b10);
            return new b(nVar, interfaceC0941m2, j10, l10, num != null ? num.intValue() : 0);
        }
    }

    static final class d extends xc.m implements Function1 {
        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final K invoke(id.c fqName) {
            Intrinsics.checkNotNullParameter(fqName, "fqName");
            return new C0987m(J.this.f5535b, fqName);
        }
    }

    public J(xd.n storageManager, G module) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(module, "module");
        this.f5534a = storageManager;
        this.f5535b = module;
        this.f5536c = storageManager.h(new d());
        this.f5537d = storageManager.h(new c());
    }

    public final InterfaceC0933e d(C3367b classId, List typeParametersCount) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        Intrinsics.checkNotNullParameter(typeParametersCount, "typeParametersCount");
        return (InterfaceC0933e) this.f5537d.invoke(new a(classId, typeParametersCount));
    }
}
