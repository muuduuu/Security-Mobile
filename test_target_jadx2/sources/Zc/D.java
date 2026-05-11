package Zc;

import kotlin.enums.EnumEntries;
import qc.AbstractC3958a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class D {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ D[] $VALUES;
    public static final D SOURCE = new D("SOURCE", 0);
    public static final D BINARY = new D("BINARY", 1);

    private static final /* synthetic */ D[] $values() {
        return new D[]{SOURCE, BINARY};
    }

    static {
        D[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC3958a.a($values);
    }

    private D(String str, int i10) {
    }

    public static D valueOf(String str) {
        return (D) Enum.valueOf(D.class, str);
    }

    public static D[] values() {
        return (D[]) $VALUES.clone();
    }
}
