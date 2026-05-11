package com.google.android.gms.internal.clearcut;

/* renamed from: com.google.android.gms.internal.clearcut.a1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2110a1 extends Y0 {
    C2110a1() {
    }

    private static void m(Object obj, Z0 z02) {
        ((AbstractC2109a0) obj).zzjp = z02;
    }

    @Override // com.google.android.gms.internal.clearcut.Y0
    final /* synthetic */ void a(Object obj, int i10, long j10) {
        ((Z0) obj).e(i10 << 3, Long.valueOf(j10));
    }

    @Override // com.google.android.gms.internal.clearcut.Y0
    final /* synthetic */ void b(Object obj, int i10, AbstractC2179y abstractC2179y) {
        ((Z0) obj).e((i10 << 3) | 2, abstractC2179y);
    }

    @Override // com.google.android.gms.internal.clearcut.Y0
    final /* synthetic */ void c(Object obj, InterfaceC2166t1 interfaceC2166t1) {
        ((Z0) obj).g(interfaceC2166t1);
    }

    @Override // com.google.android.gms.internal.clearcut.Y0
    final void d(Object obj) {
        ((AbstractC2109a0) obj).zzjp.k();
    }

    @Override // com.google.android.gms.internal.clearcut.Y0
    final /* synthetic */ void e(Object obj, InterfaceC2166t1 interfaceC2166t1) {
        ((Z0) obj).b(interfaceC2166t1);
    }

    @Override // com.google.android.gms.internal.clearcut.Y0
    final /* synthetic */ Object f() {
        return Z0.i();
    }

    @Override // com.google.android.gms.internal.clearcut.Y0
    final /* synthetic */ void g(Object obj, Object obj2) {
        m(obj, (Z0) obj2);
    }

    @Override // com.google.android.gms.internal.clearcut.Y0
    final /* synthetic */ void h(Object obj, Object obj2) {
        m(obj, (Z0) obj2);
    }

    @Override // com.google.android.gms.internal.clearcut.Y0
    final /* synthetic */ Object i(Object obj, Object obj2) {
        Z0 z02 = (Z0) obj;
        Z0 z03 = (Z0) obj2;
        return z03.equals(Z0.h()) ? z02 : Z0.a(z02, z03);
    }

    @Override // com.google.android.gms.internal.clearcut.Y0
    final /* synthetic */ int j(Object obj) {
        return ((Z0) obj).d();
    }

    @Override // com.google.android.gms.internal.clearcut.Y0
    final /* synthetic */ Object k(Object obj) {
        return ((AbstractC2109a0) obj).zzjp;
    }

    @Override // com.google.android.gms.internal.clearcut.Y0
    final /* synthetic */ int l(Object obj) {
        return ((Z0) obj).j();
    }
}
