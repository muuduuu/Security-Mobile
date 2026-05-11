package com.google.android.gms.measurement.internal;

import V6.AbstractC1287s;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

/* loaded from: classes2.dex */
public final class n7 extends W6.a {
    public static final Parcelable.Creator<n7> CREATOR = new o7();

    /* renamed from: A, reason: collision with root package name */
    public final long f26192A;

    /* renamed from: B, reason: collision with root package name */
    public final String f26193B;

    /* renamed from: C, reason: collision with root package name */
    public final String f26194C;

    /* renamed from: D, reason: collision with root package name */
    public final long f26195D;

    /* renamed from: E, reason: collision with root package name */
    public final int f26196E;

    /* renamed from: a, reason: collision with root package name */
    public final String f26197a;

    /* renamed from: b, reason: collision with root package name */
    public final String f26198b;

    /* renamed from: c, reason: collision with root package name */
    public final String f26199c;

    /* renamed from: d, reason: collision with root package name */
    public final String f26200d;

    /* renamed from: e, reason: collision with root package name */
    public final long f26201e;

    /* renamed from: f, reason: collision with root package name */
    public final long f26202f;

    /* renamed from: g, reason: collision with root package name */
    public final String f26203g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f26204h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f26205i;

    /* renamed from: j, reason: collision with root package name */
    public final long f26206j;

    /* renamed from: k, reason: collision with root package name */
    public final String f26207k;

    /* renamed from: l, reason: collision with root package name */
    public final long f26208l;

    /* renamed from: m, reason: collision with root package name */
    public final int f26209m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f26210n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f26211o;

    /* renamed from: p, reason: collision with root package name */
    public final Boolean f26212p;

    /* renamed from: q, reason: collision with root package name */
    public final long f26213q;

    /* renamed from: r, reason: collision with root package name */
    public final List f26214r;

    /* renamed from: s, reason: collision with root package name */
    public final String f26215s;

    /* renamed from: t, reason: collision with root package name */
    public final String f26216t;

    /* renamed from: u, reason: collision with root package name */
    public final String f26217u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f26218v;

    /* renamed from: w, reason: collision with root package name */
    public final long f26219w;

    /* renamed from: x, reason: collision with root package name */
    public final int f26220x;

    /* renamed from: y, reason: collision with root package name */
    public final String f26221y;

    /* renamed from: z, reason: collision with root package name */
    public final int f26222z;

    n7(String str, String str2, String str3, long j10, String str4, long j11, long j12, String str5, boolean z10, boolean z11, String str6, long j13, int i10, boolean z12, boolean z13, Boolean bool, long j14, List list, String str7, String str8, String str9, boolean z14, long j15, int i11, String str10, int i12, long j16, String str11, String str12, long j17, int i13) {
        AbstractC1287s.g(str);
        this.f26197a = str;
        this.f26198b = true == TextUtils.isEmpty(str2) ? null : str2;
        this.f26199c = str3;
        this.f26206j = j10;
        this.f26200d = str4;
        this.f26201e = j11;
        this.f26202f = j12;
        this.f26203g = str5;
        this.f26204h = z10;
        this.f26205i = z11;
        this.f26207k = str6;
        this.f26208l = j13;
        this.f26209m = i10;
        this.f26210n = z12;
        this.f26211o = z13;
        this.f26212p = bool;
        this.f26213q = j14;
        this.f26214r = list;
        this.f26215s = str7;
        this.f26216t = str8;
        this.f26217u = str9;
        this.f26218v = z14;
        this.f26219w = j15;
        this.f26220x = i11;
        this.f26221y = str10;
        this.f26222z = i12;
        this.f26192A = j16;
        this.f26193B = str11;
        this.f26194C = str12;
        this.f26195D = j17;
        this.f26196E = i13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f26197a;
        int a10 = W6.c.a(parcel);
        W6.c.u(parcel, 2, str, false);
        W6.c.u(parcel, 3, this.f26198b, false);
        W6.c.u(parcel, 4, this.f26199c, false);
        W6.c.u(parcel, 5, this.f26200d, false);
        W6.c.q(parcel, 6, this.f26201e);
        W6.c.q(parcel, 7, this.f26202f);
        W6.c.u(parcel, 8, this.f26203g, false);
        W6.c.c(parcel, 9, this.f26204h);
        W6.c.c(parcel, 10, this.f26205i);
        W6.c.q(parcel, 11, this.f26206j);
        W6.c.u(parcel, 12, this.f26207k, false);
        W6.c.q(parcel, 14, this.f26208l);
        W6.c.m(parcel, 15, this.f26209m);
        W6.c.c(parcel, 16, this.f26210n);
        W6.c.c(parcel, 18, this.f26211o);
        W6.c.d(parcel, 21, this.f26212p, false);
        W6.c.q(parcel, 22, this.f26213q);
        W6.c.w(parcel, 23, this.f26214r, false);
        W6.c.u(parcel, 25, this.f26215s, false);
        W6.c.u(parcel, 26, this.f26216t, false);
        W6.c.u(parcel, 27, this.f26217u, false);
        W6.c.c(parcel, 28, this.f26218v);
        W6.c.q(parcel, 29, this.f26219w);
        W6.c.m(parcel, 30, this.f26220x);
        W6.c.u(parcel, 31, this.f26221y, false);
        W6.c.m(parcel, 32, this.f26222z);
        W6.c.q(parcel, 34, this.f26192A);
        W6.c.u(parcel, 35, this.f26193B, false);
        W6.c.u(parcel, 36, this.f26194C, false);
        W6.c.q(parcel, 37, this.f26195D);
        W6.c.m(parcel, 38, this.f26196E);
        W6.c.b(parcel, a10);
    }

    n7(String str, String str2, String str3, String str4, long j10, long j11, String str5, boolean z10, boolean z11, long j12, String str6, long j13, int i10, boolean z12, boolean z13, Boolean bool, long j14, List list, String str7, String str8, String str9, boolean z14, long j15, int i11, String str10, int i12, long j16, String str11, String str12, long j17, int i13) {
        this.f26197a = str;
        this.f26198b = str2;
        this.f26199c = str3;
        this.f26206j = j12;
        this.f26200d = str4;
        this.f26201e = j10;
        this.f26202f = j11;
        this.f26203g = str5;
        this.f26204h = z10;
        this.f26205i = z11;
        this.f26207k = str6;
        this.f26208l = j13;
        this.f26209m = i10;
        this.f26210n = z12;
        this.f26211o = z13;
        this.f26212p = bool;
        this.f26213q = j14;
        this.f26214r = list;
        this.f26215s = str7;
        this.f26216t = str8;
        this.f26217u = str9;
        this.f26218v = z14;
        this.f26219w = j15;
        this.f26220x = i11;
        this.f26221y = str10;
        this.f26222z = i12;
        this.f26192A = j16;
        this.f26193B = str11;
        this.f26194C = str12;
        this.f26195D = j17;
        this.f26196E = i13;
    }
}
