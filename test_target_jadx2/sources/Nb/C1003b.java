package Nb;

import expo.modules.kotlin.exception.CodedException;
import kotlin.jvm.internal.Intrinsics;
import xc.C5142C;

/* renamed from: Nb.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1003b extends CodedException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1003b(Class fromClass, Class toClass, String str) {
        super("Couldn't cast from " + C5142C.b(fromClass.getClass()).q() + " to " + toClass.getClass().getSimpleName() + ": " + str, null, 2, null);
        Intrinsics.checkNotNullParameter(fromClass, "fromClass");
        Intrinsics.checkNotNullParameter(toClass, "toClass");
    }
}
