package com.google.android.gms.internal.clearcut;

import co.hyperverge.hypersnapsdk.activities.HVRetakeActivity;
import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;
import com.google.android.gms.internal.clearcut.AbstractC2109a0;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.conscrypt.BuildConfig;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
final class F0 implements R0 {

    /* renamed from: s, reason: collision with root package name */
    private static final Unsafe f23806s = AbstractC2125f1.z();

    /* renamed from: a, reason: collision with root package name */
    private final int[] f23807a;

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f23808b;

    /* renamed from: c, reason: collision with root package name */
    private final int f23809c;

    /* renamed from: d, reason: collision with root package name */
    private final int f23810d;

    /* renamed from: e, reason: collision with root package name */
    private final int f23811e;

    /* renamed from: f, reason: collision with root package name */
    private final B0 f23812f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f23813g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f23814h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f23815i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f23816j;

    /* renamed from: k, reason: collision with root package name */
    private final int[] f23817k;

    /* renamed from: l, reason: collision with root package name */
    private final int[] f23818l;

    /* renamed from: m, reason: collision with root package name */
    private final int[] f23819m;

    /* renamed from: n, reason: collision with root package name */
    private final H0 f23820n;

    /* renamed from: o, reason: collision with root package name */
    private final AbstractC2142l0 f23821o;

    /* renamed from: p, reason: collision with root package name */
    private final Y0 f23822p;

    /* renamed from: q, reason: collision with root package name */
    private final P f23823q;

    /* renamed from: r, reason: collision with root package name */
    private final InterfaceC2174w0 f23824r;

    private F0(int[] iArr, Object[] objArr, int i10, int i11, int i12, B0 b02, boolean z10, boolean z11, int[] iArr2, int[] iArr3, int[] iArr4, H0 h02, AbstractC2142l0 abstractC2142l0, Y0 y02, P p10, InterfaceC2174w0 interfaceC2174w0) {
        this.f23807a = iArr;
        this.f23808b = objArr;
        this.f23809c = i10;
        this.f23810d = i11;
        this.f23811e = i12;
        this.f23814h = b02 instanceof AbstractC2109a0;
        this.f23815i = z10;
        this.f23813g = p10 != null && p10.g(b02);
        this.f23816j = false;
        this.f23817k = iArr2;
        this.f23818l = iArr3;
        this.f23819m = iArr4;
        this.f23820n = h02;
        this.f23821o = abstractC2142l0;
        this.f23822p = y02;
        this.f23823q = p10;
        this.f23812f = b02;
        this.f23824r = interfaceC2174w0;
    }

    private final boolean A(Object obj, int i10, int i11, int i12) {
        return this.f23815i ? y(obj, i10) : (i11 & i12) != 0;
    }

    private static boolean B(Object obj, int i10, R0 r02) {
        return r02.i(AbstractC2125f1.M(obj, i10 & 1048575));
    }

    private final R0 C(int i10) {
        int i11 = (i10 / 4) << 1;
        R0 r02 = (R0) this.f23808b[i11];
        if (r02 != null) {
            return r02;
        }
        R0 b10 = M0.a().b((Class) this.f23808b[i11 + 1]);
        this.f23808b[i11] = b10;
        return b10;
    }

    private final Object D(int i10) {
        return this.f23808b[(i10 / 4) << 1];
    }

    private final InterfaceC2121e0 E(int i10) {
        return (InterfaceC2121e0) this.f23808b[((i10 / 4) << 1) + 1];
    }

    private final int F(int i10) {
        return this.f23807a[i10 + 1];
    }

    private final int G(int i10) {
        return this.f23807a[i10 + 2];
    }

    private final int H(int i10) {
        int i11 = this.f23809c;
        if (i10 >= i11) {
            int i12 = this.f23811e;
            if (i10 < i12) {
                int i13 = (i10 - i11) << 2;
                if (this.f23807a[i13] == i10) {
                    return i13;
                }
                return -1;
            }
            if (i10 <= this.f23810d) {
                int i14 = i12 - i11;
                int length = (this.f23807a.length / 4) - 1;
                while (i14 <= length) {
                    int i15 = (length + i14) >>> 1;
                    int i16 = i15 << 2;
                    int i17 = this.f23807a[i16];
                    if (i10 == i17) {
                        return i16;
                    }
                    if (i10 < i17) {
                        length = i15 - 1;
                    } else {
                        i14 = i15 + 1;
                    }
                }
            }
        }
        return -1;
    }

    private final void I(Object obj, int i10) {
        if (this.f23815i) {
            return;
        }
        int G10 = G(i10);
        long j10 = G10 & 1048575;
        AbstractC2125f1.g(obj, j10, AbstractC2125f1.H(obj, j10) | (1 << (G10 >>> 20)));
    }

    private final void J(Object obj, int i10, int i11) {
        AbstractC2125f1.g(obj, G(i11) & 1048575, i10);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:226:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void K(Object obj, InterfaceC2166t1 interfaceC2166t1) {
        Iterator it;
        Map.Entry entry;
        int length;
        int i10;
        int i11;
        boolean z10;
        if (this.f23813g) {
            U b10 = this.f23823q.b(obj);
            if (!b10.b()) {
                it = b10.e();
                entry = (Map.Entry) it.next();
                length = this.f23807a.length;
                Unsafe unsafe = f23806s;
                int i12 = -1;
                int i13 = 0;
                for (i10 = 0; i10 < length; i10 += 4) {
                    int F10 = F(i10);
                    int[] iArr = this.f23807a;
                    int i14 = iArr[i10];
                    int i15 = (267386880 & F10) >>> 20;
                    if (this.f23815i || i15 > 17) {
                        i11 = 0;
                    } else {
                        int i16 = iArr[i10 + 2];
                        int i17 = i16 & 1048575;
                        if (i17 != i12) {
                            i13 = unsafe.getInt(obj, i17);
                            i12 = i17;
                        }
                        i11 = 1 << (i16 >>> 20);
                    }
                    while (entry != null && this.f23823q.a(entry) <= i14) {
                        this.f23823q.c(interfaceC2166t1, entry);
                        entry = it.hasNext() ? (Map.Entry) it.next() : null;
                    }
                    long j10 = F10 & 1048575;
                    switch (i15) {
                        case 0:
                            if ((i11 & i13) != 0) {
                                interfaceC2166t1.u(i14, AbstractC2125f1.L(obj, j10));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if ((i11 & i13) != 0) {
                                interfaceC2166t1.v(i14, AbstractC2125f1.K(obj, j10));
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if ((i11 & i13) != 0) {
                                interfaceC2166t1.K(i14, unsafe.getLong(obj, j10));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if ((i11 & i13) != 0) {
                                interfaceC2166t1.t(i14, unsafe.getLong(obj, j10));
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if ((i11 & i13) != 0) {
                                interfaceC2166t1.o(i14, unsafe.getInt(obj, j10));
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if ((i11 & i13) != 0) {
                                interfaceC2166t1.a(i14, unsafe.getLong(obj, j10));
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if ((i11 & i13) != 0) {
                                interfaceC2166t1.x(i14, unsafe.getInt(obj, j10));
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if ((i11 & i13) != 0) {
                                interfaceC2166t1.n(i14, AbstractC2125f1.J(obj, j10));
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            if ((i11 & i13) != 0) {
                                u(i14, unsafe.getObject(obj, j10), interfaceC2166t1);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            if ((i11 & i13) != 0) {
                                interfaceC2166t1.N(i14, unsafe.getObject(obj, j10), C(i10));
                                break;
                            } else {
                                break;
                            }
                        case RequestError.EVENT_TIMEOUT /* 10 */:
                            if ((i11 & i13) != 0) {
                                interfaceC2166t1.M(i14, (AbstractC2179y) unsafe.getObject(obj, j10));
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            if ((i11 & i13) != 0) {
                                interfaceC2166t1.D(i14, unsafe.getInt(obj, j10));
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            if ((i11 & i13) != 0) {
                                interfaceC2166t1.L(i14, unsafe.getInt(obj, j10));
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            if ((i11 & i13) != 0) {
                                interfaceC2166t1.R(i14, unsafe.getInt(obj, j10));
                                break;
                            } else {
                                break;
                            }
                        case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                            if ((i11 & i13) != 0) {
                                interfaceC2166t1.h(i14, unsafe.getLong(obj, j10));
                                break;
                            } else {
                                break;
                            }
                        case HVError.SSL_CONNECT_ERROR /* 15 */:
                            if ((i11 & i13) != 0) {
                                interfaceC2166t1.F(i14, unsafe.getInt(obj, j10));
                                break;
                            } else {
                                break;
                            }
                        case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                            if ((i11 & i13) != 0) {
                                interfaceC2166t1.j(i14, unsafe.getLong(obj, j10));
                                break;
                            } else {
                                break;
                            }
                        case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                            if ((i11 & i13) != 0) {
                                interfaceC2166t1.P(i14, unsafe.getObject(obj, j10), C(i10));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            T0.f(this.f23807a[i10], (List) unsafe.getObject(obj, j10), interfaceC2166t1, false);
                            break;
                        case 19:
                            T0.m(this.f23807a[i10], (List) unsafe.getObject(obj, j10), interfaceC2166t1, false);
                            break;
                        case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                            T0.r(this.f23807a[i10], (List) unsafe.getObject(obj, j10), interfaceC2166t1, false);
                            break;
                        case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                            T0.x(this.f23807a[i10], (List) unsafe.getObject(obj, j10), interfaceC2166t1, false);
                            break;
                        case HVError.FACE_DETECTION_ERROR /* 22 */:
                            T0.M(this.f23807a[i10], (List) unsafe.getObject(obj, j10), interfaceC2166t1, false);
                            break;
                        case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                            T0.H(this.f23807a[i10], (List) unsafe.getObject(obj, j10), interfaceC2166t1, false);
                            break;
                        case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                            T0.R(this.f23807a[i10], (List) unsafe.getObject(obj, j10), interfaceC2166t1, false);
                            break;
                        case HVError.LOW_STORAGE_ERROR /* 25 */:
                            T0.U(this.f23807a[i10], (List) unsafe.getObject(obj, j10), interfaceC2166t1, false);
                            break;
                        case 26:
                            T0.d(this.f23807a[i10], (List) unsafe.getObject(obj, j10), interfaceC2166t1);
                            break;
                        case 27:
                            T0.e(this.f23807a[i10], (List) unsafe.getObject(obj, j10), interfaceC2166t1, C(i10));
                            break;
                        case 28:
                            T0.k(this.f23807a[i10], (List) unsafe.getObject(obj, j10), interfaceC2166t1);
                            break;
                        case 29:
                            z10 = false;
                            T0.O(this.f23807a[i10], (List) unsafe.getObject(obj, j10), interfaceC2166t1, false);
                            break;
                        case 30:
                            z10 = false;
                            T0.T(this.f23807a[i10], (List) unsafe.getObject(obj, j10), interfaceC2166t1, false);
                            break;
                        case HVError.INSTRUCTION_ERROR /* 31 */:
                            z10 = false;
                            T0.S(this.f23807a[i10], (List) unsafe.getObject(obj, j10), interfaceC2166t1, false);
                            break;
                        case 32:
                            z10 = false;
                            T0.K(this.f23807a[i10], (List) unsafe.getObject(obj, j10), interfaceC2166t1, false);
                            break;
                        case HVError.GPS_ACCESS_DENIED /* 33 */:
                            z10 = false;
                            T0.Q(this.f23807a[i10], (List) unsafe.getObject(obj, j10), interfaceC2166t1, false);
                            break;
                        case 34:
                            z10 = false;
                            T0.F(this.f23807a[i10], (List) unsafe.getObject(obj, j10), interfaceC2166t1, false);
                            break;
                        case HVError.FACE_CAPTURE_TIMEOUT /* 35 */:
                            T0.f(this.f23807a[i10], (List) unsafe.getObject(obj, j10), interfaceC2166t1, true);
                            break;
                        case HVError.HYPER_DOC_DETECT_ERROR /* 36 */:
                            T0.m(this.f23807a[i10], (List) unsafe.getObject(obj, j10), interfaceC2166t1, true);
                            break;
                        case HVError.INVALID_FILE_ERROR /* 37 */:
                            T0.r(this.f23807a[i10], (List) unsafe.getObject(obj, j10), interfaceC2166t1, true);
                            break;
                        case 38:
                            T0.x(this.f23807a[i10], (List) unsafe.getObject(obj, j10), interfaceC2166t1, true);
                            break;
                        case 39:
                            T0.M(this.f23807a[i10], (List) unsafe.getObject(obj, j10), interfaceC2166t1, true);
                            break;
                        case RequestError.NETWORK_FAILURE /* 40 */:
                            T0.H(this.f23807a[i10], (List) unsafe.getObject(obj, j10), interfaceC2166t1, true);
                            break;
                        case RequestError.NO_DEV_KEY /* 41 */:
                            T0.R(this.f23807a[i10], (List) unsafe.getObject(obj, j10), interfaceC2166t1, true);
                            break;
                        case HVError.CONSENT_DENIED /* 42 */:
                            T0.U(this.f23807a[i10], (List) unsafe.getObject(obj, j10), interfaceC2166t1, true);
                            break;
                        case HVError.ENCRYPTION_ERROR /* 43 */:
                            T0.O(this.f23807a[i10], (List) unsafe.getObject(obj, j10), interfaceC2166t1, true);
                            break;
                        case HVError.SDK_CLOSE_ERROR /* 44 */:
                            T0.T(this.f23807a[i10], (List) unsafe.getObject(obj, j10), interfaceC2166t1, true);
                            break;
                        case HVError.PERMISSION_REVOKED_ERROR /* 45 */:
                            T0.S(this.f23807a[i10], (List) unsafe.getObject(obj, j10), interfaceC2166t1, true);
                            break;
                        case 46:
                            T0.K(this.f23807a[i10], (List) unsafe.getObject(obj, j10), interfaceC2166t1, true);
                            break;
                        case 47:
                            T0.Q(this.f23807a[i10], (List) unsafe.getObject(obj, j10), interfaceC2166t1, true);
                            break;
                        case 48:
                            T0.F(this.f23807a[i10], (List) unsafe.getObject(obj, j10), interfaceC2166t1, true);
                            break;
                        case 49:
                            T0.l(this.f23807a[i10], (List) unsafe.getObject(obj, j10), interfaceC2166t1, C(i10));
                            break;
                        case 50:
                            w(interfaceC2166t1, i14, unsafe.getObject(obj, j10), i10);
                            break;
                        case 51:
                            if (z(obj, i14, i10)) {
                                interfaceC2166t1.u(i14, O(obj, j10));
                            }
                            break;
                        case 52:
                            if (z(obj, i14, i10)) {
                                interfaceC2166t1.v(i14, P(obj, j10));
                            }
                            break;
                        case 53:
                            if (z(obj, i14, i10)) {
                                interfaceC2166t1.K(i14, R(obj, j10));
                            }
                            break;
                        case 54:
                            if (z(obj, i14, i10)) {
                                interfaceC2166t1.t(i14, R(obj, j10));
                            }
                            break;
                        case 55:
                            if (z(obj, i14, i10)) {
                                interfaceC2166t1.o(i14, Q(obj, j10));
                            }
                            break;
                        case 56:
                            if (z(obj, i14, i10)) {
                                interfaceC2166t1.a(i14, R(obj, j10));
                            }
                            break;
                        case 57:
                            if (z(obj, i14, i10)) {
                                interfaceC2166t1.x(i14, Q(obj, j10));
                            }
                            break;
                        case 58:
                            if (z(obj, i14, i10)) {
                                interfaceC2166t1.n(i14, S(obj, j10));
                            }
                            break;
                        case 59:
                            if (z(obj, i14, i10)) {
                                u(i14, unsafe.getObject(obj, j10), interfaceC2166t1);
                            }
                            break;
                        case HVError.DETECTOR_NOT_AVAILABLE_ERROR /* 60 */:
                            if (z(obj, i14, i10)) {
                                interfaceC2166t1.N(i14, unsafe.getObject(obj, j10), C(i10));
                            }
                            break;
                        case 61:
                            if (z(obj, i14, i10)) {
                                interfaceC2166t1.M(i14, (AbstractC2179y) unsafe.getObject(obj, j10));
                            }
                            break;
                        case 62:
                            if (z(obj, i14, i10)) {
                                interfaceC2166t1.D(i14, Q(obj, j10));
                            }
                            break;
                        case 63:
                            if (z(obj, i14, i10)) {
                                interfaceC2166t1.L(i14, Q(obj, j10));
                            }
                            break;
                        case 64:
                            if (z(obj, i14, i10)) {
                                interfaceC2166t1.R(i14, Q(obj, j10));
                            }
                            break;
                        case 65:
                            if (z(obj, i14, i10)) {
                                interfaceC2166t1.h(i14, R(obj, j10));
                            }
                            break;
                        case 66:
                            if (z(obj, i14, i10)) {
                                interfaceC2166t1.F(i14, Q(obj, j10));
                            }
                            break;
                        case 67:
                            if (z(obj, i14, i10)) {
                                interfaceC2166t1.j(i14, R(obj, j10));
                            }
                            break;
                        case 68:
                            if (z(obj, i14, i10)) {
                                interfaceC2166t1.P(i14, unsafe.getObject(obj, j10), C(i10));
                            }
                            break;
                    }
                }
                while (entry != null) {
                    this.f23823q.c(interfaceC2166t1, entry);
                    entry = it.hasNext() ? (Map.Entry) it.next() : null;
                }
                v(this.f23822p, obj, interfaceC2166t1);
            }
        }
        it = null;
        entry = null;
        length = this.f23807a.length;
        Unsafe unsafe2 = f23806s;
        int i122 = -1;
        int i132 = 0;
        while (i10 < length) {
        }
        while (entry != null) {
        }
        v(this.f23822p, obj, interfaceC2166t1);
    }

    private final void L(Object obj, Object obj2, int i10) {
        int F10 = F(i10);
        int i11 = this.f23807a[i10];
        long j10 = F10 & 1048575;
        if (z(obj2, i11, i10)) {
            Object M10 = AbstractC2125f1.M(obj, j10);
            Object M11 = AbstractC2125f1.M(obj2, j10);
            if (M10 != null && M11 != null) {
                AbstractC2125f1.i(obj, j10, AbstractC2115c0.d(M10, M11));
                J(obj, i11, i10);
            } else if (M11 != null) {
                AbstractC2125f1.i(obj, j10, M11);
                J(obj, i11, i10);
            }
        }
    }

    private final boolean M(Object obj, Object obj2, int i10) {
        return y(obj, i10) == y(obj2, i10);
    }

    private static List N(Object obj, long j10) {
        return (List) AbstractC2125f1.M(obj, j10);
    }

    private static double O(Object obj, long j10) {
        return ((Double) AbstractC2125f1.M(obj, j10)).doubleValue();
    }

    private static float P(Object obj, long j10) {
        return ((Float) AbstractC2125f1.M(obj, j10)).floatValue();
    }

    private static int Q(Object obj, long j10) {
        return ((Integer) AbstractC2125f1.M(obj, j10)).intValue();
    }

    private static long R(Object obj, long j10) {
        return ((Long) AbstractC2125f1.M(obj, j10)).longValue();
    }

    private static boolean S(Object obj, long j10) {
        return ((Boolean) AbstractC2125f1.M(obj, j10)).booleanValue();
    }

    private static Z0 T(Object obj) {
        AbstractC2109a0 abstractC2109a0 = (AbstractC2109a0) obj;
        Z0 z02 = abstractC2109a0.zzjp;
        if (z02 != Z0.h()) {
            return z02;
        }
        Z0 i10 = Z0.i();
        abstractC2109a0.zzjp = i10;
        return i10;
    }

    private static int j(int i10, byte[] bArr, int i11, int i12, Object obj, C2170v c2170v) {
        return AbstractC2167u.c(i10, bArr, i11, i12, T(obj), c2170v);
    }

    private static int k(R0 r02, int i10, byte[] bArr, int i11, int i12, InterfaceC2124f0 interfaceC2124f0, C2170v c2170v) {
        int m10 = m(r02, bArr, i11, i12, c2170v);
        while (true) {
            interfaceC2124f0.add(c2170v.f24102c);
            if (m10 >= i12) {
                break;
            }
            int e10 = AbstractC2167u.e(bArr, m10, c2170v);
            if (i10 != c2170v.f24100a) {
                break;
            }
            m10 = m(r02, bArr, e10, i12, c2170v);
        }
        return m10;
    }

    private static int l(R0 r02, byte[] bArr, int i10, int i11, int i12, C2170v c2170v) {
        F0 f02 = (F0) r02;
        Object b10 = f02.b();
        int r10 = f02.r(b10, bArr, i10, i11, i12, c2170v);
        f02.a(b10);
        c2170v.f24102c = b10;
        return r10;
    }

    private static int m(R0 r02, byte[] bArr, int i10, int i11, C2170v c2170v) {
        int i12 = i10 + 1;
        int i13 = bArr[i10];
        if (i13 < 0) {
            i12 = AbstractC2167u.d(i13, bArr, i12, c2170v);
            i13 = c2170v.f24100a;
        }
        int i14 = i12;
        if (i13 < 0 || i13 > i11 - i14) {
            throw C2127g0.a();
        }
        Object b10 = r02.b();
        int i15 = i13 + i14;
        r02.h(b10, bArr, i14, i15, c2170v);
        r02.a(b10);
        c2170v.f24102c = b10;
        return i15;
    }

    private static int n(Y0 y02, Object obj) {
        return y02.j(y02.k(obj));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final int o(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, C2170v c2170v) {
        Object valueOf;
        Object valueOf2;
        int g10;
        long j11;
        int i18;
        Object valueOf3;
        int i19;
        Unsafe unsafe = f23806s;
        long j12 = this.f23807a[i17 + 2] & 1048575;
        switch (i16) {
            case 51:
                if (i14 == 1) {
                    valueOf = Double.valueOf(AbstractC2167u.l(bArr, i10));
                    unsafe.putObject(obj, j10, valueOf);
                    g10 = i10 + 8;
                    unsafe.putInt(obj, j12, i13);
                    return g10;
                }
                return i10;
            case 52:
                if (i14 == 5) {
                    valueOf2 = Float.valueOf(AbstractC2167u.n(bArr, i10));
                    unsafe.putObject(obj, j10, valueOf2);
                    g10 = i10 + 4;
                    unsafe.putInt(obj, j12, i13);
                    return g10;
                }
                return i10;
            case 53:
            case 54:
                if (i14 == 0) {
                    g10 = AbstractC2167u.g(bArr, i10, c2170v);
                    j11 = c2170v.f24101b;
                    valueOf3 = Long.valueOf(j11);
                    unsafe.putObject(obj, j10, valueOf3);
                    unsafe.putInt(obj, j12, i13);
                    return g10;
                }
                return i10;
            case 55:
            case 62:
                if (i14 == 0) {
                    g10 = AbstractC2167u.e(bArr, i10, c2170v);
                    i18 = c2170v.f24100a;
                    valueOf3 = Integer.valueOf(i18);
                    unsafe.putObject(obj, j10, valueOf3);
                    unsafe.putInt(obj, j12, i13);
                    return g10;
                }
                return i10;
            case 56:
            case 65:
                if (i14 == 1) {
                    valueOf = Long.valueOf(AbstractC2167u.k(bArr, i10));
                    unsafe.putObject(obj, j10, valueOf);
                    g10 = i10 + 8;
                    unsafe.putInt(obj, j12, i13);
                    return g10;
                }
                return i10;
            case 57:
            case 64:
                if (i14 == 5) {
                    valueOf2 = Integer.valueOf(AbstractC2167u.h(bArr, i10));
                    unsafe.putObject(obj, j10, valueOf2);
                    g10 = i10 + 4;
                    unsafe.putInt(obj, j12, i13);
                    return g10;
                }
                return i10;
            case 58:
                if (i14 == 0) {
                    g10 = AbstractC2167u.g(bArr, i10, c2170v);
                    valueOf3 = Boolean.valueOf(c2170v.f24101b != 0);
                    unsafe.putObject(obj, j10, valueOf3);
                    unsafe.putInt(obj, j12, i13);
                    return g10;
                }
                return i10;
            case 59:
                if (i14 == 2) {
                    g10 = AbstractC2167u.e(bArr, i10, c2170v);
                    i19 = c2170v.f24100a;
                    if (i19 == 0) {
                        valueOf3 = BuildConfig.FLAVOR;
                        unsafe.putObject(obj, j10, valueOf3);
                        unsafe.putInt(obj, j12, i13);
                        return g10;
                    }
                    if ((i15 & 536870912) != 0 && !AbstractC2131h1.i(bArr, g10, g10 + i19)) {
                        throw C2127g0.e();
                    }
                    unsafe.putObject(obj, j10, new String(bArr, g10, i19, AbstractC2115c0.f24018a));
                    g10 += i19;
                    unsafe.putInt(obj, j12, i13);
                    return g10;
                }
                return i10;
            case HVError.DETECTOR_NOT_AVAILABLE_ERROR /* 60 */:
                if (i14 == 2) {
                    g10 = m(C(i17), bArr, i10, i11, c2170v);
                    Object object = unsafe.getInt(obj, j12) == i13 ? unsafe.getObject(obj, j10) : null;
                    valueOf3 = c2170v.f24102c;
                    if (object != null) {
                        valueOf3 = AbstractC2115c0.d(object, valueOf3);
                    }
                    unsafe.putObject(obj, j10, valueOf3);
                    unsafe.putInt(obj, j12, i13);
                    return g10;
                }
                return i10;
            case 61:
                if (i14 == 2) {
                    g10 = AbstractC2167u.e(bArr, i10, c2170v);
                    i19 = c2170v.f24100a;
                    if (i19 == 0) {
                        valueOf3 = AbstractC2179y.f24108b;
                        unsafe.putObject(obj, j10, valueOf3);
                        unsafe.putInt(obj, j12, i13);
                        return g10;
                    }
                    unsafe.putObject(obj, j10, AbstractC2179y.t(bArr, g10, i19));
                    g10 += i19;
                    unsafe.putInt(obj, j12, i13);
                    return g10;
                }
                return i10;
            case 63:
                if (i14 == 0) {
                    int e10 = AbstractC2167u.e(bArr, i10, c2170v);
                    int i20 = c2170v.f24100a;
                    InterfaceC2121e0 E10 = E(i17);
                    if (E10 != null && E10.n(i20) == null) {
                        T(obj).e(i12, Long.valueOf(i20));
                        return e10;
                    }
                    unsafe.putObject(obj, j10, Integer.valueOf(i20));
                    g10 = e10;
                    unsafe.putInt(obj, j12, i13);
                    return g10;
                }
                return i10;
            case 66:
                if (i14 == 0) {
                    g10 = AbstractC2167u.e(bArr, i10, c2170v);
                    i18 = H.e(c2170v.f24100a);
                    valueOf3 = Integer.valueOf(i18);
                    unsafe.putObject(obj, j10, valueOf3);
                    unsafe.putInt(obj, j12, i13);
                    return g10;
                }
                return i10;
            case 67:
                if (i14 == 0) {
                    g10 = AbstractC2167u.g(bArr, i10, c2170v);
                    j11 = H.a(c2170v.f24101b);
                    valueOf3 = Long.valueOf(j11);
                    unsafe.putObject(obj, j10, valueOf3);
                    unsafe.putInt(obj, j12, i13);
                    return g10;
                }
                return i10;
            case 68:
                if (i14 == 3) {
                    g10 = l(C(i17), bArr, i10, i11, (i12 & (-8)) | 4, c2170v);
                    Object object2 = unsafe.getInt(obj, j12) == i13 ? unsafe.getObject(obj, j10) : null;
                    valueOf3 = c2170v.f24102c;
                    if (object2 != null) {
                        valueOf3 = AbstractC2115c0.d(object2, valueOf3);
                    }
                    unsafe.putObject(obj, j10, valueOf3);
                    unsafe.putInt(obj, j12, i13);
                    return g10;
                }
                return i10;
            default:
                return i10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x011a, code lost:
    
        if (r4 == 0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x011c, code lost:
    
        r12.add(com.google.android.gms.internal.clearcut.AbstractC2179y.f24108b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x012a, code lost:
    
        if (r1 >= r19) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x012c, code lost:
    
        r4 = com.google.android.gms.internal.clearcut.AbstractC2167u.e(r17, r1, r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0132, code lost:
    
        if (r20 != r29.f24100a) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0134, code lost:
    
        r1 = com.google.android.gms.internal.clearcut.AbstractC2167u.e(r17, r4, r29);
        r4 = r29.f24100a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x013a, code lost:
    
        if (r4 != 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0122, code lost:
    
        r12.add(com.google.android.gms.internal.clearcut.AbstractC2179y.t(r17, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x012a, code lost:
    
        r12.add(com.google.android.gms.internal.clearcut.AbstractC2179y.t(r17, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x017f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x013a -> B:56:0x011c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x018d -> B:70:0x016e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x01c7 -> B:81:0x01a0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int p(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, long j10, int i16, long j11, C2170v c2170v) {
        int b10;
        int i17 = i10;
        Unsafe unsafe = f23806s;
        InterfaceC2124f0 interfaceC2124f0 = (InterfaceC2124f0) unsafe.getObject(obj, j11);
        if (!interfaceC2124f0.H()) {
            int size = interfaceC2124f0.size();
            interfaceC2124f0 = interfaceC2124f0.l1(size == 0 ? 10 : size << 1);
            unsafe.putObject(obj, j11, interfaceC2124f0);
        }
        switch (i16) {
            case 18:
            case HVError.FACE_CAPTURE_TIMEOUT /* 35 */:
                if (i14 == 2) {
                    android.support.v4.media.session.b.a(interfaceC2124f0);
                    int e10 = AbstractC2167u.e(bArr, i17, c2170v);
                    int i18 = c2170v.f24100a + e10;
                    if (e10 < i18) {
                        AbstractC2167u.l(bArr, e10);
                        throw null;
                    }
                    if (e10 == i18) {
                        return e10;
                    }
                    throw C2127g0.a();
                }
                if (i14 == 1) {
                    android.support.v4.media.session.b.a(interfaceC2124f0);
                    AbstractC2167u.l(bArr, i10);
                    throw null;
                }
                break;
            case 19:
            case HVError.HYPER_DOC_DETECT_ERROR /* 36 */:
                if (i14 == 2) {
                    android.support.v4.media.session.b.a(interfaceC2124f0);
                    int e11 = AbstractC2167u.e(bArr, i17, c2170v);
                    int i19 = c2170v.f24100a + e11;
                    if (e11 < i19) {
                        AbstractC2167u.n(bArr, e11);
                        throw null;
                    }
                    if (e11 == i19) {
                        return e11;
                    }
                    throw C2127g0.a();
                }
                if (i14 == 5) {
                    android.support.v4.media.session.b.a(interfaceC2124f0);
                    AbstractC2167u.n(bArr, i10);
                    throw null;
                }
                break;
            case HVRetakeActivity.CLOSE_ACTION /* 20 */:
            case HVRetakeActivity.RECHECK_ACTION /* 21 */:
            case HVError.INVALID_FILE_ERROR /* 37 */:
            case 38:
                if (i14 == 2) {
                    android.support.v4.media.session.b.a(interfaceC2124f0);
                    int e12 = AbstractC2167u.e(bArr, i17, c2170v);
                    int i20 = c2170v.f24100a + e12;
                    if (e12 < i20) {
                        AbstractC2167u.g(bArr, e12, c2170v);
                        throw null;
                    }
                    if (e12 == i20) {
                        return e12;
                    }
                    throw C2127g0.a();
                }
                if (i14 == 0) {
                    android.support.v4.media.session.b.a(interfaceC2124f0);
                    AbstractC2167u.g(bArr, i17, c2170v);
                    long j12 = c2170v.f24101b;
                    throw null;
                }
                break;
            case HVError.FACE_DETECTION_ERROR /* 22 */:
            case 29:
            case 39:
            case HVError.ENCRYPTION_ERROR /* 43 */:
                if (i14 == 2) {
                    return AbstractC2167u.f(bArr, i17, interfaceC2124f0, c2170v);
                }
                if (i14 == 0) {
                    return AbstractC2167u.b(i12, bArr, i10, i11, interfaceC2124f0, c2170v);
                }
                break;
            case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
            case 32:
            case RequestError.NETWORK_FAILURE /* 40 */:
            case 46:
                if (i14 == 2) {
                    android.support.v4.media.session.b.a(interfaceC2124f0);
                    int e13 = AbstractC2167u.e(bArr, i17, c2170v);
                    int i21 = c2170v.f24100a + e13;
                    if (e13 < i21) {
                        AbstractC2167u.k(bArr, e13);
                        throw null;
                    }
                    if (e13 == i21) {
                        return e13;
                    }
                    throw C2127g0.a();
                }
                if (i14 == 1) {
                    android.support.v4.media.session.b.a(interfaceC2124f0);
                    AbstractC2167u.k(bArr, i10);
                    throw null;
                }
                break;
            case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
            case HVError.INSTRUCTION_ERROR /* 31 */:
            case RequestError.NO_DEV_KEY /* 41 */:
            case HVError.PERMISSION_REVOKED_ERROR /* 45 */:
                if (i14 == 2) {
                    android.support.v4.media.session.b.a(interfaceC2124f0);
                    int e14 = AbstractC2167u.e(bArr, i17, c2170v);
                    int i22 = c2170v.f24100a + e14;
                    if (e14 < i22) {
                        AbstractC2167u.h(bArr, e14);
                        throw null;
                    }
                    if (e14 == i22) {
                        return e14;
                    }
                    throw C2127g0.a();
                }
                if (i14 == 5) {
                    android.support.v4.media.session.b.a(interfaceC2124f0);
                    AbstractC2167u.h(bArr, i10);
                    throw null;
                }
                break;
            case HVError.LOW_STORAGE_ERROR /* 25 */:
            case HVError.CONSENT_DENIED /* 42 */:
                if (i14 == 2) {
                    android.support.v4.media.session.b.a(interfaceC2124f0);
                    int e15 = AbstractC2167u.e(bArr, i17, c2170v);
                    int i23 = c2170v.f24100a + e15;
                    if (e15 < i23) {
                        AbstractC2167u.g(bArr, e15, c2170v);
                        throw null;
                    }
                    if (e15 == i23) {
                        return e15;
                    }
                    throw C2127g0.a();
                }
                if (i14 == 0) {
                    android.support.v4.media.session.b.a(interfaceC2124f0);
                    AbstractC2167u.g(bArr, i17, c2170v);
                    long j13 = c2170v.f24101b;
                    throw null;
                }
                break;
            case 26:
                if (i14 == 2) {
                    if ((j10 & 536870912) == 0) {
                        int e16 = AbstractC2167u.e(bArr, i17, c2170v);
                        int i24 = c2170v.f24100a;
                        if (i24 != 0) {
                            interfaceC2124f0.add(new String(bArr, e16, i24, AbstractC2115c0.f24018a));
                            e16 += i24;
                            while (e16 < i11) {
                                int e17 = AbstractC2167u.e(bArr, e16, c2170v);
                                if (i12 != c2170v.f24100a) {
                                    return e16;
                                }
                                e16 = AbstractC2167u.e(bArr, e17, c2170v);
                                int i25 = c2170v.f24100a;
                                if (i25 != 0) {
                                    interfaceC2124f0.add(new String(bArr, e16, i25, AbstractC2115c0.f24018a));
                                    e16 += i25;
                                }
                            }
                            return e16;
                        }
                        interfaceC2124f0.add(BuildConfig.FLAVOR);
                        while (e16 < i11) {
                        }
                        return e16;
                    }
                    int e18 = AbstractC2167u.e(bArr, i17, c2170v);
                    int i26 = c2170v.f24100a;
                    if (i26 != 0) {
                        int i27 = e18 + i26;
                        if (!AbstractC2131h1.i(bArr, e18, i27)) {
                            throw C2127g0.e();
                        }
                        interfaceC2124f0.add(new String(bArr, e18, i26, AbstractC2115c0.f24018a));
                        e18 = i27;
                        while (e18 < i11) {
                            int e19 = AbstractC2167u.e(bArr, e18, c2170v);
                            if (i12 != c2170v.f24100a) {
                                return e18;
                            }
                            e18 = AbstractC2167u.e(bArr, e19, c2170v);
                            int i28 = c2170v.f24100a;
                            if (i28 != 0) {
                                int i29 = e18 + i28;
                                if (!AbstractC2131h1.i(bArr, e18, i29)) {
                                    throw C2127g0.e();
                                }
                                interfaceC2124f0.add(new String(bArr, e18, i28, AbstractC2115c0.f24018a));
                                e18 = i29;
                            }
                        }
                        return e18;
                    }
                    interfaceC2124f0.add(BuildConfig.FLAVOR);
                    while (e18 < i11) {
                    }
                    return e18;
                }
                break;
            case 27:
                if (i14 == 2) {
                    return k(C(i15), i12, bArr, i10, i11, interfaceC2124f0, c2170v);
                }
                break;
            case 28:
                if (i14 == 2) {
                    int e20 = AbstractC2167u.e(bArr, i17, c2170v);
                    int i30 = c2170v.f24100a;
                    break;
                }
                break;
            case 30:
            case HVError.SDK_CLOSE_ERROR /* 44 */:
                if (i14 == 2) {
                    b10 = AbstractC2167u.f(bArr, i17, interfaceC2124f0, c2170v);
                } else if (i14 == 0) {
                    b10 = AbstractC2167u.b(i12, bArr, i10, i11, interfaceC2124f0, c2170v);
                }
                AbstractC2109a0 abstractC2109a0 = (AbstractC2109a0) obj;
                Z0 z02 = abstractC2109a0.zzjp;
                Z0 z03 = (Z0) T0.c(i13, interfaceC2124f0, E(i15), z02 != Z0.h() ? z02 : null, this.f23822p);
                if (z03 != null) {
                    abstractC2109a0.zzjp = z03;
                }
                return b10;
            case HVError.GPS_ACCESS_DENIED /* 33 */:
            case 47:
                if (i14 == 2) {
                    android.support.v4.media.session.b.a(interfaceC2124f0);
                    int e21 = AbstractC2167u.e(bArr, i17, c2170v);
                    int i31 = c2170v.f24100a + e21;
                    if (e21 >= i31) {
                        if (e21 == i31) {
                            return e21;
                        }
                        throw C2127g0.a();
                    }
                    AbstractC2167u.e(bArr, e21, c2170v);
                    H.e(c2170v.f24100a);
                    throw null;
                }
                if (i14 == 0) {
                    android.support.v4.media.session.b.a(interfaceC2124f0);
                    AbstractC2167u.e(bArr, i17, c2170v);
                    H.e(c2170v.f24100a);
                    throw null;
                }
                break;
            case 34:
            case 48:
                if (i14 == 2) {
                    android.support.v4.media.session.b.a(interfaceC2124f0);
                    int e22 = AbstractC2167u.e(bArr, i17, c2170v);
                    int i32 = c2170v.f24100a + e22;
                    if (e22 >= i32) {
                        if (e22 == i32) {
                            return e22;
                        }
                        throw C2127g0.a();
                    }
                    AbstractC2167u.g(bArr, e22, c2170v);
                    H.a(c2170v.f24101b);
                    throw null;
                }
                if (i14 == 0) {
                    android.support.v4.media.session.b.a(interfaceC2124f0);
                    AbstractC2167u.g(bArr, i17, c2170v);
                    H.a(c2170v.f24101b);
                    throw null;
                }
                break;
            case 49:
                if (i14 == 3) {
                    R0 C10 = C(i15);
                    int i33 = (i12 & (-8)) | 4;
                    i17 = l(C10, bArr, i10, i11, i33, c2170v);
                    while (true) {
                        interfaceC2124f0.add(c2170v.f24102c);
                        if (i17 >= i11) {
                            break;
                        } else {
                            int e23 = AbstractC2167u.e(bArr, i17, c2170v);
                            if (i12 != c2170v.f24100a) {
                                break;
                            } else {
                                i17 = l(C10, bArr, e23, i11, i33, c2170v);
                            }
                        }
                    }
                }
                break;
        }
        return i17;
    }

    private final int q(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, long j10, C2170v c2170v) {
        Unsafe unsafe = f23806s;
        Object D10 = D(i12);
        Object object = unsafe.getObject(obj, j10);
        if (this.f23824r.e(object)) {
            Object d10 = this.f23824r.d(D10);
            this.f23824r.f(d10, object);
            unsafe.putObject(obj, j10, d10);
            object = d10;
        }
        this.f23824r.h(D10);
        this.f23824r.k(object);
        int e10 = AbstractC2167u.e(bArr, i10, c2170v);
        int i14 = c2170v.f24100a;
        if (i14 < 0 || i14 > i11 - e10) {
            throw C2127g0.a();
        }
        throw null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:97:0x0069. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0376 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int r(Object obj, byte[] bArr, int i10, int i11, int i12, C2170v c2170v) {
        Unsafe unsafe;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        Object obj2;
        InterfaceC2121e0 E10;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        C2170v c2170v2;
        int i25;
        int i26;
        int i27;
        long j10;
        Object obj3;
        C2170v c2170v3;
        int m10;
        F0 f02 = this;
        Object obj4 = obj;
        byte[] bArr2 = bArr;
        int i28 = i11;
        int i29 = i12;
        C2170v c2170v4 = c2170v;
        Unsafe unsafe2 = f23806s;
        int i30 = -1;
        int i31 = i10;
        int i32 = -1;
        int i33 = 0;
        int i34 = 0;
        while (true) {
            if (i31 < i28) {
                int i35 = i31 + 1;
                byte b10 = bArr2[i31];
                if (b10 < 0) {
                    i19 = AbstractC2167u.d(b10, bArr2, i35, c2170v4);
                    i18 = c2170v4.f24100a;
                } else {
                    i18 = b10;
                    i19 = i35;
                }
                int i36 = i18 >>> 3;
                int i37 = i18 & 7;
                int H10 = f02.H(i36);
                if (H10 != i30) {
                    int[] iArr = f02.f23807a;
                    int i38 = iArr[H10 + 1];
                    int i39 = (i38 & 267386880) >>> 20;
                    int i40 = i18;
                    long j11 = i38 & 1048575;
                    if (i39 <= 17) {
                        int i41 = iArr[H10 + 2];
                        int i42 = 1 << (i41 >>> 20);
                        int i43 = i41 & 1048575;
                        if (i43 != i32) {
                            if (i32 != -1) {
                                unsafe2.putInt(obj4, i32, i34);
                            }
                            i34 = unsafe2.getInt(obj4, i43);
                            i32 = i43;
                        }
                        switch (i39) {
                            case 0:
                                i15 = i40;
                                c2170v2 = c2170v;
                                i25 = i19;
                                i26 = i32;
                                bArr2 = bArr;
                                if (i37 == 1) {
                                    AbstractC2125f1.e(obj4, j11, AbstractC2167u.l(bArr2, i25));
                                    i31 = i25 + 8;
                                    i34 |= i42;
                                    i32 = i26;
                                    i28 = i11;
                                    i33 = i15;
                                    c2170v4 = c2170v2;
                                    i30 = -1;
                                    i29 = i12;
                                    break;
                                } else {
                                    i32 = i26;
                                    i13 = i12;
                                    i24 = i25;
                                    unsafe = unsafe2;
                                    if (i15 != i13 && i13 != 0) {
                                        i16 = i32;
                                        i17 = -1;
                                        i14 = i24;
                                        break;
                                    } else {
                                        i31 = j(i15, bArr, i24, i11, obj, c2170v);
                                        f02 = this;
                                        obj4 = obj;
                                        bArr2 = bArr;
                                        i28 = i11;
                                        i29 = i13;
                                        i33 = i15;
                                        unsafe2 = unsafe;
                                        i30 = -1;
                                        c2170v4 = c2170v;
                                        break;
                                    }
                                }
                            case 1:
                                i15 = i40;
                                c2170v2 = c2170v;
                                i25 = i19;
                                i26 = i32;
                                bArr2 = bArr;
                                if (i37 == 5) {
                                    AbstractC2125f1.f(obj4, j11, AbstractC2167u.n(bArr2, i25));
                                    i31 = i25 + 4;
                                    i34 |= i42;
                                    i32 = i26;
                                    i28 = i11;
                                    i33 = i15;
                                    c2170v4 = c2170v2;
                                    i30 = -1;
                                    i29 = i12;
                                    break;
                                } else {
                                    i32 = i26;
                                    i13 = i12;
                                    i24 = i25;
                                    unsafe = unsafe2;
                                    if (i15 != i13) {
                                    }
                                    i31 = j(i15, bArr, i24, i11, obj, c2170v);
                                    f02 = this;
                                    obj4 = obj;
                                    bArr2 = bArr;
                                    i28 = i11;
                                    i29 = i13;
                                    i33 = i15;
                                    unsafe2 = unsafe;
                                    i30 = -1;
                                    c2170v4 = c2170v;
                                    break;
                                }
                                break;
                            case 2:
                            case 3:
                                i15 = i40;
                                i25 = i19;
                                i26 = i32;
                                bArr2 = bArr;
                                if (i37 == 0) {
                                    int g10 = AbstractC2167u.g(bArr2, i25, c2170v);
                                    unsafe2.putLong(obj, j11, c2170v.f24101b);
                                    i34 |= i42;
                                    i32 = i26;
                                    i28 = i11;
                                    i33 = i15;
                                    c2170v4 = c2170v;
                                    i31 = g10;
                                    i30 = -1;
                                    i29 = i12;
                                    break;
                                } else {
                                    i32 = i26;
                                    i13 = i12;
                                    i24 = i25;
                                    unsafe = unsafe2;
                                    if (i15 != i13) {
                                    }
                                    i31 = j(i15, bArr, i24, i11, obj, c2170v);
                                    f02 = this;
                                    obj4 = obj;
                                    bArr2 = bArr;
                                    i28 = i11;
                                    i29 = i13;
                                    i33 = i15;
                                    unsafe2 = unsafe;
                                    i30 = -1;
                                    c2170v4 = c2170v;
                                    break;
                                }
                                break;
                            case 4:
                            case 11:
                                i15 = i40;
                                c2170v2 = c2170v;
                                i25 = i19;
                                i26 = i32;
                                bArr2 = bArr;
                                if (i37 == 0) {
                                    i31 = AbstractC2167u.e(bArr2, i25, c2170v2);
                                    unsafe2.putInt(obj4, j11, c2170v2.f24100a);
                                    i34 |= i42;
                                    i32 = i26;
                                    i28 = i11;
                                    i33 = i15;
                                    c2170v4 = c2170v2;
                                    i30 = -1;
                                    i29 = i12;
                                    break;
                                } else {
                                    i32 = i26;
                                    i13 = i12;
                                    i24 = i25;
                                    unsafe = unsafe2;
                                    if (i15 != i13) {
                                    }
                                    i31 = j(i15, bArr, i24, i11, obj, c2170v);
                                    f02 = this;
                                    obj4 = obj;
                                    bArr2 = bArr;
                                    i28 = i11;
                                    i29 = i13;
                                    i33 = i15;
                                    unsafe2 = unsafe;
                                    i30 = -1;
                                    c2170v4 = c2170v;
                                    break;
                                }
                                break;
                            case 5:
                            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                                i15 = i40;
                                c2170v2 = c2170v;
                                i26 = i32;
                                bArr2 = bArr;
                                if (i37 == 1) {
                                    unsafe2.putLong(obj, j11, AbstractC2167u.k(bArr2, i19));
                                    i31 = i19 + 8;
                                    i34 |= i42;
                                    i32 = i26;
                                    i28 = i11;
                                    i33 = i15;
                                    c2170v4 = c2170v2;
                                    i30 = -1;
                                    i29 = i12;
                                    break;
                                } else {
                                    i25 = i19;
                                    i32 = i26;
                                    i13 = i12;
                                    i24 = i25;
                                    unsafe = unsafe2;
                                    if (i15 != i13) {
                                    }
                                    i31 = j(i15, bArr, i24, i11, obj, c2170v);
                                    f02 = this;
                                    obj4 = obj;
                                    bArr2 = bArr;
                                    i28 = i11;
                                    i29 = i13;
                                    i33 = i15;
                                    unsafe2 = unsafe;
                                    i30 = -1;
                                    c2170v4 = c2170v;
                                    break;
                                }
                                break;
                            case 6:
                            case 13:
                                i15 = i40;
                                i27 = i11;
                                c2170v2 = c2170v;
                                i26 = i32;
                                bArr2 = bArr;
                                if (i37 == 5) {
                                    unsafe2.putInt(obj4, j11, AbstractC2167u.h(bArr2, i19));
                                    i31 = i19 + 4;
                                    i34 |= i42;
                                    i32 = i26;
                                    i28 = i27;
                                    i33 = i15;
                                    c2170v4 = c2170v2;
                                    i30 = -1;
                                    i29 = i12;
                                    break;
                                } else {
                                    i25 = i19;
                                    i32 = i26;
                                    i13 = i12;
                                    i24 = i25;
                                    unsafe = unsafe2;
                                    if (i15 != i13) {
                                    }
                                    i31 = j(i15, bArr, i24, i11, obj, c2170v);
                                    f02 = this;
                                    obj4 = obj;
                                    bArr2 = bArr;
                                    i28 = i11;
                                    i29 = i13;
                                    i33 = i15;
                                    unsafe2 = unsafe;
                                    i30 = -1;
                                    c2170v4 = c2170v;
                                    break;
                                }
                                break;
                            case 7:
                                i15 = i40;
                                i27 = i11;
                                c2170v2 = c2170v;
                                i26 = i32;
                                bArr2 = bArr;
                                if (i37 == 0) {
                                    i31 = AbstractC2167u.g(bArr2, i19, c2170v2);
                                    AbstractC2125f1.j(obj4, j11, c2170v2.f24101b != 0);
                                    i34 |= i42;
                                    i32 = i26;
                                    i28 = i27;
                                    i33 = i15;
                                    c2170v4 = c2170v2;
                                    i30 = -1;
                                    i29 = i12;
                                    break;
                                } else {
                                    i25 = i19;
                                    i32 = i26;
                                    i13 = i12;
                                    i24 = i25;
                                    unsafe = unsafe2;
                                    if (i15 != i13) {
                                    }
                                    i31 = j(i15, bArr, i24, i11, obj, c2170v);
                                    f02 = this;
                                    obj4 = obj;
                                    bArr2 = bArr;
                                    i28 = i11;
                                    i29 = i13;
                                    i33 = i15;
                                    unsafe2 = unsafe;
                                    i30 = -1;
                                    c2170v4 = c2170v;
                                    break;
                                }
                                break;
                            case 8:
                                i15 = i40;
                                i27 = i11;
                                c2170v2 = c2170v;
                                i26 = i32;
                                j10 = j11;
                                bArr2 = bArr;
                                if (i37 == 2) {
                                    i31 = (i38 & 536870912) == 0 ? AbstractC2167u.i(bArr2, i19, c2170v2) : AbstractC2167u.j(bArr2, i19, c2170v2);
                                    obj3 = c2170v2.f24102c;
                                    unsafe2.putObject(obj4, j10, obj3);
                                    i34 |= i42;
                                    i32 = i26;
                                    i28 = i27;
                                    i33 = i15;
                                    c2170v4 = c2170v2;
                                    i30 = -1;
                                    i29 = i12;
                                    break;
                                } else {
                                    i25 = i19;
                                    i32 = i26;
                                    i13 = i12;
                                    i24 = i25;
                                    unsafe = unsafe2;
                                    if (i15 != i13) {
                                    }
                                    i31 = j(i15, bArr, i24, i11, obj, c2170v);
                                    f02 = this;
                                    obj4 = obj;
                                    bArr2 = bArr;
                                    i28 = i11;
                                    i29 = i13;
                                    i33 = i15;
                                    unsafe2 = unsafe;
                                    i30 = -1;
                                    c2170v4 = c2170v;
                                    break;
                                }
                                break;
                            case 9:
                                i15 = i40;
                                c2170v2 = c2170v;
                                i26 = i32;
                                j10 = j11;
                                bArr2 = bArr;
                                if (i37 == 2) {
                                    i27 = i11;
                                    i31 = m(f02.C(H10), bArr2, i19, i27, c2170v2);
                                    obj3 = (i34 & i42) == 0 ? c2170v2.f24102c : AbstractC2115c0.d(unsafe2.getObject(obj4, j10), c2170v2.f24102c);
                                    unsafe2.putObject(obj4, j10, obj3);
                                    i34 |= i42;
                                    i32 = i26;
                                    i28 = i27;
                                    i33 = i15;
                                    c2170v4 = c2170v2;
                                    i30 = -1;
                                    i29 = i12;
                                    break;
                                } else {
                                    i25 = i19;
                                    i32 = i26;
                                    i13 = i12;
                                    i24 = i25;
                                    unsafe = unsafe2;
                                    if (i15 != i13) {
                                    }
                                    i31 = j(i15, bArr, i24, i11, obj, c2170v);
                                    f02 = this;
                                    obj4 = obj;
                                    bArr2 = bArr;
                                    i28 = i11;
                                    i29 = i13;
                                    i33 = i15;
                                    unsafe2 = unsafe;
                                    i30 = -1;
                                    c2170v4 = c2170v;
                                    break;
                                }
                                break;
                            case RequestError.EVENT_TIMEOUT /* 10 */:
                                i15 = i40;
                                c2170v3 = c2170v;
                                i30 = -1;
                                bArr2 = bArr;
                                if (i37 == 2) {
                                    m10 = AbstractC2167u.m(bArr2, i19, c2170v3);
                                    unsafe2.putObject(obj4, j11, c2170v3.f24102c);
                                    i34 |= i42;
                                    i28 = i11;
                                    i31 = m10;
                                    i33 = i15;
                                    c2170v4 = c2170v3;
                                    i29 = i12;
                                    break;
                                } else {
                                    i25 = i19;
                                    i26 = i32;
                                    i32 = i26;
                                    i13 = i12;
                                    i24 = i25;
                                    unsafe = unsafe2;
                                    if (i15 != i13) {
                                    }
                                    i31 = j(i15, bArr, i24, i11, obj, c2170v);
                                    f02 = this;
                                    obj4 = obj;
                                    bArr2 = bArr;
                                    i28 = i11;
                                    i29 = i13;
                                    i33 = i15;
                                    unsafe2 = unsafe;
                                    i30 = -1;
                                    c2170v4 = c2170v;
                                    break;
                                }
                                break;
                            case 12:
                                i15 = i40;
                                c2170v3 = c2170v;
                                i30 = -1;
                                bArr2 = bArr;
                                if (i37 == 0) {
                                    i31 = AbstractC2167u.e(bArr2, i19, c2170v3);
                                    int i44 = c2170v3.f24100a;
                                    InterfaceC2121e0 E11 = f02.E(H10);
                                    if (E11 == null || E11.n(i44) != null) {
                                        unsafe2.putInt(obj4, j11, i44);
                                        i34 |= i42;
                                    } else {
                                        T(obj).e(i15, Long.valueOf(i44));
                                    }
                                    i28 = i11;
                                    i33 = i15;
                                    c2170v4 = c2170v3;
                                    i29 = i12;
                                    break;
                                } else {
                                    i25 = i19;
                                    i26 = i32;
                                    i32 = i26;
                                    i13 = i12;
                                    i24 = i25;
                                    unsafe = unsafe2;
                                    if (i15 != i13) {
                                    }
                                    i31 = j(i15, bArr, i24, i11, obj, c2170v);
                                    f02 = this;
                                    obj4 = obj;
                                    bArr2 = bArr;
                                    i28 = i11;
                                    i29 = i13;
                                    i33 = i15;
                                    unsafe2 = unsafe;
                                    i30 = -1;
                                    c2170v4 = c2170v;
                                    break;
                                }
                                break;
                            case HVError.SSL_CONNECT_ERROR /* 15 */:
                                i15 = i40;
                                c2170v3 = c2170v;
                                i30 = -1;
                                bArr2 = bArr;
                                if (i37 == 0) {
                                    m10 = AbstractC2167u.e(bArr2, i19, c2170v3);
                                    unsafe2.putInt(obj4, j11, H.e(c2170v3.f24100a));
                                    i34 |= i42;
                                    i28 = i11;
                                    i31 = m10;
                                    i33 = i15;
                                    c2170v4 = c2170v3;
                                    i29 = i12;
                                    break;
                                } else {
                                    i25 = i19;
                                    i26 = i32;
                                    i32 = i26;
                                    i13 = i12;
                                    i24 = i25;
                                    unsafe = unsafe2;
                                    if (i15 != i13) {
                                    }
                                    i31 = j(i15, bArr, i24, i11, obj, c2170v);
                                    f02 = this;
                                    obj4 = obj;
                                    bArr2 = bArr;
                                    i28 = i11;
                                    i29 = i13;
                                    i33 = i15;
                                    unsafe2 = unsafe;
                                    i30 = -1;
                                    c2170v4 = c2170v;
                                    break;
                                }
                                break;
                            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                                i15 = i40;
                                i30 = -1;
                                if (i37 == 0) {
                                    bArr2 = bArr;
                                    int g11 = AbstractC2167u.g(bArr2, i19, c2170v);
                                    unsafe2.putLong(obj, j11, H.a(c2170v.f24101b));
                                    i34 |= i42;
                                    i33 = i15;
                                    c2170v4 = c2170v;
                                    i31 = g11;
                                    i28 = i11;
                                    i29 = i12;
                                    break;
                                } else {
                                    i25 = i19;
                                    i26 = i32;
                                    i32 = i26;
                                    i13 = i12;
                                    i24 = i25;
                                    unsafe = unsafe2;
                                    if (i15 != i13) {
                                    }
                                    i31 = j(i15, bArr, i24, i11, obj, c2170v);
                                    f02 = this;
                                    obj4 = obj;
                                    bArr2 = bArr;
                                    i28 = i11;
                                    i29 = i13;
                                    i33 = i15;
                                    unsafe2 = unsafe;
                                    i30 = -1;
                                    c2170v4 = c2170v;
                                    break;
                                }
                                break;
                            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                                if (i37 == 3) {
                                    i15 = i40;
                                    i30 = -1;
                                    i31 = l(f02.C(H10), bArr, i19, i11, (i36 << 3) | 4, c2170v);
                                    c2170v3 = c2170v;
                                    unsafe2.putObject(obj4, j11, (i34 & i42) == 0 ? c2170v3.f24102c : AbstractC2115c0.d(unsafe2.getObject(obj4, j11), c2170v3.f24102c));
                                    i34 |= i42;
                                    bArr2 = bArr;
                                    i28 = i11;
                                    i33 = i15;
                                    c2170v4 = c2170v3;
                                    i29 = i12;
                                    break;
                                } else {
                                    i15 = i40;
                                    i25 = i19;
                                    i26 = i32;
                                    i32 = i26;
                                    i13 = i12;
                                    i24 = i25;
                                    unsafe = unsafe2;
                                    if (i15 != i13) {
                                    }
                                    i31 = j(i15, bArr, i24, i11, obj, c2170v);
                                    f02 = this;
                                    obj4 = obj;
                                    bArr2 = bArr;
                                    i28 = i11;
                                    i29 = i13;
                                    i33 = i15;
                                    unsafe2 = unsafe;
                                    i30 = -1;
                                    c2170v4 = c2170v;
                                    break;
                                }
                                break;
                            default:
                                i15 = i40;
                                i25 = i19;
                                i26 = i32;
                                i32 = i26;
                                i13 = i12;
                                i24 = i25;
                                unsafe = unsafe2;
                                if (i15 != i13) {
                                }
                                i31 = j(i15, bArr, i24, i11, obj, c2170v);
                                f02 = this;
                                obj4 = obj;
                                bArr2 = bArr;
                                i28 = i11;
                                i29 = i13;
                                i33 = i15;
                                unsafe2 = unsafe;
                                i30 = -1;
                                c2170v4 = c2170v;
                                break;
                        }
                    } else {
                        int i45 = i19;
                        i23 = i32;
                        bArr2 = bArr;
                        if (i39 != 27) {
                            i22 = i34;
                            if (i39 <= 49) {
                                i21 = i40;
                                unsafe = unsafe2;
                                i31 = p(obj, bArr, i45, i11, i40, i36, i37, H10, i38, i39, j11, c2170v);
                                if (i31 == i45) {
                                    i15 = i21;
                                    i13 = i12;
                                    i24 = i31;
                                    i32 = i23;
                                    i34 = i22;
                                } else {
                                    f02 = this;
                                    obj4 = obj;
                                    bArr2 = bArr;
                                    i33 = i21;
                                    i28 = i11;
                                    i29 = i12;
                                    c2170v4 = c2170v;
                                    i32 = i23;
                                    i34 = i22;
                                    unsafe2 = unsafe;
                                    i30 = -1;
                                }
                            } else {
                                i20 = i45;
                                i21 = i40;
                                unsafe = unsafe2;
                                if (i39 != 50) {
                                    i31 = o(obj, bArr, i20, i11, i21, i36, i37, i38, i39, j11, H10, c2170v);
                                    if (i31 == i20) {
                                        i15 = i21;
                                        i13 = i12;
                                        i24 = i31;
                                        i32 = i23;
                                        i34 = i22;
                                    } else {
                                        f02 = this;
                                        obj4 = obj;
                                        bArr2 = bArr;
                                        i33 = i21;
                                        i28 = i11;
                                        i29 = i12;
                                        c2170v4 = c2170v;
                                        i32 = i23;
                                        i34 = i22;
                                        unsafe2 = unsafe;
                                        i30 = -1;
                                    }
                                } else if (i37 == 2) {
                                    i31 = q(obj, bArr, i20, i11, H10, i36, j11, c2170v);
                                    if (i31 == i20) {
                                        i15 = i21;
                                        i13 = i12;
                                        i24 = i31;
                                        i32 = i23;
                                        i34 = i22;
                                    } else {
                                        f02 = this;
                                        obj4 = obj;
                                        bArr2 = bArr;
                                        i33 = i21;
                                        i28 = i11;
                                        i29 = i12;
                                        c2170v4 = c2170v;
                                        i32 = i23;
                                        i34 = i22;
                                        unsafe2 = unsafe;
                                        i30 = -1;
                                    }
                                } else {
                                    i15 = i21;
                                    i13 = i12;
                                    i24 = i20;
                                    i32 = i23;
                                    i34 = i22;
                                }
                            }
                            if (i15 != i13) {
                            }
                            i31 = j(i15, bArr, i24, i11, obj, c2170v);
                            f02 = this;
                            obj4 = obj;
                            bArr2 = bArr;
                            i28 = i11;
                            i29 = i13;
                            i33 = i15;
                            unsafe2 = unsafe;
                            i30 = -1;
                            c2170v4 = c2170v;
                        } else if (i37 == 2) {
                            InterfaceC2124f0 interfaceC2124f0 = (InterfaceC2124f0) unsafe2.getObject(obj4, j11);
                            if (!interfaceC2124f0.H()) {
                                int size = interfaceC2124f0.size();
                                interfaceC2124f0 = interfaceC2124f0.l1(size == 0 ? 10 : size << 1);
                                unsafe2.putObject(obj4, j11, interfaceC2124f0);
                            }
                            InterfaceC2124f0 interfaceC2124f02 = interfaceC2124f0;
                            R0 C10 = f02.C(H10);
                            i33 = i40;
                            i31 = k(C10, i33, bArr, i45, i11, interfaceC2124f02, c2170v);
                            i28 = i11;
                            i29 = i12;
                            i32 = i23;
                            i34 = i34;
                            i30 = -1;
                            c2170v4 = c2170v;
                        } else {
                            i22 = i34;
                            i20 = i45;
                            i21 = i40;
                        }
                    }
                } else {
                    i20 = i19;
                    i21 = i18;
                    i22 = i34;
                    i23 = i32;
                }
                unsafe = unsafe2;
                i15 = i21;
                i13 = i12;
                i24 = i20;
                i32 = i23;
                i34 = i22;
                if (i15 != i13) {
                }
                i31 = j(i15, bArr, i24, i11, obj, c2170v);
                f02 = this;
                obj4 = obj;
                bArr2 = bArr;
                i28 = i11;
                i29 = i13;
                i33 = i15;
                unsafe2 = unsafe;
                i30 = -1;
                c2170v4 = c2170v;
            } else {
                int i46 = i32;
                unsafe = unsafe2;
                i13 = i29;
                i14 = i31;
                i15 = i33;
                i16 = i46;
                i17 = -1;
            }
        }
        if (i16 != i17) {
            obj2 = obj;
            unsafe.putInt(obj2, i16, i34);
        } else {
            obj2 = obj;
        }
        int[] iArr2 = this.f23818l;
        if (iArr2 != null) {
            Object obj5 = null;
            for (int i47 : iArr2) {
                Y0 y02 = this.f23822p;
                int i48 = this.f23807a[i47];
                Object M10 = AbstractC2125f1.M(obj2, F(i47) & 1048575);
                if (M10 != null && (E10 = E(i47)) != null) {
                    obj5 = t(i47, i48, this.f23824r.k(M10), E10, obj5, y02);
                }
                obj5 = (Z0) obj5;
            }
            if (obj5 != null) {
                this.f23822p.h(obj2, obj5);
            }
        }
        if (i13 == 0) {
            if (i14 != i11) {
                throw C2127g0.d();
            }
        } else if (i14 > i11 || i15 != i13) {
            throw C2127g0.d();
        }
        return i14;
    }

    static F0 s(Class cls, InterfaceC2183z0 interfaceC2183z0, H0 h02, AbstractC2142l0 abstractC2142l0, Y0 y02, P p10, InterfaceC2174w0 interfaceC2174w0) {
        int k10;
        int i10;
        int i11;
        int b10;
        int i12;
        int i13;
        if (!(interfaceC2183z0 instanceof O0)) {
            android.support.v4.media.session.b.a(interfaceC2183z0);
            throw null;
        }
        O0 o02 = (O0) interfaceC2183z0;
        boolean z10 = o02.a() == AbstractC2109a0.c.f24002j;
        if (o02.d() == 0) {
            k10 = 0;
            i10 = 0;
            i11 = 0;
        } else {
            int f10 = o02.f();
            int g10 = o02.g();
            k10 = o02.k();
            i10 = f10;
            i11 = g10;
        }
        int[] iArr = new int[k10 << 2];
        Object[] objArr = new Object[k10 << 1];
        int[] iArr2 = o02.h() > 0 ? new int[o02.h()] : null;
        int[] iArr3 = o02.i() > 0 ? new int[o02.i()] : null;
        P0 e10 = o02.e();
        if (e10.a()) {
            int g11 = e10.g();
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            while (true) {
                if (g11 >= o02.l() || i14 >= ((g11 - i10) << 2)) {
                    if (e10.k()) {
                        b10 = (int) AbstractC2125f1.b(e10.l());
                        i12 = (int) AbstractC2125f1.b(e10.m());
                        i13 = 0;
                    } else {
                        b10 = (int) AbstractC2125f1.b(e10.n());
                        if (e10.o()) {
                            i12 = (int) AbstractC2125f1.b(e10.p());
                            i13 = e10.q();
                        } else {
                            i12 = 0;
                            i13 = 0;
                        }
                    }
                    iArr[i14] = e10.g();
                    int i17 = i14 + 1;
                    iArr[i17] = (e10.s() ? 536870912 : 0) | (e10.r() ? 268435456 : 0) | (e10.h() << 20) | b10;
                    iArr[i14 + 2] = i12 | (i13 << 20);
                    if (e10.v() != null) {
                        int i18 = (i14 / 4) << 1;
                        objArr[i18] = e10.v();
                        if (e10.t() != null) {
                            objArr[i18 + 1] = e10.t();
                        } else if (e10.u() != null) {
                            objArr[i18 + 1] = e10.u();
                        }
                    } else if (e10.t() != null) {
                        objArr[((i14 / 4) << 1) + 1] = e10.t();
                    } else if (e10.u() != null) {
                        objArr[((i14 / 4) << 1) + 1] = e10.u();
                    }
                    int h10 = e10.h();
                    if (h10 == W.zziw.ordinal()) {
                        iArr2[i15] = i14;
                        i15++;
                    } else if (h10 >= 18 && h10 <= 49) {
                        iArr3[i16] = iArr[i17] & 1048575;
                        i16++;
                    }
                    if (!e10.a()) {
                        break;
                    }
                    g11 = e10.g();
                } else {
                    for (int i19 = 0; i19 < 4; i19++) {
                        iArr[i14 + i19] = -1;
                    }
                }
                i14 += 4;
            }
        }
        return new F0(iArr, objArr, i10, i11, o02.l(), o02.c(), z10, false, o02.j(), iArr2, iArr3, h02, abstractC2142l0, y02, p10, interfaceC2174w0);
    }

    private final Object t(int i10, int i11, Map map, InterfaceC2121e0 interfaceC2121e0, Object obj, Y0 y02) {
        this.f23824r.h(D(i10));
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (interfaceC2121e0.n(((Integer) entry.getValue()).intValue()) == null) {
                if (obj == null) {
                    obj = y02.f();
                }
                D w10 = AbstractC2179y.w(AbstractC2165t0.a(null, entry.getKey(), entry.getValue()));
                try {
                    AbstractC2165t0.b(w10.b(), null, entry.getKey(), entry.getValue());
                    y02.b(obj, i11, w10.a());
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return obj;
    }

    private static void u(int i10, Object obj, InterfaceC2166t1 interfaceC2166t1) {
        if (obj instanceof String) {
            interfaceC2166t1.r(i10, (String) obj);
        } else {
            interfaceC2166t1.M(i10, (AbstractC2179y) obj);
        }
    }

    private static void v(Y0 y02, Object obj, InterfaceC2166t1 interfaceC2166t1) {
        y02.c(y02.k(obj), interfaceC2166t1);
    }

    private final void w(InterfaceC2166t1 interfaceC2166t1, int i10, Object obj, int i11) {
        if (obj != null) {
            this.f23824r.h(D(i11));
            interfaceC2166t1.Q(i10, null, this.f23824r.j(obj));
        }
    }

    private final void x(Object obj, Object obj2, int i10) {
        long F10 = F(i10) & 1048575;
        if (y(obj2, i10)) {
            Object M10 = AbstractC2125f1.M(obj, F10);
            Object M11 = AbstractC2125f1.M(obj2, F10);
            if (M10 != null && M11 != null) {
                AbstractC2125f1.i(obj, F10, AbstractC2115c0.d(M10, M11));
                I(obj, i10);
            } else if (M11 != null) {
                AbstractC2125f1.i(obj, F10, M11);
                I(obj, i10);
            }
        }
    }

    private final boolean y(Object obj, int i10) {
        if (!this.f23815i) {
            int G10 = G(i10);
            return (AbstractC2125f1.H(obj, (long) (G10 & 1048575)) & (1 << (G10 >>> 20))) != 0;
        }
        int F10 = F(i10);
        long j10 = F10 & 1048575;
        switch ((F10 & 267386880) >>> 20) {
            case 0:
                return AbstractC2125f1.L(obj, j10) != 0.0d;
            case 1:
                return AbstractC2125f1.K(obj, j10) != 0.0f;
            case 2:
                return AbstractC2125f1.I(obj, j10) != 0;
            case 3:
                return AbstractC2125f1.I(obj, j10) != 0;
            case 4:
                return AbstractC2125f1.H(obj, j10) != 0;
            case 5:
                return AbstractC2125f1.I(obj, j10) != 0;
            case 6:
                return AbstractC2125f1.H(obj, j10) != 0;
            case 7:
                return AbstractC2125f1.J(obj, j10);
            case 8:
                Object M10 = AbstractC2125f1.M(obj, j10);
                if (M10 instanceof String) {
                    return !((String) M10).isEmpty();
                }
                if (M10 instanceof AbstractC2179y) {
                    return !AbstractC2179y.f24108b.equals(M10);
                }
                throw new IllegalArgumentException();
            case 9:
                return AbstractC2125f1.M(obj, j10) != null;
            case RequestError.EVENT_TIMEOUT /* 10 */:
                return !AbstractC2179y.f24108b.equals(AbstractC2125f1.M(obj, j10));
            case 11:
                return AbstractC2125f1.H(obj, j10) != 0;
            case 12:
                return AbstractC2125f1.H(obj, j10) != 0;
            case 13:
                return AbstractC2125f1.H(obj, j10) != 0;
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                return AbstractC2125f1.I(obj, j10) != 0;
            case HVError.SSL_CONNECT_ERROR /* 15 */:
                return AbstractC2125f1.H(obj, j10) != 0;
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                return AbstractC2125f1.I(obj, j10) != 0;
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                return AbstractC2125f1.M(obj, j10) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean z(Object obj, int i10, int i11) {
        return AbstractC2125f1.H(obj, (long) (G(i11) & 1048575)) == i10;
    }

    @Override // com.google.android.gms.internal.clearcut.R0
    public final void a(Object obj) {
        int[] iArr = this.f23818l;
        if (iArr != null) {
            for (int i10 : iArr) {
                long F10 = F(i10) & 1048575;
                Object M10 = AbstractC2125f1.M(obj, F10);
                if (M10 != null) {
                    AbstractC2125f1.i(obj, F10, this.f23824r.g(M10));
                }
            }
        }
        int[] iArr2 = this.f23819m;
        if (iArr2 != null) {
            for (int i11 : iArr2) {
                this.f23821o.a(obj, i11);
            }
        }
        this.f23822p.d(obj);
        if (this.f23813g) {
            this.f23823q.f(obj);
        }
    }

    @Override // com.google.android.gms.internal.clearcut.R0
    public final Object b() {
        return this.f23820n.a(this.f23812f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005d, code lost:
    
        if (com.google.android.gms.internal.clearcut.T0.y(com.google.android.gms.internal.clearcut.AbstractC2125f1.M(r10, r6), com.google.android.gms.internal.clearcut.AbstractC2125f1.M(r11, r6)) != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0070, code lost:
    
        if (com.google.android.gms.internal.clearcut.AbstractC2125f1.I(r10, r6) == com.google.android.gms.internal.clearcut.AbstractC2125f1.I(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0081, code lost:
    
        if (com.google.android.gms.internal.clearcut.AbstractC2125f1.H(r10, r6) == com.google.android.gms.internal.clearcut.AbstractC2125f1.H(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0094, code lost:
    
        if (com.google.android.gms.internal.clearcut.AbstractC2125f1.I(r10, r6) == com.google.android.gms.internal.clearcut.AbstractC2125f1.I(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a5, code lost:
    
        if (com.google.android.gms.internal.clearcut.AbstractC2125f1.H(r10, r6) == com.google.android.gms.internal.clearcut.AbstractC2125f1.H(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b6, code lost:
    
        if (com.google.android.gms.internal.clearcut.AbstractC2125f1.H(r10, r6) == com.google.android.gms.internal.clearcut.AbstractC2125f1.H(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c7, code lost:
    
        if (com.google.android.gms.internal.clearcut.AbstractC2125f1.H(r10, r6) == com.google.android.gms.internal.clearcut.AbstractC2125f1.H(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00dd, code lost:
    
        if (com.google.android.gms.internal.clearcut.T0.y(com.google.android.gms.internal.clearcut.AbstractC2125f1.M(r10, r6), com.google.android.gms.internal.clearcut.AbstractC2125f1.M(r11, r6)) != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f3, code lost:
    
        if (com.google.android.gms.internal.clearcut.T0.y(com.google.android.gms.internal.clearcut.AbstractC2125f1.M(r10, r6), com.google.android.gms.internal.clearcut.AbstractC2125f1.M(r11, r6)) != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0109, code lost:
    
        if (com.google.android.gms.internal.clearcut.T0.y(com.google.android.gms.internal.clearcut.AbstractC2125f1.M(r10, r6), com.google.android.gms.internal.clearcut.AbstractC2125f1.M(r11, r6)) != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x011b, code lost:
    
        if (com.google.android.gms.internal.clearcut.AbstractC2125f1.J(r10, r6) == com.google.android.gms.internal.clearcut.AbstractC2125f1.J(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x012d, code lost:
    
        if (com.google.android.gms.internal.clearcut.AbstractC2125f1.H(r10, r6) == com.google.android.gms.internal.clearcut.AbstractC2125f1.H(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0141, code lost:
    
        if (com.google.android.gms.internal.clearcut.AbstractC2125f1.I(r10, r6) == com.google.android.gms.internal.clearcut.AbstractC2125f1.I(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0153, code lost:
    
        if (com.google.android.gms.internal.clearcut.AbstractC2125f1.H(r10, r6) == com.google.android.gms.internal.clearcut.AbstractC2125f1.H(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0167, code lost:
    
        if (com.google.android.gms.internal.clearcut.AbstractC2125f1.I(r10, r6) == com.google.android.gms.internal.clearcut.AbstractC2125f1.I(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x017b, code lost:
    
        if (com.google.android.gms.internal.clearcut.AbstractC2125f1.I(r10, r6) == com.google.android.gms.internal.clearcut.AbstractC2125f1.I(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x018d, code lost:
    
        if (com.google.android.gms.internal.clearcut.AbstractC2125f1.H(r10, r6) == com.google.android.gms.internal.clearcut.AbstractC2125f1.H(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01a1, code lost:
    
        if (com.google.android.gms.internal.clearcut.AbstractC2125f1.I(r10, r6) == com.google.android.gms.internal.clearcut.AbstractC2125f1.I(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        if (com.google.android.gms.internal.clearcut.T0.y(com.google.android.gms.internal.clearcut.AbstractC2125f1.M(r10, r6), com.google.android.gms.internal.clearcut.AbstractC2125f1.M(r11, r6)) != false) goto L104;
     */
    @Override // com.google.android.gms.internal.clearcut.R0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(Object obj, Object obj2) {
        int length = this.f23807a.length;
        int i10 = 0;
        while (true) {
            boolean z10 = true;
            if (i10 >= length) {
                if (!this.f23822p.k(obj).equals(this.f23822p.k(obj2))) {
                    return false;
                }
                if (this.f23813g) {
                    return this.f23823q.b(obj).equals(this.f23823q.b(obj2));
                }
                return true;
            }
            int F10 = F(i10);
            long j10 = F10 & 1048575;
            switch ((F10 & 267386880) >>> 20) {
                case 0:
                    if (M(obj, obj2, i10)) {
                        break;
                    }
                    z10 = false;
                    break;
                case 1:
                    if (M(obj, obj2, i10)) {
                        break;
                    }
                    z10 = false;
                    break;
                case 2:
                    if (M(obj, obj2, i10)) {
                        break;
                    }
                    z10 = false;
                    break;
                case 3:
                    if (M(obj, obj2, i10)) {
                        break;
                    }
                    z10 = false;
                    break;
                case 4:
                    if (M(obj, obj2, i10)) {
                        break;
                    }
                    z10 = false;
                    break;
                case 5:
                    if (M(obj, obj2, i10)) {
                        break;
                    }
                    z10 = false;
                    break;
                case 6:
                    if (M(obj, obj2, i10)) {
                        break;
                    }
                    z10 = false;
                    break;
                case 7:
                    if (M(obj, obj2, i10)) {
                        break;
                    }
                    z10 = false;
                    break;
                case 8:
                    if (M(obj, obj2, i10)) {
                        break;
                    }
                    z10 = false;
                    break;
                case 9:
                    if (M(obj, obj2, i10)) {
                        break;
                    }
                    z10 = false;
                    break;
                case RequestError.EVENT_TIMEOUT /* 10 */:
                    if (M(obj, obj2, i10)) {
                        break;
                    }
                    z10 = false;
                    break;
                case 11:
                    if (M(obj, obj2, i10)) {
                        break;
                    }
                    z10 = false;
                    break;
                case 12:
                    if (M(obj, obj2, i10)) {
                        break;
                    }
                    z10 = false;
                    break;
                case 13:
                    if (M(obj, obj2, i10)) {
                        break;
                    }
                    z10 = false;
                    break;
                case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                    if (M(obj, obj2, i10)) {
                        break;
                    }
                    z10 = false;
                    break;
                case HVError.SSL_CONNECT_ERROR /* 15 */:
                    if (M(obj, obj2, i10)) {
                        break;
                    }
                    z10 = false;
                    break;
                case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                    if (M(obj, obj2, i10)) {
                        break;
                    }
                    z10 = false;
                    break;
                case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                    if (M(obj, obj2, i10)) {
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
                case 50:
                    z10 = T0.y(AbstractC2125f1.M(obj, j10), AbstractC2125f1.M(obj2, j10));
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
                    long G10 = G(i10) & 1048575;
                    if (AbstractC2125f1.H(obj, G10) == AbstractC2125f1.H(obj2, G10)) {
                        break;
                    }
                    z10 = false;
                    break;
            }
            if (!z10) {
                return false;
            }
            i10 += 4;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00f2, code lost:
    
        if (r3 != null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00f4, code lost:
    
        r7 = r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00f8, code lost:
    
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0110, code lost:
    
        if (r3 != null) goto L69;
     */
    @Override // com.google.android.gms.internal.clearcut.R0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int d(Object obj) {
        int i10;
        double L10;
        float K10;
        boolean J10;
        Object M10;
        int H10;
        long I10;
        Object M11;
        int length = this.f23807a.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 4) {
            int F10 = F(i12);
            int i13 = this.f23807a[i12];
            long j10 = 1048575 & F10;
            int i14 = 37;
            switch ((F10 & 267386880) >>> 20) {
                case 0:
                    i10 = i11 * 53;
                    L10 = AbstractC2125f1.L(obj, j10);
                    I10 = Double.doubleToLongBits(L10);
                    H10 = AbstractC2115c0.i(I10);
                    i11 = i10 + H10;
                    break;
                case 1:
                    i10 = i11 * 53;
                    K10 = AbstractC2125f1.K(obj, j10);
                    H10 = Float.floatToIntBits(K10);
                    i11 = i10 + H10;
                    break;
                case 2:
                case 3:
                case 5:
                case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                    i10 = i11 * 53;
                    I10 = AbstractC2125f1.I(obj, j10);
                    H10 = AbstractC2115c0.i(I10);
                    i11 = i10 + H10;
                    break;
                case 4:
                case 6:
                case 11:
                case 12:
                case 13:
                case HVError.SSL_CONNECT_ERROR /* 15 */:
                    i10 = i11 * 53;
                    H10 = AbstractC2125f1.H(obj, j10);
                    i11 = i10 + H10;
                    break;
                case 7:
                    i10 = i11 * 53;
                    J10 = AbstractC2125f1.J(obj, j10);
                    H10 = AbstractC2115c0.f(J10);
                    i11 = i10 + H10;
                    break;
                case 8:
                    i10 = i11 * 53;
                    H10 = ((String) AbstractC2125f1.M(obj, j10)).hashCode();
                    i11 = i10 + H10;
                    break;
                case 9:
                    M10 = AbstractC2125f1.M(obj, j10);
                    break;
                case RequestError.EVENT_TIMEOUT /* 10 */:
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
                case 50:
                    i10 = i11 * 53;
                    M11 = AbstractC2125f1.M(obj, j10);
                    H10 = M11.hashCode();
                    i11 = i10 + H10;
                    break;
                case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                    M10 = AbstractC2125f1.M(obj, j10);
                    break;
                case 51:
                    if (z(obj, i13, i12)) {
                        i10 = i11 * 53;
                        L10 = O(obj, j10);
                        I10 = Double.doubleToLongBits(L10);
                        H10 = AbstractC2115c0.i(I10);
                        i11 = i10 + H10;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (z(obj, i13, i12)) {
                        i10 = i11 * 53;
                        K10 = P(obj, j10);
                        H10 = Float.floatToIntBits(K10);
                        i11 = i10 + H10;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (!z(obj, i13, i12)) {
                        break;
                    }
                    i10 = i11 * 53;
                    I10 = R(obj, j10);
                    H10 = AbstractC2115c0.i(I10);
                    i11 = i10 + H10;
                    break;
                case 54:
                    if (!z(obj, i13, i12)) {
                        break;
                    }
                    i10 = i11 * 53;
                    I10 = R(obj, j10);
                    H10 = AbstractC2115c0.i(I10);
                    i11 = i10 + H10;
                    break;
                case 55:
                    if (!z(obj, i13, i12)) {
                        break;
                    }
                    i10 = i11 * 53;
                    H10 = Q(obj, j10);
                    i11 = i10 + H10;
                    break;
                case 56:
                    if (!z(obj, i13, i12)) {
                        break;
                    }
                    i10 = i11 * 53;
                    I10 = R(obj, j10);
                    H10 = AbstractC2115c0.i(I10);
                    i11 = i10 + H10;
                    break;
                case 57:
                    if (!z(obj, i13, i12)) {
                        break;
                    }
                    i10 = i11 * 53;
                    H10 = Q(obj, j10);
                    i11 = i10 + H10;
                    break;
                case 58:
                    if (z(obj, i13, i12)) {
                        i10 = i11 * 53;
                        J10 = S(obj, j10);
                        H10 = AbstractC2115c0.f(J10);
                        i11 = i10 + H10;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!z(obj, i13, i12)) {
                        break;
                    }
                    i10 = i11 * 53;
                    H10 = ((String) AbstractC2125f1.M(obj, j10)).hashCode();
                    i11 = i10 + H10;
                    break;
                case HVError.DETECTOR_NOT_AVAILABLE_ERROR /* 60 */:
                    if (!z(obj, i13, i12)) {
                        break;
                    }
                    M11 = AbstractC2125f1.M(obj, j10);
                    i10 = i11 * 53;
                    H10 = M11.hashCode();
                    i11 = i10 + H10;
                    break;
                case 61:
                    if (!z(obj, i13, i12)) {
                        break;
                    }
                    i10 = i11 * 53;
                    M11 = AbstractC2125f1.M(obj, j10);
                    H10 = M11.hashCode();
                    i11 = i10 + H10;
                    break;
                case 62:
                    if (!z(obj, i13, i12)) {
                        break;
                    }
                    i10 = i11 * 53;
                    H10 = Q(obj, j10);
                    i11 = i10 + H10;
                    break;
                case 63:
                    if (!z(obj, i13, i12)) {
                        break;
                    }
                    i10 = i11 * 53;
                    H10 = Q(obj, j10);
                    i11 = i10 + H10;
                    break;
                case 64:
                    if (!z(obj, i13, i12)) {
                        break;
                    }
                    i10 = i11 * 53;
                    H10 = Q(obj, j10);
                    i11 = i10 + H10;
                    break;
                case 65:
                    if (!z(obj, i13, i12)) {
                        break;
                    }
                    i10 = i11 * 53;
                    I10 = R(obj, j10);
                    H10 = AbstractC2115c0.i(I10);
                    i11 = i10 + H10;
                    break;
                case 66:
                    if (!z(obj, i13, i12)) {
                        break;
                    }
                    i10 = i11 * 53;
                    H10 = Q(obj, j10);
                    i11 = i10 + H10;
                    break;
                case 67:
                    if (!z(obj, i13, i12)) {
                        break;
                    }
                    i10 = i11 * 53;
                    I10 = R(obj, j10);
                    H10 = AbstractC2115c0.i(I10);
                    i11 = i10 + H10;
                    break;
                case 68:
                    if (!z(obj, i13, i12)) {
                        break;
                    }
                    M11 = AbstractC2125f1.M(obj, j10);
                    i10 = i11 * 53;
                    H10 = M11.hashCode();
                    i11 = i10 + H10;
                    break;
            }
        }
        int hashCode = (i11 * 53) + this.f23822p.k(obj).hashCode();
        return this.f23813g ? (hashCode * 53) + this.f23823q.b(obj).hashCode() : hashCode;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:550:0x0986  */
    @Override // com.google.android.gms.internal.clearcut.R0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(Object obj, InterfaceC2166t1 interfaceC2166t1) {
        Iterator it;
        Map.Entry entry;
        int length;
        int i10;
        double L10;
        float K10;
        long I10;
        long I11;
        int H10;
        long I12;
        int H11;
        boolean J10;
        int H12;
        int H13;
        int H14;
        long I13;
        int H15;
        long I14;
        Iterator it2;
        Map.Entry entry2;
        int length2;
        double L11;
        float K11;
        long I15;
        long I16;
        int H16;
        long I17;
        int H17;
        boolean J11;
        int H18;
        int H19;
        int H20;
        long I18;
        int H21;
        long I19;
        if (interfaceC2166t1.B() == AbstractC2109a0.c.f24005m) {
            v(this.f23822p, obj, interfaceC2166t1);
            if (this.f23813g) {
                U b10 = this.f23823q.b(obj);
                if (!b10.b()) {
                    it2 = b10.a();
                    entry2 = (Map.Entry) it2.next();
                    for (length2 = this.f23807a.length - 4; length2 >= 0; length2 -= 4) {
                        int F10 = F(length2);
                        int i11 = this.f23807a[length2];
                        while (entry2 != null && this.f23823q.a(entry2) > i11) {
                            this.f23823q.c(interfaceC2166t1, entry2);
                            entry2 = it2.hasNext() ? (Map.Entry) it2.next() : null;
                        }
                        switch ((F10 & 267386880) >>> 20) {
                            case 0:
                                if (y(obj, length2)) {
                                    L11 = AbstractC2125f1.L(obj, F10 & 1048575);
                                    interfaceC2166t1.u(i11, L11);
                                    break;
                                } else {
                                    break;
                                }
                            case 1:
                                if (y(obj, length2)) {
                                    K11 = AbstractC2125f1.K(obj, F10 & 1048575);
                                    interfaceC2166t1.v(i11, K11);
                                    break;
                                } else {
                                    break;
                                }
                            case 2:
                                if (y(obj, length2)) {
                                    I15 = AbstractC2125f1.I(obj, F10 & 1048575);
                                    interfaceC2166t1.K(i11, I15);
                                    break;
                                } else {
                                    break;
                                }
                            case 3:
                                if (y(obj, length2)) {
                                    I16 = AbstractC2125f1.I(obj, F10 & 1048575);
                                    interfaceC2166t1.t(i11, I16);
                                    break;
                                } else {
                                    break;
                                }
                            case 4:
                                if (y(obj, length2)) {
                                    H16 = AbstractC2125f1.H(obj, F10 & 1048575);
                                    interfaceC2166t1.o(i11, H16);
                                    break;
                                } else {
                                    break;
                                }
                            case 5:
                                if (y(obj, length2)) {
                                    I17 = AbstractC2125f1.I(obj, F10 & 1048575);
                                    interfaceC2166t1.a(i11, I17);
                                    break;
                                } else {
                                    break;
                                }
                            case 6:
                                if (y(obj, length2)) {
                                    H17 = AbstractC2125f1.H(obj, F10 & 1048575);
                                    interfaceC2166t1.x(i11, H17);
                                    break;
                                } else {
                                    break;
                                }
                            case 7:
                                if (y(obj, length2)) {
                                    J11 = AbstractC2125f1.J(obj, F10 & 1048575);
                                    interfaceC2166t1.n(i11, J11);
                                    break;
                                } else {
                                    break;
                                }
                            case 8:
                                if (!y(obj, length2)) {
                                    break;
                                }
                                u(i11, AbstractC2125f1.M(obj, F10 & 1048575), interfaceC2166t1);
                                break;
                            case 9:
                                if (!y(obj, length2)) {
                                    break;
                                }
                                interfaceC2166t1.N(i11, AbstractC2125f1.M(obj, F10 & 1048575), C(length2));
                                break;
                            case RequestError.EVENT_TIMEOUT /* 10 */:
                                if (!y(obj, length2)) {
                                    break;
                                }
                                interfaceC2166t1.M(i11, (AbstractC2179y) AbstractC2125f1.M(obj, F10 & 1048575));
                                break;
                            case 11:
                                if (y(obj, length2)) {
                                    H18 = AbstractC2125f1.H(obj, F10 & 1048575);
                                    interfaceC2166t1.D(i11, H18);
                                    break;
                                } else {
                                    break;
                                }
                            case 12:
                                if (y(obj, length2)) {
                                    H19 = AbstractC2125f1.H(obj, F10 & 1048575);
                                    interfaceC2166t1.L(i11, H19);
                                    break;
                                } else {
                                    break;
                                }
                            case 13:
                                if (y(obj, length2)) {
                                    H20 = AbstractC2125f1.H(obj, F10 & 1048575);
                                    interfaceC2166t1.R(i11, H20);
                                    break;
                                } else {
                                    break;
                                }
                            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                                if (y(obj, length2)) {
                                    I18 = AbstractC2125f1.I(obj, F10 & 1048575);
                                    interfaceC2166t1.h(i11, I18);
                                    break;
                                } else {
                                    break;
                                }
                            case HVError.SSL_CONNECT_ERROR /* 15 */:
                                if (y(obj, length2)) {
                                    H21 = AbstractC2125f1.H(obj, F10 & 1048575);
                                    interfaceC2166t1.F(i11, H21);
                                    break;
                                } else {
                                    break;
                                }
                            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                                if (y(obj, length2)) {
                                    I19 = AbstractC2125f1.I(obj, F10 & 1048575);
                                    interfaceC2166t1.j(i11, I19);
                                    break;
                                } else {
                                    break;
                                }
                            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                                if (!y(obj, length2)) {
                                    break;
                                }
                                interfaceC2166t1.P(i11, AbstractC2125f1.M(obj, F10 & 1048575), C(length2));
                                break;
                            case 18:
                                T0.f(this.f23807a[length2], (List) AbstractC2125f1.M(obj, F10 & 1048575), interfaceC2166t1, false);
                                break;
                            case 19:
                                T0.m(this.f23807a[length2], (List) AbstractC2125f1.M(obj, F10 & 1048575), interfaceC2166t1, false);
                                break;
                            case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                                T0.r(this.f23807a[length2], (List) AbstractC2125f1.M(obj, F10 & 1048575), interfaceC2166t1, false);
                                break;
                            case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                                T0.x(this.f23807a[length2], (List) AbstractC2125f1.M(obj, F10 & 1048575), interfaceC2166t1, false);
                                break;
                            case HVError.FACE_DETECTION_ERROR /* 22 */:
                                T0.M(this.f23807a[length2], (List) AbstractC2125f1.M(obj, F10 & 1048575), interfaceC2166t1, false);
                                break;
                            case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                                T0.H(this.f23807a[length2], (List) AbstractC2125f1.M(obj, F10 & 1048575), interfaceC2166t1, false);
                                break;
                            case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                                T0.R(this.f23807a[length2], (List) AbstractC2125f1.M(obj, F10 & 1048575), interfaceC2166t1, false);
                                break;
                            case HVError.LOW_STORAGE_ERROR /* 25 */:
                                T0.U(this.f23807a[length2], (List) AbstractC2125f1.M(obj, F10 & 1048575), interfaceC2166t1, false);
                                break;
                            case 26:
                                T0.d(this.f23807a[length2], (List) AbstractC2125f1.M(obj, F10 & 1048575), interfaceC2166t1);
                                break;
                            case 27:
                                T0.e(this.f23807a[length2], (List) AbstractC2125f1.M(obj, F10 & 1048575), interfaceC2166t1, C(length2));
                                break;
                            case 28:
                                T0.k(this.f23807a[length2], (List) AbstractC2125f1.M(obj, F10 & 1048575), interfaceC2166t1);
                                break;
                            case 29:
                                T0.O(this.f23807a[length2], (List) AbstractC2125f1.M(obj, F10 & 1048575), interfaceC2166t1, false);
                                break;
                            case 30:
                                T0.T(this.f23807a[length2], (List) AbstractC2125f1.M(obj, F10 & 1048575), interfaceC2166t1, false);
                                break;
                            case HVError.INSTRUCTION_ERROR /* 31 */:
                                T0.S(this.f23807a[length2], (List) AbstractC2125f1.M(obj, F10 & 1048575), interfaceC2166t1, false);
                                break;
                            case 32:
                                T0.K(this.f23807a[length2], (List) AbstractC2125f1.M(obj, F10 & 1048575), interfaceC2166t1, false);
                                break;
                            case HVError.GPS_ACCESS_DENIED /* 33 */:
                                T0.Q(this.f23807a[length2], (List) AbstractC2125f1.M(obj, F10 & 1048575), interfaceC2166t1, false);
                                break;
                            case 34:
                                T0.F(this.f23807a[length2], (List) AbstractC2125f1.M(obj, F10 & 1048575), interfaceC2166t1, false);
                                break;
                            case HVError.FACE_CAPTURE_TIMEOUT /* 35 */:
                                T0.f(this.f23807a[length2], (List) AbstractC2125f1.M(obj, F10 & 1048575), interfaceC2166t1, true);
                                break;
                            case HVError.HYPER_DOC_DETECT_ERROR /* 36 */:
                                T0.m(this.f23807a[length2], (List) AbstractC2125f1.M(obj, F10 & 1048575), interfaceC2166t1, true);
                                break;
                            case HVError.INVALID_FILE_ERROR /* 37 */:
                                T0.r(this.f23807a[length2], (List) AbstractC2125f1.M(obj, F10 & 1048575), interfaceC2166t1, true);
                                break;
                            case 38:
                                T0.x(this.f23807a[length2], (List) AbstractC2125f1.M(obj, F10 & 1048575), interfaceC2166t1, true);
                                break;
                            case 39:
                                T0.M(this.f23807a[length2], (List) AbstractC2125f1.M(obj, F10 & 1048575), interfaceC2166t1, true);
                                break;
                            case RequestError.NETWORK_FAILURE /* 40 */:
                                T0.H(this.f23807a[length2], (List) AbstractC2125f1.M(obj, F10 & 1048575), interfaceC2166t1, true);
                                break;
                            case RequestError.NO_DEV_KEY /* 41 */:
                                T0.R(this.f23807a[length2], (List) AbstractC2125f1.M(obj, F10 & 1048575), interfaceC2166t1, true);
                                break;
                            case HVError.CONSENT_DENIED /* 42 */:
                                T0.U(this.f23807a[length2], (List) AbstractC2125f1.M(obj, F10 & 1048575), interfaceC2166t1, true);
                                break;
                            case HVError.ENCRYPTION_ERROR /* 43 */:
                                T0.O(this.f23807a[length2], (List) AbstractC2125f1.M(obj, F10 & 1048575), interfaceC2166t1, true);
                                break;
                            case HVError.SDK_CLOSE_ERROR /* 44 */:
                                T0.T(this.f23807a[length2], (List) AbstractC2125f1.M(obj, F10 & 1048575), interfaceC2166t1, true);
                                break;
                            case HVError.PERMISSION_REVOKED_ERROR /* 45 */:
                                T0.S(this.f23807a[length2], (List) AbstractC2125f1.M(obj, F10 & 1048575), interfaceC2166t1, true);
                                break;
                            case 46:
                                T0.K(this.f23807a[length2], (List) AbstractC2125f1.M(obj, F10 & 1048575), interfaceC2166t1, true);
                                break;
                            case 47:
                                T0.Q(this.f23807a[length2], (List) AbstractC2125f1.M(obj, F10 & 1048575), interfaceC2166t1, true);
                                break;
                            case 48:
                                T0.F(this.f23807a[length2], (List) AbstractC2125f1.M(obj, F10 & 1048575), interfaceC2166t1, true);
                                break;
                            case 49:
                                T0.l(this.f23807a[length2], (List) AbstractC2125f1.M(obj, F10 & 1048575), interfaceC2166t1, C(length2));
                                break;
                            case 50:
                                w(interfaceC2166t1, i11, AbstractC2125f1.M(obj, F10 & 1048575), length2);
                                break;
                            case 51:
                                if (z(obj, i11, length2)) {
                                    L11 = O(obj, F10 & 1048575);
                                    interfaceC2166t1.u(i11, L11);
                                    break;
                                } else {
                                    break;
                                }
                            case 52:
                                if (z(obj, i11, length2)) {
                                    K11 = P(obj, F10 & 1048575);
                                    interfaceC2166t1.v(i11, K11);
                                    break;
                                } else {
                                    break;
                                }
                            case 53:
                                if (z(obj, i11, length2)) {
                                    I15 = R(obj, F10 & 1048575);
                                    interfaceC2166t1.K(i11, I15);
                                    break;
                                } else {
                                    break;
                                }
                            case 54:
                                if (z(obj, i11, length2)) {
                                    I16 = R(obj, F10 & 1048575);
                                    interfaceC2166t1.t(i11, I16);
                                    break;
                                } else {
                                    break;
                                }
                            case 55:
                                if (z(obj, i11, length2)) {
                                    H16 = Q(obj, F10 & 1048575);
                                    interfaceC2166t1.o(i11, H16);
                                    break;
                                } else {
                                    break;
                                }
                            case 56:
                                if (z(obj, i11, length2)) {
                                    I17 = R(obj, F10 & 1048575);
                                    interfaceC2166t1.a(i11, I17);
                                    break;
                                } else {
                                    break;
                                }
                            case 57:
                                if (z(obj, i11, length2)) {
                                    H17 = Q(obj, F10 & 1048575);
                                    interfaceC2166t1.x(i11, H17);
                                    break;
                                } else {
                                    break;
                                }
                            case 58:
                                if (z(obj, i11, length2)) {
                                    J11 = S(obj, F10 & 1048575);
                                    interfaceC2166t1.n(i11, J11);
                                    break;
                                } else {
                                    break;
                                }
                            case 59:
                                if (!z(obj, i11, length2)) {
                                    break;
                                }
                                u(i11, AbstractC2125f1.M(obj, F10 & 1048575), interfaceC2166t1);
                                break;
                            case HVError.DETECTOR_NOT_AVAILABLE_ERROR /* 60 */:
                                if (!z(obj, i11, length2)) {
                                    break;
                                }
                                interfaceC2166t1.N(i11, AbstractC2125f1.M(obj, F10 & 1048575), C(length2));
                                break;
                            case 61:
                                if (!z(obj, i11, length2)) {
                                    break;
                                }
                                interfaceC2166t1.M(i11, (AbstractC2179y) AbstractC2125f1.M(obj, F10 & 1048575));
                                break;
                            case 62:
                                if (z(obj, i11, length2)) {
                                    H18 = Q(obj, F10 & 1048575);
                                    interfaceC2166t1.D(i11, H18);
                                    break;
                                } else {
                                    break;
                                }
                            case 63:
                                if (z(obj, i11, length2)) {
                                    H19 = Q(obj, F10 & 1048575);
                                    interfaceC2166t1.L(i11, H19);
                                    break;
                                } else {
                                    break;
                                }
                            case 64:
                                if (z(obj, i11, length2)) {
                                    H20 = Q(obj, F10 & 1048575);
                                    interfaceC2166t1.R(i11, H20);
                                    break;
                                } else {
                                    break;
                                }
                            case 65:
                                if (z(obj, i11, length2)) {
                                    I18 = R(obj, F10 & 1048575);
                                    interfaceC2166t1.h(i11, I18);
                                    break;
                                } else {
                                    break;
                                }
                            case 66:
                                if (z(obj, i11, length2)) {
                                    H21 = Q(obj, F10 & 1048575);
                                    interfaceC2166t1.F(i11, H21);
                                    break;
                                } else {
                                    break;
                                }
                            case 67:
                                if (z(obj, i11, length2)) {
                                    I19 = R(obj, F10 & 1048575);
                                    interfaceC2166t1.j(i11, I19);
                                    break;
                                } else {
                                    break;
                                }
                            case 68:
                                if (!z(obj, i11, length2)) {
                                    break;
                                }
                                interfaceC2166t1.P(i11, AbstractC2125f1.M(obj, F10 & 1048575), C(length2));
                                break;
                        }
                    }
                    while (entry2 != null) {
                        this.f23823q.c(interfaceC2166t1, entry2);
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
        if (!this.f23815i) {
            K(obj, interfaceC2166t1);
            return;
        }
        if (this.f23813g) {
            U b11 = this.f23823q.b(obj);
            if (!b11.b()) {
                it = b11.e();
                entry = (Map.Entry) it.next();
                length = this.f23807a.length;
                for (i10 = 0; i10 < length; i10 += 4) {
                    int F11 = F(i10);
                    int i12 = this.f23807a[i10];
                    while (entry != null && this.f23823q.a(entry) <= i12) {
                        this.f23823q.c(interfaceC2166t1, entry);
                        entry = it.hasNext() ? (Map.Entry) it.next() : null;
                    }
                    switch ((F11 & 267386880) >>> 20) {
                        case 0:
                            if (y(obj, i10)) {
                                L10 = AbstractC2125f1.L(obj, F11 & 1048575);
                                interfaceC2166t1.u(i12, L10);
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (y(obj, i10)) {
                                K10 = AbstractC2125f1.K(obj, F11 & 1048575);
                                interfaceC2166t1.v(i12, K10);
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if (y(obj, i10)) {
                                I10 = AbstractC2125f1.I(obj, F11 & 1048575);
                                interfaceC2166t1.K(i12, I10);
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if (y(obj, i10)) {
                                I11 = AbstractC2125f1.I(obj, F11 & 1048575);
                                interfaceC2166t1.t(i12, I11);
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if (y(obj, i10)) {
                                H10 = AbstractC2125f1.H(obj, F11 & 1048575);
                                interfaceC2166t1.o(i12, H10);
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if (y(obj, i10)) {
                                I12 = AbstractC2125f1.I(obj, F11 & 1048575);
                                interfaceC2166t1.a(i12, I12);
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if (y(obj, i10)) {
                                H11 = AbstractC2125f1.H(obj, F11 & 1048575);
                                interfaceC2166t1.x(i12, H11);
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if (y(obj, i10)) {
                                J10 = AbstractC2125f1.J(obj, F11 & 1048575);
                                interfaceC2166t1.n(i12, J10);
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            if (!y(obj, i10)) {
                                break;
                            }
                            u(i12, AbstractC2125f1.M(obj, F11 & 1048575), interfaceC2166t1);
                            break;
                        case 9:
                            if (!y(obj, i10)) {
                                break;
                            }
                            interfaceC2166t1.N(i12, AbstractC2125f1.M(obj, F11 & 1048575), C(i10));
                            break;
                        case RequestError.EVENT_TIMEOUT /* 10 */:
                            if (!y(obj, i10)) {
                                break;
                            }
                            interfaceC2166t1.M(i12, (AbstractC2179y) AbstractC2125f1.M(obj, F11 & 1048575));
                            break;
                        case 11:
                            if (y(obj, i10)) {
                                H12 = AbstractC2125f1.H(obj, F11 & 1048575);
                                interfaceC2166t1.D(i12, H12);
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            if (y(obj, i10)) {
                                H13 = AbstractC2125f1.H(obj, F11 & 1048575);
                                interfaceC2166t1.L(i12, H13);
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            if (y(obj, i10)) {
                                H14 = AbstractC2125f1.H(obj, F11 & 1048575);
                                interfaceC2166t1.R(i12, H14);
                                break;
                            } else {
                                break;
                            }
                        case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                            if (y(obj, i10)) {
                                I13 = AbstractC2125f1.I(obj, F11 & 1048575);
                                interfaceC2166t1.h(i12, I13);
                                break;
                            } else {
                                break;
                            }
                        case HVError.SSL_CONNECT_ERROR /* 15 */:
                            if (y(obj, i10)) {
                                H15 = AbstractC2125f1.H(obj, F11 & 1048575);
                                interfaceC2166t1.F(i12, H15);
                                break;
                            } else {
                                break;
                            }
                        case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                            if (y(obj, i10)) {
                                I14 = AbstractC2125f1.I(obj, F11 & 1048575);
                                interfaceC2166t1.j(i12, I14);
                                break;
                            } else {
                                break;
                            }
                        case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                            if (!y(obj, i10)) {
                                break;
                            }
                            interfaceC2166t1.P(i12, AbstractC2125f1.M(obj, F11 & 1048575), C(i10));
                            break;
                        case 18:
                            T0.f(this.f23807a[i10], (List) AbstractC2125f1.M(obj, F11 & 1048575), interfaceC2166t1, false);
                            break;
                        case 19:
                            T0.m(this.f23807a[i10], (List) AbstractC2125f1.M(obj, F11 & 1048575), interfaceC2166t1, false);
                            break;
                        case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                            T0.r(this.f23807a[i10], (List) AbstractC2125f1.M(obj, F11 & 1048575), interfaceC2166t1, false);
                            break;
                        case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                            T0.x(this.f23807a[i10], (List) AbstractC2125f1.M(obj, F11 & 1048575), interfaceC2166t1, false);
                            break;
                        case HVError.FACE_DETECTION_ERROR /* 22 */:
                            T0.M(this.f23807a[i10], (List) AbstractC2125f1.M(obj, F11 & 1048575), interfaceC2166t1, false);
                            break;
                        case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                            T0.H(this.f23807a[i10], (List) AbstractC2125f1.M(obj, F11 & 1048575), interfaceC2166t1, false);
                            break;
                        case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                            T0.R(this.f23807a[i10], (List) AbstractC2125f1.M(obj, F11 & 1048575), interfaceC2166t1, false);
                            break;
                        case HVError.LOW_STORAGE_ERROR /* 25 */:
                            T0.U(this.f23807a[i10], (List) AbstractC2125f1.M(obj, F11 & 1048575), interfaceC2166t1, false);
                            break;
                        case 26:
                            T0.d(this.f23807a[i10], (List) AbstractC2125f1.M(obj, F11 & 1048575), interfaceC2166t1);
                            break;
                        case 27:
                            T0.e(this.f23807a[i10], (List) AbstractC2125f1.M(obj, F11 & 1048575), interfaceC2166t1, C(i10));
                            break;
                        case 28:
                            T0.k(this.f23807a[i10], (List) AbstractC2125f1.M(obj, F11 & 1048575), interfaceC2166t1);
                            break;
                        case 29:
                            T0.O(this.f23807a[i10], (List) AbstractC2125f1.M(obj, F11 & 1048575), interfaceC2166t1, false);
                            break;
                        case 30:
                            T0.T(this.f23807a[i10], (List) AbstractC2125f1.M(obj, F11 & 1048575), interfaceC2166t1, false);
                            break;
                        case HVError.INSTRUCTION_ERROR /* 31 */:
                            T0.S(this.f23807a[i10], (List) AbstractC2125f1.M(obj, F11 & 1048575), interfaceC2166t1, false);
                            break;
                        case 32:
                            T0.K(this.f23807a[i10], (List) AbstractC2125f1.M(obj, F11 & 1048575), interfaceC2166t1, false);
                            break;
                        case HVError.GPS_ACCESS_DENIED /* 33 */:
                            T0.Q(this.f23807a[i10], (List) AbstractC2125f1.M(obj, F11 & 1048575), interfaceC2166t1, false);
                            break;
                        case 34:
                            T0.F(this.f23807a[i10], (List) AbstractC2125f1.M(obj, F11 & 1048575), interfaceC2166t1, false);
                            break;
                        case HVError.FACE_CAPTURE_TIMEOUT /* 35 */:
                            T0.f(this.f23807a[i10], (List) AbstractC2125f1.M(obj, F11 & 1048575), interfaceC2166t1, true);
                            break;
                        case HVError.HYPER_DOC_DETECT_ERROR /* 36 */:
                            T0.m(this.f23807a[i10], (List) AbstractC2125f1.M(obj, F11 & 1048575), interfaceC2166t1, true);
                            break;
                        case HVError.INVALID_FILE_ERROR /* 37 */:
                            T0.r(this.f23807a[i10], (List) AbstractC2125f1.M(obj, F11 & 1048575), interfaceC2166t1, true);
                            break;
                        case 38:
                            T0.x(this.f23807a[i10], (List) AbstractC2125f1.M(obj, F11 & 1048575), interfaceC2166t1, true);
                            break;
                        case 39:
                            T0.M(this.f23807a[i10], (List) AbstractC2125f1.M(obj, F11 & 1048575), interfaceC2166t1, true);
                            break;
                        case RequestError.NETWORK_FAILURE /* 40 */:
                            T0.H(this.f23807a[i10], (List) AbstractC2125f1.M(obj, F11 & 1048575), interfaceC2166t1, true);
                            break;
                        case RequestError.NO_DEV_KEY /* 41 */:
                            T0.R(this.f23807a[i10], (List) AbstractC2125f1.M(obj, F11 & 1048575), interfaceC2166t1, true);
                            break;
                        case HVError.CONSENT_DENIED /* 42 */:
                            T0.U(this.f23807a[i10], (List) AbstractC2125f1.M(obj, F11 & 1048575), interfaceC2166t1, true);
                            break;
                        case HVError.ENCRYPTION_ERROR /* 43 */:
                            T0.O(this.f23807a[i10], (List) AbstractC2125f1.M(obj, F11 & 1048575), interfaceC2166t1, true);
                            break;
                        case HVError.SDK_CLOSE_ERROR /* 44 */:
                            T0.T(this.f23807a[i10], (List) AbstractC2125f1.M(obj, F11 & 1048575), interfaceC2166t1, true);
                            break;
                        case HVError.PERMISSION_REVOKED_ERROR /* 45 */:
                            T0.S(this.f23807a[i10], (List) AbstractC2125f1.M(obj, F11 & 1048575), interfaceC2166t1, true);
                            break;
                        case 46:
                            T0.K(this.f23807a[i10], (List) AbstractC2125f1.M(obj, F11 & 1048575), interfaceC2166t1, true);
                            break;
                        case 47:
                            T0.Q(this.f23807a[i10], (List) AbstractC2125f1.M(obj, F11 & 1048575), interfaceC2166t1, true);
                            break;
                        case 48:
                            T0.F(this.f23807a[i10], (List) AbstractC2125f1.M(obj, F11 & 1048575), interfaceC2166t1, true);
                            break;
                        case 49:
                            T0.l(this.f23807a[i10], (List) AbstractC2125f1.M(obj, F11 & 1048575), interfaceC2166t1, C(i10));
                            break;
                        case 50:
                            w(interfaceC2166t1, i12, AbstractC2125f1.M(obj, F11 & 1048575), i10);
                            break;
                        case 51:
                            if (z(obj, i12, i10)) {
                                L10 = O(obj, F11 & 1048575);
                                interfaceC2166t1.u(i12, L10);
                                break;
                            } else {
                                break;
                            }
                        case 52:
                            if (z(obj, i12, i10)) {
                                K10 = P(obj, F11 & 1048575);
                                interfaceC2166t1.v(i12, K10);
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            if (z(obj, i12, i10)) {
                                I10 = R(obj, F11 & 1048575);
                                interfaceC2166t1.K(i12, I10);
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            if (z(obj, i12, i10)) {
                                I11 = R(obj, F11 & 1048575);
                                interfaceC2166t1.t(i12, I11);
                                break;
                            } else {
                                break;
                            }
                        case 55:
                            if (z(obj, i12, i10)) {
                                H10 = Q(obj, F11 & 1048575);
                                interfaceC2166t1.o(i12, H10);
                                break;
                            } else {
                                break;
                            }
                        case 56:
                            if (z(obj, i12, i10)) {
                                I12 = R(obj, F11 & 1048575);
                                interfaceC2166t1.a(i12, I12);
                                break;
                            } else {
                                break;
                            }
                        case 57:
                            if (z(obj, i12, i10)) {
                                H11 = Q(obj, F11 & 1048575);
                                interfaceC2166t1.x(i12, H11);
                                break;
                            } else {
                                break;
                            }
                        case 58:
                            if (z(obj, i12, i10)) {
                                J10 = S(obj, F11 & 1048575);
                                interfaceC2166t1.n(i12, J10);
                                break;
                            } else {
                                break;
                            }
                        case 59:
                            if (!z(obj, i12, i10)) {
                                break;
                            }
                            u(i12, AbstractC2125f1.M(obj, F11 & 1048575), interfaceC2166t1);
                            break;
                        case HVError.DETECTOR_NOT_AVAILABLE_ERROR /* 60 */:
                            if (!z(obj, i12, i10)) {
                                break;
                            }
                            interfaceC2166t1.N(i12, AbstractC2125f1.M(obj, F11 & 1048575), C(i10));
                            break;
                        case 61:
                            if (!z(obj, i12, i10)) {
                                break;
                            }
                            interfaceC2166t1.M(i12, (AbstractC2179y) AbstractC2125f1.M(obj, F11 & 1048575));
                            break;
                        case 62:
                            if (z(obj, i12, i10)) {
                                H12 = Q(obj, F11 & 1048575);
                                interfaceC2166t1.D(i12, H12);
                                break;
                            } else {
                                break;
                            }
                        case 63:
                            if (z(obj, i12, i10)) {
                                H13 = Q(obj, F11 & 1048575);
                                interfaceC2166t1.L(i12, H13);
                                break;
                            } else {
                                break;
                            }
                        case 64:
                            if (z(obj, i12, i10)) {
                                H14 = Q(obj, F11 & 1048575);
                                interfaceC2166t1.R(i12, H14);
                                break;
                            } else {
                                break;
                            }
                        case 65:
                            if (z(obj, i12, i10)) {
                                I13 = R(obj, F11 & 1048575);
                                interfaceC2166t1.h(i12, I13);
                                break;
                            } else {
                                break;
                            }
                        case 66:
                            if (z(obj, i12, i10)) {
                                H15 = Q(obj, F11 & 1048575);
                                interfaceC2166t1.F(i12, H15);
                                break;
                            } else {
                                break;
                            }
                        case 67:
                            if (z(obj, i12, i10)) {
                                I14 = R(obj, F11 & 1048575);
                                interfaceC2166t1.j(i12, I14);
                                break;
                            } else {
                                break;
                            }
                        case 68:
                            if (!z(obj, i12, i10)) {
                                break;
                            }
                            interfaceC2166t1.P(i12, AbstractC2125f1.M(obj, F11 & 1048575), C(i10));
                            break;
                    }
                }
                while (entry != null) {
                    this.f23823q.c(interfaceC2166t1, entry);
                    entry = it.hasNext() ? (Map.Entry) it.next() : null;
                }
                v(this.f23822p, obj, interfaceC2166t1);
            }
        }
        it = null;
        entry = null;
        length = this.f23807a.length;
        while (i10 < length) {
        }
        while (entry != null) {
        }
        v(this.f23822p, obj, interfaceC2166t1);
    }

    @Override // com.google.android.gms.internal.clearcut.R0
    public final void f(Object obj, Object obj2) {
        obj2.getClass();
        for (int i10 = 0; i10 < this.f23807a.length; i10 += 4) {
            int F10 = F(i10);
            long j10 = 1048575 & F10;
            int i11 = this.f23807a[i10];
            switch ((F10 & 267386880) >>> 20) {
                case 0:
                    if (y(obj2, i10)) {
                        AbstractC2125f1.e(obj, j10, AbstractC2125f1.L(obj2, j10));
                        I(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (y(obj2, i10)) {
                        AbstractC2125f1.f(obj, j10, AbstractC2125f1.K(obj2, j10));
                        I(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (!y(obj2, i10)) {
                        break;
                    }
                    AbstractC2125f1.h(obj, j10, AbstractC2125f1.I(obj2, j10));
                    I(obj, i10);
                    break;
                case 3:
                    if (!y(obj2, i10)) {
                        break;
                    }
                    AbstractC2125f1.h(obj, j10, AbstractC2125f1.I(obj2, j10));
                    I(obj, i10);
                    break;
                case 4:
                    if (!y(obj2, i10)) {
                        break;
                    }
                    AbstractC2125f1.g(obj, j10, AbstractC2125f1.H(obj2, j10));
                    I(obj, i10);
                    break;
                case 5:
                    if (!y(obj2, i10)) {
                        break;
                    }
                    AbstractC2125f1.h(obj, j10, AbstractC2125f1.I(obj2, j10));
                    I(obj, i10);
                    break;
                case 6:
                    if (!y(obj2, i10)) {
                        break;
                    }
                    AbstractC2125f1.g(obj, j10, AbstractC2125f1.H(obj2, j10));
                    I(obj, i10);
                    break;
                case 7:
                    if (y(obj2, i10)) {
                        AbstractC2125f1.j(obj, j10, AbstractC2125f1.J(obj2, j10));
                        I(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!y(obj2, i10)) {
                        break;
                    }
                    AbstractC2125f1.i(obj, j10, AbstractC2125f1.M(obj2, j10));
                    I(obj, i10);
                    break;
                case 9:
                case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                    x(obj, obj2, i10);
                    break;
                case RequestError.EVENT_TIMEOUT /* 10 */:
                    if (!y(obj2, i10)) {
                        break;
                    }
                    AbstractC2125f1.i(obj, j10, AbstractC2125f1.M(obj2, j10));
                    I(obj, i10);
                    break;
                case 11:
                    if (!y(obj2, i10)) {
                        break;
                    }
                    AbstractC2125f1.g(obj, j10, AbstractC2125f1.H(obj2, j10));
                    I(obj, i10);
                    break;
                case 12:
                    if (!y(obj2, i10)) {
                        break;
                    }
                    AbstractC2125f1.g(obj, j10, AbstractC2125f1.H(obj2, j10));
                    I(obj, i10);
                    break;
                case 13:
                    if (!y(obj2, i10)) {
                        break;
                    }
                    AbstractC2125f1.g(obj, j10, AbstractC2125f1.H(obj2, j10));
                    I(obj, i10);
                    break;
                case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                    if (!y(obj2, i10)) {
                        break;
                    }
                    AbstractC2125f1.h(obj, j10, AbstractC2125f1.I(obj2, j10));
                    I(obj, i10);
                    break;
                case HVError.SSL_CONNECT_ERROR /* 15 */:
                    if (!y(obj2, i10)) {
                        break;
                    }
                    AbstractC2125f1.g(obj, j10, AbstractC2125f1.H(obj2, j10));
                    I(obj, i10);
                    break;
                case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                    if (!y(obj2, i10)) {
                        break;
                    }
                    AbstractC2125f1.h(obj, j10, AbstractC2125f1.I(obj2, j10));
                    I(obj, i10);
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
                    this.f23821o.b(obj, obj2, j10);
                    break;
                case 50:
                    T0.h(this.f23824r, obj, obj2, j10);
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
                    if (!z(obj2, i11, i10)) {
                        break;
                    }
                    AbstractC2125f1.i(obj, j10, AbstractC2125f1.M(obj2, j10));
                    J(obj, i11, i10);
                    break;
                case HVError.DETECTOR_NOT_AVAILABLE_ERROR /* 60 */:
                case 68:
                    L(obj, obj2, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!z(obj2, i11, i10)) {
                        break;
                    }
                    AbstractC2125f1.i(obj, j10, AbstractC2125f1.M(obj2, j10));
                    J(obj, i11, i10);
                    break;
            }
        }
        if (this.f23815i) {
            return;
        }
        T0.i(this.f23822p, obj, obj2);
        if (this.f23813g) {
            T0.g(this.f23823q, obj, obj2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0185, code lost:
    
        if (r19.f23816j != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0187, code lost:
    
        r2.putInt(r20, r14, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x018b, code lost:
    
        r3 = (com.google.android.gms.internal.clearcut.K.v0(r3) + com.google.android.gms.internal.clearcut.K.x0(r4)) + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01a5, code lost:
    
        if (r19.f23816j != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01b6, code lost:
    
        if (r19.f23816j != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01c7, code lost:
    
        if (r19.f23816j != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01d8, code lost:
    
        if (r19.f23816j != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x01e9, code lost:
    
        if (r19.f23816j != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x01fa, code lost:
    
        if (r19.f23816j != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x020b, code lost:
    
        if (r19.f23816j != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x021d, code lost:
    
        if (r19.f23816j != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x022f, code lost:
    
        if (r19.f23816j != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0241, code lost:
    
        if (r19.f23816j != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0253, code lost:
    
        if (r19.f23816j != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0265, code lost:
    
        if (r19.f23816j != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0277, code lost:
    
        if (r19.f23816j != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0365, code lost:
    
        if ((r4 instanceof com.google.android.gms.internal.clearcut.AbstractC2179y) != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x041f, code lost:
    
        if (z(r20, r15, r4) != false) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0421, code lost:
    
        r6 = com.google.android.gms.internal.clearcut.K.M(r15, (com.google.android.gms.internal.clearcut.B0) r2.getObject(r20, r10), C(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x045a, code lost:
    
        if (z(r20, r15, r4) != false) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x045c, code lost:
    
        r6 = com.google.android.gms.internal.clearcut.K.i0(r15, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x0467, code lost:
    
        if (z(r20, r15, r4) != false) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x0469, code lost:
    
        r9 = com.google.android.gms.internal.clearcut.K.p0(r15, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x0492, code lost:
    
        if (z(r20, r15, r4) != false) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x0494, code lost:
    
        r6 = r2.getObject(r20, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x0498, code lost:
    
        r6 = com.google.android.gms.internal.clearcut.K.K(r15, (com.google.android.gms.internal.clearcut.AbstractC2179y) r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x04a3, code lost:
    
        if (z(r20, r15, r4) != false) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x04a5, code lost:
    
        r6 = com.google.android.gms.internal.clearcut.T0.n(r15, r2.getObject(r20, r10), C(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x04bf, code lost:
    
        if ((r6 instanceof com.google.android.gms.internal.clearcut.AbstractC2179y) != false) goto L279;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x04c2, code lost:
    
        r6 = com.google.android.gms.internal.clearcut.K.z(r15, (java.lang.String) r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x04ce, code lost:
    
        if (z(r20, r15, r4) != false) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x04d0, code lost:
    
        r6 = com.google.android.gms.internal.clearcut.K.N(r15, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x0569, code lost:
    
        if (r19.f23816j != false) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x056b, code lost:
    
        r2.putInt(r20, r9, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x056f, code lost:
    
        r9 = (com.google.android.gms.internal.clearcut.K.v0(r15) + com.google.android.gms.internal.clearcut.K.x0(r6)) + r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x0589, code lost:
    
        if (r19.f23816j != false) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x059a, code lost:
    
        if (r19.f23816j != false) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x05ab, code lost:
    
        if (r19.f23816j != false) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x05bc, code lost:
    
        if (r19.f23816j != false) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x05cd, code lost:
    
        if (r19.f23816j != false) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x05de, code lost:
    
        if (r19.f23816j != false) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x05ef, code lost:
    
        if (r19.f23816j != false) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x0601, code lost:
    
        if (r19.f23816j != false) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x0613, code lost:
    
        if (r19.f23816j != false) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x0625, code lost:
    
        if (r19.f23816j != false) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x0637, code lost:
    
        if (r19.f23816j != false) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x0649, code lost:
    
        if (r19.f23816j != false) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x065b, code lost:
    
        if (r19.f23816j != false) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x0715, code lost:
    
        if ((r12 & r18) != 0) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x072f, code lost:
    
        if ((r12 & r18) != 0) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x0735, code lost:
    
        if ((r12 & r18) != 0) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x074f, code lost:
    
        if ((r12 & r18) != 0) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x0755, code lost:
    
        if ((r12 & r18) != 0) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x0763, code lost:
    
        if ((r6 instanceof com.google.android.gms.internal.clearcut.AbstractC2179y) != false) goto L279;
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x0769, code lost:
    
        if ((r12 & r18) != 0) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e0, code lost:
    
        if ((r4 instanceof com.google.android.gms.internal.clearcut.AbstractC2179y) != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00e3, code lost:
    
        r3 = com.google.android.gms.internal.clearcut.K.z(r3, (java.lang.String) r4);
     */
    @Override // com.google.android.gms.internal.clearcut.R0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int g(Object obj) {
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        long j10;
        int T10;
        Object object;
        int i12;
        int i13;
        int i14;
        long j11;
        int d02;
        boolean z12;
        int V10;
        int N10;
        int v02;
        long I10;
        long I11;
        int H10;
        Object M10;
        int H11;
        int H12;
        int H13;
        long I12;
        int V11;
        int N11;
        int i15 = 267386880;
        if (this.f23815i) {
            Unsafe unsafe = f23806s;
            int i16 = 0;
            int i17 = 0;
            while (i16 < this.f23807a.length) {
                int F10 = F(i16);
                int i18 = (F10 & i15) >>> 20;
                int i19 = this.f23807a[i16];
                long j12 = F10 & 1048575;
                int i20 = (i18 < W.zzih.id() || i18 > W.zziu.id()) ? 0 : this.f23807a[i16 + 2] & 1048575;
                switch (i18) {
                    case 0:
                        if (!y(obj, i16)) {
                            break;
                        }
                        V11 = K.w(i19, 0.0d);
                        i17 += V11;
                        break;
                    case 1:
                        if (!y(obj, i16)) {
                            break;
                        }
                        V11 = K.x(i19, 0.0f);
                        i17 += V11;
                        break;
                    case 2:
                        if (!y(obj, i16)) {
                            break;
                        } else {
                            I10 = AbstractC2125f1.I(obj, j12);
                            V11 = K.T(i19, I10);
                            i17 += V11;
                            break;
                        }
                    case 3:
                        if (!y(obj, i16)) {
                            break;
                        } else {
                            I11 = AbstractC2125f1.I(obj, j12);
                            V11 = K.X(i19, I11);
                            i17 += V11;
                            break;
                        }
                    case 4:
                        if (!y(obj, i16)) {
                            break;
                        } else {
                            H10 = AbstractC2125f1.H(obj, j12);
                            V11 = K.d0(i19, H10);
                            i17 += V11;
                            break;
                        }
                    case 5:
                        if (!y(obj, i16)) {
                            break;
                        }
                        V11 = K.e0(i19, 0L);
                        i17 += V11;
                        break;
                    case 6:
                        if (!y(obj, i16)) {
                            break;
                        }
                        V11 = K.n0(i19, 0);
                        i17 += V11;
                        break;
                    case 7:
                        if (!y(obj, i16)) {
                            break;
                        }
                        V11 = K.N(i19, true);
                        i17 += V11;
                        break;
                    case 8:
                        if (!y(obj, i16)) {
                            break;
                        } else {
                            M10 = AbstractC2125f1.M(obj, j12);
                            break;
                        }
                    case 9:
                        if (!y(obj, i16)) {
                            break;
                        }
                        V11 = T0.n(i19, AbstractC2125f1.M(obj, j12), C(i16));
                        i17 += V11;
                        break;
                    case RequestError.EVENT_TIMEOUT /* 10 */:
                        if (!y(obj, i16)) {
                            break;
                        }
                        M10 = AbstractC2125f1.M(obj, j12);
                        V11 = K.K(i19, (AbstractC2179y) M10);
                        i17 += V11;
                        break;
                    case 11:
                        if (!y(obj, i16)) {
                            break;
                        } else {
                            H11 = AbstractC2125f1.H(obj, j12);
                            V11 = K.h0(i19, H11);
                            i17 += V11;
                            break;
                        }
                    case 12:
                        if (!y(obj, i16)) {
                            break;
                        } else {
                            H12 = AbstractC2125f1.H(obj, j12);
                            V11 = K.q0(i19, H12);
                            i17 += V11;
                            break;
                        }
                    case 13:
                        if (!y(obj, i16)) {
                            break;
                        }
                        V11 = K.p0(i19, 0);
                        i17 += V11;
                        break;
                    case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                        if (!y(obj, i16)) {
                            break;
                        }
                        V11 = K.i0(i19, 0L);
                        i17 += V11;
                        break;
                    case HVError.SSL_CONNECT_ERROR /* 15 */:
                        if (!y(obj, i16)) {
                            break;
                        } else {
                            H13 = AbstractC2125f1.H(obj, j12);
                            V11 = K.l0(i19, H13);
                            i17 += V11;
                            break;
                        }
                    case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                        if (!y(obj, i16)) {
                            break;
                        } else {
                            I12 = AbstractC2125f1.I(obj, j12);
                            V11 = K.a0(i19, I12);
                            i17 += V11;
                            break;
                        }
                    case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                        if (!y(obj, i16)) {
                            break;
                        }
                        V11 = K.M(i19, (B0) AbstractC2125f1.M(obj, j12), C(i16));
                        i17 += V11;
                        break;
                    case 18:
                    case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                    case 32:
                        V11 = T0.d0(i19, N(obj, j12), false);
                        i17 += V11;
                        break;
                    case 19:
                    case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                    case HVError.INSTRUCTION_ERROR /* 31 */:
                        V11 = T0.c0(i19, N(obj, j12), false);
                        i17 += V11;
                        break;
                    case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                        V11 = T0.V(i19, N(obj, j12), false);
                        i17 += V11;
                        break;
                    case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                        V11 = T0.W(i19, N(obj, j12), false);
                        i17 += V11;
                        break;
                    case HVError.FACE_DETECTION_ERROR /* 22 */:
                        V11 = T0.Z(i19, N(obj, j12), false);
                        i17 += V11;
                        break;
                    case HVError.LOW_STORAGE_ERROR /* 25 */:
                        V11 = T0.e0(i19, N(obj, j12), false);
                        i17 += V11;
                        break;
                    case 26:
                        V11 = T0.o(i19, N(obj, j12));
                        i17 += V11;
                        break;
                    case 27:
                        V11 = T0.p(i19, N(obj, j12), C(i16));
                        i17 += V11;
                        break;
                    case 28:
                        V11 = T0.t(i19, N(obj, j12));
                        i17 += V11;
                        break;
                    case 29:
                        V11 = T0.a0(i19, N(obj, j12), false);
                        i17 += V11;
                        break;
                    case 30:
                        V11 = T0.Y(i19, N(obj, j12), false);
                        i17 += V11;
                        break;
                    case HVError.GPS_ACCESS_DENIED /* 33 */:
                        V11 = T0.b0(i19, N(obj, j12), false);
                        i17 += V11;
                        break;
                    case 34:
                        V11 = T0.X(i19, N(obj, j12), false);
                        i17 += V11;
                        break;
                    case HVError.FACE_CAPTURE_TIMEOUT /* 35 */:
                        N11 = T0.N((List) unsafe.getObject(obj, j12));
                        if (N11 > 0) {
                            break;
                        } else {
                            break;
                        }
                    case HVError.HYPER_DOC_DETECT_ERROR /* 36 */:
                        N11 = T0.L((List) unsafe.getObject(obj, j12));
                        if (N11 > 0) {
                            break;
                        } else {
                            break;
                        }
                    case HVError.INVALID_FILE_ERROR /* 37 */:
                        N11 = T0.a((List) unsafe.getObject(obj, j12));
                        if (N11 > 0) {
                            break;
                        } else {
                            break;
                        }
                    case 38:
                        N11 = T0.j((List) unsafe.getObject(obj, j12));
                        if (N11 > 0) {
                            break;
                        } else {
                            break;
                        }
                    case 39:
                        N11 = T0.E((List) unsafe.getObject(obj, j12));
                        if (N11 > 0) {
                            break;
                        } else {
                            break;
                        }
                    case RequestError.NETWORK_FAILURE /* 40 */:
                        N11 = T0.N((List) unsafe.getObject(obj, j12));
                        if (N11 > 0) {
                            break;
                        } else {
                            break;
                        }
                    case RequestError.NO_DEV_KEY /* 41 */:
                        N11 = T0.L((List) unsafe.getObject(obj, j12));
                        if (N11 > 0) {
                            break;
                        } else {
                            break;
                        }
                    case HVError.CONSENT_DENIED /* 42 */:
                        N11 = T0.P((List) unsafe.getObject(obj, j12));
                        if (N11 > 0) {
                            break;
                        } else {
                            break;
                        }
                    case HVError.ENCRYPTION_ERROR /* 43 */:
                        N11 = T0.G((List) unsafe.getObject(obj, j12));
                        if (N11 > 0) {
                            break;
                        } else {
                            break;
                        }
                    case HVError.SDK_CLOSE_ERROR /* 44 */:
                        N11 = T0.v((List) unsafe.getObject(obj, j12));
                        if (N11 > 0) {
                            break;
                        } else {
                            break;
                        }
                    case HVError.PERMISSION_REVOKED_ERROR /* 45 */:
                        N11 = T0.L((List) unsafe.getObject(obj, j12));
                        if (N11 > 0) {
                            break;
                        } else {
                            break;
                        }
                    case 46:
                        N11 = T0.N((List) unsafe.getObject(obj, j12));
                        if (N11 > 0) {
                            break;
                        } else {
                            break;
                        }
                    case 47:
                        N11 = T0.J((List) unsafe.getObject(obj, j12));
                        if (N11 > 0) {
                            break;
                        } else {
                            break;
                        }
                    case 48:
                        N11 = T0.q((List) unsafe.getObject(obj, j12));
                        if (N11 > 0) {
                            break;
                        } else {
                            break;
                        }
                    case 49:
                        V11 = T0.u(i19, N(obj, j12), C(i16));
                        i17 += V11;
                        break;
                    case 50:
                        V11 = this.f23824r.i(i19, AbstractC2125f1.M(obj, j12), D(i16));
                        i17 += V11;
                        break;
                    case 51:
                        if (!z(obj, i19, i16)) {
                            break;
                        }
                        V11 = K.w(i19, 0.0d);
                        i17 += V11;
                        break;
                    case 52:
                        if (!z(obj, i19, i16)) {
                            break;
                        }
                        V11 = K.x(i19, 0.0f);
                        i17 += V11;
                        break;
                    case 53:
                        if (!z(obj, i19, i16)) {
                            break;
                        } else {
                            I10 = R(obj, j12);
                            V11 = K.T(i19, I10);
                            i17 += V11;
                            break;
                        }
                    case 54:
                        if (!z(obj, i19, i16)) {
                            break;
                        } else {
                            I11 = R(obj, j12);
                            V11 = K.X(i19, I11);
                            i17 += V11;
                            break;
                        }
                    case 55:
                        if (!z(obj, i19, i16)) {
                            break;
                        } else {
                            H10 = Q(obj, j12);
                            V11 = K.d0(i19, H10);
                            i17 += V11;
                            break;
                        }
                    case 56:
                        if (!z(obj, i19, i16)) {
                            break;
                        }
                        V11 = K.e0(i19, 0L);
                        i17 += V11;
                        break;
                    case 57:
                        if (!z(obj, i19, i16)) {
                            break;
                        }
                        V11 = K.n0(i19, 0);
                        i17 += V11;
                        break;
                    case 58:
                        if (!z(obj, i19, i16)) {
                            break;
                        }
                        V11 = K.N(i19, true);
                        i17 += V11;
                        break;
                    case 59:
                        if (!z(obj, i19, i16)) {
                            break;
                        } else {
                            M10 = AbstractC2125f1.M(obj, j12);
                            break;
                        }
                    case HVError.DETECTOR_NOT_AVAILABLE_ERROR /* 60 */:
                        if (!z(obj, i19, i16)) {
                            break;
                        }
                        V11 = T0.n(i19, AbstractC2125f1.M(obj, j12), C(i16));
                        i17 += V11;
                        break;
                    case 61:
                        if (!z(obj, i19, i16)) {
                            break;
                        }
                        M10 = AbstractC2125f1.M(obj, j12);
                        V11 = K.K(i19, (AbstractC2179y) M10);
                        i17 += V11;
                        break;
                    case 62:
                        if (!z(obj, i19, i16)) {
                            break;
                        } else {
                            H11 = Q(obj, j12);
                            V11 = K.h0(i19, H11);
                            i17 += V11;
                            break;
                        }
                    case 63:
                        if (!z(obj, i19, i16)) {
                            break;
                        } else {
                            H12 = Q(obj, j12);
                            V11 = K.q0(i19, H12);
                            i17 += V11;
                            break;
                        }
                    case 64:
                        if (!z(obj, i19, i16)) {
                            break;
                        }
                        V11 = K.p0(i19, 0);
                        i17 += V11;
                        break;
                    case 65:
                        if (!z(obj, i19, i16)) {
                            break;
                        }
                        V11 = K.i0(i19, 0L);
                        i17 += V11;
                        break;
                    case 66:
                        if (!z(obj, i19, i16)) {
                            break;
                        } else {
                            H13 = Q(obj, j12);
                            V11 = K.l0(i19, H13);
                            i17 += V11;
                            break;
                        }
                    case 67:
                        if (!z(obj, i19, i16)) {
                            break;
                        } else {
                            I12 = R(obj, j12);
                            V11 = K.a0(i19, I12);
                            i17 += V11;
                            break;
                        }
                    case 68:
                        if (!z(obj, i19, i16)) {
                            break;
                        }
                        V11 = K.M(i19, (B0) AbstractC2125f1.M(obj, j12), C(i16));
                        i17 += V11;
                        break;
                }
                i16 += 4;
                i15 = 267386880;
            }
            return i17 + n(this.f23822p, obj);
        }
        Unsafe unsafe2 = f23806s;
        int i21 = -1;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        while (i22 < this.f23807a.length) {
            int F11 = F(i22);
            int[] iArr = this.f23807a;
            int i25 = iArr[i22];
            int i26 = (F11 & 267386880) >>> 20;
            if (i26 <= 17) {
                int i27 = iArr[i22 + 2];
                int i28 = i27 & 1048575;
                i11 = 1 << (i27 >>> 20);
                if (i28 != i21) {
                    i24 = unsafe2.getInt(obj, i28);
                    i21 = i28;
                }
                i10 = i27;
            } else {
                i10 = (!this.f23816j || i26 < W.zzih.id() || i26 > W.zziu.id()) ? 0 : this.f23807a[i22 + 2] & 1048575;
                i11 = 0;
            }
            long j13 = F11 & 1048575;
            switch (i26) {
                case 0:
                    z10 = false;
                    z11 = false;
                    j10 = 0;
                    if ((i24 & i11) != 0) {
                        i23 += K.w(i25, 0.0d);
                        break;
                    }
                    break;
                case 1:
                    z10 = false;
                    j10 = 0;
                    if ((i24 & i11) != 0) {
                        z11 = false;
                        i23 += K.x(i25, 0.0f);
                        break;
                    }
                    z11 = false;
                case 2:
                    z10 = false;
                    j10 = 0;
                    if ((i24 & i11) != 0) {
                        T10 = K.T(i25, unsafe2.getLong(obj, j13));
                        i23 += T10;
                    }
                    z11 = false;
                    break;
                case 3:
                    z10 = false;
                    j10 = 0;
                    if ((i24 & i11) != 0) {
                        T10 = K.X(i25, unsafe2.getLong(obj, j13));
                        i23 += T10;
                    }
                    z11 = false;
                    break;
                case 4:
                    z10 = false;
                    j10 = 0;
                    if ((i24 & i11) != 0) {
                        T10 = K.d0(i25, unsafe2.getInt(obj, j13));
                        i23 += T10;
                    }
                    z11 = false;
                    break;
                case 5:
                    z10 = false;
                    j10 = 0;
                    if ((i24 & i11) != 0) {
                        T10 = K.e0(i25, 0L);
                        i23 += T10;
                    }
                    z11 = false;
                    break;
                case 6:
                    if ((i24 & i11) != 0) {
                        z10 = false;
                        i23 += K.n0(i25, 0);
                        z11 = false;
                        j10 = 0;
                        break;
                    }
                    z10 = false;
                    z11 = false;
                    j10 = 0;
                case 7:
                    break;
                case 8:
                    if ((i24 & i11) != 0) {
                        object = unsafe2.getObject(obj, j13);
                        break;
                    }
                    z10 = false;
                    z11 = false;
                    j10 = 0;
                    break;
                case 9:
                    break;
                case RequestError.EVENT_TIMEOUT /* 10 */:
                    break;
                case 11:
                    if ((i24 & i11) != 0) {
                        i12 = unsafe2.getInt(obj, j13);
                        d02 = K.h0(i25, i12);
                        i23 += d02;
                    }
                    z10 = false;
                    z11 = false;
                    j10 = 0;
                    break;
                case 12:
                    if ((i24 & i11) != 0) {
                        i13 = unsafe2.getInt(obj, j13);
                        d02 = K.q0(i25, i13);
                        i23 += d02;
                    }
                    z10 = false;
                    z11 = false;
                    j10 = 0;
                    break;
                case 13:
                    break;
                case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                    break;
                case HVError.SSL_CONNECT_ERROR /* 15 */:
                    if ((i24 & i11) != 0) {
                        i14 = unsafe2.getInt(obj, j13);
                        d02 = K.l0(i25, i14);
                        i23 += d02;
                    }
                    z10 = false;
                    z11 = false;
                    j10 = 0;
                    break;
                case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                    if ((i24 & i11) != 0) {
                        j11 = unsafe2.getLong(obj, j13);
                        d02 = K.a0(i25, j11);
                        i23 += d02;
                    }
                    z10 = false;
                    z11 = false;
                    j10 = 0;
                    break;
                case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                    break;
                case 18:
                    d02 = T0.d0(i25, (List) unsafe2.getObject(obj, j13), false);
                    i23 += d02;
                    z10 = false;
                    z11 = false;
                    j10 = 0;
                    break;
                case 19:
                case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                case HVError.INSTRUCTION_ERROR /* 31 */:
                    z12 = false;
                    V10 = T0.c0(i25, (List) unsafe2.getObject(obj, j13), false);
                    i23 += V10;
                    z10 = z12;
                    z11 = false;
                    j10 = 0;
                    break;
                case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                    z12 = false;
                    V10 = T0.V(i25, (List) unsafe2.getObject(obj, j13), false);
                    i23 += V10;
                    z10 = z12;
                    z11 = false;
                    j10 = 0;
                    break;
                case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                    z12 = false;
                    V10 = T0.W(i25, (List) unsafe2.getObject(obj, j13), false);
                    i23 += V10;
                    z10 = z12;
                    z11 = false;
                    j10 = 0;
                    break;
                case HVError.FACE_DETECTION_ERROR /* 22 */:
                    z12 = false;
                    V10 = T0.Z(i25, (List) unsafe2.getObject(obj, j13), false);
                    i23 += V10;
                    z10 = z12;
                    z11 = false;
                    j10 = 0;
                    break;
                case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                case 32:
                    z12 = false;
                    V10 = T0.d0(i25, (List) unsafe2.getObject(obj, j13), false);
                    i23 += V10;
                    z10 = z12;
                    z11 = false;
                    j10 = 0;
                    break;
                case HVError.LOW_STORAGE_ERROR /* 25 */:
                    z12 = false;
                    V10 = T0.e0(i25, (List) unsafe2.getObject(obj, j13), false);
                    i23 += V10;
                    z10 = z12;
                    z11 = false;
                    j10 = 0;
                    break;
                case 26:
                    d02 = T0.o(i25, (List) unsafe2.getObject(obj, j13));
                    i23 += d02;
                    z10 = false;
                    z11 = false;
                    j10 = 0;
                    break;
                case 27:
                    d02 = T0.p(i25, (List) unsafe2.getObject(obj, j13), C(i22));
                    i23 += d02;
                    z10 = false;
                    z11 = false;
                    j10 = 0;
                    break;
                case 28:
                    d02 = T0.t(i25, (List) unsafe2.getObject(obj, j13));
                    i23 += d02;
                    z10 = false;
                    z11 = false;
                    j10 = 0;
                    break;
                case 29:
                    d02 = T0.a0(i25, (List) unsafe2.getObject(obj, j13), false);
                    i23 += d02;
                    z10 = false;
                    z11 = false;
                    j10 = 0;
                    break;
                case 30:
                    z12 = false;
                    V10 = T0.Y(i25, (List) unsafe2.getObject(obj, j13), false);
                    i23 += V10;
                    z10 = z12;
                    z11 = false;
                    j10 = 0;
                    break;
                case HVError.GPS_ACCESS_DENIED /* 33 */:
                    z12 = false;
                    V10 = T0.b0(i25, (List) unsafe2.getObject(obj, j13), false);
                    i23 += V10;
                    z10 = z12;
                    z11 = false;
                    j10 = 0;
                    break;
                case 34:
                    z12 = false;
                    V10 = T0.X(i25, (List) unsafe2.getObject(obj, j13), false);
                    i23 += V10;
                    z10 = z12;
                    z11 = false;
                    j10 = 0;
                    break;
                case HVError.FACE_CAPTURE_TIMEOUT /* 35 */:
                    N10 = T0.N((List) unsafe2.getObject(obj, j13));
                    if (N10 > 0) {
                        break;
                    }
                    z10 = false;
                    z11 = false;
                    j10 = 0;
                    break;
                case HVError.HYPER_DOC_DETECT_ERROR /* 36 */:
                    N10 = T0.L((List) unsafe2.getObject(obj, j13));
                    if (N10 > 0) {
                        break;
                    }
                    z10 = false;
                    z11 = false;
                    j10 = 0;
                    break;
                case HVError.INVALID_FILE_ERROR /* 37 */:
                    N10 = T0.a((List) unsafe2.getObject(obj, j13));
                    if (N10 > 0) {
                        break;
                    }
                    z10 = false;
                    z11 = false;
                    j10 = 0;
                    break;
                case 38:
                    N10 = T0.j((List) unsafe2.getObject(obj, j13));
                    if (N10 > 0) {
                        break;
                    }
                    z10 = false;
                    z11 = false;
                    j10 = 0;
                    break;
                case 39:
                    N10 = T0.E((List) unsafe2.getObject(obj, j13));
                    if (N10 > 0) {
                        break;
                    }
                    z10 = false;
                    z11 = false;
                    j10 = 0;
                    break;
                case RequestError.NETWORK_FAILURE /* 40 */:
                    N10 = T0.N((List) unsafe2.getObject(obj, j13));
                    if (N10 > 0) {
                        break;
                    }
                    z10 = false;
                    z11 = false;
                    j10 = 0;
                    break;
                case RequestError.NO_DEV_KEY /* 41 */:
                    N10 = T0.L((List) unsafe2.getObject(obj, j13));
                    if (N10 > 0) {
                        break;
                    }
                    z10 = false;
                    z11 = false;
                    j10 = 0;
                    break;
                case HVError.CONSENT_DENIED /* 42 */:
                    N10 = T0.P((List) unsafe2.getObject(obj, j13));
                    if (N10 > 0) {
                        break;
                    }
                    z10 = false;
                    z11 = false;
                    j10 = 0;
                    break;
                case HVError.ENCRYPTION_ERROR /* 43 */:
                    N10 = T0.G((List) unsafe2.getObject(obj, j13));
                    if (N10 > 0) {
                        break;
                    }
                    z10 = false;
                    z11 = false;
                    j10 = 0;
                    break;
                case HVError.SDK_CLOSE_ERROR /* 44 */:
                    N10 = T0.v((List) unsafe2.getObject(obj, j13));
                    if (N10 > 0) {
                        break;
                    }
                    z10 = false;
                    z11 = false;
                    j10 = 0;
                    break;
                case HVError.PERMISSION_REVOKED_ERROR /* 45 */:
                    N10 = T0.L((List) unsafe2.getObject(obj, j13));
                    if (N10 > 0) {
                        break;
                    }
                    z10 = false;
                    z11 = false;
                    j10 = 0;
                    break;
                case 46:
                    N10 = T0.N((List) unsafe2.getObject(obj, j13));
                    if (N10 > 0) {
                        break;
                    }
                    z10 = false;
                    z11 = false;
                    j10 = 0;
                    break;
                case 47:
                    N10 = T0.J((List) unsafe2.getObject(obj, j13));
                    if (N10 > 0) {
                        break;
                    }
                    z10 = false;
                    z11 = false;
                    j10 = 0;
                    break;
                case 48:
                    N10 = T0.q((List) unsafe2.getObject(obj, j13));
                    if (N10 > 0) {
                        break;
                    }
                    z10 = false;
                    z11 = false;
                    j10 = 0;
                    break;
                case 49:
                    d02 = T0.u(i25, (List) unsafe2.getObject(obj, j13), C(i22));
                    i23 += d02;
                    z10 = false;
                    z11 = false;
                    j10 = 0;
                    break;
                case 50:
                    d02 = this.f23824r.i(i25, unsafe2.getObject(obj, j13), D(i22));
                    i23 += d02;
                    z10 = false;
                    z11 = false;
                    j10 = 0;
                    break;
                case 51:
                    if (z(obj, i25, i22)) {
                        d02 = K.w(i25, 0.0d);
                        i23 += d02;
                    }
                    z10 = false;
                    z11 = false;
                    j10 = 0;
                    break;
                case 52:
                    if (z(obj, i25, i22)) {
                        v02 = K.x(i25, 0.0f);
                        i23 += v02;
                    }
                    z10 = false;
                    z11 = false;
                    j10 = 0;
                    break;
                case 53:
                    if (z(obj, i25, i22)) {
                        d02 = K.T(i25, R(obj, j13));
                        i23 += d02;
                    }
                    z10 = false;
                    z11 = false;
                    j10 = 0;
                    break;
                case 54:
                    if (z(obj, i25, i22)) {
                        d02 = K.X(i25, R(obj, j13));
                        i23 += d02;
                    }
                    z10 = false;
                    z11 = false;
                    j10 = 0;
                    break;
                case 55:
                    if (z(obj, i25, i22)) {
                        d02 = K.d0(i25, Q(obj, j13));
                        i23 += d02;
                    }
                    z10 = false;
                    z11 = false;
                    j10 = 0;
                    break;
                case 56:
                    if (z(obj, i25, i22)) {
                        d02 = K.e0(i25, 0L);
                        i23 += d02;
                    }
                    z10 = false;
                    z11 = false;
                    j10 = 0;
                    break;
                case 57:
                    if (z(obj, i25, i22)) {
                        v02 = K.n0(i25, 0);
                        i23 += v02;
                    }
                    z10 = false;
                    z11 = false;
                    j10 = 0;
                    break;
                case 58:
                    break;
                case 59:
                    if (z(obj, i25, i22)) {
                        object = unsafe2.getObject(obj, j13);
                        break;
                    }
                    z10 = false;
                    z11 = false;
                    j10 = 0;
                    break;
                case HVError.DETECTOR_NOT_AVAILABLE_ERROR /* 60 */:
                    break;
                case 61:
                    break;
                case 62:
                    if (z(obj, i25, i22)) {
                        i12 = Q(obj, j13);
                        d02 = K.h0(i25, i12);
                        i23 += d02;
                    }
                    z10 = false;
                    z11 = false;
                    j10 = 0;
                    break;
                case 63:
                    if (z(obj, i25, i22)) {
                        i13 = Q(obj, j13);
                        d02 = K.q0(i25, i13);
                        i23 += d02;
                    }
                    z10 = false;
                    z11 = false;
                    j10 = 0;
                    break;
                case 64:
                    break;
                case 65:
                    break;
                case 66:
                    if (z(obj, i25, i22)) {
                        i14 = Q(obj, j13);
                        d02 = K.l0(i25, i14);
                        i23 += d02;
                    }
                    z10 = false;
                    z11 = false;
                    j10 = 0;
                    break;
                case 67:
                    if (z(obj, i25, i22)) {
                        j11 = R(obj, j13);
                        d02 = K.a0(i25, j11);
                        i23 += d02;
                    }
                    z10 = false;
                    z11 = false;
                    j10 = 0;
                    break;
                case 68:
                    break;
                default:
                    z10 = false;
                    z11 = false;
                    j10 = 0;
                    break;
            }
            i22 += 4;
        }
        int n10 = i23 + n(this.f23822p, obj);
        return this.f23813g ? n10 + this.f23823q.b(obj).g() : n10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0163, code lost:
    
        if (r0 == r15) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0165, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0196, code lost:
    
        if (r0 == r15) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01af, code lost:
    
        if (r0 == r15) goto L74;
     */
    @Override // com.google.android.gms.internal.clearcut.R0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(Object obj, byte[] bArr, int i10, int i11, C2170v c2170v) {
        int i12;
        int i13;
        Unsafe unsafe;
        int i14;
        int g10;
        long j10;
        Object d10;
        int i15;
        F0 f02 = this;
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i16 = i11;
        C2170v c2170v2 = c2170v;
        if (!f02.f23815i) {
            r(obj, bArr, i10, i11, 0, c2170v);
            return;
        }
        Unsafe unsafe2 = f23806s;
        int i17 = i10;
        while (i17 < i16) {
            int i18 = i17 + 1;
            byte b10 = bArr2[i17];
            if (b10 < 0) {
                i13 = AbstractC2167u.d(b10, bArr2, i18, c2170v2);
                i12 = c2170v2.f24100a;
            } else {
                i12 = b10;
                i13 = i18;
            }
            int i19 = i12 >>> 3;
            int i20 = i12 & 7;
            int H10 = f02.H(i19);
            if (H10 >= 0) {
                int i21 = f02.f23807a[H10 + 1];
                int i22 = (267386880 & i21) >>> 20;
                long j11 = 1048575 & i21;
                if (i22 <= 17) {
                    switch (i22) {
                        case 0:
                            if (i20 != 1) {
                                break;
                            } else {
                                AbstractC2125f1.e(obj2, j11, AbstractC2167u.l(bArr2, i13));
                                i17 = i13 + 8;
                                break;
                            }
                        case 1:
                            if (i20 != 5) {
                                break;
                            } else {
                                AbstractC2125f1.f(obj2, j11, AbstractC2167u.n(bArr2, i13));
                                i17 = i13 + 4;
                                break;
                            }
                        case 2:
                        case 3:
                            if (i20 != 0) {
                                break;
                            } else {
                                g10 = AbstractC2167u.g(bArr2, i13, c2170v2);
                                j10 = c2170v2.f24101b;
                                unsafe2.putLong(obj, j11, j10);
                                i17 = g10;
                                break;
                            }
                        case 4:
                        case 11:
                            if (i20 != 0) {
                                break;
                            } else {
                                i17 = AbstractC2167u.e(bArr2, i13, c2170v2);
                                i15 = c2170v2.f24100a;
                                unsafe2.putInt(obj2, j11, i15);
                                break;
                            }
                        case 5:
                        case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                            if (i20 != 1) {
                                break;
                            } else {
                                unsafe2.putLong(obj, j11, AbstractC2167u.k(bArr2, i13));
                                i17 = i13 + 8;
                                break;
                            }
                        case 6:
                        case 13:
                            if (i20 != 5) {
                                break;
                            } else {
                                unsafe2.putInt(obj2, j11, AbstractC2167u.h(bArr2, i13));
                                i17 = i13 + 4;
                                break;
                            }
                        case 7:
                            if (i20 != 0) {
                                break;
                            } else {
                                i17 = AbstractC2167u.g(bArr2, i13, c2170v2);
                                AbstractC2125f1.j(obj2, j11, c2170v2.f24101b != 0);
                                break;
                            }
                        case 8:
                            if (i20 != 2) {
                                break;
                            } else {
                                i17 = (536870912 & i21) == 0 ? AbstractC2167u.i(bArr2, i13, c2170v2) : AbstractC2167u.j(bArr2, i13, c2170v2);
                                d10 = c2170v2.f24102c;
                                unsafe2.putObject(obj2, j11, d10);
                                break;
                            }
                        case 9:
                            if (i20 != 2) {
                                break;
                            } else {
                                i17 = m(f02.C(H10), bArr2, i13, i16, c2170v2);
                                Object object = unsafe2.getObject(obj2, j11);
                                if (object != null) {
                                    d10 = AbstractC2115c0.d(object, c2170v2.f24102c);
                                    unsafe2.putObject(obj2, j11, d10);
                                    break;
                                }
                                d10 = c2170v2.f24102c;
                                unsafe2.putObject(obj2, j11, d10);
                            }
                        case RequestError.EVENT_TIMEOUT /* 10 */:
                            if (i20 != 2) {
                                break;
                            } else {
                                i17 = AbstractC2167u.m(bArr2, i13, c2170v2);
                                d10 = c2170v2.f24102c;
                                unsafe2.putObject(obj2, j11, d10);
                                break;
                            }
                        case 12:
                            if (i20 != 0) {
                                break;
                            } else {
                                i17 = AbstractC2167u.e(bArr2, i13, c2170v2);
                                i15 = c2170v2.f24100a;
                                unsafe2.putInt(obj2, j11, i15);
                                break;
                            }
                        case HVError.SSL_CONNECT_ERROR /* 15 */:
                            if (i20 != 0) {
                                break;
                            } else {
                                i17 = AbstractC2167u.e(bArr2, i13, c2170v2);
                                i15 = H.e(c2170v2.f24100a);
                                unsafe2.putInt(obj2, j11, i15);
                                break;
                            }
                        case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                            if (i20 != 0) {
                                break;
                            } else {
                                g10 = AbstractC2167u.g(bArr2, i13, c2170v2);
                                j10 = H.a(c2170v2.f24101b);
                                unsafe2.putLong(obj, j11, j10);
                                i17 = g10;
                                break;
                            }
                    }
                } else if (i22 != 27) {
                    if (i22 <= 49) {
                        unsafe = unsafe2;
                        int i23 = i13;
                        i17 = p(obj, bArr, i13, i11, i12, i19, i20, H10, i21, i22, j11, c2170v);
                    } else {
                        unsafe = unsafe2;
                        i14 = i13;
                        if (i22 != 50) {
                            i17 = o(obj, bArr, i14, i11, i12, i19, i20, i21, i22, j11, H10, c2170v);
                        } else if (i20 == 2) {
                            i17 = q(obj, bArr, i14, i11, H10, i19, j11, c2170v);
                        }
                    }
                    f02 = this;
                    obj2 = obj;
                    bArr2 = bArr;
                    i16 = i11;
                    c2170v2 = c2170v;
                    unsafe2 = unsafe;
                } else if (i20 == 2) {
                    InterfaceC2124f0 interfaceC2124f0 = (InterfaceC2124f0) unsafe2.getObject(obj2, j11);
                    if (!interfaceC2124f0.H()) {
                        int size = interfaceC2124f0.size();
                        interfaceC2124f0 = interfaceC2124f0.l1(size == 0 ? 10 : size << 1);
                        unsafe2.putObject(obj2, j11, interfaceC2124f0);
                    }
                    i17 = k(f02.C(H10), i12, bArr, i13, i11, interfaceC2124f0, c2170v);
                }
                int i24 = i14;
                i17 = j(i12, bArr, i24, i11, obj, c2170v);
                f02 = this;
                obj2 = obj;
                bArr2 = bArr;
                i16 = i11;
                c2170v2 = c2170v;
                unsafe2 = unsafe;
            }
            unsafe = unsafe2;
            i14 = i13;
            int i242 = i14;
            i17 = j(i12, bArr, i242, i11, obj, c2170v);
            f02 = this;
            obj2 = obj;
            bArr2 = bArr;
            i16 = i11;
            c2170v2 = c2170v;
            unsafe2 = unsafe;
        }
        if (i17 != i16) {
            throw C2127g0.d();
        }
    }

    @Override // com.google.android.gms.internal.clearcut.R0
    public final boolean i(Object obj) {
        int i10;
        int i11;
        int[] iArr = this.f23817k;
        int i12 = 1;
        if (iArr == null || iArr.length == 0) {
            return true;
        }
        int length = iArr.length;
        int i13 = -1;
        int i14 = 0;
        int i15 = 0;
        while (i14 < length) {
            int i16 = iArr[i14];
            int H10 = H(i16);
            int F10 = F(H10);
            if (this.f23815i) {
                i10 = length;
                i11 = 0;
            } else {
                int i17 = this.f23807a[H10 + 2];
                int i18 = i17 & 1048575;
                i11 = i12 << (i17 >>> 20);
                if (i18 != i13) {
                    i10 = length;
                    i15 = f23806s.getInt(obj, i18);
                    i13 = i18;
                } else {
                    i10 = length;
                }
            }
            if ((268435456 & F10) != 0 && !A(obj, H10, i15, i11)) {
                return false;
            }
            int i19 = (267386880 & F10) >>> 20;
            if (i19 != 9 && i19 != 17) {
                if (i19 != 27) {
                    if (i19 == 60 || i19 == 68) {
                        if (z(obj, i16, H10) && !B(obj, F10, C(H10))) {
                            return false;
                        }
                    } else if (i19 != 49) {
                        if (i19 == 50 && !this.f23824r.j(AbstractC2125f1.M(obj, F10 & 1048575)).isEmpty()) {
                            this.f23824r.h(D(H10));
                            throw null;
                        }
                    }
                }
                List list = (List) AbstractC2125f1.M(obj, F10 & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    R0 C10 = C(H10);
                    for (int i20 = 0; i20 < list.size(); i20++) {
                        if (!C10.i(list.get(i20))) {
                            return false;
                        }
                    }
                }
            } else if (A(obj, H10, i15, i11) && !B(obj, F10, C(H10))) {
                return false;
            }
            i14++;
            length = i10;
            i12 = 1;
        }
        return !this.f23813g || this.f23823q.b(obj).d();
    }
}
