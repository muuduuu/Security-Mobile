package com.google.firebase.remoteconfig.internal;

import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public class x implements J8.v {

    /* renamed from: a, reason: collision with root package name */
    private final String f28445a;

    /* renamed from: b, reason: collision with root package name */
    private final int f28446b;

    x(String str, int i10) {
        this.f28445a = str;
        this.f28446b = i10;
    }

    private void a() {
        if (this.f28445a == null) {
            throw new IllegalArgumentException("Value is null, and cannot be converted to the desired type.");
        }
    }

    @Override // J8.v
    public String asString() {
        if (this.f28446b == 0) {
            return BuildConfig.FLAVOR;
        }
        a();
        return this.f28445a;
    }

    @Override // J8.v
    public int j() {
        return this.f28446b;
    }
}
