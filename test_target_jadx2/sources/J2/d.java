package J2;

/* loaded from: classes.dex */
class d {

    /* renamed from: b, reason: collision with root package name */
    private static final float[] f4469b = {1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f, 1.0E11f, 1.0E12f, 1.0E13f, 1.0E14f, 1.0E15f, 1.0E16f, 1.0E17f, 1.0E18f, 1.0E19f, 1.0E20f, 1.0E21f, 1.0E22f, 1.0E23f, 1.0E24f, 1.0E25f, 1.0E26f, 1.0E27f, 1.0E28f, 1.0E29f, 1.0E30f, 1.0E31f, 1.0E32f, 1.0E33f, 1.0E34f, 1.0E35f, 1.0E36f, 1.0E37f, 1.0E38f};

    /* renamed from: c, reason: collision with root package name */
    private static final float[] f4470c = {1.0f, 0.1f, 0.01f, 0.001f, 1.0E-4f, 1.0E-5f, 1.0E-6f, 1.0E-7f, 1.0E-8f, 1.0E-9f, 1.0E-10f, 1.0E-11f, 1.0E-12f, 1.0E-13f, 1.0E-14f, 1.0E-15f, 1.0E-16f, 1.0E-17f, 1.0E-18f, 1.0E-19f, 1.0E-20f, 1.0E-21f, 1.0E-22f, 1.0E-23f, 1.0E-24f, 1.0E-25f, 1.0E-26f, 1.0E-27f, 1.0E-28f, 1.0E-29f, 1.0E-30f, 1.0E-31f, 1.0E-32f, 1.0E-33f, 1.0E-34f, 1.0E-35f, 1.0E-36f, 1.0E-37f, 1.0E-38f};

    /* renamed from: a, reason: collision with root package name */
    private int f4471a;

    d() {
    }

    int a() {
        return this.f4471a;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x008a A[EDGE_INSN: B:118:0x008a->B:47:0x008a BREAK  A[LOOP:0: B:10:0x0032->B:17:0x0080], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    float b(String str, int i10, int i11) {
        boolean z10;
        int i12;
        int i13;
        boolean z11;
        int i14;
        int i15;
        int i16;
        float f10;
        char charAt;
        int i17;
        boolean z12;
        boolean z13;
        char charAt2;
        this.f4471a = i10;
        if (i10 >= i11) {
            return Float.NaN;
        }
        char charAt3 = str.charAt(i10);
        if (charAt3 == '+') {
            z10 = false;
        } else {
            if (charAt3 != '-') {
                z10 = false;
                int i18 = this.f4471a;
                long j10 = 0;
                i12 = 0;
                i13 = 0;
                int i19 = 0;
                z11 = false;
                int i20 = 0;
                while (true) {
                    i14 = this.f4471a;
                    if (i14 >= i11) {
                        break;
                    }
                    char charAt4 = str.charAt(i14);
                    if (charAt4 == '0') {
                        if (i12 == 0) {
                            i19++;
                        } else {
                            i13++;
                        }
                    } else if (charAt4 >= '1' && charAt4 <= '9') {
                        int i21 = i12 + i13;
                        while (i13 > 0) {
                            if (j10 > 922337203685477580L) {
                                return Float.NaN;
                            }
                            j10 *= 10;
                            i13--;
                        }
                        if (j10 > 922337203685477580L) {
                            return Float.NaN;
                        }
                        j10 = (j10 * 10) + (charAt4 - '0');
                        i12 = i21 + 1;
                        if (j10 < 0) {
                            return Float.NaN;
                        }
                    } else {
                        if (charAt4 != '.' || z11) {
                            break;
                        }
                        i20 = this.f4471a - i18;
                        z11 = true;
                    }
                    this.f4471a++;
                }
                if (!z11 && this.f4471a == i20 + 1) {
                    return Float.NaN;
                }
                if (i12 == 0) {
                    if (i19 == 0) {
                        return Float.NaN;
                    }
                    i12 = 1;
                }
                if (z11) {
                    i13 = (i20 - i19) - i12;
                }
                i15 = this.f4471a;
                if (i15 < i11 && ((charAt = str.charAt(i15)) == 'E' || charAt == 'e')) {
                    i17 = this.f4471a + 1;
                    this.f4471a = i17;
                    if (i17 != i11) {
                        return Float.NaN;
                    }
                    char charAt5 = str.charAt(i17);
                    if (charAt5 == '+') {
                        z12 = false;
                    } else if (charAt5 != '-') {
                        switch (charAt5) {
                            case '0':
                            case '1':
                            case '2':
                            case '3':
                            case '4':
                            case '5':
                            case '6':
                            case '7':
                            case '8':
                            case '9':
                                z12 = false;
                                z13 = false;
                                break;
                            default:
                                this.f4471a--;
                                z13 = true;
                                z12 = false;
                                break;
                        }
                        if (!z13) {
                            int i22 = this.f4471a;
                            int i23 = 0;
                            while (true) {
                                int i24 = this.f4471a;
                                if (i24 < i11 && (charAt2 = str.charAt(i24)) >= '0' && charAt2 <= '9') {
                                    if (i23 > 922337203685477580L) {
                                        return Float.NaN;
                                    }
                                    i23 = (i23 * 10) + (charAt2 - '0');
                                    this.f4471a++;
                                }
                            }
                            if (this.f4471a == i22) {
                                return Float.NaN;
                            }
                            i13 = z12 ? i13 - i23 : i13 + i23;
                        }
                    } else {
                        z12 = true;
                    }
                    this.f4471a++;
                    z13 = false;
                    if (!z13) {
                    }
                }
                i16 = i12 + i13;
                if (i16 <= 39 || i16 < -44) {
                    return Float.NaN;
                }
                long j11 = j10;
                float f11 = j11;
                if (j11 != 0) {
                    if (i13 > 0) {
                        f10 = f4469b[i13];
                    } else if (i13 < 0) {
                        if (i13 < -38) {
                            f11 = (float) (f11 * 1.0E-20d);
                            i13 += 20;
                        }
                        f10 = f4470c[-i13];
                    }
                    f11 *= f10;
                }
                return z10 ? -f11 : f11;
            }
            z10 = true;
        }
        this.f4471a++;
        int i182 = this.f4471a;
        long j102 = 0;
        i12 = 0;
        i13 = 0;
        int i192 = 0;
        z11 = false;
        int i202 = 0;
        while (true) {
            i14 = this.f4471a;
            if (i14 >= i11) {
            }
            this.f4471a++;
        }
        if (!z11) {
        }
        if (i12 == 0) {
        }
        if (z11) {
        }
        i15 = this.f4471a;
        if (i15 < i11) {
            i17 = this.f4471a + 1;
            this.f4471a = i17;
            if (i17 != i11) {
            }
        }
        i16 = i12 + i13;
        if (i16 <= 39) {
        }
        return Float.NaN;
    }
}
