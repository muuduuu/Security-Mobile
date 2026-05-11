package Kc;

import kotlin.enums.EnumEntries;
import qc.AbstractC3958a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Kc.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC0934f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EnumC0934f[] $VALUES;
    private final String codeRepresentation;
    public static final EnumC0934f CLASS = new EnumC0934f("CLASS", 0, "class");
    public static final EnumC0934f INTERFACE = new EnumC0934f("INTERFACE", 1, "interface");
    public static final EnumC0934f ENUM_CLASS = new EnumC0934f("ENUM_CLASS", 2, "enum class");
    public static final EnumC0934f ENUM_ENTRY = new EnumC0934f("ENUM_ENTRY", 3, null);
    public static final EnumC0934f ANNOTATION_CLASS = new EnumC0934f("ANNOTATION_CLASS", 4, "annotation class");
    public static final EnumC0934f OBJECT = new EnumC0934f("OBJECT", 5, "object");

    private static final /* synthetic */ EnumC0934f[] $values() {
        return new EnumC0934f[]{CLASS, INTERFACE, ENUM_CLASS, ENUM_ENTRY, ANNOTATION_CLASS, OBJECT};
    }

    static {
        EnumC0934f[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC3958a.a($values);
    }

    private EnumC0934f(String str, int i10, String str2) {
        this.codeRepresentation = str2;
    }

    public static EnumC0934f valueOf(String str) {
        return (EnumC0934f) Enum.valueOf(EnumC0934f.class, str);
    }

    public static EnumC0934f[] values() {
        return (EnumC0934f[]) $VALUES.clone();
    }

    public final boolean isSingleton() {
        return this == OBJECT || this == ENUM_ENTRY;
    }
}
