package c4;

import com.facebook.imagepipeline.producers.d0;
import com.facebook.imagepipeline.producers.e0;
import com.facebook.imagepipeline.producers.l0;
import f3.AbstractC3142a;
import l3.InterfaceC3606c;

/* renamed from: c4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1726c extends AbstractC1724a {
    private C1726c(d0 d0Var, l0 l0Var, i4.d dVar) {
        super(d0Var, l0Var, dVar);
    }

    public static InterfaceC3606c H(d0 d0Var, l0 l0Var, i4.d dVar) {
        if (n4.b.d()) {
            n4.b.a("CloseableProducerToDataSourceAdapter#create");
        }
        C1726c c1726c = new C1726c(d0Var, l0Var, dVar);
        if (n4.b.d()) {
            n4.b.b();
        }
        return c1726c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // l3.AbstractC3604a
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public void h(AbstractC3142a abstractC3142a) {
        AbstractC3142a.n(abstractC3142a);
    }

    @Override // l3.AbstractC3604a, l3.InterfaceC3606c
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public AbstractC3142a b() {
        return AbstractC3142a.i((AbstractC3142a) super.b());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c4.AbstractC1724a
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public void F(AbstractC3142a abstractC3142a, int i10, e0 e0Var) {
        super.F(AbstractC3142a.i(abstractC3142a), i10, e0Var);
    }
}
