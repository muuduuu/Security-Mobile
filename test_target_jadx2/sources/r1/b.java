package R1;

import c2.C1718a;
import c2.C1720c;
import java.util.List;

/* loaded from: classes.dex */
public class b extends g {
    public b(List list) {
        super(list);
    }

    public int q() {
        return r(b(), d());
    }

    public int r(C1718a c1718a, float f10) {
        Float f11;
        Integer num;
        if (c1718a.f19336b == null || c1718a.f19337c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        C1720c c1720c = this.f8376e;
        return (c1720c == null || (f11 = c1718a.f19342h) == null || (num = (Integer) c1720c.b(c1718a.f19341g, f11.floatValue(), (Integer) c1718a.f19336b, (Integer) c1718a.f19337c, f10, e(), f())) == null) ? b2.d.c(b2.k.b(f10, 0.0f, 1.0f), ((Integer) c1718a.f19336b).intValue(), ((Integer) c1718a.f19337c).intValue()) : num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R1.a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public Integer i(C1718a c1718a, float f10) {
        return Integer.valueOf(r(c1718a, f10));
    }
}
