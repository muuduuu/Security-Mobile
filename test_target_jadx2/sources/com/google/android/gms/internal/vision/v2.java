package com.google.android.gms.internal.vision;

import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public enum v2 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(BuildConfig.FLAVOR),
    BYTE_STRING(AbstractC2570g0.f25133b),
    ENUM(null),
    MESSAGE(null);

    private final Object zzj;

    v2(Object obj) {
        this.zzj = obj;
    }
}
