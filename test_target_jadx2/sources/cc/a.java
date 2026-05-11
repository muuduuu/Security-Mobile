package Cc;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(IllegalAccessException cause) {
        super(cause);
        Intrinsics.checkNotNullParameter(cause, "cause");
    }
}
