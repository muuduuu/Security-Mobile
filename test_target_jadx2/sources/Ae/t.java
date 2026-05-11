package ae;

import ae.r;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import lc.AbstractC3622a;

/* loaded from: classes3.dex */
public final class t implements f {

    /* renamed from: a, reason: collision with root package name */
    private final r f12891a;

    public t(r routePlanner) {
        Intrinsics.checkNotNullParameter(routePlanner, "routePlanner");
        this.f12891a = routePlanner;
    }

    @Override // ae.f
    public l a() {
        r.b g10;
        IOException iOException = null;
        while (!b().e()) {
            try {
                g10 = b().g();
            } catch (IOException e10) {
                if (iOException == null) {
                    iOException = e10;
                } else {
                    AbstractC3622a.a(iOException, e10);
                }
                if (!r.a(b(), null, 1, null)) {
                    throw iOException;
                }
            }
            if (!g10.d()) {
                r.a e11 = g10.e();
                if (e11.f()) {
                    e11 = g10.g();
                }
                r.b a10 = e11.a();
                Throwable b10 = e11.b();
                if (b10 != null) {
                    throw b10;
                }
                if (a10 != null) {
                    b().f().addFirst(a10);
                }
            }
            return g10.c();
        }
        throw new IOException("Canceled");
    }

    @Override // ae.f
    public r b() {
        return this.f12891a;
    }
}
