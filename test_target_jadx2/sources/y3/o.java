package y3;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import y3.p;

/* loaded from: classes.dex */
public class o extends g {

    /* renamed from: e, reason: collision with root package name */
    p.b f45278e;

    /* renamed from: f, reason: collision with root package name */
    Object f45279f;

    /* renamed from: g, reason: collision with root package name */
    PointF f45280g;

    /* renamed from: h, reason: collision with root package name */
    int f45281h;

    /* renamed from: i, reason: collision with root package name */
    int f45282i;

    /* renamed from: j, reason: collision with root package name */
    Matrix f45283j;

    /* renamed from: k, reason: collision with root package name */
    private Matrix f45284k;

    public o(Drawable drawable, p.b bVar) {
        super(drawable);
        this.f45280g = null;
        this.f45281h = 0;
        this.f45282i = 0;
        this.f45284k = new Matrix();
        this.f45278e = bVar;
    }

    private void y() {
        Drawable current = getCurrent();
        if (current == null) {
            return;
        }
        if (this.f45281h == current.getIntrinsicWidth() && this.f45282i == current.getIntrinsicHeight()) {
            return;
        }
        x();
    }

    public p.b A() {
        return this.f45278e;
    }

    public void B(PointF pointF) {
        if (b3.j.a(this.f45280g, pointF)) {
            return;
        }
        if (pointF == null) {
            this.f45280g = null;
        } else {
            if (this.f45280g == null) {
                this.f45280g = new PointF();
            }
            this.f45280g.set(pointF);
        }
        x();
        invalidateSelf();
    }

    public void C(p.b bVar) {
        if (b3.j.a(this.f45278e, bVar)) {
            return;
        }
        this.f45278e = bVar;
        this.f45279f = null;
        x();
        invalidateSelf();
    }

    @Override // y3.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        y();
        if (this.f45283j == null) {
            super.draw(canvas);
            return;
        }
        int save = canvas.save();
        canvas.clipRect(getBounds());
        canvas.concat(this.f45283j);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // y3.g, y3.r
    public void g(Matrix matrix) {
        u(matrix);
        y();
        Matrix matrix2 = this.f45283j;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
    }

    @Override // y3.g, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        x();
    }

    @Override // y3.g
    public Drawable v(Drawable drawable) {
        Drawable v10 = super.v(drawable);
        x();
        return v10;
    }

    void x() {
        Drawable current = getCurrent();
        if (current == null) {
            this.f45282i = 0;
            this.f45281h = 0;
            this.f45283j = null;
            return;
        }
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        int intrinsicWidth = current.getIntrinsicWidth();
        this.f45281h = intrinsicWidth;
        int intrinsicHeight = current.getIntrinsicHeight();
        this.f45282i = intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            current.setBounds(bounds);
            this.f45283j = null;
            return;
        }
        if (intrinsicWidth == width && intrinsicHeight == height) {
            current.setBounds(bounds);
            this.f45283j = null;
        } else {
            if (this.f45278e == p.b.f45285a) {
                current.setBounds(bounds);
                this.f45283j = null;
                return;
            }
            current.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            p.b bVar = this.f45278e;
            Matrix matrix = this.f45284k;
            PointF pointF = this.f45280g;
            bVar.a(matrix, bounds, intrinsicWidth, intrinsicHeight, pointF != null ? pointF.x : 0.5f, pointF != null ? pointF.y : 0.5f);
            this.f45283j = this.f45284k;
        }
    }

    public PointF z() {
        return this.f45280g;
    }
}
