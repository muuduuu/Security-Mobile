package androidx.versionedparcelable;

import android.os.Parcelable;
import j0.C3476a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import t1.InterfaceC4604a;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    protected final C3476a f17927a;

    /* renamed from: b, reason: collision with root package name */
    protected final C3476a f17928b;

    /* renamed from: c, reason: collision with root package name */
    protected final C3476a f17929c;

    public a(C3476a c3476a, C3476a c3476a2, C3476a c3476a3) {
        this.f17927a = c3476a;
        this.f17928b = c3476a2;
        this.f17929c = c3476a3;
    }

    private void N(InterfaceC4604a interfaceC4604a) {
        try {
            I(c(interfaceC4604a.getClass()).getName());
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException(interfaceC4604a.getClass().getSimpleName() + " does not have a Parcelizer", e10);
        }
    }

    private Class c(Class cls) {
        Class cls2 = (Class) this.f17929c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.f17929c.put(cls.getName(), cls3);
        return cls3;
    }

    private Method d(String str) {
        Method method = (Method) this.f17927a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, a.class.getClassLoader()).getDeclaredMethod("read", a.class);
        this.f17927a.put(str, declaredMethod);
        return declaredMethod;
    }

    private Method e(Class cls) {
        Method method = (Method) this.f17928b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class c10 = c(cls);
        System.currentTimeMillis();
        Method declaredMethod = c10.getDeclaredMethod("write", cls, a.class);
        this.f17928b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    protected abstract void A(byte[] bArr);

    public void B(byte[] bArr, int i10) {
        w(i10);
        A(bArr);
    }

    protected abstract void C(CharSequence charSequence);

    public void D(CharSequence charSequence, int i10) {
        w(i10);
        C(charSequence);
    }

    protected abstract void E(int i10);

    public void F(int i10, int i11) {
        w(i11);
        E(i10);
    }

    protected abstract void G(Parcelable parcelable);

    public void H(Parcelable parcelable, int i10) {
        w(i10);
        G(parcelable);
    }

    protected abstract void I(String str);

    public void J(String str, int i10) {
        w(i10);
        I(str);
    }

    protected void K(InterfaceC4604a interfaceC4604a, a aVar) {
        try {
            e(interfaceC4604a.getClass()).invoke(null, interfaceC4604a, aVar);
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e10);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e12);
        } catch (InvocationTargetException e13) {
            if (!(e13.getCause() instanceof RuntimeException)) {
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e13);
            }
            throw ((RuntimeException) e13.getCause());
        }
    }

    protected void L(InterfaceC4604a interfaceC4604a) {
        if (interfaceC4604a == null) {
            I(null);
            return;
        }
        N(interfaceC4604a);
        a b10 = b();
        K(interfaceC4604a, b10);
        b10.a();
    }

    public void M(InterfaceC4604a interfaceC4604a, int i10) {
        w(i10);
        L(interfaceC4604a);
    }

    protected abstract void a();

    protected abstract a b();

    public boolean f() {
        return false;
    }

    protected abstract boolean g();

    public boolean h(boolean z10, int i10) {
        return !m(i10) ? z10 : g();
    }

    protected abstract byte[] i();

    public byte[] j(byte[] bArr, int i10) {
        return !m(i10) ? bArr : i();
    }

    protected abstract CharSequence k();

    public CharSequence l(CharSequence charSequence, int i10) {
        return !m(i10) ? charSequence : k();
    }

    protected abstract boolean m(int i10);

    protected InterfaceC4604a n(String str, a aVar) {
        try {
            return (InterfaceC4604a) d(str).invoke(null, aVar);
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e10);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e12);
        } catch (InvocationTargetException e13) {
            if (e13.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e13.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e13);
        }
    }

    protected abstract int o();

    public int p(int i10, int i11) {
        return !m(i11) ? i10 : o();
    }

    protected abstract Parcelable q();

    public Parcelable r(Parcelable parcelable, int i10) {
        return !m(i10) ? parcelable : q();
    }

    protected abstract String s();

    public String t(String str, int i10) {
        return !m(i10) ? str : s();
    }

    protected InterfaceC4604a u() {
        String s10 = s();
        if (s10 == null) {
            return null;
        }
        return n(s10, b());
    }

    public InterfaceC4604a v(InterfaceC4604a interfaceC4604a, int i10) {
        return !m(i10) ? interfaceC4604a : u();
    }

    protected abstract void w(int i10);

    public void x(boolean z10, boolean z11) {
    }

    protected abstract void y(boolean z10);

    public void z(boolean z10, int i10) {
        w(i10);
        y(z10);
    }
}
