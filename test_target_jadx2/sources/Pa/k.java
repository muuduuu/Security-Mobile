package Pa;

import expo.modules.kotlin.exception.CodedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class k extends CodedException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String reason) {
        super("Unable to download a file: " + reason, null, 2, null);
        Intrinsics.checkNotNullParameter(reason, "reason");
    }
}
