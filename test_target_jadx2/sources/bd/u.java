package bd;

import Kc.a0;
import Kc.b0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class u implements a0 {

    /* renamed from: b, reason: collision with root package name */
    private final Wc.h f19043b;

    public u(Wc.h packageFragment) {
        Intrinsics.checkNotNullParameter(packageFragment, "packageFragment");
        this.f19043b = packageFragment;
    }

    @Override // Kc.a0
    public b0 a() {
        b0 NO_SOURCE_FILE = b0.f5561a;
        Intrinsics.checkNotNullExpressionValue(NO_SOURCE_FILE, "NO_SOURCE_FILE");
        return NO_SOURCE_FILE;
    }

    public String toString() {
        return this.f19043b + ": " + this.f19043b.W0().keySet();
    }
}
