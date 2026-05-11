package com.chuckerteam.chucker.internal.data.entity;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private Long f20541a;

    /* renamed from: b, reason: collision with root package name */
    private String f20542b;

    /* renamed from: c, reason: collision with root package name */
    private Long f20543c;

    /* renamed from: d, reason: collision with root package name */
    private String f20544d;

    /* renamed from: e, reason: collision with root package name */
    private String f20545e;

    public d(Long l10, String str, Long l11, String str2, String str3) {
        this.f20541a = l10;
        this.f20542b = str;
        this.f20543c = l11;
        this.f20544d = str2;
        this.f20545e = str3;
    }

    public final String a() {
        return this.f20544d;
    }

    public final Long b() {
        return this.f20543c;
    }

    public final Long c() {
        return this.f20541a;
    }

    public final String d() {
        return this.f20545e;
    }

    public final String e() {
        return this.f20542b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.b(this.f20541a, dVar.f20541a) && Intrinsics.b(this.f20542b, dVar.f20542b) && Intrinsics.b(this.f20543c, dVar.f20543c) && Intrinsics.b(this.f20544d, dVar.f20544d) && Intrinsics.b(this.f20545e, dVar.f20545e);
    }

    public int hashCode() {
        Long l10 = this.f20541a;
        int hashCode = (l10 == null ? 0 : l10.hashCode()) * 31;
        String str = this.f20542b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l11 = this.f20543c;
        int hashCode3 = (hashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str2 = this.f20544d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f20545e;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "RecordedThrowableTuple(id=" + this.f20541a + ", tag=" + ((Object) this.f20542b) + ", date=" + this.f20543c + ", clazz=" + ((Object) this.f20544d) + ", message=" + ((Object) this.f20545e) + ')';
    }
}
