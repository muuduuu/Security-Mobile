package za;

import expo.modules.kotlin.exception.CodedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class g extends CodedException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Throwable th, String kind) {
        super("Failed to save " + kind + " into clipboard", th);
        Intrinsics.checkNotNullParameter(kind, "kind");
    }
}
