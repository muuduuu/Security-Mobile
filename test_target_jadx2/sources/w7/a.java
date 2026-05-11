package W7;

import Y7.g;
import Y7.k;
import Y7.n;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public class a extends Drawable implements n {

    /* renamed from: a, reason: collision with root package name */
    private b f11396a;

    @Override // android.graphics.drawable.Drawable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public a mutate() {
        this.f11396a = new b(this.f11396a);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        b bVar = this.f11396a;
        if (bVar.f11398b) {
            bVar.f11397a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f11396a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f11396a.f11397a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f11396a.f11397a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f11396a.f11397a.setState(iArr)) {
            onStateChange = true;
        }
        boolean e10 = W7.b.e(iArr);
        b bVar = this.f11396a;
        if (bVar.f11398b == e10) {
            return onStateChange;
        }
        bVar.f11398b = e10;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f11396a.f11397a.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f11396a.f11397a.setColorFilter(colorFilter);
    }

    @Override // Y7.n
    public void setShapeAppearanceModel(k kVar) {
        this.f11396a.f11397a.setShapeAppearanceModel(kVar);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        this.f11396a.f11397a.setTint(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f11396a.f11397a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f11396a.f11397a.setTintMode(mode);
    }

    public a(k kVar) {
        this(new b(new g(kVar)));
    }

    static final class b extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        g f11397a;

        /* renamed from: b, reason: collision with root package name */
        boolean f11398b;

        public b(g gVar) {
            this.f11397a = gVar;
            this.f11398b = false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a newDrawable() {
            return new a(new b(this));
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        public b(b bVar) {
            this.f11397a = (g) bVar.f11397a.getConstantState().newDrawable();
            this.f11398b = bVar.f11398b;
        }
    }

    private a(b bVar) {
        this.f11396a = bVar;
    }
}
