package com.facebook.yoga;

/* loaded from: classes2.dex */
public enum i {
    FLEX(0),
    NONE(1);

    private final int mIntValue;

    i(int i10) {
        this.mIntValue = i10;
    }

    public static i fromInt(int i10) {
        if (i10 == 0) {
            return FLEX;
        }
        if (i10 == 1) {
            return NONE;
        }
        throw new IllegalArgumentException("Unknown enum value: " + i10);
    }

    public int intValue() {
        return this.mIntValue;
    }
}
