package za;

import expo.modules.kotlin.exception.CodedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class k extends CodedException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Throwable th, String kind) {
        super("Failed to get " + kind + " from clipboard", th);
        Intrinsics.checkNotNullParameter(kind, "kind");
    }
}
