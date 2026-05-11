package expo.modules.camera.records;

import V.AbstractC1258v;
import expo.modules.kotlin.types.Enumerable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import lc.m;
import org.conscrypt.BuildConfig;
import qc.AbstractC3958a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\u000b\u0010\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lexpo/modules/camera/records/VideoQuality;", BuildConfig.FLAVOR, "Lexpo/modules/kotlin/types/Enumerable;", BuildConfig.FLAVOR, "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "LV/v;", "mapToQuality", "()LV/v;", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "VIDEO2160P", "VIDEO1080P", "VIDEO720P", "VIDEO480P", "VIDEO4X3", "expo-camera_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VideoQuality implements Enumerable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ VideoQuality[] $VALUES;
    private final String value;
    public static final VideoQuality VIDEO2160P = new VideoQuality("VIDEO2160P", 0, "2160p");
    public static final VideoQuality VIDEO1080P = new VideoQuality("VIDEO1080P", 1, "1080p");
    public static final VideoQuality VIDEO720P = new VideoQuality("VIDEO720P", 2, "720p");
    public static final VideoQuality VIDEO480P = new VideoQuality("VIDEO480P", 3, "480p");
    public static final VideoQuality VIDEO4X3 = new VideoQuality("VIDEO4X3", 4, "4:3");

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32588a;

        static {
            int[] iArr = new int[VideoQuality.values().length];
            try {
                iArr[VideoQuality.VIDEO2160P.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoQuality.VIDEO1080P.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoQuality.VIDEO720P.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VideoQuality.VIDEO480P.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VideoQuality.VIDEO4X3.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f32588a = iArr;
        }
    }

    private static final /* synthetic */ VideoQuality[] $values() {
        return new VideoQuality[]{VIDEO2160P, VIDEO1080P, VIDEO720P, VIDEO480P, VIDEO4X3};
    }

    static {
        VideoQuality[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC3958a.a($values);
    }

    private VideoQuality(String str, int i10, String str2) {
        this.value = str2;
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static VideoQuality valueOf(String str) {
        return (VideoQuality) Enum.valueOf(VideoQuality.class, str);
    }

    public static VideoQuality[] values() {
        return (VideoQuality[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public final AbstractC1258v mapToQuality() {
        int i10 = a.f32588a[ordinal()];
        if (i10 == 1) {
            AbstractC1258v UHD = AbstractC1258v.f10729d;
            Intrinsics.checkNotNullExpressionValue(UHD, "UHD");
            return UHD;
        }
        if (i10 == 2) {
            AbstractC1258v FHD = AbstractC1258v.f10728c;
            Intrinsics.checkNotNullExpressionValue(FHD, "FHD");
            return FHD;
        }
        if (i10 == 3) {
            AbstractC1258v HD = AbstractC1258v.f10727b;
            Intrinsics.checkNotNullExpressionValue(HD, "HD");
            return HD;
        }
        if (i10 == 4) {
            AbstractC1258v SD = AbstractC1258v.f10726a;
            Intrinsics.checkNotNullExpressionValue(SD, "SD");
            return SD;
        }
        if (i10 != 5) {
            throw new m();
        }
        AbstractC1258v LOWEST = AbstractC1258v.f10730e;
        Intrinsics.checkNotNullExpressionValue(LOWEST, "LOWEST");
        return LOWEST;
    }
}
