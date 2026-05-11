package com.google.android.gms.measurement.internal;

import V6.AbstractC1287s;
import android.content.SharedPreferences;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class P2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f25609a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f25610b;

    /* renamed from: c, reason: collision with root package name */
    private String f25611c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Q2 f25612d;

    public P2(Q2 q22, String str, String str2) {
        Objects.requireNonNull(q22);
        this.f25612d = q22;
        AbstractC1287s.g(str);
        this.f25609a = str;
    }

    public final String a() {
        if (!this.f25610b) {
            this.f25610b = true;
            Q2 q22 = this.f25612d;
            this.f25611c = q22.p().getString(this.f25609a, null);
        }
        return this.f25611c;
    }

    public final void b(String str) {
        SharedPreferences.Editor edit = this.f25612d.p().edit();
        edit.putString(this.f25609a, str);
        edit.apply();
        this.f25611c = str;
    }
}
