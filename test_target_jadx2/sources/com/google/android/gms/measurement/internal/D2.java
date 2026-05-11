package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class D2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f25354a;

    /* renamed from: b, reason: collision with root package name */
    public final String f25355b;

    /* renamed from: c, reason: collision with root package name */
    public final long f25356c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f25357d;

    public D2(String str, String str2, Bundle bundle, long j10) {
        this.f25354a = str;
        this.f25355b = str2;
        this.f25357d = bundle;
        this.f25356c = j10;
    }

    public static D2 a(I i10) {
        return new D2(i10.f25442a, i10.f25444c, i10.f25443b.Z0(), i10.f25445d);
    }

    public final I b() {
        return new I(this.f25354a, new G(new Bundle(this.f25357d)), this.f25355b, this.f25356c);
    }

    public final String toString() {
        String str = this.f25355b;
        String obj = this.f25357d.toString();
        int length = String.valueOf(str).length();
        String str2 = this.f25354a;
        StringBuilder sb2 = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + obj.length());
        sb2.append("origin=");
        sb2.append(str);
        sb2.append(",name=");
        sb2.append(str2);
        sb2.append(",params=");
        sb2.append(obj);
        return sb2.toString();
    }
}
