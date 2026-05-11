package Z3;

import Z3.n;
import Z3.x;
import g4.InterfaceC3190e;

/* loaded from: classes.dex */
public class l implements InterfaceC1324a {

    class a implements D {
        a() {
        }

        @Override // Z3.D
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int a(InterfaceC3190e interfaceC3190e) {
            return interfaceC3190e.M();
        }
    }

    @Override // Z3.InterfaceC1324a
    public n a(b3.o oVar, e3.d dVar, x.a aVar, boolean z10, boolean z11, n.b bVar) {
        w wVar = new w(new a(), aVar, oVar, bVar, z10, z11);
        dVar.a(wVar);
        return wVar;
    }
}
