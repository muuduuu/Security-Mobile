package V9;

import android.graphics.Point;
import com.facebook.react.uimanager.C1971u0;
import com.facebook.react.uimanager.F0;
import com.facebook.react.uimanager.V;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c extends V {
    @Override // com.facebook.react.uimanager.C1971u0, com.facebook.react.uimanager.InterfaceC1969t0
    /* renamed from: f0 */
    public void K(C1971u0 child, int i10) {
        Intrinsics.checkNotNullParameter(child, "child");
        super.K(child, i10);
        F0 H10 = H();
        Intrinsics.checkNotNullExpressionValue(H10, "getThemedContext(...)");
        Point a10 = L9.c.a(H10);
        child.C(a10.x);
        child.g(a10.y);
    }
}
