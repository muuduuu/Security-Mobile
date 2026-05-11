package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import kotlin.enums.EnumEntries;
import qc.AbstractC3958a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class m {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ m[] $VALUES;
    public static final m RUNTIME = new m("RUNTIME", 0);
    public static final m BINARY = new m("BINARY", 1);
    public static final m SOURCE = new m("SOURCE", 2);

    private static final /* synthetic */ m[] $values() {
        return new m[]{RUNTIME, BINARY, SOURCE};
    }

    static {
        m[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC3958a.a($values);
    }

    private m(String str, int i10) {
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) $VALUES.clone();
    }
}
