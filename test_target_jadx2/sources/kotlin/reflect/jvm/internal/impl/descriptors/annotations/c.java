package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import Kc.InterfaceC0933e;
import Kc.a0;
import java.util.Map;
import od.AbstractC3778c;
import yd.AbstractC5197E;

/* loaded from: classes3.dex */
public interface c {

    public static final class a {
        public static id.c a(c cVar) {
            InterfaceC0933e i10 = AbstractC3778c.i(cVar);
            if (i10 == null) {
                return null;
            }
            if (kotlin.reflect.jvm.internal.impl.types.error.k.m(i10)) {
                i10 = null;
            }
            if (i10 != null) {
                return AbstractC3778c.h(i10);
            }
            return null;
        }
    }

    Map a();

    id.c e();

    AbstractC5197E getType();

    a0 j();
}
