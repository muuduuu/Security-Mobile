package expo.modules.kotlin.views;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class f {
    public static final boolean a(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return (view instanceof e) || (view instanceof d);
    }
}
