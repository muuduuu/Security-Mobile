package y3;

import android.graphics.Canvas;
import android.graphics.drawable.NinePatchDrawable;

/* loaded from: classes.dex */
public class n extends m {
    public n(NinePatchDrawable ninePatchDrawable) {
        super(ninePatchDrawable);
    }

    @Override // y3.m, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (n4.b.d()) {
            n4.b.a("RoundedNinePatchDrawable#draw");
        }
        if (!d()) {
            super.draw(canvas);
            if (n4.b.d()) {
                n4.b.b();
                return;
            }
            return;
        }
        g();
        f();
        canvas.clipPath(this.f45256e);
        super.draw(canvas);
        if (n4.b.d()) {
            n4.b.b();
        }
    }
}
