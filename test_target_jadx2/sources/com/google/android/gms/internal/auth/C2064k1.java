package com.google.android.gms.internal.auth;

/* renamed from: com.google.android.gms.internal.auth.k1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2064k1 implements W0 {

    /* renamed from: a, reason: collision with root package name */
    private final Z0 f23723a;

    /* renamed from: b, reason: collision with root package name */
    private final String f23724b = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a";

    /* renamed from: c, reason: collision with root package name */
    private final Object[] f23725c;

    /* renamed from: d, reason: collision with root package name */
    private final int f23726d;

    C2064k1(Z0 z02, String str, Object[] objArr) {
        this.f23723a = z02;
        this.f23725c = objArr;
        char charAt = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(0);
        if (charAt < 55296) {
            this.f23726d = charAt;
            return;
        }
        int i10 = charAt & 8191;
        int i11 = 1;
        int i12 = 13;
        while (true) {
            int i13 = i11 + 1;
            char charAt2 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i11);
            if (charAt2 < 55296) {
                this.f23726d = (charAt2 << i12) | i10;
                return;
            } else {
                i10 |= (charAt2 & 8191) << i12;
                i12 += 13;
                i11 = i13;
            }
        }
    }

    @Override // com.google.android.gms.internal.auth.W0
    public final int a() {
        return (this.f23726d & 1) != 0 ? 1 : 2;
    }

    final String b() {
        return this.f23724b;
    }

    final Object[] c() {
        return this.f23725c;
    }

    @Override // com.google.android.gms.internal.auth.W0
    public final Z0 zza() {
        return this.f23723a;
    }

    @Override // com.google.android.gms.internal.auth.W0
    public final boolean zzb() {
        return (this.f23726d & 2) == 2;
    }
}
