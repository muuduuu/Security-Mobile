package co.hyperverge.hypersnapsdk.views;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import co.hyperverge.hypersnapsdk.R;
import co.hyperverge.hypersnapsdk.utils.UIUtils;

/* loaded from: classes.dex */
public class CircularProgressBar extends View {
    private int backgroundColor;
    private final Paint backgroundPaint;
    private int diameter;
    private int mAnimationDuration;
    private boolean mDrawText;
    private final int mMaxProgress;
    private final float mMaxSweepAngle;
    private final Paint mPaint;
    private int mProgressColor;
    private boolean mRoundedCorners;
    private final float mStartAngle;
    private int mStrokeWidth;
    private float mSweepAngle;
    private int mTextColor;
    private int mViewHeight;
    private int mViewWidth;
    private final ValueAnimator progressBarAnimator;

    public CircularProgressBar(Context context) {
        this(context, null);
    }

    private int calcProgressFromSweepAngle(float f10) {
        return (int) ((f10 * 100.0f) / 360.0f);
    }

    private float calcSweepAngleFromProgress(int i10) {
        return i10 * 3.6f;
    }

    private void drawOutlineArc(Canvas canvas) {
        float f10 = (float) (this.mStrokeWidth / 2.0d);
        int i10 = this.diameter;
        RectF rectF = new RectF(f10, f10, i10 - f10, i10 - f10);
        this.mPaint.setColor(this.mProgressColor);
        this.mPaint.setStrokeWidth(this.mStrokeWidth);
        this.mPaint.setAntiAlias(true);
        this.mPaint.setStrokeCap(this.mRoundedCorners ? Paint.Cap.ROUND : Paint.Cap.BUTT);
        Paint paint = this.mPaint;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.backgroundPaint.setColor(this.mProgressColor);
        this.backgroundPaint.setStrokeWidth(this.mStrokeWidth);
        this.backgroundPaint.setAntiAlias(true);
        this.backgroundPaint.setStrokeCap(this.mRoundedCorners ? Paint.Cap.ROUND : Paint.Cap.BUTT);
        this.backgroundPaint.setStyle(style);
        canvas.drawOval(rectF, this.backgroundPaint);
        canvas.drawArc(rectF, -90.0f, this.mSweepAngle, false, this.mPaint);
    }

    private void drawText(Canvas canvas) {
        this.mPaint.setTextSize(Math.min(this.mViewWidth, this.mViewHeight) / 5.0f);
        this.mPaint.setTextAlign(Paint.Align.CENTER);
        this.mPaint.setStrokeWidth(0.0f);
        this.mPaint.setColor(this.mTextColor);
        canvas.drawText(calcProgressFromSweepAngle(this.mSweepAngle) + "%", canvas.getWidth() / 2, (int) ((canvas.getHeight() / 2) - ((this.mPaint.descent() + this.mPaint.ascent()) / 2.0f)), this.mPaint);
    }

    private void initMeasurments() {
        this.mViewWidth = getWidth();
        this.mViewHeight = getHeight();
    }

    private void setProgressBarAnimatorParams() {
        this.progressBarAnimator.setInterpolator(new LinearInterpolator());
        this.progressBarAnimator.setDuration(this.mAnimationDuration);
        this.progressBarAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: co.hyperverge.hypersnapsdk.views.CircularProgressBar.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                CircularProgressBar.this.mSweepAngle = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CircularProgressBar.this.invalidate();
            }
        });
    }

    public int getAnimationDuration() {
        return this.mAnimationDuration;
    }

    public int getDiameter() {
        return Math.min(UIUtils.getScreenWidth(), UIUtils.getScreenHeight()) - UIUtils.getPercentageMargin(getContext());
    }

    public ValueAnimator getProgressBarAnimator() {
        return this.progressBarAnimator;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        initMeasurments();
        drawOutlineArc(canvas);
        setProgressBarAnimatorParams();
        if (this.mDrawText) {
            drawText(canvas);
        }
    }

    public void setAnimationDuration(int i10) {
        this.mAnimationDuration = i10;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        this.backgroundColor = i10;
        invalidate();
    }

    public void setDiameter(int i10) {
        this.diameter = i10;
    }

    public void setMaxProgress(int i10) {
        this.mSweepAngle = calcSweepAngleFromProgress(i10);
    }

    public void setProgress(int i10) {
        this.progressBarAnimator.setFloatValues(this.mSweepAngle, calcSweepAngleFromProgress(i10));
        this.progressBarAnimator.start();
    }

    public void setProgressColor(int i10) {
        this.mProgressColor = i10;
        invalidate();
    }

    public void setProgressWidth(int i10) {
        this.mStrokeWidth = i10;
        invalidate();
    }

    public void setSweepAngle(float f10) {
        this.mSweepAngle = f10;
        invalidate();
    }

    public void setTextColor(int i10) {
        this.mTextColor = i10;
        invalidate();
    }

    public void setmStrokeWidth(int i10) {
        this.mStrokeWidth = i10;
        invalidate();
    }

    public void showProgressText(boolean z10) {
        this.mDrawText = z10;
        invalidate();
    }

    public void useRoundedCorners(boolean z10) {
        this.mRoundedCorners = z10;
        invalidate();
    }

    public CircularProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CircularProgressBar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mStartAngle = -90.0f;
        this.mSweepAngle = 0.0f;
        this.mMaxSweepAngle = 360.0f;
        this.mStrokeWidth = 18;
        this.mAnimationDuration = 1500;
        this.mMaxProgress = 100;
        this.mDrawText = false;
        this.mRoundedCorners = false;
        this.mProgressColor = getResources().getColor(R.color.hv_white);
        this.mTextColor = -65536;
        this.backgroundColor = -65536;
        this.diameter = getDiameter();
        this.progressBarAnimator = ValueAnimator.ofFloat(0.0f);
        this.mPaint = new Paint(1);
        this.backgroundPaint = new Paint(1);
    }
}
