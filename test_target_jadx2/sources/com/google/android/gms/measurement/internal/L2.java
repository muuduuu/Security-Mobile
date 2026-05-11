package com.google.android.gms.measurement.internal;

import V6.AbstractC1287s;
import android.content.SharedPreferences;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class L2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f25532a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f25533b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f25534c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f25535d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Q2 f25536e;

    public L2(Q2 q22, String str, boolean z10) {
        Objects.requireNonNull(q22);
        this.f25536e = q22;
        AbstractC1287s.g(str);
        this.f25532a = str;
        this.f25533b = z10;
    }

    public final boolean a() {
        if (!this.f25534c) {
            this.f25534c = true;
            Q2 q22 = this.f25536e;
            this.f25535d = q22.p().getBoolean(this.f25532a, this.f25533b);
        }
        return this.f25535d;
    }

    public final void b(boolean z10) {
        SharedPreferences.Editor edit = this.f25536e.p().edit();
        edit.putBoolean(this.f25532a, z10);
        edit.apply();
        this.f25535d = z10;
    }
}
