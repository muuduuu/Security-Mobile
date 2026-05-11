package U0;

import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC1573o;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d extends m {

    /* renamed from: b, reason: collision with root package name */
    private final ViewGroup f10286b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ComponentCallbacksC1573o fragment, ViewGroup viewGroup) {
        super(fragment, "Attempting to use <fragment> tag to add fragment " + fragment + " to container " + viewGroup);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.f10286b = viewGroup;
    }
}
