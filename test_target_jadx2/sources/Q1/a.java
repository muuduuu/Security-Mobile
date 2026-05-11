package Q1;

import O1.AbstractC1034e;
import O1.B;
import R1.a;
import W1.t;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import c2.C1720c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class a implements a.b, k, e {

    /* renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.o f7900e;

    /* renamed from: f, reason: collision with root package name */
    protected final X1.b f7901f;

    /* renamed from: h, reason: collision with root package name */
    private final float[] f7903h;

    /* renamed from: i, reason: collision with root package name */
    final Paint f7904i;

    /* renamed from: j, reason: collision with root package name */
    private final R1.a f7905j;

    /* renamed from: k, reason: collision with root package name */
    private final R1.a f7906k;

    /* renamed from: l, reason: collision with root package name */
    private final List f7907l;

    /* renamed from: m, reason: collision with root package name */
    private final R1.a f7908m;

    /* renamed from: n, reason: collision with root package name */
    private R1.a f7909n;

    /* renamed from: o, reason: collision with root package name */
    private R1.a f7910o;

    /* renamed from: p, reason: collision with root package name */
    float f7911p;

    /* renamed from: q, reason: collision with root package name */
    private R1.c f7912q;

    /* renamed from: a, reason: collision with root package name */
    private final PathMeasure f7896a = new PathMeasure();

    /* renamed from: b, reason: collision with root package name */
    private final Path f7897b = new Path();

    /* renamed from: c, reason: collision with root package name */
    private final Path f7898c = new Path();

    /* renamed from: d, reason: collision with root package name */
    private final RectF f7899d = new RectF();

    /* renamed from: g, reason: collision with root package name */
    private final List f7902g = new ArrayList();

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final List f7913a;

        /* renamed from: b, reason: collision with root package name */
        private final u f7914b;

        private b(u uVar) {
            this.f7913a = new ArrayList();
            this.f7914b = uVar;
        }
    }

    a(com.airbnb.lottie.o oVar, X1.b bVar, Paint.Cap cap, Paint.Join join, float f10, V1.d dVar, V1.b bVar2, List list, V1.b bVar3) {
        P1.a aVar = new P1.a(1);
        this.f7904i = aVar;
        this.f7911p = 0.0f;
        this.f7900e = oVar;
        this.f7901f = bVar;
        aVar.setStyle(Paint.Style.STROKE);
        aVar.setStrokeCap(cap);
        aVar.setStrokeJoin(join);
        aVar.setStrokeMiter(f10);
        this.f7906k = dVar.p();
        this.f7905j = bVar2.p();
        if (bVar3 == null) {
            this.f7908m = null;
        } else {
            this.f7908m = bVar3.p();
        }
        this.f7907l = new ArrayList(list.size());
        this.f7903h = new float[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f7907l.add(((V1.b) list.get(i10)).p());
        }
        bVar.i(this.f7906k);
        bVar.i(this.f7905j);
        for (int i11 = 0; i11 < this.f7907l.size(); i11++) {
            bVar.i((R1.a) this.f7907l.get(i11));
        }
        R1.a aVar2 = this.f7908m;
        if (aVar2 != null) {
            bVar.i(aVar2);
        }
        this.f7906k.a(this);
        this.f7905j.a(this);
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((R1.a) this.f7907l.get(i12)).a(this);
        }
        R1.a aVar3 = this.f7908m;
        if (aVar3 != null) {
            aVar3.a(this);
        }
        if (bVar.w() != null) {
            R1.d p10 = bVar.w().a().p();
            this.f7910o = p10;
            p10.a(this);
            bVar.i(this.f7910o);
        }
        if (bVar.y() != null) {
            this.f7912q = new R1.c(this, bVar, bVar.y());
        }
    }

    private void e() {
        if (AbstractC1034e.h()) {
            AbstractC1034e.b("StrokeContent#applyDashPattern");
        }
        if (this.f7907l.isEmpty()) {
            if (AbstractC1034e.h()) {
                AbstractC1034e.c("StrokeContent#applyDashPattern");
                return;
            }
            return;
        }
        for (int i10 = 0; i10 < this.f7907l.size(); i10++) {
            this.f7903h[i10] = ((Float) ((R1.a) this.f7907l.get(i10)).h()).floatValue();
            if (i10 % 2 == 0) {
                float[] fArr = this.f7903h;
                if (fArr[i10] < 1.0f) {
                    fArr[i10] = 1.0f;
                }
            } else {
                float[] fArr2 = this.f7903h;
                if (fArr2[i10] < 0.1f) {
                    fArr2[i10] = 0.1f;
                }
            }
        }
        R1.a aVar = this.f7908m;
        this.f7904i.setPathEffect(new DashPathEffect(this.f7903h, aVar == null ? 0.0f : ((Float) aVar.h()).floatValue()));
        if (AbstractC1034e.h()) {
            AbstractC1034e.c("StrokeContent#applyDashPattern");
        }
    }

    private void i(Canvas canvas, b bVar) {
        if (AbstractC1034e.h()) {
            AbstractC1034e.b("StrokeContent#applyTrimPath");
        }
        if (bVar.f7914b == null) {
            if (AbstractC1034e.h()) {
                AbstractC1034e.c("StrokeContent#applyTrimPath");
                return;
            }
            return;
        }
        this.f7897b.reset();
        for (int size = bVar.f7913a.size() - 1; size >= 0; size--) {
            this.f7897b.addPath(((m) bVar.f7913a.get(size)).J());
        }
        float floatValue = ((Float) bVar.f7914b.i().h()).floatValue() / 100.0f;
        float floatValue2 = ((Float) bVar.f7914b.e().h()).floatValue() / 100.0f;
        float floatValue3 = ((Float) bVar.f7914b.h().h()).floatValue() / 360.0f;
        if (floatValue < 0.01f && floatValue2 > 0.99f) {
            canvas.drawPath(this.f7897b, this.f7904i);
            if (AbstractC1034e.h()) {
                AbstractC1034e.c("StrokeContent#applyTrimPath");
                return;
            }
            return;
        }
        this.f7896a.setPath(this.f7897b, false);
        float length = this.f7896a.getLength();
        while (this.f7896a.nextContour()) {
            length += this.f7896a.getLength();
        }
        float f10 = floatValue3 * length;
        float f11 = (floatValue * length) + f10;
        float min = Math.min((floatValue2 * length) + f10, (f11 + length) - 1.0f);
        float f12 = 0.0f;
        for (int size2 = bVar.f7913a.size() - 1; size2 >= 0; size2--) {
            this.f7898c.set(((m) bVar.f7913a.get(size2)).J());
            this.f7896a.setPath(this.f7898c, false);
            float length2 = this.f7896a.getLength();
            if (min > length) {
                float f13 = min - length;
                if (f13 < f12 + length2 && f12 < f13) {
                    b2.l.a(this.f7898c, f11 > length ? (f11 - length) / length2 : 0.0f, Math.min(f13 / length2, 1.0f), 0.0f);
                    canvas.drawPath(this.f7898c, this.f7904i);
                    f12 += length2;
                }
            }
            float f14 = f12 + length2;
            if (f14 >= f11 && f12 <= min) {
                if (f14 > min || f11 >= f12) {
                    b2.l.a(this.f7898c, f11 < f12 ? 0.0f : (f11 - f12) / length2, min > f14 ? 1.0f : (min - f12) / length2, 0.0f);
                    canvas.drawPath(this.f7898c, this.f7904i);
                } else {
                    canvas.drawPath(this.f7898c, this.f7904i);
                }
            }
            f12 += length2;
        }
        if (AbstractC1034e.h()) {
            AbstractC1034e.c("StrokeContent#applyTrimPath");
        }
    }

    @Override // R1.a.b
    public void a() {
        this.f7900e.invalidateSelf();
    }

    @Override // Q1.c
    public void b(List list, List list2) {
        u uVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            c cVar = (c) list.get(size);
            if (cVar instanceof u) {
                u uVar2 = (u) cVar;
                if (uVar2.j() == t.a.INDIVIDUALLY) {
                    uVar = uVar2;
                }
            }
        }
        if (uVar != null) {
            uVar.d(this);
        }
        b bVar = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            c cVar2 = (c) list2.get(size2);
            if (cVar2 instanceof u) {
                u uVar3 = (u) cVar2;
                if (uVar3.j() == t.a.INDIVIDUALLY) {
                    if (bVar != null) {
                        this.f7902g.add(bVar);
                    }
                    bVar = new b(uVar3);
                    uVar3.d(this);
                }
            }
            if (cVar2 instanceof m) {
                if (bVar == null) {
                    bVar = new b(uVar);
                }
                bVar.f7913a.add((m) cVar2);
            }
        }
        if (bVar != null) {
            this.f7902g.add(bVar);
        }
    }

    @Override // Q1.e
    public void c(RectF rectF, Matrix matrix, boolean z10) {
        if (AbstractC1034e.h()) {
            AbstractC1034e.b("StrokeContent#getBounds");
        }
        this.f7897b.reset();
        for (int i10 = 0; i10 < this.f7902g.size(); i10++) {
            b bVar = (b) this.f7902g.get(i10);
            for (int i11 = 0; i11 < bVar.f7913a.size(); i11++) {
                this.f7897b.addPath(((m) bVar.f7913a.get(i11)).J(), matrix);
            }
        }
        this.f7897b.computeBounds(this.f7899d, false);
        float q10 = ((R1.d) this.f7905j).q();
        RectF rectF2 = this.f7899d;
        float f10 = q10 / 2.0f;
        rectF2.set(rectF2.left - f10, rectF2.top - f10, rectF2.right + f10, rectF2.bottom + f10);
        rectF.set(this.f7899d);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        if (AbstractC1034e.h()) {
            AbstractC1034e.c("StrokeContent#getBounds");
        }
    }

    @Override // U1.f
    public void d(U1.e eVar, int i10, List list, U1.e eVar2) {
        b2.k.k(eVar, i10, list, eVar2, this);
    }

    @Override // Q1.e
    public void f(Canvas canvas, Matrix matrix, int i10) {
        if (AbstractC1034e.h()) {
            AbstractC1034e.b("StrokeContent#draw");
        }
        if (b2.l.h(matrix)) {
            if (AbstractC1034e.h()) {
                AbstractC1034e.c("StrokeContent#draw");
                return;
            }
            return;
        }
        int q10 = (int) ((((i10 / 255.0f) * ((R1.f) this.f7906k).q()) / 100.0f) * 255.0f);
        this.f7904i.setAlpha(b2.k.c(q10, 0, 255));
        this.f7904i.setStrokeWidth(((R1.d) this.f7905j).q());
        if (this.f7904i.getStrokeWidth() <= 0.0f) {
            if (AbstractC1034e.h()) {
                AbstractC1034e.c("StrokeContent#draw");
                return;
            }
            return;
        }
        e();
        R1.a aVar = this.f7909n;
        if (aVar != null) {
            this.f7904i.setColorFilter((ColorFilter) aVar.h());
        }
        R1.a aVar2 = this.f7910o;
        if (aVar2 != null) {
            float floatValue = ((Float) aVar2.h()).floatValue();
            if (floatValue == 0.0f) {
                this.f7904i.setMaskFilter(null);
            } else if (floatValue != this.f7911p) {
                this.f7904i.setMaskFilter(this.f7901f.x(floatValue));
            }
            this.f7911p = floatValue;
        }
        R1.c cVar = this.f7912q;
        if (cVar != null) {
            cVar.b(this.f7904i, matrix, b2.l.l(i10, q10));
        }
        canvas.save();
        canvas.concat(matrix);
        for (int i11 = 0; i11 < this.f7902g.size(); i11++) {
            b bVar = (b) this.f7902g.get(i11);
            if (bVar.f7914b != null) {
                i(canvas, bVar);
            } else {
                if (AbstractC1034e.h()) {
                    AbstractC1034e.b("StrokeContent#buildPath");
                }
                this.f7897b.reset();
                for (int size = bVar.f7913a.size() - 1; size >= 0; size--) {
                    this.f7897b.addPath(((m) bVar.f7913a.get(size)).J());
                }
                if (AbstractC1034e.h()) {
                    AbstractC1034e.c("StrokeContent#buildPath");
                    AbstractC1034e.b("StrokeContent#drawPath");
                }
                canvas.drawPath(this.f7897b, this.f7904i);
                if (AbstractC1034e.h()) {
                    AbstractC1034e.c("StrokeContent#drawPath");
                }
            }
        }
        canvas.restore();
        if (AbstractC1034e.h()) {
            AbstractC1034e.c("StrokeContent#draw");
        }
    }

    @Override // U1.f
    public void h(Object obj, C1720c c1720c) {
        R1.c cVar;
        R1.c cVar2;
        R1.c cVar3;
        R1.c cVar4;
        R1.c cVar5;
        if (obj == B.f6872d) {
            this.f7906k.o(c1720c);
            return;
        }
        if (obj == B.f6887s) {
            this.f7905j.o(c1720c);
            return;
        }
        if (obj == B.f6863K) {
            R1.a aVar = this.f7909n;
            if (aVar != null) {
                this.f7901f.H(aVar);
            }
            if (c1720c == null) {
                this.f7909n = null;
                return;
            }
            R1.q qVar = new R1.q(c1720c);
            this.f7909n = qVar;
            qVar.a(this);
            this.f7901f.i(this.f7909n);
            return;
        }
        if (obj == B.f6878j) {
            R1.a aVar2 = this.f7910o;
            if (aVar2 != null) {
                aVar2.o(c1720c);
                return;
            }
            R1.q qVar2 = new R1.q(c1720c);
            this.f7910o = qVar2;
            qVar2.a(this);
            this.f7901f.i(this.f7910o);
            return;
        }
        if (obj == B.f6873e && (cVar5 = this.f7912q) != null) {
            cVar5.c(c1720c);
            return;
        }
        if (obj == B.f6859G && (cVar4 = this.f7912q) != null) {
            cVar4.f(c1720c);
            return;
        }
        if (obj == B.f6860H && (cVar3 = this.f7912q) != null) {
            cVar3.d(c1720c);
            return;
        }
        if (obj == B.f6861I && (cVar2 = this.f7912q) != null) {
            cVar2.e(c1720c);
        } else {
            if (obj != B.f6862J || (cVar = this.f7912q) == null) {
                return;
            }
            cVar.g(c1720c);
        }
    }
}
