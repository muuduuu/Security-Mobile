package kd;

import Kc.InterfaceC0930b;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class k {
    public abstract void a(InterfaceC0930b interfaceC0930b);

    public abstract void b(InterfaceC0930b interfaceC0930b, InterfaceC0930b interfaceC0930b2);

    public abstract void c(InterfaceC0930b interfaceC0930b, InterfaceC0930b interfaceC0930b2);

    public void d(InterfaceC0930b member, Collection overridden) {
        Intrinsics.checkNotNullParameter(member, "member");
        Intrinsics.checkNotNullParameter(overridden, "overridden");
        member.F0(overridden);
    }
}
