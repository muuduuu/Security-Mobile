package kd;

import Kc.InterfaceC0930b;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class j extends k {
    @Override // kd.k
    public void b(InterfaceC0930b first, InterfaceC0930b second) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        e(first, second);
    }

    @Override // kd.k
    public void c(InterfaceC0930b fromSuper, InterfaceC0930b fromCurrent) {
        Intrinsics.checkNotNullParameter(fromSuper, "fromSuper");
        Intrinsics.checkNotNullParameter(fromCurrent, "fromCurrent");
        e(fromSuper, fromCurrent);
    }

    protected abstract void e(InterfaceC0930b interfaceC0930b, InterfaceC0930b interfaceC0930b2);
}
