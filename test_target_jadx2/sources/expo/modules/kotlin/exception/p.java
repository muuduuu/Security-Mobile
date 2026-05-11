package expo.modules.kotlin.exception;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class p extends AbstractC3125c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(String methodName, String moduleName, CodedException cause) {
        super("Call to function '" + moduleName + "." + methodName + "' has been rejected.", cause);
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        Intrinsics.checkNotNullParameter(cause, "cause");
    }
}
