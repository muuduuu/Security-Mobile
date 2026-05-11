package Q5;

import D5.A;
import D5.B;
import R5.AbstractC1131d;
import java.io.Serializable;
import java.util.Set;

/* loaded from: classes2.dex */
public class s extends AbstractC1131d implements Serializable {

    /* renamed from: m, reason: collision with root package name */
    protected final T5.m f8230m;

    public s(AbstractC1131d abstractC1131d, T5.m mVar) {
        super(abstractC1131d, mVar);
        this.f8230m = mVar;
    }

    @Override // R5.AbstractC1131d
    protected AbstractC1131d E(Set set, Set set2) {
        return new s(this, set, set2);
    }

    @Override // R5.AbstractC1131d
    public AbstractC1131d F(Object obj) {
        return new s(this, this.f8494i, obj);
    }

    @Override // R5.AbstractC1131d
    public AbstractC1131d G(i iVar) {
        return new s(this, iVar);
    }

    @Override // R5.AbstractC1131d
    protected AbstractC1131d H(P5.c[] cVarArr, P5.c[] cVarArr2) {
        return new s(this, cVarArr, cVarArr2);
    }

    @Override // D5.o
    public boolean e() {
        return true;
    }

    @Override // R5.H, D5.o
    public final void f(Object obj, com.fasterxml.jackson.core.f fVar, B b10) {
        fVar.q(obj);
        if (this.f8494i != null) {
            x(obj, fVar, b10, false);
        } else if (this.f8492g != null) {
            D(obj, fVar, b10);
        } else {
            C(obj, fVar, b10);
        }
    }

    @Override // R5.AbstractC1131d, D5.o
    public void g(Object obj, com.fasterxml.jackson.core.f fVar, B b10, M5.g gVar) {
        if (b10.Z(A.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS)) {
            b10.j(c(), "Unwrapped property requires use of type information: cannot serialize without disabling `SerializationFeature.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS`");
        }
        fVar.q(obj);
        if (this.f8494i != null) {
            w(obj, fVar, b10, gVar);
        } else if (this.f8492g != null) {
            D(obj, fVar, b10);
        } else {
            C(obj, fVar, b10);
        }
    }

    @Override // D5.o
    public D5.o h(T5.m mVar) {
        return new s(this, mVar);
    }

    public String toString() {
        return "UnwrappingBeanSerializer for " + c().getName();
    }

    public s(s sVar, i iVar) {
        super(sVar, iVar);
        this.f8230m = sVar.f8230m;
    }

    public s(s sVar, i iVar, Object obj) {
        super(sVar, iVar, obj);
        this.f8230m = sVar.f8230m;
    }

    protected s(s sVar, Set set, Set set2) {
        super(sVar, set, set2);
        this.f8230m = sVar.f8230m;
    }

    protected s(s sVar, P5.c[] cVarArr, P5.c[] cVarArr2) {
        super(sVar, cVarArr, cVarArr2);
        this.f8230m = sVar.f8230m;
    }

    @Override // R5.AbstractC1131d
    protected AbstractC1131d z() {
        return this;
    }
}
