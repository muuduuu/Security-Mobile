package com.google.android.gms.measurement.internal;

import V6.AbstractC1287s;
import android.content.SharedPreferences;
import android.util.Pair;
import java.util.Objects;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public final class O2 {

    /* renamed from: a, reason: collision with root package name */
    final String f25590a;

    /* renamed from: b, reason: collision with root package name */
    private final String f25591b;

    /* renamed from: c, reason: collision with root package name */
    private final String f25592c;

    /* renamed from: d, reason: collision with root package name */
    private final long f25593d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Q2 f25594e;

    /* synthetic */ O2(Q2 q22, String str, long j10, byte[] bArr) {
        Objects.requireNonNull(q22);
        this.f25594e = q22;
        AbstractC1287s.g("health_monitor");
        AbstractC1287s.a(j10 > 0);
        this.f25590a = "health_monitor:start";
        this.f25591b = "health_monitor:count";
        this.f25592c = "health_monitor:value";
        this.f25593d = j10;
    }

    private final void c() {
        Q2 q22 = this.f25594e;
        q22.h();
        long a10 = q22.f25694a.f().a();
        SharedPreferences.Editor edit = q22.p().edit();
        edit.remove(this.f25591b);
        edit.remove(this.f25592c);
        edit.putLong(this.f25590a, a10);
        edit.apply();
    }

    private final long d() {
        return this.f25594e.p().getLong(this.f25590a, 0L);
    }

    public final void a(String str, long j10) {
        Q2 q22 = this.f25594e;
        q22.h();
        if (d() == 0) {
            c();
        }
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        SharedPreferences p10 = q22.p();
        String str2 = this.f25591b;
        long j11 = p10.getLong(str2, 0L);
        if (j11 <= 0) {
            SharedPreferences.Editor edit = q22.p().edit();
            edit.putString(this.f25592c, str);
            edit.putLong(str2, 1L);
            edit.apply();
            return;
        }
        long nextLong = q22.f25694a.C().q0().nextLong() & Long.MAX_VALUE;
        long j12 = j11 + 1;
        long j13 = Long.MAX_VALUE / j12;
        SharedPreferences.Editor edit2 = q22.p().edit();
        if (nextLong < j13) {
            edit2.putString(this.f25592c, str);
        }
        edit2.putLong(str2, j12);
        edit2.apply();
    }

    public final Pair b() {
        long abs;
        Q2 q22 = this.f25594e;
        q22.h();
        q22.h();
        long d10 = d();
        if (d10 == 0) {
            c();
            abs = 0;
        } else {
            abs = Math.abs(d10 - q22.f25694a.f().a());
        }
        long j10 = this.f25593d;
        if (abs < j10) {
            return null;
        }
        if (abs > j10 + j10) {
            c();
            return null;
        }
        String string = q22.p().getString(this.f25592c, null);
        long j11 = q22.p().getLong(this.f25591b, 0L);
        c();
        return (string == null || j11 <= 0) ? Q2.f25629A : new Pair(string, Long.valueOf(j11));
    }
}
