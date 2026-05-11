package kotlin.ranges;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
class e {
    public static final void a(boolean z10, Number step) {
        Intrinsics.checkNotNullParameter(step, "step");
        if (z10) {
            return;
        }
        throw new IllegalArgumentException("Step must be positive, was: " + step + '.');
    }
}
