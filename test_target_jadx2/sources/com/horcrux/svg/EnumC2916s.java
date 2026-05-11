package com.horcrux.svg;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.horcrux.svg.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
enum EnumC2916s {
    MATRIX("matrix"),
    SATURATE("saturate"),
    HUE_ROTATE("hueRotate"),
    LUMINANCE_TO_ALPHA("luminanceToAlpha");

    private static final Map<String, EnumC2916s> typeToEnum = new HashMap();
    private final String type;

    static {
        for (EnumC2916s enumC2916s : values()) {
            typeToEnum.put(enumC2916s.type, enumC2916s);
        }
    }

    EnumC2916s(String str) {
        this.type = str;
    }

    static EnumC2916s getEnum(String str) {
        Map<String, EnumC2916s> map = typeToEnum;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        throw new IllegalArgumentException("Unknown String Value: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.type;
    }
}
