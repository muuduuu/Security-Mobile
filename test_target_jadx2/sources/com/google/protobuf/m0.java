package com.google.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
abstract class m0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Unsafe f28773a = D();

    /* renamed from: b, reason: collision with root package name */
    private static final Class f28774b = AbstractC2873d.b();

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f28775c = o(Long.TYPE);

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f28776d = o(Integer.TYPE);

    /* renamed from: e, reason: collision with root package name */
    private static final e f28777e = B();

    /* renamed from: f, reason: collision with root package name */
    private static final boolean f28778f = T();

    /* renamed from: g, reason: collision with root package name */
    private static final boolean f28779g = S();

    /* renamed from: h, reason: collision with root package name */
    static final long f28780h;

    /* renamed from: i, reason: collision with root package name */
    private static final long f28781i;

    /* renamed from: j, reason: collision with root package name */
    private static final long f28782j;

    /* renamed from: k, reason: collision with root package name */
    private static final long f28783k;

    /* renamed from: l, reason: collision with root package name */
    private static final long f28784l;

    /* renamed from: m, reason: collision with root package name */
    private static final long f28785m;

    /* renamed from: n, reason: collision with root package name */
    private static final long f28786n;

    /* renamed from: o, reason: collision with root package name */
    private static final long f28787o;

    /* renamed from: p, reason: collision with root package name */
    private static final long f28788p;

    /* renamed from: q, reason: collision with root package name */
    private static final long f28789q;

    /* renamed from: r, reason: collision with root package name */
    private static final long f28790r;

    /* renamed from: s, reason: collision with root package name */
    private static final long f28791s;

    /* renamed from: t, reason: collision with root package name */
    private static final long f28792t;

    /* renamed from: u, reason: collision with root package name */
    private static final long f28793u;

    /* renamed from: v, reason: collision with root package name */
    private static final int f28794v;

    /* renamed from: w, reason: collision with root package name */
    static final boolean f28795w;

    class a implements PrivilegedExceptionAction {
        a() {
        }

        @Override // java.security.PrivilegedExceptionAction
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unsafe run() {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }
    }

    private static final class b extends e {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.protobuf.m0.e
        public boolean c(Object obj, long j10) {
            return m0.f28795w ? m0.s(obj, j10) : m0.t(obj, j10);
        }

        @Override // com.google.protobuf.m0.e
        public byte d(Object obj, long j10) {
            return m0.f28795w ? m0.v(obj, j10) : m0.w(obj, j10);
        }

        @Override // com.google.protobuf.m0.e
        public double e(Object obj, long j10) {
            return Double.longBitsToDouble(h(obj, j10));
        }

        @Override // com.google.protobuf.m0.e
        public float f(Object obj, long j10) {
            return Float.intBitsToFloat(g(obj, j10));
        }

        @Override // com.google.protobuf.m0.e
        public void k(Object obj, long j10, boolean z10) {
            if (m0.f28795w) {
                m0.I(obj, j10, z10);
            } else {
                m0.J(obj, j10, z10);
            }
        }

        @Override // com.google.protobuf.m0.e
        public void l(Object obj, long j10, byte b10) {
            if (m0.f28795w) {
                m0.L(obj, j10, b10);
            } else {
                m0.M(obj, j10, b10);
            }
        }

        @Override // com.google.protobuf.m0.e
        public void m(Object obj, long j10, double d10) {
            p(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // com.google.protobuf.m0.e
        public void n(Object obj, long j10, float f10) {
            o(obj, j10, Float.floatToIntBits(f10));
        }

        @Override // com.google.protobuf.m0.e
        public boolean s() {
            return false;
        }
    }

    private static final class c extends e {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.protobuf.m0.e
        public boolean c(Object obj, long j10) {
            return m0.f28795w ? m0.s(obj, j10) : m0.t(obj, j10);
        }

        @Override // com.google.protobuf.m0.e
        public byte d(Object obj, long j10) {
            return m0.f28795w ? m0.v(obj, j10) : m0.w(obj, j10);
        }

        @Override // com.google.protobuf.m0.e
        public double e(Object obj, long j10) {
            return Double.longBitsToDouble(h(obj, j10));
        }

        @Override // com.google.protobuf.m0.e
        public float f(Object obj, long j10) {
            return Float.intBitsToFloat(g(obj, j10));
        }

        @Override // com.google.protobuf.m0.e
        public void k(Object obj, long j10, boolean z10) {
            if (m0.f28795w) {
                m0.I(obj, j10, z10);
            } else {
                m0.J(obj, j10, z10);
            }
        }

        @Override // com.google.protobuf.m0.e
        public void l(Object obj, long j10, byte b10) {
            if (m0.f28795w) {
                m0.L(obj, j10, b10);
            } else {
                m0.M(obj, j10, b10);
            }
        }

        @Override // com.google.protobuf.m0.e
        public void m(Object obj, long j10, double d10) {
            p(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // com.google.protobuf.m0.e
        public void n(Object obj, long j10, float f10) {
            o(obj, j10, Float.floatToIntBits(f10));
        }

        @Override // com.google.protobuf.m0.e
        public boolean s() {
            return false;
        }
    }

    private static final class d extends e {
        d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.protobuf.m0.e
        public boolean c(Object obj, long j10) {
            return this.f28796a.getBoolean(obj, j10);
        }

        @Override // com.google.protobuf.m0.e
        public byte d(Object obj, long j10) {
            return this.f28796a.getByte(obj, j10);
        }

        @Override // com.google.protobuf.m0.e
        public double e(Object obj, long j10) {
            return this.f28796a.getDouble(obj, j10);
        }

        @Override // com.google.protobuf.m0.e
        public float f(Object obj, long j10) {
            return this.f28796a.getFloat(obj, j10);
        }

        @Override // com.google.protobuf.m0.e
        public void k(Object obj, long j10, boolean z10) {
            this.f28796a.putBoolean(obj, j10, z10);
        }

        @Override // com.google.protobuf.m0.e
        public void l(Object obj, long j10, byte b10) {
            this.f28796a.putByte(obj, j10, b10);
        }

        @Override // com.google.protobuf.m0.e
        public void m(Object obj, long j10, double d10) {
            this.f28796a.putDouble(obj, j10, d10);
        }

        @Override // com.google.protobuf.m0.e
        public void n(Object obj, long j10, float f10) {
            this.f28796a.putFloat(obj, j10, f10);
        }

        @Override // com.google.protobuf.m0.e
        public boolean r() {
            if (!super.r()) {
                return false;
            }
            try {
                Class<?> cls = this.f28796a.getClass();
                Class cls2 = Long.TYPE;
                cls.getMethod("getByte", Object.class, cls2);
                cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                cls.getMethod("getBoolean", Object.class, cls2);
                cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                cls.getMethod("getFloat", Object.class, cls2);
                cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
                cls.getMethod("getDouble", Object.class, cls2);
                cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                return true;
            } catch (Throwable th) {
                m0.G(th);
                return false;
            }
        }

        @Override // com.google.protobuf.m0.e
        public boolean s() {
            if (!super.s()) {
                return false;
            }
            try {
                Class<?> cls = this.f28796a.getClass();
                Class cls2 = Long.TYPE;
                cls.getMethod("getByte", cls2);
                cls.getMethod("putByte", cls2, Byte.TYPE);
                cls.getMethod("getInt", cls2);
                cls.getMethod("putInt", cls2, Integer.TYPE);
                cls.getMethod("getLong", cls2);
                cls.getMethod("putLong", cls2, cls2);
                cls.getMethod("copyMemory", cls2, cls2, cls2);
                cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                return true;
            } catch (Throwable th) {
                m0.G(th);
                return false;
            }
        }
    }

    private static abstract class e {

        /* renamed from: a, reason: collision with root package name */
        Unsafe f28796a;

        e(Unsafe unsafe) {
            this.f28796a = unsafe;
        }

        public final int a(Class cls) {
            return this.f28796a.arrayBaseOffset(cls);
        }

        public final int b(Class cls) {
            return this.f28796a.arrayIndexScale(cls);
        }

        public abstract boolean c(Object obj, long j10);

        public abstract byte d(Object obj, long j10);

        public abstract double e(Object obj, long j10);

        public abstract float f(Object obj, long j10);

        public final int g(Object obj, long j10) {
            return this.f28796a.getInt(obj, j10);
        }

        public final long h(Object obj, long j10) {
            return this.f28796a.getLong(obj, j10);
        }

        public final Object i(Object obj, long j10) {
            return this.f28796a.getObject(obj, j10);
        }

        public final long j(Field field) {
            return this.f28796a.objectFieldOffset(field);
        }

        public abstract void k(Object obj, long j10, boolean z10);

        public abstract void l(Object obj, long j10, byte b10);

        public abstract void m(Object obj, long j10, double d10);

        public abstract void n(Object obj, long j10, float f10);

        public final void o(Object obj, long j10, int i10) {
            this.f28796a.putInt(obj, j10, i10);
        }

        public final void p(Object obj, long j10, long j11) {
            this.f28796a.putLong(obj, j10, j11);
        }

        public final void q(Object obj, long j10, Object obj2) {
            this.f28796a.putObject(obj, j10, obj2);
        }

        public boolean r() {
            Unsafe unsafe = this.f28796a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th) {
                m0.G(th);
                return false;
            }
        }

        public boolean s() {
            Unsafe unsafe = this.f28796a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return m0.n() != null;
            } catch (Throwable th) {
                m0.G(th);
                return false;
            }
        }
    }

    static {
        long l10 = l(byte[].class);
        f28780h = l10;
        f28781i = l(boolean[].class);
        f28782j = m(boolean[].class);
        f28783k = l(int[].class);
        f28784l = m(int[].class);
        f28785m = l(long[].class);
        f28786n = m(long[].class);
        f28787o = l(float[].class);
        f28788p = m(float[].class);
        f28789q = l(double[].class);
        f28790r = m(double[].class);
        f28791s = l(Object[].class);
        f28792t = m(Object[].class);
        f28793u = q(n());
        f28794v = (int) (l10 & 7);
        f28795w = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    static long A(Object obj, long j10) {
        return f28777e.h(obj, j10);
    }

    private static e B() {
        Unsafe unsafe = f28773a;
        if (unsafe == null) {
            return null;
        }
        if (!AbstractC2873d.c()) {
            return new d(unsafe);
        }
        if (f28775c) {
            return new c(unsafe);
        }
        if (f28776d) {
            return new b(unsafe);
        }
        return null;
    }

    static Object C(Object obj, long j10) {
        return f28777e.i(obj, j10);
    }

    static Unsafe D() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean E() {
        return f28779g;
    }

    static boolean F() {
        return f28778f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void G(Throwable th) {
        Logger.getLogger(m0.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    static void H(Object obj, long j10, boolean z10) {
        f28777e.k(obj, j10, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void I(Object obj, long j10, boolean z10) {
        L(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void J(Object obj, long j10, boolean z10) {
        M(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    static void K(byte[] bArr, long j10, byte b10) {
        f28777e.l(bArr, f28780h + j10, b10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void L(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int z10 = z(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        P(obj, j11, ((255 & b10) << i10) | (z10 & (~(255 << i10))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void M(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        P(obj, j11, ((255 & b10) << i10) | (z(obj, j11) & (~(255 << i10))));
    }

    static void N(Object obj, long j10, double d10) {
        f28777e.m(obj, j10, d10);
    }

    static void O(Object obj, long j10, float f10) {
        f28777e.n(obj, j10, f10);
    }

    static void P(Object obj, long j10, int i10) {
        f28777e.o(obj, j10, i10);
    }

    static void Q(Object obj, long j10, long j11) {
        f28777e.p(obj, j10, j11);
    }

    static void R(Object obj, long j10, Object obj2) {
        f28777e.q(obj, j10, obj2);
    }

    private static boolean S() {
        e eVar = f28777e;
        if (eVar == null) {
            return false;
        }
        return eVar.r();
    }

    private static boolean T() {
        e eVar = f28777e;
        if (eVar == null) {
            return false;
        }
        return eVar.s();
    }

    static Object k(Class cls) {
        try {
            return f28773a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    private static int l(Class cls) {
        if (f28779g) {
            return f28777e.a(cls);
        }
        return -1;
    }

    private static int m(Class cls) {
        if (f28779g) {
            return f28777e.b(cls);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Field n() {
        Field p10;
        if (AbstractC2873d.c() && (p10 = p(Buffer.class, "effectiveDirectAddress")) != null) {
            return p10;
        }
        Field p11 = p(Buffer.class, "address");
        if (p11 == null || p11.getType() != Long.TYPE) {
            return null;
        }
        return p11;
    }

    static boolean o(Class cls) {
        if (!AbstractC2873d.c()) {
            return false;
        }
        try {
            Class cls2 = f28774b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static Field p(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static long q(Field field) {
        e eVar;
        if (field == null || (eVar = f28777e) == null) {
            return -1L;
        }
        return eVar.j(field);
    }

    static boolean r(Object obj, long j10) {
        return f28777e.c(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean s(Object obj, long j10) {
        return v(obj, j10) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean t(Object obj, long j10) {
        return w(obj, j10) != 0;
    }

    static byte u(byte[] bArr, long j10) {
        return f28777e.d(bArr, f28780h + j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte v(Object obj, long j10) {
        return (byte) ((z(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte w(Object obj, long j10) {
        return (byte) ((z(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255);
    }

    static double x(Object obj, long j10) {
        return f28777e.e(obj, j10);
    }

    static float y(Object obj, long j10) {
        return f28777e.f(obj, j10);
    }

    static int z(Object obj, long j10) {
        return f28777e.g(obj, j10);
    }
}
