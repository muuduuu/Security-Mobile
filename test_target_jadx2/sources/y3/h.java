package y3;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public class h extends g {

    /* renamed from: e, reason: collision with root package name */
    final Matrix f45204e;

    /* renamed from: f, reason: collision with root package name */
    private int f45205f;

    /* renamed from: g, reason: collision with root package name */
    private int f45206g;

    /* renamed from: h, reason: collision with root package name */
    private final Matrix f45207h;

    /* renamed from: i, reason: collision with root package name */
    private final RectF f45208i;

    public h(Drawable drawable, int i10, int i11) {
        super(drawable);
        this.f45207h = new Matrix();
        this.f45208i = new RectF();
        this.f45204e = new Matrix();
        this.f45205f = i10 - (i10 % 90);
        this.f45206g = (i11 < 0 || i11 > 8) ? 0 : i11;
    }

    @Override // y3.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i10;
        if (this.f45205f <= 0 && ((i10 = this.f45206g) == 0 || i10 == 1)) {
            super.draw(canvas);
            return;
        }
        int save = canvas.save();
        canvas.concat(this.f45204e);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // y3.g, y3.r
    public void g(Matrix matrix) {
        u(matrix);
        if (this.f45204e.isIdentity()) {
            return;
        }
        matrix.preConcat(this.f45204e);
    }

    @Override // y3.g, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        int i10 = this.f45206g;
        return (i10 == 5 || i10 == 7 || this.f45205f % 180 != 0) ? super.getIntrinsicWidth() : super.getIntrinsicHeight();
    }

    @Override // y3.g, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        int i10 = this.f45206g;
        return (i10 == 5 || i10 == 7 || this.f45205f % 180 != 0) ? super.getIntrinsicHeight() : super.getIntrinsicWidth();
    }

    @Override // y3.g, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        int i10;
        Drawable current = getCurrent();
        int i11 = this.f45205f;
        if (i11 <= 0 && ((i10 = this.f45206g) == 0 || i10 == 1)) {
            current.setBounds(rect);
            return;
        }
        int i12 = this.f45206g;
        if (i12 == 2) {
            this.f45204e.setScale(-1.0f, 1.0f);
        } else if (i12 == 7) {
            this.f45204e.setRotate(270.0f, rect.centerX(), rect.centerY());
            this.f45204e.postScale(-1.0f, 1.0f);
        } else if (i12 == 4) {
            this.f45204e.setScale(1.0f, -1.0f);
        } else if (i12 != 5) {
            this.f45204e.setRotate(i11, rect.centerX(), rect.centerY());
        } else {
            this.f45204e.setRotate(270.0f, rect.centerX(), rect.centerY());
            this.f45204e.postScale(1.0f, -1.0f);
        }
        this.f45207h.reset();
        this.f45204e.invert(this.f45207h);
        this.f45208i.set(rect);
        this.f45207h.mapRect(this.f45208i);
        RectF rectF = this.f45208i;
        current.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }
}
