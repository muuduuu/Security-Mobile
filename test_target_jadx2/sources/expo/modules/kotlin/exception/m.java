package expo.modules.kotlin.exception;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class m extends CodedException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(kotlin.reflect.d viewType, int i10) {
        super("Unable to find the " + viewType + " view with tag " + i10, null, 2, null);
        Intrinsics.checkNotNullParameter(viewType, "viewType");
    }
}
