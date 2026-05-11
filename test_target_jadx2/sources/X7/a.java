package X7;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import androidx.core.graphics.d;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: i, reason: collision with root package name */
    private static final int[] f11759i = new int[3];

    /* renamed from: j, reason: collision with root package name */
    private static final float[] f11760j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k, reason: collision with root package name */
    private static final int[] f11761k = new int[4];

    /* renamed from: l, reason: collision with root package name */
    private static final float[] f11762l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    private final Paint f11763a;

    /* renamed from: b, reason: collision with root package name */
    private final Paint f11764b;

    /* renamed from: c, reason: collision with root package name */
    private final Paint f11765c;

    /* renamed from: d, reason: collision with root package name */
    private int f11766d;

    /* renamed from: e, reason: collision with root package name */
    private int f11767e;

    /* renamed from: f, reason: collision with root package name */
    private int f11768f;

    /* renamed from: g, reason: collision with root package name */
    private final Path f11769g;

    /* renamed from: h, reason: collision with root package name */
    private Paint f11770h;

    public a() {
        this(-16777216);
    }

    public void a(Canvas canvas, Matrix matrix, RectF rectF, int i10, float f10, float f11) {
        boolean z10 = f11 < 0.0f;
        Path path = this.f11769g;
        if (z10) {
            int[] iArr = f11761k;
            iArr[0] = 0;
            iArr[1] = this.f11768f;
            iArr[2] = this.f11767e;
            iArr[3] = this.f11766d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f10, f11);
            path.close();
            float f12 = -i10;
            rectF.inset(f12, f12);
            int[] iArr2 = f11761k;
            iArr2[0] = 0;
            iArr2[1] = this.f11766d;
            iArr2[2] = this.f11767e;
            iArr2[3] = this.f11768f;
        }
        float width = rectF.width() / 2.0f;
        if (width <= 0.0f) {
            return;
        }
        float f13 = 1.0f - (i10 / width);
        float[] fArr = f11762l;
        fArr[1] = f13;
        fArr[2] = ((1.0f - f13) / 2.0f) + f13;
        this.f11764b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, f11761k, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z10) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.f11770h);
        }
        canvas.drawArc(rectF, f10, f11, true, this.f11764b);
        canvas.restore();
    }

    public void b(Canvas canvas, Matrix matrix, RectF rectF, int i10) {
        rectF.bottom += i10;
        rectF.offset(0.0f, -i10);
        int[] iArr = f11759i;
        iArr[0] = this.f11768f;
        iArr[1] = this.f11767e;
        iArr[2] = this.f11766d;
        Paint paint = this.f11765c;
        float f10 = rectF.left;
        paint.setShader(new LinearGradient(f10, rectF.top, f10, rectF.bottom, iArr, f11760j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f11765c);
        canvas.restore();
    }

    public Paint c() {
        return this.f11763a;
    }

    public void d(int i10) {
        this.f11766d = d.p(i10, 68);
        this.f11767e = d.p(i10, 20);
        this.f11768f = d.p(i10, 0);
        this.f11763a.setColor(this.f11766d);
    }

    public a(int i10) {
        this.f11769g = new Path();
        this.f11770h = new Paint();
        this.f11763a = new Paint();
        d(i10);
        this.f11770h.setColor(0);
        Paint paint = new Paint(4);
        this.f11764b = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f11765c = new Paint(paint);
    }
}
