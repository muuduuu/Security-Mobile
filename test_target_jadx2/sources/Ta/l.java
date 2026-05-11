package Ta;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class l {
    public static final com.bumptech.glide.k a(com.bumptech.glide.k kVar, com.bumptech.glide.request.h hVar) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        if (hVar == null) {
            return kVar;
        }
        com.bumptech.glide.k a10 = kVar.a(hVar);
        Intrinsics.checkNotNullExpressionValue(a10, "apply(...)");
        return a10;
    }

    public static final com.bumptech.glide.k b(com.bumptech.glide.k kVar, boolean z10, Function1 block) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        return !z10 ? kVar : (com.bumptech.glide.k) block.invoke(kVar);
    }
}
