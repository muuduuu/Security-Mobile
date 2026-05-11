package L9;

import android.content.res.Resources;

/* loaded from: classes2.dex */
public abstract class e {
    public static final double a(float f10) {
        return f10 / Resources.getSystem().getDisplayMetrics().density;
    }

    public static final double b(float f10) {
        return f10 * Resources.getSystem().getDisplayMetrics().density;
    }
}
