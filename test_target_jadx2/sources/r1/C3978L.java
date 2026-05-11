package r1;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: r1.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C3978L extends C3977K {
    C3978L() {
    }

    @Override // r1.AbstractC3970D, r1.AbstractC3979M
    public float b(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // r1.AbstractC3975I, r1.AbstractC3979M
    public void d(View view, int i10, int i11, int i12, int i13) {
        view.setLeftTopRightBottom(i10, i11, i12, i13);
    }

    @Override // r1.AbstractC3970D, r1.AbstractC3979M
    public void e(View view, float f10) {
        view.setTransitionAlpha(f10);
    }

    @Override // r1.C3977K, r1.AbstractC3979M
    public void f(View view, int i10) {
        view.setTransitionVisibility(i10);
    }

    @Override // r1.AbstractC3973G, r1.AbstractC3979M
    public void g(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // r1.AbstractC3973G, r1.AbstractC3979M
    public void h(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
