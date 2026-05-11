package androidx.core.view;

import android.view.ViewGroup;

/* renamed from: androidx.core.view.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1494f0 {

    /* renamed from: androidx.core.view.f0$a */
    static class a {
        static int a(ViewGroup viewGroup) {
            return viewGroup.getNestedScrollAxes();
        }

        static boolean b(ViewGroup viewGroup) {
            return viewGroup.isTransitionGroup();
        }

        static void c(ViewGroup viewGroup, boolean z10) {
            viewGroup.setTransitionGroup(z10);
        }
    }

    public static boolean a(ViewGroup viewGroup) {
        return a.b(viewGroup);
    }
}
