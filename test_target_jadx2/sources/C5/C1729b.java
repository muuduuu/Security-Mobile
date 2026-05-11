package c5;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ComposeShader;
import android.graphics.DashPathEffect;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.facebook.react.uimanager.C1944g0;
import com.facebook.react.uimanager.D0;
import com.facebook.react.uimanager.M;
import com.facebook.react.uimanager.X;
import com.facebook.react.uimanager.Y;
import e5.C3079a;
import e5.C3082d;
import e5.C3085g;
import e5.C3086h;
import e5.EnumC3081c;
import e5.EnumC3083e;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* renamed from: c5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1729b extends Drawable {

    /* renamed from: B, reason: collision with root package name */
    private final Context f19372B;

    /* renamed from: a, reason: collision with root package name */
    private D0 f19374a;

    /* renamed from: b, reason: collision with root package name */
    private D0 f19375b;

    /* renamed from: c, reason: collision with root package name */
    private D0 f19376c;

    /* renamed from: d, reason: collision with root package name */
    private EnumC3083e f19377d;

    /* renamed from: e, reason: collision with root package name */
    private Path f19378e;

    /* renamed from: f, reason: collision with root package name */
    private Path f19379f;

    /* renamed from: g, reason: collision with root package name */
    private Path f19380g;

    /* renamed from: h, reason: collision with root package name */
    private Path f19381h;

    /* renamed from: i, reason: collision with root package name */
    private Path f19382i;

    /* renamed from: k, reason: collision with root package name */
    private Path f19384k;

    /* renamed from: l, reason: collision with root package name */
    private RectF f19385l;

    /* renamed from: m, reason: collision with root package name */
    private RectF f19386m;

    /* renamed from: n, reason: collision with root package name */
    private RectF f19387n;

    /* renamed from: o, reason: collision with root package name */
    private RectF f19388o;

    /* renamed from: p, reason: collision with root package name */
    private PointF f19389p;

    /* renamed from: q, reason: collision with root package name */
    private PointF f19390q;

    /* renamed from: r, reason: collision with root package name */
    private PointF f19391r;

    /* renamed from: s, reason: collision with root package name */
    private PointF f19392s;

    /* renamed from: j, reason: collision with root package name */
    private final Path f19383j = new Path();

    /* renamed from: t, reason: collision with root package name */
    private boolean f19393t = false;

    /* renamed from: u, reason: collision with root package name */
    private final Paint f19394u = new Paint(1);

    /* renamed from: v, reason: collision with root package name */
    private int f19395v = 0;

    /* renamed from: w, reason: collision with root package name */
    private List f19396w = null;

    /* renamed from: x, reason: collision with root package name */
    private int f19397x = 255;

    /* renamed from: y, reason: collision with root package name */
    private final float f19398y = 0.8f;

    /* renamed from: z, reason: collision with root package name */
    private C3082d f19399z = new C3082d();

    /* renamed from: A, reason: collision with root package name */
    private C3085g f19371A = new C3085g();

    /* renamed from: C, reason: collision with root package name */
    private int f19373C = -1;

    /* renamed from: c5.b$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f19400a;

        static {
            int[] iArr = new int[EnumC3083e.values().length];
            f19400a = iArr;
            try {
                iArr[EnumC3083e.SOLID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19400a[EnumC3083e.DASHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19400a[EnumC3083e.DOTTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C1729b(Context context) {
        this.f19372B = context;
    }

    private void I() {
        float f10;
        if (this.f19393t) {
            this.f19393t = false;
            if (this.f19378e == null) {
                this.f19378e = new Path();
            }
            if (this.f19379f == null) {
                this.f19379f = new Path();
            }
            if (this.f19380g == null) {
                this.f19380g = new Path();
            }
            if (this.f19381h == null) {
                this.f19381h = new Path();
            }
            if (this.f19384k == null) {
                this.f19384k = new Path();
            }
            if (this.f19385l == null) {
                this.f19385l = new RectF();
            }
            if (this.f19386m == null) {
                this.f19386m = new RectF();
            }
            if (this.f19387n == null) {
                this.f19387n = new RectF();
            }
            if (this.f19388o == null) {
                this.f19388o = new RectF();
            }
            this.f19378e.reset();
            this.f19379f.reset();
            this.f19380g.reset();
            this.f19381h.reset();
            this.f19384k.reset();
            this.f19385l.set(getBounds());
            this.f19386m.set(getBounds());
            this.f19387n.set(getBounds());
            this.f19388o.set(getBounds());
            RectF m10 = m();
            int g10 = g(0);
            int g11 = g(1);
            int g12 = g(2);
            int g13 = g(3);
            int g14 = g(8);
            int g15 = g(9);
            int g16 = g(11);
            int g17 = g(10);
            if (u(9)) {
                g11 = g15;
                g13 = g11;
            }
            if (!u(10)) {
                g17 = g13;
            }
            if (!u(11)) {
                g16 = g11;
            }
            if (Color.alpha(g10) == 0 || Color.alpha(g16) == 0 || Color.alpha(g12) == 0 || Color.alpha(g17) == 0 || Color.alpha(g14) == 0) {
                f10 = 0.0f;
            } else {
                RectF rectF = this.f19385l;
                rectF.top += m10.top;
                rectF.bottom -= m10.bottom;
                rectF.left += m10.left;
                rectF.right -= m10.right;
                f10 = 0.8f;
            }
            RectF rectF2 = this.f19388o;
            rectF2.top += m10.top * 0.5f;
            rectF2.bottom -= m10.bottom * 0.5f;
            rectF2.left += m10.left * 0.5f;
            rectF2.right -= m10.right * 0.5f;
            C3085g c10 = this.f19399z.c(getLayoutDirection(), this.f19372B, C1944g0.e(this.f19386m.width()), C1944g0.e(this.f19386m.height()));
            this.f19371A = c10;
            C3086h c11 = c10.c().c();
            C3086h c12 = this.f19371A.d().c();
            C3086h c13 = this.f19371A.a().c();
            C3086h c14 = this.f19371A.b().c();
            float p10 = p(c11.a(), m10.left);
            float p11 = p(c11.b(), m10.top);
            float p12 = p(c12.a(), m10.right);
            float p13 = p(c12.b(), m10.top);
            float p14 = p(c14.a(), m10.right);
            float p15 = p(c14.b(), m10.bottom);
            float p16 = p(c13.a(), m10.left);
            float p17 = p(c13.b(), m10.bottom);
            Path.Direction direction = Path.Direction.CW;
            this.f19378e.addRoundRect(this.f19385l, new float[]{p10, p11, p12, p13, p14, p15, p16, p17}, direction);
            Path path = this.f19379f;
            RectF rectF3 = this.f19385l;
            path.addRoundRect(rectF3.left - f10, rectF3.top - f10, rectF3.right + f10, rectF3.bottom + f10, new float[]{p10, p11, p12, p13, p14, p15, p16, p17}, direction);
            this.f19380g.addRoundRect(this.f19386m, new float[]{c11.a(), c11.b(), c12.a(), c12.b(), c14.a(), c14.b(), c13.a(), c13.b()}, direction);
            D0 d02 = this.f19374a;
            float a10 = d02 != null ? d02.a(8) / 2.0f : 0.0f;
            this.f19381h.addRoundRect(this.f19387n, new float[]{c11.a() + a10, c11.b() + a10, c12.a() + a10, c12.b() + a10, c14.a() + a10, c14.b() + a10, c13.a() + a10, c13.b() + a10}, direction);
            this.f19384k.addRoundRect(this.f19388o, new float[]{c11.a() - (m10.left * 0.5f), c11.b() - (m10.top * 0.5f), c12.a() - (m10.right * 0.5f), c12.b() - (m10.top * 0.5f), c14.a() - (m10.right * 0.5f), c14.b() - (m10.bottom * 0.5f), c13.a() - (m10.left * 0.5f), c13.b() - (m10.bottom * 0.5f)}, direction);
            if (this.f19389p == null) {
                this.f19389p = new PointF();
            }
            PointF pointF = this.f19389p;
            RectF rectF4 = this.f19385l;
            float f11 = rectF4.left;
            pointF.x = f11;
            float f12 = rectF4.top;
            pointF.y = f12;
            RectF rectF5 = this.f19386m;
            n(f11, f12, (p10 * 2.0f) + f11, (p11 * 2.0f) + f12, rectF5.left, rectF5.top, f11, f12, pointF);
            if (this.f19392s == null) {
                this.f19392s = new PointF();
            }
            PointF pointF2 = this.f19392s;
            RectF rectF6 = this.f19385l;
            float f13 = rectF6.left;
            pointF2.x = f13;
            float f14 = rectF6.bottom;
            pointF2.y = f14;
            RectF rectF7 = this.f19386m;
            n(f13, f14 - (p17 * 2.0f), (p16 * 2.0f) + f13, f14, rectF7.left, rectF7.bottom, f13, f14, pointF2);
            if (this.f19390q == null) {
                this.f19390q = new PointF();
            }
            PointF pointF3 = this.f19390q;
            RectF rectF8 = this.f19385l;
            float f15 = rectF8.right;
            pointF3.x = f15;
            float f16 = rectF8.top;
            pointF3.y = f16;
            RectF rectF9 = this.f19386m;
            n(f15 - (p12 * 2.0f), f16, f15, (p13 * 2.0f) + f16, rectF9.right, rectF9.top, f15, f16, pointF3);
            if (this.f19391r == null) {
                this.f19391r = new PointF();
            }
            PointF pointF4 = this.f19391r;
            RectF rectF10 = this.f19385l;
            float f17 = rectF10.right;
            pointF4.x = f17;
            float f18 = rectF10.bottom;
            pointF4.y = f18;
            RectF rectF11 = this.f19386m;
            n(f17 - (p14 * 2.0f), f18 - (p15 * 2.0f), f17, f18, rectF11.right, rectF11.bottom, f17, f18, pointF4);
        }
    }

    private void J() {
        EnumC3083e enumC3083e = this.f19377d;
        this.f19394u.setPathEffect(enumC3083e != null ? s(enumC3083e, o()) : null);
    }

    private void K(int i10) {
        EnumC3083e enumC3083e = this.f19377d;
        this.f19394u.setPathEffect(enumC3083e != null ? s(enumC3083e, i10) : null);
    }

    private static int a(float f10, float f11) {
        return ((((int) f10) << 24) & (-16777216)) | (((int) f11) & 16777215);
    }

    private void b(Canvas canvas, int i10, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        if (i10 == 0) {
            return;
        }
        if (this.f19382i == null) {
            this.f19382i = new Path();
        }
        this.f19394u.setColor(i10);
        this.f19382i.reset();
        this.f19382i.moveTo(f10, f11);
        this.f19382i.lineTo(f12, f13);
        this.f19382i.lineTo(f14, f15);
        this.f19382i.lineTo(f16, f17);
        this.f19382i.lineTo(f10, f11);
        canvas.drawPath(this.f19382i, this.f19394u);
    }

    private void c(Canvas canvas) {
        int i10;
        int i11;
        int i12;
        this.f19394u.setStyle(Paint.Style.FILL);
        int v10 = v(this.f19395v, this.f19397x);
        if (Color.alpha(v10) != 0) {
            this.f19394u.setColor(v10);
            canvas.drawRect(getBounds(), this.f19394u);
        }
        List list = this.f19396w;
        if (list != null && !list.isEmpty()) {
            this.f19394u.setShader(f());
            canvas.drawRect(getBounds(), this.f19394u);
            this.f19394u.setShader(null);
        }
        RectF m10 = m();
        int round = Math.round(m10.left);
        int round2 = Math.round(m10.top);
        int round3 = Math.round(m10.right);
        int round4 = Math.round(m10.bottom);
        if (round > 0 || round3 > 0 || round2 > 0 || round4 > 0) {
            Rect bounds = getBounds();
            int g10 = g(0);
            int g11 = g(1);
            int g12 = g(2);
            int g13 = g(3);
            int g14 = g(9);
            int g15 = g(11);
            int g16 = g(10);
            if (u(9)) {
                g11 = g14;
                g13 = g11;
            }
            if (!u(10)) {
                g16 = g13;
            }
            if (!u(11)) {
                g15 = g11;
            }
            boolean z10 = getLayoutDirection() == 1;
            int g17 = g(4);
            int g18 = g(5);
            if (com.facebook.react.modules.i18nmanager.a.f().d(this.f19372B)) {
                if (u(4)) {
                    g10 = g17;
                }
                if (u(5)) {
                    g12 = g18;
                }
                int i13 = z10 ? g12 : g10;
                if (!z10) {
                    g10 = g12;
                }
                i11 = g10;
                i10 = i13;
            } else {
                int i14 = z10 ? g18 : g17;
                if (!z10) {
                    g17 = g18;
                }
                boolean u10 = u(4);
                boolean u11 = u(5);
                boolean z11 = z10 ? u11 : u10;
                if (!z10) {
                    u10 = u11;
                }
                if (z11) {
                    g10 = i14;
                }
                i10 = g10;
                i11 = u10 ? g17 : g12;
            }
            int i15 = bounds.left;
            int i16 = bounds.top;
            int i17 = i10;
            int e10 = e(round, round2, round3, round4, i10, g15, i11, g16);
            if (e10 == 0) {
                this.f19394u.setAntiAlias(false);
                int width = bounds.width();
                int height = bounds.height();
                if (round > 0) {
                    float f10 = i15;
                    float f11 = i15 + round;
                    i12 = i16;
                    b(canvas, i17, f10, i16, f11, i16 + round2, f11, r8 - round4, f10, i16 + height);
                } else {
                    i12 = i16;
                }
                if (round2 > 0) {
                    float f12 = i12;
                    float f13 = i12 + round2;
                    b(canvas, g15, i15, f12, i15 + round, f13, r9 - round3, f13, i15 + width, f12);
                }
                if (round3 > 0) {
                    int i18 = i15 + width;
                    float f14 = i18;
                    float f15 = i18 - round3;
                    b(canvas, i11, f14, i12, f14, i12 + height, f15, r8 - round4, f15, i12 + round2);
                }
                if (round4 > 0) {
                    int i19 = i12 + height;
                    float f16 = i19;
                    float f17 = i19 - round4;
                    b(canvas, g16, i15, f16, i15 + width, f16, r9 - round3, f17, i15 + round, f17);
                }
                this.f19394u.setAntiAlias(true);
                return;
            }
            if (Color.alpha(e10) != 0) {
                int i20 = bounds.right;
                int i21 = bounds.bottom;
                this.f19394u.setColor(e10);
                this.f19394u.setStyle(Paint.Style.STROKE);
                if (round > 0) {
                    this.f19383j.reset();
                    int round5 = Math.round(m10.left);
                    K(round5);
                    this.f19394u.setStrokeWidth(round5);
                    float f18 = i15 + (round5 / 2);
                    this.f19383j.moveTo(f18, i16);
                    this.f19383j.lineTo(f18, i21);
                    canvas.drawPath(this.f19383j, this.f19394u);
                }
                if (round2 > 0) {
                    this.f19383j.reset();
                    int round6 = Math.round(m10.top);
                    K(round6);
                    this.f19394u.setStrokeWidth(round6);
                    float f19 = i16 + (round6 / 2);
                    this.f19383j.moveTo(i15, f19);
                    this.f19383j.lineTo(i20, f19);
                    canvas.drawPath(this.f19383j, this.f19394u);
                }
                if (round3 > 0) {
                    this.f19383j.reset();
                    int round7 = Math.round(m10.right);
                    K(round7);
                    this.f19394u.setStrokeWidth(round7);
                    float f20 = i20 - (round7 / 2);
                    this.f19383j.moveTo(f20, i16);
                    this.f19383j.lineTo(f20, i21);
                    canvas.drawPath(this.f19383j, this.f19394u);
                }
                if (round4 > 0) {
                    this.f19383j.reset();
                    int round8 = Math.round(m10.bottom);
                    K(round8);
                    this.f19394u.setStrokeWidth(round8);
                    float f21 = i21 - (round8 / 2);
                    this.f19383j.moveTo(i15, f21);
                    this.f19383j.lineTo(i20, f21);
                    canvas.drawPath(this.f19383j, this.f19394u);
                }
            }
        }
    }

    private void d(Canvas canvas) {
        int i10;
        int i11;
        PointF pointF;
        PointF pointF2;
        PointF pointF3;
        float f10;
        float f11;
        float f12;
        float f13;
        int i12;
        PointF pointF4;
        I();
        canvas.save();
        canvas.clipPath((Path) y0.f.g(this.f19380g), Region.Op.INTERSECT);
        int p10 = androidx.core.graphics.d.p(this.f19395v, getOpacity());
        if (Color.alpha(p10) != 0) {
            this.f19394u.setColor(p10);
            this.f19394u.setStyle(Paint.Style.FILL);
            canvas.drawPath((Path) y0.f.g(this.f19379f), this.f19394u);
        }
        List list = this.f19396w;
        if (list != null && !list.isEmpty()) {
            this.f19394u.setShader(f());
            this.f19394u.setStyle(Paint.Style.FILL);
            canvas.drawPath((Path) y0.f.g(this.f19379f), this.f19394u);
            this.f19394u.setShader(null);
        }
        RectF m10 = m();
        int g10 = g(0);
        int g11 = g(1);
        int g12 = g(2);
        int g13 = g(3);
        int g14 = g(9);
        int g15 = g(11);
        int g16 = g(10);
        if (u(9)) {
            g11 = g14;
            g13 = g11;
        }
        if (!u(10)) {
            g16 = g13;
        }
        int i13 = u(11) ? g15 : g11;
        if (m10.top > 0.0f || m10.bottom > 0.0f || m10.left > 0.0f || m10.right > 0.0f) {
            float o10 = o();
            int g17 = g(8);
            if (m10.top != o10 || m10.bottom != o10 || m10.left != o10 || m10.right != o10 || g10 != g17 || i13 != g17 || g12 != g17 || g16 != g17) {
                this.f19394u.setStyle(Paint.Style.FILL);
                canvas.clipPath((Path) y0.f.g(this.f19378e), Region.Op.DIFFERENCE);
                boolean z10 = getLayoutDirection() == 1;
                int g18 = g(4);
                int g19 = g(5);
                if (com.facebook.react.modules.i18nmanager.a.f().d(this.f19372B)) {
                    if (u(4)) {
                        g10 = g18;
                    }
                    if (u(5)) {
                        g12 = g19;
                    }
                    i10 = z10 ? g12 : g10;
                    if (!z10) {
                        g10 = g12;
                    }
                    i11 = g10;
                } else {
                    int i14 = z10 ? g19 : g18;
                    if (!z10) {
                        g18 = g19;
                    }
                    boolean u10 = u(4);
                    boolean u11 = u(5);
                    boolean z11 = z10 ? u11 : u10;
                    if (!z10) {
                        u10 = u11;
                    }
                    if (z11) {
                        g10 = i14;
                    }
                    if (u10) {
                        i10 = g10;
                        i11 = g18;
                    } else {
                        i10 = g10;
                        i11 = g12;
                    }
                }
                RectF rectF = (RectF) y0.f.g(this.f19386m);
                float f14 = rectF.left;
                float f15 = rectF.right;
                float f16 = rectF.top;
                float f17 = rectF.bottom;
                PointF pointF5 = (PointF) y0.f.g(this.f19389p);
                PointF pointF6 = (PointF) y0.f.g(this.f19390q);
                PointF pointF7 = (PointF) y0.f.g(this.f19392s);
                PointF pointF8 = (PointF) y0.f.g(this.f19391r);
                if (m10.left > 0.0f) {
                    pointF = pointF8;
                    i12 = g16;
                    pointF4 = pointF6;
                    pointF2 = pointF7;
                    pointF3 = pointF5;
                    f10 = f17;
                    f11 = f16;
                    f12 = f15;
                    f13 = f14;
                    b(canvas, i10, f14, f16 - 0.8f, pointF5.x, pointF5.y - 0.8f, pointF7.x, pointF7.y + 0.8f, f14, f17 + 0.8f);
                } else {
                    pointF = pointF8;
                    pointF2 = pointF7;
                    pointF3 = pointF5;
                    f10 = f17;
                    f11 = f16;
                    f12 = f15;
                    f13 = f14;
                    i12 = g16;
                    pointF4 = pointF6;
                }
                if (m10.top > 0.0f) {
                    b(canvas, i13, f13 - 0.8f, f11, pointF3.x - 0.8f, pointF3.y, pointF4.x + 0.8f, pointF4.y, f12 + 0.8f, f11);
                }
                if (m10.right > 0.0f) {
                    b(canvas, i11, f12, f11 - 0.8f, pointF4.x, pointF4.y - 0.8f, pointF.x, pointF.y + 0.8f, f12, f10 + 0.8f);
                }
                if (m10.bottom > 0.0f) {
                    PointF pointF9 = pointF2;
                    b(canvas, i12, f13 - 0.8f, f10, pointF9.x - 0.8f, pointF9.y, pointF.x + 0.8f, pointF.y, f12 + 0.8f, f10);
                }
            } else if (o10 > 0.0f) {
                this.f19394u.setColor(v(g17, this.f19397x));
                this.f19394u.setStyle(Paint.Style.STROKE);
                this.f19394u.setStrokeWidth(o10);
                canvas.drawPath((Path) y0.f.g(this.f19384k), this.f19394u);
            }
        }
        canvas.restore();
    }

    private static int e(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        int i18 = (i13 > 0 ? i17 : -1) & (i10 > 0 ? i14 : -1) & (i11 > 0 ? i15 : -1) & (i12 > 0 ? i16 : -1);
        if (i10 <= 0) {
            i14 = 0;
        }
        if (i11 <= 0) {
            i15 = 0;
        }
        int i19 = i14 | i15;
        if (i12 <= 0) {
            i16 = 0;
        }
        int i20 = i19 | i16;
        if (i13 <= 0) {
            i17 = 0;
        }
        if (i18 == (i20 | i17)) {
            return i18;
        }
        return 0;
    }

    private Shader f() {
        List list = this.f19396w;
        Shader shader = null;
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Shader a10 = ((C3079a) it.next()).a(getBounds());
            if (a10 != null) {
                shader = shader == null ? a10 : new ComposeShader(a10, shader, PorterDuff.Mode.SRC_OVER);
            }
        }
        return shader;
    }

    private static void n(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, PointF pointF) {
        double d18 = (d10 + d12) / 2.0d;
        double d19 = (d11 + d13) / 2.0d;
        double d20 = d14 - d18;
        double d21 = d15 - d19;
        double abs = Math.abs(d12 - d10) / 2.0d;
        double abs2 = Math.abs(d13 - d11) / 2.0d;
        double d22 = ((d17 - d19) - d21) / ((d16 - d18) - d20);
        double d23 = d21 - (d20 * d22);
        double d24 = abs2 * abs2;
        double d25 = abs * abs;
        double d26 = d24 + (d25 * d22 * d22);
        double d27 = abs * 2.0d * abs * d23 * d22;
        double d28 = (-(d25 * ((d23 * d23) - d24))) / d26;
        double d29 = d26 * 2.0d;
        double sqrt = ((-d27) / d29) - Math.sqrt(d28 + Math.pow(d27 / d29, 2.0d));
        double d30 = (d22 * sqrt) + d23;
        double d31 = sqrt + d18;
        double d32 = d30 + d19;
        if (Double.isNaN(d31) || Double.isNaN(d32)) {
            return;
        }
        pointF.x = (float) d31;
        pointF.y = (float) d32;
    }

    private static PathEffect s(EnumC3083e enumC3083e, float f10) {
        int i10 = a.f19400a[enumC3083e.ordinal()];
        if (i10 == 2) {
            float f11 = f10 * 3.0f;
            return new DashPathEffect(new float[]{f11, f11, f11, f11}, 0.0f);
        }
        if (i10 != 3) {
            return null;
        }
        return new DashPathEffect(new float[]{f10, f10, f10, f10}, 0.0f);
    }

    private boolean u(int i10) {
        D0 d02 = this.f19375b;
        float a10 = d02 != null ? d02.a(i10) : Float.NaN;
        D0 d03 = this.f19376c;
        return (Float.isNaN(a10) || Float.isNaN(d03 != null ? d03.a(i10) : Float.NaN)) ? false : true;
    }

    private static int v(int i10, int i11) {
        if (i11 == 255) {
            return i10;
        }
        if (i11 == 0) {
            return i10 & 16777215;
        }
        return (i10 & 16777215) | ((((i10 >>> 24) * (i11 + (i11 >> 7))) >> 8) << 24);
    }

    private void x(int i10, float f10) {
        if (this.f19376c == null) {
            this.f19376c = new D0(255.0f);
        }
        if (M.a(this.f19376c.b(i10), f10)) {
            return;
        }
        this.f19376c.c(i10, f10);
        invalidateSelf();
    }

    private void z(int i10, float f10) {
        if (this.f19375b == null) {
            this.f19375b = new D0(0.0f);
        }
        if (M.a(this.f19375b.b(i10), f10)) {
            return;
        }
        this.f19375b.c(i10, f10);
        invalidateSelf();
    }

    public void A(EnumC3081c enumC3081c, X x10) {
        if (Objects.equals(x10, this.f19399z.a(enumC3081c))) {
            return;
        }
        this.f19399z.d(enumC3081c, x10);
        this.f19393t = true;
        invalidateSelf();
    }

    public void B(EnumC3083e enumC3083e) {
        if (this.f19377d != enumC3083e) {
            this.f19377d = enumC3083e;
            this.f19393t = true;
            invalidateSelf();
        }
    }

    public void C(String str) {
        B(str == null ? null : EnumC3083e.valueOf(str.toUpperCase(Locale.US)));
    }

    public void D(int i10, float f10) {
        if (this.f19374a == null) {
            this.f19374a = new D0();
        }
        if (M.a(this.f19374a.b(i10), f10)) {
            return;
        }
        this.f19374a.c(i10, f10);
        if (i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 8) {
            this.f19393t = true;
        }
        invalidateSelf();
    }

    public void E(int i10) {
        this.f19395v = i10;
        invalidateSelf();
    }

    public void F(int i10) {
        if (this.f19373C != i10) {
            this.f19373C = i10;
        }
    }

    public void G(float f10) {
        Float valueOf = Float.isNaN(f10) ? null : Float.valueOf(f10);
        if (valueOf == null) {
            A(EnumC3081c.BORDER_RADIUS, null);
        } else {
            A(EnumC3081c.BORDER_RADIUS, new X(valueOf.floatValue(), Y.POINT));
        }
    }

    public void H(float f10, int i10) {
        Float valueOf = Float.isNaN(f10) ? null : Float.valueOf(f10);
        if (valueOf != null) {
            A(EnumC3081c.values()[i10], new X(valueOf.floatValue(), Y.POINT));
        } else {
            this.f19399z.d(EnumC3081c.values()[i10], null);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        J();
        if (t()) {
            d(canvas);
        } else {
            c(canvas);
        }
    }

    public int g(int i10) {
        D0 d02 = this.f19375b;
        float a10 = d02 != null ? d02.a(i10) : 0.0f;
        D0 d03 = this.f19376c;
        return a(d03 != null ? d03.a(i10) : 255.0f, a10);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f19397x;
    }

    @Override // android.graphics.drawable.Drawable
    public int getLayoutDirection() {
        int i10 = this.f19373C;
        return i10 == -1 ? super.getLayoutDirection() : i10;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return (Color.alpha(this.f19395v) * this.f19397x) >> 8;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (!t()) {
            outline.setRect(getBounds());
        } else {
            I();
            outline.setConvexPath((Path) y0.f.g(this.f19381h));
        }
    }

    public C3082d h() {
        return this.f19399z;
    }

    public Float i(int i10) {
        D0 d02 = this.f19374a;
        if (d02 == null) {
            return null;
        }
        float b10 = d02.b(i10);
        if (Float.isNaN(b10)) {
            return null;
        }
        return Float.valueOf(b10);
    }

    public float j(float f10, int i10) {
        Float i11 = i(i10);
        return i11 == null ? f10 : i11.floatValue();
    }

    public int k() {
        return this.f19395v;
    }

    public C3085g l() {
        return this.f19371A;
    }

    public RectF m() {
        float j10 = j(0.0f, 8);
        float j11 = j(j10, 1);
        float j12 = j(j10, 3);
        float j13 = j(j10, 0);
        float j14 = j(j10, 2);
        if (this.f19374a != null) {
            boolean z10 = getLayoutDirection() == 1;
            float b10 = this.f19374a.b(4);
            float b11 = this.f19374a.b(5);
            if (com.facebook.react.modules.i18nmanager.a.f().d(this.f19372B)) {
                if (!Float.isNaN(b10)) {
                    j13 = b10;
                }
                if (!Float.isNaN(b11)) {
                    j14 = b11;
                }
                float f10 = z10 ? j14 : j13;
                if (z10) {
                    j14 = j13;
                }
                j13 = f10;
            } else {
                float f11 = z10 ? b11 : b10;
                if (!z10) {
                    b10 = b11;
                }
                if (!Float.isNaN(f11)) {
                    j13 = f11;
                }
                if (!Float.isNaN(b10)) {
                    j14 = b10;
                }
            }
        }
        return new RectF(j13, j11, j14, j12);
    }

    public float o() {
        D0 d02 = this.f19374a;
        if (d02 == null || Float.isNaN(d02.b(8))) {
            return 0.0f;
        }
        return this.f19374a.b(8);
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f19393t = true;
    }

    public float p(float f10, float f11) {
        return Math.max(f10 - f11, 0.0f);
    }

    public Path q() {
        if (!t()) {
            return null;
        }
        I();
        return new Path((Path) y0.f.g(this.f19378e));
    }

    public RectF r() {
        RectF m10 = m();
        return m10 == null ? new RectF(0.0f, 0.0f, getBounds().width(), getBounds().height()) : new RectF(m10.left, m10.top, getBounds().width() - m10.right, getBounds().height() - m10.bottom);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (i10 != this.f19397x) {
            this.f19397x = i10;
            invalidateSelf();
        }
    }

    public boolean t() {
        return this.f19399z.b();
    }

    public void w(List list) {
        this.f19396w = list;
        invalidateSelf();
    }

    public void y(int i10, Integer num) {
        float intValue = num == null ? Float.NaN : num.intValue() & 16777215;
        float intValue2 = num != null ? num.intValue() >>> 24 : Float.NaN;
        z(i10, intValue);
        x(i10, intValue2);
        this.f19393t = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
