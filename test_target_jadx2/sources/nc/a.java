package Nc;

import Kc.m0;
import Kc.n0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a extends n0 {

    /* renamed from: c, reason: collision with root package name */
    public static final a f6740c = new a();

    private a() {
        super("package", false);
    }

    @Override // Kc.n0
    public Integer a(n0 visibility) {
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        if (this == visibility) {
            return 0;
        }
        return m0.f5570a.b(visibility) ? 1 : -1;
    }

    @Override // Kc.n0
    public String b() {
        return "public/*package*/";
    }

    @Override // Kc.n0
    public n0 d() {
        return m0.g.f5579c;
    }
}
