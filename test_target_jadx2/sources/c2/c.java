package C2;

import D2.k;
import i2.f;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class c implements f {

    /* renamed from: b, reason: collision with root package name */
    private final Object f871b;

    public c(Object obj) {
        this.f871b = k.d(obj);
    }

    @Override // i2.f
    public void a(MessageDigest messageDigest) {
        messageDigest.update(this.f871b.toString().getBytes(f.f34129a));
    }

    @Override // i2.f
    public boolean equals(Object obj) {
        if (obj instanceof c) {
            return this.f871b.equals(((c) obj).f871b);
        }
        return false;
    }

    @Override // i2.f
    public int hashCode() {
        return this.f871b.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.f871b + '}';
    }
}
