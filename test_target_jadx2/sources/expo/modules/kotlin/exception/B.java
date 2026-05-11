package expo.modules.kotlin.exception;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class B extends CodedException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(kotlin.reflect.d clazz) {
        super("Unsupported type: '" + clazz + "'", null, 2, null);
        Intrinsics.checkNotNullParameter(clazz, "clazz");
    }
}
