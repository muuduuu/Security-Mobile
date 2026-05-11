package xe;

/* loaded from: classes3.dex */
final class i {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f45056a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f45057b;

    i() {
    }

    static void a(i iVar, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            int[] iArr = iVar.f45057b;
            byte[] bArr = iVar.f45056a;
            int i12 = i11 * 4;
            iArr[i11] = ((bArr[i12 + 3] & 255) << 24) | (bArr[i12] & 255) | ((bArr[i12 + 1] & 255) << 8) | ((bArr[i12 + 2] & 255) << 16);
        }
    }

    static void b(i iVar, byte[] bArr, int[] iArr) {
        iVar.f45056a = bArr;
        iVar.f45057b = iArr;
    }
}
