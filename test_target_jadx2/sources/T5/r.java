package T5;

/* loaded from: classes2.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    protected int f9325a;

    /* renamed from: b, reason: collision with root package name */
    protected Class f9326b;

    /* renamed from: c, reason: collision with root package name */
    protected D5.j f9327c;

    /* renamed from: d, reason: collision with root package name */
    protected boolean f9328d;

    public r(Class cls, boolean z10) {
        this.f9326b = cls;
        this.f9327c = null;
        this.f9328d = z10;
        this.f9325a = z10 ? e(cls) : g(cls);
    }

    public static final int d(D5.j jVar) {
        return jVar.hashCode() - 2;
    }

    public static final int e(Class cls) {
        return cls.getName().hashCode() + 1;
    }

    public static final int f(D5.j jVar) {
        return jVar.hashCode() - 1;
    }

    public static final int g(Class cls) {
        return cls.getName().hashCode();
    }

    public Class a() {
        return this.f9326b;
    }

    public D5.j b() {
        return this.f9327c;
    }

    public boolean c() {
        return this.f9328d;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        r rVar = (r) obj;
        if (rVar.f9328d != this.f9328d) {
            return false;
        }
        Class cls = this.f9326b;
        return cls != null ? rVar.f9326b == cls : this.f9327c.equals(rVar.f9327c);
    }

    public final int hashCode() {
        return this.f9325a;
    }

    public final String toString() {
        if (this.f9326b != null) {
            return "{class: " + this.f9326b.getName() + ", typed? " + this.f9328d + "}";
        }
        return "{type: " + this.f9327c + ", typed? " + this.f9328d + "}";
    }

    public r(D5.j jVar, boolean z10) {
        this.f9327c = jVar;
        this.f9326b = null;
        this.f9328d = z10;
        this.f9325a = z10 ? d(jVar) : f(jVar);
    }
}
