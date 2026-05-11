package com.facebook.yoga;

/* loaded from: classes2.dex */
public enum w {
    UNDEFINED(0),
    POINT(1),
    PERCENT(2),
    AUTO(3);

    private final int mIntValue;

    w(int i10) {
        this.mIntValue = i10;
    }

    public static w fromInt(int i10) {
        if (i10 == 0) {
            return UNDEFINED;
        }
        if (i10 == 1) {
            return POINT;
        }
        if (i10 == 2) {
            return PERCENT;
        }
        if (i10 == 3) {
            return AUTO;
        }
        throw new IllegalArgumentException("Unknown enum value: " + i10);
    }

    public int intValue() {
        return this.mIntValue;
    }
}
