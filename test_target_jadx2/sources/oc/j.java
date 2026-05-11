package Oc;

import Kc.InterfaceC0930b;
import Kc.InterfaceC0933e;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ud.r;

/* loaded from: classes3.dex */
public final class j implements r {

    /* renamed from: b, reason: collision with root package name */
    public static final j f7292b = new j();

    private j() {
    }

    @Override // ud.r
    public void a(InterfaceC0930b descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        throw new IllegalStateException("Cannot infer visibility for " + descriptor);
    }

    @Override // ud.r
    public void b(InterfaceC0933e descriptor, List unresolvedSuperClasses) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(unresolvedSuperClasses, "unresolvedSuperClasses");
        throw new IllegalStateException("Incomplete hierarchy for class " + descriptor.getName() + ", unresolved classes " + unresolvedSuperClasses);
    }
}
