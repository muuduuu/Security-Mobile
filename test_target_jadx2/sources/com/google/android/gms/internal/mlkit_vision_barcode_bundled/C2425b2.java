package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.b2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2425b2 extends AbstractC2527w0 {

    /* renamed from: a, reason: collision with root package name */
    final C2445f2 f24847a;

    /* renamed from: b, reason: collision with root package name */
    InterfaceC2537y0 f24848b = a();

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C2455h2 f24849c;

    C2425b2(C2455h2 c2455h2) {
        this.f24849c = c2455h2;
        this.f24847a = new C2445f2(c2455h2, null);
    }

    private final InterfaceC2537y0 a() {
        C2445f2 c2445f2 = this.f24847a;
        if (c2445f2.hasNext()) {
            return c2445f2.next().iterator();
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f24848b != null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2537y0
    public final byte zza() {
        InterfaceC2537y0 interfaceC2537y0 = this.f24848b;
        if (interfaceC2537y0 == null) {
            throw new NoSuchElementException();
        }
        byte zza = interfaceC2537y0.zza();
        if (!this.f24848b.hasNext()) {
            this.f24848b = a();
        }
        return zza;
    }
}
