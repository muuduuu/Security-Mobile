package Z1;

import a2.AbstractC1346c;
import android.graphics.PointF;

/* loaded from: classes.dex */
public class B implements N {

    /* renamed from: a, reason: collision with root package name */
    public static final B f12283a = new B();

    private B() {
    }

    @Override // Z1.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public PointF a(AbstractC1346c abstractC1346c, float f10) {
        AbstractC1346c.b p10 = abstractC1346c.p();
        if (p10 == AbstractC1346c.b.BEGIN_ARRAY) {
            return s.e(abstractC1346c, f10);
        }
        if (p10 == AbstractC1346c.b.BEGIN_OBJECT) {
            return s.e(abstractC1346c, f10);
        }
        if (p10 == AbstractC1346c.b.NUMBER) {
            PointF pointF = new PointF(((float) abstractC1346c.i()) * f10, ((float) abstractC1346c.i()) * f10);
            while (abstractC1346c.f()) {
                abstractC1346c.t();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is " + p10);
    }
}
