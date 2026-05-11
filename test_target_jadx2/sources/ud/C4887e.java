package ud;

import Kc.AbstractC0951x;
import Kc.InterfaceC0932d;
import Kc.InterfaceC0933e;
import Kc.InterfaceC0936h;
import Kc.J;
import Kc.a0;
import Kc.j0;
import com.appsflyer.attribution.RequestError;
import dd.C3025b;
import id.C3367b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import md.AbstractC3680g;
import md.AbstractC3684k;
import md.C3674a;
import md.C3675b;
import md.C3676c;
import md.C3677d;
import md.C3678e;
import md.C3681h;
import md.C3682i;
import md.C3683j;
import md.C3685l;
import md.C3686m;
import md.C3689p;
import md.C3690q;
import md.C3693t;
import md.C3694u;
import md.C3696w;
import md.C3697x;
import md.C3698y;
import md.C3699z;
import yd.AbstractC5197E;
import yd.M;

/* renamed from: ud.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4887e {

    /* renamed from: a, reason: collision with root package name */
    private final Kc.G f43663a;

    /* renamed from: b, reason: collision with root package name */
    private final J f43664b;

    /* renamed from: ud.e$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43665a;

        static {
            int[] iArr = new int[C3025b.C0455b.c.EnumC0458c.values().length];
            try {
                iArr[C3025b.C0455b.c.EnumC0458c.BYTE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C3025b.C0455b.c.EnumC0458c.CHAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C3025b.C0455b.c.EnumC0458c.SHORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[C3025b.C0455b.c.EnumC0458c.INT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[C3025b.C0455b.c.EnumC0458c.LONG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[C3025b.C0455b.c.EnumC0458c.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[C3025b.C0455b.c.EnumC0458c.DOUBLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[C3025b.C0455b.c.EnumC0458c.BOOLEAN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[C3025b.C0455b.c.EnumC0458c.STRING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[C3025b.C0455b.c.EnumC0458c.CLASS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[C3025b.C0455b.c.EnumC0458c.ENUM.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[C3025b.C0455b.c.EnumC0458c.ANNOTATION.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[C3025b.C0455b.c.EnumC0458c.ARRAY.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            f43665a = iArr;
        }
    }

    public C4887e(Kc.G module, J notFoundClasses) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
        this.f43663a = module;
        this.f43664b = notFoundClasses;
    }

    private final boolean b(AbstractC3680g abstractC3680g, AbstractC5197E abstractC5197E, C3025b.C0455b.c cVar) {
        C3025b.C0455b.c.EnumC0458c P10 = cVar.P();
        int i10 = P10 == null ? -1 : a.f43665a[P10.ordinal()];
        if (i10 == 10) {
            InterfaceC0936h d10 = abstractC5197E.W0().d();
            InterfaceC0933e interfaceC0933e = d10 instanceof InterfaceC0933e ? (InterfaceC0933e) d10 : null;
            if (interfaceC0933e != null && !Hc.g.l0(interfaceC0933e)) {
                return false;
            }
        } else {
            if (i10 != 13) {
                return Intrinsics.b(abstractC3680g.a(this.f43663a), abstractC5197E);
            }
            if (!(abstractC3680g instanceof C3675b) || ((List) ((C3675b) abstractC3680g).b()).size() != cVar.G().size()) {
                throw new IllegalStateException(("Deserialized ArrayValue should have the same number of elements as the original array value: " + abstractC3680g).toString());
            }
            AbstractC5197E k10 = c().k(abstractC5197E);
            Intrinsics.checkNotNullExpressionValue(k10, "getArrayElementType(...)");
            C3675b c3675b = (C3675b) abstractC3680g;
            Iterable k11 = CollectionsKt.k((Collection) c3675b.b());
            if (!(k11 instanceof Collection) || !((Collection) k11).isEmpty()) {
                Iterator it = k11.iterator();
                while (it.hasNext()) {
                    int a10 = ((kotlin.collections.D) it).a();
                    AbstractC3680g abstractC3680g2 = (AbstractC3680g) ((List) c3675b.b()).get(a10);
                    C3025b.C0455b.c E10 = cVar.E(a10);
                    Intrinsics.checkNotNullExpressionValue(E10, "getArrayElement(...)");
                    if (!b(abstractC3680g2, k10, E10)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private final Hc.g c() {
        return this.f43663a.v();
    }

    private final Pair d(C3025b.C0455b c0455b, Map map, fd.c cVar) {
        j0 j0Var = (j0) map.get(y.b(cVar, c0455b.t()));
        if (j0Var == null) {
            return null;
        }
        id.f b10 = y.b(cVar, c0455b.t());
        AbstractC5197E type = j0Var.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        C3025b.C0455b.c u10 = c0455b.u();
        Intrinsics.checkNotNullExpressionValue(u10, "getValue(...)");
        return new Pair(b10, g(type, u10, cVar));
    }

    private final InterfaceC0933e e(C3367b c3367b) {
        return AbstractC0951x.c(this.f43663a, c3367b, this.f43664b);
    }

    private final AbstractC3680g g(AbstractC5197E abstractC5197E, C3025b.C0455b.c cVar, fd.c cVar2) {
        AbstractC3680g f10 = f(abstractC5197E, cVar, cVar2);
        if (!b(f10, abstractC5197E, cVar)) {
            f10 = null;
        }
        if (f10 != null) {
            return f10;
        }
        return AbstractC3684k.f37484b.a("Unexpected argument value: actual type " + cVar.P() + " != expected type " + abstractC5197E);
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c a(C3025b proto, fd.c nameResolver) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        InterfaceC0933e e10 = e(y.a(nameResolver, proto.x()));
        Map h10 = kotlin.collections.G.h();
        if (proto.u() != 0 && !kotlin.reflect.jvm.internal.impl.types.error.k.m(e10) && kd.f.t(e10)) {
            Collection k10 = e10.k();
            Intrinsics.checkNotNullExpressionValue(k10, "getConstructors(...)");
            InterfaceC0932d interfaceC0932d = (InterfaceC0932d) CollectionsKt.B0(k10);
            if (interfaceC0932d != null) {
                List m10 = interfaceC0932d.m();
                Intrinsics.checkNotNullExpressionValue(m10, "getValueParameters(...)");
                List list = m10;
                LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.d.d(kotlin.collections.G.d(CollectionsKt.u(list, 10)), 16));
                for (Object obj : list) {
                    linkedHashMap.put(((j0) obj).getName(), obj);
                }
                List<C3025b.C0455b> v10 = proto.v();
                Intrinsics.checkNotNullExpressionValue(v10, "getArgumentList(...)");
                ArrayList arrayList = new ArrayList();
                for (C3025b.C0455b c0455b : v10) {
                    Intrinsics.d(c0455b);
                    Pair d10 = d(c0455b, linkedHashMap, nameResolver);
                    if (d10 != null) {
                        arrayList.add(d10);
                    }
                }
                h10 = kotlin.collections.G.r(arrayList);
            }
        }
        return new kotlin.reflect.jvm.internal.impl.descriptors.annotations.d(e10.y(), h10, a0.f5560a);
    }

    public final AbstractC3680g f(AbstractC5197E expectedType, C3025b.C0455b.c value, fd.c nameResolver) {
        AbstractC3680g c3677d;
        Intrinsics.checkNotNullParameter(expectedType, "expectedType");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Boolean d10 = fd.b.f33009P.d(value.L());
        Intrinsics.checkNotNullExpressionValue(d10, "get(...)");
        boolean booleanValue = d10.booleanValue();
        C3025b.C0455b.c.EnumC0458c P10 = value.P();
        switch (P10 == null ? -1 : a.f43665a[P10.ordinal()]) {
            case 1:
                byte N10 = (byte) value.N();
                if (booleanValue) {
                    c3677d = new C3696w(N10);
                    break;
                } else {
                    c3677d = new C3677d(N10);
                    break;
                }
            case 2:
                return new C3678e((char) value.N());
            case 3:
                short N11 = (short) value.N();
                if (booleanValue) {
                    c3677d = new C3699z(N11);
                    break;
                } else {
                    c3677d = new C3693t(N11);
                    break;
                }
            case 4:
                int N12 = (int) value.N();
                if (booleanValue) {
                    c3677d = new C3697x(N12);
                    break;
                } else {
                    c3677d = new C3686m(N12);
                    break;
                }
            case 5:
                long N13 = value.N();
                return booleanValue ? new C3698y(N13) : new C3690q(N13);
            case 6:
                return new C3685l(value.M());
            case 7:
                return new C3682i(value.J());
            case 8:
                return new C3676c(value.N() != 0);
            case 9:
                return new C3694u(nameResolver.getString(value.O()));
            case RequestError.EVENT_TIMEOUT /* 10 */:
                return new C3689p(y.a(nameResolver, value.H()), value.D());
            case 11:
                return new C3683j(y.a(nameResolver, value.H()), y.b(nameResolver, value.K()));
            case 12:
                C3025b C10 = value.C();
                Intrinsics.checkNotNullExpressionValue(C10, "getAnnotation(...)");
                return new C3674a(a(C10, nameResolver));
            case 13:
                C3681h c3681h = C3681h.f37480a;
                List G10 = value.G();
                Intrinsics.checkNotNullExpressionValue(G10, "getArrayElementList(...)");
                List<C3025b.C0455b.c> list = G10;
                ArrayList arrayList = new ArrayList(CollectionsKt.u(list, 10));
                for (C3025b.C0455b.c cVar : list) {
                    M i10 = c().i();
                    Intrinsics.checkNotNullExpressionValue(i10, "getAnyType(...)");
                    Intrinsics.d(cVar);
                    arrayList.add(f(i10, cVar, nameResolver));
                }
                return c3681h.b(arrayList, expectedType);
            default:
                throw new IllegalStateException(("Unsupported annotation argument type: " + value.P() + " (expected " + expectedType + ')').toString());
        }
        return c3677d;
    }
}
