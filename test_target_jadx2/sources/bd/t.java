package bd;

import Kc.a0;
import cd.C1750a;
import id.C3367b;
import md.C3679f;

/* loaded from: classes3.dex */
public interface t {

    public interface a {
        void a();

        void b(id.f fVar, C3679f c3679f);

        b c(id.f fVar);

        void d(id.f fVar, Object obj);

        a e(id.f fVar, C3367b c3367b);

        void f(id.f fVar, C3367b c3367b, id.f fVar2);
    }

    public interface b {
        void a();

        a b(C3367b c3367b);

        void c(C3367b c3367b, id.f fVar);

        void d(Object obj);

        void e(C3679f c3679f);
    }

    public interface c {
        void a();

        a b(C3367b c3367b, a0 a0Var);
    }

    public interface d {
        c a(id.f fVar, String str, Object obj);

        e b(id.f fVar, String str);
    }

    public interface e extends c {
        a c(int i10, C3367b c3367b, a0 a0Var);
    }

    C1750a a();

    void b(d dVar, byte[] bArr);

    void c(c cVar, byte[] bArr);

    String getLocation();

    C3367b l();
}
