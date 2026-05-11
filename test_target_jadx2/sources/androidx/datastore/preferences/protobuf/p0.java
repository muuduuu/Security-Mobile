package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
abstract class p0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Unsafe f16432a = A();

    /* renamed from: b, reason: collision with root package name */
    private static final Class f16433b = AbstractC1537d.b();

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f16434c = m(Long.TYPE);

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f16435d = m(Integer.TYPE);

    /* renamed from: e, reason: collision with root package name */
    private static final e f16436e = y();

    /* renamed from: f, reason: collision with root package name */
    private static final boolean f16437f = Q();

    /* renamed from: g, reason: collision with root package name */
    private static final boolean f16438g = P();

    /* renamed from: h, reason: collision with root package name */
    static final long f16439h;

    /* renamed from: i, reason: collision with root package name */
    private static final long f16440i;

    /* renamed from: j, reason: collision with root package name */
    private static final long f16441j;

    /* renamed from: k, reason: collision with root package name */
    private static final long f16442k;

    /* renamed from: l, reason: collision with root package name */
    private static final long f16443l;

    /* renamed from: m, reason: collision with root package name */
    private static final long f16444m;

    /* renamed from: n, reason: collision with root package name */
    private static final long f16445n;

    /* renamed from: o, reason: collision with root package name */
    private static final long f16446o;

    /* renamed from: p, reason: collision with root package name */
    private static final long f16447p;

    /* renamed from: q, reason: collision with root package name */
    private static final long f16448q;

    /* renamed from: r, reason: collision with root package name */
    private static final long f16449r;

    /* renamed from: s, reason: collision with root package name */
    private static final long f16450s;

    /* renamed from: t, reason: collision with root package name */
    private static final long f16451t;

    /* renamed from: u, reason: collision with root package name */
    private static final long f16452u;

    /* renamed from: v, reason: collision with root package name */
    private static final int f16453v;

    /* renamed from: w, reason: collision with root package name */
    static final boolean f16454w;

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

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public boolean c(Object obj, long j10) {
            return p0.f16454w ? p0.q(obj, j10) : p0.r(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public double d(Object obj, long j10) {
            return Double.longBitsToDouble(g(obj, j10));
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public float e(Object obj, long j10) {
            return Float.intBitsToFloat(f(obj, j10));
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void j(Object obj, long j10, boolean z10) {
            if (p0.f16454w) {
                p0.F(obj, j10, z10);
            } else {
                p0.G(obj, j10, z10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void k(Object obj, long j10, byte b10) {
            if (p0.f16454w) {
                p0.I(obj, j10, b10);
            } else {
                p0.J(obj, j10, b10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void l(Object obj, long j10, double d10) {
            o(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void m(Object obj, long j10, float f10) {
            n(obj, j10, Float.floatToIntBits(f10));
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public boolean r() {
            return false;
        }
    }

    private static final class c extends e {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public boolean c(Object obj, long j10) {
            return p0.f16454w ? p0.q(obj, j10) : p0.r(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public double d(Object obj, long j10) {
            return Double.longBitsToDouble(g(obj, j10));
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public float e(Object obj, long j10) {
            return Float.intBitsToFloat(f(obj, j10));
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void j(Object obj, long j10, boolean z10) {
            if (p0.f16454w) {
                p0.F(obj, j10, z10);
            } else {
                p0.G(obj, j10, z10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void k(Object obj, long j10, byte b10) {
            if (p0.f16454w) {
                p0.I(obj, j10, b10);
            } else {
                p0.J(obj, j10, b10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void l(Object obj, long j10, double d10) {
            o(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void m(Object obj, long j10, float f10) {
            n(obj, j10, Float.floatToIntBits(f10));
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public boolean r() {
            return false;
        }
    }

    private static final class d extends e {
        d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public boolean c(Object obj, long j10) {
            return this.f16455a.getBoolean(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public double d(Object obj, long j10) {
            return this.f16455a.getDouble(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public float e(Object obj, long j10) {
            return this.f16455a.getFloat(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void j(Object obj, long j10, boolean z10) {
            this.f16455a.putBoolean(obj, j10, z10);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void k(Object obj, long j10, byte b10) {
            this.f16455a.putByte(obj, j10, b10);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void l(Object obj, long j10, double d10) {
            this.f16455a.putDouble(obj, j10, d10);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void m(Object obj, long j10, float f10) {
            this.f16455a.putFloat(obj, j10, f10);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public boolean q() {
            if (!super.q()) {
                return false;
            }
            try {
                Class<?> cls = this.f16455a.getClass();
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
                p0.D(th);
                return false;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public boolean r() {
            if (!super.r()) {
                return false;
            }
            try {
                Class<?> cls = this.f16455a.getClass();
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
                p0.D(th);
                return false;
            }
        }
    }

    private static abstract class e {

        /* renamed from: a, reason: collision with root package name */
        Unsafe f16455a;

        e(Unsafe unsafe) {
            this.f16455a = unsafe;
        }

        public final int a(Class cls) {
            return this.f16455a.arrayBaseOffset(cls);
        }

        public final int b(Class cls) {
            return this.f16455a.arrayIndexScale(cls);
        }

        public abstract boolean c(Object obj, long j10);

        public abstract double d(Object obj, long j10);

        public abstract float e(Object obj, long j10);

        public final int f(Object obj, long j10) {
            return this.f16455a.getInt(obj, j10);
        }

        public final long g(Object obj, long j10) {
            return this.f16455a.getLong(obj, j10);
        }

        public final Object h(Object obj, long j10) {
            return this.f16455a.getObject(obj, j10);
        }

        public final long i(Field field) {
            return this.f16455a.objectFieldOffset(field);
        }

        public abstract void j(Object obj, long j10, boolean z10);

        public abstract void k(Object obj, long j10, byte b10);

        public abstract void l(Object obj, long j10, double d10);

        public abstract void m(Object obj, long j10, float f10);

        public final void n(Object obj, long j10, int i10) {
            this.f16455a.putInt(obj, j10, i10);
        }

        public final void o(Object obj, long j10, long j11) {
            this.f16455a.putLong(obj, j10, j11);
        }

        public final void p(Object obj, long j10, Object obj2) {
            this.f16455a.putObject(obj, j10, obj2);
        }

        public boolean q() {
            Unsafe unsafe = this.f16455a;
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
                p0.D(th);
                return false;
            }
        }

        public boolean r() {
            Unsafe unsafe = this.f16455a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return p0.l() != null;
            } catch (Throwable th) {
                p0.D(th);
                return false;
            }
        }
    }

    static {
        long j10 = j(byte[].class);
        f16439h = j10;
        f16440i = j(boolean[].class);
        f16441j = k(boolean[].class);
        f16442k = j(int[].class);
        f16443l = k(int[].class);
        f16444m = j(long[].class);
        f16445n = k(long[].class);
        f16446o = j(float[].class);
        f16447p = k(float[].class);
        f16448q = j(double[].class);
        f16449r = k(double[].class);
        f16450s = j(Object[].class);
        f16451t = k(Object[].class);
        f16452u = o(l());
        f16453v = (int) (j10 & 7);
        f16454w = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    static Unsafe A() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean B() {
        return f16438g;
    }

    static boolean C() {
        return f16437f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void D(Throwable th) {
        Logger.getLogger(p0.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    static void E(Object obj, long j10, boolean z10) {
        f16436e.j(obj, j10, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void F(Object obj, long j10, boolean z10) {
        I(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void G(Object obj, long j10, boolean z10) {
        J(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    static void H(byte[] bArr, long j10, byte b10) {
        f16436e.k(bArr, f16439h + j10, b10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void I(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int w10 = w(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        M(obj, j11, ((255 & b10) << i10) | (w10 & (~(255 << i10))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void J(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        M(obj, j11, ((255 & b10) << i10) | (w(obj, j11) & (~(255 << i10))));
    }

    static void K(Object obj, long j10, double d10) {
        f16436e.l(obj, j10, d10);
    }

    static void L(Object obj, long j10, float f10) {
        f16436e.m(obj, j10, f10);
    }

    static void M(Object obj, long j10, int i10) {
        f16436e.n(obj, j10, i10);
    }

    static void N(Object obj, long j10, long j11) {
        f16436e.o(obj, j10, j11);
    }

    static void O(Object obj, long j10, Object obj2) {
        f16436e.p(obj, j10, obj2);
    }

    private static boolean P() {
        e eVar = f16436e;
        if (eVar == null) {
            return false;
        }
        return eVar.q();
    }

    private static boolean Q() {
        e eVar = f16436e;
        if (eVar == null) {
            return false;
        }
        return eVar.r();
    }

    static Object i(Class cls) {
        try {
            return f16432a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    private static int j(Class cls) {
        if (f16438g) {
            return f16436e.a(cls);
        }
        return -1;
    }

    private static int k(Class cls) {
        if (f16438g) {
            return f16436e.b(cls);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Field l() {
        Field n10;
        if (AbstractC1537d.c() && (n10 = n(Buffer.class, "effectiveDirectAddress")) != null) {
            return n10;
        }
        Field n11 = n(Buffer.class, "address");
        if (n11 == null || n11.getType() != Long.TYPE) {
            return null;
        }
        return n11;
    }

    static boolean m(Class cls) {
        if (!AbstractC1537d.c()) {
            return false;
        }
        try {
            Class cls2 = f16433b;
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

    private static Field n(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static long o(Field field) {
        e eVar;
        if (field == null || (eVar = f16436e) == null) {
            return -1L;
        }
        return eVar.i(field);
    }

    static boolean p(Object obj, long j10) {
        return f16436e.c(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean q(Object obj, long j10) {
        return s(obj, j10) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean r(Object obj, long j10) {
        return t(obj, j10) != 0;
    }

    private static byte s(Object obj, long j10) {
        return (byte) ((w(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255);
    }

    private static byte t(Object obj, long j10) {
        return (byte) ((w(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255);
    }

    static double u(Object obj, long j10) {
        return f16436e.d(obj, j10);
    }

    static float v(Object obj, long j10) {
        return f16436e.e(obj, j10);
    }

    static int w(Object obj, long j10) {
        return f16436e.f(obj, j10);
    }

    static long x(Object obj, long j10) {
        return f16436e.g(obj, j10);
    }

    private static e y() {
        Unsafe unsafe = f16432a;
        if (unsafe == null) {
            return null;
        }
        if (!AbstractC1537d.c()) {
            return new d(unsafe);
        }
        if (f16434c) {
            return new c(unsafe);
        }
        if (f16435d) {
            return new b(unsafe);
        }
        return null;
    }

    static Object z(Object obj, long j10) {
        return f16436e.h(obj, j10);
    }
}
