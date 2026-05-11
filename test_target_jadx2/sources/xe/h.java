package xe;

/* loaded from: classes3.dex */
final class h {

    /* renamed from: a, reason: collision with root package name */
    private int f45053a;

    /* renamed from: b, reason: collision with root package name */
    int[] f45054b;

    /* renamed from: c, reason: collision with root package name */
    int[] f45055c;

    h() {
    }

    static void a(h hVar, a aVar) {
        int length = hVar.f45055c.length;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            hVar.f45055c[i11] = i10;
            e.n(hVar.f45053a, hVar.f45054b, i10, aVar);
            i10 += 1080;
        }
    }

    static void b(h hVar, int i10, int i11) {
        hVar.f45053a = i10;
        hVar.f45054b = new int[i11 * 1080];
        hVar.f45055c = new int[i11];
    }
}
