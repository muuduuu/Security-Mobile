package S5;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class b implements Comparable, Serializable {

    /* renamed from: a, reason: collision with root package name */
    private String f8751a;

    /* renamed from: b, reason: collision with root package name */
    private Class f8752b;

    /* renamed from: c, reason: collision with root package name */
    private int f8753c;

    public b(Class cls) {
        this.f8752b = cls;
        String name = cls.getName();
        this.f8751a = name;
        this.f8753c = name.hashCode();
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(b bVar) {
        return this.f8751a.compareTo(bVar.f8751a);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj != null && obj.getClass() == b.class && ((b) obj).f8752b == this.f8752b;
    }

    public int hashCode() {
        return this.f8753c;
    }

    public String toString() {
        return this.f8751a;
    }
}
