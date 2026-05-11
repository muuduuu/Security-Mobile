package R1;

import c2.C1718a;
import c2.C1720c;
import java.util.List;

/* loaded from: classes.dex */
public class d extends g {
    public d(List list) {
        super(list);
    }

    public float q() {
        return r(b(), d());
    }

    float r(C1718a c1718a, float f10) {
        Float f11;
        if (c1718a.f19336b == null || c1718a.f19337c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        C1720c c1720c = this.f8376e;
        return (c1720c == null || (f11 = (Float) c1720c.b(c1718a.f19341g, c1718a.f19342h.floatValue(), (Float) c1718a.f19336b, (Float) c1718a.f19337c, f10, e(), f())) == null) ? b2.k.i(c1718a.g(), c1718a.d(), f10) : f11.floatValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R1.a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public Float i(C1718a c1718a, float f10) {
        return Float.valueOf(r(c1718a, f10));
    }
}
