package Q5;

import D5.A;
import D5.B;
import R5.K;

/* loaded from: classes2.dex */
public class p extends K {
    public p() {
        super(Object.class);
    }

    @Override // R5.K, R5.H, D5.o
    public void f(Object obj, com.fasterxml.jackson.core.f fVar, B b10) {
        if (b10.Z(A.FAIL_ON_EMPTY_BEANS)) {
            v(b10, obj);
        }
        super.f(obj, fVar, b10);
    }

    @Override // R5.K, D5.o
    public void g(Object obj, com.fasterxml.jackson.core.f fVar, B b10, M5.g gVar) {
        if (b10.Z(A.FAIL_ON_EMPTY_BEANS)) {
            v(b10, obj);
        }
        super.g(obj, fVar, b10, gVar);
    }

    protected void v(B b10, Object obj) {
        b10.j(c(), String.format("No serializer found for class %s and no properties discovered to create BeanSerializer (to avoid exception, disable SerializationFeature.FAIL_ON_EMPTY_BEANS)", obj.getClass().getName()));
    }

    public p(Class cls) {
        super(cls);
    }
}
