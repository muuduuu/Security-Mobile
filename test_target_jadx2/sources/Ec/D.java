package Ec;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class D extends Error {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
