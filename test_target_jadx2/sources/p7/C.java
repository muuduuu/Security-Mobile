package p7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC2006a;

/* loaded from: classes2.dex */
abstract class C extends AbstractC2006a {
    public C(S6.h hVar) {
        super(C3837v.f38470l, hVar);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC2006a, T6.InterfaceC1167d
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        super.k((S6.o) obj);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ S6.o g(Status status) {
        return new x7.q(status, null);
    }
}
