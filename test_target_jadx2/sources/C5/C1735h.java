package c5;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.react.uimanager.C1944g0;
import com.facebook.react.uimanager.L;
import e5.C3082d;
import e5.C3085g;
import e5.C3086h;
import kotlin.jvm.internal.Intrinsics;
import zc.AbstractC5272a;

/* renamed from: c5.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1735h extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    private final Context f19417a;

    /* renamed from: b, reason: collision with root package name */
    private final int f19418b;

    /* renamed from: c, reason: collision with root package name */
    private final float f19419c;

    /* renamed from: d, reason: collision with root package name */
    private final float f19420d;

    /* renamed from: e, reason: collision with root package name */
    private final float f19421e;

    /* renamed from: f, reason: collision with root package name */
    private final float f19422f;

    /* renamed from: g, reason: collision with root package name */
    private C3082d f19423g;

    /* renamed from: h, reason: collision with root package name */
    private final Paint f19424h;

    public C1735h(Context context, C3082d c3082d, int i10, float f10, float f11, float f12, float f13) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f19417a = context;
        this.f19418b = i10;
        this.f19419c = f10;
        this.f19420d = f11;
        this.f19421e = f12;
        this.f19422f = f13;
        this.f19423g = c3082d;
        Paint paint = new Paint();
        paint.setColor(i10);
        if (f12 > 0.0f) {
            paint.setMaskFilter(new BlurMaskFilter(L.f22176a.x(f12 * 0.5f), BlurMaskFilter.Blur.NORMAL));
        }
        this.f19424h = paint;
    }

    private final void a(Canvas canvas, RectF rectF) {
        canvas.clipOutRect(getBounds());
        canvas.drawRect(rectF, this.f19424h);
    }

    private final void b(Canvas canvas, RectF rectF, float f10, C3085g c3085g) {
        RectF rectF2 = new RectF(getBounds());
        rectF2.inset(0.4f, 0.4f);
        Path path = new Path();
        float[] fArr = {c3085g.c().a(), c3085g.c().b(), c3085g.d().a(), c3085g.d().b(), c3085g.b().a(), c3085g.b().b(), c3085g.a().a(), c3085g.a().b()};
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF2, fArr, direction);
        canvas.clipOutPath(path);
        Path path2 = new Path();
        path2.addRoundRect(rectF, new float[]{AbstractC1728a.a(c3085g.c().a(), f10), AbstractC1728a.a(c3085g.c().b(), f10), AbstractC1728a.a(c3085g.d().a(), f10), AbstractC1728a.a(c3085g.d().b(), f10), AbstractC1728a.a(c3085g.b().a(), f10), AbstractC1728a.a(c3085g.b().b(), f10), AbstractC1728a.a(c3085g.a().a(), f10), AbstractC1728a.a(c3085g.a().b(), f10)}, direction);
        canvas.drawPath(path2, this.f19424h);
    }

    public final C3082d c() {
        return this.f19423g;
    }

    public final void d(C3082d c3082d) {
        if (Intrinsics.b(c3082d, this.f19423g)) {
            return;
        }
        this.f19423g = c3082d;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        C3085g c10;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        C1944g0 c1944g0 = C1944g0.f22418a;
        float d10 = c1944g0.d(getBounds().width());
        float d11 = c1944g0.d(getBounds().height());
        C3082d c3082d = this.f19423g;
        C3085g c3085g = (c3082d == null || (c10 = c3082d.c(getLayoutDirection(), this.f19417a, d10, d11)) == null) ? null : new C3085g(new C3086h(c1944g0.b(c10.c().a()), c1944g0.b(c10.c().b())), new C3086h(c1944g0.b(c10.d().a()), c1944g0.b(c10.d().b())), new C3086h(c1944g0.b(c10.a().a()), c1944g0.b(c10.a().b())), new C3086h(c1944g0.b(c10.b().a()), c1944g0.b(c10.b().b())));
        float b10 = c1944g0.b(this.f19422f);
        RectF rectF = new RectF(getBounds());
        float f10 = -b10;
        rectF.inset(f10, f10);
        rectF.offset(c1944g0.b(this.f19419c), c1944g0.b(this.f19420d));
        int save = canvas.save();
        if (c3085g == null || !c3085g.e()) {
            a(canvas, rectF);
        } else {
            b(canvas, rectF, b10, c3085g);
        }
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return AbstractC5272a.c(((this.f19424h.getAlpha() / 255.0f) / (Color.alpha(this.f19418b) / 255.0f)) * 255.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f19424h.setAlpha(AbstractC5272a.c((i10 / 255.0f) * (Color.alpha(this.f19418b) / 255.0f) * 255.0f));
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f19424h.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
