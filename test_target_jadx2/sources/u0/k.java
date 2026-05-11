package U0;

import androidx.fragment.app.ComponentCallbacksC1573o;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k extends m {

    /* renamed from: b, reason: collision with root package name */
    private final boolean f10289b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ComponentCallbacksC1573o fragment, boolean z10) {
        super(fragment, "Attempting to set user visible hint to " + z10 + " for fragment " + fragment);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.f10289b = z10;
    }
}
