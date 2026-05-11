package na;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import na.r;

/* renamed from: na.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3724g implements InterfaceC3719b {

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3718a f37594b;

    /* renamed from: c, reason: collision with root package name */
    private C3721d f37595c;

    /* renamed from: d, reason: collision with root package name */
    private Bitmap f37596d;

    /* renamed from: e, reason: collision with root package name */
    final View f37597e;

    /* renamed from: f, reason: collision with root package name */
    private int f37598f;

    /* renamed from: g, reason: collision with root package name */
    private final ViewGroup f37599g;

    /* renamed from: l, reason: collision with root package name */
    private boolean f37604l;

    /* renamed from: m, reason: collision with root package name */
    private Drawable f37605m;

    /* renamed from: a, reason: collision with root package name */
    private float f37593a = 16.0f;

    /* renamed from: h, reason: collision with root package name */
    private final int[] f37600h = new int[2];

    /* renamed from: i, reason: collision with root package name */
    private final int[] f37601i = new int[2];

    /* renamed from: j, reason: collision with root package name */
    private final ViewTreeObserver.OnPreDrawListener f37602j = new a();

    /* renamed from: k, reason: collision with root package name */
    private boolean f37603k = true;

    /* renamed from: na.g$a */
    class a implements ViewTreeObserver.OnPreDrawListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            C3724g.this.k();
            return true;
        }
    }

    public C3724g(View view, ViewGroup viewGroup, int i10, InterfaceC3718a interfaceC3718a) {
        this.f37599g = viewGroup;
        this.f37597e = view;
        this.f37598f = i10;
        this.f37594b = interfaceC3718a;
        if (interfaceC3718a instanceof p) {
            ((p) interfaceC3718a).f(view.getContext());
        }
        i(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    private void h() {
        this.f37596d = this.f37594b.e(this.f37596d, this.f37593a);
        if (this.f37594b.c()) {
            return;
        }
        this.f37595c.setBitmap(this.f37596d);
    }

    private void j() {
        this.f37599g.getLocationOnScreen(this.f37600h);
        this.f37597e.getLocationOnScreen(this.f37601i);
        int[] iArr = this.f37601i;
        int i10 = iArr[0];
        int[] iArr2 = this.f37600h;
        int i11 = i10 - iArr2[0];
        int i12 = iArr[1] - iArr2[1];
        float height = this.f37597e.getHeight() / this.f37596d.getHeight();
        float width = this.f37597e.getWidth() / this.f37596d.getWidth();
        this.f37595c.translate((-i11) / width, (-i12) / height);
        this.f37595c.scale(1.0f / width, 1.0f / height);
    }

    @Override // na.InterfaceC3722e
    public InterfaceC3722e a(boolean z10) {
        this.f37599g.getViewTreeObserver().removeOnPreDrawListener(this.f37602j);
        this.f37597e.getViewTreeObserver().removeOnPreDrawListener(this.f37602j);
        if (z10) {
            this.f37599g.getViewTreeObserver().addOnPreDrawListener(this.f37602j);
            if (this.f37599g.getWindowId() != this.f37597e.getWindowId()) {
                this.f37597e.getViewTreeObserver().addOnPreDrawListener(this.f37602j);
            }
        }
        return this;
    }

    @Override // na.InterfaceC3722e
    public InterfaceC3722e b(int i10) {
        if (this.f37598f != i10) {
            this.f37598f = i10;
            this.f37597e.invalidate();
        }
        return this;
    }

    @Override // na.InterfaceC3722e
    public InterfaceC3722e c(Drawable drawable) {
        this.f37605m = drawable;
        return this;
    }

    @Override // na.InterfaceC3719b
    public void d() {
        i(this.f37597e.getMeasuredWidth(), this.f37597e.getMeasuredHeight());
    }

    @Override // na.InterfaceC3719b
    public void destroy() {
        a(false);
        this.f37594b.destroy();
        this.f37604l = false;
    }

    @Override // na.InterfaceC3719b
    public boolean e(Canvas canvas) {
        if (this.f37603k && this.f37604l) {
            if (canvas instanceof C3721d) {
                return false;
            }
            float width = this.f37597e.getWidth() / this.f37596d.getWidth();
            canvas.save();
            canvas.scale(width, this.f37597e.getHeight() / this.f37596d.getHeight());
            this.f37594b.d(canvas, this.f37596d);
            canvas.restore();
            int i10 = this.f37598f;
            if (i10 != 0) {
                canvas.drawColor(i10);
            }
        }
        return true;
    }

    @Override // na.InterfaceC3722e
    public InterfaceC3722e f(boolean z10) {
        this.f37603k = z10;
        a(z10);
        this.f37597e.invalidate();
        return this;
    }

    @Override // na.InterfaceC3722e
    public InterfaceC3722e g(float f10) {
        this.f37593a = f10;
        return this;
    }

    void i(int i10, int i11) {
        a(true);
        r rVar = new r(this.f37594b.a());
        if (rVar.b(i10, i11)) {
            this.f37597e.setWillNotDraw(true);
            return;
        }
        this.f37597e.setWillNotDraw(false);
        r.a d10 = rVar.d(i10, i11);
        this.f37596d = Bitmap.createBitmap(d10.f37622a, d10.f37623b, this.f37594b.b());
        this.f37595c = new C3721d(this.f37596d);
        this.f37604l = true;
        k();
    }

    void k() {
        if (this.f37603k && this.f37604l) {
            Drawable drawable = this.f37605m;
            if (drawable == null) {
                this.f37596d.eraseColor(0);
            } else {
                drawable.draw(this.f37595c);
            }
            this.f37595c.save();
            j();
            this.f37599g.draw(this.f37595c);
            this.f37595c.restore();
            h();
        }
    }
}
