package com.google.android.gms.internal.clearcut;

/* loaded from: classes2.dex */
final class Q0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f23933a;

    /* renamed from: b, reason: collision with root package name */
    private int f23934b = 0;

    Q0(String str) {
        this.f23933a = str;
    }

    final boolean a() {
        return this.f23934b < this.f23933a.length();
    }

    final int b() {
        String str = this.f23933a;
        int i10 = this.f23934b;
        this.f23934b = i10 + 1;
        char charAt = str.charAt(i10);
        if (charAt < 55296) {
            return charAt;
        }
        int i11 = charAt & 8191;
        int i12 = 13;
        while (true) {
            String str2 = this.f23933a;
            int i13 = this.f23934b;
            this.f23934b = i13 + 1;
            char charAt2 = str2.charAt(i13);
            if (charAt2 < 55296) {
                return i11 | (charAt2 << i12);
            }
            i11 |= (charAt2 & 8191) << i12;
            i12 += 13;
        }
    }
}
