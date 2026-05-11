package com.google.android.gms.internal.clearcut;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.clearcut.f1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC2125f1 {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f24044a = Logger.getLogger(AbstractC2125f1.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final Unsafe f24045b;

    /* renamed from: c, reason: collision with root package name */
    private static final Class f24046c;

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f24047d;

    /* renamed from: e, reason: collision with root package name */
    private static final boolean f24048e;

    /* renamed from: f, reason: collision with root package name */
    private static final d f24049f;

    /* renamed from: g, reason: collision with root package name */
    private static final boolean f24050g;

    /* renamed from: h, reason: collision with root package name */
    private static final boolean f24051h;

    /* renamed from: i, reason: collision with root package name */
    private static final long f24052i;

    /* renamed from: j, reason: collision with root package name */
    private static final long f24053j;

    /* renamed from: k, reason: collision with root package name */
    private static final long f24054k;

    /* renamed from: l, reason: collision with root package name */
    private static final long f24055l;

    /* renamed from: m, reason: collision with root package name */
    private static final long f24056m;

    /* renamed from: n, reason: collision with root package name */
    private static final long f24057n;

    /* renamed from: o, reason: collision with root package name */
    private static final long f24058o;

    /* renamed from: p, reason: collision with root package name */
    private static final long f24059p;

    /* renamed from: q, reason: collision with root package name */
    private static final long f24060q;

    /* renamed from: r, reason: collision with root package name */
    private static final long f24061r;

    /* renamed from: s, reason: collision with root package name */
    private static final long f24062s;

    /* renamed from: t, reason: collision with root package name */
    private static final long f24063t;

    /* renamed from: u, reason: collision with root package name */
    private static final long f24064u;

    /* renamed from: v, reason: collision with root package name */
    private static final long f24065v;

    /* renamed from: w, reason: collision with root package name */
    private static final long f24066w;

    /* renamed from: x, reason: collision with root package name */
    private static final boolean f24067x;

    /* renamed from: com.google.android.gms.internal.clearcut.f1$a */
    static final class a extends d {
        a(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.clearcut.AbstractC2125f1.d
        public final void b(long j10, byte b10) {
            Memory.pokeByte((int) j10, b10);
        }

        @Override // com.google.android.gms.internal.clearcut.AbstractC2125f1.d
        public final void c(Object obj, long j10, double d10) {
            f(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // com.google.android.gms.internal.clearcut.AbstractC2125f1.d
        public final void d(Object obj, long j10, float f10) {
            e(obj, j10, Float.floatToIntBits(f10));
        }

        @Override // com.google.android.gms.internal.clearcut.AbstractC2125f1.d
        public final void g(Object obj, long j10, boolean z10) {
            if (AbstractC2125f1.f24067x) {
                AbstractC2125f1.r(obj, j10, z10);
            } else {
                AbstractC2125f1.t(obj, j10, z10);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.AbstractC2125f1.d
        public final void h(byte[] bArr, long j10, long j11, long j12) {
            Memory.pokeByteArray((int) j11, bArr, (int) j10, (int) j12);
        }

        @Override // com.google.android.gms.internal.clearcut.AbstractC2125f1.d
        public final void i(Object obj, long j10, byte b10) {
            if (AbstractC2125f1.f24067x) {
                AbstractC2125f1.d(obj, j10, b10);
            } else {
                AbstractC2125f1.q(obj, j10, b10);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.AbstractC2125f1.d
        public final boolean l(Object obj, long j10) {
            return AbstractC2125f1.f24067x ? AbstractC2125f1.P(obj, j10) : AbstractC2125f1.Q(obj, j10);
        }

        @Override // com.google.android.gms.internal.clearcut.AbstractC2125f1.d
        public final float m(Object obj, long j10) {
            return Float.intBitsToFloat(j(obj, j10));
        }

        @Override // com.google.android.gms.internal.clearcut.AbstractC2125f1.d
        public final double n(Object obj, long j10) {
            return Double.longBitsToDouble(k(obj, j10));
        }

        @Override // com.google.android.gms.internal.clearcut.AbstractC2125f1.d
        public final byte o(Object obj, long j10) {
            return AbstractC2125f1.f24067x ? AbstractC2125f1.N(obj, j10) : AbstractC2125f1.O(obj, j10);
        }
    }

    /* renamed from: com.google.android.gms.internal.clearcut.f1$b */
    static final class b extends d {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.clearcut.AbstractC2125f1.d
        public final void b(long j10, byte b10) {
            Memory.pokeByte(j10, b10);
        }

        @Override // com.google.android.gms.internal.clearcut.AbstractC2125f1.d
        public final void c(Object obj, long j10, double d10) {
            f(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // com.google.android.gms.internal.clearcut.AbstractC2125f1.d
        public final void d(Object obj, long j10, float f10) {
            e(obj, j10, Float.floatToIntBits(f10));
        }

        @Override // com.google.android.gms.internal.clearcut.AbstractC2125f1.d
        public final void g(Object obj, long j10, boolean z10) {
            if (AbstractC2125f1.f24067x) {
                AbstractC2125f1.r(obj, j10, z10);
            } else {
                AbstractC2125f1.t(obj, j10, z10);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.AbstractC2125f1.d
        public final void h(byte[] bArr, long j10, long j11, long j12) {
            Memory.pokeByteArray(j11, bArr, (int) j10, (int) j12);
        }

        @Override // com.google.android.gms.internal.clearcut.AbstractC2125f1.d
        public final void i(Object obj, long j10, byte b10) {
            if (AbstractC2125f1.f24067x) {
                AbstractC2125f1.d(obj, j10, b10);
            } else {
                AbstractC2125f1.q(obj, j10, b10);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.AbstractC2125f1.d
        public final boolean l(Object obj, long j10) {
            return AbstractC2125f1.f24067x ? AbstractC2125f1.P(obj, j10) : AbstractC2125f1.Q(obj, j10);
        }

        @Override // com.google.android.gms.internal.clearcut.AbstractC2125f1.d
        public final float m(Object obj, long j10) {
            return Float.intBitsToFloat(j(obj, j10));
        }

        @Override // com.google.android.gms.internal.clearcut.AbstractC2125f1.d
        public final double n(Object obj, long j10) {
            return Double.longBitsToDouble(k(obj, j10));
        }

        @Override // com.google.android.gms.internal.clearcut.AbstractC2125f1.d
        public final byte o(Object obj, long j10) {
            return AbstractC2125f1.f24067x ? AbstractC2125f1.N(obj, j10) : AbstractC2125f1.O(obj, j10);
        }
    }

    /* renamed from: com.google.android.gms.internal.clearcut.f1$c */
    static final class c extends d {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.clearcut.AbstractC2125f1.d
        public final void b(long j10, byte b10) {
            this.f24068a.putByte(j10, b10);
        }

        @Override // com.google.android.gms.internal.clearcut.AbstractC2125f1.d
        public final void c(Object obj, long j10, double d10) {
            this.f24068a.putDouble(obj, j10, d10);
        }

        @Override // com.google.android.gms.internal.clearcut.AbstractC2125f1.d
        public final void d(Object obj, long j10, float f10) {
            this.f24068a.putFloat(obj, j10, f10);
        }

        @Override // com.google.android.gms.internal.clearcut.AbstractC2125f1.d
        public final void g(Object obj, long j10, boolean z10) {
            this.f24068a.putBoolean(obj, j10, z10);
        }

        @Override // com.google.android.gms.internal.clearcut.AbstractC2125f1.d
        public final void h(byte[] bArr, long j10, long j11, long j12) {
            this.f24068a.copyMemory(bArr, AbstractC2125f1.f24052i + j10, (Object) null, j11, j12);
        }

        @Override // com.google.android.gms.internal.clearcut.AbstractC2125f1.d
        public final void i(Object obj, long j10, byte b10) {
            this.f24068a.putByte(obj, j10, b10);
        }

        @Override // com.google.android.gms.internal.clearcut.AbstractC2125f1.d
        public final boolean l(Object obj, long j10) {
            return this.f24068a.getBoolean(obj, j10);
        }

        @Override // com.google.android.gms.internal.clearcut.AbstractC2125f1.d
        public final float m(Object obj, long j10) {
            return this.f24068a.getFloat(obj, j10);
        }

        @Override // com.google.android.gms.internal.clearcut.AbstractC2125f1.d
        public final double n(Object obj, long j10) {
            return this.f24068a.getDouble(obj, j10);
        }

        @Override // com.google.android.gms.internal.clearcut.AbstractC2125f1.d
        public final byte o(Object obj, long j10) {
            return this.f24068a.getByte(obj, j10);
        }
    }

    /* renamed from: com.google.android.gms.internal.clearcut.f1$d */
    static abstract class d {

        /* renamed from: a, reason: collision with root package name */
        Unsafe f24068a;

        d(Unsafe unsafe) {
            this.f24068a = unsafe;
        }

        public final long a(Field field) {
            return this.f24068a.objectFieldOffset(field);
        }

        public abstract void b(long j10, byte b10);

        public abstract void c(Object obj, long j10, double d10);

        public abstract void d(Object obj, long j10, float f10);

        public final void e(Object obj, long j10, int i10) {
            this.f24068a.putInt(obj, j10, i10);
        }

        public final void f(Object obj, long j10, long j11) {
            this.f24068a.putLong(obj, j10, j11);
        }

        public abstract void g(Object obj, long j10, boolean z10);

        public abstract void h(byte[] bArr, long j10, long j11, long j12);

        public abstract void i(Object obj, long j10, byte b10);

        public final int j(Object obj, long j10) {
            return this.f24068a.getInt(obj, j10);
        }

        public final long k(Object obj, long j10) {
            return this.f24068a.getLong(obj, j10);
        }

        public abstract boolean l(Object obj, long j10);

        public abstract float m(Object obj, long j10);

        public abstract double n(Object obj, long j10);

        public abstract byte o(Object obj, long j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ec  */
    static {
        d cVar;
        Field p10;
        Unsafe z10 = z();
        f24045b = z10;
        f24046c = AbstractC2164t.c();
        boolean G10 = G(Long.TYPE);
        f24047d = G10;
        boolean G11 = G(Integer.TYPE);
        f24048e = G11;
        Field field = null;
        if (z10 != null) {
            if (!AbstractC2164t.b()) {
                cVar = new c(z10);
            } else if (G10) {
                cVar = new b(z10);
            } else if (G11) {
                cVar = new a(z10);
            }
            f24049f = cVar;
            f24050g = B();
            f24051h = A();
            f24052i = E(byte[].class);
            f24053j = E(boolean[].class);
            f24054k = F(boolean[].class);
            f24055l = E(int[].class);
            f24056m = F(int[].class);
            f24057n = E(long[].class);
            f24058o = F(long[].class);
            f24059p = E(float[].class);
            f24060q = F(float[].class);
            f24061r = E(double[].class);
            f24062s = F(double[].class);
            f24063t = E(Object[].class);
            f24064u = F(Object[].class);
            f24065v = n(C());
            p10 = p(String.class, "value");
            if (p10 != null && p10.getType() == char[].class) {
                field = p10;
            }
            f24066w = n(field);
            f24067x = ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN;
        }
        cVar = null;
        f24049f = cVar;
        f24050g = B();
        f24051h = A();
        f24052i = E(byte[].class);
        f24053j = E(boolean[].class);
        f24054k = F(boolean[].class);
        f24055l = E(int[].class);
        f24056m = F(int[].class);
        f24057n = E(long[].class);
        f24058o = F(long[].class);
        f24059p = E(float[].class);
        f24060q = F(float[].class);
        f24061r = E(double[].class);
        f24062s = F(double[].class);
        f24063t = E(Object[].class);
        f24064u = F(Object[].class);
        f24065v = n(C());
        p10 = p(String.class, "value");
        if (p10 != null) {
            field = p10;
        }
        f24066w = n(field);
        f24067x = ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN;
    }

    private static boolean A() {
        Unsafe unsafe = f24045b;
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
            if (AbstractC2164t.b()) {
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
            Logger logger = f24044a;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 71);
            sb2.append("platform method missing - proto runtime falling back to safer methods: ");
            sb2.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb2.toString());
            return false;
        }
    }

    private static boolean B() {
        Unsafe unsafe = f24045b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            Class cls2 = Long.TYPE;
            cls.getMethod("getLong", Object.class, cls2);
            if (C() == null) {
                return false;
            }
            if (AbstractC2164t.b()) {
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
            Logger logger = f24044a;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 71);
            sb2.append("platform method missing - proto runtime falling back to safer methods: ");
            sb2.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb2.toString());
            return false;
        }
    }

    private static Field C() {
        Field p10;
        if (AbstractC2164t.b() && (p10 = p(Buffer.class, "effectiveDirectAddress")) != null) {
            return p10;
        }
        Field p11 = p(Buffer.class, "address");
        if (p11 == null || p11.getType() != Long.TYPE) {
            return null;
        }
        return p11;
    }

    private static int E(Class cls) {
        if (f24051h) {
            return f24049f.f24068a.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int F(Class cls) {
        if (f24051h) {
            return f24049f.f24068a.arrayIndexScale(cls);
        }
        return -1;
    }

    private static boolean G(Class cls) {
        if (!AbstractC2164t.b()) {
            return false;
        }
        try {
            Class cls2 = f24046c;
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

    static int H(Object obj, long j10) {
        return f24049f.j(obj, j10);
    }

    static long I(Object obj, long j10) {
        return f24049f.k(obj, j10);
    }

    static boolean J(Object obj, long j10) {
        return f24049f.l(obj, j10);
    }

    static float K(Object obj, long j10) {
        return f24049f.m(obj, j10);
    }

    static double L(Object obj, long j10) {
        return f24049f.n(obj, j10);
    }

    static Object M(Object obj, long j10) {
        return f24049f.f24068a.getObject(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte N(Object obj, long j10) {
        return (byte) (H(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte O(Object obj, long j10) {
        return (byte) (H(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean P(Object obj, long j10) {
        return N(obj, j10) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean Q(Object obj, long j10) {
        return O(obj, j10) != 0;
    }

    static byte a(byte[] bArr, long j10) {
        return f24049f.o(bArr, f24052i + j10);
    }

    static long b(Field field) {
        return f24049f.a(field);
    }

    static void c(long j10, byte b10) {
        f24049f.b(j10, b10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int H10 = H(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        g(obj, j11, ((255 & b10) << i10) | (H10 & (~(255 << i10))));
    }

    static void e(Object obj, long j10, double d10) {
        f24049f.c(obj, j10, d10);
    }

    static void f(Object obj, long j10, float f10) {
        f24049f.d(obj, j10, f10);
    }

    static void g(Object obj, long j10, int i10) {
        f24049f.e(obj, j10, i10);
    }

    static void h(Object obj, long j10, long j11) {
        f24049f.f(obj, j10, j11);
    }

    static void i(Object obj, long j10, Object obj2) {
        f24049f.f24068a.putObject(obj, j10, obj2);
    }

    static void j(Object obj, long j10, boolean z10) {
        f24049f.g(obj, j10, z10);
    }

    static void k(byte[] bArr, long j10, byte b10) {
        f24049f.i(bArr, f24052i + j10, b10);
    }

    static void l(byte[] bArr, long j10, long j11, long j12) {
        f24049f.h(bArr, j10, j11, j12);
    }

    private static long n(Field field) {
        d dVar;
        if (field == null || (dVar = f24049f) == null) {
            return -1L;
        }
        return dVar.a(field);
    }

    static long o(ByteBuffer byteBuffer) {
        return f24049f.k(byteBuffer, f24065v);
    }

    private static Field p(Class cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void q(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        g(obj, j11, ((255 & b10) << i10) | (H(obj, j11) & (~(255 << i10))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void r(Object obj, long j10, boolean z10) {
        d(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void t(Object obj, long j10, boolean z10) {
        q(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    static boolean x() {
        return f24051h;
    }

    static boolean y() {
        return f24050g;
    }

    static Unsafe z() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C2128g1());
        } catch (Throwable unused) {
            return null;
        }
    }
}
