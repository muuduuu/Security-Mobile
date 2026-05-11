package com.google.android.gms.internal.vision;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public abstract class N0 extends X {
    private static Map<Object, N0> zzd = new ConcurrentHashMap();
    protected C2561d2 zzb = C2561d2.a();
    private int zzc = -1;

    protected static class a extends Y {

        /* renamed from: b, reason: collision with root package name */
        private final N0 f25049b;

        public a(N0 n02) {
            this.f25049b = n02;
        }
    }

    public static abstract class b extends W {

        /* renamed from: a, reason: collision with root package name */
        private final N0 f25050a;

        /* renamed from: b, reason: collision with root package name */
        protected N0 f25051b;

        /* renamed from: c, reason: collision with root package name */
        protected boolean f25052c = false;

        protected b(N0 n02) {
            this.f25050a = n02;
            this.f25051b = (N0) n02.j(d.f25056d, null, null);
        }

        private static void l(N0 n02, N0 n03) {
            F1.a().c(n02).f(n02, n03);
        }

        private final b m(byte[] bArr, int i10, int i11, A0 a02) {
            if (this.f25052c) {
                n();
                this.f25052c = false;
            }
            try {
                F1.a().c(this.f25051b).h(this.f25051b, bArr, 0, i11, new C2555c0(a02));
                return this;
            } catch (W0 e10) {
                throw e10;
            } catch (IOException e11) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e11);
            } catch (IndexOutOfBoundsException unused) {
                throw W0.a();
            }
        }

        public /* synthetic */ Object clone() {
            b bVar = (b) this.f25050a.j(d.f25057e, null, null);
            bVar.d((N0) g());
            return bVar;
        }

        @Override // com.google.android.gms.internal.vision.W
        public final /* synthetic */ W h(byte[] bArr, int i10, int i11, A0 a02) {
            return m(bArr, 0, i11, a02);
        }

        @Override // com.google.android.gms.internal.vision.W
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final b d(N0 n02) {
            if (this.f25052c) {
                n();
                this.f25052c = false;
            }
            l(this.f25051b, n02);
            return this;
        }

        protected void n() {
            N0 n02 = (N0) this.f25051b.j(d.f25056d, null, null);
            l(n02, this.f25051b);
            this.f25051b = n02;
        }

        @Override // com.google.android.gms.internal.vision.InterfaceC2618w1
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public N0 g() {
            if (this.f25052c) {
                return this.f25051b;
            }
            N0 n02 = this.f25051b;
            F1.a().c(n02).a(n02);
            this.f25052c = true;
            return this.f25051b;
        }

        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public final N0 q() {
            N0 n02 = (N0) g();
            if (n02.q()) {
                return n02;
            }
            throw new C2553b2(n02);
        }

        @Override // com.google.android.gms.internal.vision.InterfaceC2615v1
        public final /* synthetic */ InterfaceC2609t1 v() {
            return this.f25050a;
        }
    }

    public static class c extends AbstractC2623y0 {
    }

    public enum d {

        /* renamed from: a, reason: collision with root package name */
        public static final int f25053a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f25054b = 2;

        /* renamed from: c, reason: collision with root package name */
        public static final int f25055c = 3;

        /* renamed from: d, reason: collision with root package name */
        public static final int f25056d = 4;

        /* renamed from: e, reason: collision with root package name */
        public static final int f25057e = 5;

        /* renamed from: f, reason: collision with root package name */
        public static final int f25058f = 6;

        /* renamed from: g, reason: collision with root package name */
        public static final int f25059g = 7;

        /* renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ int[] f25060h = {1, 2, 3, 4, 5, 6, 7};

        public static int[] a() {
            return (int[]) f25060h.clone();
        }
    }

    static N0 h(Class cls) {
        N0 n02 = zzd.get(cls);
        if (n02 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                n02 = zzd.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (n02 == null) {
            n02 = (N0) ((N0) h2.c(cls)).j(d.f25058f, null, null);
            if (n02 == null) {
                throw new IllegalStateException();
            }
            zzd.put(cls, n02);
        }
        return n02;
    }

    protected static X0 i(X0 x02) {
        int size = x02.size();
        return x02.b(size == 0 ? 10 : size << 1);
    }

    protected static Object l(InterfaceC2609t1 interfaceC2609t1, String str, Object[] objArr) {
        return new I1(interfaceC2609t1, str, objArr);
    }

    static Object m(Method method, Object obj, Object... objArr) {
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

    protected static void n(Class cls, N0 n02) {
        zzd.put(cls, n02);
    }

    protected static final boolean o(N0 n02, boolean z10) {
        byte byteValue = ((Byte) n02.j(d.f25053a, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean d10 = F1.a().c(n02).d(n02);
        if (z10) {
            n02.j(d.f25054b, d10 ? n02 : null, null);
        }
        return d10;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.vision.P0, com.google.android.gms.internal.vision.V0] */
    protected static V0 r() {
        return P0.j();
    }

    protected static X0 s() {
        return J1.j();
    }

    @Override // com.google.android.gms.internal.vision.InterfaceC2609t1
    public final int A() {
        if (this.zzc == -1) {
            this.zzc = F1.a().c(this).e(this);
        }
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.vision.InterfaceC2609t1
    public final void a(AbstractC2614v0 abstractC2614v0) {
        F1.a().c(this).c(this, C2620x0.O(abstractC2614v0));
    }

    @Override // com.google.android.gms.internal.vision.InterfaceC2609t1
    public final /* synthetic */ InterfaceC2618w1 b() {
        b bVar = (b) j(d.f25057e, null, null);
        bVar.d(this);
        return bVar;
    }

    @Override // com.google.android.gms.internal.vision.X
    final void d(int i10) {
        this.zzc = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return F1.a().c(this).g(this, (N0) obj);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.vision.X
    final int f() {
        return this.zzc;
    }

    public int hashCode() {
        int i10 = this.zza;
        if (i10 != 0) {
            return i10;
        }
        int b10 = F1.a().c(this).b(this);
        this.zza = b10;
        return b10;
    }

    protected abstract Object j(int i10, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.vision.InterfaceC2609t1
    public final /* synthetic */ InterfaceC2618w1 k() {
        return (b) j(d.f25057e, null, null);
    }

    protected final b p() {
        return (b) j(d.f25057e, null, null);
    }

    public final boolean q() {
        return o(this, true);
    }

    public String toString() {
        return AbstractC2624y1.a(this, super.toString());
    }

    @Override // com.google.android.gms.internal.vision.InterfaceC2615v1
    public final /* synthetic */ InterfaceC2609t1 v() {
        return (N0) j(d.f25058f, null, null);
    }
}
