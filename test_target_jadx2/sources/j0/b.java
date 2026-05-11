package J0;

import I0.C0838d;
import I0.InterfaceC0839e;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b implements InterfaceC0839e {

    /* renamed from: a, reason: collision with root package name */
    private final Function1 f4430a;

    public b(Function1 produceNewData) {
        Intrinsics.checkNotNullParameter(produceNewData, "produceNewData");
        this.f4430a = produceNewData;
    }

    @Override // I0.InterfaceC0839e
    public Object a(C0838d c0838d, d dVar) {
        return this.f4430a.invoke(c0838d);
    }
}
