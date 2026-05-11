package X1;

import O1.C1038i;
import W1.q;
import Z1.C1319j;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.o;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class g extends b {

    /* renamed from: E, reason: collision with root package name */
    private final Q1.d f11697E;

    /* renamed from: F, reason: collision with root package name */
    private final c f11698F;

    g(o oVar, e eVar, c cVar, C1038i c1038i) {
        super(oVar, eVar);
        this.f11698F = cVar;
        Q1.d dVar = new Q1.d(oVar, this, new q("__container", eVar.o(), false), c1038i);
        this.f11697E = dVar;
        dVar.b(Collections.emptyList(), Collections.emptyList());
    }

    @Override // X1.b
    protected void I(U1.e eVar, int i10, List list, U1.e eVar2) {
        this.f11697E.d(eVar, i10, list, eVar2);
    }

    @Override // X1.b, Q1.e
    public void c(RectF rectF, Matrix matrix, boolean z10) {
        super.c(rectF, matrix, z10);
        this.f11697E.c(rectF, this.f11643o, z10);
    }

    @Override // X1.b
    void t(Canvas canvas, Matrix matrix, int i10) {
        this.f11697E.f(canvas, matrix, i10);
    }

    @Override // X1.b
    public W1.a w() {
        W1.a w10 = super.w();
        return w10 != null ? w10 : this.f11698F.w();
    }

    @Override // X1.b
    public C1319j y() {
        C1319j y10 = super.y();
        return y10 != null ? y10 : this.f11698F.y();
    }
}
