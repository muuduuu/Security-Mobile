package D2;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private Class f1199a;

    /* renamed from: b, reason: collision with root package name */
    private Class f1200b;

    /* renamed from: c, reason: collision with root package name */
    private Class f1201c;

    public j() {
    }

    public void a(Class cls, Class cls2, Class cls3) {
        this.f1199a = cls;
        this.f1200b = cls2;
        this.f1201c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        return this.f1199a.equals(jVar.f1199a) && this.f1200b.equals(jVar.f1200b) && l.e(this.f1201c, jVar.f1201c);
    }

    public int hashCode() {
        int hashCode = ((this.f1199a.hashCode() * 31) + this.f1200b.hashCode()) * 31;
        Class cls = this.f1201c;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        return "MultiClassKey{first=" + this.f1199a + ", second=" + this.f1200b + '}';
    }

    public j(Class cls, Class cls2, Class cls3) {
        a(cls, cls2, cls3);
    }
}
