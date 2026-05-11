package fe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import pe.C3877e;
import pe.C3880h;

/* renamed from: fe.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3169d {

    /* renamed from: a, reason: collision with root package name */
    public static final C3169d f33050a = new C3169d();

    /* renamed from: b, reason: collision with root package name */
    private static final String f33051b = "xn--";

    /* renamed from: c, reason: collision with root package name */
    private static final C3880h f33052c = C3880h.f38683d.d("xn--");

    private C3169d() {
    }

    private final int a(int i10, int i11, boolean z10) {
        int i12 = z10 ? i10 / 700 : i10 / 2;
        int i13 = i12 + (i12 / i11);
        int i14 = 0;
        while (i13 > 455) {
            i13 /= 35;
            i14 += 36;
        }
        return i14 + ((i13 * 36) / (i13 + 38));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [char] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    private final List b(String str, int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        while (i10 < i11) {
            int charAt = str.charAt(i10);
            if (CharsKt.d(charAt)) {
                int i12 = i10 + 1;
                char charAt2 = i12 < i11 ? str.charAt(i12) : (char) 0;
                if (Character.isLowSurrogate(charAt) || !Character.isLowSurrogate(charAt2)) {
                    charAt = 63;
                } else {
                    charAt = 65536 + (((charAt & 1023) << 10) | (charAt2 & 1023));
                    i10 = i12;
                }
            }
            arrayList.add(Integer.valueOf(charAt));
            i10++;
        }
        return arrayList;
    }

    private final boolean d(String str, int i10, int i11, C3877e c3877e) {
        int i12;
        int i13;
        boolean z10 = true;
        if (!StringsKt.t(str, i10, f33051b, 0, 4, true)) {
            c3877e.e1(str, i10, i11);
            return true;
        }
        int i14 = i10 + 4;
        ArrayList arrayList = new ArrayList();
        int c02 = StringsKt.c0(str, '-', i11, false, 4, null);
        char c10 = '[';
        char c11 = '{';
        char c12 = 'A';
        if (c02 >= i14) {
            while (i14 < c02) {
                int i15 = i14 + 1;
                char charAt = str.charAt(i14);
                if (('a' > charAt || charAt >= '{') && (('A' > charAt || charAt >= '[') && (('0' > charAt || charAt >= ':') && charAt != '-'))) {
                    return false;
                }
                arrayList.add(Integer.valueOf(charAt));
                i14 = i15;
            }
            i14++;
        }
        int i16 = 128;
        int i17 = 72;
        int i18 = 0;
        while (i14 < i11) {
            kotlin.ranges.a n10 = kotlin.ranges.d.n(kotlin.ranges.d.p(36, Integer.MAX_VALUE), 36);
            int c13 = n10.c();
            int e10 = n10.e();
            int h10 = n10.h();
            if ((h10 > 0 && c13 <= e10) || (h10 < 0 && e10 <= c13)) {
                i12 = i18;
                int i19 = 1;
                while (i14 != i11) {
                    int i20 = i14 + 1;
                    char charAt2 = str.charAt(i14);
                    if ('a' <= charAt2 && charAt2 < c11) {
                        i13 = charAt2 - 'a';
                    } else if (c12 <= charAt2 && charAt2 < c10) {
                        i13 = charAt2 - 'A';
                    } else {
                        if ('0' > charAt2 || charAt2 >= ':') {
                            return false;
                        }
                        i13 = charAt2 - 22;
                    }
                    int i21 = i19;
                    int i22 = i13 * i21;
                    int i23 = i12;
                    if (i23 > Integer.MAX_VALUE - i22) {
                        return false;
                    }
                    i12 = i23 + i22;
                    int i24 = c13 <= i17 ? 1 : c13 >= i17 + 26 ? 26 : c13 - i17;
                    if (i13 >= i24) {
                        int i25 = 36 - i24;
                        if (i21 > Integer.MAX_VALUE / i25) {
                            return false;
                        }
                        i19 = i21 * i25;
                        if (c13 != e10) {
                            c13 += h10;
                            i14 = i20;
                            c10 = '[';
                            c11 = '{';
                            c12 = 'A';
                        }
                    }
                    i14 = i20;
                }
                return false;
            }
            i12 = i18;
            i17 = a(i12 - i18, arrayList.size() + 1, i18 == 0);
            int size = i12 / (arrayList.size() + 1);
            if (i16 > Integer.MAX_VALUE - size) {
                return false;
            }
            i16 += size;
            int size2 = i12 % (arrayList.size() + 1);
            if (i16 > 1114111) {
                return false;
            }
            arrayList.add(size2, Integer.valueOf(i16));
            i18 = size2 + 1;
            z10 = true;
            c10 = '[';
            c11 = '{';
            c12 = 'A';
        }
        boolean z11 = z10;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c3877e.g0(((Number) it.next()).intValue());
        }
        return z11;
    }

    private final boolean f(String str, int i10, int i11, C3877e c3877e) {
        int i12;
        int i13;
        if (!h(str, i10, i11)) {
            c3877e.e1(str, i10, i11);
            return true;
        }
        c3877e.Q1(f33052c);
        List b10 = b(str, i10, i11);
        Iterator it = b10.iterator();
        boolean z10 = false;
        int i14 = 0;
        while (true) {
            i12 = 128;
            if (!it.hasNext()) {
                break;
            }
            int intValue = ((Number) it.next()).intValue();
            if (intValue < 128) {
                c3877e.q0(intValue);
                i14++;
            }
        }
        if (i14 > 0) {
            c3877e.q0(45);
        }
        int i15 = 72;
        int i16 = 0;
        int i17 = i14;
        while (i17 < b10.size()) {
            Iterator it2 = b10.iterator();
            if (!it2.hasNext()) {
                throw new NoSuchElementException();
            }
            Object next = it2.next();
            if (it2.hasNext()) {
                int intValue2 = ((Number) next).intValue();
                if (intValue2 < i12) {
                    intValue2 = Integer.MAX_VALUE;
                }
                do {
                    Object next2 = it2.next();
                    int intValue3 = ((Number) next2).intValue();
                    if (intValue3 < i12) {
                        intValue3 = Integer.MAX_VALUE;
                    }
                    if (intValue2 > intValue3) {
                        next = next2;
                        intValue2 = intValue3;
                    }
                } while (it2.hasNext());
            }
            int intValue4 = ((Number) next).intValue();
            int i18 = (intValue4 - i12) * (i17 + 1);
            if (i16 > Integer.MAX_VALUE - i18) {
                return z10;
            }
            int i19 = i16 + i18;
            Iterator it3 = b10.iterator();
            while (it3.hasNext()) {
                int intValue5 = ((Number) it3.next()).intValue();
                if (intValue5 < intValue4) {
                    if (i19 == Integer.MAX_VALUE) {
                        return z10;
                    }
                    i19++;
                } else if (intValue5 == intValue4) {
                    kotlin.ranges.a n10 = kotlin.ranges.d.n(kotlin.ranges.d.p(36, Integer.MAX_VALUE), 36);
                    int c10 = n10.c();
                    int e10 = n10.e();
                    int h10 = n10.h();
                    if ((h10 > 0 && c10 <= e10) || (h10 < 0 && e10 <= c10)) {
                        i13 = i19;
                        while (true) {
                            int i20 = c10 <= i15 ? 1 : c10 >= i15 + 26 ? 26 : c10 - i15;
                            if (i13 < i20) {
                                break;
                            }
                            int i21 = i13 - i20;
                            int i22 = 36 - i20;
                            c3877e.q0(g(i20 + (i21 % i22)));
                            i13 = i21 / i22;
                            if (c10 == e10) {
                                break;
                            }
                            c10 += h10;
                        }
                    } else {
                        i13 = i19;
                    }
                    c3877e.q0(g(i13));
                    int i23 = i17 + 1;
                    boolean z11 = i17 == i14;
                    i17 = i23;
                    i15 = a(i19, i23, z11);
                    z10 = false;
                    i19 = 0;
                }
            }
            i16 = i19 + 1;
            i12 = intValue4 + 1;
            z10 = false;
        }
        return true;
    }

    private final int g(int i10) {
        if (i10 < 26) {
            return i10 + 97;
        }
        if (i10 < 36) {
            return i10 + 22;
        }
        throw new IllegalStateException(("unexpected digit: " + i10).toString());
    }

    private final boolean h(String str, int i10, int i11) {
        while (i10 < i11) {
            if (str.charAt(i10) >= 128) {
                return true;
            }
            i10++;
        }
        return false;
    }

    public final String c(String string) {
        int W10;
        Intrinsics.checkNotNullParameter(string, "string");
        int length = string.length();
        C3877e c3877e = new C3877e();
        for (int i10 = 0; i10 < length; i10 = W10 + 1) {
            W10 = StringsKt.W(string, '.', i10, false, 4, null);
            if (W10 == -1) {
                W10 = length;
            }
            if (!d(string, i10, W10, c3877e)) {
                return null;
            }
            if (W10 >= length) {
                break;
            }
            c3877e.q0(46);
        }
        return c3877e.F1();
    }

    public final String e(String string) {
        int W10;
        Intrinsics.checkNotNullParameter(string, "string");
        int length = string.length();
        C3877e c3877e = new C3877e();
        for (int i10 = 0; i10 < length; i10 = W10 + 1) {
            W10 = StringsKt.W(string, '.', i10, false, 4, null);
            if (W10 == -1) {
                W10 = length;
            }
            if (!f(string, i10, W10, c3877e)) {
                return null;
            }
            if (W10 >= length) {
                break;
            }
            c3877e.q0(46);
        }
        return c3877e.F1();
    }
}
