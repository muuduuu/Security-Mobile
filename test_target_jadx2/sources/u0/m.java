package U0;

import androidx.fragment.app.ComponentCallbacksC1573o;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class m extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    private final ComponentCallbacksC1573o f10290a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ComponentCallbacksC1573o fragment, String str) {
        super(str);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.f10290a = fragment;
    }

    public final ComponentCallbacksC1573o a() {
        return this.f10290a;
    }
}
