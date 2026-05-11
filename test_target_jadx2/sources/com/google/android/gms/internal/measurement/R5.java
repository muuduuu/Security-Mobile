package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
final class R5 implements E5 {

    /* renamed from: a, reason: collision with root package name */
    private final H5 f24351a;

    /* renamed from: b, reason: collision with root package name */
    private final String f24352b;

    /* renamed from: c, reason: collision with root package name */
    private final Object[] f24353c;

    /* renamed from: d, reason: collision with root package name */
    private final int f24354d;

    R5(H5 h52, String str, Object[] objArr) {
        this.f24351a = h52;
        this.f24352b = str;
        this.f24353c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f24354d = charAt;
            return;
        }
        int i10 = charAt & 8191;
        int i11 = 1;
        int i12 = 13;
        while (true) {
            int i13 = i11 + 1;
            char charAt2 = str.charAt(i11);
            if (charAt2 < 55296) {
                this.f24354d = i10 | (charAt2 << i12);
                return;
            } else {
                i10 |= (charAt2 & 8191) << i12;
                i12 += 13;
                i11 = i13;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.E5
    public final int a() {
        int i10 = this.f24354d;
        if ((i10 & 1) != 0) {
            return 1;
        }
        return (i10 & 4) == 4 ? 3 : 2;
    }

    final String b() {
        return this.f24352b;
    }

    final Object[] c() {
        return this.f24353c;
    }

    @Override // com.google.android.gms.internal.measurement.E5
    public final boolean zza() {
        return (this.f24354d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.measurement.E5
    public final H5 zzb() {
        return this.f24351a;
    }
}
