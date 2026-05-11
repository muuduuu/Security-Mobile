package s6;

/* renamed from: s6.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4317c {

    /* renamed from: a, reason: collision with root package name */
    private final String f40785a;

    private C4317c(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f40785a = str;
    }

    public static C4317c b(String str) {
        return new C4317c(str);
    }

    public String a() {
        return this.f40785a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4317c) {
            return this.f40785a.equals(((C4317c) obj).f40785a);
        }
        return false;
    }

    public int hashCode() {
        return this.f40785a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Encoding{name=\"" + this.f40785a + "\"}";
    }
}
