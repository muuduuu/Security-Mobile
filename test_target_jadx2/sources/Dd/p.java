package Dd;

import Dd.k;
import Dd.r;
import Dd.t;
import Kc.AbstractC0946s;
import Kc.AbstractC0951x;
import Kc.InterfaceC0933e;
import Kc.InterfaceC0936h;
import Kc.InterfaceC0941m;
import Kc.InterfaceC0952y;
import Kc.X;
import Kc.e0;
import Kc.j0;
import id.C3367b;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import od.AbstractC3778c;
import sd.C4517e;
import sd.InterfaceC4519g;
import yd.AbstractC5197E;
import yd.M;

/* loaded from: classes3.dex */
public final class p extends Dd.b {

    /* renamed from: a, reason: collision with root package name */
    public static final p f1528a = new p();

    /* renamed from: b, reason: collision with root package name */
    private static final List f1529b;

    static final class a extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f1530a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(InterfaceC0952y $receiver) {
            Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
            List m10 = $receiver.m();
            Intrinsics.checkNotNullExpressionValue(m10, "getValueParameters(...)");
            j0 j0Var = (j0) CollectionsKt.p0(m10);
            boolean z10 = false;
            if (j0Var != null && !AbstractC3778c.c(j0Var) && j0Var.r0() == null) {
                z10 = true;
            }
            p pVar = p.f1528a;
            if (z10) {
                return null;
            }
            return "last parameter should not have a default value or be a vararg";
        }
    }

    static final class b extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f1531a = new b();

        b() {
            super(1);
        }

        private static final boolean b(InterfaceC0941m interfaceC0941m) {
            return (interfaceC0941m instanceof InterfaceC0933e) && Hc.g.a0((InterfaceC0933e) interfaceC0941m);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0055  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00ad A[ORIG_RETURN, RETURN] */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final String invoke(InterfaceC0952y $receiver) {
            boolean z10;
            Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
            p pVar = p.f1528a;
            InterfaceC0941m b10 = $receiver.b();
            Intrinsics.checkNotNullExpressionValue(b10, "getContainingDeclaration(...)");
            if (!b(b10)) {
                Collection f10 = $receiver.f();
                Intrinsics.checkNotNullExpressionValue(f10, "getOverriddenDescriptors(...)");
                Collection collection = f10;
                if (!collection.isEmpty()) {
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        InterfaceC0941m b11 = ((InterfaceC0952y) it.next()).b();
                        Intrinsics.checkNotNullExpressionValue(b11, "getContainingDeclaration(...)");
                        if (b(b11)) {
                            break;
                        }
                    }
                }
                if (!AbstractC0946s.c($receiver)) {
                    z10 = false;
                    if (!z10) {
                        return null;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("must override ''equals()'' in Any");
                    InterfaceC0941m b12 = $receiver.b();
                    Intrinsics.checkNotNullExpressionValue(b12, "getContainingDeclaration(...)");
                    if (kd.h.g(b12)) {
                        kotlin.reflect.jvm.internal.impl.renderer.c cVar = kotlin.reflect.jvm.internal.impl.renderer.c.f36586i;
                        InterfaceC0941m b13 = $receiver.b();
                        Intrinsics.e(b13, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                        M y10 = ((InterfaceC0933e) b13).y();
                        Intrinsics.checkNotNullExpressionValue(y10, "getDefaultType(...)");
                        sb2.append(" or define ''equals(other: " + cVar.w(Bd.a.y(y10)) + "): Boolean''");
                    }
                    String sb3 = sb2.toString();
                    Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
                    return sb3;
                }
            }
            z10 = true;
            if (!z10) {
            }
        }
    }

    static final class c extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final c f1532a = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(InterfaceC0952y $receiver) {
            boolean z10;
            Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
            X l02 = $receiver.l0();
            if (l02 == null) {
                l02 = $receiver.s0();
            }
            p pVar = p.f1528a;
            boolean z11 = false;
            if (l02 != null) {
                AbstractC5197E g10 = $receiver.g();
                if (g10 != null) {
                    AbstractC5197E type = l02.getType();
                    Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                    z10 = Bd.a.r(g10, type);
                } else {
                    z10 = false;
                }
                if (z10 || pVar.d($receiver, l02)) {
                    z11 = true;
                }
            }
            if (z11) {
                return null;
            }
            return "receiver must be a supertype of the return type";
        }
    }

    static {
        id.f fVar = q.f1568k;
        k.b bVar = k.b.f1520b;
        h hVar = new h(fVar, new f[]{bVar, new t.a(1)}, (Function1) null, 4, (DefaultConstructorMarker) null);
        h hVar2 = new h(q.f1569l, new f[]{bVar, new t.a(2)}, a.f1530a);
        id.f fVar2 = q.f1559b;
        m mVar = m.f1522a;
        t.a aVar = new t.a(2);
        j jVar = j.f1516a;
        h hVar3 = new h(fVar2, new f[]{bVar, mVar, aVar, jVar}, (Function1) null, 4, (DefaultConstructorMarker) null);
        h hVar4 = new h(q.f1560c, new f[]{bVar, mVar, new t.a(3), jVar}, (Function1) null, 4, (DefaultConstructorMarker) null);
        h hVar5 = new h(q.f1561d, new f[]{bVar, mVar, new t.b(2), jVar}, (Function1) null, 4, (DefaultConstructorMarker) null);
        h hVar6 = new h(q.f1566i, new f[]{bVar}, (Function1) null, 4, (DefaultConstructorMarker) null);
        id.f fVar3 = q.f1565h;
        t.d dVar = t.d.f1600b;
        r.a aVar2 = r.a.f1587d;
        h hVar7 = new h(fVar3, new f[]{bVar, dVar, mVar, aVar2}, (Function1) null, 4, (DefaultConstructorMarker) null);
        id.f fVar4 = q.f1567j;
        t.c cVar = t.c.f1599b;
        f1529b = CollectionsKt.m(hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, new h(fVar4, new f[]{bVar, cVar}, (Function1) null, 4, (DefaultConstructorMarker) null), new h(q.f1570m, new f[]{bVar, cVar}, (Function1) null, 4, (DefaultConstructorMarker) null), new h(q.f1571n, new f[]{bVar, cVar, aVar2}, (Function1) null, 4, (DefaultConstructorMarker) null), new h(q.f1541I, new f[]{bVar, dVar, mVar}, (Function1) null, 4, (DefaultConstructorMarker) null), new h(q.f1542J, new f[]{bVar, dVar, mVar}, (Function1) null, 4, (DefaultConstructorMarker) null), new h(q.f1562e, new f[]{k.a.f1519b}, b.f1531a), new h(q.f1564g, new f[]{bVar, r.b.f1589d, dVar, mVar}, (Function1) null, 4, (DefaultConstructorMarker) null), new h(q.f1551S, new f[]{bVar, dVar, mVar}, (Function1) null, 4, (DefaultConstructorMarker) null), new h(q.f1550R, new f[]{bVar, cVar}, (Function1) null, 4, (DefaultConstructorMarker) null), new h(CollectionsKt.m(q.f1581x, q.f1582y), new f[]{bVar}, c.f1532a), new h(q.f1554V, new f[]{bVar, r.c.f1591d, dVar, mVar}, (Function1) null, 4, (DefaultConstructorMarker) null), new h(q.f1573p, new f[]{bVar, cVar}, (Function1) null, 4, (DefaultConstructorMarker) null));
    }

    private p() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean d(InterfaceC0952y interfaceC0952y, X x10) {
        C3367b k10;
        AbstractC5197E g10;
        InterfaceC4519g value = x10.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        if (!(value instanceof C4517e)) {
            return false;
        }
        InterfaceC0933e x11 = ((C4517e) value).x();
        if (!x11.R() || (k10 = AbstractC3778c.k(x11)) == null) {
            return false;
        }
        InterfaceC0936h b10 = AbstractC0951x.b(AbstractC3778c.p(x11), k10);
        e0 e0Var = b10 instanceof e0 ? (e0) b10 : null;
        if (e0Var == null || (g10 = interfaceC0952y.g()) == null) {
            return false;
        }
        return Bd.a.r(g10, e0Var.b0());
    }

    @Override // Dd.b
    public List b() {
        return f1529b;
    }
}
