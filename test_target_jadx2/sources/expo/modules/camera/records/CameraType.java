package expo.modules.camera.records;

import expo.modules.kotlin.types.Enumerable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import lc.m;
import org.conscrypt.BuildConfig;
import qc.AbstractC3958a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0006\u0010\b\u001a\u00020\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lexpo/modules/camera/records/CameraType;", BuildConfig.FLAVOR, "Lexpo/modules/kotlin/types/Enumerable;", "value", BuildConfig.FLAVOR, "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "mapToCharacteristic", BuildConfig.FLAVOR, "FRONT", "BACK", "expo-camera_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CameraType implements Enumerable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CameraType[] $VALUES;
    private final String value;
    public static final CameraType FRONT = new CameraType("FRONT", 0, "front");
    public static final CameraType BACK = new CameraType("BACK", 1, "back");

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32586a;

        static {
            int[] iArr = new int[CameraType.values().length];
            try {
                iArr[CameraType.FRONT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CameraType.BACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f32586a = iArr;
        }
    }

    private static final /* synthetic */ CameraType[] $values() {
        return new CameraType[]{FRONT, BACK};
    }

    static {
        CameraType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC3958a.a($values);
    }

    private CameraType(String str, int i10, String str2) {
        this.value = str2;
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static CameraType valueOf(String str) {
        return (CameraType) Enum.valueOf(CameraType.class, str);
    }

    public static CameraType[] values() {
        return (CameraType[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public final int mapToCharacteristic() {
        int i10 = a.f32586a[ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        throw new m();
    }
}
