package m2;

import D2.k;
import D2.l;
import E2.a;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: m2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3648j {

    /* renamed from: a, reason: collision with root package name */
    private final D2.h f37323a = new D2.h(1000);

    /* renamed from: b, reason: collision with root package name */
    private final y0.d f37324b = E2.a.d(10, new a());

    /* renamed from: m2.j$a */
    class a implements a.d {
        a() {
        }

        @Override // E2.a.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b create() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* renamed from: m2.j$b */
    private static final class b implements a.f {

        /* renamed from: a, reason: collision with root package name */
        final MessageDigest f37326a;

        /* renamed from: b, reason: collision with root package name */
        private final E2.c f37327b = E2.c.a();

        b(MessageDigest messageDigest) {
            this.f37326a = messageDigest;
        }

        @Override // E2.a.f
        public E2.c e() {
            return this.f37327b;
        }
    }

    private String a(i2.f fVar) {
        b bVar = (b) k.d(this.f37324b.b());
        try {
            fVar.a(bVar.f37326a);
            return l.x(bVar.f37326a.digest());
        } finally {
            this.f37324b.a(bVar);
        }
    }

    public String b(i2.f fVar) {
        String str;
        synchronized (this.f37323a) {
            str = (String) this.f37323a.g(fVar);
        }
        if (str == null) {
            str = a(fVar);
        }
        synchronized (this.f37323a) {
            this.f37323a.k(fVar, str);
        }
        return str;
    }
}
