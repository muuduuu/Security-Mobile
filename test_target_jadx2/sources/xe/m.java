package xe;

/* loaded from: classes3.dex */
abstract class m {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f45122a = new byte[1024];

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f45123b = new int[1024];

    static void a(byte[] bArr, int i10, int i11) {
        int i12 = 0;
        while (i12 < i11) {
            int min = Math.min(i12 + 1024, i11) - i12;
            System.arraycopy(f45122a, 0, bArr, i10 + i12, min);
            i12 += min;
        }
    }

    static void b(int[] iArr, int i10, int i11) {
        int i12 = 0;
        while (i12 < i11) {
            int min = Math.min(i12 + 1024, i11) - i12;
            System.arraycopy(f45123b, 0, iArr, i10 + i12, min);
            i12 += min;
        }
    }
}
