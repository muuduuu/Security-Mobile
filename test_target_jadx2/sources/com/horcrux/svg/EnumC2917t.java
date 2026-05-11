package com.horcrux.svg;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.horcrux.svg.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
enum EnumC2917t {
    OBJECT_BOUNDING_BOX("objectBoundingBox"),
    USER_SPACE_ON_USE("userSpaceOnUse");

    private static final Map<String, EnumC2917t> unitsToEnum = new HashMap();
    private final String units;

    static {
        for (EnumC2917t enumC2917t : values()) {
            unitsToEnum.put(enumC2917t.units, enumC2917t);
        }
    }

    EnumC2917t(String str) {
        this.units = str;
    }

    static EnumC2917t getEnum(String str) {
        Map<String, EnumC2917t> map = unitsToEnum;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        throw new IllegalArgumentException("Unknown 'Unit' Value: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.units;
    }
}
