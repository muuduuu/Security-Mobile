package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.enums.EnumEntries;
import qc.AbstractC3958a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class k {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;
    public static final k ALL = new k("ALL", 0);
    public static final k ONLY_NON_SYNTHESIZED = new k("ONLY_NON_SYNTHESIZED", 1);
    public static final k NONE = new k("NONE", 2);

    private static final /* synthetic */ k[] $values() {
        return new k[]{ALL, ONLY_NON_SYNTHESIZED, NONE};
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
