package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.List;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DOUBLE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: androidx.datastore.preferences.protobuf.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1552t {
    private static final /* synthetic */ EnumC1552t[] $VALUES;
    public static final EnumC1552t BOOL;
    public static final EnumC1552t BOOL_LIST;
    public static final EnumC1552t BOOL_LIST_PACKED;
    public static final EnumC1552t BYTES;
    public static final EnumC1552t BYTES_LIST;
    public static final EnumC1552t DOUBLE;
    public static final EnumC1552t DOUBLE_LIST;
    public static final EnumC1552t DOUBLE_LIST_PACKED;
    private static final Type[] EMPTY_TYPES;
    public static final EnumC1552t ENUM;
    public static final EnumC1552t ENUM_LIST;
    public static final EnumC1552t ENUM_LIST_PACKED;
    public static final EnumC1552t FIXED32;
    public static final EnumC1552t FIXED32_LIST;
    public static final EnumC1552t FIXED32_LIST_PACKED;
    public static final EnumC1552t FIXED64;
    public static final EnumC1552t FIXED64_LIST;
    public static final EnumC1552t FIXED64_LIST_PACKED;
    public static final EnumC1552t FLOAT;
    public static final EnumC1552t FLOAT_LIST;
    public static final EnumC1552t FLOAT_LIST_PACKED;
    public static final EnumC1552t GROUP;
    public static final EnumC1552t GROUP_LIST;
    public static final EnumC1552t INT32;
    public static final EnumC1552t INT32_LIST;
    public static final EnumC1552t INT32_LIST_PACKED;
    public static final EnumC1552t INT64;
    public static final EnumC1552t INT64_LIST;
    public static final EnumC1552t INT64_LIST_PACKED;
    public static final EnumC1552t MAP;
    public static final EnumC1552t MESSAGE;
    public static final EnumC1552t MESSAGE_LIST;
    public static final EnumC1552t SFIXED32;
    public static final EnumC1552t SFIXED32_LIST;
    public static final EnumC1552t SFIXED32_LIST_PACKED;
    public static final EnumC1552t SFIXED64;
    public static final EnumC1552t SFIXED64_LIST;
    public static final EnumC1552t SFIXED64_LIST_PACKED;
    public static final EnumC1552t SINT32;
    public static final EnumC1552t SINT32_LIST;
    public static final EnumC1552t SINT32_LIST_PACKED;
    public static final EnumC1552t SINT64;
    public static final EnumC1552t SINT64_LIST;
    public static final EnumC1552t SINT64_LIST_PACKED;
    public static final EnumC1552t STRING;
    public static final EnumC1552t STRING_LIST;
    public static final EnumC1552t UINT32;
    public static final EnumC1552t UINT32_LIST;
    public static final EnumC1552t UINT32_LIST_PACKED;
    public static final EnumC1552t UINT64;
    public static final EnumC1552t UINT64_LIST;
    public static final EnumC1552t UINT64_LIST_PACKED;
    private static final EnumC1552t[] VALUES;
    private final b collection;
    private final Class<?> elementType;

    /* renamed from: id, reason: collision with root package name */
    private final int f16469id;
    private final A javaType;
    private final boolean primitiveScalar;

    /* renamed from: androidx.datastore.preferences.protobuf.t$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16470a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f16471b;

        static {
            int[] iArr = new int[A.values().length];
            f16471b = iArr;
            try {
                iArr[A.BYTE_STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16471b[A.MESSAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16471b[A.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[b.values().length];
            f16470a = iArr2;
            try {
                iArr2[b.MAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16470a[b.VECTOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16470a[b.SCALAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.t$b */
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

    static {
        b bVar = b.SCALAR;
        A a10 = A.DOUBLE;
        EnumC1552t enumC1552t = new EnumC1552t("DOUBLE", 0, 0, bVar, a10);
        DOUBLE = enumC1552t;
        A a11 = A.FLOAT;
        EnumC1552t enumC1552t2 = new EnumC1552t("FLOAT", 1, 1, bVar, a11);
        FLOAT = enumC1552t2;
        A a12 = A.LONG;
        EnumC1552t enumC1552t3 = new EnumC1552t("INT64", 2, 2, bVar, a12);
        INT64 = enumC1552t3;
        EnumC1552t enumC1552t4 = new EnumC1552t("UINT64", 3, 3, bVar, a12);
        UINT64 = enumC1552t4;
        A a13 = A.INT;
        EnumC1552t enumC1552t5 = new EnumC1552t("INT32", 4, 4, bVar, a13);
        INT32 = enumC1552t5;
        EnumC1552t enumC1552t6 = new EnumC1552t("FIXED64", 5, 5, bVar, a12);
        FIXED64 = enumC1552t6;
        EnumC1552t enumC1552t7 = new EnumC1552t("FIXED32", 6, 6, bVar, a13);
        FIXED32 = enumC1552t7;
        A a14 = A.BOOLEAN;
        EnumC1552t enumC1552t8 = new EnumC1552t("BOOL", 7, 7, bVar, a14);
        BOOL = enumC1552t8;
        A a15 = A.STRING;
        EnumC1552t enumC1552t9 = new EnumC1552t("STRING", 8, 8, bVar, a15);
        STRING = enumC1552t9;
        A a16 = A.MESSAGE;
        EnumC1552t enumC1552t10 = new EnumC1552t("MESSAGE", 9, 9, bVar, a16);
        MESSAGE = enumC1552t10;
        A a17 = A.BYTE_STRING;
        EnumC1552t enumC1552t11 = new EnumC1552t("BYTES", 10, 10, bVar, a17);
        BYTES = enumC1552t11;
        EnumC1552t enumC1552t12 = new EnumC1552t("UINT32", 11, 11, bVar, a13);
        UINT32 = enumC1552t12;
        A a18 = A.ENUM;
        EnumC1552t enumC1552t13 = new EnumC1552t("ENUM", 12, 12, bVar, a18);
        ENUM = enumC1552t13;
        EnumC1552t enumC1552t14 = new EnumC1552t("SFIXED32", 13, 13, bVar, a13);
        SFIXED32 = enumC1552t14;
        EnumC1552t enumC1552t15 = new EnumC1552t("SFIXED64", 14, 14, bVar, a12);
        SFIXED64 = enumC1552t15;
        EnumC1552t enumC1552t16 = new EnumC1552t("SINT32", 15, 15, bVar, a13);
        SINT32 = enumC1552t16;
        EnumC1552t enumC1552t17 = new EnumC1552t("SINT64", 16, 16, bVar, a12);
        SINT64 = enumC1552t17;
        EnumC1552t enumC1552t18 = new EnumC1552t("GROUP", 17, 17, bVar, a16);
        GROUP = enumC1552t18;
        b bVar2 = b.VECTOR;
        EnumC1552t enumC1552t19 = new EnumC1552t("DOUBLE_LIST", 18, 18, bVar2, a10);
        DOUBLE_LIST = enumC1552t19;
        EnumC1552t enumC1552t20 = new EnumC1552t("FLOAT_LIST", 19, 19, bVar2, a11);
        FLOAT_LIST = enumC1552t20;
        EnumC1552t enumC1552t21 = new EnumC1552t("INT64_LIST", 20, 20, bVar2, a12);
        INT64_LIST = enumC1552t21;
        EnumC1552t enumC1552t22 = new EnumC1552t("UINT64_LIST", 21, 21, bVar2, a12);
        UINT64_LIST = enumC1552t22;
        EnumC1552t enumC1552t23 = new EnumC1552t("INT32_LIST", 22, 22, bVar2, a13);
        INT32_LIST = enumC1552t23;
        EnumC1552t enumC1552t24 = new EnumC1552t("FIXED64_LIST", 23, 23, bVar2, a12);
        FIXED64_LIST = enumC1552t24;
        EnumC1552t enumC1552t25 = new EnumC1552t("FIXED32_LIST", 24, 24, bVar2, a13);
        FIXED32_LIST = enumC1552t25;
        EnumC1552t enumC1552t26 = new EnumC1552t("BOOL_LIST", 25, 25, bVar2, a14);
        BOOL_LIST = enumC1552t26;
        EnumC1552t enumC1552t27 = new EnumC1552t("STRING_LIST", 26, 26, bVar2, a15);
        STRING_LIST = enumC1552t27;
        EnumC1552t enumC1552t28 = new EnumC1552t("MESSAGE_LIST", 27, 27, bVar2, a16);
        MESSAGE_LIST = enumC1552t28;
        EnumC1552t enumC1552t29 = new EnumC1552t("BYTES_LIST", 28, 28, bVar2, a17);
        BYTES_LIST = enumC1552t29;
        EnumC1552t enumC1552t30 = new EnumC1552t("UINT32_LIST", 29, 29, bVar2, a13);
        UINT32_LIST = enumC1552t30;
        EnumC1552t enumC1552t31 = new EnumC1552t("ENUM_LIST", 30, 30, bVar2, a18);
        ENUM_LIST = enumC1552t31;
        EnumC1552t enumC1552t32 = new EnumC1552t("SFIXED32_LIST", 31, 31, bVar2, a13);
        SFIXED32_LIST = enumC1552t32;
        EnumC1552t enumC1552t33 = new EnumC1552t("SFIXED64_LIST", 32, 32, bVar2, a12);
        SFIXED64_LIST = enumC1552t33;
        EnumC1552t enumC1552t34 = new EnumC1552t("SINT32_LIST", 33, 33, bVar2, a13);
        SINT32_LIST = enumC1552t34;
        EnumC1552t enumC1552t35 = new EnumC1552t("SINT64_LIST", 34, 34, bVar2, a12);
        SINT64_LIST = enumC1552t35;
        b bVar3 = b.PACKED_VECTOR;
        EnumC1552t enumC1552t36 = new EnumC1552t("DOUBLE_LIST_PACKED", 35, 35, bVar3, a10);
        DOUBLE_LIST_PACKED = enumC1552t36;
        EnumC1552t enumC1552t37 = new EnumC1552t("FLOAT_LIST_PACKED", 36, 36, bVar3, a11);
        FLOAT_LIST_PACKED = enumC1552t37;
        EnumC1552t enumC1552t38 = new EnumC1552t("INT64_LIST_PACKED", 37, 37, bVar3, a12);
        INT64_LIST_PACKED = enumC1552t38;
        EnumC1552t enumC1552t39 = new EnumC1552t("UINT64_LIST_PACKED", 38, 38, bVar3, a12);
        UINT64_LIST_PACKED = enumC1552t39;
        EnumC1552t enumC1552t40 = new EnumC1552t("INT32_LIST_PACKED", 39, 39, bVar3, a13);
        INT32_LIST_PACKED = enumC1552t40;
        EnumC1552t enumC1552t41 = new EnumC1552t("FIXED64_LIST_PACKED", 40, 40, bVar3, a12);
        FIXED64_LIST_PACKED = enumC1552t41;
        EnumC1552t enumC1552t42 = new EnumC1552t("FIXED32_LIST_PACKED", 41, 41, bVar3, a13);
        FIXED32_LIST_PACKED = enumC1552t42;
        EnumC1552t enumC1552t43 = new EnumC1552t("BOOL_LIST_PACKED", 42, 42, bVar3, a14);
        BOOL_LIST_PACKED = enumC1552t43;
        EnumC1552t enumC1552t44 = new EnumC1552t("UINT32_LIST_PACKED", 43, 43, bVar3, a13);
        UINT32_LIST_PACKED = enumC1552t44;
        EnumC1552t enumC1552t45 = new EnumC1552t("ENUM_LIST_PACKED", 44, 44, bVar3, a18);
        ENUM_LIST_PACKED = enumC1552t45;
        EnumC1552t enumC1552t46 = new EnumC1552t("SFIXED32_LIST_PACKED", 45, 45, bVar3, a13);
        SFIXED32_LIST_PACKED = enumC1552t46;
        EnumC1552t enumC1552t47 = new EnumC1552t("SFIXED64_LIST_PACKED", 46, 46, bVar3, a12);
        SFIXED64_LIST_PACKED = enumC1552t47;
        EnumC1552t enumC1552t48 = new EnumC1552t("SINT32_LIST_PACKED", 47, 47, bVar3, a13);
        SINT32_LIST_PACKED = enumC1552t48;
        EnumC1552t enumC1552t49 = new EnumC1552t("SINT64_LIST_PACKED", 48, 48, bVar3, a12);
        SINT64_LIST_PACKED = enumC1552t49;
        EnumC1552t enumC1552t50 = new EnumC1552t("GROUP_LIST", 49, 49, bVar2, a16);
        GROUP_LIST = enumC1552t50;
        EnumC1552t enumC1552t51 = new EnumC1552t("MAP", 50, 50, b.MAP, A.VOID);
        MAP = enumC1552t51;
        $VALUES = new EnumC1552t[]{enumC1552t, enumC1552t2, enumC1552t3, enumC1552t4, enumC1552t5, enumC1552t6, enumC1552t7, enumC1552t8, enumC1552t9, enumC1552t10, enumC1552t11, enumC1552t12, enumC1552t13, enumC1552t14, enumC1552t15, enumC1552t16, enumC1552t17, enumC1552t18, enumC1552t19, enumC1552t20, enumC1552t21, enumC1552t22, enumC1552t23, enumC1552t24, enumC1552t25, enumC1552t26, enumC1552t27, enumC1552t28, enumC1552t29, enumC1552t30, enumC1552t31, enumC1552t32, enumC1552t33, enumC1552t34, enumC1552t35, enumC1552t36, enumC1552t37, enumC1552t38, enumC1552t39, enumC1552t40, enumC1552t41, enumC1552t42, enumC1552t43, enumC1552t44, enumC1552t45, enumC1552t46, enumC1552t47, enumC1552t48, enumC1552t49, enumC1552t50, enumC1552t51};
        EMPTY_TYPES = new Type[0];
        EnumC1552t[] values = values();
        VALUES = new EnumC1552t[values.length];
        for (EnumC1552t enumC1552t52 : values) {
            VALUES[enumC1552t52.f16469id] = enumC1552t52;
        }
    }

    private EnumC1552t(String str, int i10, int i11, b bVar, A a10) {
        int i12;
        this.f16469id = i11;
        this.collection = bVar;
        this.javaType = a10;
        int i13 = a.f16470a[bVar.ordinal()];
        if (i13 == 1) {
            this.elementType = a10.getBoxedType();
        } else if (i13 != 2) {
            this.elementType = null;
        } else {
            this.elementType = a10.getBoxedType();
        }
        this.primitiveScalar = (bVar != b.SCALAR || (i12 = a.f16471b[a10.ordinal()]) == 1 || i12 == 2 || i12 == 3) ? false : true;
    }

    public static EnumC1552t forId(int i10) {
        if (i10 < 0) {
            return null;
        }
        EnumC1552t[] enumC1552tArr = VALUES;
        if (i10 >= enumC1552tArr.length) {
            return null;
        }
        return enumC1552tArr[i10];
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

    public static EnumC1552t valueOf(String str) {
        return (EnumC1552t) Enum.valueOf(EnumC1552t.class, str);
    }

    public static EnumC1552t[] values() {
        return (EnumC1552t[]) $VALUES.clone();
    }

    public A getJavaType() {
        return this.javaType;
    }

    public int id() {
        return this.f16469id;
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
