package ed;

import dd.C3036m;
import java.io.InputStream;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.protobuf.g;
import lc.t;

/* loaded from: classes3.dex */
public abstract class c {
    public static final Pair a(InputStream inputStream) {
        C3036m c3036m;
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        try {
            C3121a a10 = C3121a.f32551g.a(inputStream);
            if (a10.h()) {
                g d10 = g.d();
                b.a(d10);
                c3036m = C3036m.T(inputStream, d10);
            } else {
                c3036m = null;
            }
            Pair a11 = t.a(c3036m, a10);
            kotlin.io.c.a(inputStream, null);
            return a11;
        } finally {
        }
    }
}
