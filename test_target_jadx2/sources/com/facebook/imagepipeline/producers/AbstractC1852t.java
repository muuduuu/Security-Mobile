package com.facebook.imagepipeline.producers;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.facebook.imagepipeline.producers.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1852t extends AbstractC1836c {

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1847n f21024b;

    public AbstractC1852t(InterfaceC1847n consumer) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        this.f21024b = consumer;
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC1836c
    protected void f() {
        this.f21024b.a();
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC1836c
    protected void g(Throwable t10) {
        Intrinsics.checkNotNullParameter(t10, "t");
        this.f21024b.onFailure(t10);
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC1836c
    protected void i(float f10) {
        this.f21024b.b(f10);
    }

    public final InterfaceC1847n o() {
        return this.f21024b;
    }
}
