package Ud;

import Td.F;
import Td.x;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a implements x {

    /* renamed from: a, reason: collision with root package name */
    public static final a f10427a = new a();

    private a() {
    }

    @Override // Td.x
    public F intercept(x.a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        return chain.t().e("Accept-Encoding") == null ? Vd.a.a(chain.a(chain.t().j().l("Accept-Encoding", "br,gzip").b())) : chain.a(chain.t());
    }
}
