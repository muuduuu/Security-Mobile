package expo.modules.kotlin.exception;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class z extends AbstractC3125c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(String propName, kotlin.reflect.d viewType, CodedException cause) {
        super("Cannot set prop '" + propName + "' on view '" + viewType + "'", cause);
        Intrinsics.checkNotNullParameter(propName, "propName");
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        Intrinsics.checkNotNullParameter(cause, "cause");
    }
}
