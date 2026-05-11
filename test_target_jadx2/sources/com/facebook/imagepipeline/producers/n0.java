package com.facebook.imagepipeline.producers;

/* loaded from: classes.dex */
public class n0 implements d0 {

    /* renamed from: a, reason: collision with root package name */
    private final d0 f20967a;

    class a extends AbstractC1852t {
        a(InterfaceC1847n interfaceC1847n) {
            super(interfaceC1847n);
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC1836c
        protected void h(Object obj, int i10) {
            if (AbstractC1836c.d(i10)) {
                o().c(null, i10);
            }
        }
    }

    public n0(d0 d0Var) {
        this.f20967a = d0Var;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void a(InterfaceC1847n interfaceC1847n, e0 e0Var) {
        this.f20967a.a(new a(interfaceC1847n), e0Var);
    }
}
