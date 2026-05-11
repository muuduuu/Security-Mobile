package y0;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f45130a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f45131b;

    public c(Object obj, Object obj2) {
        this.f45130a = obj;
        this.f45131b = obj2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return b.a(cVar.f45130a, this.f45130a) && b.a(cVar.f45131b, this.f45131b);
    }

    public int hashCode() {
        Object obj = this.f45130a;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f45131b;
        return hashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f45130a + " " + this.f45131b + "}";
    }
}
