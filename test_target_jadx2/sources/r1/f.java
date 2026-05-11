package R1;

import c2.C1718a;
import c2.C1720c;
import java.util.List;

/* loaded from: classes.dex */
public class f extends g {
    public f(List list) {
        super(list);
    }

    public int q() {
        return r(b(), d());
    }

    int r(C1718a c1718a, float f10) {
        Integer num;
        if (c1718a.f19336b == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        int h10 = c1718a.f19337c == null ? c1718a.h() : c1718a.e();
        C1720c c1720c = this.f8376e;
        return (c1720c == null || (num = (Integer) c1720c.b(c1718a.f19341g, c1718a.f19342h.floatValue(), (Integer) c1718a.f19336b, Integer.valueOf(h10), f10, e(), f())) == null) ? b2.k.j(c1718a.h(), h10, f10) : num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R1.a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public Integer i(C1718a c1718a, float f10) {
        return Integer.valueOf(r(c1718a, f10));
    }
}
