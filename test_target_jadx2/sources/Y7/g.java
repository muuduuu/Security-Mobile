package Y7;

import Y7.k;
import Y7.l;
import Y7.m;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import java.util.BitSet;

/* loaded from: classes2.dex */
public class g extends Drawable implements n {

    /* renamed from: x, reason: collision with root package name */
    private static final String f12030x = "g";

    /* renamed from: y, reason: collision with root package name */
    private static final Paint f12031y;

    /* renamed from: a, reason: collision with root package name */
    private c f12032a;

    /* renamed from: b, reason: collision with root package name */
    private final m.g[] f12033b;

    /* renamed from: c, reason: collision with root package name */
    private final m.g[] f12034c;

    /* renamed from: d, reason: collision with root package name */
    private final BitSet f12035d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f12036e;

    /* renamed from: f, reason: collision with root package name */
    private final Matrix f12037f;

    /* renamed from: g, reason: collision with root package name */
    private final Path f12038g;

    /* renamed from: h, reason: collision with root package name */
    private final Path f12039h;

    /* renamed from: i, reason: collision with root package name */
    private final RectF f12040i;

    /* renamed from: j, reason: collision with root package name */
    private final RectF f12041j;

    /* renamed from: k, reason: collision with root package name */
    private final Region f12042k;

    /* renamed from: l, reason: collision with root package name */
    private final Region f12043l;

    /* renamed from: m, reason: collision with root package name */
    private k f12044m;

    /* renamed from: n, reason: collision with root package name */
    private final Paint f12045n;

    /* renamed from: o, reason: collision with root package name */
    private final Paint f12046o;

    /* renamed from: p, reason: collision with root package name */
    private final X7.a f12047p;

    /* renamed from: q, reason: collision with root package name */
    private final l.b f12048q;

    /* renamed from: r, reason: collision with root package name */
    private final l f12049r;

    /* renamed from: s, reason: collision with root package name */
    private PorterDuffColorFilter f12050s;

    /* renamed from: t, reason: collision with root package name */
    private PorterDuffColorFilter f12051t;

    /* renamed from: u, reason: collision with root package name */
    private int f12052u;

    /* renamed from: v, reason: collision with root package name */
    private final RectF f12053v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f12054w;

    class a implements l.b {
        a() {
        }

        @Override // Y7.l.b
        public void a(m mVar, Matrix matrix, int i10) {
            g.this.f12035d.set(i10 + 4, mVar.e());
            g.this.f12034c[i10] = mVar.f(matrix);
        }

        @Override // Y7.l.b
        public void b(m mVar, Matrix matrix, int i10) {
            g.this.f12035d.set(i10, mVar.e());
            g.this.f12033b[i10] = mVar.f(matrix);
        }
    }

    class b implements k.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f12056a;

        b(float f10) {
            this.f12056a = f10;
        }

        @Override // Y7.k.c
        public Y7.c a(Y7.c cVar) {
            return cVar instanceof i ? cVar : new Y7.b(this.f12056a, cVar);
        }
    }

    static {
        Paint paint = new Paint(1);
        f12031y = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    /* synthetic */ g(c cVar, a aVar) {
        this(cVar);
    }

    private float D() {
        if (L()) {
            return this.f12046o.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    private boolean J() {
        c cVar = this.f12032a;
        int i10 = cVar.f12074q;
        return i10 != 1 && cVar.f12075r > 0 && (i10 == 2 || T());
    }

    private boolean K() {
        Paint.Style style = this.f12032a.f12079v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    private boolean L() {
        Paint.Style style = this.f12032a.f12079v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f12046o.getStrokeWidth() > 0.0f;
    }

    private void N() {
        super.invalidateSelf();
    }

    private void Q(Canvas canvas) {
        if (J()) {
            canvas.save();
            S(canvas);
            if (!this.f12054w) {
                n(canvas);
                canvas.restore();
                return;
            }
            int width = (int) (this.f12053v.width() - getBounds().width());
            int height = (int) (this.f12053v.height() - getBounds().height());
            if (width < 0 || height < 0) {
                throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
            }
            Bitmap createBitmap = Bitmap.createBitmap(((int) this.f12053v.width()) + (this.f12032a.f12075r * 2) + width, ((int) this.f12053v.height()) + (this.f12032a.f12075r * 2) + height, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap);
            float f10 = (getBounds().left - this.f12032a.f12075r) - width;
            float f11 = (getBounds().top - this.f12032a.f12075r) - height;
            canvas2.translate(-f10, -f11);
            n(canvas2);
            canvas.drawBitmap(createBitmap, f10, f11, (Paint) null);
            createBitmap.recycle();
            canvas.restore();
        }
    }

    private static int R(int i10, int i11) {
        return (i10 * (i11 + (i11 >>> 7))) >>> 8;
    }

    private void S(Canvas canvas) {
        canvas.translate(A(), B());
    }

    private PorterDuffColorFilter f(Paint paint, boolean z10) {
        if (!z10) {
            return null;
        }
        int color = paint.getColor();
        int l10 = l(color);
        this.f12052u = l10;
        if (l10 != color) {
            return new PorterDuffColorFilter(l10, PorterDuff.Mode.SRC_IN);
        }
        return null;
    }

    private boolean f0(int[] iArr) {
        boolean z10;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f12032a.f12061d == null || color2 == (colorForState2 = this.f12032a.f12061d.getColorForState(iArr, (color2 = this.f12045n.getColor())))) {
            z10 = false;
        } else {
            this.f12045n.setColor(colorForState2);
            z10 = true;
        }
        if (this.f12032a.f12062e == null || color == (colorForState = this.f12032a.f12062e.getColorForState(iArr, (color = this.f12046o.getColor())))) {
            return z10;
        }
        this.f12046o.setColor(colorForState);
        return true;
    }

    private void g(RectF rectF, Path path) {
        h(rectF, path);
        if (this.f12032a.f12067j != 1.0f) {
            this.f12037f.reset();
            Matrix matrix = this.f12037f;
            float f10 = this.f12032a.f12067j;
            matrix.setScale(f10, f10, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f12037f);
        }
        path.computeBounds(this.f12053v, true);
    }

    private boolean g0() {
        PorterDuffColorFilter porterDuffColorFilter = this.f12050s;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f12051t;
        c cVar = this.f12032a;
        this.f12050s = k(cVar.f12064g, cVar.f12065h, this.f12045n, true);
        c cVar2 = this.f12032a;
        this.f12051t = k(cVar2.f12063f, cVar2.f12065h, this.f12046o, false);
        c cVar3 = this.f12032a;
        if (cVar3.f12078u) {
            this.f12047p.d(cVar3.f12064g.getColorForState(getState(), 0));
        }
        return (y0.b.a(porterDuffColorFilter, this.f12050s) && y0.b.a(porterDuffColorFilter2, this.f12051t)) ? false : true;
    }

    private void h0() {
        float I10 = I();
        this.f12032a.f12075r = (int) Math.ceil(0.75f * I10);
        this.f12032a.f12076s = (int) Math.ceil(I10 * 0.25f);
        g0();
        N();
    }

    private void i() {
        k y10 = C().y(new b(-D()));
        this.f12044m = y10;
        this.f12049r.e(y10, this.f12032a.f12068k, v(), this.f12039h);
    }

    private PorterDuffColorFilter j(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z10) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z10) {
            colorForState = l(colorForState);
        }
        this.f12052u = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    private PorterDuffColorFilter k(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z10) {
        return (colorStateList == null || mode == null) ? f(paint, z10) : j(colorStateList, mode, z10);
    }

    public static g m(Context context, float f10) {
        int c10 = M7.a.c(context, H7.b.f3143p, g.class.getSimpleName());
        g gVar = new g();
        gVar.M(context);
        gVar.X(ColorStateList.valueOf(c10));
        gVar.W(f10);
        return gVar;
    }

    private void n(Canvas canvas) {
        if (this.f12035d.cardinality() > 0) {
            Log.w(f12030x, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f12032a.f12076s != 0) {
            canvas.drawPath(this.f12038g, this.f12047p.c());
        }
        for (int i10 = 0; i10 < 4; i10++) {
            this.f12033b[i10].a(this.f12047p, this.f12032a.f12075r, canvas);
            this.f12034c[i10].a(this.f12047p, this.f12032a.f12075r, canvas);
        }
        if (this.f12054w) {
            int A10 = A();
            int B10 = B();
            canvas.translate(-A10, -B10);
            canvas.drawPath(this.f12038g, f12031y);
            canvas.translate(A10, B10);
        }
    }

    private void o(Canvas canvas) {
        p(canvas, this.f12045n, this.f12038g, this.f12032a.f12058a, u());
    }

    private void p(Canvas canvas, Paint paint, Path path, k kVar, RectF rectF) {
        if (!kVar.u(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float a10 = kVar.t().a(rectF) * this.f12032a.f12068k;
            canvas.drawRoundRect(rectF, a10, a10, paint);
        }
    }

    private RectF v() {
        this.f12041j.set(u());
        float D10 = D();
        this.f12041j.inset(D10, D10);
        return this.f12041j;
    }

    public int A() {
        c cVar = this.f12032a;
        return (int) (cVar.f12076s * Math.sin(Math.toRadians(cVar.f12077t)));
    }

    public int B() {
        c cVar = this.f12032a;
        return (int) (cVar.f12076s * Math.cos(Math.toRadians(cVar.f12077t)));
    }

    public k C() {
        return this.f12032a.f12058a;
    }

    public ColorStateList E() {
        return this.f12032a.f12064g;
    }

    public float F() {
        return this.f12032a.f12058a.r().a(u());
    }

    public float G() {
        return this.f12032a.f12058a.t().a(u());
    }

    public float H() {
        return this.f12032a.f12073p;
    }

    public float I() {
        return w() + H();
    }

    public void M(Context context) {
        this.f12032a.f12059b = new P7.a(context);
        h0();
    }

    public boolean O() {
        P7.a aVar = this.f12032a.f12059b;
        return aVar != null && aVar.d();
    }

    public boolean P() {
        return this.f12032a.f12058a.u(u());
    }

    public boolean T() {
        return (P() || this.f12038g.isConvex() || Build.VERSION.SDK_INT >= 29) ? false : true;
    }

    public void U(float f10) {
        setShapeAppearanceModel(this.f12032a.f12058a.w(f10));
    }

    public void V(Y7.c cVar) {
        setShapeAppearanceModel(this.f12032a.f12058a.x(cVar));
    }

    public void W(float f10) {
        c cVar = this.f12032a;
        if (cVar.f12072o != f10) {
            cVar.f12072o = f10;
            h0();
        }
    }

    public void X(ColorStateList colorStateList) {
        c cVar = this.f12032a;
        if (cVar.f12061d != colorStateList) {
            cVar.f12061d = colorStateList;
            onStateChange(getState());
        }
    }

    public void Y(float f10) {
        c cVar = this.f12032a;
        if (cVar.f12068k != f10) {
            cVar.f12068k = f10;
            this.f12036e = true;
            invalidateSelf();
        }
    }

    public void Z(int i10, int i11, int i12, int i13) {
        c cVar = this.f12032a;
        if (cVar.f12066i == null) {
            cVar.f12066i = new Rect();
        }
        this.f12032a.f12066i.set(i10, i11, i12, i13);
        invalidateSelf();
    }

    public void a0(float f10) {
        c cVar = this.f12032a;
        if (cVar.f12071n != f10) {
            cVar.f12071n = f10;
            h0();
        }
    }

    public void b0(float f10, int i10) {
        e0(f10);
        d0(ColorStateList.valueOf(i10));
    }

    public void c0(float f10, ColorStateList colorStateList) {
        e0(f10);
        d0(colorStateList);
    }

    public void d0(ColorStateList colorStateList) {
        c cVar = this.f12032a;
        if (cVar.f12062e != colorStateList) {
            cVar.f12062e = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f12045n.setColorFilter(this.f12050s);
        int alpha = this.f12045n.getAlpha();
        this.f12045n.setAlpha(R(alpha, this.f12032a.f12070m));
        this.f12046o.setColorFilter(this.f12051t);
        this.f12046o.setStrokeWidth(this.f12032a.f12069l);
        int alpha2 = this.f12046o.getAlpha();
        this.f12046o.setAlpha(R(alpha2, this.f12032a.f12070m));
        if (this.f12036e) {
            i();
            g(u(), this.f12038g);
            this.f12036e = false;
        }
        Q(canvas);
        if (K()) {
            o(canvas);
        }
        if (L()) {
            r(canvas);
        }
        this.f12045n.setAlpha(alpha);
        this.f12046o.setAlpha(alpha2);
    }

    public void e0(float f10) {
        this.f12032a.f12069l = f10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f12032a.f12070m;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f12032a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f12032a.f12074q == 2) {
            return;
        }
        if (P()) {
            outline.setRoundRect(getBounds(), F() * this.f12032a.f12068k);
            return;
        }
        g(u(), this.f12038g);
        if (this.f12038g.isConvex() || Build.VERSION.SDK_INT >= 29) {
            try {
                outline.setConvexPath(this.f12038g);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f12032a.f12066i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.f12042k.set(getBounds());
        g(u(), this.f12038g);
        this.f12043l.setPath(this.f12038g, this.f12042k);
        this.f12042k.op(this.f12043l, Region.Op.DIFFERENCE);
        return this.f12042k;
    }

    protected final void h(RectF rectF, Path path) {
        l lVar = this.f12049r;
        c cVar = this.f12032a;
        lVar.d(cVar.f12058a, cVar.f12068k, rectF, this.f12048q, path);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f12036e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.f12032a.f12064g) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f12032a.f12063f) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f12032a.f12062e) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f12032a.f12061d) != null && colorStateList4.isStateful())));
    }

    protected int l(int i10) {
        float I10 = I() + y();
        P7.a aVar = this.f12032a.f12059b;
        return aVar != null ? aVar.c(i10, I10) : i10;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f12032a = new c(this.f12032a);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f12036e = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean z10 = f0(iArr) || g0();
        if (z10) {
            invalidateSelf();
        }
        return z10;
    }

    protected void q(Canvas canvas, Paint paint, Path path, RectF rectF) {
        p(canvas, paint, path, this.f12032a.f12058a, rectF);
    }

    protected void r(Canvas canvas) {
        p(canvas, this.f12046o, this.f12039h, this.f12044m, v());
    }

    public float s() {
        return this.f12032a.f12058a.j().a(u());
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        c cVar = this.f12032a;
        if (cVar.f12070m != i10) {
            cVar.f12070m = i10;
            N();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f12032a.f12060c = colorFilter;
        N();
    }

    @Override // Y7.n
    public void setShapeAppearanceModel(k kVar) {
        this.f12032a.f12058a = kVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f12032a.f12064g = colorStateList;
        g0();
        N();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f12032a;
        if (cVar.f12065h != mode) {
            cVar.f12065h = mode;
            g0();
            N();
        }
    }

    public float t() {
        return this.f12032a.f12058a.l().a(u());
    }

    protected RectF u() {
        this.f12040i.set(getBounds());
        return this.f12040i;
    }

    public float w() {
        return this.f12032a.f12072o;
    }

    public ColorStateList x() {
        return this.f12032a.f12061d;
    }

    public float y() {
        return this.f12032a.f12071n;
    }

    public int z() {
        return this.f12052u;
    }

    public g() {
        this(new k());
    }

    public g(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(k.e(context, attributeSet, i10, i11).m());
    }

    public g(k kVar) {
        this(new c(kVar, null));
    }

    private g(c cVar) {
        l lVar;
        this.f12033b = new m.g[4];
        this.f12034c = new m.g[4];
        this.f12035d = new BitSet(8);
        this.f12037f = new Matrix();
        this.f12038g = new Path();
        this.f12039h = new Path();
        this.f12040i = new RectF();
        this.f12041j = new RectF();
        this.f12042k = new Region();
        this.f12043l = new Region();
        Paint paint = new Paint(1);
        this.f12045n = paint;
        Paint paint2 = new Paint(1);
        this.f12046o = paint2;
        this.f12047p = new X7.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            lVar = l.k();
        } else {
            lVar = new l();
        }
        this.f12049r = lVar;
        this.f12053v = new RectF();
        this.f12054w = true;
        this.f12032a = cVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        g0();
        f0(getState());
        this.f12048q = new a();
    }

    static final class c extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        public k f12058a;

        /* renamed from: b, reason: collision with root package name */
        public P7.a f12059b;

        /* renamed from: c, reason: collision with root package name */
        public ColorFilter f12060c;

        /* renamed from: d, reason: collision with root package name */
        public ColorStateList f12061d;

        /* renamed from: e, reason: collision with root package name */
        public ColorStateList f12062e;

        /* renamed from: f, reason: collision with root package name */
        public ColorStateList f12063f;

        /* renamed from: g, reason: collision with root package name */
        public ColorStateList f12064g;

        /* renamed from: h, reason: collision with root package name */
        public PorterDuff.Mode f12065h;

        /* renamed from: i, reason: collision with root package name */
        public Rect f12066i;

        /* renamed from: j, reason: collision with root package name */
        public float f12067j;

        /* renamed from: k, reason: collision with root package name */
        public float f12068k;

        /* renamed from: l, reason: collision with root package name */
        public float f12069l;

        /* renamed from: m, reason: collision with root package name */
        public int f12070m;

        /* renamed from: n, reason: collision with root package name */
        public float f12071n;

        /* renamed from: o, reason: collision with root package name */
        public float f12072o;

        /* renamed from: p, reason: collision with root package name */
        public float f12073p;

        /* renamed from: q, reason: collision with root package name */
        public int f12074q;

        /* renamed from: r, reason: collision with root package name */
        public int f12075r;

        /* renamed from: s, reason: collision with root package name */
        public int f12076s;

        /* renamed from: t, reason: collision with root package name */
        public int f12077t;

        /* renamed from: u, reason: collision with root package name */
        public boolean f12078u;

        /* renamed from: v, reason: collision with root package name */
        public Paint.Style f12079v;

        public c(k kVar, P7.a aVar) {
            this.f12061d = null;
            this.f12062e = null;
            this.f12063f = null;
            this.f12064g = null;
            this.f12065h = PorterDuff.Mode.SRC_IN;
            this.f12066i = null;
            this.f12067j = 1.0f;
            this.f12068k = 1.0f;
            this.f12070m = 255;
            this.f12071n = 0.0f;
            this.f12072o = 0.0f;
            this.f12073p = 0.0f;
            this.f12074q = 0;
            this.f12075r = 0;
            this.f12076s = 0;
            this.f12077t = 0;
            this.f12078u = false;
            this.f12079v = Paint.Style.FILL_AND_STROKE;
            this.f12058a = kVar;
            this.f12059b = aVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            g gVar = new g(this, null);
            gVar.f12036e = true;
            return gVar;
        }

        public c(c cVar) {
            this.f12061d = null;
            this.f12062e = null;
            this.f12063f = null;
            this.f12064g = null;
            this.f12065h = PorterDuff.Mode.SRC_IN;
            this.f12066i = null;
            this.f12067j = 1.0f;
            this.f12068k = 1.0f;
            this.f12070m = 255;
            this.f12071n = 0.0f;
            this.f12072o = 0.0f;
            this.f12073p = 0.0f;
            this.f12074q = 0;
            this.f12075r = 0;
            this.f12076s = 0;
            this.f12077t = 0;
            this.f12078u = false;
            this.f12079v = Paint.Style.FILL_AND_STROKE;
            this.f12058a = cVar.f12058a;
            this.f12059b = cVar.f12059b;
            this.f12069l = cVar.f12069l;
            this.f12060c = cVar.f12060c;
            this.f12061d = cVar.f12061d;
            this.f12062e = cVar.f12062e;
            this.f12065h = cVar.f12065h;
            this.f12064g = cVar.f12064g;
            this.f12070m = cVar.f12070m;
            this.f12067j = cVar.f12067j;
            this.f12076s = cVar.f12076s;
            this.f12074q = cVar.f12074q;
            this.f12078u = cVar.f12078u;
            this.f12068k = cVar.f12068k;
            this.f12071n = cVar.f12071n;
            this.f12072o = cVar.f12072o;
            this.f12073p = cVar.f12073p;
            this.f12075r = cVar.f12075r;
            this.f12077t = cVar.f12077t;
            this.f12063f = cVar.f12063f;
            this.f12079v = cVar.f12079v;
            if (cVar.f12066i != null) {
                this.f12066i = new Rect(cVar.f12066i);
            }
        }
    }
}
