package com.webengage.sdk.android;

import com.webengage.sdk.android.utils.WebEngageConstant;

/* loaded from: classes2.dex */
public class t2 {

    /* renamed from: a, reason: collision with root package name */
    private s0 f30824a;

    /* renamed from: b, reason: collision with root package name */
    private s0 f30825b;

    /* renamed from: c, reason: collision with root package name */
    private s0 f30826c;

    /* renamed from: d, reason: collision with root package name */
    private s0 f30827d;

    public t2(String str) {
        this.f30824a = null;
        this.f30825b = null;
        this.f30826c = null;
        this.f30827d = null;
        this.f30827d = new s0(str);
    }

    public s0 a() {
        return this.f30827d;
    }

    public s0 b() {
        return this.f30826c;
    }

    public WebEngageConstant.d c() {
        return b().toString().equalsIgnoreCase("true") ? WebEngageConstant.d.PAGE_RULE : WebEngageConstant.d.EVENT_RULE;
    }

    public s0 d() {
        return this.f30825b;
    }

    public s0 e() {
        return this.f30824a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof t2)) {
            return false;
        }
        t2 t2Var = (t2) obj;
        return t2Var.f30824a.equals(this.f30824a) && t2Var.f30825b.equals(this.f30825b) && t2Var.f30826c.equals(this.f30826c);
    }

    public int hashCode() {
        return (this.f30824a.toString() + this.f30825b.toString() + this.f30826c.toString()).hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        String property = System.getProperty("line.separator");
        sb2.append(getClass().getName() + " Object { " + property);
        sb2.append(" Session Rule : " + e() + property);
        sb2.append(" Page Rule : " + d() + property);
        sb2.append(" Event Rule : " + b() + property);
        sb2.append("}");
        return sb2.toString();
    }

    public t2(String str, String str2, String str3) {
        this.f30824a = null;
        this.f30825b = null;
        this.f30826c = null;
        this.f30827d = null;
        this.f30824a = new s0(str);
        this.f30825b = new s0(str2);
        this.f30826c = new s0(str3);
    }
}
