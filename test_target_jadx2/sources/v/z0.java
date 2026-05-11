package V;

import A.I0;
import A.InterfaceC0713p;
import androidx.camera.core.impl.E0;
import androidx.camera.core.impl.e1;

/* loaded from: classes.dex */
public interface z0 {

    public enum a {
        ACTIVE_STREAMING,
        ACTIVE_NON_STREAMING,
        INACTIVE
    }

    void a(I0 i02);

    default InterfaceC1239b0 b(InterfaceC0713p interfaceC0713p) {
        return InterfaceC1239b0.f10597a;
    }

    default E0 d() {
        return androidx.camera.core.impl.X.g(null);
    }

    default void e(I0 i02, e1 e1Var) {
        a(i02);
    }

    default E0 f() {
        return AbstractC1237a0.f10595c;
    }

    default E0 g() {
        return androidx.camera.core.impl.X.g(Boolean.FALSE);
    }

    default void c(a aVar) {
    }
}
