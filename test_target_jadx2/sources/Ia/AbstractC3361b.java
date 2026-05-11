package ia;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ia.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3361b {
    public static final ViewGroup a(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            return (ViewGroup) parent;
        }
        return null;
    }

    public static final View b(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewGroup a10 = a(view);
        if (a10 != null) {
            a10.endViewTransition(view);
            a10.removeView(view);
        }
        view.setVisibility(0);
        return view;
    }
}
