package kotlin.io;

import kotlin.enums.EnumEntries;
import qc.AbstractC3958a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class q {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ q[] $VALUES;
    public static final q SKIP = new q("SKIP", 0);
    public static final q TERMINATE = new q("TERMINATE", 1);

    private static final /* synthetic */ q[] $values() {
        return new q[]{SKIP, TERMINATE};
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
