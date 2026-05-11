package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* loaded from: classes2.dex */
final class Z1 implements M1 {

    /* renamed from: a, reason: collision with root package name */
    private final P1 f24842a;

    /* renamed from: b, reason: collision with root package name */
    private final String f24843b;

    /* renamed from: c, reason: collision with root package name */
    private final Object[] f24844c;

    /* renamed from: d, reason: collision with root package name */
    private final int f24845d;

    Z1(P1 p12, String str, Object[] objArr) {
        this.f24842a = p12;
        this.f24843b = str;
        this.f24844c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f24845d = charAt;
            return;
        }
        int i10 = charAt & 8191;
        int i11 = 1;
        int i12 = 13;
        while (true) {
            int i13 = i11 + 1;
            char charAt2 = str.charAt(i11);
            if (charAt2 < 55296) {
                this.f24845d = i10 | (charAt2 << i12);
                return;
            } else {
                i10 |= (charAt2 & 8191) << i12;
                i12 += 13;
                i11 = i13;
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.M1
    public final int a() {
        return (this.f24845d & 1) != 0 ? 1 : 2;
    }

    final String b() {
        return this.f24843b;
    }

    final Object[] c() {
        return this.f24844c;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.M1
    public final P1 zza() {
        return this.f24842a;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.M1
    public final boolean zzb() {
        return (this.f24845d & 2) == 2;
    }
}
