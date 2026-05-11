package ad;

import kotlin.enums.EnumEntries;
import qc.AbstractC3958a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ad.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC1379f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EnumC1379f[] $VALUES;
    public static final EnumC1379f READ_ONLY = new EnumC1379f("READ_ONLY", 0);
    public static final EnumC1379f MUTABLE = new EnumC1379f("MUTABLE", 1);

    private static final /* synthetic */ EnumC1379f[] $values() {
        return new EnumC1379f[]{READ_ONLY, MUTABLE};
    }

    static {
        EnumC1379f[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC3958a.a($values);
    }

    private EnumC1379f(String str, int i10) {
    }

    public static EnumC1379f valueOf(String str) {
        return (EnumC1379f) Enum.valueOf(EnumC1379f.class, str);
    }

    public static EnumC1379f[] values() {
        return (EnumC1379f[]) $VALUES.clone();
    }
}
