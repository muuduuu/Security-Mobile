package p2;

import i2.h;
import java.io.InputStream;
import java.net.URL;
import o2.n;
import o2.o;
import o2.r;

/* loaded from: classes.dex */
public class g implements n {

    /* renamed from: a, reason: collision with root package name */
    private final n f38321a;

    public g(n nVar) {
        this.f38321a = nVar;
    }

    @Override // o2.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a b(URL url, int i10, int i11, h hVar) {
        return this.f38321a.b(new o2.h(url), i10, i11, hVar);
    }

    @Override // o2.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(URL url) {
        return true;
    }

    public static class a implements o {
        @Override // o2.o
        public n e(r rVar) {
            return new g(rVar.d(o2.h.class, InputStream.class));
        }

        @Override // o2.o
        public void d() {
        }
    }
}
