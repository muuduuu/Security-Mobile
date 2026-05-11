package Kc;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public interface G extends InterfaceC0941m {

    public static final class a {
        public static Object a(G g10, InterfaceC0943o visitor, Object obj) {
            Intrinsics.checkNotNullParameter(visitor, "visitor");
            return visitor.k(g10, obj);
        }

        public static InterfaceC0941m b(G g10) {
            return null;
        }
    }

    boolean E(G g10);

    Object E0(F f10);

    P p0(id.c cVar);

    Collection t(id.c cVar, Function1 function1);

    Hc.g v();

    List z0();
}
