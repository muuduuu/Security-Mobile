package Sc;

import Kc.InterfaceC0929a;
import Kc.InterfaceC0933e;
import Kc.X;
import Kc.Z;
import Kc.j0;
import java.util.List;
import kd.g;
import kd.l;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import yd.AbstractC5197E;

/* loaded from: classes3.dex */
public final class l implements kd.g {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9040a;

        static {
            int[] iArr = new int[l.i.a.values().length];
            try {
                iArr[l.i.a.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f9040a = iArr;
        }
    }

    static final class b extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f9041a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC5197E invoke(j0 j0Var) {
            return j0Var.getType();
        }
    }

    @Override // kd.g
    public g.a a() {
        return g.a.SUCCESS_ONLY;
    }

    @Override // kd.g
    public g.b b(InterfaceC0929a superDescriptor, InterfaceC0929a subDescriptor, InterfaceC0933e interfaceC0933e) {
        Intrinsics.checkNotNullParameter(superDescriptor, "superDescriptor");
        Intrinsics.checkNotNullParameter(subDescriptor, "subDescriptor");
        if (subDescriptor instanceof Uc.e) {
            Uc.e eVar = (Uc.e) subDescriptor;
            List n10 = eVar.n();
            Intrinsics.checkNotNullExpressionValue(n10, "getTypeParameters(...)");
            if (n10.isEmpty()) {
                l.i w10 = kd.l.w(superDescriptor, subDescriptor);
                if ((w10 != null ? w10.c() : null) != null) {
                    return g.b.UNKNOWN;
                }
                List m10 = eVar.m();
                Intrinsics.checkNotNullExpressionValue(m10, "getValueParameters(...)");
                Sequence w11 = kotlin.sequences.j.w(CollectionsKt.T(m10), b.f9041a);
                AbstractC5197E g10 = eVar.g();
                Intrinsics.d(g10);
                Sequence z10 = kotlin.sequences.j.z(w11, g10);
                X s02 = eVar.s0();
                for (AbstractC5197E abstractC5197E : kotlin.sequences.j.y(z10, CollectionsKt.n(s02 != null ? s02.getType() : null))) {
                    if (!abstractC5197E.U0().isEmpty() && !(abstractC5197E.Z0() instanceof Xc.h)) {
                        return g.b.UNKNOWN;
                    }
                }
                InterfaceC0929a interfaceC0929a = (InterfaceC0929a) superDescriptor.c(new Xc.g(null, 1, null).c());
                if (interfaceC0929a == null) {
                    return g.b.UNKNOWN;
                }
                if (interfaceC0929a instanceof Z) {
                    Z z11 = (Z) interfaceC0929a;
                    List n11 = z11.n();
                    Intrinsics.checkNotNullExpressionValue(n11, "getTypeParameters(...)");
                    if (!n11.isEmpty()) {
                        interfaceC0929a = z11.A().o(CollectionsKt.j()).c();
                        Intrinsics.d(interfaceC0929a);
                    }
                }
                l.i.a c10 = kd.l.f36296f.F(interfaceC0929a, subDescriptor, false).c();
                Intrinsics.checkNotNullExpressionValue(c10, "getResult(...)");
                return a.f9040a[c10.ordinal()] == 1 ? g.b.OVERRIDABLE : g.b.UNKNOWN;
            }
        }
        return g.b.UNKNOWN;
    }
}
