package com.google.android.gms.common;

import android.util.Log;

/* loaded from: classes2.dex */
public class W {

    /* renamed from: e, reason: collision with root package name */
    private static final W f23328e = new W(true, 3, 1, null, null, -1);

    /* renamed from: a, reason: collision with root package name */
    final boolean f23329a;

    /* renamed from: b, reason: collision with root package name */
    final String f23330b;

    /* renamed from: c, reason: collision with root package name */
    final Throwable f23331c;

    /* renamed from: d, reason: collision with root package name */
    final int f23332d;

    private W(boolean z10, int i10, int i11, String str, Throwable th, long j10) {
        this.f23329a = z10;
        this.f23332d = i10;
        this.f23330b = str;
        this.f23331c = th;
    }

    static W b() {
        return f23328e;
    }

    static W c(String str) {
        return new W(false, 1, 5, str, null, -1L);
    }

    static W d(String str, Throwable th) {
        return new W(false, 1, 5, str, th, -1L);
    }

    public static W f(int i10, long j10) {
        return new W(true, i10, 1, null, null, j10);
    }

    static W g(int i10, int i11, String str, Throwable th) {
        return new W(false, i10, i11, str, th, -1L);
    }

    String a() {
        return this.f23330b;
    }

    final void e() {
        if (this.f23329a || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        Throwable th = this.f23331c;
        if (th != null) {
            Log.d("GoogleCertificatesRslt", a(), th);
        } else {
            Log.d("GoogleCertificatesRslt", a());
        }
    }

    /* synthetic */ W(boolean z10, int i10, int i11, String str, Throwable th, long j10, byte[] bArr) {
        this(false, 1, 5, null, null, -1L);
    }
}
