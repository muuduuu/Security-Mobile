package com.google.gson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public abstract class p {
    private static final /* synthetic */ p[] $VALUES;
    public static final p DEFAULT;
    public static final p STRING;

    enum a extends p {
        a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // com.google.gson.p
        public h serialize(Long l10) {
            return l10 == null ? j.f28655a : new n(l10);
        }
    }

    static {
        a aVar = new a("DEFAULT", 0);
        DEFAULT = aVar;
        p pVar = new p("STRING", 1) { // from class: com.google.gson.p.b
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.p
            public h serialize(Long l10) {
                return l10 == null ? j.f28655a : new n(l10.toString());
            }
        };
        STRING = pVar;
        $VALUES = new p[]{aVar, pVar};
    }

    private p(String str, int i10) {
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) $VALUES.clone();
    }

    public abstract h serialize(Long l10);

    /* synthetic */ p(String str, int i10, a aVar) {
        this(str, i10);
    }
}
