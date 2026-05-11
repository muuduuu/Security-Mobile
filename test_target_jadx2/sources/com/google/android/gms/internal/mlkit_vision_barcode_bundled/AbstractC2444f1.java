package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.f1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2444f1 extends AbstractC2488o0 {
    private static final Map zza = new ConcurrentHashMap();
    private int zzd = -1;
    protected C2544z2 zzc = C2544z2.c();

    private final int A(InterfaceC2460i2 interfaceC2460i2) {
        if (interfaceC2460i2 != null) {
            return interfaceC2460i2.b(this);
        }
        return X1.a().b(getClass()).b(this);
    }

    private static AbstractC2444f1 B(AbstractC2444f1 abstractC2444f1, byte[] bArr, int i10, int i11, Q0 q02) {
        AbstractC2444f1 h10 = abstractC2444f1.h();
        try {
            InterfaceC2460i2 b10 = X1.a().b(h10.getClass());
            b10.j(h10, bArr, 0, i11, new C2502r0(q02));
            b10.f(h10);
            return h10;
        } catch (C2499q1 e10) {
            e10.f(h10);
            throw e10;
        } catch (C2534x2 e11) {
            C2499q1 a10 = e11.a();
            a10.f(h10);
            throw a10;
        } catch (IOException e12) {
            if (e12.getCause() instanceof C2499q1) {
                throw ((C2499q1) e12.getCause());
            }
            C2499q1 c2499q1 = new C2499q1(e12);
            c2499q1.f(h10);
            throw c2499q1;
        } catch (IndexOutOfBoundsException unused) {
            C2499q1 g10 = C2499q1.g();
            g10.f(h10);
            throw g10;
        }
    }

    public static C2439e1 f(P1 p12, Object obj, P1 p13, InterfaceC2459i1 interfaceC2459i1, int i10, P2 p22, Class cls) {
        return new C2439e1(p12, obj, p13, new C2434d1(null, i10, p22, false, false), cls);
    }

    static AbstractC2444f1 g(Class cls) {
        Map map = zza;
        AbstractC2444f1 abstractC2444f1 = (AbstractC2444f1) map.get(cls);
        if (abstractC2444f1 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC2444f1 = (AbstractC2444f1) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (abstractC2444f1 == null) {
            abstractC2444f1 = (AbstractC2444f1) ((AbstractC2444f1) J2.j(cls)).F(6, null, null);
            if (abstractC2444f1 == null) {
                throw new IllegalStateException();
            }
            map.put(cls, abstractC2444f1);
        }
        return abstractC2444f1;
    }

    protected static AbstractC2444f1 i(AbstractC2444f1 abstractC2444f1, byte[] bArr, Q0 q02) {
        AbstractC2444f1 B10 = B(abstractC2444f1, bArr, 0, bArr.length, q02);
        if (B10 == null || B10.z()) {
            return B10;
        }
        C2499q1 a10 = new C2534x2(B10).a();
        a10.f(B10);
        throw a10;
    }

    protected static InterfaceC2469k1 j() {
        return X0.e();
    }

    protected static InterfaceC2469k1 k(InterfaceC2469k1 interfaceC2469k1) {
        int size = interfaceC2469k1.size();
        return interfaceC2469k1.l(size == 0 ? 10 : size + size);
    }

    protected static InterfaceC2474l1 l() {
        return C2449g1.h();
    }

    protected static InterfaceC2484n1 m() {
        return Y1.e();
    }

    protected static InterfaceC2484n1 n(InterfaceC2484n1 interfaceC2484n1) {
        int size = interfaceC2484n1.size();
        return interfaceC2484n1.l(size == 0 ? 10 : size + size);
    }

    static Object o(Method method, Object obj, Object... objArr) {
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

    protected static Object p(P1 p12, String str, Object[] objArr) {
        return new Z1(p12, str, objArr);
    }

    protected static void t(Class cls, AbstractC2444f1 abstractC2444f1) {
        abstractC2444f1.s();
        zza.put(cls, abstractC2444f1);
    }

    protected static final boolean w(AbstractC2444f1 abstractC2444f1, boolean z10) {
        byte byteValue = ((Byte) abstractC2444f1.F(1, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean d10 = X1.a().b(abstractC2444f1.getClass()).d(abstractC2444f1);
        if (z10) {
            abstractC2444f1.F(2, true != d10 ? null : abstractC2444f1, null);
        }
        return d10;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.P1
    public final /* synthetic */ O1 C() {
        return (Z0) F(5, null, null);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.P1
    public final /* synthetic */ O1 D() {
        Z0 z02 = (Z0) F(5, null, null);
        z02.h(this);
        return z02;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.Q1
    public final /* synthetic */ P1 E() {
        return (AbstractC2444f1) F(6, null, null);
    }

    protected abstract Object F(int i10, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.P1
    public final void a(M0 m02) {
        X1.a().b(getClass()).h(this, N0.L(m02));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2488o0
    final int b(InterfaceC2460i2 interfaceC2460i2) {
        if (y()) {
            int A10 = A(interfaceC2460i2);
            if (A10 >= 0) {
                return A10;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + A10);
        }
        int i10 = this.zzd & Integer.MAX_VALUE;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int A11 = A(interfaceC2460i2);
        if (A11 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | A11;
            return A11;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + A11);
    }

    final int c() {
        return X1.a().b(getClass()).e(this);
    }

    protected final Z0 d() {
        return (Z0) F(5, null, null);
    }

    public final Z0 e() {
        Z0 z02 = (Z0) F(5, null, null);
        z02.h(this);
        return z02;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return X1.a().b(getClass()).k(this, (AbstractC2444f1) obj);
    }

    final AbstractC2444f1 h() {
        return (AbstractC2444f1) F(4, null, null);
    }

    public final int hashCode() {
        if (y()) {
            return c();
        }
        int i10 = this.zzb;
        if (i10 != 0) {
            return i10;
        }
        int c10 = c();
        this.zzb = c10;
        return c10;
    }

    protected final void q() {
        X1.a().b(getClass()).f(this);
        s();
    }

    final void s() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final String toString() {
        return R1.a(this, super.toString());
    }

    final void v(int i10) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.P1
    public final int x() {
        int i10;
        if (y()) {
            i10 = A(null);
            if (i10 < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + i10);
            }
        } else {
            i10 = this.zzd & Integer.MAX_VALUE;
            if (i10 == Integer.MAX_VALUE) {
                i10 = A(null);
                if (i10 < 0) {
                    throw new IllegalStateException("serialized size must be non-negative, was " + i10);
                }
                this.zzd = (this.zzd & Integer.MIN_VALUE) | i10;
            }
        }
        return i10;
    }

    final boolean y() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.Q1
    public final boolean z() {
        return w(this, true);
    }
}
