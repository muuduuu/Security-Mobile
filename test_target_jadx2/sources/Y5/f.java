package y5;

/* loaded from: classes2.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    private static int f45338a = 1000000;

    /* renamed from: b, reason: collision with root package name */
    private static int f45339b = 1000000000;

    /* renamed from: c, reason: collision with root package name */
    private static long f45340c = 1000000000;

    /* renamed from: d, reason: collision with root package name */
    private static long f45341d = -2147483648L;

    /* renamed from: e, reason: collision with root package name */
    private static long f45342e = 2147483647L;

    /* renamed from: f, reason: collision with root package name */
    static final String f45343f = String.valueOf(Integer.MIN_VALUE);

    /* renamed from: g, reason: collision with root package name */
    static final String f45344g = String.valueOf(Long.MIN_VALUE);

    /* renamed from: h, reason: collision with root package name */
    private static final int[] f45345h = new int[1000];

    /* renamed from: i, reason: collision with root package name */
    private static final String[] f45346i;

    /* renamed from: j, reason: collision with root package name */
    private static final String[] f45347j;

    static {
        int i10 = 0;
        for (int i11 = 0; i11 < 10; i11++) {
            for (int i12 = 0; i12 < 10; i12++) {
                int i13 = 0;
                while (i13 < 10) {
                    f45345h[i10] = ((i11 + 48) << 16) | ((i12 + 48) << 8) | (i13 + 48);
                    i13++;
                    i10++;
                }
            }
        }
        f45346i = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        f45347j = new String[]{"-1", "-2", "-3", "-4", "-5", "-6", "-7", "-8", "-9", "-10"};
    }

    private static int a(int i10, char[] cArr, int i11) {
        int i12 = f45345h[i10];
        cArr[i11] = (char) (i12 >> 16);
        int i13 = i11 + 2;
        cArr[i11 + 1] = (char) ((i12 >> 8) & 127);
        int i14 = i11 + 3;
        cArr[i13] = (char) (i12 & 127);
        return i14;
    }

    private static int b(int i10, char[] cArr, int i11) {
        int i12 = f45345h[i10];
        if (i10 > 9) {
            if (i10 > 99) {
                cArr[i11] = (char) (i12 >> 16);
                i11++;
            }
            cArr[i11] = (char) ((i12 >> 8) & 127);
            i11++;
        }
        int i13 = i11 + 1;
        cArr[i11] = (char) (i12 & 127);
        return i13;
    }

    private static int c(int i10, char[] cArr, int i11) {
        int i12 = i10 / 1000;
        int i13 = i10 - (i12 * 1000);
        int i14 = i12 / 1000;
        int[] iArr = f45345h;
        int i15 = iArr[i14];
        cArr[i11] = (char) (i15 >> 16);
        cArr[i11 + 1] = (char) ((i15 >> 8) & 127);
        cArr[i11 + 2] = (char) (i15 & 127);
        int i16 = iArr[i12 - (i14 * 1000)];
        cArr[i11 + 3] = (char) (i16 >> 16);
        cArr[i11 + 4] = (char) ((i16 >> 8) & 127);
        cArr[i11 + 5] = (char) (i16 & 127);
        int i17 = iArr[i13];
        cArr[i11 + 6] = (char) (i17 >> 16);
        int i18 = i11 + 8;
        cArr[i11 + 7] = (char) ((i17 >> 8) & 127);
        int i19 = i11 + 9;
        cArr[i18] = (char) (i17 & 127);
        return i19;
    }

    private static int d(char[] cArr, int i10) {
        String str = f45343f;
        int length = str.length();
        str.getChars(0, length, cArr, i10);
        return i10 + length;
    }

    private static int e(char[] cArr, int i10) {
        String str = f45344g;
        int length = str.length();
        str.getChars(0, length, cArr, i10);
        return i10 + length;
    }

    private static int f(int i10, char[] cArr, int i11) {
        if (i10 < f45338a) {
            if (i10 < 1000) {
                return b(i10, cArr, i11);
            }
            int i12 = i10 / 1000;
            return g(cArr, i11, i12, i10 - (i12 * 1000));
        }
        int i13 = i10 / 1000;
        int i14 = i10 - (i13 * 1000);
        int i15 = i13 / 1000;
        int i16 = i13 - (i15 * 1000);
        int b10 = b(i15, cArr, i11);
        int[] iArr = f45345h;
        int i17 = iArr[i16];
        cArr[b10] = (char) (i17 >> 16);
        cArr[b10 + 1] = (char) ((i17 >> 8) & 127);
        cArr[b10 + 2] = (char) (i17 & 127);
        int i18 = iArr[i14];
        cArr[b10 + 3] = (char) (i18 >> 16);
        int i19 = b10 + 5;
        cArr[b10 + 4] = (char) ((i18 >> 8) & 127);
        int i20 = b10 + 6;
        cArr[i19] = (char) (i18 & 127);
        return i20;
    }

    private static int g(char[] cArr, int i10, int i11, int i12) {
        int[] iArr = f45345h;
        int i13 = iArr[i11];
        if (i11 > 9) {
            if (i11 > 99) {
                cArr[i10] = (char) (i13 >> 16);
                i10++;
            }
            cArr[i10] = (char) ((i13 >> 8) & 127);
            i10++;
        }
        cArr[i10] = (char) (i13 & 127);
        int i14 = iArr[i12];
        cArr[i10 + 1] = (char) (i14 >> 16);
        int i15 = i10 + 3;
        cArr[i10 + 2] = (char) ((i14 >> 8) & 127);
        int i16 = i10 + 4;
        cArr[i15] = (char) (i14 & 127);
        return i16;
    }

    public static boolean h(double d10) {
        return Double.isNaN(d10) || Double.isInfinite(d10);
    }

    public static boolean i(float f10) {
        return Float.isNaN(f10) || Float.isInfinite(f10);
    }

    public static int j(int i10, char[] cArr, int i11) {
        int i12;
        if (i10 < 0) {
            if (i10 == Integer.MIN_VALUE) {
                return d(cArr, i11);
            }
            cArr[i11] = '-';
            i10 = -i10;
            i11++;
        }
        if (i10 < f45338a) {
            if (i10 >= 1000) {
                int i13 = i10 / 1000;
                return a(i10 - (i13 * 1000), cArr, b(i13, cArr, i11));
            }
            if (i10 >= 10) {
                return b(i10, cArr, i11);
            }
            cArr[i11] = (char) (i10 + 48);
            return i11 + 1;
        }
        int i14 = f45339b;
        if (i10 < i14) {
            int i15 = i10 / 1000;
            int i16 = i15 / 1000;
            return a(i10 - (i15 * 1000), cArr, a(i15 - (i16 * 1000), cArr, b(i16, cArr, i11)));
        }
        int i17 = i10 - i14;
        if (i17 >= i14) {
            i17 -= i14;
            i12 = i11 + 1;
            cArr[i11] = '2';
        } else {
            i12 = i11 + 1;
            cArr[i11] = '1';
        }
        return c(i17, cArr, i12);
    }

    public static int k(long j10, char[] cArr, int i10) {
        int c10;
        if (j10 < 0) {
            if (j10 > f45341d) {
                return j((int) j10, cArr, i10);
            }
            if (j10 == Long.MIN_VALUE) {
                return e(cArr, i10);
            }
            cArr[i10] = '-';
            j10 = -j10;
            i10++;
        } else if (j10 <= f45342e) {
            return j((int) j10, cArr, i10);
        }
        long j11 = f45340c;
        long j12 = j10 / j11;
        long j13 = j10 - (j12 * j11);
        if (j12 < j11) {
            c10 = f((int) j12, cArr, i10);
        } else {
            long j14 = j12 / j11;
            int b10 = b((int) j14, cArr, i10);
            c10 = c((int) (j12 - (j11 * j14)), cArr, b10);
        }
        return c((int) j13, cArr, c10);
    }
}
