package Ta;

import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class s {
    public static final float a(float f10, float f11, float f12, boolean z10, boolean z11) {
        if (!z10) {
            return z11 ? (f12 - f11) - f10 : f10;
        }
        if (z11) {
            f10 = 100.0f - f10;
        }
        return (f10 / 100.0f) * (f12 - f11);
    }

    public static final float b(float f10, RectF imageRect, RectF viewRect, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(imageRect, "imageRect");
        Intrinsics.checkNotNullParameter(viewRect, "viewRect");
        return a(f10, imageRect.width(), viewRect.width(), z10, z11);
    }

    public static /* synthetic */ float c(float f10, RectF rectF, RectF rectF2, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        if ((i10 & 16) != 0) {
            z11 = false;
        }
        return b(f10, rectF, rectF2, z10, z11);
    }

    public static final float d(float f10, RectF imageRect, RectF viewRect, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(imageRect, "imageRect");
        Intrinsics.checkNotNullParameter(viewRect, "viewRect");
        return a(f10, imageRect.height(), viewRect.height(), z10, z11);
    }

    public static /* synthetic */ float e(float f10, RectF rectF, RectF rectF2, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        if ((i10 & 16) != 0) {
            z11 = false;
        }
        return d(f10, rectF, rectF2, z10, z11);
    }
}
