package X1;

import O1.AbstractC1034e;
import O1.B;
import O1.C1038i;
import R1.q;
import X1.e;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import b2.l;
import c2.C1720c;
import com.airbnb.lottie.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class c extends b {

    /* renamed from: E, reason: collision with root package name */
    private R1.a f11657E;

    /* renamed from: F, reason: collision with root package name */
    private final List f11658F;

    /* renamed from: G, reason: collision with root package name */
    private final RectF f11659G;

    /* renamed from: H, reason: collision with root package name */
    private final RectF f11660H;

    /* renamed from: I, reason: collision with root package name */
    private final Paint f11661I;

    /* renamed from: J, reason: collision with root package name */
    private float f11662J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f11663K;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f11664a;

        static {
            int[] iArr = new int[e.b.values().length];
            f11664a = iArr;
            try {
                iArr[e.b.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11664a[e.b.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public c(o oVar, e eVar, List list, C1038i c1038i) {
        super(oVar, eVar);
        int i10;
        b bVar;
        this.f11658F = new ArrayList();
        this.f11659G = new RectF();
        this.f11660H = new RectF();
        this.f11661I = new Paint();
        this.f11663K = true;
        V1.b v10 = eVar.v();
        if (v10 != null) {
            R1.d p10 = v10.p();
            this.f11657E = p10;
            i(p10);
            this.f11657E.a(this);
        } else {
            this.f11657E = null;
        }
        j0.f fVar = new j0.f(c1038i.k().size());
        int size = list.size() - 1;
        b bVar2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            e eVar2 = (e) list.get(size);
            b u10 = b.u(this, eVar2, oVar, c1038i);
            if (u10 != null) {
                fVar.l(u10.z().e(), u10);
                if (bVar2 != null) {
                    bVar2.K(u10);
                    bVar2 = null;
                } else {
                    this.f11658F.add(0, u10);
                    int i11 = a.f11664a[eVar2.i().ordinal()];
                    if (i11 == 1 || i11 == 2) {
                        bVar2 = u10;
                    }
                }
            }
            size--;
        }
        for (i10 = 0; i10 < fVar.o(); i10++) {
            b bVar3 = (b) fVar.h(fVar.k(i10));
            if (bVar3 != null && (bVar = (b) fVar.h(bVar3.z().k())) != null) {
                bVar3.M(bVar);
            }
        }
    }

    @Override // X1.b
    protected void I(U1.e eVar, int i10, List list, U1.e eVar2) {
        for (int i11 = 0; i11 < this.f11658F.size(); i11++) {
            ((b) this.f11658F.get(i11)).d(eVar, i10, list, eVar2);
        }
    }

    @Override // X1.b
    public void L(boolean z10) {
        super.L(z10);
        Iterator it = this.f11658F.iterator();
        while (it.hasNext()) {
            ((b) it.next()).L(z10);
        }
    }

    @Override // X1.b
    public void N(float f10) {
        if (AbstractC1034e.h()) {
            AbstractC1034e.b("CompositionLayer#setProgress");
        }
        this.f11662J = f10;
        super.N(f10);
        if (this.f11657E != null) {
            f10 = ((((Float) this.f11657E.h()).floatValue() * this.f11645q.c().i()) - this.f11645q.c().p()) / (this.f11644p.K().e() + 0.01f);
        }
        if (this.f11657E == null) {
            f10 -= this.f11645q.s();
        }
        if (this.f11645q.w() != 0.0f && !"__container".equals(this.f11645q.j())) {
            f10 /= this.f11645q.w();
        }
        for (int size = this.f11658F.size() - 1; size >= 0; size--) {
            ((b) this.f11658F.get(size)).N(f10);
        }
        if (AbstractC1034e.h()) {
            AbstractC1034e.c("CompositionLayer#setProgress");
        }
    }

    public float Q() {
        return this.f11662J;
    }

    public void R(boolean z10) {
        this.f11663K = z10;
    }

    @Override // X1.b, Q1.e
    public void c(RectF rectF, Matrix matrix, boolean z10) {
        super.c(rectF, matrix, z10);
        for (int size = this.f11658F.size() - 1; size >= 0; size--) {
            this.f11659G.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((b) this.f11658F.get(size)).c(this.f11659G, this.f11643o, true);
            rectF.union(this.f11659G);
        }
    }

    @Override // X1.b, U1.f
    public void h(Object obj, C1720c c1720c) {
        super.h(obj, c1720c);
        if (obj == B.f6857E) {
            if (c1720c == null) {
                R1.a aVar = this.f11657E;
                if (aVar != null) {
                    aVar.o(null);
                    return;
                }
                return;
            }
            q qVar = new q(c1720c);
            this.f11657E = qVar;
            qVar.a(this);
            i(this.f11657E);
        }
    }

    @Override // X1.b
    void t(Canvas canvas, Matrix matrix, int i10) {
        if (AbstractC1034e.h()) {
            AbstractC1034e.b("CompositionLayer#draw");
        }
        this.f11660H.set(0.0f, 0.0f, this.f11645q.m(), this.f11645q.l());
        matrix.mapRect(this.f11660H);
        boolean z10 = this.f11644p.g0() && this.f11658F.size() > 1 && i10 != 255;
        if (z10) {
            this.f11661I.setAlpha(i10);
            l.n(canvas, this.f11660H, this.f11661I);
        } else {
            canvas.save();
        }
        if (z10) {
            i10 = 255;
        }
        for (int size = this.f11658F.size() - 1; size >= 0; size--) {
            if (((this.f11663K || !"__container".equals(this.f11645q.j())) && !this.f11660H.isEmpty()) ? canvas.clipRect(this.f11660H) : true) {
                ((b) this.f11658F.get(size)).f(canvas, matrix, i10);
            }
        }
        canvas.restore();
        if (AbstractC1034e.h()) {
            AbstractC1034e.c("CompositionLayer#draw");
        }
    }
}
