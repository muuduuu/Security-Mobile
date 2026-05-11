package Q1;

import O1.B;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import c2.C1720c;

/* loaded from: classes.dex */
public class t extends a {

    /* renamed from: r, reason: collision with root package name */
    private final X1.b f8038r;

    /* renamed from: s, reason: collision with root package name */
    private final String f8039s;

    /* renamed from: t, reason: collision with root package name */
    private final boolean f8040t;

    /* renamed from: u, reason: collision with root package name */
    private final R1.a f8041u;

    /* renamed from: v, reason: collision with root package name */
    private R1.a f8042v;

    public t(com.airbnb.lottie.o oVar, X1.b bVar, W1.s sVar) {
        super(oVar, bVar, sVar.b().toPaintCap(), sVar.e().toPaintJoin(), sVar.g(), sVar.i(), sVar.j(), sVar.f(), sVar.d());
        this.f8038r = bVar;
        this.f8039s = sVar.h();
        this.f8040t = sVar.k();
        R1.a p10 = sVar.c().p();
        this.f8041u = p10;
        p10.a(this);
        bVar.i(p10);
    }

    @Override // Q1.a, Q1.e
    public void f(Canvas canvas, Matrix matrix, int i10) {
        if (this.f8040t) {
            return;
        }
        this.f7904i.setColor(((R1.b) this.f8041u).q());
        R1.a aVar = this.f8042v;
        if (aVar != null) {
            this.f7904i.setColorFilter((ColorFilter) aVar.h());
        }
        super.f(canvas, matrix, i10);
    }

    @Override // Q1.c
    public String getName() {
        return this.f8039s;
    }

    @Override // Q1.a, U1.f
    public void h(Object obj, C1720c c1720c) {
        super.h(obj, c1720c);
        if (obj == B.f6870b) {
            this.f8041u.o(c1720c);
            return;
        }
        if (obj == B.f6863K) {
            R1.a aVar = this.f8042v;
            if (aVar != null) {
                this.f8038r.H(aVar);
            }
            if (c1720c == null) {
                this.f8042v = null;
                return;
            }
            R1.q qVar = new R1.q(c1720c);
            this.f8042v = qVar;
            qVar.a(this);
            this.f8038r.i(this.f8041u);
        }
    }
}
