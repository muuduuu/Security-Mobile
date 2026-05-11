package V3;

import T3.b;
import T3.e;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;

/* loaded from: classes.dex */
public class a implements T3.a {

    /* renamed from: a, reason: collision with root package name */
    private final W3.a f10792a;

    /* renamed from: b, reason: collision with root package name */
    private final e f10793b;

    /* renamed from: c, reason: collision with root package name */
    private final T3.c f10794c;

    /* renamed from: d, reason: collision with root package name */
    private final Rect f10795d;

    /* renamed from: e, reason: collision with root package name */
    private final int[] f10796e;

    /* renamed from: f, reason: collision with root package name */
    private final int[] f10797f;

    /* renamed from: g, reason: collision with root package name */
    private final int f10798g;

    /* renamed from: h, reason: collision with root package name */
    private final T3.b[] f10799h;

    /* renamed from: i, reason: collision with root package name */
    private final Rect f10800i = new Rect();

    /* renamed from: j, reason: collision with root package name */
    private final Rect f10801j = new Rect();

    /* renamed from: k, reason: collision with root package name */
    private final boolean f10802k;

    /* renamed from: l, reason: collision with root package name */
    private final Paint f10803l;

    /* renamed from: m, reason: collision with root package name */
    private Bitmap f10804m;

    public a(W3.a aVar, e eVar, Rect rect, boolean z10) {
        this.f10792a = aVar;
        this.f10793b = eVar;
        T3.c d10 = eVar.d();
        this.f10794c = d10;
        int[] Q10 = d10.Q();
        this.f10796e = Q10;
        aVar.a(Q10);
        this.f10798g = aVar.c(Q10);
        this.f10797f = aVar.b(Q10);
        this.f10795d = m(d10, rect);
        this.f10802k = z10;
        this.f10799h = new T3.b[d10.a()];
        for (int i10 = 0; i10 < this.f10794c.a(); i10++) {
            this.f10799h[i10] = this.f10794c.c(i10);
        }
        Paint paint = new Paint();
        this.f10803l = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    private synchronized void l() {
        Bitmap bitmap = this.f10804m;
        if (bitmap != null) {
            bitmap.recycle();
            this.f10804m = null;
        }
    }

    private static Rect m(T3.c cVar, Rect rect) {
        return rect == null ? new Rect(0, 0, cVar.getWidth(), cVar.getHeight()) : new Rect(0, 0, Math.min(rect.width(), cVar.getWidth()), Math.min(rect.height(), cVar.getHeight()));
    }

    private void n(Canvas canvas, float f10, float f11, T3.b bVar) {
        if (bVar.f9248g == b.EnumC0181b.DISPOSE_TO_BACKGROUND) {
            int ceil = (int) Math.ceil(bVar.f9245d * f10);
            int ceil2 = (int) Math.ceil(bVar.f9246e * f11);
            int ceil3 = (int) Math.ceil(bVar.f9243b * f10);
            int ceil4 = (int) Math.ceil(bVar.f9244c * f11);
            canvas.drawRect(new Rect(ceil3, ceil4, ceil + ceil3, ceil2 + ceil4), this.f10803l);
        }
    }

    private synchronized Bitmap o(int i10, int i11) {
        try {
            Bitmap bitmap = this.f10804m;
            if (bitmap != null) {
                if (bitmap.getWidth() >= i10) {
                    if (this.f10804m.getHeight() < i11) {
                    }
                }
                l();
            }
            if (this.f10804m == null) {
                this.f10804m = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            }
            this.f10804m.eraseColor(0);
        } catch (Throwable th) {
            throw th;
        }
        return this.f10804m;
    }

    private void p(Canvas canvas, T3.d dVar) {
        int width;
        int height;
        int c10;
        int d10;
        if (this.f10802k) {
            float max = Math.max(dVar.getWidth() / Math.min(dVar.getWidth(), canvas.getWidth()), dVar.getHeight() / Math.min(dVar.getHeight(), canvas.getHeight()));
            width = (int) (dVar.getWidth() / max);
            height = (int) (dVar.getHeight() / max);
            c10 = (int) (dVar.c() / max);
            d10 = (int) (dVar.d() / max);
        } else {
            width = dVar.getWidth();
            height = dVar.getHeight();
            c10 = dVar.c();
            d10 = dVar.d();
        }
        synchronized (this) {
            Bitmap o10 = o(width, height);
            this.f10804m = o10;
            dVar.b(width, height, o10);
            canvas.save();
            canvas.translate(c10, d10);
            canvas.drawBitmap(this.f10804m, 0.0f, 0.0f, (Paint) null);
            canvas.restore();
        }
    }

    private void q(Canvas canvas, T3.d dVar) {
        double width = this.f10795d.width() / this.f10794c.getWidth();
        double height = this.f10795d.height() / this.f10794c.getHeight();
        int round = (int) Math.round(dVar.getWidth() * width);
        int round2 = (int) Math.round(dVar.getHeight() * height);
        int c10 = (int) (dVar.c() * width);
        int d10 = (int) (dVar.d() * height);
        synchronized (this) {
            try {
                int width2 = this.f10795d.width();
                int height2 = this.f10795d.height();
                o(width2, height2);
                Bitmap bitmap = this.f10804m;
                if (bitmap != null) {
                    dVar.b(round, round2, bitmap);
                }
                this.f10800i.set(0, 0, width2, height2);
                this.f10801j.set(c10, d10, width2 + c10, height2 + d10);
                Bitmap bitmap2 = this.f10804m;
                if (bitmap2 != null) {
                    canvas.drawBitmap(bitmap2, this.f10800i, this.f10801j, (Paint) null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void r(Canvas canvas, T3.d dVar, T3.b bVar, T3.b bVar2) {
        Rect rect = this.f10795d;
        if (rect == null || rect.width() <= 0 || this.f10795d.height() <= 0) {
            return;
        }
        float width = canvas.getWidth() / this.f10795d.width();
        if (bVar2 != null) {
            n(canvas, width, width, bVar2);
        }
        int width2 = dVar.getWidth();
        int height = dVar.getHeight();
        Rect rect2 = new Rect(0, 0, width2, height);
        int i10 = (int) (width2 * width);
        int i11 = (int) (height * width);
        int c10 = (int) (dVar.c() * width);
        int d10 = (int) (dVar.d() * width);
        Rect rect3 = new Rect(c10, d10, i10 + c10, i11 + d10);
        if (bVar.f9247f == b.a.NO_BLEND) {
            canvas.drawRect(rect3, this.f10803l);
        }
        synchronized (this) {
            Bitmap o10 = o(width2, height);
            dVar.b(width2, height, o10);
            canvas.drawBitmap(o10, rect2, rect3, (Paint) null);
        }
    }

    private void s(Canvas canvas, T3.d dVar, T3.b bVar, T3.b bVar2) {
        float f10;
        float f11;
        float f12;
        float f13;
        int width = this.f10794c.getWidth();
        int height = this.f10794c.getHeight();
        float f14 = width;
        float f15 = height;
        int width2 = dVar.getWidth();
        int height2 = dVar.getHeight();
        int c10 = dVar.c();
        int d10 = dVar.d();
        if (f14 > canvas.getWidth() || f15 > canvas.getHeight()) {
            int min = Math.min(canvas.getWidth(), width);
            int min2 = Math.min(canvas.getHeight(), height);
            float f16 = f14 / f15;
            if (min > min2) {
                f11 = min;
                f10 = f11 / f16;
            } else {
                f10 = min2;
                f11 = f10 * f16;
            }
            f12 = f11 / f14;
            f13 = f10 / f15;
            width2 = (int) Math.ceil(dVar.getWidth() * f12);
            height2 = (int) Math.ceil(dVar.getHeight() * f13);
            c10 = (int) Math.ceil(dVar.c() * f12);
            d10 = (int) Math.ceil(dVar.d() * f13);
        } else {
            f12 = 1.0f;
            f13 = 1.0f;
        }
        Rect rect = new Rect(0, 0, width2, height2);
        Rect rect2 = new Rect(c10, d10, c10 + width2, d10 + height2);
        if (bVar2 != null) {
            n(canvas, f12, f13, bVar2);
        }
        if (bVar.f9247f == b.a.NO_BLEND) {
            canvas.drawRect(rect2, this.f10803l);
        }
        synchronized (this) {
            Bitmap o10 = o(width2, height2);
            dVar.b(width2, height2, o10);
            canvas.drawBitmap(o10, rect, rect2, (Paint) null);
        }
    }

    @Override // T3.a
    public int a() {
        return this.f10794c.a();
    }

    @Override // T3.a
    public int b() {
        return this.f10794c.b();
    }

    @Override // T3.a
    public T3.b c(int i10) {
        return this.f10799h[i10];
    }

    @Override // T3.a
    public int d() {
        return this.f10798g;
    }

    @Override // T3.a
    public void e(int i10, Canvas canvas) {
        T3.d O10 = this.f10794c.O(i10);
        try {
            if (O10.getWidth() > 0 && O10.getHeight() > 0) {
                if (this.f10794c.P()) {
                    q(canvas, O10);
                } else {
                    p(canvas, O10);
                }
                O10.a();
            }
        } finally {
            O10.a();
        }
    }

    @Override // T3.a
    public int f(int i10) {
        return this.f10796e[i10];
    }

    @Override // T3.a
    public T3.a g(Rect rect) {
        return m(this.f10794c, rect).equals(this.f10795d) ? this : new a(this.f10792a, this.f10793b, rect, this.f10802k);
    }

    @Override // T3.a
    public int getHeight() {
        return this.f10794c.getHeight();
    }

    @Override // T3.a
    public int getWidth() {
        return this.f10794c.getWidth();
    }

    @Override // T3.a
    public int h() {
        return this.f10795d.height();
    }

    @Override // T3.a
    public void i(int i10, Canvas canvas) {
        T3.d O10 = this.f10794c.O(i10);
        T3.b c10 = this.f10794c.c(i10);
        T3.b c11 = i10 == 0 ? null : this.f10794c.c(i10 - 1);
        try {
            if (O10.getWidth() > 0 && O10.getHeight() > 0) {
                if (this.f10794c.P()) {
                    s(canvas, O10, c10, c11);
                } else {
                    r(canvas, O10, c10, c11);
                }
                O10.a();
            }
        } finally {
            O10.a();
        }
    }

    @Override // T3.a
    public int j() {
        return this.f10795d.width();
    }

    @Override // T3.a
    public e k() {
        return this.f10793b;
    }
}
