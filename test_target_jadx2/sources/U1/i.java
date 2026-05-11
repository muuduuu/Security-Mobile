package U1;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    Object f10329a;

    /* renamed from: b, reason: collision with root package name */
    Object f10330b;

    private static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public void b(Object obj, Object obj2) {
        this.f10329a = obj;
        this.f10330b = obj2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof y0.c)) {
            return false;
        }
        y0.c cVar = (y0.c) obj;
        return a(cVar.f45130a, this.f10329a) && a(cVar.f45131b, this.f10330b);
    }

    public int hashCode() {
        Object obj = this.f10329a;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f10330b;
        return hashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f10329a + " " + this.f10330b + "}";
    }
}
