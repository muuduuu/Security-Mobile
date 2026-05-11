package v9;

import kotlin.enums.EnumEntries;
import qc.AbstractC3958a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: v9.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC4972a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EnumC4972a[] $VALUES;
    public static final EnumC4972a INTERACTIVE = new EnumC4972a("INTERACTIVE", 0);
    public static final EnumC4972a PROCESSING = new EnumC4972a("PROCESSING", 1);
    public static final EnumC4972a BACKGROUND = new EnumC4972a("BACKGROUND", 2);
    public static final EnumC4972a UNKNOWN = new EnumC4972a("UNKNOWN", 3);

    private static final /* synthetic */ EnumC4972a[] $values() {
        return new EnumC4972a[]{INTERACTIVE, PROCESSING, BACKGROUND, UNKNOWN};
    }

    static {
        EnumC4972a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC3958a.a($values);
    }

    private EnumC4972a(String str, int i10) {
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static EnumC4972a valueOf(String str) {
        return (EnumC4972a) Enum.valueOf(EnumC4972a.class, str);
    }

    public static EnumC4972a[] values() {
        return (EnumC4972a[]) $VALUES.clone();
    }
}
