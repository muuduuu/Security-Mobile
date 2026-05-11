package com.google.android.gms.measurement.internal;

import V6.AbstractC1287s;
import android.content.SharedPreferences;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class N2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f25568a;

    /* renamed from: b, reason: collision with root package name */
    private final long f25569b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f25570c;

    /* renamed from: d, reason: collision with root package name */
    private long f25571d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Q2 f25572e;

    public N2(Q2 q22, String str, long j10) {
        Objects.requireNonNull(q22);
        this.f25572e = q22;
        AbstractC1287s.g(str);
        this.f25568a = str;
        this.f25569b = j10;
    }

    public final long a() {
        if (!this.f25570c) {
            this.f25570c = true;
            Q2 q22 = this.f25572e;
            this.f25571d = q22.p().getLong(this.f25568a, this.f25569b);
        }
        return this.f25571d;
    }

    public final void b(long j10) {
        SharedPreferences.Editor edit = this.f25572e.p().edit();
        edit.putLong(this.f25568a, j10);
        edit.apply();
        this.f25571d = j10;
    }
}
