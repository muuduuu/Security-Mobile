package pd;

import Kc.InterfaceC0933e;
import Mc.C;
import Vc.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: pd.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3871a implements f {

    /* renamed from: b, reason: collision with root package name */
    private final List f38597b;

    public C3871a(List inner) {
        Intrinsics.checkNotNullParameter(inner, "inner");
        this.f38597b = inner;
    }

    @Override // pd.f
    public void a(g context_receiver_0, InterfaceC0933e thisDescriptor, id.f name, Collection result) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(thisDescriptor, "thisDescriptor");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(result, "result");
        Iterator it = this.f38597b.iterator();
        while (it.hasNext()) {
            ((f) it.next()).a(context_receiver_0, thisDescriptor, name, result);
        }
    }

    @Override // pd.f
    public List b(g context_receiver_0, InterfaceC0933e thisDescriptor) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(thisDescriptor, "thisDescriptor");
        List list = this.f38597b;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CollectionsKt.z(arrayList, ((f) it.next()).b(context_receiver_0, thisDescriptor));
        }
        return arrayList;
    }

    @Override // pd.f
    public List c(g context_receiver_0, InterfaceC0933e thisDescriptor) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(thisDescriptor, "thisDescriptor");
        List list = this.f38597b;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CollectionsKt.z(arrayList, ((f) it.next()).c(context_receiver_0, thisDescriptor));
        }
        return arrayList;
    }

    @Override // pd.f
    public C d(g context_receiver_0, InterfaceC0933e thisDescriptor, C propertyDescriptor) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(thisDescriptor, "thisDescriptor");
        Intrinsics.checkNotNullParameter(propertyDescriptor, "propertyDescriptor");
        Iterator it = this.f38597b.iterator();
        while (it.hasNext()) {
            propertyDescriptor = ((f) it.next()).d(context_receiver_0, thisDescriptor, propertyDescriptor);
        }
        return propertyDescriptor;
    }

    @Override // pd.f
    public void e(g context_receiver_0, InterfaceC0933e thisDescriptor, id.f name, List result) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(thisDescriptor, "thisDescriptor");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(result, "result");
        Iterator it = this.f38597b.iterator();
        while (it.hasNext()) {
            ((f) it.next()).e(context_receiver_0, thisDescriptor, name, result);
        }
    }

    @Override // pd.f
    public List f(g context_receiver_0, InterfaceC0933e thisDescriptor) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(thisDescriptor, "thisDescriptor");
        List list = this.f38597b;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CollectionsKt.z(arrayList, ((f) it.next()).f(context_receiver_0, thisDescriptor));
        }
        return arrayList;
    }

    @Override // pd.f
    public void g(g context_receiver_0, InterfaceC0933e thisDescriptor, List result) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(thisDescriptor, "thisDescriptor");
        Intrinsics.checkNotNullParameter(result, "result");
        Iterator it = this.f38597b.iterator();
        while (it.hasNext()) {
            ((f) it.next()).g(context_receiver_0, thisDescriptor, result);
        }
    }

    @Override // pd.f
    public void h(g context_receiver_0, InterfaceC0933e thisDescriptor, id.f name, Collection result) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(thisDescriptor, "thisDescriptor");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(result, "result");
        Iterator it = this.f38597b.iterator();
        while (it.hasNext()) {
            ((f) it.next()).h(context_receiver_0, thisDescriptor, name, result);
        }
    }
}
