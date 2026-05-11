package com.facebook.imagepipeline.producers;

import b3.AbstractC1647b;
import f3.AbstractC3142a;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class L implements d0 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f20796a;

    /* renamed from: b, reason: collision with root package name */
    private final e3.i f20797b;

    class a extends m0 {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ m4.b f20798f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ g0 f20799g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ e0 f20800h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC1847n interfaceC1847n, g0 g0Var, e0 e0Var, String str, m4.b bVar, g0 g0Var2, e0 e0Var2) {
            super(interfaceC1847n, g0Var, e0Var, str);
            this.f20798f = bVar;
            this.f20799g = g0Var2;
            this.f20800h = e0Var2;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // Z2.h
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void b(g4.i iVar) {
            g4.i.c(iVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // Z2.h
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public g4.i c() {
            g4.i e10 = L.this.e(this.f20798f);
            if (e10 == null) {
                this.f20799g.c(this.f20800h, L.this.f(), false);
                this.f20800h.f("local", "fetch");
                return null;
            }
            e10.z();
            this.f20799g.c(this.f20800h, L.this.f(), true);
            this.f20800h.f("local", "fetch");
            this.f20800h.n("image_color_space", e10.g());
            return e10;
        }
    }

    class b extends AbstractC1839f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ m0 f20802a;

        b(m0 m0Var) {
            this.f20802a = m0Var;
        }

        @Override // com.facebook.imagepipeline.producers.f0
        public void a() {
            this.f20802a.a();
        }
    }

    protected L(Executor executor, e3.i iVar) {
        this.f20796a = executor;
        this.f20797b = iVar;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void a(InterfaceC1847n interfaceC1847n, e0 e0Var) {
        g0 p10 = e0Var.p();
        m4.b c10 = e0Var.c();
        e0Var.f("local", "fetch");
        a aVar = new a(interfaceC1847n, p10, e0Var, f(), c10, p10, e0Var);
        e0Var.d(new b(aVar));
        this.f20796a.execute(aVar);
    }

    protected g4.i c(InputStream inputStream, int i10) {
        AbstractC3142a abstractC3142a = null;
        try {
            abstractC3142a = i10 <= 0 ? AbstractC3142a.y(this.f20797b.c(inputStream)) : AbstractC3142a.y(this.f20797b.d(inputStream, i10));
            g4.i iVar = new g4.i(abstractC3142a);
            AbstractC1647b.b(inputStream);
            AbstractC3142a.n(abstractC3142a);
            return iVar;
        } catch (Throwable th) {
            AbstractC1647b.b(inputStream);
            AbstractC3142a.n(abstractC3142a);
            throw th;
        }
    }

    protected g4.i d(InputStream inputStream, int i10) {
        return c(inputStream, i10);
    }

    protected abstract g4.i e(m4.b bVar);

    protected abstract String f();
}
