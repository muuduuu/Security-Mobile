package R1;

import c2.C1718a;
import c2.C1720c;
import java.util.List;

/* loaded from: classes.dex */
public class l extends g {

    /* renamed from: i, reason: collision with root package name */
    private final c2.d f8412i;

    public l(List list) {
        super(list);
        this.f8412i = new c2.d();
    }

    @Override // R1.a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public c2.d i(C1718a c1718a, float f10) {
        Object obj;
        c2.d dVar;
        Object obj2 = c1718a.f19336b;
        if (obj2 == null || (obj = c1718a.f19337c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        c2.d dVar2 = (c2.d) obj2;
        c2.d dVar3 = (c2.d) obj;
        C1720c c1720c = this.f8376e;
        if (c1720c != null && (dVar = (c2.d) c1720c.b(c1718a.f19341g, c1718a.f19342h.floatValue(), dVar2, dVar3, f10, e(), f())) != null) {
            return dVar;
        }
        this.f8412i.d(b2.k.i(dVar2.b(), dVar3.b(), f10), b2.k.i(dVar2.c(), dVar3.c(), f10));
        return this.f8412i;
    }
}
