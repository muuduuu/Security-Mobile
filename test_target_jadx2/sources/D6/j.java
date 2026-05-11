package d6;

import e6.C3087a;

/* loaded from: classes2.dex */
class j extends e {

    /* renamed from: h, reason: collision with root package name */
    static final int f31271h = e.a("IHDR");

    /* renamed from: e, reason: collision with root package name */
    int f31272e;

    /* renamed from: f, reason: collision with root package name */
    int f31273f;

    /* renamed from: g, reason: collision with root package name */
    byte[] f31274g = new byte[5];

    j() {
    }

    @Override // d6.e
    void b(C3087a c3087a) {
        this.f31272e = c3087a.c();
        this.f31273f = c3087a.c();
        byte[] bArr = this.f31274g;
        c3087a.read(bArr, 0, bArr.length);
    }
}
