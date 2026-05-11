package Sc;

import kotlin.enums.EnumEntries;
import qc.AbstractC3958a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Sc.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC1152b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EnumC1152b[] $VALUES;
    private final String javaTarget;
    public static final EnumC1152b METHOD_RETURN_TYPE = new EnumC1152b("METHOD_RETURN_TYPE", 0, "METHOD");
    public static final EnumC1152b VALUE_PARAMETER = new EnumC1152b("VALUE_PARAMETER", 1, "PARAMETER");
    public static final EnumC1152b FIELD = new EnumC1152b("FIELD", 2, "FIELD");
    public static final EnumC1152b TYPE_USE = new EnumC1152b("TYPE_USE", 3, "TYPE_USE");
    public static final EnumC1152b TYPE_PARAMETER_BOUNDS = new EnumC1152b("TYPE_PARAMETER_BOUNDS", 4, "TYPE_USE");
    public static final EnumC1152b TYPE_PARAMETER = new EnumC1152b("TYPE_PARAMETER", 5, "TYPE_PARAMETER");

    private static final /* synthetic */ EnumC1152b[] $values() {
        return new EnumC1152b[]{METHOD_RETURN_TYPE, VALUE_PARAMETER, FIELD, TYPE_USE, TYPE_PARAMETER_BOUNDS, TYPE_PARAMETER};
    }

    static {
        EnumC1152b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC3958a.a($values);
    }

    private EnumC1152b(String str, int i10, String str2) {
        this.javaTarget = str2;
    }

    public static EnumC1152b valueOf(String str) {
        return (EnumC1152b) Enum.valueOf(EnumC1152b.class, str);
    }

    public static EnumC1152b[] values() {
        return (EnumC1152b[]) $VALUES.clone();
    }

    public final String getJavaTarget() {
        return this.javaTarget;
    }
}
