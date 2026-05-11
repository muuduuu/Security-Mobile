package expo.modules.kotlin.exception;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class x extends AbstractC3125c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(kotlin.reflect.d viewType, CodedException cause) {
        super("Error occurred when invoking 'onViewDidUpdateProps' on '" + viewType.q() + "'", cause);
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        Intrinsics.checkNotNullParameter(cause, "cause");
    }
}
