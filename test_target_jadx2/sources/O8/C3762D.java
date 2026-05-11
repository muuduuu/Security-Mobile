package o8;

/* renamed from: o8.D, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3762D {

    /* renamed from: a, reason: collision with root package name */
    private final Class f37965a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f37966b;

    /* renamed from: o8.D$a */
    private @interface a {
    }

    public C3762D(Class cls, Class cls2) {
        this.f37965a = cls;
        this.f37966b = cls2;
    }

    public static C3762D a(Class cls, Class cls2) {
        return new C3762D(cls, cls2);
    }

    public static C3762D b(Class cls) {
        return new C3762D(a.class, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3762D.class != obj.getClass()) {
            return false;
        }
        C3762D c3762d = (C3762D) obj;
        if (this.f37966b.equals(c3762d.f37966b)) {
            return this.f37965a.equals(c3762d.f37965a);
        }
        return false;
    }

    public int hashCode() {
        return (this.f37966b.hashCode() * 31) + this.f37965a.hashCode();
    }

    public String toString() {
        if (this.f37965a == a.class) {
            return this.f37966b.getName();
        }
        return "@" + this.f37965a.getName() + " " + this.f37966b.getName();
    }
}
