package yd;

import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public abstract class M extends t0 implements Ad.j, Ad.k {
    public M() {
        super(null);
    }

    public abstract M d1(boolean z10);

    public abstract M e1(a0 a0Var);

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = i().iterator();
        while (it.hasNext()) {
            StringsKt.i(sb2, "[", kotlin.reflect.jvm.internal.impl.renderer.c.s(kotlin.reflect.jvm.internal.impl.renderer.c.f36587j, (kotlin.reflect.jvm.internal.impl.descriptors.annotations.c) it.next(), null, 2, null), "] ");
        }
        sb2.append(W0());
        if (!U0().isEmpty()) {
            CollectionsKt.j0(U0(), sb2, ", ", "<", ">", 0, null, null, 112, null);
        }
        if (X0()) {
            sb2.append("?");
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }
}
