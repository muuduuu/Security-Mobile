package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
abstract class m {
    static int a(RecyclerView.B b10, j jVar, View view, View view2, RecyclerView.p pVar, boolean z10) {
        if (pVar.J() == 0 || b10.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return Math.abs(pVar.h0(view) - pVar.h0(view2)) + 1;
        }
        return Math.min(jVar.n(), jVar.d(view2) - jVar.g(view));
    }

    static int b(RecyclerView.B b10, j jVar, View view, View view2, RecyclerView.p pVar, boolean z10, boolean z11) {
        if (pVar.J() == 0 || b10.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z11 ? Math.max(0, (b10.b() - Math.max(pVar.h0(view), pVar.h0(view2))) - 1) : Math.max(0, Math.min(pVar.h0(view), pVar.h0(view2)));
        if (z10) {
            return Math.round((max * (Math.abs(jVar.d(view2) - jVar.g(view)) / (Math.abs(pVar.h0(view) - pVar.h0(view2)) + 1))) + (jVar.m() - jVar.g(view)));
        }
        return max;
    }

    static int c(RecyclerView.B b10, j jVar, View view, View view2, RecyclerView.p pVar, boolean z10) {
        if (pVar.J() == 0 || b10.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return b10.b();
        }
        return (int) (((jVar.d(view2) - jVar.g(view)) / (Math.abs(pVar.h0(view) - pVar.h0(view2)) + 1)) * b10.b());
    }
}
