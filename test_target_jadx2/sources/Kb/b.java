package Kb;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.TypedValue;
import android.view.View;

/* loaded from: classes2.dex */
public class b extends View {

    /* renamed from: a, reason: collision with root package name */
    private final Paint f5521a;

    /* renamed from: b, reason: collision with root package name */
    private Path f5522b;

    /* renamed from: c, reason: collision with root package name */
    private RectF f5523c;

    /* renamed from: d, reason: collision with root package name */
    private float[] f5524d;

    /* renamed from: e, reason: collision with root package name */
    private float[] f5525e;

    /* renamed from: f, reason: collision with root package name */
    private float[] f5526f;

    /* renamed from: g, reason: collision with root package name */
    private int[] f5527g;

    /* renamed from: h, reason: collision with root package name */
    private int[] f5528h;

    /* renamed from: i, reason: collision with root package name */
    private float[] f5529i;

    public b(Context context) {
        super(context);
        this.f5521a = new Paint(5);
        this.f5525e = new float[]{0.5f, 0.0f};
        this.f5526f = new float[]{0.5f, 1.0f};
        this.f5528h = new int[]{0, 0};
        this.f5529i = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    }

    private void a() {
        int[] iArr = this.f5527g;
        if (iArr != null) {
            float[] fArr = this.f5524d;
            if (fArr == null || iArr.length == fArr.length) {
                float[] fArr2 = this.f5525e;
                float f10 = fArr2[0];
                int[] iArr2 = this.f5528h;
                int i10 = iArr2[0];
                float f11 = fArr2[1];
                int i11 = iArr2[1];
                float[] fArr3 = this.f5526f;
                this.f5521a.setShader(new LinearGradient(f10 * i10, f11 * i11, i10 * fArr3[0], fArr3[1] * i11, this.f5527g, this.f5524d, Shader.TileMode.CLAMP));
                invalidate();
            }
        }
    }

    private float d(float f10) {
        return TypedValue.applyDimension(1, f10, getContext().getResources().getDisplayMetrics());
    }

    private void e() {
        if (this.f5522b == null) {
            this.f5522b = new Path();
            this.f5523c = new RectF();
        }
        this.f5522b.reset();
        RectF rectF = this.f5523c;
        int[] iArr = this.f5528h;
        rectF.set(0.0f, 0.0f, iArr[0], iArr[1]);
        this.f5522b.addRoundRect(this.f5523c, this.f5529i, Path.Direction.CW);
    }

    public void b(float f10, float f11) {
        this.f5526f = new float[]{f10, f11};
        a();
    }

    public void c(float f10, float f11) {
        this.f5525e = new float[]{f10, f11};
        a();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Path path = this.f5522b;
        if (path == null) {
            canvas.drawPaint(this.f5521a);
        } else {
            canvas.drawPath(path, this.f5521a);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        this.f5528h = new int[]{i10, i11};
        e();
        a();
    }

    public void setBorderRadii(float[] fArr) {
        for (int i10 = 0; i10 < fArr.length; i10++) {
            fArr[i10] = d(fArr[i10]);
        }
        this.f5529i = fArr;
        e();
        a();
    }

    public void setColors(int[] iArr) {
        this.f5527g = iArr;
        a();
    }

    public void setDither(boolean z10) {
        this.f5521a.setDither(z10);
        a();
    }

    public void setLocations(float[] fArr) {
        this.f5524d = fArr;
        a();
    }
}
