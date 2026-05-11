package F2;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ImageView;
import com.canhub.cropper.CropOverlayView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i extends Animation implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    private final ImageView f2281a;

    /* renamed from: b, reason: collision with root package name */
    private final CropOverlayView f2282b;

    /* renamed from: c, reason: collision with root package name */
    private final float[] f2283c;

    /* renamed from: d, reason: collision with root package name */
    private final float[] f2284d;

    /* renamed from: e, reason: collision with root package name */
    private final RectF f2285e;

    /* renamed from: f, reason: collision with root package name */
    private final RectF f2286f;

    /* renamed from: g, reason: collision with root package name */
    private final float[] f2287g;

    /* renamed from: h, reason: collision with root package name */
    private final float[] f2288h;

    public i(ImageView imageView, CropOverlayView cropOverlayView) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Intrinsics.checkNotNullParameter(cropOverlayView, "cropOverlayView");
        this.f2281a = imageView;
        this.f2282b = cropOverlayView;
        this.f2283c = new float[8];
        this.f2284d = new float[8];
        this.f2285e = new RectF();
        this.f2286f = new RectF();
        this.f2287g = new float[9];
        this.f2288h = new float[9];
        setDuration(300L);
        setFillAfter(true);
        setInterpolator(new AccelerateDecelerateInterpolator());
        setAnimationListener(this);
    }

    public final void a(float[] boundPoints, Matrix imageMatrix) {
        Intrinsics.checkNotNullParameter(boundPoints, "boundPoints");
        Intrinsics.checkNotNullParameter(imageMatrix, "imageMatrix");
        System.arraycopy(boundPoints, 0, this.f2284d, 0, 8);
        this.f2286f.set(this.f2282b.getCropWindowRect());
        imageMatrix.getValues(this.f2288h);
    }

    @Override // android.view.animation.Animation
    protected void applyTransformation(float f10, Transformation t10) {
        Intrinsics.checkNotNullParameter(t10, "t");
        RectF rectF = new RectF();
        RectF rectF2 = this.f2285e;
        float f11 = rectF2.left;
        RectF rectF3 = this.f2286f;
        rectF.left = f11 + ((rectF3.left - f11) * f10);
        float f12 = rectF2.top;
        rectF.top = f12 + ((rectF3.top - f12) * f10);
        float f13 = rectF2.right;
        rectF.right = f13 + ((rectF3.right - f13) * f10);
        float f14 = rectF2.bottom;
        rectF.bottom = f14 + ((rectF3.bottom - f14) * f10);
        float[] fArr = new float[8];
        for (int i10 = 0; i10 < 8; i10++) {
            float f15 = this.f2283c[i10];
            fArr[i10] = f15 + ((this.f2284d[i10] - f15) * f10);
        }
        CropOverlayView cropOverlayView = this.f2282b;
        cropOverlayView.setCropWindowRect(rectF);
        cropOverlayView.v(fArr, this.f2281a.getWidth(), this.f2281a.getHeight());
        cropOverlayView.invalidate();
        float[] fArr2 = new float[9];
        for (int i11 = 0; i11 < 9; i11++) {
            float f16 = this.f2287g[i11];
            fArr2[i11] = f16 + ((this.f2288h[i11] - f16) * f10);
        }
        ImageView imageView = this.f2281a;
        imageView.getImageMatrix().setValues(fArr2);
        imageView.invalidate();
    }

    public final void b(float[] boundPoints, Matrix imageMatrix) {
        Intrinsics.checkNotNullParameter(boundPoints, "boundPoints");
        Intrinsics.checkNotNullParameter(imageMatrix, "imageMatrix");
        reset();
        System.arraycopy(boundPoints, 0, this.f2283c, 0, 8);
        this.f2285e.set(this.f2282b.getCropWindowRect());
        imageMatrix.getValues(this.f2287g);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.f2281a.clearAnimation();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }
}
