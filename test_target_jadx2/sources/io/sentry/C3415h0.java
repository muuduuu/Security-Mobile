package io.sentry;

import java.io.Writer;

/* renamed from: io.sentry.h0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3415h0 implements A0 {

    /* renamed from: a, reason: collision with root package name */
    private final io.sentry.vendor.gson.stream.c f35135a;

    /* renamed from: b, reason: collision with root package name */
    private final C3412g0 f35136b;

    public C3415h0(Writer writer, int i10) {
        this.f35135a = new io.sentry.vendor.gson.stream.c(writer);
        this.f35136b = new C3412g0(i10);
    }

    @Override // io.sentry.A0
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public C3415h0 l() {
        this.f35135a.c();
        return this;
    }

    @Override // io.sentry.A0
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public C3415h0 f() {
        this.f35135a.d();
        return this;
    }

    @Override // io.sentry.A0
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public C3415h0 j() {
        this.f35135a.f();
        return this;
    }

    @Override // io.sentry.A0
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public C3415h0 d() {
        this.f35135a.g();
        return this;
    }

    @Override // io.sentry.A0
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public C3415h0 k(String str) {
        this.f35135a.i(str);
        return this;
    }

    @Override // io.sentry.A0
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public C3415h0 i() {
        this.f35135a.l();
        return this;
    }

    public void s(String str) {
        this.f35135a.r(str);
    }

    @Override // io.sentry.A0
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public C3415h0 a(long j10) {
        this.f35135a.t(j10);
        return this;
    }

    @Override // io.sentry.A0
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public C3415h0 g(ILogger iLogger, Object obj) {
        this.f35136b.a(this, iLogger, obj);
        return this;
    }

    @Override // io.sentry.A0
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public C3415h0 h(Boolean bool) {
        this.f35135a.u(bool);
        return this;
    }

    @Override // io.sentry.A0
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public C3415h0 e(Number number) {
        this.f35135a.x(number);
        return this;
    }

    @Override // io.sentry.A0
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public C3415h0 b(String str) {
        this.f35135a.y(str);
        return this;
    }

    @Override // io.sentry.A0
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public C3415h0 c(boolean z10) {
        this.f35135a.z(z10);
        return this;
    }
}
