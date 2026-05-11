package r2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.concurrent.locks.Lock;
import l2.C3603e;
import l2.InterfaceC3602d;

/* loaded from: classes.dex */
abstract class u {

    /* renamed from: a, reason: collision with root package name */
    private static final InterfaceC3602d f39186a = new a();

    static k2.v a(InterfaceC3602d interfaceC3602d, Drawable drawable, int i10, int i11) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z10 = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (current instanceof Animatable) {
            bitmap = null;
        } else {
            bitmap = b(interfaceC3602d, current, i10, i11);
            z10 = true;
        }
        if (!z10) {
            interfaceC3602d = f39186a;
        }
        return C4008g.c(bitmap, interfaceC3602d);
    }

    private static Bitmap b(InterfaceC3602d interfaceC3602d, Drawable drawable, int i10, int i11) {
        if (i10 == Integer.MIN_VALUE && drawable.getIntrinsicWidth() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
            }
            return null;
        }
        if (i11 == Integer.MIN_VALUE && drawable.getIntrinsicHeight() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
            }
            return null;
        }
        if (drawable.getIntrinsicWidth() > 0) {
            i10 = drawable.getIntrinsicWidth();
        }
        if (drawable.getIntrinsicHeight() > 0) {
            i11 = drawable.getIntrinsicHeight();
        }
        Lock e10 = F.e();
        e10.lock();
        Bitmap d10 = interfaceC3602d.d(i10, i11, Bitmap.Config.ARGB_8888);
        try {
            Canvas canvas = new Canvas(d10);
            drawable.setBounds(0, 0, i10, i11);
            drawable.draw(canvas);
            canvas.setBitmap(null);
            return d10;
        } finally {
            e10.unlock();
        }
    }

    class a extends C3603e {
        a() {
        }

        @Override // l2.C3603e, l2.InterfaceC3602d
        public void c(Bitmap bitmap) {
        }
    }
}
