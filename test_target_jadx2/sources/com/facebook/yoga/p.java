package com.facebook.yoga;

/* loaded from: classes2.dex */
public enum p {
    UNDEFINED(0),
    EXACTLY(1),
    AT_MOST(2);

    private final int mIntValue;

    p(int i10) {
        this.mIntValue = i10;
    }

    public static p fromInt(int i10) {
        if (i10 == 0) {
            return UNDEFINED;
        }
        if (i10 == 1) {
            return EXACTLY;
        }
        if (i10 == 2) {
            return AT_MOST;
        }
        throw new IllegalArgumentException("Unknown enum value: " + i10);
    }

    public int intValue() {
        return this.mIntValue;
    }
}
