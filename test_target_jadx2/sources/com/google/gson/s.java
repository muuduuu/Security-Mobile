package com.google.gson;

import java.math.BigDecimal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public abstract class s implements t {
    private static final /* synthetic */ s[] $VALUES;
    public static final s BIG_DECIMAL;
    public static final s DOUBLE;
    public static final s LAZILY_PARSED_NUMBER;
    public static final s LONG_OR_DOUBLE;

    enum a extends s {
        a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // com.google.gson.s, com.google.gson.t
        public Double readNumber(S8.a aVar) {
            return Double.valueOf(aVar.u());
        }
    }

    static {
        a aVar = new a("DOUBLE", 0);
        DOUBLE = aVar;
        s sVar = new s("LAZILY_PARSED_NUMBER", 1) { // from class: com.google.gson.s.b
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.s, com.google.gson.t
            public Number readNumber(S8.a aVar2) {
                return new P8.g(aVar2.I());
            }
        };
        LAZILY_PARSED_NUMBER = sVar;
        s sVar2 = new s("LONG_OR_DOUBLE", 2) { // from class: com.google.gson.s.c
            {
                a aVar2 = null;
            }

            private Number parseAsDouble(String str, S8.a aVar2) {
                try {
                    Double valueOf = Double.valueOf(str);
                    if (!valueOf.isInfinite()) {
                        if (valueOf.isNaN()) {
                        }
                        return valueOf;
                    }
                    if (!aVar2.q()) {
                        throw new S8.d("JSON forbids NaN and infinities: " + valueOf + "; at path " + aVar2.n());
                    }
                    return valueOf;
                } catch (NumberFormatException e10) {
                    throw new l("Cannot parse " + str + "; at path " + aVar2.n(), e10);
                }
            }

            @Override // com.google.gson.s, com.google.gson.t
            public Number readNumber(S8.a aVar2) {
                String I10 = aVar2.I();
                if (I10.indexOf(46) >= 0) {
                    return parseAsDouble(I10, aVar2);
                }
                try {
                    return Long.valueOf(Long.parseLong(I10));
                } catch (NumberFormatException unused) {
                    return parseAsDouble(I10, aVar2);
                }
            }
        };
        LONG_OR_DOUBLE = sVar2;
        s sVar3 = new s("BIG_DECIMAL", 3) { // from class: com.google.gson.s.d
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.s, com.google.gson.t
            public BigDecimal readNumber(S8.a aVar2) {
                String I10 = aVar2.I();
                try {
                    return P8.i.b(I10);
                } catch (NumberFormatException e10) {
                    throw new l("Cannot parse " + I10 + "; at path " + aVar2.n(), e10);
                }
            }
        };
        BIG_DECIMAL = sVar3;
        $VALUES = new s[]{aVar, sVar, sVar2, sVar3};
    }

    private s(String str, int i10) {
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) $VALUES.clone();
    }

    @Override // com.google.gson.t
    public abstract /* synthetic */ Number readNumber(S8.a aVar);

    /* synthetic */ s(String str, int i10, a aVar) {
        this(str, i10);
    }
}
