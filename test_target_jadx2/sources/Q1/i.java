package Q1;

import O1.B;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import c2.C1720c;

/* loaded from: classes.dex */
public class i extends a {

    /* renamed from: A, reason: collision with root package name */
    private final R1.a f7969A;

    /* renamed from: B, reason: collision with root package name */
    private R1.q f7970B;

    /* renamed from: r, reason: collision with root package name */
    private final String f7971r;

    /* renamed from: s, reason: collision with root package name */
    private final boolean f7972s;

    /* renamed from: t, reason: collision with root package name */
    private final j0.f f7973t;

    /* renamed from: u, reason: collision with root package name */
    private final j0.f f7974u;

    /* renamed from: v, reason: collision with root package name */
    private final RectF f7975v;

    /* renamed from: w, reason: collision with root package name */
    private final W1.g f7976w;

    /* renamed from: x, reason: collision with root package name */
    private final int f7977x;

    /* renamed from: y, reason: collision with root package name */
    private final R1.a f7978y;

    /* renamed from: z, reason: collision with root package name */
    private final R1.a f7979z;

    public i(com.airbnb.lottie.o oVar, X1.b bVar, W1.f fVar) {
        super(oVar, bVar, fVar.b().toPaintCap(), fVar.g().toPaintJoin(), fVar.i(), fVar.k(), fVar.m(), fVar.h(), fVar.c());
        this.f7973t = new j0.f();
        this.f7974u = new j0.f();
        this.f7975v = new RectF();
        this.f7971r = fVar.j();
        this.f7976w = fVar.f();
        this.f7972s = fVar.n();
        this.f7977x = (int) (oVar.K().d() / 32.0f);
        R1.a p10 = fVar.e().p();
        this.f7978y = p10;
        p10.a(this);
        bVar.i(p10);
        R1.a p11 = fVar.l().p();
        this.f7979z = p11;
        p11.a(this);
        bVar.i(p11);
        R1.a p12 = fVar.d().p();
        this.f7969A = p12;
        p12.a(this);
        bVar.i(p12);
    }

    private int[] j(int[] iArr) {
        R1.q qVar = this.f7970B;
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

    private int k() {
        int round = Math.round(this.f7979z.f() * this.f7977x);
        int round2 = Math.round(this.f7969A.f() * this.f7977x);
        int round3 = Math.round(this.f7978y.f() * this.f7977x);
        int i10 = round != 0 ? 527 * round : 17;
        if (round2 != 0) {
            i10 = i10 * 31 * round2;
        }
        return round3 != 0 ? i10 * 31 * round3 : i10;
    }

    private LinearGradient l() {
        long k10 = k();
        LinearGradient linearGradient = (LinearGradient) this.f7973t.h(k10);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF pointF = (PointF) this.f7979z.h();
        PointF pointF2 = (PointF) this.f7969A.h();
        W1.d dVar = (W1.d) this.f7978y.h();
        LinearGradient linearGradient2 = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, j(dVar.d()), dVar.e(), Shader.TileMode.CLAMP);
        this.f7973t.l(k10, linearGradient2);
        return linearGradient2;
    }

    private RadialGradient m() {
        long k10 = k();
        RadialGradient radialGradient = (RadialGradient) this.f7974u.h(k10);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF pointF = (PointF) this.f7979z.h();
        PointF pointF2 = (PointF) this.f7969A.h();
        W1.d dVar = (W1.d) this.f7978y.h();
        int[] j10 = j(dVar.d());
        float[] e10 = dVar.e();
        RadialGradient radialGradient2 = new RadialGradient(pointF.x, pointF.y, (float) Math.hypot(pointF2.x - r7, pointF2.y - r8), j10, e10, Shader.TileMode.CLAMP);
        this.f7974u.l(k10, radialGradient2);
        return radialGradient2;
    }

    @Override // Q1.a, Q1.e
    public void f(Canvas canvas, Matrix matrix, int i10) {
        if (this.f7972s) {
            return;
        }
        c(this.f7975v, matrix, false);
        this.f7904i.setShader(this.f7976w == W1.g.LINEAR ? l() : m());
        super.f(canvas, matrix, i10);
    }

    @Override // Q1.c
    public String getName() {
        return this.f7971r;
    }

    @Override // Q1.a, U1.f
    public void h(Object obj, C1720c c1720c) {
        super.h(obj, c1720c);
        if (obj == B.f6864L) {
            R1.q qVar = this.f7970B;
            if (qVar != null) {
                this.f7901f.H(qVar);
            }
            if (c1720c == null) {
                this.f7970B = null;
                return;
            }
            R1.q qVar2 = new R1.q(c1720c);
            this.f7970B = qVar2;
            qVar2.a(this);
            this.f7901f.i(this.f7970B);
        }
    }
}
