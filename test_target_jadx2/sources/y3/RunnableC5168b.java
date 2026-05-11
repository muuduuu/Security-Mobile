package y3;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

/* renamed from: y3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class RunnableC5168b extends g implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private int f45175e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f45176f;

    /* renamed from: g, reason: collision with root package name */
    float f45177g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f45178h;

    public RunnableC5168b(Drawable drawable, int i10) {
        this(drawable, i10, true);
    }

    private int x() {
        return (int) ((20.0f / this.f45175e) * 360.0f);
    }

    private void y() {
        if (this.f45178h) {
            return;
        }
        this.f45178h = true;
        scheduleSelf(this, SystemClock.uptimeMillis() + 20);
    }

    @Override // y3.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int save = canvas.save();
        Rect bounds = getBounds();
        int i10 = bounds.right - bounds.left;
        int i11 = bounds.bottom - bounds.top;
        float f10 = this.f45177g;
        if (!this.f45176f) {
            f10 = 360.0f - f10;
        }
        canvas.rotate(f10, r3 + (i10 / 2), r1 + (i11 / 2));
        super.draw(canvas);
        canvas.restoreToCount(save);
        y();
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f45178h = false;
        this.f45177g += x();
        invalidateSelf();
    }

    public RunnableC5168b(Drawable drawable, int i10, boolean z10) {
        super((Drawable) b3.l.g(drawable));
        this.f45177g = 0.0f;
        this.f45178h = false;
        this.f45175e = i10;
        this.f45176f = z10;
    }
}
