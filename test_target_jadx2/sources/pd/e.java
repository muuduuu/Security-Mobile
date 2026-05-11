package pd;

import Hc.h;
import com.appsflyer.attribution.RequestError;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public enum e {
    BOOLEAN(h.BOOLEAN, "boolean", "Z", "java.lang.Boolean"),
    CHAR(h.CHAR, "char", "C", "java.lang.Character"),
    BYTE(h.BYTE, "byte", "B", "java.lang.Byte"),
    SHORT(h.SHORT, "short", "S", "java.lang.Short"),
    INT(h.INT, "int", "I", "java.lang.Integer"),
    FLOAT(h.FLOAT, "float", "F", "java.lang.Float"),
    LONG(h.LONG, "long", "J", "java.lang.Long"),
    DOUBLE(h.DOUBLE, "double", "D", "java.lang.Double");

    private final String desc;
    private final String name;
    private final h primitiveType;
    private final id.c wrapperFqName;
    private static final Set<id.c> WRAPPERS_CLASS_NAMES = new HashSet();
    private static final Map<String, e> TYPE_BY_NAME = new HashMap();
    private static final Map<h, e> TYPE_BY_PRIMITIVE_TYPE = new EnumMap(h.class);
    private static final Map<String, e> TYPE_BY_DESC = new HashMap();

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ void $$$reportNull$$$0(int i10) {
        String str;
        int i11;
        Object[] objArr;
        if (i10 != 2 && i10 != 4) {
            switch (i10) {
                case RequestError.EVENT_TIMEOUT /* 10 */:
                case 11:
                case 12:
                case 13:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            if (i10 != 2 && i10 != 4) {
                switch (i10) {
                    case RequestError.EVENT_TIMEOUT /* 10 */:
                    case 11:
                    case 12:
                    case 13:
                        break;
                    default:
                        i11 = 3;
                        break;
                }
                objArr = new Object[i11];
                switch (i10) {
                    case 1:
                    case 7:
                        objArr[0] = "name";
                        break;
                    case 2:
                    case 4:
                    case RequestError.EVENT_TIMEOUT /* 10 */:
                    case 11:
                    case 12:
                    case 13:
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                        break;
                    case 3:
                        objArr[0] = "type";
                        break;
                    case 5:
                    case 8:
                        objArr[0] = "desc";
                        break;
                    case 6:
                        objArr[0] = "primitiveType";
                        break;
                    case 9:
                        objArr[0] = "wrapperClassName";
                        break;
                    default:
                        objArr[0] = "className";
                        break;
                }
                if (i10 == 2 && i10 != 4) {
                    switch (i10) {
                        case RequestError.EVENT_TIMEOUT /* 10 */:
                            objArr[1] = "getPrimitiveType";
                            break;
                        case 11:
                            objArr[1] = "getJavaKeywordName";
                            break;
                        case 12:
                            objArr[1] = "getDesc";
                            break;
                        case 13:
                            objArr[1] = "getWrapperFqName";
                            break;
                        default:
                            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                            break;
                    }
                } else {
                    objArr[1] = "get";
                }
                switch (i10) {
                    case 1:
                    case 3:
                        objArr[2] = "get";
                        break;
                    case 2:
                    case 4:
                    case RequestError.EVENT_TIMEOUT /* 10 */:
                    case 11:
                    case 12:
                    case 13:
                        break;
                    case 5:
                        objArr[2] = "getByDesc";
                        break;
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        objArr[2] = "<init>";
                        break;
                    default:
                        objArr[2] = "isWrapperClassName";
                        break;
                }
                String format = String.format(str, objArr);
                if (i10 != 2 && i10 != 4) {
                    switch (i10) {
                        case RequestError.EVENT_TIMEOUT /* 10 */:
                        case 11:
                        case 12:
                        case 13:
                            break;
                        default:
                            throw new IllegalArgumentException(format);
                    }
                }
                throw new IllegalStateException(format);
            }
            i11 = 2;
            objArr = new Object[i11];
            switch (i10) {
            }
            if (i10 == 2) {
            }
            objArr[1] = "get";
            switch (i10) {
            }
            String format2 = String.format(str, objArr);
            if (i10 != 2) {
                switch (i10) {
                }
            }
            throw new IllegalStateException(format2);
        }
        str = "@NotNull method %s.%s must not return null";
        if (i10 != 2) {
            switch (i10) {
            }
            objArr = new Object[i11];
            switch (i10) {
            }
            if (i10 == 2) {
            }
            objArr[1] = "get";
            switch (i10) {
            }
            String format22 = String.format(str, objArr);
            if (i10 != 2) {
            }
            throw new IllegalStateException(format22);
        }
        i11 = 2;
        objArr = new Object[i11];
        switch (i10) {
        }
        if (i10 == 2) {
        }
        objArr[1] = "get";
        switch (i10) {
        }
        String format222 = String.format(str, objArr);
        if (i10 != 2) {
        }
        throw new IllegalStateException(format222);
    }

    static {
        for (e eVar : values()) {
            WRAPPERS_CLASS_NAMES.add(eVar.getWrapperFqName());
            TYPE_BY_NAME.put(eVar.getJavaKeywordName(), eVar);
            TYPE_BY_PRIMITIVE_TYPE.put(eVar.getPrimitiveType(), eVar);
            TYPE_BY_DESC.put(eVar.getDesc(), eVar);
        }
    }

    e(h hVar, String str, String str2, String str3) {
        if (hVar == null) {
            $$$reportNull$$$0(6);
        }
        if (str == null) {
            $$$reportNull$$$0(7);
        }
        if (str2 == null) {
            $$$reportNull$$$0(8);
        }
        if (str3 == null) {
            $$$reportNull$$$0(9);
        }
        this.primitiveType = hVar;
        this.name = str;
        this.desc = str2;
        this.wrapperFqName = new id.c(str3);
    }

    public static e get(String str) {
        if (str == null) {
            $$$reportNull$$$0(1);
        }
        e eVar = TYPE_BY_NAME.get(str);
        if (eVar != null) {
            return eVar;
        }
        throw new AssertionError("Non-primitive type name passed: " + str);
    }

    public String getDesc() {
        String str = this.desc;
        if (str == null) {
            $$$reportNull$$$0(12);
        }
        return str;
    }

    public String getJavaKeywordName() {
        String str = this.name;
        if (str == null) {
            $$$reportNull$$$0(11);
        }
        return str;
    }

    public h getPrimitiveType() {
        h hVar = this.primitiveType;
        if (hVar == null) {
            $$$reportNull$$$0(10);
        }
        return hVar;
    }

    public id.c getWrapperFqName() {
        id.c cVar = this.wrapperFqName;
        if (cVar == null) {
            $$$reportNull$$$0(13);
        }
        return cVar;
    }

    public static e get(h hVar) {
        if (hVar == null) {
            $$$reportNull$$$0(3);
        }
        e eVar = TYPE_BY_PRIMITIVE_TYPE.get(hVar);
        if (eVar == null) {
            $$$reportNull$$$0(4);
        }
        return eVar;
    }
}
