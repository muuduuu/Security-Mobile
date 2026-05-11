package Ee;

import De.f;
import Td.G;
import com.google.gson.e;
import com.google.gson.u;

/* loaded from: classes3.dex */
final class c implements f {

    /* renamed from: a, reason: collision with root package name */
    private final e f2160a;

    /* renamed from: b, reason: collision with root package name */
    private final u f2161b;

    c(e eVar, u uVar) {
        this.f2160a = eVar;
        this.f2161b = uVar;
    }

    @Override // De.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Object a(G g10) {
        try {
            return this.f2161b.b(this.f2160a.q(g10.c()));
        } finally {
            g10.close();
        }
    }
}
