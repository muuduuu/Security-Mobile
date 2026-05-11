package com.google.protobuf;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.List;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DOUBLE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: com.google.protobuf.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC2888t {
    private static final /* synthetic */ EnumC2888t[] $VALUES;
    public static final EnumC2888t BOOL;
    public static final EnumC2888t BOOL_LIST;
    public static final EnumC2888t BOOL_LIST_PACKED;
    public static final EnumC2888t BYTES;
    public static final EnumC2888t BYTES_LIST;
    public static final EnumC2888t DOUBLE;
    public static final EnumC2888t DOUBLE_LIST;
    public static final EnumC2888t DOUBLE_LIST_PACKED;
    private static final Type[] EMPTY_TYPES;
    public static final EnumC2888t ENUM;
    public static final EnumC2888t ENUM_LIST;
    public static final EnumC2888t ENUM_LIST_PACKED;
    public static final EnumC2888t FIXED32;
    public static final EnumC2888t FIXED32_LIST;
    public static final EnumC2888t FIXED32_LIST_PACKED;
    public static final EnumC2888t FIXED64;
    public static final EnumC2888t FIXED64_LIST;
    public static final EnumC2888t FIXED64_LIST_PACKED;
    public static final EnumC2888t FLOAT;
    public static final EnumC2888t FLOAT_LIST;
    public static final EnumC2888t FLOAT_LIST_PACKED;
    public static final EnumC2888t GROUP;
    public static final EnumC2888t GROUP_LIST;
    public static final EnumC2888t INT32;
    public static final EnumC2888t INT32_LIST;
    public static final EnumC2888t INT32_LIST_PACKED;
    public static final EnumC2888t INT64;
    public static final EnumC2888t INT64_LIST;
    public static final EnumC2888t INT64_LIST_PACKED;
    public static final EnumC2888t MAP;
    public static final EnumC2888t MESSAGE;
    public static final EnumC2888t MESSAGE_LIST;
    public static final EnumC2888t SFIXED32;
    public static final EnumC2888t SFIXED32_LIST;
    public static final EnumC2888t SFIXED32_LIST_PACKED;
    public static final EnumC2888t SFIXED64;
    public static final EnumC2888t SFIXED64_LIST;
    public static final EnumC2888t SFIXED64_LIST_PACKED;
    public static final EnumC2888t SINT32;
    public static final EnumC2888t SINT32_LIST;
    public static final EnumC2888t SINT32_LIST_PACKED;
    public static final EnumC2888t SINT64;
    public static final EnumC2888t SINT64_LIST;
    public static final EnumC2888t SINT64_LIST_PACKED;
    public static final EnumC2888t STRING;
    public static final EnumC2888t STRING_LIST;
    public static final EnumC2888t UINT32;
    public static final EnumC2888t UINT32_LIST;
    public static final EnumC2888t UINT32_LIST_PACKED;
    public static final EnumC2888t UINT64;
    public static final EnumC2888t UINT64_LIST;
    public static final EnumC2888t UINT64_LIST_PACKED;
    private static final EnumC2888t[] VALUES;
    private final b collection;
    private final Class<?> elementType;

    /* renamed from: id, reason: collision with root package name */
    private final int f28811id;
    private final A javaType;
    private final boolean primitiveScalar;

    /* renamed from: com.google.protobuf.t$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f28812a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f28813b;

        static {
            int[] iArr = new int[A.values().length];
            f28813b = iArr;
            try {
                iArr[A.BYTE_STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28813b[A.MESSAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28813b[A.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[b.values().length];
            f28812a = iArr2;
            try {
                iArr2[b.MAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28812a[b.VECTOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28812a[b.SCALAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* renamed from: com.google.protobuf.t$b */
    enum b {
        SCALAR(false),
        VECTOR(true),
        PACKED_VECTOR(true),
        MAP(false);

        private final boolean isList;

        b(boolean z10) {
            this.isList = z10;
        }

        public boolean isList() {
            return this.isList;
        }
    }

    private static /* synthetic */ EnumC2888t[] $values() {
        return new EnumC2888t[]{DOUBLE, FLOAT, INT64, UINT64, INT32, FIXED64, FIXED32, BOOL, STRING, MESSAGE, BYTES, UINT32, ENUM, SFIXED32, SFIXED64, SINT32, SINT64, GROUP, DOUBLE_LIST, FLOAT_LIST, INT64_LIST, UINT64_LIST, INT32_LIST, FIXED64_LIST, FIXED32_LIST, BOOL_LIST, STRING_LIST, MESSAGE_LIST, BYTES_LIST, UINT32_LIST, ENUM_LIST, SFIXED32_LIST, SFIXED64_LIST, SINT32_LIST, SINT64_LIST, DOUBLE_LIST_PACKED, FLOAT_LIST_PACKED, INT64_LIST_PACKED, UINT64_LIST_PACKED, INT32_LIST_PACKED, FIXED64_LIST_PACKED, FIXED32_LIST_PACKED, BOOL_LIST_PACKED, UINT32_LIST_PACKED, ENUM_LIST_PACKED, SFIXED32_LIST_PACKED, SFIXED64_LIST_PACKED, SINT32_LIST_PACKED, SINT64_LIST_PACKED, GROUP_LIST, MAP};
    }

    static {
        b bVar = b.SCALAR;
        A a10 = A.DOUBLE;
        DOUBLE = new EnumC2888t("DOUBLE", 0, 0, bVar, a10);
        A a11 = A.FLOAT;
        FLOAT = new EnumC2888t("FLOAT", 1, 1, bVar, a11);
        A a12 = A.LONG;
        INT64 = new EnumC2888t("INT64", 2, 2, bVar, a12);
        UINT64 = new EnumC2888t("UINT64", 3, 3, bVar, a12);
        A a13 = A.INT;
        INT32 = new EnumC2888t("INT32", 4, 4, bVar, a13);
        FIXED64 = new EnumC2888t("FIXED64", 5, 5, bVar, a12);
        FIXED32 = new EnumC2888t("FIXED32", 6, 6, bVar, a13);
        A a14 = A.BOOLEAN;
        BOOL = new EnumC2888t("BOOL", 7, 7, bVar, a14);
        A a15 = A.STRING;
        STRING = new EnumC2888t("STRING", 8, 8, bVar, a15);
        A a16 = A.MESSAGE;
        MESSAGE = new EnumC2888t("MESSAGE", 9, 9, bVar, a16);
        A a17 = A.BYTE_STRING;
        BYTES = new EnumC2888t("BYTES", 10, 10, bVar, a17);
        UINT32 = new EnumC2888t("UINT32", 11, 11, bVar, a13);
        A a18 = A.ENUM;
        ENUM = new EnumC2888t("ENUM", 12, 12, bVar, a18);
        SFIXED32 = new EnumC2888t("SFIXED32", 13, 13, bVar, a13);
        SFIXED64 = new EnumC2888t("SFIXED64", 14, 14, bVar, a12);
        SINT32 = new EnumC2888t("SINT32", 15, 15, bVar, a13);
        SINT64 = new EnumC2888t("SINT64", 16, 16, bVar, a12);
        GROUP = new EnumC2888t("GROUP", 17, 17, bVar, a16);
        b bVar2 = b.VECTOR;
        DOUBLE_LIST = new EnumC2888t("DOUBLE_LIST", 18, 18, bVar2, a10);
        FLOAT_LIST = new EnumC2888t("FLOAT_LIST", 19, 19, bVar2, a11);
        INT64_LIST = new EnumC2888t("INT64_LIST", 20, 20, bVar2, a12);
        UINT64_LIST = new EnumC2888t("UINT64_LIST", 21, 21, bVar2, a12);
        INT32_LIST = new EnumC2888t("INT32_LIST", 22, 22, bVar2, a13);
        FIXED64_LIST = new EnumC2888t("FIXED64_LIST", 23, 23, bVar2, a12);
        FIXED32_LIST = new EnumC2888t("FIXED32_LIST", 24, 24, bVar2, a13);
        BOOL_LIST = new EnumC2888t("BOOL_LIST", 25, 25, bVar2, a14);
        STRING_LIST = new EnumC2888t("STRING_LIST", 26, 26, bVar2, a15);
        MESSAGE_LIST = new EnumC2888t("MESSAGE_LIST", 27, 27, bVar2, a16);
        BYTES_LIST = new EnumC2888t("BYTES_LIST", 28, 28, bVar2, a17);
        UINT32_LIST = new EnumC2888t("UINT32_LIST", 29, 29, bVar2, a13);
        ENUM_LIST = new EnumC2888t("ENUM_LIST", 30, 30, bVar2, a18);
        SFIXED32_LIST = new EnumC2888t("SFIXED32_LIST", 31, 31, bVar2, a13);
        SFIXED64_LIST = new EnumC2888t("SFIXED64_LIST", 32, 32, bVar2, a12);
        SINT32_LIST = new EnumC2888t("SINT32_LIST", 33, 33, bVar2, a13);
        SINT64_LIST = new EnumC2888t("SINT64_LIST", 34, 34, bVar2, a12);
        b bVar3 = b.PACKED_VECTOR;
        DOUBLE_LIST_PACKED = new EnumC2888t("DOUBLE_LIST_PACKED", 35, 35, bVar3, a10);
        FLOAT_LIST_PACKED = new EnumC2888t("FLOAT_LIST_PACKED", 36, 36, bVar3, a11);
        INT64_LIST_PACKED = new EnumC2888t("INT64_LIST_PACKED", 37, 37, bVar3, a12);
        UINT64_LIST_PACKED = new EnumC2888t("UINT64_LIST_PACKED", 38, 38, bVar3, a12);
        INT32_LIST_PACKED = new EnumC2888t("INT32_LIST_PACKED", 39, 39, bVar3, a13);
        FIXED64_LIST_PACKED = new EnumC2888t("FIXED64_LIST_PACKED", 40, 40, bVar3, a12);
        FIXED32_LIST_PACKED = new EnumC2888t("FIXED32_LIST_PACKED", 41, 41, bVar3, a13);
        BOOL_LIST_PACKED = new EnumC2888t("BOOL_LIST_PACKED", 42, 42, bVar3, a14);
        UINT32_LIST_PACKED = new EnumC2888t("UINT32_LIST_PACKED", 43, 43, bVar3, a13);
        ENUM_LIST_PACKED = new EnumC2888t("ENUM_LIST_PACKED", 44, 44, bVar3, a18);
        SFIXED32_LIST_PACKED = new EnumC2888t("SFIXED32_LIST_PACKED", 45, 45, bVar3, a13);
        SFIXED64_LIST_PACKED = new EnumC2888t("SFIXED64_LIST_PACKED", 46, 46, bVar3, a12);
        SINT32_LIST_PACKED = new EnumC2888t("SINT32_LIST_PACKED", 47, 47, bVar3, a13);
        SINT64_LIST_PACKED = new EnumC2888t("SINT64_LIST_PACKED", 48, 48, bVar3, a12);
        GROUP_LIST = new EnumC2888t("GROUP_LIST", 49, 49, bVar2, a16);
        MAP = new EnumC2888t("MAP", 50, 50, b.MAP, A.VOID);
        $VALUES = $values();
        EMPTY_TYPES = new Type[0];
        EnumC2888t[] values = values();
        VALUES = new EnumC2888t[values.length];
        for (EnumC2888t enumC2888t : values) {
            VALUES[enumC2888t.f28811id] = enumC2888t;
        }
    }

    private EnumC2888t(String str, int i10, int i11, b bVar, A a10) {
        int i12;
        this.f28811id = i11;
        this.collection = bVar;
        this.javaType = a10;
        int i13 = a.f28812a[bVar.ordinal()];
        if (i13 == 1) {
            this.elementType = a10.getBoxedType();
        } else if (i13 != 2) {
            this.elementType = null;
        } else {
            this.elementType = a10.getBoxedType();
        }
        this.primitiveScalar = (bVar != b.SCALAR || (i12 = a.f28813b[a10.ordinal()]) == 1 || i12 == 2 || i12 == 3) ? false : true;
    }

    public static EnumC2888t forId(int i10) {
        if (i10 < 0) {
            return null;
        }
        EnumC2888t[] enumC2888tArr = VALUES;
        if (i10 >= enumC2888tArr.length) {
            return null;
        }
        return enumC2888tArr[i10];
    }

    private static Type getGenericSuperList(Class<?> cls) {
        for (Type type : cls.getGenericInterfaces()) {
            if ((type instanceof ParameterizedType) && List.class.isAssignableFrom((Class) ((ParameterizedType) type).getRawType())) {
                return type;
            }
        }
        Type genericSuperclass = cls.getGenericSuperclass();
        if ((genericSuperclass instanceof ParameterizedType) && List.class.isAssignableFrom((Class) ((ParameterizedType) genericSuperclass).getRawType())) {
            return genericSuperclass;
        }
        return null;
    }

    private static Type getListParameter(Class<?> cls, Type[] typeArr) {
        while (true) {
            int i10 = 0;
            if (cls == List.class) {
                if (typeArr.length == 1) {
                    return typeArr[0];
                }
                throw new RuntimeException("Unable to identify parameter type for List<T>");
            }
            Type genericSuperList = getGenericSuperList(cls);
            if (!(genericSuperList instanceof ParameterizedType)) {
                typeArr = EMPTY_TYPES;
                Class<?>[] interfaces = cls.getInterfaces();
                int length = interfaces.length;
                while (true) {
                    if (i10 >= length) {
                        cls = cls.getSuperclass();
                        break;
                    }
                    Class<?> cls2 = interfaces[i10];
                    if (List.class.isAssignableFrom(cls2)) {
                        cls = cls2;
                        break;
                    }
                    i10++;
                }
            } else {
                ParameterizedType parameterizedType = (ParameterizedType) genericSuperList;
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                for (int i11 = 0; i11 < actualTypeArguments.length; i11++) {
                    Type type = actualTypeArguments[i11];
                    if (type instanceof TypeVariable) {
                        TypeVariable<Class<?>>[] typeParameters = cls.getTypeParameters();
                        if (typeArr.length != typeParameters.length) {
                            throw new RuntimeException("Type array mismatch");
                        }
                        for (int i12 = 0; i12 < typeParameters.length; i12++) {
                            if (type == typeParameters[i12]) {
                                actualTypeArguments[i11] = typeArr[i12];
                            }
                        }
                        throw new RuntimeException("Unable to find replacement for " + type);
                    }
                }
                cls = (Class) parameterizedType.getRawType();
                typeArr = actualTypeArguments;
            }
        }
    }

    private boolean isValidForList(Field field) {
        Class<?> type = field.getType();
        if (!this.javaType.getType().isAssignableFrom(type)) {
            return false;
        }
        Type[] typeArr = EMPTY_TYPES;
        if (field.getGenericType() instanceof ParameterizedType) {
            typeArr = ((ParameterizedType) field.getGenericType()).getActualTypeArguments();
        }
        Type listParameter = getListParameter(type, typeArr);
        if (listParameter instanceof Class) {
            return this.elementType.isAssignableFrom((Class) listParameter);
        }
        return true;
    }

    public static EnumC2888t valueOf(String str) {
        return (EnumC2888t) Enum.valueOf(EnumC2888t.class, str);
    }

    public static EnumC2888t[] values() {
        return (EnumC2888t[]) $VALUES.clone();
    }

    public A getJavaType() {
        return this.javaType;
    }

    public int id() {
        return this.f28811id;
    }

    public boolean isList() {
        return this.collection.isList();
    }

    public boolean isMap() {
        return this.collection == b.MAP;
    }

    public boolean isPacked() {
        return b.PACKED_VECTOR.equals(this.collection);
    }

    public boolean isPrimitiveScalar() {
        return this.primitiveScalar;
    }

    public boolean isScalar() {
        return this.collection == b.SCALAR;
    }

    public boolean isValidForField(Field field) {
        return b.VECTOR.equals(this.collection) ? isValidForList(field) : this.javaType.getType().isAssignableFrom(field.getType());
    }
}
