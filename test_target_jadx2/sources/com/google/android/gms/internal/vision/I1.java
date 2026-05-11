package com.google.android.gms.internal.vision;

/* loaded from: classes2.dex */
final class I1 implements InterfaceC2603r1 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2609t1 f25032a;

    /* renamed from: b, reason: collision with root package name */
    private final String f25033b;

    /* renamed from: c, reason: collision with root package name */
    private final Object[] f25034c;

    /* renamed from: d, reason: collision with root package name */
    private final int f25035d;

    I1(InterfaceC2609t1 interfaceC2609t1, String str, Object[] objArr) {
        this.f25032a = interfaceC2609t1;
        this.f25033b = str;
        this.f25034c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f25035d = charAt;
            return;
        }
        int i10 = charAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char charAt2 = str.charAt(i12);
            if (charAt2 < 55296) {
                this.f25035d = i10 | (charAt2 << i11);
                return;
            } else {
                i10 |= (charAt2 & 8191) << i11;
                i11 += 13;
                i12 = i13;
            }
        }
    }

    @Override // com.google.android.gms.internal.vision.InterfaceC2603r1
    public final InterfaceC2609t1 a() {
        return this.f25032a;
    }

    final String b() {
        return this.f25033b;
    }

    final Object[] c() {
        return this.f25034c;
    }

    @Override // com.google.android.gms.internal.vision.InterfaceC2603r1
    public final int zza() {
        return (this.f25035d & 1) == 1 ? G1.f25028a : G1.f25029b;
    }

    @Override // com.google.android.gms.internal.vision.InterfaceC2603r1
    public final boolean zzb() {
        return (this.f25035d & 2) == 2;
    }
}
