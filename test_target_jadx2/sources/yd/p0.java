package yd;

import kotlin.enums.EnumEntries;
import qc.AbstractC3958a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class p0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ p0[] $VALUES;
    public static final p0 SUPERTYPE = new p0("SUPERTYPE", 0);
    public static final p0 COMMON = new p0("COMMON", 1);

    private static final /* synthetic */ p0[] $values() {
        return new p0[]{SUPERTYPE, COMMON};
    }

    static {
        p0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC3958a.a($values);
    }

    private p0(String str, int i10) {
    }

    public static p0 valueOf(String str) {
        return (p0) Enum.valueOf(p0.class, str);
    }

    public static p0[] values() {
        return (p0[]) $VALUES.clone();
    }
}
