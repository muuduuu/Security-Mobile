package Uc;

import Kc.InterfaceC0930b;
import Kc.InterfaceC0933e;
import Kc.U;
import Kc.Z;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d extends f {

    /* renamed from: F, reason: collision with root package name */
    private final Z f10417F;

    /* renamed from: G, reason: collision with root package name */
    private final Z f10418G;

    /* renamed from: H, reason: collision with root package name */
    private final U f10419H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(InterfaceC0933e ownerDescriptor, Z getterMethod, Z z10, U overriddenProperty) {
        super(ownerDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f36445g0.b(), getterMethod.s(), getterMethod.h(), z10 != null, overriddenProperty.getName(), getterMethod.j(), null, InterfaceC0930b.a.DECLARATION, false, null);
        Intrinsics.checkNotNullParameter(ownerDescriptor, "ownerDescriptor");
        Intrinsics.checkNotNullParameter(getterMethod, "getterMethod");
        Intrinsics.checkNotNullParameter(overriddenProperty, "overriddenProperty");
        this.f10417F = getterMethod;
        this.f10418G = z10;
        this.f10419H = overriddenProperty;
    }
}
