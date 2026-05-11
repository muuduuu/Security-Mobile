package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import co.hyperverge.hypersnapsdk.activities.HVRetakeActivity;
import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
final class S1 implements InterfaceC2460i2 {

    /* renamed from: p, reason: collision with root package name */
    private static final int[] f24794p = new int[0];

    /* renamed from: q, reason: collision with root package name */
    private static final Unsafe f24795q = J2.l();

    /* renamed from: a, reason: collision with root package name */
    private final int[] f24796a;

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f24797b;

    /* renamed from: c, reason: collision with root package name */
    private final int f24798c;

    /* renamed from: d, reason: collision with root package name */
    private final int f24799d;

    /* renamed from: e, reason: collision with root package name */
    private final P1 f24800e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f24801f;

    /* renamed from: g, reason: collision with root package name */
    private final int[] f24802g;

    /* renamed from: h, reason: collision with root package name */
    private final int f24803h;

    /* renamed from: i, reason: collision with root package name */
    private final int f24804i;

    /* renamed from: j, reason: collision with root package name */
    private final E1 f24805j;

    /* renamed from: k, reason: collision with root package name */
    private final AbstractC2539y2 f24806k;

    /* renamed from: l, reason: collision with root package name */
    private final R0 f24807l;

    /* renamed from: m, reason: collision with root package name */
    private final int f24808m;

    /* renamed from: n, reason: collision with root package name */
    private final U1 f24809n;

    /* renamed from: o, reason: collision with root package name */
    private final K1 f24810o;

    private S1(int[] iArr, Object[] objArr, int i10, int i11, P1 p12, int i12, boolean z10, int[] iArr2, int i13, int i14, U1 u12, E1 e12, AbstractC2539y2 abstractC2539y2, R0 r02, K1 k12) {
        this.f24796a = iArr;
        this.f24797b = objArr;
        this.f24798c = i10;
        this.f24799d = i11;
        this.f24808m = i12;
        boolean z11 = false;
        if (r02 != null && r02.g(p12)) {
            z11 = true;
        }
        this.f24801f = z11;
        this.f24802g = iArr2;
        this.f24803h = i13;
        this.f24804i = i14;
        this.f24809n = u12;
        this.f24805j = e12;
        this.f24806k = abstractC2539y2;
        this.f24807l = r02;
        this.f24800e = p12;
        this.f24810o = k12;
    }

    private static boolean A(Object obj, int i10, InterfaceC2460i2 interfaceC2460i2) {
        return interfaceC2460i2.d(J2.k(obj, i10 & 1048575));
    }

    private static boolean B(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC2444f1) {
            return ((AbstractC2444f1) obj).y();
        }
        return true;
    }

    private final boolean C(Object obj, int i10, int i11) {
        return J2.h(obj, (long) (R(i11) & 1048575)) == i10;
    }

    private static boolean D(Object obj, long j10) {
        return ((Boolean) J2.k(obj, j10)).booleanValue();
    }

    private static final void E(int i10, Object obj, R2 r22) {
        if (obj instanceof String) {
            r22.b(i10, (String) obj);
        } else {
            r22.h(i10, (E0) obj);
        }
    }

    static C2544z2 G(Object obj) {
        AbstractC2444f1 abstractC2444f1 = (AbstractC2444f1) obj;
        C2544z2 c2544z2 = abstractC2444f1.zzc;
        if (c2544z2 != C2544z2.c()) {
            return c2544z2;
        }
        C2544z2 f10 = C2544z2.f();
        abstractC2444f1.zzc = f10;
        return f10;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0256  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static S1 H(Class cls, M1 m12, U1 u12, E1 e12, AbstractC2539y2 abstractC2539y2, R0 r02, K1 k12) {
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
        Field o10;
        char charAt11;
        int i34;
        int i35;
        Object obj;
        Field o11;
        Object obj2;
        Field o12;
        int i36;
        char charAt12;
        int i37;
        char charAt13;
        int i38;
        char charAt14;
        int i39;
        char charAt15;
        if (!(m12 instanceof Z1)) {
            android.support.v4.media.session.b.a(m12);
            throw null;
        }
        Z1 z12 = (Z1) m12;
        String b10 = z12.b();
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
            iArr = f24794p;
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
        Unsafe unsafe = f24795q;
        Object[] c11 = z12.c();
        Class<?> cls2 = z12.zza().getClass();
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
                    if (i86 == 12 && (z12.a() == 1 || (charAt24 & 2048) != 0)) {
                        int i89 = i71 / 3;
                        i35 = i11 + 1;
                        objArr[i89 + i89 + 1] = c11[i11];
                    }
                    int i90 = charAt25 + charAt25;
                    obj = c11[i90];
                    if (obj instanceof Field) {
                        o11 = o(cls2, (String) obj);
                        c11[i90] = o11;
                    } else {
                        o11 = (Field) obj;
                    }
                    int i91 = i12;
                    i27 = i15;
                    i33 = (int) unsafe.objectFieldOffset(o11);
                    int i92 = i90 + 1;
                    obj2 = c11[i92];
                    if (obj2 instanceof Field) {
                        o12 = o(cls2, (String) obj2);
                        c11[i92] = o12;
                    } else {
                        o12 = (Field) obj2;
                    }
                    str = b10;
                    i28 = i91;
                    i30 = i11;
                    i31 = i87;
                    i29 = (int) unsafe.objectFieldOffset(o12);
                    i32 = 0;
                }
                i11 = i35;
                int i902 = charAt25 + charAt25;
                obj = c11[i902];
                if (obj instanceof Field) {
                }
                int i912 = i12;
                i27 = i15;
                i33 = (int) unsafe.objectFieldOffset(o11);
                int i922 = i902 + 1;
                obj2 = c11[i922];
                if (obj2 instanceof Field) {
                }
                str = b10;
                i28 = i912;
                i30 = i11;
                i31 = i87;
                i29 = (int) unsafe.objectFieldOffset(o12);
                i32 = 0;
            } else {
                i26 = length;
                int i93 = i12;
                i27 = i15;
                int i94 = i11 + 1;
                Field o13 = o(cls2, (String) c11[i11]);
                if (i82 == 9 || i82 == 17) {
                    i28 = i93;
                    int i95 = i71 / 3;
                    objArr[i95 + i95 + 1] = o13.getType();
                } else {
                    if (i82 == 27 || i82 == 49) {
                        i28 = i93;
                        int i96 = i71 / 3;
                        i34 = i11 + 2;
                        objArr[i96 + i96 + 1] = c11[i94];
                    } else if (i82 == 12 || i82 == 30 || i82 == 44) {
                        i28 = i93;
                        if (z12.a() == 1 || (charAt24 & 2048) != 0) {
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
                int objectFieldOffset = (int) unsafe.objectFieldOffset(o13);
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
                        o10 = (Field) obj3;
                    } else {
                        o10 = o(cls2, (String) obj3);
                        c11[i105] = o10;
                    }
                    i30 = i94;
                    i32 = charAt26 % 32;
                    i29 = (int) unsafe.objectFieldOffset(o10);
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
            iArr2[i106] = i33 | ((charAt24 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? 268435456 : 0) | ((charAt24 & 512) != 0 ? 536870912 : 0) | (i82 << 20);
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
        return new S1(iArr2, objArr, i12, i15, z12.zza(), z12.a(), false, iArr, i13, i68, u12, e12, abstractC2539y2, r02, k12);
    }

    private static double I(Object obj, long j10) {
        return ((Double) J2.k(obj, j10)).doubleValue();
    }

    private static float J(Object obj, long j10) {
        return ((Float) J2.k(obj, j10)).floatValue();
    }

    private final int K(Object obj) {
        int i10;
        int A10;
        int A11;
        int B10;
        int A12;
        int A13;
        int A14;
        int A15;
        int K10;
        int A16;
        int B11;
        int A17;
        int A18;
        Unsafe unsafe = f24795q;
        int i11 = 0;
        int i12 = 0;
        int i13 = 1048575;
        for (int i14 = 0; i14 < this.f24796a.length; i14 += 3) {
            int U10 = U(i14);
            int[] iArr = this.f24796a;
            int i15 = iArr[i14];
            int T10 = T(U10);
            if (T10 <= 17) {
                int i16 = iArr[i14 + 2];
                int i17 = i16 & 1048575;
                int i18 = i16 >>> 20;
                if (i17 != i13) {
                    i12 = unsafe.getInt(obj, i17);
                    i13 = i17;
                }
                i10 = 1 << i18;
            } else {
                i10 = 0;
            }
            long j10 = U10 & 1048575;
            switch (T10) {
                case 0:
                    if ((i12 & i10) != 0) {
                        A10 = M0.A(i15 << 3);
                        K10 = A10 + 8;
                        i11 += K10;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if ((i12 & i10) != 0) {
                        A11 = M0.A(i15 << 3);
                        K10 = A11 + 4;
                        i11 += K10;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if ((i12 & i10) != 0) {
                        B10 = M0.B(unsafe.getLong(obj, j10));
                        A12 = M0.A(i15 << 3);
                        i11 += A12 + B10;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if ((i12 & i10) != 0) {
                        B10 = M0.B(unsafe.getLong(obj, j10));
                        A12 = M0.A(i15 << 3);
                        i11 += A12 + B10;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if ((i12 & i10) != 0) {
                        B10 = M0.w(unsafe.getInt(obj, j10));
                        A12 = M0.A(i15 << 3);
                        i11 += A12 + B10;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if ((i12 & i10) != 0) {
                        A10 = M0.A(i15 << 3);
                        K10 = A10 + 8;
                        i11 += K10;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if ((i12 & i10) != 0) {
                        A11 = M0.A(i15 << 3);
                        K10 = A11 + 4;
                        i11 += K10;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if ((i12 & i10) != 0) {
                        A13 = M0.A(i15 << 3);
                        K10 = A13 + 1;
                        i11 += K10;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if ((i12 & i10) != 0) {
                        Object object = unsafe.getObject(obj, j10);
                        if (object instanceof E0) {
                            int i19 = i15 << 3;
                            int i20 = M0.f24784d;
                            int j11 = ((E0) object).j();
                            A14 = M0.A(j11) + j11;
                            A15 = M0.A(i19);
                            K10 = A15 + A14;
                            i11 += K10;
                            break;
                        } else {
                            B10 = M0.z((String) object);
                            A12 = M0.A(i15 << 3);
                            i11 += A12 + B10;
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if ((i12 & i10) != 0) {
                        K10 = AbstractC2470k2.K(i15, unsafe.getObject(obj, j10), c(i14));
                        i11 += K10;
                        break;
                    } else {
                        break;
                    }
                case RequestError.EVENT_TIMEOUT /* 10 */:
                    if ((i12 & i10) != 0) {
                        E0 e02 = (E0) unsafe.getObject(obj, j10);
                        int i21 = i15 << 3;
                        int i22 = M0.f24784d;
                        int j12 = e02.j();
                        A14 = M0.A(j12) + j12;
                        A15 = M0.A(i21);
                        K10 = A15 + A14;
                        i11 += K10;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if ((i12 & i10) != 0) {
                        B10 = M0.A(unsafe.getInt(obj, j10));
                        A12 = M0.A(i15 << 3);
                        i11 += A12 + B10;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if ((i12 & i10) != 0) {
                        B10 = M0.w(unsafe.getInt(obj, j10));
                        A12 = M0.A(i15 << 3);
                        i11 += A12 + B10;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if ((i12 & i10) != 0) {
                        A11 = M0.A(i15 << 3);
                        K10 = A11 + 4;
                        i11 += K10;
                        break;
                    } else {
                        break;
                    }
                case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                    if ((i12 & i10) != 0) {
                        A10 = M0.A(i15 << 3);
                        K10 = A10 + 8;
                        i11 += K10;
                        break;
                    } else {
                        break;
                    }
                case HVError.SSL_CONNECT_ERROR /* 15 */:
                    if ((i12 & i10) != 0) {
                        int i23 = unsafe.getInt(obj, j10);
                        A12 = M0.A(i15 << 3);
                        B10 = M0.A((i23 >> 31) ^ (i23 + i23));
                        i11 += A12 + B10;
                        break;
                    } else {
                        break;
                    }
                case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                    if ((i10 & i12) != 0) {
                        long j13 = unsafe.getLong(obj, j10);
                        A16 = M0.A(i15 << 3);
                        B11 = M0.B((j13 + j13) ^ (j13 >> 63));
                        K10 = A16 + B11;
                        i11 += K10;
                        break;
                    } else {
                        break;
                    }
                case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                    if ((i12 & i10) != 0) {
                        K10 = M0.v(i15, (P1) unsafe.getObject(obj, j10), c(i14));
                        i11 += K10;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    K10 = AbstractC2470k2.D(i15, (List) unsafe.getObject(obj, j10), false);
                    i11 += K10;
                    break;
                case 19:
                    K10 = AbstractC2470k2.B(i15, (List) unsafe.getObject(obj, j10), false);
                    i11 += K10;
                    break;
                case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                    K10 = AbstractC2470k2.I(i15, (List) unsafe.getObject(obj, j10), false);
                    i11 += K10;
                    break;
                case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                    K10 = AbstractC2470k2.T(i15, (List) unsafe.getObject(obj, j10), false);
                    i11 += K10;
                    break;
                case HVError.FACE_DETECTION_ERROR /* 22 */:
                    K10 = AbstractC2470k2.G(i15, (List) unsafe.getObject(obj, j10), false);
                    i11 += K10;
                    break;
                case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                    K10 = AbstractC2470k2.D(i15, (List) unsafe.getObject(obj, j10), false);
                    i11 += K10;
                    break;
                case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                    K10 = AbstractC2470k2.B(i15, (List) unsafe.getObject(obj, j10), false);
                    i11 += K10;
                    break;
                case HVError.LOW_STORAGE_ERROR /* 25 */:
                    K10 = AbstractC2470k2.x(i15, (List) unsafe.getObject(obj, j10), false);
                    i11 += K10;
                    break;
                case 26:
                    K10 = AbstractC2470k2.Q(i15, (List) unsafe.getObject(obj, j10));
                    i11 += K10;
                    break;
                case 27:
                    K10 = AbstractC2470k2.L(i15, (List) unsafe.getObject(obj, j10), c(i14));
                    i11 += K10;
                    break;
                case 28:
                    K10 = AbstractC2470k2.y(i15, (List) unsafe.getObject(obj, j10));
                    i11 += K10;
                    break;
                case 29:
                    K10 = AbstractC2470k2.R(i15, (List) unsafe.getObject(obj, j10), false);
                    i11 += K10;
                    break;
                case 30:
                    K10 = AbstractC2470k2.z(i15, (List) unsafe.getObject(obj, j10), false);
                    i11 += K10;
                    break;
                case HVError.INSTRUCTION_ERROR /* 31 */:
                    K10 = AbstractC2470k2.B(i15, (List) unsafe.getObject(obj, j10), false);
                    i11 += K10;
                    break;
                case 32:
                    K10 = AbstractC2470k2.D(i15, (List) unsafe.getObject(obj, j10), false);
                    i11 += K10;
                    break;
                case HVError.GPS_ACCESS_DENIED /* 33 */:
                    K10 = AbstractC2470k2.M(i15, (List) unsafe.getObject(obj, j10), false);
                    i11 += K10;
                    break;
                case 34:
                    K10 = AbstractC2470k2.O(i15, (List) unsafe.getObject(obj, j10), false);
                    i11 += K10;
                    break;
                case HVError.FACE_CAPTURE_TIMEOUT /* 35 */:
                    B10 = AbstractC2470k2.E((List) unsafe.getObject(obj, j10));
                    if (B10 > 0) {
                        int i24 = i15 << 3;
                        A17 = M0.A(B10);
                        A18 = M0.A(i24);
                        A12 = A18 + A17;
                        i11 += A12 + B10;
                        break;
                    } else {
                        break;
                    }
                case HVError.HYPER_DOC_DETECT_ERROR /* 36 */:
                    B10 = AbstractC2470k2.C((List) unsafe.getObject(obj, j10));
                    if (B10 > 0) {
                        int i25 = i15 << 3;
                        A17 = M0.A(B10);
                        A18 = M0.A(i25);
                        A12 = A18 + A17;
                        i11 += A12 + B10;
                        break;
                    } else {
                        break;
                    }
                case HVError.INVALID_FILE_ERROR /* 37 */:
                    B10 = AbstractC2470k2.J((List) unsafe.getObject(obj, j10));
                    if (B10 > 0) {
                        int i26 = i15 << 3;
                        A17 = M0.A(B10);
                        A18 = M0.A(i26);
                        A12 = A18 + A17;
                        i11 += A12 + B10;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    B10 = AbstractC2470k2.U((List) unsafe.getObject(obj, j10));
                    if (B10 > 0) {
                        int i27 = i15 << 3;
                        A17 = M0.A(B10);
                        A18 = M0.A(i27);
                        A12 = A18 + A17;
                        i11 += A12 + B10;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    B10 = AbstractC2470k2.H((List) unsafe.getObject(obj, j10));
                    if (B10 > 0) {
                        int i28 = i15 << 3;
                        A17 = M0.A(B10);
                        A18 = M0.A(i28);
                        A12 = A18 + A17;
                        i11 += A12 + B10;
                        break;
                    } else {
                        break;
                    }
                case RequestError.NETWORK_FAILURE /* 40 */:
                    B10 = AbstractC2470k2.E((List) unsafe.getObject(obj, j10));
                    if (B10 > 0) {
                        int i29 = i15 << 3;
                        A17 = M0.A(B10);
                        A18 = M0.A(i29);
                        A12 = A18 + A17;
                        i11 += A12 + B10;
                        break;
                    } else {
                        break;
                    }
                case RequestError.NO_DEV_KEY /* 41 */:
                    B10 = AbstractC2470k2.C((List) unsafe.getObject(obj, j10));
                    if (B10 > 0) {
                        int i30 = i15 << 3;
                        A17 = M0.A(B10);
                        A18 = M0.A(i30);
                        A12 = A18 + A17;
                        i11 += A12 + B10;
                        break;
                    } else {
                        break;
                    }
                case HVError.CONSENT_DENIED /* 42 */:
                    List list = (List) unsafe.getObject(obj, j10);
                    int i31 = AbstractC2470k2.f24881d;
                    B10 = list.size();
                    if (B10 > 0) {
                        int i32 = i15 << 3;
                        A17 = M0.A(B10);
                        A18 = M0.A(i32);
                        A12 = A18 + A17;
                        i11 += A12 + B10;
                        break;
                    } else {
                        break;
                    }
                case HVError.ENCRYPTION_ERROR /* 43 */:
                    B10 = AbstractC2470k2.S((List) unsafe.getObject(obj, j10));
                    if (B10 > 0) {
                        int i33 = i15 << 3;
                        A17 = M0.A(B10);
                        A18 = M0.A(i33);
                        A12 = A18 + A17;
                        i11 += A12 + B10;
                        break;
                    } else {
                        break;
                    }
                case HVError.SDK_CLOSE_ERROR /* 44 */:
                    B10 = AbstractC2470k2.A((List) unsafe.getObject(obj, j10));
                    if (B10 > 0) {
                        int i34 = i15 << 3;
                        A17 = M0.A(B10);
                        A18 = M0.A(i34);
                        A12 = A18 + A17;
                        i11 += A12 + B10;
                        break;
                    } else {
                        break;
                    }
                case HVError.PERMISSION_REVOKED_ERROR /* 45 */:
                    B10 = AbstractC2470k2.C((List) unsafe.getObject(obj, j10));
                    if (B10 > 0) {
                        int i35 = i15 << 3;
                        A17 = M0.A(B10);
                        A18 = M0.A(i35);
                        A12 = A18 + A17;
                        i11 += A12 + B10;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    B10 = AbstractC2470k2.E((List) unsafe.getObject(obj, j10));
                    if (B10 > 0) {
                        int i36 = i15 << 3;
                        A17 = M0.A(B10);
                        A18 = M0.A(i36);
                        A12 = A18 + A17;
                        i11 += A12 + B10;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    B10 = AbstractC2470k2.N((List) unsafe.getObject(obj, j10));
                    if (B10 > 0) {
                        int i37 = i15 << 3;
                        A17 = M0.A(B10);
                        A18 = M0.A(i37);
                        A12 = A18 + A17;
                        i11 += A12 + B10;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    B10 = AbstractC2470k2.P((List) unsafe.getObject(obj, j10));
                    if (B10 > 0) {
                        int i38 = i15 << 3;
                        A17 = M0.A(B10);
                        A18 = M0.A(i38);
                        A12 = A18 + A17;
                        i11 += A12 + B10;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    K10 = AbstractC2470k2.F(i15, (List) unsafe.getObject(obj, j10), c(i14));
                    i11 += K10;
                    break;
                case 50:
                    K1.a(i15, unsafe.getObject(obj, j10), l(i14));
                    break;
                case 51:
                    if (C(obj, i15, i14)) {
                        A10 = M0.A(i15 << 3);
                        K10 = A10 + 8;
                        i11 += K10;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (C(obj, i15, i14)) {
                        A11 = M0.A(i15 << 3);
                        K10 = A11 + 4;
                        i11 += K10;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (C(obj, i15, i14)) {
                        B10 = M0.B(V(obj, j10));
                        A12 = M0.A(i15 << 3);
                        i11 += A12 + B10;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (C(obj, i15, i14)) {
                        B10 = M0.B(V(obj, j10));
                        A12 = M0.A(i15 << 3);
                        i11 += A12 + B10;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (C(obj, i15, i14)) {
                        B10 = M0.w(L(obj, j10));
                        A12 = M0.A(i15 << 3);
                        i11 += A12 + B10;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (C(obj, i15, i14)) {
                        A10 = M0.A(i15 << 3);
                        K10 = A10 + 8;
                        i11 += K10;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (C(obj, i15, i14)) {
                        A11 = M0.A(i15 << 3);
                        K10 = A11 + 4;
                        i11 += K10;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (C(obj, i15, i14)) {
                        A13 = M0.A(i15 << 3);
                        K10 = A13 + 1;
                        i11 += K10;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (C(obj, i15, i14)) {
                        Object object2 = unsafe.getObject(obj, j10);
                        if (object2 instanceof E0) {
                            int i39 = i15 << 3;
                            int i40 = M0.f24784d;
                            int j14 = ((E0) object2).j();
                            A14 = M0.A(j14) + j14;
                            A15 = M0.A(i39);
                            K10 = A15 + A14;
                            i11 += K10;
                            break;
                        } else {
                            B10 = M0.z((String) object2);
                            A12 = M0.A(i15 << 3);
                            i11 += A12 + B10;
                            break;
                        }
                    } else {
                        break;
                    }
                case HVError.DETECTOR_NOT_AVAILABLE_ERROR /* 60 */:
                    if (C(obj, i15, i14)) {
                        K10 = AbstractC2470k2.K(i15, unsafe.getObject(obj, j10), c(i14));
                        i11 += K10;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (C(obj, i15, i14)) {
                        E0 e03 = (E0) unsafe.getObject(obj, j10);
                        int i41 = i15 << 3;
                        int i42 = M0.f24784d;
                        int j15 = e03.j();
                        A14 = M0.A(j15) + j15;
                        A15 = M0.A(i41);
                        K10 = A15 + A14;
                        i11 += K10;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (C(obj, i15, i14)) {
                        B10 = M0.A(L(obj, j10));
                        A12 = M0.A(i15 << 3);
                        i11 += A12 + B10;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (C(obj, i15, i14)) {
                        B10 = M0.w(L(obj, j10));
                        A12 = M0.A(i15 << 3);
                        i11 += A12 + B10;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (C(obj, i15, i14)) {
                        A11 = M0.A(i15 << 3);
                        K10 = A11 + 4;
                        i11 += K10;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (C(obj, i15, i14)) {
                        A10 = M0.A(i15 << 3);
                        K10 = A10 + 8;
                        i11 += K10;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (C(obj, i15, i14)) {
                        int L10 = L(obj, j10);
                        A12 = M0.A(i15 << 3);
                        B10 = M0.A((L10 >> 31) ^ (L10 + L10));
                        i11 += A12 + B10;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (C(obj, i15, i14)) {
                        long V10 = V(obj, j10);
                        A16 = M0.A(i15 << 3);
                        B11 = M0.B((V10 + V10) ^ (V10 >> 63));
                        K10 = A16 + B11;
                        i11 += K10;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (C(obj, i15, i14)) {
                        K10 = M0.v(i15, (P1) unsafe.getObject(obj, j10), c(i14));
                        i11 += K10;
                        break;
                    } else {
                        break;
                    }
            }
        }
        AbstractC2539y2 abstractC2539y2 = this.f24806k;
        int a10 = i11 + abstractC2539y2.a(abstractC2539y2.d(obj));
        if (!this.f24801f) {
            return a10;
        }
        V0 b10 = this.f24807l.b(obj);
        int i43 = 0;
        for (int i44 = 0; i44 < b10.f24818a.b(); i44++) {
            Map.Entry g10 = b10.f24818a.g(i44);
            i43 += V0.a((U0) g10.getKey(), g10.getValue());
        }
        for (Map.Entry entry : b10.f24818a.c()) {
            i43 += V0.a((U0) entry.getKey(), entry.getValue());
        }
        return a10 + i43;
    }

    private static int L(Object obj, long j10) {
        return ((Integer) J2.k(obj, j10)).intValue();
    }

    private final int M(Object obj, byte[] bArr, int i10, int i11, int i12, long j10, C2502r0 c2502r0) {
        Unsafe unsafe = f24795q;
        Object l10 = l(i12);
        Object object = unsafe.getObject(obj, j10);
        if (!((J1) object).i()) {
            J1 b10 = J1.a().b();
            K1.b(b10, object);
            unsafe.putObject(obj, j10, b10);
        }
        android.support.v4.media.session.b.a(l10);
        throw null;
    }

    private final int N(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, C2502r0 c2502r0) {
        Unsafe unsafe = f24795q;
        long j11 = this.f24796a[i17 + 2] & 1048575;
        switch (i16) {
            case 51:
                if (i14 == 1) {
                    unsafe.putObject(obj, j10, Double.valueOf(Double.longBitsToDouble(AbstractC2507s0.q(bArr, i10))));
                    int i18 = i10 + 8;
                    unsafe.putInt(obj, j11, i13);
                    return i18;
                }
                break;
            case 52:
                if (i14 == 5) {
                    unsafe.putObject(obj, j10, Float.valueOf(Float.intBitsToFloat(AbstractC2507s0.b(bArr, i10))));
                    int i19 = i10 + 4;
                    unsafe.putInt(obj, j11, i13);
                    return i19;
                }
                break;
            case 53:
            case 54:
                if (i14 == 0) {
                    int m10 = AbstractC2507s0.m(bArr, i10, c2502r0);
                    unsafe.putObject(obj, j10, Long.valueOf(c2502r0.f24919b));
                    unsafe.putInt(obj, j11, i13);
                    return m10;
                }
                break;
            case 55:
            case 62:
                if (i14 == 0) {
                    int j12 = AbstractC2507s0.j(bArr, i10, c2502r0);
                    unsafe.putObject(obj, j10, Integer.valueOf(c2502r0.f24918a));
                    unsafe.putInt(obj, j11, i13);
                    return j12;
                }
                break;
            case 56:
            case 65:
                if (i14 == 1) {
                    unsafe.putObject(obj, j10, Long.valueOf(AbstractC2507s0.q(bArr, i10)));
                    int i20 = i10 + 8;
                    unsafe.putInt(obj, j11, i13);
                    return i20;
                }
                break;
            case 57:
            case 64:
                if (i14 == 5) {
                    unsafe.putObject(obj, j10, Integer.valueOf(AbstractC2507s0.b(bArr, i10)));
                    int i21 = i10 + 4;
                    unsafe.putInt(obj, j11, i13);
                    return i21;
                }
                break;
            case 58:
                if (i14 == 0) {
                    int m11 = AbstractC2507s0.m(bArr, i10, c2502r0);
                    unsafe.putObject(obj, j10, Boolean.valueOf(c2502r0.f24919b != 0));
                    unsafe.putInt(obj, j11, i13);
                    return m11;
                }
                break;
            case 59:
                if (i14 == 2) {
                    int j13 = AbstractC2507s0.j(bArr, i10, c2502r0);
                    int i22 = c2502r0.f24918a;
                    if (i22 == 0) {
                        unsafe.putObject(obj, j10, BuildConfig.FLAVOR);
                    } else {
                        if ((i15 & 536870912) != 0 && !O2.h(bArr, j13, j13 + i22)) {
                            throw C2499q1.c();
                        }
                        unsafe.putObject(obj, j10, new String(bArr, j13, i22, AbstractC2489o1.f24885b));
                        j13 += i22;
                    }
                    unsafe.putInt(obj, j11, i13);
                    return j13;
                }
                break;
            case HVError.DETECTOR_NOT_AVAILABLE_ERROR /* 60 */:
                if (i14 == 2) {
                    Object n10 = n(obj, i13, i17);
                    int o10 = AbstractC2507s0.o(n10, c(i17), bArr, i10, i11, c2502r0);
                    v(obj, i13, i17, n10);
                    return o10;
                }
                break;
            case 61:
                if (i14 == 2) {
                    int a10 = AbstractC2507s0.a(bArr, i10, c2502r0);
                    unsafe.putObject(obj, j10, c2502r0.f24920c);
                    unsafe.putInt(obj, j11, i13);
                    return a10;
                }
                break;
            case 63:
                if (i14 == 0) {
                    int j14 = AbstractC2507s0.j(bArr, i10, c2502r0);
                    int i23 = c2502r0.f24918a;
                    InterfaceC2464j1 a11 = a(i17);
                    if (a11 == null || a11.b(i23)) {
                        unsafe.putObject(obj, j10, Integer.valueOf(i23));
                        unsafe.putInt(obj, j11, i13);
                    } else {
                        G(obj).j(i12, Long.valueOf(i23));
                    }
                    return j14;
                }
                break;
            case 66:
                if (i14 == 0) {
                    int j15 = AbstractC2507s0.j(bArr, i10, c2502r0);
                    unsafe.putObject(obj, j10, Integer.valueOf(I0.a(c2502r0.f24918a)));
                    unsafe.putInt(obj, j11, i13);
                    return j15;
                }
                break;
            case 67:
                if (i14 == 0) {
                    int m12 = AbstractC2507s0.m(bArr, i10, c2502r0);
                    unsafe.putObject(obj, j10, Long.valueOf(I0.b(c2502r0.f24919b)));
                    unsafe.putInt(obj, j11, i13);
                    return m12;
                }
                break;
            case 68:
                if (i14 == 3) {
                    Object n11 = n(obj, i13, i17);
                    int n12 = AbstractC2507s0.n(n11, c(i17), bArr, i10, i11, (i12 & (-8)) | 4, c2502r0);
                    v(obj, i13, i17, n11);
                    return n12;
                }
                break;
        }
        return i10;
    }

    private final int O(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, long j10, int i16, long j11, C2502r0 c2502r0) {
        int i17;
        int i18;
        int l10;
        int i19 = i10;
        Unsafe unsafe = f24795q;
        InterfaceC2484n1 interfaceC2484n1 = (InterfaceC2484n1) unsafe.getObject(obj, j11);
        if (!interfaceC2484n1.a()) {
            int size = interfaceC2484n1.size();
            interfaceC2484n1 = interfaceC2484n1.l(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j11, interfaceC2484n1);
        }
        Object obj2 = null;
        switch (i16) {
            case 18:
            case HVError.FACE_CAPTURE_TIMEOUT /* 35 */:
                if (i14 == 2) {
                    android.support.v4.media.session.b.a(interfaceC2484n1);
                    int j12 = AbstractC2507s0.j(bArr, i19, c2502r0);
                    int i20 = c2502r0.f24918a + j12;
                    if (j12 < i20) {
                        Double.longBitsToDouble(AbstractC2507s0.q(bArr, j12));
                        throw null;
                    }
                    if (j12 == i20) {
                        return j12;
                    }
                    throw C2499q1.g();
                }
                if (i14 == 1) {
                    android.support.v4.media.session.b.a(interfaceC2484n1);
                    Double.longBitsToDouble(AbstractC2507s0.q(bArr, i10));
                    throw null;
                }
                break;
            case 19:
            case HVError.HYPER_DOC_DETECT_ERROR /* 36 */:
                if (i14 == 2) {
                    X0 x02 = (X0) interfaceC2484n1;
                    int j13 = AbstractC2507s0.j(bArr, i19, c2502r0);
                    int i21 = c2502r0.f24918a + j13;
                    while (j13 < i21) {
                        x02.M1(Float.intBitsToFloat(AbstractC2507s0.b(bArr, j13)));
                        j13 += 4;
                    }
                    if (j13 == i21) {
                        return j13;
                    }
                    throw C2499q1.g();
                }
                if (i14 == 5) {
                    X0 x03 = (X0) interfaceC2484n1;
                    x03.M1(Float.intBitsToFloat(AbstractC2507s0.b(bArr, i10)));
                    while (true) {
                        i17 = i19 + 4;
                        if (i17 < i11) {
                            i19 = AbstractC2507s0.j(bArr, i17, c2502r0);
                            if (i12 == c2502r0.f24918a) {
                                x03.M1(Float.intBitsToFloat(AbstractC2507s0.b(bArr, i19)));
                            }
                        }
                    }
                    return i17;
                }
                break;
            case HVRetakeActivity.CLOSE_ACTION /* 20 */:
            case HVRetakeActivity.RECHECK_ACTION /* 21 */:
            case HVError.INVALID_FILE_ERROR /* 37 */:
            case 38:
                if (i14 == 2) {
                    android.support.v4.media.session.b.a(interfaceC2484n1);
                    int j14 = AbstractC2507s0.j(bArr, i19, c2502r0);
                    int i22 = c2502r0.f24918a + j14;
                    if (j14 < i22) {
                        AbstractC2507s0.m(bArr, j14, c2502r0);
                        throw null;
                    }
                    if (j14 == i22) {
                        return j14;
                    }
                    throw C2499q1.g();
                }
                if (i14 == 0) {
                    android.support.v4.media.session.b.a(interfaceC2484n1);
                    AbstractC2507s0.m(bArr, i19, c2502r0);
                    long j15 = c2502r0.f24919b;
                    throw null;
                }
                break;
            case HVError.FACE_DETECTION_ERROR /* 22 */:
            case 29:
            case 39:
            case HVError.ENCRYPTION_ERROR /* 43 */:
                if (i14 == 2) {
                    return AbstractC2507s0.f(bArr, i19, interfaceC2484n1, c2502r0);
                }
                if (i14 == 0) {
                    return AbstractC2507s0.l(i12, bArr, i10, i11, interfaceC2484n1, c2502r0);
                }
                break;
            case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
            case 32:
            case RequestError.NETWORK_FAILURE /* 40 */:
            case 46:
                if (i14 == 2) {
                    android.support.v4.media.session.b.a(interfaceC2484n1);
                    int j16 = AbstractC2507s0.j(bArr, i19, c2502r0);
                    int i23 = c2502r0.f24918a + j16;
                    if (j16 < i23) {
                        AbstractC2507s0.q(bArr, j16);
                        throw null;
                    }
                    if (j16 == i23) {
                        return j16;
                    }
                    throw C2499q1.g();
                }
                if (i14 == 1) {
                    android.support.v4.media.session.b.a(interfaceC2484n1);
                    AbstractC2507s0.q(bArr, i10);
                    throw null;
                }
                break;
            case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
            case HVError.INSTRUCTION_ERROR /* 31 */:
            case RequestError.NO_DEV_KEY /* 41 */:
            case HVError.PERMISSION_REVOKED_ERROR /* 45 */:
                if (i14 == 2) {
                    C2449g1 c2449g1 = (C2449g1) interfaceC2484n1;
                    int j17 = AbstractC2507s0.j(bArr, i19, c2502r0);
                    int i24 = c2502r0.f24918a + j17;
                    while (j17 < i24) {
                        c2449g1.j(AbstractC2507s0.b(bArr, j17));
                        j17 += 4;
                    }
                    if (j17 == i24) {
                        return j17;
                    }
                    throw C2499q1.g();
                }
                if (i14 == 5) {
                    C2449g1 c2449g12 = (C2449g1) interfaceC2484n1;
                    c2449g12.j(AbstractC2507s0.b(bArr, i10));
                    while (true) {
                        i18 = i19 + 4;
                        if (i18 < i11) {
                            i19 = AbstractC2507s0.j(bArr, i18, c2502r0);
                            if (i12 == c2502r0.f24918a) {
                                c2449g12.j(AbstractC2507s0.b(bArr, i19));
                            }
                        }
                    }
                    return i18;
                }
                break;
            case HVError.LOW_STORAGE_ERROR /* 25 */:
            case HVError.CONSENT_DENIED /* 42 */:
                if (i14 == 2) {
                    android.support.v4.media.session.b.a(interfaceC2484n1);
                    int j18 = AbstractC2507s0.j(bArr, i19, c2502r0);
                    int i25 = c2502r0.f24918a + j18;
                    if (j18 < i25) {
                        AbstractC2507s0.m(bArr, j18, c2502r0);
                        throw null;
                    }
                    if (j18 == i25) {
                        return j18;
                    }
                    throw C2499q1.g();
                }
                if (i14 == 0) {
                    android.support.v4.media.session.b.a(interfaceC2484n1);
                    AbstractC2507s0.m(bArr, i19, c2502r0);
                    long j19 = c2502r0.f24919b;
                    throw null;
                }
                break;
            case 26:
                if (i14 == 2) {
                    if ((j10 & 536870912) == 0) {
                        int j20 = AbstractC2507s0.j(bArr, i19, c2502r0);
                        int i26 = c2502r0.f24918a;
                        if (i26 < 0) {
                            throw C2499q1.d();
                        }
                        if (i26 == 0) {
                            interfaceC2484n1.add(BuildConfig.FLAVOR);
                        } else {
                            interfaceC2484n1.add(new String(bArr, j20, i26, AbstractC2489o1.f24885b));
                            j20 += i26;
                        }
                        while (j20 < i11) {
                            int j21 = AbstractC2507s0.j(bArr, j20, c2502r0);
                            if (i12 != c2502r0.f24918a) {
                                return j20;
                            }
                            j20 = AbstractC2507s0.j(bArr, j21, c2502r0);
                            int i27 = c2502r0.f24918a;
                            if (i27 < 0) {
                                throw C2499q1.d();
                            }
                            if (i27 == 0) {
                                interfaceC2484n1.add(BuildConfig.FLAVOR);
                            } else {
                                interfaceC2484n1.add(new String(bArr, j20, i27, AbstractC2489o1.f24885b));
                                j20 += i27;
                            }
                        }
                        return j20;
                    }
                    int j22 = AbstractC2507s0.j(bArr, i19, c2502r0);
                    int i28 = c2502r0.f24918a;
                    if (i28 < 0) {
                        throw C2499q1.d();
                    }
                    if (i28 == 0) {
                        interfaceC2484n1.add(BuildConfig.FLAVOR);
                    } else {
                        int i29 = j22 + i28;
                        if (!O2.h(bArr, j22, i29)) {
                            throw C2499q1.c();
                        }
                        interfaceC2484n1.add(new String(bArr, j22, i28, AbstractC2489o1.f24885b));
                        j22 = i29;
                    }
                    while (j22 < i11) {
                        int j23 = AbstractC2507s0.j(bArr, j22, c2502r0);
                        if (i12 != c2502r0.f24918a) {
                            return j22;
                        }
                        j22 = AbstractC2507s0.j(bArr, j23, c2502r0);
                        int i30 = c2502r0.f24918a;
                        if (i30 < 0) {
                            throw C2499q1.d();
                        }
                        if (i30 == 0) {
                            interfaceC2484n1.add(BuildConfig.FLAVOR);
                        } else {
                            int i31 = j22 + i30;
                            if (!O2.h(bArr, j22, i31)) {
                                throw C2499q1.c();
                            }
                            interfaceC2484n1.add(new String(bArr, j22, i30, AbstractC2489o1.f24885b));
                            j22 = i31;
                        }
                    }
                    return j22;
                }
                break;
            case 27:
                if (i14 == 2) {
                    return AbstractC2507s0.e(c(i15), i12, bArr, i10, i11, interfaceC2484n1, c2502r0);
                }
                break;
            case 28:
                if (i14 == 2) {
                    int j24 = AbstractC2507s0.j(bArr, i19, c2502r0);
                    int i32 = c2502r0.f24918a;
                    if (i32 < 0) {
                        throw C2499q1.d();
                    }
                    if (i32 > bArr.length - j24) {
                        throw C2499q1.g();
                    }
                    if (i32 == 0) {
                        interfaceC2484n1.add(E0.f24749b);
                    } else {
                        interfaceC2484n1.add(E0.G(bArr, j24, i32));
                        j24 += i32;
                    }
                    while (j24 < i11) {
                        int j25 = AbstractC2507s0.j(bArr, j24, c2502r0);
                        if (i12 != c2502r0.f24918a) {
                            return j24;
                        }
                        j24 = AbstractC2507s0.j(bArr, j25, c2502r0);
                        int i33 = c2502r0.f24918a;
                        if (i33 < 0) {
                            throw C2499q1.d();
                        }
                        if (i33 > bArr.length - j24) {
                            throw C2499q1.g();
                        }
                        if (i33 == 0) {
                            interfaceC2484n1.add(E0.f24749b);
                        } else {
                            interfaceC2484n1.add(E0.G(bArr, j24, i33));
                            j24 += i33;
                        }
                    }
                    return j24;
                }
                break;
            case 30:
            case HVError.SDK_CLOSE_ERROR /* 44 */:
                if (i14 == 2) {
                    l10 = AbstractC2507s0.f(bArr, i19, interfaceC2484n1, c2502r0);
                } else if (i14 == 0) {
                    l10 = AbstractC2507s0.l(i12, bArr, i10, i11, interfaceC2484n1, c2502r0);
                }
                InterfaceC2464j1 a10 = a(i15);
                AbstractC2539y2 abstractC2539y2 = this.f24806k;
                int i34 = AbstractC2470k2.f24881d;
                if (a10 != null) {
                    if (interfaceC2484n1 != null) {
                        int size2 = interfaceC2484n1.size();
                        int i35 = 0;
                        for (int i36 = 0; i36 < size2; i36++) {
                            Integer num = (Integer) interfaceC2484n1.get(i36);
                            int intValue = num.intValue();
                            if (a10.b(intValue)) {
                                if (i36 != i35) {
                                    interfaceC2484n1.set(i35, num);
                                }
                                i35++;
                            } else {
                                obj2 = AbstractC2470k2.a(obj, i13, intValue, obj2, abstractC2539y2);
                            }
                        }
                        if (i35 != size2) {
                            interfaceC2484n1.subList(i35, size2).clear();
                            return l10;
                        }
                    } else {
                        Iterator it = interfaceC2484n1.iterator();
                        while (it.hasNext()) {
                            int intValue2 = ((Integer) it.next()).intValue();
                            if (!a10.b(intValue2)) {
                                obj2 = AbstractC2470k2.a(obj, i13, intValue2, obj2, abstractC2539y2);
                                it.remove();
                            }
                        }
                    }
                }
                return l10;
            case HVError.GPS_ACCESS_DENIED /* 33 */:
            case 47:
                if (i14 == 2) {
                    C2449g1 c2449g13 = (C2449g1) interfaceC2484n1;
                    int j26 = AbstractC2507s0.j(bArr, i19, c2502r0);
                    int i37 = c2502r0.f24918a + j26;
                    while (j26 < i37) {
                        j26 = AbstractC2507s0.j(bArr, j26, c2502r0);
                        c2449g13.j(I0.a(c2502r0.f24918a));
                    }
                    if (j26 == i37) {
                        return j26;
                    }
                    throw C2499q1.g();
                }
                if (i14 == 0) {
                    C2449g1 c2449g14 = (C2449g1) interfaceC2484n1;
                    int j27 = AbstractC2507s0.j(bArr, i19, c2502r0);
                    c2449g14.j(I0.a(c2502r0.f24918a));
                    while (j27 < i11) {
                        int j28 = AbstractC2507s0.j(bArr, j27, c2502r0);
                        if (i12 != c2502r0.f24918a) {
                            return j27;
                        }
                        j27 = AbstractC2507s0.j(bArr, j28, c2502r0);
                        c2449g14.j(I0.a(c2502r0.f24918a));
                    }
                    return j27;
                }
                break;
            case 34:
            case 48:
                if (i14 == 2) {
                    android.support.v4.media.session.b.a(interfaceC2484n1);
                    int j29 = AbstractC2507s0.j(bArr, i19, c2502r0);
                    int i38 = c2502r0.f24918a + j29;
                    if (j29 >= i38) {
                        if (j29 == i38) {
                            return j29;
                        }
                        throw C2499q1.g();
                    }
                    AbstractC2507s0.m(bArr, j29, c2502r0);
                    I0.b(c2502r0.f24919b);
                    throw null;
                }
                if (i14 == 0) {
                    android.support.v4.media.session.b.a(interfaceC2484n1);
                    AbstractC2507s0.m(bArr, i19, c2502r0);
                    I0.b(c2502r0.f24919b);
                    throw null;
                }
                break;
            default:
                if (i14 == 3) {
                    InterfaceC2460i2 c10 = c(i15);
                    int i39 = (i12 & (-8)) | 4;
                    int c11 = AbstractC2507s0.c(c10, bArr, i10, i11, i39, c2502r0);
                    interfaceC2484n1.add(c2502r0.f24920c);
                    while (c11 < i11) {
                        int j30 = AbstractC2507s0.j(bArr, c11, c2502r0);
                        if (i12 != c2502r0.f24918a) {
                            return c11;
                        }
                        c11 = AbstractC2507s0.c(c10, bArr, j30, i11, i39, c2502r0);
                        interfaceC2484n1.add(c2502r0.f24920c);
                    }
                    return c11;
                }
                break;
        }
        return i19;
    }

    private final int P(int i10) {
        if (i10 < this.f24798c || i10 > this.f24799d) {
            return -1;
        }
        return S(i10, 0);
    }

    private final int Q(int i10, int i11) {
        if (i10 < this.f24798c || i10 > this.f24799d) {
            return -1;
        }
        return S(i10, i11);
    }

    private final int R(int i10) {
        return this.f24796a[i10 + 2];
    }

    private final int S(int i10, int i11) {
        int length = (this.f24796a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = this.f24796a[i13];
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

    private static int T(int i10) {
        return (i10 >>> 20) & 255;
    }

    private final int U(int i10) {
        return this.f24796a[i10 + 1];
    }

    private static long V(Object obj, long j10) {
        return ((Long) J2.k(obj, j10)).longValue();
    }

    private final InterfaceC2464j1 a(int i10) {
        int i11 = i10 / 3;
        return (InterfaceC2464j1) this.f24797b[i11 + i11 + 1];
    }

    private final InterfaceC2460i2 c(int i10) {
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        InterfaceC2460i2 interfaceC2460i2 = (InterfaceC2460i2) this.f24797b[i12];
        if (interfaceC2460i2 != null) {
            return interfaceC2460i2;
        }
        InterfaceC2460i2 b10 = X1.a().b((Class) this.f24797b[i12 + 1]);
        this.f24797b[i12] = b10;
        return b10;
    }

    private final Object l(int i10) {
        int i11 = i10 / 3;
        return this.f24797b[i11 + i11];
    }

    private final Object m(Object obj, int i10) {
        InterfaceC2460i2 c10 = c(i10);
        int U10 = U(i10) & 1048575;
        if (!y(obj, i10)) {
            return c10.g();
        }
        Object object = f24795q.getObject(obj, U10);
        if (B(object)) {
            return object;
        }
        Object g10 = c10.g();
        if (object != null) {
            c10.i(g10, object);
        }
        return g10;
    }

    private final Object n(Object obj, int i10, int i11) {
        InterfaceC2460i2 c10 = c(i11);
        if (!C(obj, i10, i11)) {
            return c10.g();
        }
        Object object = f24795q.getObject(obj, U(i11) & 1048575);
        if (B(object)) {
            return object;
        }
        Object g10 = c10.g();
        if (object != null) {
            c10.i(g10, object);
        }
        return g10;
    }

    private static Field o(Class cls, String str) {
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

    private static void p(Object obj) {
        if (!B(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void q(Object obj, Object obj2, int i10) {
        if (y(obj2, i10)) {
            int U10 = U(i10) & 1048575;
            Unsafe unsafe = f24795q;
            long j10 = U10;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f24796a[i10] + " is present but null: " + obj2.toString());
            }
            InterfaceC2460i2 c10 = c(i10);
            if (!y(obj, i10)) {
                if (B(object)) {
                    Object g10 = c10.g();
                    c10.i(g10, object);
                    unsafe.putObject(obj, j10, g10);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                s(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!B(object2)) {
                Object g11 = c10.g();
                c10.i(g11, object2);
                unsafe.putObject(obj, j10, g11);
                object2 = g11;
            }
            c10.i(object2, object);
        }
    }

    private final void r(Object obj, Object obj2, int i10) {
        int i11 = this.f24796a[i10];
        if (C(obj2, i11, i10)) {
            int U10 = U(i10) & 1048575;
            Unsafe unsafe = f24795q;
            long j10 = U10;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f24796a[i10] + " is present but null: " + obj2.toString());
            }
            InterfaceC2460i2 c10 = c(i10);
            if (!C(obj, i11, i10)) {
                if (B(object)) {
                    Object g10 = c10.g();
                    c10.i(g10, object);
                    unsafe.putObject(obj, j10, g10);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                t(obj, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!B(object2)) {
                Object g11 = c10.g();
                c10.i(g11, object2);
                unsafe.putObject(obj, j10, g11);
                object2 = g11;
            }
            c10.i(object2, object);
        }
    }

    private final void s(Object obj, int i10) {
        int R10 = R(i10);
        long j10 = 1048575 & R10;
        if (j10 == 1048575) {
            return;
        }
        J2.v(obj, j10, (1 << (R10 >>> 20)) | J2.h(obj, j10));
    }

    private final void t(Object obj, int i10, int i11) {
        J2.v(obj, R(i11) & 1048575, i10);
    }

    private final void u(Object obj, int i10, Object obj2) {
        f24795q.putObject(obj, U(i10) & 1048575, obj2);
        s(obj, i10);
    }

    private final void v(Object obj, int i10, int i11, Object obj2) {
        f24795q.putObject(obj, U(i11) & 1048575, obj2);
        t(obj, i10, i11);
    }

    private final void w(R2 r22, int i10, Object obj, int i11) {
        if (obj == null) {
            return;
        }
        android.support.v4.media.session.b.a(l(i11));
        throw null;
    }

    private final boolean x(Object obj, Object obj2, int i10) {
        return y(obj, i10) == y(obj2, i10);
    }

    private final boolean y(Object obj, int i10) {
        int R10 = R(i10);
        long j10 = R10 & 1048575;
        if (j10 != 1048575) {
            return (J2.h(obj, j10) & (1 << (R10 >>> 20))) != 0;
        }
        int U10 = U(i10);
        long j11 = U10 & 1048575;
        switch (T(U10)) {
            case 0:
                return Double.doubleToRawLongBits(J2.f(obj, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(J2.g(obj, j11)) != 0;
            case 2:
                return J2.i(obj, j11) != 0;
            case 3:
                return J2.i(obj, j11) != 0;
            case 4:
                return J2.h(obj, j11) != 0;
            case 5:
                return J2.i(obj, j11) != 0;
            case 6:
                return J2.h(obj, j11) != 0;
            case 7:
                return J2.B(obj, j11);
            case 8:
                Object k10 = J2.k(obj, j11);
                if (k10 instanceof String) {
                    return !((String) k10).isEmpty();
                }
                if (k10 instanceof E0) {
                    return !E0.f24749b.equals(k10);
                }
                throw new IllegalArgumentException();
            case 9:
                return J2.k(obj, j11) != null;
            case RequestError.EVENT_TIMEOUT /* 10 */:
                return !E0.f24749b.equals(J2.k(obj, j11));
            case 11:
                return J2.h(obj, j11) != 0;
            case 12:
                return J2.h(obj, j11) != 0;
            case 13:
                return J2.h(obj, j11) != 0;
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                return J2.i(obj, j11) != 0;
            case HVError.SSL_CONNECT_ERROR /* 15 */:
                return J2.h(obj, j11) != 0;
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                return J2.i(obj, j11) != 0;
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                return J2.k(obj, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean z(Object obj, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? y(obj, i10) : (i12 & i13) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0510, code lost:
    
        if (r6 == r1) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0512, code lost:
    
        r30.putInt(r12, r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0518, code lost:
    
        r2 = r9.f24803h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x051c, code lost:
    
        if (r2 >= r9.f24804i) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x051e, code lost:
    
        r4 = r9.f24802g[r2];
        r5 = r9.f24796a[r4];
        r5 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.J2.k(r12, r9.U(r4) & r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0530, code lost:
    
        if (r5 != null) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0537, code lost:
    
        if (r9.a(r4) != null) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x053c, code lost:
    
        r5 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.J1) r5;
        android.support.v4.media.session.b.a(r9.l(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0545, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0539, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0546, code lost:
    
        if (r7 != 0) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x054a, code lost:
    
        if (r0 != r35) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0551, code lost:
    
        throw com.google.android.gms.internal.mlkit_vision_barcode_bundled.C2499q1.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0558, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0554, code lost:
    
        if (r0 > r35) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0556, code lost:
    
        if (r3 != r7) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x055d, code lost:
    
        throw com.google.android.gms.internal.mlkit_vision_barcode_bundled.C2499q1.e();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final int F(Object obj, byte[] bArr, int i10, int i11, int i12, C2502r0 c2502r0) {
        Unsafe unsafe;
        int i13;
        Object obj2;
        S1 s12;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z10;
        int i21;
        Object obj3;
        byte[] bArr2;
        int i22;
        C2502r0 c2502r02;
        Object obj4;
        int i23;
        int i24;
        boolean z11;
        int i25;
        Object obj5;
        int i26;
        S1 s13 = this;
        Object obj6 = obj;
        byte[] bArr3 = bArr;
        int i27 = i11;
        int i28 = i12;
        C2502r0 c2502r03 = c2502r0;
        p(obj);
        Unsafe unsafe2 = f24795q;
        int i29 = -1;
        int i30 = i10;
        int i31 = -1;
        int i32 = 0;
        int i33 = 0;
        int i34 = 0;
        int i35 = 1048575;
        while (true) {
            Object obj7 = null;
            if (i30 < i27) {
                int i36 = i30 + 1;
                byte b10 = bArr3[i30];
                if (b10 < 0) {
                    int k10 = AbstractC2507s0.k(b10, bArr3, i36, c2502r03);
                    i15 = c2502r03.f24918a;
                    i36 = k10;
                } else {
                    i15 = b10;
                }
                int i37 = i15 >>> 3;
                int Q10 = i37 > i31 ? s13.Q(i37, i32 / 3) : s13.P(i37);
                if (Q10 == i29) {
                    i16 = i37;
                    i17 = i34;
                    i18 = i35;
                    i19 = i29;
                    unsafe = unsafe2;
                    i13 = i28;
                    i20 = 0;
                    z10 = true;
                    i21 = i15;
                } else {
                    int i38 = i15 & 7;
                    int[] iArr = s13.f24796a;
                    int i39 = iArr[Q10 + 1];
                    int T10 = T(i39);
                    int i40 = i15;
                    long j10 = i39 & 1048575;
                    if (T10 <= 17) {
                        int i41 = iArr[Q10 + 2];
                        int i42 = 1 << (i41 >>> 20);
                        int i43 = i41 & 1048575;
                        if (i43 != i35) {
                            if (i35 != 1048575) {
                                long j11 = i35;
                                obj5 = obj;
                                unsafe2.putInt(obj5, j11, i34);
                            } else {
                                obj5 = obj;
                            }
                            i18 = i43;
                            i23 = unsafe2.getInt(obj5, i43);
                            obj6 = obj5;
                        } else {
                            obj6 = obj;
                            i23 = i34;
                            i18 = i35;
                        }
                        switch (T10) {
                            case 0:
                                i16 = i37;
                                i24 = Q10;
                                z11 = true;
                                if (i38 != 1) {
                                    i13 = i12;
                                    z10 = z11;
                                    unsafe = unsafe2;
                                    i20 = i24;
                                    i17 = i23;
                                    i21 = i40;
                                    i19 = -1;
                                    break;
                                } else {
                                    J2.t(obj6, j10, Double.longBitsToDouble(AbstractC2507s0.q(bArr3, i36)));
                                    i30 = i36 + 8;
                                    i34 = i23 | i42;
                                    i31 = i16;
                                    i27 = i11;
                                    i32 = i24;
                                    i33 = i40;
                                    i35 = i18;
                                    i29 = -1;
                                    i28 = i12;
                                    break;
                                }
                            case 1:
                                i16 = i37;
                                i24 = Q10;
                                if (i38 != 5) {
                                    z11 = true;
                                    i13 = i12;
                                    z10 = z11;
                                    unsafe = unsafe2;
                                    i20 = i24;
                                    i17 = i23;
                                    i21 = i40;
                                    i19 = -1;
                                    break;
                                } else {
                                    J2.u(obj6, j10, Float.intBitsToFloat(AbstractC2507s0.b(bArr3, i36)));
                                    i30 = i36 + 4;
                                    i34 = i23 | i42;
                                    i31 = i16;
                                    i27 = i11;
                                    i32 = i24;
                                    i33 = i40;
                                    i35 = i18;
                                    i29 = -1;
                                    i28 = i12;
                                    break;
                                }
                            case 2:
                            case 3:
                                i16 = i37;
                                i24 = Q10;
                                if (i38 != 0) {
                                    z11 = true;
                                    i13 = i12;
                                    z10 = z11;
                                    unsafe = unsafe2;
                                    i20 = i24;
                                    i17 = i23;
                                    i21 = i40;
                                    i19 = -1;
                                    break;
                                } else {
                                    int m10 = AbstractC2507s0.m(bArr3, i36, c2502r03);
                                    unsafe2.putLong(obj, j10, c2502r03.f24919b);
                                    i34 = i23 | i42;
                                    i31 = i16;
                                    i27 = i11;
                                    i30 = m10;
                                    i32 = i24;
                                    i33 = i40;
                                    i35 = i18;
                                    i29 = -1;
                                    i28 = i12;
                                    break;
                                }
                            case 4:
                            case 11:
                                i16 = i37;
                                i24 = Q10;
                                if (i38 != 0) {
                                    z11 = true;
                                    i13 = i12;
                                    z10 = z11;
                                    unsafe = unsafe2;
                                    i20 = i24;
                                    i17 = i23;
                                    i21 = i40;
                                    i19 = -1;
                                    break;
                                } else {
                                    i30 = AbstractC2507s0.j(bArr3, i36, c2502r03);
                                    unsafe2.putInt(obj6, j10, c2502r03.f24918a);
                                    i34 = i23 | i42;
                                    i31 = i16;
                                    i27 = i11;
                                    i32 = i24;
                                    i33 = i40;
                                    i35 = i18;
                                    i29 = -1;
                                    i28 = i12;
                                    break;
                                }
                            case 5:
                            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                                i16 = i37;
                                i24 = Q10;
                                if (i38 != 1) {
                                    z11 = true;
                                    i13 = i12;
                                    z10 = z11;
                                    unsafe = unsafe2;
                                    i20 = i24;
                                    i17 = i23;
                                    i21 = i40;
                                    i19 = -1;
                                    break;
                                } else {
                                    unsafe2.putLong(obj, j10, AbstractC2507s0.q(bArr3, i36));
                                    i30 = i36 + 8;
                                    i34 = i23 | i42;
                                    i31 = i16;
                                    i27 = i11;
                                    i32 = i24;
                                    i33 = i40;
                                    i35 = i18;
                                    i29 = -1;
                                    i28 = i12;
                                    break;
                                }
                            case 6:
                            case 13:
                                i16 = i37;
                                i24 = Q10;
                                if (i38 != 5) {
                                    z11 = true;
                                    i13 = i12;
                                    z10 = z11;
                                    unsafe = unsafe2;
                                    i20 = i24;
                                    i17 = i23;
                                    i21 = i40;
                                    i19 = -1;
                                    break;
                                } else {
                                    unsafe2.putInt(obj6, j10, AbstractC2507s0.b(bArr3, i36));
                                    i30 = i36 + 4;
                                    i34 = i23 | i42;
                                    i31 = i16;
                                    i27 = i11;
                                    i32 = i24;
                                    i33 = i40;
                                    i35 = i18;
                                    i29 = -1;
                                    i28 = i12;
                                    break;
                                }
                            case 7:
                                i16 = i37;
                                i24 = Q10;
                                if (i38 != 0) {
                                    z11 = true;
                                    i13 = i12;
                                    z10 = z11;
                                    unsafe = unsafe2;
                                    i20 = i24;
                                    i17 = i23;
                                    i21 = i40;
                                    i19 = -1;
                                    break;
                                } else {
                                    i30 = AbstractC2507s0.m(bArr3, i36, c2502r03);
                                    J2.r(obj6, j10, c2502r03.f24919b != 0);
                                    i34 = i23 | i42;
                                    i31 = i16;
                                    i27 = i11;
                                    i32 = i24;
                                    i33 = i40;
                                    i35 = i18;
                                    i29 = -1;
                                    i28 = i12;
                                    break;
                                }
                            case 8:
                                i16 = i37;
                                i24 = Q10;
                                if (i38 != 2) {
                                    z11 = true;
                                    i13 = i12;
                                    z10 = z11;
                                    unsafe = unsafe2;
                                    i20 = i24;
                                    i17 = i23;
                                    i21 = i40;
                                    i19 = -1;
                                    break;
                                } else {
                                    i30 = (536870912 & i39) == 0 ? AbstractC2507s0.g(bArr3, i36, c2502r03) : AbstractC2507s0.h(bArr3, i36, c2502r03);
                                    unsafe2.putObject(obj6, j10, c2502r03.f24920c);
                                    i34 = i23 | i42;
                                    i31 = i16;
                                    i27 = i11;
                                    i32 = i24;
                                    i33 = i40;
                                    i35 = i18;
                                    i29 = -1;
                                    i28 = i12;
                                    break;
                                }
                            case 9:
                                i16 = i37;
                                i24 = Q10;
                                i25 = i40;
                                if (i38 != 2) {
                                    i40 = i25;
                                    z11 = true;
                                    i13 = i12;
                                    z10 = z11;
                                    unsafe = unsafe2;
                                    i20 = i24;
                                    i17 = i23;
                                    i21 = i40;
                                    i19 = -1;
                                    break;
                                } else {
                                    Object m11 = s13.m(obj6, i24);
                                    i40 = i25;
                                    i30 = AbstractC2507s0.o(m11, s13.c(i24), bArr, i36, i11, c2502r0);
                                    s13.u(obj6, i24, m11);
                                    i34 = i23 | i42;
                                    i31 = i16;
                                    i27 = i11;
                                    i32 = i24;
                                    i33 = i40;
                                    i35 = i18;
                                    i29 = -1;
                                    i28 = i12;
                                    break;
                                }
                            case RequestError.EVENT_TIMEOUT /* 10 */:
                                i16 = i37;
                                i24 = Q10;
                                i25 = i40;
                                if (i38 != 2) {
                                    i40 = i25;
                                    z11 = true;
                                    i13 = i12;
                                    z10 = z11;
                                    unsafe = unsafe2;
                                    i20 = i24;
                                    i17 = i23;
                                    i21 = i40;
                                    i19 = -1;
                                    break;
                                } else {
                                    i30 = AbstractC2507s0.a(bArr3, i36, c2502r03);
                                    unsafe2.putObject(obj6, j10, c2502r03.f24920c);
                                    i34 = i23 | i42;
                                    i31 = i16;
                                    i27 = i11;
                                    i33 = i25;
                                    i32 = i24;
                                    i35 = i18;
                                    i29 = -1;
                                    i28 = i12;
                                    break;
                                }
                            case 12:
                                i16 = i37;
                                i24 = Q10;
                                if (i38 != 0) {
                                    z11 = true;
                                    i13 = i12;
                                    z10 = z11;
                                    unsafe = unsafe2;
                                    i20 = i24;
                                    i17 = i23;
                                    i21 = i40;
                                    i19 = -1;
                                    break;
                                } else {
                                    i30 = AbstractC2507s0.j(bArr3, i36, c2502r03);
                                    int i44 = c2502r03.f24918a;
                                    InterfaceC2464j1 a10 = s13.a(i24);
                                    if (a10 == null || a10.b(i44)) {
                                        i25 = i40;
                                        unsafe2.putInt(obj6, j10, i44);
                                        i34 = i23 | i42;
                                        i31 = i16;
                                        i27 = i11;
                                        i33 = i25;
                                        i32 = i24;
                                        i35 = i18;
                                        i29 = -1;
                                        i28 = i12;
                                        break;
                                    } else {
                                        G(obj).j(i40, Long.valueOf(i44));
                                        i31 = i16;
                                        i33 = i40;
                                        i32 = i24;
                                        i34 = i23;
                                        i35 = i18;
                                        i29 = -1;
                                        i27 = i11;
                                        i28 = i12;
                                    }
                                }
                                break;
                            case HVError.SSL_CONNECT_ERROR /* 15 */:
                                i16 = i37;
                                i24 = Q10;
                                if (i38 != 0) {
                                    z11 = true;
                                    i13 = i12;
                                    z10 = z11;
                                    unsafe = unsafe2;
                                    i20 = i24;
                                    i17 = i23;
                                    i21 = i40;
                                    i19 = -1;
                                    break;
                                } else {
                                    i30 = AbstractC2507s0.j(bArr3, i36, c2502r03);
                                    unsafe2.putInt(obj6, j10, I0.a(c2502r03.f24918a));
                                    i34 = i23 | i42;
                                    i31 = i16;
                                    i27 = i11;
                                    i32 = i24;
                                    i33 = i40;
                                    i35 = i18;
                                    i29 = -1;
                                    i28 = i12;
                                    break;
                                }
                            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                                i16 = i37;
                                i24 = Q10;
                                if (i38 != 0) {
                                    z11 = true;
                                    i13 = i12;
                                    z10 = z11;
                                    unsafe = unsafe2;
                                    i20 = i24;
                                    i17 = i23;
                                    i21 = i40;
                                    i19 = -1;
                                    break;
                                } else {
                                    int m12 = AbstractC2507s0.m(bArr3, i36, c2502r03);
                                    unsafe2.putLong(obj, j10, I0.b(c2502r03.f24919b));
                                    i34 = i23 | i42;
                                    i31 = i16;
                                    i27 = i11;
                                    i30 = m12;
                                    i32 = i24;
                                    i33 = i40;
                                    i35 = i18;
                                    i29 = -1;
                                    i28 = i12;
                                    break;
                                }
                            default:
                                if (i38 != 3) {
                                    i16 = i37;
                                    i24 = Q10;
                                    z11 = true;
                                    i13 = i12;
                                    z10 = z11;
                                    unsafe = unsafe2;
                                    i20 = i24;
                                    i17 = i23;
                                    i21 = i40;
                                    i19 = -1;
                                    break;
                                } else {
                                    Object m13 = s13.m(obj6, Q10);
                                    i16 = i37;
                                    i24 = Q10;
                                    i30 = AbstractC2507s0.n(m13, s13.c(Q10), bArr, i36, i11, (i37 << 3) | 4, c2502r0);
                                    s13.u(obj6, i24, m13);
                                    i34 = i23 | i42;
                                    i31 = i16;
                                    i27 = i11;
                                    i32 = i24;
                                    i33 = i40;
                                    i35 = i18;
                                    i29 = -1;
                                    i28 = i12;
                                    break;
                                }
                        }
                    } else {
                        obj6 = obj;
                        i16 = i37;
                        if (T10 != 27) {
                            i17 = i34;
                            i18 = i35;
                            if (T10 <= 49) {
                                z10 = true;
                                int i45 = i36;
                                i19 = -1;
                                unsafe = unsafe2;
                                i20 = Q10;
                                i30 = O(obj, bArr, i36, i11, i40, i16, i38, Q10, i39, T10, j10, c2502r0);
                                if (i30 != i45) {
                                    s13 = this;
                                    obj6 = obj;
                                    bArr3 = bArr;
                                    i31 = i16;
                                    i27 = i11;
                                    i28 = i12;
                                    c2502r03 = c2502r0;
                                    i33 = i40;
                                    i29 = i19;
                                    i34 = i17;
                                    i32 = i20;
                                    i35 = i18;
                                    unsafe2 = unsafe;
                                } else {
                                    i13 = i12;
                                    i36 = i30;
                                    i21 = i40;
                                }
                            } else {
                                z10 = true;
                                i26 = i36;
                                unsafe = unsafe2;
                                i20 = Q10;
                                i19 = -1;
                                if (T10 != 50) {
                                    i30 = N(obj, bArr, i26, i11, i40, i16, i38, i39, T10, j10, i20, c2502r0);
                                    if (i30 != i26) {
                                        s13 = this;
                                        obj6 = obj;
                                        bArr3 = bArr;
                                        i31 = i16;
                                        i27 = i11;
                                        i28 = i12;
                                        c2502r03 = c2502r0;
                                        i33 = i40;
                                        i29 = i19;
                                        i34 = i17;
                                        i32 = i20;
                                        i35 = i18;
                                        unsafe2 = unsafe;
                                    } else {
                                        i13 = i12;
                                        i36 = i30;
                                        i21 = i40;
                                    }
                                } else if (i38 == 2) {
                                    i30 = M(obj, bArr, i26, i11, i20, j10, c2502r0);
                                    if (i30 != i26) {
                                        s13 = this;
                                        obj6 = obj;
                                        bArr3 = bArr;
                                        i31 = i16;
                                        i27 = i11;
                                        i28 = i12;
                                        c2502r03 = c2502r0;
                                        i33 = i40;
                                        i29 = i19;
                                        i34 = i17;
                                        i32 = i20;
                                        i35 = i18;
                                        unsafe2 = unsafe;
                                    } else {
                                        i13 = i12;
                                        i36 = i30;
                                        i21 = i40;
                                    }
                                }
                            }
                        } else if (i38 == 2) {
                            InterfaceC2484n1 interfaceC2484n1 = (InterfaceC2484n1) unsafe2.getObject(obj6, j10);
                            if (!interfaceC2484n1.a()) {
                                int size = interfaceC2484n1.size();
                                interfaceC2484n1 = interfaceC2484n1.l(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj6, j10, interfaceC2484n1);
                            }
                            i18 = i35;
                            i30 = AbstractC2507s0.e(s13.c(Q10), i40, bArr, i36, i11, interfaceC2484n1, c2502r0);
                            bArr3 = bArr;
                            i31 = i16;
                            i27 = i11;
                            i32 = Q10;
                            i33 = i40;
                            i34 = i34;
                            i35 = i18;
                            i29 = -1;
                            i28 = i12;
                        } else {
                            i17 = i34;
                            i18 = i35;
                            z10 = true;
                            i26 = i36;
                            unsafe = unsafe2;
                            i20 = Q10;
                            i19 = -1;
                        }
                        i13 = i12;
                        i36 = i26;
                        i21 = i40;
                    }
                }
                if (i21 != i13 || i13 == 0) {
                    if (this.f24801f) {
                        c2502r02 = c2502r0;
                        Q0 q02 = c2502r02.f24921d;
                        if (q02 != Q0.f24791b) {
                            i22 = i16;
                            C2439e1 b11 = q02.b(this.f24800e, i22);
                            if (b11 == null) {
                                i30 = AbstractC2507s0.i(i21, bArr, i36, i11, G(obj), c2502r0);
                                obj3 = obj;
                                bArr2 = bArr;
                            } else {
                                obj3 = obj;
                                AbstractC2424b1 abstractC2424b1 = (AbstractC2424b1) obj3;
                                abstractC2424b1.G();
                                V0 v02 = abstractC2424b1.zza;
                                P2 p22 = b11.f24862d.f24855b;
                                if (p22 == P2.zzn) {
                                    AbstractC2507s0.j(bArr, i36, c2502r02);
                                    throw null;
                                }
                                switch (p22.ordinal()) {
                                    case 0:
                                        bArr2 = bArr;
                                        obj7 = Double.valueOf(Double.longBitsToDouble(AbstractC2507s0.q(bArr2, i36)));
                                        i36 += 8;
                                        obj4 = obj7;
                                        v02.i(b11.f24862d, obj4);
                                        i30 = i36;
                                        break;
                                    case 1:
                                        bArr2 = bArr;
                                        obj7 = Float.valueOf(Float.intBitsToFloat(AbstractC2507s0.b(bArr2, i36)));
                                        i36 += 4;
                                        obj4 = obj7;
                                        v02.i(b11.f24862d, obj4);
                                        i30 = i36;
                                        break;
                                    case 2:
                                    case 3:
                                        bArr2 = bArr;
                                        i36 = AbstractC2507s0.m(bArr2, i36, c2502r02);
                                        obj7 = Long.valueOf(c2502r02.f24919b);
                                        obj4 = obj7;
                                        v02.i(b11.f24862d, obj4);
                                        i30 = i36;
                                        break;
                                    case 4:
                                    case 12:
                                        bArr2 = bArr;
                                        i36 = AbstractC2507s0.j(bArr2, i36, c2502r02);
                                        obj7 = Integer.valueOf(c2502r02.f24918a);
                                        obj4 = obj7;
                                        v02.i(b11.f24862d, obj4);
                                        i30 = i36;
                                        break;
                                    case 5:
                                    case HVError.SSL_CONNECT_ERROR /* 15 */:
                                        bArr2 = bArr;
                                        obj7 = Long.valueOf(AbstractC2507s0.q(bArr2, i36));
                                        i36 += 8;
                                        obj4 = obj7;
                                        v02.i(b11.f24862d, obj4);
                                        i30 = i36;
                                        break;
                                    case 6:
                                    case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                                        bArr2 = bArr;
                                        obj7 = Integer.valueOf(AbstractC2507s0.b(bArr2, i36));
                                        i36 += 4;
                                        obj4 = obj7;
                                        v02.i(b11.f24862d, obj4);
                                        i30 = i36;
                                        break;
                                    case 7:
                                        bArr2 = bArr;
                                        i36 = AbstractC2507s0.m(bArr2, i36, c2502r02);
                                        if (c2502r02.f24919b == 0) {
                                            z10 = false;
                                        }
                                        obj7 = Boolean.valueOf(z10);
                                        obj4 = obj7;
                                        v02.i(b11.f24862d, obj4);
                                        i30 = i36;
                                        break;
                                    case 8:
                                        bArr2 = bArr;
                                        i36 = AbstractC2507s0.g(bArr2, i36, c2502r02);
                                        obj4 = c2502r02.f24920c;
                                        v02.i(b11.f24862d, obj4);
                                        i30 = i36;
                                        break;
                                    case 9:
                                        bArr2 = bArr;
                                        int i46 = (i22 << 3) | 4;
                                        InterfaceC2460i2 b12 = X1.a().b(b11.f24861c.getClass());
                                        Object e10 = v02.e(b11.f24862d);
                                        if (e10 == null) {
                                            e10 = b12.g();
                                            v02.i(b11.f24862d, e10);
                                        }
                                        i30 = AbstractC2507s0.n(e10, b12, bArr, i36, i11, i46, c2502r0);
                                        break;
                                    case RequestError.EVENT_TIMEOUT /* 10 */:
                                        bArr2 = bArr;
                                        InterfaceC2460i2 b13 = X1.a().b(b11.f24861c.getClass());
                                        Object e11 = v02.e(b11.f24862d);
                                        if (e11 == null) {
                                            e11 = b13.g();
                                            v02.i(b11.f24862d, e11);
                                        }
                                        i30 = AbstractC2507s0.o(e11, b13, bArr, i36, i11, c2502r0);
                                        break;
                                    case 11:
                                        bArr2 = bArr;
                                        i36 = AbstractC2507s0.a(bArr2, i36, c2502r02);
                                        obj4 = c2502r02.f24920c;
                                        v02.i(b11.f24862d, obj4);
                                        i30 = i36;
                                        break;
                                    case 13:
                                        throw new IllegalStateException("Shouldn't reach here.");
                                    case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                                        bArr2 = bArr;
                                        i36 = AbstractC2507s0.j(bArr2, i36, c2502r02);
                                        obj7 = Integer.valueOf(I0.a(c2502r02.f24918a));
                                        obj4 = obj7;
                                        v02.i(b11.f24862d, obj4);
                                        i30 = i36;
                                        break;
                                    case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                                        bArr2 = bArr;
                                        i36 = AbstractC2507s0.m(bArr2, i36, c2502r02);
                                        obj7 = Long.valueOf(I0.b(c2502r02.f24919b));
                                        obj4 = obj7;
                                        v02.i(b11.f24862d, obj4);
                                        i30 = i36;
                                        break;
                                    default:
                                        bArr2 = bArr;
                                        obj4 = obj7;
                                        v02.i(b11.f24862d, obj4);
                                        i30 = i36;
                                        break;
                                }
                            }
                            i33 = i21;
                            s13 = this;
                            c2502r03 = c2502r02;
                            i31 = i22;
                            obj6 = obj3;
                            bArr3 = bArr2;
                            i29 = i19;
                            i34 = i17;
                            i32 = i20;
                            i35 = i18;
                            unsafe2 = unsafe;
                            i27 = i11;
                            i28 = i13;
                        } else {
                            obj3 = obj;
                            bArr2 = bArr;
                            i22 = i16;
                        }
                    } else {
                        obj3 = obj;
                        bArr2 = bArr;
                        i22 = i16;
                        c2502r02 = c2502r0;
                    }
                    i30 = AbstractC2507s0.i(i21, bArr, i36, i11, G(obj), c2502r0);
                    i33 = i21;
                    s13 = this;
                    c2502r03 = c2502r02;
                    i31 = i22;
                    obj6 = obj3;
                    bArr3 = bArr2;
                    i29 = i19;
                    i34 = i17;
                    i32 = i20;
                    i35 = i18;
                    unsafe2 = unsafe;
                    i27 = i11;
                    i28 = i13;
                } else {
                    i14 = 1048575;
                    s12 = this;
                    obj2 = obj;
                    i30 = i36;
                    i33 = i21;
                    i34 = i17;
                    i35 = i18;
                }
            } else {
                unsafe = unsafe2;
                i13 = i28;
                obj2 = obj6;
                s12 = s13;
                i14 = 1048575;
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2460i2
    public final int b(Object obj) {
        int A10;
        int A11;
        int B10;
        int A12;
        int A13;
        int A14;
        int A15;
        int K10;
        int A16;
        int B11;
        int A17;
        int A18;
        P2 p22 = P2.zza;
        if (this.f24808m - 1 == 0) {
            return K(obj);
        }
        Unsafe unsafe = f24795q;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f24796a.length; i11 += 3) {
            int U10 = U(i11);
            int T10 = T(U10);
            int i12 = this.f24796a[i11];
            int i13 = U10 & 1048575;
            if (T10 >= W0.zzJ.zza() && T10 <= W0.zzW.zza()) {
                int i14 = this.f24796a[i11 + 2];
            }
            long j10 = i13;
            switch (T10) {
                case 0:
                    if (y(obj, i11)) {
                        A10 = M0.A(i12 << 3);
                        K10 = A10 + 8;
                        i10 += K10;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (y(obj, i11)) {
                        A11 = M0.A(i12 << 3);
                        K10 = A11 + 4;
                        i10 += K10;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (y(obj, i11)) {
                        B10 = M0.B(J2.i(obj, j10));
                        A12 = M0.A(i12 << 3);
                        i10 += A12 + B10;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (y(obj, i11)) {
                        B10 = M0.B(J2.i(obj, j10));
                        A12 = M0.A(i12 << 3);
                        i10 += A12 + B10;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (y(obj, i11)) {
                        B10 = M0.w(J2.h(obj, j10));
                        A12 = M0.A(i12 << 3);
                        i10 += A12 + B10;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (y(obj, i11)) {
                        A10 = M0.A(i12 << 3);
                        K10 = A10 + 8;
                        i10 += K10;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (y(obj, i11)) {
                        A11 = M0.A(i12 << 3);
                        K10 = A11 + 4;
                        i10 += K10;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (y(obj, i11)) {
                        A13 = M0.A(i12 << 3);
                        K10 = A13 + 1;
                        i10 += K10;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (y(obj, i11)) {
                        Object k10 = J2.k(obj, j10);
                        if (k10 instanceof E0) {
                            int i15 = i12 << 3;
                            int i16 = M0.f24784d;
                            int j11 = ((E0) k10).j();
                            A14 = M0.A(j11) + j11;
                            A15 = M0.A(i15);
                            K10 = A15 + A14;
                            i10 += K10;
                            break;
                        } else {
                            B10 = M0.z((String) k10);
                            A12 = M0.A(i12 << 3);
                            i10 += A12 + B10;
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if (y(obj, i11)) {
                        K10 = AbstractC2470k2.K(i12, J2.k(obj, j10), c(i11));
                        i10 += K10;
                        break;
                    } else {
                        break;
                    }
                case RequestError.EVENT_TIMEOUT /* 10 */:
                    if (y(obj, i11)) {
                        E0 e02 = (E0) J2.k(obj, j10);
                        int i17 = i12 << 3;
                        int i18 = M0.f24784d;
                        int j12 = e02.j();
                        A14 = M0.A(j12) + j12;
                        A15 = M0.A(i17);
                        K10 = A15 + A14;
                        i10 += K10;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (y(obj, i11)) {
                        B10 = M0.A(J2.h(obj, j10));
                        A12 = M0.A(i12 << 3);
                        i10 += A12 + B10;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (y(obj, i11)) {
                        B10 = M0.w(J2.h(obj, j10));
                        A12 = M0.A(i12 << 3);
                        i10 += A12 + B10;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (y(obj, i11)) {
                        A11 = M0.A(i12 << 3);
                        K10 = A11 + 4;
                        i10 += K10;
                        break;
                    } else {
                        break;
                    }
                case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                    if (y(obj, i11)) {
                        A10 = M0.A(i12 << 3);
                        K10 = A10 + 8;
                        i10 += K10;
                        break;
                    } else {
                        break;
                    }
                case HVError.SSL_CONNECT_ERROR /* 15 */:
                    if (y(obj, i11)) {
                        int h10 = J2.h(obj, j10);
                        A12 = M0.A(i12 << 3);
                        B10 = M0.A((h10 >> 31) ^ (h10 + h10));
                        i10 += A12 + B10;
                        break;
                    } else {
                        break;
                    }
                case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                    if (y(obj, i11)) {
                        long i19 = J2.i(obj, j10);
                        A16 = M0.A(i12 << 3);
                        B11 = M0.B((i19 + i19) ^ (i19 >> 63));
                        K10 = A16 + B11;
                        i10 += K10;
                        break;
                    } else {
                        break;
                    }
                case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                    if (y(obj, i11)) {
                        K10 = M0.v(i12, (P1) J2.k(obj, j10), c(i11));
                        i10 += K10;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    K10 = AbstractC2470k2.D(i12, (List) J2.k(obj, j10), false);
                    i10 += K10;
                    break;
                case 19:
                    K10 = AbstractC2470k2.B(i12, (List) J2.k(obj, j10), false);
                    i10 += K10;
                    break;
                case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                    K10 = AbstractC2470k2.I(i12, (List) J2.k(obj, j10), false);
                    i10 += K10;
                    break;
                case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                    K10 = AbstractC2470k2.T(i12, (List) J2.k(obj, j10), false);
                    i10 += K10;
                    break;
                case HVError.FACE_DETECTION_ERROR /* 22 */:
                    K10 = AbstractC2470k2.G(i12, (List) J2.k(obj, j10), false);
                    i10 += K10;
                    break;
                case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                    K10 = AbstractC2470k2.D(i12, (List) J2.k(obj, j10), false);
                    i10 += K10;
                    break;
                case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                    K10 = AbstractC2470k2.B(i12, (List) J2.k(obj, j10), false);
                    i10 += K10;
                    break;
                case HVError.LOW_STORAGE_ERROR /* 25 */:
                    K10 = AbstractC2470k2.x(i12, (List) J2.k(obj, j10), false);
                    i10 += K10;
                    break;
                case 26:
                    K10 = AbstractC2470k2.Q(i12, (List) J2.k(obj, j10));
                    i10 += K10;
                    break;
                case 27:
                    K10 = AbstractC2470k2.L(i12, (List) J2.k(obj, j10), c(i11));
                    i10 += K10;
                    break;
                case 28:
                    K10 = AbstractC2470k2.y(i12, (List) J2.k(obj, j10));
                    i10 += K10;
                    break;
                case 29:
                    K10 = AbstractC2470k2.R(i12, (List) J2.k(obj, j10), false);
                    i10 += K10;
                    break;
                case 30:
                    K10 = AbstractC2470k2.z(i12, (List) J2.k(obj, j10), false);
                    i10 += K10;
                    break;
                case HVError.INSTRUCTION_ERROR /* 31 */:
                    K10 = AbstractC2470k2.B(i12, (List) J2.k(obj, j10), false);
                    i10 += K10;
                    break;
                case 32:
                    K10 = AbstractC2470k2.D(i12, (List) J2.k(obj, j10), false);
                    i10 += K10;
                    break;
                case HVError.GPS_ACCESS_DENIED /* 33 */:
                    K10 = AbstractC2470k2.M(i12, (List) J2.k(obj, j10), false);
                    i10 += K10;
                    break;
                case 34:
                    K10 = AbstractC2470k2.O(i12, (List) J2.k(obj, j10), false);
                    i10 += K10;
                    break;
                case HVError.FACE_CAPTURE_TIMEOUT /* 35 */:
                    B10 = AbstractC2470k2.E((List) unsafe.getObject(obj, j10));
                    if (B10 > 0) {
                        int i20 = i12 << 3;
                        A17 = M0.A(B10);
                        A18 = M0.A(i20);
                        A12 = A18 + A17;
                        i10 += A12 + B10;
                        break;
                    } else {
                        break;
                    }
                case HVError.HYPER_DOC_DETECT_ERROR /* 36 */:
                    B10 = AbstractC2470k2.C((List) unsafe.getObject(obj, j10));
                    if (B10 > 0) {
                        int i21 = i12 << 3;
                        A17 = M0.A(B10);
                        A18 = M0.A(i21);
                        A12 = A18 + A17;
                        i10 += A12 + B10;
                        break;
                    } else {
                        break;
                    }
                case HVError.INVALID_FILE_ERROR /* 37 */:
                    B10 = AbstractC2470k2.J((List) unsafe.getObject(obj, j10));
                    if (B10 > 0) {
                        int i22 = i12 << 3;
                        A17 = M0.A(B10);
                        A18 = M0.A(i22);
                        A12 = A18 + A17;
                        i10 += A12 + B10;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    B10 = AbstractC2470k2.U((List) unsafe.getObject(obj, j10));
                    if (B10 > 0) {
                        int i23 = i12 << 3;
                        A17 = M0.A(B10);
                        A18 = M0.A(i23);
                        A12 = A18 + A17;
                        i10 += A12 + B10;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    B10 = AbstractC2470k2.H((List) unsafe.getObject(obj, j10));
                    if (B10 > 0) {
                        int i24 = i12 << 3;
                        A17 = M0.A(B10);
                        A18 = M0.A(i24);
                        A12 = A18 + A17;
                        i10 += A12 + B10;
                        break;
                    } else {
                        break;
                    }
                case RequestError.NETWORK_FAILURE /* 40 */:
                    B10 = AbstractC2470k2.E((List) unsafe.getObject(obj, j10));
                    if (B10 > 0) {
                        int i25 = i12 << 3;
                        A17 = M0.A(B10);
                        A18 = M0.A(i25);
                        A12 = A18 + A17;
                        i10 += A12 + B10;
                        break;
                    } else {
                        break;
                    }
                case RequestError.NO_DEV_KEY /* 41 */:
                    B10 = AbstractC2470k2.C((List) unsafe.getObject(obj, j10));
                    if (B10 > 0) {
                        int i26 = i12 << 3;
                        A17 = M0.A(B10);
                        A18 = M0.A(i26);
                        A12 = A18 + A17;
                        i10 += A12 + B10;
                        break;
                    } else {
                        break;
                    }
                case HVError.CONSENT_DENIED /* 42 */:
                    List list = (List) unsafe.getObject(obj, j10);
                    int i27 = AbstractC2470k2.f24881d;
                    B10 = list.size();
                    if (B10 > 0) {
                        int i28 = i12 << 3;
                        A17 = M0.A(B10);
                        A18 = M0.A(i28);
                        A12 = A18 + A17;
                        i10 += A12 + B10;
                        break;
                    } else {
                        break;
                    }
                case HVError.ENCRYPTION_ERROR /* 43 */:
                    B10 = AbstractC2470k2.S((List) unsafe.getObject(obj, j10));
                    if (B10 > 0) {
                        int i29 = i12 << 3;
                        A17 = M0.A(B10);
                        A18 = M0.A(i29);
                        A12 = A18 + A17;
                        i10 += A12 + B10;
                        break;
                    } else {
                        break;
                    }
                case HVError.SDK_CLOSE_ERROR /* 44 */:
                    B10 = AbstractC2470k2.A((List) unsafe.getObject(obj, j10));
                    if (B10 > 0) {
                        int i30 = i12 << 3;
                        A17 = M0.A(B10);
                        A18 = M0.A(i30);
                        A12 = A18 + A17;
                        i10 += A12 + B10;
                        break;
                    } else {
                        break;
                    }
                case HVError.PERMISSION_REVOKED_ERROR /* 45 */:
                    B10 = AbstractC2470k2.C((List) unsafe.getObject(obj, j10));
                    if (B10 > 0) {
                        int i31 = i12 << 3;
                        A17 = M0.A(B10);
                        A18 = M0.A(i31);
                        A12 = A18 + A17;
                        i10 += A12 + B10;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    B10 = AbstractC2470k2.E((List) unsafe.getObject(obj, j10));
                    if (B10 > 0) {
                        int i32 = i12 << 3;
                        A17 = M0.A(B10);
                        A18 = M0.A(i32);
                        A12 = A18 + A17;
                        i10 += A12 + B10;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    B10 = AbstractC2470k2.N((List) unsafe.getObject(obj, j10));
                    if (B10 > 0) {
                        int i33 = i12 << 3;
                        A17 = M0.A(B10);
                        A18 = M0.A(i33);
                        A12 = A18 + A17;
                        i10 += A12 + B10;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    B10 = AbstractC2470k2.P((List) unsafe.getObject(obj, j10));
                    if (B10 > 0) {
                        int i34 = i12 << 3;
                        A17 = M0.A(B10);
                        A18 = M0.A(i34);
                        A12 = A18 + A17;
                        i10 += A12 + B10;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    K10 = AbstractC2470k2.F(i12, (List) J2.k(obj, j10), c(i11));
                    i10 += K10;
                    break;
                case 50:
                    K1.a(i12, J2.k(obj, j10), l(i11));
                    break;
                case 51:
                    if (C(obj, i12, i11)) {
                        A10 = M0.A(i12 << 3);
                        K10 = A10 + 8;
                        i10 += K10;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (C(obj, i12, i11)) {
                        A11 = M0.A(i12 << 3);
                        K10 = A11 + 4;
                        i10 += K10;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (C(obj, i12, i11)) {
                        B10 = M0.B(V(obj, j10));
                        A12 = M0.A(i12 << 3);
                        i10 += A12 + B10;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (C(obj, i12, i11)) {
                        B10 = M0.B(V(obj, j10));
                        A12 = M0.A(i12 << 3);
                        i10 += A12 + B10;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (C(obj, i12, i11)) {
                        B10 = M0.w(L(obj, j10));
                        A12 = M0.A(i12 << 3);
                        i10 += A12 + B10;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (C(obj, i12, i11)) {
                        A10 = M0.A(i12 << 3);
                        K10 = A10 + 8;
                        i10 += K10;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (C(obj, i12, i11)) {
                        A11 = M0.A(i12 << 3);
                        K10 = A11 + 4;
                        i10 += K10;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (C(obj, i12, i11)) {
                        A13 = M0.A(i12 << 3);
                        K10 = A13 + 1;
                        i10 += K10;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (C(obj, i12, i11)) {
                        Object k11 = J2.k(obj, j10);
                        if (k11 instanceof E0) {
                            int i35 = i12 << 3;
                            int i36 = M0.f24784d;
                            int j13 = ((E0) k11).j();
                            A14 = M0.A(j13) + j13;
                            A15 = M0.A(i35);
                            K10 = A15 + A14;
                            i10 += K10;
                            break;
                        } else {
                            B10 = M0.z((String) k11);
                            A12 = M0.A(i12 << 3);
                            i10 += A12 + B10;
                            break;
                        }
                    } else {
                        break;
                    }
                case HVError.DETECTOR_NOT_AVAILABLE_ERROR /* 60 */:
                    if (C(obj, i12, i11)) {
                        K10 = AbstractC2470k2.K(i12, J2.k(obj, j10), c(i11));
                        i10 += K10;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (C(obj, i12, i11)) {
                        E0 e03 = (E0) J2.k(obj, j10);
                        int i37 = i12 << 3;
                        int i38 = M0.f24784d;
                        int j14 = e03.j();
                        A14 = M0.A(j14) + j14;
                        A15 = M0.A(i37);
                        K10 = A15 + A14;
                        i10 += K10;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (C(obj, i12, i11)) {
                        B10 = M0.A(L(obj, j10));
                        A12 = M0.A(i12 << 3);
                        i10 += A12 + B10;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (C(obj, i12, i11)) {
                        B10 = M0.w(L(obj, j10));
                        A12 = M0.A(i12 << 3);
                        i10 += A12 + B10;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (C(obj, i12, i11)) {
                        A11 = M0.A(i12 << 3);
                        K10 = A11 + 4;
                        i10 += K10;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (C(obj, i12, i11)) {
                        A10 = M0.A(i12 << 3);
                        K10 = A10 + 8;
                        i10 += K10;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (C(obj, i12, i11)) {
                        int L10 = L(obj, j10);
                        A12 = M0.A(i12 << 3);
                        B10 = M0.A((L10 >> 31) ^ (L10 + L10));
                        i10 += A12 + B10;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (C(obj, i12, i11)) {
                        long V10 = V(obj, j10);
                        A16 = M0.A(i12 << 3);
                        B11 = M0.B((V10 + V10) ^ (V10 >> 63));
                        K10 = A16 + B11;
                        i10 += K10;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (C(obj, i12, i11)) {
                        K10 = M0.v(i12, (P1) J2.k(obj, j10), c(i11));
                        i10 += K10;
                        break;
                    } else {
                        break;
                    }
            }
        }
        AbstractC2539y2 abstractC2539y2 = this.f24806k;
        return i10 + abstractC2539y2.a(abstractC2539y2.d(obj));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2460i2
    public final boolean d(Object obj) {
        int i10;
        int i11;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1048575;
        while (i13 < this.f24803h) {
            int i15 = this.f24802g[i13];
            int i16 = this.f24796a[i15];
            int U10 = U(i15);
            int i17 = this.f24796a[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i14) {
                if (i18 != 1048575) {
                    i12 = f24795q.getInt(obj, i18);
                }
                i11 = i12;
                i10 = i18;
            } else {
                i10 = i14;
                i11 = i12;
            }
            if ((268435456 & U10) != 0 && !z(obj, i15, i10, i11, i19)) {
                return false;
            }
            int T10 = T(U10);
            if (T10 != 9 && T10 != 17) {
                if (T10 != 27) {
                    if (T10 == 60 || T10 == 68) {
                        if (C(obj, i16, i15) && !A(obj, U10, c(i15))) {
                            return false;
                        }
                    } else if (T10 != 49) {
                        if (T10 == 50 && !((J1) J2.k(obj, U10 & 1048575)).isEmpty()) {
                            android.support.v4.media.session.b.a(l(i15));
                            throw null;
                        }
                    }
                }
                List list = (List) J2.k(obj, U10 & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    InterfaceC2460i2 c10 = c(i15);
                    for (int i20 = 0; i20 < list.size(); i20++) {
                        if (!c10.d(list.get(i20))) {
                            return false;
                        }
                    }
                }
            } else if (z(obj, i15, i10, i11, i19) && !A(obj, U10, c(i15))) {
                return false;
            }
            i13++;
            i14 = i10;
            i12 = i11;
        }
        return !this.f24801f || this.f24807l.b(obj).k();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2460i2
    public final int e(Object obj) {
        int i10;
        long doubleToLongBits;
        int floatToIntBits;
        int length = this.f24796a.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int U10 = U(i12);
            int i13 = this.f24796a[i12];
            long j10 = 1048575 & U10;
            int i14 = 37;
            switch (T(U10)) {
                case 0:
                    i10 = i11 * 53;
                    doubleToLongBits = Double.doubleToLongBits(J2.f(obj, j10));
                    byte[] bArr = AbstractC2489o1.f24887d;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i11 = i10 + floatToIntBits;
                    break;
                case 1:
                    i10 = i11 * 53;
                    floatToIntBits = Float.floatToIntBits(J2.g(obj, j10));
                    i11 = i10 + floatToIntBits;
                    break;
                case 2:
                    i10 = i11 * 53;
                    doubleToLongBits = J2.i(obj, j10);
                    byte[] bArr2 = AbstractC2489o1.f24887d;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i11 = i10 + floatToIntBits;
                    break;
                case 3:
                    i10 = i11 * 53;
                    doubleToLongBits = J2.i(obj, j10);
                    byte[] bArr3 = AbstractC2489o1.f24887d;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i11 = i10 + floatToIntBits;
                    break;
                case 4:
                    i10 = i11 * 53;
                    floatToIntBits = J2.h(obj, j10);
                    i11 = i10 + floatToIntBits;
                    break;
                case 5:
                    i10 = i11 * 53;
                    doubleToLongBits = J2.i(obj, j10);
                    byte[] bArr4 = AbstractC2489o1.f24887d;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i11 = i10 + floatToIntBits;
                    break;
                case 6:
                    i10 = i11 * 53;
                    floatToIntBits = J2.h(obj, j10);
                    i11 = i10 + floatToIntBits;
                    break;
                case 7:
                    i10 = i11 * 53;
                    floatToIntBits = AbstractC2489o1.a(J2.B(obj, j10));
                    i11 = i10 + floatToIntBits;
                    break;
                case 8:
                    i10 = i11 * 53;
                    floatToIntBits = ((String) J2.k(obj, j10)).hashCode();
                    i11 = i10 + floatToIntBits;
                    break;
                case 9:
                    Object k10 = J2.k(obj, j10);
                    if (k10 != null) {
                        i14 = k10.hashCode();
                    }
                    i11 = (i11 * 53) + i14;
                    break;
                case RequestError.EVENT_TIMEOUT /* 10 */:
                    i10 = i11 * 53;
                    floatToIntBits = J2.k(obj, j10).hashCode();
                    i11 = i10 + floatToIntBits;
                    break;
                case 11:
                    i10 = i11 * 53;
                    floatToIntBits = J2.h(obj, j10);
                    i11 = i10 + floatToIntBits;
                    break;
                case 12:
                    i10 = i11 * 53;
                    floatToIntBits = J2.h(obj, j10);
                    i11 = i10 + floatToIntBits;
                    break;
                case 13:
                    i10 = i11 * 53;
                    floatToIntBits = J2.h(obj, j10);
                    i11 = i10 + floatToIntBits;
                    break;
                case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                    i10 = i11 * 53;
                    doubleToLongBits = J2.i(obj, j10);
                    byte[] bArr5 = AbstractC2489o1.f24887d;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i11 = i10 + floatToIntBits;
                    break;
                case HVError.SSL_CONNECT_ERROR /* 15 */:
                    i10 = i11 * 53;
                    floatToIntBits = J2.h(obj, j10);
                    i11 = i10 + floatToIntBits;
                    break;
                case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                    i10 = i11 * 53;
                    doubleToLongBits = J2.i(obj, j10);
                    byte[] bArr6 = AbstractC2489o1.f24887d;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i11 = i10 + floatToIntBits;
                    break;
                case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                    Object k11 = J2.k(obj, j10);
                    if (k11 != null) {
                        i14 = k11.hashCode();
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
                    floatToIntBits = J2.k(obj, j10).hashCode();
                    i11 = i10 + floatToIntBits;
                    break;
                case 50:
                    i10 = i11 * 53;
                    floatToIntBits = J2.k(obj, j10).hashCode();
                    i11 = i10 + floatToIntBits;
                    break;
                case 51:
                    if (C(obj, i13, i12)) {
                        i10 = i11 * 53;
                        doubleToLongBits = Double.doubleToLongBits(I(obj, j10));
                        byte[] bArr7 = AbstractC2489o1.f24887d;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i11 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (C(obj, i13, i12)) {
                        i10 = i11 * 53;
                        floatToIntBits = Float.floatToIntBits(J(obj, j10));
                        i11 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (C(obj, i13, i12)) {
                        i10 = i11 * 53;
                        doubleToLongBits = V(obj, j10);
                        byte[] bArr8 = AbstractC2489o1.f24887d;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i11 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (C(obj, i13, i12)) {
                        i10 = i11 * 53;
                        doubleToLongBits = V(obj, j10);
                        byte[] bArr9 = AbstractC2489o1.f24887d;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i11 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (C(obj, i13, i12)) {
                        i10 = i11 * 53;
                        floatToIntBits = L(obj, j10);
                        i11 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (C(obj, i13, i12)) {
                        i10 = i11 * 53;
                        doubleToLongBits = V(obj, j10);
                        byte[] bArr10 = AbstractC2489o1.f24887d;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i11 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (C(obj, i13, i12)) {
                        i10 = i11 * 53;
                        floatToIntBits = L(obj, j10);
                        i11 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (C(obj, i13, i12)) {
                        i10 = i11 * 53;
                        floatToIntBits = AbstractC2489o1.a(D(obj, j10));
                        i11 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (C(obj, i13, i12)) {
                        i10 = i11 * 53;
                        floatToIntBits = ((String) J2.k(obj, j10)).hashCode();
                        i11 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case HVError.DETECTOR_NOT_AVAILABLE_ERROR /* 60 */:
                    if (C(obj, i13, i12)) {
                        i10 = i11 * 53;
                        floatToIntBits = J2.k(obj, j10).hashCode();
                        i11 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (C(obj, i13, i12)) {
                        i10 = i11 * 53;
                        floatToIntBits = J2.k(obj, j10).hashCode();
                        i11 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (C(obj, i13, i12)) {
                        i10 = i11 * 53;
                        floatToIntBits = L(obj, j10);
                        i11 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (C(obj, i13, i12)) {
                        i10 = i11 * 53;
                        floatToIntBits = L(obj, j10);
                        i11 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (C(obj, i13, i12)) {
                        i10 = i11 * 53;
                        floatToIntBits = L(obj, j10);
                        i11 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (C(obj, i13, i12)) {
                        i10 = i11 * 53;
                        doubleToLongBits = V(obj, j10);
                        byte[] bArr11 = AbstractC2489o1.f24887d;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i11 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (C(obj, i13, i12)) {
                        i10 = i11 * 53;
                        floatToIntBits = L(obj, j10);
                        i11 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (C(obj, i13, i12)) {
                        i10 = i11 * 53;
                        doubleToLongBits = V(obj, j10);
                        byte[] bArr12 = AbstractC2489o1.f24887d;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i11 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (C(obj, i13, i12)) {
                        i10 = i11 * 53;
                        floatToIntBits = J2.k(obj, j10).hashCode();
                        i11 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i11 * 53) + this.f24806k.d(obj).hashCode();
        return this.f24801f ? (hashCode * 53) + this.f24807l.b(obj).f24818a.hashCode() : hashCode;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2460i2
    public final void f(Object obj) {
        if (B(obj)) {
            if (obj instanceof AbstractC2444f1) {
                AbstractC2444f1 abstractC2444f1 = (AbstractC2444f1) obj;
                abstractC2444f1.v(Integer.MAX_VALUE);
                abstractC2444f1.zzb = 0;
                abstractC2444f1.s();
            }
            int length = this.f24796a.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int U10 = U(i10);
                int i11 = 1048575 & U10;
                int T10 = T(U10);
                long j10 = i11;
                if (T10 != 9) {
                    if (T10 != 60 && T10 != 68) {
                        switch (T10) {
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
                                this.f24805j.a(obj, j10);
                                break;
                            case 50:
                                Unsafe unsafe = f24795q;
                                Object object = unsafe.getObject(obj, j10);
                                if (object != null) {
                                    ((J1) object).d();
                                    unsafe.putObject(obj, j10, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (C(obj, this.f24796a[i10], i10)) {
                        c(i10).f(f24795q.getObject(obj, j10));
                    }
                }
                if (y(obj, i10)) {
                    c(i10).f(f24795q.getObject(obj, j10));
                }
            }
            this.f24806k.g(obj);
            if (this.f24801f) {
                this.f24807l.e(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2460i2
    public final Object g() {
        return ((AbstractC2444f1) this.f24800e).h();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x09eb  */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2460i2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(Object obj, R2 r22) {
        Iterator it;
        Map.Entry entry;
        int length;
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        Iterator it2;
        Map.Entry entry2;
        int length2;
        int i12;
        P2 p22 = P2.zza;
        if (this.f24808m - 1 != 0) {
            if (this.f24801f) {
                V0 b10 = this.f24807l.b(obj);
                if (!b10.f24818a.isEmpty()) {
                    it2 = b10.f();
                    entry2 = (Map.Entry) it2.next();
                    length2 = this.f24796a.length;
                    for (i12 = 0; i12 < length2; i12 += 3) {
                        int U10 = U(i12);
                        int i13 = this.f24796a[i12];
                        while (entry2 != null && this.f24807l.a(entry2) <= i13) {
                            this.f24807l.f(r22, entry2);
                            entry2 = it2.hasNext() ? (Map.Entry) it2.next() : null;
                        }
                        switch (T(U10)) {
                            case 0:
                                if (y(obj, i12)) {
                                    r22.s(i13, J2.f(obj, U10 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 1:
                                if (y(obj, i12)) {
                                    r22.z(i13, J2.g(obj, U10 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 2:
                                if (y(obj, i12)) {
                                    r22.j(i13, J2.i(obj, U10 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 3:
                                if (y(obj, i12)) {
                                    r22.I(i13, J2.i(obj, U10 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 4:
                                if (y(obj, i12)) {
                                    r22.x(i13, J2.h(obj, U10 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 5:
                                if (y(obj, i12)) {
                                    r22.F(i13, J2.i(obj, U10 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 6:
                                if (y(obj, i12)) {
                                    r22.m(i13, J2.h(obj, U10 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 7:
                                if (y(obj, i12)) {
                                    r22.n(i13, J2.B(obj, U10 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 8:
                                if (y(obj, i12)) {
                                    E(i13, J2.k(obj, U10 & 1048575), r22);
                                    break;
                                } else {
                                    break;
                                }
                            case 9:
                                if (y(obj, i12)) {
                                    r22.G(i13, J2.k(obj, U10 & 1048575), c(i12));
                                    break;
                                } else {
                                    break;
                                }
                            case RequestError.EVENT_TIMEOUT /* 10 */:
                                if (y(obj, i12)) {
                                    r22.h(i13, (E0) J2.k(obj, U10 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 11:
                                if (y(obj, i12)) {
                                    r22.i(i13, J2.h(obj, U10 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 12:
                                if (y(obj, i12)) {
                                    r22.q(i13, J2.h(obj, U10 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 13:
                                if (y(obj, i12)) {
                                    r22.C(i13, J2.h(obj, U10 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                                if (y(obj, i12)) {
                                    r22.v(i13, J2.i(obj, U10 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case HVError.SSL_CONNECT_ERROR /* 15 */:
                                if (y(obj, i12)) {
                                    r22.E(i13, J2.h(obj, U10 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                                if (y(obj, i12)) {
                                    r22.y(i13, J2.i(obj, U10 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                                if (y(obj, i12)) {
                                    r22.w(i13, J2.k(obj, U10 & 1048575), c(i12));
                                    break;
                                } else {
                                    break;
                                }
                            case 18:
                                AbstractC2470k2.g(this.f24796a[i12], (List) J2.k(obj, U10 & 1048575), r22, false);
                                break;
                            case 19:
                                AbstractC2470k2.k(this.f24796a[i12], (List) J2.k(obj, U10 & 1048575), r22, false);
                                break;
                            case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                                AbstractC2470k2.n(this.f24796a[i12], (List) J2.k(obj, U10 & 1048575), r22, false);
                                break;
                            case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                                AbstractC2470k2.v(this.f24796a[i12], (List) J2.k(obj, U10 & 1048575), r22, false);
                                break;
                            case HVError.FACE_DETECTION_ERROR /* 22 */:
                                AbstractC2470k2.m(this.f24796a[i12], (List) J2.k(obj, U10 & 1048575), r22, false);
                                break;
                            case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                                AbstractC2470k2.j(this.f24796a[i12], (List) J2.k(obj, U10 & 1048575), r22, false);
                                break;
                            case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                                AbstractC2470k2.i(this.f24796a[i12], (List) J2.k(obj, U10 & 1048575), r22, false);
                                break;
                            case HVError.LOW_STORAGE_ERROR /* 25 */:
                                AbstractC2470k2.e(this.f24796a[i12], (List) J2.k(obj, U10 & 1048575), r22, false);
                                break;
                            case 26:
                                AbstractC2470k2.t(this.f24796a[i12], (List) J2.k(obj, U10 & 1048575), r22);
                                break;
                            case 27:
                                AbstractC2470k2.o(this.f24796a[i12], (List) J2.k(obj, U10 & 1048575), r22, c(i12));
                                break;
                            case 28:
                                AbstractC2470k2.f(this.f24796a[i12], (List) J2.k(obj, U10 & 1048575), r22);
                                break;
                            case 29:
                                AbstractC2470k2.u(this.f24796a[i12], (List) J2.k(obj, U10 & 1048575), r22, false);
                                break;
                            case 30:
                                AbstractC2470k2.h(this.f24796a[i12], (List) J2.k(obj, U10 & 1048575), r22, false);
                                break;
                            case HVError.INSTRUCTION_ERROR /* 31 */:
                                AbstractC2470k2.p(this.f24796a[i12], (List) J2.k(obj, U10 & 1048575), r22, false);
                                break;
                            case 32:
                                AbstractC2470k2.q(this.f24796a[i12], (List) J2.k(obj, U10 & 1048575), r22, false);
                                break;
                            case HVError.GPS_ACCESS_DENIED /* 33 */:
                                AbstractC2470k2.r(this.f24796a[i12], (List) J2.k(obj, U10 & 1048575), r22, false);
                                break;
                            case 34:
                                AbstractC2470k2.s(this.f24796a[i12], (List) J2.k(obj, U10 & 1048575), r22, false);
                                break;
                            case HVError.FACE_CAPTURE_TIMEOUT /* 35 */:
                                AbstractC2470k2.g(this.f24796a[i12], (List) J2.k(obj, U10 & 1048575), r22, true);
                                break;
                            case HVError.HYPER_DOC_DETECT_ERROR /* 36 */:
                                AbstractC2470k2.k(this.f24796a[i12], (List) J2.k(obj, U10 & 1048575), r22, true);
                                break;
                            case HVError.INVALID_FILE_ERROR /* 37 */:
                                AbstractC2470k2.n(this.f24796a[i12], (List) J2.k(obj, U10 & 1048575), r22, true);
                                break;
                            case 38:
                                AbstractC2470k2.v(this.f24796a[i12], (List) J2.k(obj, U10 & 1048575), r22, true);
                                break;
                            case 39:
                                AbstractC2470k2.m(this.f24796a[i12], (List) J2.k(obj, U10 & 1048575), r22, true);
                                break;
                            case RequestError.NETWORK_FAILURE /* 40 */:
                                AbstractC2470k2.j(this.f24796a[i12], (List) J2.k(obj, U10 & 1048575), r22, true);
                                break;
                            case RequestError.NO_DEV_KEY /* 41 */:
                                AbstractC2470k2.i(this.f24796a[i12], (List) J2.k(obj, U10 & 1048575), r22, true);
                                break;
                            case HVError.CONSENT_DENIED /* 42 */:
                                AbstractC2470k2.e(this.f24796a[i12], (List) J2.k(obj, U10 & 1048575), r22, true);
                                break;
                            case HVError.ENCRYPTION_ERROR /* 43 */:
                                AbstractC2470k2.u(this.f24796a[i12], (List) J2.k(obj, U10 & 1048575), r22, true);
                                break;
                            case HVError.SDK_CLOSE_ERROR /* 44 */:
                                AbstractC2470k2.h(this.f24796a[i12], (List) J2.k(obj, U10 & 1048575), r22, true);
                                break;
                            case HVError.PERMISSION_REVOKED_ERROR /* 45 */:
                                AbstractC2470k2.p(this.f24796a[i12], (List) J2.k(obj, U10 & 1048575), r22, true);
                                break;
                            case 46:
                                AbstractC2470k2.q(this.f24796a[i12], (List) J2.k(obj, U10 & 1048575), r22, true);
                                break;
                            case 47:
                                AbstractC2470k2.r(this.f24796a[i12], (List) J2.k(obj, U10 & 1048575), r22, true);
                                break;
                            case 48:
                                AbstractC2470k2.s(this.f24796a[i12], (List) J2.k(obj, U10 & 1048575), r22, true);
                                break;
                            case 49:
                                AbstractC2470k2.l(this.f24796a[i12], (List) J2.k(obj, U10 & 1048575), r22, c(i12));
                                break;
                            case 50:
                                w(r22, i13, J2.k(obj, U10 & 1048575), i12);
                                break;
                            case 51:
                                if (C(obj, i13, i12)) {
                                    r22.s(i13, I(obj, U10 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 52:
                                if (C(obj, i13, i12)) {
                                    r22.z(i13, J(obj, U10 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 53:
                                if (C(obj, i13, i12)) {
                                    r22.j(i13, V(obj, U10 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 54:
                                if (C(obj, i13, i12)) {
                                    r22.I(i13, V(obj, U10 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 55:
                                if (C(obj, i13, i12)) {
                                    r22.x(i13, L(obj, U10 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 56:
                                if (C(obj, i13, i12)) {
                                    r22.F(i13, V(obj, U10 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 57:
                                if (C(obj, i13, i12)) {
                                    r22.m(i13, L(obj, U10 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 58:
                                if (C(obj, i13, i12)) {
                                    r22.n(i13, D(obj, U10 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 59:
                                if (C(obj, i13, i12)) {
                                    E(i13, J2.k(obj, U10 & 1048575), r22);
                                    break;
                                } else {
                                    break;
                                }
                            case HVError.DETECTOR_NOT_AVAILABLE_ERROR /* 60 */:
                                if (C(obj, i13, i12)) {
                                    r22.G(i13, J2.k(obj, U10 & 1048575), c(i12));
                                    break;
                                } else {
                                    break;
                                }
                            case 61:
                                if (C(obj, i13, i12)) {
                                    r22.h(i13, (E0) J2.k(obj, U10 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 62:
                                if (C(obj, i13, i12)) {
                                    r22.i(i13, L(obj, U10 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 63:
                                if (C(obj, i13, i12)) {
                                    r22.q(i13, L(obj, U10 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 64:
                                if (C(obj, i13, i12)) {
                                    r22.C(i13, L(obj, U10 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 65:
                                if (C(obj, i13, i12)) {
                                    r22.v(i13, V(obj, U10 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 66:
                                if (C(obj, i13, i12)) {
                                    r22.E(i13, L(obj, U10 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 67:
                                if (C(obj, i13, i12)) {
                                    r22.y(i13, V(obj, U10 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 68:
                                if (C(obj, i13, i12)) {
                                    r22.w(i13, J2.k(obj, U10 & 1048575), c(i12));
                                    break;
                                } else {
                                    break;
                                }
                        }
                    }
                    while (entry2 != null) {
                        this.f24807l.f(r22, entry2);
                        entry2 = it2.hasNext() ? (Map.Entry) it2.next() : null;
                    }
                    AbstractC2539y2 abstractC2539y2 = this.f24806k;
                    abstractC2539y2.j(abstractC2539y2.d(obj), r22);
                    return;
                }
            }
            it2 = null;
            entry2 = null;
            length2 = this.f24796a.length;
            while (i12 < length2) {
            }
            while (entry2 != null) {
            }
            AbstractC2539y2 abstractC2539y22 = this.f24806k;
            abstractC2539y22.j(abstractC2539y22.d(obj), r22);
            return;
        }
        if (this.f24801f) {
            V0 b11 = this.f24807l.b(obj);
            if (!b11.f24818a.isEmpty()) {
                it = b11.f();
                entry = (Map.Entry) it.next();
                length = this.f24796a.length;
                Unsafe unsafe = f24795q;
                int i14 = 0;
                int i15 = 1048575;
                for (i10 = 0; i10 < length; i10 += 3) {
                    int U11 = U(i10);
                    int[] iArr = this.f24796a;
                    int i16 = iArr[i10];
                    int T10 = T(U11);
                    if (T10 <= 17) {
                        int i17 = iArr[i10 + 2];
                        int i18 = i17 & 1048575;
                        if (i18 != i15) {
                            i14 = unsafe.getInt(obj, i18);
                            i15 = i18;
                        }
                        i11 = 1 << (i17 >>> 20);
                    } else {
                        i11 = 0;
                    }
                    while (entry != null && this.f24807l.a(entry) <= i16) {
                        this.f24807l.f(r22, entry);
                        entry = it.hasNext() ? (Map.Entry) it.next() : null;
                    }
                    long j10 = U11 & 1048575;
                    switch (T10) {
                        case 0:
                            z10 = true;
                            z11 = false;
                            if ((i11 & i14) != 0) {
                                r22.s(i16, J2.f(obj, j10));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            z10 = true;
                            z11 = false;
                            if ((i11 & i14) != 0) {
                                r22.z(i16, J2.g(obj, j10));
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            z10 = true;
                            z11 = false;
                            if ((i11 & i14) != 0) {
                                r22.j(i16, unsafe.getLong(obj, j10));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            z10 = true;
                            z11 = false;
                            if ((i11 & i14) != 0) {
                                r22.I(i16, unsafe.getLong(obj, j10));
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            z10 = true;
                            z11 = false;
                            if ((i11 & i14) != 0) {
                                r22.x(i16, unsafe.getInt(obj, j10));
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            z10 = true;
                            z11 = false;
                            if ((i11 & i14) != 0) {
                                r22.F(i16, unsafe.getLong(obj, j10));
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            z10 = true;
                            z11 = false;
                            if ((i11 & i14) != 0) {
                                r22.m(i16, unsafe.getInt(obj, j10));
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            z10 = true;
                            z11 = false;
                            if ((i11 & i14) != 0) {
                                r22.n(i16, J2.B(obj, j10));
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            z10 = true;
                            z11 = false;
                            if ((i11 & i14) != 0) {
                                E(i16, unsafe.getObject(obj, j10), r22);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            z10 = true;
                            z11 = false;
                            if ((i11 & i14) != 0) {
                                r22.G(i16, unsafe.getObject(obj, j10), c(i10));
                                break;
                            } else {
                                break;
                            }
                        case RequestError.EVENT_TIMEOUT /* 10 */:
                            z10 = true;
                            z11 = false;
                            if ((i11 & i14) != 0) {
                                r22.h(i16, (E0) unsafe.getObject(obj, j10));
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            z10 = true;
                            z11 = false;
                            if ((i11 & i14) != 0) {
                                r22.i(i16, unsafe.getInt(obj, j10));
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            z10 = true;
                            z11 = false;
                            if ((i11 & i14) != 0) {
                                r22.q(i16, unsafe.getInt(obj, j10));
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            z10 = true;
                            z11 = false;
                            if ((i11 & i14) != 0) {
                                r22.C(i16, unsafe.getInt(obj, j10));
                                break;
                            } else {
                                break;
                            }
                        case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                            z10 = true;
                            z11 = false;
                            if ((i11 & i14) != 0) {
                                r22.v(i16, unsafe.getLong(obj, j10));
                                break;
                            } else {
                                break;
                            }
                        case HVError.SSL_CONNECT_ERROR /* 15 */:
                            z10 = true;
                            z11 = false;
                            if ((i11 & i14) != 0) {
                                r22.E(i16, unsafe.getInt(obj, j10));
                                break;
                            } else {
                                break;
                            }
                        case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                            z10 = true;
                            z11 = false;
                            if ((i11 & i14) != 0) {
                                r22.y(i16, unsafe.getLong(obj, j10));
                                break;
                            } else {
                                break;
                            }
                        case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                            z10 = true;
                            z11 = false;
                            if ((i11 & i14) != 0) {
                                r22.w(i16, unsafe.getObject(obj, j10), c(i10));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            z12 = false;
                            z10 = true;
                            AbstractC2470k2.g(this.f24796a[i10], (List) unsafe.getObject(obj, j10), r22, false);
                            z11 = z12;
                            break;
                        case 19:
                            z12 = false;
                            z10 = true;
                            AbstractC2470k2.k(this.f24796a[i10], (List) unsafe.getObject(obj, j10), r22, false);
                            z11 = z12;
                            break;
                        case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                            z12 = false;
                            z10 = true;
                            AbstractC2470k2.n(this.f24796a[i10], (List) unsafe.getObject(obj, j10), r22, false);
                            z11 = z12;
                            break;
                        case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                            z12 = false;
                            z10 = true;
                            AbstractC2470k2.v(this.f24796a[i10], (List) unsafe.getObject(obj, j10), r22, false);
                            z11 = z12;
                            break;
                        case HVError.FACE_DETECTION_ERROR /* 22 */:
                            z12 = false;
                            z10 = true;
                            AbstractC2470k2.m(this.f24796a[i10], (List) unsafe.getObject(obj, j10), r22, false);
                            z11 = z12;
                            break;
                        case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                            z12 = false;
                            z10 = true;
                            AbstractC2470k2.j(this.f24796a[i10], (List) unsafe.getObject(obj, j10), r22, false);
                            z11 = z12;
                            break;
                        case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                            z12 = false;
                            z10 = true;
                            AbstractC2470k2.i(this.f24796a[i10], (List) unsafe.getObject(obj, j10), r22, false);
                            z11 = z12;
                            break;
                        case HVError.LOW_STORAGE_ERROR /* 25 */:
                            z10 = true;
                            int i19 = this.f24796a[i10];
                            List list = (List) unsafe.getObject(obj, j10);
                            z13 = false;
                            AbstractC2470k2.e(i19, list, r22, false);
                            z11 = z13;
                            break;
                        case 26:
                            z10 = true;
                            AbstractC2470k2.t(this.f24796a[i10], (List) unsafe.getObject(obj, j10), r22);
                            z11 = false;
                            break;
                        case 27:
                            z10 = true;
                            AbstractC2470k2.o(this.f24796a[i10], (List) unsafe.getObject(obj, j10), r22, c(i10));
                            z11 = false;
                            break;
                        case 28:
                            z10 = true;
                            AbstractC2470k2.f(this.f24796a[i10], (List) unsafe.getObject(obj, j10), r22);
                            z11 = false;
                            break;
                        case 29:
                            z12 = false;
                            z10 = true;
                            AbstractC2470k2.u(this.f24796a[i10], (List) unsafe.getObject(obj, j10), r22, false);
                            z11 = z12;
                            break;
                        case 30:
                            z12 = false;
                            z10 = true;
                            AbstractC2470k2.h(this.f24796a[i10], (List) unsafe.getObject(obj, j10), r22, false);
                            z11 = z12;
                            break;
                        case HVError.INSTRUCTION_ERROR /* 31 */:
                            z12 = false;
                            z10 = true;
                            AbstractC2470k2.p(this.f24796a[i10], (List) unsafe.getObject(obj, j10), r22, false);
                            z11 = z12;
                            break;
                        case 32:
                            z12 = false;
                            z10 = true;
                            AbstractC2470k2.q(this.f24796a[i10], (List) unsafe.getObject(obj, j10), r22, false);
                            z11 = z12;
                            break;
                        case HVError.GPS_ACCESS_DENIED /* 33 */:
                            z12 = false;
                            z10 = true;
                            AbstractC2470k2.r(this.f24796a[i10], (List) unsafe.getObject(obj, j10), r22, false);
                            z11 = z12;
                            break;
                        case 34:
                            z10 = true;
                            int i20 = this.f24796a[i10];
                            List list2 = (List) unsafe.getObject(obj, j10);
                            z13 = false;
                            AbstractC2470k2.s(i20, list2, r22, false);
                            z11 = z13;
                            break;
                        case HVError.FACE_CAPTURE_TIMEOUT /* 35 */:
                            z10 = true;
                            AbstractC2470k2.g(this.f24796a[i10], (List) unsafe.getObject(obj, j10), r22, true);
                            z11 = false;
                            break;
                        case HVError.HYPER_DOC_DETECT_ERROR /* 36 */:
                            z10 = true;
                            AbstractC2470k2.k(this.f24796a[i10], (List) unsafe.getObject(obj, j10), r22, true);
                            z11 = false;
                            break;
                        case HVError.INVALID_FILE_ERROR /* 37 */:
                            z10 = true;
                            AbstractC2470k2.n(this.f24796a[i10], (List) unsafe.getObject(obj, j10), r22, true);
                            z11 = false;
                            break;
                        case 38:
                            z10 = true;
                            AbstractC2470k2.v(this.f24796a[i10], (List) unsafe.getObject(obj, j10), r22, true);
                            z11 = false;
                            break;
                        case 39:
                            z10 = true;
                            AbstractC2470k2.m(this.f24796a[i10], (List) unsafe.getObject(obj, j10), r22, true);
                            z11 = false;
                            break;
                        case RequestError.NETWORK_FAILURE /* 40 */:
                            z10 = true;
                            AbstractC2470k2.j(this.f24796a[i10], (List) unsafe.getObject(obj, j10), r22, true);
                            z11 = false;
                            break;
                        case RequestError.NO_DEV_KEY /* 41 */:
                            z10 = true;
                            AbstractC2470k2.i(this.f24796a[i10], (List) unsafe.getObject(obj, j10), r22, true);
                            z11 = false;
                            break;
                        case HVError.CONSENT_DENIED /* 42 */:
                            z10 = true;
                            AbstractC2470k2.e(this.f24796a[i10], (List) unsafe.getObject(obj, j10), r22, true);
                            z11 = false;
                            break;
                        case HVError.ENCRYPTION_ERROR /* 43 */:
                            z10 = true;
                            AbstractC2470k2.u(this.f24796a[i10], (List) unsafe.getObject(obj, j10), r22, true);
                            z11 = false;
                            break;
                        case HVError.SDK_CLOSE_ERROR /* 44 */:
                            z10 = true;
                            AbstractC2470k2.h(this.f24796a[i10], (List) unsafe.getObject(obj, j10), r22, true);
                            z11 = false;
                            break;
                        case HVError.PERMISSION_REVOKED_ERROR /* 45 */:
                            z10 = true;
                            AbstractC2470k2.p(this.f24796a[i10], (List) unsafe.getObject(obj, j10), r22, true);
                            z11 = false;
                            break;
                        case 46:
                            z10 = true;
                            AbstractC2470k2.q(this.f24796a[i10], (List) unsafe.getObject(obj, j10), r22, true);
                            z11 = false;
                            break;
                        case 47:
                            z10 = true;
                            AbstractC2470k2.r(this.f24796a[i10], (List) unsafe.getObject(obj, j10), r22, true);
                            z11 = false;
                            break;
                        case 48:
                            z10 = true;
                            AbstractC2470k2.s(this.f24796a[i10], (List) unsafe.getObject(obj, j10), r22, true);
                            z11 = false;
                            break;
                        case 49:
                            AbstractC2470k2.l(this.f24796a[i10], (List) unsafe.getObject(obj, j10), r22, c(i10));
                            z10 = true;
                            z11 = false;
                            break;
                        case 50:
                            w(r22, i16, unsafe.getObject(obj, j10), i10);
                            z10 = true;
                            z11 = false;
                            break;
                        case 51:
                            if (C(obj, i16, i10)) {
                                r22.s(i16, I(obj, j10));
                            }
                            z10 = true;
                            z11 = false;
                            break;
                        case 52:
                            if (C(obj, i16, i10)) {
                                r22.z(i16, J(obj, j10));
                            }
                            z10 = true;
                            z11 = false;
                            break;
                        case 53:
                            if (C(obj, i16, i10)) {
                                r22.j(i16, V(obj, j10));
                            }
                            z10 = true;
                            z11 = false;
                            break;
                        case 54:
                            if (C(obj, i16, i10)) {
                                r22.I(i16, V(obj, j10));
                            }
                            z10 = true;
                            z11 = false;
                            break;
                        case 55:
                            if (C(obj, i16, i10)) {
                                r22.x(i16, L(obj, j10));
                            }
                            z10 = true;
                            z11 = false;
                            break;
                        case 56:
                            if (C(obj, i16, i10)) {
                                r22.F(i16, V(obj, j10));
                            }
                            z10 = true;
                            z11 = false;
                            break;
                        case 57:
                            if (C(obj, i16, i10)) {
                                r22.m(i16, L(obj, j10));
                            }
                            z10 = true;
                            z11 = false;
                            break;
                        case 58:
                            if (C(obj, i16, i10)) {
                                r22.n(i16, D(obj, j10));
                            }
                            z10 = true;
                            z11 = false;
                            break;
                        case 59:
                            if (C(obj, i16, i10)) {
                                E(i16, unsafe.getObject(obj, j10), r22);
                            }
                            z10 = true;
                            z11 = false;
                            break;
                        case HVError.DETECTOR_NOT_AVAILABLE_ERROR /* 60 */:
                            if (C(obj, i16, i10)) {
                                r22.G(i16, unsafe.getObject(obj, j10), c(i10));
                            }
                            z10 = true;
                            z11 = false;
                            break;
                        case 61:
                            if (C(obj, i16, i10)) {
                                r22.h(i16, (E0) unsafe.getObject(obj, j10));
                            }
                            z10 = true;
                            z11 = false;
                            break;
                        case 62:
                            if (C(obj, i16, i10)) {
                                r22.i(i16, L(obj, j10));
                            }
                            z10 = true;
                            z11 = false;
                            break;
                        case 63:
                            if (C(obj, i16, i10)) {
                                r22.q(i16, L(obj, j10));
                            }
                            z10 = true;
                            z11 = false;
                            break;
                        case 64:
                            if (C(obj, i16, i10)) {
                                r22.C(i16, L(obj, j10));
                            }
                            z10 = true;
                            z11 = false;
                            break;
                        case 65:
                            if (C(obj, i16, i10)) {
                                r22.v(i16, V(obj, j10));
                            }
                            z10 = true;
                            z11 = false;
                            break;
                        case 66:
                            if (C(obj, i16, i10)) {
                                r22.E(i16, L(obj, j10));
                            }
                            z10 = true;
                            z11 = false;
                            break;
                        case 67:
                            if (C(obj, i16, i10)) {
                                r22.y(i16, V(obj, j10));
                            }
                            z10 = true;
                            z11 = false;
                            break;
                        case 68:
                            if (C(obj, i16, i10)) {
                                r22.w(i16, unsafe.getObject(obj, j10), c(i10));
                            }
                            z10 = true;
                            z11 = false;
                            break;
                        default:
                            z10 = true;
                            z11 = false;
                            break;
                    }
                }
                while (entry != null) {
                    this.f24807l.f(r22, entry);
                    entry = it.hasNext() ? (Map.Entry) it.next() : null;
                }
                AbstractC2539y2 abstractC2539y23 = this.f24806k;
                abstractC2539y23.j(abstractC2539y23.d(obj), r22);
            }
        }
        it = null;
        entry = null;
        length = this.f24796a.length;
        Unsafe unsafe2 = f24795q;
        int i142 = 0;
        int i152 = 1048575;
        while (i10 < length) {
        }
        while (entry != null) {
        }
        AbstractC2539y2 abstractC2539y232 = this.f24806k;
        abstractC2539y232.j(abstractC2539y232.d(obj), r22);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2460i2
    public final void i(Object obj, Object obj2) {
        p(obj);
        obj2.getClass();
        for (int i10 = 0; i10 < this.f24796a.length; i10 += 3) {
            int U10 = U(i10);
            int i11 = this.f24796a[i10];
            long j10 = 1048575 & U10;
            switch (T(U10)) {
                case 0:
                    if (y(obj2, i10)) {
                        J2.t(obj, j10, J2.f(obj2, j10));
                        s(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (y(obj2, i10)) {
                        J2.u(obj, j10, J2.g(obj2, j10));
                        s(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (y(obj2, i10)) {
                        J2.w(obj, j10, J2.i(obj2, j10));
                        s(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (y(obj2, i10)) {
                        J2.w(obj, j10, J2.i(obj2, j10));
                        s(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (y(obj2, i10)) {
                        J2.v(obj, j10, J2.h(obj2, j10));
                        s(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (y(obj2, i10)) {
                        J2.w(obj, j10, J2.i(obj2, j10));
                        s(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (y(obj2, i10)) {
                        J2.v(obj, j10, J2.h(obj2, j10));
                        s(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (y(obj2, i10)) {
                        J2.r(obj, j10, J2.B(obj2, j10));
                        s(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (y(obj2, i10)) {
                        J2.x(obj, j10, J2.k(obj2, j10));
                        s(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    q(obj, obj2, i10);
                    break;
                case RequestError.EVENT_TIMEOUT /* 10 */:
                    if (y(obj2, i10)) {
                        J2.x(obj, j10, J2.k(obj2, j10));
                        s(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (y(obj2, i10)) {
                        J2.v(obj, j10, J2.h(obj2, j10));
                        s(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (y(obj2, i10)) {
                        J2.v(obj, j10, J2.h(obj2, j10));
                        s(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (y(obj2, i10)) {
                        J2.v(obj, j10, J2.h(obj2, j10));
                        s(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                    if (y(obj2, i10)) {
                        J2.w(obj, j10, J2.i(obj2, j10));
                        s(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case HVError.SSL_CONNECT_ERROR /* 15 */:
                    if (y(obj2, i10)) {
                        J2.v(obj, j10, J2.h(obj2, j10));
                        s(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                    if (y(obj2, i10)) {
                        J2.w(obj, j10, J2.i(obj2, j10));
                        s(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                    q(obj, obj2, i10);
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
                    this.f24805j.b(obj, obj2, j10);
                    break;
                case 50:
                    int i12 = AbstractC2470k2.f24881d;
                    J2.x(obj, j10, K1.b(J2.k(obj, j10), J2.k(obj2, j10)));
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
                    if (C(obj2, i11, i10)) {
                        J2.x(obj, j10, J2.k(obj2, j10));
                        t(obj, i11, i10);
                        break;
                    } else {
                        break;
                    }
                case HVError.DETECTOR_NOT_AVAILABLE_ERROR /* 60 */:
                    r(obj, obj2, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (C(obj2, i11, i10)) {
                        J2.x(obj, j10, J2.k(obj2, j10));
                        t(obj, i11, i10);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    r(obj, obj2, i10);
                    break;
            }
        }
        AbstractC2470k2.c(this.f24806k, obj, obj2);
        if (this.f24801f) {
            AbstractC2470k2.b(this.f24807l, obj, obj2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0304, code lost:
    
        if (r0 != r15) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0307, code lost:
    
        r6 = r32;
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0328, code lost:
    
        if (r0 != r15) goto L105;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:63:0x00a2. Please report as an issue. */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2460i2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(Object obj, byte[] bArr, int i10, int i11, C2502r0 c2502r0) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        Unsafe unsafe;
        int i17;
        boolean z10;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z11;
        int i22;
        int i23;
        int i24;
        S1 s12 = this;
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i25 = i11;
        C2502r0 c2502r02 = c2502r0;
        boolean z12 = true;
        P2 p22 = P2.zza;
        int i26 = -1;
        if (s12.f24808m - 1 == 0) {
            F(obj, bArr, i10, i11, 0, c2502r0);
            return;
        }
        p(obj);
        Unsafe unsafe2 = f24795q;
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
                int k10 = AbstractC2507s0.k(b10, bArr2, i33, c2502r02);
                i12 = c2502r02.f24918a;
                i33 = k10;
            } else {
                i12 = b10;
            }
            int i34 = i12 >>> 3;
            int Q10 = i34 > i30 ? s12.Q(i34, i31 / 3) : s12.P(i34);
            if (Q10 == i26) {
                i13 = i34;
                i14 = i33;
                i15 = i32;
                i16 = i29;
                unsafe = unsafe2;
                i17 = i26;
                z10 = z12;
                i18 = 0;
            } else {
                int i35 = i12 & 7;
                int[] iArr = s12.f24796a;
                int i36 = iArr[Q10 + 1];
                int T10 = T(i36);
                Unsafe unsafe3 = unsafe2;
                long j10 = i36 & i27;
                if (T10 <= 17) {
                    int i37 = iArr[Q10 + 2];
                    int i38 = 1 << (i37 >>> 20);
                    int i39 = i37 & 1048575;
                    if (i39 != i29) {
                        if (i29 != 1048575) {
                            unsafe2 = unsafe3;
                            unsafe2.putInt(obj2, i29, i32);
                        } else {
                            unsafe2 = unsafe3;
                        }
                        if (i39 != 1048575) {
                            i32 = unsafe2.getInt(obj2, i39);
                        }
                        i19 = i39;
                        i15 = i32;
                    } else {
                        unsafe2 = unsafe3;
                        i15 = i32;
                        i19 = i29;
                    }
                    switch (T10) {
                        case 0:
                            i13 = i34;
                            i20 = Q10;
                            i21 = i33;
                            z11 = true;
                            if (i35 != 1) {
                                z10 = z11;
                                unsafe = unsafe2;
                                i14 = i21;
                                i16 = i19;
                                i17 = -1;
                                i18 = i20;
                                i28 = AbstractC2507s0.i(i12, bArr, i14, i11, G(obj), c2502r0);
                                s12 = this;
                                obj2 = obj;
                                bArr2 = bArr;
                                i25 = i11;
                                c2502r02 = c2502r0;
                                i32 = i15;
                                break;
                            } else {
                                J2.t(obj2, j10, Double.longBitsToDouble(AbstractC2507s0.q(bArr2, i21)));
                                i28 = i21 + 8;
                                i32 = i15 | i38;
                                z12 = true;
                                i31 = i20;
                                i27 = 1048575;
                                i29 = i19;
                                i30 = i13;
                                i26 = -1;
                                i25 = i11;
                                break;
                            }
                        case 1:
                            i13 = i34;
                            i20 = Q10;
                            i21 = i33;
                            if (i35 != 5) {
                                z11 = true;
                                z10 = z11;
                                unsafe = unsafe2;
                                i14 = i21;
                                i16 = i19;
                                i17 = -1;
                                i18 = i20;
                                i28 = AbstractC2507s0.i(i12, bArr, i14, i11, G(obj), c2502r0);
                                s12 = this;
                                obj2 = obj;
                                bArr2 = bArr;
                                i25 = i11;
                                c2502r02 = c2502r0;
                                i32 = i15;
                                break;
                            } else {
                                J2.u(obj2, j10, Float.intBitsToFloat(AbstractC2507s0.b(bArr2, i21)));
                                i28 = i21 + 4;
                                i32 = i15 | i38;
                                i31 = i20;
                                i27 = 1048575;
                                i29 = i19;
                                i30 = i13;
                                i26 = -1;
                                z12 = true;
                                i25 = i11;
                                break;
                            }
                        case 2:
                        case 3:
                            i13 = i34;
                            i20 = Q10;
                            i21 = i33;
                            if (i35 != 0) {
                                z11 = true;
                                z10 = z11;
                                unsafe = unsafe2;
                                i14 = i21;
                                i16 = i19;
                                i17 = -1;
                                i18 = i20;
                                i28 = AbstractC2507s0.i(i12, bArr, i14, i11, G(obj), c2502r0);
                                s12 = this;
                                obj2 = obj;
                                bArr2 = bArr;
                                i25 = i11;
                                c2502r02 = c2502r0;
                                i32 = i15;
                                break;
                            } else {
                                int m10 = AbstractC2507s0.m(bArr2, i21, c2502r02);
                                unsafe2.putLong(obj, j10, c2502r02.f24919b);
                                i32 = i15 | i38;
                                i31 = i20;
                                i28 = m10;
                                i27 = 1048575;
                                i29 = i19;
                                i30 = i13;
                                i26 = -1;
                                z12 = true;
                                i25 = i11;
                                break;
                            }
                        case 4:
                        case 11:
                            i13 = i34;
                            i20 = Q10;
                            i21 = i33;
                            if (i35 != 0) {
                                z11 = true;
                                z10 = z11;
                                unsafe = unsafe2;
                                i14 = i21;
                                i16 = i19;
                                i17 = -1;
                                i18 = i20;
                                i28 = AbstractC2507s0.i(i12, bArr, i14, i11, G(obj), c2502r0);
                                s12 = this;
                                obj2 = obj;
                                bArr2 = bArr;
                                i25 = i11;
                                c2502r02 = c2502r0;
                                i32 = i15;
                                break;
                            } else {
                                i28 = AbstractC2507s0.j(bArr2, i21, c2502r02);
                                unsafe2.putInt(obj2, j10, c2502r02.f24918a);
                                i32 = i15 | i38;
                                i31 = i20;
                                i27 = 1048575;
                                i29 = i19;
                                i30 = i13;
                                i26 = -1;
                                z12 = true;
                                i25 = i11;
                                break;
                            }
                        case 5:
                        case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                            i13 = i34;
                            i20 = Q10;
                            if (i35 != 1) {
                                i21 = i33;
                                z11 = true;
                                z10 = z11;
                                unsafe = unsafe2;
                                i14 = i21;
                                i16 = i19;
                                i17 = -1;
                                i18 = i20;
                                i28 = AbstractC2507s0.i(i12, bArr, i14, i11, G(obj), c2502r0);
                                s12 = this;
                                obj2 = obj;
                                bArr2 = bArr;
                                i25 = i11;
                                c2502r02 = c2502r0;
                                i32 = i15;
                                break;
                            } else {
                                unsafe2.putLong(obj, j10, AbstractC2507s0.q(bArr2, i33));
                                i28 = i33 + 8;
                                i32 = i15 | i38;
                                i31 = i20;
                                i27 = 1048575;
                                i29 = i19;
                                i30 = i13;
                                i26 = -1;
                                z12 = true;
                                i25 = i11;
                                break;
                            }
                        case 6:
                        case 13:
                            i13 = i34;
                            i20 = Q10;
                            if (i35 != 5) {
                                i21 = i33;
                                z11 = true;
                                z10 = z11;
                                unsafe = unsafe2;
                                i14 = i21;
                                i16 = i19;
                                i17 = -1;
                                i18 = i20;
                                i28 = AbstractC2507s0.i(i12, bArr, i14, i11, G(obj), c2502r0);
                                s12 = this;
                                obj2 = obj;
                                bArr2 = bArr;
                                i25 = i11;
                                c2502r02 = c2502r0;
                                i32 = i15;
                                break;
                            } else {
                                unsafe2.putInt(obj2, j10, AbstractC2507s0.b(bArr2, i33));
                                i28 = i33 + 4;
                                i32 = i15 | i38;
                                i31 = i20;
                                i27 = 1048575;
                                i29 = i19;
                                i30 = i13;
                                i26 = -1;
                                z12 = true;
                                i25 = i11;
                                break;
                            }
                        case 7:
                            i13 = i34;
                            i20 = Q10;
                            if (i35 != 0) {
                                i21 = i33;
                                z11 = true;
                                z10 = z11;
                                unsafe = unsafe2;
                                i14 = i21;
                                i16 = i19;
                                i17 = -1;
                                i18 = i20;
                                i28 = AbstractC2507s0.i(i12, bArr, i14, i11, G(obj), c2502r0);
                                s12 = this;
                                obj2 = obj;
                                bArr2 = bArr;
                                i25 = i11;
                                c2502r02 = c2502r0;
                                i32 = i15;
                                break;
                            } else {
                                i28 = AbstractC2507s0.m(bArr2, i33, c2502r02);
                                J2.r(obj2, j10, c2502r02.f24919b != 0);
                                i32 = i15 | i38;
                                i31 = i20;
                                i27 = 1048575;
                                i29 = i19;
                                i30 = i13;
                                i26 = -1;
                                z12 = true;
                                i25 = i11;
                                break;
                            }
                        case 8:
                            i13 = i34;
                            i20 = Q10;
                            if (i35 != 2) {
                                i21 = i33;
                                z11 = true;
                                z10 = z11;
                                unsafe = unsafe2;
                                i14 = i21;
                                i16 = i19;
                                i17 = -1;
                                i18 = i20;
                                i28 = AbstractC2507s0.i(i12, bArr, i14, i11, G(obj), c2502r0);
                                s12 = this;
                                obj2 = obj;
                                bArr2 = bArr;
                                i25 = i11;
                                c2502r02 = c2502r0;
                                i32 = i15;
                                break;
                            } else {
                                i28 = (536870912 & i36) == 0 ? AbstractC2507s0.g(bArr2, i33, c2502r02) : AbstractC2507s0.h(bArr2, i33, c2502r02);
                                unsafe2.putObject(obj2, j10, c2502r02.f24920c);
                                i32 = i15 | i38;
                                i31 = i20;
                                i27 = 1048575;
                                i29 = i19;
                                i30 = i13;
                                i26 = -1;
                                z12 = true;
                                i25 = i11;
                                break;
                            }
                        case 9:
                            i13 = i34;
                            i22 = Q10;
                            if (i35 != 2) {
                                i20 = i22;
                                i21 = i33;
                                z11 = true;
                                z10 = z11;
                                unsafe = unsafe2;
                                i14 = i21;
                                i16 = i19;
                                i17 = -1;
                                i18 = i20;
                                i28 = AbstractC2507s0.i(i12, bArr, i14, i11, G(obj), c2502r0);
                                s12 = this;
                                obj2 = obj;
                                bArr2 = bArr;
                                i25 = i11;
                                c2502r02 = c2502r0;
                                i32 = i15;
                                break;
                            } else {
                                Object m11 = s12.m(obj2, i22);
                                i28 = AbstractC2507s0.o(m11, s12.c(i22), bArr, i33, i11, c2502r0);
                                s12.u(obj2, i22, m11);
                                i32 = i15 | i38;
                                i31 = i22;
                                i27 = 1048575;
                                i29 = i19;
                                i30 = i13;
                                i26 = -1;
                                z12 = true;
                                i25 = i11;
                                break;
                            }
                        case RequestError.EVENT_TIMEOUT /* 10 */:
                            i13 = i34;
                            i22 = Q10;
                            if (i35 != 2) {
                                i20 = i22;
                                i21 = i33;
                                z11 = true;
                                z10 = z11;
                                unsafe = unsafe2;
                                i14 = i21;
                                i16 = i19;
                                i17 = -1;
                                i18 = i20;
                                i28 = AbstractC2507s0.i(i12, bArr, i14, i11, G(obj), c2502r0);
                                s12 = this;
                                obj2 = obj;
                                bArr2 = bArr;
                                i25 = i11;
                                c2502r02 = c2502r0;
                                i32 = i15;
                                break;
                            } else {
                                int a10 = AbstractC2507s0.a(bArr2, i33, c2502r02);
                                unsafe2.putObject(obj2, j10, c2502r02.f24920c);
                                i32 = i15 | i38;
                                i28 = a10;
                                i31 = i22;
                                i27 = 1048575;
                                i29 = i19;
                                i30 = i13;
                                i26 = -1;
                                z12 = true;
                                i25 = i11;
                                break;
                            }
                        case 12:
                            i13 = i34;
                            i22 = Q10;
                            if (i35 != 0) {
                                i20 = i22;
                                i21 = i33;
                                z11 = true;
                                z10 = z11;
                                unsafe = unsafe2;
                                i14 = i21;
                                i16 = i19;
                                i17 = -1;
                                i18 = i20;
                                i28 = AbstractC2507s0.i(i12, bArr, i14, i11, G(obj), c2502r0);
                                s12 = this;
                                obj2 = obj;
                                bArr2 = bArr;
                                i25 = i11;
                                c2502r02 = c2502r0;
                                i32 = i15;
                                break;
                            } else {
                                i28 = AbstractC2507s0.j(bArr2, i33, c2502r02);
                                unsafe2.putInt(obj2, j10, c2502r02.f24918a);
                                i32 = i15 | i38;
                                i31 = i22;
                                i27 = 1048575;
                                i29 = i19;
                                i30 = i13;
                                i26 = -1;
                                z12 = true;
                                i25 = i11;
                                break;
                            }
                        case HVError.SSL_CONNECT_ERROR /* 15 */:
                            i13 = i34;
                            i22 = Q10;
                            if (i35 != 0) {
                                i20 = i22;
                                i21 = i33;
                                z11 = true;
                                z10 = z11;
                                unsafe = unsafe2;
                                i14 = i21;
                                i16 = i19;
                                i17 = -1;
                                i18 = i20;
                                i28 = AbstractC2507s0.i(i12, bArr, i14, i11, G(obj), c2502r0);
                                s12 = this;
                                obj2 = obj;
                                bArr2 = bArr;
                                i25 = i11;
                                c2502r02 = c2502r0;
                                i32 = i15;
                                break;
                            } else {
                                i28 = AbstractC2507s0.j(bArr2, i33, c2502r02);
                                unsafe2.putInt(obj2, j10, I0.a(c2502r02.f24918a));
                                i32 = i15 | i38;
                                i31 = i22;
                                i27 = 1048575;
                                i29 = i19;
                                i30 = i13;
                                i26 = -1;
                                z12 = true;
                                i25 = i11;
                                break;
                            }
                        case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                            if (i35 != 0) {
                                i13 = i34;
                                i20 = Q10;
                                i21 = i33;
                                z11 = true;
                                z10 = z11;
                                unsafe = unsafe2;
                                i14 = i21;
                                i16 = i19;
                                i17 = -1;
                                i18 = i20;
                                i28 = AbstractC2507s0.i(i12, bArr, i14, i11, G(obj), c2502r0);
                                s12 = this;
                                obj2 = obj;
                                bArr2 = bArr;
                                i25 = i11;
                                c2502r02 = c2502r0;
                                i32 = i15;
                                break;
                            } else {
                                int m12 = AbstractC2507s0.m(bArr2, i33, c2502r02);
                                i13 = i34;
                                i22 = Q10;
                                unsafe2.putLong(obj, j10, I0.b(c2502r02.f24919b));
                                i32 = i15 | i38;
                                i28 = m12;
                                i31 = i22;
                                i27 = 1048575;
                                i29 = i19;
                                i30 = i13;
                                i26 = -1;
                                z12 = true;
                                i25 = i11;
                                break;
                            }
                        default:
                            i13 = i34;
                            i20 = Q10;
                            i21 = i33;
                            z11 = true;
                            z10 = z11;
                            unsafe = unsafe2;
                            i14 = i21;
                            i16 = i19;
                            i17 = -1;
                            i18 = i20;
                            i28 = AbstractC2507s0.i(i12, bArr, i14, i11, G(obj), c2502r0);
                            s12 = this;
                            obj2 = obj;
                            bArr2 = bArr;
                            i25 = i11;
                            c2502r02 = c2502r0;
                            i32 = i15;
                            break;
                    }
                } else {
                    i13 = i34;
                    int i40 = i33;
                    unsafe2 = unsafe3;
                    if (T10 != 27) {
                        z10 = true;
                        i18 = Q10;
                        int i41 = i29;
                        int i42 = i32;
                        if (T10 <= 49) {
                            i17 = -1;
                            i23 = i42;
                            unsafe = unsafe2;
                            i16 = i41;
                            i28 = O(obj, bArr, i40, i11, i12, i13, i35, i18, i36, T10, j10, c2502r0);
                            if (i28 == i40) {
                                i15 = i23;
                                i14 = i28;
                            }
                        } else {
                            i23 = i42;
                            i16 = i41;
                            unsafe = unsafe2;
                            i24 = i40;
                            i17 = -1;
                            if (T10 != 50) {
                                i28 = N(obj, bArr, i24, i11, i12, i13, i35, i36, T10, j10, i18, c2502r0);
                            } else if (i35 == 2) {
                                i28 = M(obj, bArr, i24, i11, i18, j10, c2502r0);
                            }
                        }
                        s12 = this;
                        obj2 = obj;
                        bArr2 = bArr;
                        i32 = i23;
                        i25 = i11;
                        c2502r02 = c2502r0;
                    } else if (i35 == 2) {
                        InterfaceC2484n1 interfaceC2484n1 = (InterfaceC2484n1) unsafe2.getObject(obj2, j10);
                        if (!interfaceC2484n1.a()) {
                            int size = interfaceC2484n1.size();
                            interfaceC2484n1 = interfaceC2484n1.l(size == 0 ? 10 : size + size);
                            unsafe2.putObject(obj2, j10, interfaceC2484n1);
                        }
                        i28 = AbstractC2507s0.e(s12.c(Q10), i12, bArr, i40, i11, interfaceC2484n1, c2502r0);
                        bArr2 = bArr;
                        i32 = i32;
                        i29 = i29;
                        i27 = 1048575;
                        z12 = true;
                        i31 = Q10;
                        i30 = i13;
                        i26 = -1;
                        i25 = i11;
                        c2502r02 = c2502r0;
                    } else {
                        i18 = Q10;
                        z10 = true;
                        i23 = i32;
                        i16 = i29;
                        unsafe = unsafe2;
                        i24 = i40;
                        i17 = -1;
                    }
                    i15 = i23;
                    i14 = i24;
                    i28 = AbstractC2507s0.i(i12, bArr, i14, i11, G(obj), c2502r0);
                    s12 = this;
                    obj2 = obj;
                    bArr2 = bArr;
                    i25 = i11;
                    c2502r02 = c2502r0;
                    i32 = i15;
                }
                i26 = i17;
                z12 = z10;
                i31 = i18;
                i30 = i13;
                unsafe2 = unsafe;
                i29 = i16;
                i27 = 1048575;
            }
            i28 = AbstractC2507s0.i(i12, bArr, i14, i11, G(obj), c2502r0);
            s12 = this;
            obj2 = obj;
            bArr2 = bArr;
            i25 = i11;
            c2502r02 = c2502r0;
            i32 = i15;
            i26 = i17;
            z12 = z10;
            i31 = i18;
            i30 = i13;
            unsafe2 = unsafe;
            i29 = i16;
            i27 = 1048575;
        }
        int i43 = i32;
        int i44 = i29;
        Unsafe unsafe4 = unsafe2;
        if (i44 != i27) {
            unsafe4.putInt(obj, i44, i43);
        }
        if (i28 != i11) {
            throw C2499q1.e();
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2460i2
    public final boolean k(Object obj, Object obj2) {
        boolean w10;
        int length = this.f24796a.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int U10 = U(i10);
            long j10 = U10 & 1048575;
            switch (T(U10)) {
                case 0:
                    if (x(obj, obj2, i10) && Double.doubleToLongBits(J2.f(obj, j10)) == Double.doubleToLongBits(J2.f(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (x(obj, obj2, i10) && Float.floatToIntBits(J2.g(obj, j10)) == Float.floatToIntBits(J2.g(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (x(obj, obj2, i10) && J2.i(obj, j10) == J2.i(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (x(obj, obj2, i10) && J2.i(obj, j10) == J2.i(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (x(obj, obj2, i10) && J2.h(obj, j10) == J2.h(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (x(obj, obj2, i10) && J2.i(obj, j10) == J2.i(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (x(obj, obj2, i10) && J2.h(obj, j10) == J2.h(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (x(obj, obj2, i10) && J2.B(obj, j10) == J2.B(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (x(obj, obj2, i10) && AbstractC2470k2.w(J2.k(obj, j10), J2.k(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (x(obj, obj2, i10) && AbstractC2470k2.w(J2.k(obj, j10), J2.k(obj2, j10))) {
                        continue;
                    }
                    return false;
                case RequestError.EVENT_TIMEOUT /* 10 */:
                    if (x(obj, obj2, i10) && AbstractC2470k2.w(J2.k(obj, j10), J2.k(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (x(obj, obj2, i10) && J2.h(obj, j10) == J2.h(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (x(obj, obj2, i10) && J2.h(obj, j10) == J2.h(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (x(obj, obj2, i10) && J2.h(obj, j10) == J2.h(obj2, j10)) {
                        continue;
                    }
                    return false;
                case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                    if (x(obj, obj2, i10) && J2.i(obj, j10) == J2.i(obj2, j10)) {
                        continue;
                    }
                    return false;
                case HVError.SSL_CONNECT_ERROR /* 15 */:
                    if (x(obj, obj2, i10) && J2.h(obj, j10) == J2.h(obj2, j10)) {
                        continue;
                    }
                    return false;
                case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                    if (x(obj, obj2, i10) && J2.i(obj, j10) == J2.i(obj2, j10)) {
                        continue;
                    }
                    return false;
                case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                    if (x(obj, obj2, i10) && AbstractC2470k2.w(J2.k(obj, j10), J2.k(obj2, j10))) {
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
                    w10 = AbstractC2470k2.w(J2.k(obj, j10), J2.k(obj2, j10));
                    break;
                case 50:
                    w10 = AbstractC2470k2.w(J2.k(obj, j10), J2.k(obj2, j10));
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
                    long R10 = R(i10) & 1048575;
                    if (J2.h(obj, R10) == J2.h(obj2, R10) && AbstractC2470k2.w(J2.k(obj, j10), J2.k(obj2, j10))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!w10) {
                return false;
            }
        }
        if (!this.f24806k.d(obj).equals(this.f24806k.d(obj2))) {
            return false;
        }
        if (this.f24801f) {
            return this.f24807l.b(obj).equals(this.f24807l.b(obj2));
        }
        return true;
    }
}
