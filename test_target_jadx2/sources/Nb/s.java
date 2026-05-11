package Nb;

import expo.modules.kotlin.exception.CodedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class s extends CodedException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Exception cause) {
        super("Location request has been rejected: " + cause.getMessage(), null, 2, null);
        Intrinsics.checkNotNullParameter(cause, "cause");
    }
}
