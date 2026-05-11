package nd;

import kotlin.enums.EnumEntries;
import qc.AbstractC3958a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: nd.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC3732b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EnumC3732b[] $VALUES;
    public static final EnumC3732b WARNING = new EnumC3732b("WARNING", 0);
    public static final EnumC3732b ERROR = new EnumC3732b("ERROR", 1);
    public static final EnumC3732b HIDDEN = new EnumC3732b("HIDDEN", 2);

    private static final /* synthetic */ EnumC3732b[] $values() {
        return new EnumC3732b[]{WARNING, ERROR, HIDDEN};
    }

    static {
        EnumC3732b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC3958a.a($values);
    }

    private EnumC3732b(String str, int i10) {
    }

    public static EnumC3732b valueOf(String str) {
        return (EnumC3732b) Enum.valueOf(EnumC3732b.class, str);
    }

    public static EnumC3732b[] values() {
        return (EnumC3732b[]) $VALUES.clone();
    }
}
