package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* loaded from: classes2.dex */
final class M2 extends L2 {
    M2() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (r13[r14] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0047, code lost:
    
        if (r13[r14] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0083, code lost:
    
        if (r13[r14] <= (-65)) goto L11;
     */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.L2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final int a(int i10, byte[] bArr, int i11, int i12) {
        int i13;
        int i14;
        int j10;
        int i15;
        int i16;
        if (i10 != 0) {
            if (i11 >= i12) {
                return i10;
            }
            byte b10 = (byte) i10;
            if (b10 < -32) {
                if (b10 >= -62) {
                    i14 = i11 + 1;
                }
                return -1;
            }
            if (b10 < -16) {
                byte b11 = (byte) (~(i10 >> 8));
                if (b11 == 0) {
                    int i17 = i11 + 1;
                    byte b12 = bArr[i11];
                    if (i17 >= i12) {
                        i16 = O2.i(b10, b12);
                        return i16;
                    }
                    i11 = i17;
                    b11 = b12;
                }
                if (b11 <= -65 && ((b10 != -32 || b11 >= -96) && (b10 != -19 || b11 < -96))) {
                    i14 = i11 + 1;
                }
                return -1;
            }
            byte b13 = (byte) (~(i10 >> 8));
            if (b13 == 0) {
                int i18 = i11 + 1;
                b13 = bArr[i11];
                if (i18 >= i12) {
                    i15 = O2.i(b10, b13);
                    return i15;
                }
                i11 = i18;
                i13 = 0;
            } else {
                i13 = i10 >> 16;
            }
            if (i13 == 0) {
                int i19 = i11 + 1;
                byte b14 = bArr[i11];
                if (i19 >= i12) {
                    j10 = O2.j(b10, b13, b14);
                    return j10;
                }
                i11 = i19;
                i13 = b14;
            }
            if (b13 <= -65 && (((b10 << 28) + (b13 + 112)) >> 30) == 0 && i13 <= -65) {
                i14 = i11 + 1;
            }
            return -1;
            i11 = i14;
        }
        while (i11 < i12 && bArr[i11] >= 0) {
            i11++;
        }
        if (i11 >= i12) {
            return 0;
        }
        while (i11 < i12) {
            int i20 = i11 + 1;
            byte b15 = bArr[i11];
            if (b15 < 0) {
                if (b15 < -32) {
                    if (i20 >= i12) {
                        return b15;
                    }
                    if (b15 >= -62) {
                        i11 += 2;
                        if (bArr[i20] > -65) {
                        }
                    }
                    return -1;
                }
                if (b15 >= -16) {
                    if (i20 >= i12 - 2) {
                        return O2.c(bArr, i20, i12);
                    }
                    int i21 = i11 + 2;
                    byte b16 = bArr[i20];
                    if (b16 <= -65 && (((b15 << 28) + (b16 + 112)) >> 30) == 0) {
                        int i22 = i11 + 3;
                        if (bArr[i21] <= -65) {
                            i11 += 4;
                            if (bArr[i22] > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i20 >= i12 - 1) {
                    return O2.c(bArr, i20, i12);
                }
                int i23 = i11 + 2;
                byte b17 = bArr[i20];
                if (b17 <= -65 && ((b15 != -32 || b17 >= -96) && (b15 != -19 || b17 < -96))) {
                    i11 += 3;
                    if (bArr[i23] > -65) {
                    }
                }
                return -1;
            }
            i11 = i20;
        }
        return 0;
    }
}
