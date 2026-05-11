package com.facebook.react.views.view;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import androidx.core.view.AbstractC1484a0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class o {
    public static final void b(Window window, boolean z10) {
        Intrinsics.checkNotNullParameter(window, "<this>");
        if (z10) {
            window.getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.facebook.react.views.view.n
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    WindowInsets c10;
                    c10 = o.c(view, windowInsets);
                    return c10;
                }
            });
        } else {
            window.getDecorView().setOnApplyWindowInsetsListener(null);
        }
        AbstractC1484a0.n0(window.getDecorView());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsets c(View v10, WindowInsets insets) {
        Intrinsics.checkNotNullParameter(v10, "v");
        Intrinsics.checkNotNullParameter(insets, "insets");
        WindowInsets onApplyWindowInsets = v10.onApplyWindowInsets(insets);
        return onApplyWindowInsets.replaceSystemWindowInsets(onApplyWindowInsets.getSystemWindowInsetLeft(), 0, onApplyWindowInsets.getSystemWindowInsetRight(), onApplyWindowInsets.getSystemWindowInsetBottom());
    }

    public static final void d(Window window, boolean z10) {
        Intrinsics.checkNotNullParameter(window, "<this>");
        if (z10) {
            e(window);
        } else {
            f(window);
        }
    }

    private static final void e(Window window) {
        if (Build.VERSION.SDK_INT >= 30) {
            window.getAttributes().layoutInDisplayCutoutMode = 1;
            window.setDecorFitsSystemWindows(false);
        }
        window.addFlags(1024);
        window.clearFlags(2048);
    }

    private static final void f(Window window) {
        if (Build.VERSION.SDK_INT >= 30) {
            window.getAttributes().layoutInDisplayCutoutMode = 0;
            window.setDecorFitsSystemWindows(true);
        }
        window.addFlags(2048);
        window.clearFlags(1024);
    }
}
