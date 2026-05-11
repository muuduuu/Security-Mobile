package expo.modules.kotlin.exception;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class f extends CodedException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String currentThreadName, String expectedThreadName) {
        super("Expected to run on " + expectedThreadName + " thread, but was run on " + currentThreadName, null, 2, null);
        Intrinsics.checkNotNullParameter(currentThreadName, "currentThreadName");
        Intrinsics.checkNotNullParameter(expectedThreadName, "expectedThreadName");
    }
}
