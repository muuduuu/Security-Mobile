package Ad;

import kotlin.enums.EnumEntries;
import qc.AbstractC3958a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b FOR_SUBTYPING = new b("FOR_SUBTYPING", 0);
    public static final b FOR_INCORPORATION = new b("FOR_INCORPORATION", 1);
    public static final b FROM_EXPRESSION = new b("FROM_EXPRESSION", 2);

    private static final /* synthetic */ b[] $values() {
        return new b[]{FOR_SUBTYPING, FOR_INCORPORATION, FROM_EXPRESSION};
    }

    static {
        b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC3958a.a($values);
    }

    private b(String str, int i10) {
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
