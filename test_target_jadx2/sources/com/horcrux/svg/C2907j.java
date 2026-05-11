package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.facebook.react.bridge.ReactContext;
import java.util.HashMap;

/* renamed from: com.horcrux.svg.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C2907j extends AbstractC2913p {

    /* renamed from: c, reason: collision with root package name */
    String f29023c;

    /* renamed from: d, reason: collision with root package name */
    String f29024d;

    /* renamed from: e, reason: collision with root package name */
    EnumC2915r f29025e;

    /* renamed from: com.horcrux.svg.j$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f29026a;

        static {
            int[] iArr = new int[EnumC2915r.values().length];
            f29026a = iArr;
            try {
                iArr[EnumC2915r.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29026a[EnumC2915r.SCREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29026a[EnumC2915r.LIGHTEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29026a[EnumC2915r.DARKEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f29026a[EnumC2915r.MULTIPLY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public C2907j(ReactContext reactContext) {
        super(reactContext);
        this.f29059b.mX = new SVGLength(0.0d);
        this.f29059b.mY = new SVGLength(0.0d);
        this.f29059b.mW = new SVGLength("100%");
        this.f29059b.mH = new SVGLength("100%");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float[] A(float[] fArr, float[] fArr2) {
        float f10 = fArr[0];
        float f11 = fArr2[0];
        float f12 = fArr[1];
        float f13 = fArr2[1];
        float f14 = (f12 * f10 * (1.0f - f11)) + (f13 * f11 * (1.0f - f10)) + (f12 * f10 * f13 * f11);
        float f15 = fArr[2];
        float f16 = fArr2[2];
        float f17 = fArr[3];
        float f18 = fArr2[3];
        return new float[]{1.0f - ((1.0f - f10) * (1.0f - f11)), f14, (f15 * f10 * (1.0f - f11)) + (f16 * f11 * (1.0f - f10)) + (f15 * f10 * f16 * f11), (f17 * f10 * (1.0f - f11)) + (f18 * f11 * (1.0f - f10)) + (f17 * f10 * f18 * f11)};
    }

    public void B(String str) {
        this.f29023c = str;
        invalidate();
    }

    public void C(String str) {
        this.f29024d = str;
        invalidate();
    }

    @Override // com.horcrux.svg.AbstractC2913p
    public Bitmap r(HashMap hashMap, Bitmap bitmap) {
        Bitmap t10 = AbstractC2913p.t(hashMap, bitmap, this.f29023c);
        Bitmap t11 = AbstractC2913p.t(hashMap, bitmap, this.f29024d);
        if (this.f29025e == EnumC2915r.MULTIPLY) {
            return CustomFilter.apply(t10, t11, new InterfaceC2901d() { // from class: com.horcrux.svg.i
                @Override // com.horcrux.svg.InterfaceC2901d
                public final float[] a(float[] fArr, float[] fArr2) {
                    float[] A10;
                    A10 = C2907j.A(fArr, fArr2);
                    return A10;
                }
            });
        }
        Bitmap createBitmap = Bitmap.createBitmap(t10.getWidth(), t10.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(1);
        canvas.drawBitmap(t10, 0.0f, 0.0f, paint);
        int i10 = a.f29026a[this.f29025e.ordinal()];
        if (i10 == 1) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        } else if (i10 == 2) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SCREEN));
        } else if (i10 == 3) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.LIGHTEN));
        } else if (i10 == 4) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DARKEN));
        }
        canvas.drawBitmap(t11, 0.0f, 0.0f, paint);
        return createBitmap;
    }

    public void setMode(String str) {
        this.f29025e = EnumC2915r.getEnum(str);
        invalidate();
    }
}
