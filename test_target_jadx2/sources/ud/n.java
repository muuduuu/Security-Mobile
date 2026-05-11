package ud;

import Kc.K;
import Kc.L;
import Kc.N;
import id.C3367b;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class n implements h {

    /* renamed from: a, reason: collision with root package name */
    private final L f43711a;

    public n(L packageFragmentProvider) {
        Intrinsics.checkNotNullParameter(packageFragmentProvider, "packageFragmentProvider");
        this.f43711a = packageFragmentProvider;
    }

    @Override // ud.h
    public C4889g a(C3367b classId) {
        C4889g a10;
        Intrinsics.checkNotNullParameter(classId, "classId");
        L l10 = this.f43711a;
        id.c h10 = classId.h();
        Intrinsics.checkNotNullExpressionValue(h10, "getPackageFqName(...)");
        for (K k10 : N.c(l10, h10)) {
            if ((k10 instanceof o) && (a10 = ((o) k10).N0().a(classId)) != null) {
                return a10;
            }
        }
        return null;
    }
}
