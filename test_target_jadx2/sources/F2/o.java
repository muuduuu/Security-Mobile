package F2;

import F2.p;
import android.graphics.RectF;
import com.canhub.cropper.CropImageView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: c, reason: collision with root package name */
    private float f2364c;

    /* renamed from: d, reason: collision with root package name */
    private float f2365d;

    /* renamed from: e, reason: collision with root package name */
    private float f2366e;

    /* renamed from: f, reason: collision with root package name */
    private float f2367f;

    /* renamed from: g, reason: collision with root package name */
    private float f2368g;

    /* renamed from: h, reason: collision with root package name */
    private float f2369h;

    /* renamed from: i, reason: collision with root package name */
    private float f2370i;

    /* renamed from: j, reason: collision with root package name */
    private float f2371j;

    /* renamed from: a, reason: collision with root package name */
    private final RectF f2362a = new RectF();

    /* renamed from: b, reason: collision with root package name */
    private final RectF f2363b = new RectF();

    /* renamed from: k, reason: collision with root package name */
    private float f2372k = 1.0f;

    /* renamed from: l, reason: collision with root package name */
    private float f2373l = 1.0f;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2374a;

        static {
            int[] iArr = new int[CropImageView.d.values().length];
            iArr[CropImageView.d.RECTANGLE.ordinal()] = 1;
            iArr[CropImageView.d.OVAL.ordinal()] = 2;
            iArr[CropImageView.d.RECTANGLE_VERTICAL_ONLY.ordinal()] = 3;
            iArr[CropImageView.d.RECTANGLE_HORIZONTAL_ONLY.ordinal()] = 4;
            f2374a = iArr;
        }
    }

    private final float a(float f10, float f11, float f12, float f13) {
        return Math.max(Math.abs(f10 - f12), Math.abs(f11 - f13));
    }

    private final boolean b() {
        return !v();
    }

    private final p.b h(float f10, float f11, boolean z10) {
        float f12 = 6;
        float width = this.f2362a.width() / f12;
        RectF rectF = this.f2362a;
        float f13 = rectF.left;
        float f14 = f13 + width;
        float f15 = 5;
        float f16 = f13 + (width * f15);
        float height = rectF.height() / f12;
        float f17 = this.f2362a.top;
        float f18 = f17 + height;
        float f19 = f17 + (f15 * height);
        if (f10 < f14) {
            return f11 < f18 ? p.b.TOP_LEFT : f11 < f19 ? p.b.LEFT : p.b.BOTTOM_LEFT;
        }
        if (f10 >= f16) {
            return f11 < f18 ? p.b.TOP_RIGHT : f11 < f19 ? p.b.RIGHT : p.b.BOTTOM_RIGHT;
        }
        if (f11 < f18) {
            return p.b.TOP;
        }
        if (f11 >= f19) {
            return p.b.BOTTOM;
        }
        if (z10) {
            return p.b.CENTER;
        }
        return null;
    }

    private final p.b j(float f10, float f11, float f12, boolean z10) {
        RectF rectF = this.f2362a;
        if (a(f10, f11, rectF.left, rectF.centerY()) <= f12) {
            return p.b.LEFT;
        }
        RectF rectF2 = this.f2362a;
        if (a(f10, f11, rectF2.right, rectF2.centerY()) <= f12) {
            return p.b.RIGHT;
        }
        if (z10) {
            RectF rectF3 = this.f2362a;
            if (o(f10, f11, rectF3.left, rectF3.top, rectF3.right, rectF3.bottom)) {
                return p.b.CENTER;
            }
        }
        return null;
    }

    private final p.b k(float f10, float f11, float f12, boolean z10) {
        RectF rectF = this.f2362a;
        if (p(f10, f11, rectF.left, rectF.top, f12)) {
            return p.b.TOP_LEFT;
        }
        RectF rectF2 = this.f2362a;
        if (p(f10, f11, rectF2.right, rectF2.top, f12)) {
            return p.b.TOP_RIGHT;
        }
        RectF rectF3 = this.f2362a;
        if (p(f10, f11, rectF3.left, rectF3.bottom, f12)) {
            return p.b.BOTTOM_LEFT;
        }
        RectF rectF4 = this.f2362a;
        if (p(f10, f11, rectF4.right, rectF4.bottom, f12)) {
            return p.b.BOTTOM_RIGHT;
        }
        if (z10) {
            RectF rectF5 = this.f2362a;
            if (o(f10, f11, rectF5.left, rectF5.top, rectF5.right, rectF5.bottom) && b()) {
                return p.b.CENTER;
            }
        }
        RectF rectF6 = this.f2362a;
        if (q(f10, f11, rectF6.left, rectF6.right, rectF6.top, f12)) {
            return p.b.TOP;
        }
        RectF rectF7 = this.f2362a;
        if (q(f10, f11, rectF7.left, rectF7.right, rectF7.bottom, f12)) {
            return p.b.BOTTOM;
        }
        RectF rectF8 = this.f2362a;
        if (r(f10, f11, rectF8.left, rectF8.top, rectF8.bottom, f12)) {
            return p.b.LEFT;
        }
        RectF rectF9 = this.f2362a;
        if (r(f10, f11, rectF9.right, rectF9.top, rectF9.bottom, f12)) {
            return p.b.RIGHT;
        }
        if (z10) {
            RectF rectF10 = this.f2362a;
            if (o(f10, f11, rectF10.left, rectF10.top, rectF10.right, rectF10.bottom) && !b()) {
                return p.b.CENTER;
            }
        }
        return null;
    }

    private final p.b l(float f10, float f11, float f12, boolean z10) {
        if (a(f10, f11, this.f2362a.centerX(), this.f2362a.top) <= f12) {
            return p.b.TOP;
        }
        if (a(f10, f11, this.f2362a.centerX(), this.f2362a.bottom) <= f12) {
            return p.b.BOTTOM;
        }
        if (z10) {
            RectF rectF = this.f2362a;
            if (o(f10, f11, rectF.left, rectF.top, rectF.right, rectF.bottom)) {
                return p.b.CENTER;
            }
        }
        return null;
    }

    private final boolean o(float f10, float f11, float f12, float f13, float f14, float f15) {
        return f10 > f12 && f10 < f14 && f11 > f13 && f11 < f15;
    }

    private final boolean p(float f10, float f11, float f12, float f13, float f14) {
        return a(f10, f11, f12, f13) <= f14;
    }

    private final boolean q(float f10, float f11, float f12, float f13, float f14, float f15) {
        return f10 > f12 && f10 < f13 && Math.abs(f11 - f14) <= f15;
    }

    private final boolean r(float f10, float f11, float f12, float f13, float f14, float f15) {
        return Math.abs(f10 - f12) <= f15 && f11 > f13 && f11 < f14;
    }

    public final float c() {
        return kotlin.ranges.d.g(this.f2367f, this.f2371j / this.f2373l);
    }

    public final float d() {
        return kotlin.ranges.d.g(this.f2366e, this.f2370i / this.f2372k);
    }

    public final float e() {
        return kotlin.ranges.d.c(this.f2365d, this.f2369h / this.f2373l);
    }

    public final float f() {
        return kotlin.ranges.d.c(this.f2364c, this.f2368g / this.f2372k);
    }

    public final p g(float f10, float f11, float f12, CropImageView.d cropShape, boolean z10) {
        p.b k10;
        Intrinsics.checkNotNullParameter(cropShape, "cropShape");
        int i10 = a.f2374a[cropShape.ordinal()];
        if (i10 == 1) {
            k10 = k(f10, f11, f12, z10);
        } else if (i10 == 2) {
            k10 = h(f10, f11, z10);
        } else if (i10 == 3) {
            k10 = l(f10, f11, f12, z10);
        } else {
            if (i10 != 4) {
                throw new lc.m();
            }
            k10 = j(f10, f11, f12, z10);
        }
        if (k10 != null) {
            return new p(k10, this, f10, f11);
        }
        return null;
    }

    public final RectF i() {
        this.f2363b.set(this.f2362a);
        return this.f2363b;
    }

    public final float m() {
        return this.f2373l;
    }

    public final float n() {
        return this.f2372k;
    }

    public final void s(float f10, float f11, float f12, float f13) {
        this.f2366e = f10;
        this.f2367f = f11;
        this.f2372k = f12;
        this.f2373l = f13;
    }

    public final void t(l options) {
        Intrinsics.checkNotNullParameter(options, "options");
        this.f2364c = options.f2307F;
        this.f2365d = options.f2308G;
        this.f2368g = options.f2309H;
        this.f2369h = options.f2310I;
        this.f2370i = options.f2311J;
        this.f2371j = options.f2312K;
    }

    public final void u(RectF rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        this.f2362a.set(rect);
    }

    public final boolean v() {
        return this.f2362a.width() >= 100.0f && this.f2362a.height() >= 100.0f;
    }
}
