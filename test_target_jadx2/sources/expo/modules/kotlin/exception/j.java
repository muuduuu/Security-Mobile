package expo.modules.kotlin.exception;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class j extends CodedException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(kotlin.reflect.d clazz) {
        super(clazz + " module not found, make sure that everything is linked correctly", null, 2, null);
        Intrinsics.checkNotNullParameter(clazz, "clazz");
    }
}
