package I7;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* loaded from: classes2.dex */
public abstract class f implements TypeEvaluator {

    /* renamed from: a, reason: collision with root package name */
    private final float[] f4343a = new float[9];

    /* renamed from: b, reason: collision with root package name */
    private final float[] f4344b = new float[9];

    /* renamed from: c, reason: collision with root package name */
    private final Matrix f4345c = new Matrix();

    public Matrix a(float f10, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.f4343a);
        matrix2.getValues(this.f4344b);
        for (int i10 = 0; i10 < 9; i10++) {
            float[] fArr = this.f4344b;
            float f11 = fArr[i10];
            float f12 = this.f4343a[i10];
            fArr[i10] = f12 + ((f11 - f12) * f10);
        }
        this.f4345c.setValues(this.f4344b);
        return this.f4345c;
    }
}
