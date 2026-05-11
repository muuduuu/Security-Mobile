package Y3;

import android.graphics.Bitmap;
import f3.AbstractC3142a;

/* loaded from: classes.dex */
public abstract class d {
    public AbstractC3142a a(int i10, int i11) {
        return b(i10, i11, Bitmap.Config.ARGB_8888);
    }

    public AbstractC3142a b(int i10, int i11, Bitmap.Config config) {
        return c(i10, i11, config, null);
    }

    public AbstractC3142a c(int i10, int i11, Bitmap.Config config, Object obj) {
        return d(i10, i11, config);
    }

    public abstract AbstractC3142a d(int i10, int i11, Bitmap.Config config);
}
