package Q5;

import D5.A;
import R5.B;
import java.util.List;

/* loaded from: classes2.dex */
public final class f extends B {

    /* renamed from: d, reason: collision with root package name */
    public static final f f8179d = new f();

    protected f() {
        super(List.class);
    }

    private final void y(List list, com.fasterxml.jackson.core.f fVar, D5.B b10, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            try {
                String str = (String) list.get(i11);
                if (str == null) {
                    b10.v(fVar);
                } else {
                    fVar.h2(str);
                }
            } catch (Exception e10) {
                t(b10, e10, list, i11);
                return;
            }
        }
    }

    @Override // R5.B
    public D5.o v(D5.d dVar, Boolean bool) {
        return new f(this, bool);
    }

    @Override // R5.H, D5.o
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void f(List list, com.fasterxml.jackson.core.f fVar, D5.B b10) {
        int size = list.size();
        if (size == 1 && ((this.f8459c == null && b10.Z(A.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || this.f8459c == Boolean.TRUE)) {
            y(list, fVar, b10, 1);
            return;
        }
        fVar.O1(list, size);
        y(list, fVar, b10, size);
        fVar.K();
    }

    @Override // D5.o
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void g(List list, com.fasterxml.jackson.core.f fVar, D5.B b10, M5.g gVar) {
        B5.b g10 = gVar.g(fVar, gVar.d(list, com.fasterxml.jackson.core.k.START_ARRAY));
        fVar.q(list);
        y(list, fVar, b10, list.size());
        gVar.h(fVar, g10);
    }

    public f(f fVar, Boolean bool) {
        super(fVar, bool);
    }
}
