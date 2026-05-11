package com.google.android.gms.measurement.internal;

import android.util.Log;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.z2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC2830z2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f26483a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f26484b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f26485c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Object f26486d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Object f26487e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C2 f26488f;

    RunnableC2830z2(C2 c22, int i10, String str, Object obj, Object obj2, Object obj3) {
        this.f26483a = i10;
        this.f26484b = str;
        this.f26485c = obj;
        this.f26486d = obj2;
        this.f26487e = obj3;
        Objects.requireNonNull(c22);
        this.f26488f = c22;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2 c22 = this.f26488f;
        Q2 x10 = c22.f25694a.x();
        if (!x10.k()) {
            Log.println(6, c22.z(), "Persisted config not initialized. Not logging error/warn");
            return;
        }
        if (c22.D() == 0) {
            C2760q3 c2760q3 = c22.f25694a;
            if (c2760q3.w().B()) {
                c2760q3.c();
                c22.E('C');
            } else {
                c2760q3.c();
                c22.E('c');
            }
        }
        if (c22.F() < 0) {
            c22.f25694a.w().A();
            c22.G(133005L);
        }
        int i10 = this.f26483a;
        char D10 = c22.D();
        long F10 = c22.F();
        String str = this.f26484b;
        Object obj = this.f26485c;
        Object obj2 = this.f26486d;
        Object obj3 = this.f26487e;
        char charAt = "01VDIWEA?".charAt(i10);
        String A10 = C2.A(true, str, obj, obj2, obj3);
        int length = String.valueOf(charAt).length();
        StringBuilder sb2 = new StringBuilder(length + 1 + String.valueOf(D10).length() + String.valueOf(F10).length() + 1 + A10.length());
        sb2.append("2");
        sb2.append(charAt);
        sb2.append(D10);
        sb2.append(F10);
        sb2.append(":");
        sb2.append(A10);
        String sb3 = sb2.toString();
        if (sb3.length() > 1024) {
            sb3 = str.substring(0, 1024);
        }
        O2 o22 = x10.f25632e;
        if (o22 != null) {
            o22.a(sb3, 1L);
        }
    }
}
