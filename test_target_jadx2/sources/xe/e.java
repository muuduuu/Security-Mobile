package xe;

import org.conscrypt.PSKKeyManager;

/* loaded from: classes3.dex */
abstract class e {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f45046a = {1, 2, 3, 4, 0, 5, 17, 6, 16, 7, 8, 9, 10, 11, 12, 13, 14, 15};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f45047b = {3, 2, 1, 0, 3, 3, 3, 3, 3, 3, 2, 2, 2, 2, 2, 2};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f45048c = {0, 0, 0, 0, -1, 1, -2, 2, -3, 3, -1, 1, -2, 2, -3, 3};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f45049d = {131072, 131076, 131075, 196610, 131072, 131076, 131075, 262145, 131072, 131076, 131075, 196610, 131072, 131076, 131075, 262149};

    private static void a(k kVar) {
        a aVar = kVar.f45094c;
        byte[] bArr = kVar.f45095d;
        int i10 = kVar.f45098g;
        if (i10 <= 0) {
            a.k(aVar);
            kVar.f45092a = 1;
            return;
        }
        int min = Math.min(kVar.f45082Q - kVar.f45109r, i10);
        a.c(aVar, bArr, kVar.f45109r, min);
        kVar.f45098g -= min;
        int i11 = kVar.f45109r + min;
        kVar.f45109r = i11;
        int i12 = kVar.f45082Q;
        if (i11 != i12) {
            a.k(aVar);
            kVar.f45092a = 1;
        } else {
            kVar.f45093b = 5;
            kVar.f45090Y = i12;
            kVar.f45089X = 0;
            kVar.f45092a = 12;
        }
    }

    private static void b(k kVar, int i10) {
        a aVar = kVar.f45094c;
        int[] iArr = kVar.f45107p;
        int i11 = i10 * 2;
        a.d(aVar);
        int i12 = i10 * 1080;
        int r10 = r(kVar.f45096e, i12, aVar);
        kVar.f45105n[i10] = m(kVar.f45097f, i12, aVar);
        int i13 = r10 == 1 ? iArr[i11 + 1] + 1 : r10 == 0 ? iArr[i11] : r10 - 2;
        int i14 = kVar.f45106o[i10];
        if (i13 >= i14) {
            i13 -= i14;
        }
        int i15 = i11 + 1;
        iArr[i11] = iArr[i15];
        iArr[i15] = i13;
    }

    private static void c(k kVar) {
        b(kVar, 1);
        kVar.f45071F = kVar.f45103l.f45055c[kVar.f45107p[3]];
    }

    private static int d(int i10, byte[] bArr, a aVar) {
        a.j(aVar);
        int h10 = h(aVar) + 1;
        if (h10 == 1) {
            m.a(bArr, 0, i10);
            return h10;
        }
        int i11 = a.i(aVar, 1) == 1 ? a.i(aVar, 4) + 1 : 0;
        int[] iArr = new int[1080];
        n(h10 + i11, iArr, 0, aVar);
        int i12 = 0;
        while (i12 < i10) {
            a.j(aVar);
            a.d(aVar);
            int r10 = r(iArr, 0, aVar);
            if (r10 == 0) {
                bArr[i12] = 0;
            } else if (r10 <= i11) {
                for (int i13 = (1 << r10) + a.i(aVar, r10); i13 != 0; i13--) {
                    if (i12 >= i10) {
                        throw new c("Corrupted context map");
                    }
                    bArr[i12] = 0;
                    i12++;
                }
            } else {
                bArr[i12] = (byte) (r10 - i11);
            }
            i12++;
        }
        if (a.i(aVar, 1) == 1) {
            j(bArr, i10);
        }
        return h10;
    }

    private static void e(k kVar) {
        b(kVar, 2);
        kVar.f45068C = kVar.f45107p[5] << 2;
    }

    private static void f(k kVar) {
        b(kVar, 0);
        int i10 = kVar.f45107p[1];
        int i11 = i10 << 6;
        kVar.f45067B = i11;
        int i12 = kVar.f45066A[i11] & 255;
        kVar.f45113v = i12;
        kVar.f45114w = kVar.f45102k.f45055c[i12];
        byte b10 = kVar.f45117z[i10];
        int[] iArr = d.f45045b;
        kVar.f45069D = iArr[b10];
        kVar.f45070E = iArr[b10 + 1];
    }

    private static void g(a aVar, k kVar) {
        boolean z10 = a.i(aVar, 1) == 1;
        kVar.f45099h = z10;
        kVar.f45098g = 0;
        kVar.f45100i = false;
        kVar.f45101j = false;
        if (!z10 || a.i(aVar, 1) == 0) {
            int i10 = a.i(aVar, 2) + 4;
            if (i10 == 7) {
                kVar.f45101j = true;
                if (a.i(aVar, 1) != 0) {
                    throw new c("Corrupted reserved bit");
                }
                int i11 = a.i(aVar, 2);
                if (i11 == 0) {
                    return;
                }
                for (int i12 = 0; i12 < i11; i12++) {
                    int i13 = a.i(aVar, 8);
                    if (i13 == 0 && i12 + 1 == i11 && i11 > 1) {
                        throw new c("Exuberant nibble");
                    }
                    kVar.f45098g = (i13 << (i12 * 8)) | kVar.f45098g;
                }
            } else {
                for (int i14 = 0; i14 < i10; i14++) {
                    int i15 = a.i(aVar, 4);
                    if (i15 == 0 && i14 + 1 == i10 && i10 > 4) {
                        throw new c("Exuberant nibble");
                    }
                    kVar.f45098g = (i15 << (i14 * 4)) | kVar.f45098g;
                }
            }
            kVar.f45098g++;
            if (kVar.f45099h) {
                return;
            }
            kVar.f45100i = a.i(aVar, 1) == 1;
        }
    }

    private static int h(a aVar) {
        if (a.i(aVar, 1) == 0) {
            return 0;
        }
        int i10 = a.i(aVar, 3);
        if (i10 == 0) {
            return 1;
        }
        return a.i(aVar, i10) + (1 << i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:184:0x00a6, code lost:
    
        throw new xe.c("Invalid backward reference");
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0307 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0013 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02d6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0013 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013b A[LOOP:2: B:55:0x013b->B:136:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01f5 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void i(k kVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = kVar.f45092a;
        if (i16 == 0) {
            throw new IllegalStateException("Can't decompress until initialized");
        }
        if (i16 == 11) {
            throw new IllegalStateException("Can't decompress after close");
        }
        a aVar = kVar.f45094c;
        int i17 = kVar.f45082Q - 1;
        byte[] bArr = kVar.f45095d;
        while (true) {
            int i18 = kVar.f45092a;
            if (i18 == 10) {
                if (i18 == 10) {
                    if (kVar.f45098g < 0) {
                        throw new c("Invalid metablock length");
                    }
                    a.g(aVar);
                    a.a(kVar.f45094c, true);
                    return;
                }
                return;
            }
            if (i18 != 12) {
                int i19 = 0;
                switch (i18) {
                    case 1:
                        if (kVar.f45098g < 0) {
                            throw new c("Invalid metablock length");
                        }
                        q(kVar);
                        i17 = kVar.f45082Q - 1;
                        bArr = kVar.f45095d;
                        break;
                    case 2:
                        p(kVar);
                        kVar.f45092a = 3;
                        if (kVar.f45098g > 0) {
                            kVar.f45092a = 1;
                            break;
                        } else {
                            a.j(aVar);
                            if (kVar.f45105n[1] == 0) {
                                c(kVar);
                            }
                            int[] iArr = kVar.f45105n;
                            iArr[1] = iArr[1] - 1;
                            a.d(aVar);
                            int r10 = r(kVar.f45103l.f45054b, kVar.f45071F, aVar);
                            int i20 = r10 >>> 6;
                            kVar.f45072G = 0;
                            if (i20 >= 2) {
                                i20 -= 2;
                                kVar.f45072G = -1;
                            }
                            int i21 = j.f45064g[i20] + ((r10 >>> 3) & 7);
                            int i22 = j.f45065h[i20] + (r10 & 7);
                            kVar.f45116y = j.f45060c[i21] + a.i(aVar, j.f45061d[i21]);
                            kVar.f45078M = j.f45062e[i22] + a.i(aVar, j.f45063f[i22]);
                            kVar.f45115x = 0;
                            kVar.f45092a = 6;
                            if (kVar.f45112u) {
                                int i23 = kVar.f45109r;
                                int i24 = bArr[(i23 - 1) & i17] & 255;
                                int i25 = bArr[(i23 - 2) & i17] & 255;
                                while (true) {
                                    if (kVar.f45115x < kVar.f45116y) {
                                        a.j(aVar);
                                        if (kVar.f45105n[0] == 0) {
                                            f(kVar);
                                        }
                                        byte[] bArr2 = kVar.f45066A;
                                        int i26 = kVar.f45067B;
                                        int[] iArr2 = d.f45044a;
                                        int i27 = bArr2[i26 + (iArr2[kVar.f45070E + i25] | iArr2[kVar.f45069D + i24])] & 255;
                                        int[] iArr3 = kVar.f45105n;
                                        iArr3[0] = iArr3[0] - 1;
                                        a.d(aVar);
                                        h hVar = kVar.f45102k;
                                        int r11 = r(hVar.f45054b, hVar.f45055c[i27], aVar);
                                        int i28 = kVar.f45109r;
                                        bArr[i28] = (byte) r11;
                                        kVar.f45115x++;
                                        kVar.f45109r = i28 + 1;
                                        if (i28 == i17) {
                                            kVar.f45093b = 6;
                                            kVar.f45090Y = kVar.f45082Q;
                                            kVar.f45089X = 0;
                                            kVar.f45092a = 12;
                                        } else {
                                            int i29 = i24;
                                            i24 = r11;
                                            i25 = i29;
                                        }
                                    }
                                }
                            } else {
                                while (true) {
                                    if (kVar.f45115x < kVar.f45116y) {
                                        a.j(aVar);
                                        if (kVar.f45105n[0] == 0) {
                                            f(kVar);
                                        }
                                        int[] iArr4 = kVar.f45105n;
                                        iArr4[0] = iArr4[0] - 1;
                                        a.d(aVar);
                                        bArr[kVar.f45109r] = (byte) r(kVar.f45102k.f45054b, kVar.f45114w, aVar);
                                        kVar.f45115x++;
                                        int i30 = kVar.f45109r;
                                        kVar.f45109r = i30 + 1;
                                        if (i30 == i17) {
                                            kVar.f45093b = 6;
                                            kVar.f45090Y = kVar.f45082Q;
                                            kVar.f45089X = 0;
                                            kVar.f45092a = 12;
                                        }
                                    }
                                }
                            }
                            if (kVar.f45092a == 6) {
                                continue;
                            } else {
                                int i31 = kVar.f45098g - kVar.f45116y;
                                kVar.f45098g = i31;
                                if (i31 <= 0) {
                                    kVar.f45092a = 3;
                                    break;
                                } else {
                                    if (kVar.f45072G < 0) {
                                        a.j(aVar);
                                        if (kVar.f45105n[2] == 0) {
                                            e(kVar);
                                        }
                                        int[] iArr5 = kVar.f45105n;
                                        iArr5[2] = iArr5[2] - 1;
                                        a.d(aVar);
                                        h hVar2 = kVar.f45104m;
                                        int[] iArr6 = hVar2.f45054b;
                                        int[] iArr7 = hVar2.f45055c;
                                        byte[] bArr3 = kVar.f45073H;
                                        int i32 = kVar.f45068C;
                                        int i33 = kVar.f45078M;
                                        int r12 = r(iArr6, iArr7[bArr3[i32 + (i33 > 4 ? 3 : i33 - 2)] & 255], aVar);
                                        kVar.f45072G = r12;
                                        int i34 = kVar.f45074I;
                                        if (r12 >= i34) {
                                            int i35 = r12 - i34;
                                            int i36 = kVar.f45075J & i35;
                                            int i37 = i35 >>> kVar.f45076K;
                                            kVar.f45072G = i37;
                                            int i38 = (i37 >>> 1) + 1;
                                            kVar.f45072G = i34 + i36 + ((((((i37 & 1) + 2) << i38) - 4) + a.i(aVar, i38)) << kVar.f45076K);
                                        }
                                    }
                                    int t10 = t(kVar.f45072G, kVar.f45108q, kVar.f45111t);
                                    kVar.f45077L = t10;
                                    if (t10 < 0) {
                                        throw new c("Negative distance");
                                    }
                                    int i39 = kVar.f45110s;
                                    int i40 = kVar.f45080O;
                                    if (i39 == i40 || (i15 = kVar.f45109r) >= i40) {
                                        kVar.f45110s = i40;
                                    } else {
                                        kVar.f45110s = i15;
                                    }
                                    kVar.f45079N = kVar.f45109r;
                                    if (t10 > kVar.f45110s) {
                                        kVar.f45092a = 9;
                                        break;
                                    } else {
                                        if (kVar.f45072G > 0) {
                                            int[] iArr8 = kVar.f45108q;
                                            int i41 = kVar.f45111t;
                                            iArr8[i41 & 3] = t10;
                                            kVar.f45111t = i41 + 1;
                                        }
                                        if (kVar.f45078M > kVar.f45098g) {
                                            throw new c("Invalid backward reference");
                                        }
                                        kVar.f45115x = 0;
                                        kVar.f45092a = 7;
                                        int i42 = kVar.f45109r;
                                        i10 = (i42 - kVar.f45077L) & i17;
                                        i11 = kVar.f45078M - kVar.f45115x;
                                        if (i10 + i11 < i17 || i42 + i11 >= i17) {
                                            do {
                                                i12 = kVar.f45115x;
                                                if (i12 >= kVar.f45078M) {
                                                    i13 = kVar.f45109r;
                                                    bArr[i13] = bArr[(i13 - kVar.f45077L) & i17];
                                                    kVar.f45098g--;
                                                    kVar.f45115x = i12 + 1;
                                                    kVar.f45109r = i13 + 1;
                                                }
                                            } while (i13 != i17);
                                            i14 = 7;
                                            kVar.f45093b = 7;
                                            kVar.f45090Y = kVar.f45082Q;
                                            kVar.f45089X = 0;
                                            kVar.f45092a = 12;
                                            if (kVar.f45092a != i14) {
                                                break;
                                            } else {
                                                kVar.f45092a = 3;
                                                break;
                                            }
                                        } else {
                                            while (i19 < i11) {
                                                bArr[i42] = bArr[i10];
                                                i19++;
                                                i42++;
                                                i10++;
                                            }
                                            kVar.f45115x += i11;
                                            kVar.f45098g -= i11;
                                            kVar.f45109r += i11;
                                        }
                                        i14 = 7;
                                        if (kVar.f45092a != i14) {
                                        }
                                    }
                                }
                            }
                        }
                        break;
                    case 3:
                        if (kVar.f45098g > 0) {
                        }
                        break;
                    case 4:
                        while (kVar.f45098g > 0) {
                            a.j(aVar);
                            a.i(aVar, 8);
                            kVar.f45098g--;
                        }
                        kVar.f45092a = 1;
                        break;
                    case 5:
                        a(kVar);
                        break;
                    case 6:
                        if (kVar.f45112u) {
                        }
                        if (kVar.f45092a == 6) {
                        }
                        break;
                    case 7:
                        int i422 = kVar.f45109r;
                        i10 = (i422 - kVar.f45077L) & i17;
                        i11 = kVar.f45078M - kVar.f45115x;
                        if (i10 + i11 < i17) {
                            break;
                        }
                        do {
                            i12 = kVar.f45115x;
                            if (i12 >= kVar.f45078M) {
                            }
                        } while (i13 != i17);
                        i14 = 7;
                        kVar.f45093b = 7;
                        kVar.f45090Y = kVar.f45082Q;
                        kVar.f45089X = 0;
                        kVar.f45092a = 12;
                        if (kVar.f45092a != i14) {
                        }
                        break;
                    case 8:
                        int i43 = kVar.f45082Q;
                        System.arraycopy(bArr, i43, bArr, 0, kVar.f45079N - i43);
                        kVar.f45092a = 3;
                        break;
                    case 9:
                        int i44 = kVar.f45078M;
                        if (i44 >= 4 && i44 <= 24) {
                            int i45 = f.f45050a[i44];
                            int i46 = (kVar.f45077L - kVar.f45110s) - 1;
                            int i47 = f.f45051b[i44];
                            int i48 = ((1 << i47) - 1) & i46;
                            int i49 = i46 >>> i47;
                            int i50 = i45 + (i48 * i44);
                            l[] lVarArr = l.f45118d;
                            if (i49 >= lVarArr.length) {
                                throw new c("Invalid backward reference");
                            }
                            int b10 = l.b(bArr, kVar.f45079N, f.a(), i50, kVar.f45078M, lVarArr[i49]);
                            int i51 = kVar.f45079N + b10;
                            kVar.f45079N = i51;
                            kVar.f45109r += b10;
                            kVar.f45098g -= b10;
                            int i52 = kVar.f45082Q;
                            if (i51 < i52) {
                                kVar.f45092a = 3;
                                break;
                            } else {
                                kVar.f45093b = 8;
                                kVar.f45090Y = i52;
                                kVar.f45089X = 0;
                                kVar.f45092a = 12;
                                break;
                            }
                        }
                        break;
                    default:
                        throw new c("Unexpected state " + kVar.f45092a);
                }
            } else {
                if (!u(kVar)) {
                    return;
                }
                int i53 = kVar.f45109r;
                int i54 = kVar.f45080O;
                if (i53 >= i54) {
                    kVar.f45110s = i54;
                }
                kVar.f45109r = i53 & i17;
                kVar.f45092a = kVar.f45093b;
            }
        }
    }

    private static void j(byte[] bArr, int i10) {
        int[] iArr = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        for (int i11 = 0; i11 < 256; i11++) {
            iArr[i11] = i11;
        }
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = bArr[i12] & 255;
            bArr[i12] = (byte) iArr[i13];
            if (i13 != 0) {
                l(iArr, i13);
            }
        }
    }

    private static void k(k kVar) {
        int i10;
        int i11 = kVar.f45081P;
        long j10 = i11;
        long j11 = kVar.f45083R;
        if (j10 > j11) {
            while (true) {
                int i12 = i11 >> 1;
                if (i12 <= ((int) j11) + kVar.f45084S.length) {
                    break;
                } else {
                    i11 = i12;
                }
            }
            if (!kVar.f45099h && i11 < 16384 && kVar.f45081P >= 16384) {
                i11 = 16384;
            }
        }
        int i13 = kVar.f45082Q;
        if (i11 <= i13) {
            return;
        }
        byte[] bArr = new byte[i11 + 37];
        byte[] bArr2 = kVar.f45095d;
        if (bArr2 != null) {
            System.arraycopy(bArr2, 0, bArr, 0, i13);
        } else {
            byte[] bArr3 = kVar.f45084S;
            if (bArr3.length != 0) {
                int length = bArr3.length;
                int i14 = kVar.f45080O;
                if (length > i14) {
                    i10 = length - i14;
                } else {
                    i14 = length;
                    i10 = 0;
                }
                System.arraycopy(bArr3, i10, bArr, 0, i14);
                kVar.f45109r = i14;
                kVar.f45085T = i14;
            }
        }
        kVar.f45095d = bArr;
        kVar.f45082Q = i11;
    }

    private static void l(int[] iArr, int i10) {
        int i11 = iArr[i10];
        while (i10 > 0) {
            iArr[i10] = iArr[i10 - 1];
            i10--;
        }
        iArr[0] = i11;
    }

    private static int m(int[] iArr, int i10, a aVar) {
        a.d(aVar);
        int r10 = r(iArr, i10, aVar);
        return j.f45058a[r10] + a.i(aVar, j.f45059b[r10]);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void n(int i10, int[] iArr, int i11, a aVar) {
        int i12;
        int i13;
        int i14;
        a.j(aVar);
        int[] iArr2 = new int[i10];
        int i15 = a.i(aVar, 2);
        boolean z10 = true;
        if (i15 == 1) {
            int i16 = i10 - 1;
            int[] iArr3 = new int[4];
            int i17 = a.i(aVar, 2) + 1;
            int i18 = 0;
            while (i16 != 0) {
                i16 >>= 1;
                i18++;
            }
            for (int i19 = 0; i19 < i17; i19++) {
                int i20 = a.i(aVar, i18) % i10;
                iArr3[i19] = i20;
                iArr2[i20] = 2;
            }
            iArr2[iArr3[0]] = 1;
            if (i17 != 1) {
                if (i17 == 2) {
                    int i21 = iArr3[0];
                    int i22 = iArr3[1];
                    r5 = i21 != i22;
                    iArr2[i22] = 1;
                } else if (i17 != 3) {
                    int i23 = iArr3[0];
                    int i24 = iArr3[1];
                    boolean z11 = (i23 == i24 || i23 == (i13 = iArr3[2]) || i23 == (i14 = iArr3[3]) || i24 == i13 || i24 == i14 || i13 == i14) ? false : true;
                    if (a.i(aVar, 1) == 1) {
                        iArr2[iArr3[2]] = 3;
                        iArr2[iArr3[3]] = 3;
                    } else {
                        iArr2[iArr3[0]] = 2;
                    }
                    z10 = z11;
                } else {
                    int i25 = iArr3[0];
                    int i26 = iArr3[1];
                    if (i25 != i26 && i25 != (i12 = iArr3[2]) && i26 != i12) {
                        r5 = true;
                    }
                }
            }
            if (z10) {
                throw new c("Can't readHuffmanCode");
            }
            g.a(iArr, i11, 8, iArr2, i10);
            return;
        }
        int[] iArr4 = new int[18];
        int i27 = 0;
        int i28 = 32;
        while (i15 < 18 && i28 > 0) {
            int i29 = f45046a[i15];
            a.d(aVar);
            long j10 = aVar.f45036f;
            int i30 = aVar.f45037g;
            int i31 = f45049d[((int) (j10 >>> i30)) & 15];
            aVar.f45037g = i30 + (i31 >> 16);
            int i32 = i31 & 65535;
            iArr4[i29] = i32;
            if (i32 != 0) {
                i28 -= 32 >> i32;
                i27++;
            }
            i15++;
        }
        r5 = i27 == 1 || i28 == 0;
        o(iArr4, i10, iArr2, aVar);
        z10 = r5;
        if (z10) {
        }
    }

    private static void o(int[] iArr, int i10, int[] iArr2, a aVar) {
        int[] iArr3 = new int[32];
        g.a(iArr3, 0, 5, iArr, 18);
        int i11 = 8;
        int i12 = 32768;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < i10 && i12 > 0) {
            a.j(aVar);
            a.d(aVar);
            long j10 = aVar.f45036f;
            int i16 = aVar.f45037g;
            int i17 = iArr3[((int) (j10 >>> i16)) & 31];
            aVar.f45037g = i16 + (i17 >> 16);
            int i18 = i17 & 65535;
            if (i18 < 16) {
                int i19 = i13 + 1;
                iArr2[i13] = i18;
                if (i18 != 0) {
                    i12 -= 32768 >> i18;
                    i13 = i19;
                    i11 = i18;
                } else {
                    i13 = i19;
                }
                i15 = 0;
            } else {
                int i20 = i18 - 14;
                int i21 = i18 == 16 ? i11 : 0;
                if (i14 != i21) {
                    i15 = 0;
                    i14 = i21;
                }
                int i22 = (i15 > 0 ? (i15 - 2) << i20 : i15) + a.i(aVar, i20) + 3;
                int i23 = i22 - i15;
                if (i13 + i23 > i10) {
                    throw new c("symbol + repeatDelta > numSymbols");
                }
                int i24 = 0;
                while (i24 < i23) {
                    iArr2[i13] = i14;
                    i24++;
                    i13++;
                }
                if (i14 != 0) {
                    i12 -= i23 << (15 - i14);
                }
                i15 = i22;
            }
        }
        if (i12 != 0) {
            throw new c("Unused space");
        }
        m.b(iArr2, i13, i10 - i13);
    }

    private static void p(k kVar) {
        int i10;
        int[] iArr;
        a aVar = kVar.f45094c;
        for (int i11 = 0; i11 < 3; i11++) {
            kVar.f45106o[i11] = h(aVar) + 1;
            kVar.f45105n[i11] = 268435456;
            int i12 = kVar.f45106o[i11];
            if (i12 > 1) {
                int i13 = i11 * 1080;
                n(i12 + 2, kVar.f45096e, i13, aVar);
                n(26, kVar.f45097f, i13, aVar);
                kVar.f45105n[i11] = m(kVar.f45097f, i13, aVar);
            }
        }
        a.j(aVar);
        kVar.f45076K = a.i(aVar, 2);
        int i14 = a.i(aVar, 4);
        int i15 = kVar.f45076K;
        int i16 = (i14 << i15) + 16;
        kVar.f45074I = i16;
        kVar.f45075J = (1 << i15) - 1;
        int i17 = i16 + (48 << i15);
        kVar.f45117z = new byte[kVar.f45106o[0]];
        int i18 = 0;
        while (true) {
            i10 = kVar.f45106o[0];
            if (i18 >= i10) {
                break;
            }
            int min = Math.min(i18 + 96, i10);
            while (i18 < min) {
                kVar.f45117z[i18] = (byte) (a.i(aVar, 2) << 1);
                i18++;
            }
            a.j(aVar);
        }
        byte[] bArr = new byte[i10 << 6];
        kVar.f45066A = bArr;
        int d10 = d(i10 << 6, bArr, aVar);
        kVar.f45112u = true;
        int i19 = 0;
        while (true) {
            iArr = kVar.f45106o;
            if (i19 >= (iArr[0] << 6)) {
                break;
            }
            if (kVar.f45066A[i19] != (i19 >> 6)) {
                kVar.f45112u = false;
                break;
            }
            i19++;
        }
        int i20 = iArr[2];
        byte[] bArr2 = new byte[i20 << 2];
        kVar.f45073H = bArr2;
        int d11 = d(i20 << 2, bArr2, aVar);
        h.b(kVar.f45102k, PSKKeyManager.MAX_KEY_LENGTH_BYTES, d10);
        h.b(kVar.f45103l, 704, kVar.f45106o[1]);
        h.b(kVar.f45104m, i17, d11);
        h.a(kVar.f45102k, aVar);
        h.a(kVar.f45103l, aVar);
        h.a(kVar.f45104m, aVar);
        kVar.f45067B = 0;
        kVar.f45068C = 0;
        int[] iArr2 = d.f45045b;
        byte b10 = kVar.f45117z[0];
        kVar.f45069D = iArr2[b10];
        kVar.f45070E = iArr2[b10 + 1];
        kVar.f45113v = 0;
        kVar.f45114w = kVar.f45102k.f45055c[0];
        kVar.f45071F = kVar.f45103l.f45055c[0];
        int[] iArr3 = kVar.f45107p;
        iArr3[4] = 1;
        iArr3[2] = 1;
        iArr3[0] = 1;
        iArr3[5] = 0;
        iArr3[3] = 0;
        iArr3[1] = 0;
    }

    private static void q(k kVar) {
        a aVar = kVar.f45094c;
        if (kVar.f45099h) {
            kVar.f45093b = 10;
            kVar.f45090Y = kVar.f45109r;
            kVar.f45089X = 0;
            kVar.f45092a = 12;
            return;
        }
        h hVar = kVar.f45102k;
        hVar.f45054b = null;
        hVar.f45055c = null;
        h hVar2 = kVar.f45103l;
        hVar2.f45054b = null;
        hVar2.f45055c = null;
        h hVar3 = kVar.f45104m;
        hVar3.f45054b = null;
        hVar3.f45055c = null;
        a.j(aVar);
        g(aVar, kVar);
        if (kVar.f45098g != 0 || kVar.f45101j) {
            if (kVar.f45100i || kVar.f45101j) {
                a.g(aVar);
                kVar.f45092a = kVar.f45101j ? 4 : 5;
            } else {
                kVar.f45092a = 2;
            }
            if (kVar.f45101j) {
                return;
            }
            kVar.f45083R += kVar.f45098g;
            if (kVar.f45082Q < kVar.f45081P) {
                k(kVar);
            }
        }
    }

    private static int r(int[] iArr, int i10, a aVar) {
        long j10 = aVar.f45036f;
        int i11 = aVar.f45037g;
        int i12 = (int) (j10 >>> i11);
        int i13 = i10 + (i12 & 255);
        int i14 = iArr[i13];
        int i15 = i14 >> 16;
        int i16 = i14 & 65535;
        if (i15 <= 8) {
            aVar.f45037g = i11 + i15;
            return i16;
        }
        int i17 = iArr[i13 + i16 + ((i12 & ((1 << i15) - 1)) >>> 8)];
        aVar.f45037g = i11 + (i17 >> 16) + 8;
        return i17 & 65535;
    }

    static void s(k kVar, byte[] bArr) {
        if (bArr == null) {
            bArr = new byte[0];
        }
        kVar.f45084S = bArr;
    }

    private static int t(int i10, int[] iArr, int i11) {
        return i10 < 16 ? iArr[(i11 + f45047b[i10]) & 3] + f45048c[i10] : i10 - 15;
    }

    private static boolean u(k kVar) {
        int i10 = kVar.f45085T;
        if (i10 != 0) {
            kVar.f45089X += i10;
            kVar.f45085T = 0;
        }
        int min = Math.min(kVar.f45087V - kVar.f45088W, kVar.f45090Y - kVar.f45089X);
        if (min != 0) {
            System.arraycopy(kVar.f45095d, kVar.f45089X, kVar.f45091Z, kVar.f45086U + kVar.f45088W, min);
            kVar.f45088W += min;
            kVar.f45089X += min;
        }
        return kVar.f45088W < kVar.f45087V;
    }
}
