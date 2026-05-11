package W1;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    private final List f11229a;

    /* renamed from: b, reason: collision with root package name */
    private PointF f11230b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f11231c;

    public o(PointF pointF, boolean z10, List list) {
        this.f11230b = pointF;
        this.f11231c = z10;
        this.f11229a = new ArrayList(list);
    }

    public List a() {
        return this.f11229a;
    }

    public PointF b() {
        return this.f11230b;
    }

    public void c(o oVar, o oVar2, float f10) {
        if (this.f11230b == null) {
            this.f11230b = new PointF();
        }
        this.f11231c = oVar.d() || oVar2.d();
        if (oVar.a().size() != oVar2.a().size()) {
            b2.f.c("Curves must have the same number of control points. Shape 1: " + oVar.a().size() + "\tShape 2: " + oVar2.a().size());
        }
        int min = Math.min(oVar.a().size(), oVar2.a().size());
        if (this.f11229a.size() < min) {
            for (int size = this.f11229a.size(); size < min; size++) {
                this.f11229a.add(new U1.a());
            }
        } else if (this.f11229a.size() > min) {
            for (int size2 = this.f11229a.size() - 1; size2 >= min; size2--) {
                List list = this.f11229a;
                list.remove(list.size() - 1);
            }
        }
        PointF b10 = oVar.b();
        PointF b11 = oVar2.b();
        f(b2.k.i(b10.x, b11.x, f10), b2.k.i(b10.y, b11.y, f10));
        for (int size3 = this.f11229a.size() - 1; size3 >= 0; size3--) {
            U1.a aVar = (U1.a) oVar.a().get(size3);
            U1.a aVar2 = (U1.a) oVar2.a().get(size3);
            PointF a10 = aVar.a();
            PointF b12 = aVar.b();
            PointF c10 = aVar.c();
            PointF a11 = aVar2.a();
            PointF b13 = aVar2.b();
            PointF c11 = aVar2.c();
            ((U1.a) this.f11229a.get(size3)).d(b2.k.i(a10.x, a11.x, f10), b2.k.i(a10.y, a11.y, f10));
            ((U1.a) this.f11229a.get(size3)).e(b2.k.i(b12.x, b13.x, f10), b2.k.i(b12.y, b13.y, f10));
            ((U1.a) this.f11229a.get(size3)).f(b2.k.i(c10.x, c11.x, f10), b2.k.i(c10.y, c11.y, f10));
        }
    }

    public boolean d() {
        return this.f11231c;
    }

    public void e(boolean z10) {
        this.f11231c = z10;
    }

    public void f(float f10, float f11) {
        if (this.f11230b == null) {
            this.f11230b = new PointF();
        }
        this.f11230b.set(f10, f11);
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.f11229a.size() + "closed=" + this.f11231c + '}';
    }

    public o() {
        this.f11229a = new ArrayList();
    }
}
