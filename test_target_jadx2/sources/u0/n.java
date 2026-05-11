package U0;

import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC1573o;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class n extends m {

    /* renamed from: b, reason: collision with root package name */
    private final ViewGroup f10291b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ComponentCallbacksC1573o fragment, ViewGroup container) {
        super(fragment, "Attempting to add fragment " + fragment + " to container " + container + " which is not a FragmentContainerView");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(container, "container");
        this.f10291b = container;
    }
}
