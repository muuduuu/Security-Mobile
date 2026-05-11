package jc;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.c;
import i2.l;
import k2.v;
import l2.InterfaceC3602d;
import r2.C4008g;

/* renamed from: jc.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3522a implements l {
    @Override // i2.l
    public final v b(Context context, v vVar, int i10, int i11) {
        if (!D2.l.u(i10, i11)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i10 + " or height: " + i11 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        InterfaceC3602d g10 = c.d(context).g();
        Bitmap bitmap = (Bitmap) vVar.get();
        if (i10 == Integer.MIN_VALUE) {
            i10 = bitmap.getWidth();
        }
        int i12 = i10;
        if (i11 == Integer.MIN_VALUE) {
            i11 = bitmap.getHeight();
        }
        Bitmap d10 = d(context.getApplicationContext(), g10, bitmap, i12, i11);
        return bitmap.equals(d10) ? vVar : C4008g.c(d10, g10);
    }

    void c(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setDensity(bitmap.getDensity());
    }

    protected abstract Bitmap d(Context context, InterfaceC3602d interfaceC3602d, Bitmap bitmap, int i10, int i11);
}
