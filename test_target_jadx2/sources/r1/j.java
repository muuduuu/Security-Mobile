package R1;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import c2.C1718a;
import c2.C1720c;
import java.util.List;

/* loaded from: classes.dex */
public class j extends g {

    /* renamed from: i, reason: collision with root package name */
    private final PointF f8406i;

    /* renamed from: j, reason: collision with root package name */
    private final float[] f8407j;

    /* renamed from: k, reason: collision with root package name */
    private final float[] f8408k;

    /* renamed from: l, reason: collision with root package name */
    private final PathMeasure f8409l;

    /* renamed from: m, reason: collision with root package name */
    private i f8410m;

    public j(List list) {
        super(list);
        this.f8406i = new PointF();
        this.f8407j = new float[2];
        this.f8408k = new float[2];
        this.f8409l = new PathMeasure();
    }

    @Override // R1.a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public PointF i(C1718a c1718a, float f10) {
        PointF pointF;
        i iVar = (i) c1718a;
        Path k10 = iVar.k();
        C1720c c1720c = this.f8376e;
        if (c1720c != null && c1718a.f19342h != null && (pointF = (PointF) c1720c.b(iVar.f19341g, iVar.f19342h.floatValue(), (PointF) iVar.f19336b, (PointF) iVar.f19337c, e(), f10, f())) != null) {
            return pointF;
        }
        if (k10 == null) {
            return (PointF) c1718a.f19336b;
        }
        if (this.f8410m != iVar) {
            this.f8409l.setPath(k10, false);
            this.f8410m = iVar;
        }
        float length = this.f8409l.getLength();
        float f11 = f10 * length;
        this.f8409l.getPosTan(f11, this.f8407j, this.f8408k);
        PointF pointF2 = this.f8406i;
        float[] fArr = this.f8407j;
        pointF2.set(fArr[0], fArr[1]);
        if (f11 < 0.0f) {
            PointF pointF3 = this.f8406i;
            float[] fArr2 = this.f8408k;
            pointF3.offset(fArr2[0] * f11, fArr2[1] * f11);
        } else if (f11 > length) {
            PointF pointF4 = this.f8406i;
            float[] fArr3 = this.f8408k;
            float f12 = f11 - length;
            pointF4.offset(fArr3[0] * f12, fArr3[1] * f12);
        }
        return this.f8406i;
    }
}
