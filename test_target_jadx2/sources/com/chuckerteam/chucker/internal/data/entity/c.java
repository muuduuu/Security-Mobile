package com.chuckerteam.chucker.internal.data.entity;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private Long f20535a;

    /* renamed from: b, reason: collision with root package name */
    private String f20536b;

    /* renamed from: c, reason: collision with root package name */
    private Long f20537c;

    /* renamed from: d, reason: collision with root package name */
    private String f20538d;

    /* renamed from: e, reason: collision with root package name */
    private String f20539e;

    /* renamed from: f, reason: collision with root package name */
    private String f20540f;

    public c(Long l10, String str, Long l11, String str2, String str3, String str4) {
        this.f20535a = l10;
        this.f20536b = str;
        this.f20537c = l11;
        this.f20538d = str2;
        this.f20539e = str3;
        this.f20540f = str4;
    }

    public final String a() {
        return this.f20538d;
    }

    public final String b() {
        return this.f20540f;
    }

    public final Long c() {
        return this.f20537c;
    }

    public final Long d() {
        return this.f20535a;
    }

    public final String e() {
        return this.f20539e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.b(this.f20535a, cVar.f20535a) && Intrinsics.b(this.f20536b, cVar.f20536b) && Intrinsics.b(this.f20537c, cVar.f20537c) && Intrinsics.b(this.f20538d, cVar.f20538d) && Intrinsics.b(this.f20539e, cVar.f20539e) && Intrinsics.b(this.f20540f, cVar.f20540f);
    }

    public final String f() {
        return this.f20536b;
    }

    public int hashCode() {
        Long l10 = this.f20535a;
        int hashCode = (l10 == null ? 0 : l10.hashCode()) * 31;
        String str = this.f20536b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l11 = this.f20537c;
        int hashCode3 = (hashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str2 = this.f20538d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f20539e;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f20540f;
        return hashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "RecordedThrowable(id=" + this.f20535a + ", tag=" + ((Object) this.f20536b) + ", date=" + this.f20537c + ", clazz=" + ((Object) this.f20538d) + ", message=" + ((Object) this.f20539e) + ", content=" + ((Object) this.f20540f) + ')';
    }
}
