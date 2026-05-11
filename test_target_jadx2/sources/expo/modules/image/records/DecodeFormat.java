package expo.modules.image.records;

import expo.modules.kotlin.types.Enumerable;
import i2.EnumC3314b;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import lc.m;
import org.conscrypt.BuildConfig;
import qc.AbstractC3958a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lexpo/modules/image/records/DecodeFormat;", BuildConfig.FLAVOR, "Lexpo/modules/kotlin/types/Enumerable;", BuildConfig.FLAVOR, "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Li2/b;", "toGlideFormat", "()Li2/b;", BuildConfig.FLAVOR, "toBytes", "()I", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "ARGB_8888", "RGB_565", "expo-image_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DecodeFormat implements Enumerable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DecodeFormat[] $VALUES;
    public static final DecodeFormat ARGB_8888 = new DecodeFormat("ARGB_8888", 0, "argb");
    public static final DecodeFormat RGB_565 = new DecodeFormat("RGB_565", 1, "rgb");
    private final String value;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32674a;

        static {
            int[] iArr = new int[DecodeFormat.values().length];
            try {
                iArr[DecodeFormat.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DecodeFormat.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f32674a = iArr;
        }
    }

    private static final /* synthetic */ DecodeFormat[] $values() {
        return new DecodeFormat[]{ARGB_8888, RGB_565};
    }

    static {
        DecodeFormat[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC3958a.a($values);
    }

    private DecodeFormat(String str, int i10, String str2) {
        this.value = str2;
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static DecodeFormat valueOf(String str) {
        return (DecodeFormat) Enum.valueOf(DecodeFormat.class, str);
    }

    public static DecodeFormat[] values() {
        return (DecodeFormat[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public final int toBytes() {
        int i10 = a.f32674a[ordinal()];
        if (i10 == 1) {
            return 4;
        }
        if (i10 == 2) {
            return 2;
        }
        throw new m();
    }

    public final EnumC3314b toGlideFormat() {
        int i10 = a.f32674a[ordinal()];
        if (i10 == 1) {
            return EnumC3314b.PREFER_ARGB_8888;
        }
        if (i10 == 2) {
            return EnumC3314b.PREFER_RGB_565;
        }
        throw new m();
    }
}
