package Kc;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class r extends AbstractC0948u {

    /* renamed from: a, reason: collision with root package name */
    private final n0 f5584a;

    public r(n0 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f5584a = delegate;
    }

    @Override // Kc.AbstractC0948u
    public n0 b() {
        return this.f5584a;
    }

    @Override // Kc.AbstractC0948u
    public String c() {
        return b().b();
    }

    @Override // Kc.AbstractC0948u
    public AbstractC0948u f() {
        AbstractC0948u j10 = AbstractC0947t.j(b().d());
        Intrinsics.checkNotNullExpressionValue(j10, "toDescriptorVisibility(...)");
        return j10;
    }
}
