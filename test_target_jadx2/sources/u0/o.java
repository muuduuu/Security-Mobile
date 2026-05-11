package U0;

import androidx.fragment.app.ComponentCallbacksC1573o;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o extends m {

    /* renamed from: b, reason: collision with root package name */
    private final ComponentCallbacksC1573o f10292b;

    /* renamed from: c, reason: collision with root package name */
    private final int f10293c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(ComponentCallbacksC1573o fragment, ComponentCallbacksC1573o expectedParentFragment, int i10) {
        super(fragment, "Attempting to nest fragment " + fragment + " within the view of parent fragment " + expectedParentFragment + " via container with ID " + i10 + " without using parent's childFragmentManager");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(expectedParentFragment, "expectedParentFragment");
        this.f10292b = expectedParentFragment;
        this.f10293c = i10;
    }
}
