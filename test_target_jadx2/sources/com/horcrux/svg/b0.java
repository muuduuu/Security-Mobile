package com.horcrux.svg;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
enum b0 {
    baseline("baseline"),
    textBottom("text-bottom"),
    alphabetic("alphabetic"),
    ideographic("ideographic"),
    middle("middle"),
    central("central"),
    mathematical("mathematical"),
    textTop("text-top"),
    bottom("bottom"),
    center("center"),
    top("top"),
    textBeforeEdge("text-before-edge"),
    textAfterEdge("text-after-edge"),
    beforeEdge("before-edge"),
    afterEdge("after-edge"),
    hanging("hanging");

    private static final Map<String, b0> alignmentToEnum = new HashMap();
    private final String alignment;

    static {
        for (b0 b0Var : values()) {
            alignmentToEnum.put(b0Var.alignment, b0Var);
        }
    }

    b0(String str) {
        this.alignment = str;
    }

    static b0 getEnum(String str) {
        Map<String, b0> map = alignmentToEnum;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        throw new IllegalArgumentException("Unknown String Value: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.alignment;
    }
}
