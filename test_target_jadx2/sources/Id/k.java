package id;

import kotlin.enums.EnumEntries;
import qc.AbstractC3958a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
final class k {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;
    public static final k BEGINNING = new k("BEGINNING", 0);
    public static final k MIDDLE = new k("MIDDLE", 1);
    public static final k AFTER_DOT = new k("AFTER_DOT", 2);

    private static final /* synthetic */ k[] $values() {
        return new k[]{BEGINNING, MIDDLE, AFTER_DOT};
    }

    static {
        k[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC3958a.a($values);
    }

    private k(String str, int i10) {
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }
}
