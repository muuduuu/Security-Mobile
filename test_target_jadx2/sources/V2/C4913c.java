package v2;

import D2.k;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import f2.InterfaceC3137a;
import i2.l;
import java.nio.ByteBuffer;
import java.util.List;
import s1.AbstractC4306a;
import v2.C4917g;

/* renamed from: v2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4913c extends Drawable implements C4917g.b, Animatable {

    /* renamed from: a, reason: collision with root package name */
    private final a f43821a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f43822b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f43823c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f43824d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f43825e;

    /* renamed from: f, reason: collision with root package name */
    private int f43826f;

    /* renamed from: g, reason: collision with root package name */
    private int f43827g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f43828h;

    /* renamed from: i, reason: collision with root package name */
    private Paint f43829i;

    /* renamed from: j, reason: collision with root package name */
    private Rect f43830j;

    /* renamed from: k, reason: collision with root package name */
    private List f43831k;

    /* renamed from: v2.c$a */
    static final class a extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        final C4917g f43832a;

        a(C4917g c4917g) {
            this.f43832a = c4917g;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C4913c(this);
        }
    }

    public C4913c(Context context, InterfaceC3137a interfaceC3137a, l lVar, int i10, int i11, Bitmap bitmap) {
        this(new a(new C4917g(com.bumptech.glide.c.d(context), interfaceC3137a, i10, i11, lVar, bitmap)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Drawable.Callback b() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    private Rect d() {
        if (this.f43830j == null) {
            this.f43830j = new Rect();
        }
        return this.f43830j;
    }

    private Paint h() {
        if (this.f43829i == null) {
            this.f43829i = new Paint(2);
        }
        return this.f43829i;
    }

    private void j() {
        List list = this.f43831k;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((AbstractC4306a) this.f43831k.get(i10)).a(this);
            }
        }
    }

    private void l() {
        this.f43826f = 0;
    }

    private void n() {
        k.a(!this.f43824d, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f43821a.f43832a.f() == 1) {
            invalidateSelf();
        } else {
            if (this.f43822b) {
                return;
            }
            this.f43822b = true;
            this.f43821a.f43832a.r(this);
            invalidateSelf();
        }
    }

    private void o() {
        this.f43822b = false;
        this.f43821a.f43832a.s(this);
    }

    @Override // v2.C4917g.b
    public void a() {
        if (b() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (g() == f() - 1) {
            this.f43826f++;
        }
        int i10 = this.f43827g;
        if (i10 == -1 || this.f43826f < i10) {
            return;
        }
        j();
        stop();
    }

    public ByteBuffer c() {
        return this.f43821a.f43832a.b();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f43824d) {
            return;
        }
        if (this.f43828h) {
            Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), d());
            this.f43828h = false;
        }
        canvas.drawBitmap(this.f43821a.f43832a.c(), (Rect) null, d(), h());
    }

    public Bitmap e() {
        return this.f43821a.f43832a.e();
    }

    public int f() {
        return this.f43821a.f43832a.f();
    }

    public int g() {
        return this.f43821a.f43832a.d();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f43821a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f43821a.f43832a.h();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f43821a.f43832a.k();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    public int i() {
        return this.f43821a.f43832a.j();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f43822b;
    }

    public void k() {
        this.f43824d = true;
        this.f43821a.f43832a.a();
    }

    public void m(l lVar, Bitmap bitmap) {
        this.f43821a.f43832a.o(lVar, bitmap);
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f43828h = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        h().setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        h().setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        k.a(!this.f43824d, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f43825e = z10;
        if (!z10) {
            o();
        } else if (this.f43823c) {
            n();
        }
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f43823c = true;
        l();
        if (this.f43825e) {
            n();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f43823c = false;
        o();
    }

    C4913c(a aVar) {
        this.f43825e = true;
        this.f43827g = -1;
        this.f43821a = (a) k.d(aVar);
    }
}
