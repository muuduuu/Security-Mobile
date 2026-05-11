package Wc;

import Kc.InterfaceC0941m;
import Kc.a0;
import Mc.AbstractC0976b;
import Zc.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import yd.AbstractC5197E;
import yd.C5198F;
import yd.M;
import yd.p0;
import yd.u0;

/* loaded from: classes3.dex */
public final class n extends AbstractC0976b {

    /* renamed from: k, reason: collision with root package name */
    private final Vc.g f11573k;

    /* renamed from: l, reason: collision with root package name */
    private final y f11574l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Vc.g c10, y javaTypeParameter, int i10, InterfaceC0941m containingDeclaration) {
        super(c10.e(), containingDeclaration, new Vc.d(c10, javaTypeParameter, false, 4, null), javaTypeParameter.getName(), u0.INVARIANT, false, i10, a0.f5560a, c10.a().v());
        Intrinsics.checkNotNullParameter(c10, "c");
        Intrinsics.checkNotNullParameter(javaTypeParameter, "javaTypeParameter");
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        this.f11573k = c10;
        this.f11574l = javaTypeParameter;
    }

    private final List V0() {
        Collection upperBounds = this.f11574l.getUpperBounds();
        if (upperBounds.isEmpty()) {
            M i10 = this.f11573k.d().v().i();
            Intrinsics.checkNotNullExpressionValue(i10, "getAnyType(...)");
            M I10 = this.f11573k.d().v().I();
            Intrinsics.checkNotNullExpressionValue(I10, "getNullableAnyType(...)");
            return CollectionsKt.e(C5198F.d(i10, I10));
        }
        Collection collection = upperBounds;
        ArrayList arrayList = new ArrayList(CollectionsKt.u(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f11573k.g().o((Zc.j) it.next(), Xc.b.b(p0.COMMON, false, false, this, 3, null)));
        }
        return arrayList;
    }

    @Override // Mc.AbstractC0979e
    protected List N0(List bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        return this.f11573k.a().r().i(this, bounds, this.f11573k);
    }

    @Override // Mc.AbstractC0979e
    protected void T0(AbstractC5197E type) {
        Intrinsics.checkNotNullParameter(type, "type");
    }

    @Override // Mc.AbstractC0979e
    protected List U0() {
        return V0();
    }
}
