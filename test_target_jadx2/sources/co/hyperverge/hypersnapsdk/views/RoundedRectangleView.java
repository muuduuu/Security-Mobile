package co.hyperverge.hypersnapsdk.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import co.hyperverge.hypersnapsdk.R;
import co.hyperverge.hypersnapsdk.utils.HVLogUtils;
import co.hyperverge.hypersnapsdk.utils.UIUtils;

/* loaded from: classes.dex */
public class RoundedRectangleView extends View {
    private static final float CORNER_RADIUS = 6.0f;
    private Bitmap backgroundImage;
    private float boxPaddingPercent;
    private float cornerRadius;
    private final Rect destRect;
    private boolean isInitialized;
    private Bitmap mBitmap;
    private final Paint mCutPaint;
    private Canvas mInternalCanvas;
    private final Paint paint;
    private RectF portHoleRect;
    private final Rect srcRect;

    public RoundedRectangleView(Context context) {
        super(context);
        this.mCutPaint = new Paint(1);
        this.paint = new Paint(1);
        this.boxPaddingPercent = 0.02f;
        this.srcRect = new Rect();
        this.destRect = new Rect();
        init();
    }

    private void init() {
        this.cornerRadius = TypedValue.applyDimension(1, CORNER_RADIUS, getResources().getDisplayMetrics());
        this.mCutPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public int getCameraSize() {
        return Math.min(UIUtils.getScreenWidth(), UIUtils.getScreenHeight()) - UIUtils.getPercentageMargin(getContext());
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        HVLogUtils.d("RoundedRectangleView", "onDetachedFromWindow");
        super.onDetachedFromWindow();
        Bitmap bitmap = this.mBitmap;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.mBitmap.recycle();
            this.mBitmap = null;
        }
        Bitmap bitmap2 = this.backgroundImage;
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            this.backgroundImage.recycle();
            this.backgroundImage = null;
        }
        Canvas canvas = this.mInternalCanvas;
        if (canvas != null) {
            canvas.setBitmap(null);
            this.mInternalCanvas = null;
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (!this.isInitialized || this.mInternalCanvas == null || this.mBitmap == null) {
            return;
        }
        Bitmap bitmap = this.backgroundImage;
        if (bitmap != null) {
            this.srcRect.set(0, 0, bitmap.getWidth(), this.backgroundImage.getHeight());
            this.destRect.set(0, 0, getWidth(), getHeight());
            this.mInternalCanvas.drawBitmap(this.backgroundImage, this.srcRect, this.destRect, this.paint);
        } else {
            this.paint.setColor(getContext().getResources().getColor(R.color.hv_white));
            this.paint.setStyle(Paint.Style.FILL);
            this.mInternalCanvas.drawPaint(this.paint);
        }
        Canvas canvas2 = this.mInternalCanvas;
        RectF rectF = this.portHoleRect;
        float f10 = this.cornerRadius;
        canvas2.drawRoundRect(rectF, f10, f10, this.mCutPaint);
        this.paint.setXfermode(null);
        this.paint.setStyle(Paint.Style.STROKE);
        this.paint.setColor(-16777216);
        this.paint.setStrokeWidth(2.0f);
        this.paint.setStrokeJoin(Paint.Join.ROUND);
        Canvas canvas3 = this.mInternalCanvas;
        RectF rectF2 = this.portHoleRect;
        float f11 = this.cornerRadius;
        canvas3.drawRoundRect(rectF2, f11, f11, this.paint);
        canvas.drawBitmap(this.mBitmap, 0.0f, 0.0f, (Paint) null);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        Canvas canvas = this.mInternalCanvas;
        if (canvas != null) {
            canvas.setBitmap(null);
            this.mInternalCanvas = null;
        }
        Bitmap bitmap = this.mBitmap;
        if (bitmap != null) {
            bitmap.recycle();
            this.mBitmap = null;
        }
        this.mBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        this.mInternalCanvas = new Canvas(this.mBitmap);
    }

    public void setBackgroundImage(Bitmap bitmap) {
        this.backgroundImage = bitmap;
        invalidate();
    }

    public void setBoxRect(RectF rectF, float f10) {
        this.boxPaddingPercent = f10;
        Point point = new Point();
        Point point2 = new Point();
        point.x = (int) rectF.left;
        point.y = (int) rectF.top;
        point2.x = (int) rectF.right;
        point2.y = (int) rectF.bottom;
        this.portHoleRect = rectF;
        this.isInitialized = true;
    }

    public RoundedRectangleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mCutPaint = new Paint(1);
        this.paint = new Paint(1);
        this.boxPaddingPercent = 0.02f;
        this.srcRect = new Rect();
        this.destRect = new Rect();
        init();
    }

    public RoundedRectangleView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mCutPaint = new Paint(1);
        this.paint = new Paint(1);
        this.boxPaddingPercent = 0.02f;
        this.srcRect = new Rect();
        this.destRect = new Rect();
        init();
    }
}
