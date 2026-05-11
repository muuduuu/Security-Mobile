package D5;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class j extends B5.a implements Serializable, Type {

    /* renamed from: a, reason: collision with root package name */
    protected final Class f1258a;

    /* renamed from: b, reason: collision with root package name */
    protected final int f1259b;

    /* renamed from: c, reason: collision with root package name */
    protected final Object f1260c;

    /* renamed from: d, reason: collision with root package name */
    protected final Object f1261d;

    /* renamed from: e, reason: collision with root package name */
    protected final boolean f1262e;

    protected j(Class cls, int i10, Object obj, Object obj2, boolean z10) {
        this.f1258a = cls;
        this.f1259b = cls.getName().hashCode() + i10;
        this.f1260c = obj;
        this.f1261d = obj2;
        this.f1262e = z10;
    }

    public abstract boolean A();

    public final boolean B() {
        return T5.f.G(this.f1258a) && this.f1258a != Enum.class;
    }

    public final boolean C() {
        return T5.f.G(this.f1258a);
    }

    public final boolean D() {
        return Modifier.isFinal(this.f1258a.getModifiers());
    }

    public final boolean E() {
        return this.f1258a.isInterface();
    }

    public final boolean F() {
        return this.f1258a == Object.class;
    }

    public boolean G() {
        return false;
    }

    public final boolean H() {
        return this.f1258a.isPrimitive();
    }

    public final boolean I() {
        return T5.f.N(this.f1258a);
    }

    public final boolean J(Class cls) {
        Class cls2 = this.f1258a;
        return cls2 == cls || cls.isAssignableFrom(cls2);
    }

    public final boolean K(Class cls) {
        Class cls2 = this.f1258a;
        return cls2 == cls || cls2.isAssignableFrom(cls);
    }

    public abstract j L(Class cls, S5.n nVar, j jVar, j[] jVarArr);

    public final boolean M() {
        return this.f1262e;
    }

    public abstract j N(j jVar);

    public abstract j O(Object obj);

    public j P(j jVar) {
        Object t10 = jVar.t();
        j R10 = t10 != this.f1261d ? R(t10) : this;
        Object u10 = jVar.u();
        return u10 != this.f1260c ? R10.S(u10) : R10;
    }

    public abstract j Q();

    public abstract j R(Object obj);

    public abstract j S(Object obj);

    public abstract boolean equals(Object obj);

    public abstract j f(int i10);

    public abstract int g();

    public j h(int i10) {
        j f10 = f(i10);
        return f10 == null ? S5.o.H() : f10;
    }

    public final int hashCode() {
        return this.f1259b;
    }

    public abstract j i(Class cls);

    public abstract S5.n j();

    public j k() {
        return null;
    }

    public abstract StringBuilder l(StringBuilder sb2);

    public String m() {
        StringBuilder sb2 = new StringBuilder(40);
        n(sb2);
        return sb2.toString();
    }

    public abstract StringBuilder n(StringBuilder sb2);

    public abstract List o();

    public j p() {
        return null;
    }

    public final Class q() {
        return this.f1258a;
    }

    @Override // B5.a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public j a() {
        return null;
    }

    public abstract j s();

    public Object t() {
        return this.f1261d;
    }

    public Object u() {
        return this.f1260c;
    }

    public boolean v() {
        return g() > 0;
    }

    public boolean w() {
        return (this.f1261d == null && this.f1260c == null) ? false : true;
    }

    public final boolean x(Class cls) {
        return this.f1258a == cls;
    }

    public boolean y() {
        return false;
    }

    public boolean z() {
        return false;
    }
}
