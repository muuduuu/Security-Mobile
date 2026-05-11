package V6;

import android.os.Bundle;
import com.google.android.gms.common.C2010b;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class q0 extends AbstractC1268c0 {

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ AbstractC1267c f11005g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(AbstractC1267c abstractC1267c, int i10, Bundle bundle) {
        super(abstractC1267c, i10, bundle);
        Objects.requireNonNull(abstractC1267c);
        this.f11005g = abstractC1267c;
    }

    @Override // V6.AbstractC1268c0
    protected final boolean e() {
        this.f11005g.f10909p.a(C2010b.f23474f);
        return true;
    }

    @Override // V6.AbstractC1268c0
    protected final void f(C2010b c2010b) {
        AbstractC1267c abstractC1267c = this.f11005g;
        if (abstractC1267c.y() && abstractC1267c.e0()) {
            abstractC1267c.d0(16);
        } else {
            abstractC1267c.f10909p.a(c2010b);
            abstractC1267c.Q(c2010b);
        }
    }
}
