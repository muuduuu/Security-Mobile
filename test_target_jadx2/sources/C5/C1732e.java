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
import e5.C3080b;
import e5.C3082d;
import e5.C3085g;
import e5.C3086h;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import zc.AbstractC5272a;

/* renamed from: c5.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1732e extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    private final Context f19407a;

    /* renamed from: b, reason: collision with root package name */
    private final int f19408b;

    /* renamed from: c, reason: collision with root package name */
    private final float f19409c;

    /* renamed from: d, reason: collision with root package name */
    private final float f19410d;

    /* renamed from: e, reason: collision with root package name */
    private final float f19411e;

    /* renamed from: f, reason: collision with root package name */
    private final float f19412f;

    /* renamed from: g, reason: collision with root package name */
    private C3082d f19413g;

    /* renamed from: h, reason: collision with root package name */
    private C3080b f19414h;

    /* renamed from: i, reason: collision with root package name */
    private final Paint f19415i;

    public C1732e(Context context, C3082d c3082d, C3080b c3080b, int i10, float f10, float f11, float f12, float f13) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f19407a = context;
        this.f19408b = i10;
        this.f19409c = f10;
        this.f19410d = f11;
        this.f19411e = f12;
        this.f19412f = f13;
        this.f19413g = c3082d;
        this.f19414h = c3080b;
        Paint paint = new Paint();
        paint.setColor(i10);
        if (f12 > 0.0f) {
            paint.setMaskFilter(new BlurMaskFilter(L.f22176a.x(f12 * 0.5f), BlurMaskFilter.Blur.NORMAL));
        }
        this.f19415i = paint;
    }

    private final RectF a() {
        RectF a10;
        C3080b c3080b = this.f19414h;
        if (c3080b == null || (a10 = c3080b.a(getLayoutDirection(), this.f19407a)) == null) {
            return null;
        }
        C1944g0 c1944g0 = C1944g0.f22418a;
        return new RectF(c1944g0.b(a10.left), c1944g0.b(a10.top), c1944g0.b(a10.right), c1944g0.b(a10.bottom));
    }

    private final C3085g b() {
        C3085g c3085g;
        C3082d c3082d = this.f19413g;
        if (c3082d != null) {
            int layoutDirection = getLayoutDirection();
            Context context = this.f19407a;
            C1944g0 c1944g0 = C1944g0.f22418a;
            c3085g = c3082d.c(layoutDirection, context, c1944g0.d(getBounds().width()), c1944g0.d(getBounds().height()));
        } else {
            c3085g = null;
        }
        if (c3085g == null || !c3085g.e()) {
            return null;
        }
        C1944g0 c1944g02 = C1944g0.f22418a;
        return new C3085g(new C3086h(c1944g02.b(c3085g.c().a()), c1944g02.b(c3085g.c().b())), new C3086h(c1944g02.b(c3085g.d().a()), c1944g02.b(c3085g.d().b())), new C3086h(c1944g02.b(c3085g.a().a()), c1944g02.b(c3085g.a().b())), new C3086h(c1944g02.b(c3085g.b().a()), c1944g02.b(c3085g.b().b())));
    }

    private final float d(float f10, Float f11) {
        return kotlin.ranges.d.c(f10 - (f11 != null ? f11.floatValue() : 0.0f), 0.0f);
    }

    public final C3082d c() {
        return this.f19413g;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        float[] fArr;
        float[] fArr2;
        float[] fArr3;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        C3085g b10 = b();
        RectF a10 = a();
        RectF rectF = new RectF(getBounds().left + (a10 != null ? a10.left : 0.0f), getBounds().top + (a10 != null ? a10.top : 0.0f), getBounds().right - (a10 != null ? a10.right : 0.0f), getBounds().bottom - (a10 != null ? a10.bottom : 0.0f));
        float[] fArr4 = b10 != null ? new float[]{d(b10.c().a(), a10 != null ? Float.valueOf(a10.left) : null), d(b10.c().b(), a10 != null ? Float.valueOf(a10.top) : null), d(b10.d().a(), a10 != null ? Float.valueOf(a10.right) : null), d(b10.d().b(), a10 != null ? Float.valueOf(a10.top) : null), d(b10.b().a(), a10 != null ? Float.valueOf(a10.right) : null), d(b10.b().b(), a10 != null ? Float.valueOf(a10.bottom) : null), d(b10.a().a(), a10 != null ? Float.valueOf(a10.left) : null), d(b10.a().b(), a10 != null ? Float.valueOf(a10.bottom) : null)} : null;
        C1944g0 c1944g0 = C1944g0.f22418a;
        float b11 = c1944g0.b(this.f19409c);
        float b12 = c1944g0.b(this.f19410d);
        float b13 = c1944g0.b(this.f19412f);
        RectF rectF2 = new RectF(rectF);
        rectF2.inset(b13, b13);
        rectF2.offset(b11, b12);
        float x10 = L.f22176a.x(this.f19411e);
        RectF rectF3 = new RectF(rectF2);
        float f10 = -x10;
        rectF3.inset(f10, f10);
        if (b13 < 0.0f) {
            rectF3.inset(b13, b13);
        }
        RectF rectF4 = new RectF(rectF3);
        rectF4.offset(-b11, -b12);
        rectF3.union(rectF4);
        int save = canvas.save();
        if (fArr4 != null) {
            Path path = new Path();
            path.addRoundRect(rectF, fArr4, Path.Direction.CW);
            canvas.clipPath(path);
            ArrayList arrayList = new ArrayList(fArr4.length);
            for (float f11 : fArr4) {
                arrayList.add(Float.valueOf(AbstractC1728a.a(f11, -b13)));
            }
            float[] L02 = CollectionsKt.L0(arrayList);
            fArr3 = AbstractC1733f.f19416a;
            canvas.drawDoubleRoundRect(rectF3, fArr3, rectF2, L02, this.f19415i);
        } else {
            canvas.clipRect(rectF);
            fArr = AbstractC1733f.f19416a;
            fArr2 = AbstractC1733f.f19416a;
            canvas.drawDoubleRoundRect(rectF3, fArr, rectF2, fArr2, this.f19415i);
        }
        canvas.restoreToCount(save);
    }

    public final void e(C3080b c3080b) {
        if (Intrinsics.b(c3080b, this.f19414h)) {
            return;
        }
        this.f19414h = c3080b;
        invalidateSelf();
    }

    public final void f(C3082d c3082d) {
        if (Intrinsics.b(c3082d, this.f19413g)) {
            return;
        }
        this.f19413g = c3082d;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return AbstractC5272a.c(((this.f19415i.getAlpha() / 255.0f) / (Color.alpha(this.f19408b) / 255.0f)) * 255.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f19415i.setAlpha(AbstractC5272a.c((i10 / 255.0f) * (Color.alpha(this.f19408b) / 255.0f) * 255.0f));
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f19415i.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
