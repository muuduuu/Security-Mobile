package R1;

import android.graphics.PointF;
import c2.C1718a;
import c2.C1720c;
import java.util.List;

/* loaded from: classes.dex */
public class k extends g {

    /* renamed from: i, reason: collision with root package name */
    private final PointF f8411i;

    public k(List list) {
        super(list);
        this.f8411i = new PointF();
    }

    @Override // R1.a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public PointF i(C1718a c1718a, float f10) {
        return j(c1718a, f10, f10, f10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // R1.a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public PointF j(C1718a c1718a, float f10, float f11, float f12) {
        Object obj;
        PointF pointF;
        Object obj2 = c1718a.f19336b;
        if (obj2 == null || (obj = c1718a.f19337c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF2 = (PointF) obj2;
        PointF pointF3 = (PointF) obj;
        C1720c c1720c = this.f8376e;
        if (c1720c != null && (pointF = (PointF) c1720c.b(c1718a.f19341g, c1718a.f19342h.floatValue(), pointF2, pointF3, f10, e(), f())) != null) {
            return pointF;
        }
        PointF pointF4 = this.f8411i;
        float f13 = pointF2.x;
        float f14 = f13 + (f11 * (pointF3.x - f13));
        float f15 = pointF2.y;
        pointF4.set(f14, f15 + (f12 * (pointF3.y - f15)));
        return this.f8411i;
    }
}
