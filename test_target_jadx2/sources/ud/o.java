package ud;

import kotlin.jvm.internal.Intrinsics;
import wd.AbstractC5076h;

/* loaded from: classes3.dex */
public abstract class o extends Mc.z {

    /* renamed from: g, reason: collision with root package name */
    private final xd.n f43712g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(id.c fqName, xd.n storageManager, Kc.G module) {
        super(module, fqName);
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(module, "module");
        this.f43712g = storageManager;
    }

    public abstract h N0();

    public boolean T0(id.f name) {
        Intrinsics.checkNotNullParameter(name, "name");
        rd.h w10 = w();
        return (w10 instanceof AbstractC5076h) && ((AbstractC5076h) w10).q().contains(name);
    }

    public abstract void U0(k kVar);
}
