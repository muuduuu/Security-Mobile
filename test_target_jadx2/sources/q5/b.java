package Q5;

import D5.A;
import D5.B;
import R5.AbstractC1131d;
import java.util.Set;

/* loaded from: classes2.dex */
public class b extends AbstractC1131d {

    /* renamed from: m, reason: collision with root package name */
    protected final AbstractC1131d f8173m;

    public b(AbstractC1131d abstractC1131d) {
        super(abstractC1131d, (i) null);
        this.f8173m = abstractC1131d;
    }

    private boolean I(B b10) {
        return ((this.f8490e == null || b10.I() == null) ? this.f8489d : this.f8490e).length == 1;
    }

    @Override // R5.AbstractC1131d
    public AbstractC1131d F(Object obj) {
        return new b(this, this.f8494i, obj);
    }

    @Override // R5.AbstractC1131d
    public AbstractC1131d G(i iVar) {
        return this.f8173m.G(iVar);
    }

    protected final void J(Object obj, com.fasterxml.jackson.core.f fVar, B b10) {
        P5.c[] cVarArr = (this.f8490e == null || b10.I() == null) ? this.f8489d : this.f8490e;
        int i10 = 0;
        try {
            int length = cVarArr.length;
            while (i10 < length) {
                P5.c cVar = cVarArr[i10];
                if (cVar == null) {
                    fVar.y0();
                } else {
                    cVar.s(obj, fVar, b10);
                }
                i10++;
            }
        } catch (Exception e10) {
            u(b10, e10, obj, cVarArr[i10].l());
        } catch (StackOverflowError e11) {
            D5.l i11 = D5.l.i(fVar, "Infinite recursion (StackOverflowError)", e11);
            i11.e(obj, cVarArr[i10].l());
            throw i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // R5.AbstractC1131d
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public b E(Set set, Set set2) {
        return new b(this, set, set2);
    }

    @Override // D5.o
    public boolean e() {
        return false;
    }

    @Override // R5.H, D5.o
    public final void f(Object obj, com.fasterxml.jackson.core.f fVar, B b10) {
        if (b10.Z(A.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED) && I(b10)) {
            J(obj, fVar, b10);
            return;
        }
        fVar.N1(obj);
        J(obj, fVar, b10);
        fVar.K();
    }

    @Override // R5.AbstractC1131d, D5.o
    public void g(Object obj, com.fasterxml.jackson.core.f fVar, B b10, M5.g gVar) {
        if (this.f8494i != null) {
            w(obj, fVar, b10, gVar);
            return;
        }
        B5.b y10 = y(gVar, obj, com.fasterxml.jackson.core.k.START_ARRAY);
        gVar.g(fVar, y10);
        fVar.q(obj);
        J(obj, fVar, b10);
        gVar.h(fVar, y10);
    }

    @Override // D5.o
    public D5.o h(T5.m mVar) {
        return this.f8173m.h(mVar);
    }

    public String toString() {
        return "BeanAsArraySerializer for " + c().getName();
    }

    protected b(AbstractC1131d abstractC1131d, Set set, Set set2) {
        super(abstractC1131d, set, set2);
        this.f8173m = abstractC1131d;
    }

    protected b(AbstractC1131d abstractC1131d, i iVar, Object obj) {
        super(abstractC1131d, iVar, obj);
        this.f8173m = abstractC1131d;
    }

    @Override // R5.AbstractC1131d
    protected AbstractC1131d z() {
        return this;
    }

    @Override // R5.AbstractC1131d
    protected AbstractC1131d H(P5.c[] cVarArr, P5.c[] cVarArr2) {
        return this;
    }
}
