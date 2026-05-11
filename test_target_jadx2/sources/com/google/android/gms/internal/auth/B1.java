package com.google.android.gms.internal.auth;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
abstract class B1 {

    /* renamed from: a, reason: collision with root package name */
    private static final Unsafe f23585a;

    /* renamed from: b, reason: collision with root package name */
    private static final Class f23586b;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f23587c;

    /* renamed from: d, reason: collision with root package name */
    private static final A1 f23588d;

    /* renamed from: e, reason: collision with root package name */
    private static final boolean f23589e;

    /* renamed from: f, reason: collision with root package name */
    private static final boolean f23590f;

    /* renamed from: g, reason: collision with root package name */
    static final boolean f23591g;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    static {
        boolean z10;
        A1 a12;
        boolean z11;
        Field y10;
        A1 a13;
        Unsafe g10 = g();
        f23585a = g10;
        int i10 = AbstractC2042d0.f23685a;
        f23586b = Memory.class;
        Class cls = Long.TYPE;
        boolean s10 = s(cls);
        f23587c = s10;
        boolean s11 = s(Integer.TYPE);
        A1 a14 = null;
        if (g10 != null) {
            if (s10) {
                a14 = new z1(g10);
            } else if (s11) {
                a14 = new C2105y1(g10);
            }
        }
        f23588d = a14;
        if (a14 != null) {
            try {
                Class<?> cls2 = a14.f23581a.getClass();
                cls2.getMethod("objectFieldOffset", Field.class);
                cls2.getMethod("getLong", Object.class, cls);
            } catch (Throwable th) {
                h(th);
            }
            if (y() != null) {
                z10 = true;
                f23589e = z10;
                a12 = f23588d;
                if (a12 != null) {
                    try {
                        Class<?> cls3 = a12.f23581a.getClass();
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
                        h(th2);
                    }
                    f23590f = z11;
                    w(byte[].class);
                    w(boolean[].class);
                    x(boolean[].class);
                    w(int[].class);
                    x(int[].class);
                    w(long[].class);
                    x(long[].class);
                    w(float[].class);
                    x(float[].class);
                    w(double[].class);
                    x(double[].class);
                    w(Object[].class);
                    x(Object[].class);
                    y10 = y();
                    if (y10 != null && (a13 = f23588d) != null) {
                        a13.f23581a.objectFieldOffset(y10);
                    }
                    f23591g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
                }
                z11 = false;
                f23590f = z11;
                w(byte[].class);
                w(boolean[].class);
                x(boolean[].class);
                w(int[].class);
                x(int[].class);
                w(long[].class);
                x(long[].class);
                w(float[].class);
                x(float[].class);
                w(double[].class);
                x(double[].class);
                w(Object[].class);
                x(Object[].class);
                y10 = y();
                if (y10 != null) {
                    a13.f23581a.objectFieldOffset(y10);
                }
                f23591g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
            }
        }
        z10 = false;
        f23589e = z10;
        a12 = f23588d;
        if (a12 != null) {
        }
        z11 = false;
        f23590f = z11;
        w(byte[].class);
        w(boolean[].class);
        x(boolean[].class);
        w(int[].class);
        x(int[].class);
        w(long[].class);
        x(long[].class);
        w(float[].class);
        x(float[].class);
        w(double[].class);
        x(double[].class);
        w(Object[].class);
        x(Object[].class);
        y10 = y();
        if (y10 != null) {
        }
        f23591g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    static double a(Object obj, long j10) {
        return f23588d.a(obj, j10);
    }

    static float b(Object obj, long j10) {
        return f23588d.b(obj, j10);
    }

    static int c(Object obj, long j10) {
        return f23588d.f23581a.getInt(obj, j10);
    }

    static long d(Object obj, long j10) {
        return f23588d.f23581a.getLong(obj, j10);
    }

    static Object e(Class cls) {
        try {
            return f23585a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    static Object f(Object obj, long j10) {
        return f23588d.f23581a.getObject(obj, j10);
    }

    static Unsafe g() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C2102x1());
        } catch (Throwable unused) {
            return null;
        }
    }

    static /* bridge */ /* synthetic */ void h(Throwable th) {
        Logger.getLogger(B1.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    static /* synthetic */ void i(Object obj, long j10, boolean z10) {
        A1 a12 = f23588d;
        long j11 = (-4) & j10;
        int i10 = a12.f23581a.getInt(obj, j11);
        int i11 = ((~((int) j10)) & 3) << 3;
        a12.f23581a.putInt(obj, j11, ((z10 ? 1 : 0) << i11) | ((~(255 << i11)) & i10));
    }

    static /* synthetic */ void j(Object obj, long j10, boolean z10) {
        A1 a12 = f23588d;
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        a12.f23581a.putInt(obj, j11, ((z10 ? 1 : 0) << i10) | ((~(255 << i10)) & a12.f23581a.getInt(obj, j11)));
    }

    static void k(Object obj, long j10, boolean z10) {
        f23588d.c(obj, j10, z10);
    }

    static void l(Object obj, long j10, double d10) {
        f23588d.d(obj, j10, d10);
    }

    static void m(Object obj, long j10, float f10) {
        f23588d.e(obj, j10, f10);
    }

    static void n(Object obj, long j10, int i10) {
        f23588d.f23581a.putInt(obj, j10, i10);
    }

    static void o(Object obj, long j10, long j11) {
        f23588d.f23581a.putLong(obj, j10, j11);
    }

    static void p(Object obj, long j10, Object obj2) {
        f23588d.f23581a.putObject(obj, j10, obj2);
    }

    static /* bridge */ /* synthetic */ boolean q(Object obj, long j10) {
        return ((byte) ((f23588d.f23581a.getInt(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255)) != 0;
    }

    static /* bridge */ /* synthetic */ boolean r(Object obj, long j10) {
        return ((byte) ((f23588d.f23581a.getInt(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255)) != 0;
    }

    static boolean s(Class cls) {
        int i10 = AbstractC2042d0.f23685a;
        try {
            Class cls2 = f23586b;
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

    static boolean t(Object obj, long j10) {
        return f23588d.f(obj, j10);
    }

    static boolean u() {
        return f23590f;
    }

    static boolean v() {
        return f23589e;
    }

    private static int w(Class cls) {
        if (f23590f) {
            return f23588d.f23581a.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int x(Class cls) {
        if (f23590f) {
            return f23588d.f23581a.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field y() {
        int i10 = AbstractC2042d0.f23685a;
        Field z10 = z(Buffer.class, "effectiveDirectAddress");
        if (z10 != null) {
            return z10;
        }
        Field z11 = z(Buffer.class, "address");
        if (z11 == null || z11.getType() != Long.TYPE) {
            return null;
        }
        return z11;
    }

    private static Field z(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
