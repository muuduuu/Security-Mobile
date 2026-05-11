package com.facebook.yoga;

/* loaded from: classes2.dex */
public enum m {
    COLUMN(0),
    ROW(1),
    ALL(2);

    private final int mIntValue;

    m(int i10) {
        this.mIntValue = i10;
    }

    public static m fromInt(int i10) {
        if (i10 == 0) {
            return COLUMN;
        }
        if (i10 == 1) {
            return ROW;
        }
        if (i10 == 2) {
            return ALL;
        }
        throw new IllegalArgumentException("Unknown enum value: " + i10);
    }

    public int intValue() {
        return this.mIntValue;
    }
}
