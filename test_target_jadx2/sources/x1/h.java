package X1;

import O1.B;
import R1.q;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import c2.C1720c;
import com.airbnb.lottie.o;

/* loaded from: classes.dex */
public class h extends b {

    /* renamed from: E, reason: collision with root package name */
    private final RectF f11699E;

    /* renamed from: F, reason: collision with root package name */
    private final Paint f11700F;

    /* renamed from: G, reason: collision with root package name */
    private final float[] f11701G;

    /* renamed from: H, reason: collision with root package name */
    private final Path f11702H;

    /* renamed from: I, reason: collision with root package name */
    private final e f11703I;

    /* renamed from: J, reason: collision with root package name */
    private R1.a f11704J;

    /* renamed from: K, reason: collision with root package name */
    private R1.a f11705K;

    h(o oVar, e eVar) {
        super(oVar, eVar);
        this.f11699E = new RectF();
        P1.a aVar = new P1.a();
        this.f11700F = aVar;
        this.f11701G = new float[8];
        this.f11702H = new Path();
        this.f11703I = eVar;
        aVar.setAlpha(0);
        aVar.setStyle(Paint.Style.FILL);
        aVar.setColor(eVar.p());
    }

    @Override // X1.b, Q1.e
    public void c(RectF rectF, Matrix matrix, boolean z10) {
        super.c(rectF, matrix, z10);
        this.f11699E.set(0.0f, 0.0f, this.f11703I.r(), this.f11703I.q());
        this.f11643o.mapRect(this.f11699E);
        rectF.set(this.f11699E);
    }

    @Override // X1.b, U1.f
    public void h(Object obj, C1720c c1720c) {
        super.h(obj, c1720c);
        if (obj == B.f6863K) {
            if (c1720c == null) {
                this.f11704J = null;
                return;
            } else {
                this.f11704J = new q(c1720c);
                return;
            }
        }
        if (obj == B.f6869a) {
            if (c1720c != null) {
                this.f11705K = new q(c1720c);
            } else {
                this.f11705K = null;
                this.f11700F.setColor(this.f11703I.p());
            }
        }
    }

    @Override // X1.b
    public void t(Canvas canvas, Matrix matrix, int i10) {
        int alpha = Color.alpha(this.f11703I.p());
        if (alpha == 0) {
            return;
        }
        R1.a aVar = this.f11705K;
        Integer num = aVar == null ? null : (Integer) aVar.h();
        if (num != null) {
            this.f11700F.setColor(num.intValue());
        } else {
            this.f11700F.setColor(this.f11703I.p());
        }
        int intValue = (int) ((i10 / 255.0f) * (((alpha / 255.0f) * (this.f11652x.h() == null ? 100 : ((Integer) this.f11652x.h().h()).intValue())) / 100.0f) * 255.0f);
        this.f11700F.setAlpha(intValue);
        R1.a aVar2 = this.f11704J;
        if (aVar2 != null) {
            this.f11700F.setColorFilter((ColorFilter) aVar2.h());
        }
        if (intValue > 0) {
            float[] fArr = this.f11701G;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = this.f11703I.r();
            float[] fArr2 = this.f11701G;
            fArr2[3] = 0.0f;
            fArr2[4] = this.f11703I.r();
            this.f11701G[5] = this.f11703I.q();
            float[] fArr3 = this.f11701G;
            fArr3[6] = 0.0f;
            fArr3[7] = this.f11703I.q();
            matrix.mapPoints(this.f11701G);
            this.f11702H.reset();
            Path path = this.f11702H;
            float[] fArr4 = this.f11701G;
            path.moveTo(fArr4[0], fArr4[1]);
            Path path2 = this.f11702H;
            float[] fArr5 = this.f11701G;
            path2.lineTo(fArr5[2], fArr5[3]);
            Path path3 = this.f11702H;
            float[] fArr6 = this.f11701G;
            path3.lineTo(fArr6[4], fArr6[5]);
            Path path4 = this.f11702H;
            float[] fArr7 = this.f11701G;
            path4.lineTo(fArr7[6], fArr7[7]);
            Path path5 = this.f11702H;
            float[] fArr8 = this.f11701G;
            path5.lineTo(fArr8[0], fArr8[1]);
            this.f11702H.close();
            canvas.drawPath(this.f11702H, this.f11700F);
        }
    }
}
