package com.facebook.imagepipeline.producers;

/* loaded from: classes.dex */
public class t0 implements d0 {

    /* renamed from: a, reason: collision with root package name */
    private final u0[] f21025a;

    private class a extends AbstractC1852t {

        /* renamed from: c, reason: collision with root package name */
        private final e0 f21026c;

        /* renamed from: d, reason: collision with root package name */
        private final int f21027d;

        /* renamed from: e, reason: collision with root package name */
        private final a4.f f21028e;

        public a(InterfaceC1847n interfaceC1847n, e0 e0Var, int i10) {
            super(interfaceC1847n);
            this.f21026c = e0Var;
            this.f21027d = i10;
            this.f21028e = e0Var.c().q();
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC1852t, com.facebook.imagepipeline.producers.AbstractC1836c
        protected void g(Throwable th) {
            if (t0.this.e(this.f21027d + 1, o(), this.f21026c)) {
                return;
            }
            o().onFailure(th);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.AbstractC1836c
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public void h(g4.i iVar, int i10) {
            if (iVar != null && (AbstractC1836c.e(i10) || v0.c(iVar, this.f21028e))) {
                o().c(iVar, i10);
            } else if (AbstractC1836c.d(i10)) {
                g4.i.c(iVar);
                if (t0.this.e(this.f21027d + 1, o(), this.f21026c)) {
                    return;
                }
                o().c(null, 1);
            }
        }
    }

    public t0(u0... u0VarArr) {
        u0[] u0VarArr2 = (u0[]) b3.l.g(u0VarArr);
        this.f21025a = u0VarArr2;
        b3.l.e(0, u0VarArr2.length);
    }

    private int d(int i10, a4.f fVar) {
        while (true) {
            u0[] u0VarArr = this.f21025a;
            if (i10 >= u0VarArr.length) {
                return -1;
            }
            if (u0VarArr[i10].b(fVar)) {
                return i10;
            }
            i10++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(int i10, InterfaceC1847n interfaceC1847n, e0 e0Var) {
        int d10 = d(i10, e0Var.c().q());
        if (d10 == -1) {
            return false;
        }
        this.f21025a[d10].a(new a(interfaceC1847n, e0Var, d10), e0Var);
        return true;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void a(InterfaceC1847n interfaceC1847n, e0 e0Var) {
        if (e0Var.c().q() == null) {
            interfaceC1847n.c(null, 1);
        } else {
            if (e(0, interfaceC1847n, e0Var)) {
                return;
            }
            interfaceC1847n.c(null, 1);
        }
    }
}
