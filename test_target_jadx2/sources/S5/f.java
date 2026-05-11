package S5;

import java.util.Collection;
import java.util.Map;

/* loaded from: classes2.dex */
public enum f {
    Array,
    Collection,
    Map,
    POJO,
    Untyped,
    Integer,
    Float,
    Boolean,
    Enum,
    Textual,
    Binary,
    DateTime,
    OtherScalar;

    public static f fromClass(Class<?> cls, f fVar) {
        return cls.isEnum() ? Enum : cls.isArray() ? cls == byte[].class ? Binary : Array : Collection.class.isAssignableFrom(cls) ? Collection : Map.class.isAssignableFrom(cls) ? Map : cls == String.class ? Textual : fVar;
    }
}
