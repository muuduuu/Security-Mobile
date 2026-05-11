package com.google.android.gms.measurement.internal;

import V6.AbstractC1287s;

/* loaded from: classes2.dex */
final class E {

    /* renamed from: a, reason: collision with root package name */
    final String f25365a;

    /* renamed from: b, reason: collision with root package name */
    final String f25366b;

    /* renamed from: c, reason: collision with root package name */
    final long f25367c;

    /* renamed from: d, reason: collision with root package name */
    final long f25368d;

    /* renamed from: e, reason: collision with root package name */
    final long f25369e;

    /* renamed from: f, reason: collision with root package name */
    final long f25370f;

    /* renamed from: g, reason: collision with root package name */
    final long f25371g;

    /* renamed from: h, reason: collision with root package name */
    final Long f25372h;

    /* renamed from: i, reason: collision with root package name */
    final Long f25373i;

    /* renamed from: j, reason: collision with root package name */
    final Long f25374j;

    /* renamed from: k, reason: collision with root package name */
    final Boolean f25375k;

    E(String str, String str2, long j10, long j11, long j12, long j13, long j14, Long l10, Long l11, Long l12, Boolean bool) {
        AbstractC1287s.g(str);
        AbstractC1287s.g(str2);
        AbstractC1287s.a(j10 >= 0);
        AbstractC1287s.a(j11 >= 0);
        AbstractC1287s.a(j12 >= 0);
        AbstractC1287s.a(j14 >= 0);
        this.f25365a = str;
        this.f25366b = str2;
        this.f25367c = j10;
        this.f25368d = j11;
        this.f25369e = j12;
        this.f25370f = j13;
        this.f25371g = j14;
        this.f25372h = l10;
        this.f25373i = l11;
        this.f25374j = l12;
        this.f25375k = bool;
    }

    final E a(long j10) {
        return new E(this.f25365a, this.f25366b, this.f25367c, this.f25368d, this.f25369e, j10, this.f25371g, this.f25372h, this.f25373i, this.f25374j, this.f25375k);
    }

    final E b(long j10, long j11) {
        return new E(this.f25365a, this.f25366b, this.f25367c, this.f25368d, this.f25369e, this.f25370f, j10, Long.valueOf(j11), this.f25373i, this.f25374j, this.f25375k);
    }

    final E c(Long l10, Long l11, Boolean bool) {
        return new E(this.f25365a, this.f25366b, this.f25367c, this.f25368d, this.f25369e, this.f25370f, this.f25371g, this.f25372h, l10, l11, bool);
    }
}
