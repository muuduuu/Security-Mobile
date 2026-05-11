package Nb;

import expo.modules.kotlin.exception.CodedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class z extends CodedException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(String permissionName) {
        super("You need to add `" + permissionName + "` to the AndroidManifest", null, 2, null);
        Intrinsics.checkNotNullParameter(permissionName, "permissionName");
    }
}
