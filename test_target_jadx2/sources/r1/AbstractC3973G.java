package r1;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: r1.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC3973G extends AbstractC3970D {

    /* renamed from: d, reason: collision with root package name */
    private static boolean f38959d = true;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f38960e = true;

    AbstractC3973G() {
    }

    @Override // r1.AbstractC3979M
    public void g(View view, Matrix matrix) {
        if (f38959d) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f38959d = false;
            }
        }
    }

    @Override // r1.AbstractC3979M
    public void h(View view, Matrix matrix) {
        if (f38960e) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f38960e = false;
            }
        }
    }
}
