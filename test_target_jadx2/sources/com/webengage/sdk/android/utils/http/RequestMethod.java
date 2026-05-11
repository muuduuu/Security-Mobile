package com.webengage.sdk.android.utils.http;

/* loaded from: classes2.dex */
public enum RequestMethod {
    GET("GET"),
    POST("POST"),
    PUT("PUT"),
    DELETE("DELETE");


    /* renamed from: a, reason: collision with root package name */
    private String f30953a;

    RequestMethod(String str) {
        this.f30953a = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f30953a;
    }
}
