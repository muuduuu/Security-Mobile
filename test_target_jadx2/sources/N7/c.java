package N7;

import H7.d;
import H7.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import com.google.android.material.internal.m;

/* loaded from: classes2.dex */
public abstract class c {
    public static Rect a(Context context, int i10, int i11) {
        TypedArray h10 = m.h(context, null, l.f3489P2, i10, i11, new int[0]);
        int dimensionPixelSize = h10.getDimensionPixelSize(l.f3516S2, context.getResources().getDimensionPixelSize(d.f3166C));
        int dimensionPixelSize2 = h10.getDimensionPixelSize(l.f3525T2, context.getResources().getDimensionPixelSize(d.f3167D));
        int dimensionPixelSize3 = h10.getDimensionPixelSize(l.f3507R2, context.getResources().getDimensionPixelSize(d.f3165B));
        int dimensionPixelSize4 = h10.getDimensionPixelSize(l.f3498Q2, context.getResources().getDimensionPixelSize(d.f3164A));
        h10.recycle();
        if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
            dimensionPixelSize3 = dimensionPixelSize;
            dimensionPixelSize = dimensionPixelSize3;
        }
        return new Rect(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4);
    }

    public static InsetDrawable b(Drawable drawable, Rect rect) {
        return new InsetDrawable(drawable, rect.left, rect.top, rect.right, rect.bottom);
    }
}
