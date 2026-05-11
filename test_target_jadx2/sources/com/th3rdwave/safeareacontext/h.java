package com.th3rdwave.safeareacontext;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class h {
    public static final c a(ViewGroup rootView, View view) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(view, "view");
        if (view.getParent() == null) {
            return null;
        }
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        try {
            rootView.offsetDescendantRectToMyCoords(view, rect);
            return new c(rect.left, rect.top, view.getWidth(), view.getHeight());
        } catch (IllegalArgumentException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    private static final a b(View view) {
        return Build.VERSION.SDK_INT >= 30 ? d(view) : c(view);
    }

    private static final a c(View view) {
        if (view.getRootWindowInsets() == null) {
            return null;
        }
        return new a(r5.getSystemWindowInsetTop(), r5.getSystemWindowInsetRight(), Math.min(r5.getSystemWindowInsetBottom(), r5.getStableInsetBottom()), r5.getSystemWindowInsetLeft());
    }

    private static final a d(View view) {
        int statusBars;
        int displayCutout;
        int navigationBars;
        int captionBar;
        Insets insets;
        int i10;
        int i11;
        int i12;
        int i13;
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        statusBars = WindowInsets.Type.statusBars();
        displayCutout = WindowInsets.Type.displayCutout();
        int i14 = statusBars | displayCutout;
        navigationBars = WindowInsets.Type.navigationBars();
        int i15 = i14 | navigationBars;
        captionBar = WindowInsets.Type.captionBar();
        insets = rootWindowInsets.getInsets(i15 | captionBar);
        if (insets == null) {
            return null;
        }
        i10 = insets.top;
        i11 = insets.right;
        i12 = insets.bottom;
        i13 = insets.left;
        return new a(i10, i11, i12, i13);
    }

    public static final a e(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (view.getHeight() == 0) {
            return null;
        }
        View rootView = view.getRootView();
        Intrinsics.d(rootView);
        a b10 = b(rootView);
        if (b10 == null) {
            return null;
        }
        float width = rootView.getWidth();
        float height = rootView.getHeight();
        view.getGlobalVisibleRect(new Rect());
        return new a(Math.max(b10.d() - r3.top, 0.0f), Math.max(Math.min((r3.left + view.getWidth()) - width, 0.0f) + b10.c(), 0.0f), Math.max(Math.min((r3.top + view.getHeight()) - height, 0.0f) + b10.a(), 0.0f), Math.max(b10.b() - r3.left, 0.0f));
    }
}
