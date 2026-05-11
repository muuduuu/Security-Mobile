package Rb;

import expo.modules.kotlin.exception.CodedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class d extends CodedException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Exception e10) {
        super("Wi-Fi information could not be acquired", e10.getCause());
        Intrinsics.checkNotNullParameter(e10, "e");
    }
}
