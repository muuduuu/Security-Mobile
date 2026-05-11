package co.hyperverge.hypersnapsdk.views;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.appcompat.widget.r;

/* loaded from: classes.dex */
public class ScanningIndicator extends r {
    ObjectAnimator animator;
    private Handler handler;
    private boolean isGoingDown;
    private int mHeight;
    private int mPosY;
    private final Paint paint;
    private Runnable refreshRunnable;
    private final boolean runAnimation;
    private final boolean showLine;

    public ScanningIndicator(Context context) {
        super(context);
        this.paint = new Paint();
        this.mPosY = 0;
        this.runAnimation = true;
        this.showLine = true;
        this.isGoingDown = true;
    }

    private void init(int i10) {
        this.mHeight = i10;
    }

    private void refreshView() {
        if (this.isGoingDown) {
            int i10 = this.mPosY + 5;
            this.mPosY = i10;
            int i11 = this.mHeight;
            if (i10 > i11) {
                this.mPosY = i11;
                this.isGoingDown = false;
            }
        } else {
            int i12 = this.mPosY - 5;
            this.mPosY = i12;
            if (i12 < 0) {
                this.mPosY = 0;
                this.isGoingDown = true;
            }
        }
        invalidate();
    }

    private void reset() {
        this.mPosY = 0;
        this.isGoingDown = true;
    }

    public void setmHeight(int i10) {
        this.mHeight = i10;
    }

    public void startAnimation() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "translationY", 0.0f, this.mHeight - 20);
        this.animator = ofFloat;
        ofFloat.setRepeatMode(2);
        this.animator.setRepeatCount(-1);
        this.animator.setInterpolator(new AccelerateDecelerateInterpolator());
        this.animator.setDuration(3000L);
        this.animator.start();
    }

    public void stopAnimation() {
        this.animator.cancel();
    }

    public ScanningIndicator(Context context, int i10) {
        super(context);
        this.paint = new Paint();
        this.mPosY = 0;
        this.runAnimation = true;
        this.showLine = true;
        this.isGoingDown = true;
        init(i10);
    }

    public ScanningIndicator(Context context, int i10, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.paint = new Paint();
        this.mPosY = 0;
        this.runAnimation = true;
        this.showLine = true;
        this.isGoingDown = true;
        init(i10);
    }

    public ScanningIndicator(Context context, int i10, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.paint = new Paint();
        this.mPosY = 0;
        this.runAnimation = true;
        this.showLine = true;
        this.isGoingDown = true;
        init(i10);
    }
}
