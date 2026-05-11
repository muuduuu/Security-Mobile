package com.facebook.imagepipeline.producers;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class F extends E implements i4.d {

    /* renamed from: c, reason: collision with root package name */
    private final i4.e f20769c;

    /* renamed from: d, reason: collision with root package name */
    private final i4.d f20770d;

    public F(i4.e eVar, i4.d dVar) {
        super(eVar, dVar);
        this.f20769c = eVar;
        this.f20770d = dVar;
    }

    @Override // i4.d
    public void b(e0 producerContext) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        i4.e eVar = this.f20769c;
        if (eVar != null) {
            eVar.j(producerContext.c(), producerContext.a(), producerContext.getId(), producerContext.i());
        }
        i4.d dVar = this.f20770d;
        if (dVar != null) {
            dVar.b(producerContext);
        }
    }

    @Override // i4.d
    public void f(e0 producerContext) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        i4.e eVar = this.f20769c;
        if (eVar != null) {
            eVar.a(producerContext.c(), producerContext.getId(), producerContext.i());
        }
        i4.d dVar = this.f20770d;
        if (dVar != null) {
            dVar.f(producerContext);
        }
    }

    @Override // i4.d
    public void h(e0 producerContext, Throwable th) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        i4.e eVar = this.f20769c;
        if (eVar != null) {
            eVar.c(producerContext.c(), producerContext.getId(), th, producerContext.i());
        }
        i4.d dVar = this.f20770d;
        if (dVar != null) {
            dVar.h(producerContext, th);
        }
    }

    @Override // i4.d
    public void i(e0 producerContext) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        i4.e eVar = this.f20769c;
        if (eVar != null) {
            eVar.k(producerContext.getId());
        }
        i4.d dVar = this.f20770d;
        if (dVar != null) {
            dVar.i(producerContext);
        }
    }
}
