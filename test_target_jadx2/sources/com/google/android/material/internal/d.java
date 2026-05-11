package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import androidx.core.view.AbstractC1512o0;
import androidx.core.view.i1;

/* loaded from: classes2.dex */
public abstract class d {
    public static void a(Window window, boolean z10, Integer num, Integer num2) {
        boolean z11 = num == null || num.intValue() == 0;
        boolean z12 = num2 == null || num2.intValue() == 0;
        if (z11 || z12) {
            int b10 = M7.a.b(window.getContext(), R.attr.colorBackground, -16777216);
            if (z11) {
                num = Integer.valueOf(b10);
            }
            if (z12) {
                num2 = Integer.valueOf(b10);
            }
        }
        AbstractC1512o0.b(window, !z10);
        int c10 = c(window.getContext(), z10);
        int b11 = b(window.getContext(), z10);
        window.setStatusBarColor(c10);
        window.setNavigationBarColor(b11);
        boolean d10 = d(c10, M7.a.f(num.intValue()));
        boolean d11 = d(b11, M7.a.f(num2.intValue()));
        i1 a10 = AbstractC1512o0.a(window, window.getDecorView());
        if (a10 != null) {
            a10.f(d10);
            a10.e(d11);
        }
    }

    private static int b(Context context, boolean z10) {
        if (z10 && Build.VERSION.SDK_INT < 27) {
            return androidx.core.graphics.d.p(M7.a.b(context, R.attr.navigationBarColor, -16777216), 128);
        }
        if (z10) {
            return 0;
        }
        return M7.a.b(context, R.attr.navigationBarColor, -16777216);
    }

    private static int c(Context context, boolean z10) {
        if (z10) {
            return 0;
        }
        return M7.a.b(context, R.attr.statusBarColor, -16777216);
    }

    private static boolean d(int i10, boolean z10) {
        return M7.a.f(i10) || (i10 == 0 && z10);
    }
}
