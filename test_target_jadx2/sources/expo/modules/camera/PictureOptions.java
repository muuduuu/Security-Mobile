package expo.modules.camera;

import Ab.b;
import Ab.c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b7\b\u0086\b\u0018\u00002\u00020\u0001B{\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u001e\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0017J\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0017J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010\u0017J\u0084\u0001\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b'\u0010!J\u001a\u0010)\u001a\u00020\u00042\b\u0010(\u001a\u0004\u0018\u00010\tHÖ\u0003¢\u0006\u0004\b)\u0010*R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010+\u0012\u0004\b-\u0010.\u001a\u0004\b,\u0010\u0015R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010/\u0012\u0004\b1\u0010.\u001a\u0004\b0\u0010\u0017R \u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010/\u0012\u0004\b3\u0010.\u001a\u0004\b2\u0010\u0017R.\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00104\u0012\u0004\b6\u0010.\u001a\u0004\b5\u0010\u001aR \u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010/\u0012\u0004\b8\u0010.\u001a\u0004\b7\u0010\u0017R \u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010/\u0012\u0004\b:\u0010.\u001a\u0004\b9\u0010\u0017R \u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010/\u0012\u0004\b<\u0010.\u001a\u0004\b;\u0010\u0017R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010=\u0012\u0004\b?\u0010.\u001a\u0004\b>\u0010\u001fR \u0010\u0010\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010@\u0012\u0004\bB\u0010.\u001a\u0004\bA\u0010!R \u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010/\u0012\u0004\bD\u0010.\u001a\u0004\bC\u0010\u0017¨\u0006E"}, d2 = {"Lexpo/modules/camera/PictureOptions;", "LAb/c;", BuildConfig.FLAVOR, "quality", BuildConfig.FLAVOR, "base64", "exif", BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, "additionalExif", "mirror", "skipProcessing", "fastMode", BuildConfig.FLAVOR, "id", "maxDownsampling", "shutterSound", "<init>", "(DZZLjava/util/Map;ZZZLjava/lang/Integer;IZ)V", "component1", "()D", "component2", "()Z", "component3", "component4", "()Ljava/util/Map;", "component5", "component6", "component7", "component8", "()Ljava/lang/Integer;", "component9", "()I", "component10", "copy", "(DZZLjava/util/Map;ZZZLjava/lang/Integer;IZ)Lexpo/modules/camera/PictureOptions;", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "D", "getQuality", "getQuality$annotations", "()V", "Z", "getBase64", "getBase64$annotations", "getExif", "getExif$annotations", "Ljava/util/Map;", "getAdditionalExif", "getAdditionalExif$annotations", "getMirror", "getMirror$annotations", "getSkipProcessing", "getSkipProcessing$annotations", "getFastMode", "getFastMode$annotations", "Ljava/lang/Integer;", "getId", "getId$annotations", "I", "getMaxDownsampling", "getMaxDownsampling$annotations", "getShutterSound", "getShutterSound$annotations", "expo-camera_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PictureOptions implements c {
    private final Map<String, Object> additionalExif;
    private final boolean base64;
    private final boolean exif;
    private final boolean fastMode;
    private final Integer id;
    private final int maxDownsampling;
    private final boolean mirror;
    private final double quality;
    private final boolean shutterSound;
    private final boolean skipProcessing;

    public PictureOptions() {
        this(0.0d, false, false, null, false, false, false, null, 0, false, 1023, null);
    }

    @b
    public static /* synthetic */ void getAdditionalExif$annotations() {
    }

    @b
    public static /* synthetic */ void getBase64$annotations() {
    }

    @b
    public static /* synthetic */ void getExif$annotations() {
    }

    @b
    public static /* synthetic */ void getFastMode$annotations() {
    }

    @b
    public static /* synthetic */ void getId$annotations() {
    }

    @b
    public static /* synthetic */ void getMaxDownsampling$annotations() {
    }

    @b
    public static /* synthetic */ void getMirror$annotations() {
    }

    @b
    public static /* synthetic */ void getQuality$annotations() {
    }

    @b
    public static /* synthetic */ void getShutterSound$annotations() {
    }

    @b
    public static /* synthetic */ void getSkipProcessing$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final double getQuality() {
        return this.quality;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getShutterSound() {
        return this.shutterSound;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getBase64() {
        return this.base64;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getExif() {
        return this.exif;
    }

    public final Map<String, Object> component4() {
        return this.additionalExif;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getMirror() {
        return this.mirror;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getSkipProcessing() {
        return this.skipProcessing;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getFastMode() {
        return this.fastMode;
    }

    /* renamed from: component8, reason: from getter */
    public final Integer getId() {
        return this.id;
    }

    /* renamed from: component9, reason: from getter */
    public final int getMaxDownsampling() {
        return this.maxDownsampling;
    }

    public final PictureOptions copy(double quality, boolean base64, boolean exif, Map<String, ? extends Object> additionalExif, boolean mirror, boolean skipProcessing, boolean fastMode, Integer id2, int maxDownsampling, boolean shutterSound) {
        return new PictureOptions(quality, base64, exif, additionalExif, mirror, skipProcessing, fastMode, id2, maxDownsampling, shutterSound);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PictureOptions)) {
            return false;
        }
        PictureOptions pictureOptions = (PictureOptions) other;
        return Double.compare(this.quality, pictureOptions.quality) == 0 && this.base64 == pictureOptions.base64 && this.exif == pictureOptions.exif && Intrinsics.b(this.additionalExif, pictureOptions.additionalExif) && this.mirror == pictureOptions.mirror && this.skipProcessing == pictureOptions.skipProcessing && this.fastMode == pictureOptions.fastMode && Intrinsics.b(this.id, pictureOptions.id) && this.maxDownsampling == pictureOptions.maxDownsampling && this.shutterSound == pictureOptions.shutterSound;
    }

    public final Map<String, Object> getAdditionalExif() {
        return this.additionalExif;
    }

    public final boolean getBase64() {
        return this.base64;
    }

    public final boolean getExif() {
        return this.exif;
    }

    public final boolean getFastMode() {
        return this.fastMode;
    }

    public final Integer getId() {
        return this.id;
    }

    public final int getMaxDownsampling() {
        return this.maxDownsampling;
    }

    public final boolean getMirror() {
        return this.mirror;
    }

    public final double getQuality() {
        return this.quality;
    }

    public final boolean getShutterSound() {
        return this.shutterSound;
    }

    public final boolean getSkipProcessing() {
        return this.skipProcessing;
    }

    public int hashCode() {
        int hashCode = ((((Double.hashCode(this.quality) * 31) + Boolean.hashCode(this.base64)) * 31) + Boolean.hashCode(this.exif)) * 31;
        Map<String, Object> map = this.additionalExif;
        int hashCode2 = (((((((hashCode + (map == null ? 0 : map.hashCode())) * 31) + Boolean.hashCode(this.mirror)) * 31) + Boolean.hashCode(this.skipProcessing)) * 31) + Boolean.hashCode(this.fastMode)) * 31;
        Integer num = this.id;
        return ((((hashCode2 + (num != null ? num.hashCode() : 0)) * 31) + Integer.hashCode(this.maxDownsampling)) * 31) + Boolean.hashCode(this.shutterSound);
    }

    public String toString() {
        return "PictureOptions(quality=" + this.quality + ", base64=" + this.base64 + ", exif=" + this.exif + ", additionalExif=" + this.additionalExif + ", mirror=" + this.mirror + ", skipProcessing=" + this.skipProcessing + ", fastMode=" + this.fastMode + ", id=" + this.id + ", maxDownsampling=" + this.maxDownsampling + ", shutterSound=" + this.shutterSound + ")";
    }

    public PictureOptions(double d10, boolean z10, boolean z11, Map<String, ? extends Object> map, boolean z12, boolean z13, boolean z14, Integer num, int i10, boolean z15) {
        this.quality = d10;
        this.base64 = z10;
        this.exif = z11;
        this.additionalExif = map;
        this.mirror = z12;
        this.skipProcessing = z13;
        this.fastMode = z14;
        this.id = num;
        this.maxDownsampling = i10;
        this.shutterSound = z15;
    }

    public /* synthetic */ PictureOptions(double d10, boolean z10, boolean z11, Map map, boolean z12, boolean z13, boolean z14, Integer num, int i10, boolean z15, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 1.0d : d10, (i11 & 2) != 0 ? false : z10, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? null : map, (i11 & 16) != 0 ? false : z12, (i11 & 32) != 0 ? false : z13, (i11 & 64) == 0 ? z14 : false, (i11 & 128) == 0 ? num : null, (i11 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? 1 : i10, (i11 & 512) == 0 ? z15 : true);
    }
}
