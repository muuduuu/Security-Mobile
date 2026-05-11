package Wd;

import fe.AbstractC3167b;
import fe.C3169d;
import kotlin.collections.AbstractC3574i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import pe.C3877e;

/* loaded from: classes3.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    private static final Regex f11577a = new Regex("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    public static final boolean a(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return f11577a.d(str);
    }

    public static final byte[] b(byte[] address) {
        Intrinsics.checkNotNullParameter(address, "address");
        return j(address) ? AbstractC3574i.b0(address, kotlin.ranges.d.p(12, 16)) : address;
    }

    public static final boolean c(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (Intrinsics.g(charAt, 31) <= 0 || Intrinsics.g(charAt, 127) >= 0 || StringsKt.W(" #%/:?@[\\]", charAt, 0, false, 6, null) != -1) {
                return true;
            }
        }
        return false;
    }

    public static final boolean d(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length();
        if (1 <= length && length < 254) {
            int i10 = 0;
            while (true) {
                int W10 = StringsKt.W(str, '.', i10, false, 4, null);
                int length2 = W10 == -1 ? str.length() - i10 : W10 - i10;
                if (1 > length2 || length2 >= 64) {
                    break;
                }
                if (W10 == -1 || W10 == str.length() - 1) {
                    break;
                }
                i10 = W10 + 1;
            }
            return false;
        }
        return true;
    }

    public static final boolean e(String input, int i10, int i11, byte[] address, int i12) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(address, "address");
        int i13 = i12;
        while (i10 < i11) {
            if (i13 == address.length) {
                return false;
            }
            if (i13 != i12) {
                if (input.charAt(i10) != '.') {
                    return false;
                }
                i10++;
            }
            int i14 = i10;
            int i15 = 0;
            while (i14 < i11) {
                char charAt = input.charAt(i14);
                if (Intrinsics.g(charAt, 48) < 0 || Intrinsics.g(charAt, 57) > 0) {
                    break;
                }
                if ((i15 == 0 && i10 != i14) || (i15 = ((i15 * 10) + charAt) - 48) > 255) {
                    return false;
                }
                i14++;
            }
            if (i14 - i10 == 0) {
                return false;
            }
            address[i13] = (byte) i15;
            i13++;
            i10 = i14;
        }
        return i13 == i12 + 4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x009a, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final byte[] f(String input, int i10, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(input, "input");
        byte[] bArr = new byte[16];
        int i13 = i10;
        int i14 = -1;
        int i15 = -1;
        int i16 = 0;
        while (true) {
            if (i13 < i11) {
                if (i16 != 16) {
                    int i17 = i13 + 2;
                    if (i17 <= i11 && StringsKt.E(input, "::", i13, false, 4, null)) {
                        if (i14 == -1) {
                            i16 += 2;
                            if (i17 != i11) {
                                i15 = i17;
                                i14 = i16;
                                i13 = i15;
                                int i18 = 0;
                                while (i13 < i11) {
                                }
                                i12 = i13 - i15;
                                if (i12 == 0) {
                                    break;
                                }
                                break;
                            }
                            i14 = i16;
                            break;
                        }
                        return null;
                    }
                    if (i16 != 0) {
                        if (StringsKt.E(input, ":", i13, false, 4, null)) {
                            i13++;
                        } else {
                            if (!StringsKt.E(input, ".", i13, false, 4, null) || !e(input, i15, i11, bArr, i16 - 2)) {
                                return null;
                            }
                            i16 += 2;
                        }
                    }
                    i15 = i13;
                    i13 = i15;
                    int i182 = 0;
                    while (i13 < i11) {
                        int D10 = m.D(input.charAt(i13));
                        if (D10 == -1) {
                            break;
                        }
                        i182 = (i182 << 4) + D10;
                        i13++;
                    }
                    i12 = i13 - i15;
                    if (i12 == 0 || i12 > 4) {
                        break;
                    }
                    int i19 = i16 + 1;
                    bArr[i16] = (byte) ((i182 >>> 8) & 255);
                    i16 += 2;
                    bArr[i19] = (byte) (i182 & 255);
                } else {
                    return null;
                }
            } else {
                break;
            }
        }
        if (i16 != 16) {
            if (i14 == -1) {
                return null;
            }
            AbstractC3574i.e(bArr, bArr, 16 - (i16 - i14), i14, i16);
            AbstractC3574i.n(bArr, (byte) 0, i14, (16 - i16) + i14);
        }
        return bArr;
    }

    public static final String g(String host) {
        Intrinsics.checkNotNullParameter(host, "host");
        C3877e T02 = new C3877e().T0(host);
        C3877e c3877e = new C3877e();
        while (!T02.p0()) {
            if (!AbstractC3167b.a().c(T02.Q(), c3877e)) {
                return null;
            }
        }
        T02.T0(h.a(c3877e.F1()));
        C3169d c3169d = C3169d.f33050a;
        String c10 = c3169d.c(T02.F1());
        if (c10 != null && Intrinsics.b(c10, h.a(c10))) {
            return c3169d.e(c10);
        }
        return null;
    }

    public static final String h(byte[] address) {
        Intrinsics.checkNotNullParameter(address, "address");
        if (address.length == 4) {
            return new C3877e().V1(m.b(address[0], 255)).q0(46).V1(m.b(address[1], 255)).q0(46).V1(m.b(address[2], 255)).q0(46).V1(m.b(address[3], 255)).F1();
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public static final String i(byte[] address) {
        Intrinsics.checkNotNullParameter(address, "address");
        int i10 = -1;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < address.length) {
            int i14 = i12;
            while (i14 < 16 && address[i14] == 0 && address[i14 + 1] == 0) {
                i14 += 2;
            }
            int i15 = i14 - i12;
            if (i15 > i13 && i15 >= 4) {
                i10 = i12;
                i13 = i15;
            }
            i12 = i14 + 2;
        }
        C3877e c3877e = new C3877e();
        while (i11 < address.length) {
            if (i11 == i10) {
                c3877e.q0(58);
                i11 += i13;
                if (i11 == 16) {
                    c3877e.q0(58);
                }
            } else {
                if (i11 > 0) {
                    c3877e.q0(58);
                }
                c3877e.h1((m.b(address[i11], 255) << 8) | m.b(address[i11 + 1], 255));
                i11 += 2;
            }
        }
        return c3877e.F1();
    }

    private static final boolean j(byte[] bArr) {
        if (bArr.length != 16) {
            return false;
        }
        for (int i10 = 0; i10 < 10; i10++) {
            if (bArr[i10] != 0) {
                return false;
            }
        }
        return bArr[10] == -1 && bArr[11] == -1;
    }

    public static final String k(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (!StringsKt.K(str, ":", false, 2, null)) {
            String g10 = g(str);
            if (g10 == null || g10.length() == 0 || c(g10) || d(g10)) {
                return null;
            }
            return g10;
        }
        byte[] f10 = (StringsKt.F(str, "[", false, 2, null) && StringsKt.q(str, "]", false, 2, null)) ? f(str, 1, str.length() - 1) : f(str, 0, str.length());
        if (f10 == null) {
            return null;
        }
        byte[] b10 = b(f10);
        if (b10.length == 16) {
            return i(b10);
        }
        if (b10.length == 4) {
            return h(b10);
        }
        throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
    }
}
