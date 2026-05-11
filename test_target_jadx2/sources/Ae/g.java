package ae;

import ae.r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g implements r.b {

    /* renamed from: a, reason: collision with root package name */
    private final r.a f12790a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f12791b;

    public g(Throwable e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        this.f12790a = new r.a(this, null, e10, 2, null);
    }

    @Override // ae.r.b
    public /* bridge */ /* synthetic */ r.b a() {
        return (r.b) i();
    }

    @Override // ae.r.b, be.d.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // ae.r.b
    public /* bridge */ /* synthetic */ l c() {
        return (l) h();
    }

    @Override // ae.r.b
    public boolean d() {
        return this.f12791b;
    }

    @Override // ae.r.b
    public r.a e() {
        return this.f12790a;
    }

    public final r.a f() {
        return this.f12790a;
    }

    @Override // ae.r.b
    public r.a g() {
        return this.f12790a;
    }

    public Void h() {
        throw new IllegalStateException("unexpected call");
    }

    public Void i() {
        throw new IllegalStateException("unexpected retry");
    }
}
