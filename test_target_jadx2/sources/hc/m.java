package Hc;

import id.C3367b;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import qc.AbstractC3958a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class m {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ m[] $VALUES;
    public static final m UBYTE;
    public static final m UINT;
    public static final m ULONG;
    public static final m USHORT;
    private final C3367b arrayClassId;
    private final C3367b classId;
    private final id.f typeName;

    private static final /* synthetic */ m[] $values() {
        return new m[]{UBYTE, USHORT, UINT, ULONG};
    }

    static {
        C3367b e10 = C3367b.e("kotlin/UByte");
        Intrinsics.checkNotNullExpressionValue(e10, "fromString(...)");
        UBYTE = new m("UBYTE", 0, e10);
        C3367b e11 = C3367b.e("kotlin/UShort");
        Intrinsics.checkNotNullExpressionValue(e11, "fromString(...)");
        USHORT = new m("USHORT", 1, e11);
        C3367b e12 = C3367b.e("kotlin/UInt");
        Intrinsics.checkNotNullExpressionValue(e12, "fromString(...)");
        UINT = new m("UINT", 2, e12);
        C3367b e13 = C3367b.e("kotlin/ULong");
        Intrinsics.checkNotNullExpressionValue(e13, "fromString(...)");
        ULONG = new m("ULONG", 3, e13);
        m[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC3958a.a($values);
    }

    private m(String str, int i10, C3367b c3367b) {
        this.classId = c3367b;
        id.f j10 = c3367b.j();
        Intrinsics.checkNotNullExpressionValue(j10, "getShortClassName(...)");
        this.typeName = j10;
        this.arrayClassId = new C3367b(c3367b.h(), id.f.o(j10.c() + "Array"));
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) $VALUES.clone();
    }

    public final C3367b getArrayClassId() {
        return this.arrayClassId;
    }

    public final C3367b getClassId() {
        return this.classId;
    }

    public final id.f getTypeName() {
        return this.typeName;
    }
}
