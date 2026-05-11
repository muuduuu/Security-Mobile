package com.facebook.imagepipeline.producers;

import android.util.Pair;

/* renamed from: com.facebook.imagepipeline.producers.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1857y extends U {

    /* renamed from: f, reason: collision with root package name */
    private final Z3.k f21053f;

    public C1857y(Z3.k kVar, boolean z10, d0 d0Var) {
        super(d0Var, "EncodedCacheKeyMultiplexProducer", "multiplex_enc_cnt", z10);
        this.f21053f = kVar;
    }

    @Override // com.facebook.imagepipeline.producers.U
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public g4.i g(g4.i iVar) {
        return g4.i.b(iVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.producers.U
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public Pair j(e0 e0Var) {
        return Pair.create(this.f21053f.c(e0Var.c(), e0Var.a()), e0Var.r());
    }
}
