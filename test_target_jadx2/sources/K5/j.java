package K5;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* loaded from: classes2.dex */
public final class j extends n implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    protected final transient Method f5397d;

    /* renamed from: e, reason: collision with root package name */
    protected Class[] f5398e;

    public j(G g10, Method method, p pVar, p[] pVarArr) {
        super(g10, pVar, pVarArr);
        if (method == null) {
            throw new IllegalArgumentException("Cannot construct AnnotatedMethod with null Method");
        }
        this.f5397d = method;
    }

    @Override // K5.AbstractC0921b
    public String c() {
        return this.f5397d.getName();
    }

    @Override // K5.AbstractC0921b
    public Class d() {
        return this.f5397d.getReturnType();
    }

    @Override // K5.AbstractC0921b
    public D5.j e() {
        return this.f5395a.a(this.f5397d.getGenericReturnType());
    }

    @Override // K5.AbstractC0921b
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!T5.f.D(obj, j.class)) {
            return false;
        }
        Method method = ((j) obj).f5397d;
        return method == null ? this.f5397d == null : method.equals(this.f5397d);
    }

    @Override // K5.AbstractC0921b
    public int hashCode() {
        return this.f5397d.getName().hashCode();
    }

    @Override // K5.AbstractC0928i
    public Class j() {
        return this.f5397d.getDeclaringClass();
    }

    @Override // K5.AbstractC0928i
    public String k() {
        String k10 = super.k();
        int u10 = u();
        if (u10 == 0) {
            return k10 + "()";
        }
        if (u10 != 1) {
            return String.format("%s(%d params)", super.k(), Integer.valueOf(u()));
        }
        return k10 + "(" + v(0).getName() + ")";
    }

    @Override // K5.AbstractC0928i
    public Object m(Object obj) {
        try {
            return this.f5397d.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new IllegalArgumentException("Failed to getValue() with method " + k() + ": " + T5.f.m(e10), e10);
        }
    }

    @Override // K5.n
    public D5.j q(int i10) {
        Type[] genericParameterTypes = this.f5397d.getGenericParameterTypes();
        if (i10 >= genericParameterTypes.length) {
            return null;
        }
        return this.f5395a.a(genericParameterTypes[i10]);
    }

    public Method s() {
        return this.f5397d;
    }

    @Override // K5.AbstractC0928i
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public Method l() {
        return this.f5397d;
    }

    public String toString() {
        return "[method " + k() + "]";
    }

    public int u() {
        return w().length;
    }

    public Class v(int i10) {
        Class[] w10 = w();
        if (i10 >= w10.length) {
            return null;
        }
        return w10[i10];
    }

    public Class[] w() {
        if (this.f5398e == null) {
            this.f5398e = this.f5397d.getParameterTypes();
        }
        return this.f5398e;
    }

    public Class x() {
        return this.f5397d.getReturnType();
    }

    @Override // K5.AbstractC0928i
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public j n(p pVar) {
        return new j(this.f5395a, this.f5397d, pVar, this.f5408c);
    }
}
