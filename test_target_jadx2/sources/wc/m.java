package Wc;

import Kc.X;
import Wc.j;
import Zc.r;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import yd.AbstractC5197E;

/* loaded from: classes3.dex */
public abstract class m extends j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m(Vc.g c10) {
        super(c10, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(c10, "c");
    }

    @Override // Wc.j
    protected j.a H(r method, List methodTypeParameters, AbstractC5197E returnType, List valueParameters) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(methodTypeParameters, "methodTypeParameters");
        Intrinsics.checkNotNullParameter(returnType, "returnType");
        Intrinsics.checkNotNullParameter(valueParameters, "valueParameters");
        return new j.a(returnType, null, valueParameters, methodTypeParameters, false, CollectionsKt.j());
    }

    @Override // Wc.j
    protected void s(id.f name, Collection result) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(result, "result");
    }

    @Override // Wc.j
    protected X z() {
        return null;
    }
}
