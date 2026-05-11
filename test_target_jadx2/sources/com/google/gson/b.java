package com.google.gson;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public abstract class b implements com.google.gson.c {
    private static final /* synthetic */ b[] $VALUES;
    public static final b IDENTITY;
    public static final b LOWER_CASE_WITH_DASHES;
    public static final b LOWER_CASE_WITH_DOTS;
    public static final b LOWER_CASE_WITH_UNDERSCORES;
    public static final b UPPER_CAMEL_CASE;
    public static final b UPPER_CAMEL_CASE_WITH_SPACES;
    public static final b UPPER_CASE_WITH_UNDERSCORES;

    enum a extends b {
        a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // com.google.gson.b, com.google.gson.c
        public String translateName(Field field) {
            return field.getName();
        }
    }

    static {
        a aVar = new a("IDENTITY", 0);
        IDENTITY = aVar;
        b bVar = new b("UPPER_CAMEL_CASE", 1) { // from class: com.google.gson.b.b
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.b, com.google.gson.c
            public String translateName(Field field) {
                return b.upperCaseFirstLetter(field.getName());
            }
        };
        UPPER_CAMEL_CASE = bVar;
        b bVar2 = new b("UPPER_CAMEL_CASE_WITH_SPACES", 2) { // from class: com.google.gson.b.c
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.b, com.google.gson.c
            public String translateName(Field field) {
                return b.upperCaseFirstLetter(b.separateCamelCase(field.getName(), ' '));
            }
        };
        UPPER_CAMEL_CASE_WITH_SPACES = bVar2;
        b bVar3 = new b("UPPER_CASE_WITH_UNDERSCORES", 3) { // from class: com.google.gson.b.d
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.b, com.google.gson.c
            public String translateName(Field field) {
                return b.separateCamelCase(field.getName(), '_').toUpperCase(Locale.ENGLISH);
            }
        };
        UPPER_CASE_WITH_UNDERSCORES = bVar3;
        b bVar4 = new b("LOWER_CASE_WITH_UNDERSCORES", 4) { // from class: com.google.gson.b.e
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.b, com.google.gson.c
            public String translateName(Field field) {
                return b.separateCamelCase(field.getName(), '_').toLowerCase(Locale.ENGLISH);
            }
        };
        LOWER_CASE_WITH_UNDERSCORES = bVar4;
        b bVar5 = new b("LOWER_CASE_WITH_DASHES", 5) { // from class: com.google.gson.b.f
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.b, com.google.gson.c
            public String translateName(Field field) {
                return b.separateCamelCase(field.getName(), '-').toLowerCase(Locale.ENGLISH);
            }
        };
        LOWER_CASE_WITH_DASHES = bVar5;
        b bVar6 = new b("LOWER_CASE_WITH_DOTS", 6) { // from class: com.google.gson.b.g
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.b, com.google.gson.c
            public String translateName(Field field) {
                return b.separateCamelCase(field.getName(), '.').toLowerCase(Locale.ENGLISH);
            }
        };
        LOWER_CASE_WITH_DOTS = bVar6;
        $VALUES = new b[]{aVar, bVar, bVar2, bVar3, bVar4, bVar5, bVar6};
    }

    private b(String str, int i10) {
    }

    static String separateCamelCase(String str, char c10) {
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (Character.isUpperCase(charAt) && sb2.length() != 0) {
                sb2.append(c10);
            }
            sb2.append(charAt);
        }
        return sb2.toString();
    }

    static String upperCaseFirstLetter(String str) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (Character.isLetter(charAt)) {
                if (Character.isUpperCase(charAt)) {
                    return str;
                }
                char upperCase = Character.toUpperCase(charAt);
                if (i10 == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i10) + upperCase + str.substring(i10 + 1);
            }
        }
        return str;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    @Override // com.google.gson.c
    public abstract /* synthetic */ String translateName(Field field);

    /* synthetic */ b(String str, int i10, a aVar) {
        this(str, i10);
    }
}
