package com.facebook.yoga;

/* loaded from: classes2.dex */
public enum u {
    VISIBLE(0),
    HIDDEN(1),
    SCROLL(2);

    private final int mIntValue;

    u(int i10) {
        this.mIntValue = i10;
    }

    public static u fromInt(int i10) {
        if (i10 == 0) {
            return VISIBLE;
        }
        if (i10 == 1) {
            return HIDDEN;
        }
        if (i10 == 2) {
            return SCROLL;
        }
        throw new IllegalArgumentException("Unknown enum value: " + i10);
    }

    public int intValue() {
        return this.mIntValue;
    }
}
