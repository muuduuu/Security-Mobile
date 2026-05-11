package x0;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: x0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5093a extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    private final Drawable f44625a;

    /* renamed from: b, reason: collision with root package name */
    private final float f44626b;

    /* renamed from: c, reason: collision with root package name */
    private final Path f44627c;

    public C5093a(Drawable drawable, float f10) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        this.f44625a = drawable;
        this.f44626b = f10;
        Path path = new Path();
        path.addCircle(0.0f, 0.0f, f10 / 2.0f, Path.Direction.CW);
        this.f44627c = path;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.clipPath(this.f44627c);
        this.f44625a.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f44625a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        super.onBoundsChange(bounds);
        this.f44625a.setBounds(bounds);
        this.f44627c.offset(bounds.exactCenterX(), bounds.exactCenterY());
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f44625a.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f44625a.setColorFilter(colorFilter);
    }
}
