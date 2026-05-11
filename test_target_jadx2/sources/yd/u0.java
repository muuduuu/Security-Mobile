package yd;

import com.webengage.sdk.android.utils.WebEngageConstant;
import kotlin.enums.EnumEntries;
import org.conscrypt.BuildConfig;
import qc.AbstractC3958a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class u0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ u0[] $VALUES;
    public static final u0 INVARIANT = new u0("INVARIANT", 0, BuildConfig.FLAVOR, true, true, 0);
    public static final u0 IN_VARIANCE = new u0("IN_VARIANCE", 1, WebEngageConstant.IN, true, false, -1);
    public static final u0 OUT_VARIANCE = new u0("OUT_VARIANCE", 2, "out", false, true, 1);
    private final boolean allowsInPosition;
    private final boolean allowsOutPosition;
    private final String label;
    private final int superpositionFactor;

    private static final /* synthetic */ u0[] $values() {
        return new u0[]{INVARIANT, IN_VARIANCE, OUT_VARIANCE};
    }

    static {
        u0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC3958a.a($values);
    }

    private u0(String str, int i10, String str2, boolean z10, boolean z11, int i11) {
        this.label = str2;
        this.allowsInPosition = z10;
        this.allowsOutPosition = z11;
        this.superpositionFactor = i11;
    }

    public static u0 valueOf(String str) {
        return (u0) Enum.valueOf(u0.class, str);
    }

    public static u0[] values() {
        return (u0[]) $VALUES.clone();
    }

    public final boolean getAllowsOutPosition() {
        return this.allowsOutPosition;
    }

    public final String getLabel() {
        return this.label;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.label;
    }
}
