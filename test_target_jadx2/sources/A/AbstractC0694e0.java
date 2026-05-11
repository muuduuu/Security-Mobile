package A;

import E.i;
import android.graphics.Matrix;
import androidx.camera.core.impl.d1;

/* renamed from: A.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0694e0 implements Y {
    public static Y e(d1 d1Var, long j10, int i10, Matrix matrix) {
        return new C0691d(d1Var, j10, i10, matrix);
    }

    @Override // A.Y
    public abstract long a();

    @Override // A.Y
    public void b(i.b bVar) {
        bVar.m(d());
    }

    @Override // A.Y
    public abstract d1 c();

    @Override // A.Y
    public abstract int d();

    public abstract Matrix f();
}
