package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.clearcut.a0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2109a0 extends AbstractC2153p {
    private static Map<Object, AbstractC2109a0> zzjr = new ConcurrentHashMap();
    protected Z0 zzjp = Z0.h();
    private int zzjq = -1;

    /* renamed from: com.google.android.gms.internal.clearcut.a0$a */
    public static abstract class a extends AbstractC2156q {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC2109a0 f23989a;

        /* renamed from: b, reason: collision with root package name */
        protected AbstractC2109a0 f23990b;

        /* renamed from: c, reason: collision with root package name */
        protected boolean f23991c = false;

        protected a(AbstractC2109a0 abstractC2109a0) {
            this.f23989a = abstractC2109a0;
            this.f23990b = (AbstractC2109a0) abstractC2109a0.e(c.f23996d, null, null);
        }

        private static void h(AbstractC2109a0 abstractC2109a0, AbstractC2109a0 abstractC2109a02) {
            M0.a().d(abstractC2109a0).f(abstractC2109a0, abstractC2109a02);
        }

        @Override // com.google.android.gms.internal.clearcut.D0
        public final /* synthetic */ B0 a() {
            return this.f23989a;
        }

        public /* synthetic */ Object clone() {
            a aVar = (a) this.f23989a.e(c.f23997e, null, null);
            aVar.b((AbstractC2109a0) Z0());
            return aVar;
        }

        @Override // com.google.android.gms.internal.clearcut.AbstractC2156q
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final a b(AbstractC2109a0 abstractC2109a0) {
            i();
            h(this.f23990b, abstractC2109a0);
            return this;
        }

        protected void i() {
            if (this.f23991c) {
                AbstractC2109a0 abstractC2109a0 = (AbstractC2109a0) this.f23990b.e(c.f23996d, null, null);
                h(abstractC2109a0, this.f23990b);
                this.f23990b = abstractC2109a0;
                this.f23991c = false;
            }
        }

        @Override // com.google.android.gms.internal.clearcut.C0
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public AbstractC2109a0 Z0() {
            if (this.f23991c) {
                return this.f23990b;
            }
            AbstractC2109a0 abstractC2109a0 = this.f23990b;
            M0.a().d(abstractC2109a0).a(abstractC2109a0);
            this.f23991c = true;
            return this.f23990b;
        }

        public final AbstractC2109a0 l() {
            AbstractC2109a0 abstractC2109a0 = (AbstractC2109a0) Z0();
            byte byteValue = ((Byte) abstractC2109a0.e(c.f23993a, null, null)).byteValue();
            boolean z10 = true;
            if (byteValue != 1) {
                if (byteValue == 0) {
                    z10 = false;
                } else {
                    z10 = M0.a().d(abstractC2109a0).i(abstractC2109a0);
                    abstractC2109a0.e(c.f23994b, z10 ? abstractC2109a0 : null, null);
                }
            }
            if (z10) {
                return abstractC2109a0;
            }
            throw new X0(abstractC2109a0);
        }
    }

    /* renamed from: com.google.android.gms.internal.clearcut.a0$b */
    public static class b extends r {

        /* renamed from: b, reason: collision with root package name */
        private AbstractC2109a0 f23992b;

        public b(AbstractC2109a0 abstractC2109a0) {
            this.f23992b = abstractC2109a0;
        }
    }

    /* renamed from: com.google.android.gms.internal.clearcut.a0$c */
    public enum c {

        /* renamed from: a, reason: collision with root package name */
        public static final int f23993a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f23994b = 2;

        /* renamed from: c, reason: collision with root package name */
        public static final int f23995c = 3;

        /* renamed from: d, reason: collision with root package name */
        public static final int f23996d = 4;

        /* renamed from: e, reason: collision with root package name */
        public static final int f23997e = 5;

        /* renamed from: f, reason: collision with root package name */
        public static final int f23998f = 6;

        /* renamed from: g, reason: collision with root package name */
        public static final int f23999g = 7;

        /* renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ int[] f24000h = {1, 2, 3, 4, 5, 6, 7};

        /* renamed from: i, reason: collision with root package name */
        public static final int f24001i = 1;

        /* renamed from: j, reason: collision with root package name */
        public static final int f24002j = 2;

        /* renamed from: k, reason: collision with root package name */
        private static final /* synthetic */ int[] f24003k = {1, 2};

        /* renamed from: l, reason: collision with root package name */
        public static final int f24004l = 1;

        /* renamed from: m, reason: collision with root package name */
        public static final int f24005m = 2;

        /* renamed from: n, reason: collision with root package name */
        private static final /* synthetic */ int[] f24006n = {1, 2};

        public static int[] a() {
            return (int[]) f24000h.clone();
        }
    }

    private static AbstractC2109a0 d(AbstractC2109a0 abstractC2109a0, byte[] bArr) {
        AbstractC2109a0 abstractC2109a02 = (AbstractC2109a0) abstractC2109a0.e(c.f23996d, null, null);
        try {
            M0.a().d(abstractC2109a02).h(abstractC2109a02, bArr, 0, bArr.length, new C2170v());
            M0.a().d(abstractC2109a02).a(abstractC2109a02);
            if (abstractC2109a02.zzex == 0) {
                return abstractC2109a02;
            }
            throw new RuntimeException();
        } catch (IOException e10) {
            if (e10.getCause() instanceof C2127g0) {
                throw ((C2127g0) e10.getCause());
            }
            throw new C2127g0(e10.getMessage()).f(abstractC2109a02);
        } catch (IndexOutOfBoundsException unused) {
            throw C2127g0.a().f(abstractC2109a02);
        }
    }

    protected static Object f(B0 b02, String str, Object[] objArr) {
        return new O0(b02, str, objArr);
    }

    static Object g(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static void h(Class cls, AbstractC2109a0 abstractC2109a0) {
        zzjr.put(cls, abstractC2109a0);
    }

    protected static AbstractC2109a0 i(AbstractC2109a0 abstractC2109a0, byte[] bArr) {
        AbstractC2109a0 d10 = d(abstractC2109a0, bArr);
        if (d10 != null) {
            byte byteValue = ((Byte) d10.e(c.f23993a, null, null)).byteValue();
            boolean z10 = true;
            if (byteValue != 1) {
                if (byteValue == 0) {
                    z10 = false;
                } else {
                    z10 = M0.a().d(d10).i(d10);
                    d10.e(c.f23994b, z10 ? d10 : null, null);
                }
            }
            if (!z10) {
                throw new C2127g0(new X0(d10).getMessage()).f(d10);
            }
        }
        return d10;
    }

    protected static InterfaceC2124f0 j() {
        return N0.e();
    }

    static AbstractC2109a0 k(Class cls) {
        AbstractC2109a0 abstractC2109a0 = zzjr.get(cls);
        if (abstractC2109a0 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC2109a0 = zzjr.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (abstractC2109a0 != null) {
            return abstractC2109a0;
        }
        String name = cls.getName();
        throw new IllegalStateException(name.length() != 0 ? "Unable to get default instance for: ".concat(name) : new String("Unable to get default instance for: "));
    }

    @Override // com.google.android.gms.internal.clearcut.D0
    public final /* synthetic */ B0 a() {
        return (AbstractC2109a0) e(c.f23998f, null, null);
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC2153p
    final void b(int i10) {
        this.zzjq = i10;
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC2153p
    final int c() {
        return this.zzjq;
    }

    protected abstract Object e(int i10, Object obj, Object obj2);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (((AbstractC2109a0) e(c.f23998f, null, null)).getClass().isInstance(obj)) {
            return M0.a().d(this).c(this, (AbstractC2109a0) obj);
        }
        return false;
    }

    public int hashCode() {
        int i10 = this.zzex;
        if (i10 != 0) {
            return i10;
        }
        int d10 = M0.a().d(this).d(this);
        this.zzex = d10;
        return d10;
    }

    @Override // com.google.android.gms.internal.clearcut.B0
    public final int m() {
        if (this.zzjq == -1) {
            this.zzjq = M0.a().d(this).g(this);
        }
        return this.zzjq;
    }

    @Override // com.google.android.gms.internal.clearcut.B0
    public final /* synthetic */ C0 n() {
        a aVar = (a) e(c.f23997e, null, null);
        aVar.b(this);
        return aVar;
    }

    @Override // com.google.android.gms.internal.clearcut.B0
    public final void o(K k10) {
        M0.a().b(getClass()).e(this, M.b(k10));
    }

    @Override // com.google.android.gms.internal.clearcut.B0
    public final /* synthetic */ C0 p() {
        return (a) e(c.f23997e, null, null);
    }

    public String toString() {
        return E0.a(this, super.toString());
    }
}
