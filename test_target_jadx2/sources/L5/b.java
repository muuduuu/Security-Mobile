package l5;

import b4.k;
import b4.o;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f37091a = new b();

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final C3609a f37092a;

        /* renamed from: b, reason: collision with root package name */
        public final C3609a f37093b;

        public a(C3609a c3609a, C3609a c3609a2) {
            this.f37092a = c3609a;
            this.f37093b = c3609a2;
        }
    }

    private b() {
    }

    public static final a a(int i10, int i11, List sources) {
        Intrinsics.checkNotNullParameter(sources, "sources");
        return b(i10, i11, sources, 1.0d);
    }

    public static final a b(int i10, int i11, List sources, double d10) {
        Intrinsics.checkNotNullParameter(sources, "sources");
        if (sources.isEmpty()) {
            return new a(null, null);
        }
        if (sources.size() == 1) {
            return new a((C3609a) sources.get(0), null);
        }
        if (i10 <= 0 || i11 <= 0) {
            return new a(null, null);
        }
        k l10 = o.n().l();
        Intrinsics.checkNotNullExpressionValue(l10, "getImagePipeline(...)");
        double d11 = i10 * i11 * d10;
        Iterator it = sources.iterator();
        double d12 = Double.MAX_VALUE;
        double d13 = Double.MAX_VALUE;
        C3609a c3609a = null;
        C3609a c3609a2 = null;
        while (it.hasNext()) {
            C3609a c3609a3 = (C3609a) it.next();
            double abs = Math.abs(1.0d - (c3609a3.c() / d11));
            if (abs < d12) {
                c3609a2 = c3609a3;
                d12 = abs;
            }
            if (abs < d13 && (l10.p(c3609a3.e()) || l10.r(c3609a3.e()))) {
                c3609a = c3609a3;
                d13 = abs;
            }
        }
        return new a(c3609a2, (c3609a == null || c3609a2 == null || !Intrinsics.b(c3609a.d(), c3609a2.d())) ? c3609a : null);
    }
}
