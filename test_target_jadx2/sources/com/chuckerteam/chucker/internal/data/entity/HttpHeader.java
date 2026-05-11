package com.chuckerteam.chucker.internal.data.entity;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;
import u5.C4870a;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/chuckerteam/chucker/internal/data/entity/a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "name", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", C4870a.f43493a, "Ljava/lang/String;", "b", "com.github.ChuckerTeam.Chucker.library"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.chuckerteam.chucker.internal.data.entity.a, reason: from toString */
/* loaded from: classes.dex */
public final /* data */ class HttpHeader {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @O8.c("name")
    private final String name;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @O8.c("value")
    private final String value;

    public HttpHeader(String name, String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.name = name;
        this.value = value;
    }

    /* renamed from: a, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: b, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HttpHeader)) {
            return false;
        }
        HttpHeader httpHeader = (HttpHeader) other;
        return Intrinsics.b(this.name, httpHeader.name) && Intrinsics.b(this.value, httpHeader.value);
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.value.hashCode();
    }

    public String toString() {
        return "HttpHeader(name=" + this.name + ", value=" + this.value + ')';
    }
}
