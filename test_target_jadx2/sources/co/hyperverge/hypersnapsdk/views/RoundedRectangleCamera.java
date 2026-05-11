package co.hyperverge.hypersnapsdk.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import co.hyperverge.hypersnapsdk.utils.UIUtils;

/* loaded from: classes.dex */
public class RoundedRectangleCamera extends FrameLayout {
    private static final float CORNER_RADIUS = 6.0f;
    private float cornerRadius;

    public RoundedRectangleCamera(Context context) {
        super(context);
        init(context, null, 0);
    }

    private void init(Context context, AttributeSet attributeSet, int i10) {
        this.cornerRadius = TypedValue.applyDimension(1, CORNER_RADIUS, context.getResources().getDisplayMetrics());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        int save = canvas.save();
        Path path = new Path();
        RectF rectF = new RectF(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        float f10 = this.cornerRadius;
        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        canvas.clipPath(path, Region.Op.REPLACE);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-16776961);
        paint.setStrokeWidth(30.0f);
        paint.setStrokeJoin(Paint.Join.ROUND);
        canvas.clipPath(path);
        canvas.drawPath(path, paint);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
    }

    public int getCameraSize() {
        return Math.min(UIUtils.getScreenWidth(), UIUtils.getScreenHeight()) - UIUtils.getPercentageMargin(getContext());
    }

    public RoundedRectangleCamera(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet, 0);
    }

    public RoundedRectangleCamera(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        init(context, attributeSet, i10);
    }
}
