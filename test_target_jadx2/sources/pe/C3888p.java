package pe;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: pe.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3888p extends c0 {

    /* renamed from: f, reason: collision with root package name */
    private c0 f38713f;

    public C3888p(c0 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f38713f = delegate;
    }

    @Override // pe.c0
    public c0 a() {
        return this.f38713f.a();
    }

    @Override // pe.c0
    public c0 b() {
        return this.f38713f.b();
    }

    @Override // pe.c0
    public long c() {
        return this.f38713f.c();
    }

    @Override // pe.c0
    public c0 d(long j10) {
        return this.f38713f.d(j10);
    }

    @Override // pe.c0
    public boolean e() {
        return this.f38713f.e();
    }

    @Override // pe.c0
    public void f() {
        this.f38713f.f();
    }

    @Override // pe.c0
    public c0 g(long j10, TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return this.f38713f.g(j10, unit);
    }

    @Override // pe.c0
    public long h() {
        return this.f38713f.h();
    }

    public final c0 i() {
        return this.f38713f;
    }

    public final C3888p j(c0 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f38713f = delegate;
        return this;
    }
}
