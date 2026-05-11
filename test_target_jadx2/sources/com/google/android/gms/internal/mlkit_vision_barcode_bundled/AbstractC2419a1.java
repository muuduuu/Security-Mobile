package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.a1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2419a1 extends Z0 implements Q1 {
    protected AbstractC2419a1(AbstractC2424b1 abstractC2424b1) {
        super(abstractC2424b1);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.Z0
    protected final void m() {
        super.m();
        if (((AbstractC2424b1) this.f24841b).zza != V0.d()) {
            AbstractC2424b1 abstractC2424b1 = (AbstractC2424b1) this.f24841b;
            abstractC2424b1.zza = abstractC2424b1.zza.clone();
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.Z0, com.google.android.gms.internal.mlkit_vision_barcode_bundled.O1
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final AbstractC2424b1 u() {
        if (!((AbstractC2424b1) this.f24841b).y()) {
            return (AbstractC2424b1) this.f24841b;
        }
        ((AbstractC2424b1) this.f24841b).zza.g();
        return (AbstractC2424b1) super.u();
    }
}
