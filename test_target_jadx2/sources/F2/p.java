package F2;

import android.graphics.PointF;
import android.graphics.RectF;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: g, reason: collision with root package name */
    public static final a f2375g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final b f2376a;

    /* renamed from: b, reason: collision with root package name */
    private final float f2377b;

    /* renamed from: c, reason: collision with root package name */
    private final float f2378c;

    /* renamed from: d, reason: collision with root package name */
    private final float f2379d;

    /* renamed from: e, reason: collision with root package name */
    private final float f2380e;

    /* renamed from: f, reason: collision with root package name */
    private final PointF f2381f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float b(float f10, float f11, float f12, float f13) {
            return (f12 - f10) / (f13 - f11);
        }

        private a() {
        }
    }

    public enum b {
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_LEFT,
        BOTTOM_RIGHT,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        CENTER
    }

    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2382a;

        static {
            int[] iArr = new int[b.values().length];
            iArr[b.TOP_LEFT.ordinal()] = 1;
            iArr[b.TOP_RIGHT.ordinal()] = 2;
            iArr[b.BOTTOM_LEFT.ordinal()] = 3;
            iArr[b.BOTTOM_RIGHT.ordinal()] = 4;
            iArr[b.LEFT.ordinal()] = 5;
            iArr[b.TOP.ordinal()] = 6;
            iArr[b.RIGHT.ordinal()] = 7;
            iArr[b.BOTTOM.ordinal()] = 8;
            iArr[b.CENTER.ordinal()] = 9;
            f2382a = iArr;
        }
    }

    public p(b type, o cropWindowHandler, float f10, float f11) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(cropWindowHandler, "cropWindowHandler");
        this.f2376a = type;
        this.f2377b = cropWindowHandler.f();
        this.f2378c = cropWindowHandler.e();
        this.f2379d = cropWindowHandler.d();
        this.f2380e = cropWindowHandler.c();
        this.f2381f = new PointF(0.0f, 0.0f);
        k(cropWindowHandler.i(), f10, f11);
    }

    private final void a(RectF rectF, float f10, RectF rectF2, int i10, float f11, float f12, boolean z10, boolean z11) {
        float f13 = i10;
        if (f10 > f13) {
            f10 = ((f10 - f13) / 1.05f) + f13;
            this.f2381f.y -= (f10 - f13) / 1.1f;
        }
        float f14 = rectF2.bottom;
        if (f10 > f14) {
            this.f2381f.y -= (f10 - f14) / 2.0f;
        }
        if (f14 - f10 < f11) {
            f10 = f14;
        }
        float f15 = rectF.top;
        float f16 = f10 - f15;
        float f17 = this.f2378c;
        if (f16 < f17) {
            f10 = f15 + f17;
        }
        float f18 = f10 - f15;
        float f19 = this.f2380e;
        if (f18 > f19) {
            f10 = f15 + f19;
        }
        if (f14 - f10 < f11) {
            f10 = f14;
        }
        if (f12 > 0.0f) {
            float f20 = (f10 - f15) * f12;
            float f21 = this.f2377b;
            if (f20 < f21) {
                f10 = Math.min(f14, f15 + (f21 / f12));
                f20 = (f10 - rectF.top) * f12;
            }
            float f22 = this.f2379d;
            if (f20 > f22) {
                f10 = Math.min(rectF2.bottom, rectF.top + (f22 / f12));
                f20 = (f10 - rectF.top) * f12;
            }
            if (z10 && z11) {
                f10 = Math.min(f10, Math.min(rectF2.bottom, rectF.top + (rectF2.width() / f12)));
            } else {
                if (z10) {
                    float f23 = rectF.right;
                    float f24 = f23 - f20;
                    float f25 = rectF2.left;
                    if (f24 < f25) {
                        f10 = Math.min(rectF2.bottom, rectF.top + ((f23 - f25) / f12));
                        f20 = (f10 - rectF.top) * f12;
                    }
                }
                if (z11) {
                    float f26 = rectF.left;
                    float f27 = f20 + f26;
                    float f28 = rectF2.right;
                    if (f27 > f28) {
                        f10 = Math.min(f10, Math.min(rectF2.bottom, rectF.top + ((f28 - f26) / f12)));
                    }
                }
            }
        }
        rectF.bottom = f10;
    }

    private final void b(RectF rectF, float f10) {
        rectF.bottom = rectF.top + (rectF.width() / f10);
    }

    private final void c(RectF rectF, float f10, RectF rectF2, float f11, float f12, boolean z10, boolean z11) {
        if (f10 < 0.0f) {
            f10 /= 1.05f;
            this.f2381f.x -= f10 / 1.1f;
        }
        float f13 = rectF2.left;
        if (f10 < f13) {
            this.f2381f.x -= (f10 - f13) / 2.0f;
        }
        if (f10 - f13 < f11) {
            f10 = f13;
        }
        float f14 = rectF.right;
        float f15 = f14 - f10;
        float f16 = this.f2377b;
        if (f15 < f16) {
            f10 = f14 - f16;
        }
        float f17 = f14 - f10;
        float f18 = this.f2379d;
        if (f17 > f18) {
            f10 = f14 - f18;
        }
        if (f10 - f13 < f11) {
            f10 = f13;
        }
        if (f12 > 0.0f) {
            float f19 = (f14 - f10) / f12;
            float f20 = this.f2378c;
            if (f19 < f20) {
                f10 = Math.max(f13, f14 - (f20 * f12));
                f19 = (rectF.right - f10) / f12;
            }
            float f21 = this.f2380e;
            if (f19 > f21) {
                f10 = Math.max(rectF2.left, rectF.right - (f21 * f12));
                f19 = (rectF.right - f10) / f12;
            }
            if (z10 && z11) {
                f10 = Math.max(f10, Math.max(rectF2.left, rectF.right - (rectF2.height() * f12)));
            } else {
                if (z10) {
                    float f22 = rectF.bottom;
                    float f23 = f22 - f19;
                    float f24 = rectF2.top;
                    if (f23 < f24) {
                        f10 = Math.max(rectF2.left, rectF.right - ((f22 - f24) * f12));
                        f19 = (rectF.right - f10) / f12;
                    }
                }
                if (z11) {
                    float f25 = rectF.top;
                    float f26 = f19 + f25;
                    float f27 = rectF2.bottom;
                    if (f26 > f27) {
                        f10 = Math.max(f10, Math.max(rectF2.left, rectF.right - ((f27 - f25) * f12)));
                    }
                }
            }
        }
        rectF.left = f10;
    }

    private final void d(RectF rectF, float f10) {
        rectF.left = rectF.right - (rectF.height() * f10);
    }

    private final void e(RectF rectF, RectF rectF2, float f10) {
        rectF.inset((rectF.width() - (rectF.height() * f10)) / 2, 0.0f);
        float f11 = rectF.left;
        float f12 = rectF2.left;
        if (f11 < f12) {
            rectF.offset(f12 - f11, 0.0f);
        }
        float f13 = rectF.right;
        float f14 = rectF2.right;
        if (f13 > f14) {
            rectF.offset(f14 - f13, 0.0f);
        }
    }

    private final void f(RectF rectF, float f10, RectF rectF2, int i10, float f11, float f12, boolean z10, boolean z11) {
        float f13 = i10;
        if (f10 > f13) {
            f10 = ((f10 - f13) / 1.05f) + f13;
            this.f2381f.x -= (f10 - f13) / 1.1f;
        }
        float f14 = rectF2.right;
        if (f10 > f14) {
            this.f2381f.x -= (f10 - f14) / 2.0f;
        }
        if (f14 - f10 < f11) {
            f10 = f14;
        }
        float f15 = rectF.left;
        float f16 = f10 - f15;
        float f17 = this.f2377b;
        if (f16 < f17) {
            f10 = f15 + f17;
        }
        float f18 = f10 - f15;
        float f19 = this.f2379d;
        if (f18 > f19) {
            f10 = f15 + f19;
        }
        if (f14 - f10 < f11) {
            f10 = f14;
        }
        if (f12 > 0.0f) {
            float f20 = (f10 - f15) / f12;
            float f21 = this.f2378c;
            if (f20 < f21) {
                f10 = Math.min(f14, f15 + (f21 * f12));
                f20 = (f10 - rectF.left) / f12;
            }
            float f22 = this.f2380e;
            if (f20 > f22) {
                f10 = Math.min(rectF2.right, rectF.left + (f22 * f12));
                f20 = (f10 - rectF.left) / f12;
            }
            if (z10 && z11) {
                f10 = Math.min(f10, Math.min(rectF2.right, rectF.left + (rectF2.height() * f12)));
            } else {
                if (z10) {
                    float f23 = rectF.bottom;
                    float f24 = f23 - f20;
                    float f25 = rectF2.top;
                    if (f24 < f25) {
                        f10 = Math.min(rectF2.right, rectF.left + ((f23 - f25) * f12));
                        f20 = (f10 - rectF.left) / f12;
                    }
                }
                if (z11) {
                    float f26 = rectF.top;
                    float f27 = f20 + f26;
                    float f28 = rectF2.bottom;
                    if (f27 > f28) {
                        f10 = Math.min(f10, Math.min(rectF2.right, rectF.left + ((f28 - f26) * f12)));
                    }
                }
            }
        }
        rectF.right = f10;
    }

    private final void g(RectF rectF, float f10) {
        rectF.right = rectF.left + (rectF.height() * f10);
    }

    private final void h(RectF rectF, float f10, RectF rectF2, float f11, float f12, boolean z10, boolean z11) {
        if (f10 < 0.0f) {
            f10 /= 1.05f;
            this.f2381f.y -= f10 / 1.1f;
        }
        float f13 = rectF2.top;
        if (f10 < f13) {
            this.f2381f.y -= (f10 - f13) / 2.0f;
        }
        if (f10 - f13 < f11) {
            f10 = f13;
        }
        float f14 = rectF.bottom;
        float f15 = f14 - f10;
        float f16 = this.f2378c;
        if (f15 < f16) {
            f10 = f14 - f16;
        }
        float f17 = f14 - f10;
        float f18 = this.f2380e;
        if (f17 > f18) {
            f10 = f14 - f18;
        }
        if (f10 - f13 < f11) {
            f10 = f13;
        }
        if (f12 > 0.0f) {
            float f19 = (f14 - f10) * f12;
            float f20 = this.f2377b;
            if (f19 < f20) {
                f10 = Math.max(f13, f14 - (f20 / f12));
                f19 = (rectF.bottom - f10) * f12;
            }
            float f21 = this.f2379d;
            if (f19 > f21) {
                f10 = Math.max(rectF2.top, rectF.bottom - (f21 / f12));
                f19 = (rectF.bottom - f10) * f12;
            }
            if (z10 && z11) {
                f10 = Math.max(f10, Math.max(rectF2.top, rectF.bottom - (rectF2.width() / f12)));
            } else {
                if (z10) {
                    float f22 = rectF.right;
                    float f23 = f22 - f19;
                    float f24 = rectF2.left;
                    if (f23 < f24) {
                        f10 = Math.max(rectF2.top, rectF.bottom - ((f22 - f24) / f12));
                        f19 = (rectF.bottom - f10) * f12;
                    }
                }
                if (z11) {
                    float f25 = rectF.left;
                    float f26 = f19 + f25;
                    float f27 = rectF2.right;
                    if (f26 > f27) {
                        f10 = Math.max(f10, Math.max(rectF2.top, rectF.bottom - ((f27 - f25) / f12)));
                    }
                }
            }
        }
        rectF.top = f10;
    }

    private final void i(RectF rectF, RectF rectF2, float f10) {
        rectF.inset(0.0f, (rectF.height() - (rectF.width() / f10)) / 2);
        float f11 = rectF.top;
        float f12 = rectF2.top;
        if (f11 < f12) {
            rectF.offset(0.0f, f12 - f11);
        }
        float f13 = rectF.bottom;
        float f14 = rectF2.bottom;
        if (f13 > f14) {
            rectF.offset(0.0f, f14 - f13);
        }
    }

    private final void j(RectF rectF, float f10) {
        rectF.top = rectF.bottom - (rectF.width() / f10);
    }

    private final void k(RectF rectF, float f10, float f11) {
        float f12;
        float f13;
        float f14;
        float f15 = 0.0f;
        switch (c.f2382a[this.f2376a.ordinal()]) {
            case 1:
                f15 = rectF.left - f10;
                f12 = rectF.top;
                f14 = f12 - f11;
                break;
            case 2:
                f15 = rectF.right - f10;
                f12 = rectF.top;
                f14 = f12 - f11;
                break;
            case 3:
                f15 = rectF.left - f10;
                f12 = rectF.bottom;
                f14 = f12 - f11;
                break;
            case 4:
                f15 = rectF.right - f10;
                f12 = rectF.bottom;
                f14 = f12 - f11;
                break;
            case 5:
                f13 = rectF.left;
                f15 = f13 - f10;
                f14 = 0.0f;
                break;
            case 6:
                f12 = rectF.top;
                f14 = f12 - f11;
                break;
            case 7:
                f13 = rectF.right;
                f15 = f13 - f10;
                f14 = 0.0f;
                break;
            case 8:
                f12 = rectF.bottom;
                f14 = f12 - f11;
                break;
            case 9:
                f15 = rectF.centerX() - f10;
                f12 = rectF.centerY();
                f14 = f12 - f11;
                break;
            default:
                f14 = 0.0f;
                break;
        }
        PointF pointF = this.f2381f;
        pointF.x = f15;
        pointF.y = f14;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
    
        if ((r0 + r9) <= r10.bottom) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
    
        if ((r1 + r8) <= r10.right) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m(RectF rectF, float f10, float f11, RectF rectF2, int i10, int i11, float f12) {
        float centerX = f10 - rectF.centerX();
        float centerY = f11 - rectF.centerY();
        float f13 = rectF.left;
        if (f13 + centerX >= 0.0f) {
            float f14 = rectF.right;
            if (f14 + centerX <= i10) {
                if (f13 + centerX >= rectF2.left) {
                }
            }
        }
        centerX /= 1.05f;
        this.f2381f.x -= centerX / 2;
        float f15 = rectF.top;
        if (f15 + centerY >= 0.0f) {
            float f16 = rectF.bottom;
            if (f16 + centerY <= i11) {
                if (f15 + centerY >= rectF2.top) {
                }
            }
        }
        centerY /= 1.05f;
        this.f2381f.y -= centerY / 2;
        rectF.offset(centerX, centerY);
        p(rectF, rectF2, f12);
    }

    private final void n(RectF rectF, float f10, float f11, RectF rectF2, int i10, int i11, float f12, float f13) {
        switch (c.f2382a[this.f2376a.ordinal()]) {
            case 1:
                if (f2375g.b(f10, f11, rectF.right, rectF.bottom) >= f13) {
                    c(rectF, f10, rectF2, f12, f13, true, false);
                    j(rectF, f13);
                    break;
                } else {
                    h(rectF, f11, rectF2, f12, f13, true, false);
                    d(rectF, f13);
                    break;
                }
            case 2:
                if (f2375g.b(rectF.left, f11, f10, rectF.bottom) >= f13) {
                    f(rectF, f10, rectF2, i10, f12, f13, true, false);
                    j(rectF, f13);
                    break;
                } else {
                    h(rectF, f11, rectF2, f12, f13, false, true);
                    g(rectF, f13);
                    break;
                }
            case 3:
                if (f2375g.b(f10, rectF.top, rectF.right, f11) >= f13) {
                    c(rectF, f10, rectF2, f12, f13, false, true);
                    b(rectF, f13);
                    break;
                } else {
                    a(rectF, f11, rectF2, i11, f12, f13, true, false);
                    d(rectF, f13);
                    break;
                }
            case 4:
                if (f2375g.b(rectF.left, rectF.top, f10, f11) >= f13) {
                    f(rectF, f10, rectF2, i10, f12, f13, false, true);
                    b(rectF, f13);
                    break;
                } else {
                    a(rectF, f11, rectF2, i11, f12, f13, false, true);
                    g(rectF, f13);
                    break;
                }
            case 5:
                c(rectF, f10, rectF2, f12, f13, true, true);
                i(rectF, rectF2, f13);
                break;
            case 6:
                h(rectF, f11, rectF2, f12, f13, true, true);
                e(rectF, rectF2, f13);
                break;
            case 7:
                f(rectF, f10, rectF2, i10, f12, f13, true, true);
                i(rectF, rectF2, f13);
                break;
            case 8:
                a(rectF, f11, rectF2, i11, f12, f13, true, true);
                e(rectF, rectF2, f13);
                break;
        }
    }

    private final void o(RectF rectF, float f10, float f11, RectF rectF2, int i10, int i11, float f12) {
        switch (c.f2382a[this.f2376a.ordinal()]) {
            case 1:
                h(rectF, f11, rectF2, f12, 0.0f, false, false);
                c(rectF, f10, rectF2, f12, 0.0f, false, false);
                break;
            case 2:
                h(rectF, f11, rectF2, f12, 0.0f, false, false);
                f(rectF, f10, rectF2, i10, f12, 0.0f, false, false);
                break;
            case 3:
                a(rectF, f11, rectF2, i11, f12, 0.0f, false, false);
                c(rectF, f10, rectF2, f12, 0.0f, false, false);
                break;
            case 4:
                a(rectF, f11, rectF2, i11, f12, 0.0f, false, false);
                f(rectF, f10, rectF2, i10, f12, 0.0f, false, false);
                break;
            case 5:
                c(rectF, f10, rectF2, f12, 0.0f, false, false);
                break;
            case 6:
                h(rectF, f11, rectF2, f12, 0.0f, false, false);
                break;
            case 7:
                f(rectF, f10, rectF2, i10, f12, 0.0f, false, false);
                break;
            case 8:
                a(rectF, f11, rectF2, i11, f12, 0.0f, false, false);
                break;
        }
    }

    private final void p(RectF rectF, RectF rectF2, float f10) {
        float f11 = rectF.left;
        float f12 = rectF2.left;
        if (f11 < f12 + f10) {
            rectF.offset(f12 - f11, 0.0f);
        }
        float f13 = rectF.top;
        float f14 = rectF2.top;
        if (f13 < f14 + f10) {
            rectF.offset(0.0f, f14 - f13);
        }
        float f15 = rectF.right;
        float f16 = rectF2.right;
        if (f15 > f16 - f10) {
            rectF.offset(f16 - f15, 0.0f);
        }
        float f17 = rectF.bottom;
        float f18 = rectF2.bottom;
        if (f17 > f18 - f10) {
            rectF.offset(0.0f, f18 - f17);
        }
    }

    public final void l(RectF rect, float f10, float f11, RectF bounds, int i10, int i11, float f12, boolean z10, float f13) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        PointF pointF = this.f2381f;
        float f14 = pointF.x + f10;
        float f15 = f11 + pointF.y;
        if (this.f2376a == b.CENTER) {
            m(rect, f14, f15, bounds, i10, i11, f12);
        } else if (z10) {
            n(rect, f14, f15, bounds, i10, i11, f12, f13);
        } else {
            o(rect, f14, f15, bounds, i10, i11, f12);
        }
    }
}
