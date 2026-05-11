package ae;

import Td.C1225a;
import Td.w;
import ae.r;
import kotlin.collections.C3573h;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class i implements r {

    /* renamed from: a, reason: collision with root package name */
    private final n f12800a;

    public i(n delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f12800a = delegate;
    }

    @Override // ae.r
    public C1225a b() {
        return this.f12800a.b();
    }

    @Override // ae.r
    public boolean c(w url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return this.f12800a.c(url);
    }

    @Override // ae.r
    public boolean d(l lVar) {
        return this.f12800a.d(lVar);
    }

    @Override // ae.r
    public boolean e() {
        return this.f12800a.e();
    }

    @Override // ae.r
    public C3573h f() {
        return this.f12800a.f();
    }

    @Override // ae.r
    public r.b g() {
        return this.f12800a.i();
    }
}
