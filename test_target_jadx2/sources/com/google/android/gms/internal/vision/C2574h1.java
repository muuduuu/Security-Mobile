package com.google.android.gms.internal.vision;

/* renamed from: com.google.android.gms.internal.vision.h1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2574h1 extends AbstractC2556c1 {
    private C2574h1() {
        super();
    }

    private static X0 e(Object obj, long j10) {
        return (X0) h2.F(obj, j10);
    }

    @Override // com.google.android.gms.internal.vision.AbstractC2556c1
    final void b(Object obj, Object obj2, long j10) {
        X0 e10 = e(obj, j10);
        X0 e11 = e(obj2, j10);
        int size = e10.size();
        int size2 = e11.size();
        if (size > 0 && size2 > 0) {
            if (!e10.zza()) {
                e10 = e10.b(size2 + size);
            }
            e10.addAll(e11);
        }
        if (size > 0) {
            e11 = e10;
        }
        h2.j(obj, j10, e11);
    }

    @Override // com.google.android.gms.internal.vision.AbstractC2556c1
    final void d(Object obj, long j10) {
        e(obj, j10).zzb();
    }
}
