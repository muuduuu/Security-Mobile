package com.google.android.gms.internal.clearcut;

/* renamed from: com.google.android.gms.internal.clearcut.o0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2151o0 extends AbstractC2142l0 {
    private C2151o0() {
        super();
    }

    private static InterfaceC2124f0 e(Object obj, long j10) {
        return (InterfaceC2124f0) AbstractC2125f1.M(obj, j10);
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC2142l0
    final void a(Object obj, long j10) {
        e(obj, j10).q();
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC2142l0
    final void b(Object obj, Object obj2, long j10) {
        InterfaceC2124f0 e10 = e(obj, j10);
        InterfaceC2124f0 e11 = e(obj2, j10);
        int size = e10.size();
        int size2 = e11.size();
        if (size > 0 && size2 > 0) {
            if (!e10.H()) {
                e10 = e10.l1(size2 + size);
            }
            e10.addAll(e11);
        }
        if (size > 0) {
            e11 = e10;
        }
        AbstractC2125f1.i(obj, j10, e11);
    }
}
