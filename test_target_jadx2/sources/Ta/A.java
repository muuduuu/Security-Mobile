package Ta;

import android.util.Log;
import com.bumptech.glide.request.ThumbnailRequestCoordinator;
import java.lang.reflect.Field;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class A {
    private static final Object a(ThumbnailRequestCoordinator thumbnailRequestCoordinator, String str) {
        try {
            Field declaredField = thumbnailRequestCoordinator.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(thumbnailRequestCoordinator);
        } catch (Throwable th) {
            Log.e("ExpoImage", "Couldn't receive the `" + str + "` field", th);
            return null;
        }
    }

    public static final com.bumptech.glide.request.d b(ThumbnailRequestCoordinator thumbnailRequestCoordinator) {
        Intrinsics.checkNotNullParameter(thumbnailRequestCoordinator, "<this>");
        return (com.bumptech.glide.request.d) a(thumbnailRequestCoordinator, "full");
    }
}
