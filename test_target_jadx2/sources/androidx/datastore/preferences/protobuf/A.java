package androidx.datastore.preferences.protobuf;

import org.conscrypt.BuildConfig;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'INT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class A {
    private static final /* synthetic */ A[] $VALUES;
    public static final A BOOLEAN;
    public static final A BYTE_STRING;
    public static final A DOUBLE;
    public static final A ENUM;
    public static final A FLOAT;
    public static final A INT;
    public static final A LONG;
    public static final A MESSAGE;
    public static final A STRING;
    public static final A VOID;
    private final Class<?> boxedType;
    private final Object defaultDefault;
    private final Class<?> type;

    static {
        A a10 = new A("VOID", 0, Void.class, Void.class, null);
        VOID = a10;
        Class cls = Integer.TYPE;
        A a11 = new A("INT", 1, cls, Integer.class, 0);
        INT = a11;
        A a12 = new A("LONG", 2, Long.TYPE, Long.class, 0L);
        LONG = a12;
        A a13 = new A("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        FLOAT = a13;
        A a14 = new A("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        DOUBLE = a14;
        A a15 = new A("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        BOOLEAN = a15;
        A a16 = new A("STRING", 6, String.class, String.class, BuildConfig.FLAVOR);
        STRING = a16;
        A a17 = new A("BYTE_STRING", 7, AbstractC1540g.class, AbstractC1540g.class, AbstractC1540g.f16347b);
        BYTE_STRING = a17;
        A a18 = new A("ENUM", 8, cls, Integer.class, null);
        ENUM = a18;
        A a19 = new A("MESSAGE", 9, Object.class, Object.class, null);
        MESSAGE = a19;
        $VALUES = new A[]{a10, a11, a12, a13, a14, a15, a16, a17, a18, a19};
    }

    private A(String str, int i10, Class cls, Class cls2, Object obj) {
        this.type = cls;
        this.boxedType = cls2;
        this.defaultDefault = obj;
    }

    public static A valueOf(String str) {
        return (A) Enum.valueOf(A.class, str);
    }

    public static A[] values() {
        return (A[]) $VALUES.clone();
    }

    public Class<?> getBoxedType() {
        return this.boxedType;
    }

    public Object getDefaultDefault() {
        return this.defaultDefault;
    }

    public Class<?> getType() {
        return this.type;
    }

    public boolean isValidType(Class<?> cls) {
        return this.type.isAssignableFrom(cls);
    }
}
