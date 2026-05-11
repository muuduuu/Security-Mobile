package va;

import androidx.lifecycle.InterfaceC1608z;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lc.InterfaceC3624c;
import xc.InterfaceC5154g;

/* loaded from: classes2.dex */
final /* synthetic */ class r implements InterfaceC1608z, InterfaceC5154g {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ Function1 f44206a;

    r(Function1 function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.f44206a = function;
    }

    @Override // xc.InterfaceC5154g
    public final InterfaceC3624c a() {
        return this.f44206a;
    }

    @Override // androidx.lifecycle.InterfaceC1608z
    public final /* synthetic */ void b(Object obj) {
        this.f44206a.invoke(obj);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof InterfaceC1608z) && (obj instanceof InterfaceC5154g)) {
            return Intrinsics.b(a(), ((InterfaceC5154g) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }
}
