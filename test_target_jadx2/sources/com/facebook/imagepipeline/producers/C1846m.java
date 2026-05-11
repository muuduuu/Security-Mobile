package com.facebook.imagepipeline.producers;

/* renamed from: com.facebook.imagepipeline.producers.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1846m implements d0 {

    /* renamed from: a, reason: collision with root package name */
    private final d0 f20959a;

    /* renamed from: b, reason: collision with root package name */
    private final d0 f20960b;

    /* renamed from: com.facebook.imagepipeline.producers.m$a */
    private class a extends AbstractC1852t {

        /* renamed from: c, reason: collision with root package name */
        private e0 f20961c;

        @Override // com.facebook.imagepipeline.producers.AbstractC1852t, com.facebook.imagepipeline.producers.AbstractC1836c
        protected void g(Throwable th) {
            C1846m.this.f20960b.a(o(), this.f20961c);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.AbstractC1836c
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public void h(g4.i iVar, int i10) {
            m4.b c10 = this.f20961c.c();
            boolean d10 = AbstractC1836c.d(i10);
            boolean c11 = v0.c(iVar, c10.q());
            if (iVar != null && (c11 || c10.i())) {
                if (d10 && c11) {
                    o().c(iVar, i10);
                } else {
                    o().c(iVar, AbstractC1836c.n(i10, 1));
                }
            }
            if (!d10 || c11 || c10.h()) {
                return;
            }
            g4.i.c(iVar);
            C1846m.this.f20960b.a(o(), this.f20961c);
        }

        private a(InterfaceC1847n interfaceC1847n, e0 e0Var) {
            super(interfaceC1847n);
            this.f20961c = e0Var;
        }
    }

    public C1846m(d0 d0Var, d0 d0Var2) {
        this.f20959a = d0Var;
        this.f20960b = d0Var2;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void a(InterfaceC1847n interfaceC1847n, e0 e0Var) {
        this.f20959a.a(new a(interfaceC1847n, e0Var), e0Var);
    }
}
