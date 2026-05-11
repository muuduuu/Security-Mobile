package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.InputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.a;

/* loaded from: classes3.dex */
public abstract class b implements r {

    /* renamed from: a, reason: collision with root package name */
    private static final g f36463a = g.c();

    private p d(p pVar) {
        if (pVar == null || pVar.a()) {
            return pVar;
        }
        throw e(pVar).a().i(pVar);
    }

    private v e(p pVar) {
        return pVar instanceof a ? ((a) pVar).e() : new v(pVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.r
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public p c(InputStream inputStream, g gVar) {
        return d(h(inputStream, gVar));
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.r
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public p a(InputStream inputStream, g gVar) {
        return d(i(inputStream, gVar));
    }

    public p h(InputStream inputStream, g gVar) {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            return i(new a.AbstractC0531a.C0532a(inputStream, e.A(read, inputStream)), gVar);
        } catch (IOException e10) {
            throw new k(e10.getMessage());
        }
    }

    public p i(InputStream inputStream, g gVar) {
        e g10 = e.g(inputStream);
        p pVar = (p) b(g10, gVar);
        try {
            g10.a(0);
            return pVar;
        } catch (k e10) {
            throw e10.i(pVar);
        }
    }
}
