package rd;

import Kc.InterfaceC0936h;
import java.util.Collection;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public interface k {

    public static final class a {
        public static /* synthetic */ Collection a(k kVar, d dVar, Function1 function1, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContributedDescriptors");
            }
            if ((i10 & 1) != 0) {
                dVar = d.f40618o;
            }
            if ((i10 & 2) != 0) {
                function1 = h.f40643a.a();
            }
            return kVar.g(dVar, function1);
        }
    }

    InterfaceC0936h f(id.f fVar, Rc.b bVar);

    Collection g(d dVar, Function1 function1);
}
