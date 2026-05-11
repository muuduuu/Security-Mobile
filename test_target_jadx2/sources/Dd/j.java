package Dd;

import Dd.f;
import Hc.i;
import Kc.InterfaceC0952y;
import Kc.j0;
import kotlin.jvm.internal.Intrinsics;
import od.AbstractC3778c;
import yd.AbstractC5197E;

/* loaded from: classes3.dex */
final class j implements f {

    /* renamed from: a, reason: collision with root package name */
    public static final j f1516a = new j();

    /* renamed from: b, reason: collision with root package name */
    private static final String f1517b = "second parameter must be of type KProperty<*> or its supertype";

    private j() {
    }

    @Override // Dd.f
    public boolean a(InterfaceC0952y functionDescriptor) {
        Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
        j0 j0Var = (j0) functionDescriptor.m().get(1);
        i.b bVar = Hc.i.f3847k;
        Intrinsics.d(j0Var);
        AbstractC5197E a10 = bVar.a(AbstractC3778c.p(j0Var));
        if (a10 == null) {
            return false;
        }
        AbstractC5197E type = j0Var.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        return Bd.a.r(a10, Bd.a.v(type));
    }

    @Override // Dd.f
    public String b(InterfaceC0952y interfaceC0952y) {
        return f.a.a(this, interfaceC0952y);
    }

    @Override // Dd.f
    public String getDescription() {
        return f1517b;
    }
}
