package com.google.android.gms.measurement.internal;

import V6.AbstractC1287s;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.PatternSyntaxException;

/* renamed from: com.google.android.gms.measurement.internal.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC2644c {

    /* renamed from: a, reason: collision with root package name */
    final String f25849a;

    /* renamed from: b, reason: collision with root package name */
    final int f25850b;

    /* renamed from: c, reason: collision with root package name */
    Boolean f25851c;

    /* renamed from: d, reason: collision with root package name */
    Boolean f25852d;

    /* renamed from: e, reason: collision with root package name */
    Long f25853e;

    /* renamed from: f, reason: collision with root package name */
    Long f25854f;

    AbstractC2644c(String str, int i10) {
        this.f25849a = str;
        this.f25850b = i10;
    }

    private static Boolean d(String str, int i10, boolean z10, String str2, List list, String str3, C2 c22) {
        if (i10 == 7) {
            if (list == null || list.isEmpty()) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z10 && i10 != 2) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (i10 - 1) {
            case 1:
                if (str3 != null) {
                    try {
                        break;
                    } catch (PatternSyntaxException unused) {
                        if (c22 != null) {
                            c22.r().b("Invalid regular expression in REGEXP audience filter. expression", str3);
                        }
                        return null;
                    }
                }
                break;
            case 6:
                if (list != null) {
                    break;
                }
                break;
        }
        return null;
    }

    static Boolean e(Boolean bool, boolean z10) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z10);
    }

    static Boolean f(String str, com.google.android.gms.internal.measurement.P1 p12, C2 c22) {
        List list;
        AbstractC1287s.m(p12);
        if (str == null || !p12.C() || p12.L() == 1 || (p12.L() != 7 ? !p12.D() : p12.I() == 0)) {
            return null;
        }
        int L10 = p12.L();
        boolean G10 = p12.G();
        String E10 = (G10 || L10 == 2 || L10 == 7) ? p12.E() : p12.E().toUpperCase(Locale.ENGLISH);
        if (p12.I() == 0) {
            list = null;
        } else {
            List H10 = p12.H();
            if (!G10) {
                ArrayList arrayList = new ArrayList(H10.size());
                Iterator it = H10.iterator();
                while (it.hasNext()) {
                    arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                }
                H10 = Collections.unmodifiableList(arrayList);
            }
            list = H10;
        }
        return d(str, L10, G10, E10, list, L10 == 2 ? E10 : null, c22);
    }

    static Boolean g(long j10, com.google.android.gms.internal.measurement.J1 j12) {
        try {
            return j(new BigDecimal(j10), j12, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static Boolean h(double d10, com.google.android.gms.internal.measurement.J1 j12) {
        try {
            return j(new BigDecimal(d10), j12, Math.ulp(d10));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static Boolean i(String str, com.google.android.gms.internal.measurement.J1 j12) {
        if (!g7.O(str)) {
            return null;
        }
        try {
            return j(new BigDecimal(str), j12, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static Boolean j(BigDecimal bigDecimal, com.google.android.gms.internal.measurement.J1 j12, double d10) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        AbstractC1287s.m(j12);
        if (j12.C()) {
            if (j12.N() != 1) {
                if (j12.N() == 5) {
                    if (!j12.H() || !j12.J()) {
                        return null;
                    }
                } else if (!j12.F()) {
                    return null;
                }
                int N10 = j12.N();
                if (j12.N() == 5) {
                    if (g7.O(j12.I()) && g7.O(j12.K())) {
                        try {
                            BigDecimal bigDecimal5 = new BigDecimal(j12.I());
                            bigDecimal4 = new BigDecimal(j12.K());
                            bigDecimal3 = bigDecimal5;
                            bigDecimal2 = null;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    return null;
                }
                if (!g7.O(j12.G())) {
                    return null;
                }
                try {
                    bigDecimal2 = new BigDecimal(j12.G());
                    bigDecimal3 = null;
                    bigDecimal4 = null;
                } catch (NumberFormatException unused2) {
                }
                if (N10 == 5) {
                    if (bigDecimal3 == null) {
                        return null;
                    }
                } else if (bigDecimal2 == null) {
                    return null;
                }
                int i10 = N10 - 1;
                if (i10 == 1) {
                    if (bigDecimal2 == null) {
                        return null;
                    }
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                }
                if (i10 == 2) {
                    if (bigDecimal2 == null) {
                        return null;
                    }
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                }
                if (i10 != 3) {
                    if (i10 == 4 && bigDecimal3 != null) {
                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) >= 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                    }
                    return null;
                }
                if (bigDecimal2 == null) {
                    return null;
                }
                if (d10 != 0.0d) {
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d10).multiply(new BigDecimal(2)))) > 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d10).multiply(new BigDecimal(2)))) < 0);
                }
                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
            }
        }
        return null;
    }

    abstract int a();

    abstract boolean b();

    abstract boolean c();
}
