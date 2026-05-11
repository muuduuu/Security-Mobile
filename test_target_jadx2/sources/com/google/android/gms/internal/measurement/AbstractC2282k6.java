package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.measurement.k6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC2282k6 {

    /* renamed from: a, reason: collision with root package name */
    private static final Unsafe f24549a;

    /* renamed from: b, reason: collision with root package name */
    private static final Class f24550b;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f24551c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC2273j6 f24552d;

    /* renamed from: e, reason: collision with root package name */
    private static final boolean f24553e;

    /* renamed from: f, reason: collision with root package name */
    private static final boolean f24554f;

    /* renamed from: g, reason: collision with root package name */
    static final long f24555g;

    /* renamed from: h, reason: collision with root package name */
    static final boolean f24556h;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    static {
        boolean z10;
        AbstractC2273j6 abstractC2273j6;
        boolean z11;
        Field b10;
        AbstractC2273j6 abstractC2273j62;
        Unsafe v10 = v();
        f24549a = v10;
        int i10 = AbstractC2387w4.f24680a;
        f24550b = Memory.class;
        Class cls = Long.TYPE;
        boolean w10 = w(cls);
        f24551c = w10;
        boolean w11 = w(Integer.TYPE);
        AbstractC2273j6 abstractC2273j63 = null;
        if (v10 != null) {
            if (w10) {
                abstractC2273j63 = new C2264i6(v10);
            } else if (w11) {
                abstractC2273j63 = new C2255h6(v10);
            }
        }
        f24552d = abstractC2273j63;
        if (abstractC2273j63 != null) {
            try {
                Class<?> cls2 = abstractC2273j63.f24540a.getClass();
                cls2.getMethod("objectFieldOffset", Field.class);
                cls2.getMethod("getLong", Object.class, cls);
            } catch (Throwable th) {
                D(th);
            }
            if (b() != null) {
                z10 = true;
                f24553e = z10;
                abstractC2273j6 = f24552d;
                if (abstractC2273j6 != null) {
                    try {
                        Class<?> cls3 = abstractC2273j6.f24540a.getClass();
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
                        D(th2);
                    }
                    f24554f = z11;
                    f24555g = E(byte[].class);
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
                    if (b10 != null && (abstractC2273j62 = f24552d) != null) {
                        abstractC2273j62.f24540a.objectFieldOffset(b10);
                    }
                    f24556h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
                }
                z11 = false;
                f24554f = z11;
                f24555g = E(byte[].class);
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
                    abstractC2273j62.f24540a.objectFieldOffset(b10);
                }
                f24556h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
            }
        }
        z10 = false;
        f24553e = z10;
        abstractC2273j6 = f24552d;
        if (abstractC2273j6 != null) {
        }
        z11 = false;
        f24554f = z11;
        f24555g = E(byte[].class);
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
        f24556h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    static /* synthetic */ boolean A(Object obj, long j10) {
        return ((byte) ((f24552d.f24540a.getInt(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255)) != 0;
    }

    static /* synthetic */ void D(Throwable th) {
        Logger.getLogger(AbstractC2282k6.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    private static int E(Class cls) {
        if (f24554f) {
            return f24552d.f24540a.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int a(Class cls) {
        if (f24554f) {
            return f24552d.f24540a.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field b() {
        int i10 = AbstractC2387w4.f24680a;
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
        Unsafe unsafe = f24552d.f24540a;
        long j11 = (-4) & j10;
        int i10 = unsafe.getInt(obj, j11);
        int i11 = ((~((int) j10)) & 3) << 3;
        unsafe.putInt(obj, j11, ((255 & b10) << i11) | (i10 & (~(255 << i11))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(Object obj, long j10, byte b10) {
        Unsafe unsafe = f24552d.f24540a;
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        unsafe.putInt(obj, j11, ((255 & b10) << i10) | (unsafe.getInt(obj, j11) & (~(255 << i10))));
    }

    static boolean f() {
        return f24554f;
    }

    static boolean g() {
        return f24553e;
    }

    static Object h(Class cls) {
        try {
            return f24549a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    static int i(Object obj, long j10) {
        return f24552d.f24540a.getInt(obj, j10);
    }

    static void j(Object obj, long j10, int i10) {
        f24552d.f24540a.putInt(obj, j10, i10);
    }

    static long k(Object obj, long j10) {
        return f24552d.f24540a.getLong(obj, j10);
    }

    static void l(Object obj, long j10, long j11) {
        f24552d.f24540a.putLong(obj, j10, j11);
    }

    static boolean m(Object obj, long j10) {
        return f24552d.b(obj, j10);
    }

    static void n(Object obj, long j10, boolean z10) {
        f24552d.c(obj, j10, z10);
    }

    static float o(Object obj, long j10) {
        return f24552d.d(obj, j10);
    }

    static void p(Object obj, long j10, float f10) {
        f24552d.e(obj, j10, f10);
    }

    static double q(Object obj, long j10) {
        return f24552d.f(obj, j10);
    }

    static void r(Object obj, long j10, double d10) {
        f24552d.g(obj, j10, d10);
    }

    static Object s(Object obj, long j10) {
        return f24552d.f24540a.getObject(obj, j10);
    }

    static void t(Object obj, long j10, Object obj2) {
        f24552d.f24540a.putObject(obj, j10, obj2);
    }

    static void u(byte[] bArr, long j10, byte b10) {
        f24552d.a(bArr, f24555g + j10, b10);
    }

    static Unsafe v() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C2246g6());
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean w(Class cls) {
        int i10 = AbstractC2387w4.f24680a;
        try {
            Class cls2 = f24550b;
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

    static /* synthetic */ boolean z(Object obj, long j10) {
        return ((byte) ((f24552d.f24540a.getInt(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255)) != 0;
    }
}
