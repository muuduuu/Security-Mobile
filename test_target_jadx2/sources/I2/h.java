package i2;

import j0.C3476a;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class h implements f {

    /* renamed from: b, reason: collision with root package name */
    private final C3476a f34135b = new D2.b();

    private static void f(g gVar, Object obj, MessageDigest messageDigest) {
        gVar.g(obj, messageDigest);
    }

    @Override // i2.f
    public void a(MessageDigest messageDigest) {
        for (int i10 = 0; i10 < this.f34135b.size(); i10++) {
            f((g) this.f34135b.f(i10), this.f34135b.j(i10), messageDigest);
        }
    }

    public Object c(g gVar) {
        return this.f34135b.containsKey(gVar) ? this.f34135b.get(gVar) : gVar.c();
    }

    public void d(h hVar) {
        this.f34135b.g(hVar.f34135b);
    }

    public h e(g gVar, Object obj) {
        this.f34135b.put(gVar, obj);
        return this;
    }

    @Override // i2.f
    public boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f34135b.equals(((h) obj).f34135b);
        }
        return false;
    }

    @Override // i2.f
    public int hashCode() {
        return this.f34135b.hashCode();
    }

    public String toString() {
        return "Options{values=" + this.f34135b + '}';
    }
}
