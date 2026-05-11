package kotlin.reflect;

import kotlin.enums.EnumEntries;
import qc.AbstractC3958a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class q {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ q[] $VALUES;
    public static final q INVARIANT = new q("INVARIANT", 0);
    public static final q IN = new q("IN", 1);
    public static final q OUT = new q("OUT", 2);

    private static final /* synthetic */ q[] $values() {
        return new q[]{INVARIANT, IN, OUT};
    }

    static {
        q[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC3958a.a($values);
    }

    private q(String str, int i10) {
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) $VALUES.clone();
    }
}
