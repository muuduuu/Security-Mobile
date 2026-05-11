package expo.modules.clipboard;

import android.graphics.Bitmap;
import expo.modules.kotlin.types.Enumerable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import lc.m;
import org.conscrypt.BuildConfig;
import qc.AbstractC3958a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lexpo/modules/clipboard/ImageFormat;", BuildConfig.FLAVOR, "Lexpo/modules/kotlin/types/Enumerable;", "jsName", BuildConfig.FLAVOR, "(Ljava/lang/String;ILjava/lang/String;)V", "compressFormat", "Landroid/graphics/Bitmap$CompressFormat;", "getCompressFormat", "()Landroid/graphics/Bitmap$CompressFormat;", "getJsName", "()Ljava/lang/String;", "mimeType", "getMimeType", "JPG", "PNG", "expo-clipboard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ImageFormat implements Enumerable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ImageFormat[] $VALUES;
    public static final ImageFormat JPG = new ImageFormat("JPG", 0, "jpeg");
    public static final ImageFormat PNG = new ImageFormat("PNG", 1, "png");
    private final String jsName;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32596a;

        static {
            int[] iArr = new int[ImageFormat.values().length];
            try {
                iArr[ImageFormat.JPG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImageFormat.PNG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f32596a = iArr;
        }
    }

    private static final /* synthetic */ ImageFormat[] $values() {
        return new ImageFormat[]{JPG, PNG};
    }

    static {
        ImageFormat[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC3958a.a($values);
    }

    private ImageFormat(String str, int i10, String str2) {
        this.jsName = str2;
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static ImageFormat valueOf(String str) {
        return (ImageFormat) Enum.valueOf(ImageFormat.class, str);
    }

    public static ImageFormat[] values() {
        return (ImageFormat[]) $VALUES.clone();
    }

    public final Bitmap.CompressFormat getCompressFormat() {
        int i10 = a.f32596a[ordinal()];
        if (i10 == 1) {
            return Bitmap.CompressFormat.JPEG;
        }
        if (i10 == 2) {
            return Bitmap.CompressFormat.PNG;
        }
        throw new m();
    }

    public final String getJsName() {
        return this.jsName;
    }

    public final String getMimeType() {
        int i10 = a.f32596a[ordinal()];
        if (i10 == 1) {
            return "image/jpeg";
        }
        if (i10 == 2) {
            return "image/png";
        }
        throw new m();
    }
}
