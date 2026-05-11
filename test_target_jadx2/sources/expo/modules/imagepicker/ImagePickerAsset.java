package expo.modules.imagepicker;

import Ab.b;
import Ab.c;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b+\b\u0000\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0015\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u001a\u0012\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001b\u0010\u001cR \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u0015\u0012\u0004\b\u001f\u0010\u0019\u001a\u0004\b\u001e\u0010\u0017R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010 \u0012\u0004\b#\u0010\u0019\u001a\u0004\b!\u0010\"R \u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010 \u0012\u0004\b%\u0010\u0019\u001a\u0004\b$\u0010\"R\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0015\u0012\u0004\b'\u0010\u0019\u001a\u0004\b&\u0010\u0017R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010(\u0012\u0004\b+\u0010\u0019\u001a\u0004\b)\u0010*R\"\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u0015\u0012\u0004\b-\u0010\u0019\u001a\u0004\b,\u0010\u0017R\"\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u0015\u0012\u0004\b/\u0010\u0019\u001a\u0004\b.\u0010\u0017R\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u00100\u0012\u0004\b3\u0010\u0019\u001a\u0004\b1\u00102R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u00104\u0012\u0004\b7\u0010\u0019\u001a\u0004\b5\u00106R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u00104\u0012\u0004\b9\u0010\u0019\u001a\u0004\b8\u00106¨\u0006:"}, d2 = {"Lexpo/modules/imagepicker/ImagePickerAsset;", "LAb/c;", BuildConfig.FLAVOR, "assetId", "Lexpo/modules/imagepicker/MediaType;", "type", "uri", BuildConfig.FLAVOR, "width", "height", "fileName", BuildConfig.FLAVOR, "fileSize", "mimeType", "base64", "Landroid/os/Bundle;", "exif", "duration", "rotation", "<init>", "(Ljava/lang/String;Lexpo/modules/imagepicker/MediaType;Ljava/lang/String;IILjava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/Integer;Ljava/lang/Integer;)V", "Ljava/lang/String;", "getAssetId", "()Ljava/lang/String;", "getAssetId$annotations", "()V", "Lexpo/modules/imagepicker/MediaType;", "getType", "()Lexpo/modules/imagepicker/MediaType;", "getType$annotations", "getUri", "getUri$annotations", "I", "getWidth", "()I", "getWidth$annotations", "getHeight", "getHeight$annotations", "getFileName", "getFileName$annotations", "Ljava/lang/Long;", "getFileSize", "()Ljava/lang/Long;", "getFileSize$annotations", "getMimeType", "getMimeType$annotations", "getBase64", "getBase64$annotations", "Landroid/os/Bundle;", "getExif", "()Landroid/os/Bundle;", "getExif$annotations", "Ljava/lang/Integer;", "getDuration", "()Ljava/lang/Integer;", "getDuration$annotations", "getRotation", "getRotation$annotations", "expo-image-picker_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ImagePickerAsset implements c {
    private final String assetId;
    private final String base64;
    private final Integer duration;
    private final Bundle exif;
    private final String fileName;
    private final Long fileSize;
    private final int height;
    private final String mimeType;
    private final Integer rotation;
    private final MediaType type;
    private final String uri;
    private final int width;

    public ImagePickerAsset() {
        this(null, null, null, 0, 0, null, null, null, null, null, null, null, 4095, null);
    }

    @b
    public static /* synthetic */ void getAssetId$annotations() {
    }

    @b
    public static /* synthetic */ void getBase64$annotations() {
    }

    @b
    public static /* synthetic */ void getDuration$annotations() {
    }

    @b
    public static /* synthetic */ void getExif$annotations() {
    }

    @b
    public static /* synthetic */ void getFileName$annotations() {
    }

    @b
    public static /* synthetic */ void getFileSize$annotations() {
    }

    @b
    public static /* synthetic */ void getHeight$annotations() {
    }

    @b
    public static /* synthetic */ void getMimeType$annotations() {
    }

    @b
    public static /* synthetic */ void getRotation$annotations() {
    }

    @b
    public static /* synthetic */ void getType$annotations() {
    }

    @b
    public static /* synthetic */ void getUri$annotations() {
    }

    @b
    public static /* synthetic */ void getWidth$annotations() {
    }

    public final String getAssetId() {
        return this.assetId;
    }

    public final String getBase64() {
        return this.base64;
    }

    public final Integer getDuration() {
        return this.duration;
    }

    public final Bundle getExif() {
        return this.exif;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final Long getFileSize() {
        return this.fileSize;
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final Integer getRotation() {
        return this.rotation;
    }

    public final MediaType getType() {
        return this.type;
    }

    public final String getUri() {
        return this.uri;
    }

    public final int getWidth() {
        return this.width;
    }

    public ImagePickerAsset(String str, MediaType type, String uri, int i10, int i11, String str2, Long l10, String str3, String str4, Bundle bundle, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.assetId = str;
        this.type = type;
        this.uri = uri;
        this.width = i10;
        this.height = i11;
        this.fileName = str2;
        this.fileSize = l10;
        this.mimeType = str3;
        this.base64 = str4;
        this.exif = bundle;
        this.duration = num;
        this.rotation = num2;
    }

    public /* synthetic */ ImagePickerAsset(String str, MediaType mediaType, String str2, int i10, int i11, String str3, Long l10, String str4, String str5, Bundle bundle, Integer num, Integer num2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? MediaType.IMAGE : mediaType, (i12 & 4) != 0 ? BuildConfig.FLAVOR : str2, (i12 & 8) != 0 ? 0 : i10, (i12 & 16) == 0 ? i11 : 0, (i12 & 32) != 0 ? null : str3, (i12 & 64) != 0 ? null : l10, (i12 & 128) != 0 ? null : str4, (i12 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? null : str5, (i12 & 512) != 0 ? null : bundle, (i12 & 1024) != 0 ? null : num, (i12 & 2048) == 0 ? num2 : null);
    }
}
