package wd;

import kotlin.enums.EnumEntries;
import qc.AbstractC3958a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: wd.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC5073e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EnumC5073e[] $VALUES;
    public static final EnumC5073e STABLE = new EnumC5073e("STABLE", 0);
    public static final EnumC5073e FIR_UNSTABLE = new EnumC5073e("FIR_UNSTABLE", 1);
    public static final EnumC5073e IR_UNSTABLE = new EnumC5073e("IR_UNSTABLE", 2);

    private static final /* synthetic */ EnumC5073e[] $values() {
        return new EnumC5073e[]{STABLE, FIR_UNSTABLE, IR_UNSTABLE};
    }

    static {
        EnumC5073e[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC3958a.a($values);
    }

    private EnumC5073e(String str, int i10) {
    }

    public static EnumC5073e valueOf(String str) {
        return (EnumC5073e) Enum.valueOf(EnumC5073e.class, str);
    }

    public static EnumC5073e[] values() {
        return (EnumC5073e[]) $VALUES.clone();
    }
}
