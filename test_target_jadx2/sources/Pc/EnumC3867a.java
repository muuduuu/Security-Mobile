package pc;

import kotlin.enums.EnumEntries;
import qc.AbstractC3958a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: pc.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC3867a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EnumC3867a[] $VALUES;
    public static final EnumC3867a COROUTINE_SUSPENDED = new EnumC3867a("COROUTINE_SUSPENDED", 0);
    public static final EnumC3867a UNDECIDED = new EnumC3867a("UNDECIDED", 1);
    public static final EnumC3867a RESUMED = new EnumC3867a("RESUMED", 2);

    private static final /* synthetic */ EnumC3867a[] $values() {
        return new EnumC3867a[]{COROUTINE_SUSPENDED, UNDECIDED, RESUMED};
    }

    static {
        EnumC3867a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC3958a.a($values);
    }

    private EnumC3867a(String str, int i10) {
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static EnumC3867a valueOf(String str) {
        return (EnumC3867a) Enum.valueOf(EnumC3867a.class, str);
    }

    public static EnumC3867a[] values() {
        return (EnumC3867a[]) $VALUES.clone();
    }
}
