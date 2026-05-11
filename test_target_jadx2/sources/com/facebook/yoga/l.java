package com.facebook.yoga;

/* loaded from: classes2.dex */
public enum l {
    COLUMN(0),
    COLUMN_REVERSE(1),
    ROW(2),
    ROW_REVERSE(3);

    private final int mIntValue;

    l(int i10) {
        this.mIntValue = i10;
    }

    public static l fromInt(int i10) {
        if (i10 == 0) {
            return COLUMN;
        }
        if (i10 == 1) {
            return COLUMN_REVERSE;
        }
        if (i10 == 2) {
            return ROW;
        }
        if (i10 == 3) {
            return ROW_REVERSE;
        }
        throw new IllegalArgumentException("Unknown enum value: " + i10);
    }

    public int intValue() {
        return this.mIntValue;
    }
}
