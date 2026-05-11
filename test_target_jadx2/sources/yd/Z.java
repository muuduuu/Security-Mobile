package yd;

import Kc.InterfaceC0941m;

/* loaded from: classes3.dex */
public interface Z {

    public static final class a {
        public static /* synthetic */ a0 a(Z z10, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, e0 e0Var, InterfaceC0941m interfaceC0941m, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toAttributes");
            }
            if ((i10 & 2) != 0) {
                e0Var = null;
            }
            if ((i10 & 4) != 0) {
                interfaceC0941m = null;
            }
            return z10.a(gVar, e0Var, interfaceC0941m);
        }
    }

    a0 a(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, e0 e0Var, InterfaceC0941m interfaceC0941m);
}
