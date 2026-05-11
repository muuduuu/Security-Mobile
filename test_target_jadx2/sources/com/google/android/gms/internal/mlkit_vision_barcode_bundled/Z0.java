package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* loaded from: classes2.dex */
public abstract class Z0 extends AbstractC2483n0 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC2444f1 f24840a;

    /* renamed from: b, reason: collision with root package name */
    protected AbstractC2444f1 f24841b;

    protected Z0(AbstractC2444f1 abstractC2444f1) {
        this.f24840a = abstractC2444f1;
        if (abstractC2444f1.y()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f24841b = abstractC2444f1.h();
    }

    private static void b(Object obj, Object obj2) {
        X1.a().b(obj.getClass()).i(obj, obj2);
    }

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Z0 clone() {
        Z0 z02 = (Z0) this.f24840a.F(5, null, null);
        z02.f24841b = u();
        return z02;
    }

    public final Z0 h(AbstractC2444f1 abstractC2444f1) {
        if (!this.f24840a.equals(abstractC2444f1)) {
            if (!this.f24841b.y()) {
                m();
            }
            b(this.f24841b, abstractC2444f1);
        }
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.O1
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final AbstractC2444f1 r() {
        AbstractC2444f1 u10 = u();
        if (u10.z()) {
            return u10;
        }
        throw new C2534x2(u10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.O1
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public AbstractC2444f1 u() {
        if (!this.f24841b.y()) {
            return this.f24841b;
        }
        this.f24841b.q();
        return this.f24841b;
    }

    protected final void l() {
        if (this.f24841b.y()) {
            return;
        }
        m();
    }

    protected void m() {
        AbstractC2444f1 h10 = this.f24840a.h();
        b(h10, this.f24841b);
        this.f24841b = h10;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.Q1
    public final boolean z() {
        return AbstractC2444f1.w(this.f24841b, false);
    }
}
