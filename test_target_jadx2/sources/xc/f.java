package Xc;

import Kc.f0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import lc.m;
import od.AbstractC3778c;
import yd.AbstractC5197E;
import yd.AbstractC5219v;
import yd.AbstractC5220w;
import yd.h0;
import yd.i0;
import yd.k0;
import yd.q0;
import yd.u0;

/* loaded from: classes3.dex */
public final class f extends AbstractC5219v {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11868a;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.FLEXIBLE_LOWER_BOUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.FLEXIBLE_UPPER_BOUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.INFLEXIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f11868a = iArr;
        }
    }

    @Override // yd.AbstractC5219v
    public i0 a(f0 parameter, AbstractC5220w typeAttr, h0 typeParameterUpperBoundEraser, AbstractC5197E erasedUpperBound) {
        i0 k0Var;
        Intrinsics.checkNotNullParameter(parameter, "parameter");
        Intrinsics.checkNotNullParameter(typeAttr, "typeAttr");
        Intrinsics.checkNotNullParameter(typeParameterUpperBoundEraser, "typeParameterUpperBoundEraser");
        Intrinsics.checkNotNullParameter(erasedUpperBound, "erasedUpperBound");
        if (!(typeAttr instanceof Xc.a)) {
            return super.a(parameter, typeAttr, typeParameterUpperBoundEraser, erasedUpperBound);
        }
        Xc.a aVar = (Xc.a) typeAttr;
        if (!aVar.i()) {
            aVar = aVar.l(c.INFLEXIBLE);
        }
        int i10 = a.f11868a[aVar.g().ordinal()];
        if (i10 == 1) {
            return new k0(u0.INVARIANT, erasedUpperBound);
        }
        if (i10 != 2 && i10 != 3) {
            throw new m();
        }
        if (parameter.u().getAllowsOutPosition()) {
            List c10 = erasedUpperBound.W0().c();
            Intrinsics.checkNotNullExpressionValue(c10, "getParameters(...)");
            k0Var = !c10.isEmpty() ? new k0(u0.OUT_VARIANCE, erasedUpperBound) : q0.t(parameter, aVar);
        } else {
            k0Var = new k0(u0.INVARIANT, AbstractC3778c.j(parameter).H());
        }
        Intrinsics.d(k0Var);
        return k0Var;
    }
}
