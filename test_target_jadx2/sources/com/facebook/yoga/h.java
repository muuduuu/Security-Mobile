package com.facebook.yoga;

/* loaded from: classes2.dex */
public enum h {
    INHERIT(0),
    LTR(1),
    RTL(2);

    private final int mIntValue;

    h(int i10) {
        this.mIntValue = i10;
    }

    public static h fromInt(int i10) {
        if (i10 == 0) {
            return INHERIT;
        }
        if (i10 == 1) {
            return LTR;
        }
        if (i10 == 2) {
            return RTL;
        }
        throw new IllegalArgumentException("Unknown enum value: " + i10);
    }

    public int intValue() {
        return this.mIntValue;
    }
}
