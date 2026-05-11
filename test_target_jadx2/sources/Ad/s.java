package Ad;

import com.webengage.sdk.android.utils.WebEngageConstant;
import kotlin.enums.EnumEntries;
import org.conscrypt.BuildConfig;
import qc.AbstractC3958a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class s {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ s[] $VALUES;
    private final String presentation;
    public static final s IN = new s("IN", 0, WebEngageConstant.IN);
    public static final s OUT = new s("OUT", 1, "out");
    public static final s INV = new s("INV", 2, BuildConfig.FLAVOR);

    private static final /* synthetic */ s[] $values() {
        return new s[]{IN, OUT, INV};
    }

    static {
        s[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC3958a.a($values);
    }

    private s(String str, int i10, String str2) {
        this.presentation = str2;
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.presentation;
    }
}
