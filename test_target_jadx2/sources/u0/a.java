package U0;

import androidx.fragment.app.ComponentCallbacksC1573o;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a extends m {

    /* renamed from: b, reason: collision with root package name */
    private final String f10277b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ComponentCallbacksC1573o fragment, String previousFragmentId) {
        super(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + previousFragmentId);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(previousFragmentId, "previousFragmentId");
        this.f10277b = previousFragmentId;
    }
}
