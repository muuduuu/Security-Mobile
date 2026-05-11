package expo.modules.kotlin.exception;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class y extends CodedException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(String functionName) {
        super("Promise passed to '" + functionName + "' was already settled. It will lead to a crash in the production environment!", null, 2, null);
        Intrinsics.checkNotNullParameter(functionName, "functionName");
    }
}
