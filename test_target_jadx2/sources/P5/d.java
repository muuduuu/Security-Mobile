package P5;

import D5.B;
import R5.AbstractC1131d;
import java.util.Set;

/* loaded from: classes2.dex */
public class d extends AbstractC1131d {
    public d(D5.j jVar, e eVar, c[] cVarArr, c[] cVarArr2) {
        super(jVar, eVar, cVarArr, cVarArr2);
    }

    public static d I(D5.j jVar, e eVar) {
        return new d(jVar, eVar, AbstractC1131d.f8487l, null);
    }

    @Override // R5.AbstractC1131d
    protected AbstractC1131d E(Set set, Set set2) {
        return new d(this, set, set2);
    }

    @Override // R5.AbstractC1131d
    public AbstractC1131d F(Object obj) {
        return new d(this, this.f8494i, obj);
    }

    @Override // R5.AbstractC1131d
    public AbstractC1131d G(Q5.i iVar) {
        return new d(this, iVar, this.f8492g);
    }

    @Override // R5.AbstractC1131d
    protected AbstractC1131d H(c[] cVarArr, c[] cVarArr2) {
        return new d(this, cVarArr, cVarArr2);
    }

    @Override // R5.H, D5.o
    public final void f(Object obj, com.fasterxml.jackson.core.f fVar, B b10) {
        if (this.f8494i != null) {
            fVar.q(obj);
            x(obj, fVar, b10, true);
            return;
        }
        fVar.e2(obj);
        if (this.f8492g != null) {
            D(obj, fVar, b10);
        } else {
            C(obj, fVar, b10);
        }
        fVar.N();
    }

    @Override // D5.o
    public D5.o h(T5.m mVar) {
        return new Q5.s(this, mVar);
    }

    public String toString() {
        return "BeanSerializer for " + c().getName();
    }

    @Override // R5.AbstractC1131d
    protected AbstractC1131d z() {
        return (this.f8494i == null && this.f8491f == null && this.f8492g == null) ? new Q5.b(this) : this;
    }

    protected d(AbstractC1131d abstractC1131d, Q5.i iVar, Object obj) {
        super(abstractC1131d, iVar, obj);
    }

    protected d(AbstractC1131d abstractC1131d, Set set, Set set2) {
        super(abstractC1131d, set, set2);
    }

    protected d(AbstractC1131d abstractC1131d, c[] cVarArr, c[] cVarArr2) {
        super(abstractC1131d, cVarArr, cVarArr2);
    }
}
