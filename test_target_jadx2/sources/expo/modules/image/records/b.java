package expo.modules.image.records;

import Ta.m;
import android.content.Context;
import com.bumptech.glide.request.h;

/* loaded from: classes2.dex */
public interface b {

    public static final class a {
        public static double a(b bVar) {
            return bVar.getWidth() * bVar.getHeight() * bVar.getScale() * bVar.getScale();
        }

        public static boolean b(b bVar) {
            return true;
        }
    }

    m createGlideModelProvider(Context context);

    h createGlideOptions(Context context);

    int getHeight();

    double getPixelCount();

    double getScale();

    int getWidth();

    boolean usesPlaceholderContentFit();
}
