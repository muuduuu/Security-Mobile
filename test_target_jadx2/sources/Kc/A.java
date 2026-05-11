package Kc;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class A extends IllegalStateException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
