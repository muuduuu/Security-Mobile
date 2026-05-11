package com.facebook.imagepipeline.producers;

import f3.AbstractC3142a;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j0 implements d0 {

    /* renamed from: a, reason: collision with root package name */
    private final d0 f20927a;

    private final class a extends AbstractC1852t {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ j0 f20928c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j0 j0Var, InterfaceC1847n consumer) {
            super(consumer);
            Intrinsics.checkNotNullParameter(consumer, "consumer");
            this.f20928c = j0Var;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.AbstractC1836c
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public void h(g4.i iVar, int i10) {
            AbstractC3142a abstractC3142a = null;
            try {
                if (g4.i.y(iVar) && iVar != null) {
                    abstractC3142a = iVar.e();
                }
                o().c(abstractC3142a, i10);
                AbstractC3142a.n(abstractC3142a);
            } catch (Throwable th) {
                AbstractC3142a.n(abstractC3142a);
                throw th;
            }
        }
    }

    public j0(d0 inputProducer) {
        Intrinsics.checkNotNullParameter(inputProducer, "inputProducer");
        this.f20927a = inputProducer;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void a(InterfaceC1847n consumer, e0 context) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f20927a.a(new a(this, consumer), context);
    }
}
