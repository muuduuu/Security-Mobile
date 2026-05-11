package androidx.camera.core.impl;

import A.InterfaceC0703j;
import A.InterfaceC0705k;
import A.InterfaceC0713p;
import A.J0;
import java.util.Collection;

/* loaded from: classes.dex */
public interface H extends InterfaceC0703j, J0.b {

    public enum a {
        RELEASED(false),
        RELEASING(true),
        CLOSED(false),
        PENDING_OPEN(false),
        CLOSING(true),
        OPENING(true),
        OPEN(true),
        CONFIGURED(true);

        private final boolean mHoldsCameraSlot;

        a(boolean z10) {
            this.mHoldsCameraSlot = z10;
        }

        boolean holdsCameraSlot() {
            return this.mHoldsCameraSlot;
        }
    }

    @Override // A.InterfaceC0703j
    default InterfaceC0705k a() {
        return h();
    }

    E0 b();

    @Override // A.InterfaceC0703j
    default InterfaceC0713p c() {
        return q();
    }

    default boolean e() {
        return c().i() == 0;
    }

    default void g(InterfaceC1473z interfaceC1473z) {
    }

    D h();

    default InterfaceC1473z i() {
        return C.a();
    }

    default void l(boolean z10) {
    }

    void m(Collection collection);

    void n(Collection collection);

    default boolean o() {
        return true;
    }

    default void p(boolean z10) {
    }

    G q();
}
