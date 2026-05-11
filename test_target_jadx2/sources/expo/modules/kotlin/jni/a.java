package expo.modules.kotlin.jni;

import Cb.j;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.util.List;
import java.util.Map;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qc.AbstractC3958a;
import xc.C5142C;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a ANY;
    public static final a BOOLEAN;
    public static final a FLOAT;
    public static final a INT;
    public static final a JS_FUNCTION;
    public static final a JS_OBJECT;
    public static final a JS_VALUE;
    public static final a LIST;
    public static final a LONG;
    public static final a MAP;
    public static final a PRIMITIVE_ARRAY;
    public static final a READABLE_ARRAY;
    public static final a READABLE_MAP;
    public static final a SHARED_OBJECT_ID;
    public static final a STRING;
    public static final a TYPED_ARRAY;
    public static final a UINT8_TYPED_ARRAY;
    public static final a VIEW_TAG;
    private final kotlin.reflect.d clazz;
    private final int value;
    public static final a NONE = new a("NONE", 0, C5142C.b(Void.class), 0);
    public static final a DOUBLE = new a("DOUBLE", 1, C5142C.b(Double.TYPE), 0, 2, null);

    private static final /* synthetic */ a[] $values() {
        return new a[]{NONE, DOUBLE, INT, LONG, FLOAT, BOOLEAN, STRING, JS_OBJECT, JS_VALUE, READABLE_ARRAY, READABLE_MAP, UINT8_TYPED_ARRAY, TYPED_ARRAY, PRIMITIVE_ARRAY, LIST, MAP, VIEW_TAG, SHARED_OBJECT_ID, JS_FUNCTION, ANY};
    }

    static {
        Class cls = Integer.TYPE;
        INT = new a("INT", 2, C5142C.b(cls), 0, 2, null);
        int i10 = 2;
        DefaultConstructorMarker defaultConstructorMarker = null;
        int i11 = 0;
        LONG = new a("LONG", 3, C5142C.b(Long.TYPE), i11, i10, defaultConstructorMarker);
        int i12 = 2;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        int i13 = 0;
        FLOAT = new a("FLOAT", 4, C5142C.b(Float.TYPE), i13, i12, defaultConstructorMarker2);
        BOOLEAN = new a("BOOLEAN", 5, C5142C.b(Boolean.TYPE), i11, i10, defaultConstructorMarker);
        STRING = new a("STRING", 6, C5142C.b(String.class), i13, i12, defaultConstructorMarker2);
        JS_OBJECT = new a("JS_OBJECT", 7, C5142C.b(JavaScriptObject.class), i11, i10, defaultConstructorMarker);
        JS_VALUE = new a("JS_VALUE", 8, C5142C.b(JavaScriptValue.class), i13, i12, defaultConstructorMarker2);
        READABLE_ARRAY = new a("READABLE_ARRAY", 9, C5142C.b(ReadableArray.class), i11, i10, defaultConstructorMarker);
        READABLE_MAP = new a("READABLE_MAP", 10, C5142C.b(ReadableMap.class), i13, i12, defaultConstructorMarker2);
        UINT8_TYPED_ARRAY = new a("UINT8_TYPED_ARRAY", 11, C5142C.b(byte[].class), i11, i10, defaultConstructorMarker);
        TYPED_ARRAY = new a("TYPED_ARRAY", 12, C5142C.b(j.class), i13, i12, defaultConstructorMarker2);
        PRIMITIVE_ARRAY = new a("PRIMITIVE_ARRAY", 13, C5142C.b(Object[].class), i11, i10, defaultConstructorMarker);
        LIST = new a("LIST", 14, C5142C.b(List.class), i13, i12, defaultConstructorMarker2);
        MAP = new a("MAP", 15, C5142C.b(Map.class), i11, i10, defaultConstructorMarker);
        VIEW_TAG = new a("VIEW_TAG", 16, C5142C.b(cls), i13, i12, defaultConstructorMarker2);
        SHARED_OBJECT_ID = new a("SHARED_OBJECT_ID", 17, C5142C.b(cls), i11, i10, defaultConstructorMarker);
        JS_FUNCTION = new a("JS_FUNCTION", 18, C5142C.b(JavaScriptFunction.class), i13, i12, defaultConstructorMarker2);
        ANY = new a("ANY", 19, C5142C.b(Object.class), 0, 2, null);
        a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC3958a.a($values);
    }

    private a(String str, int i10, kotlin.reflect.d dVar, int i11) {
        this.clazz = dVar;
        this.value = i11;
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final kotlin.reflect.d getClazz() {
        return this.clazz;
    }

    public final int getValue() {
        return this.value;
    }

    /* synthetic */ a(String str, int i10, kotlin.reflect.d dVar, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i10, dVar, (i12 & 2) != 0 ? b.b() : i11);
    }
}
