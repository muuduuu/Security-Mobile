package Sc;

import Kc.InterfaceC0941m;
import kotlin.jvm.internal.Intrinsics;
import nd.AbstractC3733c;
import nd.EnumC3732b;

/* renamed from: Sc.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1160j extends AbstractC3733c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0941m f9039a;

    public C1160j(InterfaceC0941m target) {
        Intrinsics.checkNotNullParameter(target, "target");
        this.f9039a = target;
    }

    @Override // nd.AbstractC3731a
    public EnumC3732b c() {
        return EnumC3732b.ERROR;
    }
}
