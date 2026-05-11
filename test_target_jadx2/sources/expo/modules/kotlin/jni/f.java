package expo.modules.kotlin.jni;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qc.AbstractC3958a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f BigInt64Array;
    public static final f BigUint64Array;
    public static final f Float32Array;
    public static final f Float64Array;
    public static final f Int16Array;
    public static final f Int32Array;
    public static final f Int8Array = new f("Int8Array", 0, 0, 1, null);
    public static final f Uint16Array;
    public static final f Uint32Array;
    public static final f Uint8Array;
    public static final f Uint8ClampedArray;
    private final int value;

    private static final /* synthetic */ f[] $values() {
        return new f[]{Int8Array, Int16Array, Int32Array, Uint8Array, Uint8ClampedArray, Uint16Array, Uint32Array, Float32Array, Float64Array, BigInt64Array, BigUint64Array};
    }

    static {
        int i10 = 1;
        DefaultConstructorMarker defaultConstructorMarker = null;
        int i11 = 0;
        Int16Array = new f("Int16Array", 1, i11, i10, defaultConstructorMarker);
        int i12 = 1;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        int i13 = 0;
        Int32Array = new f("Int32Array", 2, i13, i12, defaultConstructorMarker2);
        Uint8Array = new f("Uint8Array", 3, i11, i10, defaultConstructorMarker);
        Uint8ClampedArray = new f("Uint8ClampedArray", 4, i13, i12, defaultConstructorMarker2);
        Uint16Array = new f("Uint16Array", 5, i11, i10, defaultConstructorMarker);
        Uint32Array = new f("Uint32Array", 6, i13, i12, defaultConstructorMarker2);
        Float32Array = new f("Float32Array", 7, i11, i10, defaultConstructorMarker);
        Float64Array = new f("Float64Array", 8, i13, i12, defaultConstructorMarker2);
        BigInt64Array = new f("BigInt64Array", 9, i11, i10, defaultConstructorMarker);
        BigUint64Array = new f("BigUint64Array", 10, i13, i12, defaultConstructorMarker2);
        f[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC3958a.a($values);
    }

    private f(String str, int i10, int i11) {
        this.value = i11;
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    /* synthetic */ f(String str, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i10, (i12 & 1) != 0 ? e.b() : i11);
    }
}
