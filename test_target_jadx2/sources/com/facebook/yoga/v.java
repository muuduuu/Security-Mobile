package com.facebook.yoga;

/* loaded from: classes2.dex */
public enum v {
    STATIC(0),
    RELATIVE(1),
    ABSOLUTE(2);

    private final int mIntValue;

    v(int i10) {
        this.mIntValue = i10;
    }

    public static v fromInt(int i10) {
        if (i10 == 0) {
            return STATIC;
        }
        if (i10 == 1) {
            return RELATIVE;
        }
        if (i10 == 2) {
            return ABSOLUTE;
        }
        throw new IllegalArgumentException("Unknown enum value: " + i10);
    }

    public int intValue() {
        return this.mIntValue;
    }
}
