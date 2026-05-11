package ad;

import kotlin.enums.EnumEntries;
import qc.AbstractC3958a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ad.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC1390o {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EnumC1390o[] $VALUES;
    public static final EnumC1390o FLEXIBLE_LOWER = new EnumC1390o("FLEXIBLE_LOWER", 0);
    public static final EnumC1390o FLEXIBLE_UPPER = new EnumC1390o("FLEXIBLE_UPPER", 1);
    public static final EnumC1390o INFLEXIBLE = new EnumC1390o("INFLEXIBLE", 2);

    private static final /* synthetic */ EnumC1390o[] $values() {
        return new EnumC1390o[]{FLEXIBLE_LOWER, FLEXIBLE_UPPER, INFLEXIBLE};
    }

    static {
        EnumC1390o[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC3958a.a($values);
    }

    private EnumC1390o(String str, int i10) {
    }

    public static EnumC1390o valueOf(String str) {
        return (EnumC1390o) Enum.valueOf(EnumC1390o.class, str);
    }

    public static EnumC1390o[] values() {
        return (EnumC1390o[]) $VALUES.clone();
    }
}
