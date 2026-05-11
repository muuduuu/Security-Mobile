package com.google.protobuf;

/* loaded from: classes2.dex */
final class b0 implements L {

    /* renamed from: a, reason: collision with root package name */
    private final N f28712a;

    /* renamed from: b, reason: collision with root package name */
    private final String f28713b;

    /* renamed from: c, reason: collision with root package name */
    private final Object[] f28714c;

    /* renamed from: d, reason: collision with root package name */
    private final int f28715d;

    b0(N n10, String str, Object[] objArr) {
        this.f28712a = n10;
        this.f28713b = str;
        this.f28714c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f28715d = charAt;
            return;
        }
        int i10 = charAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char charAt2 = str.charAt(i12);
            if (charAt2 < 55296) {
                this.f28715d = i10 | (charAt2 << i11);
                return;
            } else {
                i10 |= (charAt2 & 8191) << i11;
                i11 += 13;
                i12 = i13;
            }
        }
    }

    @Override // com.google.protobuf.L
    public boolean a() {
        return (this.f28715d & 2) == 2;
    }

    @Override // com.google.protobuf.L
    public N b() {
        return this.f28712a;
    }

    @Override // com.google.protobuf.L
    public Y c() {
        return (this.f28715d & 1) == 1 ? Y.PROTO2 : Y.PROTO3;
    }

    Object[] d() {
        return this.f28714c;
    }

    String e() {
        return this.f28713b;
    }
}
