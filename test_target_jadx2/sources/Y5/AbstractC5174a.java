package y5;

import java.util.Arrays;
import org.conscrypt.PSKKeyManager;

/* renamed from: y5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5174a {

    /* renamed from: a, reason: collision with root package name */
    protected static final char[] f45309a;

    /* renamed from: b, reason: collision with root package name */
    protected static final byte[] f45310b;

    /* renamed from: c, reason: collision with root package name */
    protected static final int[] f45311c;

    /* renamed from: d, reason: collision with root package name */
    protected static final int[] f45312d;

    /* renamed from: e, reason: collision with root package name */
    protected static final int[] f45313e;

    /* renamed from: f, reason: collision with root package name */
    protected static final int[] f45314f;

    /* renamed from: g, reason: collision with root package name */
    protected static final int[] f45315g;

    /* renamed from: h, reason: collision with root package name */
    protected static final int[] f45316h;

    /* renamed from: i, reason: collision with root package name */
    protected static final int[] f45317i;

    /* renamed from: j, reason: collision with root package name */
    protected static final int[] f45318j;

    /* renamed from: y5.a$a, reason: collision with other inner class name */
    private static class C0663a {

        /* renamed from: b, reason: collision with root package name */
        public static final C0663a f45319b = new C0663a();

        /* renamed from: a, reason: collision with root package name */
        private int[][] f45320a = new int[128][];

        private C0663a() {
        }

        public int[] a(int i10) {
            int[] iArr = this.f45320a[i10];
            if (iArr == null) {
                iArr = Arrays.copyOf(AbstractC5174a.f45317i, 128);
                if (iArr[i10] == 0) {
                    iArr[i10] = -1;
                }
                this.f45320a[i10] = iArr;
            }
            return iArr;
        }
    }

    static {
        char[] charArray = "0123456789ABCDEF".toCharArray();
        f45309a = charArray;
        int length = charArray.length;
        f45310b = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            f45310b[i10] = (byte) f45309a[i10];
        }
        int[] iArr = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        for (int i11 = 0; i11 < 32; i11++) {
            iArr[i11] = -1;
        }
        iArr[34] = 1;
        iArr[92] = 1;
        f45311c = iArr;
        int length2 = iArr.length;
        int[] iArr2 = new int[length2];
        System.arraycopy(iArr, 0, iArr2, 0, length2);
        for (int i12 = 128; i12 < 256; i12++) {
            iArr2[i12] = (i12 & 224) == 192 ? 2 : (i12 & 240) == 224 ? 3 : (i12 & 248) == 240 ? 4 : -1;
        }
        f45312d = iArr2;
        int[] iArr3 = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        Arrays.fill(iArr3, -1);
        for (int i13 = 33; i13 < 256; i13++) {
            if (Character.isJavaIdentifierPart((char) i13)) {
                iArr3[i13] = 0;
            }
        }
        iArr3[64] = 0;
        iArr3[35] = 0;
        iArr3[42] = 0;
        iArr3[45] = 0;
        iArr3[43] = 0;
        f45313e = iArr3;
        int[] iArr4 = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        System.arraycopy(iArr3, 0, iArr4, 0, PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        Arrays.fill(iArr4, 128, 128, 0);
        f45314f = iArr4;
        int[] iArr5 = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        int[] iArr6 = f45312d;
        System.arraycopy(iArr6, 128, iArr5, 128, 128);
        Arrays.fill(iArr5, 0, 32, -1);
        iArr5[9] = 0;
        iArr5[10] = 10;
        iArr5[13] = 13;
        iArr5[42] = 42;
        f45315g = iArr5;
        int[] iArr7 = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        System.arraycopy(iArr6, 128, iArr7, 128, 128);
        Arrays.fill(iArr7, 0, 32, -1);
        iArr7[32] = 1;
        iArr7[9] = 1;
        iArr7[10] = 10;
        iArr7[13] = 13;
        iArr7[47] = 47;
        iArr7[35] = 35;
        f45316h = iArr7;
        int[] iArr8 = new int[128];
        for (int i14 = 0; i14 < 32; i14++) {
            iArr8[i14] = -1;
        }
        iArr8[34] = 34;
        iArr8[92] = 92;
        iArr8[8] = 98;
        iArr8[9] = 116;
        iArr8[12] = 102;
        iArr8[10] = 110;
        iArr8[13] = 114;
        f45317i = iArr8;
        int[] iArr9 = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        f45318j = iArr9;
        Arrays.fill(iArr9, -1);
        for (int i15 = 0; i15 < 10; i15++) {
            f45318j[i15 + 48] = i15;
        }
        for (int i16 = 0; i16 < 6; i16++) {
            int[] iArr10 = f45318j;
            int i17 = i16 + 10;
            iArr10[i16 + 97] = i17;
            iArr10[i16 + 65] = i17;
        }
    }

    public static void a(StringBuilder sb2, String str) {
        int[] iArr = f45317i;
        int length = iArr.length;
        int length2 = str.length();
        for (int i10 = 0; i10 < length2; i10++) {
            char charAt = str.charAt(i10);
            if (charAt >= length || iArr[charAt] == 0) {
                sb2.append(charAt);
            } else {
                sb2.append('\\');
                int i11 = iArr[charAt];
                if (i11 < 0) {
                    sb2.append('u');
                    sb2.append('0');
                    sb2.append('0');
                    char[] cArr = f45309a;
                    sb2.append(cArr[charAt >> 4]);
                    sb2.append(cArr[charAt & 15]);
                } else {
                    sb2.append((char) i11);
                }
            }
        }
    }

    public static byte[] b() {
        return (byte[]) f45310b.clone();
    }

    public static char[] c() {
        return (char[]) f45309a.clone();
    }

    public static int[] d() {
        return f45317i;
    }

    public static int[] e(int i10) {
        return i10 == 34 ? f45317i : C0663a.f45319b.a(i10);
    }
}
