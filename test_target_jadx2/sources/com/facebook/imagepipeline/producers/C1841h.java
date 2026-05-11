package com.facebook.imagepipeline.producers;

import android.util.Pair;
import f3.AbstractC3142a;

/* renamed from: com.facebook.imagepipeline.producers.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1841h extends U {

    /* renamed from: f, reason: collision with root package name */
    private final Z3.k f20912f;

    public C1841h(Z3.k kVar, d0 d0Var) {
        super(d0Var, "BitmapMemoryCacheKeyMultiplexProducer", "multiplex_bmp_cnt");
        this.f20912f = kVar;
    }

    @Override // com.facebook.imagepipeline.producers.U
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public AbstractC3142a g(AbstractC3142a abstractC3142a) {
        return AbstractC3142a.i(abstractC3142a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.producers.U
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public Pair j(e0 e0Var) {
        return Pair.create(this.f20912f.d(e0Var.c(), e0Var.a()), e0Var.r());
    }
}
