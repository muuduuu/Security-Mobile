package com.chuckerteam.chucker.internal.data.entity;

import Q2.j;
import Q2.k;
import Td.w;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private long f20523a;

    /* renamed from: b, reason: collision with root package name */
    private Long f20524b;

    /* renamed from: c, reason: collision with root package name */
    private Long f20525c;

    /* renamed from: d, reason: collision with root package name */
    private String f20526d;

    /* renamed from: e, reason: collision with root package name */
    private String f20527e;

    /* renamed from: f, reason: collision with root package name */
    private String f20528f;

    /* renamed from: g, reason: collision with root package name */
    private String f20529g;

    /* renamed from: h, reason: collision with root package name */
    private String f20530h;

    /* renamed from: i, reason: collision with root package name */
    private Integer f20531i;

    /* renamed from: j, reason: collision with root package name */
    private Long f20532j;

    /* renamed from: k, reason: collision with root package name */
    private Long f20533k;

    /* renamed from: l, reason: collision with root package name */
    private String f20534l;

    public b(long j10, Long l10, Long l11, String str, String str2, String str3, String str4, String str5, Integer num, Long l12, Long l13, String str6) {
        this.f20523a = j10;
        this.f20524b = l10;
        this.f20525c = l11;
        this.f20526d = str;
        this.f20527e = str2;
        this.f20528f = str3;
        this.f20529g = str4;
        this.f20530h = str5;
        this.f20531i = num;
        this.f20532j = l12;
        this.f20533k = l13;
        this.f20534l = str6;
    }

    private final String a(long j10) {
        return j.f8092a.a(j10, true);
    }

    public final String b() {
        Long l10 = this.f20525c;
        if (l10 == null) {
            return null;
        }
        return l10.longValue() + " ms";
    }

    public final String c(boolean z10) {
        w l10;
        String str = this.f20529g;
        return (str == null || (l10 = w.l(Intrinsics.m("https://www.example.com", str))) == null) ? BuildConfig.FLAVOR : k.f8095f.c(l10, z10).b();
    }

    public final String d() {
        return this.f20528f;
    }

    public final long e() {
        return this.f20523a;
    }

    public final String f() {
        return this.f20527e;
    }

    public final Long g() {
        return this.f20524b;
    }

    public final Integer h() {
        return this.f20531i;
    }

    public final HttpTransaction.a i() {
        return this.f20534l != null ? HttpTransaction.a.Failed : this.f20531i == null ? HttpTransaction.a.Requested : HttpTransaction.a.Complete;
    }

    public final String j() {
        Long l10 = this.f20532j;
        long longValue = l10 == null ? 0L : l10.longValue();
        Long l11 = this.f20533k;
        return a(longValue + (l11 != null ? l11.longValue() : 0L));
    }

    public final boolean k() {
        return StringsKt.r(this.f20530h, "https", true);
    }
}
