package expo.modules.imagepicker;

import expo.modules.kotlin.types.Enumerable;
import kotlin.Metadata;
import kotlin.collections.AbstractC3574i;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lc.m;
import org.conscrypt.BuildConfig;
import qc.AbstractC3958a;
import u5.C4870a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0080\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\bJ\r\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\bj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lexpo/modules/imagepicker/MediaTypes;", BuildConfig.FLAVOR, "Lexpo/modules/kotlin/types/Enumerable;", BuildConfig.FLAVOR, "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toMimeType", "()Ljava/lang/String;", "toFileExtension", "toCameraIntentAction", "Ljava/lang/String;", "getValue", "Companion", C4870a.f43493a, "IMAGES", "VIDEOS", "ALL", "expo-image-picker_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MediaTypes implements Enumerable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MediaTypes[] $VALUES;
    private static final String AllMimeType = "*/*";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final String ImageAllMimeType = "image/*";
    private static final String VideoAllMimeType = "video/*";
    private final String value;
    public static final MediaTypes IMAGES = new MediaTypes("IMAGES", 0, "Images");
    public static final MediaTypes VIDEOS = new MediaTypes("VIDEOS", 1, "Videos");
    public static final MediaTypes ALL = new MediaTypes("ALL", 2, "All");

    /* renamed from: expo.modules.imagepicker.MediaTypes$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final MediaTypes a(JSMediaTypes[] mediaTypes) {
            Intrinsics.checkNotNullParameter(mediaTypes, "mediaTypes");
            JSMediaTypes jSMediaTypes = JSMediaTypes.VIDEOS;
            return !AbstractC3574i.v(mediaTypes, jSMediaTypes) ? MediaTypes.IMAGES : (!AbstractC3574i.v(mediaTypes, jSMediaTypes) || AbstractC3574i.v(mediaTypes, JSMediaTypes.IMAGES)) ? MediaTypes.ALL : MediaTypes.VIDEOS;
        }

        private Companion() {
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32679a;

        static {
            int[] iArr = new int[MediaTypes.values().length];
            try {
                iArr[MediaTypes.IMAGES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MediaTypes.VIDEOS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MediaTypes.ALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f32679a = iArr;
        }
    }

    private static final /* synthetic */ MediaTypes[] $values() {
        return new MediaTypes[]{IMAGES, VIDEOS, ALL};
    }

    static {
        MediaTypes[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC3958a.a($values);
        INSTANCE = new Companion(null);
    }

    private MediaTypes(String str, int i10, String str2) {
        this.value = str2;
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static MediaTypes valueOf(String str) {
        return (MediaTypes) Enum.valueOf(MediaTypes.class, str);
    }

    public static MediaTypes[] values() {
        return (MediaTypes[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public final String toCameraIntentAction() {
        return b.f32679a[ordinal()] == 2 ? "android.media.action.VIDEO_CAPTURE" : "android.media.action.IMAGE_CAPTURE";
    }

    public final String toFileExtension() {
        return b.f32679a[ordinal()] == 2 ? ".mp4" : ".jpeg";
    }

    public final String toMimeType() {
        int i10 = b.f32679a[ordinal()];
        if (i10 == 1) {
            return ImageAllMimeType;
        }
        if (i10 == 2) {
            return VideoAllMimeType;
        }
        if (i10 == 3) {
            return AllMimeType;
        }
        throw new m();
    }
}
