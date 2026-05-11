package Mc;

import Kc.InterfaceC0941m;
import Kc.InterfaceC0943o;
import Kc.a0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class z extends AbstractC0985k implements Kc.K {

    /* renamed from: e, reason: collision with root package name */
    private final id.c f6378e;

    /* renamed from: f, reason: collision with root package name */
    private final String f6379f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(Kc.G module, id.c fqName) {
        super(module, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f36445g0.b(), fqName.h(), a0.f5560a);
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        this.f6378e = fqName;
        this.f6379f = "package " + fqName + " of " + module;
    }

    @Override // Kc.K
    public final id.c e() {
        return this.f6378e;
    }

    @Override // Kc.InterfaceC0941m
    public Object f0(InterfaceC0943o visitor, Object obj) {
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        return visitor.j(this, obj);
    }

    @Override // Mc.AbstractC0985k, Kc.InterfaceC0944p
    public a0 j() {
        a0 NO_SOURCE = a0.f5560a;
        Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
        return NO_SOURCE;
    }

    @Override // Mc.AbstractC0984j
    public String toString() {
        return this.f6379f;
    }

    @Override // Mc.AbstractC0985k, Kc.InterfaceC0941m
    public Kc.G b() {
        InterfaceC0941m b10 = super.b();
        Intrinsics.e(b10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ModuleDescriptor");
        return (Kc.G) b10;
    }
}
