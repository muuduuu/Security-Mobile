package Pa;

import expo.modules.kotlin.exception.CodedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class g extends CodedException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(kb.c permission) {
        super("Missing '" + permission.name() + "' permission for accessing the file.", null, 2, null);
        Intrinsics.checkNotNullParameter(permission, "permission");
    }
}
