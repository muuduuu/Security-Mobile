package com.google.android.gms.internal.clearcut;

import org.conscrypt.BuildConfig;

/* renamed from: com.google.android.gms.internal.clearcut.s1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC2163s1 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(BuildConfig.FLAVOR),
    BYTE_STRING(AbstractC2179y.f24108b),
    ENUM(null),
    MESSAGE(null);

    private final Object zzlj;

    EnumC2163s1(Object obj) {
        this.zzlj = obj;
    }
}
