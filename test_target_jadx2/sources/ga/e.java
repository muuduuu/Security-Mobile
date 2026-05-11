package Ga;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class e {
    public static final String a(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        String localizedMessage = th.getLocalizedMessage();
        Throwable cause = th.getCause();
        return CollectionsKt.l0(CollectionsKt.o(localizedMessage, cause != null ? a(cause) : null), ": ", null, null, 0, null, null, 62, null);
    }
}
