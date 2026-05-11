package Pb;

import expo.modules.kotlin.exception.CodedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a extends CodedException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String message) {
        super(message, null, 2, null);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
