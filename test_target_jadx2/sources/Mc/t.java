package Mc;

import Kc.InterfaceC0933e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yd.l0;

/* loaded from: classes3.dex */
public abstract class t implements InterfaceC0933e {

    /* renamed from: a, reason: collision with root package name */
    public static final a f6353a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final rd.h a(InterfaceC0933e interfaceC0933e, l0 typeSubstitution, kotlin.reflect.jvm.internal.impl.types.checker.g kotlinTypeRefiner) {
            rd.h D10;
            Intrinsics.checkNotNullParameter(interfaceC0933e, "<this>");
            Intrinsics.checkNotNullParameter(typeSubstitution, "typeSubstitution");
            Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
            t tVar = interfaceC0933e instanceof t ? (t) interfaceC0933e : null;
            if (tVar != null && (D10 = tVar.D(typeSubstitution, kotlinTypeRefiner)) != null) {
                return D10;
            }
            rd.h O02 = interfaceC0933e.O0(typeSubstitution);
            Intrinsics.checkNotNullExpressionValue(O02, "getMemberScope(...)");
            return O02;
        }

        public final rd.h b(InterfaceC0933e interfaceC0933e, kotlin.reflect.jvm.internal.impl.types.checker.g kotlinTypeRefiner) {
            rd.h N10;
            Intrinsics.checkNotNullParameter(interfaceC0933e, "<this>");
            Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
            t tVar = interfaceC0933e instanceof t ? (t) interfaceC0933e : null;
            if (tVar != null && (N10 = tVar.N(kotlinTypeRefiner)) != null) {
                return N10;
            }
            rd.h L02 = interfaceC0933e.L0();
            Intrinsics.checkNotNullExpressionValue(L02, "getUnsubstitutedMemberScope(...)");
            return L02;
        }

        private a() {
        }
    }

    protected abstract rd.h D(l0 l0Var, kotlin.reflect.jvm.internal.impl.types.checker.g gVar);

    protected abstract rd.h N(kotlin.reflect.jvm.internal.impl.types.checker.g gVar);
}
