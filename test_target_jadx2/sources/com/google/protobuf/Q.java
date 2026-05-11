package com.google.protobuf;

import co.hyperverge.hypersnapsdk.activities.HVRetakeActivity;
import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;
import com.google.protobuf.AbstractC2874e;
import com.google.protobuf.AbstractC2893y;
import com.google.protobuf.G;
import com.google.protobuf.p0;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
final class Q implements c0 {

    /* renamed from: r, reason: collision with root package name */
    private static final int[] f28680r = new int[0];

    /* renamed from: s, reason: collision with root package name */
    private static final Unsafe f28681s = m0.D();

    /* renamed from: a, reason: collision with root package name */
    private final int[] f28682a;

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f28683b;

    /* renamed from: c, reason: collision with root package name */
    private final int f28684c;

    /* renamed from: d, reason: collision with root package name */
    private final int f28685d;

    /* renamed from: e, reason: collision with root package name */
    private final N f28686e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f28687f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f28688g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f28689h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f28690i;

    /* renamed from: j, reason: collision with root package name */
    private final int[] f28691j;

    /* renamed from: k, reason: collision with root package name */
    private final int f28692k;

    /* renamed from: l, reason: collision with root package name */
    private final int f28693l;

    /* renamed from: m, reason: collision with root package name */
    private final T f28694m;

    /* renamed from: n, reason: collision with root package name */
    private final D f28695n;

    /* renamed from: o, reason: collision with root package name */
    private final i0 f28696o;

    /* renamed from: p, reason: collision with root package name */
    private final AbstractC2885p f28697p;

    /* renamed from: q, reason: collision with root package name */
    private final I f28698q;

    private Q(int[] iArr, Object[] objArr, int i10, int i11, N n10, boolean z10, boolean z11, int[] iArr2, int i12, int i13, T t10, D d10, i0 i0Var, AbstractC2885p abstractC2885p, I i14) {
        this.f28682a = iArr;
        this.f28683b = objArr;
        this.f28684c = i10;
        this.f28685d = i11;
        this.f28688g = n10 instanceof AbstractC2891w;
        this.f28689h = z10;
        this.f28687f = abstractC2885p != null && abstractC2885p.d(n10);
        this.f28690i = z11;
        this.f28691j = iArr2;
        this.f28692k = i12;
        this.f28693l = i13;
        this.f28694m = t10;
        this.f28695n = d10;
        this.f28696o = i0Var;
        this.f28697p = abstractC2885p;
        this.f28686e = n10;
        this.f28698q = i14;
    }

    private boolean A(Object obj, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? z(obj, i10) : (i12 & i13) != 0;
    }

    private static boolean B(Object obj, int i10, c0 c0Var) {
        return c0Var.f(m0.C(obj, T(i10)));
    }

    private boolean C(Object obj, int i10, int i11) {
        List list = (List) m0.C(obj, T(i10));
        if (list.isEmpty()) {
            return true;
        }
        c0 t10 = t(i11);
        for (int i12 = 0; i12 < list.size(); i12++) {
            if (!t10.f(list.get(i12))) {
                return false;
            }
        }
        return true;
    }

    private boolean D(Object obj, int i10, int i11) {
        if (this.f28698q.h(m0.C(obj, T(i10))).isEmpty()) {
            return true;
        }
        this.f28698q.c(s(i11));
        throw null;
    }

    private static boolean E(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC2891w) {
            return ((AbstractC2891w) obj).isMutable();
        }
        return true;
    }

    private boolean F(Object obj, Object obj2, int i10) {
        long g02 = g0(i10) & 1048575;
        return m0.z(obj, g02) == m0.z(obj2, g02);
    }

    private boolean G(Object obj, int i10, int i11) {
        return m0.z(obj, (long) (g0(i11) & 1048575)) == i10;
    }

    private static boolean H(int i10) {
        return (i10 & 268435456) != 0;
    }

    private static List I(Object obj, long j10) {
        return (List) m0.C(obj, j10);
    }

    private static long J(Object obj, long j10) {
        return m0.A(obj, j10);
    }

    private void K(Object obj, Object obj2, int i10) {
        if (z(obj2, i10)) {
            long T10 = T(o0(i10));
            Unsafe unsafe = f28681s;
            Object object = unsafe.getObject(obj2, T10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + S(i10) + " is present but null: " + obj2);
            }
            c0 t10 = t(i10);
            if (!z(obj, i10)) {
                if (E(object)) {
                    Object b10 = t10.b();
                    t10.a(b10, object);
                    unsafe.putObject(obj, T10, b10);
                } else {
                    unsafe.putObject(obj, T10, object);
                }
                i0(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, T10);
            if (!E(object2)) {
                Object b11 = t10.b();
                t10.a(b11, object2);
                unsafe.putObject(obj, T10, b11);
                object2 = b11;
            }
            t10.a(object2, object);
        }
    }

    private void L(Object obj, Object obj2, int i10) {
        int S10 = S(i10);
        if (G(obj2, S10, i10)) {
            long T10 = T(o0(i10));
            Unsafe unsafe = f28681s;
            Object object = unsafe.getObject(obj2, T10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + S(i10) + " is present but null: " + obj2);
            }
            c0 t10 = t(i10);
            if (!G(obj, S10, i10)) {
                if (E(object)) {
                    Object b10 = t10.b();
                    t10.a(b10, object);
                    unsafe.putObject(obj, T10, b10);
                } else {
                    unsafe.putObject(obj, T10, object);
                }
                j0(obj, S10, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, T10);
            if (!E(object2)) {
                Object b11 = t10.b();
                t10.a(b11, object2);
                unsafe.putObject(obj, T10, b11);
                object2 = b11;
            }
            t10.a(object2, object);
        }
    }

    private void M(Object obj, Object obj2, int i10) {
        int o02 = o0(i10);
        long T10 = T(o02);
        int S10 = S(i10);
        switch (n0(o02)) {
            case 0:
                if (z(obj2, i10)) {
                    m0.N(obj, T10, m0.x(obj2, T10));
                    i0(obj, i10);
                    break;
                }
                break;
            case 1:
                if (z(obj2, i10)) {
                    m0.O(obj, T10, m0.y(obj2, T10));
                    i0(obj, i10);
                    break;
                }
                break;
            case 2:
                if (z(obj2, i10)) {
                    m0.Q(obj, T10, m0.A(obj2, T10));
                    i0(obj, i10);
                    break;
                }
                break;
            case 3:
                if (z(obj2, i10)) {
                    m0.Q(obj, T10, m0.A(obj2, T10));
                    i0(obj, i10);
                    break;
                }
                break;
            case 4:
                if (z(obj2, i10)) {
                    m0.P(obj, T10, m0.z(obj2, T10));
                    i0(obj, i10);
                    break;
                }
                break;
            case 5:
                if (z(obj2, i10)) {
                    m0.Q(obj, T10, m0.A(obj2, T10));
                    i0(obj, i10);
                    break;
                }
                break;
            case 6:
                if (z(obj2, i10)) {
                    m0.P(obj, T10, m0.z(obj2, T10));
                    i0(obj, i10);
                    break;
                }
                break;
            case 7:
                if (z(obj2, i10)) {
                    m0.H(obj, T10, m0.r(obj2, T10));
                    i0(obj, i10);
                    break;
                }
                break;
            case 8:
                if (z(obj2, i10)) {
                    m0.R(obj, T10, m0.C(obj2, T10));
                    i0(obj, i10);
                    break;
                }
                break;
            case 9:
                K(obj, obj2, i10);
                break;
            case RequestError.EVENT_TIMEOUT /* 10 */:
                if (z(obj2, i10)) {
                    m0.R(obj, T10, m0.C(obj2, T10));
                    i0(obj, i10);
                    break;
                }
                break;
            case 11:
                if (z(obj2, i10)) {
                    m0.P(obj, T10, m0.z(obj2, T10));
                    i0(obj, i10);
                    break;
                }
                break;
            case 12:
                if (z(obj2, i10)) {
                    m0.P(obj, T10, m0.z(obj2, T10));
                    i0(obj, i10);
                    break;
                }
                break;
            case 13:
                if (z(obj2, i10)) {
                    m0.P(obj, T10, m0.z(obj2, T10));
                    i0(obj, i10);
                    break;
                }
                break;
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                if (z(obj2, i10)) {
                    m0.Q(obj, T10, m0.A(obj2, T10));
                    i0(obj, i10);
                    break;
                }
                break;
            case HVError.SSL_CONNECT_ERROR /* 15 */:
                if (z(obj2, i10)) {
                    m0.P(obj, T10, m0.z(obj2, T10));
                    i0(obj, i10);
                    break;
                }
                break;
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                if (z(obj2, i10)) {
                    m0.Q(obj, T10, m0.A(obj2, T10));
                    i0(obj, i10);
                    break;
                }
                break;
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                K(obj, obj2, i10);
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
                this.f28695n.d(obj, obj2, T10);
                break;
            case 50:
                e0.E(this.f28698q, obj, obj2, T10);
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
                if (G(obj2, S10, i10)) {
                    m0.R(obj, T10, m0.C(obj2, T10));
                    j0(obj, S10, i10);
                    break;
                }
                break;
            case HVError.DETECTOR_NOT_AVAILABLE_ERROR /* 60 */:
                L(obj, obj2, i10);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (G(obj2, S10, i10)) {
                    m0.R(obj, T10, m0.C(obj2, T10));
                    j0(obj, S10, i10);
                    break;
                }
                break;
            case 68:
                L(obj, obj2, i10);
                break;
        }
    }

    private Object N(Object obj, int i10) {
        c0 t10 = t(i10);
        long T10 = T(o0(i10));
        if (!z(obj, i10)) {
            return t10.b();
        }
        Object object = f28681s.getObject(obj, T10);
        if (E(object)) {
            return object;
        }
        Object b10 = t10.b();
        if (object != null) {
            t10.a(b10, object);
        }
        return b10;
    }

    private Object O(Object obj, int i10, int i11) {
        c0 t10 = t(i11);
        if (!G(obj, i10, i11)) {
            return t10.b();
        }
        Object object = f28681s.getObject(obj, T(o0(i11)));
        if (E(object)) {
            return object;
        }
        Object b10 = t10.b();
        if (object != null) {
            t10.a(b10, object);
        }
        return b10;
    }

    static Q P(Class cls, L l10, T t10, D d10, i0 i0Var, AbstractC2885p abstractC2885p, I i10) {
        if (l10 instanceof b0) {
            return R((b0) l10, t10, d10, i0Var, abstractC2885p, i10);
        }
        android.support.v4.media.session.b.a(l10);
        return Q(null, t10, d10, i0Var, abstractC2885p, i10);
    }

    static Q Q(f0 f0Var, T t10, D d10, i0 i0Var, AbstractC2885p abstractC2885p, I i10) {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0255  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static Q R(b0 b0Var, T t10, D d10, i0 i0Var, AbstractC2885p abstractC2885p, I i10) {
        int i11;
        int charAt;
        int charAt2;
        int charAt3;
        int charAt4;
        int charAt5;
        int[] iArr;
        int i12;
        int i13;
        int i14;
        char charAt6;
        int i15;
        char charAt7;
        int i16;
        char charAt8;
        int i17;
        char charAt9;
        int i18;
        char charAt10;
        int i19;
        char charAt11;
        int i20;
        char charAt12;
        int i21;
        char charAt13;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int objectFieldOffset;
        String str;
        boolean z10;
        int i28;
        int i29;
        int i30;
        Field h02;
        char charAt14;
        int i31;
        int i32;
        Object obj;
        Field h03;
        Object obj2;
        Field h04;
        int i33;
        char charAt15;
        int i34;
        char charAt16;
        int i35;
        char charAt17;
        int i36;
        char charAt18;
        boolean z11 = b0Var.c() == Y.PROTO3;
        String e10 = b0Var.e();
        int length = e10.length();
        char c10 = 55296;
        if (e10.charAt(0) >= 55296) {
            int i37 = 1;
            while (true) {
                i11 = i37 + 1;
                if (e10.charAt(i37) < 55296) {
                    break;
                }
                i37 = i11;
            }
        } else {
            i11 = 1;
        }
        int i38 = i11 + 1;
        int charAt19 = e10.charAt(i11);
        if (charAt19 >= 55296) {
            int i39 = charAt19 & 8191;
            int i40 = 13;
            while (true) {
                i36 = i38 + 1;
                charAt18 = e10.charAt(i38);
                if (charAt18 < 55296) {
                    break;
                }
                i39 |= (charAt18 & 8191) << i40;
                i40 += 13;
                i38 = i36;
            }
            charAt19 = i39 | (charAt18 << i40);
            i38 = i36;
        }
        if (charAt19 == 0) {
            charAt = 0;
            charAt2 = 0;
            charAt3 = 0;
            charAt4 = 0;
            charAt5 = 0;
            i12 = 0;
            iArr = f28680r;
            i13 = 0;
        } else {
            int i41 = i38 + 1;
            int charAt20 = e10.charAt(i38);
            if (charAt20 >= 55296) {
                int i42 = charAt20 & 8191;
                int i43 = 13;
                while (true) {
                    i21 = i41 + 1;
                    charAt13 = e10.charAt(i41);
                    if (charAt13 < 55296) {
                        break;
                    }
                    i42 |= (charAt13 & 8191) << i43;
                    i43 += 13;
                    i41 = i21;
                }
                charAt20 = i42 | (charAt13 << i43);
                i41 = i21;
            }
            int i44 = i41 + 1;
            int charAt21 = e10.charAt(i41);
            if (charAt21 >= 55296) {
                int i45 = charAt21 & 8191;
                int i46 = 13;
                while (true) {
                    i20 = i44 + 1;
                    charAt12 = e10.charAt(i44);
                    if (charAt12 < 55296) {
                        break;
                    }
                    i45 |= (charAt12 & 8191) << i46;
                    i46 += 13;
                    i44 = i20;
                }
                charAt21 = i45 | (charAt12 << i46);
                i44 = i20;
            }
            int i47 = i44 + 1;
            charAt = e10.charAt(i44);
            if (charAt >= 55296) {
                int i48 = charAt & 8191;
                int i49 = 13;
                while (true) {
                    i19 = i47 + 1;
                    charAt11 = e10.charAt(i47);
                    if (charAt11 < 55296) {
                        break;
                    }
                    i48 |= (charAt11 & 8191) << i49;
                    i49 += 13;
                    i47 = i19;
                }
                charAt = i48 | (charAt11 << i49);
                i47 = i19;
            }
            int i50 = i47 + 1;
            charAt2 = e10.charAt(i47);
            if (charAt2 >= 55296) {
                int i51 = charAt2 & 8191;
                int i52 = 13;
                while (true) {
                    i18 = i50 + 1;
                    charAt10 = e10.charAt(i50);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i51 |= (charAt10 & 8191) << i52;
                    i52 += 13;
                    i50 = i18;
                }
                charAt2 = i51 | (charAt10 << i52);
                i50 = i18;
            }
            int i53 = i50 + 1;
            charAt3 = e10.charAt(i50);
            if (charAt3 >= 55296) {
                int i54 = charAt3 & 8191;
                int i55 = 13;
                while (true) {
                    i17 = i53 + 1;
                    charAt9 = e10.charAt(i53);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i54 |= (charAt9 & 8191) << i55;
                    i55 += 13;
                    i53 = i17;
                }
                charAt3 = i54 | (charAt9 << i55);
                i53 = i17;
            }
            int i56 = i53 + 1;
            charAt4 = e10.charAt(i53);
            if (charAt4 >= 55296) {
                int i57 = charAt4 & 8191;
                int i58 = 13;
                while (true) {
                    i16 = i56 + 1;
                    charAt8 = e10.charAt(i56);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i57 |= (charAt8 & 8191) << i58;
                    i58 += 13;
                    i56 = i16;
                }
                charAt4 = i57 | (charAt8 << i58);
                i56 = i16;
            }
            int i59 = i56 + 1;
            int charAt22 = e10.charAt(i56);
            if (charAt22 >= 55296) {
                int i60 = charAt22 & 8191;
                int i61 = 13;
                while (true) {
                    i15 = i59 + 1;
                    charAt7 = e10.charAt(i59);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i60 |= (charAt7 & 8191) << i61;
                    i61 += 13;
                    i59 = i15;
                }
                charAt22 = i60 | (charAt7 << i61);
                i59 = i15;
            }
            int i62 = i59 + 1;
            charAt5 = e10.charAt(i59);
            if (charAt5 >= 55296) {
                int i63 = charAt5 & 8191;
                int i64 = 13;
                while (true) {
                    i14 = i62 + 1;
                    charAt6 = e10.charAt(i62);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i63 |= (charAt6 & 8191) << i64;
                    i64 += 13;
                    i62 = i14;
                }
                charAt5 = i63 | (charAt6 << i64);
                i62 = i14;
            }
            iArr = new int[charAt5 + charAt4 + charAt22];
            i12 = (charAt20 * 2) + charAt21;
            i13 = charAt20;
            i38 = i62;
        }
        Unsafe unsafe = f28681s;
        Object[] d11 = b0Var.d();
        Class<?> cls = b0Var.b().getClass();
        int[] iArr2 = new int[charAt3 * 3];
        Object[] objArr = new Object[charAt3 * 2];
        int i65 = charAt5 + charAt4;
        int i66 = charAt5;
        int i67 = i65;
        int i68 = 0;
        int i69 = 0;
        while (i38 < length) {
            int i70 = i38 + 1;
            int charAt23 = e10.charAt(i38);
            if (charAt23 >= c10) {
                int i71 = charAt23 & 8191;
                int i72 = i70;
                int i73 = 13;
                while (true) {
                    i35 = i72 + 1;
                    charAt17 = e10.charAt(i72);
                    if (charAt17 < c10) {
                        break;
                    }
                    i71 |= (charAt17 & 8191) << i73;
                    i73 += 13;
                    i72 = i35;
                }
                charAt23 = i71 | (charAt17 << i73);
                i22 = i35;
            } else {
                i22 = i70;
            }
            int i74 = i22 + 1;
            int charAt24 = e10.charAt(i22);
            if (charAt24 >= c10) {
                int i75 = charAt24 & 8191;
                int i76 = i74;
                int i77 = 13;
                while (true) {
                    i34 = i76 + 1;
                    charAt16 = e10.charAt(i76);
                    i23 = length;
                    if (charAt16 < 55296) {
                        break;
                    }
                    i75 |= (charAt16 & 8191) << i77;
                    i77 += 13;
                    i76 = i34;
                    length = i23;
                }
                charAt24 = i75 | (charAt16 << i77);
                i24 = i34;
            } else {
                i23 = length;
                i24 = i74;
            }
            int i78 = charAt24 & 255;
            int i79 = charAt5;
            if ((charAt24 & 1024) != 0) {
                iArr[i68] = i69;
                i68++;
            }
            int i80 = i68;
            if (i78 >= 51) {
                int i81 = i24 + 1;
                int charAt25 = e10.charAt(i24);
                char c11 = 55296;
                if (charAt25 >= 55296) {
                    int i82 = charAt25 & 8191;
                    int i83 = 13;
                    while (true) {
                        i33 = i81 + 1;
                        charAt15 = e10.charAt(i81);
                        if (charAt15 < c11) {
                            break;
                        }
                        i82 |= (charAt15 & 8191) << i83;
                        i83 += 13;
                        i81 = i33;
                        c11 = 55296;
                    }
                    charAt25 = i82 | (charAt15 << i83);
                    i81 = i33;
                }
                int i84 = i78 - 51;
                int i85 = i81;
                if (i84 == 9 || i84 == 17) {
                    i32 = i12 + 1;
                    objArr[((i69 / 3) * 2) + 1] = d11[i12];
                } else {
                    if (i84 == 12 && !z11) {
                        i32 = i12 + 1;
                        objArr[((i69 / 3) * 2) + 1] = d11[i12];
                    }
                    int i86 = charAt25 * 2;
                    obj = d11[i86];
                    if (obj instanceof Field) {
                        h03 = h0(cls, (String) obj);
                        d11[i86] = h03;
                    } else {
                        h03 = (Field) obj;
                    }
                    i25 = charAt;
                    i26 = charAt2;
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(h03);
                    int i87 = i86 + 1;
                    obj2 = d11[i87];
                    if (obj2 instanceof Field) {
                        h04 = h0(cls, (String) obj2);
                        d11[i87] = h04;
                    } else {
                        h04 = (Field) obj2;
                    }
                    str = e10;
                    i28 = (int) unsafe.objectFieldOffset(h04);
                    z10 = z11;
                    i29 = i85;
                    objectFieldOffset = objectFieldOffset2;
                    i30 = 0;
                }
                i12 = i32;
                int i862 = charAt25 * 2;
                obj = d11[i862];
                if (obj instanceof Field) {
                }
                i25 = charAt;
                i26 = charAt2;
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(h03);
                int i872 = i862 + 1;
                obj2 = d11[i872];
                if (obj2 instanceof Field) {
                }
                str = e10;
                i28 = (int) unsafe.objectFieldOffset(h04);
                z10 = z11;
                i29 = i85;
                objectFieldOffset = objectFieldOffset22;
                i30 = 0;
            } else {
                i25 = charAt;
                i26 = charAt2;
                int i88 = i12 + 1;
                Field h05 = h0(cls, (String) d11[i12]);
                if (i78 == 9 || i78 == 17) {
                    objArr[((i69 / 3) * 2) + 1] = h05.getType();
                } else {
                    if (i78 == 27 || i78 == 49) {
                        i31 = i12 + 2;
                        objArr[((i69 / 3) * 2) + 1] = d11[i88];
                    } else if (i78 == 12 || i78 == 30 || i78 == 44) {
                        if (!z11) {
                            i31 = i12 + 2;
                            objArr[((i69 / 3) * 2) + 1] = d11[i88];
                        }
                    } else if (i78 == 50) {
                        int i89 = i66 + 1;
                        iArr[i66] = i69;
                        int i90 = (i69 / 3) * 2;
                        int i91 = i12 + 2;
                        objArr[i90] = d11[i88];
                        if ((charAt24 & 2048) != 0) {
                            i88 = i12 + 3;
                            objArr[i90 + 1] = d11[i91];
                            i66 = i89;
                        } else {
                            i66 = i89;
                            i27 = i91;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(h05);
                            i12 = i27;
                            if ((charAt24 & 4096) == 4096 || i78 > 17) {
                                str = e10;
                                z10 = z11;
                                i28 = 1048575;
                                i29 = i24;
                                i30 = 0;
                            } else {
                                int i92 = i24 + 1;
                                int charAt26 = e10.charAt(i24);
                                if (charAt26 >= 55296) {
                                    int i93 = charAt26 & 8191;
                                    int i94 = 13;
                                    while (true) {
                                        i29 = i92 + 1;
                                        charAt14 = e10.charAt(i92);
                                        if (charAt14 < 55296) {
                                            break;
                                        }
                                        i93 |= (charAt14 & 8191) << i94;
                                        i94 += 13;
                                        i92 = i29;
                                    }
                                    charAt26 = i93 | (charAt14 << i94);
                                } else {
                                    i29 = i92;
                                }
                                int i95 = (i13 * 2) + (charAt26 / 32);
                                Object obj3 = d11[i95];
                                str = e10;
                                if (obj3 instanceof Field) {
                                    h02 = (Field) obj3;
                                } else {
                                    h02 = h0(cls, (String) obj3);
                                    d11[i95] = h02;
                                }
                                z10 = z11;
                                i28 = (int) unsafe.objectFieldOffset(h02);
                                i30 = charAt26 % 32;
                            }
                            if (i78 >= 18 && i78 <= 49) {
                                iArr[i67] = objectFieldOffset;
                                i67++;
                            }
                        }
                    }
                    i27 = i31;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(h05);
                    i12 = i27;
                    if ((charAt24 & 4096) == 4096) {
                    }
                    str = e10;
                    z10 = z11;
                    i28 = 1048575;
                    i29 = i24;
                    i30 = 0;
                    if (i78 >= 18) {
                        iArr[i67] = objectFieldOffset;
                        i67++;
                    }
                }
                i27 = i88;
                objectFieldOffset = (int) unsafe.objectFieldOffset(h05);
                i12 = i27;
                if ((charAt24 & 4096) == 4096) {
                }
                str = e10;
                z10 = z11;
                i28 = 1048575;
                i29 = i24;
                i30 = 0;
                if (i78 >= 18) {
                }
            }
            int i96 = i69 + 1;
            iArr2[i69] = charAt23;
            int i97 = i69 + 2;
            iArr2[i96] = ((charAt24 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? 268435456 : 0) | ((charAt24 & 512) != 0 ? 536870912 : 0) | (i78 << 20) | objectFieldOffset;
            i69 += 3;
            iArr2[i97] = (i30 << 20) | i28;
            z11 = z10;
            charAt = i25;
            charAt5 = i79;
            i38 = i29;
            length = i23;
            e10 = str;
            i68 = i80;
            charAt2 = i26;
            c10 = 55296;
        }
        return new Q(iArr2, objArr, charAt, charAt2, b0Var.b(), z11, false, iArr, charAt5, i65, t10, d10, i0Var, abstractC2885p, i10);
    }

    private int S(int i10) {
        return this.f28682a[i10];
    }

    private static long T(int i10) {
        return i10 & 1048575;
    }

    private static boolean U(Object obj, long j10) {
        return ((Boolean) m0.C(obj, j10)).booleanValue();
    }

    private static double V(Object obj, long j10) {
        return ((Double) m0.C(obj, j10)).doubleValue();
    }

    private static float W(Object obj, long j10) {
        return ((Float) m0.C(obj, j10)).floatValue();
    }

    private static int X(Object obj, long j10) {
        return ((Integer) m0.C(obj, j10)).intValue();
    }

    private static long Y(Object obj, long j10) {
        return ((Long) m0.C(obj, j10)).longValue();
    }

    private int Z(Object obj, byte[] bArr, int i10, int i11, int i12, long j10, AbstractC2874e.a aVar) {
        Unsafe unsafe = f28681s;
        Object s10 = s(i12);
        Object object = unsafe.getObject(obj, j10);
        if (this.f28698q.g(object)) {
            Object e10 = this.f28698q.e(s10);
            this.f28698q.a(e10, object);
            unsafe.putObject(obj, j10, e10);
            object = e10;
        }
        this.f28698q.c(s10);
        return m(bArr, i10, i11, null, this.f28698q.d(object), aVar);
    }

    private int a0(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, AbstractC2874e.a aVar) {
        Unsafe unsafe = f28681s;
        long j11 = this.f28682a[i17 + 2] & 1048575;
        switch (i16) {
            case 51:
                if (i14 == 1) {
                    unsafe.putObject(obj, j10, Double.valueOf(AbstractC2874e.d(bArr, i10)));
                    int i18 = i10 + 8;
                    unsafe.putInt(obj, j11, i13);
                    return i18;
                }
                break;
            case 52:
                if (i14 == 5) {
                    unsafe.putObject(obj, j10, Float.valueOf(AbstractC2874e.k(bArr, i10)));
                    int i19 = i10 + 4;
                    unsafe.putInt(obj, j11, i13);
                    return i19;
                }
                break;
            case 53:
            case 54:
                if (i14 == 0) {
                    int K10 = AbstractC2874e.K(bArr, i10, aVar);
                    unsafe.putObject(obj, j10, Long.valueOf(aVar.f28721b));
                    unsafe.putInt(obj, j11, i13);
                    return K10;
                }
                break;
            case 55:
            case 62:
                if (i14 == 0) {
                    int H10 = AbstractC2874e.H(bArr, i10, aVar);
                    unsafe.putObject(obj, j10, Integer.valueOf(aVar.f28720a));
                    unsafe.putInt(obj, j11, i13);
                    return H10;
                }
                break;
            case 56:
            case 65:
                if (i14 == 1) {
                    unsafe.putObject(obj, j10, Long.valueOf(AbstractC2874e.i(bArr, i10)));
                    int i20 = i10 + 8;
                    unsafe.putInt(obj, j11, i13);
                    return i20;
                }
                break;
            case 57:
            case 64:
                if (i14 == 5) {
                    unsafe.putObject(obj, j10, Integer.valueOf(AbstractC2874e.g(bArr, i10)));
                    int i21 = i10 + 4;
                    unsafe.putInt(obj, j11, i13);
                    return i21;
                }
                break;
            case 58:
                if (i14 == 0) {
                    int K11 = AbstractC2874e.K(bArr, i10, aVar);
                    unsafe.putObject(obj, j10, Boolean.valueOf(aVar.f28721b != 0));
                    unsafe.putInt(obj, j11, i13);
                    return K11;
                }
                break;
            case 59:
                if (i14 == 2) {
                    int H11 = AbstractC2874e.H(bArr, i10, aVar);
                    int i22 = aVar.f28720a;
                    if (i22 == 0) {
                        unsafe.putObject(obj, j10, BuildConfig.FLAVOR);
                    } else {
                        if ((i15 & 536870912) != 0 && !n0.n(bArr, H11, H11 + i22)) {
                            throw C2894z.c();
                        }
                        unsafe.putObject(obj, j10, new String(bArr, H11, i22, AbstractC2893y.f28819b));
                        H11 += i22;
                    }
                    unsafe.putInt(obj, j11, i13);
                    return H11;
                }
                break;
            case HVError.DETECTOR_NOT_AVAILABLE_ERROR /* 60 */:
                if (i14 == 2) {
                    Object O10 = O(obj, i13, i17);
                    int N10 = AbstractC2874e.N(O10, t(i17), bArr, i10, i11, aVar);
                    m0(obj, i13, i17, O10);
                    return N10;
                }
                break;
            case 61:
                if (i14 == 2) {
                    int b10 = AbstractC2874e.b(bArr, i10, aVar);
                    unsafe.putObject(obj, j10, aVar.f28722c);
                    unsafe.putInt(obj, j11, i13);
                    return b10;
                }
                break;
            case 63:
                if (i14 == 0) {
                    int H12 = AbstractC2874e.H(bArr, i10, aVar);
                    int i23 = aVar.f28720a;
                    r(i17);
                    unsafe.putObject(obj, j10, Integer.valueOf(i23));
                    unsafe.putInt(obj, j11, i13);
                    return H12;
                }
                break;
            case 66:
                if (i14 == 0) {
                    int H13 = AbstractC2874e.H(bArr, i10, aVar);
                    unsafe.putObject(obj, j10, Integer.valueOf(AbstractC2878i.a(aVar.f28720a)));
                    unsafe.putInt(obj, j11, i13);
                    return H13;
                }
                break;
            case 67:
                if (i14 == 0) {
                    int K12 = AbstractC2874e.K(bArr, i10, aVar);
                    unsafe.putObject(obj, j10, Long.valueOf(AbstractC2878i.b(aVar.f28721b)));
                    unsafe.putInt(obj, j11, i13);
                    return K12;
                }
                break;
            case 68:
                if (i14 == 3) {
                    Object O11 = O(obj, i13, i17);
                    int M10 = AbstractC2874e.M(O11, t(i17), bArr, i10, i11, (i12 & (-8)) | 4, aVar);
                    m0(obj, i13, i17, O11);
                    return M10;
                }
                break;
        }
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x0298, code lost:
    
        if (r0 != r10) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x029a, code lost:
    
        r15 = r29;
        r14 = r30;
        r12 = r31;
        r13 = r33;
        r11 = r34;
        r1 = r18;
        r8 = r19;
        r7 = r22;
        r6 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02b2, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02e8, code lost:
    
        if (r0 != r15) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0307, code lost:
    
        if (r0 != r15) goto L99;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x0089. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int c0(Object obj, byte[] bArr, int i10, int i11, AbstractC2874e.a aVar) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        Unsafe unsafe;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int b10;
        Q q10 = this;
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i24 = i11;
        AbstractC2874e.a aVar2 = aVar;
        l(obj);
        Unsafe unsafe2 = f28681s;
        int i25 = -1;
        int i26 = i10;
        int i27 = -1;
        int i28 = 0;
        int i29 = 0;
        int i30 = 1048575;
        while (i26 < i24) {
            int i31 = i26 + 1;
            byte b11 = bArr2[i26];
            if (b11 < 0) {
                i13 = AbstractC2874e.G(b11, bArr2, i31, aVar2);
                i12 = aVar2.f28720a;
            } else {
                i12 = b11;
                i13 = i31;
            }
            int i32 = i12 >>> 3;
            int i33 = i12 & 7;
            int f02 = i32 > i27 ? q10.f0(i32, i28 / 3) : q10.e0(i32);
            if (f02 == i25) {
                i14 = i13;
                i15 = i32;
                i16 = i25;
                unsafe = unsafe2;
                i17 = 0;
            } else {
                int i34 = q10.f28682a[f02 + 1];
                int n02 = n0(i34);
                long T10 = T(i34);
                if (n02 <= 17) {
                    int i35 = q10.f28682a[f02 + 2];
                    int i36 = 1 << (i35 >>> 20);
                    int i37 = 1048575;
                    int i38 = i35 & 1048575;
                    if (i38 != i30) {
                        if (i30 != 1048575) {
                            unsafe2.putInt(obj2, i30, i29);
                            i37 = 1048575;
                        }
                        if (i38 != i37) {
                            i29 = unsafe2.getInt(obj2, i38);
                        }
                        i30 = i38;
                    }
                    switch (n02) {
                        case 0:
                            i15 = i32;
                            aVar2 = aVar;
                            i21 = f02;
                            i22 = i13;
                            i23 = i29;
                            if (i33 != 1) {
                                i29 = i23;
                                i17 = i21;
                                unsafe = unsafe2;
                                i14 = i22;
                                i16 = -1;
                                break;
                            } else {
                                m0.N(obj2, T10, AbstractC2874e.d(bArr2, i22));
                                i26 = i22 + 8;
                                i29 = i23 | i36;
                                i28 = i21;
                                i27 = i15;
                                i25 = -1;
                                break;
                            }
                        case 1:
                            i15 = i32;
                            aVar2 = aVar;
                            i22 = i13;
                            i23 = i29;
                            i21 = f02;
                            if (i33 != 5) {
                                i29 = i23;
                                i17 = i21;
                                unsafe = unsafe2;
                                i14 = i22;
                                i16 = -1;
                                break;
                            } else {
                                m0.O(obj2, T10, AbstractC2874e.k(bArr2, i22));
                                i26 = i22 + 4;
                                i29 = i23 | i36;
                                i28 = i21;
                                i27 = i15;
                                i25 = -1;
                                break;
                            }
                        case 2:
                        case 3:
                            i15 = i32;
                            aVar2 = aVar;
                            i21 = f02;
                            i22 = i13;
                            i23 = i29;
                            if (i33 != 0) {
                                i29 = i23;
                                i17 = i21;
                                unsafe = unsafe2;
                                i14 = i22;
                                i16 = -1;
                                break;
                            } else {
                                int K10 = AbstractC2874e.K(bArr2, i22, aVar2);
                                unsafe2.putLong(obj, T10, aVar2.f28721b);
                                i29 = i23 | i36;
                                i28 = i21;
                                i26 = K10;
                                i27 = i15;
                                i25 = -1;
                                break;
                            }
                        case 4:
                        case 11:
                            i15 = i32;
                            aVar2 = aVar;
                            i21 = f02;
                            i22 = i13;
                            i23 = i29;
                            if (i33 != 0) {
                                i29 = i23;
                                i17 = i21;
                                unsafe = unsafe2;
                                i14 = i22;
                                i16 = -1;
                                break;
                            } else {
                                i26 = AbstractC2874e.H(bArr2, i22, aVar2);
                                unsafe2.putInt(obj2, T10, aVar2.f28720a);
                                i29 = i23 | i36;
                                i28 = i21;
                                i27 = i15;
                                i25 = -1;
                                break;
                            }
                        case 5:
                        case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                            i15 = i32;
                            aVar2 = aVar;
                            i21 = f02;
                            i23 = i29;
                            if (i33 != 1) {
                                i22 = i13;
                                i29 = i23;
                                i17 = i21;
                                unsafe = unsafe2;
                                i14 = i22;
                                i16 = -1;
                                break;
                            } else {
                                i22 = i13;
                                unsafe2.putLong(obj, T10, AbstractC2874e.i(bArr2, i13));
                                i26 = i22 + 8;
                                i29 = i23 | i36;
                                i28 = i21;
                                i27 = i15;
                                i25 = -1;
                                break;
                            }
                        case 6:
                        case 13:
                            i15 = i32;
                            aVar2 = aVar;
                            i23 = i29;
                            i21 = f02;
                            if (i33 != 5) {
                                i22 = i13;
                                i29 = i23;
                                i17 = i21;
                                unsafe = unsafe2;
                                i14 = i22;
                                i16 = -1;
                                break;
                            } else {
                                unsafe2.putInt(obj2, T10, AbstractC2874e.g(bArr2, i13));
                                i26 = i13 + 4;
                                i29 = i23 | i36;
                                i28 = i21;
                                i27 = i15;
                                i25 = -1;
                                break;
                            }
                        case 7:
                            i15 = i32;
                            aVar2 = aVar;
                            i21 = f02;
                            boolean z10 = true;
                            i23 = i29;
                            if (i33 != 0) {
                                i22 = i13;
                                i29 = i23;
                                i17 = i21;
                                unsafe = unsafe2;
                                i14 = i22;
                                i16 = -1;
                                break;
                            } else {
                                int K11 = AbstractC2874e.K(bArr2, i13, aVar2);
                                if (aVar2.f28721b == 0) {
                                    z10 = false;
                                }
                                m0.H(obj2, T10, z10);
                                i29 = i23 | i36;
                                i26 = K11;
                                i28 = i21;
                                i27 = i15;
                                i25 = -1;
                                break;
                            }
                        case 8:
                            i15 = i32;
                            aVar2 = aVar;
                            i21 = f02;
                            i23 = i29;
                            if (i33 != 2) {
                                i22 = i13;
                                i29 = i23;
                                i17 = i21;
                                unsafe = unsafe2;
                                i14 = i22;
                                i16 = -1;
                                break;
                            } else {
                                i26 = (536870912 & i34) == 0 ? AbstractC2874e.B(bArr2, i13, aVar2) : AbstractC2874e.E(bArr2, i13, aVar2);
                                unsafe2.putObject(obj2, T10, aVar2.f28722c);
                                i29 = i23 | i36;
                                i28 = i21;
                                i27 = i15;
                                i25 = -1;
                                break;
                            }
                        case 9:
                            i15 = i32;
                            aVar2 = aVar;
                            i21 = f02;
                            if (i33 != 2) {
                                i22 = i13;
                                i23 = i29;
                                i29 = i23;
                                i17 = i21;
                                unsafe = unsafe2;
                                i14 = i22;
                                i16 = -1;
                                break;
                            } else {
                                Object N10 = q10.N(obj2, i21);
                                i26 = AbstractC2874e.N(N10, q10.t(i21), bArr, i13, i11, aVar);
                                q10.l0(obj2, i21, N10);
                                i29 |= i36;
                                i28 = i21;
                                i27 = i15;
                                i25 = -1;
                                break;
                            }
                        case RequestError.EVENT_TIMEOUT /* 10 */:
                            i15 = i32;
                            aVar2 = aVar;
                            i21 = f02;
                            if (i33 != 2) {
                                i22 = i13;
                                i23 = i29;
                                i29 = i23;
                                i17 = i21;
                                unsafe = unsafe2;
                                i14 = i22;
                                i16 = -1;
                                break;
                            } else {
                                b10 = AbstractC2874e.b(bArr2, i13, aVar2);
                                unsafe2.putObject(obj2, T10, aVar2.f28722c);
                                i29 |= i36;
                                i26 = b10;
                                i28 = i21;
                                i27 = i15;
                                i25 = -1;
                                break;
                            }
                        case 12:
                            i15 = i32;
                            aVar2 = aVar;
                            i21 = f02;
                            if (i33 != 0) {
                                i22 = i13;
                                i23 = i29;
                                i29 = i23;
                                i17 = i21;
                                unsafe = unsafe2;
                                i14 = i22;
                                i16 = -1;
                                break;
                            } else {
                                b10 = AbstractC2874e.H(bArr2, i13, aVar2);
                                unsafe2.putInt(obj2, T10, aVar2.f28720a);
                                i29 |= i36;
                                i26 = b10;
                                i28 = i21;
                                i27 = i15;
                                i25 = -1;
                                break;
                            }
                        case HVError.SSL_CONNECT_ERROR /* 15 */:
                            i15 = i32;
                            aVar2 = aVar;
                            i21 = f02;
                            if (i33 != 0) {
                                i22 = i13;
                                i23 = i29;
                                i29 = i23;
                                i17 = i21;
                                unsafe = unsafe2;
                                i14 = i22;
                                i16 = -1;
                                break;
                            } else {
                                i26 = AbstractC2874e.H(bArr2, i13, aVar2);
                                unsafe2.putInt(obj2, T10, AbstractC2878i.a(aVar2.f28720a));
                                i29 |= i36;
                                i28 = i21;
                                i27 = i15;
                                i25 = -1;
                                break;
                            }
                        case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                            if (i33 != 0) {
                                i15 = i32;
                                i21 = f02;
                                i22 = i13;
                                i23 = i29;
                                i29 = i23;
                                i17 = i21;
                                unsafe = unsafe2;
                                i14 = i22;
                                i16 = -1;
                                break;
                            } else {
                                aVar2 = aVar;
                                int K12 = AbstractC2874e.K(bArr2, i13, aVar2);
                                i15 = i32;
                                unsafe2.putLong(obj, T10, AbstractC2878i.b(aVar2.f28721b));
                                i29 |= i36;
                                i28 = f02;
                                i26 = K12;
                                i27 = i15;
                                i25 = -1;
                                break;
                            }
                        default:
                            i15 = i32;
                            i21 = f02;
                            i22 = i13;
                            i23 = i29;
                            i29 = i23;
                            i17 = i21;
                            unsafe = unsafe2;
                            i14 = i22;
                            i16 = -1;
                            break;
                    }
                } else {
                    i15 = i32;
                    int i39 = i29;
                    aVar2 = aVar;
                    int i40 = i13;
                    if (n02 != 27) {
                        if (n02 <= 49) {
                            i18 = i39;
                            i17 = f02;
                            i16 = -1;
                            unsafe = unsafe2;
                            i19 = i30;
                            i26 = d0(obj, bArr, i40, i11, i12, i15, i33, f02, i34, n02, T10, aVar);
                        } else {
                            i18 = i39;
                            i19 = i30;
                            i17 = f02;
                            unsafe = unsafe2;
                            i20 = i40;
                            i16 = -1;
                            if (n02 != 50) {
                                i26 = a0(obj, bArr, i20, i11, i12, i15, i33, i34, n02, T10, i17, aVar);
                            } else if (i33 == 2) {
                                i26 = Z(obj, bArr, i20, i11, i17, T10, aVar);
                            }
                        }
                        i28 = i17;
                        unsafe2 = unsafe;
                    } else if (i33 == 2) {
                        AbstractC2893y.b bVar = (AbstractC2893y.b) unsafe2.getObject(obj2, T10);
                        if (!bVar.N()) {
                            int size = bVar.size();
                            bVar = bVar.y(size == 0 ? 10 : size * 2);
                            unsafe2.putObject(obj2, T10, bVar);
                        }
                        i26 = AbstractC2874e.p(q10.t(f02), i12, bArr, i40, i11, bVar, aVar);
                        i28 = f02;
                        i29 = i39;
                        i27 = i15;
                        i25 = -1;
                    } else {
                        i19 = i30;
                        i17 = f02;
                        unsafe = unsafe2;
                        i20 = i40;
                        i18 = i39;
                        i16 = -1;
                    }
                    i14 = i20;
                    i30 = i19;
                    i29 = i18;
                }
            }
            i26 = AbstractC2874e.F(i12, bArr, i14, i11, u(obj), aVar);
            q10 = this;
            obj2 = obj;
            bArr2 = bArr;
            i24 = i11;
            aVar2 = aVar;
            i27 = i15;
            i25 = i16;
            i28 = i17;
            unsafe2 = unsafe;
        }
        int i41 = i29;
        Unsafe unsafe3 = unsafe2;
        if (i30 != 1048575) {
            unsafe3.putInt(obj, i30, i41);
        }
        if (i26 == i11) {
            return i26;
        }
        throw C2894z.f();
    }

    private int d0(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, long j10, int i16, long j11, AbstractC2874e.a aVar) {
        int I10;
        Unsafe unsafe = f28681s;
        AbstractC2893y.b bVar = (AbstractC2893y.b) unsafe.getObject(obj, j11);
        if (!bVar.N()) {
            int size = bVar.size();
            bVar = bVar.y(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j11, bVar);
        }
        switch (i16) {
            case 18:
            case HVError.FACE_CAPTURE_TIMEOUT /* 35 */:
                if (i14 == 2) {
                    return AbstractC2874e.r(bArr, i10, bVar, aVar);
                }
                if (i14 == 1) {
                    return AbstractC2874e.e(i12, bArr, i10, i11, bVar, aVar);
                }
                break;
            case 19:
            case HVError.HYPER_DOC_DETECT_ERROR /* 36 */:
                if (i14 == 2) {
                    return AbstractC2874e.u(bArr, i10, bVar, aVar);
                }
                if (i14 == 5) {
                    return AbstractC2874e.l(i12, bArr, i10, i11, bVar, aVar);
                }
                break;
            case HVRetakeActivity.CLOSE_ACTION /* 20 */:
            case HVRetakeActivity.RECHECK_ACTION /* 21 */:
            case HVError.INVALID_FILE_ERROR /* 37 */:
            case 38:
                if (i14 == 2) {
                    return AbstractC2874e.y(bArr, i10, bVar, aVar);
                }
                if (i14 == 0) {
                    return AbstractC2874e.L(i12, bArr, i10, i11, bVar, aVar);
                }
                break;
            case HVError.FACE_DETECTION_ERROR /* 22 */:
            case 29:
            case 39:
            case HVError.ENCRYPTION_ERROR /* 43 */:
                if (i14 == 2) {
                    return AbstractC2874e.x(bArr, i10, bVar, aVar);
                }
                if (i14 == 0) {
                    return AbstractC2874e.I(i12, bArr, i10, i11, bVar, aVar);
                }
                break;
            case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
            case 32:
            case RequestError.NETWORK_FAILURE /* 40 */:
            case 46:
                if (i14 == 2) {
                    return AbstractC2874e.t(bArr, i10, bVar, aVar);
                }
                if (i14 == 1) {
                    return AbstractC2874e.j(i12, bArr, i10, i11, bVar, aVar);
                }
                break;
            case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
            case HVError.INSTRUCTION_ERROR /* 31 */:
            case RequestError.NO_DEV_KEY /* 41 */:
            case HVError.PERMISSION_REVOKED_ERROR /* 45 */:
                if (i14 == 2) {
                    return AbstractC2874e.s(bArr, i10, bVar, aVar);
                }
                if (i14 == 5) {
                    return AbstractC2874e.h(i12, bArr, i10, i11, bVar, aVar);
                }
                break;
            case HVError.LOW_STORAGE_ERROR /* 25 */:
            case HVError.CONSENT_DENIED /* 42 */:
                if (i14 == 2) {
                    return AbstractC2874e.q(bArr, i10, bVar, aVar);
                }
                if (i14 == 0) {
                    return AbstractC2874e.a(i12, bArr, i10, i11, bVar, aVar);
                }
                break;
            case 26:
                if (i14 == 2) {
                    return (j10 & 536870912) == 0 ? AbstractC2874e.C(i12, bArr, i10, i11, bVar, aVar) : AbstractC2874e.D(i12, bArr, i10, i11, bVar, aVar);
                }
                break;
            case 27:
                if (i14 == 2) {
                    return AbstractC2874e.p(t(i15), i12, bArr, i10, i11, bVar, aVar);
                }
                break;
            case 28:
                if (i14 == 2) {
                    return AbstractC2874e.c(i12, bArr, i10, i11, bVar, aVar);
                }
                break;
            case 30:
            case HVError.SDK_CLOSE_ERROR /* 44 */:
                if (i14 == 2) {
                    I10 = AbstractC2874e.x(bArr, i10, bVar, aVar);
                } else if (i14 == 0) {
                    I10 = AbstractC2874e.I(i12, bArr, i10, i11, bVar, aVar);
                }
                r(i15);
                e0.z(obj, i13, bVar, null, null, this.f28696o);
                return I10;
            case HVError.GPS_ACCESS_DENIED /* 33 */:
            case 47:
                if (i14 == 2) {
                    return AbstractC2874e.v(bArr, i10, bVar, aVar);
                }
                if (i14 == 0) {
                    return AbstractC2874e.z(i12, bArr, i10, i11, bVar, aVar);
                }
                break;
            case 34:
            case 48:
                if (i14 == 2) {
                    return AbstractC2874e.w(bArr, i10, bVar, aVar);
                }
                if (i14 == 0) {
                    return AbstractC2874e.A(i12, bArr, i10, i11, bVar, aVar);
                }
                break;
            case 49:
                if (i14 == 3) {
                    return AbstractC2874e.n(t(i15), i12, bArr, i10, i11, bVar, aVar);
                }
                break;
        }
        return i10;
    }

    private int e0(int i10) {
        if (i10 < this.f28684c || i10 > this.f28685d) {
            return -1;
        }
        return k0(i10, 0);
    }

    private int f0(int i10, int i11) {
        if (i10 < this.f28684c || i10 > this.f28685d) {
            return -1;
        }
        return k0(i10, i11);
    }

    private int g0(int i10) {
        return this.f28682a[i10 + 2];
    }

    private static Field h0(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private void i0(Object obj, int i10) {
        int g02 = g0(i10);
        long j10 = 1048575 & g02;
        if (j10 == 1048575) {
            return;
        }
        m0.P(obj, j10, (1 << (g02 >>> 20)) | m0.z(obj, j10));
    }

    private boolean j(Object obj, Object obj2, int i10) {
        return z(obj, i10) == z(obj2, i10);
    }

    private void j0(Object obj, int i10, int i11) {
        m0.P(obj, g0(i11) & 1048575, i10);
    }

    private static boolean k(Object obj, long j10) {
        return m0.r(obj, j10);
    }

    private int k0(int i10, int i11) {
        int length = (this.f28682a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int S10 = S(i13);
            if (i10 == S10) {
                return i13;
            }
            if (i10 < S10) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    private static void l(Object obj) {
        if (E(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    private void l0(Object obj, int i10, Object obj2) {
        f28681s.putObject(obj, T(o0(i10)), obj2);
        i0(obj, i10);
    }

    private int m(byte[] bArr, int i10, int i11, G.a aVar, Map map, AbstractC2874e.a aVar2) {
        int H10 = AbstractC2874e.H(bArr, i10, aVar2);
        int i12 = aVar2.f28720a;
        if (i12 < 0 || i12 > i11 - H10) {
            throw C2894z.h();
        }
        throw null;
    }

    private void m0(Object obj, int i10, int i11, Object obj2) {
        f28681s.putObject(obj, T(o0(i11)), obj2);
        j0(obj, i10, i11);
    }

    private static double n(Object obj, long j10) {
        return m0.x(obj, j10);
    }

    private static int n0(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    private boolean o(Object obj, Object obj2, int i10) {
        int o02 = o0(i10);
        long T10 = T(o02);
        switch (n0(o02)) {
            case 0:
                if (j(obj, obj2, i10) && Double.doubleToLongBits(m0.x(obj, T10)) == Double.doubleToLongBits(m0.x(obj2, T10))) {
                    break;
                }
                break;
            case 1:
                if (j(obj, obj2, i10) && Float.floatToIntBits(m0.y(obj, T10)) == Float.floatToIntBits(m0.y(obj2, T10))) {
                    break;
                }
                break;
            case 2:
                if (j(obj, obj2, i10) && m0.A(obj, T10) == m0.A(obj2, T10)) {
                    break;
                }
                break;
            case 3:
                if (j(obj, obj2, i10) && m0.A(obj, T10) == m0.A(obj2, T10)) {
                    break;
                }
                break;
            case 4:
                if (j(obj, obj2, i10) && m0.z(obj, T10) == m0.z(obj2, T10)) {
                    break;
                }
                break;
            case 5:
                if (j(obj, obj2, i10) && m0.A(obj, T10) == m0.A(obj2, T10)) {
                    break;
                }
                break;
            case 6:
                if (j(obj, obj2, i10) && m0.z(obj, T10) == m0.z(obj2, T10)) {
                    break;
                }
                break;
            case 7:
                if (j(obj, obj2, i10) && m0.r(obj, T10) == m0.r(obj2, T10)) {
                    break;
                }
                break;
            case 8:
                if (j(obj, obj2, i10) && e0.J(m0.C(obj, T10), m0.C(obj2, T10))) {
                    break;
                }
                break;
            case 9:
                if (j(obj, obj2, i10) && e0.J(m0.C(obj, T10), m0.C(obj2, T10))) {
                    break;
                }
                break;
            case RequestError.EVENT_TIMEOUT /* 10 */:
                if (j(obj, obj2, i10) && e0.J(m0.C(obj, T10), m0.C(obj2, T10))) {
                    break;
                }
                break;
            case 11:
                if (j(obj, obj2, i10) && m0.z(obj, T10) == m0.z(obj2, T10)) {
                    break;
                }
                break;
            case 12:
                if (j(obj, obj2, i10) && m0.z(obj, T10) == m0.z(obj2, T10)) {
                    break;
                }
                break;
            case 13:
                if (j(obj, obj2, i10) && m0.z(obj, T10) == m0.z(obj2, T10)) {
                    break;
                }
                break;
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                if (j(obj, obj2, i10) && m0.A(obj, T10) == m0.A(obj2, T10)) {
                    break;
                }
                break;
            case HVError.SSL_CONNECT_ERROR /* 15 */:
                if (j(obj, obj2, i10) && m0.z(obj, T10) == m0.z(obj2, T10)) {
                    break;
                }
                break;
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                if (j(obj, obj2, i10) && m0.A(obj, T10) == m0.A(obj2, T10)) {
                    break;
                }
                break;
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                if (j(obj, obj2, i10) && e0.J(m0.C(obj, T10), m0.C(obj2, T10))) {
                    break;
                }
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
                if (F(obj, obj2, i10) && e0.J(m0.C(obj, T10), m0.C(obj2, T10))) {
                    break;
                }
                break;
        }
        return true;
    }

    private int o0(int i10) {
        return this.f28682a[i10 + 1];
    }

    private Object p(Object obj, int i10, Object obj2, i0 i0Var, Object obj3) {
        S(i10);
        if (m0.C(obj, T(o0(i10))) == null) {
            return obj2;
        }
        r(i10);
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:228:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void p0(Object obj, p0 p0Var) {
        Iterator it;
        Map.Entry entry;
        int length;
        int i10;
        int i11;
        if (this.f28687f) {
            AbstractC2887s b10 = this.f28697p.b(obj);
            if (!b10.d()) {
                it = b10.f();
                entry = (Map.Entry) it.next();
                length = this.f28682a.length;
                Unsafe unsafe = f28681s;
                int i12 = 1048575;
                int i13 = 1048575;
                i10 = 0;
                int i14 = 0;
                while (i10 < length) {
                    int o02 = o0(i10);
                    int S10 = S(i10);
                    int n02 = n0(o02);
                    if (n02 <= 17) {
                        int i15 = this.f28682a[i10 + 2];
                        int i16 = i15 & i12;
                        if (i16 != i13) {
                            i14 = unsafe.getInt(obj, i16);
                            i13 = i16;
                        }
                        i11 = 1 << (i15 >>> 20);
                    } else {
                        i11 = 0;
                    }
                    while (entry != null && this.f28697p.a(entry) <= S10) {
                        this.f28697p.f(p0Var, entry);
                        entry = it.hasNext() ? (Map.Entry) it.next() : null;
                    }
                    long T10 = T(o02);
                    switch (n02) {
                        case 0:
                            if ((i11 & i14) == 0) {
                                break;
                            } else {
                                p0Var.e(S10, n(obj, T10));
                                continue;
                            }
                        case 1:
                            if ((i11 & i14) != 0) {
                                p0Var.A(S10, q(obj, T10));
                                break;
                            } else {
                                continue;
                            }
                        case 2:
                            if ((i11 & i14) != 0) {
                                p0Var.n(S10, unsafe.getLong(obj, T10));
                                break;
                            } else {
                                continue;
                            }
                        case 3:
                            if ((i11 & i14) != 0) {
                                p0Var.l(S10, unsafe.getLong(obj, T10));
                                break;
                            } else {
                                continue;
                            }
                        case 4:
                            if ((i11 & i14) != 0) {
                                p0Var.r(S10, unsafe.getInt(obj, T10));
                                break;
                            } else {
                                continue;
                            }
                        case 5:
                            if ((i11 & i14) != 0) {
                                p0Var.h(S10, unsafe.getLong(obj, T10));
                                break;
                            } else {
                                continue;
                            }
                        case 6:
                            if ((i11 & i14) != 0) {
                                p0Var.d(S10, unsafe.getInt(obj, T10));
                                break;
                            } else {
                                continue;
                            }
                        case 7:
                            if ((i11 & i14) != 0) {
                                p0Var.o(S10, k(obj, T10));
                                break;
                            } else {
                                continue;
                            }
                        case 8:
                            if ((i11 & i14) != 0) {
                                t0(S10, unsafe.getObject(obj, T10), p0Var);
                                break;
                            } else {
                                continue;
                            }
                        case 9:
                            if ((i11 & i14) != 0) {
                                p0Var.L(S10, unsafe.getObject(obj, T10), t(i10));
                                break;
                            } else {
                                continue;
                            }
                        case RequestError.EVENT_TIMEOUT /* 10 */:
                            if ((i11 & i14) != 0) {
                                p0Var.N(S10, (AbstractC2877h) unsafe.getObject(obj, T10));
                                break;
                            } else {
                                continue;
                            }
                        case 11:
                            if ((i11 & i14) != 0) {
                                p0Var.b(S10, unsafe.getInt(obj, T10));
                                break;
                            } else {
                                continue;
                            }
                        case 12:
                            if ((i11 & i14) != 0) {
                                p0Var.D(S10, unsafe.getInt(obj, T10));
                                break;
                            } else {
                                continue;
                            }
                        case 13:
                            if ((i11 & i14) != 0) {
                                p0Var.p(S10, unsafe.getInt(obj, T10));
                                break;
                            } else {
                                continue;
                            }
                        case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                            if ((i11 & i14) != 0) {
                                p0Var.u(S10, unsafe.getLong(obj, T10));
                                break;
                            } else {
                                continue;
                            }
                        case HVError.SSL_CONNECT_ERROR /* 15 */:
                            if ((i11 & i14) != 0) {
                                p0Var.H(S10, unsafe.getInt(obj, T10));
                                break;
                            } else {
                                continue;
                            }
                        case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                            if ((i11 & i14) != 0) {
                                p0Var.z(S10, unsafe.getLong(obj, T10));
                                break;
                            } else {
                                continue;
                            }
                        case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                            if ((i11 & i14) != 0) {
                                p0Var.M(S10, unsafe.getObject(obj, T10), t(i10));
                                break;
                            } else {
                                continue;
                            }
                        case 18:
                            e0.O(S(i10), (List) unsafe.getObject(obj, T10), p0Var, false);
                            continue;
                        case 19:
                            e0.S(S(i10), (List) unsafe.getObject(obj, T10), p0Var, false);
                            continue;
                        case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                            e0.V(S(i10), (List) unsafe.getObject(obj, T10), p0Var, false);
                            continue;
                        case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                            e0.d0(S(i10), (List) unsafe.getObject(obj, T10), p0Var, false);
                            continue;
                        case HVError.FACE_DETECTION_ERROR /* 22 */:
                            e0.U(S(i10), (List) unsafe.getObject(obj, T10), p0Var, false);
                            continue;
                        case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                            e0.R(S(i10), (List) unsafe.getObject(obj, T10), p0Var, false);
                            continue;
                        case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                            e0.Q(S(i10), (List) unsafe.getObject(obj, T10), p0Var, false);
                            continue;
                        case HVError.LOW_STORAGE_ERROR /* 25 */:
                            e0.M(S(i10), (List) unsafe.getObject(obj, T10), p0Var, false);
                            continue;
                        case 26:
                            e0.b0(S(i10), (List) unsafe.getObject(obj, T10), p0Var);
                            break;
                        case 27:
                            e0.W(S(i10), (List) unsafe.getObject(obj, T10), p0Var, t(i10));
                            break;
                        case 28:
                            e0.N(S(i10), (List) unsafe.getObject(obj, T10), p0Var);
                            break;
                        case 29:
                            e0.c0(S(i10), (List) unsafe.getObject(obj, T10), p0Var, false);
                            continue;
                        case 30:
                            e0.P(S(i10), (List) unsafe.getObject(obj, T10), p0Var, false);
                            continue;
                        case HVError.INSTRUCTION_ERROR /* 31 */:
                            e0.X(S(i10), (List) unsafe.getObject(obj, T10), p0Var, false);
                            continue;
                        case 32:
                            e0.Y(S(i10), (List) unsafe.getObject(obj, T10), p0Var, false);
                            continue;
                        case HVError.GPS_ACCESS_DENIED /* 33 */:
                            e0.Z(S(i10), (List) unsafe.getObject(obj, T10), p0Var, false);
                            continue;
                        case 34:
                            e0.a0(S(i10), (List) unsafe.getObject(obj, T10), p0Var, false);
                            continue;
                        case HVError.FACE_CAPTURE_TIMEOUT /* 35 */:
                            e0.O(S(i10), (List) unsafe.getObject(obj, T10), p0Var, true);
                            break;
                        case HVError.HYPER_DOC_DETECT_ERROR /* 36 */:
                            e0.S(S(i10), (List) unsafe.getObject(obj, T10), p0Var, true);
                            break;
                        case HVError.INVALID_FILE_ERROR /* 37 */:
                            e0.V(S(i10), (List) unsafe.getObject(obj, T10), p0Var, true);
                            break;
                        case 38:
                            e0.d0(S(i10), (List) unsafe.getObject(obj, T10), p0Var, true);
                            break;
                        case 39:
                            e0.U(S(i10), (List) unsafe.getObject(obj, T10), p0Var, true);
                            break;
                        case RequestError.NETWORK_FAILURE /* 40 */:
                            e0.R(S(i10), (List) unsafe.getObject(obj, T10), p0Var, true);
                            break;
                        case RequestError.NO_DEV_KEY /* 41 */:
                            e0.Q(S(i10), (List) unsafe.getObject(obj, T10), p0Var, true);
                            break;
                        case HVError.CONSENT_DENIED /* 42 */:
                            e0.M(S(i10), (List) unsafe.getObject(obj, T10), p0Var, true);
                            break;
                        case HVError.ENCRYPTION_ERROR /* 43 */:
                            e0.c0(S(i10), (List) unsafe.getObject(obj, T10), p0Var, true);
                            break;
                        case HVError.SDK_CLOSE_ERROR /* 44 */:
                            e0.P(S(i10), (List) unsafe.getObject(obj, T10), p0Var, true);
                            break;
                        case HVError.PERMISSION_REVOKED_ERROR /* 45 */:
                            e0.X(S(i10), (List) unsafe.getObject(obj, T10), p0Var, true);
                            break;
                        case 46:
                            e0.Y(S(i10), (List) unsafe.getObject(obj, T10), p0Var, true);
                            break;
                        case 47:
                            e0.Z(S(i10), (List) unsafe.getObject(obj, T10), p0Var, true);
                            break;
                        case 48:
                            e0.a0(S(i10), (List) unsafe.getObject(obj, T10), p0Var, true);
                            break;
                        case 49:
                            e0.T(S(i10), (List) unsafe.getObject(obj, T10), p0Var, t(i10));
                            break;
                        case 50:
                            s0(p0Var, S10, unsafe.getObject(obj, T10), i10);
                            break;
                        case 51:
                            if (G(obj, S10, i10)) {
                                p0Var.e(S10, V(obj, T10));
                                break;
                            }
                            break;
                        case 52:
                            if (G(obj, S10, i10)) {
                                p0Var.A(S10, W(obj, T10));
                                break;
                            }
                            break;
                        case 53:
                            if (G(obj, S10, i10)) {
                                p0Var.n(S10, Y(obj, T10));
                                break;
                            }
                            break;
                        case 54:
                            if (G(obj, S10, i10)) {
                                p0Var.l(S10, Y(obj, T10));
                                break;
                            }
                            break;
                        case 55:
                            if (G(obj, S10, i10)) {
                                p0Var.r(S10, X(obj, T10));
                                break;
                            }
                            break;
                        case 56:
                            if (G(obj, S10, i10)) {
                                p0Var.h(S10, Y(obj, T10));
                                break;
                            }
                            break;
                        case 57:
                            if (G(obj, S10, i10)) {
                                p0Var.d(S10, X(obj, T10));
                                break;
                            }
                            break;
                        case 58:
                            if (G(obj, S10, i10)) {
                                p0Var.o(S10, U(obj, T10));
                                break;
                            }
                            break;
                        case 59:
                            if (G(obj, S10, i10)) {
                                t0(S10, unsafe.getObject(obj, T10), p0Var);
                                break;
                            }
                            break;
                        case HVError.DETECTOR_NOT_AVAILABLE_ERROR /* 60 */:
                            if (G(obj, S10, i10)) {
                                p0Var.L(S10, unsafe.getObject(obj, T10), t(i10));
                                break;
                            }
                            break;
                        case 61:
                            if (G(obj, S10, i10)) {
                                p0Var.N(S10, (AbstractC2877h) unsafe.getObject(obj, T10));
                                break;
                            }
                            break;
                        case 62:
                            if (G(obj, S10, i10)) {
                                p0Var.b(S10, X(obj, T10));
                                break;
                            }
                            break;
                        case 63:
                            if (G(obj, S10, i10)) {
                                p0Var.D(S10, X(obj, T10));
                                break;
                            }
                            break;
                        case 64:
                            if (G(obj, S10, i10)) {
                                p0Var.p(S10, X(obj, T10));
                                break;
                            }
                            break;
                        case 65:
                            if (G(obj, S10, i10)) {
                                p0Var.u(S10, Y(obj, T10));
                                break;
                            }
                            break;
                        case 66:
                            if (G(obj, S10, i10)) {
                                p0Var.H(S10, X(obj, T10));
                                break;
                            }
                            break;
                        case 67:
                            if (G(obj, S10, i10)) {
                                p0Var.z(S10, Y(obj, T10));
                                break;
                            }
                            break;
                        case 68:
                            if (G(obj, S10, i10)) {
                                p0Var.M(S10, unsafe.getObject(obj, T10), t(i10));
                                break;
                            }
                            break;
                    }
                    i10 += 3;
                    i12 = 1048575;
                }
                while (entry != null) {
                    this.f28697p.f(p0Var, entry);
                    entry = it.hasNext() ? (Map.Entry) it.next() : null;
                }
                u0(this.f28696o, obj, p0Var);
            }
        }
        it = null;
        entry = null;
        length = this.f28682a.length;
        Unsafe unsafe2 = f28681s;
        int i122 = 1048575;
        int i132 = 1048575;
        i10 = 0;
        int i142 = 0;
        while (i10 < length) {
        }
        while (entry != null) {
        }
        u0(this.f28696o, obj, p0Var);
    }

    private static float q(Object obj, long j10) {
        return m0.y(obj, j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:275:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void q0(Object obj, p0 p0Var) {
        Iterator it;
        Map.Entry entry;
        int length;
        int i10;
        if (this.f28687f) {
            AbstractC2887s b10 = this.f28697p.b(obj);
            if (!b10.d()) {
                it = b10.f();
                entry = (Map.Entry) it.next();
                length = this.f28682a.length;
                for (i10 = 0; i10 < length; i10 += 3) {
                    int o02 = o0(i10);
                    int S10 = S(i10);
                    while (entry != null && this.f28697p.a(entry) <= S10) {
                        this.f28697p.f(p0Var, entry);
                        entry = it.hasNext() ? (Map.Entry) it.next() : null;
                    }
                    switch (n0(o02)) {
                        case 0:
                            if (z(obj, i10)) {
                                p0Var.e(S10, n(obj, T(o02)));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (z(obj, i10)) {
                                p0Var.A(S10, q(obj, T(o02)));
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if (z(obj, i10)) {
                                p0Var.n(S10, J(obj, T(o02)));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if (z(obj, i10)) {
                                p0Var.l(S10, J(obj, T(o02)));
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if (z(obj, i10)) {
                                p0Var.r(S10, y(obj, T(o02)));
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if (z(obj, i10)) {
                                p0Var.h(S10, J(obj, T(o02)));
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if (z(obj, i10)) {
                                p0Var.d(S10, y(obj, T(o02)));
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if (z(obj, i10)) {
                                p0Var.o(S10, k(obj, T(o02)));
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            if (z(obj, i10)) {
                                t0(S10, m0.C(obj, T(o02)), p0Var);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            if (z(obj, i10)) {
                                p0Var.L(S10, m0.C(obj, T(o02)), t(i10));
                                break;
                            } else {
                                break;
                            }
                        case RequestError.EVENT_TIMEOUT /* 10 */:
                            if (z(obj, i10)) {
                                p0Var.N(S10, (AbstractC2877h) m0.C(obj, T(o02)));
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            if (z(obj, i10)) {
                                p0Var.b(S10, y(obj, T(o02)));
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            if (z(obj, i10)) {
                                p0Var.D(S10, y(obj, T(o02)));
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            if (z(obj, i10)) {
                                p0Var.p(S10, y(obj, T(o02)));
                                break;
                            } else {
                                break;
                            }
                        case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                            if (z(obj, i10)) {
                                p0Var.u(S10, J(obj, T(o02)));
                                break;
                            } else {
                                break;
                            }
                        case HVError.SSL_CONNECT_ERROR /* 15 */:
                            if (z(obj, i10)) {
                                p0Var.H(S10, y(obj, T(o02)));
                                break;
                            } else {
                                break;
                            }
                        case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                            if (z(obj, i10)) {
                                p0Var.z(S10, J(obj, T(o02)));
                                break;
                            } else {
                                break;
                            }
                        case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                            if (z(obj, i10)) {
                                p0Var.M(S10, m0.C(obj, T(o02)), t(i10));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            e0.O(S(i10), (List) m0.C(obj, T(o02)), p0Var, false);
                            break;
                        case 19:
                            e0.S(S(i10), (List) m0.C(obj, T(o02)), p0Var, false);
                            break;
                        case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                            e0.V(S(i10), (List) m0.C(obj, T(o02)), p0Var, false);
                            break;
                        case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                            e0.d0(S(i10), (List) m0.C(obj, T(o02)), p0Var, false);
                            break;
                        case HVError.FACE_DETECTION_ERROR /* 22 */:
                            e0.U(S(i10), (List) m0.C(obj, T(o02)), p0Var, false);
                            break;
                        case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                            e0.R(S(i10), (List) m0.C(obj, T(o02)), p0Var, false);
                            break;
                        case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                            e0.Q(S(i10), (List) m0.C(obj, T(o02)), p0Var, false);
                            break;
                        case HVError.LOW_STORAGE_ERROR /* 25 */:
                            e0.M(S(i10), (List) m0.C(obj, T(o02)), p0Var, false);
                            break;
                        case 26:
                            e0.b0(S(i10), (List) m0.C(obj, T(o02)), p0Var);
                            break;
                        case 27:
                            e0.W(S(i10), (List) m0.C(obj, T(o02)), p0Var, t(i10));
                            break;
                        case 28:
                            e0.N(S(i10), (List) m0.C(obj, T(o02)), p0Var);
                            break;
                        case 29:
                            e0.c0(S(i10), (List) m0.C(obj, T(o02)), p0Var, false);
                            break;
                        case 30:
                            e0.P(S(i10), (List) m0.C(obj, T(o02)), p0Var, false);
                            break;
                        case HVError.INSTRUCTION_ERROR /* 31 */:
                            e0.X(S(i10), (List) m0.C(obj, T(o02)), p0Var, false);
                            break;
                        case 32:
                            e0.Y(S(i10), (List) m0.C(obj, T(o02)), p0Var, false);
                            break;
                        case HVError.GPS_ACCESS_DENIED /* 33 */:
                            e0.Z(S(i10), (List) m0.C(obj, T(o02)), p0Var, false);
                            break;
                        case 34:
                            e0.a0(S(i10), (List) m0.C(obj, T(o02)), p0Var, false);
                            break;
                        case HVError.FACE_CAPTURE_TIMEOUT /* 35 */:
                            e0.O(S(i10), (List) m0.C(obj, T(o02)), p0Var, true);
                            break;
                        case HVError.HYPER_DOC_DETECT_ERROR /* 36 */:
                            e0.S(S(i10), (List) m0.C(obj, T(o02)), p0Var, true);
                            break;
                        case HVError.INVALID_FILE_ERROR /* 37 */:
                            e0.V(S(i10), (List) m0.C(obj, T(o02)), p0Var, true);
                            break;
                        case 38:
                            e0.d0(S(i10), (List) m0.C(obj, T(o02)), p0Var, true);
                            break;
                        case 39:
                            e0.U(S(i10), (List) m0.C(obj, T(o02)), p0Var, true);
                            break;
                        case RequestError.NETWORK_FAILURE /* 40 */:
                            e0.R(S(i10), (List) m0.C(obj, T(o02)), p0Var, true);
                            break;
                        case RequestError.NO_DEV_KEY /* 41 */:
                            e0.Q(S(i10), (List) m0.C(obj, T(o02)), p0Var, true);
                            break;
                        case HVError.CONSENT_DENIED /* 42 */:
                            e0.M(S(i10), (List) m0.C(obj, T(o02)), p0Var, true);
                            break;
                        case HVError.ENCRYPTION_ERROR /* 43 */:
                            e0.c0(S(i10), (List) m0.C(obj, T(o02)), p0Var, true);
                            break;
                        case HVError.SDK_CLOSE_ERROR /* 44 */:
                            e0.P(S(i10), (List) m0.C(obj, T(o02)), p0Var, true);
                            break;
                        case HVError.PERMISSION_REVOKED_ERROR /* 45 */:
                            e0.X(S(i10), (List) m0.C(obj, T(o02)), p0Var, true);
                            break;
                        case 46:
                            e0.Y(S(i10), (List) m0.C(obj, T(o02)), p0Var, true);
                            break;
                        case 47:
                            e0.Z(S(i10), (List) m0.C(obj, T(o02)), p0Var, true);
                            break;
                        case 48:
                            e0.a0(S(i10), (List) m0.C(obj, T(o02)), p0Var, true);
                            break;
                        case 49:
                            e0.T(S(i10), (List) m0.C(obj, T(o02)), p0Var, t(i10));
                            break;
                        case 50:
                            s0(p0Var, S10, m0.C(obj, T(o02)), i10);
                            break;
                        case 51:
                            if (G(obj, S10, i10)) {
                                p0Var.e(S10, V(obj, T(o02)));
                                break;
                            } else {
                                break;
                            }
                        case 52:
                            if (G(obj, S10, i10)) {
                                p0Var.A(S10, W(obj, T(o02)));
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            if (G(obj, S10, i10)) {
                                p0Var.n(S10, Y(obj, T(o02)));
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            if (G(obj, S10, i10)) {
                                p0Var.l(S10, Y(obj, T(o02)));
                                break;
                            } else {
                                break;
                            }
                        case 55:
                            if (G(obj, S10, i10)) {
                                p0Var.r(S10, X(obj, T(o02)));
                                break;
                            } else {
                                break;
                            }
                        case 56:
                            if (G(obj, S10, i10)) {
                                p0Var.h(S10, Y(obj, T(o02)));
                                break;
                            } else {
                                break;
                            }
                        case 57:
                            if (G(obj, S10, i10)) {
                                p0Var.d(S10, X(obj, T(o02)));
                                break;
                            } else {
                                break;
                            }
                        case 58:
                            if (G(obj, S10, i10)) {
                                p0Var.o(S10, U(obj, T(o02)));
                                break;
                            } else {
                                break;
                            }
                        case 59:
                            if (G(obj, S10, i10)) {
                                t0(S10, m0.C(obj, T(o02)), p0Var);
                                break;
                            } else {
                                break;
                            }
                        case HVError.DETECTOR_NOT_AVAILABLE_ERROR /* 60 */:
                            if (G(obj, S10, i10)) {
                                p0Var.L(S10, m0.C(obj, T(o02)), t(i10));
                                break;
                            } else {
                                break;
                            }
                        case 61:
                            if (G(obj, S10, i10)) {
                                p0Var.N(S10, (AbstractC2877h) m0.C(obj, T(o02)));
                                break;
                            } else {
                                break;
                            }
                        case 62:
                            if (G(obj, S10, i10)) {
                                p0Var.b(S10, X(obj, T(o02)));
                                break;
                            } else {
                                break;
                            }
                        case 63:
                            if (G(obj, S10, i10)) {
                                p0Var.D(S10, X(obj, T(o02)));
                                break;
                            } else {
                                break;
                            }
                        case 64:
                            if (G(obj, S10, i10)) {
                                p0Var.p(S10, X(obj, T(o02)));
                                break;
                            } else {
                                break;
                            }
                        case 65:
                            if (G(obj, S10, i10)) {
                                p0Var.u(S10, Y(obj, T(o02)));
                                break;
                            } else {
                                break;
                            }
                        case 66:
                            if (G(obj, S10, i10)) {
                                p0Var.H(S10, X(obj, T(o02)));
                                break;
                            } else {
                                break;
                            }
                        case 67:
                            if (G(obj, S10, i10)) {
                                p0Var.z(S10, Y(obj, T(o02)));
                                break;
                            } else {
                                break;
                            }
                        case 68:
                            if (G(obj, S10, i10)) {
                                p0Var.M(S10, m0.C(obj, T(o02)), t(i10));
                                break;
                            } else {
                                break;
                            }
                    }
                }
                while (entry != null) {
                    this.f28697p.f(p0Var, entry);
                    entry = it.hasNext() ? (Map.Entry) it.next() : null;
                }
                u0(this.f28696o, obj, p0Var);
            }
        }
        it = null;
        entry = null;
        length = this.f28682a.length;
        while (i10 < length) {
        }
        while (entry != null) {
        }
        u0(this.f28696o, obj, p0Var);
    }

    private AbstractC2893y.a r(int i10) {
        android.support.v4.media.session.b.a(this.f28683b[((i10 / 3) * 2) + 1]);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:275:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void r0(Object obj, p0 p0Var) {
        Iterator it;
        Map.Entry entry;
        int length;
        u0(this.f28696o, obj, p0Var);
        if (this.f28687f) {
            AbstractC2887s b10 = this.f28697p.b(obj);
            if (!b10.d()) {
                it = b10.a();
                entry = (Map.Entry) it.next();
                for (length = this.f28682a.length - 3; length >= 0; length -= 3) {
                    int o02 = o0(length);
                    int S10 = S(length);
                    while (entry != null && this.f28697p.a(entry) > S10) {
                        this.f28697p.f(p0Var, entry);
                        entry = it.hasNext() ? (Map.Entry) it.next() : null;
                    }
                    switch (n0(o02)) {
                        case 0:
                            if (z(obj, length)) {
                                p0Var.e(S10, n(obj, T(o02)));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (z(obj, length)) {
                                p0Var.A(S10, q(obj, T(o02)));
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if (z(obj, length)) {
                                p0Var.n(S10, J(obj, T(o02)));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if (z(obj, length)) {
                                p0Var.l(S10, J(obj, T(o02)));
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if (z(obj, length)) {
                                p0Var.r(S10, y(obj, T(o02)));
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if (z(obj, length)) {
                                p0Var.h(S10, J(obj, T(o02)));
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if (z(obj, length)) {
                                p0Var.d(S10, y(obj, T(o02)));
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if (z(obj, length)) {
                                p0Var.o(S10, k(obj, T(o02)));
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            if (z(obj, length)) {
                                t0(S10, m0.C(obj, T(o02)), p0Var);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            if (z(obj, length)) {
                                p0Var.L(S10, m0.C(obj, T(o02)), t(length));
                                break;
                            } else {
                                break;
                            }
                        case RequestError.EVENT_TIMEOUT /* 10 */:
                            if (z(obj, length)) {
                                p0Var.N(S10, (AbstractC2877h) m0.C(obj, T(o02)));
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            if (z(obj, length)) {
                                p0Var.b(S10, y(obj, T(o02)));
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            if (z(obj, length)) {
                                p0Var.D(S10, y(obj, T(o02)));
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            if (z(obj, length)) {
                                p0Var.p(S10, y(obj, T(o02)));
                                break;
                            } else {
                                break;
                            }
                        case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                            if (z(obj, length)) {
                                p0Var.u(S10, J(obj, T(o02)));
                                break;
                            } else {
                                break;
                            }
                        case HVError.SSL_CONNECT_ERROR /* 15 */:
                            if (z(obj, length)) {
                                p0Var.H(S10, y(obj, T(o02)));
                                break;
                            } else {
                                break;
                            }
                        case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                            if (z(obj, length)) {
                                p0Var.z(S10, J(obj, T(o02)));
                                break;
                            } else {
                                break;
                            }
                        case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                            if (z(obj, length)) {
                                p0Var.M(S10, m0.C(obj, T(o02)), t(length));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            e0.O(S(length), (List) m0.C(obj, T(o02)), p0Var, false);
                            break;
                        case 19:
                            e0.S(S(length), (List) m0.C(obj, T(o02)), p0Var, false);
                            break;
                        case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                            e0.V(S(length), (List) m0.C(obj, T(o02)), p0Var, false);
                            break;
                        case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                            e0.d0(S(length), (List) m0.C(obj, T(o02)), p0Var, false);
                            break;
                        case HVError.FACE_DETECTION_ERROR /* 22 */:
                            e0.U(S(length), (List) m0.C(obj, T(o02)), p0Var, false);
                            break;
                        case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                            e0.R(S(length), (List) m0.C(obj, T(o02)), p0Var, false);
                            break;
                        case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                            e0.Q(S(length), (List) m0.C(obj, T(o02)), p0Var, false);
                            break;
                        case HVError.LOW_STORAGE_ERROR /* 25 */:
                            e0.M(S(length), (List) m0.C(obj, T(o02)), p0Var, false);
                            break;
                        case 26:
                            e0.b0(S(length), (List) m0.C(obj, T(o02)), p0Var);
                            break;
                        case 27:
                            e0.W(S(length), (List) m0.C(obj, T(o02)), p0Var, t(length));
                            break;
                        case 28:
                            e0.N(S(length), (List) m0.C(obj, T(o02)), p0Var);
                            break;
                        case 29:
                            e0.c0(S(length), (List) m0.C(obj, T(o02)), p0Var, false);
                            break;
                        case 30:
                            e0.P(S(length), (List) m0.C(obj, T(o02)), p0Var, false);
                            break;
                        case HVError.INSTRUCTION_ERROR /* 31 */:
                            e0.X(S(length), (List) m0.C(obj, T(o02)), p0Var, false);
                            break;
                        case 32:
                            e0.Y(S(length), (List) m0.C(obj, T(o02)), p0Var, false);
                            break;
                        case HVError.GPS_ACCESS_DENIED /* 33 */:
                            e0.Z(S(length), (List) m0.C(obj, T(o02)), p0Var, false);
                            break;
                        case 34:
                            e0.a0(S(length), (List) m0.C(obj, T(o02)), p0Var, false);
                            break;
                        case HVError.FACE_CAPTURE_TIMEOUT /* 35 */:
                            e0.O(S(length), (List) m0.C(obj, T(o02)), p0Var, true);
                            break;
                        case HVError.HYPER_DOC_DETECT_ERROR /* 36 */:
                            e0.S(S(length), (List) m0.C(obj, T(o02)), p0Var, true);
                            break;
                        case HVError.INVALID_FILE_ERROR /* 37 */:
                            e0.V(S(length), (List) m0.C(obj, T(o02)), p0Var, true);
                            break;
                        case 38:
                            e0.d0(S(length), (List) m0.C(obj, T(o02)), p0Var, true);
                            break;
                        case 39:
                            e0.U(S(length), (List) m0.C(obj, T(o02)), p0Var, true);
                            break;
                        case RequestError.NETWORK_FAILURE /* 40 */:
                            e0.R(S(length), (List) m0.C(obj, T(o02)), p0Var, true);
                            break;
                        case RequestError.NO_DEV_KEY /* 41 */:
                            e0.Q(S(length), (List) m0.C(obj, T(o02)), p0Var, true);
                            break;
                        case HVError.CONSENT_DENIED /* 42 */:
                            e0.M(S(length), (List) m0.C(obj, T(o02)), p0Var, true);
                            break;
                        case HVError.ENCRYPTION_ERROR /* 43 */:
                            e0.c0(S(length), (List) m0.C(obj, T(o02)), p0Var, true);
                            break;
                        case HVError.SDK_CLOSE_ERROR /* 44 */:
                            e0.P(S(length), (List) m0.C(obj, T(o02)), p0Var, true);
                            break;
                        case HVError.PERMISSION_REVOKED_ERROR /* 45 */:
                            e0.X(S(length), (List) m0.C(obj, T(o02)), p0Var, true);
                            break;
                        case 46:
                            e0.Y(S(length), (List) m0.C(obj, T(o02)), p0Var, true);
                            break;
                        case 47:
                            e0.Z(S(length), (List) m0.C(obj, T(o02)), p0Var, true);
                            break;
                        case 48:
                            e0.a0(S(length), (List) m0.C(obj, T(o02)), p0Var, true);
                            break;
                        case 49:
                            e0.T(S(length), (List) m0.C(obj, T(o02)), p0Var, t(length));
                            break;
                        case 50:
                            s0(p0Var, S10, m0.C(obj, T(o02)), length);
                            break;
                        case 51:
                            if (G(obj, S10, length)) {
                                p0Var.e(S10, V(obj, T(o02)));
                                break;
                            } else {
                                break;
                            }
                        case 52:
                            if (G(obj, S10, length)) {
                                p0Var.A(S10, W(obj, T(o02)));
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            if (G(obj, S10, length)) {
                                p0Var.n(S10, Y(obj, T(o02)));
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            if (G(obj, S10, length)) {
                                p0Var.l(S10, Y(obj, T(o02)));
                                break;
                            } else {
                                break;
                            }
                        case 55:
                            if (G(obj, S10, length)) {
                                p0Var.r(S10, X(obj, T(o02)));
                                break;
                            } else {
                                break;
                            }
                        case 56:
                            if (G(obj, S10, length)) {
                                p0Var.h(S10, Y(obj, T(o02)));
                                break;
                            } else {
                                break;
                            }
                        case 57:
                            if (G(obj, S10, length)) {
                                p0Var.d(S10, X(obj, T(o02)));
                                break;
                            } else {
                                break;
                            }
                        case 58:
                            if (G(obj, S10, length)) {
                                p0Var.o(S10, U(obj, T(o02)));
                                break;
                            } else {
                                break;
                            }
                        case 59:
                            if (G(obj, S10, length)) {
                                t0(S10, m0.C(obj, T(o02)), p0Var);
                                break;
                            } else {
                                break;
                            }
                        case HVError.DETECTOR_NOT_AVAILABLE_ERROR /* 60 */:
                            if (G(obj, S10, length)) {
                                p0Var.L(S10, m0.C(obj, T(o02)), t(length));
                                break;
                            } else {
                                break;
                            }
                        case 61:
                            if (G(obj, S10, length)) {
                                p0Var.N(S10, (AbstractC2877h) m0.C(obj, T(o02)));
                                break;
                            } else {
                                break;
                            }
                        case 62:
                            if (G(obj, S10, length)) {
                                p0Var.b(S10, X(obj, T(o02)));
                                break;
                            } else {
                                break;
                            }
                        case 63:
                            if (G(obj, S10, length)) {
                                p0Var.D(S10, X(obj, T(o02)));
                                break;
                            } else {
                                break;
                            }
                        case 64:
                            if (G(obj, S10, length)) {
                                p0Var.p(S10, X(obj, T(o02)));
                                break;
                            } else {
                                break;
                            }
                        case 65:
                            if (G(obj, S10, length)) {
                                p0Var.u(S10, Y(obj, T(o02)));
                                break;
                            } else {
                                break;
                            }
                        case 66:
                            if (G(obj, S10, length)) {
                                p0Var.H(S10, X(obj, T(o02)));
                                break;
                            } else {
                                break;
                            }
                        case 67:
                            if (G(obj, S10, length)) {
                                p0Var.z(S10, Y(obj, T(o02)));
                                break;
                            } else {
                                break;
                            }
                        case 68:
                            if (G(obj, S10, length)) {
                                p0Var.M(S10, m0.C(obj, T(o02)), t(length));
                                break;
                            } else {
                                break;
                            }
                    }
                }
                while (entry != null) {
                    this.f28697p.f(p0Var, entry);
                    entry = it.hasNext() ? (Map.Entry) it.next() : null;
                }
            }
        }
        it = null;
        entry = null;
        while (length >= 0) {
        }
        while (entry != null) {
        }
    }

    private Object s(int i10) {
        return this.f28683b[(i10 / 3) * 2];
    }

    private void s0(p0 p0Var, int i10, Object obj, int i11) {
        if (obj != null) {
            this.f28698q.c(s(i11));
            p0Var.O(i10, null, this.f28698q.h(obj));
        }
    }

    private c0 t(int i10) {
        int i11 = (i10 / 3) * 2;
        c0 c0Var = (c0) this.f28683b[i11];
        if (c0Var != null) {
            return c0Var;
        }
        c0 c10 = Z.a().c((Class) this.f28683b[i11 + 1]);
        this.f28683b[i11] = c10;
        return c10;
    }

    private void t0(int i10, Object obj, p0 p0Var) {
        if (obj instanceof String) {
            p0Var.k(i10, (String) obj);
        } else {
            p0Var.N(i10, (AbstractC2877h) obj);
        }
    }

    static j0 u(Object obj) {
        AbstractC2891w abstractC2891w = (AbstractC2891w) obj;
        j0 j0Var = abstractC2891w.unknownFields;
        if (j0Var != j0.c()) {
            return j0Var;
        }
        j0 k10 = j0.k();
        abstractC2891w.unknownFields = k10;
        return k10;
    }

    private void u0(i0 i0Var, Object obj, p0 p0Var) {
        i0Var.k(i0Var.c(obj), p0Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int v(Object obj) {
        int i10;
        int i11;
        int h10;
        int d10;
        int B10;
        boolean z10;
        int f10;
        int i12;
        int L10;
        int N10;
        Unsafe unsafe = f28681s;
        int i13 = 1048575;
        int i14 = 1048575;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (i15 < this.f28682a.length) {
            int o02 = o0(i15);
            int S10 = S(i15);
            int n02 = n0(o02);
            if (n02 <= 17) {
                i10 = this.f28682a[i15 + 2];
                int i18 = i10 & i13;
                i11 = 1 << (i10 >>> 20);
                if (i18 != i14) {
                    i17 = unsafe.getInt(obj, i18);
                    i14 = i18;
                }
            } else {
                i10 = (!this.f28690i || n02 < EnumC2888t.DOUBLE_LIST_PACKED.id() || n02 > EnumC2888t.SINT64_LIST_PACKED.id()) ? 0 : this.f28682a[i15 + 2] & i13;
                i11 = 0;
            }
            long T10 = T(o02);
            switch (n02) {
                case 0:
                    if ((i17 & i11) == 0) {
                        break;
                    } else {
                        h10 = AbstractC2879j.h(S10, 0.0d);
                        i16 += h10;
                        break;
                    }
                case 1:
                    if ((i17 & i11) == 0) {
                        break;
                    } else {
                        h10 = AbstractC2879j.p(S10, 0.0f);
                        i16 += h10;
                        break;
                    }
                case 2:
                    if ((i17 & i11) == 0) {
                        break;
                    } else {
                        h10 = AbstractC2879j.v(S10, unsafe.getLong(obj, T10));
                        i16 += h10;
                        break;
                    }
                case 3:
                    if ((i17 & i11) == 0) {
                        break;
                    } else {
                        h10 = AbstractC2879j.O(S10, unsafe.getLong(obj, T10));
                        i16 += h10;
                        break;
                    }
                case 4:
                    if ((i17 & i11) == 0) {
                        break;
                    } else {
                        h10 = AbstractC2879j.t(S10, unsafe.getInt(obj, T10));
                        i16 += h10;
                        break;
                    }
                case 5:
                    if ((i17 & i11) == 0) {
                        break;
                    } else {
                        h10 = AbstractC2879j.n(S10, 0L);
                        i16 += h10;
                        break;
                    }
                case 6:
                    if ((i17 & i11) != 0) {
                        h10 = AbstractC2879j.l(S10, 0);
                        i16 += h10;
                        break;
                    }
                    break;
                case 7:
                    if ((i17 & i11) != 0) {
                        d10 = AbstractC2879j.d(S10, true);
                        i16 += d10;
                    }
                    break;
                case 8:
                    if ((i17 & i11) != 0) {
                        Object object = unsafe.getObject(obj, T10);
                        d10 = object instanceof AbstractC2877h ? AbstractC2879j.f(S10, (AbstractC2877h) object) : AbstractC2879j.J(S10, (String) object);
                        i16 += d10;
                    }
                    break;
                case 9:
                    if ((i17 & i11) != 0) {
                        d10 = e0.o(S10, unsafe.getObject(obj, T10), t(i15));
                        i16 += d10;
                    }
                    break;
                case RequestError.EVENT_TIMEOUT /* 10 */:
                    if ((i17 & i11) != 0) {
                        d10 = AbstractC2879j.f(S10, (AbstractC2877h) unsafe.getObject(obj, T10));
                        i16 += d10;
                    }
                    break;
                case 11:
                    if ((i17 & i11) != 0) {
                        d10 = AbstractC2879j.M(S10, unsafe.getInt(obj, T10));
                        i16 += d10;
                    }
                    break;
                case 12:
                    if ((i17 & i11) != 0) {
                        d10 = AbstractC2879j.j(S10, unsafe.getInt(obj, T10));
                        i16 += d10;
                    }
                    break;
                case 13:
                    if ((i17 & i11) != 0) {
                        B10 = AbstractC2879j.B(S10, 0);
                        i16 += B10;
                    }
                    break;
                case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                    if ((i17 & i11) != 0) {
                        d10 = AbstractC2879j.D(S10, 0L);
                        i16 += d10;
                    }
                    break;
                case HVError.SSL_CONNECT_ERROR /* 15 */:
                    if ((i17 & i11) != 0) {
                        d10 = AbstractC2879j.F(S10, unsafe.getInt(obj, T10));
                        i16 += d10;
                    }
                    break;
                case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                    if ((i17 & i11) != 0) {
                        d10 = AbstractC2879j.H(S10, unsafe.getLong(obj, T10));
                        i16 += d10;
                    }
                    break;
                case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                    if ((i17 & i11) != 0) {
                        d10 = AbstractC2879j.r(S10, (N) unsafe.getObject(obj, T10), t(i15));
                        i16 += d10;
                    }
                    break;
                case 18:
                    d10 = e0.h(S10, (List) unsafe.getObject(obj, T10), false);
                    i16 += d10;
                    break;
                case 19:
                    z10 = false;
                    f10 = e0.f(S10, (List) unsafe.getObject(obj, T10), false);
                    i16 += f10;
                    break;
                case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                    z10 = false;
                    f10 = e0.m(S10, (List) unsafe.getObject(obj, T10), false);
                    i16 += f10;
                    break;
                case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                    z10 = false;
                    f10 = e0.x(S10, (List) unsafe.getObject(obj, T10), false);
                    i16 += f10;
                    break;
                case HVError.FACE_DETECTION_ERROR /* 22 */:
                    z10 = false;
                    f10 = e0.k(S10, (List) unsafe.getObject(obj, T10), false);
                    i16 += f10;
                    break;
                case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                    z10 = false;
                    f10 = e0.h(S10, (List) unsafe.getObject(obj, T10), false);
                    i16 += f10;
                    break;
                case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                    z10 = false;
                    f10 = e0.f(S10, (List) unsafe.getObject(obj, T10), false);
                    i16 += f10;
                    break;
                case HVError.LOW_STORAGE_ERROR /* 25 */:
                    z10 = false;
                    f10 = e0.a(S10, (List) unsafe.getObject(obj, T10), false);
                    i16 += f10;
                    break;
                case 26:
                    d10 = e0.u(S10, (List) unsafe.getObject(obj, T10));
                    i16 += d10;
                    break;
                case 27:
                    d10 = e0.p(S10, (List) unsafe.getObject(obj, T10), t(i15));
                    i16 += d10;
                    break;
                case 28:
                    d10 = e0.c(S10, (List) unsafe.getObject(obj, T10));
                    i16 += d10;
                    break;
                case 29:
                    d10 = e0.v(S10, (List) unsafe.getObject(obj, T10), false);
                    i16 += d10;
                    break;
                case 30:
                    z10 = false;
                    f10 = e0.d(S10, (List) unsafe.getObject(obj, T10), false);
                    i16 += f10;
                    break;
                case HVError.INSTRUCTION_ERROR /* 31 */:
                    z10 = false;
                    f10 = e0.f(S10, (List) unsafe.getObject(obj, T10), false);
                    i16 += f10;
                    break;
                case 32:
                    z10 = false;
                    f10 = e0.h(S10, (List) unsafe.getObject(obj, T10), false);
                    i16 += f10;
                    break;
                case HVError.GPS_ACCESS_DENIED /* 33 */:
                    z10 = false;
                    f10 = e0.q(S10, (List) unsafe.getObject(obj, T10), false);
                    i16 += f10;
                    break;
                case 34:
                    z10 = false;
                    f10 = e0.s(S10, (List) unsafe.getObject(obj, T10), false);
                    i16 += f10;
                    break;
                case HVError.FACE_CAPTURE_TIMEOUT /* 35 */:
                    i12 = e0.i((List) unsafe.getObject(obj, T10));
                    if (i12 > 0) {
                        if (this.f28690i) {
                            unsafe.putInt(obj, i10, i12);
                        }
                        L10 = AbstractC2879j.L(S10);
                        N10 = AbstractC2879j.N(i12);
                        B10 = L10 + N10 + i12;
                        i16 += B10;
                    }
                    break;
                case HVError.HYPER_DOC_DETECT_ERROR /* 36 */:
                    i12 = e0.g((List) unsafe.getObject(obj, T10));
                    if (i12 > 0) {
                        if (this.f28690i) {
                            unsafe.putInt(obj, i10, i12);
                        }
                        L10 = AbstractC2879j.L(S10);
                        N10 = AbstractC2879j.N(i12);
                        B10 = L10 + N10 + i12;
                        i16 += B10;
                    }
                    break;
                case HVError.INVALID_FILE_ERROR /* 37 */:
                    i12 = e0.n((List) unsafe.getObject(obj, T10));
                    if (i12 > 0) {
                        if (this.f28690i) {
                            unsafe.putInt(obj, i10, i12);
                        }
                        L10 = AbstractC2879j.L(S10);
                        N10 = AbstractC2879j.N(i12);
                        B10 = L10 + N10 + i12;
                        i16 += B10;
                    }
                    break;
                case 38:
                    i12 = e0.y((List) unsafe.getObject(obj, T10));
                    if (i12 > 0) {
                        if (this.f28690i) {
                            unsafe.putInt(obj, i10, i12);
                        }
                        L10 = AbstractC2879j.L(S10);
                        N10 = AbstractC2879j.N(i12);
                        B10 = L10 + N10 + i12;
                        i16 += B10;
                    }
                    break;
                case 39:
                    i12 = e0.l((List) unsafe.getObject(obj, T10));
                    if (i12 > 0) {
                        if (this.f28690i) {
                            unsafe.putInt(obj, i10, i12);
                        }
                        L10 = AbstractC2879j.L(S10);
                        N10 = AbstractC2879j.N(i12);
                        B10 = L10 + N10 + i12;
                        i16 += B10;
                    }
                    break;
                case RequestError.NETWORK_FAILURE /* 40 */:
                    i12 = e0.i((List) unsafe.getObject(obj, T10));
                    if (i12 > 0) {
                        if (this.f28690i) {
                            unsafe.putInt(obj, i10, i12);
                        }
                        L10 = AbstractC2879j.L(S10);
                        N10 = AbstractC2879j.N(i12);
                        B10 = L10 + N10 + i12;
                        i16 += B10;
                    }
                    break;
                case RequestError.NO_DEV_KEY /* 41 */:
                    i12 = e0.g((List) unsafe.getObject(obj, T10));
                    if (i12 > 0) {
                        if (this.f28690i) {
                            unsafe.putInt(obj, i10, i12);
                        }
                        L10 = AbstractC2879j.L(S10);
                        N10 = AbstractC2879j.N(i12);
                        B10 = L10 + N10 + i12;
                        i16 += B10;
                    }
                    break;
                case HVError.CONSENT_DENIED /* 42 */:
                    i12 = e0.b((List) unsafe.getObject(obj, T10));
                    if (i12 > 0) {
                        if (this.f28690i) {
                            unsafe.putInt(obj, i10, i12);
                        }
                        L10 = AbstractC2879j.L(S10);
                        N10 = AbstractC2879j.N(i12);
                        B10 = L10 + N10 + i12;
                        i16 += B10;
                    }
                    break;
                case HVError.ENCRYPTION_ERROR /* 43 */:
                    i12 = e0.w((List) unsafe.getObject(obj, T10));
                    if (i12 > 0) {
                        if (this.f28690i) {
                            unsafe.putInt(obj, i10, i12);
                        }
                        L10 = AbstractC2879j.L(S10);
                        N10 = AbstractC2879j.N(i12);
                        B10 = L10 + N10 + i12;
                        i16 += B10;
                    }
                    break;
                case HVError.SDK_CLOSE_ERROR /* 44 */:
                    i12 = e0.e((List) unsafe.getObject(obj, T10));
                    if (i12 > 0) {
                        if (this.f28690i) {
                            unsafe.putInt(obj, i10, i12);
                        }
                        L10 = AbstractC2879j.L(S10);
                        N10 = AbstractC2879j.N(i12);
                        B10 = L10 + N10 + i12;
                        i16 += B10;
                    }
                    break;
                case HVError.PERMISSION_REVOKED_ERROR /* 45 */:
                    i12 = e0.g((List) unsafe.getObject(obj, T10));
                    if (i12 > 0) {
                        if (this.f28690i) {
                            unsafe.putInt(obj, i10, i12);
                        }
                        L10 = AbstractC2879j.L(S10);
                        N10 = AbstractC2879j.N(i12);
                        B10 = L10 + N10 + i12;
                        i16 += B10;
                    }
                    break;
                case 46:
                    i12 = e0.i((List) unsafe.getObject(obj, T10));
                    if (i12 > 0) {
                        if (this.f28690i) {
                            unsafe.putInt(obj, i10, i12);
                        }
                        L10 = AbstractC2879j.L(S10);
                        N10 = AbstractC2879j.N(i12);
                        B10 = L10 + N10 + i12;
                        i16 += B10;
                    }
                    break;
                case 47:
                    i12 = e0.r((List) unsafe.getObject(obj, T10));
                    if (i12 > 0) {
                        if (this.f28690i) {
                            unsafe.putInt(obj, i10, i12);
                        }
                        L10 = AbstractC2879j.L(S10);
                        N10 = AbstractC2879j.N(i12);
                        B10 = L10 + N10 + i12;
                        i16 += B10;
                    }
                    break;
                case 48:
                    i12 = e0.t((List) unsafe.getObject(obj, T10));
                    if (i12 > 0) {
                        if (this.f28690i) {
                            unsafe.putInt(obj, i10, i12);
                        }
                        L10 = AbstractC2879j.L(S10);
                        N10 = AbstractC2879j.N(i12);
                        B10 = L10 + N10 + i12;
                        i16 += B10;
                    }
                    break;
                case 49:
                    d10 = e0.j(S10, (List) unsafe.getObject(obj, T10), t(i15));
                    i16 += d10;
                    break;
                case 50:
                    d10 = this.f28698q.f(S10, unsafe.getObject(obj, T10), s(i15));
                    i16 += d10;
                    break;
                case 51:
                    if (G(obj, S10, i15)) {
                        d10 = AbstractC2879j.h(S10, 0.0d);
                        i16 += d10;
                    }
                    break;
                case 52:
                    if (G(obj, S10, i15)) {
                        d10 = AbstractC2879j.p(S10, 0.0f);
                        i16 += d10;
                    }
                    break;
                case 53:
                    if (G(obj, S10, i15)) {
                        d10 = AbstractC2879j.v(S10, Y(obj, T10));
                        i16 += d10;
                    }
                    break;
                case 54:
                    if (G(obj, S10, i15)) {
                        d10 = AbstractC2879j.O(S10, Y(obj, T10));
                        i16 += d10;
                    }
                    break;
                case 55:
                    if (G(obj, S10, i15)) {
                        d10 = AbstractC2879j.t(S10, X(obj, T10));
                        i16 += d10;
                    }
                    break;
                case 56:
                    if (G(obj, S10, i15)) {
                        d10 = AbstractC2879j.n(S10, 0L);
                        i16 += d10;
                    }
                    break;
                case 57:
                    if (G(obj, S10, i15)) {
                        B10 = AbstractC2879j.l(S10, 0);
                        i16 += B10;
                    }
                    break;
                case 58:
                    if (G(obj, S10, i15)) {
                        d10 = AbstractC2879j.d(S10, true);
                        i16 += d10;
                    }
                    break;
                case 59:
                    if (G(obj, S10, i15)) {
                        Object object2 = unsafe.getObject(obj, T10);
                        d10 = object2 instanceof AbstractC2877h ? AbstractC2879j.f(S10, (AbstractC2877h) object2) : AbstractC2879j.J(S10, (String) object2);
                        i16 += d10;
                    }
                    break;
                case HVError.DETECTOR_NOT_AVAILABLE_ERROR /* 60 */:
                    if (G(obj, S10, i15)) {
                        d10 = e0.o(S10, unsafe.getObject(obj, T10), t(i15));
                        i16 += d10;
                    }
                    break;
                case 61:
                    if (G(obj, S10, i15)) {
                        d10 = AbstractC2879j.f(S10, (AbstractC2877h) unsafe.getObject(obj, T10));
                        i16 += d10;
                    }
                    break;
                case 62:
                    if (G(obj, S10, i15)) {
                        d10 = AbstractC2879j.M(S10, X(obj, T10));
                        i16 += d10;
                    }
                    break;
                case 63:
                    if (G(obj, S10, i15)) {
                        d10 = AbstractC2879j.j(S10, X(obj, T10));
                        i16 += d10;
                    }
                    break;
                case 64:
                    if (G(obj, S10, i15)) {
                        B10 = AbstractC2879j.B(S10, 0);
                        i16 += B10;
                    }
                    break;
                case 65:
                    if (G(obj, S10, i15)) {
                        d10 = AbstractC2879j.D(S10, 0L);
                        i16 += d10;
                    }
                    break;
                case 66:
                    if (G(obj, S10, i15)) {
                        d10 = AbstractC2879j.F(S10, X(obj, T10));
                        i16 += d10;
                    }
                    break;
                case 67:
                    if (G(obj, S10, i15)) {
                        d10 = AbstractC2879j.H(S10, Y(obj, T10));
                        i16 += d10;
                    }
                    break;
                case 68:
                    if (G(obj, S10, i15)) {
                        d10 = AbstractC2879j.r(S10, (N) unsafe.getObject(obj, T10), t(i15));
                        i16 += d10;
                    }
                    break;
            }
            i15 += 3;
            i13 = 1048575;
        }
        int x10 = i16 + x(this.f28696o, obj);
        return this.f28687f ? x10 + this.f28697p.b(obj).c() : x10;
    }

    private int w(Object obj) {
        int h10;
        int i10;
        int L10;
        int N10;
        Unsafe unsafe = f28681s;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f28682a.length; i12 += 3) {
            int o02 = o0(i12);
            int n02 = n0(o02);
            int S10 = S(i12);
            long T10 = T(o02);
            int i13 = (n02 < EnumC2888t.DOUBLE_LIST_PACKED.id() || n02 > EnumC2888t.SINT64_LIST_PACKED.id()) ? 0 : this.f28682a[i12 + 2] & 1048575;
            switch (n02) {
                case 0:
                    if (z(obj, i12)) {
                        h10 = AbstractC2879j.h(S10, 0.0d);
                        i11 += h10;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (z(obj, i12)) {
                        h10 = AbstractC2879j.p(S10, 0.0f);
                        i11 += h10;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (z(obj, i12)) {
                        h10 = AbstractC2879j.v(S10, m0.A(obj, T10));
                        i11 += h10;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (z(obj, i12)) {
                        h10 = AbstractC2879j.O(S10, m0.A(obj, T10));
                        i11 += h10;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (z(obj, i12)) {
                        h10 = AbstractC2879j.t(S10, m0.z(obj, T10));
                        i11 += h10;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (z(obj, i12)) {
                        h10 = AbstractC2879j.n(S10, 0L);
                        i11 += h10;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (z(obj, i12)) {
                        h10 = AbstractC2879j.l(S10, 0);
                        i11 += h10;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (z(obj, i12)) {
                        h10 = AbstractC2879j.d(S10, true);
                        i11 += h10;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (z(obj, i12)) {
                        Object C10 = m0.C(obj, T10);
                        h10 = C10 instanceof AbstractC2877h ? AbstractC2879j.f(S10, (AbstractC2877h) C10) : AbstractC2879j.J(S10, (String) C10);
                        i11 += h10;
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (z(obj, i12)) {
                        h10 = e0.o(S10, m0.C(obj, T10), t(i12));
                        i11 += h10;
                        break;
                    } else {
                        break;
                    }
                case RequestError.EVENT_TIMEOUT /* 10 */:
                    if (z(obj, i12)) {
                        h10 = AbstractC2879j.f(S10, (AbstractC2877h) m0.C(obj, T10));
                        i11 += h10;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (z(obj, i12)) {
                        h10 = AbstractC2879j.M(S10, m0.z(obj, T10));
                        i11 += h10;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (z(obj, i12)) {
                        h10 = AbstractC2879j.j(S10, m0.z(obj, T10));
                        i11 += h10;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (z(obj, i12)) {
                        h10 = AbstractC2879j.B(S10, 0);
                        i11 += h10;
                        break;
                    } else {
                        break;
                    }
                case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                    if (z(obj, i12)) {
                        h10 = AbstractC2879j.D(S10, 0L);
                        i11 += h10;
                        break;
                    } else {
                        break;
                    }
                case HVError.SSL_CONNECT_ERROR /* 15 */:
                    if (z(obj, i12)) {
                        h10 = AbstractC2879j.F(S10, m0.z(obj, T10));
                        i11 += h10;
                        break;
                    } else {
                        break;
                    }
                case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                    if (z(obj, i12)) {
                        h10 = AbstractC2879j.H(S10, m0.A(obj, T10));
                        i11 += h10;
                        break;
                    } else {
                        break;
                    }
                case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                    if (z(obj, i12)) {
                        h10 = AbstractC2879j.r(S10, (N) m0.C(obj, T10), t(i12));
                        i11 += h10;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    h10 = e0.h(S10, I(obj, T10), false);
                    i11 += h10;
                    break;
                case 19:
                    h10 = e0.f(S10, I(obj, T10), false);
                    i11 += h10;
                    break;
                case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                    h10 = e0.m(S10, I(obj, T10), false);
                    i11 += h10;
                    break;
                case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                    h10 = e0.x(S10, I(obj, T10), false);
                    i11 += h10;
                    break;
                case HVError.FACE_DETECTION_ERROR /* 22 */:
                    h10 = e0.k(S10, I(obj, T10), false);
                    i11 += h10;
                    break;
                case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                    h10 = e0.h(S10, I(obj, T10), false);
                    i11 += h10;
                    break;
                case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                    h10 = e0.f(S10, I(obj, T10), false);
                    i11 += h10;
                    break;
                case HVError.LOW_STORAGE_ERROR /* 25 */:
                    h10 = e0.a(S10, I(obj, T10), false);
                    i11 += h10;
                    break;
                case 26:
                    h10 = e0.u(S10, I(obj, T10));
                    i11 += h10;
                    break;
                case 27:
                    h10 = e0.p(S10, I(obj, T10), t(i12));
                    i11 += h10;
                    break;
                case 28:
                    h10 = e0.c(S10, I(obj, T10));
                    i11 += h10;
                    break;
                case 29:
                    h10 = e0.v(S10, I(obj, T10), false);
                    i11 += h10;
                    break;
                case 30:
                    h10 = e0.d(S10, I(obj, T10), false);
                    i11 += h10;
                    break;
                case HVError.INSTRUCTION_ERROR /* 31 */:
                    h10 = e0.f(S10, I(obj, T10), false);
                    i11 += h10;
                    break;
                case 32:
                    h10 = e0.h(S10, I(obj, T10), false);
                    i11 += h10;
                    break;
                case HVError.GPS_ACCESS_DENIED /* 33 */:
                    h10 = e0.q(S10, I(obj, T10), false);
                    i11 += h10;
                    break;
                case 34:
                    h10 = e0.s(S10, I(obj, T10), false);
                    i11 += h10;
                    break;
                case HVError.FACE_CAPTURE_TIMEOUT /* 35 */:
                    i10 = e0.i((List) unsafe.getObject(obj, T10));
                    if (i10 <= 0) {
                        break;
                    } else {
                        if (this.f28690i) {
                            unsafe.putInt(obj, i13, i10);
                        }
                        L10 = AbstractC2879j.L(S10);
                        N10 = AbstractC2879j.N(i10);
                        h10 = L10 + N10 + i10;
                        i11 += h10;
                        break;
                    }
                case HVError.HYPER_DOC_DETECT_ERROR /* 36 */:
                    i10 = e0.g((List) unsafe.getObject(obj, T10));
                    if (i10 <= 0) {
                        break;
                    } else {
                        if (this.f28690i) {
                            unsafe.putInt(obj, i13, i10);
                        }
                        L10 = AbstractC2879j.L(S10);
                        N10 = AbstractC2879j.N(i10);
                        h10 = L10 + N10 + i10;
                        i11 += h10;
                        break;
                    }
                case HVError.INVALID_FILE_ERROR /* 37 */:
                    i10 = e0.n((List) unsafe.getObject(obj, T10));
                    if (i10 <= 0) {
                        break;
                    } else {
                        if (this.f28690i) {
                            unsafe.putInt(obj, i13, i10);
                        }
                        L10 = AbstractC2879j.L(S10);
                        N10 = AbstractC2879j.N(i10);
                        h10 = L10 + N10 + i10;
                        i11 += h10;
                        break;
                    }
                case 38:
                    i10 = e0.y((List) unsafe.getObject(obj, T10));
                    if (i10 <= 0) {
                        break;
                    } else {
                        if (this.f28690i) {
                            unsafe.putInt(obj, i13, i10);
                        }
                        L10 = AbstractC2879j.L(S10);
                        N10 = AbstractC2879j.N(i10);
                        h10 = L10 + N10 + i10;
                        i11 += h10;
                        break;
                    }
                case 39:
                    i10 = e0.l((List) unsafe.getObject(obj, T10));
                    if (i10 <= 0) {
                        break;
                    } else {
                        if (this.f28690i) {
                            unsafe.putInt(obj, i13, i10);
                        }
                        L10 = AbstractC2879j.L(S10);
                        N10 = AbstractC2879j.N(i10);
                        h10 = L10 + N10 + i10;
                        i11 += h10;
                        break;
                    }
                case RequestError.NETWORK_FAILURE /* 40 */:
                    i10 = e0.i((List) unsafe.getObject(obj, T10));
                    if (i10 <= 0) {
                        break;
                    } else {
                        if (this.f28690i) {
                            unsafe.putInt(obj, i13, i10);
                        }
                        L10 = AbstractC2879j.L(S10);
                        N10 = AbstractC2879j.N(i10);
                        h10 = L10 + N10 + i10;
                        i11 += h10;
                        break;
                    }
                case RequestError.NO_DEV_KEY /* 41 */:
                    i10 = e0.g((List) unsafe.getObject(obj, T10));
                    if (i10 <= 0) {
                        break;
                    } else {
                        if (this.f28690i) {
                            unsafe.putInt(obj, i13, i10);
                        }
                        L10 = AbstractC2879j.L(S10);
                        N10 = AbstractC2879j.N(i10);
                        h10 = L10 + N10 + i10;
                        i11 += h10;
                        break;
                    }
                case HVError.CONSENT_DENIED /* 42 */:
                    i10 = e0.b((List) unsafe.getObject(obj, T10));
                    if (i10 <= 0) {
                        break;
                    } else {
                        if (this.f28690i) {
                            unsafe.putInt(obj, i13, i10);
                        }
                        L10 = AbstractC2879j.L(S10);
                        N10 = AbstractC2879j.N(i10);
                        h10 = L10 + N10 + i10;
                        i11 += h10;
                        break;
                    }
                case HVError.ENCRYPTION_ERROR /* 43 */:
                    i10 = e0.w((List) unsafe.getObject(obj, T10));
                    if (i10 <= 0) {
                        break;
                    } else {
                        if (this.f28690i) {
                            unsafe.putInt(obj, i13, i10);
                        }
                        L10 = AbstractC2879j.L(S10);
                        N10 = AbstractC2879j.N(i10);
                        h10 = L10 + N10 + i10;
                        i11 += h10;
                        break;
                    }
                case HVError.SDK_CLOSE_ERROR /* 44 */:
                    i10 = e0.e((List) unsafe.getObject(obj, T10));
                    if (i10 <= 0) {
                        break;
                    } else {
                        if (this.f28690i) {
                            unsafe.putInt(obj, i13, i10);
                        }
                        L10 = AbstractC2879j.L(S10);
                        N10 = AbstractC2879j.N(i10);
                        h10 = L10 + N10 + i10;
                        i11 += h10;
                        break;
                    }
                case HVError.PERMISSION_REVOKED_ERROR /* 45 */:
                    i10 = e0.g((List) unsafe.getObject(obj, T10));
                    if (i10 <= 0) {
                        break;
                    } else {
                        if (this.f28690i) {
                            unsafe.putInt(obj, i13, i10);
                        }
                        L10 = AbstractC2879j.L(S10);
                        N10 = AbstractC2879j.N(i10);
                        h10 = L10 + N10 + i10;
                        i11 += h10;
                        break;
                    }
                case 46:
                    i10 = e0.i((List) unsafe.getObject(obj, T10));
                    if (i10 <= 0) {
                        break;
                    } else {
                        if (this.f28690i) {
                            unsafe.putInt(obj, i13, i10);
                        }
                        L10 = AbstractC2879j.L(S10);
                        N10 = AbstractC2879j.N(i10);
                        h10 = L10 + N10 + i10;
                        i11 += h10;
                        break;
                    }
                case 47:
                    i10 = e0.r((List) unsafe.getObject(obj, T10));
                    if (i10 <= 0) {
                        break;
                    } else {
                        if (this.f28690i) {
                            unsafe.putInt(obj, i13, i10);
                        }
                        L10 = AbstractC2879j.L(S10);
                        N10 = AbstractC2879j.N(i10);
                        h10 = L10 + N10 + i10;
                        i11 += h10;
                        break;
                    }
                case 48:
                    i10 = e0.t((List) unsafe.getObject(obj, T10));
                    if (i10 <= 0) {
                        break;
                    } else {
                        if (this.f28690i) {
                            unsafe.putInt(obj, i13, i10);
                        }
                        L10 = AbstractC2879j.L(S10);
                        N10 = AbstractC2879j.N(i10);
                        h10 = L10 + N10 + i10;
                        i11 += h10;
                        break;
                    }
                case 49:
                    h10 = e0.j(S10, I(obj, T10), t(i12));
                    i11 += h10;
                    break;
                case 50:
                    h10 = this.f28698q.f(S10, m0.C(obj, T10), s(i12));
                    i11 += h10;
                    break;
                case 51:
                    if (G(obj, S10, i12)) {
                        h10 = AbstractC2879j.h(S10, 0.0d);
                        i11 += h10;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (G(obj, S10, i12)) {
                        h10 = AbstractC2879j.p(S10, 0.0f);
                        i11 += h10;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (G(obj, S10, i12)) {
                        h10 = AbstractC2879j.v(S10, Y(obj, T10));
                        i11 += h10;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (G(obj, S10, i12)) {
                        h10 = AbstractC2879j.O(S10, Y(obj, T10));
                        i11 += h10;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (G(obj, S10, i12)) {
                        h10 = AbstractC2879j.t(S10, X(obj, T10));
                        i11 += h10;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (G(obj, S10, i12)) {
                        h10 = AbstractC2879j.n(S10, 0L);
                        i11 += h10;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (G(obj, S10, i12)) {
                        h10 = AbstractC2879j.l(S10, 0);
                        i11 += h10;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (G(obj, S10, i12)) {
                        h10 = AbstractC2879j.d(S10, true);
                        i11 += h10;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (G(obj, S10, i12)) {
                        Object C11 = m0.C(obj, T10);
                        h10 = C11 instanceof AbstractC2877h ? AbstractC2879j.f(S10, (AbstractC2877h) C11) : AbstractC2879j.J(S10, (String) C11);
                        i11 += h10;
                        break;
                    } else {
                        break;
                    }
                case HVError.DETECTOR_NOT_AVAILABLE_ERROR /* 60 */:
                    if (G(obj, S10, i12)) {
                        h10 = e0.o(S10, m0.C(obj, T10), t(i12));
                        i11 += h10;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (G(obj, S10, i12)) {
                        h10 = AbstractC2879j.f(S10, (AbstractC2877h) m0.C(obj, T10));
                        i11 += h10;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (G(obj, S10, i12)) {
                        h10 = AbstractC2879j.M(S10, X(obj, T10));
                        i11 += h10;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (G(obj, S10, i12)) {
                        h10 = AbstractC2879j.j(S10, X(obj, T10));
                        i11 += h10;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (G(obj, S10, i12)) {
                        h10 = AbstractC2879j.B(S10, 0);
                        i11 += h10;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (G(obj, S10, i12)) {
                        h10 = AbstractC2879j.D(S10, 0L);
                        i11 += h10;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (G(obj, S10, i12)) {
                        h10 = AbstractC2879j.F(S10, X(obj, T10));
                        i11 += h10;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (G(obj, S10, i12)) {
                        h10 = AbstractC2879j.H(S10, Y(obj, T10));
                        i11 += h10;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (G(obj, S10, i12)) {
                        h10 = AbstractC2879j.r(S10, (N) m0.C(obj, T10), t(i12));
                        i11 += h10;
                        break;
                    } else {
                        break;
                    }
            }
        }
        return i11 + x(this.f28696o, obj);
    }

    private int x(i0 i0Var, Object obj) {
        return i0Var.d(i0Var.c(obj));
    }

    private static int y(Object obj, long j10) {
        return m0.z(obj, j10);
    }

    private boolean z(Object obj, int i10) {
        int g02 = g0(i10);
        long j10 = 1048575 & g02;
        if (j10 != 1048575) {
            return (m0.z(obj, j10) & (1 << (g02 >>> 20))) != 0;
        }
        int o02 = o0(i10);
        long T10 = T(o02);
        switch (n0(o02)) {
            case 0:
                return Double.doubleToRawLongBits(m0.x(obj, T10)) != 0;
            case 1:
                return Float.floatToRawIntBits(m0.y(obj, T10)) != 0;
            case 2:
                return m0.A(obj, T10) != 0;
            case 3:
                return m0.A(obj, T10) != 0;
            case 4:
                return m0.z(obj, T10) != 0;
            case 5:
                return m0.A(obj, T10) != 0;
            case 6:
                return m0.z(obj, T10) != 0;
            case 7:
                return m0.r(obj, T10);
            case 8:
                Object C10 = m0.C(obj, T10);
                if (C10 instanceof String) {
                    return !((String) C10).isEmpty();
                }
                if (C10 instanceof AbstractC2877h) {
                    return !AbstractC2877h.f28729b.equals(C10);
                }
                throw new IllegalArgumentException();
            case 9:
                return m0.C(obj, T10) != null;
            case RequestError.EVENT_TIMEOUT /* 10 */:
                return !AbstractC2877h.f28729b.equals(m0.C(obj, T10));
            case 11:
                return m0.z(obj, T10) != 0;
            case 12:
                return m0.z(obj, T10) != 0;
            case 13:
                return m0.z(obj, T10) != 0;
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                return m0.A(obj, T10) != 0;
            case HVError.SSL_CONNECT_ERROR /* 15 */:
                return m0.z(obj, T10) != 0;
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                return m0.A(obj, T10) != 0;
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                return m0.C(obj, T10) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    @Override // com.google.protobuf.c0
    public void a(Object obj, Object obj2) {
        l(obj);
        obj2.getClass();
        for (int i10 = 0; i10 < this.f28682a.length; i10 += 3) {
            M(obj, obj2, i10);
        }
        e0.F(this.f28696o, obj, obj2);
        if (this.f28687f) {
            e0.D(this.f28697p, obj, obj2);
        }
    }

    @Override // com.google.protobuf.c0
    public Object b() {
        return this.f28694m.a(this.f28686e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:183:0x02d5, code lost:
    
        if (r0 != r11) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x02d7, code lost:
    
        r15 = r27;
        r14 = r28;
        r12 = r29;
        r13 = r31;
        r11 = r32;
        r9 = r33;
        r5 = r17;
        r3 = r19;
        r6 = r20;
        r2 = r21;
        r1 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x02f1, code lost:
    
        r2 = r0;
        r8 = r19;
        r0 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x031c, code lost:
    
        if (r0 != r15) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x033e, code lost:
    
        if (r0 != r15) goto L101;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x0090. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    int b0(Object obj, byte[] bArr, int i10, int i11, int i12, AbstractC2874e.a aVar) {
        int i13;
        Unsafe unsafe;
        int i14;
        Q q10;
        int i15;
        int i16;
        Object obj2;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        byte[] bArr2;
        int K10;
        Q q11 = this;
        Object obj3 = obj;
        byte[] bArr3 = bArr;
        int i27 = i11;
        int i28 = i12;
        AbstractC2874e.a aVar2 = aVar;
        l(obj);
        Unsafe unsafe2 = f28681s;
        int i29 = i10;
        int i30 = 0;
        int i31 = 0;
        int i32 = 0;
        int i33 = -1;
        int i34 = 1048575;
        while (true) {
            if (i29 < i27) {
                int i35 = i29 + 1;
                byte b10 = bArr3[i29];
                if (b10 < 0) {
                    int G10 = AbstractC2874e.G(b10, bArr3, i35, aVar2);
                    i17 = aVar2.f28720a;
                    i35 = G10;
                } else {
                    i17 = b10;
                }
                int i36 = i17 >>> 3;
                int i37 = i17 & 7;
                int f02 = i36 > i33 ? q11.f0(i36, i30 / 3) : q11.e0(i36);
                if (f02 == -1) {
                    i18 = i36;
                    i19 = i35;
                    i16 = i17;
                    i20 = i32;
                    i13 = i34;
                    unsafe = unsafe2;
                    i21 = i28;
                    i22 = 0;
                } else {
                    int i38 = q11.f28682a[f02 + 1];
                    int n02 = n0(i38);
                    long T10 = T(i38);
                    int i39 = i17;
                    if (n02 <= 17) {
                        int i40 = q11.f28682a[f02 + 2];
                        int i41 = 1 << (i40 >>> 20);
                        int i42 = i40 & 1048575;
                        if (i42 != i34) {
                            if (i34 != 1048575) {
                                unsafe2.putInt(obj3, i34, i32);
                            }
                            i25 = i42;
                            i24 = unsafe2.getInt(obj3, i42);
                        } else {
                            i24 = i32;
                            i25 = i34;
                        }
                        switch (n02) {
                            case 0:
                                bArr2 = bArr;
                                i18 = i36;
                                i26 = f02;
                                if (i37 == 1) {
                                    m0.N(obj3, T10, AbstractC2874e.d(bArr2, i35));
                                    i29 = i35 + 8;
                                    i32 = i24 | i41;
                                    i28 = i12;
                                    i30 = i26;
                                    i34 = i25;
                                    i31 = i39;
                                    i33 = i18;
                                    bArr3 = bArr2;
                                    break;
                                } else {
                                    i21 = i12;
                                    i19 = i35;
                                    i22 = i26;
                                    unsafe = unsafe2;
                                    i20 = i24;
                                    i13 = i25;
                                    i16 = i39;
                                    break;
                                }
                            case 1:
                                bArr2 = bArr;
                                i18 = i36;
                                i26 = f02;
                                if (i37 == 5) {
                                    m0.O(obj3, T10, AbstractC2874e.k(bArr2, i35));
                                    i29 = i35 + 4;
                                    i32 = i24 | i41;
                                    i28 = i12;
                                    i30 = i26;
                                    i34 = i25;
                                    i31 = i39;
                                    i33 = i18;
                                    bArr3 = bArr2;
                                    break;
                                } else {
                                    i21 = i12;
                                    i19 = i35;
                                    i22 = i26;
                                    unsafe = unsafe2;
                                    i20 = i24;
                                    i13 = i25;
                                    i16 = i39;
                                    break;
                                }
                            case 2:
                            case 3:
                                bArr2 = bArr;
                                i18 = i36;
                                i26 = f02;
                                if (i37 == 0) {
                                    K10 = AbstractC2874e.K(bArr2, i35, aVar2);
                                    unsafe2.putLong(obj, T10, aVar2.f28721b);
                                    i32 = i24 | i41;
                                    i28 = i12;
                                    i30 = i26;
                                    i29 = K10;
                                    i34 = i25;
                                    i31 = i39;
                                    i33 = i18;
                                    bArr3 = bArr2;
                                    break;
                                } else {
                                    i21 = i12;
                                    i19 = i35;
                                    i22 = i26;
                                    unsafe = unsafe2;
                                    i20 = i24;
                                    i13 = i25;
                                    i16 = i39;
                                    break;
                                }
                            case 4:
                            case 11:
                                bArr2 = bArr;
                                i18 = i36;
                                i26 = f02;
                                if (i37 == 0) {
                                    i29 = AbstractC2874e.H(bArr2, i35, aVar2);
                                    unsafe2.putInt(obj3, T10, aVar2.f28720a);
                                    i32 = i24 | i41;
                                    i28 = i12;
                                    i30 = i26;
                                    i34 = i25;
                                    i31 = i39;
                                    i33 = i18;
                                    bArr3 = bArr2;
                                    break;
                                } else {
                                    i21 = i12;
                                    i19 = i35;
                                    i22 = i26;
                                    unsafe = unsafe2;
                                    i20 = i24;
                                    i13 = i25;
                                    i16 = i39;
                                    break;
                                }
                            case 5:
                            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                                bArr2 = bArr;
                                i18 = i36;
                                i26 = f02;
                                if (i37 == 1) {
                                    unsafe2.putLong(obj, T10, AbstractC2874e.i(bArr2, i35));
                                    i29 = i35 + 8;
                                    i32 = i24 | i41;
                                    i28 = i12;
                                    i30 = i26;
                                    i34 = i25;
                                    i31 = i39;
                                    i33 = i18;
                                    bArr3 = bArr2;
                                    break;
                                } else {
                                    i21 = i12;
                                    i19 = i35;
                                    i22 = i26;
                                    unsafe = unsafe2;
                                    i20 = i24;
                                    i13 = i25;
                                    i16 = i39;
                                    break;
                                }
                            case 6:
                            case 13:
                                bArr2 = bArr;
                                i18 = i36;
                                i26 = f02;
                                if (i37 == 5) {
                                    unsafe2.putInt(obj3, T10, AbstractC2874e.g(bArr2, i35));
                                    i29 = i35 + 4;
                                    i32 = i24 | i41;
                                    i28 = i12;
                                    i30 = i26;
                                    i34 = i25;
                                    i31 = i39;
                                    i33 = i18;
                                    bArr3 = bArr2;
                                    break;
                                } else {
                                    i21 = i12;
                                    i19 = i35;
                                    i22 = i26;
                                    unsafe = unsafe2;
                                    i20 = i24;
                                    i13 = i25;
                                    i16 = i39;
                                    break;
                                }
                            case 7:
                                bArr2 = bArr;
                                i18 = i36;
                                i26 = f02;
                                if (i37 == 0) {
                                    i29 = AbstractC2874e.K(bArr2, i35, aVar2);
                                    m0.H(obj3, T10, aVar2.f28721b != 0);
                                    i32 = i24 | i41;
                                    i28 = i12;
                                    i30 = i26;
                                    i34 = i25;
                                    i31 = i39;
                                    i33 = i18;
                                    bArr3 = bArr2;
                                    break;
                                } else {
                                    i21 = i12;
                                    i19 = i35;
                                    i22 = i26;
                                    unsafe = unsafe2;
                                    i20 = i24;
                                    i13 = i25;
                                    i16 = i39;
                                    break;
                                }
                            case 8:
                                bArr2 = bArr;
                                i18 = i36;
                                i26 = f02;
                                if (i37 == 2) {
                                    i29 = (536870912 & i38) == 0 ? AbstractC2874e.B(bArr2, i35, aVar2) : AbstractC2874e.E(bArr2, i35, aVar2);
                                    unsafe2.putObject(obj3, T10, aVar2.f28722c);
                                    i32 = i24 | i41;
                                    i28 = i12;
                                    i30 = i26;
                                    i34 = i25;
                                    i31 = i39;
                                    i33 = i18;
                                    bArr3 = bArr2;
                                    break;
                                } else {
                                    i21 = i12;
                                    i19 = i35;
                                    i22 = i26;
                                    unsafe = unsafe2;
                                    i20 = i24;
                                    i13 = i25;
                                    i16 = i39;
                                    break;
                                }
                            case 9:
                                bArr2 = bArr;
                                i18 = i36;
                                i26 = f02;
                                if (i37 == 2) {
                                    Object N10 = q11.N(obj3, i26);
                                    i29 = AbstractC2874e.N(N10, q11.t(i26), bArr, i35, i11, aVar);
                                    q11.l0(obj3, i26, N10);
                                    i32 = i24 | i41;
                                    i28 = i12;
                                    i30 = i26;
                                    i34 = i25;
                                    i31 = i39;
                                    i33 = i18;
                                    bArr3 = bArr2;
                                    break;
                                } else {
                                    i21 = i12;
                                    i19 = i35;
                                    i22 = i26;
                                    unsafe = unsafe2;
                                    i20 = i24;
                                    i13 = i25;
                                    i16 = i39;
                                    break;
                                }
                            case RequestError.EVENT_TIMEOUT /* 10 */:
                                bArr2 = bArr;
                                i18 = i36;
                                i26 = f02;
                                if (i37 == 2) {
                                    i29 = AbstractC2874e.b(bArr2, i35, aVar2);
                                    unsafe2.putObject(obj3, T10, aVar2.f28722c);
                                    i32 = i24 | i41;
                                    i28 = i12;
                                    i30 = i26;
                                    i34 = i25;
                                    i31 = i39;
                                    i33 = i18;
                                    bArr3 = bArr2;
                                    break;
                                } else {
                                    i21 = i12;
                                    i19 = i35;
                                    i22 = i26;
                                    unsafe = unsafe2;
                                    i20 = i24;
                                    i13 = i25;
                                    i16 = i39;
                                    break;
                                }
                            case 12:
                                bArr2 = bArr;
                                i18 = i36;
                                i26 = f02;
                                if (i37 == 0) {
                                    i29 = AbstractC2874e.H(bArr2, i35, aVar2);
                                    int i43 = aVar2.f28720a;
                                    q11.r(i26);
                                    unsafe2.putInt(obj3, T10, i43);
                                    i32 = i24 | i41;
                                    i28 = i12;
                                    i30 = i26;
                                    i34 = i25;
                                    i31 = i39;
                                    i33 = i18;
                                    bArr3 = bArr2;
                                    break;
                                } else {
                                    i21 = i12;
                                    i19 = i35;
                                    i22 = i26;
                                    unsafe = unsafe2;
                                    i20 = i24;
                                    i13 = i25;
                                    i16 = i39;
                                    break;
                                }
                            case HVError.SSL_CONNECT_ERROR /* 15 */:
                                bArr2 = bArr;
                                i18 = i36;
                                i26 = f02;
                                if (i37 == 0) {
                                    i29 = AbstractC2874e.H(bArr2, i35, aVar2);
                                    unsafe2.putInt(obj3, T10, AbstractC2878i.a(aVar2.f28720a));
                                    i32 = i24 | i41;
                                    i28 = i12;
                                    i30 = i26;
                                    i34 = i25;
                                    i31 = i39;
                                    i33 = i18;
                                    bArr3 = bArr2;
                                    break;
                                } else {
                                    i21 = i12;
                                    i19 = i35;
                                    i22 = i26;
                                    unsafe = unsafe2;
                                    i20 = i24;
                                    i13 = i25;
                                    i16 = i39;
                                    break;
                                }
                            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                                i18 = i36;
                                i26 = f02;
                                bArr2 = bArr;
                                if (i37 == 0) {
                                    K10 = AbstractC2874e.K(bArr2, i35, aVar2);
                                    unsafe2.putLong(obj, T10, AbstractC2878i.b(aVar2.f28721b));
                                    i32 = i24 | i41;
                                    i28 = i12;
                                    i30 = i26;
                                    i29 = K10;
                                    i34 = i25;
                                    i31 = i39;
                                    i33 = i18;
                                    bArr3 = bArr2;
                                    break;
                                } else {
                                    i21 = i12;
                                    i19 = i35;
                                    i22 = i26;
                                    unsafe = unsafe2;
                                    i20 = i24;
                                    i13 = i25;
                                    i16 = i39;
                                    break;
                                }
                            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                                if (i37 == 3) {
                                    Object N11 = q11.N(obj3, f02);
                                    i18 = i36;
                                    i29 = AbstractC2874e.M(N11, q11.t(f02), bArr, i35, i11, (i36 << 3) | 4, aVar);
                                    q11.l0(obj3, f02, N11);
                                    i32 = i24 | i41;
                                    i28 = i12;
                                    i30 = f02;
                                    i34 = i25;
                                    i31 = i39;
                                    i33 = i18;
                                    bArr3 = bArr;
                                    break;
                                } else {
                                    i18 = i36;
                                    i26 = f02;
                                    i21 = i12;
                                    i19 = i35;
                                    i22 = i26;
                                    unsafe = unsafe2;
                                    i20 = i24;
                                    i13 = i25;
                                    i16 = i39;
                                    break;
                                }
                            default:
                                i18 = i36;
                                i26 = f02;
                                i21 = i12;
                                i19 = i35;
                                i22 = i26;
                                unsafe = unsafe2;
                                i20 = i24;
                                i13 = i25;
                                i16 = i39;
                                break;
                        }
                    } else {
                        i18 = i36;
                        i20 = i32;
                        int i44 = i34;
                        if (n02 != 27) {
                            i13 = i44;
                            if (n02 <= 49) {
                                int i45 = i35;
                                unsafe = unsafe2;
                                i22 = f02;
                                i29 = d0(obj, bArr, i35, i11, i39, i18, i37, f02, i38, n02, T10, aVar);
                            } else {
                                i23 = i35;
                                unsafe = unsafe2;
                                i22 = f02;
                                if (n02 != 50) {
                                    i29 = a0(obj, bArr, i23, i11, i39, i18, i37, i38, n02, T10, i22, aVar);
                                } else if (i37 == 2) {
                                    i29 = Z(obj, bArr, i23, i11, i22, T10, aVar);
                                }
                            }
                        } else if (i37 == 2) {
                            AbstractC2893y.b bVar = (AbstractC2893y.b) unsafe2.getObject(obj3, T10);
                            if (!bVar.N()) {
                                int size = bVar.size();
                                bVar = bVar.y(size == 0 ? 10 : size * 2);
                                unsafe2.putObject(obj3, T10, bVar);
                            }
                            i29 = AbstractC2874e.p(q11.t(f02), i39, bArr, i35, i11, bVar, aVar);
                            i28 = i12;
                            i30 = f02;
                            i32 = i20;
                            i31 = i39;
                            i34 = i44;
                            i33 = i18;
                            bArr3 = bArr;
                        } else {
                            i13 = i44;
                            i23 = i35;
                            unsafe = unsafe2;
                            i22 = f02;
                        }
                        i21 = i12;
                        i19 = i23;
                        i16 = i39;
                    }
                }
                if (i16 != i21 || i21 == 0) {
                    int i46 = i21;
                    i29 = (!this.f28687f || aVar.f28723d == C2884o.b()) ? AbstractC2874e.F(i16, bArr, i19, i11, u(obj), aVar) : AbstractC2874e.f(i16, bArr, i19, i11, obj, this.f28686e, this.f28696o, aVar);
                    obj3 = obj;
                    bArr3 = bArr;
                    i27 = i11;
                    i31 = i16;
                    q11 = this;
                    aVar2 = aVar;
                    i32 = i20;
                    i34 = i13;
                    i30 = i22;
                    i33 = i18;
                    i28 = i46;
                    unsafe2 = unsafe;
                } else {
                    q10 = this;
                    i14 = i21;
                    i15 = i19;
                    i32 = i20;
                }
            } else {
                i13 = i34;
                unsafe = unsafe2;
                i14 = i28;
                q10 = q11;
                i15 = i29;
                i16 = i31;
            }
        }
        int i47 = i13;
        if (i47 != 1048575) {
            obj2 = obj;
            unsafe.putInt(obj2, i47, i32);
        } else {
            obj2 = obj;
        }
        j0 j0Var = null;
        for (int i48 = q10.f28692k; i48 < q10.f28693l; i48++) {
            j0Var = (j0) p(obj, q10.f28691j[i48], j0Var, q10.f28696o, obj);
        }
        if (j0Var != null) {
            q10.f28696o.h(obj2, j0Var);
        }
        if (i14 == 0) {
            if (i15 != i11) {
                throw C2894z.f();
            }
        } else if (i15 > i11 || i16 != i14) {
            throw C2894z.f();
        }
        return i15;
    }

    @Override // com.google.protobuf.c0
    public boolean c(Object obj, Object obj2) {
        int length = this.f28682a.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            if (!o(obj, obj2, i10)) {
                return false;
            }
        }
        if (!this.f28696o.c(obj).equals(this.f28696o.c(obj2))) {
            return false;
        }
        if (this.f28687f) {
            return this.f28697p.b(obj).equals(this.f28697p.b(obj2));
        }
        return true;
    }

    @Override // com.google.protobuf.c0
    public int d(Object obj) {
        int i10;
        int f10;
        int length = this.f28682a.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int o02 = o0(i12);
            int S10 = S(i12);
            long T10 = T(o02);
            int i13 = 37;
            switch (n0(o02)) {
                case 0:
                    i10 = i11 * 53;
                    f10 = AbstractC2893y.f(Double.doubleToLongBits(m0.x(obj, T10)));
                    i11 = i10 + f10;
                    break;
                case 1:
                    i10 = i11 * 53;
                    f10 = Float.floatToIntBits(m0.y(obj, T10));
                    i11 = i10 + f10;
                    break;
                case 2:
                    i10 = i11 * 53;
                    f10 = AbstractC2893y.f(m0.A(obj, T10));
                    i11 = i10 + f10;
                    break;
                case 3:
                    i10 = i11 * 53;
                    f10 = AbstractC2893y.f(m0.A(obj, T10));
                    i11 = i10 + f10;
                    break;
                case 4:
                    i10 = i11 * 53;
                    f10 = m0.z(obj, T10);
                    i11 = i10 + f10;
                    break;
                case 5:
                    i10 = i11 * 53;
                    f10 = AbstractC2893y.f(m0.A(obj, T10));
                    i11 = i10 + f10;
                    break;
                case 6:
                    i10 = i11 * 53;
                    f10 = m0.z(obj, T10);
                    i11 = i10 + f10;
                    break;
                case 7:
                    i10 = i11 * 53;
                    f10 = AbstractC2893y.c(m0.r(obj, T10));
                    i11 = i10 + f10;
                    break;
                case 8:
                    i10 = i11 * 53;
                    f10 = ((String) m0.C(obj, T10)).hashCode();
                    i11 = i10 + f10;
                    break;
                case 9:
                    Object C10 = m0.C(obj, T10);
                    if (C10 != null) {
                        i13 = C10.hashCode();
                    }
                    i11 = (i11 * 53) + i13;
                    break;
                case RequestError.EVENT_TIMEOUT /* 10 */:
                    i10 = i11 * 53;
                    f10 = m0.C(obj, T10).hashCode();
                    i11 = i10 + f10;
                    break;
                case 11:
                    i10 = i11 * 53;
                    f10 = m0.z(obj, T10);
                    i11 = i10 + f10;
                    break;
                case 12:
                    i10 = i11 * 53;
                    f10 = m0.z(obj, T10);
                    i11 = i10 + f10;
                    break;
                case 13:
                    i10 = i11 * 53;
                    f10 = m0.z(obj, T10);
                    i11 = i10 + f10;
                    break;
                case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                    i10 = i11 * 53;
                    f10 = AbstractC2893y.f(m0.A(obj, T10));
                    i11 = i10 + f10;
                    break;
                case HVError.SSL_CONNECT_ERROR /* 15 */:
                    i10 = i11 * 53;
                    f10 = m0.z(obj, T10);
                    i11 = i10 + f10;
                    break;
                case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                    i10 = i11 * 53;
                    f10 = AbstractC2893y.f(m0.A(obj, T10));
                    i11 = i10 + f10;
                    break;
                case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                    Object C11 = m0.C(obj, T10);
                    if (C11 != null) {
                        i13 = C11.hashCode();
                    }
                    i11 = (i11 * 53) + i13;
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
                    f10 = m0.C(obj, T10).hashCode();
                    i11 = i10 + f10;
                    break;
                case 50:
                    i10 = i11 * 53;
                    f10 = m0.C(obj, T10).hashCode();
                    i11 = i10 + f10;
                    break;
                case 51:
                    if (G(obj, S10, i12)) {
                        i10 = i11 * 53;
                        f10 = AbstractC2893y.f(Double.doubleToLongBits(V(obj, T10)));
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (G(obj, S10, i12)) {
                        i10 = i11 * 53;
                        f10 = Float.floatToIntBits(W(obj, T10));
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (G(obj, S10, i12)) {
                        i10 = i11 * 53;
                        f10 = AbstractC2893y.f(Y(obj, T10));
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (G(obj, S10, i12)) {
                        i10 = i11 * 53;
                        f10 = AbstractC2893y.f(Y(obj, T10));
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (G(obj, S10, i12)) {
                        i10 = i11 * 53;
                        f10 = X(obj, T10);
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (G(obj, S10, i12)) {
                        i10 = i11 * 53;
                        f10 = AbstractC2893y.f(Y(obj, T10));
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (G(obj, S10, i12)) {
                        i10 = i11 * 53;
                        f10 = X(obj, T10);
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (G(obj, S10, i12)) {
                        i10 = i11 * 53;
                        f10 = AbstractC2893y.c(U(obj, T10));
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (G(obj, S10, i12)) {
                        i10 = i11 * 53;
                        f10 = ((String) m0.C(obj, T10)).hashCode();
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case HVError.DETECTOR_NOT_AVAILABLE_ERROR /* 60 */:
                    if (G(obj, S10, i12)) {
                        i10 = i11 * 53;
                        f10 = m0.C(obj, T10).hashCode();
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (G(obj, S10, i12)) {
                        i10 = i11 * 53;
                        f10 = m0.C(obj, T10).hashCode();
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (G(obj, S10, i12)) {
                        i10 = i11 * 53;
                        f10 = X(obj, T10);
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (G(obj, S10, i12)) {
                        i10 = i11 * 53;
                        f10 = X(obj, T10);
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (G(obj, S10, i12)) {
                        i10 = i11 * 53;
                        f10 = X(obj, T10);
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (G(obj, S10, i12)) {
                        i10 = i11 * 53;
                        f10 = AbstractC2893y.f(Y(obj, T10));
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (G(obj, S10, i12)) {
                        i10 = i11 * 53;
                        f10 = X(obj, T10);
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (G(obj, S10, i12)) {
                        i10 = i11 * 53;
                        f10 = AbstractC2893y.f(Y(obj, T10));
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (G(obj, S10, i12)) {
                        i10 = i11 * 53;
                        f10 = m0.C(obj, T10).hashCode();
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i11 * 53) + this.f28696o.c(obj).hashCode();
        return this.f28687f ? (hashCode * 53) + this.f28697p.b(obj).hashCode() : hashCode;
    }

    @Override // com.google.protobuf.c0
    public void e(Object obj) {
        if (E(obj)) {
            if (obj instanceof AbstractC2891w) {
                AbstractC2891w abstractC2891w = (AbstractC2891w) obj;
                abstractC2891w.clearMemoizedSerializedSize();
                abstractC2891w.clearMemoizedHashCode();
                abstractC2891w.markImmutable();
            }
            int length = this.f28682a.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int o02 = o0(i10);
                long T10 = T(o02);
                int n02 = n0(o02);
                if (n02 != 9) {
                    switch (n02) {
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
                            this.f28695n.c(obj, T10);
                            break;
                        case 50:
                            Unsafe unsafe = f28681s;
                            Object object = unsafe.getObject(obj, T10);
                            if (object != null) {
                                unsafe.putObject(obj, T10, this.f28698q.b(object));
                                break;
                            } else {
                                break;
                            }
                    }
                }
                if (z(obj, i10)) {
                    t(i10).e(f28681s.getObject(obj, T10));
                }
            }
            this.f28696o.f(obj);
            if (this.f28687f) {
                this.f28697p.e(obj);
            }
        }
    }

    @Override // com.google.protobuf.c0
    public final boolean f(Object obj) {
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.f28692k) {
            int i15 = this.f28691j[i14];
            int S10 = S(i15);
            int o02 = o0(i15);
            int i16 = this.f28682a[i15 + 2];
            int i17 = i16 & 1048575;
            int i18 = 1 << (i16 >>> 20);
            if (i17 != i12) {
                if (i17 != 1048575) {
                    i13 = f28681s.getInt(obj, i17);
                }
                i11 = i13;
                i10 = i17;
            } else {
                i10 = i12;
                i11 = i13;
            }
            if (H(o02) && !A(obj, i15, i10, i11, i18)) {
                return false;
            }
            int n02 = n0(o02);
            if (n02 != 9 && n02 != 17) {
                if (n02 != 27) {
                    if (n02 == 60 || n02 == 68) {
                        if (G(obj, S10, i15) && !B(obj, o02, t(i15))) {
                            return false;
                        }
                    } else if (n02 != 49) {
                        if (n02 == 50 && !D(obj, o02, i15)) {
                            return false;
                        }
                    }
                }
                if (!C(obj, o02, i15)) {
                    return false;
                }
            } else if (A(obj, i15, i10, i11, i18) && !B(obj, o02, t(i15))) {
                return false;
            }
            i14++;
            i12 = i10;
            i13 = i11;
        }
        return !this.f28687f || this.f28697p.b(obj).e();
    }

    @Override // com.google.protobuf.c0
    public int g(Object obj) {
        return this.f28689h ? w(obj) : v(obj);
    }

    @Override // com.google.protobuf.c0
    public void h(Object obj, p0 p0Var) {
        if (p0Var.i() == p0.a.DESCENDING) {
            r0(obj, p0Var);
        } else if (this.f28689h) {
            q0(obj, p0Var);
        } else {
            p0(obj, p0Var);
        }
    }

    @Override // com.google.protobuf.c0
    public void i(Object obj, byte[] bArr, int i10, int i11, AbstractC2874e.a aVar) {
        if (this.f28689h) {
            c0(obj, bArr, i10, i11, aVar);
        } else {
            b0(obj, bArr, i10, i11, 0, aVar);
        }
    }
}
