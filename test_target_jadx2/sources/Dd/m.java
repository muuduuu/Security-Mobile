package Dd;

import Dd.f;
import Kc.InterfaceC0952y;
import Kc.j0;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import od.AbstractC3778c;

/* loaded from: classes3.dex */
final class m implements f {

    /* renamed from: a, reason: collision with root package name */
    public static final m f1522a = new m();

    /* renamed from: b, reason: collision with root package name */
    private static final String f1523b = "should not have varargs or parameters with default values";

    private m() {
    }

    @Override // Dd.f
    public boolean a(InterfaceC0952y functionDescriptor) {
        Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
        List m10 = functionDescriptor.m();
        Intrinsics.checkNotNullExpressionValue(m10, "getValueParameters(...)");
        List<j0> list = m10;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        for (j0 j0Var : list) {
            Intrinsics.d(j0Var);
            if (AbstractC3778c.c(j0Var) || j0Var.r0() != null) {
                return false;
            }
        }
        return true;
    }

    @Override // Dd.f
    public String b(InterfaceC0952y interfaceC0952y) {
        return f.a.a(this, interfaceC0952y);
    }

    @Override // Dd.f
    public String getDescription() {
        return f1523b;
    }
}
