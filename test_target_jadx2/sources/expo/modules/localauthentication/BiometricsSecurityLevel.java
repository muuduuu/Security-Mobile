package expo.modules.localauthentication;

import expo.modules.kotlin.types.Enumerable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import lc.m;
import org.conscrypt.BuildConfig;
import qc.AbstractC3958a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0006\u0010\b\u001a\u00020\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lexpo/modules/localauthentication/BiometricsSecurityLevel;", BuildConfig.FLAVOR, "Lexpo/modules/kotlin/types/Enumerable;", "value", BuildConfig.FLAVOR, "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "toNativeBiometricSecurityLevel", BuildConfig.FLAVOR, "WEAK", "STRONG", "expo-local-authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BiometricsSecurityLevel implements Enumerable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BiometricsSecurityLevel[] $VALUES;
    private final String value;
    public static final BiometricsSecurityLevel WEAK = new BiometricsSecurityLevel("WEAK", 0, "weak");
    public static final BiometricsSecurityLevel STRONG = new BiometricsSecurityLevel("STRONG", 1, "strong");

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32763a;

        static {
            int[] iArr = new int[BiometricsSecurityLevel.values().length];
            try {
                iArr[BiometricsSecurityLevel.WEAK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BiometricsSecurityLevel.STRONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f32763a = iArr;
        }
    }

    private static final /* synthetic */ BiometricsSecurityLevel[] $values() {
        return new BiometricsSecurityLevel[]{WEAK, STRONG};
    }

    static {
        BiometricsSecurityLevel[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC3958a.a($values);
    }

    private BiometricsSecurityLevel(String str, int i10, String str2) {
        this.value = str2;
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static BiometricsSecurityLevel valueOf(String str) {
        return (BiometricsSecurityLevel) Enum.valueOf(BiometricsSecurityLevel.class, str);
    }

    public static BiometricsSecurityLevel[] values() {
        return (BiometricsSecurityLevel[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public final int toNativeBiometricSecurityLevel() {
        int i10 = a.f32763a[ordinal()];
        if (i10 == 1) {
            return 255;
        }
        if (i10 == 2) {
            return 15;
        }
        throw new m();
    }
}
