package expo.modules.kotlin.exception;

import kotlin.collections.AbstractC3574i;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class h extends CodedException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(String... permissions) {
        super("Missing permissions: " + AbstractC3574i.S(permissions, ", ", null, null, 0, null, null, 62, null), null, 2, null);
        Intrinsics.checkNotNullParameter(permissions, "permissions");
    }
}
