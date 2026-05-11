package com.fasterxml.jackson.core;

/* loaded from: classes2.dex */
public enum o implements C5.g {
    CAN_WRITE_BINARY_NATIVELY(false),
    CAN_WRITE_FORMATTED_NUMBERS(false);

    private final boolean _defaultState;
    private final int _mask = 1 << ordinal();

    o(boolean z10) {
        this._defaultState = z10;
    }

    @Override // C5.g
    public boolean enabledByDefault() {
        return this._defaultState;
    }

    public boolean enabledIn(int i10) {
        return (i10 & this._mask) != 0;
    }

    @Override // C5.g
    public int getMask() {
        return this._mask;
    }
}
