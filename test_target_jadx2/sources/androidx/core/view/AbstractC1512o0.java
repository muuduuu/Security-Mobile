package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* renamed from: androidx.core.view.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1512o0 {

    /* renamed from: androidx.core.view.o0$a */
    static class a {
        static void a(Window window, boolean z10) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z10 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    /* renamed from: androidx.core.view.o0$b */
    static class b {
        static void a(Window window, boolean z10) {
            window.setDecorFitsSystemWindows(z10);
        }
    }

    public static i1 a(Window window, View view) {
        return new i1(window, view);
    }

    public static void b(Window window, boolean z10) {
        if (Build.VERSION.SDK_INT >= 30) {
            b.a(window, z10);
        } else {
            a.a(window, z10);
        }
    }
}
