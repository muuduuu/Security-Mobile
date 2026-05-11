package expo.modules.camera.records;

import expo.modules.kotlin.types.Enumerable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;
import qc.AbstractC3958a;
import va.C4980c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\u000b\u0010\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lexpo/modules/camera/records/CameraRatio;", BuildConfig.FLAVOR, "Lexpo/modules/kotlin/types/Enumerable;", BuildConfig.FLAVOR, "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "LP/a;", "mapToStrategy", "()LP/a;", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "FOUR_THREE", "SIXTEEN_NINE", "ONE_ONE", "expo-camera_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CameraRatio implements Enumerable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CameraRatio[] $VALUES;
    private final String value;
    public static final CameraRatio FOUR_THREE = new CameraRatio("FOUR_THREE", 0, "4:3");
    public static final CameraRatio SIXTEEN_NINE = new CameraRatio("SIXTEEN_NINE", 1, "16:9");
    public static final CameraRatio ONE_ONE = new CameraRatio("ONE_ONE", 2, "1:1");

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32585a;

        static {
            int[] iArr = new int[CameraRatio.values().length];
            try {
                iArr[CameraRatio.FOUR_THREE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CameraRatio.SIXTEEN_NINE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f32585a = iArr;
        }
    }

    private static final /* synthetic */ CameraRatio[] $values() {
        return new CameraRatio[]{FOUR_THREE, SIXTEEN_NINE, ONE_ONE};
    }

    static {
        CameraRatio[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC3958a.a($values);
    }

    private CameraRatio(String str, int i10, String str2) {
        this.value = str2;
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static CameraRatio valueOf(String str) {
        return (CameraRatio) Enum.valueOf(CameraRatio.class, str);
    }

    public static CameraRatio[] values() {
        return (CameraRatio[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public final P.a mapToStrategy() {
        P.a aVar;
        int i10 = a.f32585a[ordinal()];
        if (i10 == 1) {
            aVar = P.a.f7357c;
        } else {
            if (i10 != 2) {
                throw new C4980c(this.value);
            }
            aVar = P.a.f7358d;
        }
        Intrinsics.d(aVar);
        return aVar;
    }
}
