package ad;

import kotlin.enums.EnumEntries;
import qc.AbstractC3958a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ad.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC1381h {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EnumC1381h[] $VALUES;
    public static final EnumC1381h FORCE_FLEXIBILITY = new EnumC1381h("FORCE_FLEXIBILITY", 0);
    public static final EnumC1381h NULLABLE = new EnumC1381h("NULLABLE", 1);
    public static final EnumC1381h NOT_NULL = new EnumC1381h("NOT_NULL", 2);

    private static final /* synthetic */ EnumC1381h[] $values() {
        return new EnumC1381h[]{FORCE_FLEXIBILITY, NULLABLE, NOT_NULL};
    }

    static {
        EnumC1381h[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC3958a.a($values);
    }

    private EnumC1381h(String str, int i10) {
    }

    public static EnumC1381h valueOf(String str) {
        return (EnumC1381h) Enum.valueOf(EnumC1381h.class, str);
    }

    public static EnumC1381h[] values() {
        return (EnumC1381h[]) $VALUES.clone();
    }
}
