package com.google.android.gms.internal.vision;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
abstract class h2 {

    /* renamed from: a, reason: collision with root package name */
    private static final Unsafe f25140a;

    /* renamed from: b, reason: collision with root package name */
    private static final Class f25141b;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f25142c;

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f25143d;

    /* renamed from: e, reason: collision with root package name */
    private static final d f25144e;

    /* renamed from: f, reason: collision with root package name */
    private static final boolean f25145f;

    /* renamed from: g, reason: collision with root package name */
    private static final boolean f25146g;

    /* renamed from: h, reason: collision with root package name */
    private static final long f25147h;

    /* renamed from: i, reason: collision with root package name */
    private static final long f25148i;

    /* renamed from: j, reason: collision with root package name */
    private static final long f25149j;

    /* renamed from: k, reason: collision with root package name */
    private static final long f25150k;

    /* renamed from: l, reason: collision with root package name */
    private static final long f25151l;

    /* renamed from: m, reason: collision with root package name */
    private static final long f25152m;

    /* renamed from: n, reason: collision with root package name */
    private static final long f25153n;

    /* renamed from: o, reason: collision with root package name */
    private static final long f25154o;

    /* renamed from: p, reason: collision with root package name */
    private static final long f25155p;

    /* renamed from: q, reason: collision with root package name */
    private static final long f25156q;

    /* renamed from: r, reason: collision with root package name */
    private static final long f25157r;

    /* renamed from: s, reason: collision with root package name */
    private static final long f25158s;

    /* renamed from: t, reason: collision with root package name */
    private static final long f25159t;

    /* renamed from: u, reason: collision with root package name */
    private static final long f25160u;

    /* renamed from: v, reason: collision with root package name */
    private static final int f25161v;

    /* renamed from: w, reason: collision with root package name */
    static final boolean f25162w;

    private static final class a extends d {
        a(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.vision.h2.d
        public final byte a(Object obj, long j10) {
            return h2.f25162w ? h2.L(obj, j10) : h2.M(obj, j10);
        }

        @Override // com.google.android.gms.internal.vision.h2.d
        public final void b(Object obj, long j10, byte b10) {
            if (h2.f25162w) {
                h2.u(obj, j10, b10);
            } else {
                h2.y(obj, j10, b10);
            }
        }

        @Override // com.google.android.gms.internal.vision.h2.d
        public final void c(Object obj, long j10, double d10) {
            f(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // com.google.android.gms.internal.vision.h2.d
        public final void d(Object obj, long j10, float f10) {
            e(obj, j10, Float.floatToIntBits(f10));
        }

        @Override // com.google.android.gms.internal.vision.h2.d
        public final void g(Object obj, long j10, boolean z10) {
            if (h2.f25162w) {
                h2.z(obj, j10, z10);
            } else {
                h2.D(obj, j10, z10);
            }
        }

        @Override // com.google.android.gms.internal.vision.h2.d
        public final boolean h(Object obj, long j10) {
            return h2.f25162w ? h2.N(obj, j10) : h2.O(obj, j10);
        }

        @Override // com.google.android.gms.internal.vision.h2.d
        public final float i(Object obj, long j10) {
            return Float.intBitsToFloat(k(obj, j10));
        }

        @Override // com.google.android.gms.internal.vision.h2.d
        public final double j(Object obj, long j10) {
            return Double.longBitsToDouble(l(obj, j10));
        }
    }

    private static final class b extends d {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.vision.h2.d
        public final byte a(Object obj, long j10) {
            return this.f25163a.getByte(obj, j10);
        }

        @Override // com.google.android.gms.internal.vision.h2.d
        public final void b(Object obj, long j10, byte b10) {
            this.f25163a.putByte(obj, j10, b10);
        }

        @Override // com.google.android.gms.internal.vision.h2.d
        public final void c(Object obj, long j10, double d10) {
            this.f25163a.putDouble(obj, j10, d10);
        }

        @Override // com.google.android.gms.internal.vision.h2.d
        public final void d(Object obj, long j10, float f10) {
            this.f25163a.putFloat(obj, j10, f10);
        }

        @Override // com.google.android.gms.internal.vision.h2.d
        public final void g(Object obj, long j10, boolean z10) {
            this.f25163a.putBoolean(obj, j10, z10);
        }

        @Override // com.google.android.gms.internal.vision.h2.d
        public final boolean h(Object obj, long j10) {
            return this.f25163a.getBoolean(obj, j10);
        }

        @Override // com.google.android.gms.internal.vision.h2.d
        public final float i(Object obj, long j10) {
            return this.f25163a.getFloat(obj, j10);
        }

        @Override // com.google.android.gms.internal.vision.h2.d
        public final double j(Object obj, long j10) {
            return this.f25163a.getDouble(obj, j10);
        }
    }

    private static final class c extends d {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.vision.h2.d
        public final byte a(Object obj, long j10) {
            return h2.f25162w ? h2.L(obj, j10) : h2.M(obj, j10);
        }

        @Override // com.google.android.gms.internal.vision.h2.d
        public final void b(Object obj, long j10, byte b10) {
            if (h2.f25162w) {
                h2.u(obj, j10, b10);
            } else {
                h2.y(obj, j10, b10);
            }
        }

        @Override // com.google.android.gms.internal.vision.h2.d
        public final void c(Object obj, long j10, double d10) {
            f(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // com.google.android.gms.internal.vision.h2.d
        public final void d(Object obj, long j10, float f10) {
            e(obj, j10, Float.floatToIntBits(f10));
        }

        @Override // com.google.android.gms.internal.vision.h2.d
        public final void g(Object obj, long j10, boolean z10) {
            if (h2.f25162w) {
                h2.z(obj, j10, z10);
            } else {
                h2.D(obj, j10, z10);
            }
        }

        @Override // com.google.android.gms.internal.vision.h2.d
        public final boolean h(Object obj, long j10) {
            return h2.f25162w ? h2.N(obj, j10) : h2.O(obj, j10);
        }

        @Override // com.google.android.gms.internal.vision.h2.d
        public final float i(Object obj, long j10) {
            return Float.intBitsToFloat(k(obj, j10));
        }

        @Override // com.google.android.gms.internal.vision.h2.d
        public final double j(Object obj, long j10) {
            return Double.longBitsToDouble(l(obj, j10));
        }
    }

    private static abstract class d {

        /* renamed from: a, reason: collision with root package name */
        Unsafe f25163a;

        d(Unsafe unsafe) {
            this.f25163a = unsafe;
        }

        public abstract byte a(Object obj, long j10);

        public abstract void b(Object obj, long j10, byte b10);

        public abstract void c(Object obj, long j10, double d10);

        public abstract void d(Object obj, long j10, float f10);

        public final void e(Object obj, long j10, int i10) {
            this.f25163a.putInt(obj, j10, i10);
        }

        public final void f(Object obj, long j10, long j11) {
            this.f25163a.putLong(obj, j10, j11);
        }

        public abstract void g(Object obj, long j10, boolean z10);

        public abstract boolean h(Object obj, long j10);

        public abstract float i(Object obj, long j10);

        public abstract double j(Object obj, long j10);

        public final int k(Object obj, long j10) {
            return this.f25163a.getInt(obj, j10);
        }

        public final long l(Object obj, long j10) {
            return this.f25163a.getLong(obj, j10);
        }
    }

    static {
        Unsafe t10 = t();
        f25140a = t10;
        f25141b = Z.c();
        boolean B10 = B(Long.TYPE);
        f25142c = B10;
        boolean B11 = B(Integer.TYPE);
        f25143d = B11;
        d dVar = null;
        if (t10 != null) {
            if (!Z.b()) {
                dVar = new b(t10);
            } else if (B10) {
                dVar = new c(t10);
            } else if (B11) {
                dVar = new a(t10);
            }
        }
        f25144e = dVar;
        f25145f = E();
        f25146g = A();
        long n10 = n(byte[].class);
        f25147h = n10;
        f25148i = n(boolean[].class);
        f25149j = s(boolean[].class);
        f25150k = n(int[].class);
        f25151l = s(int[].class);
        f25152m = n(long[].class);
        f25153n = s(long[].class);
        f25154o = n(float[].class);
        f25155p = s(float[].class);
        f25156q = n(double[].class);
        f25157r = s(double[].class);
        f25158s = n(Object[].class);
        f25159t = s(Object[].class);
        Field G10 = G();
        f25160u = (G10 == null || dVar == null) ? -1L : dVar.f25163a.objectFieldOffset(G10);
        f25161v = (int) (n10 & 7);
        f25162w = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private static boolean A() {
        Unsafe unsafe = f25140a;
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
            if (Z.b()) {
                return true;
            }
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
            Logger logger = Logger.getLogger(h2.class.getName());
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 71);
            sb2.append("platform method missing - proto runtime falling back to safer methods: ");
            sb2.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb2.toString());
            return false;
        }
    }

    private static boolean B(Class cls) {
        if (!Z.b()) {
            return false;
        }
        try {
            Class cls2 = f25141b;
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

    static double C(Object obj, long j10) {
        return f25144e.j(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void D(Object obj, long j10, boolean z10) {
        y(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    private static boolean E() {
        Unsafe unsafe = f25140a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            Class cls2 = Long.TYPE;
            cls.getMethod("getLong", Object.class, cls2);
            if (G() == null) {
                return false;
            }
            if (Z.b()) {
                return true;
            }
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
            Logger logger = Logger.getLogger(h2.class.getName());
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 71);
            sb2.append("platform method missing - proto runtime falling back to safer methods: ");
            sb2.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb2.toString());
            return false;
        }
    }

    static Object F(Object obj, long j10) {
        return f25144e.f25163a.getObject(obj, j10);
    }

    private static Field G() {
        Field d10;
        if (Z.b() && (d10 = d(Buffer.class, "effectiveDirectAddress")) != null) {
            return d10;
        }
        Field d11 = d(Buffer.class, "address");
        if (d11 == null || d11.getType() != Long.TYPE) {
            return null;
        }
        return d11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte L(Object obj, long j10) {
        return (byte) (b(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte M(Object obj, long j10) {
        return (byte) (b(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean N(Object obj, long j10) {
        return L(obj, j10) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean O(Object obj, long j10) {
        return M(obj, j10) != 0;
    }

    static byte a(byte[] bArr, long j10) {
        return f25144e.a(bArr, f25147h + j10);
    }

    static int b(Object obj, long j10) {
        return f25144e.k(obj, j10);
    }

    static Object c(Class cls) {
        try {
            return f25140a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    private static Field d(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static void f(Object obj, long j10, double d10) {
        f25144e.c(obj, j10, d10);
    }

    static void g(Object obj, long j10, float f10) {
        f25144e.d(obj, j10, f10);
    }

    static void h(Object obj, long j10, int i10) {
        f25144e.e(obj, j10, i10);
    }

    static void i(Object obj, long j10, long j11) {
        f25144e.f(obj, j10, j11);
    }

    static void j(Object obj, long j10, Object obj2) {
        f25144e.f25163a.putObject(obj, j10, obj2);
    }

    static void k(Object obj, long j10, boolean z10) {
        f25144e.g(obj, j10, z10);
    }

    static void l(byte[] bArr, long j10, byte b10) {
        f25144e.b(bArr, f25147h + j10, b10);
    }

    static boolean m() {
        return f25146g;
    }

    private static int n(Class cls) {
        if (f25146g) {
            return f25144e.f25163a.arrayBaseOffset(cls);
        }
        return -1;
    }

    static long o(Object obj, long j10) {
        return f25144e.l(obj, j10);
    }

    static boolean r() {
        return f25145f;
    }

    private static int s(Class cls) {
        if (f25146g) {
            return f25144e.f25163a.arrayIndexScale(cls);
        }
        return -1;
    }

    static Unsafe t() {
        try {
            return (Unsafe) AccessController.doPrivileged(new j2());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void u(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int b11 = b(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        h(obj, j11, ((255 & b10) << i10) | (b11 & (~(255 << i10))));
    }

    static boolean w(Object obj, long j10) {
        return f25144e.h(obj, j10);
    }

    static float x(Object obj, long j10) {
        return f25144e.i(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void y(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        h(obj, j11, ((255 & b10) << i10) | (b(obj, j11) & (~(255 << i10))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void z(Object obj, long j10, boolean z10) {
        u(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }
}
