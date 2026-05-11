package androidx.core.graphics.drawable;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public abstract class b {
    public static final Bitmap a(Drawable drawable, int i10, int i11, Bitmap.Config config) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() == null) {
                throw new IllegalArgumentException("bitmap is null");
            }
            if (config == null || bitmapDrawable.getBitmap().getConfig() == config) {
                return (i10 == bitmapDrawable.getBitmap().getWidth() && i11 == bitmapDrawable.getBitmap().getHeight()) ? bitmapDrawable.getBitmap() : Bitmap.createScaledBitmap(bitmapDrawable.getBitmap(), i10, i11, true);
            }
        }
        Rect bounds = drawable.getBounds();
        int i12 = bounds.left;
        int i13 = bounds.top;
        int i14 = bounds.right;
        int i15 = bounds.bottom;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i10, i11, config);
        drawable.setBounds(0, 0, i10, i11);
        drawable.draw(new Canvas(createBitmap));
        drawable.setBounds(i12, i13, i14, i15);
        return createBitmap;
    }

    public static final Bitmap b(Drawable drawable, int i10, int i11, Bitmap.Config config) {
        if ((drawable instanceof BitmapDrawable) && ((BitmapDrawable) drawable).getBitmap() == null) {
            return null;
        }
        return a(drawable, i10, i11, config);
    }

    public static /* synthetic */ Bitmap c(Drawable drawable, int i10, int i11, Bitmap.Config config, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = drawable.getIntrinsicWidth();
        }
        if ((i12 & 2) != 0) {
            i11 = drawable.getIntrinsicHeight();
        }
        if ((i12 & 4) != 0) {
            config = null;
        }
        return b(drawable, i10, i11, config);
    }
}
