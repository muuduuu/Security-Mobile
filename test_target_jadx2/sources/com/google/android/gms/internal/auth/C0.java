package com.google.android.gms.internal.auth;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public abstract class C0 extends AbstractC2036b0 {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected C2087s1 zzc = C2087s1.a();

    static C0 b(Class cls) {
        Map map = zzb;
        C0 c02 = (C0) map.get(cls);
        if (c02 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                c02 = (C0) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (c02 == null) {
            c02 = (C0) ((C0) B1.e(cls)).o(6, null, null);
            if (c02 == null) {
                throw new IllegalStateException();
            }
            map.put(cls, c02);
        }
        return c02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        if (r1 != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected static C0 d(C0 c02, byte[] bArr) {
        byte byteValue;
        C0 p10 = p(c02, bArr, 0, bArr.length, C2095v0.f23780b);
        if (p10 != null && (byteValue = ((Byte) p10.o(1, null, null)).byteValue()) != 1) {
            if (byteValue != 0) {
                boolean e10 = C2058i1.a().b(p10.getClass()).e(p10);
                p10.o(2, true != e10 ? null : p10, null);
            }
            H0 a10 = new C2079p1(p10).a();
            a10.e(p10);
            throw a10;
        }
        return p10;
    }

    protected static E0 e() {
        return C2061j1.e();
    }

    static Object h(Method method, Object obj, Object... objArr) {
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

    protected static Object i(Z0 z02, String str, Object[] objArr) {
        return new C2064k1(z02, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", objArr);
    }

    protected static void l(Class cls, C0 c02) {
        c02.k();
        zzb.put(cls, c02);
    }

    private static C0 p(C0 c02, byte[] bArr, int i10, int i11, C2095v0 c2095v0) {
        C0 c10 = c02.c();
        try {
            InterfaceC2067l1 b10 = C2058i1.a().b(c10.getClass());
            b10.g(c10, bArr, 0, i11, new C2045e0(c2095v0));
            b10.c(c10);
            return c10;
        } catch (H0 e10) {
            e10.e(c10);
            throw e10;
        } catch (C2079p1 e11) {
            H0 a10 = e11.a();
            a10.e(c10);
            throw a10;
        } catch (IOException e12) {
            if (e12.getCause() instanceof H0) {
                throw ((H0) e12.getCause());
            }
            H0 h02 = new H0(e12);
            h02.e(c10);
            throw h02;
        } catch (IndexOutOfBoundsException unused) {
            H0 f10 = H0.f();
            f10.e(c10);
            throw f10;
        }
    }

    final int a() {
        return C2058i1.a().b(getClass()).b(this);
    }

    final C0 c() {
        return (C0) o(4, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return C2058i1.a().b(getClass()).i(this, (C0) obj);
    }

    @Override // com.google.android.gms.internal.auth.InterfaceC2034a1
    public final /* synthetic */ Z0 g() {
        return (C0) o(6, null, null);
    }

    public final int hashCode() {
        if (n()) {
            return a();
        }
        int i10 = this.zza;
        if (i10 != 0) {
            return i10;
        }
        int a10 = a();
        this.zza = a10;
        return a10;
    }

    protected final void j() {
        C2058i1.a().b(getClass()).c(this);
        k();
    }

    final void k() {
        this.zzd &= Integer.MAX_VALUE;
    }

    final void m(int i10) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    final boolean n() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    protected abstract Object o(int i10, Object obj, Object obj2);

    public final String toString() {
        return AbstractC2037b1.a(this, super.toString());
    }
}
