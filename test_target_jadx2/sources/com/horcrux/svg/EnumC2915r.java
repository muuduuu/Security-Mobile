package com.horcrux.svg;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.horcrux.svg.r, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
enum EnumC2915r {
    UNKNOWN("unknown"),
    NORMAL("normal"),
    MULTIPLY("multiply"),
    SCREEN("screen"),
    DARKEN("darken"),
    LIGHTEN("lighten");

    private static final Map<String, EnumC2915r> typeToEnum = new HashMap();
    private final String mode;

    static {
        for (EnumC2915r enumC2915r : values()) {
            typeToEnum.put(enumC2915r.mode, enumC2915r);
        }
    }

    EnumC2915r(String str) {
        this.mode = str;
    }

    static EnumC2915r getEnum(String str) {
        Map<String, EnumC2915r> map = typeToEnum;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        throw new IllegalArgumentException("Unknown String Value: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.mode;
    }
}
