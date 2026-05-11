package com.google.android.gms.internal.vision;

import co.hyperverge.hypersnapsdk.activities.HVRetakeActivity;
import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.vision.x1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2621x1 implements K1 {

    /* renamed from: r, reason: collision with root package name */
    private static final int[] f25202r = new int[0];

    /* renamed from: s, reason: collision with root package name */
    private static final Unsafe f25203s = h2.t();

    /* renamed from: a, reason: collision with root package name */
    private final int[] f25204a;

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f25205b;

    /* renamed from: c, reason: collision with root package name */
    private final int f25206c;

    /* renamed from: d, reason: collision with root package name */
    private final int f25207d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC2609t1 f25208e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f25209f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f25210g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f25211h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f25212i;

    /* renamed from: j, reason: collision with root package name */
    private final int[] f25213j;

    /* renamed from: k, reason: collision with root package name */
    private final int f25214k;

    /* renamed from: l, reason: collision with root package name */
    private final int f25215l;

    /* renamed from: m, reason: collision with root package name */
    private final A1 f25216m;

    /* renamed from: n, reason: collision with root package name */
    private final AbstractC2556c1 f25217n;

    /* renamed from: o, reason: collision with root package name */
    private final AbstractC2549a2 f25218o;

    /* renamed from: p, reason: collision with root package name */
    private final C0 f25219p;

    /* renamed from: q, reason: collision with root package name */
    private final InterfaceC2601q1 f25220q;

    private C2621x1(int[] iArr, Object[] objArr, int i10, int i11, InterfaceC2609t1 interfaceC2609t1, boolean z10, boolean z11, int[] iArr2, int i12, int i13, A1 a12, AbstractC2556c1 abstractC2556c1, AbstractC2549a2 abstractC2549a2, C0 c02, InterfaceC2601q1 interfaceC2601q1) {
        this.f25204a = iArr;
        this.f25205b = objArr;
        this.f25206c = i10;
        this.f25207d = i11;
        this.f25210g = interfaceC2609t1 instanceof N0;
        this.f25211h = z10;
        this.f25209f = c02 != null && c02.d(interfaceC2609t1);
        this.f25212i = false;
        this.f25213j = iArr2;
        this.f25214k = i12;
        this.f25215l = i13;
        this.f25216m = a12;
        this.f25217n = abstractC2556c1;
        this.f25218o = abstractC2549a2;
        this.f25219p = c02;
        this.f25208e = interfaceC2609t1;
        this.f25220q = interfaceC2601q1;
    }

    private final boolean A(Object obj, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? y(obj, i10) : (i12 & i13) != 0;
    }

    private static boolean B(Object obj, int i10, K1 k12) {
        return k12.d(h2.F(obj, i10 & 1048575));
    }

    private static double C(Object obj, long j10) {
        return ((Double) h2.F(obj, j10)).doubleValue();
    }

    private final int D(int i10, int i11) {
        int length = (this.f25204a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = this.f25204a[i13];
            if (i10 == i14) {
                return i13;
            }
            if (i10 < i14) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    private final Object E(int i10) {
        return this.f25205b[(i10 / 3) << 1];
    }

    private final void F(Object obj, int i10) {
        int O10 = O(i10);
        long j10 = 1048575 & O10;
        if (j10 == 1048575) {
            return;
        }
        h2.h(obj, j10, (1 << (O10 >>> 20)) | h2.b(obj, j10));
    }

    private final void G(Object obj, int i10, int i11) {
        h2.h(obj, O(i11) & 1048575, i10);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:216:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void H(Object obj, y2 y2Var) {
        Iterator it;
        Map.Entry entry;
        int length;
        int i10;
        int i11;
        boolean z10;
        if (this.f25209f) {
            F0 b10 = this.f25219p.b(obj);
            if (!b10.f25021a.isEmpty()) {
                it = b10.j();
                entry = (Map.Entry) it.next();
                length = this.f25204a.length;
                Unsafe unsafe = f25203s;
                int i12 = 1048575;
                int i13 = 0;
                for (i10 = 0; i10 < length; i10 += 3) {
                    int M10 = M(i10);
                    int[] iArr = this.f25204a;
                    int i14 = iArr[i10];
                    int i15 = (M10 & 267386880) >>> 20;
                    if (i15 <= 17) {
                        int i16 = iArr[i10 + 2];
                        int i17 = i16 & 1048575;
                        if (i17 != i12) {
                            i13 = unsafe.getInt(obj, i17);
                            i12 = i17;
                        }
                        i11 = 1 << (i16 >>> 20);
                    } else {
                        i11 = 0;
                    }
                    while (entry != null && this.f25219p.a(entry) <= i14) {
                        this.f25219p.c(y2Var, entry);
                        entry = it.hasNext() ? (Map.Entry) it.next() : null;
                    }
                    long j10 = M10 & 1048575;
                    switch (i15) {
                        case 0:
                            if ((i11 & i13) != 0) {
                                y2Var.u(i14, h2.C(obj, j10));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if ((i11 & i13) != 0) {
                                y2Var.v(i14, h2.x(obj, j10));
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if ((i11 & i13) != 0) {
                                y2Var.t(i14, unsafe.getLong(obj, j10));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if ((i11 & i13) != 0) {
                                y2Var.a(i14, unsafe.getLong(obj, j10));
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if ((i11 & i13) != 0) {
                                y2Var.o(i14, unsafe.getInt(obj, j10));
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if ((i11 & i13) != 0) {
                                y2Var.A(i14, unsafe.getLong(obj, j10));
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if ((i11 & i13) != 0) {
                                y2Var.D(i14, unsafe.getInt(obj, j10));
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if ((i11 & i13) != 0) {
                                y2Var.B(i14, h2.w(obj, j10));
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            if ((i11 & i13) != 0) {
                                u(i14, unsafe.getObject(obj, j10), y2Var);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            if ((i11 & i13) != 0) {
                                y2Var.K(i14, unsafe.getObject(obj, j10), p(i10));
                                break;
                            } else {
                                break;
                            }
                        case RequestError.EVENT_TIMEOUT /* 10 */:
                            if ((i11 & i13) != 0) {
                                y2Var.H(i14, (AbstractC2570g0) unsafe.getObject(obj, j10));
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            if ((i11 & i13) != 0) {
                                y2Var.F(i14, unsafe.getInt(obj, j10));
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            if ((i11 & i13) != 0) {
                                y2Var.k(i14, unsafe.getInt(obj, j10));
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            if ((i11 & i13) != 0) {
                                y2Var.h(i14, unsafe.getInt(obj, j10));
                                break;
                            } else {
                                break;
                            }
                        case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                            if ((i11 & i13) != 0) {
                                y2Var.j(i14, unsafe.getLong(obj, j10));
                                break;
                            } else {
                                break;
                            }
                        case HVError.SSL_CONNECT_ERROR /* 15 */:
                            if ((i11 & i13) != 0) {
                                y2Var.x(i14, unsafe.getInt(obj, j10));
                                break;
                            } else {
                                break;
                            }
                        case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                            if ((i11 & i13) != 0) {
                                y2Var.L(i14, unsafe.getLong(obj, j10));
                                break;
                            } else {
                                break;
                            }
                        case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                            if ((i11 & i13) != 0) {
                                y2Var.M(i14, unsafe.getObject(obj, j10), p(i10));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            z10 = false;
                            L1.l(this.f25204a[i10], (List) unsafe.getObject(obj, j10), y2Var, false);
                            break;
                        case 19:
                            z10 = false;
                            L1.y(this.f25204a[i10], (List) unsafe.getObject(obj, j10), y2Var, false);
                            break;
                        case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                            z10 = false;
                            L1.C(this.f25204a[i10], (List) unsafe.getObject(obj, j10), y2Var, false);
                            break;
                        case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                            z10 = false;
                            L1.G(this.f25204a[i10], (List) unsafe.getObject(obj, j10), y2Var, false);
                            break;
                        case HVError.FACE_DETECTION_ERROR /* 22 */:
                            z10 = false;
                            L1.T(this.f25204a[i10], (List) unsafe.getObject(obj, j10), y2Var, false);
                            break;
                        case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                            z10 = false;
                            L1.N(this.f25204a[i10], (List) unsafe.getObject(obj, j10), y2Var, false);
                            break;
                        case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                            z10 = false;
                            L1.a0(this.f25204a[i10], (List) unsafe.getObject(obj, j10), y2Var, false);
                            break;
                        case HVError.LOW_STORAGE_ERROR /* 25 */:
                            z10 = false;
                            L1.d0(this.f25204a[i10], (List) unsafe.getObject(obj, j10), y2Var, false);
                            break;
                        case 26:
                            L1.j(this.f25204a[i10], (List) unsafe.getObject(obj, j10), y2Var);
                            break;
                        case 27:
                            L1.k(this.f25204a[i10], (List) unsafe.getObject(obj, j10), y2Var, p(i10));
                            break;
                        case 28:
                            L1.w(this.f25204a[i10], (List) unsafe.getObject(obj, j10), y2Var);
                            break;
                        case 29:
                            z10 = false;
                            L1.W(this.f25204a[i10], (List) unsafe.getObject(obj, j10), y2Var, false);
                            break;
                        case 30:
                            z10 = false;
                            L1.c0(this.f25204a[i10], (List) unsafe.getObject(obj, j10), y2Var, false);
                            break;
                        case HVError.INSTRUCTION_ERROR /* 31 */:
                            z10 = false;
                            L1.b0(this.f25204a[i10], (List) unsafe.getObject(obj, j10), y2Var, false);
                            break;
                        case 32:
                            z10 = false;
                            L1.Q(this.f25204a[i10], (List) unsafe.getObject(obj, j10), y2Var, false);
                            break;
                        case HVError.GPS_ACCESS_DENIED /* 33 */:
                            z10 = false;
                            L1.Z(this.f25204a[i10], (List) unsafe.getObject(obj, j10), y2Var, false);
                            break;
                        case 34:
                            z10 = false;
                            L1.K(this.f25204a[i10], (List) unsafe.getObject(obj, j10), y2Var, false);
                            break;
                        case HVError.FACE_CAPTURE_TIMEOUT /* 35 */:
                            L1.l(this.f25204a[i10], (List) unsafe.getObject(obj, j10), y2Var, true);
                            break;
                        case HVError.HYPER_DOC_DETECT_ERROR /* 36 */:
                            L1.y(this.f25204a[i10], (List) unsafe.getObject(obj, j10), y2Var, true);
                            break;
                        case HVError.INVALID_FILE_ERROR /* 37 */:
                            L1.C(this.f25204a[i10], (List) unsafe.getObject(obj, j10), y2Var, true);
                            break;
                        case 38:
                            L1.G(this.f25204a[i10], (List) unsafe.getObject(obj, j10), y2Var, true);
                            break;
                        case 39:
                            L1.T(this.f25204a[i10], (List) unsafe.getObject(obj, j10), y2Var, true);
                            break;
                        case RequestError.NETWORK_FAILURE /* 40 */:
                            L1.N(this.f25204a[i10], (List) unsafe.getObject(obj, j10), y2Var, true);
                            break;
                        case RequestError.NO_DEV_KEY /* 41 */:
                            L1.a0(this.f25204a[i10], (List) unsafe.getObject(obj, j10), y2Var, true);
                            break;
                        case HVError.CONSENT_DENIED /* 42 */:
                            L1.d0(this.f25204a[i10], (List) unsafe.getObject(obj, j10), y2Var, true);
                            break;
                        case HVError.ENCRYPTION_ERROR /* 43 */:
                            L1.W(this.f25204a[i10], (List) unsafe.getObject(obj, j10), y2Var, true);
                            break;
                        case HVError.SDK_CLOSE_ERROR /* 44 */:
                            L1.c0(this.f25204a[i10], (List) unsafe.getObject(obj, j10), y2Var, true);
                            break;
                        case HVError.PERMISSION_REVOKED_ERROR /* 45 */:
                            L1.b0(this.f25204a[i10], (List) unsafe.getObject(obj, j10), y2Var, true);
                            break;
                        case 46:
                            L1.Q(this.f25204a[i10], (List) unsafe.getObject(obj, j10), y2Var, true);
                            break;
                        case 47:
                            L1.Z(this.f25204a[i10], (List) unsafe.getObject(obj, j10), y2Var, true);
                            break;
                        case 48:
                            L1.K(this.f25204a[i10], (List) unsafe.getObject(obj, j10), y2Var, true);
                            break;
                        case 49:
                            L1.x(this.f25204a[i10], (List) unsafe.getObject(obj, j10), y2Var, p(i10));
                            break;
                        case 50:
                            w(y2Var, i14, unsafe.getObject(obj, j10), i10);
                            break;
                        case 51:
                            if (z(obj, i14, i10)) {
                                y2Var.u(i14, C(obj, j10));
                            }
                            break;
                        case 52:
                            if (z(obj, i14, i10)) {
                                y2Var.v(i14, J(obj, j10));
                            }
                            break;
                        case 53:
                            if (z(obj, i14, i10)) {
                                y2Var.t(i14, P(obj, j10));
                            }
                            break;
                        case 54:
                            if (z(obj, i14, i10)) {
                                y2Var.a(i14, P(obj, j10));
                            }
                            break;
                        case 55:
                            if (z(obj, i14, i10)) {
                                y2Var.o(i14, N(obj, j10));
                            }
                            break;
                        case 56:
                            if (z(obj, i14, i10)) {
                                y2Var.A(i14, P(obj, j10));
                            }
                            break;
                        case 57:
                            if (z(obj, i14, i10)) {
                                y2Var.D(i14, N(obj, j10));
                            }
                            break;
                        case 58:
                            if (z(obj, i14, i10)) {
                                y2Var.B(i14, R(obj, j10));
                            }
                            break;
                        case 59:
                            if (z(obj, i14, i10)) {
                                u(i14, unsafe.getObject(obj, j10), y2Var);
                            }
                            break;
                        case HVError.DETECTOR_NOT_AVAILABLE_ERROR /* 60 */:
                            if (z(obj, i14, i10)) {
                                y2Var.K(i14, unsafe.getObject(obj, j10), p(i10));
                            }
                            break;
                        case 61:
                            if (z(obj, i14, i10)) {
                                y2Var.H(i14, (AbstractC2570g0) unsafe.getObject(obj, j10));
                            }
                            break;
                        case 62:
                            if (z(obj, i14, i10)) {
                                y2Var.F(i14, N(obj, j10));
                            }
                            break;
                        case 63:
                            if (z(obj, i14, i10)) {
                                y2Var.k(i14, N(obj, j10));
                            }
                            break;
                        case 64:
                            if (z(obj, i14, i10)) {
                                y2Var.h(i14, N(obj, j10));
                            }
                            break;
                        case 65:
                            if (z(obj, i14, i10)) {
                                y2Var.j(i14, P(obj, j10));
                            }
                            break;
                        case 66:
                            if (z(obj, i14, i10)) {
                                y2Var.x(i14, N(obj, j10));
                            }
                            break;
                        case 67:
                            if (z(obj, i14, i10)) {
                                y2Var.L(i14, P(obj, j10));
                            }
                            break;
                        case 68:
                            if (z(obj, i14, i10)) {
                                y2Var.M(i14, unsafe.getObject(obj, j10), p(i10));
                            }
                            break;
                    }
                }
                while (entry != null) {
                    this.f25219p.c(y2Var, entry);
                    entry = it.hasNext() ? (Map.Entry) it.next() : null;
                }
                v(this.f25218o, obj, y2Var);
            }
        }
        it = null;
        entry = null;
        length = this.f25204a.length;
        Unsafe unsafe2 = f25203s;
        int i122 = 1048575;
        int i132 = 0;
        while (i10 < length) {
        }
        while (entry != null) {
        }
        v(this.f25218o, obj, y2Var);
    }

    private final void I(Object obj, Object obj2, int i10) {
        int M10 = M(i10);
        int i11 = this.f25204a[i10];
        long j10 = M10 & 1048575;
        if (z(obj2, i11, i10)) {
            Object F10 = z(obj, i11, i10) ? h2.F(obj, j10) : null;
            Object F11 = h2.F(obj2, j10);
            if (F10 != null && F11 != null) {
                h2.j(obj, j10, R0.e(F10, F11));
                G(obj, i11, i10);
            } else if (F11 != null) {
                h2.j(obj, j10, F11);
                G(obj, i11, i10);
            }
        }
    }

    private static float J(Object obj, long j10) {
        return ((Float) h2.F(obj, j10)).floatValue();
    }

    private final S0 K(int i10) {
        return (S0) this.f25205b[((i10 / 3) << 1) + 1];
    }

    private final boolean L(Object obj, Object obj2, int i10) {
        return y(obj, i10) == y(obj2, i10);
    }

    private final int M(int i10) {
        return this.f25204a[i10 + 1];
    }

    private static int N(Object obj, long j10) {
        return ((Integer) h2.F(obj, j10)).intValue();
    }

    private final int O(int i10) {
        return this.f25204a[i10 + 2];
    }

    private static long P(Object obj, long j10) {
        return ((Long) h2.F(obj, j10)).longValue();
    }

    private static C2561d2 Q(Object obj) {
        N0 n02 = (N0) obj;
        C2561d2 c2561d2 = n02.zzb;
        if (c2561d2 != C2561d2.a()) {
            return c2561d2;
        }
        C2561d2 g10 = C2561d2.g();
        n02.zzb = g10;
        return g10;
    }

    private static boolean R(Object obj, long j10) {
        return ((Boolean) h2.F(obj, j10)).booleanValue();
    }

    private final int S(int i10) {
        if (i10 < this.f25206c || i10 > this.f25207d) {
            return -1;
        }
        return D(i10, 0);
    }

    private final int i(int i10, int i11) {
        if (i10 < this.f25206c || i10 > this.f25207d) {
            return -1;
        }
        return D(i10, i11);
    }

    private static int j(AbstractC2549a2 abstractC2549a2, Object obj) {
        return abstractC2549a2.l(abstractC2549a2.f(obj));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final int k(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, C2555c0 c2555c0) {
        int j11;
        Unsafe unsafe = f25203s;
        long j12 = this.f25204a[i17 + 2] & 1048575;
        switch (i16) {
            case 51:
                if (i14 == 1) {
                    unsafe.putObject(obj, j10, Double.valueOf(AbstractC2551b0.l(bArr, i10)));
                    j11 = i10 + 8;
                    unsafe.putInt(obj, j12, i13);
                    return j11;
                }
                return i10;
            case 52:
                if (i14 == 5) {
                    unsafe.putObject(obj, j10, Float.valueOf(AbstractC2551b0.n(bArr, i10)));
                    j11 = i10 + 4;
                    unsafe.putInt(obj, j12, i13);
                    return j11;
                }
                return i10;
            case 53:
            case 54:
                if (i14 == 0) {
                    j11 = AbstractC2551b0.j(bArr, i10, c2555c0);
                    unsafe.putObject(obj, j10, Long.valueOf(c2555c0.f25110b));
                    unsafe.putInt(obj, j12, i13);
                    return j11;
                }
                return i10;
            case 55:
            case 62:
                if (i14 == 0) {
                    j11 = AbstractC2551b0.h(bArr, i10, c2555c0);
                    unsafe.putObject(obj, j10, Integer.valueOf(c2555c0.f25109a));
                    unsafe.putInt(obj, j12, i13);
                    return j11;
                }
                return i10;
            case 56:
            case 65:
                if (i14 == 1) {
                    unsafe.putObject(obj, j10, Long.valueOf(AbstractC2551b0.k(bArr, i10)));
                    j11 = i10 + 8;
                    unsafe.putInt(obj, j12, i13);
                    return j11;
                }
                return i10;
            case 57:
            case 64:
                if (i14 == 5) {
                    unsafe.putObject(obj, j10, Integer.valueOf(AbstractC2551b0.g(bArr, i10)));
                    j11 = i10 + 4;
                    unsafe.putInt(obj, j12, i13);
                    return j11;
                }
                return i10;
            case 58:
                if (i14 == 0) {
                    j11 = AbstractC2551b0.j(bArr, i10, c2555c0);
                    unsafe.putObject(obj, j10, Boolean.valueOf(c2555c0.f25110b != 0));
                    unsafe.putInt(obj, j12, i13);
                    return j11;
                }
                return i10;
            case 59:
                if (i14 == 2) {
                    int h10 = AbstractC2551b0.h(bArr, i10, c2555c0);
                    int i18 = c2555c0.f25109a;
                    if (i18 == 0) {
                        unsafe.putObject(obj, j10, BuildConfig.FLAVOR);
                    } else {
                        if ((i15 & 536870912) != 0 && !k2.g(bArr, h10, h10 + i18)) {
                            throw W0.f();
                        }
                        unsafe.putObject(obj, j10, new String(bArr, h10, i18, R0.f25076a));
                        h10 += i18;
                    }
                    unsafe.putInt(obj, j12, i13);
                    return h10;
                }
                return i10;
            case HVError.DETECTOR_NOT_AVAILABLE_ERROR /* 60 */:
                if (i14 == 2) {
                    int f10 = AbstractC2551b0.f(p(i17), bArr, i10, i11, c2555c0);
                    Object object = unsafe.getInt(obj, j12) == i13 ? unsafe.getObject(obj, j10) : null;
                    if (object == null) {
                        unsafe.putObject(obj, j10, c2555c0.f25111c);
                    } else {
                        unsafe.putObject(obj, j10, R0.e(object, c2555c0.f25111c));
                    }
                    unsafe.putInt(obj, j12, i13);
                    return f10;
                }
                return i10;
            case 61:
                if (i14 == 2) {
                    j11 = AbstractC2551b0.p(bArr, i10, c2555c0);
                    unsafe.putObject(obj, j10, c2555c0.f25111c);
                    unsafe.putInt(obj, j12, i13);
                    return j11;
                }
                return i10;
            case 63:
                if (i14 == 0) {
                    int h11 = AbstractC2551b0.h(bArr, i10, c2555c0);
                    int i19 = c2555c0.f25109a;
                    S0 K10 = K(i17);
                    if (K10 != null && !K10.b(i19)) {
                        Q(obj).c(i12, Long.valueOf(i19));
                        return h11;
                    }
                    unsafe.putObject(obj, j10, Integer.valueOf(i19));
                    j11 = h11;
                    unsafe.putInt(obj, j12, i13);
                    return j11;
                }
                return i10;
            case 66:
                if (i14 == 0) {
                    j11 = AbstractC2551b0.h(bArr, i10, c2555c0);
                    unsafe.putObject(obj, j10, Integer.valueOf(AbstractC2608t0.d(c2555c0.f25109a)));
                    unsafe.putInt(obj, j12, i13);
                    return j11;
                }
                return i10;
            case 67:
                if (i14 == 0) {
                    j11 = AbstractC2551b0.j(bArr, i10, c2555c0);
                    unsafe.putObject(obj, j10, Long.valueOf(AbstractC2608t0.a(c2555c0.f25110b)));
                    unsafe.putInt(obj, j12, i13);
                    return j11;
                }
                return i10;
            case 68:
                if (i14 == 3) {
                    j11 = AbstractC2551b0.e(p(i17), bArr, i10, i11, (i12 & (-8)) | 4, c2555c0);
                    Object object2 = unsafe.getInt(obj, j12) == i13 ? unsafe.getObject(obj, j10) : null;
                    if (object2 == null) {
                        unsafe.putObject(obj, j10, c2555c0.f25111c);
                    } else {
                        unsafe.putObject(obj, j10, R0.e(object2, c2555c0.f25111c));
                    }
                    unsafe.putInt(obj, j12, i13);
                    return j11;
                }
                return i10;
            default:
                return i10;
        }
    }

    private final int l(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, long j10, int i16, long j11, C2555c0 c2555c0) {
        int a10;
        int i17 = i10;
        Unsafe unsafe = f25203s;
        X0 x02 = (X0) unsafe.getObject(obj, j11);
        if (!x02.zza()) {
            int size = x02.size();
            x02 = x02.b(size == 0 ? 10 : size << 1);
            unsafe.putObject(obj, j11, x02);
        }
        switch (i16) {
            case 18:
            case HVError.FACE_CAPTURE_TIMEOUT /* 35 */:
                if (i14 == 2) {
                    int h10 = AbstractC2551b0.h(bArr, i17, c2555c0);
                    int i18 = c2555c0.f25109a + h10;
                    if (h10 < i18) {
                        AbstractC2551b0.l(bArr, h10);
                        throw null;
                    }
                    if (h10 == i18) {
                        return h10;
                    }
                    throw W0.a();
                }
                if (i14 == 1) {
                    AbstractC2551b0.l(bArr, i10);
                    throw null;
                }
                break;
            case 19:
            case HVError.HYPER_DOC_DETECT_ERROR /* 36 */:
                if (i14 == 2) {
                    int h11 = AbstractC2551b0.h(bArr, i17, c2555c0);
                    int i19 = c2555c0.f25109a + h11;
                    if (h11 < i19) {
                        AbstractC2551b0.n(bArr, h11);
                        throw null;
                    }
                    if (h11 == i19) {
                        return h11;
                    }
                    throw W0.a();
                }
                if (i14 == 5) {
                    AbstractC2551b0.n(bArr, i10);
                    throw null;
                }
                break;
            case HVRetakeActivity.CLOSE_ACTION /* 20 */:
            case HVRetakeActivity.RECHECK_ACTION /* 21 */:
            case HVError.INVALID_FILE_ERROR /* 37 */:
            case 38:
                if (i14 == 2) {
                    int h12 = AbstractC2551b0.h(bArr, i17, c2555c0);
                    int i20 = c2555c0.f25109a + h12;
                    if (h12 < i20) {
                        AbstractC2551b0.j(bArr, h12, c2555c0);
                        throw null;
                    }
                    if (h12 == i20) {
                        return h12;
                    }
                    throw W0.a();
                }
                if (i14 == 0) {
                    AbstractC2551b0.j(bArr, i17, c2555c0);
                    long j12 = c2555c0.f25110b;
                    throw null;
                }
                break;
            case HVError.FACE_DETECTION_ERROR /* 22 */:
            case 29:
            case 39:
            case HVError.ENCRYPTION_ERROR /* 43 */:
                if (i14 == 2) {
                    return AbstractC2551b0.i(bArr, i17, x02, c2555c0);
                }
                if (i14 == 0) {
                    return AbstractC2551b0.a(i12, bArr, i10, i11, x02, c2555c0);
                }
                break;
            case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
            case 32:
            case RequestError.NETWORK_FAILURE /* 40 */:
            case 46:
                if (i14 == 2) {
                    int h13 = AbstractC2551b0.h(bArr, i17, c2555c0);
                    int i21 = c2555c0.f25109a + h13;
                    if (h13 < i21) {
                        AbstractC2551b0.k(bArr, h13);
                        throw null;
                    }
                    if (h13 == i21) {
                        return h13;
                    }
                    throw W0.a();
                }
                if (i14 == 1) {
                    AbstractC2551b0.k(bArr, i10);
                    throw null;
                }
                break;
            case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
            case HVError.INSTRUCTION_ERROR /* 31 */:
            case RequestError.NO_DEV_KEY /* 41 */:
            case HVError.PERMISSION_REVOKED_ERROR /* 45 */:
                if (i14 == 2) {
                    P0 p02 = (P0) x02;
                    int h14 = AbstractC2551b0.h(bArr, i17, c2555c0);
                    int i22 = c2555c0.f25109a + h14;
                    while (h14 < i22) {
                        p02.h(AbstractC2551b0.g(bArr, h14));
                        h14 += 4;
                    }
                    if (h14 == i22) {
                        return h14;
                    }
                    throw W0.a();
                }
                if (i14 == 5) {
                    P0 p03 = (P0) x02;
                    p03.h(AbstractC2551b0.g(bArr, i10));
                    while (true) {
                        int i23 = i17 + 4;
                        if (i23 >= i11) {
                            return i23;
                        }
                        i17 = AbstractC2551b0.h(bArr, i23, c2555c0);
                        if (i12 != c2555c0.f25109a) {
                            return i23;
                        }
                        p03.h(AbstractC2551b0.g(bArr, i17));
                    }
                }
                break;
            case HVError.LOW_STORAGE_ERROR /* 25 */:
            case HVError.CONSENT_DENIED /* 42 */:
                if (i14 == 2) {
                    int h15 = AbstractC2551b0.h(bArr, i17, c2555c0);
                    int i24 = c2555c0.f25109a + h15;
                    if (h15 < i24) {
                        AbstractC2551b0.j(bArr, h15, c2555c0);
                        throw null;
                    }
                    if (h15 == i24) {
                        return h15;
                    }
                    throw W0.a();
                }
                if (i14 == 0) {
                    AbstractC2551b0.j(bArr, i17, c2555c0);
                    long j13 = c2555c0.f25110b;
                    throw null;
                }
                break;
            case 26:
                if (i14 == 2) {
                    if ((j10 & 536870912) == 0) {
                        int h16 = AbstractC2551b0.h(bArr, i17, c2555c0);
                        int i25 = c2555c0.f25109a;
                        if (i25 < 0) {
                            throw W0.b();
                        }
                        if (i25 == 0) {
                            x02.add(BuildConfig.FLAVOR);
                        } else {
                            x02.add(new String(bArr, h16, i25, R0.f25076a));
                            h16 += i25;
                        }
                        while (h16 < i11) {
                            int h17 = AbstractC2551b0.h(bArr, h16, c2555c0);
                            if (i12 != c2555c0.f25109a) {
                                return h16;
                            }
                            h16 = AbstractC2551b0.h(bArr, h17, c2555c0);
                            int i26 = c2555c0.f25109a;
                            if (i26 < 0) {
                                throw W0.b();
                            }
                            if (i26 == 0) {
                                x02.add(BuildConfig.FLAVOR);
                            } else {
                                x02.add(new String(bArr, h16, i26, R0.f25076a));
                                h16 += i26;
                            }
                        }
                        return h16;
                    }
                    int h18 = AbstractC2551b0.h(bArr, i17, c2555c0);
                    int i27 = c2555c0.f25109a;
                    if (i27 < 0) {
                        throw W0.b();
                    }
                    if (i27 == 0) {
                        x02.add(BuildConfig.FLAVOR);
                    } else {
                        int i28 = h18 + i27;
                        if (!k2.g(bArr, h18, i28)) {
                            throw W0.f();
                        }
                        x02.add(new String(bArr, h18, i27, R0.f25076a));
                        h18 = i28;
                    }
                    while (h18 < i11) {
                        int h19 = AbstractC2551b0.h(bArr, h18, c2555c0);
                        if (i12 != c2555c0.f25109a) {
                            return h18;
                        }
                        h18 = AbstractC2551b0.h(bArr, h19, c2555c0);
                        int i29 = c2555c0.f25109a;
                        if (i29 < 0) {
                            throw W0.b();
                        }
                        if (i29 == 0) {
                            x02.add(BuildConfig.FLAVOR);
                        } else {
                            int i30 = h18 + i29;
                            if (!k2.g(bArr, h18, i30)) {
                                throw W0.f();
                            }
                            x02.add(new String(bArr, h18, i29, R0.f25076a));
                            h18 = i30;
                        }
                    }
                    return h18;
                }
                break;
            case 27:
                if (i14 == 2) {
                    return AbstractC2551b0.d(p(i15), i12, bArr, i10, i11, x02, c2555c0);
                }
                break;
            case 28:
                if (i14 == 2) {
                    int h20 = AbstractC2551b0.h(bArr, i17, c2555c0);
                    int i31 = c2555c0.f25109a;
                    if (i31 < 0) {
                        throw W0.b();
                    }
                    if (i31 > bArr.length - h20) {
                        throw W0.a();
                    }
                    if (i31 == 0) {
                        x02.add(AbstractC2570g0.f25133b);
                    } else {
                        x02.add(AbstractC2570g0.r(bArr, h20, i31));
                        h20 += i31;
                    }
                    while (h20 < i11) {
                        int h21 = AbstractC2551b0.h(bArr, h20, c2555c0);
                        if (i12 != c2555c0.f25109a) {
                            return h20;
                        }
                        h20 = AbstractC2551b0.h(bArr, h21, c2555c0);
                        int i32 = c2555c0.f25109a;
                        if (i32 < 0) {
                            throw W0.b();
                        }
                        if (i32 > bArr.length - h20) {
                            throw W0.a();
                        }
                        if (i32 == 0) {
                            x02.add(AbstractC2570g0.f25133b);
                        } else {
                            x02.add(AbstractC2570g0.r(bArr, h20, i32));
                            h20 += i32;
                        }
                    }
                    return h20;
                }
                break;
            case 30:
            case HVError.SDK_CLOSE_ERROR /* 44 */:
                if (i14 == 2) {
                    a10 = AbstractC2551b0.i(bArr, i17, x02, c2555c0);
                } else if (i14 == 0) {
                    a10 = AbstractC2551b0.a(i12, bArr, i10, i11, x02, c2555c0);
                }
                N0 n02 = (N0) obj;
                C2561d2 c2561d2 = n02.zzb;
                C2561d2 c2561d22 = (C2561d2) L1.i(i13, x02, K(i15), c2561d2 != C2561d2.a() ? c2561d2 : null, this.f25218o);
                if (c2561d22 != null) {
                    n02.zzb = c2561d22;
                }
                return a10;
            case HVError.GPS_ACCESS_DENIED /* 33 */:
            case 47:
                if (i14 == 2) {
                    P0 p04 = (P0) x02;
                    int h22 = AbstractC2551b0.h(bArr, i17, c2555c0);
                    int i33 = c2555c0.f25109a + h22;
                    while (h22 < i33) {
                        h22 = AbstractC2551b0.h(bArr, h22, c2555c0);
                        p04.h(AbstractC2608t0.d(c2555c0.f25109a));
                    }
                    if (h22 == i33) {
                        return h22;
                    }
                    throw W0.a();
                }
                if (i14 == 0) {
                    P0 p05 = (P0) x02;
                    int h23 = AbstractC2551b0.h(bArr, i17, c2555c0);
                    p05.h(AbstractC2608t0.d(c2555c0.f25109a));
                    while (h23 < i11) {
                        int h24 = AbstractC2551b0.h(bArr, h23, c2555c0);
                        if (i12 != c2555c0.f25109a) {
                            return h23;
                        }
                        h23 = AbstractC2551b0.h(bArr, h24, c2555c0);
                        p05.h(AbstractC2608t0.d(c2555c0.f25109a));
                    }
                    return h23;
                }
                break;
            case 34:
            case 48:
                if (i14 == 2) {
                    int h25 = AbstractC2551b0.h(bArr, i17, c2555c0);
                    int i34 = c2555c0.f25109a + h25;
                    if (h25 >= i34) {
                        if (h25 == i34) {
                            return h25;
                        }
                        throw W0.a();
                    }
                    AbstractC2551b0.j(bArr, h25, c2555c0);
                    AbstractC2608t0.a(c2555c0.f25110b);
                    throw null;
                }
                if (i14 == 0) {
                    AbstractC2551b0.j(bArr, i17, c2555c0);
                    AbstractC2608t0.a(c2555c0.f25110b);
                    throw null;
                }
                break;
            case 49:
                if (i14 == 3) {
                    K1 p10 = p(i15);
                    int i35 = (i12 & (-8)) | 4;
                    i17 = AbstractC2551b0.e(p10, bArr, i10, i11, i35, c2555c0);
                    x02.add(c2555c0.f25111c);
                    while (i17 < i11) {
                        int h26 = AbstractC2551b0.h(bArr, i17, c2555c0);
                        if (i12 != c2555c0.f25109a) {
                            break;
                        } else {
                            i17 = AbstractC2551b0.e(p10, bArr, h26, i11, i35, c2555c0);
                            x02.add(c2555c0.f25111c);
                        }
                    }
                    break;
                }
                break;
        }
        return i17;
    }

    private final int m(Object obj, byte[] bArr, int i10, int i11, int i12, long j10, C2555c0 c2555c0) {
        Unsafe unsafe = f25203s;
        Object E10 = E(i12);
        Object object = unsafe.getObject(obj, j10);
        if (this.f25220q.d(object)) {
            Object f10 = this.f25220q.f(E10);
            this.f25220q.g(f10, object);
            unsafe.putObject(obj, j10, f10);
            object = f10;
        }
        this.f25220q.e(E10);
        this.f25220q.b(object);
        int h10 = AbstractC2551b0.h(bArr, i10, c2555c0);
        int i13 = c2555c0.f25109a;
        if (i13 < 0 || i13 > i11 - h10) {
            throw W0.a();
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0398  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static C2621x1 o(Class cls, InterfaceC2603r1 interfaceC2603r1, A1 a12, AbstractC2556c1 abstractC2556c1, AbstractC2549a2 abstractC2549a2, C0 c02, InterfaceC2601q1 interfaceC2601q1) {
        int i10;
        int charAt;
        int charAt2;
        int charAt3;
        int charAt4;
        int charAt5;
        int i11;
        int[] iArr;
        int i12;
        char charAt6;
        int i13;
        char charAt7;
        int i14;
        char charAt8;
        int i15;
        char charAt9;
        int i16;
        char charAt10;
        int i17;
        char charAt11;
        int i18;
        char charAt12;
        int i19;
        char charAt13;
        int i20;
        int i21;
        int i22;
        int i23;
        I1 i110;
        int i24;
        int objectFieldOffset;
        int i25;
        String str;
        int i26;
        int i27;
        int i28;
        Field s10;
        char charAt14;
        int i29;
        int i30;
        Field s11;
        Field s12;
        int i31;
        char charAt15;
        int i32;
        char charAt16;
        int i33;
        char charAt17;
        int i34;
        char charAt18;
        if (!(interfaceC2603r1 instanceof I1)) {
            android.support.v4.media.session.b.a(interfaceC2603r1);
            throw null;
        }
        I1 i111 = (I1) interfaceC2603r1;
        int i35 = 0;
        boolean z10 = i111.zza() == G1.f25029b;
        String b10 = i111.b();
        int length = b10.length();
        if (b10.charAt(0) >= 55296) {
            int i36 = 1;
            while (true) {
                i10 = i36 + 1;
                if (b10.charAt(i36) < 55296) {
                    break;
                }
                i36 = i10;
            }
        } else {
            i10 = 1;
        }
        int i37 = i10 + 1;
        int charAt19 = b10.charAt(i10);
        if (charAt19 >= 55296) {
            int i38 = charAt19 & 8191;
            int i39 = 13;
            while (true) {
                i34 = i37 + 1;
                charAt18 = b10.charAt(i37);
                if (charAt18 < 55296) {
                    break;
                }
                i38 |= (charAt18 & 8191) << i39;
                i39 += 13;
                i37 = i34;
            }
            charAt19 = i38 | (charAt18 << i39);
            i37 = i34;
        }
        if (charAt19 == 0) {
            charAt = 0;
            charAt2 = 0;
            charAt3 = 0;
            charAt4 = 0;
            charAt5 = 0;
            iArr = f25202r;
            i11 = 0;
        } else {
            int i40 = i37 + 1;
            int charAt20 = b10.charAt(i37);
            if (charAt20 >= 55296) {
                int i41 = charAt20 & 8191;
                int i42 = 13;
                while (true) {
                    i19 = i40 + 1;
                    charAt13 = b10.charAt(i40);
                    if (charAt13 < 55296) {
                        break;
                    }
                    i41 |= (charAt13 & 8191) << i42;
                    i42 += 13;
                    i40 = i19;
                }
                charAt20 = i41 | (charAt13 << i42);
                i40 = i19;
            }
            int i43 = i40 + 1;
            int charAt21 = b10.charAt(i40);
            if (charAt21 >= 55296) {
                int i44 = charAt21 & 8191;
                int i45 = 13;
                while (true) {
                    i18 = i43 + 1;
                    charAt12 = b10.charAt(i43);
                    if (charAt12 < 55296) {
                        break;
                    }
                    i44 |= (charAt12 & 8191) << i45;
                    i45 += 13;
                    i43 = i18;
                }
                charAt21 = i44 | (charAt12 << i45);
                i43 = i18;
            }
            int i46 = i43 + 1;
            charAt = b10.charAt(i43);
            if (charAt >= 55296) {
                int i47 = charAt & 8191;
                int i48 = 13;
                while (true) {
                    i17 = i46 + 1;
                    charAt11 = b10.charAt(i46);
                    if (charAt11 < 55296) {
                        break;
                    }
                    i47 |= (charAt11 & 8191) << i48;
                    i48 += 13;
                    i46 = i17;
                }
                charAt = i47 | (charAt11 << i48);
                i46 = i17;
            }
            int i49 = i46 + 1;
            charAt2 = b10.charAt(i46);
            if (charAt2 >= 55296) {
                int i50 = charAt2 & 8191;
                int i51 = 13;
                while (true) {
                    i16 = i49 + 1;
                    charAt10 = b10.charAt(i49);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i50 |= (charAt10 & 8191) << i51;
                    i51 += 13;
                    i49 = i16;
                }
                charAt2 = i50 | (charAt10 << i51);
                i49 = i16;
            }
            int i52 = i49 + 1;
            charAt3 = b10.charAt(i49);
            if (charAt3 >= 55296) {
                int i53 = charAt3 & 8191;
                int i54 = 13;
                while (true) {
                    i15 = i52 + 1;
                    charAt9 = b10.charAt(i52);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i53 |= (charAt9 & 8191) << i54;
                    i54 += 13;
                    i52 = i15;
                }
                charAt3 = i53 | (charAt9 << i54);
                i52 = i15;
            }
            int i55 = i52 + 1;
            charAt4 = b10.charAt(i52);
            if (charAt4 >= 55296) {
                int i56 = charAt4 & 8191;
                int i57 = 13;
                while (true) {
                    i14 = i55 + 1;
                    charAt8 = b10.charAt(i55);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i56 |= (charAt8 & 8191) << i57;
                    i57 += 13;
                    i55 = i14;
                }
                charAt4 = i56 | (charAt8 << i57);
                i55 = i14;
            }
            int i58 = i55 + 1;
            int charAt22 = b10.charAt(i55);
            if (charAt22 >= 55296) {
                int i59 = charAt22 & 8191;
                int i60 = 13;
                while (true) {
                    i13 = i58 + 1;
                    charAt7 = b10.charAt(i58);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i59 |= (charAt7 & 8191) << i60;
                    i60 += 13;
                    i58 = i13;
                }
                charAt22 = i59 | (charAt7 << i60);
                i58 = i13;
            }
            int i61 = i58 + 1;
            charAt5 = b10.charAt(i58);
            if (charAt5 >= 55296) {
                int i62 = charAt5 & 8191;
                int i63 = i61;
                int i64 = 13;
                while (true) {
                    i12 = i63 + 1;
                    charAt6 = b10.charAt(i63);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i62 |= (charAt6 & 8191) << i64;
                    i64 += 13;
                    i63 = i12;
                }
                charAt5 = i62 | (charAt6 << i64);
                i61 = i12;
            }
            i11 = (charAt20 << 1) + charAt21;
            iArr = new int[charAt5 + charAt4 + charAt22];
            i35 = charAt20;
            i37 = i61;
        }
        Unsafe unsafe = f25203s;
        Object[] c10 = i111.c();
        Class<?> cls2 = i111.a().getClass();
        int i65 = i37;
        int[] iArr2 = new int[charAt3 * 3];
        Object[] objArr = new Object[charAt3 << 1];
        int i66 = charAt5 + charAt4;
        int i67 = i11;
        int i68 = charAt5;
        int i69 = i65;
        int i70 = i66;
        int i71 = 0;
        int i72 = 0;
        while (i69 < length) {
            int i73 = i69 + 1;
            int charAt23 = b10.charAt(i69);
            if (charAt23 >= 55296) {
                int i74 = charAt23 & 8191;
                int i75 = i73;
                int i76 = 13;
                while (true) {
                    i33 = i75 + 1;
                    charAt17 = b10.charAt(i75);
                    i20 = length;
                    if (charAt17 < 55296) {
                        break;
                    }
                    i74 |= (charAt17 & 8191) << i76;
                    i76 += 13;
                    i75 = i33;
                    length = i20;
                }
                charAt23 = i74 | (charAt17 << i76);
                i21 = i33;
            } else {
                i20 = length;
                i21 = i73;
            }
            int i77 = i21 + 1;
            int charAt24 = b10.charAt(i21);
            if (charAt24 >= 55296) {
                int i78 = charAt24 & 8191;
                int i79 = i77;
                int i80 = 13;
                while (true) {
                    i32 = i79 + 1;
                    charAt16 = b10.charAt(i79);
                    i22 = charAt5;
                    if (charAt16 < 55296) {
                        break;
                    }
                    i78 |= (charAt16 & 8191) << i80;
                    i80 += 13;
                    i79 = i32;
                    charAt5 = i22;
                }
                charAt24 = i78 | (charAt16 << i80);
                i23 = i32;
            } else {
                i22 = charAt5;
                i23 = i77;
            }
            int i81 = charAt24 & 255;
            int i82 = charAt2;
            if ((charAt24 & 1024) != 0) {
                iArr[i71] = i72;
                i71++;
            }
            int i83 = charAt;
            if (i81 >= 51) {
                int i84 = i23 + 1;
                int charAt25 = b10.charAt(i23);
                char c11 = 55296;
                if (charAt25 >= 55296) {
                    int i85 = charAt25 & 8191;
                    int i86 = 13;
                    while (true) {
                        i31 = i84 + 1;
                        charAt15 = b10.charAt(i84);
                        if (charAt15 < c11) {
                            break;
                        }
                        i85 |= (charAt15 & 8191) << i86;
                        i86 += 13;
                        i84 = i31;
                        c11 = 55296;
                    }
                    charAt25 = i85 | (charAt15 << i86);
                    i84 = i31;
                }
                int i87 = i81 - 51;
                int i88 = i84;
                if (i87 == 9 || i87 == 17) {
                    i30 = 1;
                    objArr[((i72 / 3) << 1) + 1] = c10[i67];
                    i67++;
                } else {
                    if (i87 == 12 && !z10) {
                        objArr[((i72 / 3) << 1) + 1] = c10[i67];
                        i67++;
                    }
                    i30 = 1;
                }
                int i89 = charAt25 << i30;
                Object obj = c10[i89];
                if (obj instanceof Field) {
                    s11 = (Field) obj;
                } else {
                    s11 = s(cls2, (String) obj);
                    c10[i89] = s11;
                }
                int objectFieldOffset2 = (int) unsafe.objectFieldOffset(s11);
                int i90 = i89 + 1;
                Object obj2 = c10[i90];
                if (obj2 instanceof Field) {
                    s12 = (Field) obj2;
                } else {
                    s12 = s(cls2, (String) obj2);
                    c10[i90] = s12;
                }
                i25 = i67;
                objectFieldOffset = objectFieldOffset2;
                i27 = i88;
                i110 = i111;
                str = b10;
                i26 = (int) unsafe.objectFieldOffset(s12);
                i28 = 0;
            } else {
                int i91 = i67 + 1;
                Field s13 = s(cls2, (String) c10[i67]);
                i110 = i111;
                if (i81 == 9 || i81 == 17) {
                    objArr[((i72 / 3) << 1) + 1] = s13.getType();
                } else {
                    if (i81 == 27 || i81 == 49) {
                        i29 = i67 + 2;
                        objArr[((i72 / 3) << 1) + 1] = c10[i91];
                    } else if (i81 == 12 || i81 == 30 || i81 == 44) {
                        if (!z10) {
                            i29 = i67 + 2;
                            objArr[((i72 / 3) << 1) + 1] = c10[i91];
                        }
                    } else if (i81 == 50) {
                        int i92 = i68 + 1;
                        iArr[i68] = i72;
                        int i93 = (i72 / 3) << 1;
                        int i94 = i67 + 2;
                        objArr[i93] = c10[i91];
                        if ((charAt24 & 2048) != 0) {
                            i91 = i67 + 3;
                            objArr[i93 + 1] = c10[i94];
                            i68 = i92;
                        } else {
                            i68 = i92;
                            i24 = i94;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(s13);
                            if ((charAt24 & 4096) == 4096 || i81 > 17) {
                                i25 = i24;
                                str = b10;
                                i26 = 1048575;
                                i27 = i23;
                                i28 = 0;
                            } else {
                                int i95 = i23 + 1;
                                int charAt26 = b10.charAt(i23);
                                if (charAt26 >= 55296) {
                                    int i96 = charAt26 & 8191;
                                    int i97 = 13;
                                    while (true) {
                                        i27 = i95 + 1;
                                        charAt14 = b10.charAt(i95);
                                        if (charAt14 < 55296) {
                                            break;
                                        }
                                        i96 |= (charAt14 & 8191) << i97;
                                        i97 += 13;
                                        i95 = i27;
                                    }
                                    charAt26 = i96 | (charAt14 << i97);
                                } else {
                                    i27 = i95;
                                }
                                int i98 = (i35 << 1) + (charAt26 / 32);
                                Object obj3 = c10[i98];
                                if (obj3 instanceof Field) {
                                    s10 = (Field) obj3;
                                } else {
                                    s10 = s(cls2, (String) obj3);
                                    c10[i98] = s10;
                                }
                                i25 = i24;
                                str = b10;
                                i26 = (int) unsafe.objectFieldOffset(s10);
                                i28 = charAt26 % 32;
                            }
                            if (i81 >= 18 && i81 <= 49) {
                                iArr[i70] = objectFieldOffset;
                                i70++;
                            }
                        }
                    }
                    i24 = i29;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(s13);
                    if ((charAt24 & 4096) == 4096) {
                    }
                    i25 = i24;
                    str = b10;
                    i26 = 1048575;
                    i27 = i23;
                    i28 = 0;
                    if (i81 >= 18) {
                        iArr[i70] = objectFieldOffset;
                        i70++;
                    }
                }
                i24 = i91;
                objectFieldOffset = (int) unsafe.objectFieldOffset(s13);
                if ((charAt24 & 4096) == 4096) {
                }
                i25 = i24;
                str = b10;
                i26 = 1048575;
                i27 = i23;
                i28 = 0;
                if (i81 >= 18) {
                }
            }
            int i99 = i72 + 1;
            iArr2[i72] = charAt23;
            int i100 = i72 + 2;
            iArr2[i99] = ((charAt24 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? 268435456 : 0) | ((charAt24 & 512) != 0 ? 536870912 : 0) | (i81 << 20) | objectFieldOffset;
            i72 += 3;
            iArr2[i100] = i26 | (i28 << 20);
            b10 = str;
            i67 = i25;
            charAt2 = i82;
            i69 = i27;
            length = i20;
            charAt5 = i22;
            charAt = i83;
            i111 = i110;
        }
        return new C2621x1(iArr2, objArr, charAt, charAt2, i111.a(), z10, false, iArr, charAt5, i66, a12, abstractC2556c1, abstractC2549a2, c02, interfaceC2601q1);
    }

    private final K1 p(int i10) {
        int i11 = (i10 / 3) << 1;
        K1 k12 = (K1) this.f25205b[i11];
        if (k12 != null) {
            return k12;
        }
        K1 b10 = F1.a().b((Class) this.f25205b[i11 + 1]);
        this.f25205b[i11] = b10;
        return b10;
    }

    private final Object q(int i10, int i11, Map map, S0 s02, Object obj, AbstractC2549a2 abstractC2549a2) {
        this.f25220q.e(E(i10));
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!s02.b(((Integer) entry.getValue()).intValue())) {
                if (obj == null) {
                    obj = abstractC2549a2.a();
                }
                C2597p0 D10 = AbstractC2570g0.D(AbstractC2586l1.a(null, entry.getKey(), entry.getValue()));
                try {
                    AbstractC2586l1.b(D10.b(), null, entry.getKey(), entry.getValue());
                    abstractC2549a2.c(obj, i11, D10.a());
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return obj;
    }

    private final Object r(Object obj, int i10, Object obj2, AbstractC2549a2 abstractC2549a2) {
        int i11 = this.f25204a[i10];
        Object F10 = h2.F(obj, M(i10) & 1048575);
        if (F10 == null) {
            return obj2;
        }
        S0 K10 = K(i10);
        return K10 == null ? obj2 : q(i10, i11, this.f25220q.b(F10), K10, obj2, abstractC2549a2);
    }

    private static Field s(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 40 + name.length() + String.valueOf(arrays).length());
            sb2.append("Field ");
            sb2.append(str);
            sb2.append(" for ");
            sb2.append(name);
            sb2.append(" not found. Known fields are ");
            sb2.append(arrays);
            throw new RuntimeException(sb2.toString());
        }
    }

    private static List t(Object obj, long j10) {
        return (List) h2.F(obj, j10);
    }

    private static void u(int i10, Object obj, y2 y2Var) {
        if (obj instanceof String) {
            y2Var.r(i10, (String) obj);
        } else {
            y2Var.H(i10, (AbstractC2570g0) obj);
        }
    }

    private static void v(AbstractC2549a2 abstractC2549a2, Object obj, y2 y2Var) {
        abstractC2549a2.d(abstractC2549a2.f(obj), y2Var);
    }

    private final void w(y2 y2Var, int i10, Object obj, int i11) {
        if (obj != null) {
            this.f25220q.e(E(i11));
            y2Var.I(i10, null, this.f25220q.a(obj));
        }
    }

    private final void x(Object obj, Object obj2, int i10) {
        long M10 = M(i10) & 1048575;
        if (y(obj2, i10)) {
            Object F10 = h2.F(obj, M10);
            Object F11 = h2.F(obj2, M10);
            if (F10 != null && F11 != null) {
                h2.j(obj, M10, R0.e(F10, F11));
                F(obj, i10);
            } else if (F11 != null) {
                h2.j(obj, M10, F11);
                F(obj, i10);
            }
        }
    }

    private final boolean y(Object obj, int i10) {
        int O10 = O(i10);
        long j10 = O10 & 1048575;
        if (j10 != 1048575) {
            return (h2.b(obj, j10) & (1 << (O10 >>> 20))) != 0;
        }
        int M10 = M(i10);
        long j11 = M10 & 1048575;
        switch ((M10 & 267386880) >>> 20) {
            case 0:
                return h2.C(obj, j11) != 0.0d;
            case 1:
                return h2.x(obj, j11) != 0.0f;
            case 2:
                return h2.o(obj, j11) != 0;
            case 3:
                return h2.o(obj, j11) != 0;
            case 4:
                return h2.b(obj, j11) != 0;
            case 5:
                return h2.o(obj, j11) != 0;
            case 6:
                return h2.b(obj, j11) != 0;
            case 7:
                return h2.w(obj, j11);
            case 8:
                Object F10 = h2.F(obj, j11);
                if (F10 instanceof String) {
                    return !((String) F10).isEmpty();
                }
                if (F10 instanceof AbstractC2570g0) {
                    return !AbstractC2570g0.f25133b.equals(F10);
                }
                throw new IllegalArgumentException();
            case 9:
                return h2.F(obj, j11) != null;
            case RequestError.EVENT_TIMEOUT /* 10 */:
                return !AbstractC2570g0.f25133b.equals(h2.F(obj, j11));
            case 11:
                return h2.b(obj, j11) != 0;
            case 12:
                return h2.b(obj, j11) != 0;
            case 13:
                return h2.b(obj, j11) != 0;
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                return h2.o(obj, j11) != 0;
            case HVError.SSL_CONNECT_ERROR /* 15 */:
                return h2.b(obj, j11) != 0;
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                return h2.o(obj, j11) != 0;
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                return h2.F(obj, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean z(Object obj, int i10, int i11) {
        return h2.b(obj, (long) (O(i11) & 1048575)) == i10;
    }

    @Override // com.google.android.gms.internal.vision.K1
    public final void a(Object obj) {
        int i10;
        int i11 = this.f25214k;
        while (true) {
            i10 = this.f25215l;
            if (i11 >= i10) {
                break;
            }
            long M10 = M(this.f25213j[i11]) & 1048575;
            Object F10 = h2.F(obj, M10);
            if (F10 != null) {
                h2.j(obj, M10, this.f25220q.c(F10));
            }
            i11++;
        }
        int length = this.f25213j.length;
        while (i10 < length) {
            this.f25217n.d(obj, this.f25213j[i10]);
            i10++;
        }
        this.f25218o.j(obj);
        if (this.f25209f) {
            this.f25219p.f(obj);
        }
    }

    @Override // com.google.android.gms.internal.vision.K1
    public final int b(Object obj) {
        int i10;
        int b10;
        int length = this.f25204a.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int M10 = M(i12);
            int i13 = this.f25204a[i12];
            long j10 = 1048575 & M10;
            int i14 = 37;
            switch ((M10 & 267386880) >>> 20) {
                case 0:
                    i10 = i11 * 53;
                    b10 = R0.b(Double.doubleToLongBits(h2.C(obj, j10)));
                    i11 = i10 + b10;
                    break;
                case 1:
                    i10 = i11 * 53;
                    b10 = Float.floatToIntBits(h2.x(obj, j10));
                    i11 = i10 + b10;
                    break;
                case 2:
                    i10 = i11 * 53;
                    b10 = R0.b(h2.o(obj, j10));
                    i11 = i10 + b10;
                    break;
                case 3:
                    i10 = i11 * 53;
                    b10 = R0.b(h2.o(obj, j10));
                    i11 = i10 + b10;
                    break;
                case 4:
                    i10 = i11 * 53;
                    b10 = h2.b(obj, j10);
                    i11 = i10 + b10;
                    break;
                case 5:
                    i10 = i11 * 53;
                    b10 = R0.b(h2.o(obj, j10));
                    i11 = i10 + b10;
                    break;
                case 6:
                    i10 = i11 * 53;
                    b10 = h2.b(obj, j10);
                    i11 = i10 + b10;
                    break;
                case 7:
                    i10 = i11 * 53;
                    b10 = R0.c(h2.w(obj, j10));
                    i11 = i10 + b10;
                    break;
                case 8:
                    i10 = i11 * 53;
                    b10 = ((String) h2.F(obj, j10)).hashCode();
                    i11 = i10 + b10;
                    break;
                case 9:
                    Object F10 = h2.F(obj, j10);
                    if (F10 != null) {
                        i14 = F10.hashCode();
                    }
                    i11 = (i11 * 53) + i14;
                    break;
                case RequestError.EVENT_TIMEOUT /* 10 */:
                    i10 = i11 * 53;
                    b10 = h2.F(obj, j10).hashCode();
                    i11 = i10 + b10;
                    break;
                case 11:
                    i10 = i11 * 53;
                    b10 = h2.b(obj, j10);
                    i11 = i10 + b10;
                    break;
                case 12:
                    i10 = i11 * 53;
                    b10 = h2.b(obj, j10);
                    i11 = i10 + b10;
                    break;
                case 13:
                    i10 = i11 * 53;
                    b10 = h2.b(obj, j10);
                    i11 = i10 + b10;
                    break;
                case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                    i10 = i11 * 53;
                    b10 = R0.b(h2.o(obj, j10));
                    i11 = i10 + b10;
                    break;
                case HVError.SSL_CONNECT_ERROR /* 15 */:
                    i10 = i11 * 53;
                    b10 = h2.b(obj, j10);
                    i11 = i10 + b10;
                    break;
                case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                    i10 = i11 * 53;
                    b10 = R0.b(h2.o(obj, j10));
                    i11 = i10 + b10;
                    break;
                case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                    Object F11 = h2.F(obj, j10);
                    if (F11 != null) {
                        i14 = F11.hashCode();
                    }
                    i11 = (i11 * 53) + i14;
                    break;
                case 18:
                case 19:
                case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                case HVError.FACE_DETECTION_ERROR /* 22 */:
                case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                case HVError.LOW_STORAGE_ERROR /* 25 */:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case HVError.INSTRUCTION_ERROR /* 31 */:
                case 32:
                case HVError.GPS_ACCESS_DENIED /* 33 */:
                case 34:
                case HVError.FACE_CAPTURE_TIMEOUT /* 35 */:
                case HVError.HYPER_DOC_DETECT_ERROR /* 36 */:
                case HVError.INVALID_FILE_ERROR /* 37 */:
                case 38:
                case 39:
                case RequestError.NETWORK_FAILURE /* 40 */:
                case RequestError.NO_DEV_KEY /* 41 */:
                case HVError.CONSENT_DENIED /* 42 */:
                case HVError.ENCRYPTION_ERROR /* 43 */:
                case HVError.SDK_CLOSE_ERROR /* 44 */:
                case HVError.PERMISSION_REVOKED_ERROR /* 45 */:
                case 46:
                case 47:
                case 48:
                case 49:
                    i10 = i11 * 53;
                    b10 = h2.F(obj, j10).hashCode();
                    i11 = i10 + b10;
                    break;
                case 50:
                    i10 = i11 * 53;
                    b10 = h2.F(obj, j10).hashCode();
                    i11 = i10 + b10;
                    break;
                case 51:
                    if (z(obj, i13, i12)) {
                        i10 = i11 * 53;
                        b10 = R0.b(Double.doubleToLongBits(C(obj, j10)));
                        i11 = i10 + b10;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (z(obj, i13, i12)) {
                        i10 = i11 * 53;
                        b10 = Float.floatToIntBits(J(obj, j10));
                        i11 = i10 + b10;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (z(obj, i13, i12)) {
                        i10 = i11 * 53;
                        b10 = R0.b(P(obj, j10));
                        i11 = i10 + b10;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (z(obj, i13, i12)) {
                        i10 = i11 * 53;
                        b10 = R0.b(P(obj, j10));
                        i11 = i10 + b10;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (z(obj, i13, i12)) {
                        i10 = i11 * 53;
                        b10 = N(obj, j10);
                        i11 = i10 + b10;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (z(obj, i13, i12)) {
                        i10 = i11 * 53;
                        b10 = R0.b(P(obj, j10));
                        i11 = i10 + b10;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (z(obj, i13, i12)) {
                        i10 = i11 * 53;
                        b10 = N(obj, j10);
                        i11 = i10 + b10;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (z(obj, i13, i12)) {
                        i10 = i11 * 53;
                        b10 = R0.c(R(obj, j10));
                        i11 = i10 + b10;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (z(obj, i13, i12)) {
                        i10 = i11 * 53;
                        b10 = ((String) h2.F(obj, j10)).hashCode();
                        i11 = i10 + b10;
                        break;
                    } else {
                        break;
                    }
                case HVError.DETECTOR_NOT_AVAILABLE_ERROR /* 60 */:
                    if (z(obj, i13, i12)) {
                        i10 = i11 * 53;
                        b10 = h2.F(obj, j10).hashCode();
                        i11 = i10 + b10;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (z(obj, i13, i12)) {
                        i10 = i11 * 53;
                        b10 = h2.F(obj, j10).hashCode();
                        i11 = i10 + b10;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (z(obj, i13, i12)) {
                        i10 = i11 * 53;
                        b10 = N(obj, j10);
                        i11 = i10 + b10;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (z(obj, i13, i12)) {
                        i10 = i11 * 53;
                        b10 = N(obj, j10);
                        i11 = i10 + b10;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (z(obj, i13, i12)) {
                        i10 = i11 * 53;
                        b10 = N(obj, j10);
                        i11 = i10 + b10;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (z(obj, i13, i12)) {
                        i10 = i11 * 53;
                        b10 = R0.b(P(obj, j10));
                        i11 = i10 + b10;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (z(obj, i13, i12)) {
                        i10 = i11 * 53;
                        b10 = N(obj, j10);
                        i11 = i10 + b10;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (z(obj, i13, i12)) {
                        i10 = i11 * 53;
                        b10 = R0.b(P(obj, j10));
                        i11 = i10 + b10;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (z(obj, i13, i12)) {
                        i10 = i11 * 53;
                        b10 = h2.F(obj, j10).hashCode();
                        i11 = i10 + b10;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i11 * 53) + this.f25218o.f(obj).hashCode();
        return this.f25209f ? (hashCode * 53) + this.f25219p.b(obj).hashCode() : hashCode;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:566:0x0a2a  */
    @Override // com.google.android.gms.internal.vision.K1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Object obj, y2 y2Var) {
        Iterator it;
        Map.Entry entry;
        int length;
        int i10;
        Iterator it2;
        Map.Entry entry2;
        int length2;
        if (y2Var.zza() == x2.f25222b) {
            v(this.f25218o, obj, y2Var);
            if (this.f25209f) {
                F0 b10 = this.f25219p.b(obj);
                if (!b10.f25021a.isEmpty()) {
                    it2 = b10.l();
                    entry2 = (Map.Entry) it2.next();
                    for (length2 = this.f25204a.length - 3; length2 >= 0; length2 -= 3) {
                        int M10 = M(length2);
                        int i11 = this.f25204a[length2];
                        while (entry2 != null && this.f25219p.a(entry2) > i11) {
                            this.f25219p.c(y2Var, entry2);
                            entry2 = it2.hasNext() ? (Map.Entry) it2.next() : null;
                        }
                        switch ((M10 & 267386880) >>> 20) {
                            case 0:
                                if (y(obj, length2)) {
                                    y2Var.u(i11, h2.C(obj, M10 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 1:
                                if (y(obj, length2)) {
                                    y2Var.v(i11, h2.x(obj, M10 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 2:
                                if (y(obj, length2)) {
                                    y2Var.t(i11, h2.o(obj, M10 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 3:
                                if (y(obj, length2)) {
                                    y2Var.a(i11, h2.o(obj, M10 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 4:
                                if (y(obj, length2)) {
                                    y2Var.o(i11, h2.b(obj, M10 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 5:
                                if (y(obj, length2)) {
                                    y2Var.A(i11, h2.o(obj, M10 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 6:
                                if (y(obj, length2)) {
                                    y2Var.D(i11, h2.b(obj, M10 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 7:
                                if (y(obj, length2)) {
                                    y2Var.B(i11, h2.w(obj, M10 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 8:
                                if (y(obj, length2)) {
                                    u(i11, h2.F(obj, M10 & 1048575), y2Var);
                                    break;
                                } else {
                                    break;
                                }
                            case 9:
                                if (y(obj, length2)) {
                                    y2Var.K(i11, h2.F(obj, M10 & 1048575), p(length2));
                                    break;
                                } else {
                                    break;
                                }
                            case RequestError.EVENT_TIMEOUT /* 10 */:
                                if (y(obj, length2)) {
                                    y2Var.H(i11, (AbstractC2570g0) h2.F(obj, M10 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 11:
                                if (y(obj, length2)) {
                                    y2Var.F(i11, h2.b(obj, M10 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 12:
                                if (y(obj, length2)) {
                                    y2Var.k(i11, h2.b(obj, M10 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 13:
                                if (y(obj, length2)) {
                                    y2Var.h(i11, h2.b(obj, M10 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                                if (y(obj, length2)) {
                                    y2Var.j(i11, h2.o(obj, M10 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case HVError.SSL_CONNECT_ERROR /* 15 */:
                                if (y(obj, length2)) {
                                    y2Var.x(i11, h2.b(obj, M10 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                                if (y(obj, length2)) {
                                    y2Var.L(i11, h2.o(obj, M10 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                                if (y(obj, length2)) {
                                    y2Var.M(i11, h2.F(obj, M10 & 1048575), p(length2));
                                    break;
                                } else {
                                    break;
                                }
                            case 18:
                                L1.l(this.f25204a[length2], (List) h2.F(obj, M10 & 1048575), y2Var, false);
                                break;
                            case 19:
                                L1.y(this.f25204a[length2], (List) h2.F(obj, M10 & 1048575), y2Var, false);
                                break;
                            case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                                L1.C(this.f25204a[length2], (List) h2.F(obj, M10 & 1048575), y2Var, false);
                                break;
                            case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                                L1.G(this.f25204a[length2], (List) h2.F(obj, M10 & 1048575), y2Var, false);
                                break;
                            case HVError.FACE_DETECTION_ERROR /* 22 */:
                                L1.T(this.f25204a[length2], (List) h2.F(obj, M10 & 1048575), y2Var, false);
                                break;
                            case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                                L1.N(this.f25204a[length2], (List) h2.F(obj, M10 & 1048575), y2Var, false);
                                break;
                            case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                                L1.a0(this.f25204a[length2], (List) h2.F(obj, M10 & 1048575), y2Var, false);
                                break;
                            case HVError.LOW_STORAGE_ERROR /* 25 */:
                                L1.d0(this.f25204a[length2], (List) h2.F(obj, M10 & 1048575), y2Var, false);
                                break;
                            case 26:
                                L1.j(this.f25204a[length2], (List) h2.F(obj, M10 & 1048575), y2Var);
                                break;
                            case 27:
                                L1.k(this.f25204a[length2], (List) h2.F(obj, M10 & 1048575), y2Var, p(length2));
                                break;
                            case 28:
                                L1.w(this.f25204a[length2], (List) h2.F(obj, M10 & 1048575), y2Var);
                                break;
                            case 29:
                                L1.W(this.f25204a[length2], (List) h2.F(obj, M10 & 1048575), y2Var, false);
                                break;
                            case 30:
                                L1.c0(this.f25204a[length2], (List) h2.F(obj, M10 & 1048575), y2Var, false);
                                break;
                            case HVError.INSTRUCTION_ERROR /* 31 */:
                                L1.b0(this.f25204a[length2], (List) h2.F(obj, M10 & 1048575), y2Var, false);
                                break;
                            case 32:
                                L1.Q(this.f25204a[length2], (List) h2.F(obj, M10 & 1048575), y2Var, false);
                                break;
                            case HVError.GPS_ACCESS_DENIED /* 33 */:
                                L1.Z(this.f25204a[length2], (List) h2.F(obj, M10 & 1048575), y2Var, false);
                                break;
                            case 34:
                                L1.K(this.f25204a[length2], (List) h2.F(obj, M10 & 1048575), y2Var, false);
                                break;
                            case HVError.FACE_CAPTURE_TIMEOUT /* 35 */:
                                L1.l(this.f25204a[length2], (List) h2.F(obj, M10 & 1048575), y2Var, true);
                                break;
                            case HVError.HYPER_DOC_DETECT_ERROR /* 36 */:
                                L1.y(this.f25204a[length2], (List) h2.F(obj, M10 & 1048575), y2Var, true);
                                break;
                            case HVError.INVALID_FILE_ERROR /* 37 */:
                                L1.C(this.f25204a[length2], (List) h2.F(obj, M10 & 1048575), y2Var, true);
                                break;
                            case 38:
                                L1.G(this.f25204a[length2], (List) h2.F(obj, M10 & 1048575), y2Var, true);
                                break;
                            case 39:
                                L1.T(this.f25204a[length2], (List) h2.F(obj, M10 & 1048575), y2Var, true);
                                break;
                            case RequestError.NETWORK_FAILURE /* 40 */:
                                L1.N(this.f25204a[length2], (List) h2.F(obj, M10 & 1048575), y2Var, true);
                                break;
                            case RequestError.NO_DEV_KEY /* 41 */:
                                L1.a0(this.f25204a[length2], (List) h2.F(obj, M10 & 1048575), y2Var, true);
                                break;
                            case HVError.CONSENT_DENIED /* 42 */:
                                L1.d0(this.f25204a[length2], (List) h2.F(obj, M10 & 1048575), y2Var, true);
                                break;
                            case HVError.ENCRYPTION_ERROR /* 43 */:
                                L1.W(this.f25204a[length2], (List) h2.F(obj, M10 & 1048575), y2Var, true);
                                break;
                            case HVError.SDK_CLOSE_ERROR /* 44 */:
                                L1.c0(this.f25204a[length2], (List) h2.F(obj, M10 & 1048575), y2Var, true);
                                break;
                            case HVError.PERMISSION_REVOKED_ERROR /* 45 */:
                                L1.b0(this.f25204a[length2], (List) h2.F(obj, M10 & 1048575), y2Var, true);
                                break;
                            case 46:
                                L1.Q(this.f25204a[length2], (List) h2.F(obj, M10 & 1048575), y2Var, true);
                                break;
                            case 47:
                                L1.Z(this.f25204a[length2], (List) h2.F(obj, M10 & 1048575), y2Var, true);
                                break;
                            case 48:
                                L1.K(this.f25204a[length2], (List) h2.F(obj, M10 & 1048575), y2Var, true);
                                break;
                            case 49:
                                L1.x(this.f25204a[length2], (List) h2.F(obj, M10 & 1048575), y2Var, p(length2));
                                break;
                            case 50:
                                w(y2Var, i11, h2.F(obj, M10 & 1048575), length2);
                                break;
                            case 51:
                                if (z(obj, i11, length2)) {
                                    y2Var.u(i11, C(obj, M10 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 52:
                                if (z(obj, i11, length2)) {
                                    y2Var.v(i11, J(obj, M10 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 53:
                                if (z(obj, i11, length2)) {
                                    y2Var.t(i11, P(obj, M10 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 54:
                                if (z(obj, i11, length2)) {
                                    y2Var.a(i11, P(obj, M10 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 55:
                                if (z(obj, i11, length2)) {
                                    y2Var.o(i11, N(obj, M10 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 56:
                                if (z(obj, i11, length2)) {
                                    y2Var.A(i11, P(obj, M10 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 57:
                                if (z(obj, i11, length2)) {
                                    y2Var.D(i11, N(obj, M10 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 58:
                                if (z(obj, i11, length2)) {
                                    y2Var.B(i11, R(obj, M10 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 59:
                                if (z(obj, i11, length2)) {
                                    u(i11, h2.F(obj, M10 & 1048575), y2Var);
                                    break;
                                } else {
                                    break;
                                }
                            case HVError.DETECTOR_NOT_AVAILABLE_ERROR /* 60 */:
                                if (z(obj, i11, length2)) {
                                    y2Var.K(i11, h2.F(obj, M10 & 1048575), p(length2));
                                    break;
                                } else {
                                    break;
                                }
                            case 61:
                                if (z(obj, i11, length2)) {
                                    y2Var.H(i11, (AbstractC2570g0) h2.F(obj, M10 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 62:
                                if (z(obj, i11, length2)) {
                                    y2Var.F(i11, N(obj, M10 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 63:
                                if (z(obj, i11, length2)) {
                                    y2Var.k(i11, N(obj, M10 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 64:
                                if (z(obj, i11, length2)) {
                                    y2Var.h(i11, N(obj, M10 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 65:
                                if (z(obj, i11, length2)) {
                                    y2Var.j(i11, P(obj, M10 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 66:
                                if (z(obj, i11, length2)) {
                                    y2Var.x(i11, N(obj, M10 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 67:
                                if (z(obj, i11, length2)) {
                                    y2Var.L(i11, P(obj, M10 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 68:
                                if (z(obj, i11, length2)) {
                                    y2Var.M(i11, h2.F(obj, M10 & 1048575), p(length2));
                                    break;
                                } else {
                                    break;
                                }
                        }
                    }
                    while (entry2 != null) {
                        this.f25219p.c(y2Var, entry2);
                        entry2 = it2.hasNext() ? (Map.Entry) it2.next() : null;
                    }
                    return;
                }
            }
            it2 = null;
            entry2 = null;
            while (length2 >= 0) {
            }
            while (entry2 != null) {
            }
            return;
        }
        if (!this.f25211h) {
            H(obj, y2Var);
            return;
        }
        if (this.f25209f) {
            F0 b11 = this.f25219p.b(obj);
            if (!b11.f25021a.isEmpty()) {
                it = b11.j();
                entry = (Map.Entry) it.next();
                length = this.f25204a.length;
                for (i10 = 0; i10 < length; i10 += 3) {
                    int M11 = M(i10);
                    int i12 = this.f25204a[i10];
                    while (entry != null && this.f25219p.a(entry) <= i12) {
                        this.f25219p.c(y2Var, entry);
                        entry = it.hasNext() ? (Map.Entry) it.next() : null;
                    }
                    switch ((M11 & 267386880) >>> 20) {
                        case 0:
                            if (y(obj, i10)) {
                                y2Var.u(i12, h2.C(obj, M11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (y(obj, i10)) {
                                y2Var.v(i12, h2.x(obj, M11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if (y(obj, i10)) {
                                y2Var.t(i12, h2.o(obj, M11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if (y(obj, i10)) {
                                y2Var.a(i12, h2.o(obj, M11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if (y(obj, i10)) {
                                y2Var.o(i12, h2.b(obj, M11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if (y(obj, i10)) {
                                y2Var.A(i12, h2.o(obj, M11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if (y(obj, i10)) {
                                y2Var.D(i12, h2.b(obj, M11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if (y(obj, i10)) {
                                y2Var.B(i12, h2.w(obj, M11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            if (y(obj, i10)) {
                                u(i12, h2.F(obj, M11 & 1048575), y2Var);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            if (y(obj, i10)) {
                                y2Var.K(i12, h2.F(obj, M11 & 1048575), p(i10));
                                break;
                            } else {
                                break;
                            }
                        case RequestError.EVENT_TIMEOUT /* 10 */:
                            if (y(obj, i10)) {
                                y2Var.H(i12, (AbstractC2570g0) h2.F(obj, M11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            if (y(obj, i10)) {
                                y2Var.F(i12, h2.b(obj, M11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            if (y(obj, i10)) {
                                y2Var.k(i12, h2.b(obj, M11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            if (y(obj, i10)) {
                                y2Var.h(i12, h2.b(obj, M11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                            if (y(obj, i10)) {
                                y2Var.j(i12, h2.o(obj, M11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case HVError.SSL_CONNECT_ERROR /* 15 */:
                            if (y(obj, i10)) {
                                y2Var.x(i12, h2.b(obj, M11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                            if (y(obj, i10)) {
                                y2Var.L(i12, h2.o(obj, M11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                            if (y(obj, i10)) {
                                y2Var.M(i12, h2.F(obj, M11 & 1048575), p(i10));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            L1.l(this.f25204a[i10], (List) h2.F(obj, M11 & 1048575), y2Var, false);
                            break;
                        case 19:
                            L1.y(this.f25204a[i10], (List) h2.F(obj, M11 & 1048575), y2Var, false);
                            break;
                        case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                            L1.C(this.f25204a[i10], (List) h2.F(obj, M11 & 1048575), y2Var, false);
                            break;
                        case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                            L1.G(this.f25204a[i10], (List) h2.F(obj, M11 & 1048575), y2Var, false);
                            break;
                        case HVError.FACE_DETECTION_ERROR /* 22 */:
                            L1.T(this.f25204a[i10], (List) h2.F(obj, M11 & 1048575), y2Var, false);
                            break;
                        case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                            L1.N(this.f25204a[i10], (List) h2.F(obj, M11 & 1048575), y2Var, false);
                            break;
                        case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                            L1.a0(this.f25204a[i10], (List) h2.F(obj, M11 & 1048575), y2Var, false);
                            break;
                        case HVError.LOW_STORAGE_ERROR /* 25 */:
                            L1.d0(this.f25204a[i10], (List) h2.F(obj, M11 & 1048575), y2Var, false);
                            break;
                        case 26:
                            L1.j(this.f25204a[i10], (List) h2.F(obj, M11 & 1048575), y2Var);
                            break;
                        case 27:
                            L1.k(this.f25204a[i10], (List) h2.F(obj, M11 & 1048575), y2Var, p(i10));
                            break;
                        case 28:
                            L1.w(this.f25204a[i10], (List) h2.F(obj, M11 & 1048575), y2Var);
                            break;
                        case 29:
                            L1.W(this.f25204a[i10], (List) h2.F(obj, M11 & 1048575), y2Var, false);
                            break;
                        case 30:
                            L1.c0(this.f25204a[i10], (List) h2.F(obj, M11 & 1048575), y2Var, false);
                            break;
                        case HVError.INSTRUCTION_ERROR /* 31 */:
                            L1.b0(this.f25204a[i10], (List) h2.F(obj, M11 & 1048575), y2Var, false);
                            break;
                        case 32:
                            L1.Q(this.f25204a[i10], (List) h2.F(obj, M11 & 1048575), y2Var, false);
                            break;
                        case HVError.GPS_ACCESS_DENIED /* 33 */:
                            L1.Z(this.f25204a[i10], (List) h2.F(obj, M11 & 1048575), y2Var, false);
                            break;
                        case 34:
                            L1.K(this.f25204a[i10], (List) h2.F(obj, M11 & 1048575), y2Var, false);
                            break;
                        case HVError.FACE_CAPTURE_TIMEOUT /* 35 */:
                            L1.l(this.f25204a[i10], (List) h2.F(obj, M11 & 1048575), y2Var, true);
                            break;
                        case HVError.HYPER_DOC_DETECT_ERROR /* 36 */:
                            L1.y(this.f25204a[i10], (List) h2.F(obj, M11 & 1048575), y2Var, true);
                            break;
                        case HVError.INVALID_FILE_ERROR /* 37 */:
                            L1.C(this.f25204a[i10], (List) h2.F(obj, M11 & 1048575), y2Var, true);
                            break;
                        case 38:
                            L1.G(this.f25204a[i10], (List) h2.F(obj, M11 & 1048575), y2Var, true);
                            break;
                        case 39:
                            L1.T(this.f25204a[i10], (List) h2.F(obj, M11 & 1048575), y2Var, true);
                            break;
                        case RequestError.NETWORK_FAILURE /* 40 */:
                            L1.N(this.f25204a[i10], (List) h2.F(obj, M11 & 1048575), y2Var, true);
                            break;
                        case RequestError.NO_DEV_KEY /* 41 */:
                            L1.a0(this.f25204a[i10], (List) h2.F(obj, M11 & 1048575), y2Var, true);
                            break;
                        case HVError.CONSENT_DENIED /* 42 */:
                            L1.d0(this.f25204a[i10], (List) h2.F(obj, M11 & 1048575), y2Var, true);
                            break;
                        case HVError.ENCRYPTION_ERROR /* 43 */:
                            L1.W(this.f25204a[i10], (List) h2.F(obj, M11 & 1048575), y2Var, true);
                            break;
                        case HVError.SDK_CLOSE_ERROR /* 44 */:
                            L1.c0(this.f25204a[i10], (List) h2.F(obj, M11 & 1048575), y2Var, true);
                            break;
                        case HVError.PERMISSION_REVOKED_ERROR /* 45 */:
                            L1.b0(this.f25204a[i10], (List) h2.F(obj, M11 & 1048575), y2Var, true);
                            break;
                        case 46:
                            L1.Q(this.f25204a[i10], (List) h2.F(obj, M11 & 1048575), y2Var, true);
                            break;
                        case 47:
                            L1.Z(this.f25204a[i10], (List) h2.F(obj, M11 & 1048575), y2Var, true);
                            break;
                        case 48:
                            L1.K(this.f25204a[i10], (List) h2.F(obj, M11 & 1048575), y2Var, true);
                            break;
                        case 49:
                            L1.x(this.f25204a[i10], (List) h2.F(obj, M11 & 1048575), y2Var, p(i10));
                            break;
                        case 50:
                            w(y2Var, i12, h2.F(obj, M11 & 1048575), i10);
                            break;
                        case 51:
                            if (z(obj, i12, i10)) {
                                y2Var.u(i12, C(obj, M11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 52:
                            if (z(obj, i12, i10)) {
                                y2Var.v(i12, J(obj, M11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            if (z(obj, i12, i10)) {
                                y2Var.t(i12, P(obj, M11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            if (z(obj, i12, i10)) {
                                y2Var.a(i12, P(obj, M11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 55:
                            if (z(obj, i12, i10)) {
                                y2Var.o(i12, N(obj, M11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 56:
                            if (z(obj, i12, i10)) {
                                y2Var.A(i12, P(obj, M11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 57:
                            if (z(obj, i12, i10)) {
                                y2Var.D(i12, N(obj, M11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 58:
                            if (z(obj, i12, i10)) {
                                y2Var.B(i12, R(obj, M11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 59:
                            if (z(obj, i12, i10)) {
                                u(i12, h2.F(obj, M11 & 1048575), y2Var);
                                break;
                            } else {
                                break;
                            }
                        case HVError.DETECTOR_NOT_AVAILABLE_ERROR /* 60 */:
                            if (z(obj, i12, i10)) {
                                y2Var.K(i12, h2.F(obj, M11 & 1048575), p(i10));
                                break;
                            } else {
                                break;
                            }
                        case 61:
                            if (z(obj, i12, i10)) {
                                y2Var.H(i12, (AbstractC2570g0) h2.F(obj, M11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 62:
                            if (z(obj, i12, i10)) {
                                y2Var.F(i12, N(obj, M11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 63:
                            if (z(obj, i12, i10)) {
                                y2Var.k(i12, N(obj, M11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 64:
                            if (z(obj, i12, i10)) {
                                y2Var.h(i12, N(obj, M11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 65:
                            if (z(obj, i12, i10)) {
                                y2Var.j(i12, P(obj, M11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 66:
                            if (z(obj, i12, i10)) {
                                y2Var.x(i12, N(obj, M11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 67:
                            if (z(obj, i12, i10)) {
                                y2Var.L(i12, P(obj, M11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 68:
                            if (z(obj, i12, i10)) {
                                y2Var.M(i12, h2.F(obj, M11 & 1048575), p(i10));
                                break;
                            } else {
                                break;
                            }
                    }
                }
                while (entry != null) {
                    this.f25219p.c(y2Var, entry);
                    entry = it.hasNext() ? (Map.Entry) it.next() : null;
                }
                v(this.f25218o, obj, y2Var);
            }
        }
        it = null;
        entry = null;
        length = this.f25204a.length;
        while (i10 < length) {
        }
        while (entry != null) {
        }
        v(this.f25218o, obj, y2Var);
    }

    @Override // com.google.android.gms.internal.vision.K1
    public final boolean d(Object obj) {
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.f25214k) {
            int i15 = this.f25213j[i14];
            int i16 = this.f25204a[i15];
            int M10 = M(i15);
            int i17 = this.f25204a[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i12) {
                if (i18 != 1048575) {
                    i13 = f25203s.getInt(obj, i18);
                }
                i11 = i13;
                i10 = i18;
            } else {
                i10 = i12;
                i11 = i13;
            }
            if ((268435456 & M10) != 0 && !A(obj, i15, i10, i11, i19)) {
                return false;
            }
            int i20 = (267386880 & M10) >>> 20;
            if (i20 != 9 && i20 != 17) {
                if (i20 != 27) {
                    if (i20 == 60 || i20 == 68) {
                        if (z(obj, i16, i15) && !B(obj, M10, p(i15))) {
                            return false;
                        }
                    } else if (i20 != 49) {
                        if (i20 == 50 && !this.f25220q.a(h2.F(obj, M10 & 1048575)).isEmpty()) {
                            this.f25220q.e(E(i15));
                            throw null;
                        }
                    }
                }
                List list = (List) h2.F(obj, M10 & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    K1 p10 = p(i15);
                    for (int i21 = 0; i21 < list.size(); i21++) {
                        if (!p10.d(list.get(i21))) {
                            return false;
                        }
                    }
                }
            } else if (A(obj, i15, i10, i11, i19) && !B(obj, M10, p(i15))) {
                return false;
            }
            i14++;
            i12 = i10;
            i13 = i11;
        }
        return !this.f25209f || this.f25219p.b(obj).m();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.vision.K1
    public final int e(Object obj) {
        int i10;
        boolean z10;
        int i11;
        long j10;
        int X10;
        int D10;
        int P10;
        int R10;
        int V10;
        int c02;
        int k02;
        int z11;
        int V11;
        int c03;
        int k03;
        int i12 = 267386880;
        int i13 = 1048575;
        int i14 = 1;
        int i15 = 0;
        if (this.f25211h) {
            Unsafe unsafe = f25203s;
            int i16 = 0;
            int i17 = 0;
            while (i16 < this.f25204a.length) {
                int M10 = M(i16);
                int i18 = (M10 & i12) >>> 20;
                int i19 = this.f25204a[i16];
                long j11 = M10 & 1048575;
                if (i18 >= G0.zza.zza() && i18 <= G0.zzb.zza()) {
                    int i20 = this.f25204a[i16 + 2];
                }
                switch (i18) {
                    case 0:
                        if (y(obj, i16)) {
                            z11 = AbstractC2614v0.z(i19, 0.0d);
                            i17 += z11;
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (y(obj, i16)) {
                            z11 = AbstractC2614v0.A(i19, 0.0f);
                            i17 += z11;
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (y(obj, i16)) {
                            z11 = AbstractC2614v0.X(i19, h2.o(obj, j11));
                            i17 += z11;
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (y(obj, i16)) {
                            z11 = AbstractC2614v0.d0(i19, h2.o(obj, j11));
                            i17 += z11;
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (y(obj, i16)) {
                            z11 = AbstractC2614v0.h0(i19, h2.b(obj, j11));
                            i17 += z11;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (y(obj, i16)) {
                            z11 = AbstractC2614v0.m0(i19, 0L);
                            i17 += z11;
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (y(obj, i16)) {
                            z11 = AbstractC2614v0.t0(i19, 0);
                            i17 += z11;
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (y(obj, i16)) {
                            z11 = AbstractC2614v0.D(i19, true);
                            i17 += z11;
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (y(obj, i16)) {
                            Object F10 = h2.F(obj, j11);
                            z11 = F10 instanceof AbstractC2570g0 ? AbstractC2614v0.P(i19, (AbstractC2570g0) F10) : AbstractC2614v0.C(i19, (String) F10);
                            i17 += z11;
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (y(obj, i16)) {
                            z11 = L1.a(i19, h2.F(obj, j11), p(i16));
                            i17 += z11;
                            break;
                        } else {
                            break;
                        }
                    case RequestError.EVENT_TIMEOUT /* 10 */:
                        if (y(obj, i16)) {
                            z11 = AbstractC2614v0.P(i19, (AbstractC2570g0) h2.F(obj, j11));
                            i17 += z11;
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (y(obj, i16)) {
                            z11 = AbstractC2614v0.l0(i19, h2.b(obj, j11));
                            i17 += z11;
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (y(obj, i16)) {
                            z11 = AbstractC2614v0.y0(i19, h2.b(obj, j11));
                            i17 += z11;
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (y(obj, i16)) {
                            z11 = AbstractC2614v0.w0(i19, 0);
                            i17 += z11;
                            break;
                        } else {
                            break;
                        }
                    case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                        if (y(obj, i16)) {
                            z11 = AbstractC2614v0.q0(i19, 0L);
                            i17 += z11;
                            break;
                        } else {
                            break;
                        }
                    case HVError.SSL_CONNECT_ERROR /* 15 */:
                        if (y(obj, i16)) {
                            z11 = AbstractC2614v0.p0(i19, h2.b(obj, j11));
                            i17 += z11;
                            break;
                        } else {
                            break;
                        }
                    case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                        if (y(obj, i16)) {
                            z11 = AbstractC2614v0.i0(i19, h2.o(obj, j11));
                            i17 += z11;
                            break;
                        } else {
                            break;
                        }
                    case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                        if (y(obj, i16)) {
                            z11 = AbstractC2614v0.Q(i19, (InterfaceC2609t1) h2.F(obj, j11), p(i16));
                            i17 += z11;
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        z11 = L1.U(i19, t(obj, j11), false);
                        i17 += z11;
                        break;
                    case 19:
                        z11 = L1.R(i19, t(obj, j11), false);
                        i17 += z11;
                        break;
                    case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                        z11 = L1.d(i19, t(obj, j11), false);
                        i17 += z11;
                        break;
                    case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                        z11 = L1.t(i19, t(obj, j11), false);
                        i17 += z11;
                        break;
                    case HVError.FACE_DETECTION_ERROR /* 22 */:
                        z11 = L1.H(i19, t(obj, j11), false);
                        i17 += z11;
                        break;
                    case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                        z11 = L1.U(i19, t(obj, j11), false);
                        i17 += z11;
                        break;
                    case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                        z11 = L1.R(i19, t(obj, j11), false);
                        i17 += z11;
                        break;
                    case HVError.LOW_STORAGE_ERROR /* 25 */:
                        z11 = L1.X(i19, t(obj, j11), false);
                        i17 += z11;
                        break;
                    case 26:
                        z11 = L1.b(i19, t(obj, j11));
                        i17 += z11;
                        break;
                    case 27:
                        z11 = L1.c(i19, t(obj, j11), p(i16));
                        i17 += z11;
                        break;
                    case 28:
                        z11 = L1.r(i19, t(obj, j11));
                        i17 += z11;
                        break;
                    case 29:
                        z11 = L1.L(i19, t(obj, j11), false);
                        i17 += z11;
                        break;
                    case 30:
                        z11 = L1.D(i19, t(obj, j11), false);
                        i17 += z11;
                        break;
                    case HVError.INSTRUCTION_ERROR /* 31 */:
                        z11 = L1.R(i19, t(obj, j11), false);
                        i17 += z11;
                        break;
                    case 32:
                        z11 = L1.U(i19, t(obj, j11), false);
                        i17 += z11;
                        break;
                    case HVError.GPS_ACCESS_DENIED /* 33 */:
                        z11 = L1.O(i19, t(obj, j11), false);
                        i17 += z11;
                        break;
                    case 34:
                        z11 = L1.z(i19, t(obj, j11), false);
                        i17 += z11;
                        break;
                    case HVError.FACE_CAPTURE_TIMEOUT /* 35 */:
                        V11 = L1.V((List) unsafe.getObject(obj, j11));
                        if (V11 > 0) {
                            c03 = AbstractC2614v0.c0(i19);
                            k03 = AbstractC2614v0.k0(V11);
                            z11 = c03 + k03 + V11;
                            i17 += z11;
                            break;
                        } else {
                            break;
                        }
                    case HVError.HYPER_DOC_DETECT_ERROR /* 36 */:
                        V11 = L1.S((List) unsafe.getObject(obj, j11));
                        if (V11 > 0) {
                            c03 = AbstractC2614v0.c0(i19);
                            k03 = AbstractC2614v0.k0(V11);
                            z11 = c03 + k03 + V11;
                            i17 += z11;
                            break;
                        } else {
                            break;
                        }
                    case HVError.INVALID_FILE_ERROR /* 37 */:
                        V11 = L1.e((List) unsafe.getObject(obj, j11));
                        if (V11 > 0) {
                            c03 = AbstractC2614v0.c0(i19);
                            k03 = AbstractC2614v0.k0(V11);
                            z11 = c03 + k03 + V11;
                            i17 += z11;
                            break;
                        } else {
                            break;
                        }
                    case 38:
                        V11 = L1.u((List) unsafe.getObject(obj, j11));
                        if (V11 > 0) {
                            c03 = AbstractC2614v0.c0(i19);
                            k03 = AbstractC2614v0.k0(V11);
                            z11 = c03 + k03 + V11;
                            i17 += z11;
                            break;
                        } else {
                            break;
                        }
                    case 39:
                        V11 = L1.I((List) unsafe.getObject(obj, j11));
                        if (V11 > 0) {
                            c03 = AbstractC2614v0.c0(i19);
                            k03 = AbstractC2614v0.k0(V11);
                            z11 = c03 + k03 + V11;
                            i17 += z11;
                            break;
                        } else {
                            break;
                        }
                    case RequestError.NETWORK_FAILURE /* 40 */:
                        V11 = L1.V((List) unsafe.getObject(obj, j11));
                        if (V11 > 0) {
                            c03 = AbstractC2614v0.c0(i19);
                            k03 = AbstractC2614v0.k0(V11);
                            z11 = c03 + k03 + V11;
                            i17 += z11;
                            break;
                        } else {
                            break;
                        }
                    case RequestError.NO_DEV_KEY /* 41 */:
                        V11 = L1.S((List) unsafe.getObject(obj, j11));
                        if (V11 > 0) {
                            c03 = AbstractC2614v0.c0(i19);
                            k03 = AbstractC2614v0.k0(V11);
                            z11 = c03 + k03 + V11;
                            i17 += z11;
                            break;
                        } else {
                            break;
                        }
                    case HVError.CONSENT_DENIED /* 42 */:
                        V11 = L1.Y((List) unsafe.getObject(obj, j11));
                        if (V11 > 0) {
                            c03 = AbstractC2614v0.c0(i19);
                            k03 = AbstractC2614v0.k0(V11);
                            z11 = c03 + k03 + V11;
                            i17 += z11;
                            break;
                        } else {
                            break;
                        }
                    case HVError.ENCRYPTION_ERROR /* 43 */:
                        V11 = L1.M((List) unsafe.getObject(obj, j11));
                        if (V11 > 0) {
                            c03 = AbstractC2614v0.c0(i19);
                            k03 = AbstractC2614v0.k0(V11);
                            z11 = c03 + k03 + V11;
                            i17 += z11;
                            break;
                        } else {
                            break;
                        }
                    case HVError.SDK_CLOSE_ERROR /* 44 */:
                        V11 = L1.E((List) unsafe.getObject(obj, j11));
                        if (V11 > 0) {
                            c03 = AbstractC2614v0.c0(i19);
                            k03 = AbstractC2614v0.k0(V11);
                            z11 = c03 + k03 + V11;
                            i17 += z11;
                            break;
                        } else {
                            break;
                        }
                    case HVError.PERMISSION_REVOKED_ERROR /* 45 */:
                        V11 = L1.S((List) unsafe.getObject(obj, j11));
                        if (V11 > 0) {
                            c03 = AbstractC2614v0.c0(i19);
                            k03 = AbstractC2614v0.k0(V11);
                            z11 = c03 + k03 + V11;
                            i17 += z11;
                            break;
                        } else {
                            break;
                        }
                    case 46:
                        V11 = L1.V((List) unsafe.getObject(obj, j11));
                        if (V11 > 0) {
                            c03 = AbstractC2614v0.c0(i19);
                            k03 = AbstractC2614v0.k0(V11);
                            z11 = c03 + k03 + V11;
                            i17 += z11;
                            break;
                        } else {
                            break;
                        }
                    case 47:
                        V11 = L1.P((List) unsafe.getObject(obj, j11));
                        if (V11 > 0) {
                            c03 = AbstractC2614v0.c0(i19);
                            k03 = AbstractC2614v0.k0(V11);
                            z11 = c03 + k03 + V11;
                            i17 += z11;
                            break;
                        } else {
                            break;
                        }
                    case 48:
                        V11 = L1.A((List) unsafe.getObject(obj, j11));
                        if (V11 > 0) {
                            c03 = AbstractC2614v0.c0(i19);
                            k03 = AbstractC2614v0.k0(V11);
                            z11 = c03 + k03 + V11;
                            i17 += z11;
                            break;
                        } else {
                            break;
                        }
                    case 49:
                        z11 = L1.s(i19, t(obj, j11), p(i16));
                        i17 += z11;
                        break;
                    case 50:
                        z11 = this.f25220q.h(i19, h2.F(obj, j11), E(i16));
                        i17 += z11;
                        break;
                    case 51:
                        if (z(obj, i19, i16)) {
                            z11 = AbstractC2614v0.z(i19, 0.0d);
                            i17 += z11;
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (z(obj, i19, i16)) {
                            z11 = AbstractC2614v0.A(i19, 0.0f);
                            i17 += z11;
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (z(obj, i19, i16)) {
                            z11 = AbstractC2614v0.X(i19, P(obj, j11));
                            i17 += z11;
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (z(obj, i19, i16)) {
                            z11 = AbstractC2614v0.d0(i19, P(obj, j11));
                            i17 += z11;
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (z(obj, i19, i16)) {
                            z11 = AbstractC2614v0.h0(i19, N(obj, j11));
                            i17 += z11;
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (z(obj, i19, i16)) {
                            z11 = AbstractC2614v0.m0(i19, 0L);
                            i17 += z11;
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (z(obj, i19, i16)) {
                            z11 = AbstractC2614v0.t0(i19, 0);
                            i17 += z11;
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (z(obj, i19, i16)) {
                            z11 = AbstractC2614v0.D(i19, true);
                            i17 += z11;
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (z(obj, i19, i16)) {
                            Object F11 = h2.F(obj, j11);
                            z11 = F11 instanceof AbstractC2570g0 ? AbstractC2614v0.P(i19, (AbstractC2570g0) F11) : AbstractC2614v0.C(i19, (String) F11);
                            i17 += z11;
                            break;
                        } else {
                            break;
                        }
                    case HVError.DETECTOR_NOT_AVAILABLE_ERROR /* 60 */:
                        if (z(obj, i19, i16)) {
                            z11 = L1.a(i19, h2.F(obj, j11), p(i16));
                            i17 += z11;
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (z(obj, i19, i16)) {
                            z11 = AbstractC2614v0.P(i19, (AbstractC2570g0) h2.F(obj, j11));
                            i17 += z11;
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (z(obj, i19, i16)) {
                            z11 = AbstractC2614v0.l0(i19, N(obj, j11));
                            i17 += z11;
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (z(obj, i19, i16)) {
                            z11 = AbstractC2614v0.y0(i19, N(obj, j11));
                            i17 += z11;
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (z(obj, i19, i16)) {
                            z11 = AbstractC2614v0.w0(i19, 0);
                            i17 += z11;
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (z(obj, i19, i16)) {
                            z11 = AbstractC2614v0.q0(i19, 0L);
                            i17 += z11;
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (z(obj, i19, i16)) {
                            z11 = AbstractC2614v0.p0(i19, N(obj, j11));
                            i17 += z11;
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (z(obj, i19, i16)) {
                            z11 = AbstractC2614v0.i0(i19, P(obj, j11));
                            i17 += z11;
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (z(obj, i19, i16)) {
                            z11 = AbstractC2614v0.Q(i19, (InterfaceC2609t1) h2.F(obj, j11), p(i16));
                            i17 += z11;
                            break;
                        } else {
                            break;
                        }
                }
                i16 += 3;
                i12 = 267386880;
            }
            return i17 + j(this.f25218o, obj);
        }
        Unsafe unsafe2 = f25203s;
        int i21 = 1048575;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        while (i22 < this.f25204a.length) {
            int M11 = M(i22);
            int[] iArr = this.f25204a;
            int i25 = iArr[i22];
            int i26 = (M11 & 267386880) >>> 20;
            if (i26 <= 17) {
                int i27 = iArr[i22 + 2];
                int i28 = i27 & i13;
                i10 = i14 << (i27 >>> 20);
                if (i28 != i21) {
                    i24 = unsafe2.getInt(obj, i28);
                    i21 = i28;
                }
            } else {
                i10 = 0;
            }
            long j12 = M11 & i13;
            switch (i26) {
                case 0:
                    z10 = false;
                    i11 = 0;
                    j10 = 0;
                    if ((i24 & i10) != 0) {
                        i23 += AbstractC2614v0.z(i25, 0.0d);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    i11 = 0;
                    j10 = 0;
                    if ((i24 & i10) != 0) {
                        z10 = false;
                        i23 += AbstractC2614v0.A(i25, 0.0f);
                    } else {
                        z10 = false;
                    }
                    break;
                case 2:
                    i11 = 0;
                    j10 = 0;
                    if ((i10 & i24) != 0) {
                        X10 = AbstractC2614v0.X(i25, unsafe2.getLong(obj, j12));
                        i23 += X10;
                    }
                    z10 = false;
                    break;
                case 3:
                    i11 = 0;
                    j10 = 0;
                    if ((i10 & i24) != 0) {
                        X10 = AbstractC2614v0.d0(i25, unsafe2.getLong(obj, j12));
                        i23 += X10;
                    }
                    z10 = false;
                    break;
                case 4:
                    i11 = 0;
                    j10 = 0;
                    if ((i10 & i24) != 0) {
                        X10 = AbstractC2614v0.h0(i25, unsafe2.getInt(obj, j12));
                        i23 += X10;
                    }
                    z10 = false;
                    break;
                case 5:
                    i11 = 0;
                    j10 = 0;
                    if ((i24 & i10) != 0) {
                        X10 = AbstractC2614v0.m0(i25, 0L);
                        i23 += X10;
                    }
                    z10 = false;
                    break;
                case 6:
                    i11 = 0;
                    if ((i24 & i10) != 0) {
                        i23 += AbstractC2614v0.t0(i25, 0);
                    }
                    z10 = false;
                    j10 = 0;
                    break;
                case 7:
                    if ((i24 & i10) != 0) {
                        D10 = AbstractC2614v0.D(i25, true);
                        i23 += D10;
                    }
                    z10 = false;
                    i11 = 0;
                    j10 = 0;
                    break;
                case 8:
                    if ((i24 & i10) != 0) {
                        Object object = unsafe2.getObject(obj, j12);
                        P10 = object instanceof AbstractC2570g0 ? AbstractC2614v0.P(i25, (AbstractC2570g0) object) : AbstractC2614v0.C(i25, (String) object);
                        i23 += P10;
                    }
                    z10 = false;
                    i11 = 0;
                    j10 = 0;
                    break;
                case 9:
                    if ((i24 & i10) != 0) {
                        P10 = L1.a(i25, unsafe2.getObject(obj, j12), p(i22));
                        i23 += P10;
                    }
                    z10 = false;
                    i11 = 0;
                    j10 = 0;
                    break;
                case RequestError.EVENT_TIMEOUT /* 10 */:
                    if ((i24 & i10) != 0) {
                        P10 = AbstractC2614v0.P(i25, (AbstractC2570g0) unsafe2.getObject(obj, j12));
                        i23 += P10;
                    }
                    z10 = false;
                    i11 = 0;
                    j10 = 0;
                    break;
                case 11:
                    if ((i24 & i10) != 0) {
                        P10 = AbstractC2614v0.l0(i25, unsafe2.getInt(obj, j12));
                        i23 += P10;
                    }
                    z10 = false;
                    i11 = 0;
                    j10 = 0;
                    break;
                case 12:
                    if ((i24 & i10) != 0) {
                        P10 = AbstractC2614v0.y0(i25, unsafe2.getInt(obj, j12));
                        i23 += P10;
                    }
                    z10 = false;
                    i11 = 0;
                    j10 = 0;
                    break;
                case 13:
                    if ((i24 & i10) != 0) {
                        D10 = AbstractC2614v0.w0(i25, 0);
                        i23 += D10;
                    }
                    z10 = false;
                    i11 = 0;
                    j10 = 0;
                    break;
                case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                    if ((i24 & i10) != 0) {
                        P10 = AbstractC2614v0.q0(i25, 0L);
                        i23 += P10;
                    }
                    z10 = false;
                    i11 = 0;
                    j10 = 0;
                    break;
                case HVError.SSL_CONNECT_ERROR /* 15 */:
                    if ((i24 & i10) != 0) {
                        P10 = AbstractC2614v0.p0(i25, unsafe2.getInt(obj, j12));
                        i23 += P10;
                    }
                    z10 = false;
                    i11 = 0;
                    j10 = 0;
                    break;
                case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                    if ((i24 & i10) != 0) {
                        P10 = AbstractC2614v0.i0(i25, unsafe2.getLong(obj, j12));
                        i23 += P10;
                    }
                    z10 = false;
                    i11 = 0;
                    j10 = 0;
                    break;
                case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                    if ((i24 & i10) != 0) {
                        P10 = AbstractC2614v0.Q(i25, (InterfaceC2609t1) unsafe2.getObject(obj, j12), p(i22));
                        i23 += P10;
                    }
                    z10 = false;
                    i11 = 0;
                    j10 = 0;
                    break;
                case 18:
                    P10 = L1.U(i25, (List) unsafe2.getObject(obj, j12), false);
                    i23 += P10;
                    z10 = false;
                    i11 = 0;
                    j10 = 0;
                    break;
                case 19:
                    i11 = 0;
                    R10 = L1.R(i25, (List) unsafe2.getObject(obj, j12), false);
                    i23 += R10;
                    z10 = false;
                    j10 = 0;
                    break;
                case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                    i11 = 0;
                    R10 = L1.d(i25, (List) unsafe2.getObject(obj, j12), false);
                    i23 += R10;
                    z10 = false;
                    j10 = 0;
                    break;
                case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                    i11 = 0;
                    R10 = L1.t(i25, (List) unsafe2.getObject(obj, j12), false);
                    i23 += R10;
                    z10 = false;
                    j10 = 0;
                    break;
                case HVError.FACE_DETECTION_ERROR /* 22 */:
                    i11 = 0;
                    R10 = L1.H(i25, (List) unsafe2.getObject(obj, j12), false);
                    i23 += R10;
                    z10 = false;
                    j10 = 0;
                    break;
                case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                    i11 = 0;
                    R10 = L1.U(i25, (List) unsafe2.getObject(obj, j12), false);
                    i23 += R10;
                    z10 = false;
                    j10 = 0;
                    break;
                case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                    i11 = 0;
                    R10 = L1.R(i25, (List) unsafe2.getObject(obj, j12), false);
                    i23 += R10;
                    z10 = false;
                    j10 = 0;
                    break;
                case HVError.LOW_STORAGE_ERROR /* 25 */:
                    i11 = 0;
                    R10 = L1.X(i25, (List) unsafe2.getObject(obj, j12), false);
                    i23 += R10;
                    z10 = false;
                    j10 = 0;
                    break;
                case 26:
                    P10 = L1.b(i25, (List) unsafe2.getObject(obj, j12));
                    i23 += P10;
                    z10 = false;
                    i11 = 0;
                    j10 = 0;
                    break;
                case 27:
                    P10 = L1.c(i25, (List) unsafe2.getObject(obj, j12), p(i22));
                    i23 += P10;
                    z10 = false;
                    i11 = 0;
                    j10 = 0;
                    break;
                case 28:
                    P10 = L1.r(i25, (List) unsafe2.getObject(obj, j12));
                    i23 += P10;
                    z10 = false;
                    i11 = 0;
                    j10 = 0;
                    break;
                case 29:
                    P10 = L1.L(i25, (List) unsafe2.getObject(obj, j12), false);
                    i23 += P10;
                    z10 = false;
                    i11 = 0;
                    j10 = 0;
                    break;
                case 30:
                    i11 = 0;
                    R10 = L1.D(i25, (List) unsafe2.getObject(obj, j12), false);
                    i23 += R10;
                    z10 = false;
                    j10 = 0;
                    break;
                case HVError.INSTRUCTION_ERROR /* 31 */:
                    i11 = 0;
                    R10 = L1.R(i25, (List) unsafe2.getObject(obj, j12), false);
                    i23 += R10;
                    z10 = false;
                    j10 = 0;
                    break;
                case 32:
                    i11 = 0;
                    R10 = L1.U(i25, (List) unsafe2.getObject(obj, j12), false);
                    i23 += R10;
                    z10 = false;
                    j10 = 0;
                    break;
                case HVError.GPS_ACCESS_DENIED /* 33 */:
                    i11 = 0;
                    R10 = L1.O(i25, (List) unsafe2.getObject(obj, j12), false);
                    i23 += R10;
                    z10 = false;
                    j10 = 0;
                    break;
                case 34:
                    i11 = 0;
                    R10 = L1.z(i25, (List) unsafe2.getObject(obj, j12), false);
                    i23 += R10;
                    z10 = false;
                    j10 = 0;
                    break;
                case HVError.FACE_CAPTURE_TIMEOUT /* 35 */:
                    V10 = L1.V((List) unsafe2.getObject(obj, j12));
                    if (V10 > 0) {
                        c02 = AbstractC2614v0.c0(i25);
                        k02 = AbstractC2614v0.k0(V10);
                        D10 = c02 + k02 + V10;
                        i23 += D10;
                    }
                    z10 = false;
                    i11 = 0;
                    j10 = 0;
                    break;
                case HVError.HYPER_DOC_DETECT_ERROR /* 36 */:
                    V10 = L1.S((List) unsafe2.getObject(obj, j12));
                    if (V10 > 0) {
                        c02 = AbstractC2614v0.c0(i25);
                        k02 = AbstractC2614v0.k0(V10);
                        D10 = c02 + k02 + V10;
                        i23 += D10;
                    }
                    z10 = false;
                    i11 = 0;
                    j10 = 0;
                    break;
                case HVError.INVALID_FILE_ERROR /* 37 */:
                    V10 = L1.e((List) unsafe2.getObject(obj, j12));
                    if (V10 > 0) {
                        c02 = AbstractC2614v0.c0(i25);
                        k02 = AbstractC2614v0.k0(V10);
                        D10 = c02 + k02 + V10;
                        i23 += D10;
                    }
                    z10 = false;
                    i11 = 0;
                    j10 = 0;
                    break;
                case 38:
                    V10 = L1.u((List) unsafe2.getObject(obj, j12));
                    if (V10 > 0) {
                        c02 = AbstractC2614v0.c0(i25);
                        k02 = AbstractC2614v0.k0(V10);
                        D10 = c02 + k02 + V10;
                        i23 += D10;
                    }
                    z10 = false;
                    i11 = 0;
                    j10 = 0;
                    break;
                case 39:
                    V10 = L1.I((List) unsafe2.getObject(obj, j12));
                    if (V10 > 0) {
                        c02 = AbstractC2614v0.c0(i25);
                        k02 = AbstractC2614v0.k0(V10);
                        D10 = c02 + k02 + V10;
                        i23 += D10;
                    }
                    z10 = false;
                    i11 = 0;
                    j10 = 0;
                    break;
                case RequestError.NETWORK_FAILURE /* 40 */:
                    V10 = L1.V((List) unsafe2.getObject(obj, j12));
                    if (V10 > 0) {
                        c02 = AbstractC2614v0.c0(i25);
                        k02 = AbstractC2614v0.k0(V10);
                        D10 = c02 + k02 + V10;
                        i23 += D10;
                    }
                    z10 = false;
                    i11 = 0;
                    j10 = 0;
                    break;
                case RequestError.NO_DEV_KEY /* 41 */:
                    V10 = L1.S((List) unsafe2.getObject(obj, j12));
                    if (V10 > 0) {
                        c02 = AbstractC2614v0.c0(i25);
                        k02 = AbstractC2614v0.k0(V10);
                        D10 = c02 + k02 + V10;
                        i23 += D10;
                    }
                    z10 = false;
                    i11 = 0;
                    j10 = 0;
                    break;
                case HVError.CONSENT_DENIED /* 42 */:
                    V10 = L1.Y((List) unsafe2.getObject(obj, j12));
                    if (V10 > 0) {
                        c02 = AbstractC2614v0.c0(i25);
                        k02 = AbstractC2614v0.k0(V10);
                        D10 = c02 + k02 + V10;
                        i23 += D10;
                    }
                    z10 = false;
                    i11 = 0;
                    j10 = 0;
                    break;
                case HVError.ENCRYPTION_ERROR /* 43 */:
                    V10 = L1.M((List) unsafe2.getObject(obj, j12));
                    if (V10 > 0) {
                        c02 = AbstractC2614v0.c0(i25);
                        k02 = AbstractC2614v0.k0(V10);
                        D10 = c02 + k02 + V10;
                        i23 += D10;
                    }
                    z10 = false;
                    i11 = 0;
                    j10 = 0;
                    break;
                case HVError.SDK_CLOSE_ERROR /* 44 */:
                    V10 = L1.E((List) unsafe2.getObject(obj, j12));
                    if (V10 > 0) {
                        c02 = AbstractC2614v0.c0(i25);
                        k02 = AbstractC2614v0.k0(V10);
                        D10 = c02 + k02 + V10;
                        i23 += D10;
                    }
                    z10 = false;
                    i11 = 0;
                    j10 = 0;
                    break;
                case HVError.PERMISSION_REVOKED_ERROR /* 45 */:
                    V10 = L1.S((List) unsafe2.getObject(obj, j12));
                    if (V10 > 0) {
                        c02 = AbstractC2614v0.c0(i25);
                        k02 = AbstractC2614v0.k0(V10);
                        D10 = c02 + k02 + V10;
                        i23 += D10;
                    }
                    z10 = false;
                    i11 = 0;
                    j10 = 0;
                    break;
                case 46:
                    V10 = L1.V((List) unsafe2.getObject(obj, j12));
                    if (V10 > 0) {
                        c02 = AbstractC2614v0.c0(i25);
                        k02 = AbstractC2614v0.k0(V10);
                        D10 = c02 + k02 + V10;
                        i23 += D10;
                    }
                    z10 = false;
                    i11 = 0;
                    j10 = 0;
                    break;
                case 47:
                    V10 = L1.P((List) unsafe2.getObject(obj, j12));
                    if (V10 > 0) {
                        c02 = AbstractC2614v0.c0(i25);
                        k02 = AbstractC2614v0.k0(V10);
                        D10 = c02 + k02 + V10;
                        i23 += D10;
                    }
                    z10 = false;
                    i11 = 0;
                    j10 = 0;
                    break;
                case 48:
                    V10 = L1.A((List) unsafe2.getObject(obj, j12));
                    if (V10 > 0) {
                        c02 = AbstractC2614v0.c0(i25);
                        k02 = AbstractC2614v0.k0(V10);
                        D10 = c02 + k02 + V10;
                        i23 += D10;
                    }
                    z10 = false;
                    i11 = 0;
                    j10 = 0;
                    break;
                case 49:
                    P10 = L1.s(i25, (List) unsafe2.getObject(obj, j12), p(i22));
                    i23 += P10;
                    z10 = false;
                    i11 = 0;
                    j10 = 0;
                    break;
                case 50:
                    P10 = this.f25220q.h(i25, unsafe2.getObject(obj, j12), E(i22));
                    i23 += P10;
                    z10 = false;
                    i11 = 0;
                    j10 = 0;
                    break;
                case 51:
                    if (z(obj, i25, i22)) {
                        P10 = AbstractC2614v0.z(i25, 0.0d);
                        i23 += P10;
                    }
                    z10 = false;
                    i11 = 0;
                    j10 = 0;
                    break;
                case 52:
                    if (z(obj, i25, i22)) {
                        D10 = AbstractC2614v0.A(i25, 0.0f);
                        i23 += D10;
                    }
                    z10 = false;
                    i11 = 0;
                    j10 = 0;
                    break;
                case 53:
                    if (z(obj, i25, i22)) {
                        P10 = AbstractC2614v0.X(i25, P(obj, j12));
                        i23 += P10;
                    }
                    z10 = false;
                    i11 = 0;
                    j10 = 0;
                    break;
                case 54:
                    if (z(obj, i25, i22)) {
                        P10 = AbstractC2614v0.d0(i25, P(obj, j12));
                        i23 += P10;
                    }
                    z10 = false;
                    i11 = 0;
                    j10 = 0;
                    break;
                case 55:
                    if (z(obj, i25, i22)) {
                        P10 = AbstractC2614v0.h0(i25, N(obj, j12));
                        i23 += P10;
                    }
                    z10 = false;
                    i11 = 0;
                    j10 = 0;
                    break;
                case 56:
                    if (z(obj, i25, i22)) {
                        P10 = AbstractC2614v0.m0(i25, 0L);
                        i23 += P10;
                    }
                    z10 = false;
                    i11 = 0;
                    j10 = 0;
                    break;
                case 57:
                    if (z(obj, i25, i22)) {
                        D10 = AbstractC2614v0.t0(i25, 0);
                        i23 += D10;
                    }
                    z10 = false;
                    i11 = 0;
                    j10 = 0;
                    break;
                case 58:
                    if (z(obj, i25, i22)) {
                        D10 = AbstractC2614v0.D(i25, true);
                        i23 += D10;
                    }
                    z10 = false;
                    i11 = 0;
                    j10 = 0;
                    break;
                case 59:
                    if (z(obj, i25, i22)) {
                        Object object2 = unsafe2.getObject(obj, j12);
                        P10 = object2 instanceof AbstractC2570g0 ? AbstractC2614v0.P(i25, (AbstractC2570g0) object2) : AbstractC2614v0.C(i25, (String) object2);
                        i23 += P10;
                    }
                    z10 = false;
                    i11 = 0;
                    j10 = 0;
                    break;
                case HVError.DETECTOR_NOT_AVAILABLE_ERROR /* 60 */:
                    if (z(obj, i25, i22)) {
                        P10 = L1.a(i25, unsafe2.getObject(obj, j12), p(i22));
                        i23 += P10;
                    }
                    z10 = false;
                    i11 = 0;
                    j10 = 0;
                    break;
                case 61:
                    if (z(obj, i25, i22)) {
                        P10 = AbstractC2614v0.P(i25, (AbstractC2570g0) unsafe2.getObject(obj, j12));
                        i23 += P10;
                    }
                    z10 = false;
                    i11 = 0;
                    j10 = 0;
                    break;
                case 62:
                    if (z(obj, i25, i22)) {
                        P10 = AbstractC2614v0.l0(i25, N(obj, j12));
                        i23 += P10;
                    }
                    z10 = false;
                    i11 = 0;
                    j10 = 0;
                    break;
                case 63:
                    if (z(obj, i25, i22)) {
                        P10 = AbstractC2614v0.y0(i25, N(obj, j12));
                        i23 += P10;
                    }
                    z10 = false;
                    i11 = 0;
                    j10 = 0;
                    break;
                case 64:
                    if (z(obj, i25, i22)) {
                        D10 = AbstractC2614v0.w0(i25, 0);
                        i23 += D10;
                    }
                    z10 = false;
                    i11 = 0;
                    j10 = 0;
                    break;
                case 65:
                    if (z(obj, i25, i22)) {
                        P10 = AbstractC2614v0.q0(i25, 0L);
                        i23 += P10;
                    }
                    z10 = false;
                    i11 = 0;
                    j10 = 0;
                    break;
                case 66:
                    if (z(obj, i25, i22)) {
                        P10 = AbstractC2614v0.p0(i25, N(obj, j12));
                        i23 += P10;
                    }
                    z10 = false;
                    i11 = 0;
                    j10 = 0;
                    break;
                case 67:
                    if (z(obj, i25, i22)) {
                        P10 = AbstractC2614v0.i0(i25, P(obj, j12));
                        i23 += P10;
                    }
                    z10 = false;
                    i11 = 0;
                    j10 = 0;
                    break;
                case 68:
                    if (z(obj, i25, i22)) {
                        P10 = AbstractC2614v0.Q(i25, (InterfaceC2609t1) unsafe2.getObject(obj, j12), p(i22));
                        i23 += P10;
                    }
                    z10 = false;
                    i11 = 0;
                    j10 = 0;
                    break;
                default:
                    z10 = false;
                    i11 = 0;
                    j10 = 0;
                    break;
            }
            i22 += 3;
            i15 = i11;
            i13 = 1048575;
            i14 = 1;
        }
        int i29 = i15;
        int j13 = i23 + j(this.f25218o, obj);
        if (!this.f25209f) {
            return j13;
        }
        F0 b10 = this.f25219p.b(obj);
        for (int i30 = i29; i30 < b10.f25021a.j(); i30++) {
            Map.Entry h10 = b10.f25021a.h(i30);
            android.support.v4.media.session.b.a(h10.getKey());
            i29 += F0.h(null, h10.getValue());
        }
        for (Map.Entry entry : b10.f25021a.n()) {
            android.support.v4.media.session.b.a(entry.getKey());
            i29 += F0.h(null, entry.getValue());
        }
        return j13 + i29;
    }

    @Override // com.google.android.gms.internal.vision.K1
    public final void f(Object obj, Object obj2) {
        obj2.getClass();
        for (int i10 = 0; i10 < this.f25204a.length; i10 += 3) {
            int M10 = M(i10);
            long j10 = 1048575 & M10;
            int i11 = this.f25204a[i10];
            switch ((M10 & 267386880) >>> 20) {
                case 0:
                    if (y(obj2, i10)) {
                        h2.f(obj, j10, h2.C(obj2, j10));
                        F(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (y(obj2, i10)) {
                        h2.g(obj, j10, h2.x(obj2, j10));
                        F(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (y(obj2, i10)) {
                        h2.i(obj, j10, h2.o(obj2, j10));
                        F(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (y(obj2, i10)) {
                        h2.i(obj, j10, h2.o(obj2, j10));
                        F(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (y(obj2, i10)) {
                        h2.h(obj, j10, h2.b(obj2, j10));
                        F(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (y(obj2, i10)) {
                        h2.i(obj, j10, h2.o(obj2, j10));
                        F(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (y(obj2, i10)) {
                        h2.h(obj, j10, h2.b(obj2, j10));
                        F(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (y(obj2, i10)) {
                        h2.k(obj, j10, h2.w(obj2, j10));
                        F(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (y(obj2, i10)) {
                        h2.j(obj, j10, h2.F(obj2, j10));
                        F(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    x(obj, obj2, i10);
                    break;
                case RequestError.EVENT_TIMEOUT /* 10 */:
                    if (y(obj2, i10)) {
                        h2.j(obj, j10, h2.F(obj2, j10));
                        F(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (y(obj2, i10)) {
                        h2.h(obj, j10, h2.b(obj2, j10));
                        F(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (y(obj2, i10)) {
                        h2.h(obj, j10, h2.b(obj2, j10));
                        F(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (y(obj2, i10)) {
                        h2.h(obj, j10, h2.b(obj2, j10));
                        F(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                    if (y(obj2, i10)) {
                        h2.i(obj, j10, h2.o(obj2, j10));
                        F(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case HVError.SSL_CONNECT_ERROR /* 15 */:
                    if (y(obj2, i10)) {
                        h2.h(obj, j10, h2.b(obj2, j10));
                        F(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                    if (y(obj2, i10)) {
                        h2.i(obj, j10, h2.o(obj2, j10));
                        F(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                    x(obj, obj2, i10);
                    break;
                case 18:
                case 19:
                case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                case HVError.FACE_DETECTION_ERROR /* 22 */:
                case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                case HVError.LOW_STORAGE_ERROR /* 25 */:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case HVError.INSTRUCTION_ERROR /* 31 */:
                case 32:
                case HVError.GPS_ACCESS_DENIED /* 33 */:
                case 34:
                case HVError.FACE_CAPTURE_TIMEOUT /* 35 */:
                case HVError.HYPER_DOC_DETECT_ERROR /* 36 */:
                case HVError.INVALID_FILE_ERROR /* 37 */:
                case 38:
                case 39:
                case RequestError.NETWORK_FAILURE /* 40 */:
                case RequestError.NO_DEV_KEY /* 41 */:
                case HVError.CONSENT_DENIED /* 42 */:
                case HVError.ENCRYPTION_ERROR /* 43 */:
                case HVError.SDK_CLOSE_ERROR /* 44 */:
                case HVError.PERMISSION_REVOKED_ERROR /* 45 */:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.f25217n.b(obj, obj2, j10);
                    break;
                case 50:
                    L1.n(this.f25220q, obj, obj2, j10);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (z(obj2, i11, i10)) {
                        h2.j(obj, j10, h2.F(obj2, j10));
                        G(obj, i11, i10);
                        break;
                    } else {
                        break;
                    }
                case HVError.DETECTOR_NOT_AVAILABLE_ERROR /* 60 */:
                    I(obj, obj2, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (z(obj2, i11, i10)) {
                        h2.j(obj, j10, h2.F(obj2, j10));
                        G(obj, i11, i10);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    I(obj, obj2, i10);
                    break;
            }
        }
        L1.o(this.f25218o, obj, obj2);
        if (this.f25209f) {
            L1.m(this.f25219p, obj, obj2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        if (com.google.android.gms.internal.vision.L1.q(com.google.android.gms.internal.vision.h2.F(r10, r6), com.google.android.gms.internal.vision.h2.F(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007e, code lost:
    
        if (com.google.android.gms.internal.vision.h2.o(r10, r6) == com.google.android.gms.internal.vision.h2.o(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008f, code lost:
    
        if (com.google.android.gms.internal.vision.h2.b(r10, r6) == com.google.android.gms.internal.vision.h2.b(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a2, code lost:
    
        if (com.google.android.gms.internal.vision.h2.o(r10, r6) == com.google.android.gms.internal.vision.h2.o(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b3, code lost:
    
        if (com.google.android.gms.internal.vision.h2.b(r10, r6) == com.google.android.gms.internal.vision.h2.b(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c4, code lost:
    
        if (com.google.android.gms.internal.vision.h2.b(r10, r6) == com.google.android.gms.internal.vision.h2.b(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d6, code lost:
    
        if (com.google.android.gms.internal.vision.h2.b(r10, r6) == com.google.android.gms.internal.vision.h2.b(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ec, code lost:
    
        if (com.google.android.gms.internal.vision.L1.q(com.google.android.gms.internal.vision.h2.F(r10, r6), com.google.android.gms.internal.vision.h2.F(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0102, code lost:
    
        if (com.google.android.gms.internal.vision.L1.q(com.google.android.gms.internal.vision.h2.F(r10, r6), com.google.android.gms.internal.vision.h2.F(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0118, code lost:
    
        if (com.google.android.gms.internal.vision.L1.q(com.google.android.gms.internal.vision.h2.F(r10, r6), com.google.android.gms.internal.vision.h2.F(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x012a, code lost:
    
        if (com.google.android.gms.internal.vision.h2.w(r10, r6) == com.google.android.gms.internal.vision.h2.w(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x013c, code lost:
    
        if (com.google.android.gms.internal.vision.h2.b(r10, r6) == com.google.android.gms.internal.vision.h2.b(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0150, code lost:
    
        if (com.google.android.gms.internal.vision.h2.o(r10, r6) == com.google.android.gms.internal.vision.h2.o(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0162, code lost:
    
        if (com.google.android.gms.internal.vision.h2.b(r10, r6) == com.google.android.gms.internal.vision.h2.b(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0176, code lost:
    
        if (com.google.android.gms.internal.vision.h2.o(r10, r6) == com.google.android.gms.internal.vision.h2.o(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x018a, code lost:
    
        if (com.google.android.gms.internal.vision.h2.o(r10, r6) == com.google.android.gms.internal.vision.h2.o(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a4, code lost:
    
        if (java.lang.Float.floatToIntBits(com.google.android.gms.internal.vision.h2.x(r10, r6)) == java.lang.Float.floatToIntBits(com.google.android.gms.internal.vision.h2.x(r11, r6))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01c0, code lost:
    
        if (java.lang.Double.doubleToLongBits(com.google.android.gms.internal.vision.h2.C(r10, r6)) == java.lang.Double.doubleToLongBits(com.google.android.gms.internal.vision.h2.C(r11, r6))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        if (com.google.android.gms.internal.vision.L1.q(com.google.android.gms.internal.vision.h2.F(r10, r6), com.google.android.gms.internal.vision.h2.F(r11, r6)) != false) goto L105;
     */
    @Override // com.google.android.gms.internal.vision.K1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(Object obj, Object obj2) {
        int length = this.f25204a.length;
        int i10 = 0;
        while (true) {
            boolean z10 = true;
            if (i10 >= length) {
                if (!this.f25218o.f(obj).equals(this.f25218o.f(obj2))) {
                    return false;
                }
                if (this.f25209f) {
                    return this.f25219p.b(obj).equals(this.f25219p.b(obj2));
                }
                return true;
            }
            int M10 = M(i10);
            long j10 = M10 & 1048575;
            switch ((M10 & 267386880) >>> 20) {
                case 0:
                    if (L(obj, obj2, i10)) {
                        break;
                    }
                    z10 = false;
                    break;
                case 1:
                    if (L(obj, obj2, i10)) {
                        break;
                    }
                    z10 = false;
                    break;
                case 2:
                    if (L(obj, obj2, i10)) {
                        break;
                    }
                    z10 = false;
                    break;
                case 3:
                    if (L(obj, obj2, i10)) {
                        break;
                    }
                    z10 = false;
                    break;
                case 4:
                    if (L(obj, obj2, i10)) {
                        break;
                    }
                    z10 = false;
                    break;
                case 5:
                    if (L(obj, obj2, i10)) {
                        break;
                    }
                    z10 = false;
                    break;
                case 6:
                    if (L(obj, obj2, i10)) {
                        break;
                    }
                    z10 = false;
                    break;
                case 7:
                    if (L(obj, obj2, i10)) {
                        break;
                    }
                    z10 = false;
                    break;
                case 8:
                    if (L(obj, obj2, i10)) {
                        break;
                    }
                    z10 = false;
                    break;
                case 9:
                    if (L(obj, obj2, i10)) {
                        break;
                    }
                    z10 = false;
                    break;
                case RequestError.EVENT_TIMEOUT /* 10 */:
                    if (L(obj, obj2, i10)) {
                        break;
                    }
                    z10 = false;
                    break;
                case 11:
                    if (L(obj, obj2, i10)) {
                        break;
                    }
                    z10 = false;
                    break;
                case 12:
                    if (L(obj, obj2, i10)) {
                        break;
                    }
                    z10 = false;
                    break;
                case 13:
                    if (L(obj, obj2, i10)) {
                        break;
                    }
                    z10 = false;
                    break;
                case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                    if (L(obj, obj2, i10)) {
                        break;
                    }
                    z10 = false;
                    break;
                case HVError.SSL_CONNECT_ERROR /* 15 */:
                    if (L(obj, obj2, i10)) {
                        break;
                    }
                    z10 = false;
                    break;
                case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                    if (L(obj, obj2, i10)) {
                        break;
                    }
                    z10 = false;
                    break;
                case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                    if (L(obj, obj2, i10)) {
                        break;
                    }
                    z10 = false;
                    break;
                case 18:
                case 19:
                case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                case HVError.FACE_DETECTION_ERROR /* 22 */:
                case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                case HVError.LOW_STORAGE_ERROR /* 25 */:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case HVError.INSTRUCTION_ERROR /* 31 */:
                case 32:
                case HVError.GPS_ACCESS_DENIED /* 33 */:
                case 34:
                case HVError.FACE_CAPTURE_TIMEOUT /* 35 */:
                case HVError.HYPER_DOC_DETECT_ERROR /* 36 */:
                case HVError.INVALID_FILE_ERROR /* 37 */:
                case 38:
                case 39:
                case RequestError.NETWORK_FAILURE /* 40 */:
                case RequestError.NO_DEV_KEY /* 41 */:
                case HVError.CONSENT_DENIED /* 42 */:
                case HVError.ENCRYPTION_ERROR /* 43 */:
                case HVError.SDK_CLOSE_ERROR /* 44 */:
                case HVError.PERMISSION_REVOKED_ERROR /* 45 */:
                case 46:
                case 47:
                case 48:
                case 49:
                    z10 = L1.q(h2.F(obj, j10), h2.F(obj2, j10));
                    break;
                case 50:
                    z10 = L1.q(h2.F(obj, j10), h2.F(obj2, j10));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case HVError.DETECTOR_NOT_AVAILABLE_ERROR /* 60 */:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long O10 = O(i10) & 1048575;
                    if (h2.b(obj, O10) == h2.b(obj2, O10)) {
                        break;
                    }
                    z10 = false;
                    break;
            }
            if (!z10) {
                return false;
            }
            i10 += 3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x02ce, code lost:
    
        if (r0 == r5) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02d0, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02d7, code lost:
    
        r15 = r30;
        r14 = r31;
        r12 = r32;
        r13 = r34;
        r11 = r35;
        r2 = r18;
        r10 = r19;
        r1 = r25;
        r6 = r27;
        r7 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0321, code lost:
    
        if (r0 == r15) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0340, code lost:
    
        if (r0 == r15) goto L102;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x0094. Please report as an issue. */
    @Override // com.google.android.gms.internal.vision.K1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(Object obj, byte[] bArr, int i10, int i11, C2555c0 c2555c0) {
        int i12;
        int i13;
        int i14;
        int i15;
        Unsafe unsafe;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        Unsafe unsafe2;
        int i23;
        int i24;
        Unsafe unsafe3;
        Unsafe unsafe4;
        C2621x1 c2621x1 = this;
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i25 = i11;
        C2555c0 c2555c02 = c2555c0;
        if (!c2621x1.f25211h) {
            n(obj, bArr, i10, i11, 0, c2555c0);
            return;
        }
        Unsafe unsafe5 = f25203s;
        int i26 = -1;
        int i27 = 1048575;
        int i28 = i10;
        int i29 = 1048575;
        int i30 = -1;
        int i31 = 0;
        int i32 = 0;
        while (i28 < i25) {
            int i33 = i28 + 1;
            byte b10 = bArr2[i28];
            if (b10 < 0) {
                i13 = AbstractC2551b0.c(b10, bArr2, i33, c2555c02);
                i12 = c2555c02.f25109a;
            } else {
                i12 = b10;
                i13 = i33;
            }
            int i34 = i12 >>> 3;
            int i35 = i12 & 7;
            int i36 = i34 > i30 ? c2621x1.i(i34, i31 / 3) : c2621x1.S(i34);
            if (i36 == i26) {
                i14 = i13;
                i15 = i34;
                unsafe = unsafe5;
                i16 = i26;
                i17 = 0;
            } else {
                int[] iArr = c2621x1.f25204a;
                int i37 = iArr[i36 + 1];
                int i38 = (i37 & 267386880) >>> 20;
                Unsafe unsafe6 = unsafe5;
                long j10 = i37 & i27;
                if (i38 <= 17) {
                    int i39 = iArr[i36 + 2];
                    int i40 = 1 << (i39 >>> 20);
                    int i41 = i39 & 1048575;
                    if (i41 != i29) {
                        if (i29 != 1048575) {
                            long j11 = i29;
                            unsafe4 = unsafe6;
                            unsafe4.putInt(obj2, j11, i32);
                        } else {
                            unsafe4 = unsafe6;
                        }
                        if (i41 != 1048575) {
                            i32 = unsafe4.getInt(obj2, i41);
                        }
                        unsafe2 = unsafe4;
                        i29 = i41;
                    } else {
                        unsafe2 = unsafe6;
                    }
                    switch (i38) {
                        case 0:
                            i15 = i34;
                            i19 = 1048575;
                            i23 = i36;
                            i24 = i13;
                            i18 = i29;
                            unsafe3 = unsafe2;
                            if (i35 != 1) {
                                i14 = i24;
                                unsafe = unsafe3;
                                i17 = i23;
                                i29 = i18;
                                i16 = -1;
                                break;
                            } else {
                                h2.f(obj2, j10, AbstractC2551b0.l(bArr2, i24));
                                i28 = i24 + 8;
                                i32 |= i40;
                                unsafe5 = unsafe3;
                                i31 = i23;
                                i29 = i18;
                                i30 = i15;
                                i27 = i19;
                                i26 = -1;
                                break;
                            }
                        case 1:
                            i15 = i34;
                            i19 = 1048575;
                            i23 = i36;
                            i24 = i13;
                            i18 = i29;
                            unsafe3 = unsafe2;
                            if (i35 != 5) {
                                i14 = i24;
                                unsafe = unsafe3;
                                i17 = i23;
                                i29 = i18;
                                i16 = -1;
                                break;
                            } else {
                                h2.g(obj2, j10, AbstractC2551b0.n(bArr2, i24));
                                i28 = i24 + 4;
                                i32 |= i40;
                                unsafe5 = unsafe3;
                                i31 = i23;
                                i29 = i18;
                                i30 = i15;
                                i27 = i19;
                                i26 = -1;
                                break;
                            }
                        case 2:
                        case 3:
                            i15 = i34;
                            i19 = 1048575;
                            i23 = i36;
                            i24 = i13;
                            i18 = i29;
                            unsafe3 = unsafe2;
                            if (i35 != 0) {
                                i14 = i24;
                                unsafe = unsafe3;
                                i17 = i23;
                                i29 = i18;
                                i16 = -1;
                                break;
                            } else {
                                int j12 = AbstractC2551b0.j(bArr2, i24, c2555c02);
                                unsafe3.putLong(obj, j10, c2555c02.f25110b);
                                i32 |= i40;
                                unsafe5 = unsafe3;
                                i31 = i23;
                                i28 = j12;
                                i29 = i18;
                                i30 = i15;
                                i27 = i19;
                                i26 = -1;
                                break;
                            }
                        case 4:
                        case 11:
                            i15 = i34;
                            i19 = 1048575;
                            i23 = i36;
                            i24 = i13;
                            i18 = i29;
                            unsafe3 = unsafe2;
                            if (i35 != 0) {
                                i14 = i24;
                                unsafe = unsafe3;
                                i17 = i23;
                                i29 = i18;
                                i16 = -1;
                                break;
                            } else {
                                i28 = AbstractC2551b0.h(bArr2, i24, c2555c02);
                                unsafe3.putInt(obj2, j10, c2555c02.f25109a);
                                i32 |= i40;
                                unsafe5 = unsafe3;
                                i31 = i23;
                                i29 = i18;
                                i30 = i15;
                                i27 = i19;
                                i26 = -1;
                                break;
                            }
                        case 5:
                        case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                            i15 = i34;
                            i19 = 1048575;
                            i23 = i36;
                            i18 = i29;
                            unsafe3 = unsafe2;
                            if (i35 != 1) {
                                i24 = i13;
                                i14 = i24;
                                unsafe = unsafe3;
                                i17 = i23;
                                i29 = i18;
                                i16 = -1;
                                break;
                            } else {
                                unsafe3.putLong(obj, j10, AbstractC2551b0.k(bArr2, i13));
                                i28 = i13 + 8;
                                i32 |= i40;
                                unsafe5 = unsafe3;
                                i31 = i23;
                                i29 = i18;
                                i30 = i15;
                                i27 = i19;
                                i26 = -1;
                                break;
                            }
                        case 6:
                        case 13:
                            i15 = i34;
                            i19 = 1048575;
                            i23 = i36;
                            i18 = i29;
                            unsafe3 = unsafe2;
                            if (i35 != 5) {
                                i24 = i13;
                                i14 = i24;
                                unsafe = unsafe3;
                                i17 = i23;
                                i29 = i18;
                                i16 = -1;
                                break;
                            } else {
                                unsafe3.putInt(obj2, j10, AbstractC2551b0.g(bArr2, i13));
                                i28 = i13 + 4;
                                i32 |= i40;
                                unsafe5 = unsafe3;
                                i31 = i23;
                                i29 = i18;
                                i30 = i15;
                                i27 = i19;
                                i26 = -1;
                                break;
                            }
                        case 7:
                            i15 = i34;
                            i19 = 1048575;
                            i23 = i36;
                            i18 = i29;
                            unsafe3 = unsafe2;
                            if (i35 != 0) {
                                i24 = i13;
                                i14 = i24;
                                unsafe = unsafe3;
                                i17 = i23;
                                i29 = i18;
                                i16 = -1;
                                break;
                            } else {
                                i28 = AbstractC2551b0.j(bArr2, i13, c2555c02);
                                h2.k(obj2, j10, c2555c02.f25110b != 0);
                                i32 |= i40;
                                unsafe5 = unsafe3;
                                i31 = i23;
                                i29 = i18;
                                i30 = i15;
                                i27 = i19;
                                i26 = -1;
                                break;
                            }
                        case 8:
                            i15 = i34;
                            i19 = 1048575;
                            i23 = i36;
                            i18 = i29;
                            unsafe3 = unsafe2;
                            if (i35 != 2) {
                                i24 = i13;
                                i14 = i24;
                                unsafe = unsafe3;
                                i17 = i23;
                                i29 = i18;
                                i16 = -1;
                                break;
                            } else {
                                i28 = (i37 & 536870912) == 0 ? AbstractC2551b0.m(bArr2, i13, c2555c02) : AbstractC2551b0.o(bArr2, i13, c2555c02);
                                unsafe3.putObject(obj2, j10, c2555c02.f25111c);
                                i32 |= i40;
                                unsafe5 = unsafe3;
                                i31 = i23;
                                i29 = i18;
                                i30 = i15;
                                i27 = i19;
                                i26 = -1;
                                break;
                            }
                        case 9:
                            i15 = i34;
                            i19 = 1048575;
                            i23 = i36;
                            i18 = i29;
                            unsafe3 = unsafe2;
                            if (i35 != 2) {
                                i24 = i13;
                                i14 = i24;
                                unsafe = unsafe3;
                                i17 = i23;
                                i29 = i18;
                                i16 = -1;
                                break;
                            } else {
                                i28 = AbstractC2551b0.f(c2621x1.p(i23), bArr2, i13, i25, c2555c02);
                                Object object = unsafe3.getObject(obj2, j10);
                                if (object == null) {
                                    unsafe3.putObject(obj2, j10, c2555c02.f25111c);
                                } else {
                                    unsafe3.putObject(obj2, j10, R0.e(object, c2555c02.f25111c));
                                }
                                i32 |= i40;
                                unsafe5 = unsafe3;
                                i31 = i23;
                                i29 = i18;
                                i30 = i15;
                                i27 = i19;
                                i26 = -1;
                                break;
                            }
                        case RequestError.EVENT_TIMEOUT /* 10 */:
                            i15 = i34;
                            i19 = 1048575;
                            i23 = i36;
                            i18 = i29;
                            unsafe3 = unsafe2;
                            if (i35 != 2) {
                                i24 = i13;
                                i14 = i24;
                                unsafe = unsafe3;
                                i17 = i23;
                                i29 = i18;
                                i16 = -1;
                                break;
                            } else {
                                i28 = AbstractC2551b0.p(bArr2, i13, c2555c02);
                                unsafe3.putObject(obj2, j10, c2555c02.f25111c);
                                i32 |= i40;
                                unsafe5 = unsafe3;
                                i31 = i23;
                                i29 = i18;
                                i30 = i15;
                                i27 = i19;
                                i26 = -1;
                                break;
                            }
                        case 12:
                            i15 = i34;
                            i19 = 1048575;
                            i23 = i36;
                            i18 = i29;
                            unsafe3 = unsafe2;
                            if (i35 != 0) {
                                i24 = i13;
                                i14 = i24;
                                unsafe = unsafe3;
                                i17 = i23;
                                i29 = i18;
                                i16 = -1;
                                break;
                            } else {
                                i28 = AbstractC2551b0.h(bArr2, i13, c2555c02);
                                unsafe3.putInt(obj2, j10, c2555c02.f25109a);
                                i32 |= i40;
                                unsafe5 = unsafe3;
                                i31 = i23;
                                i29 = i18;
                                i30 = i15;
                                i27 = i19;
                                i26 = -1;
                                break;
                            }
                        case HVError.SSL_CONNECT_ERROR /* 15 */:
                            i15 = i34;
                            i19 = 1048575;
                            i23 = i36;
                            i18 = i29;
                            unsafe3 = unsafe2;
                            if (i35 != 0) {
                                i24 = i13;
                                i14 = i24;
                                unsafe = unsafe3;
                                i17 = i23;
                                i29 = i18;
                                i16 = -1;
                                break;
                            } else {
                                i28 = AbstractC2551b0.h(bArr2, i13, c2555c02);
                                unsafe3.putInt(obj2, j10, AbstractC2608t0.d(c2555c02.f25109a));
                                i32 |= i40;
                                unsafe5 = unsafe3;
                                i31 = i23;
                                i29 = i18;
                                i30 = i15;
                                i27 = i19;
                                i26 = -1;
                                break;
                            }
                        case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                            if (i35 != 0) {
                                i15 = i34;
                                i18 = i29;
                                unsafe3 = unsafe2;
                                i24 = i13;
                                i23 = i36;
                                i14 = i24;
                                unsafe = unsafe3;
                                i17 = i23;
                                i29 = i18;
                                i16 = -1;
                                break;
                            } else {
                                int j13 = AbstractC2551b0.j(bArr2, i13, c2555c02);
                                i18 = i29;
                                i15 = i34;
                                i19 = 1048575;
                                unsafe2.putLong(obj, j10, AbstractC2608t0.a(c2555c02.f25110b));
                                i32 |= i40;
                                unsafe5 = unsafe2;
                                i31 = i36;
                                i28 = j13;
                                i29 = i18;
                                i30 = i15;
                                i27 = i19;
                                i26 = -1;
                                break;
                            }
                        default:
                            i15 = i34;
                            i23 = i36;
                            i24 = i13;
                            i18 = i29;
                            unsafe3 = unsafe2;
                            i14 = i24;
                            unsafe = unsafe3;
                            i17 = i23;
                            i29 = i18;
                            i16 = -1;
                            break;
                    }
                } else {
                    i15 = i34;
                    int i42 = i13;
                    i18 = i29;
                    i19 = 1048575;
                    if (i38 != 27) {
                        i17 = i36;
                        if (i38 <= 49) {
                            i21 = i32;
                            i22 = i18;
                            unsafe = unsafe6;
                            i16 = -1;
                            i28 = l(obj, bArr, i42, i11, i12, i15, i35, i17, i37, i38, j10, c2555c0);
                        } else {
                            i20 = i42;
                            i21 = i32;
                            unsafe = unsafe6;
                            i22 = i18;
                            i16 = -1;
                            if (i38 != 50) {
                                i28 = k(obj, bArr, i20, i11, i12, i15, i35, i37, i38, j10, i17, c2555c0);
                            } else if (i35 == 2) {
                                i28 = m(obj, bArr, i20, i11, i17, j10, c2555c0);
                            }
                        }
                        unsafe5 = unsafe;
                        i27 = 1048575;
                    } else if (i35 == 2) {
                        X0 x02 = (X0) unsafe6.getObject(obj2, j10);
                        if (!x02.zza()) {
                            int size = x02.size();
                            x02 = x02.b(size == 0 ? 10 : size << 1);
                            unsafe6.putObject(obj2, j10, x02);
                        }
                        i28 = AbstractC2551b0.d(c2621x1.p(i36), i12, bArr, i42, i11, x02, c2555c0);
                        unsafe5 = unsafe6;
                        i32 = i32;
                        i31 = i36;
                        i29 = i18;
                        i30 = i15;
                        i27 = i19;
                        i26 = -1;
                    } else {
                        i17 = i36;
                        i20 = i42;
                        i21 = i32;
                        unsafe = unsafe6;
                        i22 = i18;
                        i16 = -1;
                    }
                    i14 = i20;
                    i32 = i21;
                    i29 = i22;
                }
            }
            i28 = AbstractC2551b0.b(i12, bArr, i14, i11, Q(obj), c2555c0);
            c2621x1 = this;
            obj2 = obj;
            bArr2 = bArr;
            i25 = i11;
            c2555c02 = c2555c0;
            i31 = i17;
            i26 = i16;
            i30 = i15;
            unsafe5 = unsafe;
            i27 = 1048575;
        }
        int i43 = i32;
        Unsafe unsafe7 = unsafe5;
        if (i29 != i27) {
            unsafe7.putInt(obj, i29, i43);
        }
        if (i28 != i11) {
            throw W0.e();
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:107:0x008d. Please report as an issue. */
    final int n(Object obj, byte[] bArr, int i10, int i11, int i12, C2555c0 c2555c0) {
        Unsafe unsafe;
        int i13;
        C2621x1 c2621x1;
        int i14;
        Object obj2;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        C2555c0 c2555c02;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int j10;
        int i27;
        int i28;
        int i29;
        int i30;
        C2621x1 c2621x12 = this;
        Object obj3 = obj;
        byte[] bArr2 = bArr;
        int i31 = i11;
        int i32 = i12;
        C2555c0 c2555c03 = c2555c0;
        Unsafe unsafe2 = f25203s;
        int i33 = i10;
        int i34 = 0;
        int i35 = 0;
        int i36 = 0;
        int i37 = -1;
        int i38 = 1048575;
        while (true) {
            if (i33 < i31) {
                int i39 = i33 + 1;
                byte b10 = bArr2[i33];
                if (b10 < 0) {
                    int c10 = AbstractC2551b0.c(b10, bArr2, i39, c2555c03);
                    i15 = c2555c03.f25109a;
                    i39 = c10;
                } else {
                    i15 = b10;
                }
                int i40 = i15 >>> 3;
                int i41 = i15 & 7;
                int i42 = i40 > i37 ? c2621x12.i(i40, i34 / 3) : c2621x12.S(i40);
                if (i42 == -1) {
                    i16 = i40;
                    i17 = i39;
                    i18 = i15;
                    i19 = i36;
                    unsafe = unsafe2;
                    i13 = i32;
                    i20 = 0;
                } else {
                    int[] iArr = c2621x12.f25204a;
                    int i43 = iArr[i42 + 1];
                    int i44 = (i43 & 267386880) >>> 20;
                    int i45 = i15;
                    long j11 = i43 & 1048575;
                    if (i44 <= 17) {
                        int i46 = iArr[i42 + 2];
                        int i47 = 1 << (i46 >>> 20);
                        int i48 = i46 & 1048575;
                        if (i48 != i38) {
                            if (i38 != 1048575) {
                                unsafe2.putInt(obj3, i38, i36);
                            }
                            i36 = unsafe2.getInt(obj3, i48);
                            i22 = i48;
                        } else {
                            i22 = i38;
                        }
                        int i49 = i36;
                        switch (i44) {
                            case 0:
                                i23 = i40;
                                i24 = i22;
                                i25 = i45;
                                bArr2 = bArr;
                                i26 = i42;
                                if (i41 == 1) {
                                    h2.f(obj3, j11, AbstractC2551b0.l(bArr2, i39));
                                    i33 = i39 + 8;
                                    i36 = i49 | i47;
                                    i38 = i24;
                                    i35 = i25;
                                    i37 = i23;
                                    i34 = i26;
                                    i31 = i11;
                                    i32 = i12;
                                    break;
                                } else {
                                    i17 = i39;
                                    i19 = i49;
                                    i18 = i25;
                                    unsafe = unsafe2;
                                    i20 = i26;
                                    i38 = i24;
                                    i13 = i12;
                                    i16 = i23;
                                    break;
                                }
                            case 1:
                                i23 = i40;
                                i24 = i22;
                                i25 = i45;
                                bArr2 = bArr;
                                i26 = i42;
                                if (i41 == 5) {
                                    h2.g(obj3, j11, AbstractC2551b0.n(bArr2, i39));
                                    i33 = i39 + 4;
                                    i36 = i49 | i47;
                                    i38 = i24;
                                    i35 = i25;
                                    i37 = i23;
                                    i34 = i26;
                                    i31 = i11;
                                    i32 = i12;
                                    break;
                                } else {
                                    i17 = i39;
                                    i19 = i49;
                                    i18 = i25;
                                    unsafe = unsafe2;
                                    i20 = i26;
                                    i38 = i24;
                                    i13 = i12;
                                    i16 = i23;
                                    break;
                                }
                            case 2:
                            case 3:
                                i23 = i40;
                                i24 = i22;
                                i25 = i45;
                                bArr2 = bArr;
                                i26 = i42;
                                if (i41 == 0) {
                                    j10 = AbstractC2551b0.j(bArr2, i39, c2555c03);
                                    unsafe2.putLong(obj, j11, c2555c03.f25110b);
                                    i36 = i49 | i47;
                                    i38 = i24;
                                    i35 = i25;
                                    i33 = j10;
                                    i37 = i23;
                                    i34 = i26;
                                    i31 = i11;
                                    i32 = i12;
                                    break;
                                } else {
                                    i17 = i39;
                                    i19 = i49;
                                    i18 = i25;
                                    unsafe = unsafe2;
                                    i20 = i26;
                                    i38 = i24;
                                    i13 = i12;
                                    i16 = i23;
                                    break;
                                }
                            case 4:
                            case 11:
                                i23 = i40;
                                i24 = i22;
                                i25 = i45;
                                bArr2 = bArr;
                                i26 = i42;
                                if (i41 == 0) {
                                    i33 = AbstractC2551b0.h(bArr2, i39, c2555c03);
                                    unsafe2.putInt(obj3, j11, c2555c03.f25109a);
                                    i36 = i49 | i47;
                                    i38 = i24;
                                    i35 = i25;
                                    i37 = i23;
                                    i34 = i26;
                                    i31 = i11;
                                    i32 = i12;
                                    break;
                                } else {
                                    i17 = i39;
                                    i19 = i49;
                                    i18 = i25;
                                    unsafe = unsafe2;
                                    i20 = i26;
                                    i38 = i24;
                                    i13 = i12;
                                    i16 = i23;
                                    break;
                                }
                            case 5:
                            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                                i23 = i40;
                                i24 = i22;
                                i25 = i45;
                                bArr2 = bArr;
                                i26 = i42;
                                if (i41 == 1) {
                                    unsafe2.putLong(obj, j11, AbstractC2551b0.k(bArr2, i39));
                                    i33 = i39 + 8;
                                    i36 = i49 | i47;
                                    i38 = i24;
                                    i35 = i25;
                                    i37 = i23;
                                    i34 = i26;
                                    i31 = i11;
                                    i32 = i12;
                                    break;
                                } else {
                                    i17 = i39;
                                    i19 = i49;
                                    i18 = i25;
                                    unsafe = unsafe2;
                                    i20 = i26;
                                    i38 = i24;
                                    i13 = i12;
                                    i16 = i23;
                                    break;
                                }
                            case 6:
                            case 13:
                                i23 = i40;
                                i24 = i22;
                                i25 = i45;
                                bArr2 = bArr;
                                i26 = i42;
                                i27 = i11;
                                if (i41 == 5) {
                                    unsafe2.putInt(obj3, j11, AbstractC2551b0.g(bArr2, i39));
                                    i33 = i39 + 4;
                                    i36 = i49 | i47;
                                    i38 = i24;
                                    i35 = i25;
                                    i37 = i23;
                                    i32 = i12;
                                    int i50 = i26;
                                    i31 = i27;
                                    i34 = i50;
                                    break;
                                } else {
                                    i17 = i39;
                                    i19 = i49;
                                    i18 = i25;
                                    unsafe = unsafe2;
                                    i20 = i26;
                                    i38 = i24;
                                    i13 = i12;
                                    i16 = i23;
                                    break;
                                }
                            case 7:
                                i23 = i40;
                                i24 = i22;
                                i25 = i45;
                                bArr2 = bArr;
                                i26 = i42;
                                i27 = i11;
                                if (i41 == 0) {
                                    int j12 = AbstractC2551b0.j(bArr2, i39, c2555c03);
                                    h2.k(obj3, j11, c2555c03.f25110b != 0);
                                    i36 = i49 | i47;
                                    i38 = i24;
                                    i33 = j12;
                                    i35 = i25;
                                    i37 = i23;
                                    i32 = i12;
                                    int i502 = i26;
                                    i31 = i27;
                                    i34 = i502;
                                    break;
                                } else {
                                    i17 = i39;
                                    i19 = i49;
                                    i18 = i25;
                                    unsafe = unsafe2;
                                    i20 = i26;
                                    i38 = i24;
                                    i13 = i12;
                                    i16 = i23;
                                    break;
                                }
                            case 8:
                                i23 = i40;
                                i24 = i22;
                                i25 = i45;
                                bArr2 = bArr;
                                i26 = i42;
                                i27 = i11;
                                if (i41 == 2) {
                                    i33 = (i43 & 536870912) == 0 ? AbstractC2551b0.m(bArr2, i39, c2555c03) : AbstractC2551b0.o(bArr2, i39, c2555c03);
                                    unsafe2.putObject(obj3, j11, c2555c03.f25111c);
                                    i36 = i49 | i47;
                                    i38 = i24;
                                    i35 = i25;
                                    i37 = i23;
                                    i32 = i12;
                                    int i5022 = i26;
                                    i31 = i27;
                                    i34 = i5022;
                                    break;
                                } else {
                                    i17 = i39;
                                    i19 = i49;
                                    i18 = i25;
                                    unsafe = unsafe2;
                                    i20 = i26;
                                    i38 = i24;
                                    i13 = i12;
                                    i16 = i23;
                                    break;
                                }
                            case 9:
                                i23 = i40;
                                i24 = i22;
                                i25 = i45;
                                bArr2 = bArr;
                                i26 = i42;
                                if (i41 == 2) {
                                    i27 = i11;
                                    i33 = AbstractC2551b0.f(c2621x12.p(i26), bArr2, i39, i27, c2555c03);
                                    if ((i49 & i47) == 0) {
                                        unsafe2.putObject(obj3, j11, c2555c03.f25111c);
                                    } else {
                                        unsafe2.putObject(obj3, j11, R0.e(unsafe2.getObject(obj3, j11), c2555c03.f25111c));
                                    }
                                    i36 = i49 | i47;
                                    i38 = i24;
                                    i35 = i25;
                                    i37 = i23;
                                    i32 = i12;
                                    int i50222 = i26;
                                    i31 = i27;
                                    i34 = i50222;
                                    break;
                                } else {
                                    i17 = i39;
                                    i19 = i49;
                                    i18 = i25;
                                    unsafe = unsafe2;
                                    i20 = i26;
                                    i38 = i24;
                                    i13 = i12;
                                    i16 = i23;
                                    break;
                                }
                            case RequestError.EVENT_TIMEOUT /* 10 */:
                                i23 = i40;
                                i24 = i22;
                                i25 = i45;
                                bArr2 = bArr;
                                i26 = i42;
                                if (i41 == 2) {
                                    i33 = AbstractC2551b0.p(bArr2, i39, c2555c03);
                                    unsafe2.putObject(obj3, j11, c2555c03.f25111c);
                                    i36 = i49 | i47;
                                    i38 = i24;
                                    i35 = i25;
                                    i37 = i23;
                                    i34 = i26;
                                    i31 = i11;
                                    i32 = i12;
                                    break;
                                } else {
                                    i17 = i39;
                                    i19 = i49;
                                    i18 = i25;
                                    unsafe = unsafe2;
                                    i20 = i26;
                                    i38 = i24;
                                    i13 = i12;
                                    i16 = i23;
                                    break;
                                }
                            case 12:
                                i23 = i40;
                                i24 = i22;
                                i25 = i45;
                                bArr2 = bArr;
                                i26 = i42;
                                if (i41 != 0) {
                                    i17 = i39;
                                    i19 = i49;
                                    i18 = i25;
                                    unsafe = unsafe2;
                                    i20 = i26;
                                    i38 = i24;
                                    i13 = i12;
                                    i16 = i23;
                                    break;
                                } else {
                                    i33 = AbstractC2551b0.h(bArr2, i39, c2555c03);
                                    int i51 = c2555c03.f25109a;
                                    S0 K10 = c2621x12.K(i26);
                                    if (K10 == null || K10.b(i51)) {
                                        unsafe2.putInt(obj3, j11, i51);
                                        i36 = i49 | i47;
                                        i38 = i24;
                                        i35 = i25;
                                        i37 = i23;
                                        i34 = i26;
                                        i31 = i11;
                                        i32 = i12;
                                        break;
                                    } else {
                                        Q(obj).c(i25, Long.valueOf(i51));
                                        i36 = i49;
                                        i35 = i25;
                                        i37 = i23;
                                        i34 = i26;
                                        i38 = i24;
                                        i31 = i11;
                                        i32 = i12;
                                    }
                                }
                                break;
                            case HVError.SSL_CONNECT_ERROR /* 15 */:
                                i23 = i40;
                                i24 = i22;
                                i25 = i45;
                                bArr2 = bArr;
                                i26 = i42;
                                if (i41 == 0) {
                                    i33 = AbstractC2551b0.h(bArr2, i39, c2555c03);
                                    unsafe2.putInt(obj3, j11, AbstractC2608t0.d(c2555c03.f25109a));
                                    i36 = i49 | i47;
                                    i38 = i24;
                                    i35 = i25;
                                    i37 = i23;
                                    i34 = i26;
                                    i31 = i11;
                                    i32 = i12;
                                    break;
                                } else {
                                    i17 = i39;
                                    i19 = i49;
                                    i18 = i25;
                                    unsafe = unsafe2;
                                    i20 = i26;
                                    i38 = i24;
                                    i13 = i12;
                                    i16 = i23;
                                    break;
                                }
                            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                                i23 = i40;
                                i24 = i22;
                                i25 = i45;
                                if (i41 == 0) {
                                    bArr2 = bArr;
                                    j10 = AbstractC2551b0.j(bArr2, i39, c2555c03);
                                    i26 = i42;
                                    unsafe2.putLong(obj, j11, AbstractC2608t0.a(c2555c03.f25110b));
                                    i36 = i49 | i47;
                                    i38 = i24;
                                    i35 = i25;
                                    i33 = j10;
                                    i37 = i23;
                                    i34 = i26;
                                    i31 = i11;
                                    i32 = i12;
                                    break;
                                } else {
                                    i26 = i42;
                                    i17 = i39;
                                    i19 = i49;
                                    i18 = i25;
                                    unsafe = unsafe2;
                                    i20 = i26;
                                    i38 = i24;
                                    i13 = i12;
                                    i16 = i23;
                                    break;
                                }
                            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                                if (i41 == 3) {
                                    int i52 = i22;
                                    i33 = AbstractC2551b0.e(c2621x12.p(i42), bArr, i39, i11, (i40 << 3) | 4, c2555c0);
                                    if ((i49 & i47) == 0) {
                                        unsafe2.putObject(obj3, j11, c2555c03.f25111c);
                                    } else {
                                        unsafe2.putObject(obj3, j11, R0.e(unsafe2.getObject(obj3, j11), c2555c03.f25111c));
                                    }
                                    i36 = i49 | i47;
                                    bArr2 = bArr;
                                    i38 = i52;
                                    i31 = i11;
                                    i35 = i45;
                                    i34 = i42;
                                    i37 = i40;
                                    i32 = i12;
                                    break;
                                } else {
                                    i23 = i40;
                                    i24 = i22;
                                    i25 = i45;
                                    i26 = i42;
                                    i17 = i39;
                                    i19 = i49;
                                    i18 = i25;
                                    unsafe = unsafe2;
                                    i20 = i26;
                                    i38 = i24;
                                    i13 = i12;
                                    i16 = i23;
                                    break;
                                }
                            default:
                                i23 = i40;
                                i26 = i42;
                                i24 = i22;
                                i25 = i45;
                                i17 = i39;
                                i19 = i49;
                                i18 = i25;
                                unsafe = unsafe2;
                                i20 = i26;
                                i38 = i24;
                                i13 = i12;
                                i16 = i23;
                                break;
                        }
                    } else {
                        bArr2 = bArr;
                        if (i44 != 27) {
                            i19 = i36;
                            i28 = i38;
                            if (i44 <= 49) {
                                int i53 = i39;
                                i16 = i40;
                                i30 = i45;
                                unsafe = unsafe2;
                                i20 = i42;
                                i33 = l(obj, bArr, i39, i11, i45, i16, i41, i42, i43, i44, j11, c2555c0);
                                if (i33 == i53) {
                                    i13 = i12;
                                    i17 = i33;
                                    i38 = i28;
                                    i18 = i30;
                                } else {
                                    c2621x12 = this;
                                    obj3 = obj;
                                    bArr2 = bArr;
                                    i37 = i16;
                                    i31 = i11;
                                    i32 = i12;
                                    c2555c03 = c2555c0;
                                    i34 = i20;
                                    i36 = i19;
                                    i38 = i28;
                                    i35 = i30;
                                    unsafe2 = unsafe;
                                }
                            } else {
                                i29 = i39;
                                i16 = i40;
                                i30 = i45;
                                unsafe = unsafe2;
                                i20 = i42;
                                if (i44 != 50) {
                                    i33 = k(obj, bArr, i29, i11, i30, i16, i41, i43, i44, j11, i20, c2555c0);
                                    if (i33 != i29) {
                                        c2621x12 = this;
                                        obj3 = obj;
                                        bArr2 = bArr;
                                        i31 = i11;
                                        c2555c03 = c2555c0;
                                        i35 = i30;
                                        i37 = i16;
                                        i34 = i20;
                                        i36 = i19;
                                        i38 = i28;
                                        unsafe2 = unsafe;
                                        i32 = i12;
                                    }
                                } else if (i41 == 2) {
                                    i33 = m(obj, bArr, i29, i11, i20, j11, c2555c0);
                                    if (i33 != i29) {
                                        c2621x12 = this;
                                        obj3 = obj;
                                        bArr2 = bArr;
                                        i37 = i16;
                                        i31 = i11;
                                        i32 = i12;
                                        c2555c03 = c2555c0;
                                        i34 = i20;
                                        i36 = i19;
                                        i38 = i28;
                                        i35 = i30;
                                        unsafe2 = unsafe;
                                    }
                                }
                                i13 = i12;
                                i17 = i33;
                                i38 = i28;
                                i18 = i30;
                            }
                        } else if (i41 == 2) {
                            X0 x02 = (X0) unsafe2.getObject(obj3, j11);
                            if (!x02.zza()) {
                                int size = x02.size();
                                x02 = x02.b(size == 0 ? 10 : size << 1);
                                unsafe2.putObject(obj3, j11, x02);
                            }
                            i33 = AbstractC2551b0.d(c2621x12.p(i42), i45, bArr, i39, i11, x02, c2555c0);
                            i35 = i45;
                            i37 = i40;
                            i34 = i42;
                            i36 = i36;
                            i38 = i38;
                            i31 = i11;
                            i32 = i12;
                        } else {
                            i19 = i36;
                            i28 = i38;
                            i29 = i39;
                            i16 = i40;
                            i30 = i45;
                            unsafe = unsafe2;
                            i20 = i42;
                        }
                        i13 = i12;
                        i17 = i29;
                        i38 = i28;
                        i18 = i30;
                    }
                }
                if (i18 != i13 || i13 == 0) {
                    if (this.f25209f) {
                        c2555c02 = c2555c0;
                        if (c2555c02.f25112d != A0.b()) {
                            i21 = i16;
                            c2555c02.f25112d.a(this.f25208e, i21);
                            i33 = AbstractC2551b0.b(i18, bArr, i17, i11, Q(obj), c2555c0);
                            obj3 = obj;
                            bArr2 = bArr;
                            i31 = i11;
                            i35 = i18;
                            c2621x12 = this;
                            c2555c03 = c2555c02;
                            i37 = i21;
                            i34 = i20;
                            i36 = i19;
                            unsafe2 = unsafe;
                            i32 = i13;
                        } else {
                            i21 = i16;
                        }
                    } else {
                        i21 = i16;
                        c2555c02 = c2555c0;
                    }
                    i33 = AbstractC2551b0.b(i18, bArr, i17, i11, Q(obj), c2555c0);
                    obj3 = obj;
                    bArr2 = bArr;
                    i31 = i11;
                    i35 = i18;
                    c2621x12 = this;
                    c2555c03 = c2555c02;
                    i37 = i21;
                    i34 = i20;
                    i36 = i19;
                    unsafe2 = unsafe;
                    i32 = i13;
                } else {
                    i14 = 1048575;
                    c2621x1 = this;
                    i33 = i17;
                    i35 = i18;
                    i36 = i19;
                }
            } else {
                unsafe = unsafe2;
                i13 = i32;
                c2621x1 = c2621x12;
                i14 = 1048575;
            }
        }
        if (i38 != i14) {
            obj2 = obj;
            unsafe.putInt(obj2, i38, i36);
        } else {
            obj2 = obj;
        }
        C2561d2 c2561d2 = null;
        for (int i54 = c2621x1.f25214k; i54 < c2621x1.f25215l; i54++) {
            c2561d2 = (C2561d2) c2621x1.r(obj2, c2621x1.f25213j[i54], c2561d2, c2621x1.f25218o);
        }
        if (c2561d2 != null) {
            c2621x1.f25218o.h(obj2, c2561d2);
        }
        if (i13 == 0) {
            if (i33 != i11) {
                throw W0.e();
            }
        } else if (i33 > i11 || i35 != i13) {
            throw W0.e();
        }
        return i33;
    }

    @Override // com.google.android.gms.internal.vision.K1
    public final Object zza() {
        return this.f25216m.b(this.f25208e);
    }
}
