package ae;

import Td.H;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private final Set f12876a = new LinkedHashSet();

    public final synchronized void a(H route) {
        Intrinsics.checkNotNullParameter(route, "route");
        this.f12876a.remove(route);
    }

    public final synchronized void b(H failedRoute) {
        Intrinsics.checkNotNullParameter(failedRoute, "failedRoute");
        this.f12876a.add(failedRoute);
    }

    public final synchronized boolean c(H route) {
        Intrinsics.checkNotNullParameter(route, "route");
        return this.f12876a.contains(route);
    }
}
