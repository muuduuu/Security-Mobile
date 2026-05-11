package expo.modules.image.enums;

import com.bumptech.glide.h;
import expo.modules.kotlin.types.Enumerable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import lc.m;
import org.conscrypt.BuildConfig;
import qc.AbstractC3958a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lexpo/modules/image/enums/Priority;", BuildConfig.FLAVOR, "Lexpo/modules/kotlin/types/Enumerable;", BuildConfig.FLAVOR, "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lcom/bumptech/glide/h;", "toGlidePriority$expo_image_release", "()Lcom/bumptech/glide/h;", "toGlidePriority", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "LOW", "NORMAL", "HIGH", "expo-image_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Priority implements Enumerable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Priority[] $VALUES;
    private final String value;
    public static final Priority LOW = new Priority("LOW", 0, "low");
    public static final Priority NORMAL = new Priority("NORMAL", 1, "normal");
    public static final Priority HIGH = new Priority("HIGH", 2, "high");

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32667a;

        static {
            int[] iArr = new int[Priority.values().length];
            try {
                iArr[Priority.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Priority.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Priority.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f32667a = iArr;
        }
    }

    private static final /* synthetic */ Priority[] $values() {
        return new Priority[]{LOW, NORMAL, HIGH};
    }

    static {
        Priority[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC3958a.a($values);
    }

    private Priority(String str, int i10, String str2) {
        this.value = str2;
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static Priority valueOf(String str) {
        return (Priority) Enum.valueOf(Priority.class, str);
    }

    public static Priority[] values() {
        return (Priority[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public final h toGlidePriority$expo_image_release() {
        int i10 = a.f32667a[ordinal()];
        if (i10 == 1) {
            return h.LOW;
        }
        if (i10 == 2) {
            return h.NORMAL;
        }
        if (i10 == 3) {
            return h.IMMEDIATE;
        }
        throw new m();
    }
}
