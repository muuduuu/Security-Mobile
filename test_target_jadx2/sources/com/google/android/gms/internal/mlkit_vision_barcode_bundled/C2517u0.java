package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.u0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2517u0 extends AbstractC2527w0 {

    /* renamed from: a, reason: collision with root package name */
    private int f24955a = 0;

    /* renamed from: b, reason: collision with root package name */
    private final int f24956b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ E0 f24957c;

    C2517u0(E0 e02) {
        this.f24957c = e02;
        this.f24956b = e02.j();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f24955a < this.f24956b;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2537y0
    public final byte zza() {
        int i10 = this.f24955a;
        if (i10 >= this.f24956b) {
            throw new NoSuchElementException();
        }
        this.f24955a = i10 + 1;
        return this.f24957c.e(i10);
    }
}
