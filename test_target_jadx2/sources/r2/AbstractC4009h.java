package r2;

import android.content.Context;
import android.graphics.Bitmap;
import l2.InterfaceC3602d;

/* renamed from: r2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4009h implements i2.l {
    @Override // i2.l
    public final k2.v b(Context context, k2.v vVar, int i10, int i11) {
        if (!D2.l.u(i10, i11)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i10 + " or height: " + i11 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        InterfaceC3602d g10 = com.bumptech.glide.c.d(context).g();
        Bitmap bitmap = (Bitmap) vVar.get();
        if (i10 == Integer.MIN_VALUE) {
            i10 = bitmap.getWidth();
        }
        if (i11 == Integer.MIN_VALUE) {
            i11 = bitmap.getHeight();
        }
        Bitmap c10 = c(g10, bitmap, i10, i11);
        return bitmap.equals(c10) ? vVar : C4008g.c(c10, g10);
    }

    protected abstract Bitmap c(InterfaceC3602d interfaceC3602d, Bitmap bitmap, int i10, int i11);
}
