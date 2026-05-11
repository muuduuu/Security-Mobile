package Nc;

import Kc.m0;
import Kc.n0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b extends n0 {

    /* renamed from: c, reason: collision with root package name */
    public static final b f6741c = new b();

    private b() {
        super("protected_and_package", true);
    }

    @Override // Kc.n0
    public Integer a(n0 visibility) {
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        if (Intrinsics.b(this, visibility)) {
            return 0;
        }
        if (visibility == m0.b.f5574c) {
            return null;
        }
        return Integer.valueOf(m0.f5570a.b(visibility) ? 1 : -1);
    }

    @Override // Kc.n0
    public String b() {
        return "protected/*protected and package*/";
    }

    @Override // Kc.n0
    public n0 d() {
        return m0.g.f5579c;
    }
}
