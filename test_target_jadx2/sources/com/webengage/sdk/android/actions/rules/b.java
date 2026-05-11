package com.webengage.sdk.android.actions.rules;

import com.webengage.sdk.android.s0;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private String f30448a;

    /* renamed from: b, reason: collision with root package name */
    private String f30449b;

    /* renamed from: c, reason: collision with root package name */
    private String f30450c;

    /* renamed from: d, reason: collision with root package name */
    private String f30451d;

    /* renamed from: e, reason: collision with root package name */
    private s0 f30452e;

    /* renamed from: com.webengage.sdk.android.actions.rules.b$b, reason: collision with other inner class name */
    public static class C0444b {

        /* renamed from: a, reason: collision with root package name */
        private String f30453a;

        /* renamed from: b, reason: collision with root package name */
        private String f30454b;

        /* renamed from: c, reason: collision with root package name */
        private String f30455c;

        /* renamed from: d, reason: collision with root package name */
        private String f30456d;

        /* renamed from: e, reason: collision with root package name */
        private s0 f30457e;

        public C0444b a(s0 s0Var) {
            this.f30457e = s0Var;
            return this;
        }

        public C0444b b(String str) {
            this.f30456d = str;
            return this;
        }

        public C0444b c(String str) {
            this.f30454b = str;
            return this;
        }

        public C0444b d(String str) {
            this.f30453a = str;
            return this;
        }

        public C0444b a(String str) {
            this.f30455c = str;
            return this;
        }

        public b a() {
            return new b(this);
        }
    }

    private b(C0444b c0444b) {
        this.f30448a = c0444b.f30453a;
        this.f30449b = c0444b.f30454b;
        this.f30450c = c0444b.f30455c;
        this.f30451d = c0444b.f30456d;
        this.f30452e = c0444b.f30457e;
    }

    public String a() {
        return this.f30450c;
    }

    public String b() {
        return this.f30451d;
    }

    public s0 c() {
        return this.f30452e;
    }

    public String d() {
        return this.f30449b;
    }

    public String e() {
        return this.f30448a;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        return ((b) obj).e().equals(e());
    }

    public int hashCode() {
        return e().hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        String property = System.getProperty("line.separator");
        sb2.append(getClass().getName() + " Object { " + property);
        sb2.append(" Id : " + e() + property);
        sb2.append(" Function : " + d().toString() + property);
        sb2.append(" Attribute : " + a() + property);
        sb2.append(" Attribute Category : " + b() + property);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(" Rule : ");
        sb3.append(c().toString());
        sb2.append(sb3.toString());
        sb2.append("}");
        return sb2.toString();
    }
}
