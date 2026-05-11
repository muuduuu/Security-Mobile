package bd;

import Kc.InterfaceC0933e;
import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import yd.AbstractC5197E;

/* loaded from: classes3.dex */
public final class C implements B {

    /* renamed from: a, reason: collision with root package name */
    public static final C f18938a = new C();

    private C() {
    }

    @Override // bd.B
    public String a(InterfaceC0933e classDescriptor) {
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        return null;
    }

    @Override // bd.B
    public AbstractC5197E b(Collection types) {
        Intrinsics.checkNotNullParameter(types, "types");
        throw new AssertionError("There should be no intersection type in existing descriptors, but found: " + CollectionsKt.l0(types, null, null, null, 0, null, null, 63, null));
    }

    @Override // bd.B
    public String c(InterfaceC0933e classDescriptor) {
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        return null;
    }

    @Override // bd.B
    public AbstractC5197E e(AbstractC5197E kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "kotlinType");
        return null;
    }

    @Override // bd.B
    public void f(AbstractC5197E kotlinType, InterfaceC0933e descriptor) {
        Intrinsics.checkNotNullParameter(kotlinType, "kotlinType");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
    }

    @Override // bd.B
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public o d(InterfaceC0933e classDescriptor) {
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        return null;
    }
}
