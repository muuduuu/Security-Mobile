package com.horcrux.svg;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.horcrux.svg.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
enum EnumC2914q {
    UNKNOWN("unknown"),
    DUPLICATE("duplicate"),
    WRAP("wrap"),
    NONE("none");

    private static final Map<String, EnumC2914q> edgeModeToEnum = new HashMap();
    private final String edgeMode;

    static {
        for (EnumC2914q enumC2914q : values()) {
            edgeModeToEnum.put(enumC2914q.edgeMode, enumC2914q);
        }
    }

    EnumC2914q(String str) {
        this.edgeMode = str;
    }

    static EnumC2914q getEnum(String str) {
        Map<String, EnumC2914q> map = edgeModeToEnum;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        throw new IllegalArgumentException("Unknown 'edgeMode' Value: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.edgeMode;
    }
}
