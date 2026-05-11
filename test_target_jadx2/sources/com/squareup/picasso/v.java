package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.widget.ImageView;
import com.squareup.picasso.u;

/* loaded from: classes2.dex */
final class v extends BitmapDrawable {

    /* renamed from: h, reason: collision with root package name */
    private static final Paint f29653h = new Paint();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f29654a;

    /* renamed from: b, reason: collision with root package name */
    private final float f29655b;

    /* renamed from: c, reason: collision with root package name */
    private final u.e f29656c;

    /* renamed from: d, reason: collision with root package name */
    Drawable f29657d;

    /* renamed from: e, reason: collision with root package name */
    long f29658e;

    /* renamed from: f, reason: collision with root package name */
    boolean f29659f;

    /* renamed from: g, reason: collision with root package name */
    int f29660g;

    v(Context context, Bitmap bitmap, Drawable drawable, u.e eVar, boolean z10, boolean z11) {
        super(context.getResources(), bitmap);
        this.f29660g = 255;
        this.f29654a = z11;
        this.f29655b = context.getResources().getDisplayMetrics().density;
        this.f29656c = eVar;
        if (eVar == u.e.MEMORY || z10) {
            return;
        }
        this.f29657d = drawable;
        this.f29659f = true;
        this.f29658e = SystemClock.uptimeMillis();
    }

    private void a(Canvas canvas) {
        Paint paint = f29653h;
        paint.setColor(-1);
        canvas.drawPath(b(0, 0, (int) (this.f29655b * 16.0f)), paint);
        paint.setColor(this.f29656c.debugColor);
        canvas.drawPath(b(0, 0, (int) (this.f29655b * 15.0f)), paint);
    }

    private static Path b(int i10, int i11, int i12) {
        Path path = new Path();
        float f10 = i10;
        float f11 = i11;
        path.moveTo(f10, f11);
        path.lineTo(i10 + i12, f11);
        path.lineTo(f10, i11 + i12);
        return path;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static void c(ImageView imageView, Context context, Bitmap bitmap, u.e eVar, boolean z10, boolean z11) {
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        imageView.setImageDrawable(new v(context, bitmap, drawable, eVar, z10, z11));
    }

    static void d(ImageView imageView, Drawable drawable) {
        imageView.setImageDrawable(drawable);
        if (imageView.getDrawable() instanceof Animatable) {
            ((Animatable) imageView.getDrawable()).start();
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f29659f) {
            float uptimeMillis = (SystemClock.uptimeMillis() - this.f29658e) / 200.0f;
            if (uptimeMillis >= 1.0f) {
                this.f29659f = false;
                this.f29657d = null;
                super.draw(canvas);
            } else {
                Drawable drawable = this.f29657d;
                if (drawable != null) {
                    drawable.draw(canvas);
                }
                super.setAlpha((int) (this.f29660g * uptimeMillis));
                super.draw(canvas);
                super.setAlpha(this.f29660g);
            }
        } else {
            super.draw(canvas);
        }
        if (this.f29654a) {
            a(canvas);
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f29657d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f29660g = i10;
        Drawable drawable = this.f29657d;
        if (drawable != null) {
            drawable.setAlpha(i10);
        }
        super.setAlpha(i10);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f29657d;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        super.setColorFilter(colorFilter);
    }
}
