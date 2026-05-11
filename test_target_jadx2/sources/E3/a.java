package E3;

import D3.a;
import D3.c;
import G3.a;
import Y3.d;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import c3.AbstractC1721a;
import f3.AbstractC3142a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a implements D3.a, c.b {

    /* renamed from: r, reason: collision with root package name */
    public static final C0037a f1882r = new C0037a(null);

    /* renamed from: s, reason: collision with root package name */
    private static final Class f1883s = a.class;

    /* renamed from: a, reason: collision with root package name */
    private final d f1884a;

    /* renamed from: b, reason: collision with root package name */
    private final b f1885b;

    /* renamed from: c, reason: collision with root package name */
    private final D3.d f1886c;

    /* renamed from: d, reason: collision with root package name */
    private final c f1887d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f1888e;

    /* renamed from: f, reason: collision with root package name */
    private final G3.a f1889f;

    /* renamed from: g, reason: collision with root package name */
    private final G3.b f1890g;

    /* renamed from: h, reason: collision with root package name */
    private final float[] f1891h;

    /* renamed from: i, reason: collision with root package name */
    private final Bitmap.Config f1892i;

    /* renamed from: j, reason: collision with root package name */
    private final Paint f1893j;

    /* renamed from: k, reason: collision with root package name */
    private Rect f1894k;

    /* renamed from: l, reason: collision with root package name */
    private int f1895l;

    /* renamed from: m, reason: collision with root package name */
    private int f1896m;

    /* renamed from: n, reason: collision with root package name */
    private final Path f1897n;

    /* renamed from: o, reason: collision with root package name */
    private final Matrix f1898o;

    /* renamed from: p, reason: collision with root package name */
    private int f1899p;

    /* renamed from: q, reason: collision with root package name */
    private a.InterfaceC0022a f1900q;

    /* renamed from: E3.a$a, reason: collision with other inner class name */
    public static final class C0037a {
        public /* synthetic */ C0037a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0037a() {
        }
    }

    public a(d platformBitmapFactory, b bitmapFrameCache, D3.d animationInformation, c bitmapFrameRenderer, boolean z10, G3.a aVar, G3.b bVar, P3.d dVar) {
        Intrinsics.checkNotNullParameter(platformBitmapFactory, "platformBitmapFactory");
        Intrinsics.checkNotNullParameter(bitmapFrameCache, "bitmapFrameCache");
        Intrinsics.checkNotNullParameter(animationInformation, "animationInformation");
        Intrinsics.checkNotNullParameter(bitmapFrameRenderer, "bitmapFrameRenderer");
        this.f1884a = platformBitmapFactory;
        this.f1885b = bitmapFrameCache;
        this.f1886c = animationInformation;
        this.f1887d = bitmapFrameRenderer;
        this.f1888e = z10;
        this.f1889f = aVar;
        this.f1890g = bVar;
        this.f1891h = null;
        this.f1892i = Bitmap.Config.ARGB_8888;
        this.f1893j = new Paint(6);
        this.f1897n = new Path();
        this.f1898o = new Matrix();
        this.f1899p = -1;
        s();
    }

    private final void o(int i10, Bitmap bitmap, Canvas canvas) {
        Rect rect = this.f1894k;
        if (rect == null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f1893j);
        } else if (t(i10, bitmap, rect.width(), rect.height())) {
            canvas.drawPath(this.f1897n, this.f1893j);
        } else {
            canvas.drawBitmap(bitmap, (Rect) null, rect, this.f1893j);
        }
    }

    private final boolean p(int i10, AbstractC3142a abstractC3142a, Canvas canvas, int i11) {
        if (abstractC3142a == null || !AbstractC3142a.x(abstractC3142a)) {
            return false;
        }
        Object p10 = abstractC3142a.p();
        Intrinsics.checkNotNullExpressionValue(p10, "bitmapReference.get()");
        o(i10, (Bitmap) p10, canvas);
        if (i11 == 3 || this.f1888e) {
            return true;
        }
        this.f1885b.G(i10, abstractC3142a, i11);
        return true;
    }

    private final boolean q(Canvas canvas, int i10, int i11) {
        AbstractC3142a E10;
        boolean p10;
        AbstractC3142a abstractC3142a = null;
        try {
            boolean z10 = false;
            int i12 = 1;
            if (this.f1888e) {
                G3.a aVar = this.f1889f;
                AbstractC3142a c10 = aVar != null ? aVar.c(i10, canvas.getWidth(), canvas.getHeight()) : null;
                if (c10 != null) {
                    try {
                        if (c10.s()) {
                            Object p11 = c10.p();
                            Intrinsics.checkNotNullExpressionValue(p11, "bitmapReference.get()");
                            o(i10, (Bitmap) p11, canvas);
                            AbstractC3142a.n(c10);
                            return true;
                        }
                    } catch (Throwable th) {
                        th = th;
                        abstractC3142a = c10;
                        AbstractC3142a.n(abstractC3142a);
                        throw th;
                    }
                }
                G3.a aVar2 = this.f1889f;
                if (aVar2 != null) {
                    aVar2.b(canvas.getWidth(), canvas.getHeight(), null);
                }
                AbstractC3142a.n(c10);
                return false;
            }
            if (i11 == 0) {
                E10 = this.f1885b.E(i10);
                p10 = p(i10, E10, canvas, 0);
            } else if (i11 == 1) {
                E10 = this.f1885b.D(i10, this.f1895l, this.f1896m);
                if (r(i10, E10) && p(i10, E10, canvas, 1)) {
                    z10 = true;
                }
                p10 = z10;
                i12 = 2;
            } else if (i11 == 2) {
                try {
                    E10 = this.f1884a.b(this.f1895l, this.f1896m, this.f1892i);
                    if (r(i10, E10) && p(i10, E10, canvas, 2)) {
                        z10 = true;
                    }
                    p10 = z10;
                    i12 = 3;
                } catch (RuntimeException e10) {
                    AbstractC1721a.G(f1883s, "Failed to create frame bitmap", e10);
                    AbstractC3142a.n(null);
                    return false;
                }
            } else {
                if (i11 != 3) {
                    AbstractC3142a.n(null);
                    return false;
                }
                E10 = this.f1885b.F(i10);
                p10 = p(i10, E10, canvas, 3);
                i12 = -1;
            }
            AbstractC3142a.n(E10);
            return (p10 || i12 == -1) ? p10 : q(canvas, i10, i12);
        } catch (Throwable th2) {
            th = th2;
            AbstractC3142a.n(abstractC3142a);
            throw th;
        }
    }

    private final boolean r(int i10, AbstractC3142a abstractC3142a) {
        if (abstractC3142a == null || !abstractC3142a.s()) {
            return false;
        }
        c cVar = this.f1887d;
        Object p10 = abstractC3142a.p();
        Intrinsics.checkNotNullExpressionValue(p10, "targetBitmap.get()");
        boolean a10 = cVar.a(i10, (Bitmap) p10);
        if (!a10) {
            AbstractC3142a.n(abstractC3142a);
        }
        return a10;
    }

    private final void s() {
        int e10 = this.f1887d.e();
        this.f1895l = e10;
        if (e10 == -1) {
            Rect rect = this.f1894k;
            this.f1895l = rect != null ? rect.width() : -1;
        }
        int c10 = this.f1887d.c();
        this.f1896m = c10;
        if (c10 == -1) {
            Rect rect2 = this.f1894k;
            this.f1896m = rect2 != null ? rect2.height() : -1;
        }
    }

    private final boolean t(int i10, Bitmap bitmap, float f10, float f11) {
        if (this.f1891h == null) {
            return false;
        }
        if (i10 == this.f1899p) {
            return true;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        this.f1898o.setRectToRect(new RectF(0.0f, 0.0f, this.f1895l, this.f1896m), new RectF(0.0f, 0.0f, f10, f11), Matrix.ScaleToFit.FILL);
        bitmapShader.setLocalMatrix(this.f1898o);
        this.f1893j.setShader(bitmapShader);
        this.f1897n.addRoundRect(new RectF(0.0f, 0.0f, f10, f11), this.f1891h, Path.Direction.CW);
        this.f1899p = i10;
        return true;
    }

    @Override // D3.d
    public int a() {
        return this.f1886c.a();
    }

    @Override // D3.d
    public int b() {
        return this.f1886c.b();
    }

    @Override // D3.a
    public int c() {
        return this.f1896m;
    }

    @Override // D3.a
    public void clear() {
        if (!this.f1888e) {
            this.f1885b.clear();
            return;
        }
        G3.a aVar = this.f1889f;
        if (aVar != null) {
            aVar.e();
        }
    }

    @Override // D3.a
    public void d(Rect rect) {
        this.f1894k = rect;
        this.f1887d.d(rect);
        s();
    }

    @Override // D3.a
    public int e() {
        return this.f1895l;
    }

    @Override // D3.c.b
    public void f() {
        if (!this.f1888e) {
            clear();
            return;
        }
        G3.a aVar = this.f1889f;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // D3.a
    public void g(ColorFilter colorFilter) {
        this.f1893j.setColorFilter(colorFilter);
    }

    @Override // D3.d
    public int h() {
        return this.f1886c.h();
    }

    @Override // D3.d
    public int i() {
        return this.f1886c.i();
    }

    @Override // D3.a
    public void j(a.InterfaceC0022a interfaceC0022a) {
        this.f1900q = interfaceC0022a;
    }

    @Override // D3.d
    public int k(int i10) {
        return this.f1886c.k(i10);
    }

    @Override // D3.a
    public void l(int i10) {
        this.f1893j.setAlpha(i10);
    }

    @Override // D3.d
    public int m() {
        return this.f1886c.m();
    }

    @Override // D3.a
    public boolean n(Drawable parent, Canvas canvas, int i10) {
        G3.b bVar;
        G3.a aVar;
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        boolean q10 = q(canvas, i10, 0);
        if (!this.f1888e && (bVar = this.f1890g) != null && (aVar = this.f1889f) != null) {
            a.C0066a.f(aVar, bVar, this.f1885b, this, i10, null, 16, null);
        }
        return q10;
    }
}
