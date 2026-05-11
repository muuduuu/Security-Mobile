package com.webengage.sdk.android;

import com.webengage.sdk.android.utils.WebEngageConstant;

/* loaded from: classes2.dex */
public enum Environment {
    US(WebEngageConstant.AWS),
    IN(WebEngageConstant.IN),
    KSA(WebEngageConstant.KSA);


    /* renamed from: a, reason: collision with root package name */
    private final String f30122a;

    Environment(String str) {
        this.f30122a = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f30122a;
    }
}
