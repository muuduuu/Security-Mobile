package expo.modules.kotlin.exception;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class r extends CodedException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(kotlin.reflect.o desiredType, Class receivedClass) {
        super("Cannot convert received '" + receivedClass + "' to the '" + desiredType + "', because of the inner ref type mismatch", null, 2, null);
        Intrinsics.checkNotNullParameter(desiredType, "desiredType");
        Intrinsics.checkNotNullParameter(receivedClass, "receivedClass");
    }
}
