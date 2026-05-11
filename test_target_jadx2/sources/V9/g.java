package v9;

import kotlin.enums.EnumEntries;
import qc.AbstractC3958a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g EVENTS = new g("EVENTS", 0, "EVENTS");
    public static final g LOGS = new g("LOGS", 1, "LOGS");
    private final String value;

    private static final /* synthetic */ g[] $values() {
        return new g[]{EVENTS, LOGS};
    }

    static {
        g[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC3958a.a($values);
    }

    private g(String str, int i10, String str2) {
        this.value = str2;
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
