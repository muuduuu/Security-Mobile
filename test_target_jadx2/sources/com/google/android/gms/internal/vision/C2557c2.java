package com.google.android.gms.internal.vision;

/* renamed from: com.google.android.gms.internal.vision.c2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2557c2 extends AbstractC2549a2 {
    C2557c2() {
    }

    private static void m(Object obj, C2561d2 c2561d2) {
        ((N0) obj).zzb = c2561d2;
    }

    @Override // com.google.android.gms.internal.vision.AbstractC2549a2
    final /* synthetic */ Object a() {
        return C2561d2.g();
    }

    @Override // com.google.android.gms.internal.vision.AbstractC2549a2
    final /* synthetic */ void b(Object obj, int i10, long j10) {
        ((C2561d2) obj).c(i10 << 3, Long.valueOf(j10));
    }

    @Override // com.google.android.gms.internal.vision.AbstractC2549a2
    final /* synthetic */ void c(Object obj, int i10, AbstractC2570g0 abstractC2570g0) {
        ((C2561d2) obj).c((i10 << 3) | 2, abstractC2570g0);
    }

    @Override // com.google.android.gms.internal.vision.AbstractC2549a2
    final /* synthetic */ void d(Object obj, y2 y2Var) {
        ((C2561d2) obj).h(y2Var);
    }

    @Override // com.google.android.gms.internal.vision.AbstractC2549a2
    final /* bridge */ /* synthetic */ void e(Object obj, Object obj2) {
        m(obj, (C2561d2) obj2);
    }

    @Override // com.google.android.gms.internal.vision.AbstractC2549a2
    final /* synthetic */ Object f(Object obj) {
        return ((N0) obj).zzb;
    }

    @Override // com.google.android.gms.internal.vision.AbstractC2549a2
    final /* synthetic */ void g(Object obj, y2 y2Var) {
        ((C2561d2) obj).e(y2Var);
    }

    @Override // com.google.android.gms.internal.vision.AbstractC2549a2
    final /* synthetic */ void h(Object obj, Object obj2) {
        m(obj, (C2561d2) obj2);
    }

    @Override // com.google.android.gms.internal.vision.AbstractC2549a2
    final /* synthetic */ Object i(Object obj, Object obj2) {
        C2561d2 c2561d2 = (C2561d2) obj;
        C2561d2 c2561d22 = (C2561d2) obj2;
        return c2561d22.equals(C2561d2.a()) ? c2561d2 : C2561d2.b(c2561d2, c2561d22);
    }

    @Override // com.google.android.gms.internal.vision.AbstractC2549a2
    final void j(Object obj) {
        ((N0) obj).zzb.i();
    }

    @Override // com.google.android.gms.internal.vision.AbstractC2549a2
    final /* synthetic */ int k(Object obj) {
        return ((C2561d2) obj).j();
    }

    @Override // com.google.android.gms.internal.vision.AbstractC2549a2
    final /* synthetic */ int l(Object obj) {
        return ((C2561d2) obj).k();
    }
}
