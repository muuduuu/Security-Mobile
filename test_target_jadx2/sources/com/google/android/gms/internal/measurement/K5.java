package com.google.android.gms.internal.measurement;

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
final class K5 implements S5 {

    /* renamed from: l, reason: collision with root package name */
    private static final int[] f24255l = new int[0];

    /* renamed from: m, reason: collision with root package name */
    private static final Unsafe f24256m = AbstractC2282k6.v();

    /* renamed from: a, reason: collision with root package name */
    private final int[] f24257a;

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f24258b;

    /* renamed from: c, reason: collision with root package name */
    private final int f24259c;

    /* renamed from: d, reason: collision with root package name */
    private final int f24260d;

    /* renamed from: e, reason: collision with root package name */
    private final H5 f24261e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f24262f = false;

    /* renamed from: g, reason: collision with root package name */
    private final int[] f24263g;

    /* renamed from: h, reason: collision with root package name */
    private final int f24264h;

    /* renamed from: i, reason: collision with root package name */
    private final int f24265i;

    /* renamed from: j, reason: collision with root package name */
    private final AbstractC2219d6 f24266j;

    /* renamed from: k, reason: collision with root package name */
    private final U4 f24267k;

    private K5(int[] iArr, Object[] objArr, int i10, int i11, H5 h52, boolean z10, int[] iArr2, int i12, int i13, M5 m52, C2352s5 c2352s5, AbstractC2219d6 abstractC2219d6, U4 u42, C5 c52) {
        this.f24257a = iArr;
        this.f24258b = objArr;
        this.f24259c = i10;
        this.f24260d = i11;
        this.f24263g = iArr2;
        this.f24264h = i12;
        this.f24265i = i13;
        this.f24266j = abstractC2219d6;
        this.f24267k = u42;
        this.f24261e = h52;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0269  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static K5 A(Class cls, E5 e52, M5 m52, C2352s5 c2352s5, AbstractC2219d6 abstractC2219d6, U4 u42, C5 c52) {
        int i10;
        int charAt;
        int charAt2;
        int i11;
        int i12;
        int i13;
        int[] iArr;
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
        R5 r52;
        String str;
        int objectFieldOffset;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        Field B10;
        int i34;
        char charAt11;
        int i35;
        int i36;
        int i37;
        int i38;
        Object obj;
        Field B11;
        Object obj2;
        Field B12;
        int i39;
        char charAt12;
        int i40;
        char charAt13;
        int i41;
        char charAt14;
        int i42;
        char charAt15;
        if (!(e52 instanceof R5)) {
            android.support.v4.media.session.b.a(e52);
            throw null;
        }
        R5 r53 = (R5) e52;
        String b10 = r53.b();
        int length = b10.length();
        char c10 = 55296;
        if (b10.charAt(0) >= 55296) {
            int i43 = 1;
            while (true) {
                i10 = i43 + 1;
                if (b10.charAt(i43) < 55296) {
                    break;
                }
                i43 = i10;
            }
        } else {
            i10 = 1;
        }
        int i44 = i10 + 1;
        int charAt16 = b10.charAt(i10);
        if (charAt16 >= 55296) {
            int i45 = charAt16 & 8191;
            int i46 = 13;
            while (true) {
                i42 = i44 + 1;
                charAt15 = b10.charAt(i44);
                if (charAt15 < 55296) {
                    break;
                }
                i45 |= (charAt15 & 8191) << i46;
                i46 += 13;
                i44 = i42;
            }
            charAt16 = i45 | (charAt15 << i46);
            i44 = i42;
        }
        if (charAt16 == 0) {
            i13 = 0;
            charAt = 0;
            charAt2 = 0;
            i11 = 0;
            i14 = 0;
            i12 = 0;
            iArr = f24255l;
            i15 = 0;
        } else {
            int i47 = i44 + 1;
            int charAt17 = b10.charAt(i44);
            if (charAt17 >= 55296) {
                int i48 = charAt17 & 8191;
                int i49 = 13;
                while (true) {
                    i23 = i47 + 1;
                    charAt10 = b10.charAt(i47);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i48 |= (charAt10 & 8191) << i49;
                    i49 += 13;
                    i47 = i23;
                }
                charAt17 = i48 | (charAt10 << i49);
                i47 = i23;
            }
            int i50 = i47 + 1;
            int charAt18 = b10.charAt(i47);
            if (charAt18 >= 55296) {
                int i51 = charAt18 & 8191;
                int i52 = 13;
                while (true) {
                    i22 = i50 + 1;
                    charAt9 = b10.charAt(i50);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i51 |= (charAt9 & 8191) << i52;
                    i52 += 13;
                    i50 = i22;
                }
                charAt18 = i51 | (charAt9 << i52);
                i50 = i22;
            }
            int i53 = i50 + 1;
            int charAt19 = b10.charAt(i50);
            if (charAt19 >= 55296) {
                int i54 = charAt19 & 8191;
                int i55 = 13;
                while (true) {
                    i21 = i53 + 1;
                    charAt8 = b10.charAt(i53);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i54 |= (charAt8 & 8191) << i55;
                    i55 += 13;
                    i53 = i21;
                }
                charAt19 = i54 | (charAt8 << i55);
                i53 = i21;
            }
            int i56 = i53 + 1;
            int charAt20 = b10.charAt(i53);
            if (charAt20 >= 55296) {
                int i57 = charAt20 & 8191;
                int i58 = 13;
                while (true) {
                    i20 = i56 + 1;
                    charAt7 = b10.charAt(i56);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i57 |= (charAt7 & 8191) << i58;
                    i58 += 13;
                    i56 = i20;
                }
                charAt20 = i57 | (charAt7 << i58);
                i56 = i20;
            }
            int i59 = i56 + 1;
            charAt = b10.charAt(i56);
            if (charAt >= 55296) {
                int i60 = charAt & 8191;
                int i61 = 13;
                while (true) {
                    i19 = i59 + 1;
                    charAt6 = b10.charAt(i59);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i60 |= (charAt6 & 8191) << i61;
                    i61 += 13;
                    i59 = i19;
                }
                charAt = i60 | (charAt6 << i61);
                i59 = i19;
            }
            int i62 = i59 + 1;
            charAt2 = b10.charAt(i59);
            if (charAt2 >= 55296) {
                int i63 = charAt2 & 8191;
                int i64 = 13;
                while (true) {
                    i18 = i62 + 1;
                    charAt5 = b10.charAt(i62);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i63 |= (charAt5 & 8191) << i64;
                    i64 += 13;
                    i62 = i18;
                }
                charAt2 = i63 | (charAt5 << i64);
                i62 = i18;
            }
            int i65 = i62 + 1;
            int charAt21 = b10.charAt(i62);
            if (charAt21 >= 55296) {
                int i66 = charAt21 & 8191;
                int i67 = 13;
                while (true) {
                    i17 = i65 + 1;
                    charAt4 = b10.charAt(i65);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i66 |= (charAt4 & 8191) << i67;
                    i67 += 13;
                    i65 = i17;
                }
                charAt21 = i66 | (charAt4 << i67);
                i65 = i17;
            }
            int i68 = i65 + 1;
            int charAt22 = b10.charAt(i65);
            if (charAt22 >= 55296) {
                int i69 = charAt22 & 8191;
                int i70 = 13;
                while (true) {
                    i16 = i68 + 1;
                    charAt3 = b10.charAt(i68);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i69 |= (charAt3 & 8191) << i70;
                    i70 += 13;
                    i68 = i16;
                }
                charAt22 = i69 | (charAt3 << i70);
                i68 = i16;
            }
            int i71 = charAt17 + charAt17 + charAt18;
            int[] iArr2 = new int[charAt22 + charAt2 + charAt21];
            i11 = charAt19;
            i12 = charAt22;
            i13 = i71;
            iArr = iArr2;
            i14 = charAt20;
            i15 = charAt17;
            i44 = i68;
        }
        Unsafe unsafe = f24256m;
        Object[] c11 = r53.c();
        Class<?> cls2 = r53.zzb().getClass();
        int i72 = i12 + charAt2;
        int i73 = charAt + charAt;
        int[] iArr3 = new int[charAt * 3];
        Object[] objArr = new Object[i73];
        int i74 = i12;
        int i75 = i72;
        int i76 = 0;
        int i77 = 0;
        while (i44 < length) {
            int i78 = i44 + 1;
            int charAt23 = b10.charAt(i44);
            if (charAt23 >= c10) {
                int i79 = charAt23 & 8191;
                int i80 = i78;
                int i81 = 13;
                while (true) {
                    i41 = i80 + 1;
                    charAt14 = b10.charAt(i80);
                    if (charAt14 < c10) {
                        break;
                    }
                    i79 |= (charAt14 & 8191) << i81;
                    i81 += 13;
                    i80 = i41;
                }
                charAt23 = i79 | (charAt14 << i81);
                i24 = i41;
            } else {
                i24 = i78;
            }
            int i82 = i24 + 1;
            int charAt24 = b10.charAt(i24);
            if (charAt24 >= c10) {
                int i83 = charAt24 & 8191;
                int i84 = i82;
                int i85 = 13;
                while (true) {
                    i40 = i84 + 1;
                    charAt13 = b10.charAt(i84);
                    if (charAt13 < c10) {
                        break;
                    }
                    i83 |= (charAt13 & 8191) << i85;
                    i85 += 13;
                    i84 = i40;
                }
                charAt24 = i83 | (charAt13 << i85);
                i25 = i40;
            } else {
                i25 = i82;
            }
            if ((charAt24 & 1024) != 0) {
                iArr[i76] = i77;
                i76++;
            }
            int i86 = charAt24 & 255;
            int i87 = length;
            int i88 = charAt24 & 2048;
            int i89 = i14;
            if (i86 >= 51) {
                int i90 = i25 + 1;
                int charAt25 = b10.charAt(i25);
                if (charAt25 >= 55296) {
                    int i91 = charAt25 & 8191;
                    int i92 = i90;
                    int i93 = 13;
                    while (true) {
                        i39 = i92 + 1;
                        charAt12 = b10.charAt(i92);
                        i26 = i11;
                        if (charAt12 < 55296) {
                            break;
                        }
                        i91 |= (charAt12 & 8191) << i93;
                        i93 += 13;
                        i92 = i39;
                        i11 = i26;
                    }
                    charAt25 = i91 | (charAt12 << i93);
                    i37 = i39;
                } else {
                    i26 = i11;
                    i37 = i90;
                }
                int i94 = i86 - 51;
                int i95 = i37;
                if (i94 == 9 || i94 == 17) {
                    i38 = i13 + 1;
                    int i96 = i77 / 3;
                    objArr[i96 + i96 + 1] = c11[i13];
                } else {
                    if (i94 == 12) {
                        if (r53.a() == 1 || i88 != 0) {
                            i38 = i13 + 1;
                            int i97 = i77 / 3;
                            objArr[i97 + i97 + 1] = c11[i13];
                        } else {
                            i88 = 0;
                        }
                    }
                    int i98 = charAt25 + charAt25;
                    obj = c11[i98];
                    if (obj instanceof Field) {
                        B11 = B(cls2, (String) obj);
                        c11[i98] = B11;
                    } else {
                        B11 = (Field) obj;
                    }
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(B11);
                    int i99 = i98 + 1;
                    obj2 = c11[i99];
                    int i100 = i88;
                    if (obj2 instanceof Field) {
                        B12 = B(cls2, (String) obj2);
                        c11[i99] = B12;
                    } else {
                        B12 = (Field) obj2;
                    }
                    i27 = i13;
                    i31 = i95;
                    i28 = charAt23;
                    i29 = (int) unsafe.objectFieldOffset(B12);
                    i32 = 0;
                    str = b10;
                    r52 = r53;
                    objectFieldOffset = objectFieldOffset2;
                    i33 = i100;
                }
                i13 = i38;
                int i982 = charAt25 + charAt25;
                obj = c11[i982];
                if (obj instanceof Field) {
                }
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(B11);
                int i992 = i982 + 1;
                obj2 = c11[i992];
                int i1002 = i88;
                if (obj2 instanceof Field) {
                }
                i27 = i13;
                i31 = i95;
                i28 = charAt23;
                i29 = (int) unsafe.objectFieldOffset(B12);
                i32 = 0;
                str = b10;
                r52 = r53;
                objectFieldOffset = objectFieldOffset22;
                i33 = i1002;
            } else {
                i26 = i11;
                i27 = i13 + 1;
                Field B13 = B(cls2, (String) c11[i13]);
                i28 = charAt23;
                if (i86 == 9 || i86 == 17) {
                    r52 = r53;
                    int i101 = i77 / 3;
                    objArr[i101 + i101 + 1] = B13.getType();
                } else {
                    if (i86 == 27) {
                        r52 = r53;
                        i35 = 1;
                        i36 = i13 + 2;
                    } else if (i86 == 49) {
                        i36 = i13 + 2;
                        r52 = r53;
                        i35 = 1;
                    } else {
                        if (i86 == 12 || i86 == 30 || i86 == 44) {
                            r52 = r53;
                            if (r53.a() == 1 || i88 != 0) {
                                i36 = i13 + 2;
                                int i102 = i77 / 3;
                                objArr[i102 + i102 + 1] = c11[i27];
                                str = b10;
                                i27 = i36;
                            } else {
                                str = b10;
                                i88 = 0;
                            }
                        } else if (i86 == 50) {
                            int i103 = i13 + 2;
                            int i104 = i74 + 1;
                            iArr[i74] = i77;
                            int i105 = i77 / 3;
                            int i106 = i105 + i105;
                            objArr[i106] = c11[i27];
                            if (i88 != 0) {
                                i27 = i13 + 3;
                                objArr[i106 + 1] = c11[i103];
                                str = b10;
                                i74 = i104;
                                r52 = r53;
                            } else {
                                i27 = i103;
                                i74 = i104;
                                i88 = 0;
                                r52 = r53;
                            }
                        } else {
                            r52 = r53;
                        }
                        objectFieldOffset = (int) unsafe.objectFieldOffset(B13);
                        i29 = 1048575;
                        if ((charAt24 & 4096) != 0 || i86 > 17) {
                            i30 = i88;
                            i31 = i25;
                            i32 = 0;
                        } else {
                            int i107 = i25 + 1;
                            int charAt26 = str.charAt(i25);
                            if (charAt26 >= 55296) {
                                int i108 = charAt26 & 8191;
                                int i109 = 13;
                                while (true) {
                                    i34 = i107 + 1;
                                    charAt11 = str.charAt(i107);
                                    if (charAt11 < 55296) {
                                        break;
                                    }
                                    i108 |= (charAt11 & 8191) << i109;
                                    i109 += 13;
                                    i107 = i34;
                                }
                                charAt26 = i108 | (charAt11 << i109);
                                i107 = i34;
                            }
                            int i110 = i15 + i15 + (charAt26 / 32);
                            Object obj3 = c11[i110];
                            i31 = i107;
                            if (obj3 instanceof Field) {
                                B10 = (Field) obj3;
                            } else {
                                B10 = B(cls2, (String) obj3);
                                c11[i110] = B10;
                            }
                            i30 = i88;
                            i32 = charAt26 % 32;
                            i29 = (int) unsafe.objectFieldOffset(B10);
                        }
                        if (i86 >= 18 && i86 <= 49) {
                            iArr[i75] = objectFieldOffset;
                            i75++;
                        }
                        i33 = i30;
                    }
                    int i111 = i77 / 3;
                    objArr[i111 + i111 + i35] = c11[i27];
                    str = b10;
                    i27 = i36;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(B13);
                    i29 = 1048575;
                    if ((charAt24 & 4096) != 0) {
                    }
                    i30 = i88;
                    i31 = i25;
                    i32 = 0;
                    if (i86 >= 18) {
                        iArr[i75] = objectFieldOffset;
                        i75++;
                    }
                    i33 = i30;
                }
                str = b10;
                objectFieldOffset = (int) unsafe.objectFieldOffset(B13);
                i29 = 1048575;
                if ((charAt24 & 4096) != 0) {
                }
                i30 = i88;
                i31 = i25;
                i32 = 0;
                if (i86 >= 18) {
                }
                i33 = i30;
            }
            int i112 = i77 + 1;
            iArr3[i77] = i28;
            int i113 = i77 + 2;
            Class<?> cls3 = cls2;
            iArr3[i112] = objectFieldOffset | (i33 != 0 ? Integer.MIN_VALUE : 0) | ((charAt24 & 512) != 0 ? 536870912 : 0) | ((charAt24 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? 268435456 : 0) | (i86 << 20);
            i77 += 3;
            iArr3[i113] = (i32 << 20) | i29;
            b10 = str;
            i13 = i27;
            length = i87;
            i14 = i89;
            cls2 = cls3;
            r53 = r52;
            i44 = i31;
            i11 = i26;
            c10 = 55296;
        }
        return new K5(iArr3, objArr, i11, i14, r53.zzb(), false, iArr, i12, i72, m52, c2352s5, abstractC2219d6, u42, c52);
    }

    private static Field B(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e10) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 11 + name.length() + 29 + String.valueOf(arrays).length());
            sb2.append("Field ");
            sb2.append(str);
            sb2.append(" for ");
            sb2.append(name);
            sb2.append(" not found. Known fields are ");
            sb2.append(arrays);
            throw new RuntimeException(sb2.toString(), e10);
        }
    }

    private final void C(Object obj, Object obj2, int i10) {
        if (r(obj2, i10)) {
            int M10 = M(i10) & 1048575;
            Unsafe unsafe = f24256m;
            long j10 = M10;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                int i11 = this.f24257a[i10];
                String obj3 = obj2.toString();
                StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 38 + obj3.length());
                sb2.append("Source subfield ");
                sb2.append(i11);
                sb2.append(" is present but null: ");
                sb2.append(obj3);
                throw new IllegalStateException(sb2.toString());
            }
            S5 E10 = E(i10);
            if (!r(obj, i10)) {
                if (i(object)) {
                    Object zza = E10.zza();
                    E10.b(zza, object);
                    unsafe.putObject(obj, j10, zza);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                s(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!i(object2)) {
                Object zza2 = E10.zza();
                E10.b(zza2, object2);
                unsafe.putObject(obj, j10, zza2);
                object2 = zza2;
            }
            E10.b(object2, object);
        }
    }

    private final void D(Object obj, Object obj2, int i10) {
        int[] iArr = this.f24257a;
        int i11 = iArr[i10];
        if (t(obj2, i11, i10)) {
            int M10 = M(i10) & 1048575;
            Unsafe unsafe = f24256m;
            long j10 = M10;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                int i12 = iArr[i10];
                String obj3 = obj2.toString();
                StringBuilder sb2 = new StringBuilder(String.valueOf(i12).length() + 38 + obj3.length());
                sb2.append("Source subfield ");
                sb2.append(i12);
                sb2.append(" is present but null: ");
                sb2.append(obj3);
                throw new IllegalStateException(sb2.toString());
            }
            S5 E10 = E(i10);
            if (!t(obj, i11, i10)) {
                if (i(object)) {
                    Object zza = E10.zza();
                    E10.b(zza, object);
                    unsafe.putObject(obj, j10, zza);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                u(obj, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!i(object2)) {
                Object zza2 = E10.zza();
                E10.b(zza2, object2);
                unsafe.putObject(obj, j10, zza2);
                object2 = zza2;
            }
            E10.b(object2, object);
        }
    }

    private final S5 E(int i10) {
        Object[] objArr = this.f24258b;
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        S5 s52 = (S5) objArr[i12];
        if (s52 != null) {
            return s52;
        }
        S5 b10 = P5.a().b((Class) objArr[i12 + 1]);
        objArr[i12] = b10;
        return b10;
    }

    private final Object F(int i10) {
        int i11 = i10 / 3;
        return this.f24258b[i11 + i11];
    }

    private final InterfaceC2272j5 G(int i10) {
        int i11 = i10 / 3;
        return (InterfaceC2272j5) this.f24258b[i11 + i11 + 1];
    }

    private final Object H(Object obj, int i10) {
        S5 E10 = E(i10);
        int M10 = M(i10) & 1048575;
        if (!r(obj, i10)) {
            return E10.zza();
        }
        Object object = f24256m.getObject(obj, M10);
        if (i(object)) {
            return object;
        }
        Object zza = E10.zza();
        if (object != null) {
            E10.b(zza, object);
        }
        return zza;
    }

    private final void I(Object obj, int i10, Object obj2) {
        f24256m.putObject(obj, M(i10) & 1048575, obj2);
        s(obj, i10);
    }

    private final Object J(Object obj, int i10, int i11) {
        S5 E10 = E(i11);
        if (!t(obj, i10, i11)) {
            return E10.zza();
        }
        Object object = f24256m.getObject(obj, M(i11) & 1048575);
        if (i(object)) {
            return object;
        }
        Object zza = E10.zza();
        if (object != null) {
            E10.b(zza, object);
        }
        return zza;
    }

    private final void K(Object obj, int i10, int i11, Object obj2) {
        f24256m.putObject(obj, M(i11) & 1048575, obj2);
        u(obj, i10, i11);
    }

    private static boolean L(Object obj, int i10, S5 s52) {
        return s52.d(AbstractC2282k6.s(obj, i10 & 1048575));
    }

    private final int M(int i10) {
        return this.f24257a[i10 + 1];
    }

    private final int N(int i10) {
        return this.f24257a[i10 + 2];
    }

    private static int O(int i10) {
        return (i10 >>> 20) & 255;
    }

    private static boolean i(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC2245g5) {
            return ((AbstractC2245g5) obj).j();
        }
        return true;
    }

    private static void j(Object obj) {
        if (!i(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private static double k(Object obj, long j10) {
        return ((Double) AbstractC2282k6.s(obj, j10)).doubleValue();
    }

    private static float l(Object obj, long j10) {
        return ((Float) AbstractC2282k6.s(obj, j10)).floatValue();
    }

    private static int m(Object obj, long j10) {
        return ((Integer) AbstractC2282k6.s(obj, j10)).intValue();
    }

    private static long n(Object obj, long j10) {
        return ((Long) AbstractC2282k6.s(obj, j10)).longValue();
    }

    private static boolean o(Object obj, long j10) {
        return ((Boolean) AbstractC2282k6.s(obj, j10)).booleanValue();
    }

    private final boolean p(Object obj, Object obj2, int i10) {
        return r(obj, i10) == r(obj2, i10);
    }

    private final boolean q(Object obj, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? r(obj, i10) : (i12 & i13) != 0;
    }

    private final boolean r(Object obj, int i10) {
        int N10 = N(i10);
        long j10 = N10 & 1048575;
        if (j10 != 1048575) {
            return (AbstractC2282k6.i(obj, j10) & (1 << (N10 >>> 20))) != 0;
        }
        int M10 = M(i10);
        long j11 = M10 & 1048575;
        switch (O(M10)) {
            case 0:
                return Double.doubleToRawLongBits(AbstractC2282k6.q(obj, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(AbstractC2282k6.o(obj, j11)) != 0;
            case 2:
                return AbstractC2282k6.k(obj, j11) != 0;
            case 3:
                return AbstractC2282k6.k(obj, j11) != 0;
            case 4:
                return AbstractC2282k6.i(obj, j11) != 0;
            case 5:
                return AbstractC2282k6.k(obj, j11) != 0;
            case 6:
                return AbstractC2282k6.i(obj, j11) != 0;
            case 7:
                return AbstractC2282k6.m(obj, j11);
            case 8:
                Object s10 = AbstractC2282k6.s(obj, j11);
                if (s10 instanceof String) {
                    return !((String) s10).isEmpty();
                }
                if (s10 instanceof J4) {
                    return !J4.f24246b.equals(s10);
                }
                throw new IllegalArgumentException();
            case 9:
                return AbstractC2282k6.s(obj, j11) != null;
            case RequestError.EVENT_TIMEOUT /* 10 */:
                return !J4.f24246b.equals(AbstractC2282k6.s(obj, j11));
            case 11:
                return AbstractC2282k6.i(obj, j11) != 0;
            case 12:
                return AbstractC2282k6.i(obj, j11) != 0;
            case 13:
                return AbstractC2282k6.i(obj, j11) != 0;
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                return AbstractC2282k6.k(obj, j11) != 0;
            case HVError.SSL_CONNECT_ERROR /* 15 */:
                return AbstractC2282k6.i(obj, j11) != 0;
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                return AbstractC2282k6.k(obj, j11) != 0;
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                return AbstractC2282k6.s(obj, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final void s(Object obj, int i10) {
        int N10 = N(i10);
        long j10 = 1048575 & N10;
        if (j10 == 1048575) {
            return;
        }
        AbstractC2282k6.j(obj, j10, (1 << (N10 >>> 20)) | AbstractC2282k6.i(obj, j10));
    }

    private final boolean t(Object obj, int i10, int i11) {
        return AbstractC2282k6.i(obj, (long) (N(i11) & 1048575)) == i10;
    }

    private final void u(Object obj, int i10, int i11) {
        AbstractC2282k6.j(obj, N(i11) & 1048575, i10);
    }

    private final int v(int i10, int i11) {
        int[] iArr = this.f24257a;
        int length = (iArr.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = iArr[i13];
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

    private static final int w(byte[] bArr, int i10, int i11, EnumC2318o6 enumC2318o6, Class cls, C2396x4 c2396x4) {
        int i12;
        EnumC2318o6 enumC2318o62 = EnumC2318o6.zza;
        switch (enumC2318o6.ordinal()) {
            case 0:
                i12 = i10 + 8;
                c2396x4.f24689c = Double.valueOf(Double.longBitsToDouble(AbstractC2405y4.e(bArr, i10)));
                break;
            case 1:
                i12 = i10 + 4;
                c2396x4.f24689c = Float.valueOf(Float.intBitsToFloat(AbstractC2405y4.d(bArr, i10)));
                break;
            case 2:
            case 3:
                int c10 = AbstractC2405y4.c(bArr, i10, c2396x4);
                c2396x4.f24689c = Long.valueOf(c2396x4.f24688b);
                return c10;
            case 4:
            case 12:
            case 13:
                int a10 = AbstractC2405y4.a(bArr, i10, c2396x4);
                c2396x4.f24689c = Integer.valueOf(c2396x4.f24687a);
                return a10;
            case 5:
            case HVError.SSL_CONNECT_ERROR /* 15 */:
                i12 = i10 + 8;
                c2396x4.f24689c = Long.valueOf(AbstractC2405y4.e(bArr, i10));
                break;
            case 6:
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                i12 = i10 + 4;
                c2396x4.f24689c = Integer.valueOf(AbstractC2405y4.d(bArr, i10));
                break;
            case 7:
                int c11 = AbstractC2405y4.c(bArr, i10, c2396x4);
                c2396x4.f24689c = Boolean.valueOf(c2396x4.f24688b != 0);
                return c11;
            case 8:
                return AbstractC2405y4.f(bArr, i10, c2396x4);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case RequestError.EVENT_TIMEOUT /* 10 */:
                return AbstractC2405y4.h(P5.a().b(cls), bArr, i10, i11, c2396x4);
            case 11:
                return AbstractC2405y4.g(bArr, i10, c2396x4);
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                int a11 = AbstractC2405y4.a(bArr, i10, c2396x4);
                c2396x4.f24689c = Integer.valueOf(L4.a(c2396x4.f24687a));
                return a11;
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                int c12 = AbstractC2405y4.c(bArr, i10, c2396x4);
                c2396x4.f24689c = Long.valueOf(L4.b(c2396x4.f24688b));
                return c12;
        }
        return i12;
    }

    private static final void x(int i10, Object obj, InterfaceC2336q6 interfaceC2336q6) {
        if (obj instanceof String) {
            interfaceC2336q6.M(i10, (String) obj);
        } else {
            interfaceC2336q6.B(i10, (J4) obj);
        }
    }

    static C2228e6 y(Object obj) {
        AbstractC2245g5 abstractC2245g5 = (AbstractC2245g5) obj;
        C2228e6 c2228e6 = abstractC2245g5.zzc;
        if (c2228e6 != C2228e6.a()) {
            return c2228e6;
        }
        C2228e6 b10 = C2228e6.b();
        abstractC2245g5.zzc = b10;
        return b10;
    }

    @Override // com.google.android.gms.internal.measurement.S5
    public final int a(Object obj) {
        int i10;
        long doubleToLongBits;
        int floatToIntBits;
        int i11;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int[] iArr = this.f24257a;
            if (i12 >= iArr.length) {
                int hashCode = (i13 * 53) + ((AbstractC2245g5) obj).zzc.hashCode();
                if (!this.f24262f) {
                    return hashCode;
                }
                android.support.v4.media.session.b.a(obj);
                throw null;
            }
            int M10 = M(i12);
            int i14 = 1048575 & M10;
            int O10 = O(M10);
            int i15 = iArr[i12];
            long j10 = i14;
            int i16 = 37;
            switch (O10) {
                case 0:
                    i10 = i13 * 53;
                    doubleToLongBits = Double.doubleToLongBits(AbstractC2282k6.q(obj, j10));
                    byte[] bArr = AbstractC2308n5.f24582b;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i13 = i10 + floatToIntBits;
                    break;
                case 1:
                    i10 = i13 * 53;
                    floatToIntBits = Float.floatToIntBits(AbstractC2282k6.o(obj, j10));
                    i13 = i10 + floatToIntBits;
                    break;
                case 2:
                    i10 = i13 * 53;
                    doubleToLongBits = AbstractC2282k6.k(obj, j10);
                    byte[] bArr2 = AbstractC2308n5.f24582b;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i13 = i10 + floatToIntBits;
                    break;
                case 3:
                    i10 = i13 * 53;
                    doubleToLongBits = AbstractC2282k6.k(obj, j10);
                    byte[] bArr3 = AbstractC2308n5.f24582b;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i13 = i10 + floatToIntBits;
                    break;
                case 4:
                    i10 = i13 * 53;
                    floatToIntBits = AbstractC2282k6.i(obj, j10);
                    i13 = i10 + floatToIntBits;
                    break;
                case 5:
                    i10 = i13 * 53;
                    doubleToLongBits = AbstractC2282k6.k(obj, j10);
                    byte[] bArr4 = AbstractC2308n5.f24582b;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i13 = i10 + floatToIntBits;
                    break;
                case 6:
                    i10 = i13 * 53;
                    floatToIntBits = AbstractC2282k6.i(obj, j10);
                    i13 = i10 + floatToIntBits;
                    break;
                case 7:
                    i10 = i13 * 53;
                    floatToIntBits = AbstractC2308n5.b(AbstractC2282k6.m(obj, j10));
                    i13 = i10 + floatToIntBits;
                    break;
                case 8:
                    i10 = i13 * 53;
                    floatToIntBits = ((String) AbstractC2282k6.s(obj, j10)).hashCode();
                    i13 = i10 + floatToIntBits;
                    break;
                case 9:
                    i11 = i13 * 53;
                    Object s10 = AbstractC2282k6.s(obj, j10);
                    if (s10 != null) {
                        i16 = s10.hashCode();
                    }
                    i13 = i11 + i16;
                    break;
                case RequestError.EVENT_TIMEOUT /* 10 */:
                    i10 = i13 * 53;
                    floatToIntBits = AbstractC2282k6.s(obj, j10).hashCode();
                    i13 = i10 + floatToIntBits;
                    break;
                case 11:
                    i10 = i13 * 53;
                    floatToIntBits = AbstractC2282k6.i(obj, j10);
                    i13 = i10 + floatToIntBits;
                    break;
                case 12:
                    i10 = i13 * 53;
                    floatToIntBits = AbstractC2282k6.i(obj, j10);
                    i13 = i10 + floatToIntBits;
                    break;
                case 13:
                    i10 = i13 * 53;
                    floatToIntBits = AbstractC2282k6.i(obj, j10);
                    i13 = i10 + floatToIntBits;
                    break;
                case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                    i10 = i13 * 53;
                    doubleToLongBits = AbstractC2282k6.k(obj, j10);
                    byte[] bArr5 = AbstractC2308n5.f24582b;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i13 = i10 + floatToIntBits;
                    break;
                case HVError.SSL_CONNECT_ERROR /* 15 */:
                    i10 = i13 * 53;
                    floatToIntBits = AbstractC2282k6.i(obj, j10);
                    i13 = i10 + floatToIntBits;
                    break;
                case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                    i10 = i13 * 53;
                    doubleToLongBits = AbstractC2282k6.k(obj, j10);
                    byte[] bArr6 = AbstractC2308n5.f24582b;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i13 = i10 + floatToIntBits;
                    break;
                case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                    i11 = i13 * 53;
                    Object s11 = AbstractC2282k6.s(obj, j10);
                    if (s11 != null) {
                        i16 = s11.hashCode();
                    }
                    i13 = i11 + i16;
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
                    i10 = i13 * 53;
                    floatToIntBits = AbstractC2282k6.s(obj, j10).hashCode();
                    i13 = i10 + floatToIntBits;
                    break;
                case 50:
                    i10 = i13 * 53;
                    floatToIntBits = AbstractC2282k6.s(obj, j10).hashCode();
                    i13 = i10 + floatToIntBits;
                    break;
                case 51:
                    if (!t(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        doubleToLongBits = Double.doubleToLongBits(k(obj, j10));
                        byte[] bArr7 = AbstractC2308n5.f24582b;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i13 = i10 + floatToIntBits;
                        break;
                    }
                case 52:
                    if (!t(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        floatToIntBits = Float.floatToIntBits(l(obj, j10));
                        i13 = i10 + floatToIntBits;
                        break;
                    }
                case 53:
                    if (!t(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        doubleToLongBits = n(obj, j10);
                        byte[] bArr8 = AbstractC2308n5.f24582b;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i13 = i10 + floatToIntBits;
                        break;
                    }
                case 54:
                    if (!t(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        doubleToLongBits = n(obj, j10);
                        byte[] bArr9 = AbstractC2308n5.f24582b;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i13 = i10 + floatToIntBits;
                        break;
                    }
                case 55:
                    if (!t(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        floatToIntBits = m(obj, j10);
                        i13 = i10 + floatToIntBits;
                        break;
                    }
                case 56:
                    if (!t(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        doubleToLongBits = n(obj, j10);
                        byte[] bArr10 = AbstractC2308n5.f24582b;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i13 = i10 + floatToIntBits;
                        break;
                    }
                case 57:
                    if (!t(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        floatToIntBits = m(obj, j10);
                        i13 = i10 + floatToIntBits;
                        break;
                    }
                case 58:
                    if (!t(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        floatToIntBits = AbstractC2308n5.b(o(obj, j10));
                        i13 = i10 + floatToIntBits;
                        break;
                    }
                case 59:
                    if (!t(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        floatToIntBits = ((String) AbstractC2282k6.s(obj, j10)).hashCode();
                        i13 = i10 + floatToIntBits;
                        break;
                    }
                case HVError.DETECTOR_NOT_AVAILABLE_ERROR /* 60 */:
                    if (!t(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        floatToIntBits = AbstractC2282k6.s(obj, j10).hashCode();
                        i13 = i10 + floatToIntBits;
                        break;
                    }
                case 61:
                    if (!t(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        floatToIntBits = AbstractC2282k6.s(obj, j10).hashCode();
                        i13 = i10 + floatToIntBits;
                        break;
                    }
                case 62:
                    if (!t(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        floatToIntBits = m(obj, j10);
                        i13 = i10 + floatToIntBits;
                        break;
                    }
                case 63:
                    if (!t(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        floatToIntBits = m(obj, j10);
                        i13 = i10 + floatToIntBits;
                        break;
                    }
                case 64:
                    if (!t(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        floatToIntBits = m(obj, j10);
                        i13 = i10 + floatToIntBits;
                        break;
                    }
                case 65:
                    if (!t(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        doubleToLongBits = n(obj, j10);
                        byte[] bArr11 = AbstractC2308n5.f24582b;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i13 = i10 + floatToIntBits;
                        break;
                    }
                case 66:
                    if (!t(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        floatToIntBits = m(obj, j10);
                        i13 = i10 + floatToIntBits;
                        break;
                    }
                case 67:
                    if (!t(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        doubleToLongBits = n(obj, j10);
                        byte[] bArr12 = AbstractC2308n5.f24582b;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i13 = i10 + floatToIntBits;
                        break;
                    }
                case 68:
                    if (!t(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        floatToIntBits = AbstractC2282k6.s(obj, j10).hashCode();
                        i13 = i10 + floatToIntBits;
                        break;
                    }
            }
            i12 += 3;
        }
    }

    @Override // com.google.android.gms.internal.measurement.S5
    public final void b(Object obj, Object obj2) {
        j(obj);
        obj2.getClass();
        int i10 = 0;
        while (true) {
            int[] iArr = this.f24257a;
            if (i10 >= iArr.length) {
                U5.d(this.f24266j, obj, obj2);
                if (this.f24262f) {
                    U5.c(this.f24267k, obj, obj2);
                    return;
                }
                return;
            }
            int M10 = M(i10);
            int i11 = 1048575 & M10;
            int O10 = O(M10);
            int i12 = iArr[i10];
            long j10 = i11;
            switch (O10) {
                case 0:
                    if (!r(obj2, i10)) {
                        break;
                    } else {
                        AbstractC2282k6.r(obj, j10, AbstractC2282k6.q(obj2, j10));
                        s(obj, i10);
                        break;
                    }
                case 1:
                    if (!r(obj2, i10)) {
                        break;
                    } else {
                        AbstractC2282k6.p(obj, j10, AbstractC2282k6.o(obj2, j10));
                        s(obj, i10);
                        break;
                    }
                case 2:
                    if (!r(obj2, i10)) {
                        break;
                    } else {
                        AbstractC2282k6.l(obj, j10, AbstractC2282k6.k(obj2, j10));
                        s(obj, i10);
                        break;
                    }
                case 3:
                    if (!r(obj2, i10)) {
                        break;
                    } else {
                        AbstractC2282k6.l(obj, j10, AbstractC2282k6.k(obj2, j10));
                        s(obj, i10);
                        break;
                    }
                case 4:
                    if (!r(obj2, i10)) {
                        break;
                    } else {
                        AbstractC2282k6.j(obj, j10, AbstractC2282k6.i(obj2, j10));
                        s(obj, i10);
                        break;
                    }
                case 5:
                    if (!r(obj2, i10)) {
                        break;
                    } else {
                        AbstractC2282k6.l(obj, j10, AbstractC2282k6.k(obj2, j10));
                        s(obj, i10);
                        break;
                    }
                case 6:
                    if (!r(obj2, i10)) {
                        break;
                    } else {
                        AbstractC2282k6.j(obj, j10, AbstractC2282k6.i(obj2, j10));
                        s(obj, i10);
                        break;
                    }
                case 7:
                    if (!r(obj2, i10)) {
                        break;
                    } else {
                        AbstractC2282k6.n(obj, j10, AbstractC2282k6.m(obj2, j10));
                        s(obj, i10);
                        break;
                    }
                case 8:
                    if (!r(obj2, i10)) {
                        break;
                    } else {
                        AbstractC2282k6.t(obj, j10, AbstractC2282k6.s(obj2, j10));
                        s(obj, i10);
                        break;
                    }
                case 9:
                    C(obj, obj2, i10);
                    break;
                case RequestError.EVENT_TIMEOUT /* 10 */:
                    if (!r(obj2, i10)) {
                        break;
                    } else {
                        AbstractC2282k6.t(obj, j10, AbstractC2282k6.s(obj2, j10));
                        s(obj, i10);
                        break;
                    }
                case 11:
                    if (!r(obj2, i10)) {
                        break;
                    } else {
                        AbstractC2282k6.j(obj, j10, AbstractC2282k6.i(obj2, j10));
                        s(obj, i10);
                        break;
                    }
                case 12:
                    if (!r(obj2, i10)) {
                        break;
                    } else {
                        AbstractC2282k6.j(obj, j10, AbstractC2282k6.i(obj2, j10));
                        s(obj, i10);
                        break;
                    }
                case 13:
                    if (!r(obj2, i10)) {
                        break;
                    } else {
                        AbstractC2282k6.j(obj, j10, AbstractC2282k6.i(obj2, j10));
                        s(obj, i10);
                        break;
                    }
                case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                    if (!r(obj2, i10)) {
                        break;
                    } else {
                        AbstractC2282k6.l(obj, j10, AbstractC2282k6.k(obj2, j10));
                        s(obj, i10);
                        break;
                    }
                case HVError.SSL_CONNECT_ERROR /* 15 */:
                    if (!r(obj2, i10)) {
                        break;
                    } else {
                        AbstractC2282k6.j(obj, j10, AbstractC2282k6.i(obj2, j10));
                        s(obj, i10);
                        break;
                    }
                case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                    if (!r(obj2, i10)) {
                        break;
                    } else {
                        AbstractC2282k6.l(obj, j10, AbstractC2282k6.k(obj2, j10));
                        s(obj, i10);
                        break;
                    }
                case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                    C(obj, obj2, i10);
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
                    InterfaceC2299m5 interfaceC2299m5 = (InterfaceC2299m5) AbstractC2282k6.s(obj, j10);
                    InterfaceC2299m5 interfaceC2299m52 = (InterfaceC2299m5) AbstractC2282k6.s(obj2, j10);
                    int size = interfaceC2299m5.size();
                    int size2 = interfaceC2299m52.size();
                    if (size > 0 && size2 > 0) {
                        if (!interfaceC2299m5.zza()) {
                            interfaceC2299m5 = interfaceC2299m5.O1(size2 + size);
                        }
                        interfaceC2299m5.addAll(interfaceC2299m52);
                    }
                    if (size > 0) {
                        interfaceC2299m52 = interfaceC2299m5;
                    }
                    AbstractC2282k6.t(obj, j10, interfaceC2299m52);
                    break;
                case 50:
                    int i13 = U5.f24390b;
                    AbstractC2282k6.t(obj, j10, C5.a(AbstractC2282k6.s(obj, j10), AbstractC2282k6.s(obj2, j10)));
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
                    if (!t(obj2, i12, i10)) {
                        break;
                    } else {
                        AbstractC2282k6.t(obj, j10, AbstractC2282k6.s(obj2, j10));
                        u(obj, i12, i10);
                        break;
                    }
                case HVError.DETECTOR_NOT_AVAILABLE_ERROR /* 60 */:
                    D(obj, obj2, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!t(obj2, i12, i10)) {
                        break;
                    } else {
                        AbstractC2282k6.t(obj, j10, AbstractC2282k6.s(obj2, j10));
                        u(obj, i12, i10);
                        break;
                    }
                case 68:
                    D(obj, obj2, i10);
                    break;
            }
            i10 += 3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.S5
    public final int c(Object obj) {
        int i10;
        int i11;
        int i12;
        int E10;
        int E11;
        int E12;
        int a10;
        int E13;
        int E14;
        int h10;
        int E15;
        int E16;
        int t10;
        int size;
        int E17;
        int E18;
        int E19;
        int C10;
        int E20;
        int E21;
        int i13;
        Unsafe unsafe = f24256m;
        boolean z10 = 0;
        int i14 = 1048575;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 1048575;
        while (true) {
            int[] iArr = this.f24257a;
            if (i16 >= iArr.length) {
                int h11 = i17 + ((AbstractC2245g5) obj).zzc.h();
                if (!this.f24262f) {
                    return h11;
                }
                android.support.v4.media.session.b.a(obj);
                throw null;
            }
            int M10 = M(i16);
            int O10 = O(M10);
            int i19 = iArr[i16];
            int i20 = iArr[i16 + 2];
            int i21 = i20 & i14;
            if (O10 <= 17) {
                if (i21 != i18) {
                    i15 = i21 == i14 ? z10 : unsafe.getInt(obj, i21);
                    i18 = i21;
                }
                i10 = i18;
                i11 = i15;
                i12 = 1 << (i20 >>> 20);
            } else {
                i10 = i18;
                i11 = i15;
                i12 = z10;
            }
            int i22 = M10 & i14;
            if (O10 >= Z4.zzJ.zza()) {
                Z4.zzW.zza();
            }
            long j10 = i22;
            switch (O10) {
                case 0:
                    if (q(obj, i16, i10, i11, i12)) {
                        E10 = O4.E(i19 << 3);
                        E16 = E10 + 8;
                        i17 += E16;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (q(obj, i16, i10, i11, i12)) {
                        E11 = O4.E(i19 << 3);
                        E16 = E11 + 4;
                        i17 += E16;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (q(obj, i16, i10, i11, i12)) {
                        long j11 = unsafe.getLong(obj, j10);
                        E12 = O4.E(i19 << 3);
                        a10 = O4.a(j11);
                        E16 = E12 + a10;
                        i17 += E16;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (q(obj, i16, i10, i11, i12)) {
                        long j12 = unsafe.getLong(obj, j10);
                        E12 = O4.E(i19 << 3);
                        a10 = O4.a(j12);
                        E16 = E12 + a10;
                        i17 += E16;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (q(obj, i16, i10, i11, i12)) {
                        long j13 = unsafe.getInt(obj, j10);
                        E12 = O4.E(i19 << 3);
                        a10 = O4.a(j13);
                        E16 = E12 + a10;
                        i17 += E16;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (q(obj, i16, i10, i11, i12)) {
                        E10 = O4.E(i19 << 3);
                        E16 = E10 + 8;
                        i17 += E16;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (q(obj, i16, i10, i11, i12)) {
                        E11 = O4.E(i19 << 3);
                        E16 = E11 + 4;
                        i17 += E16;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (q(obj, i16, i10, i11, i12)) {
                        E13 = O4.E(i19 << 3);
                        E16 = E13 + 1;
                        i17 += E16;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!q(obj, i16, i10, i11, i12)) {
                        break;
                    } else {
                        int i23 = i19 << 3;
                        Object object = unsafe.getObject(obj, j10);
                        if (object instanceof J4) {
                            E14 = O4.E(i23);
                            h10 = ((J4) object).h();
                            E15 = O4.E(h10);
                            E16 = E14 + E15 + h10;
                            i17 += E16;
                            break;
                        } else {
                            E12 = O4.E(i23);
                            a10 = O4.b((String) object);
                            E16 = E12 + a10;
                            i17 += E16;
                        }
                    }
                case 9:
                    if (q(obj, i16, i10, i11, i12)) {
                        E16 = U5.E(i19, unsafe.getObject(obj, j10), E(i16));
                        i17 += E16;
                        break;
                    } else {
                        break;
                    }
                case RequestError.EVENT_TIMEOUT /* 10 */:
                    if (q(obj, i16, i10, i11, i12)) {
                        J4 j42 = (J4) unsafe.getObject(obj, j10);
                        E14 = O4.E(i19 << 3);
                        h10 = j42.h();
                        E15 = O4.E(h10);
                        E16 = E14 + E15 + h10;
                        i17 += E16;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (q(obj, i16, i10, i11, i12)) {
                        int i24 = unsafe.getInt(obj, j10);
                        E12 = O4.E(i19 << 3);
                        a10 = O4.E(i24);
                        E16 = E12 + a10;
                        i17 += E16;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (q(obj, i16, i10, i11, i12)) {
                        long j14 = unsafe.getInt(obj, j10);
                        E12 = O4.E(i19 << 3);
                        a10 = O4.a(j14);
                        E16 = E12 + a10;
                        i17 += E16;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (q(obj, i16, i10, i11, i12)) {
                        E11 = O4.E(i19 << 3);
                        E16 = E11 + 4;
                        i17 += E16;
                        break;
                    } else {
                        break;
                    }
                case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                    if (q(obj, i16, i10, i11, i12)) {
                        E10 = O4.E(i19 << 3);
                        E16 = E10 + 8;
                        i17 += E16;
                        break;
                    } else {
                        break;
                    }
                case HVError.SSL_CONNECT_ERROR /* 15 */:
                    if (q(obj, i16, i10, i11, i12)) {
                        int i25 = unsafe.getInt(obj, j10);
                        E12 = O4.E(i19 << 3);
                        a10 = O4.E((i25 >> 31) ^ (i25 + i25));
                        E16 = E12 + a10;
                        i17 += E16;
                        break;
                    } else {
                        break;
                    }
                case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                    if (q(obj, i16, i10, i11, i12)) {
                        long j15 = unsafe.getLong(obj, j10);
                        E12 = O4.E(i19 << 3);
                        a10 = O4.a((j15 >> 63) ^ (j15 + j15));
                        E16 = E12 + a10;
                        i17 += E16;
                        break;
                    } else {
                        break;
                    }
                case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                    if (q(obj, i16, i10, i11, i12)) {
                        E16 = O4.g(i19, (H5) unsafe.getObject(obj, j10), E(i16));
                        i17 += E16;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    E16 = U5.D(i19, (List) unsafe.getObject(obj, j10), z10);
                    i17 += E16;
                    break;
                case 19:
                    E16 = U5.B(i19, (List) unsafe.getObject(obj, j10), z10);
                    i17 += E16;
                    break;
                case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                    List list = (List) unsafe.getObject(obj, j10);
                    int i26 = U5.f24390b;
                    if (list.size() != 0) {
                        t10 = U5.t(list) + (list.size() * O4.E(i19 << 3));
                        i17 += t10;
                        break;
                    }
                    t10 = z10;
                    i17 += t10;
                case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                    List list2 = (List) unsafe.getObject(obj, j10);
                    int i27 = U5.f24390b;
                    size = list2.size();
                    if (size != 0) {
                        E12 = U5.u(list2);
                        E17 = O4.E(i19 << 3);
                        a10 = size * E17;
                        E16 = E12 + a10;
                        i17 += E16;
                        break;
                    }
                    E16 = z10;
                    i17 += E16;
                case HVError.FACE_DETECTION_ERROR /* 22 */:
                    List list3 = (List) unsafe.getObject(obj, j10);
                    int i28 = U5.f24390b;
                    size = list3.size();
                    if (size != 0) {
                        E12 = U5.x(list3);
                        E17 = O4.E(i19 << 3);
                        a10 = size * E17;
                        E16 = E12 + a10;
                        i17 += E16;
                        break;
                    }
                    E16 = z10;
                    i17 += E16;
                case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                    E16 = U5.D(i19, (List) unsafe.getObject(obj, j10), z10);
                    i17 += E16;
                    break;
                case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                    E16 = U5.B(i19, (List) unsafe.getObject(obj, j10), z10);
                    i17 += E16;
                    break;
                case HVError.LOW_STORAGE_ERROR /* 25 */:
                    List list4 = (List) unsafe.getObject(obj, j10);
                    int i29 = U5.f24390b;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        E16 = size2 * (O4.E(i19 << 3) + 1);
                        i17 += E16;
                        break;
                    }
                    E16 = z10;
                    i17 += E16;
                case 26:
                    List list5 = (List) unsafe.getObject(obj, j10);
                    int i30 = U5.f24390b;
                    int size3 = list5.size();
                    if (size3 != 0) {
                        t10 = O4.E(i19 << 3) * size3;
                        if (list5 instanceof InterfaceC2343r5) {
                            InterfaceC2343r5 interfaceC2343r5 = (InterfaceC2343r5) list5;
                            for (int i31 = z10; i31 < size3; i31++) {
                                Object a11 = interfaceC2343r5.a();
                                if (a11 instanceof J4) {
                                    int h12 = ((J4) a11).h();
                                    t10 += O4.E(h12) + h12;
                                } else {
                                    t10 += O4.b((String) a11);
                                }
                            }
                        } else {
                            for (int i32 = z10; i32 < size3; i32++) {
                                Object obj2 = list5.get(i32);
                                if (obj2 instanceof J4) {
                                    int h13 = ((J4) obj2).h();
                                    t10 += O4.E(h13) + h13;
                                } else {
                                    t10 += O4.b((String) obj2);
                                }
                            }
                        }
                        i17 += t10;
                        break;
                    }
                    t10 = z10;
                    i17 += t10;
                case 27:
                    List list6 = (List) unsafe.getObject(obj, j10);
                    S5 E22 = E(i16);
                    int i33 = U5.f24390b;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        E18 = z10;
                    } else {
                        E18 = O4.E(i19 << 3) * size4;
                        for (int i34 = z10; i34 < size4; i34++) {
                            E18 += O4.d((H5) list6.get(i34), E22);
                        }
                    }
                    i17 += E18;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(obj, j10);
                    int i35 = U5.f24390b;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        E19 = z10;
                    } else {
                        E19 = size5 * O4.E(i19 << 3);
                        for (int i36 = z10; i36 < list7.size(); i36++) {
                            int h14 = ((J4) list7.get(i36)).h();
                            E19 += O4.E(h14) + h14;
                        }
                    }
                    i17 += E19;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(obj, j10);
                    int i37 = U5.f24390b;
                    size = list8.size();
                    if (size != 0) {
                        E12 = U5.y(list8);
                        E17 = O4.E(i19 << 3);
                        a10 = size * E17;
                        E16 = E12 + a10;
                        i17 += E16;
                        break;
                    }
                    E16 = z10;
                    i17 += E16;
                case 30:
                    List list9 = (List) unsafe.getObject(obj, j10);
                    int i38 = U5.f24390b;
                    size = list9.size();
                    if (size != 0) {
                        E12 = U5.w(list9);
                        E17 = O4.E(i19 << 3);
                        a10 = size * E17;
                        E16 = E12 + a10;
                        i17 += E16;
                        break;
                    }
                    E16 = z10;
                    i17 += E16;
                case HVError.INSTRUCTION_ERROR /* 31 */:
                    E16 = U5.B(i19, (List) unsafe.getObject(obj, j10), z10);
                    i17 += E16;
                    break;
                case 32:
                    E16 = U5.D(i19, (List) unsafe.getObject(obj, j10), z10);
                    i17 += E16;
                    break;
                case HVError.GPS_ACCESS_DENIED /* 33 */:
                    List list10 = (List) unsafe.getObject(obj, j10);
                    int i39 = U5.f24390b;
                    size = list10.size();
                    if (size != 0) {
                        E12 = U5.z(list10);
                        E17 = O4.E(i19 << 3);
                        a10 = size * E17;
                        E16 = E12 + a10;
                        i17 += E16;
                        break;
                    }
                    E16 = z10;
                    i17 += E16;
                case 34:
                    List list11 = (List) unsafe.getObject(obj, j10);
                    int i40 = U5.f24390b;
                    size = list11.size();
                    if (size != 0) {
                        E12 = U5.v(list11);
                        E17 = O4.E(i19 << 3);
                        a10 = size * E17;
                        E16 = E12 + a10;
                        i17 += E16;
                        break;
                    }
                    E16 = z10;
                    i17 += E16;
                case HVError.FACE_CAPTURE_TIMEOUT /* 35 */:
                    C10 = U5.C((List) unsafe.getObject(obj, j10));
                    if (C10 > 0) {
                        E20 = O4.E(i19 << 3);
                        E21 = O4.E(C10);
                        E19 = E20 + E21 + C10;
                        i17 += E19;
                        break;
                    } else {
                        break;
                    }
                case HVError.HYPER_DOC_DETECT_ERROR /* 36 */:
                    C10 = U5.A((List) unsafe.getObject(obj, j10));
                    if (C10 > 0) {
                        E20 = O4.E(i19 << 3);
                        E21 = O4.E(C10);
                        E19 = E20 + E21 + C10;
                        i17 += E19;
                        break;
                    } else {
                        break;
                    }
                case HVError.INVALID_FILE_ERROR /* 37 */:
                    C10 = U5.t((List) unsafe.getObject(obj, j10));
                    if (C10 > 0) {
                        E20 = O4.E(i19 << 3);
                        E21 = O4.E(C10);
                        E19 = E20 + E21 + C10;
                        i17 += E19;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    C10 = U5.u((List) unsafe.getObject(obj, j10));
                    if (C10 > 0) {
                        E20 = O4.E(i19 << 3);
                        E21 = O4.E(C10);
                        E19 = E20 + E21 + C10;
                        i17 += E19;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    C10 = U5.x((List) unsafe.getObject(obj, j10));
                    if (C10 > 0) {
                        E20 = O4.E(i19 << 3);
                        E21 = O4.E(C10);
                        E19 = E20 + E21 + C10;
                        i17 += E19;
                        break;
                    } else {
                        break;
                    }
                case RequestError.NETWORK_FAILURE /* 40 */:
                    C10 = U5.C((List) unsafe.getObject(obj, j10));
                    if (C10 > 0) {
                        E20 = O4.E(i19 << 3);
                        E21 = O4.E(C10);
                        E19 = E20 + E21 + C10;
                        i17 += E19;
                        break;
                    } else {
                        break;
                    }
                case RequestError.NO_DEV_KEY /* 41 */:
                    C10 = U5.A((List) unsafe.getObject(obj, j10));
                    if (C10 > 0) {
                        E20 = O4.E(i19 << 3);
                        E21 = O4.E(C10);
                        E19 = E20 + E21 + C10;
                        i17 += E19;
                        break;
                    } else {
                        break;
                    }
                case HVError.CONSENT_DENIED /* 42 */:
                    List list12 = (List) unsafe.getObject(obj, j10);
                    int i41 = U5.f24390b;
                    C10 = list12.size();
                    if (C10 > 0) {
                        E20 = O4.E(i19 << 3);
                        E21 = O4.E(C10);
                        E19 = E20 + E21 + C10;
                        i17 += E19;
                        break;
                    } else {
                        break;
                    }
                case HVError.ENCRYPTION_ERROR /* 43 */:
                    C10 = U5.y((List) unsafe.getObject(obj, j10));
                    if (C10 > 0) {
                        E20 = O4.E(i19 << 3);
                        E21 = O4.E(C10);
                        E19 = E20 + E21 + C10;
                        i17 += E19;
                        break;
                    } else {
                        break;
                    }
                case HVError.SDK_CLOSE_ERROR /* 44 */:
                    C10 = U5.w((List) unsafe.getObject(obj, j10));
                    if (C10 > 0) {
                        E20 = O4.E(i19 << 3);
                        E21 = O4.E(C10);
                        E19 = E20 + E21 + C10;
                        i17 += E19;
                        break;
                    } else {
                        break;
                    }
                case HVError.PERMISSION_REVOKED_ERROR /* 45 */:
                    C10 = U5.A((List) unsafe.getObject(obj, j10));
                    if (C10 > 0) {
                        E20 = O4.E(i19 << 3);
                        E21 = O4.E(C10);
                        E19 = E20 + E21 + C10;
                        i17 += E19;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    C10 = U5.C((List) unsafe.getObject(obj, j10));
                    if (C10 > 0) {
                        E20 = O4.E(i19 << 3);
                        E21 = O4.E(C10);
                        E19 = E20 + E21 + C10;
                        i17 += E19;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    C10 = U5.z((List) unsafe.getObject(obj, j10));
                    if (C10 > 0) {
                        E20 = O4.E(i19 << 3);
                        E21 = O4.E(C10);
                        E19 = E20 + E21 + C10;
                        i17 += E19;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    C10 = U5.v((List) unsafe.getObject(obj, j10));
                    if (C10 > 0) {
                        E20 = O4.E(i19 << 3);
                        E21 = O4.E(C10);
                        E19 = E20 + E21 + C10;
                        i17 += E19;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    List list13 = (List) unsafe.getObject(obj, j10);
                    S5 E23 = E(i16);
                    int i42 = U5.f24390b;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        i13 = z10;
                    } else {
                        int i43 = z10;
                        i13 = i43;
                        while (i43 < size6) {
                            i13 += O4.g(i19, (H5) list13.get(i43), E23);
                            i43++;
                        }
                    }
                    i17 += i13;
                    break;
                case 50:
                    B5 b52 = (B5) unsafe.getObject(obj, j10);
                    A5 a52 = (A5) F(i16);
                    if (!b52.isEmpty()) {
                        t10 = z10;
                        for (Map.Entry entry : b52.entrySet()) {
                            t10 += a52.d(i19, entry.getKey(), entry.getValue());
                        }
                        i17 += t10;
                        break;
                    }
                    t10 = z10;
                    i17 += t10;
                case 51:
                    if (t(obj, i19, i16)) {
                        E10 = O4.E(i19 << 3);
                        E16 = E10 + 8;
                        i17 += E16;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (t(obj, i19, i16)) {
                        E11 = O4.E(i19 << 3);
                        E16 = E11 + 4;
                        i17 += E16;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (t(obj, i19, i16)) {
                        long n10 = n(obj, j10);
                        E12 = O4.E(i19 << 3);
                        a10 = O4.a(n10);
                        E16 = E12 + a10;
                        i17 += E16;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (t(obj, i19, i16)) {
                        long n11 = n(obj, j10);
                        E12 = O4.E(i19 << 3);
                        a10 = O4.a(n11);
                        E16 = E12 + a10;
                        i17 += E16;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (t(obj, i19, i16)) {
                        long m10 = m(obj, j10);
                        E12 = O4.E(i19 << 3);
                        a10 = O4.a(m10);
                        E16 = E12 + a10;
                        i17 += E16;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (t(obj, i19, i16)) {
                        E10 = O4.E(i19 << 3);
                        E16 = E10 + 8;
                        i17 += E16;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (t(obj, i19, i16)) {
                        E11 = O4.E(i19 << 3);
                        E16 = E11 + 4;
                        i17 += E16;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (t(obj, i19, i16)) {
                        E13 = O4.E(i19 << 3);
                        E16 = E13 + 1;
                        i17 += E16;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!t(obj, i19, i16)) {
                        break;
                    } else {
                        int i44 = i19 << 3;
                        Object object2 = unsafe.getObject(obj, j10);
                        if (object2 instanceof J4) {
                            E14 = O4.E(i44);
                            h10 = ((J4) object2).h();
                            E15 = O4.E(h10);
                            E16 = E14 + E15 + h10;
                            i17 += E16;
                            break;
                        } else {
                            E12 = O4.E(i44);
                            a10 = O4.b((String) object2);
                            E16 = E12 + a10;
                            i17 += E16;
                        }
                    }
                case HVError.DETECTOR_NOT_AVAILABLE_ERROR /* 60 */:
                    if (t(obj, i19, i16)) {
                        E16 = U5.E(i19, unsafe.getObject(obj, j10), E(i16));
                        i17 += E16;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (t(obj, i19, i16)) {
                        J4 j43 = (J4) unsafe.getObject(obj, j10);
                        E14 = O4.E(i19 << 3);
                        h10 = j43.h();
                        E15 = O4.E(h10);
                        E16 = E14 + E15 + h10;
                        i17 += E16;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (t(obj, i19, i16)) {
                        int m11 = m(obj, j10);
                        E12 = O4.E(i19 << 3);
                        a10 = O4.E(m11);
                        E16 = E12 + a10;
                        i17 += E16;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (t(obj, i19, i16)) {
                        long m12 = m(obj, j10);
                        E12 = O4.E(i19 << 3);
                        a10 = O4.a(m12);
                        E16 = E12 + a10;
                        i17 += E16;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (t(obj, i19, i16)) {
                        E11 = O4.E(i19 << 3);
                        E16 = E11 + 4;
                        i17 += E16;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (t(obj, i19, i16)) {
                        E10 = O4.E(i19 << 3);
                        E16 = E10 + 8;
                        i17 += E16;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (t(obj, i19, i16)) {
                        int m13 = m(obj, j10);
                        E12 = O4.E(i19 << 3);
                        a10 = O4.E((m13 >> 31) ^ (m13 + m13));
                        E16 = E12 + a10;
                        i17 += E16;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (t(obj, i19, i16)) {
                        long n12 = n(obj, j10);
                        E12 = O4.E(i19 << 3);
                        a10 = O4.a((n12 >> 63) ^ (n12 + n12));
                        E16 = E12 + a10;
                        i17 += E16;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (t(obj, i19, i16)) {
                        E16 = O4.g(i19, (H5) unsafe.getObject(obj, j10), E(i16));
                        i17 += E16;
                        break;
                    } else {
                        break;
                    }
            }
            i16 += 3;
            i18 = i10;
            i15 = i11;
            z10 = 0;
            i14 = 1048575;
        }
    }

    @Override // com.google.android.gms.internal.measurement.S5
    public final boolean d(Object obj) {
        int i10;
        int i11;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1048575;
        while (true) {
            S5 s52 = null;
            if (i13 >= this.f24264h) {
                if (!this.f24262f) {
                    return true;
                }
                android.support.v4.media.session.b.a(obj);
                throw null;
            }
            int[] iArr = this.f24263g;
            int[] iArr2 = this.f24257a;
            int i15 = iArr[i13];
            int i16 = iArr2[i15];
            int M10 = M(i15);
            int i17 = iArr2[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i14) {
                if (i18 != 1048575) {
                    i12 = f24256m.getInt(obj, i18);
                }
                i11 = i12;
                i10 = i18;
            } else {
                i10 = i14;
                i11 = i12;
            }
            if ((268435456 & M10) != 0 && !q(obj, i15, i10, i11, i19)) {
                return false;
            }
            int O10 = O(M10);
            if (O10 != 9 && O10 != 17) {
                if (O10 != 27) {
                    if (O10 == 60 || O10 == 68) {
                        if (t(obj, i16, i15) && !L(obj, M10, E(i15))) {
                            return false;
                        }
                    } else if (O10 != 49) {
                        if (O10 != 50) {
                            continue;
                        } else {
                            B5 b52 = (B5) AbstractC2282k6.s(obj, M10 & 1048575);
                            if (!b52.isEmpty() && ((A5) F(i15)).e().f24717c.zza() == EnumC2327p6.MESSAGE) {
                                for (Object obj2 : b52.values()) {
                                    if (s52 == null) {
                                        s52 = P5.a().b(obj2.getClass());
                                    }
                                    if (!s52.d(obj2)) {
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
                List list = (List) AbstractC2282k6.s(obj, M10 & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    S5 E10 = E(i15);
                    for (int i20 = 0; i20 < list.size(); i20++) {
                        if (!E10.d(list.get(i20))) {
                            return false;
                        }
                    }
                }
            } else if (q(obj, i15, i10, i11, i19) && !L(obj, M10, E(i15))) {
                return false;
            }
            i13++;
            i14 = i10;
            i12 = i11;
        }
    }

    @Override // com.google.android.gms.internal.measurement.S5
    public final void e(Object obj, byte[] bArr, int i10, int i11, C2396x4 c2396x4) {
        z(obj, bArr, i10, i11, 0, c2396x4);
    }

    @Override // com.google.android.gms.internal.measurement.S5
    public final boolean f(Object obj, Object obj2) {
        boolean b10;
        for (int i10 = 0; i10 < this.f24257a.length; i10 += 3) {
            int M10 = M(i10);
            long j10 = M10 & 1048575;
            switch (O(M10)) {
                case 0:
                    if (p(obj, obj2, i10) && Double.doubleToLongBits(AbstractC2282k6.q(obj, j10)) == Double.doubleToLongBits(AbstractC2282k6.q(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (p(obj, obj2, i10) && Float.floatToIntBits(AbstractC2282k6.o(obj, j10)) == Float.floatToIntBits(AbstractC2282k6.o(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (p(obj, obj2, i10) && AbstractC2282k6.k(obj, j10) == AbstractC2282k6.k(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (p(obj, obj2, i10) && AbstractC2282k6.k(obj, j10) == AbstractC2282k6.k(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (p(obj, obj2, i10) && AbstractC2282k6.i(obj, j10) == AbstractC2282k6.i(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (p(obj, obj2, i10) && AbstractC2282k6.k(obj, j10) == AbstractC2282k6.k(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (p(obj, obj2, i10) && AbstractC2282k6.i(obj, j10) == AbstractC2282k6.i(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (p(obj, obj2, i10) && AbstractC2282k6.m(obj, j10) == AbstractC2282k6.m(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (p(obj, obj2, i10) && U5.b(AbstractC2282k6.s(obj, j10), AbstractC2282k6.s(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (p(obj, obj2, i10) && U5.b(AbstractC2282k6.s(obj, j10), AbstractC2282k6.s(obj2, j10))) {
                        continue;
                    }
                    return false;
                case RequestError.EVENT_TIMEOUT /* 10 */:
                    if (p(obj, obj2, i10) && U5.b(AbstractC2282k6.s(obj, j10), AbstractC2282k6.s(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (p(obj, obj2, i10) && AbstractC2282k6.i(obj, j10) == AbstractC2282k6.i(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (p(obj, obj2, i10) && AbstractC2282k6.i(obj, j10) == AbstractC2282k6.i(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (p(obj, obj2, i10) && AbstractC2282k6.i(obj, j10) == AbstractC2282k6.i(obj2, j10)) {
                        continue;
                    }
                    return false;
                case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                    if (p(obj, obj2, i10) && AbstractC2282k6.k(obj, j10) == AbstractC2282k6.k(obj2, j10)) {
                        continue;
                    }
                    return false;
                case HVError.SSL_CONNECT_ERROR /* 15 */:
                    if (p(obj, obj2, i10) && AbstractC2282k6.i(obj, j10) == AbstractC2282k6.i(obj2, j10)) {
                        continue;
                    }
                    return false;
                case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                    if (p(obj, obj2, i10) && AbstractC2282k6.k(obj, j10) == AbstractC2282k6.k(obj2, j10)) {
                        continue;
                    }
                    return false;
                case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                    if (p(obj, obj2, i10) && U5.b(AbstractC2282k6.s(obj, j10), AbstractC2282k6.s(obj2, j10))) {
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
                    b10 = U5.b(AbstractC2282k6.s(obj, j10), AbstractC2282k6.s(obj2, j10));
                    break;
                case 50:
                    b10 = U5.b(AbstractC2282k6.s(obj, j10), AbstractC2282k6.s(obj2, j10));
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
                    long N10 = N(i10) & 1048575;
                    if (AbstractC2282k6.i(obj, N10) == AbstractC2282k6.i(obj2, N10) && U5.b(AbstractC2282k6.s(obj, j10), AbstractC2282k6.s(obj2, j10))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!b10) {
                return false;
            }
        }
        if (!((AbstractC2245g5) obj).zzc.equals(((AbstractC2245g5) obj2).zzc)) {
            return false;
        }
        if (!this.f24262f) {
            return true;
        }
        android.support.v4.media.session.b.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.S5
    public final void g(Object obj) {
        if (i(obj)) {
            if (obj instanceof AbstractC2245g5) {
                AbstractC2245g5 abstractC2245g5 = (AbstractC2245g5) obj;
                abstractC2245g5.q(Integer.MAX_VALUE);
                abstractC2245g5.zza = 0;
                abstractC2245g5.k();
            }
            int[] iArr = this.f24257a;
            for (int i10 = 0; i10 < iArr.length; i10 += 3) {
                int M10 = M(i10);
                int i11 = 1048575 & M10;
                int O10 = O(M10);
                long j10 = i11;
                if (O10 != 9) {
                    if (O10 != 60 && O10 != 68) {
                        switch (O10) {
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
                                ((InterfaceC2299m5) AbstractC2282k6.s(obj, j10)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = f24256m;
                                Object object = unsafe.getObject(obj, j10);
                                if (object != null) {
                                    ((B5) object).h();
                                    unsafe.putObject(obj, j10, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (t(obj, iArr[i10], i10)) {
                        E(i10).g(f24256m.getObject(obj, j10));
                    }
                }
                if (r(obj, i10)) {
                    E(i10).g(f24256m.getObject(obj, j10));
                }
            }
            this.f24266j.b(obj);
            if (this.f24262f) {
                this.f24267k.a(obj);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v20 */
    @Override // com.google.android.gms.internal.measurement.S5
    public final void h(Object obj, InterfaceC2336q6 interfaceC2336q6) {
        int i10;
        int i11;
        int i12;
        int[] iArr;
        ?? r92 = 1;
        if (this.f24262f) {
            android.support.v4.media.session.b.a(obj);
            throw null;
        }
        int[] iArr2 = this.f24257a;
        Unsafe unsafe = f24256m;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        while (i15 < iArr2.length) {
            int M10 = M(i15);
            int O10 = O(M10);
            int i16 = iArr2[i15];
            if (O10 <= 17) {
                int i17 = iArr2[i15 + 2];
                int i18 = i17 & 1048575;
                if (i18 != i13) {
                    i14 = i18 == 1048575 ? 0 : unsafe.getInt(obj, i18);
                    i13 = i18;
                }
                i10 = i13;
                i11 = i14;
                i12 = r92 << (i17 >>> 20);
            } else {
                i10 = i13;
                i11 = i14;
                i12 = 0;
            }
            long j10 = M10 & 1048575;
            switch (O10) {
                case 0:
                    iArr = iArr2;
                    if (!q(obj, i15, i10, i11, i12)) {
                        break;
                    } else {
                        interfaceC2336q6.s(i16, AbstractC2282k6.q(obj, j10));
                        continue;
                    }
                case 1:
                    iArr = iArr2;
                    if (q(obj, i15, i10, i11, i12)) {
                        interfaceC2336q6.Y(i16, AbstractC2282k6.o(obj, j10));
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    iArr = iArr2;
                    if (q(obj, i15, i10, i11, i12)) {
                        interfaceC2336q6.a(i16, unsafe.getLong(obj, j10));
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    iArr = iArr2;
                    if (q(obj, i15, i10, i11, i12)) {
                        interfaceC2336q6.G(i16, unsafe.getLong(obj, j10));
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    iArr = iArr2;
                    if (q(obj, i15, i10, i11, i12)) {
                        interfaceC2336q6.q(i16, unsafe.getInt(obj, j10));
                        break;
                    } else {
                        continue;
                    }
                case 5:
                    iArr = iArr2;
                    if (q(obj, i15, i10, i11, i12)) {
                        interfaceC2336q6.h(i16, unsafe.getLong(obj, j10));
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    iArr = iArr2;
                    if (q(obj, i15, i10, i11, i12)) {
                        interfaceC2336q6.m(i16, unsafe.getInt(obj, j10));
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    iArr = iArr2;
                    if (q(obj, i15, i10, i11, i12)) {
                        interfaceC2336q6.V(i16, AbstractC2282k6.m(obj, j10));
                        break;
                    } else {
                        continue;
                    }
                case 8:
                    iArr = iArr2;
                    if (q(obj, i15, i10, i11, i12)) {
                        x(i16, unsafe.getObject(obj, j10), interfaceC2336q6);
                        break;
                    } else {
                        continue;
                    }
                case 9:
                    iArr = iArr2;
                    if (q(obj, i15, i10, i11, i12)) {
                        interfaceC2336q6.E(i16, unsafe.getObject(obj, j10), E(i15));
                        break;
                    } else {
                        continue;
                    }
                case RequestError.EVENT_TIMEOUT /* 10 */:
                    iArr = iArr2;
                    if (q(obj, i15, i10, i11, i12)) {
                        interfaceC2336q6.B(i16, (J4) unsafe.getObject(obj, j10));
                        break;
                    } else {
                        continue;
                    }
                case 11:
                    iArr = iArr2;
                    if (q(obj, i15, i10, i11, i12)) {
                        interfaceC2336q6.O(i16, unsafe.getInt(obj, j10));
                        break;
                    } else {
                        continue;
                    }
                case 12:
                    iArr = iArr2;
                    if (q(obj, i15, i10, i11, i12)) {
                        interfaceC2336q6.R(i16, unsafe.getInt(obj, j10));
                        break;
                    } else {
                        continue;
                    }
                case 13:
                    iArr = iArr2;
                    if (q(obj, i15, i10, i11, i12)) {
                        interfaceC2336q6.k(i16, unsafe.getInt(obj, j10));
                        break;
                    } else {
                        continue;
                    }
                case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                    iArr = iArr2;
                    if (q(obj, i15, i10, i11, i12)) {
                        interfaceC2336q6.A(i16, unsafe.getLong(obj, j10));
                        break;
                    } else {
                        continue;
                    }
                case HVError.SSL_CONNECT_ERROR /* 15 */:
                    iArr = iArr2;
                    if (q(obj, i15, i10, i11, i12)) {
                        interfaceC2336q6.S(i16, unsafe.getInt(obj, j10));
                        break;
                    } else {
                        continue;
                    }
                case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                    iArr = iArr2;
                    if (q(obj, i15, i10, i11, i12)) {
                        interfaceC2336q6.H(i16, unsafe.getLong(obj, j10));
                        break;
                    } else {
                        continue;
                    }
                case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                    iArr = iArr2;
                    if (q(obj, i15, i10, i11, i12)) {
                        interfaceC2336q6.U(i16, unsafe.getObject(obj, j10), E(i15));
                        break;
                    } else {
                        continue;
                    }
                case 18:
                    U5.f(iArr2[i15], (List) unsafe.getObject(obj, j10), interfaceC2336q6, false);
                    break;
                case 19:
                    U5.g(iArr2[i15], (List) unsafe.getObject(obj, j10), interfaceC2336q6, false);
                    break;
                case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                    U5.h(iArr2[i15], (List) unsafe.getObject(obj, j10), interfaceC2336q6, false);
                    break;
                case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                    U5.i(iArr2[i15], (List) unsafe.getObject(obj, j10), interfaceC2336q6, false);
                    break;
                case HVError.FACE_DETECTION_ERROR /* 22 */:
                    U5.m(iArr2[i15], (List) unsafe.getObject(obj, j10), interfaceC2336q6, false);
                    break;
                case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                    U5.k(iArr2[i15], (List) unsafe.getObject(obj, j10), interfaceC2336q6, false);
                    break;
                case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                    U5.p(iArr2[i15], (List) unsafe.getObject(obj, j10), interfaceC2336q6, false);
                    break;
                case HVError.LOW_STORAGE_ERROR /* 25 */:
                    U5.s(iArr2[i15], (List) unsafe.getObject(obj, j10), interfaceC2336q6, false);
                    break;
                case 26:
                    int i19 = iArr2[i15];
                    List list = (List) unsafe.getObject(obj, j10);
                    int i20 = U5.f24390b;
                    if (list != null && !list.isEmpty()) {
                        interfaceC2336q6.P(i19, list);
                        break;
                    }
                    break;
                case 27:
                    int i21 = iArr2[i15];
                    List list2 = (List) unsafe.getObject(obj, j10);
                    S5 E10 = E(i15);
                    int i22 = U5.f24390b;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i23 = 0; i23 < list2.size(); i23 += r92) {
                            ((P4) interfaceC2336q6).E(i21, list2.get(i23), E10);
                        }
                        break;
                    }
                    break;
                case 28:
                    int i24 = iArr2[i15];
                    List list3 = (List) unsafe.getObject(obj, j10);
                    int i25 = U5.f24390b;
                    if (list3 != null && !list3.isEmpty()) {
                        interfaceC2336q6.L(i24, list3);
                        break;
                    }
                    break;
                case 29:
                    U5.n(iArr2[i15], (List) unsafe.getObject(obj, j10), interfaceC2336q6, false);
                    break;
                case 30:
                    U5.r(iArr2[i15], (List) unsafe.getObject(obj, j10), interfaceC2336q6, false);
                    break;
                case HVError.INSTRUCTION_ERROR /* 31 */:
                    U5.q(iArr2[i15], (List) unsafe.getObject(obj, j10), interfaceC2336q6, false);
                    break;
                case 32:
                    U5.l(iArr2[i15], (List) unsafe.getObject(obj, j10), interfaceC2336q6, false);
                    break;
                case HVError.GPS_ACCESS_DENIED /* 33 */:
                    U5.o(iArr2[i15], (List) unsafe.getObject(obj, j10), interfaceC2336q6, false);
                    break;
                case 34:
                    U5.j(iArr2[i15], (List) unsafe.getObject(obj, j10), interfaceC2336q6, false);
                    break;
                case HVError.FACE_CAPTURE_TIMEOUT /* 35 */:
                    U5.f(iArr2[i15], (List) unsafe.getObject(obj, j10), interfaceC2336q6, r92);
                    break;
                case HVError.HYPER_DOC_DETECT_ERROR /* 36 */:
                    U5.g(iArr2[i15], (List) unsafe.getObject(obj, j10), interfaceC2336q6, r92);
                    break;
                case HVError.INVALID_FILE_ERROR /* 37 */:
                    U5.h(iArr2[i15], (List) unsafe.getObject(obj, j10), interfaceC2336q6, r92);
                    break;
                case 38:
                    U5.i(iArr2[i15], (List) unsafe.getObject(obj, j10), interfaceC2336q6, r92);
                    break;
                case 39:
                    U5.m(iArr2[i15], (List) unsafe.getObject(obj, j10), interfaceC2336q6, r92);
                    break;
                case RequestError.NETWORK_FAILURE /* 40 */:
                    U5.k(iArr2[i15], (List) unsafe.getObject(obj, j10), interfaceC2336q6, r92);
                    break;
                case RequestError.NO_DEV_KEY /* 41 */:
                    U5.p(iArr2[i15], (List) unsafe.getObject(obj, j10), interfaceC2336q6, r92);
                    break;
                case HVError.CONSENT_DENIED /* 42 */:
                    U5.s(iArr2[i15], (List) unsafe.getObject(obj, j10), interfaceC2336q6, r92);
                    break;
                case HVError.ENCRYPTION_ERROR /* 43 */:
                    U5.n(iArr2[i15], (List) unsafe.getObject(obj, j10), interfaceC2336q6, r92);
                    break;
                case HVError.SDK_CLOSE_ERROR /* 44 */:
                    U5.r(iArr2[i15], (List) unsafe.getObject(obj, j10), interfaceC2336q6, r92);
                    break;
                case HVError.PERMISSION_REVOKED_ERROR /* 45 */:
                    U5.q(iArr2[i15], (List) unsafe.getObject(obj, j10), interfaceC2336q6, r92);
                    break;
                case 46:
                    U5.l(iArr2[i15], (List) unsafe.getObject(obj, j10), interfaceC2336q6, r92);
                    break;
                case 47:
                    U5.o(iArr2[i15], (List) unsafe.getObject(obj, j10), interfaceC2336q6, r92);
                    break;
                case 48:
                    U5.j(iArr2[i15], (List) unsafe.getObject(obj, j10), interfaceC2336q6, r92);
                    break;
                case 49:
                    int i26 = iArr2[i15];
                    List list4 = (List) unsafe.getObject(obj, j10);
                    S5 E11 = E(i15);
                    int i27 = U5.f24390b;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i28 = 0; i28 < list4.size(); i28 += r92) {
                            ((P4) interfaceC2336q6).U(i26, list4.get(i28), E11);
                        }
                        break;
                    }
                    break;
                case 50:
                    Object object = unsafe.getObject(obj, j10);
                    if (object != null) {
                        interfaceC2336q6.D(i16, ((A5) F(i15)).e(), (B5) object);
                        break;
                    }
                    break;
                case 51:
                    if (t(obj, i16, i15)) {
                        interfaceC2336q6.s(i16, k(obj, j10));
                        break;
                    }
                    break;
                case 52:
                    if (t(obj, i16, i15)) {
                        interfaceC2336q6.Y(i16, l(obj, j10));
                        break;
                    }
                    break;
                case 53:
                    if (t(obj, i16, i15)) {
                        interfaceC2336q6.a(i16, n(obj, j10));
                        break;
                    }
                    break;
                case 54:
                    if (t(obj, i16, i15)) {
                        interfaceC2336q6.G(i16, n(obj, j10));
                        break;
                    }
                    break;
                case 55:
                    if (t(obj, i16, i15)) {
                        interfaceC2336q6.q(i16, m(obj, j10));
                        break;
                    }
                    break;
                case 56:
                    if (t(obj, i16, i15)) {
                        interfaceC2336q6.h(i16, n(obj, j10));
                        break;
                    }
                    break;
                case 57:
                    if (t(obj, i16, i15)) {
                        interfaceC2336q6.m(i16, m(obj, j10));
                        break;
                    }
                    break;
                case 58:
                    if (t(obj, i16, i15)) {
                        interfaceC2336q6.V(i16, o(obj, j10));
                        break;
                    }
                    break;
                case 59:
                    if (t(obj, i16, i15)) {
                        x(i16, unsafe.getObject(obj, j10), interfaceC2336q6);
                        break;
                    }
                    break;
                case HVError.DETECTOR_NOT_AVAILABLE_ERROR /* 60 */:
                    if (t(obj, i16, i15)) {
                        interfaceC2336q6.E(i16, unsafe.getObject(obj, j10), E(i15));
                        break;
                    }
                    break;
                case 61:
                    if (t(obj, i16, i15)) {
                        interfaceC2336q6.B(i16, (J4) unsafe.getObject(obj, j10));
                        break;
                    }
                    break;
                case 62:
                    if (t(obj, i16, i15)) {
                        interfaceC2336q6.O(i16, m(obj, j10));
                        break;
                    }
                    break;
                case 63:
                    if (t(obj, i16, i15)) {
                        interfaceC2336q6.R(i16, m(obj, j10));
                        break;
                    }
                    break;
                case 64:
                    if (t(obj, i16, i15)) {
                        interfaceC2336q6.k(i16, m(obj, j10));
                        break;
                    }
                    break;
                case 65:
                    if (t(obj, i16, i15)) {
                        interfaceC2336q6.A(i16, n(obj, j10));
                        break;
                    }
                    break;
                case 66:
                    if (t(obj, i16, i15)) {
                        interfaceC2336q6.S(i16, m(obj, j10));
                        break;
                    }
                    break;
                case 67:
                    if (t(obj, i16, i15)) {
                        interfaceC2336q6.H(i16, n(obj, j10));
                        break;
                    }
                    break;
                case 68:
                    if (t(obj, i16, i15)) {
                        interfaceC2336q6.U(i16, unsafe.getObject(obj, j10), E(i15));
                        break;
                    }
                    break;
            }
            iArr = iArr2;
            i15 += 3;
            i13 = i10;
            i14 = i11;
            iArr2 = iArr;
            r92 = 1;
        }
        ((AbstractC2245g5) obj).zzc.f(interfaceC2336q6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0cd0, code lost:
    
        if (r3 == r5) goto L528;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0cd2, code lost:
    
        r13.putInt(r8, r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0cd6, code lost:
    
        r3 = r1.f24264h;
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0cdc, code lost:
    
        if (r3 >= r1.f24265i) goto L640;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0cde, code lost:
    
        r5 = r1.f24263g;
        r6 = r1.f24266j;
        r7 = r1.f24257a;
        r5 = r5[r3];
        r7 = r7[r5];
        r9 = com.google.android.gms.internal.measurement.AbstractC2282k6.s(r8, r1.M(r5) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0cf5, code lost:
    
        if (r9 == null) goto L641;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0cf7, code lost:
    
        r12 = r1.G(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0cfb, code lost:
    
        if (r12 == null) goto L642;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0cfd, code lost:
    
        r5 = ((com.google.android.gms.internal.measurement.A5) r1.F(r5)).e();
        r9 = ((com.google.android.gms.internal.measurement.B5) r9).entrySet().iterator();
        r4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0d15, code lost:
    
        if (r9.hasNext() == false) goto L643;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0d17, code lost:
    
        r13 = (java.util.Map.Entry) r9.next();
        r4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0d2b, code lost:
    
        if (r12.b(((java.lang.Integer) r13.getValue()).intValue()) != false) goto L645;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0d2d, code lost:
    
        if (r4 != null) goto L542;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0d2f, code lost:
    
        r4 = r6.a(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0d33, code lost:
    
        r14 = com.google.android.gms.internal.measurement.A5.c(r5, r13.getKey(), r13.getValue());
        r15 = com.google.android.gms.internal.measurement.J4.f24246b;
        r15 = new byte[r14];
        r16 = com.google.android.gms.internal.measurement.O4.f24319d;
        r10 = new com.google.android.gms.internal.measurement.M4(r15, 0, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:595:0x0a05, code lost:
    
        throw new com.google.android.gms.internal.measurement.C2326p5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0d4b, code lost:
    
        com.google.android.gms.internal.measurement.A5.b(r10, r5, r13.getKey(), r13.getValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0d56, code lost:
    
        r4.j((r7 << 3) | 2, com.google.android.gms.internal.measurement.G4.a(r10, r15));
        r9.remove();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0d6d, code lost:
    
        r4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0d70, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0d76, code lost:
    
        throw new java.lang.RuntimeException(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0d77, code lost:
    
        r3 = r3 + 1;
        r1 = r33;
        r4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0d83, code lost:
    
        if (r4 == null) goto L552;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0d85, code lost:
    
        ((com.google.android.gms.internal.measurement.AbstractC2245g5) r8).zzc = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0d8a, code lost:
    
        if (r0 != 0) goto L558;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0d8e, code lost:
    
        if (r2 != r37) goto L556;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0d98, code lost:
    
        throw new com.google.android.gms.internal.measurement.C2326p5(r28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0da1, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0d99, code lost:
    
        r3 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0d9d, code lost:
    
        if (r2 > r37) goto L562;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0d9f, code lost:
    
        if (r11 != r0) goto L562;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0da7, code lost:
    
        throw new com.google.android.gms.internal.measurement.C2326p5(r3);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x08a3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x08b5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:605:0x0c48  */
    /* JADX WARN: Removed duplicated region for block: B:606:0x0c60  */
    /* JADX WARN: Removed duplicated region for block: B:675:0x005c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0c7e  */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v38, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final int z(Object obj, byte[] bArr, int i10, int i11, int i12, C2396x4 c2396x4) {
        String str;
        Unsafe unsafe;
        Object obj2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int v10;
        int i19;
        int i20;
        Unsafe unsafe2;
        C2396x4 c2396x42;
        byte[] bArr2;
        int i21;
        Unsafe unsafe3;
        int i22;
        int i23;
        Unsafe unsafe4;
        int i24;
        int i25;
        int c10;
        Unsafe unsafe5;
        String str2;
        Unsafe unsafe6;
        Object obj3;
        int i26;
        B5 b52;
        Object obj4;
        long j10;
        int i27;
        int i28;
        Unsafe unsafe7;
        int i29;
        int i30;
        int i31;
        Object obj5;
        int l10;
        int i32;
        int i33;
        int i34;
        Unsafe unsafe8;
        int i35;
        int c11;
        K5 k52 = this;
        Object obj6 = obj;
        byte[] bArr3 = bArr;
        int i36 = i11;
        int i37 = i12;
        C2396x4 c2396x43 = c2396x4;
        int i38 = 3;
        j(obj);
        Unsafe unsafe9 = f24256m;
        int i39 = 0;
        int i40 = -1;
        int i41 = i10;
        int i42 = -1;
        int i43 = 0;
        int i44 = 0;
        int i45 = 0;
        int i46 = 1048575;
        while (true) {
            if (i41 < i36) {
                int i47 = i41 + 1;
                int i48 = bArr3[i41];
                if (i48 < 0) {
                    i47 = AbstractC2405y4.b(i48, bArr3, i47, c2396x43);
                    i48 = c2396x43.f24687a;
                }
                int i49 = i48 >>> 3;
                if (i49 > i42) {
                    v10 = (i49 < k52.f24259c || i49 > k52.f24260d) ? i40 : k52.v(i49, i43 / i38);
                } else if (i49 < k52.f24259c || i49 > k52.f24260d) {
                    i18 = i40;
                    if (i18 != i40) {
                        i19 = i47;
                        i20 = i40;
                        unsafe2 = unsafe9;
                        c2396x42 = c2396x43;
                        str = "Failed to parse the message.";
                        obj2 = obj6;
                        bArr2 = bArr3;
                        i13 = i37;
                        i16 = i48;
                        i21 = i39;
                    } else {
                        int i50 = i48 & 7;
                        int[] iArr = k52.f24257a;
                        int i51 = iArr[i18 + 1];
                        int O10 = O(i51);
                        int i52 = i48;
                        long j11 = i51 & 1048575;
                        str = "Failed to parse the message.";
                        if (O10 <= 17) {
                            int i53 = iArr[i18 + 2];
                            int i54 = 1 << (i53 >>> 20);
                            int i55 = i53 & 1048575;
                            int i56 = i46;
                            if (i55 != i56) {
                                if (i56 != 1048575) {
                                    unsafe9.putInt(obj6, i56, i44);
                                }
                                i44 = i55 == 1048575 ? 0 : unsafe9.getInt(obj6, i55);
                                i46 = i55;
                            } else {
                                i46 = i56;
                            }
                            switch (O10) {
                                case 0:
                                    i34 = i52;
                                    unsafe8 = unsafe9;
                                    i20 = -1;
                                    i35 = i18;
                                    if (i50 != 1) {
                                        i19 = i47;
                                        unsafe2 = unsafe8;
                                        c2396x42 = c2396x43;
                                        i16 = i34;
                                        bArr2 = bArr3;
                                        i21 = i35;
                                        obj2 = obj6;
                                        i13 = i12;
                                        break;
                                    } else {
                                        i41 = i47 + 8;
                                        i44 |= i54;
                                        AbstractC2282k6.r(obj6, j11, Double.longBitsToDouble(AbstractC2405y4.e(bArr3, i47)));
                                        i36 = i11;
                                        i43 = i35;
                                        unsafe9 = unsafe8;
                                        i45 = i34;
                                        i42 = i49;
                                        i40 = i20;
                                        i39 = 0;
                                        i38 = 3;
                                        i37 = i12;
                                        break;
                                    }
                                case 1:
                                    i34 = i52;
                                    unsafe8 = unsafe9;
                                    i20 = -1;
                                    i35 = i18;
                                    if (i50 != 5) {
                                        i19 = i47;
                                        unsafe2 = unsafe8;
                                        c2396x42 = c2396x43;
                                        i16 = i34;
                                        bArr2 = bArr3;
                                        i21 = i35;
                                        obj2 = obj6;
                                        i13 = i12;
                                        break;
                                    } else {
                                        i41 = i47 + 4;
                                        i44 |= i54;
                                        AbstractC2282k6.p(obj6, j11, Float.intBitsToFloat(AbstractC2405y4.d(bArr3, i47)));
                                        i36 = i11;
                                        i43 = i35;
                                        unsafe9 = unsafe8;
                                        i45 = i34;
                                        i42 = i49;
                                        i40 = i20;
                                        i39 = 0;
                                        i38 = 3;
                                        i37 = i12;
                                        break;
                                    }
                                case 2:
                                case 3:
                                    i34 = i52;
                                    unsafe8 = unsafe9;
                                    i20 = -1;
                                    i35 = i18;
                                    if (i50 != 0) {
                                        i19 = i47;
                                        unsafe2 = unsafe8;
                                        c2396x42 = c2396x43;
                                        i16 = i34;
                                        bArr2 = bArr3;
                                        i21 = i35;
                                        obj2 = obj6;
                                        i13 = i12;
                                        break;
                                    } else {
                                        i44 |= i54;
                                        c11 = AbstractC2405y4.c(bArr3, i47, c2396x43);
                                        unsafe8.putLong(obj, j11, c2396x43.f24688b);
                                        i43 = i35;
                                        i41 = c11;
                                        unsafe9 = unsafe8;
                                        i45 = i34;
                                        i42 = i49;
                                        i40 = i20;
                                        i39 = 0;
                                        i38 = 3;
                                        i36 = i11;
                                        i37 = i12;
                                        break;
                                    }
                                case 4:
                                case 11:
                                    i34 = i52;
                                    unsafe8 = unsafe9;
                                    i20 = -1;
                                    i35 = i18;
                                    if (i50 != 0) {
                                        i19 = i47;
                                        unsafe2 = unsafe8;
                                        c2396x42 = c2396x43;
                                        i16 = i34;
                                        bArr2 = bArr3;
                                        i21 = i35;
                                        obj2 = obj6;
                                        i13 = i12;
                                        break;
                                    } else {
                                        i44 |= i54;
                                        i41 = AbstractC2405y4.a(bArr3, i47, c2396x43);
                                        unsafe8.putInt(obj6, j11, c2396x43.f24687a);
                                        i36 = i11;
                                        i43 = i35;
                                        unsafe9 = unsafe8;
                                        i45 = i34;
                                        i42 = i49;
                                        i40 = i20;
                                        i39 = 0;
                                        i38 = 3;
                                        i37 = i12;
                                        break;
                                    }
                                case 5:
                                case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                                    i34 = i52;
                                    unsafe8 = unsafe9;
                                    i20 = -1;
                                    i35 = i18;
                                    if (i50 != 1) {
                                        i19 = i47;
                                        unsafe2 = unsafe8;
                                        c2396x42 = c2396x43;
                                        i16 = i34;
                                        bArr2 = bArr3;
                                        i21 = i35;
                                        obj2 = obj6;
                                        i13 = i12;
                                        break;
                                    } else {
                                        c11 = i47 + 8;
                                        i44 |= i54;
                                        unsafe8.putLong(obj, j11, AbstractC2405y4.e(bArr3, i47));
                                        i43 = i35;
                                        i41 = c11;
                                        unsafe9 = unsafe8;
                                        i45 = i34;
                                        i42 = i49;
                                        i40 = i20;
                                        i39 = 0;
                                        i38 = 3;
                                        i36 = i11;
                                        i37 = i12;
                                        break;
                                    }
                                case 6:
                                case 13:
                                    i34 = i52;
                                    unsafe8 = unsafe9;
                                    i20 = -1;
                                    i35 = i18;
                                    if (i50 != 5) {
                                        i19 = i47;
                                        unsafe2 = unsafe8;
                                        c2396x42 = c2396x43;
                                        i16 = i34;
                                        bArr2 = bArr3;
                                        i21 = i35;
                                        obj2 = obj6;
                                        i13 = i12;
                                        break;
                                    } else {
                                        i41 = i47 + 4;
                                        i44 |= i54;
                                        unsafe8.putInt(obj6, j11, AbstractC2405y4.d(bArr3, i47));
                                        i36 = i11;
                                        i43 = i35;
                                        unsafe9 = unsafe8;
                                        i45 = i34;
                                        i42 = i49;
                                        i40 = i20;
                                        i39 = 0;
                                        i38 = 3;
                                        i37 = i12;
                                        break;
                                    }
                                case 7:
                                    i34 = i52;
                                    unsafe8 = unsafe9;
                                    i20 = -1;
                                    i35 = i18;
                                    if (i50 != 0) {
                                        i19 = i47;
                                        unsafe2 = unsafe8;
                                        c2396x42 = c2396x43;
                                        i16 = i34;
                                        bArr2 = bArr3;
                                        i21 = i35;
                                        obj2 = obj6;
                                        i13 = i12;
                                        break;
                                    } else {
                                        i44 |= i54;
                                        i41 = AbstractC2405y4.c(bArr3, i47, c2396x43);
                                        AbstractC2282k6.n(obj6, j11, c2396x43.f24688b != 0);
                                        i36 = i11;
                                        i43 = i35;
                                        unsafe9 = unsafe8;
                                        i45 = i34;
                                        i42 = i49;
                                        i40 = i20;
                                        i39 = 0;
                                        i38 = 3;
                                        i37 = i12;
                                        break;
                                    }
                                case 8:
                                    i34 = i52;
                                    unsafe8 = unsafe9;
                                    i20 = -1;
                                    i35 = i18;
                                    if (i50 != 2) {
                                        i19 = i47;
                                        unsafe2 = unsafe8;
                                        c2396x42 = c2396x43;
                                        i16 = i34;
                                        bArr2 = bArr3;
                                        i21 = i35;
                                        obj2 = obj6;
                                        i13 = i12;
                                        break;
                                    } else {
                                        if ((i51 & 536870912) != 0) {
                                            i44 |= i54;
                                            i41 = AbstractC2405y4.f(bArr3, i47, c2396x43);
                                        } else {
                                            i41 = AbstractC2405y4.a(bArr3, i47, c2396x43);
                                            int i57 = c2396x43.f24687a;
                                            if (i57 < 0) {
                                                throw new C2326p5("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            int i58 = i44 | i54;
                                            if (i57 == 0) {
                                                c2396x43.f24689c = BuildConfig.FLAVOR;
                                            } else {
                                                c2396x43.f24689c = new String(bArr3, i41, i57, AbstractC2308n5.f24581a);
                                                i41 += i57;
                                            }
                                            i44 = i58;
                                        }
                                        unsafe8.putObject(obj6, j11, c2396x43.f24689c);
                                        i36 = i11;
                                        i43 = i35;
                                        unsafe9 = unsafe8;
                                        i45 = i34;
                                        i42 = i49;
                                        i40 = i20;
                                        i39 = 0;
                                        i38 = 3;
                                        i37 = i12;
                                        break;
                                    }
                                case 9:
                                    i34 = i52;
                                    unsafe8 = unsafe9;
                                    i20 = -1;
                                    i35 = i18;
                                    if (i50 != 2) {
                                        i19 = i47;
                                        unsafe2 = unsafe8;
                                        c2396x42 = c2396x43;
                                        i16 = i34;
                                        bArr2 = bArr3;
                                        i21 = i35;
                                        obj2 = obj6;
                                        i13 = i12;
                                        break;
                                    } else {
                                        i44 |= i54;
                                        Object H10 = k52.H(obj6, i35);
                                        i41 = AbstractC2405y4.j(H10, k52.E(i35), bArr, i47, i11, c2396x4);
                                        k52.I(obj6, i35, H10);
                                        i36 = i11;
                                        i43 = i35;
                                        unsafe9 = unsafe8;
                                        i45 = i34;
                                        i42 = i49;
                                        i40 = i20;
                                        i39 = 0;
                                        i38 = 3;
                                        i37 = i12;
                                        break;
                                    }
                                case RequestError.EVENT_TIMEOUT /* 10 */:
                                    i34 = i52;
                                    unsafe8 = unsafe9;
                                    i20 = -1;
                                    i35 = i18;
                                    if (i50 != 2) {
                                        i19 = i47;
                                        unsafe2 = unsafe8;
                                        c2396x42 = c2396x43;
                                        i16 = i34;
                                        bArr2 = bArr3;
                                        i21 = i35;
                                        obj2 = obj6;
                                        i13 = i12;
                                        break;
                                    } else {
                                        i44 |= i54;
                                        int g10 = AbstractC2405y4.g(bArr3, i47, c2396x43);
                                        unsafe8.putObject(obj6, j11, c2396x43.f24689c);
                                        i36 = i11;
                                        i41 = g10;
                                        i43 = i35;
                                        unsafe9 = unsafe8;
                                        i45 = i34;
                                        i42 = i49;
                                        i40 = i20;
                                        i39 = 0;
                                        i38 = 3;
                                        i37 = i12;
                                        break;
                                    }
                                case 12:
                                    i34 = i52;
                                    unsafe8 = unsafe9;
                                    i20 = -1;
                                    i35 = i18;
                                    if (i50 != 0) {
                                        i19 = i47;
                                        unsafe2 = unsafe8;
                                        c2396x42 = c2396x43;
                                        i16 = i34;
                                        bArr2 = bArr3;
                                        i21 = i35;
                                        obj2 = obj6;
                                        i13 = i12;
                                        break;
                                    } else {
                                        i41 = AbstractC2405y4.a(bArr3, i47, c2396x43);
                                        int i59 = c2396x43.f24687a;
                                        InterfaceC2272j5 G10 = k52.G(i35);
                                        if ((i51 & Integer.MIN_VALUE) == 0 || G10 == null || G10.b(i59)) {
                                            i44 |= i54;
                                            unsafe8.putInt(obj6, j11, i59);
                                        } else {
                                            y(obj).j(i34, Long.valueOf(i59));
                                        }
                                        i36 = i11;
                                        i43 = i35;
                                        unsafe9 = unsafe8;
                                        i45 = i34;
                                        i42 = i49;
                                        i40 = i20;
                                        i39 = 0;
                                        i38 = 3;
                                        i37 = i12;
                                        break;
                                    }
                                case HVError.SSL_CONNECT_ERROR /* 15 */:
                                    i34 = i52;
                                    unsafe8 = unsafe9;
                                    i20 = -1;
                                    i35 = i18;
                                    if (i50 != 0) {
                                        i19 = i47;
                                        unsafe2 = unsafe8;
                                        c2396x42 = c2396x43;
                                        i16 = i34;
                                        bArr2 = bArr3;
                                        i21 = i35;
                                        obj2 = obj6;
                                        i13 = i12;
                                        break;
                                    } else {
                                        i44 |= i54;
                                        i41 = AbstractC2405y4.a(bArr3, i47, c2396x43);
                                        unsafe8.putInt(obj6, j11, L4.a(c2396x43.f24687a));
                                        i36 = i11;
                                        i43 = i35;
                                        unsafe9 = unsafe8;
                                        i45 = i34;
                                        i42 = i49;
                                        i40 = i20;
                                        i39 = 0;
                                        i38 = 3;
                                        i37 = i12;
                                        break;
                                    }
                                case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                                    i34 = i52;
                                    unsafe8 = unsafe9;
                                    i20 = -1;
                                    i35 = i18;
                                    if (i50 != 0) {
                                        i19 = i47;
                                        unsafe2 = unsafe8;
                                        c2396x42 = c2396x43;
                                        i16 = i34;
                                        bArr2 = bArr3;
                                        i21 = i35;
                                        obj2 = obj6;
                                        i13 = i12;
                                        break;
                                    } else {
                                        i44 |= i54;
                                        c11 = AbstractC2405y4.c(bArr3, i47, c2396x43);
                                        unsafe8.putLong(obj, j11, L4.b(c2396x43.f24688b));
                                        i43 = i35;
                                        i41 = c11;
                                        unsafe9 = unsafe8;
                                        i45 = i34;
                                        i42 = i49;
                                        i40 = i20;
                                        i39 = 0;
                                        i38 = 3;
                                        i36 = i11;
                                        i37 = i12;
                                        break;
                                    }
                                default:
                                    if (i50 != 3) {
                                        i34 = i52;
                                        unsafe8 = unsafe9;
                                        i20 = -1;
                                        i35 = i18;
                                        i19 = i47;
                                        unsafe2 = unsafe8;
                                        c2396x42 = c2396x43;
                                        i16 = i34;
                                        bArr2 = bArr3;
                                        i21 = i35;
                                        obj2 = obj6;
                                        i13 = i12;
                                        break;
                                    } else {
                                        i44 |= i54;
                                        Object H11 = k52.H(obj6, i18);
                                        i34 = i52;
                                        int i60 = i18;
                                        i20 = -1;
                                        i41 = AbstractC2405y4.k(H11, k52.E(i18), bArr, i47, i11, (i49 << 3) | 4, c2396x4);
                                        k52.I(obj6, i60, H11);
                                        i36 = i11;
                                        unsafe9 = unsafe9;
                                        i43 = i60;
                                        i45 = i34;
                                        i42 = i49;
                                        i40 = i20;
                                        i39 = 0;
                                        i38 = 3;
                                        i37 = i12;
                                        break;
                                    }
                            }
                        } else {
                            i20 = -1;
                            Unsafe unsafe10 = unsafe9;
                            int i61 = i44;
                            int i62 = i18;
                            if (O10 != 27) {
                                i22 = i52;
                                if (O10 > 49) {
                                    i23 = i47;
                                    unsafe4 = unsafe10;
                                    c2396x42 = c2396x43;
                                    bArr2 = bArr;
                                    i21 = i62;
                                    i24 = i49;
                                    if (O10 != 50) {
                                        long j12 = iArr[i21 + 2] & 1048575;
                                        switch (O10) {
                                            case 51:
                                                i16 = i22;
                                                i25 = i21;
                                                i49 = i24;
                                                unsafe2 = unsafe4;
                                                obj2 = obj;
                                                if (i50 == 1) {
                                                    i41 = i23 + 8;
                                                    unsafe2.putObject(obj2, j11, Double.valueOf(Double.longBitsToDouble(AbstractC2405y4.e(bArr2, i23))));
                                                    unsafe2.putInt(obj2, j12, i49);
                                                    if (i41 == i23) {
                                                        i13 = i12;
                                                        i19 = i41;
                                                        i21 = i25;
                                                        i44 = i61;
                                                        break;
                                                    } else {
                                                        k52 = this;
                                                        obj6 = obj2;
                                                        i45 = i16;
                                                        bArr3 = bArr2;
                                                        i42 = i49;
                                                        i43 = i25;
                                                        i39 = 0;
                                                        i38 = 3;
                                                        i44 = i61;
                                                        i37 = i12;
                                                        unsafe9 = unsafe2;
                                                        c2396x43 = c2396x42;
                                                        i40 = -1;
                                                        i36 = i11;
                                                        break;
                                                    }
                                                }
                                                i41 = i23;
                                                if (i41 == i23) {
                                                }
                                            case 52:
                                                i16 = i22;
                                                i25 = i21;
                                                i49 = i24;
                                                unsafe2 = unsafe4;
                                                obj2 = obj;
                                                if (i50 == 5) {
                                                    i41 = i23 + 4;
                                                    unsafe2.putObject(obj2, j11, Float.valueOf(Float.intBitsToFloat(AbstractC2405y4.d(bArr2, i23))));
                                                    unsafe2.putInt(obj2, j12, i49);
                                                    if (i41 == i23) {
                                                    }
                                                }
                                                i41 = i23;
                                                if (i41 == i23) {
                                                }
                                                break;
                                            case 53:
                                            case 54:
                                                i16 = i22;
                                                i25 = i21;
                                                i49 = i24;
                                                unsafe2 = unsafe4;
                                                obj2 = obj;
                                                if (i50 == 0) {
                                                    c10 = AbstractC2405y4.c(bArr2, i23, c2396x42);
                                                    unsafe2.putObject(obj2, j11, Long.valueOf(c2396x42.f24688b));
                                                    unsafe2.putInt(obj2, j12, i49);
                                                    i41 = c10;
                                                    if (i41 == i23) {
                                                    }
                                                }
                                                i41 = i23;
                                                if (i41 == i23) {
                                                }
                                                break;
                                            case 55:
                                            case 62:
                                                i16 = i22;
                                                i25 = i21;
                                                i49 = i24;
                                                unsafe2 = unsafe4;
                                                obj2 = obj;
                                                if (i50 == 0) {
                                                    i41 = AbstractC2405y4.a(bArr2, i23, c2396x42);
                                                    unsafe2.putObject(obj2, j11, Integer.valueOf(c2396x42.f24687a));
                                                    unsafe2.putInt(obj2, j12, i49);
                                                    if (i41 == i23) {
                                                    }
                                                }
                                                i41 = i23;
                                                if (i41 == i23) {
                                                }
                                                break;
                                            case 56:
                                            case 65:
                                                i16 = i22;
                                                i25 = i21;
                                                i49 = i24;
                                                unsafe2 = unsafe4;
                                                obj2 = obj;
                                                if (i50 == 1) {
                                                    i41 = i23 + 8;
                                                    unsafe2.putObject(obj2, j11, Long.valueOf(AbstractC2405y4.e(bArr2, i23)));
                                                    unsafe2.putInt(obj2, j12, i49);
                                                    if (i41 == i23) {
                                                    }
                                                }
                                                i41 = i23;
                                                if (i41 == i23) {
                                                }
                                                break;
                                            case 57:
                                            case 64:
                                                i16 = i22;
                                                i25 = i21;
                                                i49 = i24;
                                                unsafe2 = unsafe4;
                                                obj2 = obj;
                                                if (i50 == 5) {
                                                    i41 = i23 + 4;
                                                    unsafe2.putObject(obj2, j11, Integer.valueOf(AbstractC2405y4.d(bArr2, i23)));
                                                    unsafe2.putInt(obj2, j12, i49);
                                                    if (i41 == i23) {
                                                    }
                                                }
                                                i41 = i23;
                                                if (i41 == i23) {
                                                }
                                                break;
                                            case 58:
                                                i16 = i22;
                                                i25 = i21;
                                                i49 = i24;
                                                unsafe2 = unsafe4;
                                                obj2 = obj;
                                                if (i50 == 0) {
                                                    c10 = AbstractC2405y4.c(bArr2, i23, c2396x42);
                                                    unsafe2.putObject(obj2, j11, Boolean.valueOf(c2396x42.f24688b != 0));
                                                    unsafe2.putInt(obj2, j12, i49);
                                                    i41 = c10;
                                                    if (i41 == i23) {
                                                    }
                                                }
                                                i41 = i23;
                                                if (i41 == i23) {
                                                }
                                                break;
                                            case 59:
                                                i16 = i22;
                                                i25 = i21;
                                                i49 = i24;
                                                unsafe2 = unsafe4;
                                                obj2 = obj;
                                                if (i50 == 2) {
                                                    int a10 = AbstractC2405y4.a(bArr2, i23, c2396x42);
                                                    int i63 = c2396x42.f24687a;
                                                    if (i63 == 0) {
                                                        unsafe2.putObject(obj2, j11, BuildConfig.FLAVOR);
                                                    } else {
                                                        int i64 = a10 + i63;
                                                        if ((i51 & 536870912) != 0 && !AbstractC2309n6.a(bArr2, a10, i64)) {
                                                            throw new C2326p5("Protocol message had invalid UTF-8.");
                                                        }
                                                        unsafe2.putObject(obj2, j11, new String(bArr2, a10, i63, AbstractC2308n5.f24581a));
                                                        a10 = i64;
                                                    }
                                                    unsafe2.putInt(obj2, j12, i49);
                                                    i41 = a10;
                                                    if (i41 == i23) {
                                                    }
                                                }
                                                i41 = i23;
                                                if (i41 == i23) {
                                                }
                                                break;
                                            case HVError.DETECTOR_NOT_AVAILABLE_ERROR /* 60 */:
                                                i16 = i22;
                                                i49 = i24;
                                                unsafe5 = unsafe4;
                                                obj2 = obj;
                                                if (i50 == 2) {
                                                    Object J10 = J(obj2, i49, i21);
                                                    i41 = AbstractC2405y4.j(J10, E(i21), bArr, i23, i11, c2396x4);
                                                    K(obj2, i49, i21, J10);
                                                    unsafe2 = unsafe5;
                                                    i25 = i21;
                                                    if (i41 == i23) {
                                                    }
                                                }
                                                unsafe2 = unsafe5;
                                                i25 = i21;
                                                i41 = i23;
                                                if (i41 == i23) {
                                                }
                                                break;
                                            case 61:
                                                i16 = i22;
                                                i49 = i24;
                                                unsafe5 = unsafe4;
                                                obj2 = obj;
                                                if (i50 == 2) {
                                                    int g11 = AbstractC2405y4.g(bArr2, i23, c2396x42);
                                                    unsafe5.putObject(obj2, j11, c2396x42.f24689c);
                                                    unsafe5.putInt(obj2, j12, i49);
                                                    i41 = g11;
                                                    unsafe2 = unsafe5;
                                                    i25 = i21;
                                                    if (i41 == i23) {
                                                    }
                                                }
                                                unsafe2 = unsafe5;
                                                i25 = i21;
                                                i41 = i23;
                                                if (i41 == i23) {
                                                }
                                                break;
                                            case 63:
                                                i16 = i22;
                                                i49 = i24;
                                                unsafe5 = unsafe4;
                                                obj2 = obj;
                                                if (i50 == 0) {
                                                    i41 = AbstractC2405y4.a(bArr2, i23, c2396x42);
                                                    int i65 = c2396x42.f24687a;
                                                    InterfaceC2272j5 G11 = G(i21);
                                                    if (G11 == null || G11.b(i65)) {
                                                        unsafe5.putObject(obj2, j11, Integer.valueOf(i65));
                                                        unsafe5.putInt(obj2, j12, i49);
                                                    } else {
                                                        y(obj).j(i16, Long.valueOf(i65));
                                                    }
                                                    unsafe2 = unsafe5;
                                                    i25 = i21;
                                                    if (i41 == i23) {
                                                    }
                                                }
                                                unsafe2 = unsafe5;
                                                i25 = i21;
                                                i41 = i23;
                                                if (i41 == i23) {
                                                }
                                                break;
                                            case 66:
                                                i16 = i22;
                                                i49 = i24;
                                                unsafe5 = unsafe4;
                                                obj2 = obj;
                                                if (i50 == 0) {
                                                    i41 = AbstractC2405y4.a(bArr2, i23, c2396x42);
                                                    unsafe5.putObject(obj2, j11, Integer.valueOf(L4.a(c2396x42.f24687a)));
                                                    unsafe5.putInt(obj2, j12, i49);
                                                    unsafe2 = unsafe5;
                                                    i25 = i21;
                                                    if (i41 == i23) {
                                                    }
                                                }
                                                unsafe2 = unsafe5;
                                                i25 = i21;
                                                i41 = i23;
                                                if (i41 == i23) {
                                                }
                                                break;
                                            case 67:
                                                i16 = i22;
                                                i49 = i24;
                                                obj2 = obj;
                                                if (i50 == 0) {
                                                    i41 = AbstractC2405y4.c(bArr2, i23, c2396x42);
                                                    unsafe5 = unsafe4;
                                                    unsafe5.putObject(obj2, j11, Long.valueOf(L4.b(c2396x42.f24688b)));
                                                    unsafe5.putInt(obj2, j12, i49);
                                                    unsafe2 = unsafe5;
                                                    i25 = i21;
                                                    if (i41 == i23) {
                                                    }
                                                }
                                                i25 = i21;
                                                unsafe2 = unsafe4;
                                                i41 = i23;
                                                if (i41 == i23) {
                                                }
                                                break;
                                            case 68:
                                                if (i50 == 3) {
                                                    Object J11 = J(obj, i24, i21);
                                                    i16 = i22;
                                                    i41 = AbstractC2405y4.k(J11, E(i21), bArr, i23, i11, (i22 & (-8)) | 4, c2396x4);
                                                    K(obj, i24, i21, J11);
                                                    obj2 = obj;
                                                    i49 = i24;
                                                    i25 = i21;
                                                    unsafe2 = unsafe4;
                                                    if (i41 == i23) {
                                                    }
                                                } else {
                                                    i16 = i22;
                                                    obj2 = obj;
                                                    i49 = i24;
                                                    i25 = i21;
                                                    unsafe2 = unsafe4;
                                                    i41 = i23;
                                                    if (i41 == i23) {
                                                    }
                                                }
                                                break;
                                            default:
                                                i16 = i22;
                                                i25 = i21;
                                                i49 = i24;
                                                unsafe2 = unsafe4;
                                                obj2 = obj;
                                                i41 = i23;
                                                if (i41 == i23) {
                                                }
                                                break;
                                        }
                                    } else if (i50 == 2) {
                                        Object F10 = k52.F(i21);
                                        Unsafe unsafe11 = unsafe4;
                                        Object object = unsafe11.getObject(obj6, j11);
                                        if (!((B5) object).i()) {
                                            B5 d10 = B5.a().d();
                                            C5.a(d10, object);
                                            unsafe11.putObject(obj6, j11, d10);
                                            object = d10;
                                        }
                                        C2415z5 e10 = ((A5) F10).e();
                                        B5 b53 = (B5) object;
                                        int a11 = AbstractC2405y4.a(bArr2, i23, c2396x42);
                                        int i66 = c2396x42.f24687a;
                                        if (i66 >= 0 && i66 <= i11 - a11) {
                                            int i67 = a11 + i66;
                                            Object obj7 = e10.f24716b;
                                            Object obj8 = e10.f24718d;
                                            Object obj9 = obj7;
                                            Object obj10 = obj8;
                                            while (a11 < i67) {
                                                Object obj11 = obj10;
                                                Object obj12 = obj9;
                                                int i68 = a11 + 1;
                                                byte b10 = bArr2[a11];
                                                if (b10 < 0) {
                                                    i68 = AbstractC2405y4.b(b10, bArr2, i68, c2396x42);
                                                    b10 = c2396x42.f24687a;
                                                }
                                                int i69 = b10 >>> 3;
                                                int i70 = i67;
                                                int i71 = b10 & 7;
                                                B5 b54 = b53;
                                                if (i69 == 1) {
                                                    unsafe6 = unsafe11;
                                                    obj3 = obj12;
                                                    i26 = i70;
                                                    b52 = b54;
                                                    obj4 = obj8;
                                                    EnumC2318o6 enumC2318o6 = e10.f24715a;
                                                    if (i71 == enumC2318o6.zzb()) {
                                                        a11 = w(bArr, i68, i11, enumC2318o6, null, c2396x4);
                                                        obj9 = c2396x42.f24689c;
                                                        b53 = b52;
                                                        i67 = i26;
                                                        obj10 = obj11;
                                                        obj8 = obj4;
                                                        unsafe11 = unsafe6;
                                                    }
                                                } else if (i69 != 2) {
                                                    unsafe6 = unsafe11;
                                                    obj10 = obj11;
                                                    obj3 = obj12;
                                                    i26 = i70;
                                                    b52 = b54;
                                                    obj4 = obj8;
                                                    a11 = AbstractC2405y4.p(b10, bArr2, i68, i11, c2396x42);
                                                    b53 = b52;
                                                    i67 = i26;
                                                    obj9 = obj3;
                                                    obj8 = obj4;
                                                    unsafe11 = unsafe6;
                                                } else {
                                                    EnumC2318o6 enumC2318o62 = e10.f24717c;
                                                    if (i71 == enumC2318o62.zzb()) {
                                                        unsafe6 = unsafe11;
                                                        obj3 = obj12;
                                                        obj4 = obj8;
                                                        i26 = i70;
                                                        b52 = b54;
                                                        a11 = w(bArr, i68, i11, enumC2318o62, obj8.getClass(), c2396x4);
                                                        obj10 = c2396x42.f24689c;
                                                        b53 = b52;
                                                        i67 = i26;
                                                        obj9 = obj3;
                                                        obj8 = obj4;
                                                        unsafe11 = unsafe6;
                                                    } else {
                                                        unsafe6 = unsafe11;
                                                        obj3 = obj12;
                                                        i26 = i70;
                                                        b52 = b54;
                                                        obj4 = obj8;
                                                    }
                                                }
                                                obj10 = obj11;
                                                a11 = AbstractC2405y4.p(b10, bArr2, i68, i11, c2396x42);
                                                b53 = b52;
                                                i67 = i26;
                                                obj9 = obj3;
                                                obj8 = obj4;
                                                unsafe11 = unsafe6;
                                            }
                                            int i72 = i67;
                                            B5 b55 = b53;
                                            unsafe4 = unsafe11;
                                            Object obj13 = obj9;
                                            if (a11 != i72) {
                                                throw new C2326p5(str);
                                            }
                                            b55.put(obj13, obj10);
                                            if (i72 != i23) {
                                                obj6 = obj;
                                                i44 = i61;
                                                i41 = i72;
                                                i45 = i22;
                                                i43 = i21;
                                                bArr3 = bArr2;
                                                i42 = i24;
                                                i40 = -1;
                                                unsafe9 = unsafe4;
                                                i39 = 0;
                                                i38 = 3;
                                                k52 = this;
                                                c2396x43 = c2396x42;
                                                i36 = i11;
                                            } else {
                                                i44 = i61;
                                                i13 = i12;
                                                i19 = i72;
                                                i16 = i22;
                                                i49 = i24;
                                                unsafe2 = unsafe4;
                                                obj2 = obj;
                                            }
                                        }
                                    } else {
                                        str2 = str;
                                    }
                                } else {
                                    long j13 = i51;
                                    InterfaceC2299m5 interfaceC2299m5 = (InterfaceC2299m5) unsafe10.getObject(obj6, j11);
                                    if (interfaceC2299m5.zza()) {
                                        j10 = j13;
                                    } else {
                                        int size = interfaceC2299m5.size();
                                        j10 = j13;
                                        interfaceC2299m5 = interfaceC2299m5.O1(size + size);
                                        unsafe10.putObject(obj6, j11, interfaceC2299m5);
                                    }
                                    InterfaceC2299m5 interfaceC2299m52 = interfaceC2299m5;
                                    switch (O10) {
                                        case 18:
                                        case HVError.FACE_CAPTURE_TIMEOUT /* 35 */:
                                            bArr2 = bArr;
                                            c2396x42 = c2396x4;
                                            i27 = i47;
                                            i28 = i62;
                                            unsafe7 = unsafe10;
                                            i29 = i49;
                                            i30 = i11;
                                            if (i50 != 2) {
                                                if (i50 == 1) {
                                                    int i73 = AbstractC2405y4.f24699b;
                                                    android.support.v4.media.session.b.a(interfaceC2299m52);
                                                    Double.longBitsToDouble(AbstractC2405y4.e(bArr2, i27));
                                                    throw null;
                                                }
                                                i41 = i27;
                                                i44 = i61;
                                                if (i41 != i27) {
                                                    i19 = i41;
                                                    i16 = i22;
                                                    i21 = i28;
                                                    i49 = i29;
                                                    unsafe2 = unsafe7;
                                                    obj2 = obj6;
                                                    i13 = i12;
                                                    break;
                                                } else {
                                                    bArr3 = bArr2;
                                                    i43 = i28;
                                                    i42 = i29;
                                                    i40 = -1;
                                                    i39 = 0;
                                                    i38 = 3;
                                                    i45 = i22;
                                                    c2396x43 = c2396x42;
                                                    i36 = i30;
                                                    unsafe9 = unsafe7;
                                                    break;
                                                }
                                            } else {
                                                int i74 = AbstractC2405y4.f24699b;
                                                android.support.v4.media.session.b.a(interfaceC2299m52);
                                                if (AbstractC2405y4.a(bArr2, i27, c2396x42) + c2396x42.f24687a > bArr2.length) {
                                                    throw new C2326p5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                throw null;
                                            }
                                        case 19:
                                        case HVError.HYPER_DOC_DETECT_ERROR /* 36 */:
                                            bArr2 = bArr;
                                            c2396x42 = c2396x4;
                                            i27 = i47;
                                            i28 = i62;
                                            unsafe7 = unsafe10;
                                            i29 = i49;
                                            i30 = i11;
                                            if (i50 == 2) {
                                                int i75 = AbstractC2405y4.f24699b;
                                                android.support.v4.media.session.b.a(interfaceC2299m52);
                                                if (AbstractC2405y4.a(bArr2, i27, c2396x42) + c2396x42.f24687a > bArr2.length) {
                                                    throw new C2326p5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                throw null;
                                            }
                                            if (i50 == 5) {
                                                int i76 = AbstractC2405y4.f24699b;
                                                android.support.v4.media.session.b.a(interfaceC2299m52);
                                                Float.intBitsToFloat(AbstractC2405y4.d(bArr2, i27));
                                                throw null;
                                            }
                                            i41 = i27;
                                            i44 = i61;
                                            if (i41 != i27) {
                                            }
                                            break;
                                        case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                                        case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                                        case HVError.INVALID_FILE_ERROR /* 37 */:
                                        case 38:
                                            bArr2 = bArr;
                                            c2396x42 = c2396x4;
                                            i27 = i47;
                                            i28 = i62;
                                            unsafe7 = unsafe10;
                                            i29 = i49;
                                            i30 = i11;
                                            if (i50 == 2) {
                                                int i77 = AbstractC2405y4.f24699b;
                                                C2379v5 c2379v5 = (C2379v5) interfaceC2299m52;
                                                i41 = AbstractC2405y4.a(bArr2, i27, c2396x42);
                                                int i78 = c2396x42.f24687a + i41;
                                                while (i41 < i78) {
                                                    i41 = AbstractC2405y4.c(bArr2, i41, c2396x42);
                                                    c2379v5.h(c2396x42.f24688b);
                                                }
                                                if (i41 != i78) {
                                                    throw new C2326p5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                            } else {
                                                if (i50 == 0) {
                                                    int i79 = AbstractC2405y4.f24699b;
                                                    C2379v5 c2379v52 = (C2379v5) interfaceC2299m52;
                                                    i41 = AbstractC2405y4.c(bArr2, i27, c2396x42);
                                                    c2379v52.h(c2396x42.f24688b);
                                                    while (i41 < i30) {
                                                        int a12 = AbstractC2405y4.a(bArr2, i41, c2396x42);
                                                        if (i22 == c2396x42.f24687a) {
                                                            i41 = AbstractC2405y4.c(bArr2, a12, c2396x42);
                                                            c2379v52.h(c2396x42.f24688b);
                                                        }
                                                    }
                                                }
                                                i41 = i27;
                                            }
                                            i44 = i61;
                                            if (i41 != i27) {
                                            }
                                            break;
                                        case HVError.FACE_DETECTION_ERROR /* 22 */:
                                        case 29:
                                        case 39:
                                        case HVError.ENCRYPTION_ERROR /* 43 */:
                                            bArr2 = bArr;
                                            c2396x42 = c2396x4;
                                            i27 = i47;
                                            i28 = i62;
                                            unsafe7 = unsafe10;
                                            i29 = i49;
                                            i30 = i11;
                                            if (i50 == 2) {
                                                i41 = AbstractC2405y4.m(bArr2, i27, interfaceC2299m52, c2396x42);
                                            } else {
                                                if (i50 == 0) {
                                                    i41 = AbstractC2405y4.l(i22, bArr, i27, i11, interfaceC2299m52, c2396x4);
                                                }
                                                i41 = i27;
                                            }
                                            i44 = i61;
                                            if (i41 != i27) {
                                            }
                                            break;
                                        case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                                        case 32:
                                        case RequestError.NETWORK_FAILURE /* 40 */:
                                        case 46:
                                            bArr2 = bArr;
                                            c2396x42 = c2396x4;
                                            i27 = i47;
                                            int i80 = i62;
                                            unsafe7 = unsafe10;
                                            i30 = i11;
                                            if (i50 == 2) {
                                                int i81 = AbstractC2405y4.f24699b;
                                                C2379v5 c2379v53 = (C2379v5) interfaceC2299m52;
                                                i41 = AbstractC2405y4.a(bArr2, i27, c2396x42);
                                                int i82 = c2396x42.f24687a;
                                                int i83 = i41 + i82;
                                                if (i83 > bArr2.length) {
                                                    throw new C2326p5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                c2379v53.j(c2379v53.size() + (i82 / 8));
                                                while (i41 < i83) {
                                                    c2379v53.h(AbstractC2405y4.e(bArr2, i41));
                                                    i41 += 8;
                                                    i80 = i80;
                                                    i49 = i49;
                                                }
                                                i28 = i80;
                                                i29 = i49;
                                                if (i41 != i83) {
                                                    throw new C2326p5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                            } else {
                                                i28 = i80;
                                                i29 = i49;
                                                if (i50 == 1) {
                                                    int i84 = i27 + 8;
                                                    int i85 = AbstractC2405y4.f24699b;
                                                    C2379v5 c2379v54 = (C2379v5) interfaceC2299m52;
                                                    c2379v54.h(AbstractC2405y4.e(bArr2, i27));
                                                    while (i84 < i30) {
                                                        int a13 = AbstractC2405y4.a(bArr2, i84, c2396x42);
                                                        if (i22 == c2396x42.f24687a) {
                                                            c2379v54.h(AbstractC2405y4.e(bArr2, a13));
                                                            i84 = a13 + 8;
                                                        } else {
                                                            i41 = i84;
                                                        }
                                                    }
                                                    i41 = i84;
                                                }
                                                i41 = i27;
                                            }
                                            i44 = i61;
                                            if (i41 != i27) {
                                            }
                                            break;
                                        case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                                        case HVError.INSTRUCTION_ERROR /* 31 */:
                                        case RequestError.NO_DEV_KEY /* 41 */:
                                        case HVError.PERMISSION_REVOKED_ERROR /* 45 */:
                                            bArr2 = bArr;
                                            c2396x42 = c2396x4;
                                            i27 = i47;
                                            i31 = i62;
                                            unsafe7 = unsafe10;
                                            i30 = i11;
                                            if (i50 == 2) {
                                                int i86 = AbstractC2405y4.f24699b;
                                                C2254h5 c2254h5 = (C2254h5) interfaceC2299m52;
                                                i41 = AbstractC2405y4.a(bArr2, i27, c2396x42);
                                                int i87 = c2396x42.f24687a;
                                                int i88 = i41 + i87;
                                                if (i88 > bArr2.length) {
                                                    throw new C2326p5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                c2254h5.k(c2254h5.size() + (i87 / 4));
                                                while (i41 < i88) {
                                                    c2254h5.j(AbstractC2405y4.d(bArr2, i41));
                                                    i41 += 4;
                                                }
                                                if (i41 != i88) {
                                                    throw new C2326p5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                            } else {
                                                if (i50 == 5) {
                                                    int i89 = i27 + 4;
                                                    int i90 = AbstractC2405y4.f24699b;
                                                    C2254h5 c2254h52 = (C2254h5) interfaceC2299m52;
                                                    c2254h52.j(AbstractC2405y4.d(bArr2, i27));
                                                    while (i89 < i30) {
                                                        int a14 = AbstractC2405y4.a(bArr2, i89, c2396x42);
                                                        if (i22 == c2396x42.f24687a) {
                                                            c2254h52.j(AbstractC2405y4.d(bArr2, a14));
                                                            i89 = a14 + 4;
                                                        } else {
                                                            i41 = i89;
                                                        }
                                                    }
                                                    i41 = i89;
                                                }
                                                i28 = i31;
                                                i29 = i49;
                                                i41 = i27;
                                                i44 = i61;
                                                if (i41 != i27) {
                                                }
                                            }
                                            i28 = i31;
                                            i29 = i49;
                                            i44 = i61;
                                            if (i41 != i27) {
                                            }
                                            break;
                                        case HVError.LOW_STORAGE_ERROR /* 25 */:
                                        case HVError.CONSENT_DENIED /* 42 */:
                                            bArr2 = bArr;
                                            c2396x42 = c2396x4;
                                            i27 = i47;
                                            i31 = i62;
                                            unsafe7 = unsafe10;
                                            i30 = i11;
                                            if (i50 == 2) {
                                                int i91 = AbstractC2405y4.f24699b;
                                                android.support.v4.media.session.b.a(interfaceC2299m52);
                                                i41 = AbstractC2405y4.a(bArr2, i27, c2396x42);
                                                int i92 = c2396x42.f24687a + i41;
                                                if (i41 < i92) {
                                                    AbstractC2405y4.c(bArr2, i41, c2396x42);
                                                    throw null;
                                                }
                                                if (i41 != i92) {
                                                    throw new C2326p5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                i28 = i31;
                                                i29 = i49;
                                                i44 = i61;
                                                if (i41 != i27) {
                                                }
                                            } else {
                                                if (i50 == 0) {
                                                    int i93 = AbstractC2405y4.f24699b;
                                                    android.support.v4.media.session.b.a(interfaceC2299m52);
                                                    AbstractC2405y4.c(bArr2, i27, c2396x42);
                                                    long j14 = c2396x42.f24688b;
                                                    throw null;
                                                }
                                                i28 = i31;
                                                i29 = i49;
                                                i41 = i27;
                                                i44 = i61;
                                                if (i41 != i27) {
                                                }
                                            }
                                            break;
                                        case 26:
                                            bArr2 = bArr;
                                            c2396x42 = c2396x4;
                                            i27 = i47;
                                            i31 = i62;
                                            unsafe7 = unsafe10;
                                            long j15 = j10;
                                            i30 = i11;
                                            if (i50 == 2) {
                                                if ((536870912 & j15) == 0) {
                                                    i41 = AbstractC2405y4.a(bArr2, i27, c2396x42);
                                                    int i94 = c2396x42.f24687a;
                                                    if (i94 < 0) {
                                                        throw new C2326p5("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i94 == 0) {
                                                        obj5 = BuildConfig.FLAVOR;
                                                        interfaceC2299m52.add(obj5);
                                                    } else {
                                                        obj5 = BuildConfig.FLAVOR;
                                                        interfaceC2299m52.add(new String(bArr2, i41, i94, AbstractC2308n5.f24581a));
                                                        i41 += i94;
                                                    }
                                                    while (i41 < i30) {
                                                        int a15 = AbstractC2405y4.a(bArr2, i41, c2396x42);
                                                        if (i22 == c2396x42.f24687a) {
                                                            i41 = AbstractC2405y4.a(bArr2, a15, c2396x42);
                                                            int i95 = c2396x42.f24687a;
                                                            if (i95 < 0) {
                                                                throw new C2326p5("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                            }
                                                            if (i95 == 0) {
                                                                interfaceC2299m52.add(obj5);
                                                            } else {
                                                                interfaceC2299m52.add(new String(bArr2, i41, i95, AbstractC2308n5.f24581a));
                                                                i41 += i95;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    i41 = AbstractC2405y4.a(bArr2, i27, c2396x42);
                                                    int i96 = c2396x42.f24687a;
                                                    if (i96 < 0) {
                                                        throw new C2326p5("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i96 == 0) {
                                                        interfaceC2299m52.add(BuildConfig.FLAVOR);
                                                    } else {
                                                        int i97 = i41 + i96;
                                                        if (!AbstractC2309n6.a(bArr2, i41, i97)) {
                                                            throw new C2326p5("Protocol message had invalid UTF-8.");
                                                        }
                                                        interfaceC2299m52.add(new String(bArr2, i41, i96, AbstractC2308n5.f24581a));
                                                        i41 = i97;
                                                    }
                                                    while (i41 < i30) {
                                                        int a16 = AbstractC2405y4.a(bArr2, i41, c2396x42);
                                                        if (i22 == c2396x42.f24687a) {
                                                            i41 = AbstractC2405y4.a(bArr2, a16, c2396x42);
                                                            int i98 = c2396x42.f24687a;
                                                            if (i98 < 0) {
                                                                throw new C2326p5("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                            }
                                                            if (i98 == 0) {
                                                                interfaceC2299m52.add(BuildConfig.FLAVOR);
                                                            } else {
                                                                int i99 = i41 + i98;
                                                                if (!AbstractC2309n6.a(bArr2, i41, i99)) {
                                                                    throw new C2326p5("Protocol message had invalid UTF-8.");
                                                                }
                                                                interfaceC2299m52.add(new String(bArr2, i41, i98, AbstractC2308n5.f24581a));
                                                                i41 = i99;
                                                            }
                                                        }
                                                    }
                                                }
                                                i28 = i31;
                                                i29 = i49;
                                                i44 = i61;
                                                if (i41 != i27) {
                                                }
                                            }
                                            i28 = i31;
                                            i29 = i49;
                                            i41 = i27;
                                            i44 = i61;
                                            if (i41 != i27) {
                                            }
                                            break;
                                        case 27:
                                            bArr2 = bArr;
                                            c2396x42 = c2396x4;
                                            i27 = i47;
                                            i28 = i62;
                                            unsafe7 = unsafe10;
                                            i30 = i11;
                                            if (i50 == 2) {
                                                k52 = this;
                                                i41 = AbstractC2405y4.n(k52.E(i28), i22, bArr, i27, i11, interfaceC2299m52, c2396x4);
                                                i22 = i22;
                                                i29 = i49;
                                                i44 = i61;
                                                if (i41 != i27) {
                                                }
                                            }
                                            k52 = this;
                                            i29 = i49;
                                            i41 = i27;
                                            i44 = i61;
                                            if (i41 != i27) {
                                            }
                                            break;
                                        case 28:
                                            bArr2 = bArr;
                                            c2396x42 = c2396x4;
                                            i27 = i47;
                                            i28 = i62;
                                            unsafe7 = unsafe10;
                                            i30 = i11;
                                            if (i50 == 2) {
                                                int a17 = AbstractC2405y4.a(bArr2, i27, c2396x42);
                                                int i100 = c2396x42.f24687a;
                                                if (i100 < 0) {
                                                    throw new C2326p5("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                }
                                                if (i100 > bArr2.length - a17) {
                                                    throw new C2326p5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                if (i100 == 0) {
                                                    interfaceC2299m52.add(J4.f24246b);
                                                } else {
                                                    interfaceC2299m52.add(J4.r(bArr2, a17, i100));
                                                    a17 += i100;
                                                }
                                                while (a17 < i30) {
                                                    int a18 = AbstractC2405y4.a(bArr2, a17, c2396x42);
                                                    if (i22 == c2396x42.f24687a) {
                                                        a17 = AbstractC2405y4.a(bArr2, a18, c2396x42);
                                                        int i101 = c2396x42.f24687a;
                                                        if (i101 < 0) {
                                                            throw new C2326p5("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        }
                                                        if (i101 > bArr2.length - a17) {
                                                            throw new C2326p5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                        }
                                                        if (i101 == 0) {
                                                            interfaceC2299m52.add(J4.f24246b);
                                                        } else {
                                                            interfaceC2299m52.add(J4.r(bArr2, a17, i101));
                                                            a17 += i101;
                                                        }
                                                    } else {
                                                        i41 = a17;
                                                        i29 = i49;
                                                        k52 = this;
                                                        i44 = i61;
                                                        if (i41 != i27) {
                                                        }
                                                    }
                                                }
                                                i41 = a17;
                                                i29 = i49;
                                                k52 = this;
                                                i44 = i61;
                                                if (i41 != i27) {
                                                }
                                            }
                                            k52 = this;
                                            i29 = i49;
                                            i41 = i27;
                                            i44 = i61;
                                            if (i41 != i27) {
                                            }
                                            break;
                                        case 30:
                                        case HVError.SDK_CLOSE_ERROR /* 44 */:
                                            bArr2 = bArr;
                                            c2396x42 = c2396x4;
                                            i27 = i47;
                                            i31 = i62;
                                            unsafe7 = unsafe10;
                                            i30 = i11;
                                            if (i50 == 2) {
                                                l10 = AbstractC2405y4.m(bArr2, i27, interfaceC2299m52, c2396x42);
                                            } else if (i50 == 0) {
                                                l10 = AbstractC2405y4.l(i22, bArr, i27, i11, interfaceC2299m52, c2396x4);
                                            } else {
                                                k52 = this;
                                                i28 = i31;
                                                i29 = i49;
                                                i41 = i27;
                                                i44 = i61;
                                                if (i41 != i27) {
                                                }
                                            }
                                            InterfaceC2272j5 G12 = k52.G(i31);
                                            AbstractC2219d6 abstractC2219d6 = k52.f24266j;
                                            int i102 = U5.f24390b;
                                            if (G12 == null) {
                                                i32 = l10;
                                                i28 = i31;
                                            } else if (interfaceC2299m52 != null) {
                                                int size2 = interfaceC2299m52.size();
                                                i32 = l10;
                                                Object obj14 = null;
                                                int i103 = 0;
                                                int i104 = 0;
                                                while (i104 < size2) {
                                                    Integer num = (Integer) interfaceC2299m52.get(i104);
                                                    int i105 = i31;
                                                    int intValue = num.intValue();
                                                    if (G12.b(intValue)) {
                                                        if (i104 != i103) {
                                                            interfaceC2299m52.set(i103, num);
                                                        }
                                                        i33 = 1;
                                                        i103++;
                                                    } else {
                                                        i33 = 1;
                                                        obj14 = U5.e(obj6, i49, intValue, obj14, abstractC2219d6);
                                                    }
                                                    i104 += i33;
                                                    i31 = i105;
                                                }
                                                i28 = i31;
                                                if (i103 != size2) {
                                                    interfaceC2299m52.subList(i103, size2).clear();
                                                }
                                            } else {
                                                i32 = l10;
                                                i28 = i31;
                                                Iterator it = interfaceC2299m52.iterator();
                                                Object obj15 = null;
                                                while (it.hasNext()) {
                                                    int intValue2 = ((Integer) it.next()).intValue();
                                                    if (!G12.b(intValue2)) {
                                                        obj15 = U5.e(obj6, i49, intValue2, obj15, abstractC2219d6);
                                                        it.remove();
                                                    }
                                                }
                                            }
                                            k52 = this;
                                            i29 = i49;
                                            i41 = i32;
                                            i44 = i61;
                                            if (i41 != i27) {
                                            }
                                            break;
                                        case HVError.GPS_ACCESS_DENIED /* 33 */:
                                        case 47:
                                            bArr2 = bArr;
                                            c2396x42 = c2396x4;
                                            i27 = i47;
                                            i31 = i62;
                                            unsafe7 = unsafe10;
                                            i30 = i11;
                                            if (i50 == 2) {
                                                int i106 = AbstractC2405y4.f24699b;
                                                C2254h5 c2254h53 = (C2254h5) interfaceC2299m52;
                                                i41 = AbstractC2405y4.a(bArr2, i27, c2396x42);
                                                int i107 = c2396x42.f24687a + i41;
                                                while (i41 < i107) {
                                                    i41 = AbstractC2405y4.a(bArr2, i41, c2396x42);
                                                    c2254h53.j(L4.a(c2396x42.f24687a));
                                                }
                                                if (i41 != i107) {
                                                    throw new C2326p5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                            } else {
                                                if (i50 == 0) {
                                                    int i108 = AbstractC2405y4.f24699b;
                                                    C2254h5 c2254h54 = (C2254h5) interfaceC2299m52;
                                                    i41 = AbstractC2405y4.a(bArr2, i27, c2396x42);
                                                    c2254h54.j(L4.a(c2396x42.f24687a));
                                                    while (i41 < i30) {
                                                        int a19 = AbstractC2405y4.a(bArr2, i41, c2396x42);
                                                        if (i22 == c2396x42.f24687a) {
                                                            i41 = AbstractC2405y4.a(bArr2, a19, c2396x42);
                                                            c2254h54.j(L4.a(c2396x42.f24687a));
                                                        }
                                                    }
                                                }
                                                i28 = i31;
                                                i29 = i49;
                                                i41 = i27;
                                                i44 = i61;
                                                if (i41 != i27) {
                                                }
                                            }
                                            i28 = i31;
                                            i29 = i49;
                                            i44 = i61;
                                            if (i41 != i27) {
                                            }
                                            break;
                                        case 34:
                                        case 48:
                                            bArr2 = bArr;
                                            c2396x42 = c2396x4;
                                            i27 = i47;
                                            i31 = i62;
                                            unsafe7 = unsafe10;
                                            i30 = i11;
                                            if (i50 == 2) {
                                                int i109 = AbstractC2405y4.f24699b;
                                                C2379v5 c2379v55 = (C2379v5) interfaceC2299m52;
                                                i41 = AbstractC2405y4.a(bArr2, i27, c2396x42);
                                                int i110 = c2396x42.f24687a + i41;
                                                while (i41 < i110) {
                                                    i41 = AbstractC2405y4.c(bArr2, i41, c2396x42);
                                                    c2379v55.h(L4.b(c2396x42.f24688b));
                                                }
                                                if (i41 != i110) {
                                                    throw new C2326p5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                            } else {
                                                if (i50 == 0) {
                                                    int i111 = AbstractC2405y4.f24699b;
                                                    C2379v5 c2379v56 = (C2379v5) interfaceC2299m52;
                                                    i41 = AbstractC2405y4.c(bArr2, i27, c2396x42);
                                                    c2379v56.h(L4.b(c2396x42.f24688b));
                                                    while (i41 < i30) {
                                                        int a20 = AbstractC2405y4.a(bArr2, i41, c2396x42);
                                                        if (i22 == c2396x42.f24687a) {
                                                            i41 = AbstractC2405y4.c(bArr2, a20, c2396x42);
                                                            c2379v56.h(L4.b(c2396x42.f24688b));
                                                        }
                                                    }
                                                }
                                                i28 = i31;
                                                i29 = i49;
                                                i41 = i27;
                                                i44 = i61;
                                                if (i41 != i27) {
                                                }
                                            }
                                            i28 = i31;
                                            i29 = i49;
                                            i44 = i61;
                                            if (i41 != i27) {
                                            }
                                            break;
                                        default:
                                            if (i50 == 3) {
                                                int i112 = (i22 & (-8)) | 4;
                                                S5 E10 = k52.E(i62);
                                                i27 = i47;
                                                i31 = i62;
                                                C2396x4 c2396x44 = c2396x4;
                                                i41 = AbstractC2405y4.i(E10, bArr, i47, i11, i112, c2396x44);
                                                interfaceC2299m52.add(c2396x44.f24689c);
                                                int i113 = i11;
                                                while (true) {
                                                    if (i41 < i113) {
                                                        int a21 = AbstractC2405y4.a(bArr, i41, c2396x44);
                                                        if (i22 == c2396x44.f24687a) {
                                                            Unsafe unsafe12 = unsafe10;
                                                            int i114 = i113;
                                                            int i115 = i112;
                                                            int i116 = i112;
                                                            C2396x4 c2396x45 = c2396x44;
                                                            i41 = AbstractC2405y4.i(E10, bArr, a21, i11, i115, c2396x4);
                                                            interfaceC2299m52.add(c2396x45.f24689c);
                                                            c2396x44 = c2396x45;
                                                            i113 = i114;
                                                            E10 = E10;
                                                            i112 = i116;
                                                            unsafe10 = unsafe12;
                                                        } else {
                                                            bArr2 = bArr;
                                                        }
                                                    } else {
                                                        bArr2 = bArr;
                                                    }
                                                }
                                                c2396x42 = c2396x44;
                                                unsafe7 = unsafe10;
                                                i30 = i113;
                                                i28 = i31;
                                                i29 = i49;
                                                i44 = i61;
                                                if (i41 != i27) {
                                                }
                                            } else {
                                                bArr2 = bArr;
                                                c2396x42 = c2396x4;
                                                i27 = i47;
                                                unsafe7 = unsafe10;
                                                i30 = i11;
                                                i28 = i62;
                                                i29 = i49;
                                                i41 = i27;
                                                i44 = i61;
                                                if (i41 != i27) {
                                                }
                                            }
                                            break;
                                    }
                                }
                                i37 = i12;
                            } else if (i50 == 2) {
                                InterfaceC2299m5 interfaceC2299m53 = (InterfaceC2299m5) unsafe10.getObject(obj6, j11);
                                if (!interfaceC2299m53.zza()) {
                                    int size3 = interfaceC2299m53.size();
                                    interfaceC2299m53 = interfaceC2299m53.O1(size3 == 0 ? 10 : size3 + size3);
                                    unsafe10.putObject(obj6, j11, interfaceC2299m53);
                                }
                                i41 = AbstractC2405y4.n(k52.E(i62), i52, bArr, i47, i11, interfaceC2299m53, c2396x4);
                                i44 = i61;
                                i43 = i62;
                                i45 = i52;
                                unsafe9 = unsafe10;
                                i42 = i49;
                                i40 = -1;
                                i39 = 0;
                                i38 = 3;
                                bArr3 = bArr;
                                i36 = i11;
                                i37 = i12;
                            } else {
                                i23 = i47;
                                i21 = i62;
                                unsafe4 = unsafe10;
                                c2396x42 = c2396x43;
                                i24 = i49;
                                str2 = str;
                                bArr2 = bArr;
                                i22 = i52;
                            }
                            i44 = i61;
                            i13 = i12;
                            str = str2;
                            i16 = i22;
                            i19 = i23;
                            i49 = i24;
                            unsafe2 = unsafe4;
                            obj2 = obj;
                        }
                    }
                    if (i16 == i13 || i13 == 0) {
                        k52 = this;
                        if (k52.f24262f) {
                            T4 t42 = c2396x42.f24690d;
                            T4 t43 = T4.f24381c;
                            int i117 = P5.f24329d;
                            if (t42 != T4.f24381c) {
                                H5 h52 = k52.f24261e;
                                int i118 = AbstractC2405y4.f24699b;
                                t42.b(h52, i49);
                                unsafe3 = unsafe2;
                                i41 = AbstractC2405y4.o(i16, bArr, i19, i11, y(obj), c2396x4);
                                i43 = i21;
                                i45 = i16;
                                bArr3 = bArr2;
                                i42 = i49;
                                i40 = i20;
                                i39 = 0;
                                i38 = 3;
                                i37 = i13;
                                obj6 = obj2;
                                c2396x43 = c2396x42;
                                unsafe9 = unsafe3;
                                i36 = i11;
                            }
                        }
                        unsafe3 = unsafe2;
                        i41 = AbstractC2405y4.o(i16, bArr, i19, i11, y(obj), c2396x4);
                        i43 = i21;
                        i45 = i16;
                        bArr3 = bArr2;
                        i42 = i49;
                        i40 = i20;
                        i39 = 0;
                        i38 = 3;
                        i37 = i13;
                        obj6 = obj2;
                        c2396x43 = c2396x42;
                        unsafe9 = unsafe3;
                        i36 = i11;
                    } else {
                        i17 = 1048575;
                        k52 = this;
                        i41 = i19;
                        unsafe = unsafe2;
                        i15 = i46;
                        i14 = i44;
                    }
                } else {
                    v10 = k52.v(i49, i39);
                }
                i18 = v10;
                if (i18 != i40) {
                }
                if (i16 == i13) {
                }
                k52 = this;
                if (k52.f24262f) {
                }
                unsafe3 = unsafe2;
                i41 = AbstractC2405y4.o(i16, bArr, i19, i11, y(obj), c2396x4);
                i43 = i21;
                i45 = i16;
                bArr3 = bArr2;
                i42 = i49;
                i40 = i20;
                i39 = 0;
                i38 = 3;
                i37 = i13;
                obj6 = obj2;
                c2396x43 = c2396x42;
                unsafe9 = unsafe3;
                i36 = i11;
            } else {
                str = "Failed to parse the message.";
                unsafe = unsafe9;
                obj2 = obj6;
                i13 = i37;
                i14 = i44;
                i15 = i46;
                i16 = i45;
                i17 = 1048575;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.S5
    public final Object zza() {
        return ((AbstractC2245g5) this.f24261e).l();
    }
}
