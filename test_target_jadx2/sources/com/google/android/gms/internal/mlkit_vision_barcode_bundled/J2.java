package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
abstract class J2 {

    /* renamed from: a, reason: collision with root package name */
    private static final Unsafe f24772a;

    /* renamed from: b, reason: collision with root package name */
    private static final Class f24773b;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f24774c;

    /* renamed from: d, reason: collision with root package name */
    private static final I2 f24775d;

    /* renamed from: e, reason: collision with root package name */
    private static final boolean f24776e;

    /* renamed from: f, reason: collision with root package name */
    private static final boolean f24777f;

    /* renamed from: g, reason: collision with root package name */
    static final long f24778g;

    /* renamed from: h, reason: collision with root package name */
    static final boolean f24779h;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    static {
        boolean z10;
        I2 i22;
        boolean z11;
        Field b10;
        I2 i23;
        Unsafe l10 = l();
        f24772a = l10;
        int i10 = AbstractC2498q0.f24908a;
        f24773b = Memory.class;
        Class cls = Long.TYPE;
        boolean A10 = A(cls);
        f24774c = A10;
        boolean A11 = A(Integer.TYPE);
        I2 i24 = null;
        if (l10 != null) {
            if (A10) {
                i24 = new H2(l10);
            } else if (A11) {
                i24 = new G2(l10);
            }
        }
        f24775d = i24;
        if (i24 != null) {
            try {
                Class<?> cls2 = i24.f24766a.getClass();
                cls2.getMethod("objectFieldOffset", Field.class);
                cls2.getMethod("getLong", Object.class, cls);
            } catch (Throwable th) {
                m(th);
            }
            if (b() != null) {
                z10 = true;
                f24776e = z10;
                i22 = f24775d;
                if (i22 != null) {
                    try {
                        Class<?> cls3 = i22.f24766a.getClass();
                        cls3.getMethod("objectFieldOffset", Field.class);
                        cls3.getMethod("arrayBaseOffset", Class.class);
                        cls3.getMethod("arrayIndexScale", Class.class);
                        Class cls4 = Long.TYPE;
                        cls3.getMethod("getInt", Object.class, cls4);
                        cls3.getMethod("putInt", Object.class, cls4, Integer.TYPE);
                        cls3.getMethod("getLong", Object.class, cls4);
                        cls3.getMethod("putLong", Object.class, cls4, cls4);
                        cls3.getMethod("getObject", Object.class, cls4);
                        cls3.getMethod("putObject", Object.class, cls4, Object.class);
                        z11 = true;
                    } catch (Throwable th2) {
                        m(th2);
                    }
                    f24777f = z11;
                    f24778g = E(byte[].class);
                    E(boolean[].class);
                    a(boolean[].class);
                    E(int[].class);
                    a(int[].class);
                    E(long[].class);
                    a(long[].class);
                    E(float[].class);
                    a(float[].class);
                    E(double[].class);
                    a(double[].class);
                    E(Object[].class);
                    a(Object[].class);
                    b10 = b();
                    if (b10 != null && (i23 = f24775d) != null) {
                        i23.f24766a.objectFieldOffset(b10);
                    }
                    f24779h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
                }
                z11 = false;
                f24777f = z11;
                f24778g = E(byte[].class);
                E(boolean[].class);
                a(boolean[].class);
                E(int[].class);
                a(int[].class);
                E(long[].class);
                a(long[].class);
                E(float[].class);
                a(float[].class);
                E(double[].class);
                a(double[].class);
                E(Object[].class);
                a(Object[].class);
                b10 = b();
                if (b10 != null) {
                    i23.f24766a.objectFieldOffset(b10);
                }
                f24779h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
            }
        }
        z10 = false;
        f24776e = z10;
        i22 = f24775d;
        if (i22 != null) {
        }
        z11 = false;
        f24777f = z11;
        f24778g = E(byte[].class);
        E(boolean[].class);
        a(boolean[].class);
        E(int[].class);
        a(int[].class);
        E(long[].class);
        a(long[].class);
        E(float[].class);
        a(float[].class);
        E(double[].class);
        a(double[].class);
        E(Object[].class);
        a(Object[].class);
        b10 = b();
        if (b10 != null) {
        }
        f24779h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    static boolean A(Class cls) {
        int i10 = AbstractC2498q0.f24908a;
        try {
            Class cls2 = f24773b;
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

    static boolean B(Object obj, long j10) {
        return f24775d.g(obj, j10);
    }

    static boolean C() {
        return f24777f;
    }

    static boolean D() {
        return f24776e;
    }

    private static int E(Class cls) {
        if (f24777f) {
            return f24775d.f24766a.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int a(Class cls) {
        if (f24777f) {
            return f24775d.f24766a.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field b() {
        int i10 = AbstractC2498q0.f24908a;
        Field c10 = c(Buffer.class, "effectiveDirectAddress");
        if (c10 != null) {
            return c10;
        }
        Field c11 = c(Buffer.class, "address");
        if (c11 == null || c11.getType() != Long.TYPE) {
            return null;
        }
        return c11;
    }

    private static Field c(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(Object obj, long j10, byte b10) {
        I2 i22 = f24775d;
        long j11 = (-4) & j10;
        int i10 = i22.f24766a.getInt(obj, j11);
        int i11 = ((~((int) j10)) & 3) << 3;
        i22.f24766a.putInt(obj, j11, ((255 & b10) << i11) | (i10 & (~(255 << i11))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(Object obj, long j10, byte b10) {
        I2 i22 = f24775d;
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        i22.f24766a.putInt(obj, j11, ((255 & b10) << i10) | (i22.f24766a.getInt(obj, j11) & (~(255 << i10))));
    }

    static double f(Object obj, long j10) {
        return f24775d.a(obj, j10);
    }

    static float g(Object obj, long j10) {
        return f24775d.b(obj, j10);
    }

    static int h(Object obj, long j10) {
        return f24775d.f24766a.getInt(obj, j10);
    }

    static long i(Object obj, long j10) {
        return f24775d.f24766a.getLong(obj, j10);
    }

    static Object j(Class cls) {
        try {
            return f24772a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    static Object k(Object obj, long j10) {
        return f24775d.f24766a.getObject(obj, j10);
    }

    static Unsafe l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new F2());
        } catch (Throwable unused) {
            return null;
        }
    }

    static /* bridge */ /* synthetic */ void m(Throwable th) {
        Logger.getLogger(J2.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    static void r(Object obj, long j10, boolean z10) {
        f24775d.c(obj, j10, z10);
    }

    static void s(byte[] bArr, long j10, byte b10) {
        f24775d.d(bArr, f24778g + j10, b10);
    }

    static void t(Object obj, long j10, double d10) {
        f24775d.e(obj, j10, d10);
    }

    static void u(Object obj, long j10, float f10) {
        f24775d.f(obj, j10, f10);
    }

    static void v(Object obj, long j10, int i10) {
        f24775d.f24766a.putInt(obj, j10, i10);
    }

    static void w(Object obj, long j10, long j11) {
        f24775d.f24766a.putLong(obj, j10, j11);
    }

    static void x(Object obj, long j10, Object obj2) {
        f24775d.f24766a.putObject(obj, j10, obj2);
    }

    static /* bridge */ /* synthetic */ boolean y(Object obj, long j10) {
        return ((byte) ((f24775d.f24766a.getInt(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255)) != 0;
    }

    static /* bridge */ /* synthetic */ boolean z(Object obj, long j10) {
        return ((byte) ((f24775d.f24766a.getInt(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255)) != 0;
    }
}
