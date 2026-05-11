package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class i {
    public static final g a(g first, g second) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        return first.isEmpty() ? second : second.isEmpty() ? first : new k(first, second);
    }
}
