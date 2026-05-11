package Jd;

import Od.C1080h;

/* renamed from: Jd.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0903q {
    public static final void a(InterfaceC0895m interfaceC0895m, InterfaceC0876c0 interfaceC0876c0) {
        c(interfaceC0895m, new C0878d0(interfaceC0876c0));
    }

    public static final C0899o b(kotlin.coroutines.d dVar) {
        if (!(dVar instanceof C1080h)) {
            return new C0899o(dVar, 1);
        }
        C0899o l10 = ((C1080h) dVar).l();
        if (l10 != null) {
            if (!l10.P()) {
                l10 = null;
            }
            if (l10 != null) {
                return l10;
            }
        }
        return new C0899o(dVar, 2);
    }

    public static final void c(InterfaceC0895m interfaceC0895m, InterfaceC0893l interfaceC0893l) {
        if (!(interfaceC0895m instanceof C0899o)) {
            throw new UnsupportedOperationException("third-party implementation of CancellableContinuation is not supported");
        }
        ((C0899o) interfaceC0895m).J(interfaceC0893l);
    }
}
