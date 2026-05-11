package y3;

import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: y3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5167a extends Drawable implements Drawable.Callback, r, q {

    /* renamed from: a, reason: collision with root package name */
    private r f45165a;

    /* renamed from: c, reason: collision with root package name */
    private final Drawable[] f45167c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC5169c[] f45168d;

    /* renamed from: b, reason: collision with root package name */
    private final C5170d f45166b = new C5170d();

    /* renamed from: e, reason: collision with root package name */
    private final Rect f45169e = new Rect();

    /* renamed from: f, reason: collision with root package name */
    private boolean f45170f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f45171g = false;

    /* renamed from: h, reason: collision with root package name */
    private boolean f45172h = false;

    /* renamed from: y3.a$a, reason: collision with other inner class name */
    class C0662a implements InterfaceC5169c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f45173a;

        C0662a(int i10) {
            this.f45173a = i10;
        }

        @Override // y3.InterfaceC5169c
        public Drawable l(Drawable drawable) {
            return AbstractC5167a.this.e(this.f45173a, drawable);
        }

        @Override // y3.InterfaceC5169c
        public Drawable s() {
            return AbstractC5167a.this.b(this.f45173a);
        }
    }

    public AbstractC5167a(Drawable[] drawableArr) {
        int i10 = 0;
        b3.l.g(drawableArr);
        this.f45167c = drawableArr;
        while (true) {
            Drawable[] drawableArr2 = this.f45167c;
            if (i10 >= drawableArr2.length) {
                this.f45168d = new InterfaceC5169c[drawableArr2.length];
                return;
            } else {
                AbstractC5171e.d(drawableArr2[i10], this, this);
                i10++;
            }
        }
    }

    private InterfaceC5169c a(int i10) {
        return new C0662a(i10);
    }

    public Drawable b(int i10) {
        b3.l.b(Boolean.valueOf(i10 >= 0));
        b3.l.b(Boolean.valueOf(i10 < this.f45167c.length));
        return this.f45167c[i10];
    }

    public InterfaceC5169c c(int i10) {
        b3.l.b(Boolean.valueOf(i10 >= 0));
        b3.l.b(Boolean.valueOf(i10 < this.f45168d.length));
        InterfaceC5169c[] interfaceC5169cArr = this.f45168d;
        if (interfaceC5169cArr[i10] == null) {
            interfaceC5169cArr[i10] = a(i10);
        }
        return this.f45168d[i10];
    }

    public int d() {
        return this.f45167c.length;
    }

    public Drawable e(int i10, Drawable drawable) {
        b3.l.b(Boolean.valueOf(i10 >= 0));
        b3.l.b(Boolean.valueOf(i10 < this.f45167c.length));
        Drawable drawable2 = this.f45167c[i10];
        if (drawable != drawable2) {
            if (drawable != null && this.f45172h) {
                drawable.mutate();
            }
            AbstractC5171e.d(this.f45167c[i10], null, null);
            AbstractC5171e.d(drawable, null, null);
            AbstractC5171e.e(drawable, this.f45166b);
            AbstractC5171e.a(drawable, this);
            AbstractC5171e.d(drawable, this, this);
            this.f45171g = false;
            this.f45167c[i10] = drawable;
            invalidateSelf();
        }
        return drawable2;
    }

    @Override // y3.r
    public void g(Matrix matrix) {
        r rVar = this.f45165a;
        if (rVar != null) {
            rVar.g(matrix);
        } else {
            matrix.reset();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        int i10 = 0;
        int i11 = -1;
        while (true) {
            Drawable[] drawableArr = this.f45167c;
            if (i10 >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                i11 = Math.max(i11, drawable.getIntrinsicHeight());
            }
            i10++;
        }
        if (i11 > 0) {
            return i11;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        int i10 = 0;
        int i11 = -1;
        while (true) {
            Drawable[] drawableArr = this.f45167c;
            if (i10 >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                i11 = Math.max(i11, drawable.getIntrinsicWidth());
            }
            i10++;
        }
        if (i11 > 0) {
            return i11;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        if (this.f45167c.length == 0) {
            return -2;
        }
        int i10 = 1;
        int i11 = -1;
        while (true) {
            Drawable[] drawableArr = this.f45167c;
            if (i10 >= drawableArr.length) {
                return i11;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                i11 = Drawable.resolveOpacity(i11, drawable.getOpacity());
            }
            i10++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        int i10 = 0;
        rect.left = 0;
        rect.top = 0;
        rect.right = 0;
        rect.bottom = 0;
        Rect rect2 = this.f45169e;
        while (true) {
            Drawable[] drawableArr = this.f45167c;
            if (i10 >= drawableArr.length) {
                return true;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                drawable.getPadding(rect2);
                rect.left = Math.max(rect.left, rect2.left);
                rect.top = Math.max(rect.top, rect2.top);
                rect.right = Math.max(rect.right, rect2.right);
                rect.bottom = Math.max(rect.bottom, rect2.bottom);
            }
            i10++;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (!this.f45171g) {
            this.f45170f = false;
            int i10 = 0;
            while (true) {
                Drawable[] drawableArr = this.f45167c;
                boolean z10 = true;
                if (i10 >= drawableArr.length) {
                    break;
                }
                Drawable drawable = drawableArr[i10];
                boolean z11 = this.f45170f;
                if (drawable == null || !drawable.isStateful()) {
                    z10 = false;
                }
                this.f45170f = z11 | z10;
                i10++;
            }
            this.f45171g = true;
        }
        return this.f45170f;
    }

    @Override // y3.r
    public void m(RectF rectF) {
        r rVar = this.f45165a;
        if (rVar != null) {
            rVar.m(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        int i10 = 0;
        while (true) {
            Drawable[] drawableArr = this.f45167c;
            if (i10 >= drawableArr.length) {
                this.f45172h = true;
                return this;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                drawable.mutate();
            }
            i10++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        int i10 = 0;
        while (true) {
            Drawable[] drawableArr = this.f45167c;
            if (i10 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                drawable.setBounds(rect);
            }
            i10++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        int i11 = 0;
        boolean z10 = false;
        while (true) {
            Drawable[] drawableArr = this.f45167c;
            if (i11 >= drawableArr.length) {
                return z10;
            }
            Drawable drawable = drawableArr[i11];
            if (drawable != null && drawable.setLevel(i10)) {
                z10 = true;
            }
            i11++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            Drawable[] drawableArr = this.f45167c;
            if (i10 >= drawableArr.length) {
                return z10;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null && drawable.setState(iArr)) {
                z10 = true;
            }
            i10++;
        }
    }

    @Override // y3.q
    public void r(r rVar) {
        this.f45165a = rVar;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f45166b.c(colorFilter);
        int i10 = 0;
        while (true) {
            Drawable[] drawableArr = this.f45167c;
            if (i10 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
            i10++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z10) {
        this.f45166b.d(z10);
        int i10 = 0;
        while (true) {
            Drawable[] drawableArr = this.f45167c;
            if (i10 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                drawable.setDither(z10);
            }
            i10++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z10) {
        this.f45166b.e(z10);
        int i10 = 0;
        while (true) {
            Drawable[] drawableArr = this.f45167c;
            if (i10 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                drawable.setFilterBitmap(z10);
            }
            i10++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f10, float f11) {
        int i10 = 0;
        while (true) {
            Drawable[] drawableArr = this.f45167c;
            if (i10 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                drawable.setHotspot(f10, f11);
            }
            i10++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        int i10 = 0;
        while (true) {
            Drawable[] drawableArr = this.f45167c;
            if (i10 >= drawableArr.length) {
                return visible;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                drawable.setVisible(z10, z11);
            }
            i10++;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
