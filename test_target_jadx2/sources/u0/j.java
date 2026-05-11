package U0;

import androidx.fragment.app.ComponentCallbacksC1573o;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j extends l {

    /* renamed from: b, reason: collision with root package name */
    private final ComponentCallbacksC1573o f10287b;

    /* renamed from: c, reason: collision with root package name */
    private final int f10288c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ComponentCallbacksC1573o fragment, ComponentCallbacksC1573o targetFragment, int i10) {
        super(fragment, "Attempting to set target fragment " + targetFragment + " with request code " + i10 + " for fragment " + fragment);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(targetFragment, "targetFragment");
        this.f10287b = targetFragment;
        this.f10288c = i10;
    }
}
