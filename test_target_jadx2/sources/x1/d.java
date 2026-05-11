package X1;

import O1.B;
import O1.x;
import R1.q;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import b2.l;
import c2.C1720c;
import com.airbnb.lottie.o;

/* loaded from: classes.dex */
public class d extends b {

    /* renamed from: E, reason: collision with root package name */
    private final Paint f11665E;

    /* renamed from: F, reason: collision with root package name */
    private final Rect f11666F;

    /* renamed from: G, reason: collision with root package name */
    private final Rect f11667G;

    /* renamed from: H, reason: collision with root package name */
    private final x f11668H;

    /* renamed from: I, reason: collision with root package name */
    private R1.a f11669I;

    /* renamed from: J, reason: collision with root package name */
    private R1.a f11670J;

    /* renamed from: K, reason: collision with root package name */
    private R1.c f11671K;

    d(o oVar, e eVar) {
        super(oVar, eVar);
        this.f11665E = new P1.a(3);
        this.f11666F = new Rect();
        this.f11667G = new Rect();
        this.f11668H = oVar.Q(eVar.n());
        if (y() != null) {
            this.f11671K = new R1.c(this, this, y());
        }
    }

    private Bitmap Q() {
        Bitmap bitmap;
        R1.a aVar = this.f11670J;
        if (aVar != null && (bitmap = (Bitmap) aVar.h()) != null) {
            return bitmap;
        }
        Bitmap H10 = this.f11644p.H(this.f11645q.n());
        if (H10 != null) {
            return H10;
        }
        x xVar = this.f11668H;
        if (xVar != null) {
            return xVar.b();
        }
        return null;
    }

    @Override // X1.b, Q1.e
    public void c(RectF rectF, Matrix matrix, boolean z10) {
        super.c(rectF, matrix, z10);
        if (this.f11668H != null) {
            float e10 = l.e();
            rectF.set(0.0f, 0.0f, this.f11668H.f() * e10, this.f11668H.d() * e10);
            this.f11643o.mapRect(rectF);
        }
    }

    @Override // X1.b, U1.f
    public void h(Object obj, C1720c c1720c) {
        super.h(obj, c1720c);
        if (obj == B.f6863K) {
            if (c1720c == null) {
                this.f11669I = null;
                return;
            } else {
                this.f11669I = new q(c1720c);
                return;
            }
        }
        if (obj == B.f6866N) {
            if (c1720c == null) {
                this.f11670J = null;
            } else {
                this.f11670J = new q(c1720c);
            }
        }
    }

    @Override // X1.b
    public void t(Canvas canvas, Matrix matrix, int i10) {
        Bitmap Q10 = Q();
        if (Q10 == null || Q10.isRecycled() || this.f11668H == null) {
            return;
        }
        float e10 = l.e();
        this.f11665E.setAlpha(i10);
        R1.a aVar = this.f11669I;
        if (aVar != null) {
            this.f11665E.setColorFilter((ColorFilter) aVar.h());
        }
        canvas.save();
        canvas.concat(matrix);
        this.f11666F.set(0, 0, Q10.getWidth(), Q10.getHeight());
        if (this.f11644p.R()) {
            this.f11667G.set(0, 0, (int) (this.f11668H.f() * e10), (int) (this.f11668H.d() * e10));
        } else {
            this.f11667G.set(0, 0, (int) (Q10.getWidth() * e10), (int) (Q10.getHeight() * e10));
        }
        R1.c cVar = this.f11671K;
        if (cVar != null) {
            cVar.b(this.f11665E, matrix, i10);
        }
        canvas.drawBitmap(Q10, this.f11666F, this.f11667G, this.f11665E);
        canvas.restore();
    }
}
