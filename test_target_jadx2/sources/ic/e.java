package Ic;

import Dd.q;
import Kc.AbstractC0947t;
import Kc.D;
import Kc.InterfaceC0930b;
import Kc.InterfaceC0941m;
import Kc.InterfaceC0952y;
import Kc.X;
import Kc.a0;
import Kc.f0;
import Kc.j0;
import Mc.G;
import Mc.L;
import Mc.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yd.AbstractC5197E;
import yd.M;
import yd.n0;
import yd.u0;

/* loaded from: classes3.dex */
public final class e extends G {

    /* renamed from: E, reason: collision with root package name */
    public static final a f4413E = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final j0 b(e eVar, int i10, f0 f0Var) {
            String lowerCase;
            String c10 = f0Var.getName().c();
            Intrinsics.checkNotNullExpressionValue(c10, "asString(...)");
            if (Intrinsics.b(c10, "T")) {
                lowerCase = "instance";
            } else if (Intrinsics.b(c10, "E")) {
                lowerCase = "receiver";
            } else {
                lowerCase = c10.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            }
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g b10 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f36445g0.b();
            id.f o10 = id.f.o(lowerCase);
            Intrinsics.checkNotNullExpressionValue(o10, "identifier(...)");
            M y10 = f0Var.y();
            Intrinsics.checkNotNullExpressionValue(y10, "getDefaultType(...)");
            a0 NO_SOURCE = a0.f5560a;
            Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
            return new L(eVar, null, i10, b10, o10, y10, false, false, false, null, NO_SOURCE);
        }

        public final e a(b functionClass, boolean z10) {
            Intrinsics.checkNotNullParameter(functionClass, "functionClass");
            List B10 = functionClass.B();
            e eVar = new e(functionClass, null, InterfaceC0930b.a.DECLARATION, z10, null);
            X S02 = functionClass.S0();
            List j10 = CollectionsKt.j();
            List j11 = CollectionsKt.j();
            ArrayList arrayList = new ArrayList();
            for (Object obj : B10) {
                if (((f0) obj).u() != u0.IN_VARIANCE) {
                    break;
                }
                arrayList.add(obj);
            }
            Iterable<IndexedValue> U02 = CollectionsKt.U0(arrayList);
            ArrayList arrayList2 = new ArrayList(CollectionsKt.u(U02, 10));
            for (IndexedValue indexedValue : U02) {
                arrayList2.add(e.f4413E.b(eVar, indexedValue.c(), (f0) indexedValue.d()));
            }
            eVar.a1(null, S02, j10, j11, arrayList2, ((f0) CollectionsKt.n0(B10)).y(), D.ABSTRACT, AbstractC0947t.f5589e);
            eVar.i1(true);
            return eVar;
        }

        private a() {
        }
    }

    public /* synthetic */ e(InterfaceC0941m interfaceC0941m, e eVar, InterfaceC0930b.a aVar, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC0941m, eVar, aVar, z10);
    }

    private final InterfaceC0952y y1(List list) {
        id.f fVar;
        int size = m().size() - list.size();
        boolean z10 = true;
        if (size == 0) {
            List m10 = m();
            Intrinsics.checkNotNullExpressionValue(m10, "getValueParameters(...)");
            List<Pair> V02 = CollectionsKt.V0(list, m10);
            if (!(V02 instanceof Collection) || !V02.isEmpty()) {
                for (Pair pair : V02) {
                    if (!Intrinsics.b((id.f) pair.getFirst(), ((j0) pair.getSecond()).getName())) {
                    }
                }
            }
            return this;
        }
        List m11 = m();
        Intrinsics.checkNotNullExpressionValue(m11, "getValueParameters(...)");
        List<j0> list2 = m11;
        ArrayList arrayList = new ArrayList(CollectionsKt.u(list2, 10));
        for (j0 j0Var : list2) {
            id.f name = j0Var.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            int index = j0Var.getIndex();
            int i10 = index - size;
            if (i10 >= 0 && (fVar = (id.f) list.get(i10)) != null) {
                name = fVar;
            }
            arrayList.add(j0Var.k0(this, name, index));
        }
        p.c b12 = b1(n0.f45552b);
        List list3 = list;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                if (((id.f) it.next()) == null) {
                    break;
                }
            }
        }
        z10 = false;
        p.c g10 = b12.H(z10).e(arrayList).g(a());
        Intrinsics.checkNotNullExpressionValue(g10, "setOriginal(...)");
        InterfaceC0952y V03 = super.V0(g10);
        Intrinsics.d(V03);
        return V03;
    }

    @Override // Mc.p, Kc.InterfaceC0952y
    public boolean U() {
        return false;
    }

    @Override // Mc.G, Mc.p
    protected p U0(InterfaceC0941m newOwner, InterfaceC0952y interfaceC0952y, InterfaceC0930b.a kind, id.f fVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations, a0 source) {
        Intrinsics.checkNotNullParameter(newOwner, "newOwner");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(source, "source");
        return new e(newOwner, (e) interfaceC0952y, kind, z());
    }

    @Override // Mc.p
    protected InterfaceC0952y V0(p.c configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        e eVar = (e) super.V0(configuration);
        if (eVar == null) {
            return null;
        }
        List m10 = eVar.m();
        Intrinsics.checkNotNullExpressionValue(m10, "getValueParameters(...)");
        List list = m10;
        if ((list instanceof Collection) && list.isEmpty()) {
            return eVar;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC5197E type = ((j0) it.next()).getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            if (Hc.f.d(type) != null) {
                List m11 = eVar.m();
                Intrinsics.checkNotNullExpressionValue(m11, "getValueParameters(...)");
                List list2 = m11;
                ArrayList arrayList = new ArrayList(CollectionsKt.u(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    AbstractC5197E type2 = ((j0) it2.next()).getType();
                    Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
                    arrayList.add(Hc.f.d(type2));
                }
                return eVar.y1(arrayList);
            }
        }
        return eVar;
    }

    @Override // Mc.p, Kc.InterfaceC0952y
    public boolean p() {
        return false;
    }

    @Override // Mc.p, Kc.C
    public boolean q() {
        return false;
    }

    private e(InterfaceC0941m interfaceC0941m, e eVar, InterfaceC0930b.a aVar, boolean z10) {
        super(interfaceC0941m, eVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f36445g0.b(), q.f1566i, aVar, a0.f5560a);
        o1(true);
        q1(z10);
        h1(false);
    }
}
