package expo.modules.clipboard;

import Ab.b;
import Ab.c;
import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R(\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\u000b\u0010\u0003\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR(\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u0013\u0010\u0003\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lexpo/modules/clipboard/GetImageOptions;", "LAb/c;", "<init>", "()V", "Lexpo/modules/clipboard/ImageFormat;", Keys.IMAGE_FORMAT, "Lexpo/modules/clipboard/ImageFormat;", "getImageFormat", "()Lexpo/modules/clipboard/ImageFormat;", "setImageFormat", "(Lexpo/modules/clipboard/ImageFormat;)V", "getImageFormat$annotations", BuildConfig.FLAVOR, "jpegQuality", "D", "getJpegQuality", "()D", "setJpegQuality", "(D)V", "getJpegQuality$annotations", "expo-clipboard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class GetImageOptions implements c {
    private ImageFormat imageFormat = ImageFormat.JPG;
    private double jpegQuality = 1.0d;

    @b(key = "format")
    public static /* synthetic */ void getImageFormat$annotations() {
    }

    @b
    public static /* synthetic */ void getJpegQuality$annotations() {
    }

    public final ImageFormat getImageFormat() {
        return this.imageFormat;
    }

    public final double getJpegQuality() {
        return this.jpegQuality;
    }

    public final void setImageFormat(ImageFormat imageFormat) {
        Intrinsics.checkNotNullParameter(imageFormat, "<set-?>");
        this.imageFormat = imageFormat;
    }

    public final void setJpegQuality(double d10) {
        this.jpegQuality = d10;
    }
}
