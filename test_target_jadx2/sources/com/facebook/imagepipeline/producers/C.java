package com.facebook.imagepipeline.producers;

import a4.C1349a;
import android.net.Uri;

/* loaded from: classes.dex */
public abstract class C {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1847n f20748a;

    /* renamed from: b, reason: collision with root package name */
    private final e0 f20749b;

    /* renamed from: c, reason: collision with root package name */
    private long f20750c = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f20751d;

    /* renamed from: e, reason: collision with root package name */
    private C1349a f20752e;

    public C(InterfaceC1847n interfaceC1847n, e0 e0Var) {
        this.f20748a = interfaceC1847n;
        this.f20749b = e0Var;
    }

    public InterfaceC1847n a() {
        return this.f20748a;
    }

    public e0 b() {
        return this.f20749b;
    }

    public long c() {
        return this.f20750c;
    }

    public g0 d() {
        return this.f20749b.p();
    }

    public int e() {
        return this.f20751d;
    }

    public C1349a f() {
        return this.f20752e;
    }

    public Uri g() {
        return this.f20749b.c().u();
    }

    public void h(long j10) {
        this.f20750c = j10;
    }

    public void i(int i10) {
        this.f20751d = i10;
    }

    public void j(C1349a c1349a) {
        this.f20752e = c1349a;
    }
}
