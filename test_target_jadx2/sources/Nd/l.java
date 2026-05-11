package Nd;

import kotlin.jvm.functions.Function2;
import pc.AbstractC3868b;

/* loaded from: classes3.dex */
public abstract class l {
    public static final Object a(Function2 function2, kotlin.coroutines.d dVar) {
        k kVar = new k(dVar.getContext(), dVar);
        Object b10 = Pd.b.b(kVar, kVar, function2);
        if (b10 == AbstractC3868b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return b10;
    }
}
