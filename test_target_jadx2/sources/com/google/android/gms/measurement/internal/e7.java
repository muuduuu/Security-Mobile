package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.C2207c3;
import java.util.Map;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public final class e7 {

    /* renamed from: a, reason: collision with root package name */
    private final long f25924a;

    /* renamed from: b, reason: collision with root package name */
    private final C2207c3 f25925b;

    /* renamed from: c, reason: collision with root package name */
    private final String f25926c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f25927d;

    /* renamed from: e, reason: collision with root package name */
    private final EnumC2714k5 f25928e;

    /* renamed from: f, reason: collision with root package name */
    private final long f25929f;

    /* renamed from: g, reason: collision with root package name */
    private final long f25930g;

    /* renamed from: h, reason: collision with root package name */
    private final long f25931h;

    /* renamed from: i, reason: collision with root package name */
    private final int f25932i;

    /* synthetic */ e7(long j10, C2207c3 c2207c3, String str, Map map, EnumC2714k5 enumC2714k5, long j11, long j12, long j13, int i10, byte[] bArr) {
        this.f25924a = j10;
        this.f25925b = c2207c3;
        this.f25926c = str;
        this.f25927d = map;
        this.f25928e = enumC2714k5;
        this.f25929f = j11;
        this.f25930g = j12;
        this.f25931h = j13;
        this.f25932i = i10;
    }

    public final N6 a() {
        return new N6(this.f25926c, this.f25927d, this.f25928e, null);
    }

    public final G6 b() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f25927d.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        long j10 = this.f25924a;
        C2207c3 c2207c3 = this.f25925b;
        String str = this.f25926c;
        EnumC2714k5 enumC2714k5 = this.f25928e;
        return new G6(j10, c2207c3.c(), str, bundle, enumC2714k5.zza(), this.f25930g, BuildConfig.FLAVOR);
    }

    public final long c() {
        return this.f25924a;
    }

    public final C2207c3 d() {
        return this.f25925b;
    }

    public final String e() {
        return this.f25926c;
    }

    public final EnumC2714k5 f() {
        return this.f25928e;
    }

    public final long g() {
        return this.f25929f;
    }

    public final long h() {
        return this.f25931h;
    }

    public final int i() {
        return this.f25932i;
    }
}
