package co.hyperverge.hypersnapsdk.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.util.Log;
import android.view.View;
import co.hyperverge.hypersnapsdk.R;
import co.hyperverge.hypersnapsdk.helpers.SDKInternalConfig;
import co.hyperverge.hypersnapsdk.utils.HVLogUtils;
import co.hyperverge.hypersnapsdk.utils.Utils;

/* loaded from: classes.dex */
public class RectPortHoleView extends View {
    private static final String TAG = "co.hyperverge.hypersnapsdk.views.RectPortHoleView";
    private final float ROUNDED_RECT_RADIUS;
    private Bitmap backgroundImage;
    private int borderColor;
    private float boxPaddingPercent;
    private final Xfermode clearXFerMode;
    private final Rect destRect;
    private boolean isInitialized;
    private Bitmap offScreenBitmap;
    private final Paint paint;
    private RectF portHoleRect;
    private final Rect srcRect;
    private int strokeWidth;

    public RectPortHoleView(Context context) {
        super(context);
        this.ROUNDED_RECT_RADIUS = 20.0f;
        this.boxPaddingPercent = 0.02f;
        this.isInitialized = false;
        this.borderColor = -16777216;
        this.strokeWidth = 2;
        this.srcRect = new Rect();
        this.destRect = new Rect();
        this.paint = new Paint(1);
        this.clearXFerMode = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
    }

    public RectF getPortHoleRect() {
        return this.portHoleRect;
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        HVLogUtils.d(TAG, "onDetachedFromWindow");
        super.onDetachedFromWindow();
        Bitmap bitmap = this.offScreenBitmap;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.offScreenBitmap.recycle();
            this.offScreenBitmap = null;
        }
        Bitmap bitmap2 = this.backgroundImage;
        if (bitmap2 == null || bitmap2.isRecycled()) {
            return;
        }
        this.backgroundImage.recycle();
        this.backgroundImage = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.isInitialized) {
            return;
        }
        try {
            Path path = new Path();
            RectF portHoleRect = getPortHoleRect();
            RectF rectF = new RectF(portHoleRect.left + 2.0f, portHoleRect.top + 2.0f, portHoleRect.right - 2.0f, portHoleRect.bottom - 2.0f);
            Path.Direction direction = Path.Direction.CW;
            path.addRoundRect(rectF, 20.0f, 20.0f, direction);
            Path path2 = new Path();
            path2.addRect(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), direction);
            path2.op(path, Path.Op.DIFFERENCE);
            Bitmap bitmap = this.offScreenBitmap;
            if (bitmap != null && !bitmap.isRecycled()) {
                this.offScreenBitmap.recycle();
                this.offScreenBitmap = null;
            }
            Bitmap createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
            this.offScreenBitmap = createBitmap;
            if (createBitmap == null) {
                return;
            }
            Canvas canvas2 = new Canvas(this.offScreenBitmap);
            Bitmap bitmap2 = this.backgroundImage;
            if (bitmap2 != null) {
                this.srcRect.set(0, 0, bitmap2.getWidth(), this.backgroundImage.getHeight());
                this.destRect.set(0, 0, getWidth(), getHeight());
                canvas.clipPath(path2);
                canvas.drawBitmap(this.backgroundImage, this.srcRect, this.destRect, this.paint);
            } else {
                this.paint.setColor(getContext().getResources().getColor(R.color.hv_white));
                this.paint.setStyle(Paint.Style.FILL);
                canvas2.drawPaint(this.paint);
            }
            this.paint.setXfermode(this.clearXFerMode);
            canvas2.drawRoundRect(this.portHoleRect, 20.0f, 20.0f, this.paint);
            this.paint.setXfermode(null);
            this.paint.setStyle(Paint.Style.STROKE);
            this.paint.setColor(this.borderColor);
            this.paint.setStrokeWidth(this.strokeWidth);
            this.paint.setStrokeJoin(Paint.Join.ROUND);
            canvas2.drawRoundRect(this.portHoleRect, 20.0f, 20.0f, this.paint);
            canvas.drawBitmap(this.offScreenBitmap, 0.0f, 0.0f, this.paint);
        } catch (Exception e10) {
            e = e10;
            Log.e(TAG, Utils.getErrorMessage(e));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() == null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e);
            }
        } catch (OutOfMemoryError e11) {
            e = e11;
            Log.e(TAG, Utils.getErrorMessage(e));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() == null) {
            }
        }
    }

    public void setBackgroundImage(Bitmap bitmap) {
        this.backgroundImage = bitmap;
        invalidate();
    }

    public void setBorderColor(int i10) {
        this.borderColor = i10;
        invalidate();
    }

    public void setBoxRect(RectF rectF, float f10) {
        this.boxPaddingPercent = f10;
        Point point = new Point();
        Point point2 = new Point();
        point.x = ((int) rectF.left) + ((int) (rectF.width() * f10));
        point.y = ((int) rectF.top) + ((int) (rectF.height() * f10));
        point2.x = ((int) rectF.right) - ((int) (rectF.width() * f10));
        point2.y = ((int) rectF.bottom) - ((int) (f10 * ((int) rectF.height())));
        this.portHoleRect = new RectF(point.x, point.y, point2.x, point2.y);
        this.isInitialized = true;
    }

    public void setStrokeWidth(int i10) {
        this.strokeWidth = i10;
        invalidate();
    }
}
