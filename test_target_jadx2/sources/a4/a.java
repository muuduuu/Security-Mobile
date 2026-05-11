package A4;

import com.facebook.react.AbstractActivityC1928s;
import com.facebook.react.C1982v;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class a extends C1982v {

    /* renamed from: f, reason: collision with root package name */
    private final boolean f320f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(AbstractActivityC1928s activity, String mainComponentName, boolean z10) {
        super(activity, mainComponentName);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(mainComponentName, "mainComponentName");
        this.f320f = z10;
    }

    @Override // com.facebook.react.C1982v
    protected boolean isFabricEnabled() {
        return this.f320f;
    }
}
