package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import c3.AbstractC1721a;
import com.facebook.react.bridge.ReadableArray;
import com.horcrux.svg.SVGLength;

/* renamed from: com.horcrux.svg.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C2898a {

    /* renamed from: a, reason: collision with root package name */
    private final EnumC0429a f29002a;

    /* renamed from: b, reason: collision with root package name */
    private final SVGLength[] f29003b;

    /* renamed from: c, reason: collision with root package name */
    private ReadableArray f29004c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f29005d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f29006e;

    /* renamed from: f, reason: collision with root package name */
    private Matrix f29007f;

    /* renamed from: g, reason: collision with root package name */
    private Rect f29008g;

    /* renamed from: h, reason: collision with root package name */
    private I f29009h;

    /* renamed from: com.horcrux.svg.a$a, reason: collision with other inner class name */
    enum EnumC0429a {
        LINEAR_GRADIENT,
        RADIAL_GRADIENT,
        PATTERN
    }

    /* renamed from: com.horcrux.svg.a$b */
    enum b {
        OBJECT_BOUNDING_BOX,
        USER_SPACE_ON_USE
    }

    C2898a(EnumC0429a enumC0429a, SVGLength[] sVGLengthArr, b bVar) {
        this.f29002a = enumC0429a;
        this.f29003b = sVGLengthArr;
        this.f29005d = bVar == b.OBJECT_BOUNDING_BOX;
    }

    private RectF a(RectF rectF) {
        float f10;
        float f11;
        if (!this.f29005d) {
            rectF = new RectF(this.f29008g);
        }
        float width = rectF.width();
        float height = rectF.height();
        if (this.f29005d) {
            f10 = rectF.left;
            f11 = rectF.top;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        return new RectF(f10, f11, width + f10, height + f11);
    }

    private double b(SVGLength sVGLength, double d10, float f10, float f11) {
        double d11;
        if (this.f29005d && sVGLength.f28947b == SVGLength.UnitType.NUMBER) {
            d11 = d10;
            return K.a(sVGLength, d10, 0.0d, d11, f11);
        }
        d11 = f10;
        return K.a(sVGLength, d10, 0.0d, d11, f11);
    }

    private static void c(ReadableArray readableArray, int i10, float[] fArr, int[] iArr, float f10) {
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = i11 * 2;
            fArr[i11] = (float) readableArray.getDouble(i12);
            iArr[i11] = (readableArray.getInt(i12 + 1) & 16777215) | (Math.round((r1 >>> 24) * f10) << 24);
        }
    }

    void d(b bVar) {
        this.f29006e = bVar == b.OBJECT_BOUNDING_BOX;
    }

    void e(ReadableArray readableArray) {
        this.f29004c = readableArray;
    }

    void f(Matrix matrix) {
        this.f29007f = matrix;
    }

    void g(I i10) {
        this.f29009h = i10;
    }

    void h(Rect rect) {
        this.f29008g = rect;
    }

    void i(Paint paint, RectF rectF, float f10, float f11) {
        int[] iArr;
        float[] fArr;
        int[] iArr2;
        float[] fArr2;
        double d10;
        RectF a10 = a(rectF);
        float width = a10.width();
        float height = a10.height();
        float f12 = a10.left;
        float f13 = a10.top;
        float textSize = paint.getTextSize();
        if (this.f29002a == EnumC0429a.PATTERN) {
            double d11 = width;
            double b10 = b(this.f29003b[0], d11, f10, textSize);
            double d12 = height;
            double b11 = b(this.f29003b[1], d12, f10, textSize);
            double b12 = b(this.f29003b[2], d11, f10, textSize);
            double b13 = b(this.f29003b[3], d12, f10, textSize);
            if (b12 <= 1.0d || b13 <= 1.0d) {
                return;
            }
            Bitmap createBitmap = Bitmap.createBitmap((int) b12, (int) b13, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            RectF viewBox = this.f29009h.getViewBox();
            if (viewBox != null && viewBox.width() > 0.0f && viewBox.height() > 0.0f) {
                RectF rectF2 = new RectF((float) b10, (float) b11, (float) b12, (float) b13);
                I i10 = this.f29009h;
                canvas.concat(o0.a(viewBox, rectF2, i10.f28901p, i10.f28902q));
            }
            if (this.f29006e) {
                canvas.scale(width / f10, height / f10);
            }
            this.f29009h.draw(canvas, new Paint(), f11);
            Matrix matrix = new Matrix();
            Matrix matrix2 = this.f29007f;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            BitmapShader bitmapShader = new BitmapShader(createBitmap, tileMode, tileMode);
            bitmapShader.setLocalMatrix(matrix);
            paint.setShader(bitmapShader);
            return;
        }
        int size = this.f29004c.size();
        if (size == 0) {
            AbstractC1721a.J("ReactNative", "Gradient contains no stops");
            return;
        }
        int i11 = size / 2;
        int[] iArr3 = new int[i11];
        float[] fArr3 = new float[i11];
        c(this.f29004c, i11, fArr3, iArr3, f11);
        if (i11 == 1) {
            int[] iArr4 = {iArr3[0], iArr3[0]};
            float[] fArr4 = {fArr3[0], fArr3[0]};
            AbstractC1721a.J("ReactNative", "Gradient contains only one stop");
            iArr = iArr4;
            fArr = fArr4;
        } else {
            iArr = iArr3;
            fArr = fArr3;
        }
        EnumC0429a enumC0429a = this.f29002a;
        if (enumC0429a == EnumC0429a.LINEAR_GRADIENT) {
            double d13 = width;
            double d14 = f12;
            double b14 = b(this.f29003b[0], d13, f10, textSize) + d14;
            double d15 = height;
            double d16 = f13;
            LinearGradient linearGradient = new LinearGradient((float) b14, (float) (b(this.f29003b[1], d15, f10, textSize) + d16), (float) (b(this.f29003b[2], d13, f10, textSize) + d14), (float) (b(this.f29003b[3], d15, f10, textSize) + d16), iArr, fArr, Shader.TileMode.CLAMP);
            if (this.f29007f != null) {
                Matrix matrix3 = new Matrix();
                matrix3.preConcat(this.f29007f);
                linearGradient.setLocalMatrix(matrix3);
            }
            paint.setShader(linearGradient);
            return;
        }
        int[] iArr5 = iArr;
        float[] fArr5 = fArr;
        if (enumC0429a == EnumC0429a.RADIAL_GRADIENT) {
            double d17 = width;
            double b15 = b(this.f29003b[2], d17, f10, textSize);
            double d18 = height;
            double b16 = b(this.f29003b[3], d18, f10, textSize);
            if (b15 <= 0.0d || b16 <= 0.0d) {
                float[] fArr6 = {fArr5[0], fArr5[fArr5.length - 1]};
                iArr2 = new int[]{iArr5[iArr5.length - 1], iArr5[iArr5.length - 1]};
                fArr2 = fArr6;
                b16 = d18;
                d10 = d17;
            } else {
                iArr2 = iArr5;
                fArr2 = fArr5;
                d10 = b15;
            }
            double d19 = b16 / d10;
            RadialGradient radialGradient = new RadialGradient((float) (b(this.f29003b[4], d17, f10, textSize) + f12), (float) (b(this.f29003b[5], d18 / d19, f10, textSize) + (f13 / d19)), (float) d10, iArr2, fArr2, Shader.TileMode.CLAMP);
            Matrix matrix4 = new Matrix();
            matrix4.preScale(1.0f, (float) d19);
            Matrix matrix5 = this.f29007f;
            if (matrix5 != null) {
                matrix4.preConcat(matrix5);
            }
            radialGradient.setLocalMatrix(matrix4);
            paint.setShader(radialGradient);
        }
    }
}
