package ae;

import ae.r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class p implements r.b {

    /* renamed from: a, reason: collision with root package name */
    private final l f12874a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f12875b;

    public p(l connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        this.f12874a = connection;
        this.f12875b = true;
    }

    @Override // ae.r.b
    public /* bridge */ /* synthetic */ r.b a() {
        return (r.b) j();
    }

    @Override // ae.r.b, be.d.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // ae.r.b
    public l c() {
        return this.f12874a;
    }

    @Override // ae.r.b
    public boolean d() {
        return this.f12875b;
    }

    @Override // ae.r.b
    public /* bridge */ /* synthetic */ r.a e() {
        return (r.a) f();
    }

    public Void f() {
        throw new IllegalStateException("already connected");
    }

    @Override // ae.r.b
    public /* bridge */ /* synthetic */ r.a g() {
        return (r.a) h();
    }

    public Void h() {
        throw new IllegalStateException("already connected");
    }

    public final l i() {
        return this.f12874a;
    }

    public Void j() {
        throw new IllegalStateException("unexpected retry");
    }
}
