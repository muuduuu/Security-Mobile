package za;

import expo.modules.kotlin.exception.CodedException;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public final class i extends CodedException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public i(String image, Throwable th) {
        super("Invalid base64 image: " + ((Object) (r0 + (image.length() > 32 ? "..." : BuildConfig.FLAVOR))), th);
        Intrinsics.checkNotNullParameter(image, "image");
        String substring = image.substring(0, Math.min(image.length(), 32));
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
    }
}
