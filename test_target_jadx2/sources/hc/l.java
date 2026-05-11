package Hc;

import id.C3367b;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import qc.AbstractC3958a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class l {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final l UBYTEARRAY;
    public static final l UINTARRAY;
    public static final l ULONGARRAY;
    public static final l USHORTARRAY;
    private final C3367b classId;
    private final id.f typeName;

    private static final /* synthetic */ l[] $values() {
        return new l[]{UBYTEARRAY, USHORTARRAY, UINTARRAY, ULONGARRAY};
    }

    static {
        C3367b e10 = C3367b.e("kotlin/UByteArray");
        Intrinsics.checkNotNullExpressionValue(e10, "fromString(...)");
        UBYTEARRAY = new l("UBYTEARRAY", 0, e10);
        C3367b e11 = C3367b.e("kotlin/UShortArray");
        Intrinsics.checkNotNullExpressionValue(e11, "fromString(...)");
        USHORTARRAY = new l("USHORTARRAY", 1, e11);
        C3367b e12 = C3367b.e("kotlin/UIntArray");
        Intrinsics.checkNotNullExpressionValue(e12, "fromString(...)");
        UINTARRAY = new l("UINTARRAY", 2, e12);
        C3367b e13 = C3367b.e("kotlin/ULongArray");
        Intrinsics.checkNotNullExpressionValue(e13, "fromString(...)");
        ULONGARRAY = new l("ULONGARRAY", 3, e13);
        l[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC3958a.a($values);
    }

    private l(String str, int i10, C3367b c3367b) {
        this.classId = c3367b;
        id.f j10 = c3367b.j();
        Intrinsics.checkNotNullExpressionValue(j10, "getShortClassName(...)");
        this.typeName = j10;
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }

    public final id.f getTypeName() {
        return this.typeName;
    }
}
