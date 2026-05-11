package com.google.android.gms.internal.clearcut;

import java.lang.reflect.Field;
import java.util.Arrays;
import org.conscrypt.PSKKeyManager;

/* loaded from: classes2.dex */
final class P0 {

    /* renamed from: A, reason: collision with root package name */
    private int f23901A;

    /* renamed from: B, reason: collision with root package name */
    private int f23902B;

    /* renamed from: C, reason: collision with root package name */
    private Field f23903C;

    /* renamed from: D, reason: collision with root package name */
    private Object f23904D;

    /* renamed from: E, reason: collision with root package name */
    private Object f23905E;

    /* renamed from: F, reason: collision with root package name */
    private Object f23906F;

    /* renamed from: a, reason: collision with root package name */
    private final Q0 f23907a;

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f23908b;

    /* renamed from: c, reason: collision with root package name */
    private Class f23909c;

    /* renamed from: d, reason: collision with root package name */
    private final int f23910d;

    /* renamed from: e, reason: collision with root package name */
    private final int f23911e;

    /* renamed from: f, reason: collision with root package name */
    private final int f23912f;

    /* renamed from: g, reason: collision with root package name */
    private final int f23913g;

    /* renamed from: h, reason: collision with root package name */
    private final int f23914h;

    /* renamed from: i, reason: collision with root package name */
    private final int f23915i;

    /* renamed from: j, reason: collision with root package name */
    private final int f23916j;

    /* renamed from: k, reason: collision with root package name */
    private final int f23917k;

    /* renamed from: l, reason: collision with root package name */
    private final int f23918l;

    /* renamed from: m, reason: collision with root package name */
    private final int f23919m;

    /* renamed from: n, reason: collision with root package name */
    private final int[] f23920n;

    /* renamed from: o, reason: collision with root package name */
    private int f23921o;

    /* renamed from: p, reason: collision with root package name */
    private int f23922p;

    /* renamed from: q, reason: collision with root package name */
    private int f23923q = Integer.MAX_VALUE;

    /* renamed from: r, reason: collision with root package name */
    private int f23924r = Integer.MIN_VALUE;

    /* renamed from: s, reason: collision with root package name */
    private int f23925s = 0;

    /* renamed from: t, reason: collision with root package name */
    private int f23926t = 0;

    /* renamed from: u, reason: collision with root package name */
    private int f23927u = 0;

    /* renamed from: v, reason: collision with root package name */
    private int f23928v = 0;

    /* renamed from: w, reason: collision with root package name */
    private int f23929w = 0;

    /* renamed from: x, reason: collision with root package name */
    private int f23930x;

    /* renamed from: y, reason: collision with root package name */
    private int f23931y;

    /* renamed from: z, reason: collision with root package name */
    private int f23932z;

    P0(Class cls, String str, Object[] objArr) {
        this.f23909c = cls;
        Q0 q02 = new Q0(str);
        this.f23907a = q02;
        this.f23908b = objArr;
        this.f23910d = q02.b();
        int b10 = q02.b();
        this.f23911e = b10;
        if (b10 == 0) {
            this.f23912f = 0;
            this.f23913g = 0;
            this.f23914h = 0;
            this.f23915i = 0;
            this.f23916j = 0;
            this.f23918l = 0;
            this.f23917k = 0;
            this.f23919m = 0;
            this.f23920n = null;
            return;
        }
        int b11 = q02.b();
        this.f23912f = b11;
        int b12 = q02.b();
        this.f23913g = b12;
        this.f23914h = q02.b();
        this.f23915i = q02.b();
        this.f23918l = q02.b();
        this.f23917k = q02.b();
        this.f23916j = q02.b();
        this.f23919m = q02.b();
        int b13 = q02.b();
        this.f23920n = b13 != 0 ? new int[b13] : null;
        this.f23921o = (b11 << 1) + b12;
    }

    private static Field c(Class cls, String str) {
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

    private final Object f() {
        Object[] objArr = this.f23908b;
        int i10 = this.f23921o;
        this.f23921o = i10 + 1;
        return objArr[i10];
    }

    private final boolean i() {
        return (this.f23910d & 1) == 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c2, code lost:
    
        if (i() != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c4, code lost:
    
        r5.f23905E = f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x014b, code lost:
    
        if ((r5.f23931y & 2048) != 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0153, code lost:
    
        if (i() != false) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final boolean a() {
        int i10;
        Object type;
        if (!this.f23907a.a()) {
            return false;
        }
        this.f23930x = this.f23907a.b();
        int b10 = this.f23907a.b();
        this.f23931y = b10;
        int i11 = b10 & 255;
        this.f23932z = i11;
        int i12 = this.f23930x;
        if (i12 < this.f23923q) {
            this.f23923q = i12;
        }
        if (i12 > this.f23924r) {
            this.f23924r = i12;
        }
        W w10 = W.zziw;
        if (i11 == w10.id()) {
            this.f23925s++;
        } else if (this.f23932z >= W.zzhq.id() && this.f23932z <= W.zziv.id()) {
            this.f23926t++;
        }
        int i13 = this.f23929w + 1;
        this.f23929w = i13;
        if (T0.s(this.f23923q, this.f23930x, i13)) {
            int i14 = this.f23930x + 1;
            this.f23928v = i14;
            i10 = i14 - this.f23923q;
        } else {
            i10 = this.f23927u + 1;
        }
        this.f23927u = i10;
        if ((this.f23931y & 1024) != 0) {
            int[] iArr = this.f23920n;
            int i15 = this.f23922p;
            this.f23922p = i15 + 1;
            iArr[i15] = this.f23930x;
        }
        this.f23904D = null;
        this.f23905E = null;
        this.f23906F = null;
        if (k()) {
            this.f23901A = this.f23907a.b();
            if (this.f23932z != W.zzhh.id() + 51 && this.f23932z != W.zzhp.id() + 51) {
                if (this.f23932z == W.zzhk.id() + 51) {
                }
                return true;
            }
            type = f();
        } else {
            this.f23903C = c(this.f23909c, (String) f());
            if (o()) {
                this.f23902B = this.f23907a.b();
            }
            if (this.f23932z == W.zzhh.id() || this.f23932z == W.zzhp.id()) {
                type = this.f23903C.getType();
            } else {
                if (this.f23932z != W.zzhz.id() && this.f23932z != W.zziv.id()) {
                    if (this.f23932z != W.zzhk.id() && this.f23932z != W.zzic.id() && this.f23932z != W.zziq.id()) {
                        if (this.f23932z == w10.id()) {
                            this.f23906F = f();
                        }
                        return true;
                    }
                }
                type = f();
            }
        }
        this.f23904D = type;
        return true;
    }

    final int g() {
        return this.f23930x;
    }

    final int h() {
        return this.f23932z;
    }

    final boolean k() {
        return this.f23932z > W.zziw.id();
    }

    final Field l() {
        int i10 = this.f23901A << 1;
        Object obj = this.f23908b[i10];
        if (obj instanceof Field) {
            return (Field) obj;
        }
        Field c10 = c(this.f23909c, (String) obj);
        this.f23908b[i10] = c10;
        return c10;
    }

    final Field m() {
        int i10 = (this.f23901A << 1) + 1;
        Object obj = this.f23908b[i10];
        if (obj instanceof Field) {
            return (Field) obj;
        }
        Field c10 = c(this.f23909c, (String) obj);
        this.f23908b[i10] = c10;
        return c10;
    }

    final Field n() {
        return this.f23903C;
    }

    final boolean o() {
        return i() && this.f23932z <= W.zzhp.id();
    }

    final Field p() {
        int i10 = (this.f23912f << 1) + (this.f23902B / 32);
        Object obj = this.f23908b[i10];
        if (obj instanceof Field) {
            return (Field) obj;
        }
        Field c10 = c(this.f23909c, (String) obj);
        this.f23908b[i10] = c10;
        return c10;
    }

    final int q() {
        return this.f23902B % 32;
    }

    final boolean r() {
        return (this.f23931y & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0;
    }

    final boolean s() {
        return (this.f23931y & 512) != 0;
    }

    final Object t() {
        return this.f23904D;
    }

    final Object u() {
        return this.f23905E;
    }

    final Object v() {
        return this.f23906F;
    }
}
