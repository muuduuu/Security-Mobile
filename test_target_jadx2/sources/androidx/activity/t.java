package androidx.activity;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class t {
    public static final void a(View view, q onBackPressedDispatcherOwner) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(onBackPressedDispatcherOwner, "onBackPressedDispatcherOwner");
        view.setTag(r.f13000b, onBackPressedDispatcherOwner);
    }
}
