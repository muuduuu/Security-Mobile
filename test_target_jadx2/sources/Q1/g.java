package Q1;

import O1.AbstractC1034e;
import O1.B;
import R1.a;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import c2.C1720c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class g implements e, a.b, k {

    /* renamed from: a, reason: collision with root package name */
    private final Path f7935a;

    /* renamed from: b, reason: collision with root package name */
    private final Paint f7936b;

    /* renamed from: c, reason: collision with root package name */
    private final X1.b f7937c;

    /* renamed from: d, reason: collision with root package name */
    private final String f7938d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f7939e;

    /* renamed from: f, reason: collision with root package name */
    private final List f7940f;

    /* renamed from: g, reason: collision with root package name */
    private final R1.a f7941g;

    /* renamed from: h, reason: collision with root package name */
    private final R1.a f7942h;

    /* renamed from: i, reason: collision with root package name */
    private R1.a f7943i;

    /* renamed from: j, reason: collision with root package name */
    private final com.airbnb.lottie.o f7944j;

    /* renamed from: k, reason: collision with root package name */
    private R1.a f7945k;

    /* renamed from: l, reason: collision with root package name */
    float f7946l;

    /* renamed from: m, reason: collision with root package name */
    private R1.c f7947m;

    public g(com.airbnb.lottie.o oVar, X1.b bVar, W1.p pVar) {
        Path path = new Path();
        this.f7935a = path;
        this.f7936b = new P1.a(1);
        this.f7940f = new ArrayList();
        this.f7937c = bVar;
        this.f7938d = pVar.d();
        this.f7939e = pVar.f();
        this.f7944j = oVar;
        if (bVar.w() != null) {
            R1.d p10 = bVar.w().a().p();
            this.f7945k = p10;
            p10.a(this);
            bVar.i(this.f7945k);
        }
        if (bVar.y() != null) {
            this.f7947m = new R1.c(this, bVar, bVar.y());
        }
        if (pVar.b() == null || pVar.e() == null) {
            this.f7941g = null;
            this.f7942h = null;
            return;
        }
        path.setFillType(pVar.c());
        R1.a p11 = pVar.b().p();
        this.f7941g = p11;
        p11.a(this);
        bVar.i(p11);
        R1.a p12 = pVar.e().p();
        this.f7942h = p12;
        p12.a(this);
        bVar.i(p12);
    }

    @Override // R1.a.b
    public void a() {
        this.f7944j.invalidateSelf();
    }

    @Override // Q1.c
    public void b(List list, List list2) {
        for (int i10 = 0; i10 < list2.size(); i10++) {
            c cVar = (c) list2.get(i10);
            if (cVar instanceof m) {
                this.f7940f.add((m) cVar);
            }
        }
    }

    @Override // Q1.e
    public void c(RectF rectF, Matrix matrix, boolean z10) {
        this.f7935a.reset();
        for (int i10 = 0; i10 < this.f7940f.size(); i10++) {
            this.f7935a.addPath(((m) this.f7940f.get(i10)).J(), matrix);
        }
        this.f7935a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // U1.f
    public void d(U1.e eVar, int i10, List list, U1.e eVar2) {
        b2.k.k(eVar, i10, list, eVar2, this);
    }

    @Override // Q1.e
    public void f(Canvas canvas, Matrix matrix, int i10) {
        if (this.f7939e) {
            return;
        }
        if (AbstractC1034e.h()) {
            AbstractC1034e.b("FillContent#draw");
        }
        int intValue = (int) ((((i10 / 255.0f) * ((Integer) this.f7942h.h()).intValue()) / 100.0f) * 255.0f);
        this.f7936b.setColor((((R1.b) this.f7941g).q() & 16777215) | (b2.k.c(intValue, 0, 255) << 24));
        R1.a aVar = this.f7943i;
        if (aVar != null) {
            this.f7936b.setColorFilter((ColorFilter) aVar.h());
        }
        R1.a aVar2 = this.f7945k;
        if (aVar2 != null) {
            float floatValue = ((Float) aVar2.h()).floatValue();
            if (floatValue == 0.0f) {
                this.f7936b.setMaskFilter(null);
            } else if (floatValue != this.f7946l) {
                this.f7936b.setMaskFilter(this.f7937c.x(floatValue));
            }
            this.f7946l = floatValue;
        }
        R1.c cVar = this.f7947m;
        if (cVar != null) {
            cVar.b(this.f7936b, matrix, b2.l.l(i10, intValue));
        }
        this.f7935a.reset();
        for (int i11 = 0; i11 < this.f7940f.size(); i11++) {
            this.f7935a.addPath(((m) this.f7940f.get(i11)).J(), matrix);
        }
        canvas.drawPath(this.f7935a, this.f7936b);
        if (AbstractC1034e.h()) {
            AbstractC1034e.c("FillContent#draw");
        }
    }

    @Override // Q1.c
    public String getName() {
        return this.f7938d;
    }

    @Override // U1.f
    public void h(Object obj, C1720c c1720c) {
        R1.c cVar;
        R1.c cVar2;
        R1.c cVar3;
        R1.c cVar4;
        R1.c cVar5;
        if (obj == B.f6869a) {
            this.f7941g.o(c1720c);
            return;
        }
        if (obj == B.f6872d) {
            this.f7942h.o(c1720c);
            return;
        }
        if (obj == B.f6863K) {
            R1.a aVar = this.f7943i;
            if (aVar != null) {
                this.f7937c.H(aVar);
            }
            if (c1720c == null) {
                this.f7943i = null;
                return;
            }
            R1.q qVar = new R1.q(c1720c);
            this.f7943i = qVar;
            qVar.a(this);
            this.f7937c.i(this.f7943i);
            return;
        }
        if (obj == B.f6878j) {
            R1.a aVar2 = this.f7945k;
            if (aVar2 != null) {
                aVar2.o(c1720c);
                return;
            }
            R1.q qVar2 = new R1.q(c1720c);
            this.f7945k = qVar2;
            qVar2.a(this);
            this.f7937c.i(this.f7945k);
            return;
        }
        if (obj == B.f6873e && (cVar5 = this.f7947m) != null) {
            cVar5.c(c1720c);
            return;
        }
        if (obj == B.f6859G && (cVar4 = this.f7947m) != null) {
            cVar4.f(c1720c);
            return;
        }
        if (obj == B.f6860H && (cVar3 = this.f7947m) != null) {
            cVar3.d(c1720c);
            return;
        }
        if (obj == B.f6861I && (cVar2 = this.f7947m) != null) {
            cVar2.e(c1720c);
        } else {
            if (obj != B.f6862J || (cVar = this.f7947m) == null) {
                return;
            }
            cVar.g(c1720c);
        }
    }
}
