package expo.modules.kotlin.exception;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class A extends AbstractC3125c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(kotlin.reflect.o recordType, CodedException cause) {
        super("Cannot create a record of the type: '" + recordType + "'.", cause);
        Intrinsics.checkNotNullParameter(recordType, "recordType");
        Intrinsics.checkNotNullParameter(cause, "cause");
    }
}
