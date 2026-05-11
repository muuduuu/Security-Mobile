package com.google.android.gms.measurement.internal;

import V6.AbstractC1287s;
import java.util.Map;

/* loaded from: classes2.dex */
final class F2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final E2 f25392a;

    /* renamed from: b, reason: collision with root package name */
    private final int f25393b;

    /* renamed from: c, reason: collision with root package name */
    private final Throwable f25394c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f25395d;

    /* renamed from: e, reason: collision with root package name */
    private final String f25396e;

    /* renamed from: f, reason: collision with root package name */
    private final Map f25397f;

    /* synthetic */ F2(String str, E2 e22, int i10, Throwable th, byte[] bArr, Map map, byte[] bArr2) {
        AbstractC1287s.m(e22);
        this.f25392a = e22;
        this.f25393b = i10;
        this.f25394c = th;
        this.f25395d = bArr;
        this.f25396e = str;
        this.f25397f = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f25392a.a(this.f25396e, this.f25393b, this.f25394c, this.f25395d, this.f25397f);
    }
}
