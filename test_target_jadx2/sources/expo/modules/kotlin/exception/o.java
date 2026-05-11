package expo.modules.kotlin.exception;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class o extends CodedException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(kotlin.reflect.m property) {
        super("Value for field '" + property + "' is required, got nil", null, 2, null);
        Intrinsics.checkNotNullParameter(property, "property");
    }
}
