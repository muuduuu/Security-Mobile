package com.horcrux.svg;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
enum g0 {
    None("none"),
    Underline("underline"),
    Overline("overline"),
    LineThrough("line-through"),
    Blink("blink");

    private static final Map<String, g0> decorationToEnum = new HashMap();
    private final String decoration;

    static {
        for (g0 g0Var : values()) {
            decorationToEnum.put(g0Var.decoration, g0Var);
        }
    }

    g0(String str) {
        this.decoration = str;
    }

    static g0 getEnum(String str) {
        Map<String, g0> map = decorationToEnum;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        throw new IllegalArgumentException("Unknown String Value: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.decoration;
    }
}
