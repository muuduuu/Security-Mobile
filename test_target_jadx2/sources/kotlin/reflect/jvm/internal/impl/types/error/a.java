package kotlin.reflect.jvm.internal.impl.types.error;

import Kc.AbstractC0947t;
import Kc.D;
import Kc.EnumC0934f;
import Kc.G;
import Kc.InterfaceC0933e;
import Kc.a0;
import Mc.C0980f;
import Mc.C0982h;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.O;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;
import yd.l0;
import yd.n0;

/* loaded from: classes3.dex */
public final class a extends C0982h {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(id.f name) {
        super(r2, name, r4, r5, r6, r10, false, xd.f.f45006e);
        Intrinsics.checkNotNullParameter(name, "name");
        k kVar = k.f36726a;
        G i10 = kVar.i();
        D d10 = D.OPEN;
        EnumC0934f enumC0934f = EnumC0934f.CLASS;
        List j10 = CollectionsKt.j();
        a0 a0Var = a0.f5560a;
        C0980f w12 = C0980f.w1(this, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f36445g0.b(), true, a0Var);
        w12.z1(CollectionsKt.j(), AbstractC0947t.f5588d);
        Intrinsics.checkNotNullExpressionValue(w12, "apply(...)");
        g gVar = g.SCOPE_FOR_ERROR_CLASS;
        String fVar = w12.getName().toString();
        Intrinsics.checkNotNullExpressionValue(fVar, "toString(...)");
        rd.h b10 = k.b(gVar, fVar, BuildConfig.FLAVOR);
        j jVar = j.ERROR_CLASS;
        w12.p1(new h(kVar.e(jVar, new String[0]), b10, jVar, null, false, new String[0], 24, null));
        T0(b10, O.c(w12), w12);
    }

    @Override // Mc.AbstractC0975a, Mc.t
    public rd.h D(l0 typeSubstitution, kotlin.reflect.jvm.internal.impl.types.checker.g kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(typeSubstitution, "typeSubstitution");
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        g gVar = g.SCOPE_FOR_ERROR_CLASS;
        String fVar = getName().toString();
        Intrinsics.checkNotNullExpressionValue(fVar, "toString(...)");
        return k.b(gVar, fVar, typeSubstitution.toString());
    }

    @Override // Mc.AbstractC0975a, Kc.c0
    /* renamed from: N0, reason: merged with bridge method [inline-methods] */
    public InterfaceC0933e c(n0 substitutor) {
        Intrinsics.checkNotNullParameter(substitutor, "substitutor");
        return this;
    }

    @Override // Mc.C0982h
    public String toString() {
        String c10 = getName().c();
        Intrinsics.checkNotNullExpressionValue(c10, "asString(...)");
        return c10;
    }
}
