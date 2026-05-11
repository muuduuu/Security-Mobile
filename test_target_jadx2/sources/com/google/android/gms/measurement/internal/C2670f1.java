package com.google.android.gms.measurement.internal;

import android.text.TextUtils;

/* renamed from: com.google.android.gms.measurement.internal.f1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2670f1 {

    /* renamed from: a, reason: collision with root package name */
    private final X3 f25934a;

    C2670f1(X3 x32) {
        this.f25934a = x32;
    }

    static C2670f1 c(String str) {
        return new C2670f1((TextUtils.isEmpty(str) || str.length() > 1) ? X3.UNINITIALIZED : C2633a4.j(str.charAt(0)));
    }

    final X3 a() {
        return this.f25934a;
    }

    final String b() {
        return String.valueOf(C2633a4.m(this.f25934a));
    }
}
