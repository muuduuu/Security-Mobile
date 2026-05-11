package T5;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class i implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final Class f9291a;

    /* renamed from: b, reason: collision with root package name */
    private final Enum[] f9292b;

    /* renamed from: c, reason: collision with root package name */
    private final com.fasterxml.jackson.core.n[] f9293c;

    private i(Class cls, com.fasterxml.jackson.core.n[] nVarArr) {
        this.f9291a = cls;
        this.f9292b = (Enum[]) cls.getEnumConstants();
        this.f9293c = nVarArr;
    }

    public static i a(Class cls, com.fasterxml.jackson.core.n[] nVarArr) {
        return new i(cls, nVarArr);
    }

    public static i b(F5.l lVar, Class cls) {
        Class p10 = f.p(cls);
        Enum[] enumArr = (Enum[]) p10.getEnumConstants();
        if (enumArr == null) {
            throw new IllegalArgumentException("Cannot determine enum constants for Class " + cls.getName());
        }
        String[] i10 = lVar.g().i(p10, enumArr, new String[enumArr.length]);
        com.fasterxml.jackson.core.n[] nVarArr = new com.fasterxml.jackson.core.n[enumArr.length];
        int length = enumArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            Enum r52 = enumArr[i11];
            String str = i10[i11];
            if (str == null) {
                str = r52.name();
            }
            nVarArr[r52.ordinal()] = lVar.d(str);
        }
        return a(cls, nVarArr);
    }

    public Class c() {
        return this.f9291a;
    }

    public com.fasterxml.jackson.core.n d(Enum r22) {
        return this.f9293c[r22.ordinal()];
    }
}
