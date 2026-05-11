package com.th3rdwave.safeareacontext;

import kotlin.enums.EnumEntries;
import qc.AbstractC3958a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class o {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ o[] $VALUES;
    public static final o PADDING = new o("PADDING", 0);
    public static final o MARGIN = new o("MARGIN", 1);

    private static final /* synthetic */ o[] $values() {
        return new o[]{PADDING, MARGIN};
    }

    static {
        o[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC3958a.a($values);
    }

    private o(String str, int i10) {
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) $VALUES.clone();
    }
}
