package com.horcrux.svg;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
enum e0 {
    Normal("normal"),
    Bold("bold"),
    w100("100"),
    w200("200"),
    w300("300"),
    w400("400"),
    w500("500"),
    w600("600"),
    w700("700"),
    w800("800"),
    w900("900"),
    Bolder("bolder"),
    Lighter("lighter");

    private static final Map<String, e0> weightToEnum = new HashMap();
    private final String weight;

    static {
        for (e0 e0Var : values()) {
            weightToEnum.put(e0Var.weight, e0Var);
        }
    }

    e0(String str) {
        this.weight = str;
    }

    static e0 get(String str) {
        return weightToEnum.get(str);
    }

    static boolean hasEnum(String str) {
        return weightToEnum.containsKey(str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.weight;
    }
}
