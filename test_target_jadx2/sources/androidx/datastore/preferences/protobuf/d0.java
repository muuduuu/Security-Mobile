package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
final class d0 implements N {

    /* renamed from: a, reason: collision with root package name */
    private final P f16343a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16344b;

    /* renamed from: c, reason: collision with root package name */
    private final Object[] f16345c;

    /* renamed from: d, reason: collision with root package name */
    private final int f16346d;

    d0(P p10, String str, Object[] objArr) {
        this.f16343a = p10;
        this.f16344b = str;
        this.f16345c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f16346d = charAt;
            return;
        }
        int i10 = charAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char charAt2 = str.charAt(i12);
            if (charAt2 < 55296) {
                this.f16346d = i10 | (charAt2 << i11);
                return;
            } else {
                i10 |= (charAt2 & 8191) << i11;
                i11 += 13;
                i12 = i13;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.N
    public boolean a() {
        return (this.f16346d & 2) == 2;
    }

    @Override // androidx.datastore.preferences.protobuf.N
    public P b() {
        return this.f16343a;
    }

    @Override // androidx.datastore.preferences.protobuf.N
    public a0 c() {
        int i10 = this.f16346d;
        return (i10 & 1) != 0 ? a0.PROTO2 : (i10 & 4) == 4 ? a0.EDITIONS : a0.PROTO3;
    }

    Object[] d() {
        return this.f16345c;
    }

    String e() {
        return this.f16344b;
    }
}
