package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* loaded from: classes2.dex */
final class B2 extends AbstractC2539y2 {
    B2() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2539y2
    final /* synthetic */ int a(Object obj) {
        return ((C2544z2) obj).a();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2539y2
    final /* synthetic */ int b(Object obj) {
        return ((C2544z2) obj).b();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2539y2
    final /* bridge */ /* synthetic */ Object c(Object obj) {
        AbstractC2444f1 abstractC2444f1 = (AbstractC2444f1) obj;
        C2544z2 c2544z2 = abstractC2444f1.zzc;
        if (c2544z2 != C2544z2.c()) {
            return c2544z2;
        }
        C2544z2 f10 = C2544z2.f();
        abstractC2444f1.zzc = f10;
        return f10;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2539y2
    final /* synthetic */ Object d(Object obj) {
        return ((AbstractC2444f1) obj).zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2539y2
    final /* bridge */ /* synthetic */ Object e(Object obj, Object obj2) {
        if (C2544z2.c().equals(obj2)) {
            return obj;
        }
        if (C2544z2.c().equals(obj)) {
            return C2544z2.e((C2544z2) obj, (C2544z2) obj2);
        }
        ((C2544z2) obj).d((C2544z2) obj2);
        return obj;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2539y2
    final /* bridge */ /* synthetic */ void f(Object obj, int i10, long j10) {
        ((C2544z2) obj).j(i10 << 3, Long.valueOf(j10));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2539y2
    final void g(Object obj) {
        ((AbstractC2444f1) obj).zzc.h();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2539y2
    final /* synthetic */ void h(Object obj, Object obj2) {
        ((AbstractC2444f1) obj).zzc = (C2544z2) obj2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2539y2
    final /* synthetic */ void i(Object obj, R2 r22) {
        ((C2544z2) obj).k(r22);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2539y2
    final /* synthetic */ void j(Object obj, R2 r22) {
        ((C2544z2) obj).l(r22);
    }
}
