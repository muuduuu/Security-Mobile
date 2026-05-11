package com.webengage.sdk.android.utils;

/* loaded from: classes2.dex */
public enum Gender {
    MALE,
    FEMALE,
    OTHER;

    public static Gender valueByString(String str) {
        try {
            return valueOf(str.toUpperCase());
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        return name().toLowerCase();
    }
}
