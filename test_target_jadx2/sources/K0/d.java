package k0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class d {
    public static final void a(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        throw new IllegalArgumentException(message);
    }

    public static final void b(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        throw new IllegalStateException(message);
    }
}
