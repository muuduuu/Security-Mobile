package Q5;

import D5.A;
import R5.B;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class n extends B {

    /* renamed from: d, reason: collision with root package name */
    public static final n f8224d = new n();

    protected n() {
        super(Collection.class);
    }

    private final void y(Collection collection, com.fasterxml.jackson.core.f fVar, D5.B b10) {
        int i10 = 0;
        try {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (str == null) {
                    b10.v(fVar);
                } else {
                    fVar.h2(str);
                }
                i10++;
            }
        } catch (Exception e10) {
            t(b10, e10, collection, i10);
        }
    }

    @Override // R5.B
    public D5.o v(D5.d dVar, Boolean bool) {
        return new n(this, bool);
    }

    @Override // R5.H, D5.o
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void f(Collection collection, com.fasterxml.jackson.core.f fVar, D5.B b10) {
        int size = collection.size();
        if (size == 1 && ((this.f8459c == null && b10.Z(A.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || this.f8459c == Boolean.TRUE)) {
            y(collection, fVar, b10);
            return;
        }
        fVar.O1(collection, size);
        y(collection, fVar, b10);
        fVar.K();
    }

    @Override // D5.o
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void g(Collection collection, com.fasterxml.jackson.core.f fVar, D5.B b10, M5.g gVar) {
        B5.b g10 = gVar.g(fVar, gVar.d(collection, com.fasterxml.jackson.core.k.START_ARRAY));
        fVar.q(collection);
        y(collection, fVar, b10);
        gVar.h(fVar, g10);
    }

    protected n(n nVar, Boolean bool) {
        super(nVar, bool);
    }
}
