package com.webengage.sdk.android;

import java.io.Serializable;

/* loaded from: classes2.dex */
public class n3 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private String f30730a;

    /* renamed from: b, reason: collision with root package name */
    private Object f30731b;

    private n3() {
        this.f30730a = null;
        this.f30731b = null;
    }

    public String a() {
        return this.f30730a;
    }

    public Object b() {
        return this.f30731b;
    }

    public boolean equals(Object obj) {
        return false;
    }

    public int hashCode() {
        if (this.f30730a == null || this.f30731b == null) {
            return super.hashCode();
        }
        return (this.f30730a + this.f30731b).hashCode();
    }

    public n3(String str, Object obj) {
        this.f30730a = str;
        this.f30731b = obj;
    }
}
