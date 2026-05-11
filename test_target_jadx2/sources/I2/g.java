package i2;

import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: e, reason: collision with root package name */
    private static final b f34130e = new a();

    /* renamed from: a, reason: collision with root package name */
    private final Object f34131a;

    /* renamed from: b, reason: collision with root package name */
    private final b f34132b;

    /* renamed from: c, reason: collision with root package name */
    private final String f34133c;

    /* renamed from: d, reason: collision with root package name */
    private volatile byte[] f34134d;

    public interface b {
        void a(byte[] bArr, Object obj, MessageDigest messageDigest);
    }

    private g(String str, Object obj, b bVar) {
        this.f34133c = D2.k.b(str);
        this.f34131a = obj;
        this.f34132b = (b) D2.k.d(bVar);
    }

    public static g a(String str, Object obj, b bVar) {
        return new g(str, obj, bVar);
    }

    private static b b() {
        return f34130e;
    }

    private byte[] d() {
        if (this.f34134d == null) {
            this.f34134d = this.f34133c.getBytes(f.f34129a);
        }
        return this.f34134d;
    }

    public static g e(String str) {
        return new g(str, null, b());
    }

    public static g f(String str, Object obj) {
        return new g(str, obj, b());
    }

    public Object c() {
        return this.f34131a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f34133c.equals(((g) obj).f34133c);
        }
        return false;
    }

    public void g(Object obj, MessageDigest messageDigest) {
        this.f34132b.a(d(), obj, messageDigest);
    }

    public int hashCode() {
        return this.f34133c.hashCode();
    }

    public String toString() {
        return "Option{key='" + this.f34133c + "'}";
    }

    class a implements b {
        a() {
        }

        @Override // i2.g.b
        public void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }
}
