package ob;

import expo.modules.kotlin.exception.CodedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class g extends CodedException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(String moduleName) {
        super("Module '" + moduleName + "' not found. Are you sure all modules are linked correctly?", null, 2, null);
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
    }
}
