package V7;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;
import u0.AbstractC4860a;

/* loaded from: classes2.dex */
public abstract class i {
    public static Typeface a(Context context, Typeface typeface) {
        return b(context.getResources().getConfiguration(), typeface);
    }

    public static Typeface b(Configuration configuration, Typeface typeface) {
        int i10;
        int i11;
        int weight;
        int i12;
        Typeface create;
        if (Build.VERSION.SDK_INT < 31) {
            return null;
        }
        i10 = configuration.fontWeightAdjustment;
        if (i10 == Integer.MAX_VALUE) {
            return null;
        }
        i11 = configuration.fontWeightAdjustment;
        if (i11 == 0) {
            return null;
        }
        weight = typeface.getWeight();
        i12 = configuration.fontWeightAdjustment;
        create = Typeface.create(typeface, AbstractC4860a.b(weight + i12, 1, 1000), typeface.isItalic());
        return create;
    }
}
