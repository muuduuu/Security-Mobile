package expo.modules.kotlin.exception;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class t extends CodedException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(kotlin.reflect.o sharedType) {
        super("Cannot convert provided JavaScriptObject to the '" + sharedType + "', because the native type doesn't match", null, 2, null);
        Intrinsics.checkNotNullParameter(sharedType, "sharedType");
    }
}
