package co.hyperverge.encoder.utils.extensions;

import android.content.Context;
import android.os.StatFs;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lc.o;
import lc.p;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u001a\u0013\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0000¢\u0006\u0002\u0010\u0003\u001a\f\u0010\u0004\u001a\u00020\u0005*\u00020\u0002H\u0000¨\u0006\u0006"}, d2 = {"getFreeStorage", BuildConfig.FLAVOR, "Landroid/content/Context;", "(Landroid/content/Context;)Ljava/lang/Long;", "isLowStorage", BuildConfig.FLAVOR, "hv-bitmaps-to-video_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DeviceExtsKt {
    public static final Long getFreeStorage(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            o.a aVar = o.f37128b;
            File externalFilesDir = context.getExternalFilesDir(null);
            StatFs statFs = new StatFs(externalFilesDir != null ? externalFilesDir.getPath() : null);
            return Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
        } catch (Throwable th) {
            o.a aVar2 = o.f37128b;
            Object b10 = o.b(p.a(th));
            return (Long) (o.f(b10) ? null : b10);
        }
    }

    public static final boolean isLowStorage(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Long freeStorage = getFreeStorage(context);
        return freeStorage != null && freeStorage.longValue() / ((long) 1048576) <= ((long) 1);
    }
}
