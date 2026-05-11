package com.google.android.gms.internal.auth;

/* loaded from: classes2.dex */
final class N0 extends P0 {
    /* synthetic */ N0(M0 m02) {
        super(null);
    }

    @Override // com.google.android.gms.internal.auth.P0
    final void a(Object obj, long j10) {
        ((E0) B1.f(obj, j10)).zzb();
    }

    @Override // com.google.android.gms.internal.auth.P0
    final void b(Object obj, Object obj2, long j10) {
        E0 e02 = (E0) B1.f(obj, j10);
        E0 e03 = (E0) B1.f(obj2, j10);
        int size = e02.size();
        int size2 = e03.size();
        if (size > 0 && size2 > 0) {
            if (!e02.a()) {
                e02 = e02.l(size2 + size);
            }
            e02.addAll(e03);
        }
        if (size > 0) {
            e03 = e02;
        }
        B1.p(obj, j10, e03);
    }
}
