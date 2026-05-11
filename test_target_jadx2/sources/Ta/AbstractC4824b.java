package ta;

import android.content.Context;
import android.content.res.Resources;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ta.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4824b {
    private static final Integer a(Context context, String str) {
        Resources resources = context.getResources();
        String packageName = context.getPackageName();
        Integer valueOf = Integer.valueOf(resources.getIdentifier(str, "raw", packageName));
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf;
        }
        Integer valueOf2 = Integer.valueOf(resources.getIdentifier(str, "drawable", packageName));
        if (valueOf2.intValue() != 0) {
            return valueOf2;
        }
        return null;
    }

    public static final InputStream b(Context context, String assetName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        Resources resources = context.getResources();
        Integer a10 = a(context, assetName);
        if (a10 == null) {
            throw new Resources.NotFoundException(assetName);
        }
        InputStream openRawResource = resources.openRawResource(a10.intValue());
        Intrinsics.checkNotNullExpressionValue(openRawResource, "openRawResource(...)");
        return openRawResource;
    }
}
