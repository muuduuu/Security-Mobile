package C2;

import i2.f;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class b implements f {

    /* renamed from: b, reason: collision with root package name */
    private static final b f870b = new b();

    private b() {
    }

    public static b c() {
        return f870b;
    }

    public String toString() {
        return "EmptySignature";
    }

    @Override // i2.f
    public void a(MessageDigest messageDigest) {
    }
}
