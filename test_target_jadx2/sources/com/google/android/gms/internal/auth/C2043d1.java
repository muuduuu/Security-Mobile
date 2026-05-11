package com.google.android.gms.internal.auth;

import co.hyperverge.hypersnapsdk.activities.HVRetakeActivity;
import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.auth.d1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2043d1 implements InterfaceC2067l1 {

    /* renamed from: n, reason: collision with root package name */
    private static final int[] f23686n = new int[0];

    /* renamed from: o, reason: collision with root package name */
    private static final Unsafe f23687o = B1.g();

    /* renamed from: a, reason: collision with root package name */
    private final int[] f23688a;

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f23689b;

    /* renamed from: c, reason: collision with root package name */
    private final int f23690c;

    /* renamed from: d, reason: collision with root package name */
    private final int f23691d;

    /* renamed from: e, reason: collision with root package name */
    private final Z0 f23692e;

    /* renamed from: f, reason: collision with root package name */
    private final int[] f23693f;

    /* renamed from: g, reason: collision with root package name */
    private final int f23694g;

    /* renamed from: h, reason: collision with root package name */
    private final int f23695h;

    /* renamed from: i, reason: collision with root package name */
    private final P0 f23696i;

    /* renamed from: j, reason: collision with root package name */
    private final AbstractC2082q1 f23697j;

    /* renamed from: k, reason: collision with root package name */
    private final AbstractC2098w0 f23698k;

    /* renamed from: l, reason: collision with root package name */
    private final C2049f1 f23699l;

    /* renamed from: m, reason: collision with root package name */
    private final U0 f23700m;

    private C2043d1(int[] iArr, Object[] objArr, int i10, int i11, Z0 z02, int i12, boolean z10, int[] iArr2, int i13, int i14, C2049f1 c2049f1, P0 p02, AbstractC2082q1 abstractC2082q1, AbstractC2098w0 abstractC2098w0, U0 u02) {
        this.f23688a = iArr;
        this.f23689b = objArr;
        this.f23690c = i10;
        this.f23691d = i11;
        this.f23693f = iArr2;
        this.f23694g = i13;
        this.f23695h = i14;
        this.f23699l = c2049f1;
        this.f23696i = p02;
        this.f23697j = abstractC2082q1;
        this.f23698k = abstractC2098w0;
        this.f23692e = z02;
        this.f23700m = u02;
    }

    private final InterfaceC2067l1 A(int i10) {
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        InterfaceC2067l1 interfaceC2067l1 = (InterfaceC2067l1) this.f23689b[i12];
        if (interfaceC2067l1 != null) {
            return interfaceC2067l1;
        }
        InterfaceC2067l1 b10 = C2058i1.a().b((Class) this.f23689b[i12 + 1]);
        this.f23689b[i12] = b10;
        return b10;
    }

    private final Object B(int i10) {
        int i11 = i10 / 3;
        return this.f23689b[i11 + i11];
    }

    private final Object C(Object obj, int i10) {
        InterfaceC2067l1 A10 = A(i10);
        int x10 = x(i10) & 1048575;
        if (!l(obj, i10)) {
            return A10.f();
        }
        Object object = f23687o.getObject(obj, x10);
        if (o(object)) {
            return object;
        }
        Object f10 = A10.f();
        if (object != null) {
            A10.h(f10, object);
        }
        return f10;
    }

    private final Object D(Object obj, int i10, int i11) {
        InterfaceC2067l1 A10 = A(i11);
        if (!p(obj, i10, i11)) {
            return A10.f();
        }
        Object object = f23687o.getObject(obj, x(i11) & 1048575);
        if (o(object)) {
            return object;
        }
        Object f10 = A10.f();
        if (object != null) {
            A10.h(f10, object);
        }
        return f10;
    }

    private static Field E(Class cls, String str) {
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

    private static void F(Object obj) {
        if (!o(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void G(Object obj, Object obj2, int i10) {
        if (l(obj2, i10)) {
            int x10 = x(i10) & 1048575;
            Unsafe unsafe = f23687o;
            long j10 = x10;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f23688a[i10] + " is present but null: " + obj2.toString());
            }
            InterfaceC2067l1 A10 = A(i10);
            if (!l(obj, i10)) {
                if (o(object)) {
                    Object f10 = A10.f();
                    A10.h(f10, object);
                    unsafe.putObject(obj, j10, f10);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                I(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!o(object2)) {
                Object f11 = A10.f();
                A10.h(f11, object2);
                unsafe.putObject(obj, j10, f11);
                object2 = f11;
            }
            A10.h(object2, object);
        }
    }

    private final void H(Object obj, Object obj2, int i10) {
        int i11 = this.f23688a[i10];
        if (p(obj2, i11, i10)) {
            int x10 = x(i10) & 1048575;
            Unsafe unsafe = f23687o;
            long j10 = x10;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f23688a[i10] + " is present but null: " + obj2.toString());
            }
            InterfaceC2067l1 A10 = A(i10);
            if (!p(obj, i11, i10)) {
                if (o(object)) {
                    Object f10 = A10.f();
                    A10.h(f10, object);
                    unsafe.putObject(obj, j10, f10);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                a(obj, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!o(object2)) {
                Object f11 = A10.f();
                A10.h(f11, object2);
                unsafe.putObject(obj, j10, f11);
                object2 = f11;
            }
            A10.h(object2, object);
        }
    }

    private final void I(Object obj, int i10) {
        int u10 = u(i10);
        long j10 = 1048575 & u10;
        if (j10 == 1048575) {
            return;
        }
        B1.n(obj, j10, (1 << (u10 >>> 20)) | B1.c(obj, j10));
    }

    private final void a(Object obj, int i10, int i11) {
        B1.n(obj, u(i11) & 1048575, i10);
    }

    private final void d(Object obj, int i10, Object obj2) {
        f23687o.putObject(obj, x(i10) & 1048575, obj2);
        I(obj, i10);
    }

    private final void j(Object obj, int i10, int i11, Object obj2) {
        f23687o.putObject(obj, x(i11) & 1048575, obj2);
        a(obj, i10, i11);
    }

    private final boolean k(Object obj, Object obj2, int i10) {
        return l(obj, i10) == l(obj2, i10);
    }

    private final boolean l(Object obj, int i10) {
        int u10 = u(i10);
        long j10 = u10 & 1048575;
        if (j10 != 1048575) {
            return (B1.c(obj, j10) & (1 << (u10 >>> 20))) != 0;
        }
        int x10 = x(i10);
        long j11 = x10 & 1048575;
        switch (w(x10)) {
            case 0:
                return Double.doubleToRawLongBits(B1.a(obj, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(B1.b(obj, j11)) != 0;
            case 2:
                return B1.d(obj, j11) != 0;
            case 3:
                return B1.d(obj, j11) != 0;
            case 4:
                return B1.c(obj, j11) != 0;
            case 5:
                return B1.d(obj, j11) != 0;
            case 6:
                return B1.c(obj, j11) != 0;
            case 7:
                return B1.t(obj, j11);
            case 8:
                Object f10 = B1.f(obj, j11);
                if (f10 instanceof String) {
                    return !((String) f10).isEmpty();
                }
                if (f10 instanceof AbstractC2081q0) {
                    return !AbstractC2081q0.f23760b.equals(f10);
                }
                throw new IllegalArgumentException();
            case 9:
                return B1.f(obj, j11) != null;
            case RequestError.EVENT_TIMEOUT /* 10 */:
                return !AbstractC2081q0.f23760b.equals(B1.f(obj, j11));
            case 11:
                return B1.c(obj, j11) != 0;
            case 12:
                return B1.c(obj, j11) != 0;
            case 13:
                return B1.c(obj, j11) != 0;
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                return B1.d(obj, j11) != 0;
            case HVError.SSL_CONNECT_ERROR /* 15 */:
                return B1.c(obj, j11) != 0;
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                return B1.d(obj, j11) != 0;
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                return B1.f(obj, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean m(Object obj, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? l(obj, i10) : (i12 & i13) != 0;
    }

    private static boolean n(Object obj, int i10, InterfaceC2067l1 interfaceC2067l1) {
        return interfaceC2067l1.e(B1.f(obj, i10 & 1048575));
    }

    private static boolean o(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof C0) {
            return ((C0) obj).n();
        }
        return true;
    }

    private final boolean p(Object obj, int i10, int i11) {
        return B1.c(obj, (long) (u(i11) & 1048575)) == i10;
    }

    static C2087s1 r(Object obj) {
        C0 c02 = (C0) obj;
        C2087s1 c2087s1 = c02.zzc;
        if (c2087s1 != C2087s1.a()) {
            return c2087s1;
        }
        C2087s1 d10 = C2087s1.d();
        c02.zzc = d10;
        return d10;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0256  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static C2043d1 s(Class cls, W0 w02, C2049f1 c2049f1, P0 p02, AbstractC2082q1 abstractC2082q1, AbstractC2098w0 abstractC2098w0, U0 u02) {
        int i10;
        int charAt;
        int charAt2;
        int i11;
        int[] iArr;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        char charAt3;
        int i17;
        char charAt4;
        int i18;
        char charAt5;
        int i19;
        char charAt6;
        int i20;
        char charAt7;
        int i21;
        char charAt8;
        int i22;
        char charAt9;
        int i23;
        char charAt10;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        String str;
        int i30;
        int i31;
        int i32;
        int i33;
        Field E10;
        char charAt11;
        int i34;
        int i35;
        Object obj;
        Field E11;
        Object obj2;
        Field E12;
        int i36;
        char charAt12;
        int i37;
        char charAt13;
        int i38;
        char charAt14;
        int i39;
        char charAt15;
        if (!(w02 instanceof C2064k1)) {
            android.support.v4.media.session.b.a(w02);
            throw null;
        }
        C2064k1 c2064k1 = (C2064k1) w02;
        String b10 = c2064k1.b();
        int length = b10.length();
        char c10 = 55296;
        if (b10.charAt(0) >= 55296) {
            int i40 = 1;
            while (true) {
                i10 = i40 + 1;
                if (b10.charAt(i40) < 55296) {
                    break;
                }
                i40 = i10;
            }
        } else {
            i10 = 1;
        }
        int i41 = i10 + 1;
        int charAt16 = b10.charAt(i10);
        if (charAt16 >= 55296) {
            int i42 = charAt16 & 8191;
            int i43 = 13;
            while (true) {
                i39 = i41 + 1;
                charAt15 = b10.charAt(i41);
                if (charAt15 < 55296) {
                    break;
                }
                i42 |= (charAt15 & 8191) << i43;
                i43 += 13;
                i41 = i39;
            }
            charAt16 = i42 | (charAt15 << i43);
            i41 = i39;
        }
        if (charAt16 == 0) {
            charAt = 0;
            charAt2 = 0;
            i12 = 0;
            i15 = 0;
            i11 = 0;
            i13 = 0;
            iArr = f23686n;
            i14 = 0;
        } else {
            int i44 = i41 + 1;
            int charAt17 = b10.charAt(i41);
            if (charAt17 >= 55296) {
                int i45 = charAt17 & 8191;
                int i46 = 13;
                while (true) {
                    i23 = i44 + 1;
                    charAt10 = b10.charAt(i44);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i45 |= (charAt10 & 8191) << i46;
                    i46 += 13;
                    i44 = i23;
                }
                charAt17 = i45 | (charAt10 << i46);
                i44 = i23;
            }
            int i47 = i44 + 1;
            int charAt18 = b10.charAt(i44);
            if (charAt18 >= 55296) {
                int i48 = charAt18 & 8191;
                int i49 = 13;
                while (true) {
                    i22 = i47 + 1;
                    charAt9 = b10.charAt(i47);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i48 |= (charAt9 & 8191) << i49;
                    i49 += 13;
                    i47 = i22;
                }
                charAt18 = i48 | (charAt9 << i49);
                i47 = i22;
            }
            int i50 = i47 + 1;
            int charAt19 = b10.charAt(i47);
            if (charAt19 >= 55296) {
                int i51 = charAt19 & 8191;
                int i52 = 13;
                while (true) {
                    i21 = i50 + 1;
                    charAt8 = b10.charAt(i50);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i51 |= (charAt8 & 8191) << i52;
                    i52 += 13;
                    i50 = i21;
                }
                charAt19 = i51 | (charAt8 << i52);
                i50 = i21;
            }
            int i53 = i50 + 1;
            int charAt20 = b10.charAt(i50);
            if (charAt20 >= 55296) {
                int i54 = charAt20 & 8191;
                int i55 = 13;
                while (true) {
                    i20 = i53 + 1;
                    charAt7 = b10.charAt(i53);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i54 |= (charAt7 & 8191) << i55;
                    i55 += 13;
                    i53 = i20;
                }
                charAt20 = i54 | (charAt7 << i55);
                i53 = i20;
            }
            int i56 = i53 + 1;
            charAt = b10.charAt(i53);
            if (charAt >= 55296) {
                int i57 = charAt & 8191;
                int i58 = 13;
                while (true) {
                    i19 = i56 + 1;
                    charAt6 = b10.charAt(i56);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i57 |= (charAt6 & 8191) << i58;
                    i58 += 13;
                    i56 = i19;
                }
                charAt = i57 | (charAt6 << i58);
                i56 = i19;
            }
            int i59 = i56 + 1;
            charAt2 = b10.charAt(i56);
            if (charAt2 >= 55296) {
                int i60 = charAt2 & 8191;
                int i61 = 13;
                while (true) {
                    i18 = i59 + 1;
                    charAt5 = b10.charAt(i59);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i60 |= (charAt5 & 8191) << i61;
                    i61 += 13;
                    i59 = i18;
                }
                charAt2 = i60 | (charAt5 << i61);
                i59 = i18;
            }
            int i62 = i59 + 1;
            int charAt21 = b10.charAt(i59);
            if (charAt21 >= 55296) {
                int i63 = charAt21 & 8191;
                int i64 = 13;
                while (true) {
                    i17 = i62 + 1;
                    charAt4 = b10.charAt(i62);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i63 |= (charAt4 & 8191) << i64;
                    i64 += 13;
                    i62 = i17;
                }
                charAt21 = i63 | (charAt4 << i64);
                i62 = i17;
            }
            int i65 = i62 + 1;
            int charAt22 = b10.charAt(i62);
            if (charAt22 >= 55296) {
                int i66 = charAt22 & 8191;
                int i67 = 13;
                while (true) {
                    i16 = i65 + 1;
                    charAt3 = b10.charAt(i65);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i66 |= (charAt3 & 8191) << i67;
                    i67 += 13;
                    i65 = i16;
                }
                charAt22 = i66 | (charAt3 << i67);
                i65 = i16;
            }
            i11 = charAt17 + charAt17 + charAt18;
            iArr = new int[charAt22 + charAt2 + charAt21];
            i12 = charAt19;
            i13 = charAt22;
            i14 = charAt17;
            i15 = charAt20;
            i41 = i65;
        }
        Unsafe unsafe = f23687o;
        Object[] c11 = c2064k1.c();
        Class<?> cls2 = c2064k1.zza().getClass();
        int i68 = i13 + charAt2;
        int i69 = charAt + charAt;
        int[] iArr2 = new int[charAt * 3];
        Object[] objArr = new Object[i69];
        int i70 = 0;
        int i71 = 0;
        int i72 = i13;
        int i73 = i68;
        while (i41 < length) {
            int i74 = i41 + 1;
            int charAt23 = b10.charAt(i41);
            if (charAt23 >= c10) {
                int i75 = charAt23 & 8191;
                int i76 = i74;
                int i77 = 13;
                while (true) {
                    i38 = i76 + 1;
                    charAt14 = b10.charAt(i76);
                    if (charAt14 < c10) {
                        break;
                    }
                    i75 |= (charAt14 & 8191) << i77;
                    i77 += 13;
                    i76 = i38;
                }
                charAt23 = i75 | (charAt14 << i77);
                i24 = i38;
            } else {
                i24 = i74;
            }
            int i78 = i24 + 1;
            int charAt24 = b10.charAt(i24);
            if (charAt24 >= c10) {
                int i79 = charAt24 & 8191;
                int i80 = i78;
                int i81 = 13;
                while (true) {
                    i37 = i80 + 1;
                    charAt13 = b10.charAt(i80);
                    if (charAt13 < c10) {
                        break;
                    }
                    i79 |= (charAt13 & 8191) << i81;
                    i81 += 13;
                    i80 = i37;
                }
                charAt24 = i79 | (charAt13 << i81);
                i25 = i37;
            } else {
                i25 = i78;
            }
            if ((charAt24 & 1024) != 0) {
                iArr[i70] = i71;
                i70++;
            }
            int i82 = charAt24 & 255;
            if (i82 >= 51) {
                int i83 = i25 + 1;
                int charAt25 = b10.charAt(i25);
                i26 = length;
                char c12 = 55296;
                if (charAt25 >= 55296) {
                    int i84 = charAt25 & 8191;
                    int i85 = 13;
                    while (true) {
                        i36 = i83 + 1;
                        charAt12 = b10.charAt(i83);
                        if (charAt12 < c12) {
                            break;
                        }
                        i84 |= (charAt12 & 8191) << i85;
                        i85 += 13;
                        i83 = i36;
                        c12 = 55296;
                    }
                    charAt25 = i84 | (charAt12 << i85);
                    i83 = i36;
                }
                int i86 = i82 - 51;
                int i87 = i83;
                if (i86 == 9 || i86 == 17) {
                    int i88 = i71 / 3;
                    i35 = i11 + 1;
                    objArr[i88 + i88 + 1] = c11[i11];
                } else {
                    if (i86 == 12 && (c2064k1.a() == 1 || (charAt24 & 2048) != 0)) {
                        int i89 = i71 / 3;
                        i35 = i11 + 1;
                        objArr[i89 + i89 + 1] = c11[i11];
                    }
                    int i90 = charAt25 + charAt25;
                    obj = c11[i90];
                    if (obj instanceof Field) {
                        E11 = E(cls2, (String) obj);
                        c11[i90] = E11;
                    } else {
                        E11 = (Field) obj;
                    }
                    int i91 = i12;
                    i27 = i15;
                    i33 = (int) unsafe.objectFieldOffset(E11);
                    int i92 = i90 + 1;
                    obj2 = c11[i92];
                    if (obj2 instanceof Field) {
                        E12 = E(cls2, (String) obj2);
                        c11[i92] = E12;
                    } else {
                        E12 = (Field) obj2;
                    }
                    str = b10;
                    i28 = i91;
                    i30 = i11;
                    i31 = i87;
                    i29 = (int) unsafe.objectFieldOffset(E12);
                    i32 = 0;
                }
                i11 = i35;
                int i902 = charAt25 + charAt25;
                obj = c11[i902];
                if (obj instanceof Field) {
                }
                int i912 = i12;
                i27 = i15;
                i33 = (int) unsafe.objectFieldOffset(E11);
                int i922 = i902 + 1;
                obj2 = c11[i922];
                if (obj2 instanceof Field) {
                }
                str = b10;
                i28 = i912;
                i30 = i11;
                i31 = i87;
                i29 = (int) unsafe.objectFieldOffset(E12);
                i32 = 0;
            } else {
                i26 = length;
                int i93 = i12;
                i27 = i15;
                int i94 = i11 + 1;
                Field E13 = E(cls2, (String) c11[i11]);
                if (i82 == 9 || i82 == 17) {
                    i28 = i93;
                    int i95 = i71 / 3;
                    objArr[i95 + i95 + 1] = E13.getType();
                } else {
                    if (i82 == 27 || i82 == 49) {
                        i28 = i93;
                        int i96 = i71 / 3;
                        i34 = i11 + 2;
                        objArr[i96 + i96 + 1] = c11[i94];
                    } else if (i82 == 12 || i82 == 30 || i82 == 44) {
                        i28 = i93;
                        if (c2064k1.a() == 1 || (charAt24 & 2048) != 0) {
                            int i97 = i71 / 3;
                            i34 = i11 + 2;
                            objArr[i97 + i97 + 1] = c11[i94];
                        }
                    } else {
                        if (i82 == 50) {
                            int i98 = i72 + 1;
                            iArr[i72] = i71;
                            int i99 = i71 / 3;
                            int i100 = i11 + 2;
                            int i101 = i99 + i99;
                            objArr[i101] = c11[i94];
                            if ((charAt24 & 2048) != 0) {
                                i94 = i11 + 3;
                                objArr[i101 + 1] = c11[i100];
                                i28 = i93;
                                i72 = i98;
                            } else {
                                i72 = i98;
                                i94 = i100;
                            }
                        }
                        i28 = i93;
                    }
                    i94 = i34;
                }
                int objectFieldOffset = (int) unsafe.objectFieldOffset(E13);
                i29 = 1048575;
                if ((charAt24 & 4096) == 0 || i82 > 17) {
                    str = b10;
                    i30 = i94;
                    i31 = i25;
                    i32 = 0;
                } else {
                    int i102 = i25 + 1;
                    int charAt26 = b10.charAt(i25);
                    if (charAt26 >= 55296) {
                        int i103 = charAt26 & 8191;
                        int i104 = 13;
                        while (true) {
                            i31 = i102 + 1;
                            charAt11 = b10.charAt(i102);
                            if (charAt11 < 55296) {
                                break;
                            }
                            i103 |= (charAt11 & 8191) << i104;
                            i104 += 13;
                            i102 = i31;
                        }
                        charAt26 = i103 | (charAt11 << i104);
                    } else {
                        i31 = i102;
                    }
                    int i105 = i14 + i14 + (charAt26 / 32);
                    Object obj3 = c11[i105];
                    str = b10;
                    if (obj3 instanceof Field) {
                        E10 = (Field) obj3;
                    } else {
                        E10 = E(cls2, (String) obj3);
                        c11[i105] = E10;
                    }
                    i30 = i94;
                    i32 = charAt26 % 32;
                    i29 = (int) unsafe.objectFieldOffset(E10);
                }
                if (i82 >= 18 && i82 <= 49) {
                    iArr[i73] = objectFieldOffset;
                    i73++;
                }
                i33 = objectFieldOffset;
            }
            int i106 = i71 + 1;
            iArr2[i71] = charAt23;
            int i107 = i71 + 2;
            iArr2[i106] = i33 | ((charAt24 & 2048) != 0 ? Integer.MIN_VALUE : 0) | ((charAt24 & 512) != 0 ? 536870912 : 0) | ((charAt24 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? 268435456 : 0) | (i82 << 20);
            i71 += 3;
            iArr2[i107] = (i32 << 20) | i29;
            i11 = i30;
            i41 = i31;
            length = i26;
            i12 = i28;
            b10 = str;
            i15 = i27;
            c10 = 55296;
        }
        return new C2043d1(iArr2, objArr, i12, i15, c2064k1.zza(), c2064k1.a(), false, iArr, i13, i68, c2049f1, p02, abstractC2082q1, abstractC2098w0, u02);
    }

    private static int t(Object obj, long j10) {
        return ((Integer) B1.f(obj, j10)).intValue();
    }

    private final int u(int i10) {
        return this.f23688a[i10 + 2];
    }

    private final int v(int i10, int i11) {
        int length = (this.f23688a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = this.f23688a[i13];
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

    private static int w(int i10) {
        return (i10 >>> 20) & 255;
    }

    private final int x(int i10) {
        return this.f23688a[i10 + 1];
    }

    private static long y(Object obj, long j10) {
        return ((Long) B1.f(obj, j10)).longValue();
    }

    private final D0 z(int i10) {
        int i11 = i10 / 3;
        android.support.v4.media.session.b.a(this.f23689b[i11 + i11 + 1]);
        return null;
    }

    @Override // com.google.android.gms.internal.auth.InterfaceC2067l1
    public final int b(Object obj) {
        int i10;
        long doubleToLongBits;
        int floatToIntBits;
        int length = this.f23688a.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int x10 = x(i12);
            int i13 = this.f23688a[i12];
            long j10 = 1048575 & x10;
            int i14 = 37;
            switch (w(x10)) {
                case 0:
                    i10 = i11 * 53;
                    doubleToLongBits = Double.doubleToLongBits(B1.a(obj, j10));
                    byte[] bArr = G0.f23599d;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i11 = i10 + floatToIntBits;
                    break;
                case 1:
                    i10 = i11 * 53;
                    floatToIntBits = Float.floatToIntBits(B1.b(obj, j10));
                    i11 = i10 + floatToIntBits;
                    break;
                case 2:
                    i10 = i11 * 53;
                    doubleToLongBits = B1.d(obj, j10);
                    byte[] bArr2 = G0.f23599d;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i11 = i10 + floatToIntBits;
                    break;
                case 3:
                    i10 = i11 * 53;
                    doubleToLongBits = B1.d(obj, j10);
                    byte[] bArr3 = G0.f23599d;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i11 = i10 + floatToIntBits;
                    break;
                case 4:
                    i10 = i11 * 53;
                    floatToIntBits = B1.c(obj, j10);
                    i11 = i10 + floatToIntBits;
                    break;
                case 5:
                    i10 = i11 * 53;
                    doubleToLongBits = B1.d(obj, j10);
                    byte[] bArr4 = G0.f23599d;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i11 = i10 + floatToIntBits;
                    break;
                case 6:
                    i10 = i11 * 53;
                    floatToIntBits = B1.c(obj, j10);
                    i11 = i10 + floatToIntBits;
                    break;
                case 7:
                    i10 = i11 * 53;
                    floatToIntBits = G0.a(B1.t(obj, j10));
                    i11 = i10 + floatToIntBits;
                    break;
                case 8:
                    i10 = i11 * 53;
                    floatToIntBits = ((String) B1.f(obj, j10)).hashCode();
                    i11 = i10 + floatToIntBits;
                    break;
                case 9:
                    Object f10 = B1.f(obj, j10);
                    if (f10 != null) {
                        i14 = f10.hashCode();
                    }
                    i11 = (i11 * 53) + i14;
                    break;
                case RequestError.EVENT_TIMEOUT /* 10 */:
                    i10 = i11 * 53;
                    floatToIntBits = B1.f(obj, j10).hashCode();
                    i11 = i10 + floatToIntBits;
                    break;
                case 11:
                    i10 = i11 * 53;
                    floatToIntBits = B1.c(obj, j10);
                    i11 = i10 + floatToIntBits;
                    break;
                case 12:
                    i10 = i11 * 53;
                    floatToIntBits = B1.c(obj, j10);
                    i11 = i10 + floatToIntBits;
                    break;
                case 13:
                    i10 = i11 * 53;
                    floatToIntBits = B1.c(obj, j10);
                    i11 = i10 + floatToIntBits;
                    break;
                case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                    i10 = i11 * 53;
                    doubleToLongBits = B1.d(obj, j10);
                    byte[] bArr5 = G0.f23599d;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i11 = i10 + floatToIntBits;
                    break;
                case HVError.SSL_CONNECT_ERROR /* 15 */:
                    i10 = i11 * 53;
                    floatToIntBits = B1.c(obj, j10);
                    i11 = i10 + floatToIntBits;
                    break;
                case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                    i10 = i11 * 53;
                    doubleToLongBits = B1.d(obj, j10);
                    byte[] bArr6 = G0.f23599d;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i11 = i10 + floatToIntBits;
                    break;
                case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                    Object f11 = B1.f(obj, j10);
                    if (f11 != null) {
                        i14 = f11.hashCode();
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
                    floatToIntBits = B1.f(obj, j10).hashCode();
                    i11 = i10 + floatToIntBits;
                    break;
                case 50:
                    i10 = i11 * 53;
                    floatToIntBits = B1.f(obj, j10).hashCode();
                    i11 = i10 + floatToIntBits;
                    break;
                case 51:
                    if (p(obj, i13, i12)) {
                        i10 = i11 * 53;
                        doubleToLongBits = Double.doubleToLongBits(((Double) B1.f(obj, j10)).doubleValue());
                        byte[] bArr7 = G0.f23599d;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i11 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (p(obj, i13, i12)) {
                        i10 = i11 * 53;
                        floatToIntBits = Float.floatToIntBits(((Float) B1.f(obj, j10)).floatValue());
                        i11 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (p(obj, i13, i12)) {
                        i10 = i11 * 53;
                        doubleToLongBits = y(obj, j10);
                        byte[] bArr8 = G0.f23599d;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i11 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (p(obj, i13, i12)) {
                        i10 = i11 * 53;
                        doubleToLongBits = y(obj, j10);
                        byte[] bArr9 = G0.f23599d;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i11 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (p(obj, i13, i12)) {
                        i10 = i11 * 53;
                        floatToIntBits = t(obj, j10);
                        i11 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (p(obj, i13, i12)) {
                        i10 = i11 * 53;
                        doubleToLongBits = y(obj, j10);
                        byte[] bArr10 = G0.f23599d;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i11 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (p(obj, i13, i12)) {
                        i10 = i11 * 53;
                        floatToIntBits = t(obj, j10);
                        i11 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (p(obj, i13, i12)) {
                        i10 = i11 * 53;
                        floatToIntBits = G0.a(((Boolean) B1.f(obj, j10)).booleanValue());
                        i11 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (p(obj, i13, i12)) {
                        i10 = i11 * 53;
                        floatToIntBits = ((String) B1.f(obj, j10)).hashCode();
                        i11 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case HVError.DETECTOR_NOT_AVAILABLE_ERROR /* 60 */:
                    if (p(obj, i13, i12)) {
                        i10 = i11 * 53;
                        floatToIntBits = B1.f(obj, j10).hashCode();
                        i11 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (p(obj, i13, i12)) {
                        i10 = i11 * 53;
                        floatToIntBits = B1.f(obj, j10).hashCode();
                        i11 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (p(obj, i13, i12)) {
                        i10 = i11 * 53;
                        floatToIntBits = t(obj, j10);
                        i11 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (p(obj, i13, i12)) {
                        i10 = i11 * 53;
                        floatToIntBits = t(obj, j10);
                        i11 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (p(obj, i13, i12)) {
                        i10 = i11 * 53;
                        floatToIntBits = t(obj, j10);
                        i11 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (p(obj, i13, i12)) {
                        i10 = i11 * 53;
                        doubleToLongBits = y(obj, j10);
                        byte[] bArr11 = G0.f23599d;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i11 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (p(obj, i13, i12)) {
                        i10 = i11 * 53;
                        floatToIntBits = t(obj, j10);
                        i11 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (p(obj, i13, i12)) {
                        i10 = i11 * 53;
                        doubleToLongBits = y(obj, j10);
                        byte[] bArr12 = G0.f23599d;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i11 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (p(obj, i13, i12)) {
                        i10 = i11 * 53;
                        floatToIntBits = B1.f(obj, j10).hashCode();
                        i11 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
            }
        }
        return (i11 * 53) + this.f23697j.a(obj).hashCode();
    }

    @Override // com.google.android.gms.internal.auth.InterfaceC2067l1
    public final void c(Object obj) {
        if (o(obj)) {
            if (obj instanceof C0) {
                C0 c02 = (C0) obj;
                c02.m(Integer.MAX_VALUE);
                c02.zza = 0;
                c02.k();
            }
            int length = this.f23688a.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int x10 = x(i10);
                int i11 = 1048575 & x10;
                int w10 = w(x10);
                long j10 = i11;
                if (w10 != 9) {
                    if (w10 != 60 && w10 != 68) {
                        switch (w10) {
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
                                this.f23696i.a(obj, j10);
                                break;
                            case 50:
                                Unsafe unsafe = f23687o;
                                Object object = unsafe.getObject(obj, j10);
                                if (object != null) {
                                    ((T0) object).d();
                                    unsafe.putObject(obj, j10, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (p(obj, this.f23688a[i10], i10)) {
                        A(i10).c(f23687o.getObject(obj, j10));
                    }
                }
                if (l(obj, i10)) {
                    A(i10).c(f23687o.getObject(obj, j10));
                }
            }
            this.f23697j.c(obj);
        }
    }

    @Override // com.google.android.gms.internal.auth.InterfaceC2067l1
    public final boolean e(Object obj) {
        int i10;
        int i11;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1048575;
        while (i13 < this.f23694g) {
            int i15 = this.f23693f[i13];
            int i16 = this.f23688a[i15];
            int x10 = x(i15);
            int i17 = this.f23688a[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i14) {
                if (i18 != 1048575) {
                    i12 = f23687o.getInt(obj, i18);
                }
                i11 = i12;
                i10 = i18;
            } else {
                i10 = i14;
                i11 = i12;
            }
            if ((268435456 & x10) != 0 && !m(obj, i15, i10, i11, i19)) {
                return false;
            }
            int w10 = w(x10);
            if (w10 != 9 && w10 != 17) {
                if (w10 != 27) {
                    if (w10 == 60 || w10 == 68) {
                        if (p(obj, i16, i15) && !n(obj, x10, A(i15))) {
                            return false;
                        }
                    } else if (w10 != 49) {
                        if (w10 == 50 && !((T0) B1.f(obj, x10 & 1048575)).isEmpty()) {
                            android.support.v4.media.session.b.a(B(i15));
                            throw null;
                        }
                    }
                }
                List list = (List) B1.f(obj, x10 & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    InterfaceC2067l1 A10 = A(i15);
                    for (int i20 = 0; i20 < list.size(); i20++) {
                        if (!A10.e(list.get(i20))) {
                            return false;
                        }
                    }
                }
            } else if (m(obj, i15, i10, i11, i19) && !n(obj, x10, A(i15))) {
                return false;
            }
            i13++;
            i14 = i10;
            i12 = i11;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.auth.InterfaceC2067l1
    public final Object f() {
        return ((C0) this.f23692e).c();
    }

    @Override // com.google.android.gms.internal.auth.InterfaceC2067l1
    public final void g(Object obj, byte[] bArr, int i10, int i11, C2045e0 c2045e0) {
        q(obj, bArr, i10, i11, 0, c2045e0);
    }

    @Override // com.google.android.gms.internal.auth.InterfaceC2067l1
    public final void h(Object obj, Object obj2) {
        F(obj);
        obj2.getClass();
        for (int i10 = 0; i10 < this.f23688a.length; i10 += 3) {
            int x10 = x(i10);
            int i11 = this.f23688a[i10];
            long j10 = 1048575 & x10;
            switch (w(x10)) {
                case 0:
                    if (l(obj2, i10)) {
                        B1.l(obj, j10, B1.a(obj2, j10));
                        I(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (l(obj2, i10)) {
                        B1.m(obj, j10, B1.b(obj2, j10));
                        I(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (l(obj2, i10)) {
                        B1.o(obj, j10, B1.d(obj2, j10));
                        I(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (l(obj2, i10)) {
                        B1.o(obj, j10, B1.d(obj2, j10));
                        I(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (l(obj2, i10)) {
                        B1.n(obj, j10, B1.c(obj2, j10));
                        I(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (l(obj2, i10)) {
                        B1.o(obj, j10, B1.d(obj2, j10));
                        I(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (l(obj2, i10)) {
                        B1.n(obj, j10, B1.c(obj2, j10));
                        I(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (l(obj2, i10)) {
                        B1.k(obj, j10, B1.t(obj2, j10));
                        I(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (l(obj2, i10)) {
                        B1.p(obj, j10, B1.f(obj2, j10));
                        I(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    G(obj, obj2, i10);
                    break;
                case RequestError.EVENT_TIMEOUT /* 10 */:
                    if (l(obj2, i10)) {
                        B1.p(obj, j10, B1.f(obj2, j10));
                        I(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (l(obj2, i10)) {
                        B1.n(obj, j10, B1.c(obj2, j10));
                        I(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (l(obj2, i10)) {
                        B1.n(obj, j10, B1.c(obj2, j10));
                        I(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (l(obj2, i10)) {
                        B1.n(obj, j10, B1.c(obj2, j10));
                        I(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                    if (l(obj2, i10)) {
                        B1.o(obj, j10, B1.d(obj2, j10));
                        I(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case HVError.SSL_CONNECT_ERROR /* 15 */:
                    if (l(obj2, i10)) {
                        B1.n(obj, j10, B1.c(obj2, j10));
                        I(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                    if (l(obj2, i10)) {
                        B1.o(obj, j10, B1.d(obj2, j10));
                        I(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                    G(obj, obj2, i10);
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
                    this.f23696i.b(obj, obj2, j10);
                    break;
                case 50:
                    int i12 = AbstractC2073n1.f23748d;
                    B1.p(obj, j10, U0.a(B1.f(obj, j10), B1.f(obj2, j10)));
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
                    if (p(obj2, i11, i10)) {
                        B1.p(obj, j10, B1.f(obj2, j10));
                        a(obj, i11, i10);
                        break;
                    } else {
                        break;
                    }
                case HVError.DETECTOR_NOT_AVAILABLE_ERROR /* 60 */:
                    H(obj, obj2, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (p(obj2, i11, i10)) {
                        B1.p(obj, j10, B1.f(obj2, j10));
                        a(obj, i11, i10);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    H(obj, obj2, i10);
                    break;
            }
        }
        AbstractC2073n1.c(this.f23697j, obj, obj2);
    }

    @Override // com.google.android.gms.internal.auth.InterfaceC2067l1
    public final boolean i(Object obj, Object obj2) {
        boolean e10;
        int length = this.f23688a.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int x10 = x(i10);
            long j10 = x10 & 1048575;
            switch (w(x10)) {
                case 0:
                    if (k(obj, obj2, i10) && Double.doubleToLongBits(B1.a(obj, j10)) == Double.doubleToLongBits(B1.a(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (k(obj, obj2, i10) && Float.floatToIntBits(B1.b(obj, j10)) == Float.floatToIntBits(B1.b(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (k(obj, obj2, i10) && B1.d(obj, j10) == B1.d(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (k(obj, obj2, i10) && B1.d(obj, j10) == B1.d(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (k(obj, obj2, i10) && B1.c(obj, j10) == B1.c(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (k(obj, obj2, i10) && B1.d(obj, j10) == B1.d(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (k(obj, obj2, i10) && B1.c(obj, j10) == B1.c(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (k(obj, obj2, i10) && B1.t(obj, j10) == B1.t(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (k(obj, obj2, i10) && AbstractC2073n1.e(B1.f(obj, j10), B1.f(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (k(obj, obj2, i10) && AbstractC2073n1.e(B1.f(obj, j10), B1.f(obj2, j10))) {
                        continue;
                    }
                    return false;
                case RequestError.EVENT_TIMEOUT /* 10 */:
                    if (k(obj, obj2, i10) && AbstractC2073n1.e(B1.f(obj, j10), B1.f(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (k(obj, obj2, i10) && B1.c(obj, j10) == B1.c(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (k(obj, obj2, i10) && B1.c(obj, j10) == B1.c(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (k(obj, obj2, i10) && B1.c(obj, j10) == B1.c(obj2, j10)) {
                        continue;
                    }
                    return false;
                case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                    if (k(obj, obj2, i10) && B1.d(obj, j10) == B1.d(obj2, j10)) {
                        continue;
                    }
                    return false;
                case HVError.SSL_CONNECT_ERROR /* 15 */:
                    if (k(obj, obj2, i10) && B1.c(obj, j10) == B1.c(obj2, j10)) {
                        continue;
                    }
                    return false;
                case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                    if (k(obj, obj2, i10) && B1.d(obj, j10) == B1.d(obj2, j10)) {
                        continue;
                    }
                    return false;
                case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                    if (k(obj, obj2, i10) && AbstractC2073n1.e(B1.f(obj, j10), B1.f(obj2, j10))) {
                        continue;
                    }
                    return false;
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
                    e10 = AbstractC2073n1.e(B1.f(obj, j10), B1.f(obj2, j10));
                    break;
                case 50:
                    e10 = AbstractC2073n1.e(B1.f(obj, j10), B1.f(obj2, j10));
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
                    long u10 = u(i10) & 1048575;
                    if (B1.c(obj, u10) == B1.c(obj2, u10) && AbstractC2073n1.e(B1.f(obj, j10), B1.f(obj2, j10))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!e10) {
                return false;
            }
        }
        return this.f23697j.a(obj).equals(this.f23697j.a(obj2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0c16, code lost:
    
        if (r2 == r15) goto L496;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0c18, code lost:
    
        r35.putInt(r10, r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0c1e, code lost:
    
        r2 = r38.f23694g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0c22, code lost:
    
        if (r2 >= r38.f23695h) goto L625;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0c24, code lost:
    
        r3 = r38.f23693f[r2];
        r4 = r38.f23688a[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0c36, code lost:
    
        if (com.google.android.gms.internal.auth.B1.f(r10, x(r3) & r15) != null) goto L502;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0c39, code lost:
    
        z(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0c3c, code lost:
    
        r2 = r2 + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0c3e, code lost:
    
        if (r9 != 0) goto L510;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0c42, code lost:
    
        if (r8 != r42) goto L508;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0c49, code lost:
    
        throw com.google.android.gms.internal.auth.H0.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0c50, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0c4c, code lost:
    
        if (r8 > r42) goto L514;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0c4e, code lost:
    
        if (r13 != r9) goto L514;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0c55, code lost:
    
        throw com.google.android.gms.internal.auth.H0.d();
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0bae  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0bca  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x090f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0925 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:519:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:633:0x0053 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final int q(Object obj, byte[] bArr, int i10, int i11, int i12, C2045e0 c2045e0) {
        int i13;
        Object obj2;
        Unsafe unsafe;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int v10;
        int i19;
        int i20;
        int i21;
        int i22;
        C2045e0 c2045e02;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        C2045e0 c2045e03;
        int i29;
        int i30;
        int i31;
        Unsafe unsafe2;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        byte b10;
        int i37;
        int i38;
        int i39;
        int i40;
        int i41;
        byte[] bArr2;
        Object obj3;
        int i42;
        byte[] bArr3;
        int i43;
        int i44;
        int i45;
        int i46;
        byte[] bArr4;
        int i47;
        int i48;
        int h10;
        byte[] bArr5;
        int i49;
        char c10;
        int f10;
        char c11;
        int i50;
        byte[] bArr6;
        Unsafe unsafe3;
        int h11;
        Object obj4 = obj;
        byte[] bArr7 = bArr;
        int i51 = i11;
        int i52 = i12;
        C2045e0 c2045e04 = c2045e0;
        int i53 = 3;
        int i54 = 1;
        F(obj);
        Unsafe unsafe4 = f23687o;
        int i55 = 0;
        int i56 = -1;
        int i57 = i10;
        int i58 = -1;
        int i59 = 0;
        int i60 = 0;
        int i61 = 0;
        int i62 = 1048575;
        while (true) {
            if (i57 < i51) {
                int i63 = i57 + 1;
                int i64 = bArr7[i57];
                if (i64 < 0) {
                    i63 = AbstractC2048f0.i(i64, bArr7, i63, c2045e04);
                    i64 = c2045e04.f23701a;
                }
                int i65 = i64 >>> 3;
                if (i65 > i58) {
                    v10 = (i65 < this.f23690c || i65 > this.f23691d) ? i56 : v(i65, i59 / i53);
                } else if (i65 < this.f23690c || i65 > this.f23691d) {
                    i18 = i56;
                    if (i18 == i56) {
                        int i66 = i64 & 7;
                        int[] iArr = this.f23688a;
                        int i67 = iArr[i18 + 1];
                        int w10 = w(i67);
                        long j10 = i67 & 1048575;
                        int i68 = i64;
                        if (w10 > 17) {
                            i20 = -1;
                            C2045e0 c2045e05 = c2045e04;
                            int i69 = i18;
                            Unsafe unsafe5 = unsafe4;
                            int i70 = i62;
                            int i71 = i63;
                            i16 = i68;
                            if (w10 != 27) {
                                i40 = i70;
                                i22 = 0;
                                Unsafe unsafe6 = unsafe5;
                                i59 = i69;
                                i65 = i65;
                                if (w10 > 49) {
                                    c2045e02 = c2045e05;
                                    unsafe = unsafe6;
                                    bArr2 = bArr;
                                    i16 = i16;
                                    i42 = i71;
                                    if (w10 != 50) {
                                        Unsafe unsafe7 = f23687o;
                                        long j11 = iArr[i59 + 2] & 1048575;
                                        switch (w10) {
                                            case 51:
                                                bArr3 = bArr2;
                                                i43 = i42;
                                                i44 = i16;
                                                i23 = 1;
                                                i21 = i59;
                                                obj2 = obj;
                                                i19 = 3;
                                                if (i66 == 1) {
                                                    unsafe7.putObject(obj2, j10, Double.valueOf(Double.longBitsToDouble(AbstractC2048f0.n(bArr3, i43))));
                                                    i25 = i43 + 8;
                                                    unsafe7.putInt(obj2, j11, i65);
                                                    if (i25 == i43) {
                                                        i13 = i12;
                                                        i24 = i25;
                                                        i62 = i40;
                                                        i16 = i44;
                                                        break;
                                                    } else {
                                                        i51 = i11;
                                                        i52 = i12;
                                                        bArr7 = bArr3;
                                                        c2045e04 = c2045e02;
                                                        obj4 = obj2;
                                                        i58 = i65;
                                                        i59 = i21;
                                                        i62 = i40;
                                                        i55 = 0;
                                                        i56 = -1;
                                                        i53 = i19;
                                                        unsafe4 = unsafe;
                                                        i61 = i44;
                                                        int i72 = i23;
                                                        i57 = i25;
                                                        i54 = i72;
                                                        break;
                                                    }
                                                }
                                                i25 = i43;
                                                if (i25 == i43) {
                                                }
                                            case 52:
                                                bArr3 = bArr2;
                                                i43 = i42;
                                                i44 = i16;
                                                i21 = i59;
                                                obj2 = obj;
                                                i19 = 3;
                                                if (i66 == 5) {
                                                    unsafe7.putObject(obj2, j10, Float.valueOf(Float.intBitsToFloat(AbstractC2048f0.b(bArr3, i43))));
                                                    i25 = i43 + 4;
                                                    unsafe7.putInt(obj2, j11, i65);
                                                    i23 = 1;
                                                    if (i25 == i43) {
                                                    }
                                                }
                                                i23 = 1;
                                                i25 = i43;
                                                if (i25 == i43) {
                                                }
                                                break;
                                            case 53:
                                            case 54:
                                                bArr3 = bArr2;
                                                i43 = i42;
                                                i44 = i16;
                                                i23 = 1;
                                                i21 = i59;
                                                obj2 = obj;
                                                i19 = 3;
                                                if (i66 == 0) {
                                                    i25 = AbstractC2048f0.k(bArr3, i43, c2045e02);
                                                    unsafe7.putObject(obj2, j10, Long.valueOf(c2045e02.f23702b));
                                                    unsafe7.putInt(obj2, j11, i65);
                                                    i23 = 1;
                                                    if (i25 == i43) {
                                                    }
                                                }
                                                i25 = i43;
                                                if (i25 == i43) {
                                                }
                                                break;
                                            case 55:
                                            case 62:
                                                bArr3 = bArr2;
                                                i43 = i42;
                                                i44 = i16;
                                                i23 = 1;
                                                i21 = i59;
                                                obj2 = obj;
                                                i19 = 3;
                                                if (i66 == 0) {
                                                    i25 = AbstractC2048f0.h(bArr3, i43, c2045e02);
                                                    unsafe7.putObject(obj2, j10, Integer.valueOf(c2045e02.f23701a));
                                                    unsafe7.putInt(obj2, j11, i65);
                                                    if (i25 == i43) {
                                                    }
                                                }
                                                i25 = i43;
                                                if (i25 == i43) {
                                                }
                                                break;
                                            case 56:
                                            case 65:
                                                bArr3 = bArr2;
                                                i43 = i42;
                                                i44 = i16;
                                                i23 = 1;
                                                i21 = i59;
                                                obj2 = obj;
                                                i19 = 3;
                                                if (i66 == 1) {
                                                    unsafe7.putObject(obj2, j10, Long.valueOf(AbstractC2048f0.n(bArr3, i43)));
                                                    i25 = i43 + 8;
                                                    unsafe7.putInt(obj2, j11, i65);
                                                    if (i25 == i43) {
                                                    }
                                                }
                                                i25 = i43;
                                                if (i25 == i43) {
                                                }
                                                break;
                                            case 57:
                                            case 64:
                                                bArr3 = bArr2;
                                                i43 = i42;
                                                i44 = i16;
                                                i21 = i59;
                                                obj2 = obj;
                                                i19 = 3;
                                                if (i66 == 5) {
                                                    unsafe7.putObject(obj2, j10, Integer.valueOf(AbstractC2048f0.b(bArr3, i43)));
                                                    i25 = i43 + 4;
                                                    unsafe7.putInt(obj2, j11, i65);
                                                    i23 = 1;
                                                    if (i25 == i43) {
                                                    }
                                                }
                                                i23 = 1;
                                                i25 = i43;
                                                if (i25 == i43) {
                                                }
                                                break;
                                            case 58:
                                                bArr3 = bArr2;
                                                i43 = i42;
                                                i44 = i16;
                                                i21 = i59;
                                                obj2 = obj;
                                                i19 = 3;
                                                if (i66 == 0) {
                                                    i25 = AbstractC2048f0.k(bArr3, i43, c2045e02);
                                                    unsafe7.putObject(obj2, j10, Boolean.valueOf(c2045e02.f23702b != 0));
                                                    unsafe7.putInt(obj2, j11, i65);
                                                    i23 = 1;
                                                    if (i25 == i43) {
                                                    }
                                                }
                                                i23 = 1;
                                                i25 = i43;
                                                if (i25 == i43) {
                                                }
                                                break;
                                            case 59:
                                                bArr3 = bArr2;
                                                i43 = i42;
                                                i44 = i16;
                                                i21 = i59;
                                                obj2 = obj;
                                                i19 = 3;
                                                if (i66 == 2) {
                                                    int h12 = AbstractC2048f0.h(bArr3, i43, c2045e02);
                                                    int i73 = c2045e02.f23701a;
                                                    if (i73 == 0) {
                                                        unsafe7.putObject(obj2, j10, BuildConfig.FLAVOR);
                                                    } else {
                                                        if ((i67 & 536870912) != 0 && !F1.c(bArr3, h12, h12 + i73)) {
                                                            throw H0.b();
                                                        }
                                                        unsafe7.putObject(obj2, j10, new String(bArr3, h12, i73, G0.f23597b));
                                                        h12 += i73;
                                                    }
                                                    unsafe7.putInt(obj2, j11, i65);
                                                    i25 = h12;
                                                    i23 = 1;
                                                    if (i25 == i43) {
                                                    }
                                                }
                                                i23 = 1;
                                                i25 = i43;
                                                if (i25 == i43) {
                                                }
                                                break;
                                            case HVError.DETECTOR_NOT_AVAILABLE_ERROR /* 60 */:
                                                i45 = i42;
                                                i44 = i16;
                                                i21 = i59;
                                                obj2 = obj;
                                                if (i66 == 2) {
                                                    Object D10 = D(obj2, i65, i21);
                                                    i19 = 3;
                                                    i25 = AbstractC2048f0.m(D10, A(i21), bArr, i45, i11, c2045e0);
                                                    j(obj2, i65, i21, D10);
                                                    bArr3 = bArr2;
                                                    i43 = i45;
                                                    i23 = 1;
                                                    if (i25 == i43) {
                                                    }
                                                } else {
                                                    i19 = 3;
                                                    i23 = 1;
                                                    int i74 = i45;
                                                    bArr3 = bArr2;
                                                    i43 = i74;
                                                    i25 = i43;
                                                    if (i25 == i43) {
                                                    }
                                                }
                                                break;
                                            case 61:
                                                i45 = i42;
                                                i44 = i16;
                                                i21 = i59;
                                                obj2 = obj;
                                                if (i66 == 2) {
                                                    int a10 = AbstractC2048f0.a(bArr2, i45, c2045e02);
                                                    unsafe7.putObject(obj2, j10, c2045e02.f23703c);
                                                    unsafe7.putInt(obj2, j11, i65);
                                                    i25 = a10;
                                                    i23 = 1;
                                                    i19 = 3;
                                                    int i75 = i45;
                                                    bArr3 = bArr2;
                                                    i43 = i75;
                                                    if (i25 == i43) {
                                                    }
                                                }
                                                i23 = 1;
                                                i19 = 3;
                                                int i742 = i45;
                                                bArr3 = bArr2;
                                                i43 = i742;
                                                i25 = i43;
                                                if (i25 == i43) {
                                                }
                                                break;
                                            case 63:
                                                i45 = i42;
                                                i44 = i16;
                                                i21 = i59;
                                                obj2 = obj;
                                                if (i66 == 0) {
                                                    i25 = AbstractC2048f0.h(bArr2, i45, c2045e02);
                                                    int i76 = c2045e02.f23701a;
                                                    z(i21);
                                                    unsafe7.putObject(obj2, j10, Integer.valueOf(i76));
                                                    unsafe7.putInt(obj2, j11, i65);
                                                    i23 = 1;
                                                    i19 = 3;
                                                    int i752 = i45;
                                                    bArr3 = bArr2;
                                                    i43 = i752;
                                                    if (i25 == i43) {
                                                    }
                                                }
                                                i23 = 1;
                                                i19 = 3;
                                                int i7422 = i45;
                                                bArr3 = bArr2;
                                                i43 = i7422;
                                                i25 = i43;
                                                if (i25 == i43) {
                                                }
                                                break;
                                            case 66:
                                                i45 = i42;
                                                i44 = i16;
                                                i21 = i59;
                                                obj2 = obj;
                                                if (i66 == 0) {
                                                    i25 = AbstractC2048f0.h(bArr2, i45, c2045e02);
                                                    unsafe7.putObject(obj2, j10, Integer.valueOf(AbstractC2092u0.a(c2045e02.f23701a)));
                                                    unsafe7.putInt(obj2, j11, i65);
                                                    i23 = 1;
                                                    i19 = 3;
                                                    int i7522 = i45;
                                                    bArr3 = bArr2;
                                                    i43 = i7522;
                                                    if (i25 == i43) {
                                                    }
                                                }
                                                i23 = 1;
                                                i19 = 3;
                                                int i74222 = i45;
                                                bArr3 = bArr2;
                                                i43 = i74222;
                                                i25 = i43;
                                                if (i25 == i43) {
                                                }
                                                break;
                                            case 67:
                                                i45 = i42;
                                                i44 = i16;
                                                i21 = i59;
                                                obj2 = obj;
                                                if (i66 == 0) {
                                                    i25 = AbstractC2048f0.k(bArr2, i45, c2045e02);
                                                    unsafe7.putObject(obj2, j10, Long.valueOf(AbstractC2092u0.b(c2045e02.f23702b)));
                                                    unsafe7.putInt(obj2, j11, i65);
                                                    i23 = 1;
                                                    i19 = 3;
                                                    int i75222 = i45;
                                                    bArr3 = bArr2;
                                                    i43 = i75222;
                                                    if (i25 == i43) {
                                                    }
                                                }
                                                i23 = 1;
                                                i19 = 3;
                                                int i742222 = i45;
                                                bArr3 = bArr2;
                                                i43 = i742222;
                                                i25 = i43;
                                                if (i25 == i43) {
                                                }
                                                break;
                                            case 68:
                                                if (i66 == 3) {
                                                    Object D11 = D(obj, i65, i59);
                                                    i45 = i42;
                                                    i44 = i16;
                                                    int l10 = AbstractC2048f0.l(D11, A(i59), bArr, i42, i11, (i16 & (-8)) | 4, c2045e0);
                                                    j(obj, i65, i59, D11);
                                                    obj2 = obj;
                                                    i21 = i59;
                                                    i25 = l10;
                                                    i65 = i65;
                                                    i23 = 1;
                                                    i19 = 3;
                                                    int i752222 = i45;
                                                    bArr3 = bArr2;
                                                    i43 = i752222;
                                                    if (i25 == i43) {
                                                    }
                                                } else {
                                                    i44 = i16;
                                                    bArr3 = bArr2;
                                                    i43 = i42;
                                                    i23 = 1;
                                                    i19 = 3;
                                                    i21 = i59;
                                                    obj2 = obj;
                                                    i25 = i43;
                                                    if (i25 == i43) {
                                                    }
                                                }
                                                break;
                                            default:
                                                bArr3 = bArr2;
                                                i43 = i42;
                                                i44 = i16;
                                                i23 = 1;
                                                i19 = 3;
                                                i21 = i59;
                                                obj2 = obj;
                                                i25 = i43;
                                                if (i25 == i43) {
                                                }
                                                break;
                                        }
                                    } else {
                                        if (i66 == 2) {
                                            Unsafe unsafe8 = f23687o;
                                            Object B10 = B(i59);
                                            Object object = unsafe8.getObject(obj, j10);
                                            if (!((T0) object).i()) {
                                                T0 b11 = T0.a().b();
                                                U0.a(b11, object);
                                                unsafe8.putObject(obj, j10, b11);
                                            }
                                            android.support.v4.media.session.b.a(B10);
                                            throw null;
                                        }
                                        obj3 = obj;
                                        i41 = 1;
                                        i13 = i12;
                                        i23 = i41;
                                        i24 = i42;
                                        i62 = i40;
                                        i19 = 3;
                                        i21 = i59;
                                        obj2 = obj3;
                                    }
                                } else {
                                    long j12 = i67;
                                    Unsafe unsafe9 = f23687o;
                                    E0 e02 = (E0) unsafe9.getObject(obj4, j10);
                                    if (e02.a()) {
                                        i46 = i65;
                                    } else {
                                        int size = e02.size();
                                        i46 = i65;
                                        E0 l11 = e02.l(size != 0 ? size + size : 10);
                                        unsafe9.putObject(obj4, j10, l11);
                                        e02 = l11;
                                    }
                                    switch (w10) {
                                        case 18:
                                        case HVError.FACE_CAPTURE_TIMEOUT /* 35 */:
                                            bArr4 = bArr;
                                            i65 = i46;
                                            c2045e02 = c2045e0;
                                            unsafe = unsafe6;
                                            i16 = i16;
                                            i47 = i71;
                                            i48 = i11;
                                            if (i66 == 2) {
                                                android.support.v4.media.session.b.a(e02);
                                                h10 = AbstractC2048f0.h(bArr4, i47, c2045e02);
                                                int i77 = c2045e02.f23701a + h10;
                                                if (h10 < i77) {
                                                    Double.longBitsToDouble(AbstractC2048f0.n(bArr4, h10));
                                                    throw null;
                                                }
                                                if (h10 != i77) {
                                                    throw H0.f();
                                                }
                                                i24 = h10;
                                                i54 = 1;
                                                if (i24 != i47) {
                                                    i13 = i12;
                                                    i23 = i54;
                                                    i21 = i59;
                                                    i62 = i40;
                                                    i19 = 3;
                                                    obj2 = obj;
                                                    break;
                                                } else {
                                                    i52 = i12;
                                                    bArr7 = bArr4;
                                                    i57 = i24;
                                                    c2045e04 = c2045e02;
                                                    i58 = i65;
                                                    i61 = i16;
                                                    i51 = i48;
                                                    i62 = i40;
                                                    i55 = 0;
                                                    i56 = -1;
                                                    unsafe4 = unsafe;
                                                    i53 = 3;
                                                    obj4 = obj;
                                                    break;
                                                }
                                            } else {
                                                i54 = 1;
                                                if (i66 == 1) {
                                                    android.support.v4.media.session.b.a(e02);
                                                    Double.longBitsToDouble(AbstractC2048f0.n(bArr4, i47));
                                                    throw null;
                                                }
                                                i24 = i47;
                                                if (i24 != i47) {
                                                }
                                            }
                                        case 19:
                                        case HVError.HYPER_DOC_DETECT_ERROR /* 36 */:
                                            bArr4 = bArr;
                                            i65 = i46;
                                            c2045e02 = c2045e0;
                                            unsafe = unsafe6;
                                            i16 = i16;
                                            i47 = i71;
                                            i48 = i11;
                                            if (i66 == 2) {
                                                android.support.v4.media.session.b.a(e02);
                                                h10 = AbstractC2048f0.h(bArr4, i47, c2045e02);
                                                int i78 = c2045e02.f23701a + h10;
                                                if (h10 < i78) {
                                                    Float.intBitsToFloat(AbstractC2048f0.b(bArr4, h10));
                                                    throw null;
                                                }
                                                if (h10 != i78) {
                                                    throw H0.f();
                                                }
                                                i24 = h10;
                                                i54 = 1;
                                                if (i24 != i47) {
                                                }
                                            } else {
                                                if (i66 == 5) {
                                                    android.support.v4.media.session.b.a(e02);
                                                    Float.intBitsToFloat(AbstractC2048f0.b(bArr4, i47));
                                                    throw null;
                                                }
                                                i54 = 1;
                                                i24 = i47;
                                                if (i24 != i47) {
                                                }
                                            }
                                            break;
                                        case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                                        case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                                        case HVError.INVALID_FILE_ERROR /* 37 */:
                                        case 38:
                                            bArr4 = bArr;
                                            i65 = i46;
                                            c2045e02 = c2045e0;
                                            unsafe = unsafe6;
                                            i16 = i16;
                                            i47 = i71;
                                            i48 = i11;
                                            if (i66 == 2) {
                                                android.support.v4.media.session.b.a(e02);
                                                h10 = AbstractC2048f0.h(bArr4, i47, c2045e02);
                                                int i79 = c2045e02.f23701a + h10;
                                                if (h10 < i79) {
                                                    AbstractC2048f0.k(bArr4, h10, c2045e02);
                                                    throw null;
                                                }
                                                if (h10 != i79) {
                                                    throw H0.f();
                                                }
                                                i24 = h10;
                                                i54 = 1;
                                                if (i24 != i47) {
                                                }
                                            } else {
                                                if (i66 == 0) {
                                                    android.support.v4.media.session.b.a(e02);
                                                    AbstractC2048f0.k(bArr4, i47, c2045e02);
                                                    long j13 = c2045e02.f23702b;
                                                    throw null;
                                                }
                                                i54 = 1;
                                                i24 = i47;
                                                if (i24 != i47) {
                                                }
                                            }
                                            break;
                                        case HVError.FACE_DETECTION_ERROR /* 22 */:
                                        case 29:
                                        case 39:
                                        case HVError.ENCRYPTION_ERROR /* 43 */:
                                            bArr5 = bArr;
                                            i65 = i46;
                                            c2045e02 = c2045e0;
                                            i49 = i59;
                                            unsafe = unsafe6;
                                            c10 = 2;
                                            i16 = i16;
                                            i47 = i71;
                                            i48 = i11;
                                            if (i66 == 2) {
                                                f10 = AbstractC2048f0.f(bArr5, i47, e02, c2045e02);
                                                i24 = f10;
                                                i59 = i49;
                                                bArr4 = bArr5;
                                                i54 = 1;
                                                if (i24 != i47) {
                                                }
                                            } else {
                                                if (i66 == 0) {
                                                    i59 = i49;
                                                    i24 = AbstractC2048f0.j(i16, bArr, i47, i11, e02, c2045e0);
                                                    bArr4 = bArr5;
                                                    i54 = 1;
                                                    if (i24 != i47) {
                                                    }
                                                }
                                                i59 = i49;
                                                bArr4 = bArr5;
                                                i54 = 1;
                                                i24 = i47;
                                                if (i24 != i47) {
                                                }
                                            }
                                            break;
                                        case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                                        case 32:
                                        case RequestError.NETWORK_FAILURE /* 40 */:
                                        case 46:
                                            bArr5 = bArr;
                                            i65 = i46;
                                            c2045e02 = c2045e0;
                                            i49 = i59;
                                            unsafe = unsafe6;
                                            c10 = 2;
                                            i16 = i16;
                                            i47 = i71;
                                            i48 = i11;
                                            if (i66 == 2) {
                                                android.support.v4.media.session.b.a(e02);
                                                f10 = AbstractC2048f0.h(bArr5, i47, c2045e02);
                                                int i80 = c2045e02.f23701a + f10;
                                                if (f10 < i80) {
                                                    AbstractC2048f0.n(bArr5, f10);
                                                    throw null;
                                                }
                                                if (f10 != i80) {
                                                    throw H0.f();
                                                }
                                                i24 = f10;
                                                i59 = i49;
                                                bArr4 = bArr5;
                                                i54 = 1;
                                                if (i24 != i47) {
                                                }
                                            } else {
                                                i54 = 1;
                                                if (i66 == 1) {
                                                    android.support.v4.media.session.b.a(e02);
                                                    AbstractC2048f0.n(bArr5, i47);
                                                    throw null;
                                                }
                                                i59 = i49;
                                                bArr4 = bArr5;
                                                i24 = i47;
                                                if (i24 != i47) {
                                                }
                                            }
                                            break;
                                        case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                                        case HVError.INSTRUCTION_ERROR /* 31 */:
                                        case RequestError.NO_DEV_KEY /* 41 */:
                                        case HVError.PERMISSION_REVOKED_ERROR /* 45 */:
                                            bArr5 = bArr;
                                            i65 = i46;
                                            c2045e02 = c2045e0;
                                            i49 = i59;
                                            unsafe = unsafe6;
                                            c10 = 2;
                                            i16 = i16;
                                            i47 = i71;
                                            i48 = i11;
                                            if (i66 == 2) {
                                                android.support.v4.media.session.b.a(e02);
                                                f10 = AbstractC2048f0.h(bArr5, i47, c2045e02);
                                                int i81 = c2045e02.f23701a + f10;
                                                if (f10 < i81) {
                                                    AbstractC2048f0.b(bArr5, f10);
                                                    throw null;
                                                }
                                                if (f10 != i81) {
                                                    throw H0.f();
                                                }
                                                i24 = f10;
                                                i59 = i49;
                                                bArr4 = bArr5;
                                                i54 = 1;
                                                if (i24 != i47) {
                                                }
                                            } else {
                                                if (i66 == 5) {
                                                    android.support.v4.media.session.b.a(e02);
                                                    AbstractC2048f0.b(bArr5, i47);
                                                    throw null;
                                                }
                                                i59 = i49;
                                                bArr4 = bArr5;
                                                i54 = 1;
                                                i24 = i47;
                                                if (i24 != i47) {
                                                }
                                            }
                                            break;
                                        case HVError.LOW_STORAGE_ERROR /* 25 */:
                                        case HVError.CONSENT_DENIED /* 42 */:
                                            bArr5 = bArr;
                                            i65 = i46;
                                            c2045e02 = c2045e0;
                                            i49 = i59;
                                            unsafe = unsafe6;
                                            c10 = 2;
                                            i16 = i16;
                                            i47 = i71;
                                            i48 = i11;
                                            if (i66 == 2) {
                                                android.support.v4.media.session.b.a(e02);
                                                f10 = AbstractC2048f0.h(bArr5, i47, c2045e02);
                                                int i82 = c2045e02.f23701a + f10;
                                                if (f10 < i82) {
                                                    AbstractC2048f0.k(bArr5, f10, c2045e02);
                                                    throw null;
                                                }
                                                if (f10 != i82) {
                                                    throw H0.f();
                                                }
                                                i24 = f10;
                                                i59 = i49;
                                                bArr4 = bArr5;
                                                i54 = 1;
                                                if (i24 != i47) {
                                                }
                                            } else {
                                                if (i66 == 0) {
                                                    android.support.v4.media.session.b.a(e02);
                                                    AbstractC2048f0.k(bArr5, i47, c2045e02);
                                                    long j14 = c2045e02.f23702b;
                                                    throw null;
                                                }
                                                i59 = i49;
                                                bArr4 = bArr5;
                                                i54 = 1;
                                                i24 = i47;
                                                if (i24 != i47) {
                                                }
                                            }
                                            break;
                                        case 26:
                                            bArr5 = bArr;
                                            i65 = i46;
                                            c2045e02 = c2045e0;
                                            i49 = i59;
                                            unsafe = unsafe6;
                                            c10 = 2;
                                            i16 = i16;
                                            i47 = i71;
                                            i48 = i11;
                                            if (i66 == 2) {
                                                if ((j12 & 536870912) == 0) {
                                                    f10 = AbstractC2048f0.h(bArr5, i47, c2045e02);
                                                    int i83 = c2045e02.f23701a;
                                                    if (i83 < 0) {
                                                        throw H0.c();
                                                    }
                                                    if (i83 == 0) {
                                                        e02.add(BuildConfig.FLAVOR);
                                                    } else {
                                                        e02.add(new String(bArr5, f10, i83, G0.f23597b));
                                                        f10 += i83;
                                                    }
                                                    while (f10 < i48) {
                                                        int h13 = AbstractC2048f0.h(bArr5, f10, c2045e02);
                                                        if (i16 == c2045e02.f23701a) {
                                                            f10 = AbstractC2048f0.h(bArr5, h13, c2045e02);
                                                            int i84 = c2045e02.f23701a;
                                                            if (i84 < 0) {
                                                                throw H0.c();
                                                            }
                                                            if (i84 == 0) {
                                                                e02.add(BuildConfig.FLAVOR);
                                                            } else {
                                                                e02.add(new String(bArr5, f10, i84, G0.f23597b));
                                                                f10 += i84;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    f10 = AbstractC2048f0.h(bArr5, i47, c2045e02);
                                                    int i85 = c2045e02.f23701a;
                                                    if (i85 < 0) {
                                                        throw H0.c();
                                                    }
                                                    if (i85 == 0) {
                                                        e02.add(BuildConfig.FLAVOR);
                                                    } else {
                                                        int i86 = f10 + i85;
                                                        if (!F1.c(bArr5, f10, i86)) {
                                                            throw H0.b();
                                                        }
                                                        e02.add(new String(bArr5, f10, i85, G0.f23597b));
                                                        f10 = i86;
                                                    }
                                                    while (f10 < i48) {
                                                        int h14 = AbstractC2048f0.h(bArr5, f10, c2045e02);
                                                        if (i16 == c2045e02.f23701a) {
                                                            f10 = AbstractC2048f0.h(bArr5, h14, c2045e02);
                                                            int i87 = c2045e02.f23701a;
                                                            if (i87 < 0) {
                                                                throw H0.c();
                                                            }
                                                            if (i87 == 0) {
                                                                e02.add(BuildConfig.FLAVOR);
                                                            } else {
                                                                int i88 = f10 + i87;
                                                                if (!F1.c(bArr5, f10, i88)) {
                                                                    throw H0.b();
                                                                }
                                                                e02.add(new String(bArr5, f10, i87, G0.f23597b));
                                                                f10 = i88;
                                                            }
                                                        }
                                                    }
                                                }
                                                i24 = f10;
                                                i59 = i49;
                                                bArr4 = bArr5;
                                                i54 = 1;
                                                if (i24 != i47) {
                                                }
                                            }
                                            i59 = i49;
                                            bArr4 = bArr5;
                                            i54 = 1;
                                            i24 = i47;
                                            if (i24 != i47) {
                                            }
                                            break;
                                        case 27:
                                            c2045e02 = c2045e0;
                                            c11 = 2;
                                            i50 = i11;
                                            if (i66 == 2) {
                                                unsafe = unsafe6;
                                                int e10 = AbstractC2048f0.e(A(i59), i16, bArr, i71, i11, e02, c2045e0);
                                                i65 = i46;
                                                i16 = i16;
                                                i48 = i50;
                                                i59 = i59;
                                                bArr4 = bArr;
                                                i24 = e10;
                                                i47 = i71;
                                                i54 = 1;
                                                if (i24 != i47) {
                                                }
                                            } else {
                                                unsafe = unsafe6;
                                                i65 = i46;
                                                bArr4 = bArr;
                                                i54 = 1;
                                                int i89 = i50;
                                                i16 = i16;
                                                i47 = i71;
                                                i48 = i89;
                                                i24 = i47;
                                                if (i24 != i47) {
                                                }
                                            }
                                            break;
                                        case 28:
                                            bArr6 = bArr;
                                            c2045e02 = c2045e0;
                                            unsafe3 = unsafe6;
                                            c11 = 2;
                                            i50 = i11;
                                            if (i66 == 2) {
                                                h11 = AbstractC2048f0.h(bArr6, i71, c2045e02);
                                                int i90 = c2045e02.f23701a;
                                                if (i90 < 0) {
                                                    throw H0.c();
                                                }
                                                if (i90 > bArr6.length - h11) {
                                                    throw H0.f();
                                                }
                                                if (i90 == 0) {
                                                    e02.add(AbstractC2081q0.f23760b);
                                                } else {
                                                    e02.add(AbstractC2081q0.v(bArr6, h11, i90));
                                                    h11 += i90;
                                                }
                                                while (h11 < i50) {
                                                    int h15 = AbstractC2048f0.h(bArr6, h11, c2045e02);
                                                    if (i16 == c2045e02.f23701a) {
                                                        h11 = AbstractC2048f0.h(bArr6, h15, c2045e02);
                                                        int i91 = c2045e02.f23701a;
                                                        if (i91 < 0) {
                                                            throw H0.c();
                                                        }
                                                        if (i91 > bArr6.length - h11) {
                                                            throw H0.f();
                                                        }
                                                        if (i91 == 0) {
                                                            e02.add(AbstractC2081q0.f23760b);
                                                        } else {
                                                            e02.add(AbstractC2081q0.v(bArr6, h11, i91));
                                                            h11 += i91;
                                                        }
                                                    } else {
                                                        i65 = i46;
                                                        i24 = h11;
                                                        bArr4 = bArr6;
                                                        unsafe = unsafe3;
                                                        i54 = 1;
                                                        int i92 = i50;
                                                        i16 = i16;
                                                        i47 = i71;
                                                        i48 = i92;
                                                        if (i24 != i47) {
                                                        }
                                                    }
                                                }
                                                i65 = i46;
                                                i24 = h11;
                                                bArr4 = bArr6;
                                                unsafe = unsafe3;
                                                i54 = 1;
                                                int i922 = i50;
                                                i16 = i16;
                                                i47 = i71;
                                                i48 = i922;
                                                if (i24 != i47) {
                                                }
                                            } else {
                                                i65 = i46;
                                                bArr4 = bArr6;
                                                unsafe = unsafe3;
                                                i54 = 1;
                                                int i892 = i50;
                                                i16 = i16;
                                                i47 = i71;
                                                i48 = i892;
                                                i24 = i47;
                                                if (i24 != i47) {
                                                }
                                            }
                                            break;
                                        case 30:
                                        case HVError.SDK_CLOSE_ERROR /* 44 */:
                                            bArr6 = bArr;
                                            c2045e02 = c2045e0;
                                            unsafe3 = unsafe6;
                                            i50 = i11;
                                            if (i66 == 2) {
                                                h11 = AbstractC2048f0.f(bArr6, i71, e02, c2045e02);
                                            } else {
                                                if (i66 == 0) {
                                                    h11 = AbstractC2048f0.j(i16, bArr, i71, i11, e02, c2045e0);
                                                }
                                                i65 = i46;
                                                bArr4 = bArr6;
                                                unsafe = unsafe3;
                                                i54 = 1;
                                                int i8922 = i50;
                                                i16 = i16;
                                                i47 = i71;
                                                i48 = i8922;
                                                i24 = i47;
                                                if (i24 != i47) {
                                                }
                                            }
                                            z(i59);
                                            int i93 = AbstractC2073n1.f23748d;
                                            i65 = i46;
                                            i24 = h11;
                                            bArr4 = bArr6;
                                            unsafe = unsafe3;
                                            i54 = 1;
                                            int i9222 = i50;
                                            i16 = i16;
                                            i47 = i71;
                                            i48 = i9222;
                                            if (i24 != i47) {
                                            }
                                            break;
                                        case HVError.GPS_ACCESS_DENIED /* 33 */:
                                        case 47:
                                            bArr6 = bArr;
                                            c2045e02 = c2045e0;
                                            unsafe3 = unsafe6;
                                            i50 = i11;
                                            if (i66 == 2) {
                                                android.support.v4.media.session.b.a(e02);
                                                h11 = AbstractC2048f0.h(bArr6, i71, c2045e02);
                                                int i94 = c2045e02.f23701a + h11;
                                                if (h11 < i94) {
                                                    AbstractC2048f0.h(bArr6, h11, c2045e02);
                                                    AbstractC2092u0.a(c2045e02.f23701a);
                                                    throw null;
                                                }
                                                if (h11 != i94) {
                                                    throw H0.f();
                                                }
                                                i65 = i46;
                                                i24 = h11;
                                                bArr4 = bArr6;
                                                unsafe = unsafe3;
                                                i54 = 1;
                                                int i92222 = i50;
                                                i16 = i16;
                                                i47 = i71;
                                                i48 = i92222;
                                                if (i24 != i47) {
                                                }
                                            } else {
                                                if (i66 == 0) {
                                                    android.support.v4.media.session.b.a(e02);
                                                    AbstractC2048f0.h(bArr6, i71, c2045e02);
                                                    AbstractC2092u0.a(c2045e02.f23701a);
                                                    throw null;
                                                }
                                                i65 = i46;
                                                bArr4 = bArr6;
                                                unsafe = unsafe3;
                                                i54 = 1;
                                                int i89222 = i50;
                                                i16 = i16;
                                                i47 = i71;
                                                i48 = i89222;
                                                i24 = i47;
                                                if (i24 != i47) {
                                                }
                                            }
                                            break;
                                        case 34:
                                        case 48:
                                            bArr6 = bArr;
                                            c2045e02 = c2045e0;
                                            unsafe3 = unsafe6;
                                            i50 = i11;
                                            if (i66 == 2) {
                                                android.support.v4.media.session.b.a(e02);
                                                h11 = AbstractC2048f0.h(bArr6, i71, c2045e02);
                                                int i95 = c2045e02.f23701a + h11;
                                                if (h11 < i95) {
                                                    AbstractC2048f0.k(bArr6, h11, c2045e02);
                                                    AbstractC2092u0.b(c2045e02.f23702b);
                                                    throw null;
                                                }
                                                if (h11 != i95) {
                                                    throw H0.f();
                                                }
                                                i65 = i46;
                                                i24 = h11;
                                                bArr4 = bArr6;
                                                unsafe = unsafe3;
                                                i54 = 1;
                                                int i922222 = i50;
                                                i16 = i16;
                                                i47 = i71;
                                                i48 = i922222;
                                                if (i24 != i47) {
                                                }
                                            } else {
                                                if (i66 == 0) {
                                                    android.support.v4.media.session.b.a(e02);
                                                    AbstractC2048f0.k(bArr6, i71, c2045e02);
                                                    AbstractC2092u0.b(c2045e02.f23702b);
                                                    throw null;
                                                }
                                                i65 = i46;
                                                bArr4 = bArr6;
                                                unsafe = unsafe3;
                                                i54 = 1;
                                                int i892222 = i50;
                                                i16 = i16;
                                                i47 = i71;
                                                i48 = i892222;
                                                i24 = i47;
                                                if (i24 != i47) {
                                                }
                                            }
                                            break;
                                        default:
                                            char c12 = 3;
                                            if (i66 == 3) {
                                                InterfaceC2067l1 A10 = A(i59);
                                                int i96 = (i16 & (-8)) | 4;
                                                c2045e02 = c2045e0;
                                                h11 = AbstractC2048f0.c(A10, bArr, i71, i11, i96, c2045e0);
                                                e02.add(c2045e02.f23703c);
                                                int i97 = i11;
                                                while (true) {
                                                    if (h11 < i97) {
                                                        bArr6 = bArr;
                                                        int h16 = AbstractC2048f0.h(bArr6, h11, c2045e02);
                                                        if (i16 == c2045e02.f23701a) {
                                                            h11 = AbstractC2048f0.c(A10, bArr, h16, i11, i96, c2045e0);
                                                            e02.add(c2045e02.f23703c);
                                                            i97 = i97;
                                                            unsafe6 = unsafe6;
                                                            c12 = 3;
                                                        }
                                                    } else {
                                                        bArr6 = bArr;
                                                    }
                                                }
                                                unsafe3 = unsafe6;
                                                i50 = i97;
                                                i65 = i46;
                                                i24 = h11;
                                                bArr4 = bArr6;
                                                unsafe = unsafe3;
                                                i54 = 1;
                                                int i9222222 = i50;
                                                i16 = i16;
                                                i47 = i71;
                                                i48 = i9222222;
                                                if (i24 != i47) {
                                                }
                                            } else {
                                                c2045e02 = c2045e0;
                                                bArr4 = bArr;
                                                i65 = i46;
                                                unsafe = unsafe6;
                                                i54 = 1;
                                                i16 = i16;
                                                i47 = i71;
                                                i48 = i11;
                                                i24 = i47;
                                                if (i24 != i47) {
                                                }
                                            }
                                            break;
                                    }
                                }
                            } else if (i66 == 2) {
                                E0 e03 = (E0) unsafe5.getObject(obj4, j10);
                                if (!e03.a()) {
                                    int size2 = e03.size();
                                    e03 = e03.l(size2 != 0 ? size2 + size2 : 10);
                                    unsafe5.putObject(obj4, j10, e03);
                                }
                                i57 = AbstractC2048f0.e(A(i69), i16, bArr, i71, i11, e03, c2045e0);
                                i51 = i11;
                                i58 = i65;
                                unsafe4 = unsafe5;
                                i59 = i69;
                                i61 = i16;
                                i53 = 3;
                                i62 = i70;
                                i55 = 0;
                                i56 = -1;
                                i54 = 1;
                                bArr7 = bArr;
                                i52 = i12;
                                c2045e04 = c2045e05;
                            } else {
                                i40 = i70;
                                i22 = 0;
                                unsafe = unsafe5;
                                i59 = i69;
                                i65 = i65;
                                i41 = 1;
                                bArr2 = bArr;
                                obj3 = obj4;
                                c2045e02 = c2045e05;
                                i42 = i71;
                                i13 = i12;
                                i23 = i41;
                                i24 = i42;
                                i62 = i40;
                                i19 = 3;
                                i21 = i59;
                                obj2 = obj3;
                            }
                        } else {
                            int i98 = iArr[i18 + 2];
                            int i99 = 1 << (i98 >>> 20);
                            int i100 = 1048575;
                            int i101 = i98 & 1048575;
                            int i102 = i62;
                            if (i101 != i102) {
                                if (i102 != 1048575) {
                                    unsafe4.putInt(obj4, i102, i60);
                                    i100 = 1048575;
                                }
                                i26 = i101 == i100 ? 0 : unsafe4.getInt(obj4, i101);
                                i27 = i101;
                            } else {
                                i26 = i60;
                                i27 = i102;
                            }
                            switch (w10) {
                                case 0:
                                    i16 = i68;
                                    c2045e03 = c2045e04;
                                    i30 = i65;
                                    i54 = 1;
                                    i29 = 3;
                                    i20 = -1;
                                    i31 = i18;
                                    unsafe2 = unsafe4;
                                    i28 = i63;
                                    if (i66 != 1) {
                                        i13 = i12;
                                        i23 = i54;
                                        unsafe = unsafe2;
                                        i24 = i28;
                                        i62 = i27;
                                        i19 = i29;
                                        i60 = i26;
                                        i22 = 0;
                                        obj2 = obj4;
                                        c2045e02 = c2045e03;
                                        i21 = i31;
                                        i65 = i30;
                                        break;
                                    } else {
                                        B1.l(obj4, j10, Double.longBitsToDouble(AbstractC2048f0.n(bArr7, i28)));
                                        i57 = i28 + 8;
                                        i51 = i11;
                                        i52 = i12;
                                        unsafe4 = unsafe2;
                                        i59 = i31;
                                        c2045e04 = c2045e03;
                                        i61 = i16;
                                        i62 = i27;
                                        i53 = 3;
                                        i56 = -1;
                                        i58 = i30;
                                        i55 = 0;
                                        i60 = i26 | i99;
                                        break;
                                    }
                                case 1:
                                    i16 = i68;
                                    c2045e03 = c2045e04;
                                    i30 = i65;
                                    i29 = 3;
                                    i20 = -1;
                                    i31 = i18;
                                    unsafe2 = unsafe4;
                                    i28 = i63;
                                    if (i66 != 5) {
                                        i54 = 1;
                                        i13 = i12;
                                        i23 = i54;
                                        unsafe = unsafe2;
                                        i24 = i28;
                                        i62 = i27;
                                        i19 = i29;
                                        i60 = i26;
                                        i22 = 0;
                                        obj2 = obj4;
                                        c2045e02 = c2045e03;
                                        i21 = i31;
                                        i65 = i30;
                                        break;
                                    } else {
                                        B1.m(obj4, j10, Float.intBitsToFloat(AbstractC2048f0.b(bArr7, i28)));
                                        i57 = i28 + 4;
                                        i32 = i26 | i99;
                                        i51 = i11;
                                        i52 = i12;
                                        unsafe4 = unsafe2;
                                        i59 = i31;
                                        c2045e04 = c2045e03;
                                        i61 = i16;
                                        i62 = i27;
                                        i53 = i29;
                                        i56 = i20;
                                        i58 = i30;
                                        i55 = 0;
                                        i60 = i32;
                                        i54 = 1;
                                        break;
                                    }
                                case 2:
                                case 3:
                                    i16 = i68;
                                    c2045e03 = c2045e04;
                                    i30 = i65;
                                    i29 = 3;
                                    i20 = -1;
                                    i31 = i18;
                                    unsafe2 = unsafe4;
                                    i28 = i63;
                                    if (i66 != 0) {
                                        i54 = 1;
                                        i13 = i12;
                                        i23 = i54;
                                        unsafe = unsafe2;
                                        i24 = i28;
                                        i62 = i27;
                                        i19 = i29;
                                        i60 = i26;
                                        i22 = 0;
                                        obj2 = obj4;
                                        c2045e02 = c2045e03;
                                        i21 = i31;
                                        i65 = i30;
                                        break;
                                    } else {
                                        i57 = AbstractC2048f0.k(bArr7, i28, c2045e03);
                                        unsafe2.putLong(obj, j10, c2045e03.f23702b);
                                        i32 = i26 | i99;
                                        i51 = i11;
                                        i52 = i12;
                                        unsafe4 = unsafe2;
                                        i59 = i31;
                                        c2045e04 = c2045e03;
                                        i61 = i16;
                                        i62 = i27;
                                        i53 = i29;
                                        i56 = i20;
                                        i58 = i30;
                                        i55 = 0;
                                        i60 = i32;
                                        i54 = 1;
                                        break;
                                    }
                                case 4:
                                case 11:
                                    i16 = i68;
                                    c2045e03 = c2045e04;
                                    i30 = i65;
                                    i29 = 3;
                                    i20 = -1;
                                    i31 = i18;
                                    unsafe2 = unsafe4;
                                    i28 = i63;
                                    if (i66 != 0) {
                                        i54 = 1;
                                        i13 = i12;
                                        i23 = i54;
                                        unsafe = unsafe2;
                                        i24 = i28;
                                        i62 = i27;
                                        i19 = i29;
                                        i60 = i26;
                                        i22 = 0;
                                        obj2 = obj4;
                                        c2045e02 = c2045e03;
                                        i21 = i31;
                                        i65 = i30;
                                        break;
                                    } else {
                                        i57 = AbstractC2048f0.h(bArr7, i28, c2045e03);
                                        unsafe2.putInt(obj4, j10, c2045e03.f23701a);
                                        i32 = i26 | i99;
                                        i51 = i11;
                                        i52 = i12;
                                        unsafe4 = unsafe2;
                                        i59 = i31;
                                        c2045e04 = c2045e03;
                                        i61 = i16;
                                        i62 = i27;
                                        i53 = i29;
                                        i56 = i20;
                                        i58 = i30;
                                        i55 = 0;
                                        i60 = i32;
                                        i54 = 1;
                                        break;
                                    }
                                case 5:
                                case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                                    i16 = i68;
                                    int i103 = i63;
                                    c2045e03 = c2045e04;
                                    i30 = i65;
                                    i54 = 1;
                                    i29 = 3;
                                    i20 = -1;
                                    i31 = i18;
                                    unsafe2 = unsafe4;
                                    if (i66 != 1) {
                                        i28 = i103;
                                        i13 = i12;
                                        i23 = i54;
                                        unsafe = unsafe2;
                                        i24 = i28;
                                        i62 = i27;
                                        i19 = i29;
                                        i60 = i26;
                                        i22 = 0;
                                        obj2 = obj4;
                                        c2045e02 = c2045e03;
                                        i21 = i31;
                                        i65 = i30;
                                        break;
                                    } else {
                                        unsafe2.putLong(obj, j10, AbstractC2048f0.n(bArr7, i103));
                                        i57 = i103 + 8;
                                        i32 = i26 | i99;
                                        i51 = i11;
                                        i52 = i12;
                                        unsafe4 = unsafe2;
                                        i59 = i31;
                                        c2045e04 = c2045e03;
                                        i61 = i16;
                                        i62 = i27;
                                        i53 = i29;
                                        i56 = i20;
                                        i58 = i30;
                                        i55 = 0;
                                        i60 = i32;
                                        i54 = 1;
                                        break;
                                    }
                                case 6:
                                case 13:
                                    i16 = i68;
                                    i33 = i63;
                                    c2045e03 = c2045e04;
                                    i30 = i65;
                                    i29 = 3;
                                    i20 = -1;
                                    i31 = i18;
                                    unsafe2 = unsafe4;
                                    i34 = 0;
                                    if (i66 != 5) {
                                        i28 = i33;
                                        i54 = 1;
                                        i13 = i12;
                                        i23 = i54;
                                        unsafe = unsafe2;
                                        i24 = i28;
                                        i62 = i27;
                                        i19 = i29;
                                        i60 = i26;
                                        i22 = 0;
                                        obj2 = obj4;
                                        c2045e02 = c2045e03;
                                        i21 = i31;
                                        i65 = i30;
                                        break;
                                    } else {
                                        unsafe2.putInt(obj4, j10, AbstractC2048f0.b(bArr7, i33));
                                        i57 = i33 + 4;
                                        i35 = i26 | i99;
                                        i51 = i11;
                                        i52 = i12;
                                        c2045e04 = c2045e03;
                                        i61 = i16;
                                        i55 = i34;
                                        i62 = i27;
                                        i53 = i29;
                                        i56 = i20;
                                        i58 = i30;
                                        i60 = i35;
                                        unsafe4 = unsafe2;
                                        i59 = i31;
                                        i54 = 1;
                                        break;
                                    }
                                case 7:
                                    i16 = i68;
                                    i33 = i63;
                                    c2045e03 = c2045e04;
                                    i30 = i65;
                                    i29 = 3;
                                    i20 = -1;
                                    i31 = i18;
                                    unsafe2 = unsafe4;
                                    i34 = 0;
                                    if (i66 != 0) {
                                        i28 = i33;
                                        i54 = 1;
                                        i13 = i12;
                                        i23 = i54;
                                        unsafe = unsafe2;
                                        i24 = i28;
                                        i62 = i27;
                                        i19 = i29;
                                        i60 = i26;
                                        i22 = 0;
                                        obj2 = obj4;
                                        c2045e02 = c2045e03;
                                        i21 = i31;
                                        i65 = i30;
                                        break;
                                    } else {
                                        i57 = AbstractC2048f0.k(bArr7, i33, c2045e03);
                                        B1.k(obj4, j10, c2045e03.f23702b != 0);
                                        i35 = i26 | i99;
                                        i51 = i11;
                                        i52 = i12;
                                        c2045e04 = c2045e03;
                                        i61 = i16;
                                        i55 = i34;
                                        i62 = i27;
                                        i53 = i29;
                                        i56 = i20;
                                        i58 = i30;
                                        i60 = i35;
                                        unsafe4 = unsafe2;
                                        i59 = i31;
                                        i54 = 1;
                                        break;
                                    }
                                case 8:
                                    i16 = i68;
                                    i33 = i63;
                                    c2045e03 = c2045e04;
                                    i30 = i65;
                                    i20 = -1;
                                    i31 = i18;
                                    unsafe2 = unsafe4;
                                    int i104 = 3;
                                    if (i66 != 2) {
                                        i29 = 3;
                                        i28 = i33;
                                        i54 = 1;
                                        i13 = i12;
                                        i23 = i54;
                                        unsafe = unsafe2;
                                        i24 = i28;
                                        i62 = i27;
                                        i19 = i29;
                                        i60 = i26;
                                        i22 = 0;
                                        obj2 = obj4;
                                        c2045e02 = c2045e03;
                                        i21 = i31;
                                        i65 = i30;
                                        break;
                                    } else {
                                        if ((i67 & 536870912) != 0) {
                                            int h17 = AbstractC2048f0.h(bArr7, i33, c2045e03);
                                            int i105 = c2045e03.f23701a;
                                            if (i105 < 0) {
                                                throw H0.c();
                                            }
                                            if (i105 == 0) {
                                                c2045e03.f23703c = BuildConfig.FLAVOR;
                                                i57 = h17;
                                                i29 = 3;
                                                i34 = 0;
                                            } else {
                                                int i106 = F1.f23595b;
                                                int length = bArr7.length;
                                                if ((((length - h17) - i105) | h17 | i105) < 0) {
                                                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(h17), Integer.valueOf(i105)));
                                                }
                                                int i107 = h17 + i105;
                                                char[] cArr = new char[i105];
                                                int i108 = 0;
                                                while (h17 < i107) {
                                                    byte b12 = bArr7[h17];
                                                    if (C1.d(b12)) {
                                                        h17++;
                                                        cArr[i108] = (char) b12;
                                                        i108++;
                                                    } else {
                                                        while (true) {
                                                            int i109 = 1;
                                                            while (h17 < i107) {
                                                                i36 = h17 + 1;
                                                                b10 = bArr7[h17];
                                                                if (C1.d(b10)) {
                                                                    cArr[i108] = (char) b10;
                                                                    i108++;
                                                                    h17 = i36;
                                                                    while (h17 < i107) {
                                                                        byte b13 = bArr7[h17];
                                                                        if (C1.d(b13)) {
                                                                            h17 += i109;
                                                                            cArr[i108] = (char) b13;
                                                                            i108++;
                                                                            i109 = 1;
                                                                        }
                                                                    }
                                                                } else {
                                                                    if (b10 < -32) {
                                                                        if (i36 >= i107) {
                                                                            throw H0.b();
                                                                        }
                                                                        h17 += 2;
                                                                        i37 = i108 + 1;
                                                                        C1.c(b10, bArr7[i36], cArr, i108);
                                                                    } else if (b10 < -16) {
                                                                        if (i36 >= i107 - 1) {
                                                                            throw H0.b();
                                                                        }
                                                                        int i110 = h17 + 2;
                                                                        h17 += 3;
                                                                        i37 = i108 + 1;
                                                                        C1.b(b10, bArr7[i36], bArr7[i110], cArr, i108);
                                                                    } else {
                                                                        if (i36 >= i107 - 2) {
                                                                            throw H0.b();
                                                                        }
                                                                        byte b14 = bArr7[i36];
                                                                        int i111 = h17 + 3;
                                                                        byte b15 = bArr7[h17 + 2];
                                                                        h17 += 4;
                                                                        C1.a(b10, b14, b15, bArr7[i111], cArr, i108);
                                                                        i108 += 2;
                                                                        i104 = 3;
                                                                    }
                                                                    i108 = i37;
                                                                }
                                                                i109 = 1;
                                                                i104 = 3;
                                                            }
                                                            i29 = i104;
                                                            i34 = 0;
                                                            c2045e03.f23703c = new String(cArr, 0, i108);
                                                            i57 = i107;
                                                        }
                                                    }
                                                }
                                                while (true) {
                                                    int i1092 = 1;
                                                    while (h17 < i107) {
                                                    }
                                                    i29 = i104;
                                                    i34 = 0;
                                                    c2045e03.f23703c = new String(cArr, 0, i108);
                                                    i57 = i107;
                                                    byte b142 = bArr7[i36];
                                                    int i1112 = h17 + 3;
                                                    byte b152 = bArr7[h17 + 2];
                                                    h17 += 4;
                                                    C1.a(b10, b142, b152, bArr7[i1112], cArr, i108);
                                                    i108 += 2;
                                                    i104 = 3;
                                                }
                                            }
                                        } else {
                                            i29 = 3;
                                            i34 = 0;
                                            int h18 = AbstractC2048f0.h(bArr7, i33, c2045e03);
                                            int i112 = c2045e03.f23701a;
                                            if (i112 < 0) {
                                                throw H0.c();
                                            }
                                            if (i112 == 0) {
                                                c2045e03.f23703c = BuildConfig.FLAVOR;
                                            } else {
                                                c2045e03.f23703c = new String(bArr7, h18, i112, G0.f23597b);
                                                h18 += i112;
                                            }
                                            i57 = h18;
                                        }
                                        unsafe2.putObject(obj4, j10, c2045e03.f23703c);
                                        i35 = i26 | i99;
                                        i51 = i11;
                                        i52 = i12;
                                        c2045e04 = c2045e03;
                                        i61 = i16;
                                        i55 = i34;
                                        i62 = i27;
                                        i53 = i29;
                                        i56 = i20;
                                        i58 = i30;
                                        i60 = i35;
                                        unsafe4 = unsafe2;
                                        i59 = i31;
                                        i54 = 1;
                                        break;
                                    }
                                case 9:
                                    i16 = i68;
                                    c2045e03 = c2045e04;
                                    i30 = i65;
                                    i20 = -1;
                                    i31 = i18;
                                    unsafe2 = unsafe4;
                                    i38 = 3;
                                    if (i66 != 2) {
                                        i29 = i38;
                                        i54 = 1;
                                        i28 = i63;
                                        i13 = i12;
                                        i23 = i54;
                                        unsafe = unsafe2;
                                        i24 = i28;
                                        i62 = i27;
                                        i19 = i29;
                                        i60 = i26;
                                        i22 = 0;
                                        obj2 = obj4;
                                        c2045e02 = c2045e03;
                                        i21 = i31;
                                        i65 = i30;
                                        break;
                                    } else {
                                        Object C10 = C(obj4, i31);
                                        i51 = i11;
                                        int m10 = AbstractC2048f0.m(C10, A(i31), bArr, i63, i51, c2045e0);
                                        d(obj4, i31, C10);
                                        i39 = i26 | i99;
                                        i52 = i12;
                                        i57 = m10;
                                        c2045e04 = c2045e03;
                                        i61 = i16;
                                        i53 = i38;
                                        i62 = i27;
                                        i56 = i20;
                                        i58 = i30;
                                        i54 = 1;
                                        i55 = 0;
                                        i60 = i39;
                                        unsafe4 = unsafe2;
                                        i59 = i31;
                                        break;
                                    }
                                case RequestError.EVENT_TIMEOUT /* 10 */:
                                    i16 = i68;
                                    c2045e03 = c2045e04;
                                    i30 = i65;
                                    i20 = -1;
                                    i31 = i18;
                                    unsafe2 = unsafe4;
                                    i38 = 3;
                                    if (i66 != 2) {
                                        i29 = i38;
                                        i54 = 1;
                                        i28 = i63;
                                        i13 = i12;
                                        i23 = i54;
                                        unsafe = unsafe2;
                                        i24 = i28;
                                        i62 = i27;
                                        i19 = i29;
                                        i60 = i26;
                                        i22 = 0;
                                        obj2 = obj4;
                                        c2045e02 = c2045e03;
                                        i21 = i31;
                                        i65 = i30;
                                        break;
                                    } else {
                                        i57 = AbstractC2048f0.a(bArr7, i63, c2045e03);
                                        unsafe2.putObject(obj4, j10, c2045e03.f23703c);
                                        i39 = i26 | i99;
                                        i51 = i11;
                                        i52 = i12;
                                        c2045e04 = c2045e03;
                                        i61 = i16;
                                        i53 = i38;
                                        i62 = i27;
                                        i56 = i20;
                                        i58 = i30;
                                        i54 = 1;
                                        i55 = 0;
                                        i60 = i39;
                                        unsafe4 = unsafe2;
                                        i59 = i31;
                                        break;
                                    }
                                case 12:
                                    i16 = i68;
                                    c2045e03 = c2045e04;
                                    i30 = i65;
                                    i20 = -1;
                                    i31 = i18;
                                    unsafe2 = unsafe4;
                                    i38 = 3;
                                    if (i66 != 0) {
                                        i29 = i38;
                                        i54 = 1;
                                        i28 = i63;
                                        i13 = i12;
                                        i23 = i54;
                                        unsafe = unsafe2;
                                        i24 = i28;
                                        i62 = i27;
                                        i19 = i29;
                                        i60 = i26;
                                        i22 = 0;
                                        obj2 = obj4;
                                        c2045e02 = c2045e03;
                                        i21 = i31;
                                        i65 = i30;
                                        break;
                                    } else {
                                        i57 = AbstractC2048f0.h(bArr7, i63, c2045e03);
                                        int i113 = c2045e03.f23701a;
                                        z(i31);
                                        unsafe2.putInt(obj4, j10, i113);
                                        i35 = i26 | i99;
                                        i51 = i11;
                                        i52 = i12;
                                        c2045e04 = c2045e03;
                                        i61 = i16;
                                        i53 = i38;
                                        i62 = i27;
                                        i56 = i20;
                                        i58 = i30;
                                        i55 = 0;
                                        i60 = i35;
                                        unsafe4 = unsafe2;
                                        i59 = i31;
                                        i54 = 1;
                                        break;
                                    }
                                case HVError.SSL_CONNECT_ERROR /* 15 */:
                                    i16 = i68;
                                    c2045e03 = c2045e04;
                                    i30 = i65;
                                    Unsafe unsafe10 = unsafe4;
                                    i38 = 3;
                                    i20 = -1;
                                    i31 = i18;
                                    if (i66 != 0) {
                                        unsafe2 = unsafe10;
                                        i29 = i38;
                                        i54 = 1;
                                        i28 = i63;
                                        i13 = i12;
                                        i23 = i54;
                                        unsafe = unsafe2;
                                        i24 = i28;
                                        i62 = i27;
                                        i19 = i29;
                                        i60 = i26;
                                        i22 = 0;
                                        obj2 = obj4;
                                        c2045e02 = c2045e03;
                                        i21 = i31;
                                        i65 = i30;
                                        break;
                                    } else {
                                        i57 = AbstractC2048f0.h(bArr7, i63, c2045e03);
                                        unsafe2 = unsafe10;
                                        unsafe2.putInt(obj4, j10, AbstractC2092u0.a(c2045e03.f23701a));
                                        i35 = i26 | i99;
                                        i51 = i11;
                                        i52 = i12;
                                        c2045e04 = c2045e03;
                                        i61 = i16;
                                        i53 = i38;
                                        i62 = i27;
                                        i56 = i20;
                                        i58 = i30;
                                        i55 = 0;
                                        i60 = i35;
                                        unsafe4 = unsafe2;
                                        i59 = i31;
                                        i54 = 1;
                                        break;
                                    }
                                case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                                    i16 = i68;
                                    Unsafe unsafe11 = unsafe4;
                                    i20 = -1;
                                    i31 = i18;
                                    if (i66 != 0) {
                                        c2045e03 = c2045e04;
                                        i30 = i65;
                                        unsafe2 = unsafe11;
                                        i28 = i63;
                                        i29 = 3;
                                        i54 = 1;
                                        i13 = i12;
                                        i23 = i54;
                                        unsafe = unsafe2;
                                        i24 = i28;
                                        i62 = i27;
                                        i19 = i29;
                                        i60 = i26;
                                        i22 = 0;
                                        obj2 = obj4;
                                        c2045e02 = c2045e03;
                                        i21 = i31;
                                        i65 = i30;
                                        break;
                                    } else {
                                        i57 = AbstractC2048f0.k(bArr7, i63, c2045e04);
                                        unsafe11.putLong(obj, j10, AbstractC2092u0.b(c2045e04.f23702b));
                                        i32 = i26 | i99;
                                        i51 = i11;
                                        i52 = i12;
                                        i59 = i31;
                                        c2045e04 = c2045e04;
                                        i61 = i16;
                                        i53 = 3;
                                        i62 = i27;
                                        i56 = -1;
                                        i58 = i65;
                                        i55 = 0;
                                        unsafe4 = unsafe11;
                                        i60 = i32;
                                        i54 = 1;
                                        break;
                                    }
                                default:
                                    i53 = 3;
                                    if (i66 != 3) {
                                        Unsafe unsafe12 = unsafe4;
                                        i20 = -1;
                                        i28 = i63;
                                        c2045e03 = c2045e04;
                                        i29 = 3;
                                        i16 = i68;
                                        i30 = i65;
                                        i54 = 1;
                                        i31 = i18;
                                        unsafe2 = unsafe12;
                                        i13 = i12;
                                        i23 = i54;
                                        unsafe = unsafe2;
                                        i24 = i28;
                                        i62 = i27;
                                        i19 = i29;
                                        i60 = i26;
                                        i22 = 0;
                                        obj2 = obj4;
                                        c2045e02 = c2045e03;
                                        i21 = i31;
                                        i65 = i30;
                                        break;
                                    } else {
                                        Object C11 = C(obj4, i18);
                                        int i114 = i18;
                                        i57 = AbstractC2048f0.l(C11, A(i18), bArr, i63, i11, (i65 << 3) | 4, c2045e0);
                                        d(obj4, i114, C11);
                                        unsafe4 = unsafe4;
                                        i58 = i65;
                                        i61 = i68;
                                        i59 = i114;
                                        i62 = i27;
                                        i56 = -1;
                                        i55 = 0;
                                        i51 = i11;
                                        i52 = i12;
                                        i60 = i26 | i99;
                                        i54 = 1;
                                        break;
                                    }
                            }
                        }
                    } else {
                        i19 = i53;
                        i13 = i52;
                        obj2 = obj4;
                        i20 = i56;
                        i21 = i55;
                        i22 = i21;
                        unsafe = unsafe4;
                        c2045e02 = c2045e04;
                        i16 = i64;
                        i23 = i54;
                        i24 = i63;
                    }
                    if (i16 == i13 || i13 == 0) {
                        i25 = AbstractC2048f0.g(i16, bArr, i24, i11, r(obj), c2045e0);
                        bArr7 = bArr;
                        i51 = i11;
                        c2045e04 = c2045e02;
                        i52 = i13;
                        obj4 = obj2;
                        i58 = i65;
                        i59 = i21;
                        i61 = i16;
                        i55 = i22;
                        i56 = i20;
                        i53 = i19;
                        unsafe4 = unsafe;
                        int i722 = i23;
                        i57 = i25;
                        i54 = i722;
                    } else {
                        i54 = i23;
                        i17 = i62;
                        i14 = 1048575;
                        i57 = i24;
                        i15 = i60;
                    }
                } else {
                    v10 = v(i65, i55);
                }
                i18 = v10;
                if (i18 == i56) {
                }
                if (i16 == i13) {
                }
                i25 = AbstractC2048f0.g(i16, bArr, i24, i11, r(obj), c2045e0);
                bArr7 = bArr;
                i51 = i11;
                c2045e04 = c2045e02;
                i52 = i13;
                obj4 = obj2;
                i58 = i65;
                i59 = i21;
                i61 = i16;
                i55 = i22;
                i56 = i20;
                i53 = i19;
                unsafe4 = unsafe;
                int i7222 = i23;
                i57 = i25;
                i54 = i7222;
            } else {
                i13 = i52;
                obj2 = obj4;
                unsafe = unsafe4;
                i14 = 1048575;
                i15 = i60;
                i16 = i61;
                i17 = i62;
            }
        }
    }
}
