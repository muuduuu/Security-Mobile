package com.google.android.gms.internal.measurement;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.measurement.g5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2245g5 extends AbstractC2369u4 {
    private static final Map zzd = new ConcurrentHashMap();
    private int zzb = -1;
    protected C2228e6 zzc = C2228e6.a();

    private static final boolean A(AbstractC2245g5 abstractC2245g5, boolean z10) {
        byte byteValue = ((Byte) abstractC2245g5.B(1, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean d10 = P5.a().b(abstractC2245g5.getClass()).d(abstractC2245g5);
        if (z10) {
            abstractC2245g5.B(2, true != d10 ? null : abstractC2245g5, null);
        }
        return d10;
    }

    private final int g(S5 s52) {
        return P5.a().b(getClass()).c(this);
    }

    static AbstractC2245g5 r(Class cls) {
        Map map = zzd;
        AbstractC2245g5 abstractC2245g5 = (AbstractC2245g5) map.get(cls);
        if (abstractC2245g5 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC2245g5 = (AbstractC2245g5) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (abstractC2245g5 == null) {
            abstractC2245g5 = (AbstractC2245g5) ((AbstractC2245g5) AbstractC2282k6.h(cls)).B(6, null, null);
            if (abstractC2245g5 == null) {
                throw new IllegalStateException();
            }
            map.put(cls, abstractC2245g5);
        }
        return abstractC2245g5;
    }

    protected static void s(Class cls, AbstractC2245g5 abstractC2245g5) {
        abstractC2245g5.k();
        zzd.put(cls, abstractC2245g5);
    }

    protected static Object t(H5 h52, String str, Object[] objArr) {
        return new R5(h52, str, objArr);
    }

    static Object u(Method method, Object obj, Object... objArr) {
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

    protected static InterfaceC2281k5 v() {
        return C2254h5.e();
    }

    protected static InterfaceC2290l5 w() {
        return C2379v5.e();
    }

    protected static InterfaceC2290l5 x(InterfaceC2290l5 interfaceC2290l5) {
        int size = interfaceC2290l5.size();
        return interfaceC2290l5.O1(size + size);
    }

    protected static InterfaceC2299m5 y() {
        return Q5.e();
    }

    protected static InterfaceC2299m5 z(InterfaceC2299m5 interfaceC2299m5) {
        int size = interfaceC2299m5.size();
        return interfaceC2299m5.O1(size + size);
    }

    protected abstract Object B(int i10, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.measurement.H5
    public final int a() {
        int i10;
        if (j()) {
            i10 = g(null);
            if (i10 < 0) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 42);
                sb2.append("serialized size must be non-negative, was ");
                sb2.append(i10);
                throw new IllegalStateException(sb2.toString());
            }
        } else {
            i10 = this.zzb & Integer.MAX_VALUE;
            if (i10 == Integer.MAX_VALUE) {
                i10 = g(null);
                if (i10 < 0) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(i10).length() + 42);
                    sb3.append("serialized size must be non-negative, was ");
                    sb3.append(i10);
                    throw new IllegalStateException(sb3.toString());
                }
                this.zzb = (this.zzb & Integer.MIN_VALUE) | i10;
            }
        }
        return i10;
    }

    @Override // com.google.android.gms.internal.measurement.H5
    public final /* synthetic */ G5 b() {
        return (AbstractC2227e5) B(5, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.H5
    public final void d(O4 o42) {
        P5.a().b(getClass()).h(this, P4.b(o42));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2369u4
    final int e(S5 s52) {
        if (j()) {
            int c10 = s52.c(this);
            if (c10 >= 0) {
                return c10;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(c10).length() + 42);
            sb2.append("serialized size must be non-negative, was ");
            sb2.append(c10);
            throw new IllegalStateException(sb2.toString());
        }
        int i10 = this.zzb & Integer.MAX_VALUE;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int c11 = s52.c(this);
        if (c11 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | c11;
            return c11;
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(c11).length() + 42);
        sb3.append("serialized size must be non-negative, was ");
        sb3.append(c11);
        throw new IllegalStateException(sb3.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return P5.a().b(getClass()).f(this, (AbstractC2245g5) obj);
    }

    @Override // com.google.android.gms.internal.measurement.I5
    public final /* synthetic */ H5 h() {
        return (AbstractC2245g5) B(6, null, null);
    }

    public final int hashCode() {
        if (j()) {
            return m();
        }
        int i10 = this.zza;
        if (i10 != 0) {
            return i10;
        }
        int m10 = m();
        this.zza = m10;
        return m10;
    }

    public final boolean i() {
        return A(this, true);
    }

    final boolean j() {
        return (this.zzb & Integer.MIN_VALUE) != 0;
    }

    final void k() {
        this.zzb &= Integer.MAX_VALUE;
    }

    final AbstractC2245g5 l() {
        return (AbstractC2245g5) B(4, null, null);
    }

    final int m() {
        return P5.a().b(getClass()).a(this);
    }

    protected final void n() {
        P5.a().b(getClass()).g(this);
        k();
    }

    protected final AbstractC2227e5 o() {
        return (AbstractC2227e5) B(5, null, null);
    }

    public final AbstractC2227e5 p() {
        AbstractC2227e5 abstractC2227e5 = (AbstractC2227e5) B(5, null, null);
        abstractC2227e5.w(this);
        return abstractC2227e5;
    }

    final void q(int i10) {
        this.zzb = (this.zzb & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final String toString() {
        return J5.a(this, super.toString());
    }
}
