package R1;

import O1.B;
import R1.a;
import android.graphics.Matrix;
import android.graphics.PointF;
import c2.C1718a;
import c2.C1720c;
import java.util.Collections;

/* loaded from: classes.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    private final Matrix f8428a = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    private final Matrix f8429b;

    /* renamed from: c, reason: collision with root package name */
    private final Matrix f8430c;

    /* renamed from: d, reason: collision with root package name */
    private final Matrix f8431d;

    /* renamed from: e, reason: collision with root package name */
    private final float[] f8432e;

    /* renamed from: f, reason: collision with root package name */
    private a f8433f;

    /* renamed from: g, reason: collision with root package name */
    private a f8434g;

    /* renamed from: h, reason: collision with root package name */
    private a f8435h;

    /* renamed from: i, reason: collision with root package name */
    private a f8436i;

    /* renamed from: j, reason: collision with root package name */
    private a f8437j;

    /* renamed from: k, reason: collision with root package name */
    private d f8438k;

    /* renamed from: l, reason: collision with root package name */
    private d f8439l;

    /* renamed from: m, reason: collision with root package name */
    private a f8440m;

    /* renamed from: n, reason: collision with root package name */
    private a f8441n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f8442o;

    public p(V1.n nVar) {
        this.f8433f = nVar.c() == null ? null : nVar.c().p();
        this.f8434g = nVar.f() == null ? null : nVar.f().p();
        this.f8435h = nVar.h() == null ? null : nVar.h().p();
        this.f8436i = nVar.g() == null ? null : nVar.g().p();
        this.f8438k = nVar.i() == null ? null : nVar.i().p();
        this.f8442o = nVar.l();
        if (this.f8438k != null) {
            this.f8429b = new Matrix();
            this.f8430c = new Matrix();
            this.f8431d = new Matrix();
            this.f8432e = new float[9];
        } else {
            this.f8429b = null;
            this.f8430c = null;
            this.f8431d = null;
            this.f8432e = null;
        }
        this.f8439l = nVar.j() == null ? null : nVar.j().p();
        if (nVar.e() != null) {
            this.f8437j = nVar.e().p();
        }
        if (nVar.k() != null) {
            this.f8440m = nVar.k().p();
        } else {
            this.f8440m = null;
        }
        if (nVar.d() != null) {
            this.f8441n = nVar.d().p();
        } else {
            this.f8441n = null;
        }
    }

    private void d() {
        for (int i10 = 0; i10 < 9; i10++) {
            this.f8432e[i10] = 0.0f;
        }
    }

    public void a(X1.b bVar) {
        bVar.i(this.f8437j);
        bVar.i(this.f8440m);
        bVar.i(this.f8441n);
        bVar.i(this.f8433f);
        bVar.i(this.f8434g);
        bVar.i(this.f8435h);
        bVar.i(this.f8436i);
        bVar.i(this.f8438k);
        bVar.i(this.f8439l);
    }

    public void b(a.b bVar) {
        a aVar = this.f8437j;
        if (aVar != null) {
            aVar.a(bVar);
        }
        a aVar2 = this.f8440m;
        if (aVar2 != null) {
            aVar2.a(bVar);
        }
        a aVar3 = this.f8441n;
        if (aVar3 != null) {
            aVar3.a(bVar);
        }
        a aVar4 = this.f8433f;
        if (aVar4 != null) {
            aVar4.a(bVar);
        }
        a aVar5 = this.f8434g;
        if (aVar5 != null) {
            aVar5.a(bVar);
        }
        a aVar6 = this.f8435h;
        if (aVar6 != null) {
            aVar6.a(bVar);
        }
        a aVar7 = this.f8436i;
        if (aVar7 != null) {
            aVar7.a(bVar);
        }
        d dVar = this.f8438k;
        if (dVar != null) {
            dVar.a(bVar);
        }
        d dVar2 = this.f8439l;
        if (dVar2 != null) {
            dVar2.a(bVar);
        }
    }

    public boolean c(Object obj, C1720c c1720c) {
        if (obj == B.f6874f) {
            a aVar = this.f8433f;
            if (aVar == null) {
                this.f8433f = new q(c1720c, new PointF());
                return true;
            }
            aVar.o(c1720c);
            return true;
        }
        if (obj == B.f6875g) {
            a aVar2 = this.f8434g;
            if (aVar2 == null) {
                this.f8434g = new q(c1720c, new PointF());
                return true;
            }
            aVar2.o(c1720c);
            return true;
        }
        if (obj == B.f6876h) {
            a aVar3 = this.f8434g;
            if (aVar3 instanceof n) {
                ((n) aVar3).s(c1720c);
                return true;
            }
        }
        if (obj == B.f6877i) {
            a aVar4 = this.f8434g;
            if (aVar4 instanceof n) {
                ((n) aVar4).t(c1720c);
                return true;
            }
        }
        if (obj == B.f6883o) {
            a aVar5 = this.f8435h;
            if (aVar5 == null) {
                this.f8435h = new q(c1720c, new c2.d());
                return true;
            }
            aVar5.o(c1720c);
            return true;
        }
        if (obj == B.f6884p) {
            a aVar6 = this.f8436i;
            if (aVar6 == null) {
                this.f8436i = new q(c1720c, Float.valueOf(0.0f));
                return true;
            }
            aVar6.o(c1720c);
            return true;
        }
        if (obj == B.f6871c) {
            a aVar7 = this.f8437j;
            if (aVar7 == null) {
                this.f8437j = new q(c1720c, 100);
                return true;
            }
            aVar7.o(c1720c);
            return true;
        }
        if (obj == B.f6855C) {
            a aVar8 = this.f8440m;
            if (aVar8 == null) {
                this.f8440m = new q(c1720c, Float.valueOf(100.0f));
                return true;
            }
            aVar8.o(c1720c);
            return true;
        }
        if (obj == B.f6856D) {
            a aVar9 = this.f8441n;
            if (aVar9 == null) {
                this.f8441n = new q(c1720c, Float.valueOf(100.0f));
                return true;
            }
            aVar9.o(c1720c);
            return true;
        }
        if (obj == B.f6885q) {
            if (this.f8438k == null) {
                this.f8438k = new d(Collections.singletonList(new C1718a(Float.valueOf(0.0f))));
            }
            this.f8438k.o(c1720c);
            return true;
        }
        if (obj != B.f6886r) {
            return false;
        }
        if (this.f8439l == null) {
            this.f8439l = new d(Collections.singletonList(new C1718a(Float.valueOf(0.0f))));
        }
        this.f8439l.o(c1720c);
        return true;
    }

    public a e() {
        return this.f8441n;
    }

    public Matrix f() {
        PointF pointF;
        c2.d dVar;
        PointF pointF2;
        this.f8428a.reset();
        a aVar = this.f8434g;
        if (aVar != null && (pointF2 = (PointF) aVar.h()) != null) {
            float f10 = pointF2.x;
            if (f10 != 0.0f || pointF2.y != 0.0f) {
                this.f8428a.preTranslate(f10, pointF2.y);
            }
        }
        if (!this.f8442o) {
            a aVar2 = this.f8436i;
            if (aVar2 != null) {
                float floatValue = aVar2 instanceof q ? ((Float) aVar2.h()).floatValue() : ((d) aVar2).q();
                if (floatValue != 0.0f) {
                    this.f8428a.preRotate(floatValue);
                }
            }
        } else if (aVar != null) {
            float f11 = aVar.f();
            PointF pointF3 = (PointF) aVar.h();
            float f12 = pointF3.x;
            float f13 = pointF3.y;
            aVar.n(1.0E-4f + f11);
            PointF pointF4 = (PointF) aVar.h();
            aVar.n(f11);
            this.f8428a.preRotate((float) Math.toDegrees(Math.atan2(pointF4.y - f13, pointF4.x - f12)));
        }
        if (this.f8438k != null) {
            float cos = this.f8439l == null ? 0.0f : (float) Math.cos(Math.toRadians((-r3.q()) + 90.0f));
            float sin = this.f8439l == null ? 1.0f : (float) Math.sin(Math.toRadians((-r5.q()) + 90.0f));
            float tan = (float) Math.tan(Math.toRadians(r0.q()));
            d();
            float[] fArr = this.f8432e;
            fArr[0] = cos;
            fArr[1] = sin;
            float f14 = -sin;
            fArr[3] = f14;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            this.f8429b.setValues(fArr);
            d();
            float[] fArr2 = this.f8432e;
            fArr2[0] = 1.0f;
            fArr2[3] = tan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.f8430c.setValues(fArr2);
            d();
            float[] fArr3 = this.f8432e;
            fArr3[0] = cos;
            fArr3[1] = f14;
            fArr3[3] = sin;
            fArr3[4] = cos;
            fArr3[8] = 1.0f;
            this.f8431d.setValues(fArr3);
            this.f8430c.preConcat(this.f8429b);
            this.f8431d.preConcat(this.f8430c);
            this.f8428a.preConcat(this.f8431d);
        }
        a aVar3 = this.f8435h;
        if (aVar3 != null && (dVar = (c2.d) aVar3.h()) != null && (dVar.b() != 1.0f || dVar.c() != 1.0f)) {
            this.f8428a.preScale(dVar.b(), dVar.c());
        }
        a aVar4 = this.f8433f;
        if (aVar4 != null && (pointF = (PointF) aVar4.h()) != null) {
            float f15 = pointF.x;
            if (f15 != 0.0f || pointF.y != 0.0f) {
                this.f8428a.preTranslate(-f15, -pointF.y);
            }
        }
        return this.f8428a;
    }

    public Matrix g(float f10) {
        a aVar = this.f8434g;
        PointF pointF = aVar == null ? null : (PointF) aVar.h();
        a aVar2 = this.f8435h;
        c2.d dVar = aVar2 == null ? null : (c2.d) aVar2.h();
        this.f8428a.reset();
        if (pointF != null) {
            this.f8428a.preTranslate(pointF.x * f10, pointF.y * f10);
        }
        if (dVar != null) {
            double d10 = f10;
            this.f8428a.preScale((float) Math.pow(dVar.b(), d10), (float) Math.pow(dVar.c(), d10));
        }
        a aVar3 = this.f8436i;
        if (aVar3 != null) {
            float floatValue = ((Float) aVar3.h()).floatValue();
            a aVar4 = this.f8433f;
            PointF pointF2 = aVar4 != null ? (PointF) aVar4.h() : null;
            this.f8428a.preRotate(floatValue * f10, pointF2 == null ? 0.0f : pointF2.x, pointF2 != null ? pointF2.y : 0.0f);
        }
        return this.f8428a;
    }

    public a h() {
        return this.f8437j;
    }

    public a i() {
        return this.f8440m;
    }

    public void j(float f10) {
        a aVar = this.f8437j;
        if (aVar != null) {
            aVar.n(f10);
        }
        a aVar2 = this.f8440m;
        if (aVar2 != null) {
            aVar2.n(f10);
        }
        a aVar3 = this.f8441n;
        if (aVar3 != null) {
            aVar3.n(f10);
        }
        a aVar4 = this.f8433f;
        if (aVar4 != null) {
            aVar4.n(f10);
        }
        a aVar5 = this.f8434g;
        if (aVar5 != null) {
            aVar5.n(f10);
        }
        a aVar6 = this.f8435h;
        if (aVar6 != null) {
            aVar6.n(f10);
        }
        a aVar7 = this.f8436i;
        if (aVar7 != null) {
            aVar7.n(f10);
        }
        d dVar = this.f8438k;
        if (dVar != null) {
            dVar.n(f10);
        }
        d dVar2 = this.f8439l;
        if (dVar2 != null) {
            dVar2.n(f10);
        }
    }
}
