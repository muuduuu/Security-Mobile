package com.google.android.gms.internal.clearcut;

import java.util.Map;

/* loaded from: classes2.dex */
final class Q extends P {
    Q() {
    }

    @Override // com.google.android.gms.internal.clearcut.P
    final int a(Map.Entry entry) {
        android.support.v4.media.session.b.a(entry.getKey());
        throw null;
    }

    @Override // com.google.android.gms.internal.clearcut.P
    final U b(Object obj) {
        android.support.v4.media.session.b.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.clearcut.P
    final void c(InterfaceC2166t1 interfaceC2166t1, Map.Entry entry) {
        android.support.v4.media.session.b.a(entry.getKey());
        int[] iArr = S.f23935a;
        throw null;
    }

    @Override // com.google.android.gms.internal.clearcut.P
    final void d(Object obj, U u10) {
        android.support.v4.media.session.b.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.clearcut.P
    final U e(Object obj) {
        U b10 = b(obj);
        if (!b10.c()) {
            return b10;
        }
        U u10 = (U) b10.clone();
        d(obj, u10);
        return u10;
    }

    @Override // com.google.android.gms.internal.clearcut.P
    final void f(Object obj) {
        b(obj).i();
    }

    @Override // com.google.android.gms.internal.clearcut.P
    final boolean g(B0 b02) {
        return false;
    }
}
