package co.hyperverge.hvcamera.magicfilter.utils;

import co.hyperverge.hvcamera.HVLog;

/* loaded from: classes.dex */
public class Exif {
    private static final String TAG = "Exif";

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0075, code lost:
    
        co.hyperverge.hvcamera.HVLog.e(co.hyperverge.hvcamera.magicfilter.utils.Exif.TAG, "getOrientation: Invalid length");
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x007a, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int getOrientation(byte[] bArr) {
        int i10;
        int i11;
        HVLog.d(TAG, "getOrientation() called with: jpeg = [" + bArr + "]");
        if (bArr == null) {
            return 0;
        }
        int i12 = 0;
        while (true) {
            if (i12 + 3 >= bArr.length) {
                i10 = 0;
                break;
            }
            i11 = i12 + 1;
            if ((bArr[i12] & 255) != 255) {
                break;
            }
            int i13 = bArr[i11] & 255;
            if (i13 != 255) {
                i11 = i12 + 2;
                if (i13 != 216 && i13 != 1) {
                    if (i13 != 217 && i13 != 218) {
                        int pack = pack(bArr, i11, 2, false);
                        if (pack >= 2 && (i11 = i11 + pack) <= bArr.length) {
                            if (i13 == 225 && pack >= 8 && pack(bArr, i12 + 4, 4, false) == 1165519206 && pack(bArr, i12 + 8, 2, false) == 0) {
                                i12 += 10;
                                i10 = pack - 8;
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            i12 = i11;
        }
        i10 = 0;
        i12 = i11;
        if (i10 > 8) {
            int pack2 = pack(bArr, i12, 4, false);
            if (pack2 != 1229531648 && pack2 != 1296891946) {
                HVLog.e(TAG, "getOrientation: Invalid byte order");
                return 0;
            }
            boolean z10 = pack2 == 1229531648;
            int pack3 = pack(bArr, i12 + 4, 4, z10) + 2;
            if (pack3 >= 10 && pack3 <= i10) {
                int i14 = i12 + pack3;
                int i15 = i10 - pack3;
                int pack4 = pack(bArr, i14 - 2, 2, z10);
                while (true) {
                    int i16 = pack4 - 1;
                    if (pack4 <= 0 || i15 < 12) {
                        break;
                    }
                    if (pack(bArr, i14, 2, z10) == 274) {
                        int pack5 = pack(bArr, i14 + 8, 2, z10);
                        if (pack5 == 1) {
                            return 1;
                        }
                        int i17 = 3;
                        if (pack5 != 3) {
                            i17 = 6;
                            if (pack5 != 6) {
                                if (pack5 == 8) {
                                    return 8;
                                }
                                HVLog.d(TAG, "Unsupported orientation");
                                return 0;
                            }
                        }
                        return i17;
                    }
                    i14 += 12;
                    i15 -= 12;
                    pack4 = i16;
                }
            } else {
                HVLog.e(TAG, "getOrientation: Invalid offset");
                return 0;
            }
        }
        HVLog.d(TAG, "Orientation not found");
        return 0;
    }

    private static int pack(byte[] bArr, int i10, int i11, boolean z10) {
        int i12;
        HVLog.d(TAG, "pack() called with: bytes = [" + bArr + "], offset = [" + i10 + "], length = [" + i11 + "], littleEndian = [" + z10 + "]");
        if (z10) {
            i10 += i11 - 1;
            i12 = -1;
        } else {
            i12 = 1;
        }
        int i13 = 0;
        while (true) {
            int i14 = i11 - 1;
            if (i11 <= 0) {
                return i13;
            }
            i13 = (bArr[i10] & 255) | (i13 << 8);
            i10 += i12;
            i11 = i14;
        }
    }
}
