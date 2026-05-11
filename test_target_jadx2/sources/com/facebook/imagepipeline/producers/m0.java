package com.facebook.imagepipeline.producers;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class m0 extends Z2.h {

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1847n f20963b;

    /* renamed from: c, reason: collision with root package name */
    private final g0 f20964c;

    /* renamed from: d, reason: collision with root package name */
    private final e0 f20965d;

    /* renamed from: e, reason: collision with root package name */
    private final String f20966e;

    public m0(InterfaceC1847n consumer, g0 producerListener, e0 producerContext, String producerName) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        Intrinsics.checkNotNullParameter(producerListener, "producerListener");
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
        this.f20963b = consumer;
        this.f20964c = producerListener;
        this.f20965d = producerContext;
        this.f20966e = producerName;
        producerListener.e(producerContext, producerName);
    }

    @Override // Z2.h
    protected void d() {
        g0 g0Var = this.f20964c;
        e0 e0Var = this.f20965d;
        String str = this.f20966e;
        g0Var.d(e0Var, str, g0Var.g(e0Var, str) ? g() : null);
        this.f20963b.a();
    }

    @Override // Z2.h
    protected void e(Exception e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        g0 g0Var = this.f20964c;
        e0 e0Var = this.f20965d;
        String str = this.f20966e;
        g0Var.k(e0Var, str, e10, g0Var.g(e0Var, str) ? h(e10) : null);
        this.f20963b.onFailure(e10);
    }

    @Override // Z2.h
    protected void f(Object obj) {
        g0 g0Var = this.f20964c;
        e0 e0Var = this.f20965d;
        String str = this.f20966e;
        g0Var.j(e0Var, str, g0Var.g(e0Var, str) ? i(obj) : null);
        this.f20963b.c(obj, 1);
    }

    protected Map g() {
        return null;
    }

    protected Map h(Exception exc) {
        return null;
    }

    protected Map i(Object obj) {
        return null;
    }
}
