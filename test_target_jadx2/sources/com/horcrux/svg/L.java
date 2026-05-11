package com.horcrux.svg;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
class L {

    /* renamed from: d, reason: collision with root package name */
    private static ArrayList f28907d;

    /* renamed from: e, reason: collision with root package name */
    private static int f28908e;

    /* renamed from: f, reason: collision with root package name */
    private static J f28909f;

    /* renamed from: g, reason: collision with root package name */
    private static J f28910g;

    /* renamed from: h, reason: collision with root package name */
    private static J f28911h;

    /* renamed from: i, reason: collision with root package name */
    private static J f28912i;

    /* renamed from: j, reason: collision with root package name */
    private static boolean f28913j;

    /* renamed from: a, reason: collision with root package name */
    M f28914a;

    /* renamed from: b, reason: collision with root package name */
    J f28915b;

    /* renamed from: c, reason: collision with root package name */
    double f28916c;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f28917a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f28918b;

        static {
            int[] iArr = new int[EnumC2904g.values().length];
            f28918b = iArr;
            try {
                iArr[EnumC2904g.kCGPathElementAddCurveToPoint.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28918b[EnumC2904g.kCGPathElementAddQuadCurveToPoint.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28918b[EnumC2904g.kCGPathElementMoveToPoint.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28918b[EnumC2904g.kCGPathElementAddLineToPoint.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28918b[EnumC2904g.kCGPathElementCloseSubpath.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[M.values().length];
            f28917a = iArr2;
            try {
                iArr2[M.kStartMarker.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28917a[M.kMidMarker.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f28917a[M.kEndMarker.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private L(M m10, J j10, double d10) {
        this.f28914a = m10;
        this.f28915b = j10;
        this.f28916c = d10;
    }

    private static double a(double d10, double d11) {
        if (Math.abs(d10 - d11) > 180.0d) {
            d10 += 360.0d;
        }
        return (d10 + d11) / 2.0d;
    }

    private static void b(P p10, J j10, J j11, J j12) {
        p10.f28935a = k(j11, j10);
        p10.f28936b = k(j12, j11);
        if (i(p10.f28935a)) {
            p10.f28935a = p10.f28936b;
        } else if (i(p10.f28936b)) {
            p10.f28936b = p10.f28935a;
        }
    }

    private static double c(M m10) {
        double j10 = j(f(f28911h));
        double j11 = j(f(f28912i));
        int i10 = a.f28917a[m10.ordinal()];
        if (i10 == 1) {
            return f28913j ? j11 + 180.0d : j11;
        }
        if (i10 == 2) {
            return a(j10, j11);
        }
        if (i10 != 3) {
            return 0.0d;
        }
        return j10;
    }

    private static P d(F f10) {
        P p10 = new P();
        J[] jArr = f10.f28875b;
        int i10 = a.f28918b[f10.f28874a.ordinal()];
        if (i10 == 1) {
            p10.f28937c = jArr[2];
            p10.f28935a = k(jArr[0], f28909f);
            p10.f28936b = k(jArr[2], jArr[1]);
            if (i(p10.f28935a)) {
                b(p10, jArr[0], jArr[1], jArr[2]);
            } else if (i(p10.f28936b)) {
                b(p10, f28909f, jArr[0], jArr[1]);
            }
        } else if (i10 == 2) {
            J j10 = jArr[1];
            p10.f28937c = j10;
            b(p10, f28909f, jArr[0], j10);
        } else if (i10 == 3 || i10 == 4) {
            J j11 = jArr[0];
            p10.f28937c = j11;
            p10.f28935a = k(j11, f28909f);
            p10.f28936b = k(p10.f28937c, f28909f);
        } else if (i10 == 5) {
            J j12 = f28910g;
            p10.f28937c = j12;
            p10.f28935a = k(j12, f28909f);
            p10.f28936b = k(p10.f28937c, f28909f);
        }
        return p10;
    }

    private static void e() {
        M m10 = M.kEndMarker;
        f28907d.add(new L(m10, f28909f, c(m10)));
    }

    private static double f(J j10) {
        return Math.atan2(j10.f28905b, j10.f28904a);
    }

    private static void g(F f10) {
        P d10 = d(f10);
        f28912i = d10.f28935a;
        int i10 = f28908e;
        if (i10 > 0) {
            M m10 = i10 == 1 ? M.kStartMarker : M.kMidMarker;
            f28907d.add(new L(m10, f28909f, c(m10)));
        }
        f28911h = d10.f28936b;
        f28909f = d10.f28937c;
        EnumC2904g enumC2904g = f10.f28874a;
        if (enumC2904g == EnumC2904g.kCGPathElementMoveToPoint) {
            f28910g = f10.f28875b[0];
        } else if (enumC2904g == EnumC2904g.kCGPathElementCloseSubpath) {
            f28910g = new J(0.0d, 0.0d);
        }
        f28908e++;
    }

    static ArrayList h(ArrayList arrayList) {
        f28907d = new ArrayList();
        f28908e = 0;
        f28909f = new J(0.0d, 0.0d);
        f28910g = new J(0.0d, 0.0d);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            g((F) it.next());
        }
        e();
        return f28907d;
    }

    private static boolean i(J j10) {
        return j10.f28904a == 0.0d && j10.f28905b == 0.0d;
    }

    private static double j(double d10) {
        return d10 * 57.29577951308232d;
    }

    private static J k(J j10, J j11) {
        return new J(j11.f28904a - j10.f28904a, j11.f28905b - j10.f28905b);
    }
}
