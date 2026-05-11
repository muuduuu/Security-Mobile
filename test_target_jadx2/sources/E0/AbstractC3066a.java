package e0;

import android.util.Pair;
import androidx.camera.video.internal.compat.quirk.NegativeLatLongSavesIncorrectlyQuirk;

/* renamed from: e0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3066a {
    public static Pair a(double d10, double d11) {
        if (androidx.camera.video.internal.compat.quirk.a.b(NegativeLatLongSavesIncorrectlyQuirk.class) != null) {
            d10 = b(d10);
            d11 = b(d11);
        }
        return Pair.create(Double.valueOf(d10), Double.valueOf(d11));
    }

    private static double b(double d10) {
        return d10 >= 0.0d ? d10 : ((d10 * 10000.0d) - 1.0d) / 10000.0d;
    }
}
