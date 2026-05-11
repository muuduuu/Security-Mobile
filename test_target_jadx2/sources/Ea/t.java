package ea;

import kotlin.enums.EnumEntries;
import qc.AbstractC3958a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class t {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ t[] $VALUES;
    public static final t NONE = new t("NONE", 0);
    public static final t BOX_NONE = new t("BOX_NONE", 1);
    public static final t BOX_ONLY = new t("BOX_ONLY", 2);
    public static final t AUTO = new t("AUTO", 3);

    private static final /* synthetic */ t[] $values() {
        return new t[]{NONE, BOX_NONE, BOX_ONLY, AUTO};
    }

    static {
        t[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC3958a.a($values);
    }

    private t(String str, int i10) {
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) $VALUES.clone();
    }
}
