package Xc;

import kotlin.enums.EnumEntries;
import qc.AbstractC3958a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c INFLEXIBLE = new c("INFLEXIBLE", 0);
    public static final c FLEXIBLE_UPPER_BOUND = new c("FLEXIBLE_UPPER_BOUND", 1);
    public static final c FLEXIBLE_LOWER_BOUND = new c("FLEXIBLE_LOWER_BOUND", 2);

    private static final /* synthetic */ c[] $values() {
        return new c[]{INFLEXIBLE, FLEXIBLE_UPPER_BOUND, FLEXIBLE_LOWER_BOUND};
    }

    static {
        c[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC3958a.a($values);
    }

    private c(String str, int i10) {
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
