package xe;

/* loaded from: classes3.dex */
abstract class g {
    static void a(int[] iArr, int i10, int i11, int[] iArr2, int i12) {
        int[] iArr3 = new int[i12];
        int[] iArr4 = new int[16];
        int[] iArr5 = new int[16];
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            int i15 = iArr2[i14];
            iArr4[i15] = iArr4[i15] + 1;
        }
        iArr5[1] = 0;
        int i16 = 1;
        while (i16 < 15) {
            int i17 = i16 + 1;
            iArr5[i17] = iArr5[i16] + iArr4[i16];
            i16 = i17;
        }
        for (int i18 = 0; i18 < i12; i18++) {
            int i19 = iArr2[i18];
            if (i19 != 0) {
                int i20 = iArr5[i19];
                iArr5[i19] = i20 + 1;
                iArr3[i20] = i18;
            }
        }
        int i21 = 1 << i11;
        if (iArr5[15] == 1) {
            for (int i22 = 0; i22 < i21; i22++) {
                iArr[i10 + i22] = iArr3[0];
            }
            return;
        }
        int i23 = 2;
        int i24 = 2;
        int i25 = 0;
        int i26 = 1;
        while (i26 <= i11) {
            while (iArr4[i26] > 0) {
                d(iArr, i10 + i13, i24, i21, iArr3[i25] | (i26 << 16));
                i13 = b(i13, i26);
                iArr4[i26] = iArr4[i26] - 1;
                i25++;
            }
            i26++;
            i24 <<= 1;
        }
        int i27 = i21 - 1;
        int i28 = i11 + 1;
        int i29 = -1;
        int i30 = i10;
        while (i28 <= 15) {
            while (iArr4[i28] > 0) {
                int i31 = i13 & i27;
                if (i31 != i29) {
                    i30 += i21;
                    int c10 = c(iArr4, i28, i11);
                    iArr[i10 + i31] = ((c10 + i11) << 16) | ((i30 - i10) - i31);
                    i21 = 1 << c10;
                    i29 = i31;
                }
                d(iArr, (i13 >> i11) + i30, i23, i21, ((i28 - i11) << 16) | iArr3[i25]);
                i13 = b(i13, i28);
                iArr4[i28] = iArr4[i28] - 1;
                i25++;
            }
            i28++;
            i23 <<= 1;
        }
    }

    private static int b(int i10, int i11) {
        int i12 = 1 << (i11 - 1);
        while ((i10 & i12) != 0) {
            i12 >>= 1;
        }
        return (i10 & (i12 - 1)) + i12;
    }

    private static int c(int[] iArr, int i10, int i11) {
        int i12;
        int i13 = 1 << (i10 - i11);
        while (i10 < 15 && (i12 = i13 - iArr[i10]) > 0) {
            i10++;
            i13 = i12 << 1;
        }
        return i10 - i11;
    }

    private static void d(int[] iArr, int i10, int i11, int i12, int i13) {
        do {
            i12 -= i11;
            iArr[i10 + i12] = i13;
        } while (i12 > 0);
    }
}
