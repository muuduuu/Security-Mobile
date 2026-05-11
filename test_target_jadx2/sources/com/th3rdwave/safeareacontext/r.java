package com.th3rdwave.safeareacontext;

import android.content.Context;
import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.L0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class r {
    public static final ReactContext a(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ReactContext d10 = L0.d(view);
        Intrinsics.checkNotNullExpressionValue(d10, "getReactContext(...)");
        return d10;
    }

    public static final int b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return L0.e(context);
    }
}
