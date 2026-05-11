package Od;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class B {
    public static final A b(Object obj) {
        if (obj == AbstractC1073a.f7314a) {
            throw new IllegalStateException("Does not contain segment");
        }
        Intrinsics.e(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
        return (A) obj;
    }

    public static final boolean c(Object obj) {
        return obj == AbstractC1073a.f7314a;
    }

    public static Object a(Object obj) {
        return obj;
    }
}
