package com.facebook.imagepipeline.producers;

/* renamed from: com.facebook.imagepipeline.producers.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1835b implements d0 {

    /* renamed from: a, reason: collision with root package name */
    private final d0 f20878a;

    /* renamed from: com.facebook.imagepipeline.producers.b$a */
    private static class a extends AbstractC1852t {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.AbstractC1836c
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public void h(g4.i iVar, int i10) {
            if (iVar == null) {
                o().c(null, i10);
                return;
            }
            if (!g4.i.u(iVar)) {
                iVar.z();
            }
            o().c(iVar, i10);
        }

        private a(InterfaceC1847n interfaceC1847n) {
            super(interfaceC1847n);
        }
    }

    public C1835b(d0 d0Var) {
        this.f20878a = d0Var;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void a(InterfaceC1847n interfaceC1847n, e0 e0Var) {
        this.f20878a.a(new a(interfaceC1847n), e0Var);
    }
}
