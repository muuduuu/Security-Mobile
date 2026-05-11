package R1;

import R1.a;
import android.graphics.PointF;
import c2.C1718a;
import c2.C1720c;
import java.util.Collections;

/* loaded from: classes.dex */
public class n extends a {

    /* renamed from: i, reason: collision with root package name */
    private final PointF f8418i;

    /* renamed from: j, reason: collision with root package name */
    private final PointF f8419j;

    /* renamed from: k, reason: collision with root package name */
    private final a f8420k;

    /* renamed from: l, reason: collision with root package name */
    private final a f8421l;

    /* renamed from: m, reason: collision with root package name */
    protected C1720c f8422m;

    /* renamed from: n, reason: collision with root package name */
    protected C1720c f8423n;

    public n(a aVar, a aVar2) {
        super(Collections.emptyList());
        this.f8418i = new PointF();
        this.f8419j = new PointF();
        this.f8420k = aVar;
        this.f8421l = aVar2;
        n(f());
    }

    @Override // R1.a
    public void n(float f10) {
        this.f8420k.n(f10);
        this.f8421l.n(f10);
        this.f8418i.set(((Float) this.f8420k.h()).floatValue(), ((Float) this.f8421l.h()).floatValue());
        for (int i10 = 0; i10 < this.f8372a.size(); i10++) {
            ((a.b) this.f8372a.get(i10)).a();
        }
    }

    @Override // R1.a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public PointF h() {
        return i(null, 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R1.a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public PointF i(C1718a c1718a, float f10) {
        Float f11;
        C1718a b10;
        C1718a b11;
        Float f12 = null;
        if (this.f8422m == null || (b11 = this.f8420k.b()) == null) {
            f11 = null;
        } else {
            Float f13 = b11.f19342h;
            C1720c c1720c = this.f8422m;
            float f14 = b11.f19341g;
            f11 = (Float) c1720c.b(f14, f13 == null ? f14 : f13.floatValue(), (Float) b11.f19336b, (Float) b11.f19337c, this.f8420k.d(), this.f8420k.e(), this.f8420k.f());
        }
        if (this.f8423n != null && (b10 = this.f8421l.b()) != null) {
            Float f15 = b10.f19342h;
            C1720c c1720c2 = this.f8423n;
            float f16 = b10.f19341g;
            f12 = (Float) c1720c2.b(f16, f15 == null ? f16 : f15.floatValue(), (Float) b10.f19336b, (Float) b10.f19337c, this.f8421l.d(), this.f8421l.e(), this.f8421l.f());
        }
        if (f11 == null) {
            this.f8419j.set(this.f8418i.x, 0.0f);
        } else {
            this.f8419j.set(f11.floatValue(), 0.0f);
        }
        if (f12 == null) {
            PointF pointF = this.f8419j;
            pointF.set(pointF.x, this.f8418i.y);
        } else {
            PointF pointF2 = this.f8419j;
            pointF2.set(pointF2.x, f12.floatValue());
        }
        return this.f8419j;
    }

    public void s(C1720c c1720c) {
        C1720c c1720c2 = this.f8422m;
        if (c1720c2 != null) {
            c1720c2.c(null);
        }
        this.f8422m = c1720c;
        if (c1720c != null) {
            c1720c.c(this);
        }
    }

    public void t(C1720c c1720c) {
        C1720c c1720c2 = this.f8423n;
        if (c1720c2 != null) {
            c1720c2.c(null);
        }
        this.f8423n = c1720c;
        if (c1720c != null) {
            c1720c.c(this);
        }
    }
}
