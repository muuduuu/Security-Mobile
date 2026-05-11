package k2;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class s {

    /* renamed from: a, reason: collision with root package name */
    private final Map f36161a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map f36162b = new HashMap();

    s() {
    }

    private Map b(boolean z10) {
        return z10 ? this.f36162b : this.f36161a;
    }

    l a(i2.f fVar, boolean z10) {
        return (l) b(z10).get(fVar);
    }

    void c(i2.f fVar, l lVar) {
        b(lVar.p()).put(fVar, lVar);
    }

    void d(i2.f fVar, l lVar) {
        Map b10 = b(lVar.p());
        if (lVar.equals(b10.get(fVar))) {
            b10.remove(fVar);
        }
    }
}
