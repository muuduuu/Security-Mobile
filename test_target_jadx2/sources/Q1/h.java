package Q1;

import O1.AbstractC1034e;
import O1.B;
import O1.C1038i;
import R1.a;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import c2.C1720c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class h implements e, a.b, k {

    /* renamed from: a, reason: collision with root package name */
    private final String f7948a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f7949b;

    /* renamed from: c, reason: collision with root package name */
    private final X1.b f7950c;

    /* renamed from: d, reason: collision with root package name */
    private final j0.f f7951d = new j0.f();

    /* renamed from: e, reason: collision with root package name */
    private final j0.f f7952e = new j0.f();

    /* renamed from: f, reason: collision with root package name */
    private final Path f7953f;

    /* renamed from: g, reason: collision with root package name */
    private final Paint f7954g;

    /* renamed from: h, reason: collision with root package name */
    private final RectF f7955h;

    /* renamed from: i, reason: collision with root package name */
    private final List f7956i;

    /* renamed from: j, reason: collision with root package name */
    private final W1.g f7957j;

    /* renamed from: k, reason: collision with root package name */
    private final R1.a f7958k;

    /* renamed from: l, reason: collision with root package name */
    private final R1.a f7959l;

    /* renamed from: m, reason: collision with root package name */
    private final R1.a f7960m;

    /* renamed from: n, reason: collision with root package name */
    private final R1.a f7961n;

    /* renamed from: o, reason: collision with root package name */
    private R1.a f7962o;

    /* renamed from: p, reason: collision with root package name */
    private R1.q f7963p;

    /* renamed from: q, reason: collision with root package name */
    private final com.airbnb.lottie.o f7964q;

    /* renamed from: r, reason: collision with root package name */
    private final int f7965r;

    /* renamed from: s, reason: collision with root package name */
    private R1.a f7966s;

    /* renamed from: t, reason: collision with root package name */
    float f7967t;

    /* renamed from: u, reason: collision with root package name */
    private R1.c f7968u;

    public h(com.airbnb.lottie.o oVar, C1038i c1038i, X1.b bVar, W1.e eVar) {
        Path path = new Path();
        this.f7953f = path;
        this.f7954g = new P1.a(1);
        this.f7955h = new RectF();
        this.f7956i = new ArrayList();
        this.f7967t = 0.0f;
        this.f7950c = bVar;
        this.f7948a = eVar.f();
        this.f7949b = eVar.i();
        this.f7964q = oVar;
        this.f7957j = eVar.e();
        path.setFillType(eVar.c());
        this.f7965r = (int) (c1038i.d() / 32.0f);
        R1.a p10 = eVar.d().p();
        this.f7958k = p10;
        p10.a(this);
        bVar.i(p10);
        R1.a p11 = eVar.g().p();
        this.f7959l = p11;
        p11.a(this);
        bVar.i(p11);
        R1.a p12 = eVar.h().p();
        this.f7960m = p12;
        p12.a(this);
        bVar.i(p12);
        R1.a p13 = eVar.b().p();
        this.f7961n = p13;
        p13.a(this);
        bVar.i(p13);
        if (bVar.w() != null) {
            R1.d p14 = bVar.w().a().p();
            this.f7966s = p14;
            p14.a(this);
            bVar.i(this.f7966s);
        }
        if (bVar.y() != null) {
            this.f7968u = new R1.c(this, bVar, bVar.y());
        }
    }

    private int[] e(int[] iArr) {
        R1.q qVar = this.f7963p;
        if (qVar != null) {
            Integer[] numArr = (Integer[]) qVar.h();
            int i10 = 0;
            if (iArr.length == numArr.length) {
                while (i10 < iArr.length) {
                    iArr[i10] = numArr[i10].intValue();
                    i10++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i10 < numArr.length) {
                    iArr[i10] = numArr[i10].intValue();
                    i10++;
                }
            }
        }
        return iArr;
    }

    private int i() {
        int round = Math.round(this.f7960m.f() * this.f7965r);
        int round2 = Math.round(this.f7961n.f() * this.f7965r);
        int round3 = Math.round(this.f7958k.f() * this.f7965r);
        int i10 = round != 0 ? 527 * round : 17;
        if (round2 != 0) {
            i10 = i10 * 31 * round2;
        }
        return round3 != 0 ? i10 * 31 * round3 : i10;
    }

    private LinearGradient j() {
        long i10 = i();
        LinearGradient linearGradient = (LinearGradient) this.f7951d.h(i10);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF pointF = (PointF) this.f7960m.h();
        PointF pointF2 = (PointF) this.f7961n.h();
        W1.d dVar = (W1.d) this.f7958k.h();
        LinearGradient linearGradient2 = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, e(dVar.d()), dVar.e(), Shader.TileMode.CLAMP);
        this.f7951d.l(i10, linearGradient2);
        return linearGradient2;
    }

    private RadialGradient k() {
        long i10 = i();
        RadialGradient radialGradient = (RadialGradient) this.f7952e.h(i10);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF pointF = (PointF) this.f7960m.h();
        PointF pointF2 = (PointF) this.f7961n.h();
        W1.d dVar = (W1.d) this.f7958k.h();
        int[] e10 = e(dVar.d());
        float[] e11 = dVar.e();
        float f10 = pointF.x;
        float f11 = pointF.y;
        float hypot = (float) Math.hypot(pointF2.x - f10, pointF2.y - f11);
        if (hypot <= 0.0f) {
            hypot = 0.001f;
        }
        RadialGradient radialGradient2 = new RadialGradient(f10, f11, hypot, e10, e11, Shader.TileMode.CLAMP);
        this.f7952e.l(i10, radialGradient2);
        return radialGradient2;
    }

    @Override // R1.a.b
    public void a() {
        this.f7964q.invalidateSelf();
    }

    @Override // Q1.c
    public void b(List list, List list2) {
        for (int i10 = 0; i10 < list2.size(); i10++) {
            c cVar = (c) list2.get(i10);
            if (cVar instanceof m) {
                this.f7956i.add((m) cVar);
            }
        }
    }

    @Override // Q1.e
    public void c(RectF rectF, Matrix matrix, boolean z10) {
        this.f7953f.reset();
        for (int i10 = 0; i10 < this.f7956i.size(); i10++) {
            this.f7953f.addPath(((m) this.f7956i.get(i10)).J(), matrix);
        }
        this.f7953f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // U1.f
    public void d(U1.e eVar, int i10, List list, U1.e eVar2) {
        b2.k.k(eVar, i10, list, eVar2, this);
    }

    @Override // Q1.e
    public void f(Canvas canvas, Matrix matrix, int i10) {
        if (this.f7949b) {
            return;
        }
        if (AbstractC1034e.h()) {
            AbstractC1034e.b("GradientFillContent#draw");
        }
        this.f7953f.reset();
        for (int i11 = 0; i11 < this.f7956i.size(); i11++) {
            this.f7953f.addPath(((m) this.f7956i.get(i11)).J(), matrix);
        }
        this.f7953f.computeBounds(this.f7955h, false);
        Shader j10 = this.f7957j == W1.g.LINEAR ? j() : k();
        j10.setLocalMatrix(matrix);
        this.f7954g.setShader(j10);
        R1.a aVar = this.f7962o;
        if (aVar != null) {
            this.f7954g.setColorFilter((ColorFilter) aVar.h());
        }
        R1.a aVar2 = this.f7966s;
        if (aVar2 != null) {
            float floatValue = ((Float) aVar2.h()).floatValue();
            if (floatValue == 0.0f) {
                this.f7954g.setMaskFilter(null);
            } else if (floatValue != this.f7967t) {
                this.f7954g.setMaskFilter(new BlurMaskFilter(floatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.f7967t = floatValue;
        }
        int intValue = (int) ((((i10 / 255.0f) * ((Integer) this.f7959l.h()).intValue()) / 100.0f) * 255.0f);
        this.f7954g.setAlpha(b2.k.c(intValue, 0, 255));
        R1.c cVar = this.f7968u;
        if (cVar != null) {
            cVar.b(this.f7954g, matrix, b2.l.l(i10, intValue));
        }
        canvas.drawPath(this.f7953f, this.f7954g);
        if (AbstractC1034e.h()) {
            AbstractC1034e.c("GradientFillContent#draw");
        }
    }

    @Override // Q1.c
    public String getName() {
        return this.f7948a;
    }

    @Override // U1.f
    public void h(Object obj, C1720c c1720c) {
        R1.c cVar;
        R1.c cVar2;
        R1.c cVar3;
        R1.c cVar4;
        R1.c cVar5;
        if (obj == B.f6872d) {
            this.f7959l.o(c1720c);
            return;
        }
        if (obj == B.f6863K) {
            R1.a aVar = this.f7962o;
            if (aVar != null) {
                this.f7950c.H(aVar);
            }
            if (c1720c == null) {
                this.f7962o = null;
                return;
            }
            R1.q qVar = new R1.q(c1720c);
            this.f7962o = qVar;
            qVar.a(this);
            this.f7950c.i(this.f7962o);
            return;
        }
        if (obj == B.f6864L) {
            R1.q qVar2 = this.f7963p;
            if (qVar2 != null) {
                this.f7950c.H(qVar2);
            }
            if (c1720c == null) {
                this.f7963p = null;
                return;
            }
            this.f7951d.a();
            this.f7952e.a();
            R1.q qVar3 = new R1.q(c1720c);
            this.f7963p = qVar3;
            qVar3.a(this);
            this.f7950c.i(this.f7963p);
            return;
        }
        if (obj == B.f6878j) {
            R1.a aVar2 = this.f7966s;
            if (aVar2 != null) {
                aVar2.o(c1720c);
                return;
            }
            R1.q qVar4 = new R1.q(c1720c);
            this.f7966s = qVar4;
            qVar4.a(this);
            this.f7950c.i(this.f7966s);
            return;
        }
        if (obj == B.f6873e && (cVar5 = this.f7968u) != null) {
            cVar5.c(c1720c);
            return;
        }
        if (obj == B.f6859G && (cVar4 = this.f7968u) != null) {
            cVar4.f(c1720c);
            return;
        }
        if (obj == B.f6860H && (cVar3 = this.f7968u) != null) {
            cVar3.d(c1720c);
            return;
        }
        if (obj == B.f6861I && (cVar2 = this.f7968u) != null) {
            cVar2.e(c1720c);
        } else {
            if (obj != B.f6862J || (cVar = this.f7968u) == null) {
                return;
            }
            cVar.g(c1720c);
        }
    }
}
