package Kc;

import kotlin.jvm.internal.Intrinsics;
import sd.InterfaceC4519g;

/* renamed from: Kc.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0948u {
    protected AbstractC0948u() {
    }

    public final Integer a(AbstractC0948u visibility) {
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        return b().a(visibility.b());
    }

    public abstract n0 b();

    public abstract String c();

    public final boolean d() {
        return b().c();
    }

    public abstract boolean e(InterfaceC4519g interfaceC4519g, InterfaceC0945q interfaceC0945q, InterfaceC0941m interfaceC0941m, boolean z10);

    public abstract AbstractC0948u f();

    public final String toString() {
        return b().toString();
    }
}
