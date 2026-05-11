package lc;

import kotlin.enums.EnumEntries;
import qc.AbstractC3958a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class l {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final l SYNCHRONIZED = new l("SYNCHRONIZED", 0);
    public static final l PUBLICATION = new l("PUBLICATION", 1);
    public static final l NONE = new l("NONE", 2);

    private static final /* synthetic */ l[] $values() {
        return new l[]{SYNCHRONIZED, PUBLICATION, NONE};
    }

    static {
        l[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC3958a.a($values);
    }

    private l(String str, int i10) {
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }
}
